import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class176 extends class346 {

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    private int field2378 = 4096;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    private int field2381 = 0;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lm;")
    public static class242 field2376 = new class242();

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lkg;")
    public static class317[] field2382 = new class317[2048];

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "Lm;")
    public static class242 field2383 = new class242();

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "Z")
    public static boolean field2385 = false;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field2384;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field2386;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1169(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lsj;III)V", line = 7)
    public static final void method1166(class248 arg0, int arg1, int arg2, int arg3) {
        ++field2379;
        if (~arg0.field3524 == -1) {
            arg0.field3503 = arg0.field3599;
        } else if (~arg0.field3524 != -2) {
            if (arg0.field3524 != 2) {
                if (arg0.field3524 == 3) {
                    arg0.field3503 = arg0.field3599 * arg1 >> 14;
                } else if (arg0.field3524 == 4) {
                    arg0.field3503 = (arg0.field3599 * arg1 >> 14) + (-arg0.field3531 + arg1) / 2;
                } else {
                    arg0.field3503 = -arg0.field3531 + arg1 + -(arg0.field3599 * arg1 >> 14);
                }
            } else {
                arg0.field3503 = -arg0.field3599 + arg1 + -arg0.field3531;
            }
        } else {
            arg0.field3503 = (arg1 - arg0.field3531) / 2 + arg0.field3599;
        }
        if (arg2 != 1) {
            method1168();
        }
        if (~arg0.field3546 != -1) {
            if (~arg0.field3546 != -2) {
                if (arg0.field3546 == 2) {
                    arg0.field3507 = -arg0.field3564 + arg3 + -arg0.field3508;
                } else if (~arg0.field3546 != -4) {
                    if (arg0.field3546 == 4) {
                        arg0.field3507 = (arg0.field3508 * arg3 >> 14) + (-arg0.field3564 + arg3) / 2;
                    } else {
                        arg0.field3507 = -(arg0.field3508 * arg3 >> 14) + arg3 + -arg0.field3564;
                    }
                } else {
                    arg0.field3507 = arg0.field3508 * arg3 >> 14;
                }
            } else {
                arg0.field3507 = (-arg0.field3564 + arg3) / 2 + arg0.field3508;
            }
        } else {
            arg0.field3507 = arg0.field3508;
        }
        if (class126.field1649) {
            if (~client.method402(arg0).field3108 == -1 && ~arg0.field3555 != -1) {
                return;
            }
            if (arg0.field3507 < 0) {
                arg0.field3507 = 0;
            } else if (arg0.field3564 + arg0.field3507 > arg3) {
                arg0.field3507 = -arg0.field3564 + arg3;
            }
            if (arg0.field3503 < 0) {
                arg0.field3503 = 0;
                return;
            }
            if (~arg1 > ~(arg0.field3531 + arg0.field3503)) {
                arg0.field3503 = -arg0.field3531 + arg1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 81)
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)[[I", line = 84)
    public final int[][] method287(int arg0, int arg1) {
        ++field2377;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int[][] var4 = this.method2293(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class134.field1753; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field2381 >= ~var12) {
                    if (~var12 < ~this.field2378) {
                        var8[var11] = this.field2378;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field2381;
                }
                if (~var13 <= ~this.field2381) {
                    if (~this.field2378 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field2378;
                    }
                } else {
                    var9[var11] = this.field2381;
                }
                if (~this.field2381 < ~var14) {
                    var10[var11] = this.field2381;
                } else if (var14 > this.field2378) {
                    var10[var11] = this.field2378;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        if (arg1 > -3) {
            field2384 = 31;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lfb;ZI)V", line = 162)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2385 = true;
        }
        ++field2375;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field5151 = arg0.method2233((byte) 104) == 1;
                }
            } else {
                this.field2378 = arg0.method2239(-1076227960);
            }
        } else {
            this.field2381 = arg0.method2239(-1076227960);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[I", line = 207)
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            method1167((byte) -14);
        }
        ++field2380;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            for (int var5 = 0; var5 < class134.field1753; ++var5) {
                int var6 = var4[var5];
                if (~this.field2381 < ~var6) {
                    var3[var5] = this.field2381;
                } else if (~this.field2378 > ~var6) {
                    var3[var5] = this.field2378;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 255)
    public static void method1167(byte arg0) {
        field2382 = null;
        field2376 = null;
        int var1 = 53 % ((70 - arg0) / 35);
        field2383 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 274)
    public static final void method1168() {
        for (int var0 = 0; var0 < class197.field2720; ++var0) {
            if (!class116.field1511[var0]) {
                class64 var1 = class280.field4131[var0];
                int var2 = var1.field957;
                int var3 = var1.field263 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field264 - var3 >> 7;
                int var8 = var1.field269 - var3 >> 7;
                int var9 = var1.field269 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class186.field2554) {
                    var9 = class186.field2554 - 1;
                }
                for (int var10 = var8; var10 <= var9; ++var10) {
                    short var11 = var1.field953[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 255) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class108.field1421) {
                        var15 = class108.field1421 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; ++var16) {
                        byte var17 = 1;
                        class407 var18 = class31.method243(var2, var16, var10, field2386 != null ? field2386 : (field2386 = method1169("ro")));
                        if (var18 != null && var18.field5919 != 0) {
                            if (var18.field5919 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field953[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 255) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field953[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 255) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field953[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 255) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field953[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 255) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    ++var5;
                }
                class116.field1511[var0] = true;
                class266.field3950[var2].method734(var1, var6);
            }
        }
    }
}
