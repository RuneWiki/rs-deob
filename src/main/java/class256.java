import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class256 {

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Z")
    public boolean field3907 = true;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3893 = 0;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Z")
    public static boolean field3906 = true;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3912 = "Loaded update list";

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "S")
    public static short field3901 = 1;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field3908 = -1;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lpf;")
    public static class294 field3902;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILid;ZIII)V")
    public static final void method1686(int arg0, class151 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3916++;
        if (arg1.field2178 == -1 && arg1.field2183 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class196.field2988 * arg1.field2181 >> 8;
        if (arg4 > arg1.field2180) {
            var6 += arg4 - arg1.field2180;
        } else if (arg4 < arg1.field2172) {
            var6 += arg1.field2172 - arg4;
        }
        if (arg0 > arg1.field2186) {
            var6 += arg0 - arg1.field2186;
        } else if (arg1.field2190 > arg0) {
            var6 += arg1.field2190 - arg0;
        }
        if (arg1.field2182 == 0 || arg1.field2182 < (var6 - 64) || class196.field2988 == 0 || arg1.field2173 != arg5) {
            if (arg1.field2175 != null) {
                class213.field3187.method378(arg1.field2175);
                arg1.field2175 = null;
            }
            if (arg1.field2193 != null) {
                class213.field3187.method378(arg1.field2193);
                arg1.field2193 = null;
            }
            return;
        }
        if (arg2) {
            method1692(78, 105, 115, 18, 4, -106, -118);
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field2182 - var6) * var7 / arg1.field2182;
        if (arg1.field2175 != null) {
            arg1.field2175.method1722(var8);
        } else if (arg1.field2178 >= 0) {
            class280 var9 = class280.method1850(class254.field3861, arg1.field2178, 0);
            if (var9 != null) {
                class260 var10 = var9.method1851().method1745(class214.field3206);
                class257 var11 = class257.method1721(var10, 100, var8);
                var11.method1711(-1);
                class213.field3187.method373(var11);
                arg1.field2175 = var11;
            }
        }
        if (arg1.field2193 != null) {
            arg1.field2193.method1722(var8);
            if (arg1.field2193.method545((byte) -127)) {
                return;
            }
            arg1.field2193 = null;
        } else if (arg1.field2183 != null && (arg1.field2176 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field2183.length);
            class280 var13 = class280.method1850(class254.field3861, arg1.field2183[var12], 0);
            if (var13 != null) {
                class260 var14 = var13.method1851().method1745(class214.field3206);
                class257 var15 = class257.method1721(var14, 100, var8);
                var15.method1711(0);
                class213.field3187.method373(var15);
                arg1.field2176 = (int) (Math.random() * (double) (arg1.field2187 - arg1.field2174)) + arg1.field2174;
                arg1.field2193 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1687(int arg0, String arg1) {
        field3892++;
        if (arg0 > -89) {
            field3901 = -11;
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZZ)V")
    public static final void method1688(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg0 != -518637593) {
            method1690((byte) 100, (class294) null);
        }
        int var10002;
        for (int var4 = 0; var4 < class24.field295; var4++) {
            class61 var21 = class18.field220[class169.field2586[var4]];
            if (var21 != null && var21.method414(1000) && var21.field959.method486((byte) 2)) {
                int var22 = var21.method676(-30217);
                if (arg2) {
                    if (!var21.field959.field1149) {
                        continue;
                    }
                } else if (arg3 != var21.field959.field1169 || arg1 != 0 && arg1 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field2251 & 0x7F) == 64 && (var21.field2234 & 0x7F) == 64) {
                        int var29 = var21.field2251 >> 7;
                        int var30 = var21.field2234 >> 7;
                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                            var10002 = class187.field2828[var29][var30]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field2251 & 0x7F) == 0 && (var21.field2234 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field2251 & 0x7F) == 64 && (var21.field2234 & 0x7F) == 64)) {
                    int var23 = var21.field2251 - (var22 * 64) >> 7;
                    int var24 = var21.field2234 - (var22 * 64) >> 7;
                    int var25 = var23 + var21.method676(-30217);
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var26 = var24 + var21.method676(-30217);
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    for (int var27 = var23; var27 < var25; var27++) {
                        for (int var28 = var24; var28 < var26; var28++) {
                            var10002 = class187.field2828[var27][var28]++;
                        }
                    }
                }
            }
        }
        field3903++;
        label215: for (int var5 = 0; var5 < class24.field295; var5++) {
            class61 var6 = class18.field220[class169.field2586[var5]];
            long var7 = (long) class169.field2586[var5] << 32 | 0x20000000L;
            if (var6 != null && var6.method414(arg0 + 518638593) && var6.field959.method486((byte) -108)) {
                int var9 = var6.method676(arg0 ^ 0x1EE9BE10);
                if (arg2) {
                    if (!var6.field959.field1149) {
                        continue;
                    }
                } else if (var6.field959.field1169 != arg3 || arg1 != 0 && arg1 != var9) {
                    continue;
                }
                var6.field2263 = true;
                if (var9 == 1) {
                    if ((var6.field2251 & 0x7F) == 64 && (var6.field2234 & 0x7F) == 64) {
                        int var19 = var6.field2251 >> 7;
                        int var20 = var6.field2234 >> 7;
                        if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                            continue;
                        }
                        if (class187.field2828[var19][var20] > 1) {
                            var10002 = class187.field2828[var19][var20]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var6.field2251 & 0x7F) == 0 && (var6.field2234 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var6.field2251 & 0x7F) == 64 && (var6.field2234 & 0x7F) == 64) {
                    int var10 = var6.field2251 - (var9 * 64) >> 7;
                    int var11 = var9 + var10;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    boolean var12 = true;
                    int var13 = var6.field2234 - (var9 * 64) >> 7;
                    int var14 = var9 + var13;
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    for (int var15 = var10; var15 < var11; var15++) {
                        for (int var18 = var13; var18 < var14; var18++) {
                            if (class187.field2828[var15][var18] <= 1) {
                                var12 = false;
                                break;
                            }
                        }
                    }
                    if (var12) {
                        int var16 = var10;
                        while (true) {
                            if (var11 <= var16) {
                                continue label215;
                            }
                            for (int var17 = var13; var17 < var14; var17++) {
                                var10002 = class187.field2828[var16][var17]--;
                            }
                            var16++;
                        }
                    }
                }
                var6.field2263 = false;
                if (!var6.field959.field1204) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field2271 = class183.method1139(class99.field1557, var6.field2234, var6.field2251, (byte) 117);
                class101.method653(class99.field1557, var6.field2251, var6.field2234, var6.field2271, (var9 - 1) * 64 + 60, var6, var6.field2273, var7, var6.field2298);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Lc;")
    public static final class108 method1689(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        return var3 == null || var3.field4063 == null ? null : var3.field4063;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLpf;)I")
    public static final int method1690(byte arg0, class294 arg1) {
        int var2 = 118 % ((arg0 - 20) / 40);
        field3904++;
        int var3 = 0;
        if (arg1.method1960(class159.field2452, (byte) 124)) {
            var3++;
        }
        if (arg1.method1960(class268.field4037, (byte) 116)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1691(int arg0, int arg1) {
        field3898++;
        if (arg0 != -26492) {
            field3910 = -95;
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF71CB) >> 16) + "." + ((arg1 & 0xFF7E) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class248.field3765 <= (arg6 - arg2) && class163.field2505 >= (arg6 + arg2) && class243.field3635 <= arg3 - arg2 && (arg3 + arg2) <= class118.field1782) {
            class173.method1068(arg6, arg2, arg3, 99, arg4, arg1, arg0);
        } else {
            class100.method648(arg0, arg3, arg2, arg4, arg6, 3, arg1);
        }
        int var7 = -114 / ((-arg5 - 2) / 34);
        field3914++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lrf;II)I")
    public static final int method1693(class289 arg0, int arg1, int arg2) {
        field3913++;
        if (arg2 >= -109) {
            return -29;
        } else if (!client.method972(arg0).method1788(arg1, true) && arg0.field4487 == null) {
            return -1;
        } else if (arg0.field4545 == null || arg0.field4545.length <= arg1) {
            return -1;
        } else {
            return arg0.field4545[arg1];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1694(int arg0) {
        if (arg0 == 0) {
            field3912 = null;
            field3902 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3907 = arg6;
        this.field3911 = arg5;
        this.field3895 = arg1;
        this.field3896 = arg3;
        this.field3909 = arg2;
        this.field3890 = arg0;
        this.field3894 = arg4;
    }
}
