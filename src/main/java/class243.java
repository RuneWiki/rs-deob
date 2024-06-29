import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class243 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lr;")
    public static class66 field4244 = class93.method641(43, "blinken3:");

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4243 = -1;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lr;")
    public static class66 field4246 = class93.method641(43, "k");

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lr;")
    public static class66 field4248 = class93.method641(43, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lr;")
    public static class66 field4250 = class93.method641(43, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!th", name = "n", descriptor = "[[B")
    public static byte[][] field4255 = new byte[1000][];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4242;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Llh;I[B)V")
    public final void method1598(class249 arg0, int arg1, byte[] arg2) {
        field4253++;
        if (arg0.field4350[arg0.field4335] != 31 || arg0.field4350[arg0.field4335 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4242 == null) {
            this.field4242 = new Inflater(true);
        }
        try {
            this.field4242.setInput(arg0.field4350, arg0.field4335 + 10, -arg0.field4335 - (10 - (arg0.field4350.length + -8)));
            this.field4242.inflate(arg2);
        } catch (Exception var4) {
            this.field4242.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 < 98) {
            method1602(-48);
        }
        this.field4242.reset();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method1599(boolean arg0) {
        field4246 = null;
        field4248 = null;
        if (!arg0) {
            field4243 = 70;
        }
        field4244 = null;
        field4250 = null;
        field4255 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BZ[Lga;)V")
    public static final void method1600(byte arg0, boolean arg1, class165[] arg2) {
        field4249++;
        if (arg0 != -111) {
            method1599(true);
        }
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class47.field846[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class47.field846[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg2[var7].method1109(var6, (byte) -52, var5);
                            }
                        }
                    }
                }
            }
            class226.field3892 += (int) (Math.random() * 5.0D) - 2;
            class97.field1906 += (int) (Math.random() * 5.0D) - 2;
            if (class226.field3892 < -16) {
                class226.field3892 = -16;
            }
            if (class97.field1906 < -8) {
                class97.field1906 = -8;
            }
            if (class97.field1906 > 8) {
                class97.field1906 = 8;
            }
            if (class226.field3892 > 16) {
                class226.field3892 = 16;
            }
        }
        int[][] var8 = new int[104][104];
        int[][] var9 = new int[104][104];
        int var10 = class97.field1906 >> 2 << 10;
        int var11 = class226.field3892 >> 1;
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var51 = class165.field2971[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    int var101 = class30.field453[var12][var100 + 1][var54] - class30.field453[var12][var100 - 1][var54];
                    byte var102 = 74;
                    int var103 = class30.field453[var12][var100][var54 + 1] - class30.field453[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var101 * var101 - (-var103 * var103 - 65536)));
                    int var105 = (var101 << 8) / var104;
                    int var106 = -65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + (var105 * -50 + (var106 * -10))) / var53 + var102;
                    int var109 = (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54] >> 1) + (var51[var100][var54 + 1] >> 3) + (var51[var100][var54 + -1] >> 2);
                    var8[var100][var54] = var108 - var109;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class249.field4395[var55] = 0;
                class187.field3232[var55] = 0;
                class47.field848[var55] = 0;
                class133.field2483[var55] = 0;
                class24.field307[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class242.field4241[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class190 var96 = class205.method1328(var95 - 1, (byte) -128);
                            class249.field4395[var85] += var96.field3288;
                            class187.field3232[var85] += var96.field3293;
                            class47.field848[var85] += var96.field3283;
                            class133.field2483[var85] += var96.field3281;
                            var10002 = class24.field307[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class242.field4241[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class190 var99 = class205.method1328(var98 - 1, (byte) -128);
                            class249.field4395[var85] -= var99.field3288;
                            class187.field3232[var85] -= var99.field3293;
                            class47.field848[var85] -= var99.field3283;
                            class133.field2483[var85] -= var99.field3281;
                            var10002 = class24.field307[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var88 += class133.field2483[var93];
                            var89 += class24.field307[var93];
                            var90 += class47.field848[var93];
                            var86 += class249.field4395[var93];
                            var87 += class187.field3232[var93];
                        }
                        if (var92 >= 0) {
                            var87 -= class187.field3232[var92];
                            var90 -= class47.field848[var92];
                            var89 -= class24.field307[var92];
                            var86 -= class249.field4395[var92];
                            var88 -= class133.field2483[var92];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var9[var56][var91] = class35.method195(var87 / var89, (byte) -76, var90 / var89, var86 * 256 / var88);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class88.method625(arg0 + 24892) || (class47.field846[0][var57][var58] & 0x2) != 0 || (class47.field846[var12][var57][var58] & 0x10) == 0 && class131.method911(var58, var12, var57, (byte) -103) == class105.field2030) {
                        if (class147.field2681 > var12) {
                            class147.field2681 = var12;
                        }
                        int var59 = class242.field4241[var12][var57][var58] & 0xFF;
                        int var60 = class34.field514[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class30.field453[var12][var57][var58];
                            int var62 = class30.field453[var12][var57 + 1][var58];
                            int var63 = class30.field453[var12][var57 + 1][var58 + 1];
                            int var64 = class30.field453[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class193.field3350[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class172.method1167((byte) 53, var60 - 1).field5) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class250.field4413[var12][var57][var58] = class73.method521(class250.field4413[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var69;
                            if (var59 > 0) {
                                var66 = var9[var57][var58];
                                int var67 = (var66 & 0x7F) + var11;
                                if (var67 < 0) {
                                    var67 = 0;
                                } else if (var67 > 127) {
                                    var67 = 127;
                                }
                                int var68 = (var10 + var66 & 0xFC00) + (var66 & 0x380) + var67;
                                var69 = class123.field2317[class36.method200(2, 96, var68)];
                            } else {
                                var69 = 0;
                                var66 = -1;
                            }
                            int var70 = var8[var57][var58];
                            int var71 = var8[var57 + 1][var58];
                            int var72 = var8[var57][var58 + 1];
                            int var73 = var8[var57 + 1][var58 + 1];
                            if (var60 == 0) {
                                class16.method64(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class36.method200(2, var70, var66), class36.method200(2, var71, var66), class36.method200(2, var73, var66), class36.method200(arg0 + 113, var72, var66), 0, 0, 0, 0, var69, 0);
                            } else {
                                int var74 = class193.field3350[var12][var57][var58] + 1;
                                byte var75 = class192.field3326[var12][var57][var58];
                                class1 var76 = class172.method1167((byte) 53, var60 - 1);
                                int var77 = var76.field10;
                                if (var77 >= 0 && !class123.field2318.method407((byte) 39, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class123.field2317[class190.method1249((byte) -91, class123.field2318.method411(var77, 121), 96)];
                                } else if (var76.field3 == -1) {
                                    var79 = 0;
                                    var78 = -2;
                                } else {
                                    var78 = var76.field3;
                                    int var80 = (var78 & 0x7F) + var11;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var10 + var78 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class123.field2317[class190.method1249((byte) -91, var81, 96)];
                                }
                                if (var76.field7 >= 0) {
                                    int var82 = var76.field7;
                                    int var83 = (var82 & 0x7F) + var11;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var10 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var79 = class123.field2317[class190.method1249((byte) -91, var84, 96)];
                                }
                                class16.method64(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class36.method200(2, var70, var66), class36.method200(arg0 ^ 0xFFFFFF93, var71, var66), class36.method200(2, var73, var66), class36.method200(2, var72, var66), class190.method1249((byte) -91, var78, var70), class190.method1249((byte) -91, var78, var71), class190.method1249((byte) -91, var78, var73), class190.method1249((byte) -91, var78, var72), var69, var79);
                            }
                        }
                    }
                }
            }
            class242.field4241[var12] = null;
            class34.field514[var12] = null;
            class193.field3350[var12] = null;
            class192.field3326[var12] = null;
            class165.field2971[var12] = null;
        }
        class86.method604(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class47.field846[1][var13][var50] & 0x2) == 2) {
                    class96.method660(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class250.field4413[var14][var16][var15] & 0x1) != 0) {
                        int var17;
                        for (var17 = var15; var17 < 104 && (class250.field4413[var14][var16][var17 + 1] & 0x1) != 0; var17++) {
                        }
                        int var18 = var14;
                        int var19 = var14;
                        int var20;
                        for (var20 = var15; var20 > 0 && (class250.field4413[var14][var16][var20 - 1] & 0x1) != 0; var20--) {
                        }
                        label348: while (var18 > 0) {
                            for (int var21 = var20; var21 <= var17; var21++) {
                                if ((class250.field4413[var18 - 1][var16][var21] & 0x1) == 0) {
                                    break label348;
                                }
                            }
                            var18--;
                        }
                        label337: while (var19 < 3) {
                            for (int var22 = var20; var22 <= var17; var22++) {
                                if ((class250.field4413[var19 + 1][var16][var22] & 0x1) == 0) {
                                    break label337;
                                }
                            }
                            var19++;
                        }
                        int var23 = (var17 + 1 - var20) * (var19 + 1 - var18);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class30.field453[var18][var16][var20];
                            int var26 = class30.field453[var19][var16][var20] - var24;
                            class88.method624(1, var16 * 128, var16 * 128, var20 * 128, var17 * 128 + 128, var26, var25);
                            for (int var27 = var18; var27 <= var19; var27++) {
                                for (int var28 = var20; var28 <= var17; var28++) {
                                    class250.field4413[var27][var16][var28] = class115.method767(class250.field4413[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class250.field4413[var14][var16][var15] & 0x2) != 0) {
                        int var29 = var16;
                        int var30 = var16;
                        int var31 = var14;
                        while (var29 > 0 && (class250.field4413[var14][var29 - 1][var15] & 0x2) != 0) {
                            var29--;
                        }
                        int var32 = var14;
                        while (var30 < 104 && (class250.field4413[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        label402: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class250.field4413[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label402;
                                }
                            }
                            var31--;
                        }
                        label391: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class250.field4413[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label391;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var30 + 1 - var29) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class30.field453[var32][var29][var15] - var36;
                            int var38 = class30.field453[var31][var29][var15];
                            class88.method624(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class250.field4413[var39][var40][var15] = class115.method767(class250.field4413[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class250.field4413[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44 = var15;
                        while (var43 > 0 && (class250.field4413[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        while (var44 < 104 && (class250.field4413[var14][var16][var44 + 1] & 0x4) != 0) {
                            var44++;
                        }
                        label456: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class250.field4413[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label456;
                                }
                            }
                            var41--;
                        }
                        label445: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class250.field4413[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label445;
                                }
                            }
                            var42++;
                        }
                        if (((var44 + 1 - var43) * (var42 + 1 - var41)) >= 4) {
                            int var47 = class30.field453[var14][var41][var43];
                            class88.method624(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class250.field4413[var14][var48][var49] = class115.method767(class250.field4413[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class243() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        field4256++;
        int var1 = class249.field4344 * 128 + 64;
        int var2 = class188.field3264 * 128 + 64;
        int var3 = class45.method327(var1, class196.field3401, var2, false) - class180.field3160;
        if (class175.field3083 >= 100) {
            class207.field3597 = class249.field4344 * 128 + 64;
            class192.field3330 = class188.field3264 * 128 + 64;
            class134.field2494 = class45.method327(class207.field3597, class196.field3401, class192.field3330, false) - class180.field3160;
        } else {
            if (class207.field3597 < var1) {
                class207.field3597 += (var1 - class207.field3597) * class175.field3083 / 1000 + class174.field3062;
                if (var1 < class207.field3597) {
                    class207.field3597 = var1;
                }
            }
            if (var2 > class192.field3330) {
                class192.field3330 += (var2 - class192.field3330) * class175.field3083 / 1000 + class174.field3062;
                if (class192.field3330 > var2) {
                    class192.field3330 = var2;
                }
            }
            if (var2 < class192.field3330) {
                class192.field3330 -= class174.field3062 + ((class192.field3330 - var2) * class175.field3083 / 1000);
                if (class192.field3330 < var2) {
                    class192.field3330 = var2;
                }
            }
            if (var1 < class207.field3597) {
                class207.field3597 -= (class207.field3597 - var1) * class175.field3083 / 1000 + class174.field3062;
                if (class207.field3597 < var1) {
                    class207.field3597 = var1;
                }
            }
            if (var3 > class134.field2494) {
                class134.field2494 += (var3 - class134.field2494) * class175.field3083 / 1000 + class174.field3062;
                if (var3 < class134.field2494) {
                    class134.field2494 = var3;
                }
            }
            if (class134.field2494 > var3) {
                class134.field2494 -= (class134.field2494 - var3) * class175.field3083 / 1000 + class174.field3062;
                if (class134.field2494 < var3) {
                    class134.field2494 = var3;
                }
            }
        }
        int var4 = class101.field1973 * 128 + 64;
        int var5 = class259.field4560 * 128 + 64;
        int var6 = class45.method327(var5, class196.field3401, var4, false) - class99.field1950;
        if (arg0 != -128) {
            method1603((byte) 116, (class28) null);
        }
        int var7 = var6 - class134.field2494;
        int var8 = var5 - class207.field3597;
        int var9 = var4 - class192.field3330;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class250.field4410;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class253.field4435 < var11) {
            class253.field4435 += (var11 - class253.field4435) * class145.field2659 / 1000 + class30.field454;
            if (class253.field4435 > var11) {
                class253.field4435 = var11;
            }
        }
        if (var13 > 0) {
            class250.field4410 += class145.field2659 * var13 / 1000 + class30.field454;
            class250.field4410 &= 0x7FF;
        }
        if (var13 < 0) {
            class250.field4410 -= class30.field454 + (-var13 * class145.field2659 / 1000);
            class250.field4410 &= 0x7FF;
        }
        int var14 = var12 - class250.field4410;
        if (class253.field4435 > var11) {
            class253.field4435 -= (class253.field4435 - var11) * class145.field2659 / 1000 + class30.field454;
            if (class253.field4435 < var11) {
                class253.field4435 = var11;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class250.field4410 = var12;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method1602(int arg0) {
        if (arg0 != 0) {
            field4245 = -60;
        }
        field4252++;
        if (!class88.method625(arg0 ^ 0x60CD) && class196.field3401 != class105.field2030) {
            class64.method432((byte) -128, class207.field3595.field2086[0], class196.field3401, false, class207.field3595.field2039[0], class157.field2816, class155.field2755);
        } else if (class220.field3771 != class196.field3401) {
            class220.field3771 = class196.field3401;
            class138.method946((byte) -124, class196.field3401);
            class225.method1438(arg0 - 13401);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLcj;)V")
    public static final void method1603(byte arg0, class28 arg1) {
        class88.field1715 = arg1;
        class93.field1781 = class88.field1715.method152(4, 0);
        if (arg0 >= -70) {
            field4248 = null;
        }
        field4254++;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V")
    private class243(int arg0, int arg1, int arg2) {
    }
}
