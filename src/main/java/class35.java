import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class35 extends class36 {

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "Lik;")
    private class17 field403;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[Lpn;")
    public static class170[] field406;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 12)
    public static void method193(int arg0) {
        if (arg0 != 5164) {
            field406 = (class170[]) null;
        }
        field406 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 22)
    public final String method194(int arg0, String arg1, int arg2) {
        field409++;
        if (this.field403 == null) {
            return arg1;
        }
        if (arg2 > -81) {
            this.field403 = (class17) null;
        }
        class213 var4 = (class213) this.field403.method111(-111, (long) arg0);
        return var4 == null ? arg1 : var4.field3074;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIZ)V", line = 43)
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field408++;
        if (class1.field15 == 0) {
            int var7 = class313.field4731;
            int var8 = class185.field2556;
            int var9 = class324.field4913;
            int var10 = (arg1 - arg5) * (var9 - var7) / arg4 + var7;
            int var11 = class99.field1344;
            int var12 = (arg3 - arg2) * (var8 - var11) / arg0 + var11;
            if (class124.field1676 && (class172.field2348 & 0x40) != 0) {
                class344 var13 = class20.method128(126, class52.field697, class219.field3146);
                if (var13 == null) {
                    class173.method1209(!arg6);
                } else {
                    class237.method1632((short) 47, class128.field1753, class282.field4224, var12, 0L, 103, " ->", var10);
                }
            } else {
                if (class39.field448 == 1) {
                    class237.method1632((short) 60, -1, class274.field4107, var12, 0L, -86, "", var10);
                }
                class237.field3359++;
                class237.method1632((short) 43, -1, class7.field70, var12, 0L, -106, "", var10);
            }
        }
        long var14 = -1L;
        if (!arg6) {
            field406 = (class170[]) null;
        }
        for (int var16 = 0; var16 < class188.field2600; var16++) {
            long var17 = class13.field137[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FD9) >> 7;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class154.method1115(class251.field3603, var19, var20, var17)) {
                    class302 var23 = class153.method1106(var22, (byte) -59);
                    if (var23.field4519 != null) {
                        var23 = var23.method2066((byte) -84);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class1.field15 == 1) {
                        class218.field3129++;
                        class237.method1632((short) 58, class166.field2269, class189.field2606, var20, var17, 62, class148.field2052 + " -> <col=00ffff>" + var23.field4534, var19);
                    } else if (class124.field1676) {
                        class115 var28 = class273.field4091 == -1 ? null : class323.method2268(class273.field4091, (byte) -127);
                        if ((class172.field2348 & 0x4) != 0 && (var28 == null || var23.method2061(class273.field4091, -11088, var28.field1567) != var28.field1567)) {
                            class164.field2256++;
                            class237.method1632((short) 42, class128.field1753, class282.field4224, var20, var17, 123, class266.field3880 + " -> <col=00ffff>" + var23.field4534, var19);
                        }
                    } else {
                        class97.field1308++;
                        String[] var24 = var23.field4514;
                        if (class301.field4466) {
                            var24 = class1.method1(var24, true);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class33.field397++;
                                    int var26 = -1;
                                    short var27 = 0;
                                    if (var23.field4533 == var25) {
                                        var26 = var23.field4543;
                                    }
                                    if (var23.field4489 == var25) {
                                        var26 = var23.field4515;
                                    }
                                    if (var25 == 0) {
                                        var27 = 18;
                                    }
                                    if (var25 == 1) {
                                        var27 = 51;
                                    }
                                    if (var25 == 2) {
                                        var27 = 37;
                                    }
                                    if (var25 == 3) {
                                        var27 = 16;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1006;
                                    }
                                    class237.method1632(var27, var26, var24[var25], var20, var17, -79, "<col=00ffff>" + var23.field4534, var19);
                                }
                            }
                        }
                        class237.method1632((short) 1005, class317.field4837, class330.field4972, var20, (long) var23.field4549, -86, "<col=00ffff>" + var23.field4534, var19);
                    }
                }
                if (var21 == 1) {
                    class329 var29 = class42.field484[var22];
                    if ((var29.field4961.field2424 & 0x1) == 0 && (var29.field3745 & 0x7F) == 0 && (var29.field3679 & 0x7F) == 0 || (var29.field4961.field2424 & 0x1) == 1 && (var29.field3745 & 0x7F) == 64 && (var29.field3679 & 0x7F) == 64) {
                        int var30 = var29.field3745 - ((var29.field4961.field2424 - 1) * 64);
                        int var31 = var29.field3679 - (var29.field4961.field2424 * 64 - 64);
                        for (int var32 = 0; var32 < class338.field5084; var32++) {
                            class329 var33 = class42.field484[class257.field3807[var32]];
                            if (var33 != null && !var33.field3733 && var29 != var33 && var33.field3736) {
                                int var34 = var33.field3679 - ((var33.field4961.field2424 - 1) * 64);
                                int var35 = var33.field3745 - ((var33.field4961.field2424 - 1) * 64);
                                if (var30 <= var35 && var33.field4961.field2424 <= var29.field4961.field2424 - (var35 - var30 >> 7) && var31 <= var34 && (var29.field4961.field2424 - (var34 - var31 >> 7)) >= var33.field4961.field2424) {
                                    class53.method364(var20, (byte) -123, class257.field3807[var32], var33.field4961, var19);
                                    var33.field3733 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class292.field4352; var36++) {
                            class241 var37 = class169.field2306[class4.field35[var36]];
                            if (var37 != null && !var37.field3733 && var37.field3736) {
                                int var38 = var37.field3745 - (var37.method1653(-1) - 1) * 64;
                                int var39 = var37.field3679 - (var37.method1653(-1) * 64 - 64);
                                if (var38 >= var30 && var37.method1653(-1) <= (var29.field4961.field2424 - (var38 - var30 >> 7)) && var31 <= var39 && var37.method1653(-1) <= (var29.field4961.field2424 - (var39 - var31 >> 7))) {
                                    class16.method107(0, var20, var19, class4.field35[var36], var37);
                                    var37.field3733 = true;
                                }
                            }
                        }
                    }
                    if (var29.field3733) {
                        continue;
                    }
                    class53.method364(var20, (byte) 113, var22, var29.field4961, var19);
                    var29.field3733 = true;
                }
                if (var21 == 0) {
                    class241 var40 = class169.field2306[var22];
                    if ((var40.field3745 & 0x7F) == 64 && (var40.field3679 & 0x7F) == 64) {
                        int var41 = var40.field3745 - (var40.method1653(-1) - 1) * 64;
                        int var42 = var40.field3679 - (var40.method1653(-1) - 1) * 64;
                        for (int var43 = 0; var43 < class338.field5084; var43++) {
                            class329 var44 = class42.field484[class257.field3807[var43]];
                            if (var44 != null && !var44.field3733 && var44.field3736) {
                                int var45 = var44.field3679 - ((var44.field4961.field2424 - 1) * 64);
                                int var46 = var44.field3745 + 64 - (var44.field4961.field2424 * 64);
                                if (var46 >= var41 && var44.field4961.field2424 <= (var40.method1653(-1) - (var46 - var41 >> 7)) && var45 >= var42 && var44.field4961.field2424 <= (var40.method1653(-1) - (var45 - var42 >> 7))) {
                                    class53.method364(var20, (byte) 75, class257.field3807[var43], var44.field4961, var19);
                                    var44.field3733 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class292.field4352; var47++) {
                            class241 var48 = class169.field2306[class4.field35[var47]];
                            if (var48 != null && !var48.field3733 && var40 != var48 && var48.field3736) {
                                int var49 = var48.field3745 - (var48.method1653(-1) - 1) * 64;
                                int var50 = var48.field3679 - (var48.method1653(-1) * 64 - 64);
                                if (var49 >= var41 && var48.method1653(-1) <= var40.method1653(-1) - (var49 - var41 >> 7) && var42 <= var50 && var48.method1653(-1) <= var40.method1653(-1) - (var50 - var42 >> 7)) {
                                    class16.method107(0, var20, var19, class4.field35[var47], var48);
                                    var48.field3733 = true;
                                }
                            }
                        }
                    }
                    if (var40.field3733) {
                        continue;
                    }
                    class16.method107(0, var20, var19, var22, var40);
                    var40.field3733 = true;
                }
                if (var21 == 3) {
                    class192 var51 = class246.field3544[class251.field3603][var19][var20];
                    if (var51 != null) {
                        for (class168 var52 = (class168) var51.method1338(-1); var52 != null; var52 = (class168) var51.method1348(-44)) {
                            int var53 = var52.field2288.field3227;
                            class198 var54 = class115.method854((byte) 46, var53);
                            if (class1.field15 == 1) {
                                class226.field3236++;
                                class237.method1632((short) 39, class166.field2269, class189.field2606, var20, (long) var53, 66, class148.field2052 + " -> <col=ff9040>" + var54.field2757, var19);
                            } else if (class124.field1676) {
                                class115 var55 = class273.field4091 == -1 ? null : class323.method2268(class273.field4091, (byte) 45);
                                if ((class172.field2348 & 0x1) != 0 && (var55 == null || var54.method1402(arg6, var55.field1567, class273.field4091) != var55.field1567)) {
                                    class279.field4187++;
                                    class237.method1632((short) 32, class128.field1753, class282.field4224, var20, (long) var53, 105, class266.field3880 + " -> <col=ff9040>" + var54.field2757, var19);
                                }
                            } else {
                                class30.field372++;
                                String[] var56 = var54.field2813;
                                if (class301.field4466) {
                                    var56 = class1.method1(var56, true);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class189.field2608++;
                                        byte var58 = 0;
                                        int var59 = -1;
                                        if (var57 == 0) {
                                            var58 = 38;
                                        }
                                        if (var57 == 1) {
                                            var58 = 59;
                                        }
                                        if (var57 == 2) {
                                            var58 = 40;
                                        }
                                        if (var54.field2798 == var57) {
                                            var59 = var54.field2791;
                                        }
                                        if (var54.field2775 == var57) {
                                            var59 = var54.field2796;
                                        }
                                        if (var57 == 3) {
                                            var58 = 6;
                                        }
                                        if (var57 == 4) {
                                            var58 = 30;
                                        }
                                        class237.method1632(var58, var59, var56[var57], var20, (long) var53, 72, "<col=ff9040>" + var54.field2757, var19);
                                    }
                                }
                                class237.method1632((short) 1001, class317.field4837, class330.field4972, var20, (long) var53, 65, "<col=ff9040>" + var54.field2757, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILcg;)V", line = 444)
    private final void method196(int arg0, int arg1, class316 arg2) {
        field404++;
        if (arg0 == 249) {
            int var4 = arg2.method2219(16448);
            if (this.field403 == null) {
                int var5 = class110.method804(var4, (byte) 72);
                this.field403 = new class17(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method2219(16448) == 1;
                int var8 = arg2.method2210((byte) -5);
                class183 var9;
                if (var7) {
                    var9 = new class213(arg2.method2158(-872702056));
                } else {
                    var9 = new class336(arg2.method2172((byte) 71));
                }
                this.field403.method120((long) var8, var9, -22851);
            }
        }
        if (arg1 < 78) {
            method202(-9);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V", line = 489)
    public static final void method197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class90.field1264.field4777 = 0;
        field410++;
        class90.field1264.method2184((byte) 89, 20);
        class90.field1264.method2184((byte) 89, arg0);
        class90.field1264.method2184((byte) 89, arg4);
        class90.field1264.method2189(-1, arg3);
        class90.field1264.method2189(-1, arg1);
        class243.field3485 = -3;
        class275.field4128 = arg2;
        class174.field2375 = 0;
        class63.field817 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 509)
    public static final void method198(boolean arg0) {
        if (arg0) {
            class142.field1940 = class113.field1545;
            class333.field5020 = class143.field1967;
            class278.field4175 = class288.field4283;
        } else {
            class142.field1940 = class251.field3605;
            class333.field5020 = class269.field3994;
            class278.field4175 = class125.field1693;
        }
        class313.field4724 = class142.field1940.length;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lcg;Z)V", line = 538)
    public final void method199(class316 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2219(16448);
            if (var3 == 0) {
                if (!arg1) {
                    return;
                }
                field405++;
                return;
            }
            this.method196(var3, 84, arg0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BII)I", line = 557)
    public final int method200(byte arg0, int arg1, int arg2) {
        field411++;
        if (this.field403 == null) {
            return arg1;
        }
        class336 var4 = (class336) this.field403.method111(-107, (long) arg2);
        if (arg0 < 31) {
            return 56;
        } else if (var4 == null) {
            return arg1;
        } else {
            return var4.field5063;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILcg;)Lij;", line = 578)
    public static final class68 method201(int arg0, class316 arg1) {
        if (arg0 != 0) {
            method195(34, -59, -88, 72, -122, -85, false);
        }
        field407++;
        return new class68(arg1.method2161(28984), arg1.method2161(arg0 ^ 0x7138), arg1.method2161(arg0 ^ 0x7138), arg1.method2161(28984), arg1.method2210((byte) -5), arg1.method2210((byte) -5), arg1.method2219(16448));
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V", line = 590)
    public static final void method202(int arg0) {
        field402++;
        if (!class154.method1113(-101) && class270.field4028 != class251.field3603) {
            class85.method661(class237.field3368, 13184, false, false, class173.field2356.field3768[0], class251.field3603, class173.field2356.field3706[0], class320.field4877);
            return;
        }
        if (class336.field5060 != class251.field3603 && class192.method1337(arg0 + 17890, class251.field3603)) {
            class336.field5060 = class251.field3603;
            class312.method2135(false);
        }
        if (arg0 != -17890) {
            method202(-63);
        }
    }
}
