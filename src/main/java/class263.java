import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class263 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "S")
    public static short field4219 = 1;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4224 = new String[100];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field4220 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[[[B")
    public static byte[][][] field4225;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1763(int arg0) {
        if (arg0 >= -116) {
            field4220 = -37;
        }
        field4225 = null;
        field4224 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1764(String arg0, boolean arg1) {
        if (arg1) {
            method1766(77, (class43) null, 61);
        }
        field4221++;
        return class199.method1387(true, 10, arg0, 1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z[I)[I")
    public static final int[] method1765(boolean arg0, int[] arg1) {
        field4222++;
        if (arg1 == null) {
            return null;
        }
        if (arg0) {
            field4220 = -21;
        }
        int[] var2 = new int[arg1.length];
        class157.method1068(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILaa;I)V")
    public static final void method1766(int arg0, class43 arg1, int arg2) {
        field4223++;
        if (arg1.field657 > class29.field360) {
            class272.method1822(-30671, arg1);
        } else if (arg1.field639 >= class29.field360) {
            class199.method1391((byte) 123, arg1);
        } else {
            class287.method1911(21225, arg1);
        }
        if (arg1.field637 < 128 || arg1.field710 < 128 || arg1.field637 >= 13184 || arg1.field710 >= 13184) {
            arg1.field657 = 0;
            arg1.field669 = -1;
            arg1.field639 = 0;
            arg1.field699 = -1;
            arg1.field637 = arg1.field709[0] * 128 + arg1.method279(23397) * 64;
            arg1.field710 = arg1.field704[0] * 128 + (arg1.method279(23397) * 64);
            arg1.method293(2);
        }
        if (arg0 != 1536) {
            field4224 = null;
        }
        if (class239.field3829 == arg1 && (arg1.field637 < 1536 || arg1.field710 < 1536 || arg1.field637 >= 11776 || arg1.field710 >= 11776)) {
            arg1.field639 = 0;
            arg1.field669 = -1;
            arg1.field657 = 0;
            arg1.field699 = -1;
            arg1.field637 = arg1.field709[0] * 128 + arg1.method279(arg0 + 21861) * 64;
            arg1.field710 = arg1.field704[0] * 128 + arg1.method279(23397) * 64;
            arg1.method293(2);
        }
        class221.method1519(arg1, (byte) -90);
        class10.method52(arg1, 22871);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIILr;)V")
    public static final void method1767(int arg0, int arg1, int arg2, int arg3, class253 arg4) {
        field4218++;
        if (arg1 != 16841) {
            method1765(false, (int[]) null);
        }
        if (class83.field1384 >= 400) {
            return;
        }
        if (arg4.field4062 != null) {
            arg4 = arg4.method1711(true);
        }
        if (arg4 == null || !arg4.field4076) {
            return;
        }
        String var5 = arg4.field4051;
        if (arg4.field4054 != 0) {
            String var6 = class299.field4792 == 1 ? class146.field2307 : class262.field4212;
            var5 = var5 + class228.method1546(0, class239.field3829.field4790, arg4.field4054) + " (" + var6 + arg4.field4054 + ")";
        }
        if (class46.field778 == 1) {
            class246.field3910++;
            class266.method1789(class14.field159 + " -> <col=ffff00>" + var5, arg3, arg2, class100.field1625, (long) arg0, class161.field2557, -125, (short) 24);
        } else if (class139.field2211) {
            class60 var14 = class46.field767 == -1 ? null : class186.method1335(class46.field767, 18773);
            if ((class258.field4168 & 0x2) != 0) {
                if (var14 == null || arg4.method1703(var14.field974, class46.field767, 117) != var14.field974) {
                    class266.method1789(class203.field3235 + " -> <col=ffff00>" + var5, arg3, arg2, class19.field230, (long) arg0, class143.field2268, 122, (short) 47);
                    class74.field1238++;
                }
                return;
            }
        } else {
            class205.field3267++;
            String[] var7 = arg4.field4061;
            if (class117.field1896) {
                var7 = class236.method1600(15502, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class299.field4792 != 0 || !var7[var8].equalsIgnoreCase(class203.field3240))) {
                        class148.field2318++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 3;
                        }
                        int var10 = -1;
                        if (arg4.field4036 == var8) {
                            var10 = arg4.field4064;
                        }
                        if (arg4.field4082 == var8) {
                            var10 = arg4.field4031;
                        }
                        if (var8 == 1) {
                            var9 = 14;
                        }
                        if (var8 == 2) {
                            var9 = 19;
                        }
                        if (var8 == 3) {
                            var9 = 44;
                        }
                        if (var8 == 4) {
                            var9 = 20;
                        }
                        class266.method1789("<col=ffff00>" + var5, arg3, arg2, var7[var8], (long) arg0, var10, -43, var9);
                    }
                }
            }
            if (class299.field4792 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class203.field3240)) {
                        class206.field3278++;
                        short var12 = 0;
                        if (class239.field3829.field4790 < arg4.field4054) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 3;
                        }
                        if (var11 == 1) {
                            var13 = 14;
                        }
                        if (var11 == 2) {
                            var13 = 19;
                        }
                        if (var11 == 3) {
                            var13 = 44;
                        }
                        if (var11 == 4) {
                            var13 = 20;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class266.method1789("<col=ffff00>" + var5, arg3, arg2, var7[var11], (long) arg0, arg4.field4055, arg1 - 16718, var13);
                    }
                }
            }
            class266.method1789("<col=ffff00>" + var5, arg3, arg2, class67.field1113, (long) arg0, class155.field2421, arg1 ^ 0x41B5, (short) 1001);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIILqk;IZJ)Z")
    public static final boolean method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class2 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class267.field4304 == class26.field324;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class96.field1548 || var24 >= class59.field972) {
                    return false;
                }
                class151 var25 = class218.field3584[arg0][var15][var24];
                if (var25 != null && var25.field2357 >= 5) {
                    return false;
                }
            }
        }
        class179 var16 = new class179();
        var16.field2933 = arg11;
        var16.field2923 = arg0;
        var16.field2917 = arg5;
        var16.field2926 = arg6;
        var16.field2924 = arg7;
        var16.field2932 = arg8;
        var16.field2927 = arg9;
        var16.field2931 = arg1;
        var16.field2915 = arg2;
        var16.field2918 = arg1 + arg3 - 1;
        var16.field2925 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class218.field3584[var22][var17][var20] == null) {
                        class218.field3584[var22][var17][var20] = new class151(var22, var17, var20);
                    }
                }
                class151 var23 = class218.field3584[arg0][var17][var20];
                var23.field2347[var23.field2357] = var16;
                var23.field2368[var23.field2357] = var21;
                var23.field2358 |= var21;
                var23.field2357++;
                if (var13 && class245.field3906[var17][var20] != 0) {
                    var14 = class245.field3906[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class245.field3906[var18][var19] == 0) {
                        class245.field3906[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class151.field2343[class18.field217++] = var16;
        }
        return true;
    }
}
