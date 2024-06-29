import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class104 extends class273 {

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Z")
    private boolean field1597 = true;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Z")
    private boolean field1603 = true;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "[I")
    public static int[] field1596 = new int[32];

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "[[I")
    public static int[][] field1607 = new int[5][5000];

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Z")
    public static boolean field1609 = true;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 5)
    public static final void method703(int arg0) {
        field1599++;
        class345.field5347.method1296(255);
        int var1 = -53 / ((-arg0 - 42) / 61);
        class310.field4926.method1296(255);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIII)V", line = 17)
    public static final void method704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1611++;
        if (class329.field5084 == 1) {
            class256.field3998[class109.field1691 / 100].method921(class160.field2486 - 8, class213.field3366 + -8);
        }
        if (arg1 != -1445) {
            field1609 = false;
        }
        if (class329.field5084 == 2) {
            class256.field3998[class109.field1691 / 100 + 4].method921(class160.field2486 - 8, class213.field3366 + -8);
        }
        class59.method401(-6726);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)Ln;", line = 41)
    public static final class178 method705(int arg0) {
        field1606++;
        int var1 = class68.field1011[0] * class107.field1652[0];
        byte[] var2 = class46.field644[0];
        if (arg0 != 4050) {
            field1610 = 119;
        }
        class178 var5;
        if (class219.field3488[0]) {
            byte[] var6 = class146.field2307[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class276.method1810(class311.method2135(var6[var8], 255) << 24, class154.field2417[class311.method2135(255, var2[var8])]);
            }
            var5 = new class135(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class154.field2417[class311.method2135(255, var2[var4])];
            }
            var5 = new class178(class116.field1798, class168.field2567, class276.field4257[0], class123.field1919[0], class68.field1011[0], class107.field1652[0], var3);
        }
        class345.method2394((byte) -92);
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIII)I", line = 86)
    public static final int method706(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = class12.field129[class141.method985(arg3, arg2)];
        if (arg1 > 0) {
            int var5 = class12.field126.method479(true, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var7) & 0xFF00FF00) + ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class12.field126.method476(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 8 & 0xFF) * var9;
                int var11 = (var4 >> 16 & 0xFF) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + ((var11 & 0xFD00FF00) << 8) + (var10 & 0xFF00);
            }
        }
        int var13 = -80 % ((78 - arg0) / 48);
        field1595++;
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V", line = 160)
    public static final void method707(int arg0) {
        field1600++;
        if (class88.field1349 == -1 || class253.field3939 == -1) {
            return;
        }
        int var1 = class260.field4040 + ((class144.field2284 - class260.field4040) * class187.field2847 >> 16);
        class187.field2847 += var1;
        if (class187.field2847 >= 65535) {
            if (class93.field1433) {
                class245.field3854 = false;
            } else {
                class245.field3854 = true;
            }
            class187.field2847 = 65535;
            class93.field1433 = true;
        } else {
            class93.field1433 = false;
            class245.field3854 = false;
        }
        float var2 = (float) class187.field2847 / 65535.0F;
        int var3 = class80.field1191 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class303.field4672[class88.field1349][var3][var5] * 3;
            int var7 = (class303.field4672[class88.field1349][var3 + 2][var5] + class303.field4672[class88.field1349][var3 - -2][var5] - class303.field4672[class88.field1349][var3 + 3][var5]) * 3;
            int var8 = class303.field4672[class88.field1349][var3 + 1][var5] * 3;
            int var9 = class303.field4672[class88.field1349][var3][var5];
            int var10 = var8 - var6;
            int var11 = var6 + var7 - (var8 * 2);
            int var12 = class303.field4672[class88.field1349][var3 + 2][var5] + var8 - (var9 - -var7);
            var4[var5] = (((float) var12 * var2 + (float) var11) * var2 + (float) var10) * var2 + (float) var9;
        }
        class298.field4598 = (int) var4[0] - (class30.field374 * 128);
        if (arg0 != 65535) {
            return;
        }
        class169.field2579 = (int) var4[1] * -1;
        class225.field3592 = (int) var4[2] - class294.field4535 * 128;
        int var13 = class131.field2064 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class303.field4672[class253.field3939][var13][var15] * 3;
            int var17 = class303.field4672[class253.field3939][var13 + 1][var15] * 3;
            int var18 = var17 - var16;
            int var19 = (class303.field4672[class253.field3939][var13 + 2][var15] + class303.field4672[class253.field3939][var13 - -2][var15] - class303.field4672[class253.field3939][var13 + 3][var15]) * 3;
            int var20 = class303.field4672[class253.field3939][var13][var15];
            int var21 = var16 + var19 - (var17 * 2);
            int var22 = class303.field4672[class253.field3939][var13 + 2][var15] + var17 - var20 - var19;
            var14[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var18) * var2 + (float) var20;
        }
        float var23 = (var14[1] - var4[1]) * -1.0F;
        float var24 = var14[0] - var4[0];
        float var25 = var14[2] - var4[2];
        double var26 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class4.field49 = (float) Math.atan2((double) var23, var26);
        class69.field1029 = -((float) Math.atan2((double) var24, (double) var25));
        class199.field2989 = (int) ((double) class4.field49 * 325.949D) & 0x7FF;
        class305.field4781 = (int) ((double) class69.field1029 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V", line = 271)
    public static void method708(int arg0) {
        field1607 = (int[][]) null;
        field1596 = null;
        if (arg0 != -10910) {
            method711(-24, true, 27);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIIII)V", line = 285)
    public static final void method709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1604++;
        if (class333.field5166) {
            class238.method1633(arg0, arg2, arg0 + arg3, arg2 - -arg4);
            class238.method1636(arg0, arg2, arg3, arg4, 0);
        } else {
            class57.method395(arg0, arg2, arg0 + arg3, arg2 + arg4);
            class57.method375(arg0, arg2, arg3, arg4, 0);
        }
        if (class74.field1109 < 100) {
            return;
        }
        if (class144.field2285 == null || class144.field2285.field3847 != arg3 || class144.field2285.field3844 != arg4) {
            class178 var5 = new class178(arg3, arg4);
            class57.method377(var5.field2734, arg3, arg4);
            class215.method1440(0, class129.field2021, arg3, 0, class204.field3088, 0, 0, arg4, (byte) -104);
            if (class333.field5166) {
                class144.field2285 = new class186(var5);
            } else {
                class144.field2285 = var5;
            }
            if (class333.field5166) {
                class57.field797 = null;
            } else {
                class42.field594.method27(-10702);
            }
        }
        class144.field2285.method917(arg0, arg2);
        int var6 = class45.field634 * arg4 / class129.field2021 + arg2;
        int var7 = class329.field5083 * arg3 / class204.field3088;
        int var8 = class47.field664 * arg4 / class129.field2021;
        int var9 = class91.field1417 * arg3 / class204.field3088 + arg0;
        if (arg1 != -19025) {
            return;
        }
        int var10 = 16711680;
        if (class2.field25 == 1) {
            var10 = 16777215;
        }
        if (class333.field5166) {
            class238.method1627(var9, var6, var7, var8, var10, 128);
            class238.method1621(var9, var6, var7, var8, var10);
        } else {
            class57.method382(var9, var6, var7, var8, var10, 128);
            class57.method388(var9, var6, var7, var8, var10);
        }
        if (class190.field2894 <= 0) {
            return;
        }
        int var11;
        if (class96.field1470 <= 10) {
            var11 = class96.field1470 * 25;
        } else {
            var11 = 500 - (class96.field1470 * 25);
        }
        for (class282 var12 = (class282) class155.field2431.method10((byte) 78); var12 != null; var12 = (class282) class155.field2431.method13((byte) -32)) {
            if (class30.field368 == var12.field4339) {
                int var13 = var12.field4334 * arg3 / class204.field3088 + arg0;
                int var14 = var12.field4333 * arg4 / class129.field2021 + arg2;
                if (class333.field5166) {
                    class238.method1627(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                } else {
                    class57.method382(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I", line = 395)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            method708(95);
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        field1605++;
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(this.field1603 ? class117.field1819 - arg0 : arg0, -127, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field1597) {
                for (int var12 = 0; var12 < class27.field346; var12++) {
                    var9[var12] = var5[class197.field2963 - var12];
                    var8[var12] = var6[class197.field2963 - var12];
                    var10[var12] = var7[class197.field2963 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class27.field346; var11++) {
                    var9[var11] = var5[var11];
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I", line = 457)
    public final int[] method331(int arg0, int arg1) {
        field1602++;
        if (arg1 != -14650) {
            field1610 = 78;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, this.field1603 ? class117.field1819 - arg0 : arg0, 0);
            if (this.field1597) {
                for (int var5 = 0; var5 < class27.field346; var5++) {
                    var3[var5] = var4[class197.field2963 - var5];
                }
            } else {
                class223.method1504(var4, 0, var3, 0, class27.field346);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I", line = 495)
    public static final int method710(int arg0, byte arg1) {
        field1608++;
        double var2 = (double) (arg0 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var4;
        if (var6 < var4) {
            var8 = var6;
        }
        double var10 = var4;
        if (arg1 < 8) {
            method705(-3);
        }
        if (var2 < var8) {
            var8 = var2;
        }
        if (var4 < var6) {
            var10 = var6;
        }
        if (var2 > var10) {
            var10 = var2;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8);
            } else if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8) + 2.0D;
            } else if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var18 = (int) (var12 * 256.0D);
        int var19 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        double var20 = var14 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        return (var19 >> 1) + (var18 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZI)V", line = 603)
    public static final void method711(int arg0, boolean arg1, int arg2) {
        for (int var3 = 0; var3 < class87.field1311; var3++) {
            class319 var4 = class29.method223((byte) -28, var3);
            if (var4 != null) {
                int var5 = var4.field4994;
                if (var5 >= 0 && !class12.field126.method468(13496, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field5001 >= 0) {
                    int var6 = var4.field5001;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class12.field129[class196.method1328(var8, -30048, 96)];
                } else if (var5 >= 0) {
                    var9 = class12.field129[class196.method1328(class12.field126.method477(7053, var5), -30048, 96)];
                } else if (var4.field5005 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field5005;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class12.field129[class196.method1328(var12, -30048, 96)];
                }
                class157.field2461[var3 + 1] = var9;
            }
        }
        if (!arg1) {
            method704(-116, 98, 55, -54, -109);
        }
        field1598++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 729)
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BILgn;)V", line = 681)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1601++;
        if (arg1 == 0) {
            this.field1597 = arg2.method2043((byte) -128) == 1;
        } else if (arg1 == 1) {
            this.field1603 = arg2.method2043((byte) -118) == 1;
        } else if (arg1 == 2) {
            this.field4194 = arg2.method2043((byte) -117) == 1;
        }
        if (arg0 <= 27) {
            method707(96);
        }
    }
}
