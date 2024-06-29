import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class210 extends class335 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    private int field3210 = 0;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    private int field3211 = 4096;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Z")
    public static boolean field3208 = true;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "Z")
    public static boolean field3212;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method249(int arg0, byte arg1) {
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        field3209++;
        if (this.field5232.field2446) {
            int[][] var4 = this.method2328(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class105.field1630; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field3210) {
                    var9[var11] = this.field3210;
                } else if (this.field3211 >= var12) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field3211;
                }
                if (this.field3210 > var13) {
                    var8[var11] = this.field3210;
                } else if (this.field3211 < var13) {
                    var8[var11] = this.field3211;
                } else {
                    var8[var11] = var13;
                }
                if (this.field3210 > var14) {
                    var10[var11] = this.field3210;
                } else if (this.field3211 < var14) {
                    var10[var11] = this.field3211;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)[I", line = 86)
    public final int[] method149(int arg0, int arg1) {
        field3213++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                int var6 = var4[var5];
                if (this.field3210 > var6) {
                    var3[var5] = this.field3210;
                } else if (this.field3211 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field3211;
                }
            }
        }
        if (arg1 != 621) {
            this.method149(100, -29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V", line = 135)
    public static final void method1487() {
        class160.field2412 = 0;
        label194: for (int var0 = 0; var0 < class206.field3169; var0++) {
            class282 var1 = class175.field2650[var0];
            if (class16.field233 != null) {
                for (int var2 = 0; var2 < class16.field233.length; var2++) {
                    if (class16.field233[var2] != -1000000 && (var1.field4358 <= class16.field233[var2] || var1.field4357 <= class16.field233[var2]) && (var1.field4372 <= class31.field450[var2] || var1.field4351 <= class31.field450[var2]) && (var1.field4372 >= class201.field3021[var2] || var1.field4351 >= class201.field3021[var2]) && (var1.field4350 <= class156.field2338[var2] || var1.field4347 <= class156.field2338[var2]) && (var1.field4350 >= class265.field4114[var2] || var1.field4347 >= class265.field4114[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field4361 == 1) {
                int var3 = var1.field4365 + class73.field1197 - class106.field1637;
                if (var3 >= 0 && var3 <= class73.field1197 + class73.field1197) {
                    int var4 = var1.field4369 + class73.field1197 - class219.field3330;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4374 + class73.field1197 - class219.field3330;
                    if (var5 > class73.field1197 + class73.field1197) {
                        var5 = class73.field1197 + class73.field1197;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class149.field2256[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class217.field3306 - var1.field4372;
                        if (var7 > 32) {
                            var1.field4353 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4353 = 2;
                            var7 = -var7;
                        }
                        var1.field4364 = (var1.field4350 - class212.field3226 << 8) / var7;
                        var1.field4355 = (var1.field4347 - class212.field3226 << 8) / var7;
                        var1.field4371 = (var1.field4358 - class17.field238 << 8) / var7;
                        var1.field4356 = (var1.field4357 - class17.field238 << 8) / var7;
                        class332.field5162[class160.field2412++] = var1;
                    }
                }
            } else if (var1.field4361 == 2) {
                int var8 = var1.field4369 + class73.field1197 - class219.field3330;
                if (var8 >= 0 && var8 <= class73.field1197 + class73.field1197) {
                    int var9 = var1.field4365 + class73.field1197 - class106.field1637;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4354 + class73.field1197 - class106.field1637;
                    if (var10 > class73.field1197 + class73.field1197) {
                        var10 = class73.field1197 + class73.field1197;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class149.field2256[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class212.field3226 - var1.field4350;
                        if (var12 > 32) {
                            var1.field4353 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4353 = 4;
                            var12 = -var12;
                        }
                        var1.field4359 = (var1.field4372 - class217.field3306 << 8) / var12;
                        var1.field4370 = (var1.field4351 - class217.field3306 << 8) / var12;
                        var1.field4371 = (var1.field4358 - class17.field238 << 8) / var12;
                        var1.field4356 = (var1.field4357 - class17.field238 << 8) / var12;
                        class332.field5162[class160.field2412++] = var1;
                    }
                }
            } else if (var1.field4361 == 4) {
                int var13 = var1.field4358 - class17.field238;
                if (var13 > 128) {
                    int var14 = var1.field4369 + class73.field1197 - class219.field3330;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4374 + class73.field1197 - class219.field3330;
                    if (var15 > class73.field1197 + class73.field1197) {
                        var15 = class73.field1197 + class73.field1197;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4365 + class73.field1197 - class106.field1637;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4354 + class73.field1197 - class106.field1637;
                        if (var17 > class73.field1197 + class73.field1197) {
                            var17 = class73.field1197 + class73.field1197;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class149.field2256[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4353 = 5;
                            var1.field4359 = (var1.field4372 - class217.field3306 << 8) / var13;
                            var1.field4370 = (var1.field4351 - class217.field3306 << 8) / var13;
                            var1.field4364 = (var1.field4350 - class212.field3226 << 8) / var13;
                            var1.field4355 = (var1.field4347 - class212.field3226 << 8) / var13;
                            class332.field5162[class160.field2412++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 358)
    public class210() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILkh;I)V", line = 369)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field3207++;
        if (arg2 <= 51) {
            return;
        }
        if (arg0 == 0) {
            this.field3210 = arg1.method1151(-67);
        } else if (arg0 == 1) {
            this.field3211 = arg1.method1151(-75);
        } else if (arg0 == 2) {
            this.field5234 = arg1.method1178(0) == 1;
        }
    }
}
