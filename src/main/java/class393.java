import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class393 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[Lnp;")
    public static class415[] field5189 = new class415[1024];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[F")
    public static float[] field5188 = new float[4];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field5191 = new int[1];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljh;")
    public static class138 field5190;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)Z", line = 10)
    public static final boolean method2261(char arg0, byte arg1) {
        field5187++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class88.field1082;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 <= 49) {
            method2261('`', (byte) 99);
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILqa;)V", line = 48)
    public static final void method2262(int arg0, int arg1, int arg2, class206 arg3) {
        field5192++;
        if (arg0 < 0 || arg2 < 0 || class83.field1017 == 0 || class173.field2109 == 0) {
            return;
        }
        arg3.method1179(class78.field917, class384.field5073, class83.field1017, class173.field2109);
        arg3.method1107(class612.field8881, class129.field1591, class83.field1017, class173.field2109);
        class163 var4 = arg3.method1150();
        var4.method669(class357.field4691, class637.field9148, class333.field4321, class473.field6632, class53.field442, class173.field2098);
        arg3.method1160(var4);
        if (class90.field1114 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method1175();
            int var8 = (arg0 - class78.field917) * var7 / class83.field1017;
            int var9 = (arg2 - class384.field5073) * var7 / class173.field2109;
            int var10 = arg3.method1129();
            int var11 = (arg0 - class78.field917) * var10 / class83.field1017;
            int var12 = (arg2 - class384.field5073) * var10 / class173.field2109;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method660(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method660(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class106.field1289 > var20 && class422.field5452 > var22) {
                    int var23 = class103.field1265.field8660;
                    if (var23 < 3 && (class330.field4304[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class90.field1114[var23].method847(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class103.field1265.method2694(arg1 + 28146) - 1 << 6) >> 7;
                        var6 = (class103.field1265.method2694(28146) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class449.field6225 && (class117.field1477 & 0x40) != 0) {
                    class509 var24 = class369.method2071(class588.field8538, class592.field8606, -20190);
                    if (var24 == null) {
                        class281.method1595(25098);
                    } else {
                        class22.method139(15, true, var6, (byte) 65, class468.field6542, var5, " ->", class208.field2503, 0L, false, -1);
                    }
                } else {
                    if (class341.field4399 == class320.field4082) {
                        class22.method139(51, true, var6, (byte) 65, -1, var5, "", class195.field2371.method987(class31.field247, arg1 ^ 0x16), 0L, false, -1);
                    }
                    class174.field2113++;
                    class22.method139(11, true, var6, (byte) 65, class13.field107, var5, "", class162.field1975, 0L, false, -1);
                }
            }
        }
        class354 var25 = class504.field6989;
        for (class318 var26 = (class318) var25.method1987(true); var26 != null; var26 = (class318) var25.method1994(6408)) {
            if ((class387.field5117 || class103.field1265.field8660 == var26.field4052) && var26.method1760(arg0, false, arg2, arg3)) {
                if (var26.field4057 instanceof class545) {
                    class545 var27 = (class545) var26.field4057;
                    int var28 = var27.method2694(28146);
                    if ((var28 & 0x1) == 0 && (var27.field8661 & 0x7F) == 0 && (var27.field8652 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field8661 & 0x7F) == 64 && (var27.field8652 & 0x7F) == 64) {
                        int var29 = var27.field8661 - (var27.method2694(arg1 ^ 0x6DF2) - 1 << 6);
                        int var30 = var27.field8652 - (var27.method2694(28146) - 1 << 6);
                        for (int var31 = 0; var31 < class474.field6637; var31++) {
                            class415 var38 = (class415) class309.field3938.method2645((long) class194.field2345[var31], (byte) -115);
                            if (var38 != null) {
                                class459 var39 = var38.field5390;
                                if (class335.field4358 != var39.field6471 && var39.field6451) {
                                    int var40 = var39.field8661 - (var39.field6334.field844 - 1 << 6);
                                    int var41 = var39.field8652 - (var39.field6334.field844 - 1 << 6);
                                    if (var40 >= var29 && var39.field6334.field844 <= var27.method2694(28146) - (var40 - var29 >> 7) && var30 <= var41 && var39.field6334.field844 <= var27.method2694(28146) - (var41 - var30 >> 7)) {
                                        class224.method1283(var39, false, class103.field1265.field8660 != var26.field4052);
                                        var39.field6471 = class335.field4358;
                                    }
                                }
                            }
                        }
                        int var32 = class370.field4878;
                        int[] var33 = class519.field7302;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class545 var35 = class459.field6329[var33[var34]];
                            if (var35 != null && class335.field4358 != var35.field6471 && var27 != var35 && var35.field6451) {
                                int var36 = var35.field8661 - (var35.method2694(28146) - 1 << 6);
                                int var37 = var35.field8652 - (var35.method2694(arg1 ^ 0x6DF2) - 1 << 6);
                                if (var29 <= var36 && var35.method2694(28146) <= var27.method2694(arg1 ^ 0x6DF2) - (var36 - var29 >> 7) && var37 >= var30 && var35.method2694(28146) <= (var27.method2694(arg1 + 28146) - (var37 - var30 >> 7))) {
                                    class169.method947(var35, class103.field1265.field8660 != var26.field4052, -120);
                                    var35.field6471 = class335.field4358;
                                }
                            }
                        }
                    }
                    if (class335.field4358 == var27.field6471) {
                        continue;
                    }
                    class169.method947(var27, class103.field1265.field8660 != var26.field4052, arg1 - 115);
                    var27.field6471 = class335.field4358;
                }
                if (var26.field4057 instanceof class459) {
                    class459 var42 = (class459) var26.field4057;
                    if (var42.field6334 != null) {
                        if ((var42.field6334.field844 & 0x1) == 0 && (var42.field8661 & 0x7F) == 0 && (var42.field8652 & 0x7F) == 0 || (var42.field6334.field844 & 0x1) == 1 && (var42.field8661 & 0x7F) == 64 && (var42.field8652 & 0x7F) == 64) {
                            int var43 = var42.field8661 - (var42.field6334.field844 - 1 << 6);
                            int var44 = var42.field8652 - (var42.field6334.field844 - 1 << 6);
                            for (int var45 = 0; var45 < class474.field6637; var45++) {
                                class415 var52 = (class415) class309.field3938.method2645((long) class194.field2345[var45], (byte) -94);
                                if (var52 != null) {
                                    class459 var53 = var52.field5390;
                                    if (class335.field4358 != var53.field6471 && var42 != var53 && var53.field6451) {
                                        int var54 = var53.field8661 - (var53.field6334.field844 - 1 << 6);
                                        int var55 = var53.field8652 - (var53.field6334.field844 - 1 << 6);
                                        if (var54 >= var43 && (var42.field6334.field844 - (var54 - var43 >> 7)) >= var53.field6334.field844 && var55 >= var44 && var53.field6334.field844 <= var42.field6334.field844 - (var55 - var44 >> 7)) {
                                            class224.method1283(var53, false, class103.field1265.field8660 != var26.field4052);
                                            var53.field6471 = class335.field4358;
                                        }
                                    }
                                }
                            }
                            int var46 = class370.field4878;
                            int[] var47 = class519.field7302;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class545 var49 = class459.field6329[var47[var48]];
                                if (var49 != null && class335.field4358 != var49.field6471 && var49.field6451) {
                                    int var50 = var49.field8661 - (var49.method2694(28146) - 1 << 6);
                                    int var51 = var49.field8652 - (var49.method2694(28146) - 1 << 6);
                                    if (var50 >= var43 && var49.method2694(28146) <= (var42.field6334.field844 - (var50 - var43 >> 7)) && var44 <= var51 && var49.method2694(28146) <= (var42.field6334.field844 - (var51 - var44 >> 7))) {
                                        class169.method947(var49, class103.field1265.field8660 != var26.field4052, -100);
                                        var49.field6471 = class335.field4358;
                                    }
                                }
                            }
                        }
                        if (class335.field4358 == var42.field6471) {
                            continue;
                        }
                        class224.method1283(var42, false, class103.field1265.field8660 != var26.field4052);
                        var42.field6471 = class335.field4358;
                    }
                }
                if (var26.field4057 instanceof class117) {
                    int var56 = class632.field9113 + var26.field4060;
                    int var57 = class119.field1504 + var26.field4050;
                    class36 var58 = (class36) class150.field1787.method2645((long) (var26.field4052 << 28 | var57 << 14 | var56), (byte) -117);
                    if (var58 != null) {
                        for (class197 var59 = (class197) var58.field280.method1042(2); var59 != null; var59 = (class197) var58.field280.method1051(9584)) {
                            class607 var60 = class449.field6217.method2026((byte) -106, var59.field2386);
                            if (!class449.field6225) {
                                if (class103.field1265.field8660 == var26.field4052) {
                                    String[] var62 = var60.field8758;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            int var65 = class14.field112;
                                            if (var63 == 0) {
                                                var64 = 46;
                                            }
                                            if (var63 == 1) {
                                                var64 = 6;
                                            }
                                            if (var63 == 2) {
                                                var64 = 12;
                                            }
                                            if (var63 == 3) {
                                                var64 = 5;
                                            }
                                            if (var63 == 4) {
                                                var64 = 22;
                                            }
                                            if (var60.field8806 == var63) {
                                                var65 = var60.field8775;
                                            }
                                            if (var60.field8821 == var63) {
                                                var65 = var60.field8808;
                                            }
                                            class313.field3996++;
                                            class22.method139(var64, true, var26.field4050, (byte) 65, var65, var26.field4060, "<col=ff9040>" + var60.field8805, var62[var63], (long) var59.field2386, false, -1);
                                        }
                                    }
                                }
                                class374.field4967++;
                                class22.method139(1011, true, var26.field4050, (byte) 65, class45.field388, var26.field4060, "<col=ff9040>" + var60.field8805, class264.field3441.method987(class31.field247, arg1 ^ 0x16), (long) var59.field2386, class103.field1265.field8660 != var26.field4052, -1);
                            } else if (class103.field1265.field8660 == var26.field4052) {
                                class395 var61 = class391.field5183 == -1 ? null : class290.field3771.method2793(11, class391.field5183);
                                if ((class117.field1477 & 0x1) != 0 && (var61 == null || var60.method3486(true, var61.field5211, class391.field5183) != var61.field5211)) {
                                    class22.method139(16, true, var26.field4050, (byte) 65, class468.field6542, var26.field4060, class472.field6608 + " -> <col=ff9040>" + var60.field8805, class208.field2503, (long) var59.field2386, false, -1);
                                    class355.field4653++;
                                }
                            }
                        }
                    }
                }
                if (var26.field4057 instanceof class269) {
                    class269 var66 = (class269) var26.field4057;
                    class437 var67 = class16.field126.method1759(false, var66.method342(-2329));
                    if (var67.field6004 != null) {
                        var67 = var67.method2545(-1, class281.field3700);
                    }
                    if (var67 != null) {
                        if (!class449.field6225) {
                            if (class103.field1265.field8660 == var26.field4052) {
                                String[] var69 = var67.field5942;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            int var72 = class14.field112;
                                            if (var70 == 0) {
                                                var71 = 19;
                                            }
                                            if (var70 == 1) {
                                                var71 = 8;
                                            }
                                            if (var70 == 2) {
                                                var71 = 2;
                                            }
                                            if (var70 == 3) {
                                                var71 = 57;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1002;
                                            }
                                            if (var67.field6029 == var70) {
                                                var72 = var67.field6005;
                                            }
                                            if (var67.field5940 == var70) {
                                                var72 = var67.field6017;
                                            }
                                            class92.field1130++;
                                            class22.method139(var71, true, var26.field4050, (byte) 65, var72, var26.field4060, "<col=00ffff>" + var67.field5980, var69[var70], class148.method814(var66, var26.field4060, var26.field4050, (byte) -122), false, -1);
                                        }
                                    }
                                }
                            }
                            class22.method139(1010, true, var26.field4050, (byte) 65, class45.field388, var26.field4060, "<col=00ffff>" + var67.field5980, class264.field3441.method987(class31.field247, 22), (long) var67.field5996, class103.field1265.field8660 != var26.field4052, -1);
                            class175.field2123++;
                        } else if (class103.field1265.field8660 == var26.field4052) {
                            class395 var68 = class391.field5183 == -1 ? null : class290.field3771.method2793(11, class391.field5183);
                            if ((class117.field1477 & 0x4) != 0 && (var68 == null || var67.method2548((byte) -122, class391.field5183, var68.field5211) != var68.field5211)) {
                                class170.field2072++;
                                class22.method139(44, true, var26.field4050, (byte) 65, class468.field6542, var26.field4060, class472.field6608 + " -> <col=00ffff>" + var67.field5980, class208.field2503, class148.method814(var66, var26.field4060, var26.field4050, (byte) -40), false, -1);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 0) {
            method2262(-115, 33, 68, null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 525)
    public static void method2263(byte arg0) {
        field5188 = null;
        field5189 = null;
        int var1 = -79 / ((arg0 - 67) / 39);
        field5191 = null;
        field5190 = null;
    }

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;", line = 546)
    public final String toString() {
        field5193++;
        throw new IllegalStateException();
    }
}
