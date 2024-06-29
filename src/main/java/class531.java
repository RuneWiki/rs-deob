import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class531 implements class175 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lpq;")
    private class203 field7807;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lgda;")
    private class58 field7800;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7811 = new String[] { method3970(method3969("{a\u0018<\u0014")), method3970(method3969("{a\u0018:\u0014")), method3970(method3969("{a\u0018;\u0014")), method3970(method3969("{a\u0018>\u0014")), method3970(method3969("cqZ\u0014")), method3970(method3969("{a\u0018DUcmBF\u0014")), method3970(method3969("v*\u0018VA")), method3970(method3969("{a\u00189\u0014")), method3970(method3969("{a\u0018=\u0014")) };

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
    public static boolean field7804 = false;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lhk;")
    private class107 field7803;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ltg;")
    public static class241 field7801;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V", line = 4)
    public static void method3966(byte arg0) {
        try {
            field7801 = null;
            if (arg0 != -107) {
                field7801 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7811[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 16)
    public final void method459(byte arg0) {
        try {
            if (arg0 != -13) {
                method3966((byte) -67);
            }
            this.field7803 = class326.method2770(arg0 ^ 0xFFFF815F, this.field7800, this.field7807.field3188);
            field7810++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7811[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILoe;ILrda;)V", line = 34)
    public static final void method3967(int arg0, class210 arg1, int arg2, class693 arg3) {
        try {
            field7808++;
            if (class490.field7395 < 50 && arg1 != null && arg1.field3326 != null && arg2 < arg1.field3326.length && arg1.field3326[arg2] != null) {
                int var4 = arg1.field3326[arg2][0];
                int var5 = var4 >> 8;
                if (arg0 >= -48) {
                    field7805 = 127;
                }
                int var6 = var4 >> 5 & 0x7;
                int var7 = var4 & 0x1F;
                if (arg1.field3326[arg2].length > 1) {
                    int var8 = (int) ((double) arg1.field3326[arg2].length * Math.random());
                    if (var8 > 0) {
                        var5 = arg1.field3326[arg2][var8];
                    }
                }
                int var9 = 256;
                if (arg1.field3332 != null && arg1.field3319 != null) {
                    var9 = arg1.field3332[arg2] + (int) ((double) (arg1.field3319[arg2] - arg1.field3332[arg2]) * Math.random());
                }
                int var10 = arg1.field3318 == null ? 255 : arg1.field3318[arg2];
                if (var7 == 0) {
                    if (class438.field6846 == arg3) {
                        if (!arg1.field3322) {
                            class356.method2948(var10, (byte) -102, var9, var6, 0, var5);
                            return;
                        }
                        class136.method1271(var6, var9, var5, 0, var10, (byte) -119, false);
                    }
                } else if (class623.field8996.field6367.method4796(true) != 0) {
                    int var11 = arg3.field9985 - 256 >> 9;
                    int var12 = arg3.field9983 - 256 >> 9;
                    int var13 = class438.field6846 == arg3 ? 0 : (arg3.field9975 << 24) + (var12 << 8) + (var11 << 16) + var7;
                    class771.field11308[class490.field7395++] = new class746((byte) (arg1.field3322 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg3);
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field7811[8] + arg0 + ',' + (arg1 == null ? field7811[4] : field7811[6]) + ',' + arg2 + ',' + (arg3 == null ? field7811[4] : field7811[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZ)V", line = 106)
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            field7802++;
            if (arg1) {
                int var3 = class696.field10028 < class64.field881 ? class64.field881 : class696.field10028;
                int var4 = class518.field7672 < class333.field5444 ? class333.field5444 : class518.field7672;
                int var5 = this.field7803.method26();
                int var6 = this.field7803.method12();
                int var7 = 0;
                int var8 = var3;
                int var9 = var3 * var6 / var5;
                int var10 = (var4 - var9) / 2;
                if (var4 < var9) {
                    var9 = var4;
                    var10 = 0;
                    var8 = var4 * var5 / var6;
                    var7 = (var3 - var8) / 2;
                }
                this.field7803.method994(var7, var10, var8, var9);
            }
            if (!arg0) {
                field7805 = -96;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7811[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lgda;Lpq;)V", line = 145)
    public class531(class58 arg0, class203 arg1) {
        try {
            this.field7807 = arg1;
            this.field7800 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7811[5] + (arg0 == null ? field7811[4] : field7811[6]) + ',' + (arg1 == null ? field7811[4] : field7811[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z", line = 154)
    public final boolean method457(byte arg0) {
        try {
            if (arg0 < 9) {
                field7801 = null;
            }
            field7806++;
            return this.field7800.method595(-2, this.field7807.field3188);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7811[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Z", line = 167)
    public static final boolean method3968(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 2) {
                field7805 = -58;
            }
            field7809++;
            return class332.method2805(arg0, (byte) -42, arg2) & class360.method2977(arg1 - 2, arg0, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7811[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3969(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3970(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
