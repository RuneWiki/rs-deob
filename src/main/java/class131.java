import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class131 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field3297 = 0;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[Lue;")
    private class141[] field3281;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lkd;")
    public static class73 field3284 = class126.method1070((byte) -66, "@cr1@");

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lkd;")
    private static class73 field3296 = class126.method1070((byte) -66, "wave:");

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lkd;")
    public static class73 field3280 = field3296;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public static int[] field3287 = new int[128];

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lkd;")
    public static class73 field3288 = field3296;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lkd;")
    public static class73 field3299 = class126.method1070((byte) -66, "<col=ff9040>");

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lhe;")
    public static class54 field3294 = new class54();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    private long field3290;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lue;")
    private class141 field3286;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lue;")
    private class141 field3298;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLue;J)V")
    public final void method1093(byte arg0, class141 arg1, long arg2) {
        field3300++;
        int var5 = -65 / ((arg0 + 17) / 40);
        if (arg1.field3517 != null) {
            arg1.method1147((byte) -121);
        }
        class141 var6 = this.field3281[(int) (arg2 & (long) (this.field3282 - 1))];
        arg1.field3506 = var6;
        arg1.field3517 = var6.field3517;
        arg1.field3522 = arg2;
        arg1.field3517.field3506 = arg1;
        arg1.field3506.field3517 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lue;")
    public final class141 method1094(int arg0) {
        int var2 = -38 / ((59 - arg0) / 58);
        field3292++;
        if (this.field3297 > 0 && this.field3281[this.field3297 - 1] != this.field3298) {
            class141 var3 = this.field3298;
            this.field3298 = var3.field3506;
            return var3;
        }
        while (this.field3297 < this.field3282) {
            class141 var4 = this.field3281[this.field3297++].field3506;
            if (this.field3281[this.field3297 - 1] != var4) {
                this.field3298 = var4.field3506;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lbd;")
    public static final class12 method1095(int arg0, int arg1) {
        field3285++;
        class12 var2 = (class12) class50.field1340.method538(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -24761) {
            method1100((byte) -85, -52, 34, null, -116, 60, null, -97, -87, -55);
        }
        byte[] var3 = class26.field759.method898((byte) -99, arg0, 4);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method109(arg0, new class114(var3), (byte) 121);
        }
        var4.method111(-111);
        class50.field1340.method542(var4, -901, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Lue;")
    public final class141 method1096(byte arg0) {
        if (arg0 == 98) {
            field3295++;
            this.field3297 = 0;
            return this.method1094(-6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field3299 = null;
        field3294 = null;
        if (arg0 != -627) {
            method1095(9, 120);
        }
        field3287 = null;
        field3280 = null;
        field3296 = null;
        field3288 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public static final void method1098(int arg0, int arg1) {
        int[] var2 = class37.field1020.field2626;
        field3283++;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var21 = (103 - var5) * 512 * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class55.field1482[arg0][var22][var5] & 0x18) == 0) {
                    class34.field923.method47(var2, var21, 512, arg0, var22, var5);
                }
                if (arg0 < 3 && (class55.field1482[arg0 + 1][var22][var5] & 0x8) != 0) {
                    class34.field923.method47(var2, var21, 512, arg0 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class37.field1020.method847();
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class55.field1482[arg0][var20][var8] & 0x18) == 0) {
                    class149.method1199(var8, (byte) 30, arg0, var6, var20, var7);
                }
                if (arg0 < 3 && (class55.field1482[arg0 + 1][var20][var8] & 0x8) != 0) {
                    class149.method1199(var8, (byte) 30, arg0 + 1, var6, var20, var7);
                }
            }
        }
        class129.field3251 = 0;
        int var9 = 69 / ((-arg1 - 61) / 33);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                int var12 = class34.field923.method42(class11.field320, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 0x7FFF;
                    int var14 = class122.method1045(31, var13).field3679;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class70.field1780[class11.field320].field1249;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var15 > var10 - 3 && (var17[var15 - 1][var16] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var15 < var10 + 3 && (var17[var15 + 1][var16] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var16 > var11 - 3 && (var17[var15][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var16 < var11 + 3 && (var17[var15][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class146.field3604[class129.field3251] = class89.field2295[var14];
                        class99.field2498[class129.field3251] = var15;
                        class116.field2975[class129.field3251] = var16;
                        class129.field3251++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)Lue;")
    public final class141 method1099(int arg0, long arg1) {
        if (arg0 < 10) {
            return null;
        }
        this.field3290 = arg1;
        class141 var4 = this.field3281[(int) ((long) (this.field3282 - 1) & arg1)];
        this.field3286 = var4.field3506;
        field3293++;
        while (this.field3286 != var4) {
            if (this.field3286.field3522 == arg1) {
                class141 var5 = this.field3286;
                this.field3286 = this.field3286.field3506;
                return var5;
            }
            this.field3286 = this.field3286.field3506;
        }
        this.field3286 = null;
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILb;IILge;III)V")
    public static final void method1100(byte arg0, int arg1, int arg2, class8 arg3, int arg4, int arg5, class47 arg6, int arg7, int arg8, int arg9) {
        int var10 = class55.field1484[arg1][arg8][arg2];
        field3289++;
        int var11 = class55.field1484[arg1][arg8][arg2 + 1];
        int var12 = class55.field1484[arg1][arg8 + 1][arg2 + 1];
        int var13 = class55.field1484[arg1][arg8 + 1][arg2];
        int var14 = var11 + var12 + var13 + var10 >> 2;
        class149 var15 = class122.method1045(arg0 + 112, arg7);
        int var16 = (arg2 << 7) + arg8 + (arg7 << 14) + 1073741824;
        if (var15.field3696 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg9 << 6) + arg5;
        if (var15.field3665 == 1) {
            var17 += 256;
        }
        if (arg5 == 22) {
            class18 var18;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var18 = var15.method1186(var10, var11, arg9, var13, var12, arg0 ^ 0xFFFFCF87, 22);
            } else {
                var18 = new class53(arg7, 22, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method74(arg4, arg8, arg2, var14, var18, var16, var17);
            if (var15.field3648 == 1) {
                arg6.method377(arg2, -104, arg8);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class18 var38;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var38 = var15.method1186(var10, var11, arg9, var13, var12, 12328, 10);
            } else {
                var38 = new class53(arg7, 10, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg9 == 1 || arg9 == 3) {
                    var39 = var15.field3660;
                    var40 = var15.field3643;
                } else {
                    var39 = var15.field3643;
                    var40 = var15.field3660;
                }
                int var41 = 0;
                if (arg5 == 11) {
                    var41 += 256;
                }
                arg3.method68(arg4, arg8, arg2, var14, var40, var39, var38, var41, var16, var17);
            }
            if (var15.field3648 != 0) {
                arg6.method372(arg2, arg8, arg9, var15.field3660, var15.field3643, var15.field3646, arg0 ^ 0x50);
            }
        } else if (arg5 >= 12) {
            class18 var19;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var19 = var15.method1186(var10, var11, arg9, var13, var12, 12328, arg5);
            } else {
                var19 = new class53(arg7, arg5, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method68(arg4, arg8, arg2, var14, 1, 1, var19, 0, var16, var17);
            if (var15.field3648 != 0) {
                arg6.method372(arg2, arg8, arg9, var15.field3660, var15.field3643, var15.field3646, -1);
            }
        } else if (arg5 == 0) {
            class18 var20;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var20 = var15.method1186(var10, var11, arg9, var13, var12, 12328, 0);
            } else {
                var20 = new class53(arg7, 0, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method73(arg4, arg8, arg2, var14, var20, null, class112.field2793[arg9], 0, var16, var17);
            if (var15.field3648 != 0) {
                arg6.method371(arg5, (byte) 124, arg8, arg9, var15.field3646, arg2);
            }
        } else if (arg5 == 1) {
            class18 var21;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var21 = var15.method1186(var10, var11, arg9, var13, var12, 12328, 1);
            } else {
                var21 = new class53(arg7, 1, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method73(arg4, arg8, arg2, var14, var21, null, class99.field2493[arg9], 0, var16, var17);
            if (var15.field3648 != 0) {
                arg6.method371(arg5, (byte) 122, arg8, arg9, var15.field3646, arg2);
            }
        } else if (arg5 == 2) {
            int var22 = arg9 + 1 & 0x3;
            class18 var23;
            class18 var24;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var23 = var15.method1186(var10, var11, arg9 + 4, var13, var12, 12328, 2);
                var24 = var15.method1186(var10, var11, var22, var13, var12, arg0 + 12409, 2);
            } else {
                var23 = new class53(arg7, 2, arg9 + 4, var10, var13, var12, var11, var15.field3694, true, null);
                var24 = new class53(arg7, 2, var22, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method73(arg4, arg8, arg2, var14, var23, var24, class112.field2793[arg9], class112.field2793[var22], var16, var17);
            if (var15.field3648 != 0) {
                arg6.method371(arg5, (byte) 119, arg8, arg9, var15.field3646, arg2);
            }
        } else if (arg5 == 3) {
            class18 var25;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var25 = var15.method1186(var10, var11, arg9, var13, var12, 12328, 3);
            } else {
                var25 = new class53(arg7, 3, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method73(arg4, arg8, arg2, var14, var25, null, class99.field2493[arg9], 0, var16, var17);
            if (var15.field3648 != 0) {
                arg6.method371(arg5, (byte) 125, arg8, arg9, var15.field3646, arg2);
            }
        } else if (arg5 == 9) {
            class18 var26;
            if (var15.field3694 == -1 && var15.field3691 == null) {
                var26 = var15.method1186(var10, var11, arg9, var13, var12, 12328, arg5);
            } else {
                var26 = new class53(arg7, arg5, arg9, var10, var13, var12, var11, var15.field3694, true, null);
            }
            arg3.method68(arg4, arg8, arg2, var14, 1, 1, var26, 0, var16, var17);
            if (var15.field3648 != 0) {
                arg6.method372(arg2, arg8, arg9, var15.field3660, var15.field3643, var15.field3646, arg0 + 80);
            }
        } else {
            if (var15.field3678) {
                if (arg9 == 1) {
                    int var27 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var10;
                    var10 = var27;
                } else if (arg9 == 2) {
                    int var29 = var11;
                    var11 = var13;
                    var13 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg9 == 3) {
                    int var28 = var11;
                    var11 = var10;
                    var10 = var13;
                    var13 = var12;
                    var12 = var28;
                }
            }
            if (arg5 == 4) {
                class18 var31;
                if (var15.field3694 == -1 && var15.field3691 == null) {
                    var31 = var15.method1186(var10, var11, 0, var13, var12, 12328, 4);
                } else {
                    var31 = new class53(arg7, 4, 0, var10, var13, var12, var11, var15.field3694, true, null);
                }
                arg3.method71(arg4, arg8, arg2, var14, var31, class112.field2793[arg9], arg9 * 512, 0, 0, var16, var17);
            } else if (arg5 == 5) {
                int var32 = arg3.method81(arg4, arg8, arg2);
                int var33 = 16;
                if (var32 != 0) {
                    var33 = class122.method1045(arg0 ^ 0xFFFFFFB0, var32 >> 14 & 0x7FFF).field3690;
                }
                class18 var34;
                if (var15.field3694 == -1 && var15.field3691 == null) {
                    var34 = var15.method1186(var10, var11, 0, var13, var12, 12328, 4);
                } else {
                    var34 = new class53(arg7, 4, 0, var10, var13, var12, var11, var15.field3694, true, null);
                }
                arg3.method71(arg4, arg8, arg2, var14, var34, class112.field2793[arg9], arg9 * 512, class149.field3649[arg9] * var33, class145.field3577[arg9] * var33, var16, var17);
            } else if (arg5 == 6) {
                class18 var35;
                if (var15.field3694 == -1 && var15.field3691 == null) {
                    var35 = var15.method1186(var10, var11, 0, var13, var12, 12328, 4);
                } else {
                    var35 = new class53(arg7, 4, 0, var10, var13, var12, var11, var15.field3694, true, null);
                }
                arg3.method71(arg4, arg8, arg2, var14, var35, 256, arg9, 0, 0, var16, var17);
            } else if (arg5 == 7) {
                class18 var36;
                if (var15.field3694 == -1 && var15.field3691 == null) {
                    var36 = var15.method1186(var10, var11, 0, var13, var12, 12328, 4);
                } else {
                    var36 = new class53(arg7, 4, 0, var10, var13, var12, var11, var15.field3694, true, null);
                }
                arg3.method71(arg4, arg8, arg2, var14, var36, 512, arg9, 0, 0, var16, var17);
            } else {
                if (arg0 != -81) {
                    field3294 = null;
                }
                if (arg5 == 8) {
                    class18 var37;
                    if (var15.field3694 == -1 && var15.field3691 == null) {
                        var37 = var15.method1186(var10, var11, 0, var13, var12, arg0 ^ 0xFFFFCF87, 4);
                    } else {
                        var37 = new class53(arg7, 4, 0, var10, var13, var12, var11, var15.field3694, true, null);
                    }
                    arg3.method71(arg4, arg8, arg2, var14, var37, 768, arg9, 0, 0, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field3281 = new class141[arg0];
        this.field3282 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class141 var3 = this.field3281[var2] = new class141();
            var3.field3517 = var3;
            var3.field3506 = var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lue;")
    public final class141 method1101(int arg0) {
        field3291++;
        if (this.field3286 == null) {
            return null;
        } else if (arg0 == 15241) {
            class141 var2 = this.field3281[(int) (this.field3290 & (long) (this.field3282 - 1))];
            while (this.field3286 != var2) {
                if (this.field3286.field3522 == this.field3290) {
                    class141 var3 = this.field3286;
                    this.field3286 = this.field3286.field3506;
                    return var3;
                }
                this.field3286 = this.field3286.field3506;
            }
            this.field3286 = null;
            return null;
        } else {
            return null;
        }
    }
}
