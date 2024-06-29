import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 extends class232 {

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "Lia;")
    public class203 field686;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "Lok;")
    public static class146 field690 = class235.method1724(-12908, "_labels");

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Lhd;")
    public static class117 field688 = new class117(64);

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field694 = -1;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "Lok;")
    public static class146 field696 = class235.method1724(-12908, "");

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Lih;")
    public static class30 field695;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "[Lje;")
    public static class70[] field691;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "[[[S")
    public static short[][][] field693;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBIIIII)V", line = 12)
    public static final void method274(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field689++;
        if (class161.field2736 == 0) {
            int var7 = class120.field1970;
            int var8 = class167.field2822;
            int var9 = class137.field2281;
            int var10 = class148.field2512;
            int var11 = (arg6 - arg0) * (var8 - var7) / arg4 + var7;
            int var12 = (arg2 - arg5) * (var10 - var9) / arg3 + var9;
            if (class272.field4668 && (class180.field3023 & 0x40) == 64) {
                class264 var13 = class165.method1289(client.field4081, true, class214.field3535);
                if (var13 == null) {
                    class126.method864(113);
                } else {
                    class281.method2039(var12, 0L, (short) 19, 12241, -1, var11, class32.field617, class135.field2257);
                }
            } else {
                if (class95.field1530 == 1) {
                    class281.method2039(var12, 0L, (short) 5, 12241, -1, var11, class161.field2740, class92.field1484);
                }
                class27.field466++;
                class281.method2039(var12, 0L, (short) 22, 12241, -1, var11, class161.field2740, class197.field3280);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg1 != -41) {
            method275(76);
        }
        while (var16 < class199.field3334) {
            long var17 = class140.field2334[var16];
            int var19 = ((int) var17 & 0x3FF0) >> 7;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label312: {
                    var14 = var17;
                    if (var20 == 2 && class72.method533(class203.field3387, var21, var19, var17)) {
                        class5 var23 = class112.method756((byte) 98, var22);
                        if (var23.field105 != null) {
                            var23 = var23.method36((byte) 83);
                        }
                        if (var23 == null) {
                            break label312;
                        }
                        if (class161.field2736 == 1) {
                            class281.method2039(var19, var17, (short) 1, 12241, class269.field4618, var21, class112.method758(arg1 ^ 0x3E, new class146[] { class281.field4825, class64.field1101, var23.field92 }), class224.field3735);
                            class273.field4692++;
                        } else if (!class272.field4668) {
                            class224.field3745++;
                            class146[] var24 = var23.field58;
                            if (class236.field3939) {
                                var24 = class229.method1683(105, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class74.field1209++;
                                        short var26 = 0;
                                        int var27 = -1;
                                        if (var23.field70 == var25) {
                                            var27 = var23.field73;
                                        }
                                        if (var25 == 0) {
                                            var26 = 24;
                                        }
                                        if (var23.field126 == var25) {
                                            var27 = var23.field53;
                                        }
                                        if (var25 == 1) {
                                            var26 = 28;
                                        }
                                        if (var25 == 2) {
                                            var26 = 50;
                                        }
                                        if (var25 == 3) {
                                            var26 = 58;
                                        }
                                        if (var25 == 4) {
                                            var26 = 1004;
                                        }
                                        class281.method2039(var19, var17, var26, arg1 + 12282, var27, var21, class112.method758(-82, new class146[] { class104.field1691, var23.field92 }), var24[var25]);
                                    }
                                }
                            }
                            class281.method2039(var19, (long) var23.field68, (short) 1007, 12241, class152.field2585, var21, class112.method758(-33, new class146[] { class104.field1691, var23.field92 }), class237.field3954);
                        } else if ((class180.field3023 & 0x4) == 4) {
                            class281.method2039(var19, var17, (short) 13, 12241, -1, var21, class112.method758(arg1 ^ 0x5B, new class146[] { class238.field3968, class64.field1101, var23.field92 }), class135.field2257);
                            class123.field2012++;
                        }
                    }
                    if (var20 == 1) {
                        class282 var28 = class173.field2906[var22];
                        if (var28.field4838.field5150 == 1 && (var28.field5409 & 0x7F) == 64 && (var28.field5380 & 0x7F) == 64) {
                            for (int var29 = 0; var29 < class151.field2574; var29++) {
                                class282 var30 = class173.field2906[class210.field3476[var29]];
                                if (var30 != null && var28 != var30 && var30.field4838.field5150 == 1 && var28.field5409 == var30.field5409 && var28.field5380 == var30.field5380) {
                                    class75.method548(var19, class210.field3476[var29], -1, var30.field4838, var21);
                                }
                            }
                            for (int var31 = 0; var31 < class158.field2670; var31++) {
                                class234 var32 = class75.field1215[class112.field1791[var31]];
                                if (var32 != null && var28.field5409 == var32.field5409 && var28.field5380 == var32.field5380) {
                                    class310.method2183(var32, -122, var19, class112.field1791[var31], var21);
                                }
                            }
                        }
                        class75.method548(var19, var22, -1, var28.field4838, var21);
                    }
                    if (var20 == 0) {
                        class234 var33 = class75.field1215[var22];
                        if ((var33.field5409 & 0x7F) == 64 && (var33.field5380 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < class151.field2574; var34++) {
                                class282 var35 = class173.field2906[class210.field3476[var34]];
                                if (var35 != null && var35.field4838.field5150 == 1 && var33.field5409 == var35.field5409 && var33.field5380 == var35.field5380) {
                                    class75.method548(var19, class210.field3476[var34], arg1 + 40, var35.field4838, var21);
                                }
                            }
                            for (int var36 = 0; var36 < class158.field2670; var36++) {
                                class234 var37 = class75.field1215[class112.field1791[var36]];
                                if (var37 != null && var33 != var37 && var33.field5409 == var37.field5409 && var33.field5380 == var37.field5380) {
                                    class310.method2183(var37, -128, var19, class112.field1791[var36], var21);
                                }
                            }
                        }
                        class310.method2183(var33, arg1 ^ 0x53, var19, var22, var21);
                    }
                    if (var20 == 3) {
                        class160 var38 = class268.field4614[class203.field3387][var21][var19];
                        if (var38 != null) {
                            for (class39 var39 = (class39) var38.method1256(24791); var39 != null; var39 = (class39) var38.method1259(arg1 + 41)) {
                                int var40 = var39.field686.field3381;
                                class248 var41 = class84.method589(false, var40);
                                if (class161.field2736 == 1) {
                                    class85.field1345++;
                                    class281.method2039(var19, (long) var40, (short) 10, 12241, class269.field4618, var21, class112.method758(arg1 + 162, new class146[] { class281.field4825, class113.field1803, var41.field4149 }), class224.field3735);
                                } else if (!class272.field4668) {
                                    class110.field1766++;
                                    class146[] var42 = var41.field4099;
                                    if (class236.field3939) {
                                        var42 = class229.method1683(arg1 ^ 0xFFFFFFB2, var42);
                                    }
                                    for (int var43 = 4; var43 >= 0; var43--) {
                                        if (var42 != null && var42[var43] != null) {
                                            class14.field279++;
                                            byte var44 = 0;
                                            if (var43 == 0) {
                                                var44 = 25;
                                            }
                                            if (var43 == 1) {
                                                var44 = 23;
                                            }
                                            if (var43 == 2) {
                                                var44 = 33;
                                            }
                                            int var45 = -1;
                                            if (var43 == 3) {
                                                var44 = 38;
                                            }
                                            if (var43 == 4) {
                                                var44 = 8;
                                            }
                                            if (var41.field4109 == var43) {
                                                var45 = var41.field4101;
                                            }
                                            if (var41.field4143 == var43) {
                                                var45 = var41.field4105;
                                            }
                                            class281.method2039(var19, (long) var40, var44, 12241, var45, var21, class112.method758(-11, new class146[] { class145.field2420, var41.field4149 }), var42[var43]);
                                        }
                                    }
                                    class281.method2039(var19, (long) var40, (short) 1005, 12241, class152.field2585, var21, class112.method758(-43, new class146[] { class145.field2420, var41.field4149 }), class237.field3954);
                                } else if ((class180.field3023 & 0x1) == 1) {
                                    class281.method2039(var19, (long) var40, (short) 12, 12241, -1, var21, class112.method758(-91, new class146[] { class238.field3968, class113.field1803, var41.field4149 }), class135.field2257);
                                    class278.field4772++;
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 348)
    public static final void method275(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            field691 = (class70[]) null;
        }
        class22.field414.method791(8);
        field687++;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V", line = 381)
    public static void method276(byte arg0) {
        field695 = null;
        field690 = null;
        if (arg0 == -37) {
            field693 = (short[][][]) null;
            field691 = null;
            field688 = null;
            field696 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lia;)V", line = 396)
    public class39(class203 arg0) {
        this.field686 = arg0;
    }
}
