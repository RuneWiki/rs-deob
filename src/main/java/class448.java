import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class448 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "S")
    public short field6464;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "B")
    public byte field6468;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field6471;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "B")
    public byte field6463;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Z")
    public boolean field6467;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "S")
    public short field6460;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "S")
    public short field6472;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field6466 = 0;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Loh;")
    public static class404 field6461;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lur;")
    public static class535 field6465;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[I")
    public static int[] field6473;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLd;Lha;IIII)V")
    public static final void method2769(byte arg0, class150 arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class284.field3471 < 100) {
            class723.method4029((byte) -93, arg1, arg2);
        }
        field6470++;
        arg2.method432(arg3, arg5, arg3 + arg6, arg4 + arg5);
        if (class284.field3471 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg6 / 2);
            arg2.method370(arg3, arg5, arg6, arg4, -16777216, 0);
            int var9 = arg4 / 2 + arg5 - var7 - 18;
            arg2.method399(var8 - 152, var9, 304, 34, class163.field1824[class302.field3783].getRGB(), 0);
            arg2.method370(var8 - 150, var9 - -2, class284.field3471 * 3, 30, class261.field3239[class302.field3783].getRGB(), 0);
            class567.field8070.method450(-1, class681.field9644[class302.field3783].getRGB(), 0, class486.field6922.method2936(class489.field6978, -112), var8, var7 + var9);
            return;
        }
        if (arg0 < 1) {
            method2771(-42);
        }
        int var10 = class30.field352 - ((int) ((float) arg6 / class656.field9363));
        int var11 = (int) ((float) arg4 / class656.field9363) + class116.field1211;
        int var12 = class30.field352 + ((int) ((float) arg6 / class656.field9363));
        class588.field8300 = (int) ((float) (arg6 * 2) / class656.field9363);
        class706.field9956 = (int) ((float) (arg4 * 2) / class656.field9363);
        class186.field2214 = class30.field352 - ((int) ((float) arg6 / class656.field9363));
        class701.field9890 = class116.field1211 - ((int) ((float) arg4 / class656.field9363));
        int var13 = class116.field1211 - ((int) ((float) arg4 / class656.field9363));
        class656.method3729(var10 + class656.field9386, var11 - -class656.field9374, class656.field9386 + var12, class656.field9374 + var13, arg3, arg5, arg3 + arg6, arg4 + 1 + arg5);
        class656.method3735(arg2);
        class289 var14 = class656.method3737(arg2);
        class89.method613(85, var14, arg2, 0, 0);
        if (class303.field3790 > 0) {
            class233.field2750--;
            if (class233.field2750 == 0) {
                class303.field3790--;
                class233.field2750 = 20;
            }
        }
        if (!class127.field1333) {
            return;
        }
        int var15 = arg6 + arg3 - 5;
        int var16 = arg4 + arg5 - 8;
        class720.field10104.method441(16776960, "Fps:" + class429.field6239, var16, -1, (byte) -47, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class720.field10104.method441(var19, "Mem:" + var18 + "k", var20, -1, (byte) -47, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
    public static final void method2770(int arg0, byte arg1) {
        field6474++;
        class181.field2142.method3539((byte) -62, arg0);
        int var2 = -107 % ((arg1 + 38) / 44);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method2771(int arg0) {
        if (arg0 != 7554) {
            method2770(65, (byte) -35);
        }
        field6473 = null;
        field6461 = null;
        field6465 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field6464 = (short) arg6;
        this.field6468 = (byte) arg8;
        this.field6471 = arg10;
        this.field6462 = arg0;
        this.field6463 = (byte) arg7;
        this.field6467 = arg9;
        this.field6460 = (short) arg4;
        this.field6472 = (short) arg5;
    }
}
