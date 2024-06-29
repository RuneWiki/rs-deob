import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class635 extends class417 {

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public volatile int field9292 = -1;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field9295;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "Z")
    public static boolean field9294 = false;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field9298 = 0;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "F")
    public static float field9296;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[B)Z")
    public static final boolean method3690(int arg0, byte[] arg1) {
        if (arg0 != -1) {
            field9296 = -0.32617718F;
        }
        field9297++;
        class148 var2 = new class148(arg1);
        int var3 = var2.method1032((byte) -33);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1032((byte) -33) == 1;
        if (var4) {
            class274.method1721(false, var2);
        }
        class502.method2992(var2, (byte) 103);
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLqa;I)V")
    public static final void method3691(int arg0, byte arg1, class208 arg2, int arg3) {
        field9293++;
        if (arg0 < 0 || arg3 < 0 || class215.field3164 == 0 || class84.field1206 == 0) {
            return;
        }
        arg2.method516(class220.field3205, class524.field7489, class215.field3164, class84.field1206);
        arg2.method510(class104.field1507, class420.field5687, class215.field3164, class84.field1206);
        if (arg1 != -92) {
            return;
        }
        class165 var4 = arg2.method522();
        var4.method339(class245.field3537, class398.field5470, class106.field1529, class193.field2860, class491.field6994, class396.field5456);
        arg2.method483(var4);
        if (class207.field3077 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method524();
            int var8 = (arg0 - class220.field3205) * var7 / class215.field3164;
            int var9 = (arg3 - class524.field7489) * var7 / class84.field1206;
            int var10 = arg2.method435();
            int var11 = (arg0 - class220.field3205) * var10 / class215.field3164;
            int var12 = (arg3 - class524.field7489) * var10 / class84.field1206;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method351(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method351(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class146.field2125 && var22 < class410.field5609) {
                    int var23 = class541.field8119.field8501;
                    if (var23 < 3 && (class146.field2114[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class207.field3077[var23].method1233(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class541.field8119.method940(-1) - 1 << 6) + var19 >> 7;
                        var6 = (class541.field8119.method940(-1) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class606.field9002 && (class364.field4945 & 0x40) != 0) {
                    class162 var24 = class372.method2217(class205.field3027, 100, class193.field2865);
                    if (var24 == null) {
                        class429.method2511(true);
                    } else {
                        class335.method2049(var6, class402.field5501, 0L, 122, true, 4, class217.field3182, false, -1, var5, " ->");
                    }
                } else {
                    if (class348.field4768 == class143.field2006) {
                        class335.method2049(var6, -1, 0L, arg1 ^ 0xFFFFFFDF, true, 25, class78.field1055.method3408(74, class63.field795), false, -1, var5, "");
                    }
                    class51.field591++;
                    class335.method2049(var6, class405.field5548, 0L, arg1 ^ 0xFFFFFFDA, true, 18, class348.field4771, false, -1, var5, "");
                }
            }
        }
        class374 var25 = class42.field491;
        for (class77 var26 = (class77) var25.method2233(true); var26 != null; var26 = (class77) var25.method2240(16772)) {
            if ((class201.field2987 || class541.field8119.field8501 == var26.field1023) && var26.method594(arg2, arg0, arg3, arg1 + 212)) {
                if (var26.field1030 instanceof class373) {
                    class373 var27 = (class373) var26.field1030;
                    int var28 = var27.method940(-1);
                    if ((var28 & 0x1) == 0 && (var27.field8496 & 0x7F) == 0 && (var27.field8500 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field8496 & 0x7F) == 64 && (var27.field8500 & 0x7F) == 64) {
                        int var29 = var27.field8496 - (var27.method940(-1) - 1 << 6);
                        int var30 = var27.field8500 - (var27.method940(-1) - 1 << 6);
                        for (int var31 = 0; var31 < class527.field7717; var31++) {
                            class505 var38 = (class505) class510.field7260.method2799((long) class634.field9290[var31], true);
                            if (var38 != null) {
                                class571 var39 = var38.field7148;
                                if (class617.field9123 != var39.field1908 && var39.field1895) {
                                    int var40 = var39.field8496 - (var39.field8405.field1237 - 1 << 6);
                                    int var41 = var39.field8500 - (var39.field8405.field1237 - 1 << 6);
                                    if (var40 >= var29 && var39.field8405.field1237 <= var27.method940(-1) - (var40 - var29 >> 7) && var41 >= var30 && var39.field8405.field1237 <= var27.method940(-1) - (var41 - var30 >> 7)) {
                                        class609.method3582(false, var39, class541.field8119.field8501 != var26.field1023);
                                        var39.field1908 = class617.field9123;
                                    }
                                }
                            }
                        }
                        int var32 = class551.field8224;
                        int[] var33 = class314.field4332;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class373 var35 = class293.field4036[var33[var34]];
                            if (var35 != null && class617.field9123 != var35.field1908 && var27 != var35 && var35.field1895) {
                                int var36 = var35.field8496 - (var35.method940(-1) - 1 << 6);
                                int var37 = var35.field8500 - (var35.method940(-1) - 1 << 6);
                                if (var29 <= var36 && var35.method940(-1) <= var27.method940(-1) - (var36 - var29 >> 7) && var37 >= var30 && var35.method940(-1) <= var27.method940(-1) - (var37 - var30 >> 7)) {
                                    class282.method1759(var35, (byte) -20, class541.field8119.field8501 != var26.field1023);
                                    var35.field1908 = class617.field9123;
                                }
                            }
                        }
                    }
                    if (class617.field9123 == var27.field1908) {
                        continue;
                    }
                    class282.method1759(var27, (byte) -20, class541.field8119.field8501 != var26.field1023);
                    var27.field1908 = class617.field9123;
                }
                if (var26.field1030 instanceof class571) {
                    class571 var42 = (class571) var26.field1030;
                    if (var42.field8405 != null) {
                        if ((var42.field8405.field1237 & 0x1) == 0 && (var42.field8496 & 0x7F) == 0 && (var42.field8500 & 0x7F) == 0 || (var42.field8405.field1237 & 0x1) == 1 && (var42.field8496 & 0x7F) == 64 && (var42.field8500 & 0x7F) == 64) {
                            int var43 = var42.field8496 - (var42.field8405.field1237 - 1 << 6);
                            int var44 = var42.field8500 - (var42.field8405.field1237 - 1 << 6);
                            for (int var45 = 0; var45 < class527.field7717; var45++) {
                                class505 var52 = (class505) class510.field7260.method2799((long) class634.field9290[var45], true);
                                if (var52 != null) {
                                    class571 var53 = var52.field7148;
                                    if (class617.field9123 != var53.field1908 && var42 != var53 && var53.field1895) {
                                        int var54 = var53.field8496 - (var53.field8405.field1237 - 1 << 6);
                                        int var55 = var53.field8500 - (var53.field8405.field1237 - 1 << 6);
                                        if (var43 <= var54 && var53.field8405.field1237 <= var42.field8405.field1237 - (var54 - var43 >> 7) && var44 <= var55 && var53.field8405.field1237 <= (var42.field8405.field1237 - (var55 - var44 >> 7))) {
                                            class609.method3582(false, var53, class541.field8119.field8501 != var26.field1023);
                                            var53.field1908 = class617.field9123;
                                        }
                                    }
                                }
                            }
                            int var46 = class551.field8224;
                            int[] var47 = class314.field4332;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class373 var49 = class293.field4036[var47[var48]];
                                if (var49 != null && class617.field9123 != var49.field1908 && var49.field1895) {
                                    int var50 = var49.field8496 - (var49.method940(-1) - 1 << 6);
                                    int var51 = var49.field8500 - (var49.method940(-1) - 1 << 6);
                                    if (var43 <= var50 && var49.method940(arg1 + 91) <= var42.field8405.field1237 - (var50 - var43 >> 7) && var44 <= var51 && var49.method940(-1) <= (var42.field8405.field1237 - (var51 - var44 >> 7))) {
                                        class282.method1759(var49, (byte) -20, class541.field8119.field8501 != var26.field1023);
                                        var49.field1908 = class617.field9123;
                                    }
                                }
                            }
                        }
                        if (class617.field9123 == var42.field1908) {
                            continue;
                        }
                        class609.method3582(false, var42, class541.field8119.field8501 != var26.field1023);
                        var42.field1908 = class617.field9123;
                    }
                }
                if (var26.field1030 instanceof class441) {
                    int var56 = var26.field1029 + class473.field6687;
                    int var57 = class38.field463 + var26.field1024;
                    class85 var58 = (class85) class45.field544.method2799((long) (var57 << 14 | var26.field1023 << 28 | var56), true);
                    if (var58 != null) {
                        for (class515 var59 = (class515) var58.field1212.method125(-1); var59 != null; var59 = (class515) var58.field1212.method126(124)) {
                            class540 var60 = class150.field2242.method3606((byte) -103, var59.field7347);
                            if (!class606.field9002) {
                                if (class541.field8119.field8501 == var26.field1023) {
                                    String[] var62 = var60.field8078;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            int var65 = class414.field5625;
                                            if (var63 == 0) {
                                                var64 = 13;
                                            }
                                            if (var63 == 1) {
                                                var64 = 6;
                                            }
                                            if (var63 == 2) {
                                                var64 = 21;
                                            }
                                            if (var63 == 3) {
                                                var64 = 60;
                                            }
                                            if (var63 == 4) {
                                                var64 = 59;
                                            }
                                            if (var60.field8045 == var63) {
                                                var65 = var60.field8079;
                                            }
                                            if (var60.field8095 == var63) {
                                                var65 = var60.field8036;
                                            }
                                            class106.field1530++;
                                            class335.method2049(var26.field1024, var65, (long) var59.field7347, 122, true, var64, var62[var63], false, -1, var26.field1029, "<col=ff9040>" + var60.field8105);
                                        }
                                    }
                                }
                                class322.field4440++;
                                class335.method2049(var26.field1024, class40.field478, (long) var59.field7347, 122, true, 1009, class184.field2761.method3408(103, class63.field795), class541.field8119.field8501 != var26.field1023, -1, var26.field1029, "<col=ff9040>" + var60.field8105);
                            } else if (class541.field8119.field8501 == var26.field1023) {
                                class178 var61 = class247.field3553 == -1 ? null : class516.field7358.method1274(-44, class247.field3553);
                                if ((class364.field4945 & 0x1) != 0 && (var61 == null || var60.method3281(0, var61.field2720, class247.field3553) != var61.field2720)) {
                                    class20.field194++;
                                    class335.method2049(var26.field1024, class402.field5501, (long) var59.field7347, 124, true, 20, class217.field3182, false, -1, var26.field1029, class537.field8008 + " -> <col=ff9040>" + var60.field8105);
                                }
                            }
                        }
                    }
                }
                if (var26.field1030 instanceof class231) {
                    class231 var66 = (class231) var26.field1030;
                    class145 var67 = class216.field3172.method1505(-24044, var66.method183(-19248));
                    if (var67.field2028 != null) {
                        var67 = var67.method991(class556.field8280, true);
                    }
                    if (var67 != null) {
                        if (!class606.field9002) {
                            if (class541.field8119.field8501 == var26.field1023) {
                                String[] var69 = var67.field2073;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            int var72 = class414.field5625;
                                            if (var70 == 0) {
                                                var71 = 49;
                                            }
                                            if (var70 == 1) {
                                                var71 = 12;
                                            }
                                            if (var70 == 2) {
                                                var71 = 22;
                                            }
                                            if (var70 == 3) {
                                                var71 = 9;
                                            }
                                            if (var67.field2021 == var70) {
                                                var72 = var67.field2069;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1011;
                                            }
                                            if (var67.field2020 == var70) {
                                                var72 = var67.field2030;
                                            }
                                            class546.field8151++;
                                            class335.method2049(var26.field1024, var72, class52.method312(var66, var26.field1029, var26.field1024, true), arg1 + 219, true, var71, var69[var70], false, -1, var26.field1029, "<col=00ffff>" + var67.field2102);
                                        }
                                    }
                                }
                            }
                            class111.field1570++;
                            class335.method2049(var26.field1024, class40.field478, (long) var67.field2049, arg1 + 216, true, 1012, class184.field2761.method3408(125, class63.field795), class541.field8119.field8501 != var26.field1023, -1, var26.field1029, "<col=00ffff>" + var67.field2102);
                        } else if (class541.field8119.field8501 == var26.field1023) {
                            class178 var68 = class247.field3553 == -1 ? null : class516.field7358.method1274(arg1 ^ 0x48, class247.field3553);
                            if ((class364.field4945 & 0x4) != 0 && (var68 == null || var67.method988(class247.field3553, -1, var68.field2720) != var68.field2720)) {
                                class335.method2049(var26.field1024, class402.field5501, class52.method312(var66, var26.field1029, var26.field1024, true), 123, true, 15, class217.field3182, false, -1, var26.field1029, class537.field8008 + " -> <col=00ffff>" + var67.field2102);
                                class468.field6593++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class635(String arg0) {
        this.field9295 = arg0;
    }
}
