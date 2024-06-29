import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class234 extends class111 {

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field3232 = -1;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "Lem;")
    public static class206 field3237 = new class206(73, 7);

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IBI)V", line = 3)
    public final void method807(int arg0, byte arg1, int arg2) {
        ++field3239;
        int var4 = this.field3234 * arg0 >> 12;
        if (arg1 == -21) {
            int var5 = this.field3236 * arg0 >> 12;
            int var6 = this.field3240 * arg2 >> 12;
            int var7 = this.field3238 * arg2 >> 12;
            class692.method3896(super.field1536, var5, var4, false, var7, super.field1543, super.field1538, var6);
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 22)
    public static void method1474(int arg0) {
        field3237 = null;
        if (arg0 != -27039) {
            method1476((class295) null, (class403) null, -95, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V", line = 35)
    public final void method804(int arg0, int arg1, int arg2) {
        if (arg2 >= 84) {
            ++field3241;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V", line = 56)
    public static final void method1475(byte arg0) {
        if (arg0 != 41) {
            field3237 = null;
        }
        ++field3233;
        if (!class334.field4506.method109()) {
            class203.method1327((byte) 63, class503.field6917);
        } else {
            class334.field4506.method152(class611.field8473);
            class55.method417(true);
            class334.field4506.method204(class611.field8473);
            class334.field4506.method86(class611.field8473);
        }
        class314.method1905(-101);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lvv;Lks;IB)V", line = 79)
    public static final void method1476(class295 arg0, class403 arg1, int arg2, byte arg3) {
        ++field3235;
        if (~class166.field2420 > -51) {
            if (arg1 != null && arg1.field5645 != null && arg1.field5645.length > arg2 && arg1.field5645[arg2] != null) {
                int var4 = arg1.field5645[arg2][0];
                int var5 = var4 >> 8;
                int var6 = (var4 & 229) >> 5;
                int var7 = var4 & 31;
                if (~arg1.field5645[arg2].length < -2) {
                    int var8 = (int) (Math.random() * (double) arg1.field5645[arg2].length);
                    if (var8 > 0) {
                        var5 = arg1.field5645[arg2][var8];
                    }
                }
                int var9 = 256;
                if (arg1.field5666 != null && arg1.field5663 != null) {
                    var9 = (int) ((double) (arg1.field5663[arg2] - arg1.field5666[arg2]) * Math.random()) + arg1.field5666[arg2];
                }
                int var10 = 0 / ((72 - arg3) / 46);
                int var11 = arg1.field5656 != null ? arg1.field5656[arg2] : 255;
                if (~var7 == -1) {
                    if (class143.field2063 == arg0) {
                        if (arg1.field5654) {
                            class586.method3335(var9, var6, 0, false, var5, var11, 0);
                            return;
                        }
                        class589.method3348(0, var11, var6, true, var9, var5);
                    }
                } else if (class366.field4875.field9364 != 0) {
                    int var12 = arg0.field4042 + -256 >> 9;
                    int var13 = arg0.field4047 + -256 >> 9;
                    int var14 = class143.field2063 != arg0 ? (arg0.field4053 << 24) - (-(var12 << 16) - (var13 << 8)) + var7 : 0;
                    class130.field1873[class166.field2420++] = new class437((byte) (arg1.field5654 ? 2 : 1), var5, var6, 0, var11, var14, var9, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(III)V", line = 148)
    public final void method806(int arg0, int arg1, int arg2) {
        ++field3242;
        if (arg2 == 0) {
            int var4 = this.field3234 * arg0 >> 12;
            int var5 = this.field3236 * arg0 >> 12;
            int var6 = this.field3240 * arg1 >> 12;
            int var7 = this.field3238 * arg1 >> 12;
            class381.method2189((byte) 55, var6, super.field1543, var5, var4, var7);
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(IIIIIII)V", line = 167)
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3238 = arg3;
        this.field3234 = arg0;
        this.field3236 = arg2;
        this.field3240 = arg1;
    }
}
