import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[B")
    private byte[] field248;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[I")
    private int[] field258;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lrd;")
    private static class117 field254 = class95.method812("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", (byte) 8);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lrd;")
    public static class117 field253 = class95.method812("Icons redrawn", (byte) 8);

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lrd;")
    public static class117 field261 = field254;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lrd;")
    private static class117 field263 = class95.method812("glow1:", (byte) 8);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lrd;")
    public static class117 field250 = field263;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lrd;")
    public static class117 field260 = field263;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Z")
    public static boolean field262 = false;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lga;")
    public static class44 field256;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BII[BII)I")
    public final int method104(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg2 >= -18) {
            field261 = null;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg4 << 3;
        field265++;
        while (var7 > arg5) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field258[var10];
            byte var12 = this.field248[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class84.method763(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)I")
    public static final int method105(int arg0, boolean arg1, int arg2) {
        field249++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg0 & 0x7F) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            if (arg1) {
                method109((byte) -82);
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method106(int arg0) {
        field263 = null;
        field253 = null;
        field260 = null;
        if (arg0 != -10227) {
            field263 = null;
        }
        field254 = null;
        field261 = null;
        field250 = null;
        field256 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BI[BIII)I")
    public final int method107(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field252++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        if (arg1 != 24) {
            method105(11, false, -53);
        }
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field267[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var11;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var12;
            if ((var12 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var13;
            if ((var13 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var13;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var14;
            if ((var14 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var14;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var15;
            if ((var15 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var15;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var16;
            if ((var16 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var16;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var17;
            if ((var17 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var17;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field267[var8];
            }
            int var18;
            if ((var18 = this.field267[var8]) < 0) {
                arg2[arg4++] = (byte) ~var18;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method108(int arg0) {
        field251++;
        class128.field3112++;
        class46.method503(true, 5987);
        class44.method487((byte) 35, true);
        class46.method503(false, 5987);
        class44.method487((byte) 35, false);
        class53.method586((byte) 73);
        class140.method1126((byte) -112);
        if (!class20.field492) {
            int var1 = class74.field2060;
            if (class105.field2614 / 256 > var1) {
                var1 = class105.field2614 / 256;
            }
            if (class2.field39[4] && class47.field1316[4] + 128 > var1) {
                var1 = class47.field1316[4] + 128;
            }
            int var2 = class138.field3322 + class132.field3172 & 0x7FF;
            class43.method478(class64.field1829, class133.method1091(class120.field2940, class144.field3516.field751, (byte) 118, class144.field3516.field717) - 50, class107.field2660, var1, var2, arg0 ^ 0xFFFF8A25, var1 * 3 + 600);
        }
        int var3;
        if (class20.field492) {
            var3 = class93.method807((byte) 103);
        } else {
            var3 = class116.method935((byte) 119);
        }
        int var4 = class4.field105;
        int var5 = class38.field1117;
        int var6 = class45.field1271;
        if (arg0 != 30477) {
            field253 = null;
        }
        int var7 = class111.field2784;
        int var8 = class39.field1131;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class2.field39[var9]) {
                int var10 = (int) ((double) -class93.field2344[var9] + Math.random() * (double) (class93.field2344[var9] * 2 + 1) + Math.sin((double) class86.field2252[var9] / 100.0D * (double) class96.field2399[var9]) * (double) class47.field1316[var9]);
                if (var9 == 2) {
                    class4.field105 += var10;
                }
                if (var9 == 4) {
                    class39.field1131 += var10;
                    if (class39.field1131 < 128) {
                        class39.field1131 = 128;
                    }
                    if (class39.field1131 > 383) {
                        class39.field1131 = 383;
                    }
                }
                if (var9 == 0) {
                    class45.field1271 += var10;
                }
                if (var9 == 1) {
                    class38.field1117 += var10;
                }
                if (var9 == 3) {
                    class111.field2784 = class111.field2784 + var10 & 0x7FF;
                }
            }
        }
        class68.method668((byte) 32);
        class28.field845 = class66.field1878 - 4;
        class28.field874 = 0;
        class28.field854 = class121.field2961 - 4;
        class28.field849 = true;
        class49.method544((byte) 115);
        class145.method1159();
        class49.method544((byte) 121);
        class90.field2308.method351(class45.field1271, class38.field1117, class4.field105, class39.field1131, class111.field2784, var3);
        class49.method544((byte) 124);
        class90.field2308.method330();
        class41.method468((byte) 66);
        class84.method765((byte) 107);
        ((class137) class129.field3125).method1114(383, class77.field2094);
        class85.method771(12);
        if (class99.field2464 && class115.method932(true, (byte) -91, false) == 0) {
            class99.field2464 = false;
        }
        if (class99.field2464) {
            class68.method668((byte) 66);
            class145.method1159();
            class110.method910(false, null, -52, class133.field3194);
        }
        class49.method544((byte) 114);
        class46.method499((byte) -125);
        class4.field105 = var4;
        class38.field1117 = var5;
        class45.field1271 = var6;
        class111.field2784 = var7;
        class39.field1131 = var8;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static final void method109(byte arg0) {
        field257++;
        int var1 = class137.field3305.method209(class17.field424);
        if (arg0 < 78) {
            field264 = -72;
        }
        for (int var2 = 0; var2 < class21.field604; var2++) {
            int var12 = class137.field3305.method203(class35.field1051[var2]);
            if (var12 > var1) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class21.field604 * 15 + 21;
        if (class17.field428 != -1) {
            class15.field354 = true;
            class107.field2657 = class21.field604 * 15 + 22;
            client.field613 = 0;
            int var10 = class66.field1873 - var1 / 2;
            int var11 = class68.field1909;
            if (var1 + var10 > 765) {
                var10 = 765 - var1;
            }
            if (var3 + var11 > 503) {
                var11 = 503 - var3;
            }
            if (var10 < 0) {
                var10 = 0;
            }
            if (var11 < 0) {
                var11 = 0;
            }
            class44.field1242 = var11;
            class83.field2178 = var1;
            class138.field3311 = var10;
            return;
        }
        if (class66.field1873 > 4 && class68.field1909 > 4 && class66.field1873 < 516 && class68.field1909 < 338) {
            class15.field354 = true;
            client.field613 = 0;
            class83.field2178 = var1;
            class107.field2657 = class21.field604 * 15 + 22;
            int var4 = class68.field1909 - 4;
            if (var3 + var4 > 334) {
                var4 = 334 - var3;
            }
            int var5 = class66.field1873 - var1 / 2 - 4;
            if (var1 + var5 > 512) {
                var5 = 512 - var1;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class138.field3311 = var5;
            if (var4 < 0) {
                var4 = 0;
            }
            class44.field1242 = var4;
            return;
        }
        if (class66.field1873 > 553 && class68.field1909 > 205 && class66.field1873 < 743 && class68.field1909 < 466) {
            class107.field2657 = class21.field604 * 15 + 22;
            class15.field354 = true;
            int var6 = class66.field1873 - var1 / 2 - 553;
            class83.field2178 = var1;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 + var1 > 190) {
                var6 = 190 - var1;
            }
            client.field613 = 1;
            class138.field3311 = var6;
            int var7 = class68.field1909 - 205;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var3 > 261) {
                var7 = 261 - var3;
            }
            class44.field1242 = var7;
            return;
        }
        if (class66.field1873 <= 17 || class68.field1909 <= 357 || class66.field1873 >= 496 || class68.field1909 >= 453) {
            return;
        }
        class107.field2657 = class21.field604 * 15 + 22;
        class83.field2178 = var1;
        client.field613 = 2;
        class15.field354 = true;
        int var8 = class66.field1873 - var1 / 2 - 17;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 + var1 > 479) {
            var8 = 479 - var1;
        }
        class138.field3311 = var8;
        int var9 = class68.field1909 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class44.field1242 = var9;
        return;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lra;B)V")
    public static final void method110(class114 arg0, byte arg1) {
        field266++;
        short var2 = 256;
        for (int var3 = 0; var3 < class100.field2489.length; var3++) {
            class100.field2489[var3] = 0;
        }
        int var4 = -13 % ((-arg1 - 12) / 41);
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) (Math.random() * 128.0D * (double) var2);
            class100.field2489[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < var2 - 1; var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = var15 + (var13 << 7);
                    class101.field2546[var16] = (class100.field2489[var16 + 128] + class100.field2489[var16 - 128] + class100.field2489[var16 + 1] + class100.field2489[var16 - 1]) / 4;
                }
            }
            int[] var14 = class100.field2489;
            class100.field2489 = class101.field2546;
            class101.field2546 = var14;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.field2798; var8++) {
            for (int var9 = 0; var9 < arg0.field2800; var9++) {
                if (arg0.field2797[var7++] != 0) {
                    int var10 = var9 + arg0.field2795 + 16;
                    int var11 = var8 + arg0.field2801 + 16;
                    int var12 = (var11 << 7) + var10;
                    class100.field2489[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method111(int arg0, int arg1) {
        if (class79.field2112 == 0) {
            class1.field27.method1021(arg0, (byte) -88);
        } else {
            class77.field2108 = arg0;
        }
        field255++;
        if (arg1 != 14410) {
            field253 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public static final void method112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field259++;
        int var5 = arg4;
        if (arg0 >= -25) {
            method109((byte) 34);
        }
        while (arg1 + arg4 >= var5) {
            for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class35.field1044[0][var6][var5] = 127;
                    if (arg3 == var6 && var6 > 0) {
                        class14.field272[0][var6][var5] = class14.field272[0][var6 - 1][var5];
                    }
                    if (arg3 + arg2 == var6 && var6 < 103) {
                        class14.field272[0][var6][var5] = class14.field272[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class14.field272[0][var6][var5] = class14.field272[0][var6][var5 - 1];
                    }
                    if (arg1 + arg4 == var5 && var5 < 103) {
                        class14.field272[0][var6][var5] = class14.field272[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
    public class13(byte[] arg0) {
        int var2 = arg0.length;
        this.field248 = arg0;
        this.field267 = new int[8];
        this.field258 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field258[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class84.method763(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field267[var14] == 0) {
                            this.field267[var14] = var4;
                        }
                        var14 = this.field267[var14];
                    }
                    if (var14 >= this.field267.length) {
                        int[] var17 = new int[this.field267.length * 2];
                        for (int var18 = 0; var18 < this.field267.length; var18++) {
                            var17[var18] = this.field267[var18];
                        }
                        this.field267 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field267[var14] = ~var5;
            }
        }
    }
}
