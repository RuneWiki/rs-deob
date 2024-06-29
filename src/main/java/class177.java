import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class177 extends class8 {

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    private int field2789 = 4096;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    private int field2790 = 4096;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field2791 = 4096;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1207(int arg0, String arg1) {
        ++field2786;
        int var2 = arg1.length();
        long var3 = 0L;
        int var5 = -100 / ((31 - arg0) / 62);
        for (int var6 = 0; var6 < var2; ++var6) {
            var3 = (var3 << 5) + -var3 + (long) arg1.charAt(var6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        ++field2796;
        int[][] var3 = super.field93.method248(arg0, 17416);
        int var4 = 15 / ((-48 - arg1) / 46);
        if (super.field93.field470) {
            int[][] var5 = this.method60(arg0, 0, 111);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var3[0];
            int[] var9 = var5[1];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class231.field3798; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var9[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var8[var12] = this.field2790 * var13 >> 12;
                    var10[var12] = this.field2789 * var14 >> 12;
                    var11[var12] = this.field2791 * var15 >> 12;
                } else {
                    var8[var12] = this.field2790;
                    var10[var12] = this.field2789;
                    var11[var12] = this.field2791;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1208(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class51.field894 == 0) {
            int var7 = class287.field4543;
            int var8 = class63.field1032;
            int var9 = class96.field1572;
            int var10 = class199.field3169;
            int var11 = (-arg1 + arg3) * (-var10 + var7) / arg2 + var10;
            int var12 = (-arg6 + arg5) * (-var8 + var9) / arg4 + var8;
            if (class288.field4560 && ~(class212.field3473 & 64) != -1) {
                class36 var13 = class230.method1612(1, class281.field4452, class253.field4032);
                if (var13 == null) {
                    class86.method627((byte) -18);
                } else {
                    class40.method348(var12, 0L, (short) 26, class154.field2496, var11, class138.field2268, " ->", true);
                }
            } else {
                ++class141.field2282;
                if (~class111.field1837 == -2) {
                    class40.method348(var12, 0L, (short) 20, class285.field4508, var11, -1, "", true);
                }
                class40.method348(var12, 0L, (short) 50, class1.field28, var11, -1, "", true);
            }
        }
        ++field2792;
        if (arg0) {
            field2798 = 115;
        }
        long var14 = -1L;
        for (int var16 = 0; ~class118.field1937 < ~var16; ++var16) {
            long var17 = class207.field3315[var16];
            int var19 = 127 & (int) var17 >> 7;
            int var20 = 3 & (int) var17 >> 29;
            int var21 = (int) var17 & 127;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class260.method1776(class250.field3980, var21, var19, var17)) {
                    class135 var23 = class209.method1447(var22, -6653);
                    if (var23.field2209 != null) {
                        var23 = var23.method953(52);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (~class51.field894 == -2) {
                        ++class19.field328;
                        class40.method348(var19, var17, (short) 13, class200.field3193, var21, class89.field1414, class197.field3152 + " -> <col=00ffff>" + var23.field2215, true);
                    } else if (!class288.field4560) {
                        ++class258.field4102;
                        String[] var24 = var23.field2166;
                        if (class266.field4218) {
                            var24 = class176.method1204(var24, 5);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; ~var25 <= -1; --var25) {
                                if (var24[var25] != null) {
                                    ++class212.field3464;
                                    short var26 = 0;
                                    if (~var25 == -1) {
                                        var26 = 48;
                                    }
                                    int var27 = -1;
                                    if (var25 == 1) {
                                        var26 = 2;
                                    }
                                    if (~var23.field2204 == ~var25) {
                                        var27 = var23.field2186;
                                    }
                                    if (~var25 == -3) {
                                        var26 = 32;
                                    }
                                    if (var23.field2224 == var25) {
                                        var27 = var23.field2200;
                                    }
                                    if (~var25 == -4) {
                                        var26 = 3;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class40.method348(var19, var17, var26, var24[var25], var21, var27, "<col=00ffff>" + var23.field2215, true);
                                }
                            }
                        }
                        class40.method348(var19, (long) var23.field2173, (short) 1007, class288.field4561, var21, class24.field397, "<col=00ffff>" + var23.field2215, true);
                    } else {
                        class39 var28 = ~class35.field543 == 0 ? null : class87.method632(class35.field543, 80);
                        if (~(class212.field3473 & 4) != -1 && (var28 == null || ~var23.method949(class35.field543, 0, var28.field735) != ~var28.field735)) {
                            ++class287.field4542;
                            class40.method348(var19, var17, (short) 16, class154.field2496, var21, class138.field2268, class149.field2403 + " -> <col=00ffff>" + var23.field2215, true);
                        }
                    }
                }
                if (~var20 == -2) {
                    class15 var29 = class137.field2260[var22];
                    if (~(var29.field258.field1731 & 1) == -1 && ~(127 & var29.field3389) == -1 && (var29.field3341 & 127) == 0 || (var29.field258.field1731 & 1) == 1 && ~(var29.field3389 & 127) == -65 && (var29.field3341 & 127) == 64) {
                        int var30 = -((var29.field258.field1731 + -1) * 64) + var29.field3341;
                        int var31 = -((var29.field258.field1731 - 1) * 64) + var29.field3389;
                        for (int var32 = 0; class141.field2287 > var32; ++var32) {
                            class15 var37 = class137.field2260[class221.field3648[var32]];
                            if (var37 != null && !var37.field3327 && var29 != var37 && var37.field3325) {
                                int var38 = 64 - (var37.field258.field1731 * 64 - var37.field3341);
                                int var39 = -(var37.field258.field1731 * 64) + 64 + var37.field3389;
                                if (~var31 >= ~var39 && ~var37.field258.field1731 >= ~(-(-var31 + var39 >> 7) + var29.field258.field1731) && var38 >= var30 && var37.field258.field1731 <= -(var38 - var30 >> 7) + var29.field258.field1731) {
                                    class188.method1287(-4014, class221.field3648[var32], var21, var19, var37.field258);
                                    var37.field3327 = true;
                                }
                            }
                        }
                        for (int var33 = 0; ~var33 > ~class155.field2514; ++var33) {
                            class33 var34 = class35.field548[class57.field973[var33]];
                            if (var34 != null && !var34.field3327 && var34.field3325) {
                                int var35 = var34.field3389 - (-1 + var34.method278(0)) * 64;
                                int var36 = var34.field3341 + 64 + -(var34.method278(0) * 64);
                                if (~var31 >= ~var35 && ~var34.method278(0) >= ~(-(var35 - var31 >> 7) + var29.field258.field1731) && ~var30 >= ~var36 && ~var34.method278(0) >= ~(-(-var30 + var36 >> 7) + var29.field258.field1731)) {
                                    class7.method53(false, class57.field973[var33], var21, var19, var34);
                                    var34.field3327 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3327) {
                        continue;
                    }
                    class188.method1287(-4014, var22, var21, var19, var29.field258);
                    var29.field3327 = true;
                }
                if (~var20 == -1) {
                    class33 var40 = class35.field548[var22];
                    if (~(127 & var40.field3389) == -65 && (var40.field3341 & 127) == 64) {
                        int var41 = var40.field3389 + -((var40.method278(0) - 1) * 64);
                        int var42 = var40.field3341 + -(var40.method278(0) * 64) + 64;
                        for (int var43 = 0; ~var43 > ~class141.field2287; ++var43) {
                            class15 var48 = class137.field2260[class221.field3648[var43]];
                            if (var48 != null && !var48.field3327 && var48.field3325) {
                                int var49 = var48.field3389 - (var48.field258.field1731 * 64 - 64);
                                int var50 = var48.field3341 + 64 + -(var48.field258.field1731 * 64);
                                if (var49 >= var41 && var48.field258.field1731 <= var40.method278(0) + -(-var41 + var49 >> 7) && var42 <= var50 && var48.field258.field1731 <= var40.method278(0) + -(-var42 + var50 >> 7)) {
                                    class188.method1287(-4014, class221.field3648[var43], var21, var19, var48.field258);
                                    var48.field3327 = true;
                                }
                            }
                        }
                        for (int var44 = 0; ~var44 > ~class155.field2514; ++var44) {
                            class33 var45 = class35.field548[class57.field973[var44]];
                            if (var45 != null && !var45.field3327 && var40 != var45 && var45.field3325) {
                                int var46 = var45.field3389 + 64 + -(var45.method278(0) * 64);
                                int var47 = var45.field3341 - 64 * var45.method278(0) - -64;
                                if (var46 >= var41 && var45.method278(0) <= var40.method278(0) - (var46 - var41 >> 7) && var42 <= var47 && var45.method278(0) <= -(-var42 + var47 >> 7) + var40.method278(0)) {
                                    class7.method53(arg0, class57.field973[var44], var21, var19, var45);
                                    var45.field3327 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3327) {
                        continue;
                    }
                    class7.method53(false, var22, var21, var19, var40);
                    var40.field3327 = true;
                }
                if (~var20 == -4) {
                    class115 var51 = class67.field1104[class250.field3980][var21][var19];
                    if (var51 != null) {
                        for (class21 var52 = (class21) var51.method847(1); var52 != null; var52 = (class21) var51.method848(37)) {
                            int var53 = var52.field354.field1085;
                            class12 var54 = class83.method595(var53, -124);
                            if (~class51.field894 == -2) {
                                ++class279.field4413;
                                class40.method348(var19, (long) var53, (short) 40, class200.field3193, var21, class89.field1414, class197.field3152 + " -> <col=ff9040>" + var54.field174, !arg0);
                            } else if (class288.field4560) {
                                class39 var59 = class35.field543 != -1 ? class87.method632(class35.field543, 88) : null;
                                if (~(class212.field3473 & 1) != -1 && (var59 == null || var54.method94(var59.field735, (byte) 117, class35.field543) != var59.field735)) {
                                    class40.method348(var19, (long) var53, (short) 33, class154.field2496, var21, class138.field2268, class149.field2403 + " -> <col=ff9040>" + var54.field174, true);
                                    ++class1.field6;
                                }
                            } else {
                                ++class123.field2001;
                                String[] var55 = var54.field165;
                                if (class266.field4218) {
                                    var55 = class176.method1204(var55, 5);
                                }
                                for (int var56 = 4; ~var56 <= -1; --var56) {
                                    if (var55 != null && var55[var56] != null) {
                                        ++class25.field416;
                                        int var57 = -1;
                                        byte var58 = 0;
                                        if (var54.field181 == var56) {
                                            var57 = var54.field199;
                                        }
                                        if (~var54.field229 == ~var56) {
                                            var57 = var54.field170;
                                        }
                                        if (var56 == 0) {
                                            var58 = 4;
                                        }
                                        if (~var56 == -2) {
                                            var58 = 5;
                                        }
                                        if (~var56 == -3) {
                                            var58 = 43;
                                        }
                                        if (~var56 == -4) {
                                            var58 = 49;
                                        }
                                        if (var56 == 4) {
                                            var58 = 14;
                                        }
                                        class40.method348(var19, (long) var53, var58, var55[var56], var21, var57, "<col=ff9040>" + var54.field174, true);
                                    }
                                }
                                class40.method348(var19, (long) var53, (short) 1004, class288.field4561, var21, class24.field397, "<col=ff9040>" + var54.field174, !arg0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2791 = arg1.method1521((byte) 113);
                }
            } else {
                this.field2789 = arg1.method1521((byte) 113);
            }
        } else {
            this.field2790 = arg1.method1521((byte) 113);
        }
        ++field2795;
        if (arg0 < 62) {
            method1208(true, 72, -115, -48, -10, 110, -63);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1209(String arg0, int arg1) {
        ++field2787;
        if (class153.field2479 != null && ~arg0.length() != -1) {
            for (int var2 = 0; class153.field2479.field275 > var2; ++var2) {
                if (class154.method1070("<br>", (byte) 55, class153.field2479.field266[var2], " ").equals(arg0)) {
                    return var2;
                }
            }
            if (arg1 != -1) {
                field2798 = 48;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
    public static final void method1210(int arg0, int arg1) {
        ++field2793;
        int var2 = 99 / ((arg1 - 65) / 43);
        class222.field3685.method476(false, arg0);
        class229.field3773.method476(false, arg0);
    }
}
