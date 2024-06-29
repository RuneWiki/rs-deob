import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class505 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7324 = new String[] { method3811(method3810("Z\u0019r\u0016")), method3811(method3810("OB0Tm")), method3811(method3810("Q\u0019088")), method3811(method3810("Q\u00190FyZ\u0005jD8")), method3811(method3810("Q\u00190\u000e\u007fg\u0018l\u0013~SD")), method3811(method3810("Q\u00190;8")), method3811(method3810("Q\u0019098")), method3811(method3810("Q\u00190>8")) };

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Lwia;")
    public static class790 field7321 = new class790(47, -1);

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILka;III)Lcca;")
    public static final class260 method3806(int arg0, class497 arg1, int arg2, int arg3, int arg4) {
        try {
            int var5 = 115 / ((85 - arg0) / 33);
            field7320++;
            return arg1 == null ? null : new class260(arg3, arg2, arg4, arg1.method313(), arg1.method335(), arg1.method341(), arg1.method305(), arg1.method306(), arg1.method340(), arg1.method336());
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field7324[2] + arg0 + ',' + (arg1 == null ? field7324[0] : field7324[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([IIIZ[IIIIIIIZ[I[IIB[I[[[B)V")
    public static final void method3807(int[] arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int[] arg12, int[] arg13, int arg14, byte arg15, int[] arg16, byte[][][] arg17) {
        try {
            field7319++;
            if (class166.field2283 != -1) {
                int[] var18 = class301.field4720.method548();
                int var19 = var18[arg10];
                int var20 = var18[1];
                int var21 = var18[2];
                int var22 = var18[3];
                int var23 = var21;
                int var24 = var22;
                if (class166.field2283 == 1) {
                    var23 = (int) ((double) class3.field31 * (double) var21 / (double) class69.field742);
                    var24 = (int) ((double) class3.field31 * (double) var22 / (double) class69.field742);
                }
                if (!class222.field3412) {
                    if (class166.field2283 == 1) {
                        class87.method734(126);
                    }
                    int var25 = arg14 - class433.field6367;
                    int var26 = arg1 - class474.field6874;
                    int var27 = arg8 - class653.field9444;
                    int var28 = (int) (((double) var27 * class265.field4050 + (double) var25 * class369.field5634 + (double) var26 * class11.field136) * (double) var23 / (double) arg7);
                    int var29 = (int) (((double) var27 * class178.field2485 + (double) var25 * class605.field8865 + (double) var26 * class671.field9752) * (double) var24 / (double) arg7);
                    double var30 = (double) var27 * class290.field4309 + (double) var25 * class382.field5793 + (double) var26 * class463.field6743;
                    int var32 = class555.field8287 + var28 - class320.field5064;
                    int var33 = class741.field10765 + var29 - class416.field6132;
                    int var34 = class757.field10994 + var32;
                    int var35 = class3.field31 + var33;
                    if (!(var32 < 0 || var33 < 0 || var34 > class57.field613 || var35 > class69.field742) || class166.field2283 == 2) {
                        class738.field10736 = var33;
                        class370.field5643 = var32;
                        if (class166.field2283 == 2) {
                            class708.field10261 = -var30;
                        }
                    } else if (var34 > 0 && var35 > 0 && class57.field613 > var32 && class69.field742 > var33) {
                        int var36 = var32 - class555.field8287;
                        int var37 = var33 - class741.field10765;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (class166.field2283 == 0) {
                            var42 = class708.field10261 + var30;
                            var38 = var36;
                            var39 = var37;
                        } else if (class166.field2283 == 1) {
                            var40 = var36 / class283.field4239;
                            var41 = var37 / class335.field5236;
                            var39 = class335.field5236 * var41;
                            var38 = class283.field4239 * var40;
                            var42 = (class708.field10261 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51 = 0;
                        int var52;
                        int var53;
                        int var54;
                        int var55;
                        if (var38 >= 0) {
                            var52 = 0;
                            var53 = class57.field613 - var38;
                            var54 = var53;
                            if (class166.field2283 == 1) {
                                var48 = class187.field2571 - var40;
                                var50 = var40;
                            }
                            var55 = var38;
                        } else {
                            var52 = -var38;
                            var54 = 0;
                            var53 = class57.field613 + var38;
                            if (class166.field2283 == 1) {
                                var50 = -var40;
                                var48 = 0;
                            }
                            var55 = var52;
                        }
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 < 0) {
                            var56 = -var39;
                            var57 = class69.field742 + var39;
                            var58 = 0;
                            var59 = var56;
                            if (class166.field2283 == 1) {
                                var47 = -var41;
                                var46 = 0;
                                var49 = var47;
                                var51 = class601.field8825 + var41;
                            }
                            var60 = var56;
                            var61 = var57;
                        } else {
                            var57 = class69.field742 - var39;
                            var56 = 0;
                            var59 = var39;
                            if (class166.field2283 == 1) {
                                var49 = 0;
                                var46 = class601.field8825 - var41;
                                var47 = var41;
                                var51 = var46;
                            }
                            var60 = 0;
                            var61 = var57;
                            var58 = var57;
                        }
                        class614 var62 = class84.field936.field3269;
                        for (class310 var63 = (class310) var62.method4538(false); var63 != null; var63 = (class310) var62.method4543(arg10)) {
                            class359[] var64 = var63.field4918;
                            boolean var65 = true;
                            for (int var66 = 0; var66 < var64.length; var66++) {
                                class359 var67 = var64[var66];
                                int var68 = var67.field5494;
                                int var69 = var67.field5493;
                                int var70 = var67.field5496;
                                int var71 = var67.field5497;
                                int var72;
                                var67.field5496 = var72 = var70 - var38;
                                int var73;
                                var67.field5494 = var73 = var68 - var38;
                                int var74 = var67.field5495;
                                int var75;
                                var67.field5497 = var75 = var71 - var39;
                                int var76;
                                var67.field5493 = var76 = var69 - var39;
                                if (var65) {
                                    int var77 = (var73 >= var72 ? var72 : var73) - var74;
                                    if (var77 <= class57.field613) {
                                        int var78 = (var75 > var76 ? var76 : var75) - var74;
                                        if (class69.field742 >= var78) {
                                            int var79 = (var72 <= var73 ? var73 : var72) + var74;
                                            if (var79 >= 0) {
                                                int var80 = var74 + (var75 <= var76 ? var76 : var75);
                                                if (var80 >= 0) {
                                                    var65 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var65) {
                                var63.method4696(-114);
                                class79.method692(var63, 0);
                            }
                        }
                        if (class166.field2283 == 0) {
                            class301.field4720.method592(class730.field10602);
                        }
                        class301.field4720.method549(-var38, -var39);
                        class301.field4720.method582(var52, var56, var53, var57, var44);
                        class687.method5038(255, class708.field10261 + var44);
                        class26.field311 = class708.field10261 + var44;
                        if (class166.field2283 == 1) {
                            class9.field95 = var20 - var39 - class416.field6132;
                            class190.field2582 = var23;
                            class743.field10818 = var19 - class320.field5064 - var38;
                            class517.field7483 = var24;
                            class301.field4720.method479(class743.field10818, class9.field95, class190.field2582, class517.field7483);
                        } else {
                            class517.field7483 = var24;
                            class190.field2582 = var23;
                            class9.field95 = class741.field10765 + var20 - (class416.field6132 + var39);
                            class743.field10818 = class555.field8287 + var19 - (class320.field5064 - -var38);
                            class301.field4720.method479(class743.field10818, class9.field95, class190.field2582, class517.field7483);
                        }
                        class289.method2347(class84.field936);
                        if (var59 > 0) {
                            class301.field4720.method489(0, var58, class57.field613, var58 + var59);
                            class301.field4720.method586();
                            class301.field4720.method483(class28.field347);
                            class478.method3660(arg9, arg14, arg1, arg8, arg17, arg12, arg4, arg0, arg16, arg13, arg5, arg15, arg6, arg2, arg3, arg11, arg7, 1, false);
                        }
                        if (var55 > 0) {
                            class301.field4720.method489(var54, var60, var54 + var55, var60 + var61);
                            class301.field4720.method586();
                            class301.field4720.method483(class28.field347);
                            class478.method3660(arg9, arg14, arg1, arg8, arg17, arg12, arg4, arg0, arg16, arg13, arg5, arg15, arg6, arg2, arg3, arg11, arg7, 1, false);
                        }
                        class301.field4720.method553();
                        class130.method1129();
                        if (class166.field2283 == 0) {
                            class301.field4720.method501();
                        }
                        class320.field5064 += var38;
                        class416.field6132 += var39;
                        class708.field10261 += var44;
                        class738.field10736 = class741.field10765 + var29 - class416.field6132;
                        class370.field5643 = class555.field8287 + var28 - class320.field5064;
                        if (class166.field2283 == 1) {
                            class548.field8188 += var41;
                            class772.field11216 += var40;
                            for (int var81 = 0; var81 < class601.field8825; var81++) {
                                int var82 = class192.method1647(class601.field8825, class548.field8188 + var81, (byte) 123) * class187.field2571;
                                for (int var83 = 0; var83 < class187.field2571; var83++) {
                                    int var84 = var82 + class192.method1647(class187.field2571, var83 + class772.field11216, (byte) 127);
                                    boolean var85 = var46 <= var81 && var46 + var47 > var81 || var81 >= var49 && var49 + var51 > var81 && var83 >= var48 && var83 < var48 + var50;
                                    class792.field11524[var84].method709(class283.field4239 * var83, class335.field5236 * var81, class283.field4239, class335.field5236, 0, 0, var85, true);
                                }
                            }
                        }
                    } else {
                        class222.field3412 = true;
                    }
                }
                if (class222.field3412) {
                    class416.field6132 = 0;
                    class474.field6874 = arg1;
                    class653.field9444 = arg8;
                    class433.field6367 = arg14;
                    class708.field10261 = 0.0D;
                    class320.field5064 = 0;
                    class738.field10736 = class741.field10765;
                    class370.field5643 = class555.field8287;
                    if (class166.field2283 == 0) {
                        class301.field4720.method592(class730.field10602);
                    }
                    class301.field4720.method553();
                    class301.field4720.method586();
                    class301.field4720.method483(class28.field347);
                    class80.field901.method2365(class433.field6367, class474.field6874, class653.field9444, class647.field9367, class202.field3150, class204.field3165);
                    class301.field4720.method495(class80.field901);
                    if (class166.field2283 == 1) {
                        class190.field2582 = var23;
                        class743.field10818 = var19;
                        class9.field95 = var20;
                        class517.field7483 = var24;
                        class301.field4720.method479(class743.field10818, class9.field95, class190.field2582, class517.field7483);
                    } else {
                        class743.field10818 = class555.field8287 + var19;
                        class9.field95 = class741.field10765 + var20;
                        class517.field7483 = var24;
                        class190.field2582 = var23;
                        class301.field4720.method479(class743.field10818, class9.field95, class190.field2582, class517.field7483);
                    }
                    class26.field311 = 0.0D;
                    class84.field936.method1874(27105);
                    class289.method2347(class84.field936);
                    class478.method3660(arg9, arg14, arg1, arg8, arg17, arg12, arg4, arg0, arg16, arg13, arg5, arg15, arg6, arg2, arg3, arg11, arg7, 1, false);
                    class130.method1129();
                    class222.field3412 = false;
                    if (class166.field2283 == 0) {
                        class301.field4720.method501();
                    }
                    if (class166.field2283 == 1) {
                        class281.method2305(arg10 - 11);
                    }
                }
                if (class166.field2283 == 0) {
                    class730.field10602.method708(class370.field5643, class738.field10736, class757.field10994, class3.field31, 0, 0, true, true);
                }
                class702.field10205++;
                class687.method5038(255, class708.field10261);
                class388.field5856 = class708.field10261;
                if (class166.field2283 == 0 || class166.field2283 == 2) {
                    if (class166.field2283 == 2) {
                        class301.field4720.method483(class28.field347);
                        class301.field4720.method586();
                    }
                    class678.field9843 = var19 - (class320.field5064 - class555.field8287) - class370.field5643;
                    class589.field8663 = var24;
                    class642.field9305 = var23;
                    class14.field176 = class741.field10765 + var20 - class416.field6132 - class738.field10736;
                    class301.field4720.method479(class678.field9843, class14.field176, class642.field9305, class589.field8663);
                } else if (class166.field2283 == 1) {
                    class642.field9305 = var23;
                    class14.field176 = var20 - class416.field6132;
                    class678.field9843 = var19 - class320.field5064;
                    class589.field8663 = var24;
                    class301.field4720.method479(class678.field9843, class14.field176, class642.field9305, class589.field8663);
                    class301.field4720.method489(class370.field5643, class738.field10736, class757.field10994 + class370.field5643, class738.field10736 + class3.field31);
                }
                class478.method3660(arg9, arg14, arg1, arg8, arg17, arg12, arg4, arg0, arg16, arg13, arg5, arg15, arg6, arg2, arg3, arg11, arg7, class166.field2283 == 2 ? 0 : 2, class166.field2283 == 1);
                class301.field4720.method553();
                class301.field4720.method479(var19, var20, var21, var22);
            }
        } catch (RuntimeException var87) {
            throw class759.method5498(var87, field7324[5] + (arg0 == null ? field7324[0] : field7324[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7324[0] : field7324[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 == null ? field7324[0] : field7324[1]) + ',' + (arg13 == null ? field7324[0] : field7324[1]) + ',' + arg14 + ',' + arg15 + ',' + (arg16 == null ? field7324[0] : field7324[1]) + ',' + (arg17 == null ? field7324[0] : field7324[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field7322++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7324[4] + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method3808(byte arg0) {
        try {
            if (arg0 <= 56) {
                method3809(-5, null, -43, -94);
            }
            field7321 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7324[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILnda;II)J")
    public static final long method3809(int arg0, class583 arg1, int arg2, int arg3) {
        try {
            field7323++;
            if (arg0 > -94) {
                field7321 = null;
            }
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class198 var8 = class417.field6144.method3030(0, arg1.method1083((byte) 109));
            long var9 = (long) (arg1.method1087(18636) << 14 | arg2 << 7 | arg3 | arg1.method1097(false) << 20 | 0x40000000);
            if (var8.field3082 == 0) {
                var9 |= var6;
            }
            if (var8.field3006 == 1) {
                var9 |= var4;
            }
            return var9 | (long) arg1.method1083((byte) -92) << 32;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7324[7] + arg0 + ',' + (arg1 == null ? field7324[0] : field7324[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
    public class505(int arg0) {
        try {
            this.field7318 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7324[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3810(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3811(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
