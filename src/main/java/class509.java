import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class509 extends class17 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7432 = null;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field7433 = 0;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lng;")
    public static class226 field7435;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "F")
    public static float field7431;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Luq;")
    public static class111 field7428;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method3012(int arg0) {
        field7435 = null;
        field7432 = null;
        field7428 = null;
        if (arg0 != -20557) {
            method3014(-34, 10, -72, -74, -107);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILse;I)V")
    public static final void method3013(int arg0, int arg1, class167 arg2, int arg3) {
        field7430++;
        if (arg2.field1950 == arg3 && arg3 != -1) {
            class329 var4 = class84.field1295.method1182(arg3, 8);
            int var5 = var4.field4668;
            if (var5 == 1) {
                arg2.field1952 = 0;
                arg2.field1940 = 0;
                arg2.field1936 = arg0;
                arg2.field1935 = 0;
                arg2.field1915 = 1;
                class480.method2856(arg2.field1769, arg2.field1763, (byte) 96, arg2.field1768, false, var4, arg2.field1940);
            }
            if (var5 == 2) {
                arg2.field1952 = 0;
            }
        } else if (arg3 == -1 || arg2.field1950 == -1 || class84.field1295.method1182(arg3, arg1 ^ 0x8).field4680 >= class84.field1295.method1182(arg2.field1950, 8).field4680) {
            arg2.field1935 = 0;
            arg2.field1915 = 1;
            arg2.field1936 = arg0;
            arg2.field1952 = 0;
            arg2.field1950 = arg3;
            arg2.field1999 = arg2.field2000;
            arg2.field1940 = 0;
            if (arg2.field1950 != -1) {
                class480.method2856(arg2.field1769, arg2.field1763, (byte) 83, arg2.field1768, false, class84.field1295.method1182(arg2.field1950, 8), arg2.field1940);
            }
        }
        if (arg1 != 0) {
            field7428 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)I")
    public static final int method3014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7429++;
        int var5 = 65536 - class457.field6759[arg4 * 8192 / arg3] >> 1;
        return arg0 == 1474329360 ? ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16) : 99;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILme;IZ)V")
    public static final void method3015(int arg0, int arg1, class129 arg2, int arg3, boolean arg4) {
        field7426++;
        if (arg4) {
            method3012(119);
        }
        class82 var5 = arg2.method845(0);
        int var6 = arg2.field1902 - arg2.field1945.field1724 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg2.field1983 > 25) {
                arg2.field1963 = false;
                if (arg3 < 0 && var5.field1246 != -1) {
                    arg2.field1931 = var5.field1246;
                } else if (arg3 <= 0 || var5.field1264 == -1) {
                    arg2.field1931 = var5.field1231;
                } else {
                    arg2.field1931 = var5.field1264;
                }
            } else if (!arg2.field1963 || !var5.method488(arg2.field1931, 0)) {
                arg2.field1931 = var5.method484(-1);
                arg2.field1963 = arg2.field1931 != -1;
            }
        } else if (arg2.field1904 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class431.field6441[arg1] - arg2.field1945.field1724 & 0x3FFF;
            arg2.field1963 = false;
            if (arg0 == 2 && var5.field1267 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1252 != -1) {
                    arg2.field1931 = var5.field1252;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1235 != -1) {
                    arg2.field1931 = var5.field1235;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1268 == -1) {
                    arg2.field1931 = var5.field1267;
                } else {
                    arg2.field1931 = var5.field1268;
                }
            } else if (arg0 == 0 && var5.field1260 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field1232 != -1) {
                    arg2.field1931 = var5.field1232;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1242 != -1) {
                    arg2.field1931 = var5.field1242;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1245 == -1) {
                    arg2.field1931 = var5.field1260;
                } else {
                    arg2.field1931 = var5.field1245;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field1233 != -1) {
                arg2.field1931 = var5.field1233;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field1258 != -1) {
                arg2.field1931 = var5.field1258;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field1249 == -1) {
                arg2.field1931 = var5.field1231;
            } else {
                arg2.field1931 = var5.field1249;
            }
        } else if (var6 == 0 && arg2.field1983 <= 25) {
            arg2.field1963 = false;
            if (arg0 == 2 && var5.field1267 != -1) {
                arg2.field1931 = var5.field1267;
            } else if (arg0 == 0 && var5.field1260 != -1) {
                arg2.field1931 = var5.field1260;
            } else {
                arg2.field1931 = var5.field1231;
            }
        } else {
            arg2.field1963 = false;
            if (arg0 == 2 && var5.field1267 != -1) {
                if (arg3 < 0 && var5.field1274 != -1) {
                    arg2.field1931 = var5.field1274;
                } else if (arg3 <= 0 || var5.field1272 == -1) {
                    arg2.field1931 = var5.field1267;
                } else {
                    arg2.field1931 = var5.field1272;
                }
            } else if (arg0 == 0 && var5.field1260 != -1) {
                if (arg3 < 0 && var5.field1248 != -1) {
                    arg2.field1931 = var5.field1248;
                } else if (arg3 <= 0 || var5.field1227 == -1) {
                    arg2.field1931 = var5.field1260;
                } else {
                    arg2.field1931 = var5.field1227;
                }
            } else if (arg3 < 0 && var5.field1226 != -1) {
                arg2.field1931 = var5.field1226;
            } else if (arg3 <= 0 || var5.field1270 == -1) {
                arg2.field1931 = var5.field1231;
            } else {
                arg2.field1931 = var5.field1270;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIFI[FI)V")
    public static final void method3016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, int arg9) {
        field7434++;
        int var10 = arg2 - arg1;
        int var11 = arg5 - arg9;
        int var12 = arg7 - arg3;
        float var13 = arg8[2] * (float) var12 + arg8[1] * (float) var10 + arg8[0] * (float) var11;
        float var14 = arg8[5] * (float) var12 + arg8[3] * (float) var11 + arg8[4] * (float) var10;
        float var15 = arg8[8] * (float) var12 + arg8[6] * (float) var11 + arg8[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg4 != -3828) {
            field7435 = null;
        }
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg6 + 0.5F;
        if (arg0 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg0 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg0 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class123.field1863 = var17;
        class221.field3285 = var18;
    }

    static {
        new class475("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field7435 = new class226(200);
        field7436 = 100;
    }
}
