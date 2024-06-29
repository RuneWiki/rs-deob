import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class131 extends class199 {

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    private int field1786 = 6;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "[C")
    public static char[] field1785 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field1788 = null;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLfd;I)V", line = 4)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field1783++;
        if (arg0 != -43) {
            return;
        }
        if (arg2 == 0) {
            this.field1786 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(IIIIII)V", line = 41)
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1792++;
        int var6 = -106 / ((arg3 - 28) / 53);
        int var7 = arg5 - arg4;
        int var8 = arg1 - arg0;
        if (var7 == 0) {
            if (var8 != 0) {
                class357.method2481(arg4, arg0, arg1, arg2, false);
            }
        } else if (var8 == 0) {
            class314.method2171(true, arg4, arg5, arg2, arg0);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg0 - (arg4 * var9 >> 12);
            int var11;
            int var12;
            if (arg4 < class245.field3574) {
                var12 = var10 + (class245.field3574 * var9 >> 12);
                var11 = class245.field3574;
            } else if (class321.field4722 >= arg4) {
                var11 = arg4;
                var12 = arg0;
            } else {
                var11 = class321.field4722;
                var12 = (class321.field4722 * var9 >> 12) + var10;
            }
            int var13;
            int var14;
            if (arg5 < class245.field3574) {
                var13 = class245.field3574;
                var14 = (class245.field3574 * var9 >> 12) + var10;
            } else if (arg5 <= class321.field4722) {
                var13 = arg5;
                var14 = arg1;
            } else {
                var13 = class321.field4722;
                var14 = (class321.field4722 * var9 >> 12) + var10;
            }
            if (class207.field2937 > var14) {
                var13 = (class207.field2937 - var10 << 12) / var9;
                var14 = class207.field2937;
            } else if (class25.field292 < var14) {
                var13 = (class25.field292 - var10 << 12) / var9;
                var14 = class25.field292;
            }
            if (class207.field2937 > var12) {
                var11 = (class207.field2937 - var10 << 12) / var9;
                var12 = class207.field2937;
            } else if (var12 > class25.field292) {
                var12 = class25.field292;
                var11 = (class25.field292 - var10 << 12) / var9;
            }
            class132.method1009(var14, var11, var12, -1, arg2, var13);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([ILf;I[I[I)V", line = 142)
    public static final void method1003(int[] arg0, class239 arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = -12 / ((arg2 + 74) / 34);
        for (int var6 = 0; var6 < arg4.length; var6++) {
            int var7 = arg4[var6];
            int var8 = arg3[var6];
            int var9 = arg0[var6];
            for (int var10 = 0; var9 != 0 && var10 < arg1.field4859.length; var10++) {
                if ((var9 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field4859[var10] = null;
                    } else {
                        class314 var11 = class207.method1516(var7, 118);
                        class274 var12 = arg1.field4859[var10];
                        int var13 = var11.field4626;
                        if (var12 != null) {
                            if (var12.field3920 == var7) {
                                if (var13 == 0) {
                                    var12 = arg1.field4859[var10] = null;
                                } else if (var13 == 1) {
                                    var12.field3927 = 0;
                                    var12.field3929 = 1;
                                    var12.field3924 = 0;
                                    var12.field3931 = 0;
                                    var12.field3925 = var8;
                                    class296.method2025(var11, arg1.field4893, arg1.field4855, 0, class359.field5616 == arg1, false);
                                } else if (var13 == 2) {
                                    var12.field3931 = 0;
                                }
                            } else if (var11.field4638 >= class207.method1516(var12.field3920, 123).field4638) {
                                var12 = arg1.field4859[var10] = null;
                            }
                        }
                        if (var12 == null) {
                            class274 var14 = arg1.field4859[var10] = new class274();
                            var14.field3920 = var7;
                            var14.field3924 = 0;
                            var14.field3931 = 0;
                            var14.field3925 = var8;
                            var14.field3929 = 1;
                            var14.field3927 = 0;
                            class296.method2025(var11, arg1.field4893, arg1.field4855, 0, class359.field5616 == arg1, false);
                        }
                    }
                }
                var9 >>>= 0x1;
            }
        }
        field1784++;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 234)
    public class131() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lqc;B)V", line = 239)
    public static final void method1004(class331 arg0, byte arg1) {
        class91 var2 = arg0.method2300((byte) 126);
        field1790++;
        arg0.field4897 = var2.field1182;
        if (arg1 != -49) {
            method1004((class331) null, (byte) -72);
        }
        if (arg0.field4845 == 0) {
            arg0.field4932 = 0;
            return;
        }
        if (arg0.field4899 != -1 && arg0.field4885 == 0) {
            class314 var3 = class207.method1516(arg0.field4899, 125);
            if (arg0.field4925 > 0 && var3.field4632 == 0) {
                arg0.field4932++;
                return;
            }
            if (arg0.field4925 <= 0 && var3.field4625 == 0) {
                arg0.field4932++;
                return;
            }
        }
        if (arg0.field4839 != -1 && class313.field4603 >= arg0.field4868) {
            class15 var4 = class234.method1664(arg1 - 79, arg0.field4839);
            if (var4.field181 && var4.field169 != -1) {
                class314 var5 = class207.method1516(var4.field169, arg1 ^ 0xFFFFFFB4);
                if (arg0.field4925 > 0 && var5.field4632 == 0) {
                    arg0.field4932++;
                    return;
                }
                if (arg0.field4925 <= 0 && var5.field4625 == 0) {
                    arg0.field4932++;
                    return;
                }
            }
        }
        int var6 = arg0.field4855;
        int var7 = arg0.field4893;
        int var8 = arg0.field4842[arg0.field4845 - 1] * 128 + (arg0.method1699(arg1 ^ 0x30) * 64);
        int var9 = arg0.field4936[arg0.field4845 - 1] * 128 + (arg0.method1699(-1) * 64);
        if ((var8 - var6) > 256 || var8 - var6 < -256 || (var9 - var7) > 256 || (var9 - var7) < -256) {
            arg0.field4893 = var9;
            arg0.field4855 = var8;
            return;
        }
        if (var8 <= var6) {
            if (var6 <= var8) {
                if (var9 > var7) {
                    arg0.field4912 = 1024;
                } else if (var7 > var9) {
                    arg0.field4912 = 0;
                }
            } else if (var7 < var9) {
                arg0.field4912 = 768;
            } else if (var9 >= var7) {
                arg0.field4912 = 512;
            } else {
                arg0.field4912 = 256;
            }
        } else if (var7 < var9) {
            arg0.field4912 = 1280;
        } else if (var7 > var9) {
            arg0.field4912 = 1792;
        } else {
            arg0.field4912 = 1536;
        }
        int var10 = var2.field1146;
        int var11 = arg0.field4912 - arg0.field4926 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var10 = var2.field1166;
        } else if (var11 >= 256 && var11 < 768) {
            var10 = var2.field1160;
        } else if (var11 >= -768 && var11 <= -256) {
            var10 = var2.field1175;
        }
        if (var10 == -1) {
            var10 = var2.field1166;
        }
        arg0.field4897 = var10;
        int var12 = 4;
        boolean var13 = true;
        if (arg0 instanceof class169) {
            var13 = ((class169) arg0).field2345.field2234;
        }
        byte var14 = 1;
        if (var13) {
            if (arg0.field4926 != arg0.field4912 && arg0.field4870 == -1 && arg0.field4903 != 0) {
                var12 = 2;
            }
            if (arg0.field4845 > 2) {
                var12 = 6;
            }
            if (arg0.field4845 > 3) {
                var12 = 8;
            }
            if (arg0.field4932 > 0 && arg0.field4845 > 1) {
                var12 = 8;
                arg0.field4932--;
            }
        } else {
            if (arg0.field4845 > 1) {
                var12 = 6;
            }
            if (arg0.field4845 > 2) {
                var12 = 8;
            }
            if (arg0.field4932 > 0 && arg0.field4845 > 1) {
                arg0.field4932--;
                var12 = 8;
            }
        }
        if (arg0.field4860[arg0.field4845 - 1] == 2) {
            var14 = 2;
            var12 <<= 0x1;
        } else if (arg0.field4860[arg0.field4845 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field1149 == -1) {
            if (var2.field1174 != -1 && var14 == 0) {
                if (arg0.field4897 == var2.field1146 && var2.field1151 != -1) {
                    arg0.field4897 = var2.field1151;
                } else if (arg0.field4897 == var2.field1175 && var2.field1172 != -1) {
                    arg0.field4897 = var2.field1172;
                } else if (arg0.field4897 == var2.field1160 && var2.field1183 != -1) {
                    arg0.field4897 = var2.field1183;
                } else {
                    arg0.field4897 = var2.field1174;
                }
            }
        } else if (arg0.field4897 == var2.field1146 && var2.field1147 != -1) {
            arg0.field4897 = var2.field1147;
        } else if (arg0.field4897 == var2.field1175 && var2.field1189 != -1) {
            arg0.field4897 = var2.field1189;
        } else if (arg0.field4897 == var2.field1160 && var2.field1178 != -1) {
            arg0.field4897 = var2.field1178;
        } else {
            arg0.field4897 = var2.field1149;
        }
        if (var2.field1161 != -1) {
            int var15 = var12 << 7;
            if (arg0.field4845 == 1) {
                int var16 = arg0.field4888 * arg0.field4888;
                int var17 = (var9 >= arg0.field4893 ? var9 - arg0.field4893 : arg0.field4893 - var9) << 7;
                int var18 = (var8 < arg0.field4855 ? arg0.field4855 - var8 : -arg0.field4855 + var8) << 7;
                int var19 = var17 >= var18 ? var17 : var18;
                int var20 = var2.field1161 * 2 * var19;
                if (var20 < var16) {
                    arg0.field4888 /= 2;
                } else if (var16 / 2 > var19) {
                    arg0.field4888 -= var2.field1161;
                    if (arg0.field4888 < 0) {
                        arg0.field4888 = 0;
                    }
                } else if (arg0.field4888 < var15) {
                    arg0.field4888 += var2.field1161;
                    if (var15 < arg0.field4888) {
                        arg0.field4888 = var15;
                    }
                }
            } else if (arg0.field4888 < var15) {
                arg0.field4888 += var2.field1161;
                if (var15 < arg0.field4888) {
                    arg0.field4888 = var15;
                }
            } else if (arg0.field4888 > 0) {
                arg0.field4888 -= var2.field1161;
                if (arg0.field4888 < 0) {
                    arg0.field4888 = 0;
                }
            }
            var12 = arg0.field4888 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg0.field4893 += var12;
            if (var9 < arg0.field4893) {
                arg0.field4893 = var9;
            }
        } else if (var7 > var9) {
            arg0.field4893 -= var12;
            if (var9 > arg0.field4893) {
                arg0.field4893 = var9;
            }
        }
        if (var6 < var8) {
            arg0.field4855 += var12;
            if (arg0.field4855 > var8) {
                arg0.field4855 = var8;
            }
        } else if (var6 > var8) {
            arg0.field4855 -= var12;
            if (arg0.field4855 < var8) {
                arg0.field4855 = var8;
            }
        }
        if (arg0.field4855 == var8 && arg0.field4893 == var9) {
            arg0.field4845--;
            if (arg0.field4925 > 0) {
                arg0.field4925--;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)V", line = 583)
    public static final void method1005(int arg0, int arg1) {
        field1791++;
        if (arg0 == arg1 || !class44.field548[arg1]) {
            return;
        }
        class284.field4050.method1085(false, arg1);
        if (class26.field308[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class26.field308[arg1].length; var3++) {
            if (class26.field308[arg1][var3] != null) {
                if (class26.field308[arg1][var3].field5105 == 2) {
                    var2 = false;
                } else {
                    class26.field308[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class26.field308[arg1] = null;
        }
        class44.field548[arg1] = false;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)V", line = 624)
    public static final void method1006(int arg0, int arg1) {
        field1789++;
        if (arg1 != 881) {
            field1788 = (String[]) null;
        }
        class42 var2 = class166.method1242(7, arg0, -1249071392);
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(B)V", line = 637)
    public static void method1007(byte arg0) {
        field1788 = null;
        field1785 = null;
        if (arg0 != -26) {
            field1785 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I", line = 650)
    public final int[] method190(int arg0, int arg1) {
        field1787++;
        int[] var3 = this.field2802.method2502(arg1, 119);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 0);
            int[] var5 = this.method1467(-7764, arg1, 1);
            int var6 = this.field1786;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class95.field1235; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class95.field1235; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var8 = 0; var8 < class95.field1235; var8++) {
                    var3[var8] = var4[var8] * var5[var8] >> 12;
                }
            } else if (var6 == 4) {
                for (int var28 = 0; var28 < class95.field1235; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 == 0 ? 4096 : (var4[var28] << 12) / var29;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class95.field1235; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class95.field1235; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 >= 2048 ? 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11) : var4[var9] * var10 >> 11;
                }
            } else if (var6 == 7) {
                for (int var25 = 0; var25 < class95.field1235; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 4096 ? 4096 : (var5[var25] << 12) / (4096 - var26);
                }
            } else if (var6 == 8) {
                for (int var23 = 0; var23 < class95.field1235; var23++) {
                    int var24 = var4[var23];
                    var3[var23] = var24 == 0 ? 0 : 4096 - (4096 - var5[var23] << 12) / var24;
                }
            } else if (var6 == 9) {
                for (int var11 = 0; var11 < class95.field1235; var11++) {
                    int var12 = var4[var11];
                    int var13 = var5[var11];
                    var3[var11] = var12 < var13 ? var12 : var13;
                }
            } else if (var6 == 10) {
                for (int var20 = 0; var20 < class95.field1235; var20++) {
                    int var21 = var4[var20];
                    int var22 = var5[var20];
                    var3[var20] = var21 <= var22 ? var22 : var21;
                }
            } else if (var6 == 11) {
                for (int var14 = 0; var14 < class95.field1235; var14++) {
                    int var15 = var5[var14];
                    int var16 = var4[var14];
                    var3[var14] = var15 < var16 ? var16 - var15 : -var16 + var15;
                }
            } else if (var6 == 12) {
                for (int var17 = 0; var17 < class95.field1235; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var18 + var19 - (var18 * var19 >> 11);
                }
            }
        }
        if (arg0 != -1735) {
            this.field1786 = -126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I", line = 899)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            return (int[][]) ((int[][]) null);
        }
        field1782++;
        int[][] var3 = this.field2796.method2187(arg0, -103);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[][] var5 = this.method1459(1, arg0, (byte) -51);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var5[2];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[0];
            int var15 = this.field1786;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class95.field1235; var63++) {
                    var6[var63] = var8[var63] + var14[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var9[var63] = var11[var63] + var12[var63];
                }
            } else if (var15 == 2) {
                for (int var62 = 0; var62 < class95.field1235; var62++) {
                    var6[var62] = var8[var62] - var14[var62];
                    var7[var62] = var10[var62] - var13[var62];
                    var9[var62] = var12[var62] - var11[var62];
                }
            } else if (var15 == 3) {
                for (int var16 = 0; var16 < class95.field1235; var16++) {
                    var6[var16] = var8[var16] * var14[var16] >> 12;
                    var7[var16] = var10[var16] * var13[var16] >> 12;
                    var9[var16] = var11[var16] * var12[var16] >> 12;
                }
            } else if (var15 == 4) {
                for (int var17 = 0; var17 < class95.field1235; var17++) {
                    int var18 = var13[var17];
                    int var19 = var14[var17];
                    int var20 = var11[var17];
                    var6[var17] = var19 == 0 ? 4096 : (var8[var17] << 12) / var19;
                    var7[var17] = var18 == 0 ? 4096 : (var10[var17] << 12) / var18;
                    var9[var17] = var20 == 0 ? 4096 : (var12[var17] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var61 = 0; var61 < class95.field1235; var61++) {
                    var6[var61] = 4096 - ((4096 - var14[var61]) * (4096 - var8[var61]) >> 12);
                    var7[var61] = 4096 - ((4096 - var10[var61]) * (4096 - var13[var61]) >> 12);
                    var9[var61] = 4096 - ((4096 - var11[var61]) * (4096 - var12[var61]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var57 = 0; var57 < class95.field1235; var57++) {
                    int var58 = var13[var57];
                    int var59 = var14[var57];
                    int var60 = var11[var57];
                    var6[var57] = var59 >= 2048 ? 4096 - ((4096 - var8[var57]) * (4096 - var59) >> 11) : var8[var57] * var59 >> 11;
                    var7[var57] = var58 >= 2048 ? 4096 - ((4096 - var10[var57]) * (4096 - var58) >> 11) : var10[var57] * var58 >> 11;
                    var9[var57] = var60 >= 2048 ? 4096 - ((4096 - var12[var57]) * (4096 - var60) >> 11) : var12[var57] * var60 >> 11;
                }
            } else if (var15 == 7) {
                for (int var53 = 0; var53 < class95.field1235; var53++) {
                    int var54 = var12[var53];
                    int var55 = var10[var53];
                    int var56 = var8[var53];
                    var6[var53] = var56 == 4096 ? 4096 : (var14[var53] << 12) / (4096 - var56);
                    var7[var53] = var55 == 4096 ? 4096 : (var13[var53] << 12) / (4096 - var55);
                    var9[var53] = var54 == 4096 ? 4096 : (var11[var53] << 12) / (4096 - var54);
                }
            } else if (var15 == 8) {
                for (int var21 = 0; var21 < class95.field1235; var21++) {
                    int var22 = var10[var21];
                    int var23 = var12[var21];
                    int var24 = var8[var21];
                    var6[var21] = var24 == 0 ? 0 : 4096 - (4096 - var14[var21] << 12) / var24;
                    var7[var21] = var22 == 0 ? 0 : 4096 - ((4096 - var13[var21] << 12) / var22);
                    var9[var21] = var23 == 0 ? 0 : 4096 - ((4096 - var11[var21] << 12) / var23);
                }
            } else if (var15 == 9) {
                for (int var25 = 0; var25 < class95.field1235; var25++) {
                    int var26 = var12[var25];
                    int var27 = var11[var25];
                    int var28 = var13[var25];
                    int var29 = var14[var25];
                    int var30 = var8[var25];
                    int var31 = var10[var25];
                    var6[var25] = var30 >= var29 ? var29 : var30;
                    var7[var25] = var31 < var28 ? var31 : var28;
                    var9[var25] = var27 <= var26 ? var27 : var26;
                }
            } else if (var15 == 10) {
                for (int var46 = 0; var46 < class95.field1235; var46++) {
                    int var47 = var8[var46];
                    int var48 = var12[var46];
                    int var49 = var11[var46];
                    int var50 = var14[var46];
                    int var51 = var13[var46];
                    int var52 = var10[var46];
                    var6[var46] = var47 > var50 ? var47 : var50;
                    var7[var46] = var52 > var51 ? var52 : var51;
                    var9[var46] = var48 > var49 ? var48 : var49;
                }
            } else if (var15 == 11) {
                for (int var32 = 0; var32 < class95.field1235; var32++) {
                    int var33 = var14[var32];
                    int var34 = var13[var32];
                    int var35 = var12[var32];
                    int var36 = var11[var32];
                    int var37 = var8[var32];
                    int var38 = var10[var32];
                    var6[var32] = var37 <= var33 ? var33 - var37 : -var33 + var37;
                    var7[var32] = var38 <= var34 ? var34 - var38 : -var34 + var38;
                    var9[var32] = var35 <= var36 ? var36 - var35 : -var36 + var35;
                }
            } else if (var15 == 12) {
                for (int var39 = 0; var39 < class95.field1235; var39++) {
                    int var40 = var10[var39];
                    int var41 = var12[var39];
                    int var42 = var14[var39];
                    int var43 = var11[var39];
                    int var44 = var8[var39];
                    int var45 = var13[var39];
                    var6[var39] = var42 + var44 - (var42 * var44 >> 11);
                    var7[var39] = var40 + var45 - (var40 * var45 >> 11);
                    var9[var39] = var41 + var43 - (var41 * var43 >> 11);
                }
            }
        }
        return var3;
    }
}
