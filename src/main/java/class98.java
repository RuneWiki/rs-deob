import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class98 extends class13 {

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "Laq;")
    public static class90 field1354 = new class90();

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "[Lkm;")
    public static class198[] field1358 = new class198[32768];

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "Lr;")
    public static class99 field1359;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method706(boolean arg0, byte arg1, byte[] arg2) {
        if (arg1 <= 68) {
            field1359 = null;
        }
        ++field1356;
        if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class62.field859) {
                try {
                    class22 var3 = (class22) Class.forName("qi").newInstance();
                    var3.method287(200, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class62.field859 = true;
                }
            }
            return arg0 ? class396.method2507((byte) -16, arg2) : arg2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILuo;I)V")
    public static final void method707(int arg0, int arg1, class345 arg2, int arg3) {
        ++field1355;
        if (arg0 >= 0 && ~arg1 <= -1 && class47.field659 != 0 && class325.field4451 != 0) {
            arg2.method63(class447.field6278, class245.field3460, class47.field659, class325.field4451);
            arg2.method136(class338.field4647, class87.field1222, class47.field659, class325.field4451);
            class417 var4 = arg2.method101();
            var4.method694(class91.field1281, class416.field5923, class198.field2743, class130.field1840, class34.field530, class445.field6240);
            arg2.method126(var4);
            if (class418.field5939 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg2.method49();
                int var8 = (-class447.field6278 + arg0) * var7 / class47.field659;
                int var9 = (-class245.field3460 + arg1) * var7 / class325.field4451;
                int var10 = arg2.method85();
                int var11 = (-class447.field6278 + arg0) * var10 / class47.field659;
                int var12 = (-class245.field3460 + arg1) * var10 / class325.field4451;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method703(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method703(var14);
                float var15 = 0.0F;
                int var16 = var14[0] + -var13[0];
                int var17 = var14[1] + -var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (~var20 < -1 && var22 > 0 && ~class211.field2954 < ~var20 && var22 < class290.field4061) {
                        int var23 = class142.field2034;
                        if (~var23 > -4 && ~(class368.field5193[1][var20][var22] & 2) != -1) {
                            ++var23;
                        }
                        if ((float) class418.field5939[var23].method725(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = class412.field5841.method942(false) * 64 - 64 + var19 >> 7;
                            var6 = var21 + -64 + class412.field5841.method942(false) * 64 >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (var5 != -1 && ~var6 != 0) {
                    if (class327.field4511 && ~(class319.field4354 & 64) != -1) {
                        class453 var24 = class143.method983(-1, class231.field3339, class178.field2451);
                        if (var24 == null) {
                            class418.method2624(-112);
                        } else {
                            class66.method514(var6, var5, 50, " ->", (byte) -16, class92.field1289, 0L, class249.field3519);
                        }
                    } else {
                        if (~class129.field1827 == -2) {
                            class66.method514(var6, var5, 3, "", (byte) -16, -1, 0L, class299.field4161.method2763(-89, class210.field2935));
                        }
                        class66.method514(var6, var5, 23, "", (byte) -16, -1, 0L, class160.field2244);
                        ++class253.field3572;
                    }
                }
            }
            class149 var25 = class100.field1383;
            for (class170 var26 = (class170) var25.method1005(-1); var26 != null; var26 = (class170) var25.method1012((byte) 81)) {
                if (var26.method1119(arg0, arg1, arg2, false) && class142.field2034 == var26.field2323) {
                    if (var26.field2332 instanceof class134) {
                        class134 var28 = (class134) var26.field2332;
                        int var29 = var28.method942(false);
                        if (~(var29 & 1) == -1 && (var28.field6262 & 127) == 0 && ~(127 & var28.field6266) == -1 || (var29 & 1) == 1 && (127 & var28.field6262) == 64 && ~(var28.field6266 & 127) == -65) {
                            int var30 = var28.field6262 + -(64 * (var28.method942(false) + -1));
                            int var31 = var28.field6266 + -((var28.method942(false) + -1) * 64);
                            for (int var32 = 0; ~var32 > ~class125.field1758; ++var32) {
                                class198 var37 = field1358[class135.field1967[var32]];
                                if (var37 != null && class276.field3837 != var37.field5307 && var37.field5317) {
                                    int var38 = var37.field6262 + 64 + -(var37.field2737.field4488 * 64);
                                    int var39 = -((var37.field2737.field4488 - 1) * 64) + var37.field6266;
                                    if (var30 <= var38 && var37.field2737.field4488 <= -(-var30 + var38 >> 7) + var28.method942(false) && ~var39 <= ~var31 && var37.field2737.field4488 <= var28.method942(false) + -(var39 - var31 >> 7)) {
                                        class42.method387(30529, var37);
                                        var37.field5307 = class276.field3837;
                                    }
                                }
                            }
                            for (int var33 = 0; ~var33 > ~class26.field467; ++var33) {
                                class134 var34 = class381.field5447[class66.field974[var33]];
                                if (var34 != null && ~class276.field3837 != ~var34.field5307 && var28 != var34 && var34.field5317) {
                                    int var35 = var34.field6262 + 64 + -(var34.method942(false) * 64);
                                    int var36 = var34.field6266 + -(64 * (-1 + var34.method942(false)));
                                    if (~var35 <= ~var30 && var34.method942(false) <= -(var35 - var30 >> 7) + var28.method942(false) && ~var31 >= ~var36 && ~var34.method942(false) >= ~(-(-var31 + var36 >> 7) + var28.method942(false))) {
                                        class132.method914(var34, 18989);
                                        var34.field5307 = class276.field3837;
                                    }
                                }
                            }
                        }
                        if (class276.field3837 == var28.field5307) {
                            continue;
                        }
                        class132.method914(var28, 18989);
                        var28.field5307 = class276.field3837;
                    }
                    if (var26.field2332 instanceof class198) {
                        class198 var40 = (class198) var26.field2332;
                        if (var40.field2737 != null) {
                            if (~(var40.field2737.field4488 & 1) == -1 && ~(var40.field6262 & 127) == -1 && ~(127 & var40.field6266) == -1 || ~(var40.field2737.field4488 & 1) == -2 && ~(var40.field6262 & 127) == -65 && ~(127 & var40.field6266) == -65) {
                                int var41 = -((var40.field2737.field4488 + -1) * 64) + var40.field6262;
                                int var42 = -((var40.field2737.field4488 + -1) * 64) + var40.field6266;
                                for (int var43 = 0; class125.field1758 > var43; ++var43) {
                                    class198 var48 = field1358[class135.field1967[var43]];
                                    if (var48 != null && ~class276.field3837 != ~var48.field5307 && var40 != var48 && var48.field5317) {
                                        int var49 = -(var48.field2737.field4488 * 64) - -64 + var48.field6262;
                                        int var50 = -((var48.field2737.field4488 + -1) * 64) + var48.field6266;
                                        if (var49 >= var41 && var48.field2737.field4488 <= -(-var41 + var49 >> 7) + var40.field2737.field4488 && var42 <= var50 && -(-var42 + var50 >> 7) + var40.field2737.field4488 >= var48.field2737.field4488) {
                                            class42.method387(30529, var48);
                                            var48.field5307 = class276.field3837;
                                        }
                                    }
                                }
                                for (int var44 = 0; ~var44 > ~class26.field467; ++var44) {
                                    class134 var45 = class381.field5447[class66.field974[var44]];
                                    if (var45 != null && ~class276.field3837 != ~var45.field5307 && var45.field5317) {
                                        int var46 = var45.field6262 - 64 * var45.method942(false) - -64;
                                        int var47 = var45.field6266 - -64 - var45.method942(false) * 64;
                                        if (var41 <= var46 && var45.method942(false) <= var40.field2737.field4488 - (-var41 + var46 >> 7) && ~var42 >= ~var47 && ~var45.method942(false) >= ~(var40.field2737.field4488 - (-var42 + var47 >> 7))) {
                                            class132.method914(var45, 18989);
                                            var45.field5307 = class276.field3837;
                                        }
                                    }
                                }
                            }
                            if (class276.field3837 == var40.field5307) {
                                continue;
                            }
                            class42.method387(30529, var40);
                            var40.field5307 = class276.field3837;
                        }
                    }
                    if (var26.field2332 instanceof class195) {
                        class107 var51 = (class107) class367.field5182.method886((long) (var26.field2322 << 14 | var26.field2323 << 28 | var26.field2324), 25651);
                        if (var51 != null) {
                            for (class388 var52 = (class388) var51.field1478.method634((byte) 40); var52 != null; var52 = (class388) var51.field1478.method645(4096)) {
                                class360 var53 = class51.method433((byte) 87, var52.field5569);
                                if (class327.field4511) {
                                    class116 var54 = class192.field2650 != -1 ? class44.method396((byte) -126, class192.field2650) : null;
                                    if ((class319.field4354 & 1) != 0 && (var54 == null || ~var53.method2312(8806, class192.field2650, var54.field1668) != ~var54.field1668)) {
                                        ++class237.field3384;
                                        class66.method514(var26.field2322, var26.field2324, 60, class416.field5913 + " -> <col=ff9040>" + var53.field4938, (byte) -16, class92.field1289, (long) var52.field5569, class249.field3519);
                                    }
                                } else {
                                    String[] var55 = var53.field4965;
                                    for (int var56 = 4; var56 >= 0; --var56) {
                                        if (var55 != null && var55[var56] != null) {
                                            byte var57 = 0;
                                            int var58 = class341.field4666;
                                            if (~var56 == -1) {
                                                var57 = 25;
                                            }
                                            if (~var56 == -2) {
                                                var57 = 48;
                                            }
                                            if (var56 == 2) {
                                                var57 = 57;
                                            }
                                            if (var56 == 3) {
                                                var57 = 51;
                                            }
                                            if (~var53.field4911 == ~var56) {
                                                var58 = var53.field4916;
                                            }
                                            if (~var56 == -5) {
                                                var57 = 59;
                                            }
                                            if (~var53.field4913 == ~var56) {
                                                var58 = var53.field4927;
                                            }
                                            ++class145.field2065;
                                            class66.method514(var26.field2322, var26.field2324, var57, "<col=ff9040>" + var53.field4938, (byte) -16, var58, (long) var52.field5569, var55[var56]);
                                        }
                                    }
                                    class66.method514(var26.field2322, var26.field2324, 1004, "<col=ff9040>" + var53.field4938, (byte) -16, class160.field2241, (long) var52.field5569, class218.field3019.method2763(-106, class210.field2935));
                                    ++class112.field1631;
                                }
                            }
                        }
                    }
                    if (var26.field2332 instanceof class193) {
                        class193 var59 = (class193) var26.field2332;
                        class64 var60 = class375.method2395((byte) 41, var59.method689((byte) -83));
                        if (var60.field908 != null) {
                            var60 = var60.method491((byte) -66);
                        }
                        if (var60 != null) {
                            if (class327.field4511) {
                                class116 var61 = class192.field2650 == -1 ? null : class44.method396((byte) 123, class192.field2650);
                                if ((4 & class319.field4354) != 0 && (var61 == null || ~var60.method496(0, var61.field1668, class192.field2650) != ~var61.field1668)) {
                                    class66.method514(var26.field2322, var26.field2324, 17, class416.field5913 + " -> <col=00ffff>" + var60.field879, (byte) -16, class92.field1289, class242.method1639(-388247648, var26.field2324, var26.field2322, var59), class249.field3519);
                                    ++class327.field4502;
                                }
                            } else {
                                String[] var62 = var60.field890;
                                if (var62 != null) {
                                    for (int var63 = 4; ~var63 <= -1; --var63) {
                                        if (var62[var63] != null) {
                                            short var64 = 0;
                                            int var65 = class341.field4666;
                                            if (var63 == 0) {
                                                var64 = 44;
                                            }
                                            if (~var63 == -2) {
                                                var64 = 12;
                                            }
                                            if (~var63 == -3) {
                                                var64 = 10;
                                            }
                                            if (var63 == 3) {
                                                var64 = 49;
                                            }
                                            if (~var60.field894 == ~var63) {
                                                var65 = var60.field901;
                                            }
                                            if (var63 == 4) {
                                                var64 = 1011;
                                            }
                                            if (var60.field884 == var63) {
                                                var65 = var60.field924;
                                            }
                                            ++class397.field5685;
                                            class66.method514(var26.field2322, var26.field2324, var64, "<col=00ffff>" + var60.field879, (byte) -16, var65, class242.method1639(-388247648, var26.field2324, var26.field2322, var59), var62[var63]);
                                        }
                                    }
                                }
                                class66.method514(var26.field2322, var26.field2324, 1003, "<col=00ffff>" + var60.field879, (byte) -16, class160.field2241, (long) var60.field916, class218.field3019.method2763(126, class210.field2935));
                                ++class145.field2066;
                            }
                        }
                    }
                }
            }
            int var27 = 98 % ((arg3 - 85) / 36);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([[[BIIIIIILuo;IIBII)V")
    public static final void method708(byte[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class345 arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        ++field1352;
        if (arg11 != 0 && arg12 != 0) {
            if (~arg11 == -10) {
                arg11 = 1;
                arg2 = arg2 + 1 & 3;
            }
            if (~arg11 == -11) {
                arg2 = 3 & arg2 + 3;
                arg11 = 1;
            }
            if (arg11 == 11) {
                arg11 = 8;
                arg2 = arg2 + 3 & 3;
            }
            arg7.method116(arg6, arg4, arg1, arg9, arg3, arg5, arg0[arg11 + -1][arg2], arg12, arg8);
            if (arg10 > -101) {
                method708((byte[][][]) null, -14, 7, -109, 50, 34, -30, (class345) null, -33, -107, (byte) 75, -83, -106);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1359 = null;
        field1354 = null;
        if (arg0 != 13406) {
            field1354 = null;
        }
        field1358 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1357;
        if (class16.method238(arg0, 21)) {
            class280.method1828(arg5, false, arg2, class143.field2057[arg0], arg6, arg3, arg7, arg1, arg8, arg4);
        } else if (~arg5 != 0) {
            class377.field5395[arg5] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class377.field5395[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field1353;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            this.method29(false, 83);
        }
        if (super.field263.field1845) {
            class36.method346(var3, 0, class269.field3751, class277.field3873[arg1]);
        }
        return var3;
    }
}
