import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class324 extends class183 {

    @OriginalMember(owner = "client!an", name = "W", descriptor = "I")
    private int field5463 = 6;

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "Ljf;")
    public static class229 field5467 = class212.method1457((byte) 121, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!an", name = "T", descriptor = "Lni;")
    public static class24 field5460 = new class24(64);

    @OriginalMember(owner = "client!an", name = "ib", descriptor = "Ljf;")
    public static class229 field5475 = class212.method1457((byte) 80, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!an", name = "hb", descriptor = "Ljf;")
    private static class229 field5474 = class212.method1457((byte) 94, "Walk here");

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "Ljf;")
    public static class229 field5469 = field5474;

    @OriginalMember(owner = "client!an", name = "gb", descriptor = "Ljg;")
    public static class303 field5473 = new class303();

    @OriginalMember(owner = "client!an", name = "kb", descriptor = "Ljf;")
    public static class229 field5477 = class212.method1457((byte) 127, "Fertigkeit: ");

    @OriginalMember(owner = "client!an", name = "jb", descriptor = "Ljf;")
    public static class229 field5476 = class212.method1457((byte) 61, "Stufe: ");

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!an", name = "Y", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!an", name = "Z", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!an", name = "db", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!an", name = "fb", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILkh;I)V", line = 6)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field5465++;
        if (arg2 == 0) {
            this.field5463 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field3166 = arg1.method93(false) == 1;
        }
        if (arg0 >= -43) {
            field5476 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)V", line = 42)
    public static final void method2182(byte arg0) {
        field5462++;
        int var1 = class243.field4284 + class301.field5124.field1983;
        int var2 = class63.field1072 + class301.field5124.field2028;
        if (arg0 != -92) {
            method2185(-128, 59);
        }
        if ((class234.field4049 - var1) < -500 || (class234.field4049 - var1) > 500 || (class186.field3246 - var2) < -500 || (class186.field3246 - var2) > 500) {
            class234.field4049 = var1;
            class186.field3246 = var2;
        }
        if (class186.field3246 != var2) {
            class186.field3246 += (var2 - class186.field3246) / 16;
        }
        if (class234.field4049 != var1) {
            class234.field4049 += (var1 - class234.field4049) / 16;
        }
        if (class282.field4836) {
            for (int var3 = 0; var3 < class78.field1436; var3++) {
                int var4 = class249.field4388[var3];
                if (var4 == 98) {
                    class293.field5021 = class293.field5021 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class293.field5021 = class293.field5021 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class229.field3939 = class229.field3939 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class229.field3939 = class229.field3939 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class84.field1613[98]) {
                class98.field1744 += (12 - class98.field1744) / 2;
            } else if (class84.field1613[99]) {
                class98.field1744 += (-class98.field1744 - 12) / 2;
            } else {
                class98.field1744 /= 2;
            }
            if (class84.field1613[96]) {
                class169.field2939 += (-class169.field2939 - 24) / 2;
            } else if (class84.field1613[97]) {
                class169.field2939 += (24 - class169.field2939) / 2;
            } else {
                class169.field2939 /= 2;
            }
            class293.field5021 += class98.field1744 / 2;
            class229.field3939 += class169.field2939 / 2;
        }
        class42.method366(false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lkn;B)V", line = 127)
    public static final void method2183(class198 arg0, byte arg1) {
        class281.field4822 = 3;
        class145 var2 = null;
        class44.method387(true, 1);
        field5464++;
        class329.field5607 = true;
        class252.field4406 = 0;
        class70.field1347 = 0;
        class38.field713 = true;
        class201.field3527 = true;
        class98.field1750 = true;
        int var3 = 0 / ((-arg1 - 78) / 47);
        class221.field3771 = 0;
        class41.field735 = true;
        class243.field4293 = 2;
        class308.field5212 = true;
        class15.field218 = true;
        class27.field487 = 255;
        class327.field5494 = 0;
        class45.field825 = true;
        class302.field5140 = true;
        class329.field5605 = true;
        class298.field5083 = 127;
        class31.field531 = 127;
        class320.field5415 = true;
        class164.method1127(2);
        class1.field6 = 0;
        class118.field2109 = false;
        class282.field4836 = false;
        class186.field3269 = 0;
        try {
            class231 var4 = arg0.method1388(false, "runescape");
            while (var4.field4011 == 0) {
                class235.method1675((byte) -22, 1L);
            }
            if (var4.field4011 == 1) {
                var2 = (class145) var4.field4009;
                byte[] var5 = new byte[(int) var2.method1010(0)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var2.method1007(0, var5.length - var6, var5, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class4.method22(new class14(var5), -113);
            }
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method1009(0);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 829)
    public class324() {
        super(2, false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Z", line = 208)
    public static final boolean method2184(int arg0, byte arg1) {
        field5461++;
        class84.field1616 = true;
        class308.field5208 = arg0 + 1 & 0xFFFF;
        return arg1 == -35 ? true : true;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)[[I", line = 224)
    public final int[][] method12(int arg0, int arg1) {
        field5466++;
        int var3 = -38 % ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var5 = this.method1250(arg1, 0, (byte) 78);
            int[][] var6 = this.method1250(arg1, 1, (byte) 112);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var5[1];
            int[] var10 = var5[0];
            int[] var11 = var4[2];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var5[2];
            int[] var15 = var6[2];
            int var16 = this.field5463;
            if (var16 == 1) {
                for (int var17 = 0; var17 < class22.field393; var17++) {
                    var7[var17] = var10[var17] + var12[var17];
                    var8[var17] = var9[var17] + var13[var17];
                    var11[var17] = var14[var17] + var15[var17];
                }
            } else if (var16 == 2) {
                for (int var18 = 0; var18 < class22.field393; var18++) {
                    var7[var18] = var10[var18] - var12[var18];
                    var8[var18] = var9[var18] - var13[var18];
                    var11[var18] = var14[var18] - var15[var18];
                }
            } else if (var16 == 3) {
                for (int var19 = 0; var19 < class22.field393; var19++) {
                    var7[var19] = var10[var19] * var12[var19] >> 12;
                    var8[var19] = var9[var19] * var13[var19] >> 12;
                    var11[var19] = var14[var19] * var15[var19] >> 12;
                }
            } else if (var16 == 4) {
                for (int var20 = 0; var20 < class22.field393; var20++) {
                    int var21 = var12[var20];
                    int var22 = var13[var20];
                    int var23 = var15[var20];
                    var7[var20] = var21 == 0 ? 4096 : (var10[var20] << 12) / var21;
                    var8[var20] = var22 == 0 ? 4096 : (var9[var20] << 12) / var22;
                    var11[var20] = var23 == 0 ? 4096 : (var14[var20] << 12) / var23;
                }
            } else if (var16 == 5) {
                for (int var24 = 0; var24 < class22.field393; var24++) {
                    var7[var24] = 4096 - ((4096 - var10[var24]) * (4096 - var12[var24]) >> 12);
                    var8[var24] = 4096 - ((4096 - var9[var24]) * (4096 - var13[var24]) >> 12);
                    var11[var24] = 4096 - ((4096 - var14[var24]) * (4096 - var15[var24]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var25 = 0; var25 < class22.field393; var25++) {
                    int var26 = var12[var25];
                    int var27 = var13[var25];
                    int var28 = var15[var25];
                    var7[var25] = var26 < 2048 ? var10[var25] * var26 >> 11 : 4096 - ((4096 - var10[var25]) * (4096 - var26) >> 11);
                    var8[var25] = var27 >= 2048 ? 4096 - ((4096 - var9[var25]) * (4096 - var27) >> 11) : var9[var25] * var27 >> 11;
                    var11[var25] = var28 < 2048 ? var14[var25] * var28 >> 11 : 4096 - ((4096 - var14[var25]) * (4096 - var28) >> 11);
                }
            } else if (var16 == 7) {
                for (int var61 = 0; var61 < class22.field393; var61++) {
                    int var62 = var10[var61];
                    int var63 = var14[var61];
                    int var64 = var9[var61];
                    var7[var61] = var62 == 4096 ? 4096 : (var12[var61] << 12) / (4096 - var62);
                    var8[var61] = var64 == 4096 ? 4096 : (var13[var61] << 12) / (4096 - var64);
                    var11[var61] = var63 == 4096 ? 4096 : (var15[var61] << 12) / (4096 - var63);
                }
            } else if (var16 == 8) {
                for (int var57 = 0; var57 < class22.field393; var57++) {
                    int var58 = var14[var57];
                    int var59 = var10[var57];
                    int var60 = var9[var57];
                    var7[var57] = var59 == 0 ? 0 : 4096 - (4096 - var12[var57] << 12) / var59;
                    var8[var57] = var60 == 0 ? 0 : 4096 - ((4096 - var13[var57] << 12) / var60);
                    var11[var57] = var58 == 0 ? 0 : 4096 - ((4096 - var15[var57] << 12) / var58);
                }
            } else if (var16 == 9) {
                for (int var50 = 0; var50 < class22.field393; var50++) {
                    int var51 = var10[var50];
                    int var52 = var15[var50];
                    int var53 = var9[var50];
                    int var54 = var14[var50];
                    int var55 = var13[var50];
                    int var56 = var12[var50];
                    var7[var50] = var51 >= var56 ? var56 : var51;
                    var8[var50] = var55 > var53 ? var53 : var55;
                    var11[var50] = var52 > var54 ? var54 : var52;
                }
            } else if (var16 == 10) {
                for (int var43 = 0; var43 < class22.field393; var43++) {
                    int var44 = var14[var43];
                    int var45 = var12[var43];
                    int var46 = var9[var43];
                    int var47 = var13[var43];
                    int var48 = var10[var43];
                    int var49 = var15[var43];
                    var7[var43] = var45 < var48 ? var48 : var45;
                    var8[var43] = var47 < var46 ? var46 : var47;
                    var11[var43] = var49 >= var44 ? var49 : var44;
                }
            } else if (var16 == 11) {
                for (int var29 = 0; var29 < class22.field393; var29++) {
                    int var30 = var12[var29];
                    int var31 = var13[var29];
                    int var32 = var14[var29];
                    int var33 = var15[var29];
                    int var34 = var10[var29];
                    int var35 = var9[var29];
                    var7[var29] = var30 < var34 ? var34 - var30 : -var34 + var30;
                    var8[var29] = var35 > var31 ? var35 - var31 : -var35 + var31;
                    var11[var29] = var33 < var32 ? var32 - var33 : -var32 + var33;
                }
            } else if (var16 == 12) {
                for (int var36 = 0; var36 < class22.field393; var36++) {
                    int var37 = var9[var36];
                    int var38 = var14[var36];
                    int var39 = var13[var36];
                    int var40 = var15[var36];
                    int var41 = var10[var36];
                    int var42 = var12[var36];
                    var7[var36] = var41 + var42 - (var41 * var42 >> 11);
                    var8[var36] = var37 + var39 - (var37 * var39 >> 11);
                    var11[var36] = var38 + var40 - (var38 * var40 >> 11);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(II)I", line = 538)
    public static final int method2185(int arg0, int arg1) {
        if (arg1 == 12) {
            field5470++;
            return arg0 & 0xFF;
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(II)[I", line = 556)
    public final int[] method10(int arg0, int arg1) {
        field5472++;
        int[] var3 = this.field3161.method664(arg0, arg1 + 1);
        if (arg1 != -1) {
            return (int[]) null;
        }
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, arg1 + 125);
            int[] var5 = this.method1253(1, arg0, 111);
            int var6 = this.field5463;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class22.field393; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class22.field393; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var7 = 0; var7 < class22.field393; var7++) {
                    var3[var7] = var4[var7] * var5[var7] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class22.field393; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class22.field393; var10++) {
                    var3[var10] = 4096 - ((4096 - var4[var10]) * (4096 - var5[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var27 = 0; var27 < class22.field393; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 >= 2048 ? 4096 - ((4096 - var4[var27]) * (4096 - var28) >> 11) : var4[var27] * var28 >> 11;
                }
            } else if (var6 == 7) {
                for (int var25 = 0; var25 < class22.field393; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 4096 ? 4096 : (var5[var25] << 12) / (4096 - var26);
                }
            } else if (var6 == 8) {
                for (int var11 = 0; var11 < class22.field393; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 0 ? 0 : 4096 - ((4096 - var5[var11] << 12) / var12);
                }
            } else if (var6 == 9) {
                for (int var13 = 0; var13 < class22.field393; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var15 <= var14 ? var15 : var14;
                }
            } else if (var6 == 10) {
                for (int var16 = 0; var16 < class22.field393; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var18 >= var17 ? var18 : var17;
                }
            } else if (var6 == 11) {
                for (int var19 = 0; var19 < class22.field393; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var20 > var21 ? var20 - var21 : var21 - var20;
                }
            } else if (var6 == 12) {
                for (int var22 = 0; var22 < class22.field393; var22++) {
                    int var23 = var4[var22];
                    int var24 = var5[var22];
                    var3[var22] = var23 + var24 - (var23 * var24 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(B)V", line = 804)
    public static void method2186(byte arg0) {
        if (arg0 != 88) {
            field5469 = (class229) null;
        }
        field5473 = null;
        field5474 = null;
        field5475 = null;
        field5469 = null;
        field5460 = null;
        field5467 = null;
        field5477 = null;
        field5476 = null;
    }
}
