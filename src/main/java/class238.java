import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class238 extends class84 {

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "[Ljava/lang/String;")
    private static final String[] field3446 = new String[] { method1976(method1975("q\u00034wk")), method1976(method1975("oY4\u001d>")), method1976(method1975("z\u0002v_")), method1976(method1975("q\u00034uk")), method1976(method1975("q\u00034vk")), method1976(method1975("q\u00034tk")), method1976(method1975("q\u00034{k")), method1976(method1975("q\u00034pk")) };

    @OriginalMember(owner = "client!et", name = "P", descriptor = "F")
    public static float field3441 = 0.0F;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "Lsb;")
    public static class261 field3442 = new class261(93, 2);

    @OriginalMember(owner = "client!et", name = "V", descriptor = "[F")
    public static float[] field3443 = new float[4];

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "Lng;")
    public static class429 field3445;

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class238() {
        super(false);
    }

    @OriginalMember(owner = "client!et", name = "k", descriptor = "(I)V")
    public static void method1970(int arg0) {
        try {
            field3442 = null;
            if (arg0 != -244) {
                field3444 = -52;
            }
            field3443 = null;
            field3445 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3446[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(II)I")
    public static final int method1971(int arg0, int arg1) {
        try {
            field3440++;
            double var2 = (double) ((arg1 & 0xFFCB8D) >> 16) / 256.0D;
            double var4 = (double) ((arg1 & 0xFFCE) >> 8) / 256.0D;
            double var6 = (double) (arg1 & 0xFF) / 256.0D;
            double var8 = var2;
            int var10 = -41 % ((arg0 - 25) / 33);
            if (var4 < var2) {
                var8 = var4;
            }
            if (var6 < var8) {
                var8 = var6;
            }
            double var11 = var2;
            if (var2 < var4) {
                var11 = var4;
            }
            if (var11 < var6) {
                var11 = var6;
            }
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var8 + var11) / 2.0D;
            if (var8 != var11) {
                if (var17 < 0.5D) {
                    var15 = (var11 - var8) / (var8 + var11);
                }
                if (var2 == var11) {
                    var13 = (var4 - var6) / (var11 - var8);
                } else if (var4 == var11) {
                    var13 = (var6 - var2) / (var11 - var8) + 2.0D;
                } else if (var6 == var11) {
                    var13 = (var2 - var4) / (var11 - var8) + 4.0D;
                }
                if (var17 >= 0.5D) {
                    var15 = (var11 - var8) / (2.0D - var11 - var8);
                }
            }
            double var19 = var13 / 6.0D;
            int var21 = (int) (var19 * 256.0D);
            int var22 = (int) (var15 * 256.0D);
            int var23 = (int) (var17 * 256.0D);
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > 255) {
                var22 = 255;
            }
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > 255) {
                var23 = 255;
            }
            if (var23 > 243) {
                var22 >>= 0x4;
            } else if (var23 > 217) {
                var22 >>= 0x3;
            } else if (var23 > 192) {
                var22 >>= 0x2;
            } else if (var23 > 179) {
                var22 >>= 0x1;
            }
            return (var23 >> 1) + (((var21 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7));
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field3446[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method1972(byte[] arg0, boolean arg1) {
        try {
            field3438++;
            return arg1 ? null : class201.method1728(0, arg0.length, -11887, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3446[7] + (arg0 == null ? field3446[2] : field3446[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILkn;B)V")
    public final void method838(int arg0, class437 arg1, byte arg2) {
        try {
            if (arg2 != -42) {
                field3444 = -77;
            }
            class795.method5734(arg0, arg1, 7);
            field3437++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3446[6] + arg0 + ',' + (arg1 == null ? field3446[2] : field3446[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "(I)V")
    public static final void method1973(int arg0) {
        try {
            if (arg0 == 255) {
                class258.method2152(118);
                field3439++;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3446[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjj;[II[II)Lwga;")
    public static final class430 method1974(int arg0, class334 arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        try {
            if (arg0 != 31974) {
                method1974(100, null, null, -53, null, -31);
            }
            field3436++;
            if (!arg1.method2082(-27964, class496.field7281, class18.field235)) {
                int[] var10 = new int[arg3 * arg5];
                for (int var11 = 0; var11 < arg5; var11++) {
                    int var12 = arg3 * var11 + arg4[var11];
                    for (int var13 = 0; var13 < arg2[var11]; var13++) {
                        var10[var12++] = -16777216;
                    }
                }
                return new class430(arg1, arg3, arg5, var10);
            }
            byte[] var6 = new byte[arg3 * arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                int var8 = arg3 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg2[var7]; var9++) {
                    var6[var8++] = -1;
                }
            }
            return new class430(arg1, arg3, arg5, var6);
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field3446[3] + arg0 + ',' + (arg1 == null ? field3446[2] : field3446[1]) + ',' + (arg2 == null ? field3446[2] : field3446[1]) + ',' + arg3 + ',' + (arg4 == null ? field3446[2] : field3446[1]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1975(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1976(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
