import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class596 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field8085 = -1;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lmaa;")
    public static class508 field8091 = new class508(4, 5);

    @OriginalMember(owner = "client!g", name = "q", descriptor = "F")
    public static float field8093 = 0.0F;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lcj;")
    public static class445 field8092 = new class445();

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lst;")
    public static class335 field8096 = new class335(45, 6);

    @OriginalMember(owner = "client!g", name = "v", descriptor = "[[Z")
    public static boolean[][] field8098 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!g", name = "u", descriptor = "F")
    public static float field8097;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public int field8077;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field8082;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field8086;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field8090;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Ljg;")
    public static class246 field8095;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3415(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field8078++;
            return class617.method3490(arg1, arg2, 0) | (arg1 & 0x60000) != 0 || class489.method2970(true, arg1, arg2) || class752.method4174(arg2, 87, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method3416(int arg0, int arg1) {
        class401.field5749 = arg0;
        field8079++;
        class34.field446.method3906(-106);
        if (arg1 != -1) {
            method3417(51, null, (byte) 87, -94);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILha;BI)V")
    public static final void method3417(int arg0, class548 arg1, byte arg2, int arg3) {
        field8089++;
        if (arg2 > -19) {
            field8097 = 2.3245509F;
        }
        if (arg0 < 0 || arg3 < 0 || class588.field8015 == 0 || class638.field8565 == 0) {
            return;
        }
        class744 var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        if (class222.field3009) {
            class484.method2948(false, (byte) -66);
            var4 = arg1.method1385();
            int[] var5 = arg1.method1407();
            var6 = var5[3];
            var7 = var5[2];
            var8 = var5[1];
            var9 = var5[0];
            var10 = arg0 + class390.method2452(-1, false);
            var11 = arg3 + class454.method2783(20320, false);
        } else {
            arg1.method1421(class409.field5842, class61.field881, class588.field8015, class638.field8565);
            var6 = class638.field8565;
            var8 = class61.field881;
            var7 = class588.field8015;
            var9 = class409.field5842;
            arg1.method1544(class77.field1117, class550.field7652, class588.field8015, class638.field8565);
            var4 = arg1.method1495();
            var4.method875(class177.field2420, class489.field6851, class40.field499, class235.field3485, class715.field9973, class593.field8041);
            arg1.method1444(var4);
            var11 = arg3;
            var10 = arg0;
        }
        if (var7 == 0) {
            var7 = 1;
        }
        if (var6 == 0) {
            var6 = 1;
        }
        class360.method2296(true, (byte) -115);
        if (class550.field7649 != null && (!class160.field2235 || (class623.field8403 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg1.method1426();
            int var15 = arg1.method1504();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class301.field4261) {
                var19 = var17 = (var11 - var8) * class3.field30 / var6;
                var16 = var18 = (var10 - var9) * class3.field30 / var7;
            } else {
                var16 = (var10 - var9) * var14 / var7;
                var17 = (var11 - var8) * var15 / var6;
                var18 = (var10 - var9) * var15 / var7;
                var19 = (var11 - var8) * var14 / var6;
            }
            int[] var20 = new int[] { var16, var19, var14 };
            var4.method894(var20);
            int[] var21 = new int[] { var18, var17, var15 };
            var4.method894(var21);
            float var22 = class213.method1262((float) var21[2], 4, true, (float) var21[0], (float) var20[0], (float) var20[2], (float) var20[1], (float) var21[1]);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = (class388.field5601.method662((byte) 15) - 1 << 8) + var25 >> 9;
                var13 = (class388.field5601.method662((byte) 15) - 1 << 8) + var26 >> 9;
                byte var27 = class388.field5601.field4408;
                if (var27 < 3 && (class692.field9623[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class160.field2235 && (class623.field8403 & 0x40) != 0) {
                    class755 var28 = class171.method1093((byte) 105, class401.field5748, class442.field6137);
                    if (var28 == null) {
                        class594.method3413((byte) 95);
                    } else {
                        class300.method1979(true, class721.field10028, false, -1, " ->", (long) (var13 | var12 << 0), (byte) 115, true, var13, 0L, var12, 58, class488.field6817);
                    }
                } else {
                    if (class349.field4960) {
                        class300.method1979(true, -1, false, -1, "", (long) (var13 | var12 << 0), (byte) 115, true, var13, 0L, var12, 59, class155.field2146.method978(class120.field1576, (byte) -115));
                    }
                    class300.method1979(true, class549.field7635, false, -1, "", (long) (var13 | var12 << 0), (byte) 115, true, var13, 0L, var12, 8, class195.field2633);
                    class216.field2810++;
                }
            }
        }
        if (class222.field3009) {
            class451.method2761(-91);
        }
        for (int var29 = 0; var29 < (class222.field3009 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class397 var31 = var30 ? class269.field3931 : class72.field1094;
            int var32 = arg0;
            int var33 = arg3;
            if (class222.field3009) {
                class484.method2948(var30, (byte) -123);
                var32 = arg0 + class390.method2452(-1, var30);
                var33 = arg3 + class454.method2783(20320, var30);
            }
            class244 var34 = var31.field5701;
            for (class3 var35 = (class3) var34.method1638(false); var35 != null; var35 = (class3) var34.method1645(0)) {
                if ((class254.field3719 || class388.field5601.field4408 == var35.field21.field4408) && var35.method15(var32, arg1, (byte) -94, var33)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field21 instanceof class395)) {
                        var39 = ((class395) var35.field21).field5680;
                        var38 = ((class395) var35.field21).field5673;
                    } else {
                        var38 = var35.field21.field4418 >> 9;
                        var39 = var35.field21.field4410 >> 9;
                    }
                    if (var35.field21 instanceof class96) {
                        class96 var40 = (class96) var35.field21;
                        int var41 = var40.method662((byte) 15);
                        if ((var41 & 0x1) == 0 && (var40.field4410 & 0x1FF) == 0 && (var40.field4418 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field4410 & 0x1FF) == 256 && (var40.field4418 & 0x1FF) == 256) {
                            int var42 = var40.field4410 - (var40.method662((byte) 15) - 1 << 8);
                            int var43 = var40.field4418 - (var40.method662((byte) 15) - 1 << 8);
                            for (int var44 = 0; var44 < class262.field3837; var44++) {
                                class234 var51 = (class234) class372.field5245.method812(115, (long) class446.field6192[var44]);
                                if (var51 != null) {
                                    class679 var52 = var51.field3471;
                                    if (class483.field6741 != var52.field7149 && var52.field7134) {
                                        int var53 = var52.field4410 - (var52.field9436.field1656 - 1 << 8);
                                        int var54 = var52.field4418 - (var52.field9436.field1656 - 1 << 8);
                                        if (var42 <= var53 && var52.field9436.field1656 <= (var40.method662((byte) 15) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field9436.field1656 <= var40.method662((byte) 15) - (var54 - var43 >> 9)) {
                                            class235.method1565(class388.field5601.field4408 != var35.field21.field4408, -24434, var52);
                                            var52.field7149 = class483.field6741;
                                        }
                                    }
                                }
                            }
                            int var45 = class209.field2736;
                            int[] var46 = class344.field4898;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class96 var48 = class251.field3675[var46[var47]];
                                if (var48 != null && class483.field6741 != var48.field7149 && var40 != var48 && var48.field7134) {
                                    int var49 = var48.field4410 - (var48.method662((byte) 15) - 1 << 8);
                                    int var50 = var48.field4418 - (var48.method662((byte) 15) - 1 << 8);
                                    if (var42 <= var49 && var48.method662((byte) 15) <= var40.method662((byte) 15) - (var49 - var42 >> 9) && var50 >= var43 && var48.method662((byte) 15) <= var40.method662((byte) 15) - (var50 - var43 >> 9)) {
                                        class18.method89(class388.field5601.field4408 != var35.field21.field4408, 24897, var48);
                                        var48.field7149 = class483.field6741;
                                    }
                                }
                            }
                        }
                        if (class483.field6741 == var40.field7149) {
                            continue;
                        }
                        class18.method89(class388.field5601.field4408 != var35.field21.field4408, 24897, var40);
                        var40.field7149 = class483.field6741;
                    }
                    if (var35.field21 instanceof class679) {
                        class679 var55 = (class679) var35.field21;
                        if (var55.field9436 != null) {
                            if ((var55.field9436.field1656 & 0x1) == 0 && (var55.field4410 & 0x1FF) == 0 && (var55.field4418 & 0x1FF) == 0 || (var55.field9436.field1656 & 0x1) == 1 && (var55.field4410 & 0x1FF) == 256 && (var55.field4418 & 0x1FF) == 256) {
                                int var56 = var55.field4410 - (var55.field9436.field1656 - 1 << 8);
                                int var57 = var55.field4418 - (var55.field9436.field1656 - 1 << 8);
                                for (int var58 = 0; var58 < class262.field3837; var58++) {
                                    class234 var65 = (class234) class372.field5245.method812(115, (long) class446.field6192[var58]);
                                    if (var65 != null) {
                                        class679 var66 = var65.field3471;
                                        if (class483.field6741 != var66.field7149 && var55 != var66 && var66.field7134) {
                                            int var67 = var66.field4410 - (var66.field9436.field1656 - 1 << 8);
                                            int var68 = var66.field4418 - (var66.field9436.field1656 - 1 << 8);
                                            if (var67 >= var56 && var66.field9436.field1656 <= (var55.field9436.field1656 - (var67 - var56 >> 9)) && var57 <= var68 && var66.field9436.field1656 <= var55.field9436.field1656 - (var68 - var57 >> 9)) {
                                                class235.method1565(class388.field5601.field4408 != var35.field21.field4408, -24434, var66);
                                                var66.field7149 = class483.field6741;
                                            }
                                        }
                                    }
                                }
                                int var59 = class209.field2736;
                                int[] var60 = class344.field4898;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class96 var62 = class251.field3675[var60[var61]];
                                    if (var62 != null && class483.field6741 != var62.field7149 && var62.field7134) {
                                        int var63 = var62.field4410 - (var62.method662((byte) 15) - 1 << 8);
                                        int var64 = var62.field4418 - (var62.method662((byte) 15) - 1 << 8);
                                        if (var63 >= var56 && var62.method662((byte) 15) <= (var55.field9436.field1656 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method662((byte) 15) <= (var55.field9436.field1656 - (var64 - var57 >> 9))) {
                                            class18.method89(class388.field5601.field4408 != var35.field21.field4408, 24897, var62);
                                            var62.field7149 = class483.field6741;
                                        }
                                    }
                                }
                            }
                            if (class483.field6741 == var55.field7149) {
                                continue;
                            }
                            class235.method1565(class388.field5601.field4408 != var35.field21.field4408, -24434, var55);
                            var55.field7149 = class483.field6741;
                        }
                    }
                    if (var35.field21 instanceof class394) {
                        int var69 = class113.field1509 + var39;
                        int var70 = var38 + class587.field7995;
                        class662 var71 = (class662) class541.field7521.method812(123, (long) (var69 | var35.field21.field4408 << 28 | var70 << 14));
                        if (var71 != null) {
                            int var72 = 0;
                            for (class520 var73 = (class520) var71.field8785.method3617((byte) 95); var73 != null; var73 = (class520) var71.field8785.method3620(false)) {
                                class671 var74 = class291.field4179.method1313(var73.field7246, true);
                                if (class160.field2235 && class388.field5601.field4408 == var35.field21.field4408) {
                                    class648 var75 = class41.field505 == -1 ? null : class360.field5161.method2279(-112, class41.field505);
                                    if ((class623.field8403 & 0x1) != 0 && (var75 == null || var74.method3783(0, var75.field8689, class41.field505) != var75.field8689)) {
                                        class300.method1979(true, class721.field10028, false, -1, class468.field6500 + " -> <col=ff9040>" + var74.field9281, (long) var72, (byte) 115, false, var38, (long) var73.field7246, var39, 46, class488.field6817);
                                        class273.field3957++;
                                    }
                                }
                                if (class388.field5601.field4408 == var35.field21.field4408) {
                                    String[] var76 = var74.field9280;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 12;
                                            }
                                            int var79 = class42.field520;
                                            if (var77 == 1) {
                                                var78 = 47;
                                            }
                                            if (var77 == 2) {
                                                var78 = 6;
                                            }
                                            if (var77 == 3) {
                                                var78 = 25;
                                            }
                                            if (var74.field9285 == var77) {
                                                var79 = var74.field9335;
                                            }
                                            if (var77 == 4) {
                                                var78 = 49;
                                            }
                                            if (var74.field9288 == var77) {
                                                var79 = var74.field9331;
                                            }
                                            class267.field3905++;
                                            class300.method1979(true, var79, false, -1, "<col=ff9040>" + var74.field9281, (long) var72, (byte) 115, false, var38, (long) var73.field7246, var39, var78, var76[var77]);
                                        }
                                    }
                                }
                                class300.method1979(true, class323.field4473, class388.field5601.field4408 != var35.field21.field4408, -1, "<col=ff9040>" + var74.field9281, (long) var72, (byte) 115, false, var38, (long) var73.field7246, var39, 1003, class155.field2141.method978(class120.field1576, (byte) -110));
                                class335.field4718++;
                                var72++;
                            }
                        }
                    }
                    if (var35.field21 instanceof class722) {
                        class722 var80 = (class722) var35.field21;
                        class220 var81 = class20.field192.method716(6, var80.method782((byte) -62));
                        if (var81.field2966 != null) {
                            var81 = var81.method1297(class124.field1712, 21559);
                        }
                        if (var81 != null) {
                            if (class160.field2235 && class388.field5601.field4408 == var35.field21.field4408) {
                                class648 var82 = class41.field505 == -1 ? null : class360.field5161.method2279(-100, class41.field505);
                                if ((class623.field8403 & 0x4) != 0 && (var82 == null || var81.method1301(var82.field8689, (byte) 84, class41.field505) != var82.field8689)) {
                                    class758.field10572++;
                                    class300.method1979(true, class721.field10028, false, -1, class468.field6500 + " -> <col=00ffff>" + var81.field2912, (long) var80.hashCode(), (byte) 115, false, var38, class181.method1142((byte) -73, var39, var38, var80), var39, 20, class488.field6817);
                                }
                            }
                            if (class388.field5601.field4408 == var35.field21.field4408) {
                                String[] var83 = var81.field2942;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            int var86 = class42.field520;
                                            if (var84 == 0) {
                                                var85 = 23;
                                            }
                                            if (var84 == 1) {
                                                var85 = 19;
                                            }
                                            if (var84 == 2) {
                                                var85 = 16;
                                            }
                                            if (var84 == 3) {
                                                var85 = 57;
                                            }
                                            if (var81.field2903 == var84) {
                                                var86 = var81.field2891;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1001;
                                            }
                                            if (var81.field2965 == var84) {
                                                var86 = var81.field2893;
                                            }
                                            class300.method1979(true, var86, false, -1, "<col=00ffff>" + var81.field2912, (long) var80.hashCode(), (byte) 115, false, var38, class181.method1142((byte) -121, var39, var38, var80), var39, var85, var83[var84]);
                                            class349.field4957++;
                                        }
                                    }
                                }
                                class497.field6957++;
                                class300.method1979(true, class323.field4473, class388.field5601.field4408 != var35.field21.field4408, -1, "<col=00ffff>" + var81.field2912, (long) var80.hashCode(), (byte) 115, false, var38, (long) var81.field2964, var39, 1009, class155.field2141.method978(class120.field1576, (byte) -123));
                            }
                        }
                    }
                }
            }
            if (class222.field3009) {
                class451.method2761(-40);
            }
        }
        class360.method2296(false, (byte) -77);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8087++;
        if (arg1 != 2) {
            return;
        }
        if (class607.field8185 <= arg4 && arg2 <= class726.field10064 && arg0 >= class291.field4181 && arg7 <= class262.field3848) {
            class397.method2476(arg0, true, arg6, arg2, arg5, arg4, arg7, arg3);
        } else {
            class400.method2489(arg4, arg3, arg2, arg6, arg7, arg0, arg5, 94);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ld;Luu;I)V")
    public static final void method3419(class270 arg0, class237 arg1, int arg2) {
        class391.field5627 = arg0;
        class102.field1405 = arg1;
        field8084++;
        if (arg2 != 4) {
            method3415(true, -6, 63);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method3420(int arg0) {
        field8091 = null;
        if (arg0 != -1) {
            method3417(124, null, (byte) 9, -128);
        }
        field8092 = null;
        field8095 = null;
        field8098 = null;
        field8096 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static final void method3421(byte arg0) {
        class517.field7217 = 0;
        class172.field2389 = 0;
        field8094++;
        for (int var1 = 0; var1 < class17.field172; var1++) {
            int var2 = class557.field7745 * var1;
            for (int var3 = 0; var3 < class557.field7745; var3++) {
                int var4 = var2 + var3;
                class634.field8539[var4].method26(class494.field6919 * var3, class319.field4441 * var1, class494.field6919, class319.field4441, 0, 0, true, true);
            }
        }
        if (arg0 > -30) {
            method3420(53);
        }
    }
}
