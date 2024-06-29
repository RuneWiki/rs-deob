import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class126 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3202 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3198 = -1;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3203 = -1;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lfc;")
    public static class39 field3204 = class90.method774(" (X", -93);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[J")
    public static long[] field3209 = new long[100];

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lfc;")
    public static class39 field3208 = class90.method774("Regelversto-8 melden", -83);

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lfc;")
    public static class39 field3212 = class90.method774("T", -81);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
    public static int[] field3205;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
    public static int[] field3206;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1043(boolean arg0) {
        class12.field316.method691(-21);
        field3199++;
        class108.field2721.method1155(0, 0);
        if (arg0) {
            class40.method490();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLq;)V", line = 26)
    public static final void method1044(byte arg0, class111 arg1) {
        field3200++;
        if (arg1.field2893 == 0) {
            return;
        }
        if (arg1.field2898 != -1 && arg1.field2898 < 32768) {
            class121 var2 = class118.field3092[arg1.field2898];
            if (var2 != null) {
                int var3 = arg1.field2916 - var2.field2916;
                int var4 = arg1.field2909 - var2.field2909;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2887 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2898 >= 32768) {
            int var5 = arg1.field2898 - 32768;
            if (class53.field1323 == var5) {
                var5 = 2047;
            }
            class142 var6 = class101.field2525[var5];
            if (var6 != null) {
                int var7 = arg1.field2916 - var6.field2916;
                int var8 = arg1.field2909 - var6.field2909;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2887 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2889 != 0 || arg1.field2890 != 0) && (arg1.field2927 == 0 || arg1.field2872 > 0)) {
            int var9 = arg1.field2916 - (arg1.field2889 - class54.field1341 - class54.field1341) * 64;
            int var10 = arg1.field2909 - (arg1.field2890 - class55.field1382 - class55.field1382) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2887 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2889 = 0;
            arg1.field2890 = 0;
        }
        int var11 = arg1.field2887 - arg1.field2900 & 0x7FF;
        if (var11 == 0) {
            arg1.field2881 = 0;
        } else {
            arg1.field2881++;
            if (var11 <= 1024) {
                arg1.field2900 += arg1.field2893;
                boolean var12 = true;
                if (var11 < arg1.field2893 || 2048 - arg1.field2893 < var11) {
                    var12 = false;
                    arg1.field2900 = arg1.field2887;
                }
                if (arg1.field2920 == arg1.field2869 && (arg1.field2881 > 25 || var12)) {
                    if (arg1.field2858 == -1) {
                        arg1.field2869 = arg1.field2873;
                    } else {
                        arg1.field2869 = arg1.field2858;
                    }
                }
            } else {
                arg1.field2900 -= arg1.field2893;
                boolean var13 = true;
                if (var11 < arg1.field2893 || 2048 - arg1.field2893 < var11) {
                    arg1.field2900 = arg1.field2887;
                    var13 = false;
                }
                if (arg1.field2920 == arg1.field2869 && (arg1.field2881 > 25 || var13)) {
                    if (arg1.field2896 == -1) {
                        arg1.field2869 = arg1.field2873;
                    } else {
                        arg1.field2869 = arg1.field2896;
                    }
                }
            }
            arg1.field2900 &= 0x7FF;
        }
        if (arg0 >= -84) {
            field3211 = -89;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V", line = 150)
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 6337) {
            method1044((byte) 39, null);
        }
        field3197++;
        for (int var5 = arg2; var5 <= arg2 + arg0; var5++) {
            for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class31.field870[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class7.field219[0][var6][var5] = class7.field219[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class7.field219[0][var6][var5] = class7.field219[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class7.field219[0][var6][var5] = class7.field219[0][var6][var5 - 1];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class7.field219[0][var6][var5] = class7.field219[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBZ)V", line = 200)
    public static final void method1046(int arg0, int arg1, byte arg2, boolean arg3) {
        field3194++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class12.field319 = arg3;
        if (arg2 != 102) {
            field3208 = null;
        }
        class151.field3738 = arg1;
        class93.field2181 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 248)
    public static void method1047(int arg0) {
        if (arg0 != 18) {
            field3203 = 45;
        }
        field3209 = null;
        field3208 = null;
        field3212 = null;
        field3205 = null;
        field3206 = null;
        field3204 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 263)
    public static final void method1048(int arg0) {
        field3210++;
        class39 var1 = null;
        for (int var2 = 0; var2 < field3207; var2++) {
            if (class97.field2315[var2].method471(class99.field2382, (byte) -62) != -1) {
                var1 = class97.field2315[var2].method469(class97.field2315[var2].method471(class99.field2382, (byte) -62), (byte) -120);
                break;
            }
        }
        if (var1 == null) {
            class30.method366(16776960);
            return;
        }
        int var3 = class44.field1197;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class93.field2171;
        int var5 = class116.field3037;
        int var6 = class146.field3638;
        if (var6 > 190) {
            var6 = 190;
        }
        int var7 = 6116423;
        class152.method1209(var3, var4, var6, var5, var7);
        class152.method1209(var3 - arg0, var4 + 1, var6 - 2, 16, 0);
        class152.method1212(var3 + 1, var4 + 18, var6 - 2, var5 + -19, 0);
        class96.field2224.method700(var1, var3 + 3, var4 + 14, var7, -1);
        int var8 = class131.field3322;
        int var9 = class12.field314;
        if (class50.field1258 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (class50.field1258 == 1) {
            var9 -= 553;
            var8 -= 205;
        }
        if (class50.field1258 == 2) {
            var8 -= 357;
            var9 -= 17;
        }
        for (int var10 = 0; var10 < field3207; var10++) {
            int var11 = var4 + (field3207 - var10 - 1) * 15 + 31;
            int var12 = 16777215;
            if (var3 < var9 && var3 + var6 > var9 && var8 > var11 - 13 && var11 + 3 > var8) {
                var12 = 16776960;
            }
            class39 var13 = class97.field2315[var10];
            if (var13.method451((byte) 113, var1)) {
                var13 = var13.method456(0, 0, var13.method437(arg0 ^ 0xFFFFFFD8) - var1.method437(arg0 - 74));
                if (var13.method451((byte) 122, class38.field1030)) {
                    var13 = var13.method456(~arg0, 0, var13.method437(39) - class38.field1030.method437(arg0 + 120));
                }
            }
            class96.field2224.method700(var13, var3 + 3, var11, var12, 0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)[B", line = 376)
    public static final synchronized byte[] method1049(boolean arg0, int arg1) {
        field3196++;
        if (arg1 == 100 && class58.field1441 > 0) {
            byte[] var2 = class54.field1343[--class58.field1441];
            class54.field1343[class58.field1441] = null;
            return var2;
        } else if (arg1 == 5000 && class145.field3626 > 0) {
            byte[] var3 = class60.field1457[--class145.field3626];
            class60.field1457[class145.field3626] = null;
            return var3;
        } else {
            if (!arg0) {
                method1046(-15, -27, (byte) -7, false);
            }
            if (arg1 == 30000 && class78.field1774 > 0) {
                byte[] var4 = class54.field1354[--class78.field1774];
                class54.field1354[class78.field1774] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 423)
    public static int method1050(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
