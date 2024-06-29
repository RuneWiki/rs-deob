import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class477 extends class232 {

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
    private int field7259 = 4096;

    @OriginalMember(owner = "client!uda", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field7262 = new String[] { method3649(method3648("]CECr\u0000")), method3649(method3648("]CECw\u0000")), method3649(method3648("]CECz\u0000")), method3649(method3648("S\t\nCK")), method3649(method3648("]CECs\u0000")), method3649(method3648("FRH\u0001")) };

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!uda", name = "K", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!uda", name = "J", descriptor = "Leca;")
    public static class793 field7261;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(I)V")
    public static void method3646(int arg0) {
        try {
            if (arg0 != 3643) {
                field7261 = null;
            }
            field7261 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7262[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
    public class477() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg2 == 0) {
                this.field7259 = arg1.method1687((byte) -127);
            }
            if (arg0 < 96) {
                method3647(-18, 109, -98, -82, 54, -124, 39);
            }
            ++field7257;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7262[4] + arg0 + ',' + (arg1 != null ? field7262[3] : field7262[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIII)J")
    public static final long method3647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class679.field9666.clear();
            if (arg6 != 4096) {
                return 91L;
            } else {
                ++field7260;
                class679.field9666.set(arg3, arg5, arg1, arg2, arg0, arg4);
                return class679.field9666.getTime().getTime();
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7262[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field7258;
            if (arg1 != 123) {
                this.field7259 = -95;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(class315.field5126 & arg0 + -1, 0, 0);
                int[] var5 = this.method2022(arg0, 0, 0);
                int[] var6 = this.method2022(arg0 + 1 & class315.field5126, 0, 0);
                for (int var7 = 0; class449.field6969 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field7259;
                    int var9 = (var5[var7 + 1 & class250.field3824] + -var5[var7 + -1 & class250.field3824]) * this.field7259;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                    int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field7262[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3648(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3649(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
