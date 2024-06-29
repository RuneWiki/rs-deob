import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class260 extends class286 {

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[I")
    private int[] field4424 = new int[257];

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lbe;")
    public static class283 field4425 = class153.method941(126, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4419 = 0;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Lbe;")
    public static class283 field4428 = class153.method941(-38, "AUS");

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[Lqb;")
    public static class95[] field4421;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[[I")
    private int[][] field4426;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[[[B")
    public static byte[][][] field4416;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lbe;", line = 7)
    public static final class283 method1756(byte arg0, int arg1) {
        class283 var2 = new class283();
        var2.field4812 = 0;
        int var3 = -119 / ((49 - arg0) / 63);
        field4429++;
        var2.field4843 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfe;ZI)V", line = 28)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field4422++;
        if (arg2 != 0) {
            return;
        }
        int var4 = arg0.method1535((byte) 83);
        if (var4 != 0) {
            this.method1760(947, var4);
            return;
        }
        this.field4426 = new int[arg0.method1535((byte) 100)][4];
        for (int var5 = 0; var5 < this.field4426.length; var5++) {
            this.field4426[var5][0] = arg0.method1496(true);
            this.field4426[var5][1] = arg0.method1535((byte) 99) << 4;
            this.field4426[var5][2] = arg0.method1535((byte) 76) << 4;
            this.field4426[var5][3] = arg0.method1535((byte) 75) << 4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[[I", line = 66)
    public final int[][] method16(int arg0, byte arg1) {
        field4415++;
        if (arg1 != -19) {
            field4428 = (class283) null;
        }
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[] var4 = this.method1963(arg0, 0, -1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class27.field410; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4424[var9];
                var5[var8] = class178.method1174(var10, 16711680) >> 12;
                var7[var8] = class178.method1174(var10 >> 4, 4080);
                var6[var8] = class178.method1174(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V", line = 117)
    public static final void method1757(int arg0, int arg1) {
        field4418++;
        if (arg0 != 4096) {
            field4419 = -79;
        }
        class72 var2 = class25.method174(arg1, (byte) -109, 12);
        var2.method479(-24);
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V", line = 130)
    public static void method1758(int arg0) {
        field4421 = null;
        field4428 = null;
        if (arg0 == 1413) {
            field4416 = (byte[][][]) null;
            field4425 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)V", line = 144)
    private final void method1759(int arg0) {
        field4423++;
        if (arg0 != 7) {
            this.method1760(-42, 58);
        }
        int var2 = this.field4426.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var2 > var6 && this.field4426[var6][0] <= var4; var6++) {
                var5++;
            }
            int var8;
            int var9;
            int var10;
            if (var5 >= var2) {
                int[] var7 = this.field4426[var2 - 1];
                var8 = var7[3];
                var9 = var7[2];
                var10 = var7[1];
            } else {
                int[] var11 = this.field4426[var5];
                if (var5 <= 0) {
                    var9 = var11[2];
                    var8 = var11[3];
                    var10 = var11[1];
                } else {
                    int[] var12 = this.field4426[var5 - 1];
                    int var13 = (var4 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[1] * var13 + (var12[1] * var14) >> 12;
                    var9 = var11[2] * var13 + (var12[2] * var14) >> 12;
                    var8 = var11[3] * var13 + (var12[3] * var14) >> 12;
                }
            }
            int var15 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field4424[var3] = class53.method337(class53.method337(var15 << 16, var16 << 8), var17);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 249)
    public class260() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V", line = 263)
    private final void method1760(int arg0, int arg1) {
        field4427++;
        if (arg0 != 947) {
            field4425 = (class283) null;
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field4426 = new int[2][4];
            this.field4426[0][0] = 0;
            this.field4426[1][0] = 4096;
            this.field4426[0][2] = 0;
            this.field4426[0][1] = 0;
            this.field4426[1][2] = 4096;
            this.field4426[1][1] = 4096;
            this.field4426[0][3] = 0;
            this.field4426[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field4426 = new int[8][4];
            this.field4426[0][3] = 2361;
            this.field4426[1][3] = 1558;
            this.field4426[0][1] = 2650;
            this.field4426[1][1] = 2313;
            this.field4426[2][3] = 1413;
            this.field4426[3][3] = 947;
            this.field4426[0][0] = 0;
            this.field4426[1][0] = 2867;
            this.field4426[4][3] = 722;
            this.field4426[5][3] = 1766;
            this.field4426[6][3] = 915;
            this.field4426[2][0] = 3072;
            this.field4426[0][2] = 2602;
            this.field4426[1][2] = 1799;
            this.field4426[3][0] = 3276;
            this.field4426[2][1] = 2618;
            this.field4426[3][1] = 2296;
            this.field4426[4][1] = 2072;
            this.field4426[5][1] = 2730;
            this.field4426[2][2] = 1734;
            this.field4426[3][2] = 1220;
            this.field4426[4][2] = 963;
            this.field4426[4][0] = 3481;
            this.field4426[5][2] = 2152;
            this.field4426[6][2] = 1060;
            this.field4426[6][1] = 2232;
            this.field4426[7][1] = 1686;
            this.field4426[7][3] = 1140;
            this.field4426[7][2] = 1413;
            this.field4426[5][0] = 3686;
            this.field4426[6][0] = 3891;
            this.field4426[7][0] = 4096;
        } else if (arg1 == 3) {
            this.field4426 = new int[7][4];
            this.field4426[0][2] = 0;
            this.field4426[0][0] = 0;
            this.field4426[1][0] = 663;
            this.field4426[0][3] = 4096;
            this.field4426[2][0] = 1363;
            this.field4426[1][2] = 4096;
            this.field4426[3][0] = 2048;
            this.field4426[1][3] = 4096;
            this.field4426[4][0] = 2727;
            this.field4426[5][0] = 3411;
            this.field4426[2][3] = 0;
            this.field4426[3][3] = 0;
            this.field4426[2][2] = 4096;
            this.field4426[6][0] = 4096;
            this.field4426[4][3] = 0;
            this.field4426[5][3] = 4096;
            this.field4426[0][1] = 0;
            this.field4426[3][2] = 4096;
            this.field4426[6][3] = 4096;
            this.field4426[1][1] = 0;
            this.field4426[2][1] = 0;
            this.field4426[3][1] = 4096;
            this.field4426[4][2] = 0;
            this.field4426[4][1] = 4096;
            this.field4426[5][2] = 0;
            this.field4426[6][2] = 0;
            this.field4426[5][1] = 4096;
            this.field4426[6][1] = 0;
        } else if (arg1 == 4) {
            this.field4426 = new int[6][4];
            this.field4426[0][3] = 0;
            this.field4426[0][1] = 0;
            this.field4426[0][2] = 0;
            this.field4426[1][3] = 1493;
            this.field4426[0][0] = 0;
            this.field4426[1][2] = 0;
            this.field4426[1][0] = 1843;
            this.field4426[2][0] = 2457;
            this.field4426[3][0] = 2781;
            this.field4426[2][3] = 2939;
            this.field4426[1][1] = 0;
            this.field4426[3][3] = 3565;
            this.field4426[2][1] = 0;
            this.field4426[2][2] = 0;
            this.field4426[3][2] = 1124;
            this.field4426[4][0] = 3481;
            this.field4426[5][0] = 4096;
            this.field4426[4][2] = 3084;
            this.field4426[5][2] = 4096;
            this.field4426[4][3] = 4031;
            this.field4426[3][1] = 0;
            this.field4426[5][3] = 4096;
            this.field4426[4][1] = 546;
            this.field4426[5][1] = 4096;
        } else if (arg1 == 5) {
            this.field4426 = new int[16][4];
            this.field4426[0][0] = 0;
            this.field4426[1][0] = 155;
            this.field4426[2][0] = 389;
            this.field4426[0][1] = 80;
            this.field4426[1][1] = 321;
            this.field4426[2][1] = 578;
            this.field4426[0][3] = 321;
            this.field4426[3][1] = 947;
            this.field4426[1][3] = 562;
            this.field4426[3][0] = 671;
            this.field4426[4][1] = 1285;
            this.field4426[0][2] = 192;
            this.field4426[4][0] = 897;
            this.field4426[2][3] = 803;
            this.field4426[5][1] = 1525;
            this.field4426[6][1] = 1734;
            this.field4426[5][0] = 1175;
            this.field4426[3][3] = 1140;
            this.field4426[6][0] = 1368;
            this.field4426[7][0] = 1507;
            this.field4426[7][1] = 1413;
            this.field4426[4][3] = 1509;
            this.field4426[8][0] = 1736;
            this.field4426[8][1] = 1108;
            this.field4426[9][0] = 2088;
            this.field4426[1][2] = 449;
            this.field4426[10][0] = 2355;
            this.field4426[2][2] = 690;
            this.field4426[9][1] = 1766;
            this.field4426[3][2] = 995;
            this.field4426[10][1] = 2409;
            this.field4426[11][1] = 3116;
            this.field4426[4][2] = 1397;
            this.field4426[5][2] = 1429;
            this.field4426[12][1] = 3806;
            this.field4426[13][1] = 3437;
            this.field4426[11][0] = 2691;
            this.field4426[5][3] = 1413;
            this.field4426[6][2] = 1461;
            this.field4426[6][3] = 1333;
            this.field4426[7][2] = 1525;
            this.field4426[12][0] = 3031;
            this.field4426[14][1] = 3116;
            this.field4426[7][3] = 1702;
            this.field4426[8][3] = 2056;
            this.field4426[15][1] = 2377;
            this.field4426[8][2] = 1590;
            this.field4426[13][0] = 3522;
            this.field4426[9][3] = 2666;
            this.field4426[9][2] = 2056;
            this.field4426[10][3] = 3276;
            this.field4426[10][2] = 2586;
            this.field4426[11][2] = 3148;
            this.field4426[11][3] = 3228;
            this.field4426[12][3] = 3196;
            this.field4426[14][0] = 3727;
            this.field4426[13][3] = 3019;
            this.field4426[14][3] = 3228;
            this.field4426[12][2] = 3710;
            this.field4426[13][2] = 3421;
            this.field4426[15][0] = 4096;
            this.field4426[15][3] = 2746;
            this.field4426[14][2] = 3148;
            this.field4426[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field4426 = new int[4][4];
            this.field4426[0][0] = 2048;
            this.field4426[1][0] = 2867;
            this.field4426[0][2] = 4096;
            this.field4426[0][3] = 0;
            this.field4426[1][3] = 0;
            this.field4426[2][0] = 3276;
            this.field4426[3][0] = 4096;
            this.field4426[1][2] = 4096;
            this.field4426[2][2] = 4096;
            this.field4426[0][1] = 0;
            this.field4426[3][2] = 0;
            this.field4426[1][1] = 4096;
            this.field4426[2][3] = 0;
            this.field4426[2][1] = 4096;
            this.field4426[3][3] = 0;
            this.field4426[3][1] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[[[BIBII)V", line = 514)
    public static final void method1761(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class109.field1838++;
        class162.field2650 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class254.field4295; var12 < class221.field3716; var12++) {
            class160[][] var13 = class86.field1459[var12];
            for (int var14 = class90.field1518; var14 < class309.field5288; var14++) {
                for (int var15 = class124.field2062; var15 < class88.field1482; var15++) {
                    class160 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class217.field3675[var14 + class241.field4064 - class61.field844][var15 + class241.field4064 - class125.field2078] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field2633 = true;
                            var16.field2611 = true;
                            if (var16.field2627 > 0) {
                                var16.field2640 = true;
                            } else {
                                var16.field2640 = false;
                            }
                            class162.field2650++;
                        } else {
                            var16.field2633 = false;
                            var16.field2611 = false;
                            var16.field2626 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2632 != null) {
                                    class197 var17 = var16.field2632;
                                    var17.field3375.method44(var17.field3363, var17.field3363, (byte) 31, var17.field3365, var17.field3365);
                                    if (var17.field3376 != null) {
                                        var17.field3376.method44(var17.field3363, var17.field3363, (byte) 31, var17.field3365, var17.field3365);
                                    }
                                }
                                if (var16.field2642 != null) {
                                    class291 var18 = var16.field2642;
                                    var18.field4943.method44(var18.field4935, var18.field4935, (byte) 31, var18.field4942, var18.field4942);
                                    if (var18.field4941 != null) {
                                        var18.field4941.method44(var18.field4935, var18.field4935, (byte) 31, var18.field4942, var18.field4942);
                                    }
                                }
                                if (var16.field2617 != null) {
                                    class110 var19 = var16.field2617;
                                    var19.field1855.method44(var19.field1858, var19.field1858, (byte) 31, var19.field1863, var19.field1863);
                                }
                                if (var16.field2623 != null) {
                                    for (int var20 = 0; var20 < var16.field2627; var20++) {
                                        class26 var21 = var16.field2623[var20];
                                        var21.field381.method44(var21.field378, var21.field394, (byte) 31, var21.field395, var21.field398);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class65.field890 == class228.field3834;
        GL var23 = class167.field2806;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class254.method1725();
            class284.method1954(-1, (byte) -90, 3);
            class1.field7 = true;
            class161.method977();
            class309.field5284 = -1;
            class3.field29 = -1;
            for (int var24 = 0; var24 < class3.field35[0].length; var24++) {
                class100 var25 = class3.field35[0][var24];
                float var26 = 251.5F - (var25.field1689 ? 1.0F : 0.5F);
                if (class309.field5284 != var25.field1716) {
                    class309.field5284 = var25.field1716;
                    class137.method851(var25.field1716, (byte) -114);
                    class59.method388(class81.method529(-21663));
                }
                var25.method662(class86.field1459, var26, false);
            }
            class161.method979();
        } else {
            for (int var27 = class254.field4295; var27 < class221.field3716; var27++) {
                for (int var28 = 0; var28 < class3.field35[var27].length; var28++) {
                    class100 var29 = class3.field35[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1689 ? 1.0F : 0.5F);
                    if (var29.field1688 != -1 && class139.field2315.method629(-108, var29.field1688) == 4 && class2.field26) {
                        class137.method851(var29.field1716, (byte) 26);
                    }
                    var29.method662(class86.field1459, var30, false);
                }
                if (var27 == 0 && class23.field345 > 0) {
                    class167.method1058(101.5F);
                    class212.method1391(class61.field844, class125.field2078, class241.field4064, arg1, class217.field3675, class65.field890[0]);
                }
            }
            class17.method95(class61.field844, class125.field2078, class86.field1459);
        }
        var23.glPopMatrix();
        for (int var31 = class254.field4295; var31 < class221.field3716; var31++) {
            class160[][] var32 = class86.field1459[var31];
            for (int var33 = -class241.field4064; var33 <= 0; var33++) {
                int var34 = class61.field844 + var33;
                int var35 = class61.field844 - var33;
                if (var34 >= class90.field1518 || var35 < class309.field5288) {
                    for (int var36 = -class241.field4064; var36 <= 0; var36++) {
                        int var37 = class125.field2078 + var36;
                        int var38 = class125.field2078 - var36;
                        if (var34 >= class90.field1518) {
                            if (var37 >= class124.field2062) {
                                class160 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2633) {
                                    class301.method2039(var39, true);
                                }
                            }
                            if (var38 < class88.field1482) {
                                class160 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2633) {
                                    class301.method2039(var40, true);
                                }
                            }
                        }
                        if (var35 < class309.field5288) {
                            if (var37 >= class124.field2062) {
                                class160 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2633) {
                                    class301.method2039(var41, true);
                                }
                            }
                            if (var38 < class88.field1482) {
                                class160 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2633) {
                                    class301.method2039(var42, true);
                                }
                            }
                        }
                        if (class162.field2650 == 0) {
                            if (!var22) {
                                class34.field511 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class254.field4295; var43 < class221.field3716; var43++) {
            class160[][] var44 = class86.field1459[var43];
            for (int var45 = -class241.field4064; var45 <= 0; var45++) {
                int var46 = class61.field844 + var45;
                int var47 = class61.field844 - var45;
                if (var46 >= class90.field1518 || var47 < class309.field5288) {
                    for (int var48 = -class241.field4064; var48 <= 0; var48++) {
                        int var49 = class125.field2078 + var48;
                        int var50 = class125.field2078 - var48;
                        if (var46 >= class90.field1518) {
                            if (var49 >= class124.field2062) {
                                class160 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2633) {
                                    class301.method2039(var51, false);
                                }
                            }
                            if (var50 < class88.field1482) {
                                class160 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2633) {
                                    class301.method2039(var52, false);
                                }
                            }
                        }
                        if (var47 < class309.field5288) {
                            if (var49 >= class124.field2062) {
                                class160 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2633) {
                                    class301.method2039(var53, false);
                                }
                            }
                            if (var50 < class88.field1482) {
                                class160 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2633) {
                                    class301.method2039(var54, false);
                                }
                            }
                        }
                        if (class162.field2650 == 0) {
                            if (!var22) {
                                class34.field511 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class34.field511 = false;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V", line = 902)
    public final void method276(int arg0) {
        if (arg0 != 3) {
            this.field4424 = (int[]) null;
        }
        if (this.field4426 == null) {
            this.method1760(arg0 ^ 0x3B0, 1);
        }
        field4420++;
        this.method1759(arg0 ^ 0x4);
    }
}
