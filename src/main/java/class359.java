import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class359 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field5192;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field5194;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "B")
    public byte field5182;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lho;")
    public class359 field5188;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field5186 = 127;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "J")
    public static long field5189 = 0L;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field5181;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public int field5190;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public int field5199;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public int field5201;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2345(int arg0) {
        class385.method2478(5, (byte) -11);
        field5196++;
        class55.method374(5, (byte) 1);
        class4.method31(5, arg0);
        class110.method719(0, 5);
        class124.method793(5, false);
        class346.method2247(25048, 5);
        class225.method1307((byte) -17, 5);
        class310.method2105(5, (byte) 85);
        class167.method1027(5, 81);
        class277.method1908(5, arg0 + arg0);
        class185.method1125(arg0 ^ 0x55, 5);
        class3.method22(-5, 5);
        class321.method2160(5, (byte) 101);
        class431.method2728(5, (byte) 107);
        class407.method2625((byte) -98, 5);
        class117.method758(13346, 5);
        class449.method2821(5, (byte) 40);
        class323.method2168(5, 0);
        class438.method2752(5, (byte) 121);
        class318.method2146(-87, 5);
        class112.method731(50, 22);
        class424.method2701(arg0 ^ 0x6, 5);
        class411.method2633((byte) 113, 5);
        class129.field1789.method1142((byte) -96, 5);
        class315.field4603.method1142((byte) -106, 5);
        class88.field1231.method1142((byte) -125, 5);
        class219.field2902.method1142((byte) -111, 5);
        class123.field1718.method1142((byte) -66, 5);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B[Lba;IZIILii;IBII)V", line = 58)
    public static final void method2346(int arg0, byte[] arg1, class270[] arg2, int arg3, boolean arg4, int arg5, int arg6, class405 arg7, int arg8, byte arg9, int arg10, int arg11) {
        int var12 = 92 / ((10 - arg9) / 40);
        field5200++;
        class228 var13 = new class228(arg1);
        int var14 = -1;
        while (true) {
            int var15 = var13.method1323(32767);
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method1327((byte) -64);
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var13.method1348(-92);
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg3 == var20 && var19 >= arg10 && var19 < arg10 + 8 && arg6 <= var18 && arg6 + 8 > var18) {
                    class104 var24 = class329.method2190((byte) 63, var14);
                    int var25 = class139.method894(var23, var24.field1506, arg8, -3, var19 & 0x7, var24.field1489, var18 & 0x7) + arg11;
                    int var26 = arg0 + class198.method1179(36, var19 & 0x7, var18 & 0x7, var24.field1489, arg8, var23, var24.field1506);
                    if (var25 > 0 && var26 > 0 && var25 < class192.field2574 - 1 && class364.field5262 - 1 > var26) {
                        class270 var27 = null;
                        if (!arg4) {
                            int var28 = arg5;
                            if ((class103.field1430[1][var25][var26] & 0x2) == 2) {
                                var28 = arg5 - 1;
                            }
                            if (var28 >= 0) {
                                var27 = arg2[var28];
                            }
                        }
                        class386.method2485(var14, -22389, arg8 + var23 & 0x3, arg4, var26, true, var25, arg5, var22, -1, var27, arg5, arg7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIB)V", line = 152)
    public class359(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5183 = arg0;
        this.field5191 = arg1;
        this.field5192 = arg2;
        this.field5194 = arg3;
        this.field5182 = arg4;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lho;I)V", line = 163)
    public class359(class359 arg0, int arg1) {
        this.field5188 = arg0;
        this.field5194 = this.field5188.field5194 + arg1;
        this.field5192 = this.field5188.field5192 + arg1;
        this.field5191 = this.field5188.field5191 + arg1;
        this.field5182 = this.field5188.field5182;
        this.field5183 = this.field5188.field5183;
    }
}
