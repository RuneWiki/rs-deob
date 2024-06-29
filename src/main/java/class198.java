import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class198 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[[I")
    private int[][] field3851;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Leh;")
    private static class47 field3853 = class195.method1282((byte) -4, "No reply from loginserver)3");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
    public static int[] field3848 = new int[5];

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Leh;")
    private static class47 field3852 = class195.method1282((byte) -4, "Too many connections from your address)3");

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Leh;")
    public static class47 field3872 = field3853;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Leh;")
    public static class47 field3871 = class195.method1282((byte) -4, "gr-Un:");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Leh;")
    public static class47 field3849 = field3852;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public static int[] field3850;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field3870;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[Ldh;")
    public static class38[] field3866;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILgf;)Leh;")
    public static final class47 method1297(int arg0, class61 arg1) {
        field3868++;
        if (class186.method1237(129109, class5.method25(arg1, (byte) 81)) == 0) {
            return null;
        } else if (arg0 < 92) {
            return null;
        } else if (arg1.field1267 == null || arg1.field1267.method390(125).method376(-43) == 0) {
            return class193.field3746 ? class121.field2440 : null;
        } else {
            return arg1.field1267;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    public final int method1298(int arg0, int arg1) {
        if (arg0 != 6) {
            method1303(false, -112, 93);
        }
        if (this.field3851 != null) {
            arg1 = (int) ((long) this.field3858 * (long) arg1 / (long) this.field3863) + 6;
        }
        field3855++;
        return arg1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
    public static final void method1299(int arg0, int arg1) {
        field3857++;
        if (class158.field3078 == arg1) {
            return;
        }
        if (class158.field3078 == 0) {
            class154.method1070(43);
        }
        if (arg1 == 20 || arg1 == 40) {
            class105.field2209 = 0;
            class99.field2089 = 0;
            class185.field3537 = 0;
        }
        if (arg0 != 0) {
            return;
        }
        if (arg1 != 20 && arg1 != 40 && class197.field3847 != null) {
            class197.field3847.method678((byte) -92);
            class197.field3847 = null;
        }
        if (class158.field3078 == 25) {
            class185.field3541 = 1;
            class132.field2605 = 0;
            class116.field2362 = 0;
            class184.field3522 = 1;
            class156.field3049 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class92.method744(0, class3.field45, class25.field491, class47.field949);
        } else {
            class159.method1089((byte) 86);
        }
        class158.field3078 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BILah;I)Ldh;")
    public static final class38 method1300(byte arg0, int arg1, class9 arg2, int arg3) {
        field3861++;
        int var4 = -1 % ((arg0 - 5) / 48);
        return class187.method1240(arg3, (byte) -57, arg1, arg2) ? class166.method1127(0) : null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)I")
    public final int method1301(int arg0, int arg1) {
        if (this.field3851 != null) {
            arg0 = (int) ((long) this.field3858 * (long) arg0 / (long) this.field3863);
        }
        field3860++;
        if (arg1 != 1371335056) {
            method1302(47);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Luc;")
    public static final class183 method1302(int arg0) {
        field3867++;
        try {
            if (arg0 != -21) {
                field3870 = null;
            }
            return (class183) Class.forName("cg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZII)V")
    public static final void method1303(boolean arg0, int arg1, int arg2) {
        field3865++;
        if (class149.field2928 != arg1) {
            class167.field3237 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class167.field3237[var3] = (var3 << 12) / arg1;
            }
            class121.field2453 = arg1 - 1;
            class149.field2928 = arg1;
        }
        if (!arg0) {
            field3872 = null;
        }
        if (class120.field2422 == arg2) {
            return;
        }
        class26.field500 = new int[arg2];
        for (int var4 = 0; var4 < arg2; var4++) {
            class26.field500[var4] = (var4 << 12) / arg2;
        }
        class122.field2468 = arg2 - 1;
        class120.field2422 = arg2;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method1304(int arg0) {
        field3850 = null;
        field3872 = null;
        field3866 = null;
        field3848 = null;
        field3849 = null;
        field3852 = null;
        field3871 = null;
        field3853 = null;
        field3870 = null;
        if (arg0 != -6682) {
            method1306(false, null, false, null, null);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)[B")
    public final byte[] method1305(byte[] arg0, int arg1) {
        field3856++;
        if (this.field3851 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3858 / (long) this.field3863) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3851[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3858 + var5;
                int var14 = var13 / this.field3863;
                var5 = var13 - this.field3863 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        int var15 = -102 % ((arg1 + 66) / 32);
        return arg0;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(II)V")
    public class198(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class64.method535(arg1, arg0, (byte) 38);
            int var4 = arg0 / var3;
            this.field3851 = new int[var4][14];
            this.field3863 = var4;
            int var5 = arg1 / var3;
            this.field3858 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field3851[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjh;ZLah;Lah;)V")
    public static final void method1306(boolean arg0, class89 arg1, boolean arg2, class9 arg3, class9 arg4) {
        class44.field877 = arg3;
        class14.field298 = arg4;
        field3869++;
        if (arg0) {
            class12.field230 = arg2;
            class32.field608 = class14.field298.method68(81, 10);
            class83.field1768 = arg1;
        }
    }
}
