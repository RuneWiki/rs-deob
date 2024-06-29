import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class203 extends class197 {

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    private int field3517 = 0;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "[S")
    private short[] field3529 = new short[257];

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field3526 = 0;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "Loh;")
    public static class258 field3521 = class153.method1046(":duelstake:", 108);

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "Loh;")
    public static class258 field3528 = class153.method1046("Fps:", 87);

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[I")
    private int[] field3518;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "[I")
    private int[] field3520;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "[[I")
    private int[][] field3522;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILva;I)V", line = 6)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field3514++;
        if (arg0 != 7955 || arg2 != 0) {
            return;
        }
        this.field3517 = arg1.method1589(92);
        this.field3522 = new int[arg1.method1589(123)][2];
        for (int var4 = 0; var4 < this.field3522.length; var4++) {
            this.field3522[var4][0] = arg1.method1615(-124);
            this.field3522[var4][1] = arg1.method1615(-121);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (arg0 != -16221) {
            field3511 = -103;
        }
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, -118, arg1);
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3529[var6];
            }
        }
        field3512++;
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I", line = 81)
    public static final int method1347(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method1347(82, -111, 78, -51);
        }
        field3523++;
        return arg1 >= arg0 ? (arg1 <= arg3 ? arg1 : arg3) : arg0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 94)
    private final void method1348(int arg0) {
        if (arg0 != -7864) {
            this.field3522 = (int[][]) ((int[][]) null);
        }
        int var2 = this.field3517;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field3522.length - 1 && this.field3522[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field3522[var5 - 1];
                int[] var7 = this.field3522[var5];
                int var8 = this.method1349(0, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1349(0, var5 + 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var11 + var9 - var8 - var10;
                int var15 = var8 - var9 - var14;
                int var17 = (var12 * var14 >> 12) * var13 >> 12;
                int var18 = var10 - var8;
                int var19 = var12 * var18 >> 12;
                int var20 = var13 * var15 >> 12;
                int var21 = var9 + var20 + var17 + var19;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3529[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; this.field3522.length - 1 > var32 && var31 >= this.field3522[var32][0]; var32++) {
                }
                int[] var33 = this.field3522[var32 - 1];
                int[] var34 = this.field3522[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class193.field3405[(var35 & 0x1FEC) >> 5] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3529[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; this.field3522.length - 1 > var24 && this.field3522[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field3522[var24 - 1];
                int[] var26 = this.field3522[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var28 + (var26[1] * var27) >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3529[var22] = (short) var29;
            }
        }
        field3524++;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 273)
    public class203() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[I", line = 279)
    private final int[] method1349(int arg0, int arg1) {
        field3525++;
        if (arg1 < 0) {
            return this.field3518;
        } else if (this.field3522.length > arg1) {
            if (arg0 != 0) {
                this.field3520 = (int[]) null;
            }
            return this.field3522[arg1];
        } else {
            return this.field3520;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 297)
    public static void method1350(int arg0) {
        field3521 = null;
        field3528 = null;
        if (arg0 != 170153512) {
            method1347(-111, -53, 114, 35);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 310)
    private final void method1351(int arg0) {
        field3530++;
        int[] var2 = this.field3522[this.field3522.length - 2];
        int[] var3 = this.field3522[1];
        int[] var4 = this.field3522[0];
        if (arg0 > -98) {
            this.method98(99, (class235) null, 55);
        }
        int[] var5 = this.field3522[this.field3522.length - 1];
        this.field3520 = new int[] { var2[0] + var2[0] - var5[0], var2[1] + -var5[1] + var2[1] };
        this.field3518 = new int[] { var4[0] - (var3[0] - var4[0]), var4[1] + var4[1] + -var3[1] };
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 333)
    public static final Object method1352(byte[] arg0, boolean arg1, byte arg2) {
        field3513++;
        int var3 = 69 % ((-arg2 - 13) / 45);
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class83.field1411) {
            try {
                class74 var4 = (class74) Class.forName("na").getDeclaredConstructor().newInstance();
                var4.method548(arg0, (byte) -108);
                return var4;
            } catch (Throwable var6) {
                class83.field1411 = true;
            }
        }
        return arg1 ? class285.method2005(2, arg0) : arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 370)
    public final void method223(int arg0) {
        field3515++;
        if (this.field3522 == null) {
            this.field3522 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 11135) {
            return;
        }
        if (this.field3522.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3517 == 2) {
            this.method1351(-125);
        }
        class72.method540((byte) -126);
        this.method1348(-7864);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([Led;ZI)V", line = 393)
    public static final void method1353(class245[] arg0, boolean arg1, int arg2) {
        field3527++;
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class94.field1653[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class94.field1653[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method1672(var5, (byte) 112, var4);
                            }
                        }
                    }
                }
            }
            class20.field244 += (int) (Math.random() * 5.0D) - 2;
            if (class20.field244 < -8) {
                class20.field244 = -8;
            }
            class283.field4859 += (int) (Math.random() * 5.0D) - 2;
            if (class283.field4859 < -16) {
                class283.field4859 = -16;
            }
            if (class283.field4859 > 16) {
                class283.field4859 = 16;
            }
            if (class20.field244 > 8) {
                class20.field244 = 8;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class20.field244 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class283.field4859 >> 1;
        int[][] var11 = new int[104][104];
        for (int var12 = arg2; var12 < var7; var12++) {
            byte[][] var13 = class214.field3721[var12];
            if (!class257.field4390) {
                int var34 = (int) Math.sqrt(5100.0D);
                int var35 = var34 * 768 >> 8;
                for (int var36 = 1; var36 < 103; var36++) {
                    for (int var37 = 1; var37 < 103; var37++) {
                        byte var38 = 74;
                        int var39 = class201.field3482[var12][var37][var36 + 1] - class201.field3482[var12][var37][var36 - 1];
                        int var40 = class201.field3482[var12][var37 + 1][var36] - class201.field3482[var12][var37 - 1][var36];
                        int var41 = (int) Math.sqrt((double) (var40 * var40 + (var39 * var39) + 65536));
                        int var42 = (var39 << 8) / var41;
                        int var43 = -65536 / var41;
                        int var44 = (var40 << 8) / var41;
                        int var45 = (var42 * -50 + var43 * -10 + var44 * -50) / var35 + var38;
                        int var46 = (var13[var37][var36 - 1] >> 2) + (var13[var37][var36 + 1] >> 3) + (var13[var37][var36] >> 1) + (var13[var37 - 1][var36] >> 2) + (var13[var37 - -1][var36] >> 3);
                        var11[var37][var36] = var45 - var46;
                    }
                }
            } else if (class4.field62) {
                for (int var14 = 1; var14 < 103; var14++) {
                    for (int var15 = 1; var15 < 103; var15++) {
                        byte var16 = 74;
                        int var17 = (var13[var15 - 1][var14] >> 2) + (var13[var15][var14] >> 1) + (var13[var15 - -1][var14] >> 3) + (var13[var15][var14 + 1] >> 3) + (var13[var15][var14 + -1] >> 2);
                        var11[var15][var14] = var16 - var17;
                    }
                }
            } else {
                int var18 = (int) class304.field5189[1];
                int var19 = (int) class304.field5189[0];
                int var20 = (int) class304.field5189[2];
                int var21 = (int) Math.sqrt((double) (var20 * var20 + var18 * var18 + var19 * var19));
                int var22 = var21 * 1024 >> 8;
                for (int var23 = 1; var23 < 103; var23++) {
                    for (int var24 = 1; var24 < 103; var24++) {
                        byte var25 = 96;
                        int var26 = class201.field3482[var12][var24 + 1][var23] - class201.field3482[var12][var24 - 1][var23];
                        int var27 = class201.field3482[var12][var24][var23 + 1] - class201.field3482[var12][var24][var23 - 1];
                        int var28 = (int) Math.sqrt((double) (var26 * var26 + (var27 * var27) + 65536));
                        int var29 = (var26 << 8) / var28;
                        int var30 = -65536 / var28;
                        int var31 = (var27 << 8) / var28;
                        int var32 = (var18 * var30 + var19 * var29 + (var20 * var31)) / var22 + var25;
                        int var33 = (var13[var24][var23] >> 1) + (var13[var24][var23 - 1] >> 2) + ((var13[var24 + -1][var23] >> 2) - -(var13[var24 - -1][var23] >> 3) - -(var13[var24][var23 + 1] >> 3));
                        var11[var24][var23] = var32 - (int) ((float) var33 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class23.field280[var47] = 0;
                class1.field1[var47] = 0;
                class98.field1749[var47] = 0;
                class242.field4197[var47] = 0;
                class36.field457[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class167.field2829[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class259 var52 = class302.method2118(var51 - 1, (byte) 69);
                            class23.field280[var49] += var52.field4510;
                            class1.field1[var49] += var52.field4506;
                            class98.field1749[var49] += var52.field4500;
                            class242.field4197[var49] += var52.field4508;
                            var10002 = class36.field457[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class167.field2829[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class259 var55 = class302.method2118(var54 - 1, (byte) 100);
                            class23.field280[var49] -= var55.field4510;
                            class1.field1[var49] -= var55.field4506;
                            class98.field1749[var49] -= var55.field4500;
                            class242.field4197[var49] -= var55.field4508;
                            var10002 = class36.field457[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 < 104) {
                            var56 += class23.field280[var63];
                            var60 += class36.field457[var63];
                            var59 += class242.field4197[var63];
                            var57 += class98.field1749[var63];
                            var58 += class1.field1[var63];
                        }
                        if (var62 >= 0) {
                            var57 -= class98.field1749[var62];
                            var56 -= class23.field280[var62];
                            var60 -= class36.field457[var62];
                            var58 -= class1.field1[var62];
                            var59 -= class242.field4197[var62];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var9[var48][var61] = class194.method1312(-6773, var56 * 256 / var59, var57 / var60, var58 / var60);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label768: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class110.method807(720049666) || (class94.field1653[0][var64][var65] & 0x2) != 0 || (class94.field1653[var12][var64][var65] & 0x10) == 0 && class90.method671(var12, var65, var64, (byte) -102) == class265.field4626) {
                        if (var12 < class263.field4583) {
                            class263.field4583 = var12;
                        }
                        int var66 = class204.field3540[var12][var64][var65] & 0xFF;
                        int var67 = class167.field2829[var12][var64][var65] & 0xFF;
                        if (var67 > 0 || var66 > 0) {
                            int var68 = class201.field3482[var12][var64 + 1][var65];
                            int var69 = class201.field3482[var12][var64 + 1][var65 + 1];
                            int var70 = class201.field3482[var12][var64][var65];
                            int var71 = class201.field3482[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var67 == 0 && class242.field4206[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var66 > 0 && !class128.method922(var66 - 1, 31532).field1238) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var69 == var70 && var70 == var71) {
                                    class68.field1180[var12][var64][var65] = class307.method2139(class68.field1180[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var76;
                            if (var67 > 0) {
                                var73 = var9[var64][var65];
                                int var74 = (var73 & 0x7F) + var10;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class266.field4634[class102.method773(var75, 96, (byte) -80)];
                            } else {
                                var73 = -1;
                                var76 = 0;
                            }
                            int var77 = var11[var64 + 1][var65];
                            int var78 = var11[var64 + 1][var65 + 1];
                            int var79 = var11[var64][var65];
                            int var80 = var11[var64][var65 + 1];
                            if (var66 == 0) {
                                class201.method1336(var12, var64, var65, 0, 0, -1, var70, var68, var69, var71, class102.method773(var73, var79, (byte) -80), class102.method773(var73, var77, (byte) -80), class102.method773(var73, var78, (byte) -80), class102.method773(var73, var80, (byte) -80), 0, 0, 0, 0, var76, 0);
                                if (class257.field4390 && var12 > 0 && var73 != -1 && class302.method2118(var67 - 1, (byte) 74).field4514) {
                                    class9.method53(0, 0, true, false, var64, var65, var70 - class201.field3482[0][var64][var65], -class201.field3482[0][var64 + 1][var65] + var68, var69 - class201.field3482[0][var64 + 1][var65 + 1], -class201.field3482[0][var64][var65 + 1] + var71);
                                }
                                if (class257.field4390 && !arg1 && class299.field5116 != null && var12 == 0) {
                                    for (int var96 = var64 - 1; var96 <= var64 + 1; var96++) {
                                        for (int var97 = var65 - 1; var97 <= (var65 + 1); var97++) {
                                            if ((var64 != var96 || var65 != var97) && var96 >= 0 && var96 < 104 && var97 >= 0 && var97 < 104) {
                                                int var98 = class204.field3540[var12][var96][var97] & 0xFF;
                                                if (var98 != 0) {
                                                    class71 var99 = class128.method922(var98 - 1, 31532);
                                                    if (var99.field1259 != -1 && class266.field4643.method186((byte) 119, var99.field1259) == 4) {
                                                        class299.field5116[var64][var65] = (var99.field1239 << 24) + var99.field1254;
                                                        continue label768;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                byte var81 = class152.field2613[var12][var64][var65];
                                int var82 = class242.field4206[var12][var64][var65] + 1;
                                class71 var83 = class128.method922(var66 - 1, 31532);
                                if (class257.field4390 && !arg1 && class299.field5116 != null && var12 == 0) {
                                    if (var83.field1259 != -1 && class266.field4643.method186((byte) 120, var83.field1259) == 4) {
                                        class299.field5116[var64][var65] = (var83.field1239 << 24) + var83.field1254;
                                    } else {
                                        label734: for (int var84 = var64 - 1; var84 <= var64 + 1; var84++) {
                                            for (int var85 = var65 - 1; var85 <= var65 + 1; var85++) {
                                                if ((var64 != var84 || var65 != var85) && var84 >= 0 && var84 < 104 && var85 >= 0 && var85 < 104) {
                                                    int var86 = class204.field3540[var12][var84][var85] & 0xFF;
                                                    if (var86 != 0) {
                                                        class71 var87 = class128.method922(var86 - 1, 31532);
                                                        if (var87.field1259 != -1 && class266.field4643.method186((byte) 115, var87.field1259) == 4) {
                                                            class299.field5116[var64][var65] = (var87.field1239 << 24) + var87.field1254;
                                                            break label734;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var88 = var83.field1259;
                                if (var88 >= 0 && !class266.field4643.method189(var88, (byte) 124)) {
                                    var88 = -1;
                                }
                                int var89;
                                int var90;
                                if (var88 >= 0) {
                                    var89 = class266.field4634[class176.method1211(class266.field4643.method196(var88, true), (byte) -43, 96)];
                                    var90 = -1;
                                } else if (var83.field1235 == -1) {
                                    var90 = -2;
                                    var89 = 0;
                                } else {
                                    var90 = var83.field1235;
                                    int var91 = (var90 & 0x7F) + var10;
                                    if (var91 < 0) {
                                        var91 = 0;
                                    } else if (var91 > 127) {
                                        var91 = 127;
                                    }
                                    int var92 = (var8 + var90 & 0xFC00) + ((var90 & 0x380) + var91);
                                    var89 = class266.field4634[class176.method1211(var92, (byte) -7, 96)];
                                }
                                if (var83.field1258 >= 0) {
                                    int var93 = var83.field1258;
                                    int var94 = (var93 & 0x7F) + var10;
                                    if (var94 < 0) {
                                        var94 = 0;
                                    } else if (var94 > 127) {
                                        var94 = 127;
                                    }
                                    int var95 = (var8 + var93 & 0xFC00) + (var93 & 0x380) + var94;
                                    var89 = class266.field4634[class176.method1211(var95, (byte) -21, 96)];
                                }
                                class201.method1336(var12, var64, var65, var82, var81, var88, var70, var68, var69, var71, class102.method773(var73, var79, (byte) -80), class102.method773(var73, var77, (byte) -80), class102.method773(var73, var78, (byte) -80), class102.method773(var73, var80, (byte) -80), class176.method1211(var90, (byte) 115, var79), class176.method1211(var90, (byte) 123, var77), class176.method1211(var90, (byte) -47, var78), class176.method1211(var90, (byte) -85, var80), var76, var89);
                                if (class257.field4390 && var12 > 0) {
                                    class9.method53(var82, var81, var90 == -2 || !var83.field1246, var73 == -1 || !class302.method2118(var67 - 1, (byte) 80).field4514, var64, var65, var70 - class201.field3482[0][var64][var65], var68 - class201.field3482[0][var64 + 1][var65], var69 - class201.field3482[0][var64 + 1][var65 + 1], var71 - class201.field3482[0][var64][var65 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class257.field4390) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class201.field3482[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class157[] var114 = class190.method1286(class94.field1653, class201.field3482[var12], class134.field2317[0], class299.field5116, var101, var100, var12, class152.field2613[var12], var11, class242.field4206[var12], var9, class167.field2829[var12], 19327, class204.field3540[var12], var103);
                            class307.method2141(var12, var114);
                            break;
                        }
                        class157[] var109 = class190.method1286(class94.field1653, class201.field3482[var12], (int[][]) null, (int[][]) null, var101, var100, var12, class152.field2613[var12], var11, class242.field4206[var12], var9, class167.field2829[var12], 19327, class204.field3540[var12], var103);
                        class157[] var110 = class294.method2060(class152.field2613[var12], class204.field3540[var12], var12, var100, var101, (byte) -118, class201.field3482[var12], class242.field4206[var12], class167.field2829[var12], var11, var103, class94.field1653);
                        class157[] var111 = new class157[var109.length + var110.length];
                        for (int var112 = 0; var112 < var109.length; var112++) {
                            var111[var112] = var109[var112];
                        }
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var111[var109.length + var113] = var110[var113];
                        }
                        class307.method2141(var12, var111);
                        class155.method1055(var103, class201.field3482[var12], 3, class267.field4647, class242.field4206[var12], var101, var100, class152.field2613[var12], class204.field3540[var12], class167.field2829[var12], var12, class267.field4651);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        int var107 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        float var108 = (float) Math.sqrt((double) (var106 * var106 + var107 * var107 + 65536));
                        var100[var105][var104] = (float) var107 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var106 / var108;
                    }
                    var104++;
                }
            }
            class167.field2829[var12] = (byte[][]) null;
            class204.field3540[var12] = (byte[][]) null;
            class242.field4206[var12] = (byte[][]) null;
            class152.field2613[var12] = (byte[][]) null;
            class214.field3721[var12] = (byte[][]) null;
        }
        class170.method1135(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class94.field1653[1][var115][var116] & 0x2) == 2) {
                    class65.method499(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class68.field1180[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class68.field1180[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121 = var118;
                        int var122 = var117;
                        while (var121 < 104 && (class68.field1180[var117][var119][var121 + 1] & 0x1) != 0) {
                            var121++;
                        }
                        int var123;
                        label451: for (var123 = var117; var123 > 0; var123--) {
                            for (int var124 = var120; var124 <= var121; var124++) {
                                if ((class68.field1180[var123 - 1][var119][var124] & 0x1) == 0) {
                                    break label451;
                                }
                            }
                        }
                        label440: while (var122 < 3) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class68.field1180[var122 + 1][var119][var125] & 0x1) == 0) {
                                    break label440;
                                }
                            }
                            var122++;
                        }
                        int var126 = (var121 + 1 - var120) * (var122 + 1 - var123);
                        if (var126 >= 8) {
                            short var127 = 240;
                            int var128 = class201.field3482[var122][var119][var120] - var127;
                            int var129 = class201.field3482[var123][var119][var120];
                            class83.method601(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var128, var129);
                            for (int var130 = var123; var130 <= var122; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class68.field1180[var130][var119][var131] = class2.method15(class68.field1180[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class68.field1180[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var117;
                        while (var132 < 104 && (class68.field1180[var117][var132 + 1][var118] & 0x2) != 0) {
                            var132++;
                        }
                        int var134 = var119;
                        int var135 = var117;
                        while (var134 > 0 && (class68.field1180[var117][var134 - 1][var118] & 0x2) != 0) {
                            var134--;
                        }
                        label506: while (var133 > 0) {
                            for (int var136 = var134; var136 <= var132; var136++) {
                                if ((class68.field1180[var133 - 1][var136][var118] & 0x2) == 0) {
                                    break label506;
                                }
                            }
                            var133--;
                        }
                        label495: while (var135 < 3) {
                            for (int var137 = var134; var137 <= var132; var137++) {
                                if ((class68.field1180[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label495;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var132 - (var134 - 1)) * (var135 + 1 - var133);
                        if (var138 >= 8) {
                            short var139 = 240;
                            int var140 = class201.field3482[var135][var134][var118] - var139;
                            int var141 = class201.field3482[var133][var134][var118];
                            class83.method601(2, var134 * 128, var132 * 128 + 128, var118 * 128, var118 * 128, var140, var141);
                            for (int var142 = var133; var142 <= var135; var142++) {
                                for (int var143 = var134; var143 <= var132; var143++) {
                                    class68.field1180[var142][var143][var118] = class2.method15(class68.field1180[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class68.field1180[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var118;
                        int var146 = var119;
                        int var147 = var118;
                        while (var145 > 0 && (class68.field1180[var117][var119][var145 - 1] & 0x4) != 0) {
                            var145--;
                        }
                        while (var147 < 104 && (class68.field1180[var117][var119][var147 + 1] & 0x4) != 0) {
                            var147++;
                        }
                        label560: while (var144 > 0) {
                            for (int var148 = var145; var148 <= var147; var148++) {
                                if ((class68.field1180[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label560;
                                }
                            }
                            var144--;
                        }
                        label549: while (var146 < 104) {
                            for (int var149 = var145; var149 <= var147; var149++) {
                                if ((class68.field1180[var117][var146 + 1][var149] & 0x4) == 0) {
                                    break label549;
                                }
                            }
                            var146++;
                        }
                        if ((var147 + 1 - var145) * (var146 + 1 - var144) >= 4) {
                            int var150 = class201.field3482[var117][var144][var145];
                            class83.method601(4, var144 * 128, var146 * 128 + 128, var145 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var146; var151++) {
                                for (int var152 = var145; var152 <= var147; var152++) {
                                    class68.field1180[var117][var151][var152] = class2.method15(class68.field1180[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
