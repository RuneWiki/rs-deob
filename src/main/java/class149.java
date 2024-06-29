import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class149 extends class335 {

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2258 = "Examine";

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "Lpg;")
    public static class320 field2261 = new class320(50);

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!pn", name = "U", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!pn", name = "V", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!pn", name = "T", descriptor = "[I")
    public static int[] field2263;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "[[Z")
    public static boolean[][] field2256;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZIZB)V", line = 4)
    public static final void method1032(boolean arg0, int arg1, boolean arg2, byte arg3) {
        field2262++;
        int var10002;
        for (int var4 = 0; var4 < class312.field4839; var4++) {
            class313 var5 = class254.field3989[class325.field5049[var4]];
            if (var5 != null && var5.method278(-5324) && var5.field4859.method1463(78)) {
                int var6 = var5.method280(false);
                if (arg0) {
                    if (!var5.field4859.field3149) {
                        continue;
                    }
                } else if (arg2 != var5.field4859.field3163 || arg1 != 0 && arg1 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field1905 & 0x7F) == 64 && (var5.field1868 & 0x7F) == 64) {
                        int var13 = var5.field1905 >> 7;
                        int var14 = var5.field1868 >> 7;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            var10002 = class240.field3833[var13][var14]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field1905 & 0x7F) == 0 && (var5.field1868 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field1905 & 0x7F) == 64 && (var5.field1868 & 0x7F) == 64)) {
                    int var7 = var5.field1905 - var6 * 64 >> 7;
                    int var8 = var5.field1868 - (var6 * 64) >> 7;
                    int var9 = var7 + var5.method280(false);
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var10 = var8 + var5.method280(false);
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class240.field3833[var11][var12]++;
                        }
                    }
                }
            }
        }
        if (arg3 < 112) {
            field2263 = (int[]) null;
        }
        label210: for (int var15 = 0; var15 < class312.field4839; var15++) {
            class313 var16 = class254.field3989[class325.field5049[var15]];
            long var17 = (long) class325.field5049[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method278(-5324) && var16.field4859.method1463(19)) {
                int var19 = var16.method280(false);
                if (arg0) {
                    if (!var16.field4859.field3149) {
                        continue;
                    }
                } else if (var16.field4859.field3163 != arg2 || arg1 != 0 && arg1 != var19) {
                    continue;
                }
                var16.field1925 = true;
                if (var19 == 1) {
                    if ((var16.field1905 & 0x7F) == 64 && (var16.field1868 & 0x7F) == 64) {
                        int var29 = var16.field1905 >> 7;
                        int var30 = var16.field1868 >> 7;
                        if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                            continue;
                        }
                        if (class240.field3833[var29][var30] > 1) {
                            var10002 = class240.field3833[var29][var30]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field1905 & 0x7F) == 0 && (var16.field1868 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field1905 & 0x7F) == 64 && (var16.field1868 & 0x7F) == 64) {
                    int var20 = var16.field1905 - (var19 * 64) >> 7;
                    int var21 = var16.field1868 - var19 * 64 >> 7;
                    int var22 = var19 + var21;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var23 = var19 + var20;
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    boolean var24 = true;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    for (int var25 = var20; var25 < var23; var25++) {
                        for (int var26 = var21; var26 < var22; var26++) {
                            if (class240.field3833[var25][var26] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var27 = var20;
                        while (true) {
                            if (var23 <= var27) {
                                continue label210;
                            }
                            for (int var28 = var21; var28 < var22; var28++) {
                                var10002 = class240.field3833[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var16.field4859.field3126) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field1925 = false;
                var16.field1909 = class320.method2181(var16.field1905, var16.field1868, -62, class205.field3101);
                class272.method1874(class205.field3101, var16.field1905, var16.field1868, var16.field1909, (var19 - 1) * 64 + 60, var16, var16.field1939, var17, var16.field1919);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILkh;I)V", line = 255)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field2259++;
        if (arg2 >= 51 && arg0 == 0) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)I", line = 273)
    public static final int method1033(int arg0, int arg1, int arg2) {
        field2257++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == -7044 ? (arg2 & 0xFF80) + var3 : -16;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)[[I", line = 303)
    public final int[][] method249(int arg0, byte arg1) {
        field2264++;
        if (arg1 != 51) {
            method1032(false, -118, true, (byte) -7);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[] var4 = this.method2330(arg0, true, 2);
            int[][] var5 = this.method2328(arg0, false, 0);
            int[][] var6 = this.method2328(arg0, false, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class105.field1630; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var12[var16];
                    var10[var16] = var11[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var12[var16] * var17 + (var14[var16] * var18) >> 12;
                    var10[var16] = var11[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V", line = 384)
    public static void method1034(byte arg0) {
        field2261 = null;
        if (arg0 != -114) {
            field2265 = 123;
        }
        field2263 = null;
        field2256 = (boolean[][]) null;
        field2258 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)[I", line = 401)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            int[] var5 = this.method2330(arg0, true, 1);
            int[] var6 = this.method2330(arg0, true, 2);
            for (int var7 = 0; var7 < class105.field1630; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field2255++;
        if (arg1 != 621) {
            field2261 = (class320) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 450)
    public class149() {
        super(3, false);
    }
}
