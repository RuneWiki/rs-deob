import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class326 extends class320 {

    @OriginalMember(owner = "client!n", name = "I", descriptor = "[I")
    private int[] field5005;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
    private int[] field5004;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Lck;")
    private class86 field4998;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Lck;")
    private class86 field5008;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lck;")
    private class86 field5003;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "[Lck;")
    private class86[] field5017;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "Ll;")
    public static class66 field5007 = new class66(128);

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field5013 = 0;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
    public static int[] field5010 = new int[2048];

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Lrn;")
    public static class18 field5016;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z", line = 4)
    public static final boolean method2300(int arg0, int arg1) {
        field5009++;
        class221.field3438 = true;
        if (arg1 <= 36) {
            field5010 = (int[]) null;
        }
        class296.field4597 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I", line = 19)
    public static final int method2301(byte arg0, int arg1) {
        field5021++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        int var4 = 3 % ((-arg0 - 68) / 38);
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZILbe;ILrn;BD)Lum;", line = 77)
    public final class54 method2302(boolean arg0, int arg1, class267 arg2, int arg3, class18 arg4, byte arg5, double arg6) {
        class3.method23((byte) 126, arg6);
        class300.field4654 = arg2;
        class133.field2232 = arg4;
        class295.method2129(arg1, arg3, (byte) -125);
        class54 var9 = new class54(arg3, arg1);
        for (int var10 = 0; var10 < this.field5017.length; var10++) {
            this.field5017[var10].method781(arg1, arg3, 9);
        }
        field4997++;
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5008.field1228) {
                int[] var13 = this.field5008.method158(var12, 104);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field5008.method156(var12, (byte) -128);
                var14 = var17[0];
                var15 = var17[2];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field5003.field1228) {
                var18 = this.field5003.method158(var12, 61);
            } else {
                var18 = this.field5003.method156(var12, (byte) -128)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class51.field787[var22];
                int var24 = class51.field787[var21];
                if (var20 < 0) {
                    var20 = 0;
                }
                int var25 = class51.field787[var20];
                int var26;
                if (var25 == 0 && var23 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field5720[var11++] = (var26 << 24) + ((var25 << 16) + (var23 << 8)) + var24;
                if (arg0) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        if (arg5 <= 2) {
            return (class54) null;
        } else {
            for (int var27 = 0; var27 < this.field5017.length; var27++) {
                this.field5017[var27].method779(true);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V", line = 219)
    public static void method2303(byte arg0) {
        field5016 = null;
        int var1 = 38 % ((38 - arg0) / 52);
        field5010 = null;
        field5007 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lnc;[I[IB[I)V", line = 236)
    public static final void method2304(class171 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        field5000++;
        int var5 = 34 % ((14 - arg3) / 56);
        for (int var6 = 0; var6 < arg4.length; var6++) {
            int var7 = arg4[var6];
            int var8 = arg1[var6];
            int var9 = arg2[var6];
            int var10 = 0;
            while (var8 != 0 && var10 < arg0.field1331.length) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field1331[var10] = null;
                    } else {
                        class93 var11 = class126.method1091((byte) 95, var7);
                        int var12 = var11.field1405;
                        class349 var13 = arg0.field1331[var10];
                        if (var13 != null) {
                            if (var13.field5542 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field1331[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field5543 = var9;
                                    var13.field5547 = 0;
                                    var13.field5539 = 1;
                                    var13.field5541 = 0;
                                    var13.field5535 = 0;
                                    class335.method2358(arg0.field1359, 0, var11, class173.field2746 == arg0, arg0.field1286, true);
                                } else if (var12 == 2) {
                                    var13.field5541 = 0;
                                }
                            } else if (var11.field1423 >= class126.method1091((byte) 125, var13.field5542).field1423) {
                                var13 = arg0.field1331[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class349 var14 = arg0.field1331[var10] = new class349();
                            var14.field5543 = var9;
                            var14.field5547 = 0;
                            var14.field5542 = var7;
                            var14.field5539 = 1;
                            var14.field5541 = 0;
                            var14.field5535 = 0;
                            class335.method2358(arg0.field1359, 0, var11, class173.field2746 == arg0, arg0.field1286, true);
                        }
                    }
                }
                var10++;
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V", line = 331)
    public static final void method2305(byte arg0) {
        field5015++;
        class244.field3803.method1630((byte) 35);
        if (arg0 != -85) {
            field5007 = (class66) null;
        }
        int var1 = class244.field3803.method1632(arg0 + 14623, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class244.field3803.method1632(arg0 + 14623, 2);
        if (var2 == 0) {
            field5010[class120.field1861++] = 2047;
        } else if (var2 == 1) {
            int var3 = class244.field3803.method1632(14538, 3);
            class173.field2746.method818(var3, (byte) -14, 1);
            int var4 = class244.field3803.method1632(arg0 + 14623, 1);
            if (var4 == 1) {
                field5010[class120.field1861++] = 2047;
            }
        } else if (var2 == 2) {
            if (class244.field3803.method1632(14538, 1) == 1) {
                int var9 = class244.field3803.method1632(14538, 3);
                class173.field2746.method818(var9, (byte) 84, 2);
                int var10 = class244.field3803.method1632(arg0 + 14623, 3);
                class173.field2746.method818(var10, (byte) -60, 2);
            } else {
                int var11 = class244.field3803.method1632(14538, 3);
                class173.field2746.method818(var11, (byte) -107, 0);
            }
            int var12 = class244.field3803.method1632(14538, 1);
            if (var12 == 1) {
                field5010[class120.field1861++] = 2047;
            }
        } else if (var2 == 3) {
            int var5 = class244.field3803.method1632(14538, 1);
            int var6 = class244.field3803.method1632(14538, 1);
            if (var6 == 1) {
                field5010[class120.field1861++] = 2047;
            }
            int var7 = class244.field3803.method1632(14538, 7);
            int var8 = class244.field3803.method1632(14538, 7);
            class119.field1826 = class244.field3803.method1632(14538, 2);
            class173.field2746.method1350(var7, var8, (byte) 127, var5 == 1);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(B)V", line = 419)
    public static final void method2306(byte arg0) {
        field5012++;
        if (!class210.field3237) {
            return;
        }
        class342 var1 = class320.method2259(class270.field4155, class259.field3969, 0);
        if (var1 != null && var1.field5276 != null) {
            class112 var2 = new class112();
            var2.field1706 = var1;
            var2.field1711 = var1.field5276;
            class160.method1288((byte) -45, var2);
        }
        if (arg0 > 26) {
            class210.field3237 = false;
            class174.field2761 = -1;
            class339.method2380(var1, 118);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V", line = 450)
    public static final void method2307(int arg0, int arg1) {
        field5014++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class110.field1681 += arg1 * 128;
        if (class75.field1109.length < class110.field1681) {
            class110.field1681 -= class75.field1109.length;
            int var3 = (int) (Math.random() * 12.0D);
            class239.method1774(arg0 ^ 0x7B, class138.field2289[var3]);
        }
        int var4 = arg0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class123.field1975[var4 + var5] - (class75.field1109[class75.field1109.length - 1 & var4 - -class110.field1681] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class123.field1975[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class123.field1975[var10 + var11] = 255;
                } else {
                    class123.field1975[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < (var2 - arg1); var13++) {
            class210.field3240[var13] = class210.field3240[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class210.field3240[var14] = (int) (Math.sin((double) class226.field3530 / 14.0D) * 16.0D + Math.sin((double) class226.field3530 / 15.0D) * 14.0D + Math.sin((double) class226.field3530 / 16.0D) * 12.0D);
            class226.field3530++;
        }
        int var15 = ((class360.field5718 & 0x1) + arg1) / 2;
        class264.field4109 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class264.field4109; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class123.field1975[(var17 << 7) + var18] = 192;
        }
        class264.field4109 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var21 += class123.field1975[var22 + var20 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class123.field1975[var22 - (var15 - var20) - 1];
                }
                if (var22 >= 0) {
                    class245.field3819[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class245.field3819[var15 * 128 + (var23 + var26)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class245.field3819[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class123.field1975[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(B)Lqg;", line = 625)
    public static final class316 method2308(byte arg0) {
        int var1 = -18 % ((arg0 + 59) / 59);
        field5018++;
        return class157.field2519 >= class31.field484.length ? null : class31.field484[class157.field2519++];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILrg;IB)V", line = 639)
    public static final void method2309(int arg0, class342 arg1, int arg2, byte arg3) {
        field5002++;
        if (class66.field1006 < 2 && class78.field1136 == 0 && !class210.field3237 || arg3 != 52) {
            return;
        }
        String var4 = class193.method1473(arg3 ^ 0x34);
        if (arg1 == null) {
            int var6 = class64.field988.method1214(var4, arg0 + 4, arg2 + 15, 16777215, 0, class311.field4821, class76.field1119);
            class89.method800(15, (byte) -64, var6 + class64.field988.method1194(var4), arg2, arg0 + 4);
            return;
        }
        class145 var5 = arg1.method2413(class334.field5114, false);
        if (var5 == null) {
            var5 = class64.field988;
        }
        var5.method1212(var4, arg0, arg2, arg1.field5374, arg1.field5339, arg1.field5277, arg1.field5417, arg1.field5437, arg1.field5398, class311.field4821, class76.field1119, class126.field2115);
        class89.method800(class126.field2115[3], (byte) -64, class126.field2115[2], class126.field2115[1], class126.field2115[0]);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)Z", line = 677)
    public static final boolean method2310(boolean arg0, int arg1) {
        if (arg1 != 3) {
            return false;
        }
        boolean var2 = class357.method2506();
        field5006++;
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class357.method2510();
        } else if (!class357.method2511() || !class357.method2512() || !class357.method2507()) {
            arg0 = false;
        }
        class33.field502 = arg0;
        class235.method1756(false, class340.field5234);
        if (var2 == arg0) {
            return false;
        } else {
            ((class224) class107.field1619).method1680((byte) 104);
            return true;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lbe;IIZILrn;)[F", line = 719)
    public final float[] method2311(class267 arg0, int arg1, int arg2, boolean arg3, int arg4, class18 arg5) {
        field5022++;
        class300.field4654 = arg0;
        class133.field2232 = arg5;
        class295.method2129(arg1, arg4, (byte) -125);
        if (arg2 < 94) {
            method2303((byte) 4);
        }
        for (int var7 = 0; var7 < this.field5017.length; var7++) {
            this.field5017[var7].method781(arg1, arg4, 9);
        }
        int var8 = 0;
        float[] var9 = new float[arg1 * arg4 * 4];
        for (int var10 = 0; var10 < arg1; var10++) {
            if (arg3) {
                var8 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field5008.field1228) {
                int[] var15 = this.field5008.method158(var10, 43);
                var12 = var15;
                var13 = var15;
                var14 = var15;
            } else {
                int[][] var11 = this.field5008.method156(var10, (byte) -127);
                var12 = var11[1];
                var13 = var11[2];
                var14 = var11[0];
            }
            int[] var16;
            if (this.field5003.field1228) {
                var16 = this.field5003.method158(var10, 52);
            } else {
                var16 = this.field5003.method156(var10, (byte) -128)[0];
            }
            int[] var17;
            if (this.field4998.field1228) {
                var17 = this.field4998.method158(var10, 124);
            } else {
                var17 = this.field4998.method156(var10, (byte) -128)[0];
            }
            for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var8++] = (float) var14[var18] * var20;
                var9[var8++] = (float) var12[var18] * var20;
                var9[var8++] = (float) var13[var18] * var20;
                var9[var8++] = var19;
                if (arg3) {
                    var8 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field5017.length; var21++) {
            this.field5017[var21].method779(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IDLbe;ILrn;IZ)Lqn;", line = 830)
    public final class361 method2312(int arg0, double arg1, class267 arg2, int arg3, class18 arg4, int arg5, boolean arg6) {
        field5019++;
        class3.method23((byte) 126, arg1);
        class300.field4654 = arg2;
        class133.field2232 = arg4;
        class295.method2129(arg5, arg3, (byte) -127);
        class361 var9 = new class361(arg3, arg5);
        for (int var10 = 0; var10 < this.field5017.length; var10++) {
            this.field5017[var10].method781(arg5, arg3, 9);
        }
        if (arg0 != 65535) {
            this.field4998 = (class86) null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5008.field1228) {
                int[] var17 = this.field5008.method158(var12, 49);
                var16 = var17;
                var14 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field5008.method156(var12, (byte) -127);
                var14 = var13[0];
                var15 = var13[2];
                var16 = var13[1];
            }
            for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                int var19 = var14[var18] >> 4;
                int var20 = var16[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var18] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var22 = class51.field787[var19];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class51.field787[var21];
                int var24 = class51.field787[var20];
                var9.field5720[var11++] = (var22 << 16) + (var24 << 8) + var23;
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field5017.length; var25++) {
            this.field5017[var25].method779(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILbe;Lrn;ZIDZI)[I", line = 946)
    public final int[] method2313(int arg0, class267 arg1, class18 arg2, boolean arg3, int arg4, double arg5, boolean arg6, int arg7) {
        field5020++;
        class3.method23((byte) 126, arg5);
        int[] var10 = new int[arg4 * arg7];
        class133.field2232 = arg2;
        if (arg0 > -98) {
            this.field5005 = (int[]) null;
        }
        class300.field4654 = arg1;
        class295.method2129(arg4, arg7, (byte) -126);
        for (int var11 = 0; var11 < this.field5017.length; var11++) {
            this.field5017[var11].method781(arg4, arg7, 9);
        }
        int var12 = 0;
        int var13;
        byte var14;
        int var15;
        if (arg3) {
            var13 = -1;
            var14 = -1;
            var15 = arg7 - 1;
        } else {
            var14 = 1;
            var15 = 0;
            var13 = arg7;
        }
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg6) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field5008.field1228) {
                int[] var17 = this.field5008.method158(var16, 70);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field5008.method156(var16, (byte) -128);
                var20 = var21[1];
                var19 = var21[0];
                var18 = var21[2];
            }
            for (int var22 = var15; var22 != var13; var22 += var14) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var18[var22] >> 4;
                int var25 = var20[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class51.field787[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class51.field787[var24];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var28 = class51.field787[var23];
                var10[var12++] = (var26 << 8) + (var28 << 16) + var27;
                if (arg6) {
                    var12 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field5017.length; var29++) {
            this.field5017[var29].method779(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILrn;DLbe;ZBI)[I", line = 1084)
    public final int[] method2314(int arg0, class18 arg1, double arg2, class267 arg3, boolean arg4, byte arg5, int arg6) {
        class3.method23((byte) 126, arg2);
        if (arg5 < 80) {
            return (int[]) null;
        }
        class300.field4654 = arg3;
        field4999++;
        class133.field2232 = arg1;
        int[] var9 = new int[arg6 * 4 * arg0];
        class295.method2129(arg0, arg6, (byte) -126);
        for (int var10 = 0; var10 < this.field5017.length; var10++) {
            this.field5017[var10].method781(arg0, arg6, 9);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg4) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5008.field1228) {
                int[] var17 = this.field5008.method158(var12, 110);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field5008.method156(var12, (byte) -127);
                var14 = var13[1];
                var15 = var13[0];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field5003.field1228) {
                var18 = this.field5003.method158(var12, 91);
            } else {
                var18 = this.field5003.method156(var12, (byte) -127)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var14[var19] >> 4;
                int var22 = class51.field787[var20];
                int var23 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class51.field787[var21];
                int var25 = class51.field787[var23];
                int var26;
                if (var22 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var22 << 16) + (var24 << 8) + (var26 << 24) + var25;
                if (arg4) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field5017.length; var27++) {
            this.field5017[var27].method779(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 1214)
    public class326() {
        this.field5005 = new int[0];
        this.field5004 = new int[0];
        this.field4998 = new class185(0);
        this.field4998.field1245 = 1;
        this.field5008 = new class185();
        this.field5008.field1245 = 1;
        this.field5003 = new class185();
        this.field5003.field1245 = 1;
        this.field5017 = new class86[] { this.field5008, this.field5003, this.field4998 };
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lbe;ILrn;)Z", line = 1231)
    public final boolean method2315(class267 arg0, int arg1, class18 arg2) {
        field5011++;
        if (class133.field2233 <= 0) {
            for (int var4 = 0; var4 < this.field5004.length; var4++) {
                if (!arg2.method199(arg1 + 6833, this.field5004[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5004.length; var5++) {
                if (!arg2.method210(this.field5004[var5], true, class133.field2233)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5005.length; var6++) {
            if (!arg0.method530((byte) -64, this.field5005[var6])) {
                return false;
            }
        }
        if (arg1 != -4624) {
            method2305((byte) 86);
        }
        return true;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lug;)V", line = 1283)
    public class326(class25 arg0) {
        int var2 = 0;
        int var3 = arg0.method281(55);
        this.field5017 = new class86[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class86 var7 = class227.method1699(arg0, (byte) 88);
            if (var7.method778(105) >= 0) {
                var2++;
            }
            if (var7.method776(-1) >= 0) {
                var4++;
            }
            int var8 = var7.field1233.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method281(-128);
            }
            this.field5017[var6] = var7;
        }
        this.field5004 = new int[var2];
        this.field5005 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class86 var13 = this.field5017[var12];
            int var14 = var13.field1233.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field1233[var15] = this.field5017[var5[var12][var15]];
            }
            int var16 = var13.method778(106);
            int var17 = var13.method776(-1);
            if (var16 > 0) {
                this.field5004[var11++] = var16;
            }
            if (var17 > 0) {
                this.field5005[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field5008 = this.field5017[arg0.method281(-128)];
        this.field5003 = this.field5017[arg0.method281(66)];
        this.field4998 = this.field5017[arg0.method281(-126)];
    }
}
