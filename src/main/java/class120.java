import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class120 extends class23 {

    @OriginalMember(owner = "client!sk", name = "lb", descriptor = "[S")
    private short[] field2034 = new short[257];

    @OriginalMember(owner = "client!sk", name = "wb", descriptor = "I")
    private int field2045 = 0;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Lqd;")
    public static class40 field2023 = class147.method1106("<img=0>", (byte) -108);

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "[I")
    public static int[] field2022 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "Lqd;")
    public static class40 field2021 = class147.method1106("<br>", (byte) -54);

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "Lqd;")
    public static class40 field2029 = class147.method1106("null", (byte) -106);

    @OriginalMember(owner = "client!sk", name = "ub", descriptor = "Lqd;")
    public static class40 field2043 = class147.method1106(":allyreq:", (byte) -83);

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!sk", name = "ib", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!sk", name = "jb", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!sk", name = "nb", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!sk", name = "ob", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!sk", name = "tb", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!sk", name = "hb", descriptor = "Lce;")
    public static class239 field2030;

    @OriginalMember(owner = "client!sk", name = "rb", descriptor = "Ljava/lang/String;")
    public static String field2040;

    @OriginalMember(owner = "client!sk", name = "pb", descriptor = "[I")
    public static int[] field2038;

    @OriginalMember(owner = "client!sk", name = "sb", descriptor = "[I")
    private int[] field2041;

    @OriginalMember(owner = "client!sk", name = "vb", descriptor = "[I")
    private int[] field2044;

    @OriginalMember(owner = "client!sk", name = "qb", descriptor = "[[I")
    private int[][] field2039;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)[I", line = 4)
    private final int[] method900(int arg0, boolean arg1) {
        field2028++;
        if (arg1) {
            field2040 = (String) null;
        }
        if (arg0 >= 0) {
            return arg0 < this.field2039.length ? this.field2039[arg0] : this.field2044;
        } else {
            return this.field2041;
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V", line = 23)
    private final void method901(int arg0) {
        field2027++;
        int var2 = this.field2045;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field2039.length - 1 && this.field2039[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field2039[var22 - 1];
                int[] var24 = this.field2039[var22];
                int var25 = this.method900(var22 - 2, false)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method900(var22 + 1, false)[1];
                int var29 = var28 - var25 - (-var26 + var27);
                int var30 = var25 - var29 - var26;
                int var31 = var27 - var25;
                int var33 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var34 = var31 * var33 >> 12;
                int var35 = var33 * var33 >> 12;
                int var36 = (var29 * var33 >> 12) * var35 >> 12;
                int var37 = var30 * var35 >> 12;
                int var38 = var26 + var37 + var34 + var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2034[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < this.field2039.length - 1 && this.field2039[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field2039[var5 - 1];
                int[] var7 = this.field2039[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - class163.field2705[(var8 & 0x1FE3) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field2034[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; var14 < this.field2039.length - 1 && this.field2039[var14][0] <= var13; var14++) {
                }
                int[] var15 = this.field2039[var14];
                int[] var16 = this.field2039[var14 - 1];
                int var17 = (var13 - var16[0] << 12) / (var15[0] - var16[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field2034[var12] = (short) var19;
            }
        }
        if (arg0 != 1) {
            field2038 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IZ)V", line = 202)
    public static final void method902(int arg0, boolean arg1) {
        field2031++;
        byte[][] var2;
        byte var3;
        if (class21.field350 && arg1) {
            var2 = class88.field1595;
            var3 = 1;
        } else {
            var2 = class265.field4436;
            var3 = 4;
        }
        for (int var4 = arg0; var4 < var3; var4++) {
            class194.method1385(4);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class125.field2160[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class5.field70.length; var13++) {
                                if (class5.field70[var13] == var12 && var2[var13] != null) {
                                    class3.method14(var2[var13], (var10 & 0x7) * 8, var8, arg1, var9, class255.field4247, var6 * 8, 109, (var11 & 0x7) * 8, var5 * 8, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)V", line = 284)
    public static void method903(boolean arg0) {
        field2040 = null;
        field2043 = null;
        field2022 = null;
        if (arg0) {
            method907(-108);
        }
        field2038 = null;
        field2029 = null;
        field2030 = null;
        field2021 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)I", line = 313)
    public static final int method904(int arg0, int arg1) {
        field2032++;
        if (arg1 != -2) {
            method904(58, 49);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBII)V", line = 330)
    public static final void method905(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class21.field350) {
            class111.method847(arg1, arg4, arg1 + arg3, arg0 + arg4);
            class111.method846(arg1, arg4, arg3, arg0, 0);
        } else {
            class115.method870(arg1, arg4, arg1 + arg3, arg0 + arg4);
            class115.method880(arg1, arg4, arg3, arg0, 0);
        }
        field2042++;
        if (class296.field4950 < 100) {
            return;
        }
        if (class50.field953 == null || class50.field953.field2976 != arg3 || class50.field953.field2981 != arg0) {
            class99 var5 = new class99(arg3, arg0);
            class115.method871(var5.field1761, arg3, arg0);
            class169.method1262(0, class268.field4462, (byte) -70, arg0, 0, 0, 0, class233.field3840, arg3);
            if (class21.field350) {
                class50.field953 = new class100(var5);
            } else {
                class50.field953 = var5;
            }
            if (class21.field350) {
                class115.field1978 = null;
            } else {
                class237.field3903.method997(9101);
            }
        }
        class50.field953.method735(arg1, arg4);
        int var6 = class195.field3142 * arg3 / class233.field3840 + arg1;
        int var7 = class123.field2133 * arg0 / class268.field4462 + arg4;
        int var8 = class244.field4031 * arg3 / class233.field3840;
        if (arg2 <= 83) {
            method902(72, false);
        }
        int var9 = class233.field3828 * arg0 / class268.field4462;
        if (class21.field350) {
            class111.method842(var6, var7, var8, var9, 16711680, 128);
            class111.method835(var6, var7, var8, var9, 16711680);
        } else {
            class115.method874(var6, var7, var8, var9, 16711680, 128);
            class115.method881(var6, var7, var8, var9, 16711680);
        }
        if (class33.field668 <= 0 || class33.field668 % 10 >= 5) {
            return;
        }
        for (class165 var10 = (class165) class166.field2745.method1971(100); var10 != null; var10 = (class165) class166.field2745.method1967(100)) {
            if (class248.field4108 == var10.field2732) {
                int var11 = var10.field2734 * arg3 / class233.field3840 + arg1;
                int var12 = var10.field2726 * arg0 / class268.field4462 + arg4;
                if (class21.field350) {
                    class111.method846(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class115.method880(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 423)
    public final void method61(byte arg0) {
        field2024++;
        if (this.field2039 == null) {
            this.field2039 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != 4) {
            field2025 = 36;
        }
        if (this.field2039.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field2045 == 2) {
            this.method906(-113);
        }
        class50.method440((byte) 81);
        this.method901(arg0 ^ 0x5);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 634)
    public class120() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V", line = 458)
    private final void method906(int arg0) {
        int[] var2 = this.field2039[0];
        int[] var3 = this.field2039[1];
        if (arg0 >= -105) {
            this.field2041 = (int[]) null;
        }
        int[] var4 = this.field2039[this.field2039.length - 2];
        int[] var5 = this.field2039[this.field2039.length - 1];
        this.field2044 = new int[] { -var5[0] - (-var4[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
        this.field2041 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        field2037++;
    }

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "(I)V", line = 477)
    public static final void method907(int arg0) {
        class108.field1893 &= 0x7FF;
        field2036++;
        if (class298.field4977 < 128) {
            class298.field4977 = 128;
        }
        if (class298.field4977 > 383) {
            class298.field4977 = 383;
        }
        int var1 = class109.field1909 >> 7;
        int var2 = class206.field3288 >> 7;
        int var3 = class293.method2012(class160.field2671, class109.field1909, 0, class206.field3288);
        if (arg0 <= 124) {
            method904(-73, 27);
        }
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class160.field2671;
                    if (var7 < 3 && (class274.field4564[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class78.field1316[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class254.field4230 < var9) {
            class254.field4230 += (var9 - class254.field4230) / 24;
        } else if (class254.field4230 > var9) {
            class254.field4230 += (var9 - class254.field4230) / 80;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILsd;)V", line = 563)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == arg1) {
            this.field2045 = arg2.method226(arg1 + 255);
            this.field2039 = new int[arg2.method226(255)][2];
            for (int var4 = 0; var4 < this.field2039.length; var4++) {
                this.field2039[var4][0] = arg2.method197(arg1 - 1);
                this.field2039[var4][1] = arg2.method197(-1);
            }
        }
        field2026++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)[I", line = 594)
    public final int[] method32(byte arg0, int arg1) {
        field2035++;
        if (arg0 != -94) {
            this.field2034 = (short[]) null;
        }
        int[] var3 = this.field403.method724((byte) 105, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, arg1);
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field2034[var6];
            }
        }
        return var3;
    }
}
