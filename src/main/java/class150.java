import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class150 extends class110 {

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    private int field2256 = 6;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "Ldl;")
    public static class29 field2260;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILre;I)V", line = 5)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 > -37) {
            method1085((byte) 69);
        }
        if (arg0 == 0) {
            this.field2256 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        field2259++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            return (int[]) null;
        }
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        field2261++;
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            int[] var5 = this.method764(1, true, arg1);
            int var6 = this.field2256;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class124.field1936; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class124.field1936; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class124.field1936; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class124.field1936; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class124.field1936; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class124.field1936; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 >= 2048 ? 4096 - ((4096 - var4[var8]) * (4096 - var9) >> 11) : var4[var8] * var9 >> 11;
                }
            } else if (var6 == 7) {
                for (int var10 = 0; var10 < class124.field1936; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 4096 ? 4096 : (var5[var10] << 12) / (4096 - var11);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class124.field1936; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var5[var24] << 12) / var25);
                }
            } else if (var6 == 9) {
                for (int var12 = 0; var12 < class124.field1936; var12++) {
                    int var13 = var4[var12];
                    int var14 = var5[var12];
                    var3[var12] = var13 < var14 ? var13 : var14;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class124.field1936; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 < var23 ? var23 : var22;
                }
            } else if (var6 == 11) {
                for (int var15 = 0; var15 < class124.field1936; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var17 < var16 ? var16 - var17 : -var16 + var17;
                }
            } else if (var6 == 12) {
                for (int var18 = 0; var18 < class124.field1936; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var19 + var20 - (var19 * var20 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 287)
    public class150() {
        super(2, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Llm;B)V", line = 292)
    public static final void method1080(class210 arg0, byte arg1) {
        if (arg1 != -1) {
            method1085((byte) 9);
        }
        field2255++;
        class222.field3387 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)I", line = 305)
    public static final int method1081(int arg0, int arg1, int arg2) {
        int var3 = -92 % ((75 - arg1) / 48);
        field2253++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var4 = (arg0 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V", line = 328)
    public static final void method1082(boolean arg0, int arg1) {
        class237.method1621(89);
        field2257++;
        if (arg1 != -2049 || class293.field4490 != 30 && class293.field4490 != 25) {
            return;
        }
        class54.field681++;
        if (class54.field681 < 50 && !arg0) {
            return;
        }
        class54.field681 = 0;
        if (!class194.field2904 && class168.field2517 != null) {
            class123.field1922++;
            class234.field3507.method28(220, false);
            try {
                class168.field2517.method1134(class234.field3507.field3986, true, class234.field3507.field4025, 0);
                class234.field3507.field4025 = 0;
            } catch (IOException var3) {
                class194.field2904 = true;
            }
        }
        class237.method1621(102);
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V", line = 362)
    public static void method1083(int arg0) {
        if (arg0 != 4096) {
            method1086(22);
        }
        field2260 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IZ)V", line = 375)
    public static final void method1084(int arg0, boolean arg1) {
        if (arg1) {
            if (class123.field1926 != -1) {
                class41.method278(class123.field1926, -108);
            }
            for (class167 var2 = (class167) class295.field4522.method1321((byte) -90); var2 != null; var2 = (class167) class295.field4522.method1330((byte) -61)) {
                class30.method198(var2, true, (byte) 56);
            }
            class123.field1926 = -1;
            class295.field4522 = new class192(8);
            class12.method70(true);
            class123.field1926 = class184.field2759;
            class136.method995(false, 31456);
            class40.method270((byte) -123);
            class64.method428(class123.field1926, (byte) 34);
        }
        class156.field2330 = -1;
        field2249++;
        class61.method412(class90.field1340, arg0 ^ 0xB5E6A090);
        if (arg0 != -28967) {
            field2260 = (class29) null;
        }
        class114.field1750 = new class195();
        class114.field1750.field1566 = 3000;
        class114.field1750.field1505 = 3000;
        if (!class117.field1817) {
            class268.method1889((byte) -124, class68.field898);
            class163.method1155(10, 10);
            return;
        }
        if (class56.field710 == 2) {
            class203.field3052 = class214.field3253 << 7;
            class302.field4612 = class230.field3481 << 7;
        } else {
            class171.method1193(arg0 + 28967);
        }
        class49.method336(false);
        class10.method45(arg0 + 28966);
        class163.method1155(28, 10);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)[[I", line = 441)
    public final int[][] method445(int arg0, boolean arg1) {
        field2251++;
        int[][] var3 = this.field1701.method1477((byte) 84, arg0);
        if (arg1) {
            this.field2256 = -45;
        }
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 69, 0);
            int[][] var5 = this.method770(arg0, (byte) 111, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2256;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class124.field1936; var63++) {
                    var8[var63] = var9[var63] + var12[var63];
                    var6[var63] = var11[var63] + var13[var63];
                    var7[var63] = var10[var63] + var14[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class124.field1936; var16++) {
                    var8[var16] = var9[var16] - var12[var16];
                    var6[var16] = var11[var16] - var13[var16];
                    var7[var16] = var10[var16] - var14[var16];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class124.field1936; var62++) {
                    var8[var62] = var9[var62] * var12[var62] >> 12;
                    var6[var62] = var11[var62] * var13[var62] >> 12;
                    var7[var62] = var10[var62] * var14[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var58 = 0; var58 < class124.field1936; var58++) {
                    int var59 = var12[var58];
                    int var60 = var13[var58];
                    int var61 = var14[var58];
                    var8[var58] = var59 == 0 ? 4096 : (var9[var58] << 12) / var59;
                    var6[var58] = var60 == 0 ? 4096 : (var11[var58] << 12) / var60;
                    var7[var58] = var61 == 0 ? 4096 : (var10[var58] << 12) / var61;
                }
            } else if (var15 == 5) {
                for (int var57 = 0; var57 < class124.field1936; var57++) {
                    var8[var57] = 4096 - ((4096 - var9[var57]) * (4096 - var12[var57]) >> 12);
                    var6[var57] = 4096 - ((4096 - var13[var57]) * (4096 - var11[var57]) >> 12);
                    var7[var57] = 4096 - ((4096 - var10[var57]) * (4096 - var14[var57]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var53 = 0; var53 < class124.field1936; var53++) {
                    int var54 = var13[var53];
                    int var55 = var12[var53];
                    int var56 = var14[var53];
                    var8[var53] = var55 >= 2048 ? 4096 - ((4096 - var9[var53]) * (4096 - var55) >> 11) : var9[var53] * var55 >> 11;
                    var6[var53] = var54 >= 2048 ? 4096 - ((4096 - var54) * (4096 - var11[var53]) >> 11) : var11[var53] * var54 >> 11;
                    var7[var53] = var56 >= 2048 ? 4096 - ((4096 - var10[var53]) * (4096 - var56) >> 11) : var10[var53] * var56 >> 11;
                }
            } else if (var15 == 7) {
                for (int var17 = 0; var17 < class124.field1936; var17++) {
                    int var18 = var9[var17];
                    int var19 = var11[var17];
                    int var20 = var10[var17];
                    var8[var17] = var18 == 4096 ? 4096 : (var12[var17] << 12) / (4096 - var18);
                    var6[var17] = var19 == 4096 ? 4096 : (var13[var17] << 12) / (4096 - var19);
                    var7[var17] = var20 == 4096 ? 4096 : (var14[var17] << 12) / (4096 - var20);
                }
            } else if (var15 == 8) {
                for (int var49 = 0; var49 < class124.field1936; var49++) {
                    int var50 = var9[var49];
                    int var51 = var11[var49];
                    int var52 = var10[var49];
                    var8[var49] = var50 == 0 ? 0 : 4096 - ((4096 - var12[var49] << 12) / var50);
                    var6[var49] = var51 == 0 ? 0 : 4096 - (4096 - var13[var49] << 12) / var51;
                    var7[var49] = var52 == 0 ? 0 : 4096 - ((4096 - var14[var49] << 12) / var52);
                }
            } else if (var15 == 9) {
                for (int var42 = 0; var42 < class124.field1936; var42++) {
                    int var43 = var11[var42];
                    int var44 = var10[var42];
                    int var45 = var14[var42];
                    int var46 = var9[var42];
                    int var47 = var13[var42];
                    int var48 = var12[var42];
                    var8[var42] = var46 < var48 ? var46 : var48;
                    var6[var42] = var43 >= var47 ? var47 : var43;
                    var7[var42] = var45 <= var44 ? var45 : var44;
                }
            } else if (var15 == 10) {
                for (int var21 = 0; var21 < class124.field1936; var21++) {
                    int var22 = var9[var21];
                    int var23 = var10[var21];
                    int var24 = var13[var21];
                    int var25 = var14[var21];
                    int var26 = var12[var21];
                    int var27 = var11[var21];
                    var8[var21] = var26 >= var22 ? var26 : var22;
                    var6[var21] = var24 < var27 ? var27 : var24;
                    var7[var21] = var25 < var23 ? var23 : var25;
                }
            } else if (var15 == 11) {
                for (int var35 = 0; var35 < class124.field1936; var35++) {
                    int var36 = var10[var35];
                    int var37 = var9[var35];
                    int var38 = var14[var35];
                    int var39 = var11[var35];
                    int var40 = var13[var35];
                    int var41 = var12[var35];
                    var8[var35] = var41 >= var37 ? var41 - var37 : -var41 + var37;
                    var6[var35] = var39 > var40 ? var39 - var40 : var40 - var39;
                    var7[var35] = var36 <= var38 ? var38 - var36 : -var38 + var36;
                }
            } else if (var15 == 12) {
                for (int var28 = 0; var28 < class124.field1936; var28++) {
                    int var29 = var9[var28];
                    int var30 = var14[var28];
                    int var31 = var11[var28];
                    int var32 = var13[var28];
                    int var33 = var12[var28];
                    int var34 = var10[var28];
                    var8[var28] = var29 + var33 - (var29 * var33 >> 11);
                    var6[var28] = var31 + var32 - (var31 * var32 >> 11);
                    var7[var28] = var30 + var34 - (var30 * var34 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 755)
    public static final void method1085(byte arg0) {
        class265.field4064.method2176((byte) -66);
        field2252++;
        if (arg0 < 17) {
            field2260 = (class29) null;
        }
        class73.field951.method2176((byte) -16);
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)Ljava/lang/String;", line = 770)
    public static final String method1086(int arg0) {
        if (arg0 != 4096) {
            return (String) null;
        }
        field2258++;
        String var1;
        if (class76.field985 == 1 && class190.field2829 < 2) {
            var1 = class292.field4442 + class299.field4570 + class184.field2760 + " ->";
        } else if (class122.field1907 && class190.field2829 < 2) {
            var1 = class69.field916 + class299.field4570 + class40.field492 + " ->";
        } else if (class96.field1446 && class120.field1879[81] && class190.field2829 > 2) {
            var1 = class163.method1152(-99, class190.field2829 - 2);
        } else {
            var1 = class163.method1152(arg0 - 4201, class190.field2829 - 1);
        }
        if (class190.field2829 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class190.field2829 - 2) + class29.field397;
        }
        return var1;
    }
}
