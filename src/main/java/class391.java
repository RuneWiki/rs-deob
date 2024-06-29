import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class391 {

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lih;")
    private class214 field5989;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lgk;")
    private class412 field5995;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[B")
    public byte[] field5986;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private int field5984;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    private int field5999;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5981 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "[I")
    public static int[] field5997 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[[Lle;")
    private class357[][] field5996;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lza;IZI)V", line = 3)
    public static final void method2440(class491 arg0, int arg1, boolean arg2, int arg3) {
        field5988++;
        if (arg1 < 0 || arg3 < 0 || class519.field7667 == 0 || class236.field4083 == 0) {
            return;
        }
        arg0.method857(class263.field4381, class69.field1197, class519.field7667, class236.field4083);
        arg0.method829(class155.field2513, class140.field2329, class519.field7667, class236.field4083);
        class202 var4 = arg0.method835();
        var4.method1247(class506.field7374, class69.field1189, class437.field6531, class426.field6408, class111.field1960, class100.field1665);
        arg0.method911(var4);
        if (class511.field7488 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method845();
            int var8 = (arg1 - class263.field4381) * var7 / class519.field7667;
            int var9 = (arg3 - class69.field1197) * var7 / class236.field4083;
            int var10 = arg0.method816();
            int var11 = (arg1 - class263.field4381) * var10 / class519.field7667;
            int var12 = (arg3 - class69.field1197) * var10 / class236.field4083;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1240(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1240(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class217.field3775 && class277.field4548 > var22) {
                    int var23 = class302.field4850.field4720;
                    if (var23 < 3 && (class192.field2982[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class511.field7488[var23].method1517(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class302.field4850.method1143(0) - 1 << 6) >> 7;
                        var6 = var21 + (class302.field4850.method1143(0) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class508.field7386 && (class313.field4934 & 0x40) != 0) {
                    class68 var24 = class453.method2708(class345.field5413, 107, class75.field1309);
                    if (var24 == null) {
                        class467.method2772(!arg2);
                    } else {
                        class307.method1956(60, true, -1, false, class208.field3282, -1, var6, 0L, var5, class460.field6823, " ->");
                    }
                } else {
                    if (class271.field4501 == class131.field2246) {
                        class307.method1956(25, true, -1, false, -1, -1, var6, 0L, var5, class369.field5714.method1954(class300.field4813, -30366), "");
                    }
                    class420.field6349++;
                    class307.method1956(23, true, -1, false, class276.field4541, -1, var6, 0L, var5, class528.field7775, "");
                }
            }
        }
        class78 var25 = class20.field221;
        if (!arg2) {
            field5997 = null;
        }
        for (class430 var26 = (class430) var25.method573(24037); var26 != null; var26 = (class430) var25.method576(14)) {
            if ((class263.field4385 || class302.field4850.field4720 == var26.field6444) && var26.method2617(arg1, arg3, arg0, !arg2)) {
                if (var26.field6451 instanceof class166) {
                    class166 var27 = (class166) var26.field6451;
                    int var28 = var27.method1143(0);
                    if ((var28 & 0x1) == 0 && (var27.field4716 & 0x7F) == 0 && (var27.field4714 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field4716 & 0x7F) == 64 && (var27.field4714 & 0x7F) == 64) {
                        int var29 = var27.field4716 - (var27.method1143(0) - 1 << 6);
                        int var30 = var27.field4714 - (var27.method1143(0) - 1 << 6);
                        for (int var31 = 0; var31 < class86.field1471; var31++) {
                            class505 var38 = (class505) class147.field2396.method2516((long) class371.field5734[var31], -1);
                            if (var38 != null) {
                                class265 var39 = var38.field7355;
                                if (class504.field7348 != var39.field3086 && var39.field3090) {
                                    int var40 = var39.field4716 - (var39.field4430.field7416 - 1 << 6);
                                    int var41 = var39.field4714 - (var39.field4430.field7416 - 1 << 6);
                                    if (var40 >= var29 && var39.field4430.field7416 <= var27.method1143(0) - (var40 - var29 >> 7) && var30 <= var41 && var39.field4430.field7416 <= (var27.method1143(0) - (var41 - var30 >> 7))) {
                                        class373.method2344(2000, class302.field4850.field4720 != var26.field6444, var39);
                                        var39.field3086 = class504.field7348;
                                    }
                                }
                            }
                        }
                        int var32 = class151.field2425;
                        int[] var33 = class45.field734;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class166 var35 = class435.field6489[var33[var34]];
                            if (var35 != null && class504.field7348 != var35.field3086 && var27 != var35 && var35.field3090) {
                                int var36 = var35.field4716 - (var35.method1143(0) - 1 << 6);
                                int var37 = var35.field4714 - (var35.method1143(0) - 1 << 6);
                                if (var29 <= var36 && var35.method1143(0) <= var27.method1143(0) - (var36 - var29 >> 7) && var30 <= var37 && var35.method1143(0) <= (var27.method1143(0) - (var37 - var30 >> 7))) {
                                    class126.method987(var35, class302.field4850.field4720 != var26.field6444, 0);
                                    var35.field3086 = class504.field7348;
                                }
                            }
                        }
                    }
                    if (class504.field7348 == var27.field3086) {
                        continue;
                    }
                    class126.method987(var27, class302.field4850.field4720 != var26.field6444, 0);
                    var27.field3086 = class504.field7348;
                }
                if (var26.field6451 instanceof class265) {
                    class265 var42 = (class265) var26.field6451;
                    if (var42.field4430 != null) {
                        if ((var42.field4430.field7416 & 0x1) == 0 && (var42.field4716 & 0x7F) == 0 && (var42.field4714 & 0x7F) == 0 || (var42.field4430.field7416 & 0x1) == 1 && (var42.field4716 & 0x7F) == 64 && (var42.field4714 & 0x7F) == 64) {
                            int var43 = var42.field4716 - (var42.field4430.field7416 - 1 << 6);
                            int var44 = var42.field4714 - (var42.field4430.field7416 - 1 << 6);
                            for (int var45 = 0; var45 < class86.field1471; var45++) {
                                class505 var52 = (class505) class147.field2396.method2516((long) class371.field5734[var45], -1);
                                if (var52 != null) {
                                    class265 var53 = var52.field7355;
                                    if (class504.field7348 != var53.field3086 && var42 != var53 && var53.field3090) {
                                        int var54 = var53.field4716 - (var53.field4430.field7416 - 1 << 6);
                                        int var55 = var53.field4714 - (var53.field4430.field7416 - 1 << 6);
                                        if (var54 >= var43 && var42.field4430.field7416 - (var54 - var43 >> 7) >= var53.field4430.field7416 && var44 <= var55 && (var42.field4430.field7416 - (var55 - var44 >> 7)) >= var53.field4430.field7416) {
                                            class373.method2344(2000, class302.field4850.field4720 != var26.field6444, var53);
                                            var53.field3086 = class504.field7348;
                                        }
                                    }
                                }
                            }
                            int var46 = class151.field2425;
                            int[] var47 = class45.field734;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class166 var49 = class435.field6489[var47[var48]];
                                if (var49 != null && class504.field7348 != var49.field3086 && var49.field3090) {
                                    int var50 = var49.field4716 - (var49.method1143(0) - 1 << 6);
                                    int var51 = var49.field4714 - (var49.method1143(0) - 1 << 6);
                                    if (var50 >= var43 && var49.method1143(0) <= (var42.field4430.field7416 - (var50 - var43 >> 7)) && var51 >= var44 && var49.method1143(0) <= var42.field4430.field7416 - (var51 - var44 >> 7)) {
                                        class126.method987(var49, class302.field4850.field4720 != var26.field6444, 0);
                                        var49.field3086 = class504.field7348;
                                    }
                                }
                            }
                        }
                        if (class504.field7348 == var42.field3086) {
                            continue;
                        }
                        class373.method2344(2000, class302.field4850.field4720 != var26.field6444, var42);
                        var42.field3086 = class504.field7348;
                    }
                }
                if (var26.field6451 instanceof class118) {
                    int var56 = var26.field6450 + class16.field181;
                    int var57 = class455.field6794 + var26.field6448;
                    class279 var58 = (class279) class244.field4176.method2516((long) (var56 | var26.field6444 << 28 | var57 << 14), -1);
                    if (var58 != null) {
                        for (class292 var59 = (class292) var58.field4577.method2546((byte) -104); var59 != null; var59 = (class292) var58.field4577.method2534(-4)) {
                            class104 var60 = class20.field218.method2221(var59.field4737, -1);
                            if (!class508.field7386) {
                                if (class302.field4850.field4720 == var26.field6444) {
                                    String[] var62 = var60.field1778;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            if (var63 == 0) {
                                                var64 = 49;
                                            }
                                            int var65 = class21.field229;
                                            if (var63 == 1) {
                                                var64 = 19;
                                            }
                                            if (var63 == 2) {
                                                var64 = 15;
                                            }
                                            if (var63 == 3) {
                                                var64 = 30;
                                            }
                                            if (var60.field1716 == var63) {
                                                var65 = var60.field1733;
                                            }
                                            if (var63 == 4) {
                                                var64 = 11;
                                            }
                                            if (var60.field1772 == var63) {
                                                var65 = var60.field1740;
                                            }
                                            class307.method1956(var64, true, -1, false, var65, -1, var26.field6448, (long) var59.field4737, var26.field6450, var62[var63], "<col=ff9040>" + var60.field1771);
                                            class212.field3367++;
                                        }
                                    }
                                }
                                class307.method1956(1007, true, -1, class302.field4850.field4720 != var26.field6444, class124.field2168, -1, var26.field6448, (long) var59.field4737, var26.field6450, class237.field4094.method1954(class300.field4813, -30366), "<col=ff9040>" + var60.field1771);
                                class363.field5654++;
                            } else if (class302.field4850.field4720 == var26.field6444) {
                                class223 var61 = class251.field4297 == -1 ? null : class213.field3383.method2258(true, class251.field4297);
                                if ((class313.field4934 & 0x1) != 0 && (var61 == null || var60.method711(var61.field3853, class251.field4297, (byte) 110) != var61.field3853)) {
                                    class307.method1956(4, true, -1, false, class208.field3282, -1, var26.field6448, (long) var59.field4737, var26.field6450, class460.field6823, class15.field179 + " -> <col=ff9040>" + var60.field1771);
                                    class1.field1++;
                                }
                            }
                        }
                    }
                }
                if (var26.field6451 instanceof class518) {
                    class518 var66 = (class518) var26.field6451;
                    class39 var67 = class61.field928.method791(var66.method28((byte) -118), true);
                    if (var67.field575 != null) {
                        var67 = var67.method296(-1008, class327.field5160);
                    }
                    if (var67 != null) {
                        if (!class508.field7386) {
                            if (class302.field4850.field4720 == var26.field6444) {
                                String[] var68 = var67.field628;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (var68[var69] != null) {
                                            short var70 = 0;
                                            if (var69 == 0) {
                                                var70 = 17;
                                            }
                                            int var71 = class21.field229;
                                            if (var69 == 1) {
                                                var70 = 20;
                                            }
                                            if (var69 == 2) {
                                                var70 = 48;
                                            }
                                            if (var69 == 3) {
                                                var70 = 45;
                                            }
                                            if (var67.field585 == var69) {
                                                var71 = var67.field606;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1002;
                                            }
                                            if (var67.field613 == var69) {
                                                var71 = var67.field584;
                                            }
                                            class307.method1956(var70, true, -1, false, var71, -1, var26.field6448, class386.method2421(-1, var26.field6448, var66, var26.field6450), var26.field6450, var68[var69], "<col=00ffff>" + var67.field574);
                                            class468.field6944++;
                                        }
                                    }
                                }
                            }
                            class307.method1956(1011, true, -1, class302.field4850.field4720 != var26.field6444, class124.field2168, -1, var26.field6448, (long) var67.field587, var26.field6450, class237.field4094.method1954(class300.field4813, -30366), "<col=00ffff>" + var67.field574);
                            class213.field3378++;
                        } else if (class302.field4850.field4720 == var26.field6444) {
                            class223 var72 = class251.field4297 == -1 ? null : class213.field3383.method2258(true, class251.field4297);
                            if ((class313.field4934 & 0x4) != 0 && (var72 == null || var67.method293(0, var72.field3853, class251.field4297) != var72.field3853)) {
                                class328.field5162++;
                                class307.method1956(22, true, -1, false, class208.field3282, -1, var26.field6448, class386.method2421(-1, var26.field6448, var66, var26.field6450), var26.field6450, class460.field6823, class15.field179 + " -> <col=00ffff>" + var67.field574);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 479)
    public static void method2441(int arg0) {
        field5997 = null;
        if (arg0 == 1) {
            field5981 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V", line = 491)
    public static final void method2442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5991++;
        if (arg4 != -1) {
            field5981 = null;
        }
        if (arg0 == arg1) {
            class36.method267(arg1, arg2, arg6, arg7, 26216, arg5, arg3);
        } else if ((arg2 - arg1) >= class182.field2877 && (arg1 + arg2) <= class235.field4076 && class29.field460 <= (arg5 - arg0) && class472.field6996 >= arg5 + arg0) {
            class32.method250(arg1, arg0, arg2, arg7, -4747, arg3, arg6, arg5);
        } else {
            class3.method8(arg5, arg3, arg2, arg1, arg6, arg0, 3, arg7);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Li;IIB)V", line = 515)
    public final void method2443(class515 arg0, int arg1, int arg2, byte arg3) {
        field5987++;
        class289 var5 = (class289) arg0;
        int var6 = var5.field4711 + arg1 + 1;
        int var7 = var5.field4704 + arg2 + 1;
        int var8 = this.field5994 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4708;
        int var11 = var5.field4699;
        if (arg3 > -56) {
            return;
        }
        int var12 = this.field5994 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field5994 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (this.field5993 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field5993;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var13 += var16;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field5994 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field5994;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class524.method3101(var12, this.field5986, var5.field4697, var8, (byte) -97, var10, var9, var13, var11);
            this.method2447(var11, var7, -1, var6, var10);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIILi;)V", line = 584)
    public final void method2444(byte arg0, int arg1, int arg2, class515 arg3) {
        field5985++;
        class289 var5 = (class289) arg3;
        int var6 = var5.field4704 + arg1 + 1;
        int var7 = var5.field4711 + arg2 + 1;
        int var8 = this.field5994 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4708;
        if (arg0 != 18) {
            return;
        }
        int var11 = var5.field4699;
        int var12 = this.field5994 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field5994 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field5993) {
            int var15 = var7 + var10 + 1 - this.field5993;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var9 += var16;
            var14 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field5994 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field5994;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class285.method1856(true, var11, var10, var5.field4697, var12, this.field5986, var14, var8, var9);
            this.method2447(var11, var6, -1, var7, var10);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 659)
    public final void method2445(boolean arg0) {
        if (arg0) {
            this.field5986 = null;
        }
        field5990++;
        this.field5996 = new class357[this.field5984][this.field5999];
        for (int var2 = 0; var2 < this.field5999; var2++) {
            for (int var3 = 0; var3 < this.field5984; var3++) {
                this.field5996[var3][var2] = new class357(this.field5989, this, this.field5995, var3, var2, this.field5998, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILi;)Z", line = 688)
    public final boolean method2446(int arg0, int arg1, int arg2, class515 arg3) {
        field5983++;
        class289 var5 = (class289) arg3;
        int var6 = var5.field4711 + arg1 + 1;
        int var7 = var5.field4704 + arg2 + arg0;
        int var8 = this.field5994 * var6 + var7;
        int var9 = var5.field4708;
        int var10 = var5.field4699;
        int var11 = this.field5994 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field5994 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if (this.field5993 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field5993;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var11 += var14;
            var8 += var14;
        }
        if (this.field5994 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field5994;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5994 + var11;
            return class39.method287(var16, arg2 ^ 0x2A42, this.field5986, var10, var17, var8, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V", line = 760)
    private final void method2447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5980++;
        if (this.field5996 == null) {
            return;
        }
        int var6 = arg1 + arg2 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class357[] var11 = this.field5996[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5562 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[[ZZII)V", line = 805)
    public final void method2448(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 2160) {
            method2442(-52, 80, 106, 50, -13, -98, -61, -63);
        }
        field5982++;
        this.field5989.method1417(false, false);
        this.field5989.method1473(-107, false);
        this.field5989.method1463(-2, (byte) 96);
        this.field5989.method1410(1, arg1 ^ 0x1671);
        this.field5989.method1486(1, (byte) 122);
        float var7 = 1.0F / (float) (this.field5989.field3600 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field5999; var8++) {
                int var9 = var8 << this.field5998;
                int var10 = var8 + 1 << this.field5998;
                label135: for (int var11 = 0; var11 < this.field5984; var11++) {
                    int var12 = var11 << this.field5998;
                    int var13 = var11 + 1 << this.field5998;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg4) <= (var14 - arg0) && arg4 >= var14 - arg0) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg4) <= (var15 - arg5) && var15 - arg5 <= arg4 && arg2[var14 + arg4 - arg0][var15 + arg4 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field5996[var11][var8].method2294(arg1 + 24076);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field5999; var16++) {
                int var17 = var16 << this.field5998;
                int var18 = var16 + 1 << this.field5998;
                for (int var19 = 0; var19 < this.field5984; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field5998;
                    int var22 = var19 + 1 << this.field5998;
                    class364 var23 = this.field5989.field3656;
                    var23.field301 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg4) <= (var24 - arg5) && (var24 - arg5) <= arg4) {
                            int var25 = this.field5995.field3801 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg0) >= (-arg4) && (var26 - arg0) <= arg4 && arg2[var26 + arg4 - arg0][arg4 + var24 - arg5]) {
                                    short[] var27 = this.field5995.field6243[var25];
                                    if (var27 != null) {
                                        if (this.field5989.field3708) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method182(var27[var29] & 0xFFFF, -124);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method154(var27[var28] & 0xFFFF, -857932536);
                                                var20++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field5996[var19][var16].method2290(true, var20, 5123, var23.field302);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 993)
    public static final void method2449(int arg0) {
        field5992++;
        class337.field5290.method1604(4);
        class530.field7787.method1604(4);
        class387.field5964.method1604(4);
        class112.field1976.method1604(4);
        if (arg0 == 1755134382) {
            class435.field6505.method1604(4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lih;Lgk;)V", line = 1013)
    public class391(class214 arg0, class412 arg1) {
        this.field5989 = arg0;
        this.field5995 = arg1;
        this.field5994 = (this.field5995.field3802 * this.field5995.field3801 >> this.field5989.field3601) + 2;
        this.field5993 = (this.field5995.field3802 * this.field5995.field3797 >> this.field5989.field3601) + 2;
        this.field5998 = this.field5989.field3601 + 7 - this.field5995.field3803;
        this.field5986 = new byte[this.field5994 * this.field5993];
        this.field5984 = this.field5995.field3801 >> this.field5998;
        this.field5999 = this.field5995.field3797 >> this.field5998;
    }
}
