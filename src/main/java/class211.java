import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class211 extends class326 {

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    private int field3320 = 1024;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    private int field3326 = 2048;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    private int field3323 = 1024;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    private int field3327 = 819;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    private int field3331 = 0;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    private int field3328 = 409;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    private int field3319 = 1024;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    private int field3330 = 0;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    private int field3318 = 1024;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLvl;)V", line = 10)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field3322++;
        if (arg0 == 0) {
            this.field3331 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field3319 = arg2.method39((byte) 127);
        } else if (arg0 == 2) {
            this.field3326 = arg2.method39((byte) 79);
        } else if (arg0 == 3) {
            this.field3328 = arg2.method39((byte) 75);
        } else if (arg0 == 4) {
            this.field3327 = arg2.method39((byte) 43);
        } else if (arg0 == 5) {
            this.field3320 = arg2.method39((byte) 73);
        } else if (arg0 == 6) {
            this.field3330 = arg2.method58(-288140008);
        } else if (arg0 == 7) {
            this.field3323 = arg2.method39((byte) 101);
        } else if (arg0 == 8) {
            this.field3318 = arg2.method39((byte) 85);
        }
        if (arg1) {
            this.field3331 = 71;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 103)
    public class211() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)V", line = 107)
    public static final void method1538(boolean arg0, int arg1) {
        field3332++;
        if (!arg0) {
            field3333 = -32;
        }
        if (class286.method2022((byte) -33, arg1)) {
            class39.method330(-1, class269.field4182[arg1], 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[[ILjava/util/Random;III)V", line = 125)
    private final void method1539(int arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -3260) {
            field3321 = -31;
        }
        field3336++;
        int var8 = this.field3318 <= 0 ? 4096 : 4096 - class207.method1523(this.field3318, -113, arg3);
        int var9 = this.field3334 * this.field3323 >> 12;
        int var10 = this.field3334 - (var9 <= 0 ? 0 : class207.method1523(var9, arg5 ^ 0xCC2, arg3));
        if (class166.field2731 <= arg6) {
            arg6 -= class166.field2731;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg0 <= 0) {
                return;
            }
            int var15 = arg0 / 2;
            int var16 = arg1 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg6 + var17;
            int var20 = arg0 - (var17 * 2);
            for (int var21 = 0; var21 < arg1; var21++) {
                int[] var22 = arg2[arg4 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field3330 == 0) {
                        for (int var24 = 0; var24 < var17; var24++) {
                            int var25 = var8 * var24 / var17;
                            var22[class333.method2319(arg6 + var24, class215.field3397)] = var22[class333.method2319(class215.field3397, arg6 + arg0 - var24 - 1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; var26++) {
                            int var27 = var8 * var26 / var17;
                            var22[class333.method2319(arg6 + var26, class215.field3397)] = var22[class333.method2319(arg6 + arg0 - var26 - 1, class215.field3397)] = var27 < var23 ? var27 : var23;
                        }
                    }
                    if (var19 + var20 <= class166.field2731) {
                        class54.method425(var22, var19, var20, var23);
                    } else {
                        int var28 = class166.field2731 - var19;
                        class54.method425(var22, var19, var28, var23);
                        class54.method425(var22, 0, var20 - var28, var23);
                    }
                } else {
                    int var29 = arg1 - var21 - 1;
                    if (var18 <= var29) {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class333.method2319(arg6 + var30, class215.field3397)] = var22[class333.method2319(class215.field3397, arg6 + arg0 + (-var30 - 1))] = var8 * var30 / var17;
                        }
                        if (class166.field2731 >= var19 + var20) {
                            class54.method425(var22, var19, var20, var8);
                        } else {
                            int var31 = class166.field2731 - var19;
                            class54.method425(var22, var19, var31, var8);
                            class54.method425(var22, 0, var20 - var31, var8);
                        }
                    } else {
                        int var32 = var8 * var29 / var18;
                        if (this.field3330 == 0) {
                            for (int var35 = 0; var35 < var17; var35++) {
                                int var36 = var8 * var35 / var17;
                                var22[class333.method2319(class215.field3397, arg6 + var35)] = var22[class333.method2319(arg0 + arg6 - var35 - 1, class215.field3397)] = var32 * var36 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; var33++) {
                                int var34 = var8 * var33 / var17;
                                var22[class333.method2319(class215.field3397, arg6 + var33)] = var22[class333.method2319(arg0 + arg6 - var33 - 1, class215.field3397)] = var32 <= var34 ? var32 : var34;
                            }
                        }
                        if (var19 + var20 <= class166.field2731) {
                            class54.method425(var22, var19, var20, var32);
                        } else {
                            int var37 = class166.field2731 - var19;
                            class54.method425(var22, var19, var37, var32);
                            class54.method425(var22, 0, var20 - var37, var32);
                        }
                    }
                }
            }
        } else if (class166.field2731 < (arg0 + arg6)) {
            int var11 = class166.field2731 - arg6;
            for (int var12 = 0; var12 < arg1; var12++) {
                int[] var13 = arg2[arg4 + var12];
                class54.method425(var13, arg6, var11, var8);
                class54.method425(var13, 0, arg0 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg1; var14++) {
                class54.method425(arg2[arg4 + var14], arg6, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V", line = 320)
    public final void method99(byte arg0) {
        if (arg0 == 31) {
            field3324++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[I", line = 339)
    public final int[] method103(int arg0, int arg1) {
        field3329++;
        if (arg0 > -25) {
            return (int[]) null;
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (!this.field5112.field3583) {
            return var3;
        }
        int var4 = 0;
        int[][] var5 = this.field5112.method1650((byte) -68);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = class166.field2731 * this.field3319 >> 12;
        int var14 = class166.field2731 * this.field3326 >> 12;
        int var15 = 0;
        int var16 = class302.field4637 * this.field3327 >> 12;
        int var17 = class302.field4637 * this.field3328 >> 12;
        if (var16 <= 1) {
            return var5[arg1];
        }
        this.field3334 = class166.field2731 / 8 * this.field3320 >> 12;
        int var18 = class166.field2731 / var13 + 1;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field3331);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = var13 + class207.method1523(var14 - var13, -106, var20);
                int var23 = var17 + class207.method1523(var16 - var17, -108, var20);
                int var24 = var10 + var22;
                if (class166.field2731 < var24) {
                    var22 = class166.field2731 - var10;
                    var24 = class166.field2731;
                }
                int var27;
                if (var9) {
                    var27 = 0;
                } else {
                    int var25 = var8;
                    int[] var26 = var19[var8];
                    var27 = var26[2];
                    int var28 = 0;
                    int var29 = var4 + var24;
                    if (var29 < 0) {
                        var29 += class166.field2731;
                    }
                    if (class166.field2731 < var29) {
                        var29 -= class166.field2731;
                    }
                    while (true) {
                        int[] var30 = var19[var25];
                        if (var30[0] <= var29 && var30[1] >= var29) {
                            if (var8 != var25) {
                                int var31 = var4 + var10;
                                if (var31 < 0) {
                                    var31 += class166.field2731;
                                }
                                if (class166.field2731 < var31) {
                                    var31 -= class166.field2731;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var19[(var8 + var32) % var12];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var19[(var8 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class166.field2731;
                                        }
                                        this.method1539(var40 - var39, -var36 + var27, var5, var20, var36, -3260, var7 + var39);
                                    }
                                }
                            }
                            var8 = var25;
                            break;
                        }
                        var28++;
                        var25++;
                        if (var12 <= var25) {
                            var25 = 0;
                        }
                    }
                }
                if ((var23 + var27) > class302.field4637) {
                    var23 = class302.field4637 - var27;
                } else {
                    var11 = false;
                }
                if (class166.field2731 == var24) {
                    this.method1539(var22, var23, var5, var20, var27, -3260, var10 + var6);
                    if (var11) {
                        return var3;
                    }
                    var11 = true;
                    var7 = var6;
                    var9 = false;
                    var8 = 0;
                    int[][] var41 = var19;
                    var19 = var21;
                    int[] var42 = var21[var15++];
                    var42[2] = var23 + var27;
                    var21 = var41;
                    var42[0] = var10;
                    var10 = 0;
                    var12 = var15;
                    var15 = 0;
                    var42[1] = var24;
                    var6 = class207.method1523(class166.field2731, -115, var20);
                    var4 = var6 - var7;
                    int var43 = var4;
                    if (var4 < 0) {
                        var43 = class166.field2731 + var4;
                    }
                    if (var43 > class166.field2731) {
                        var43 -= class166.field2731;
                    }
                    while (true) {
                        int[] var44 = var19[var8];
                        if (var44[0] <= var43 && var43 <= var44[1]) {
                            break;
                        }
                        var8++;
                        if (var8 >= var12) {
                            var8 = 0;
                        }
                    }
                } else {
                    int[] var45 = var21[var15++];
                    var45[0] = var10;
                    var45[1] = var24;
                    var45[2] = var23 + var27;
                    this.method1539(var22, var23, var5, var20, var27, -3260, var6 + var10);
                    var10 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V", line = 596)
    public static final void method1540(byte arg0) {
        field3325++;
        if (class162.method1207(true) != 2) {
            return;
        }
        byte var1 = (byte) (class301.field4629 - 4 & 0xFF);
        int var2 = class301.field4629 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class214.field3376[var3][var2][var4] = var1;
            }
        }
        if (class154.field2392 == 3) {
            return;
        }
        int var5 = 0;
        if (arg0 != -75) {
            method1540((byte) 62);
        }
        while (var5 < 2) {
            class341.field5305[var5] = -1000000;
            class282.field4366[var5] = 1000000;
            class335.field5220[var5] = 0;
            class259.field4078[var5] = 1000000;
            class42.field570[var5] = 0;
            var5++;
        }
        if (class166.field2715 != 1) {
            int var6 = class320.method2245((byte) -20, class317.field5018, class154.field2392, class295.field4572);
            if (var6 - class43.field588 < 800 && (class134.field1969[class154.field2392][class295.field4572 >> 7][class317.field5018 >> 7] & 0x4) != 0) {
                class58.method470(class317.field5018 >> 7, false, class295.field4572 >> 7, 1, 1, class83.field1138);
            }
            return;
        }
        if ((class134.field1969[class154.field2392][class146.field2310.field4698 >> 7][class146.field2310.field4731 >> 7] & 0x4) != 0) {
            class58.method470(class146.field2310.field4731 >> 7, false, class146.field2310.field4698 >> 7, 0, 1, class83.field1138);
        }
        if (class293.field4536 >= 310) {
            return;
        }
        int var7 = class295.field4572 >> 7;
        int var8 = class146.field2310.field4698 >> 7;
        int var9 = class317.field5018 >> 7;
        int var10;
        if (var7 < var8) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11 = class146.field2310.field4731 >> 7;
        int var12;
        if (var11 > var9) {
            var12 = var11 - var9;
        } else {
            var12 = var9 - var11;
        }
        if (var12 >= var10) {
            int var15 = var10 * 65536 / var12;
            int var16 = 32768;
            while (var9 != var11) {
                if (var11 > var9) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                if ((class134.field1969[class154.field2392][var7][var9] & 0x4) != 0) {
                    class58.method470(var9, false, var7, 1, 1, class83.field1138);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var8 > var7) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var16 -= 65536;
                    if ((class134.field1969[class154.field2392][var7][var9] & 0x4) != 0) {
                        class58.method470(var9, false, var7, 1, arg0 + 76, class83.field1138);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = 32768;
        int var14 = var12 * 65536 / var10;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var8 < var7) {
                var7--;
            }
            if ((class134.field1969[class154.field2392][var7][var9] & 0x4) != 0) {
                class58.method470(var9, false, var7, 1, 1, class83.field1138);
                break;
            }
            var13 += var14;
            if (var13 >= 65536) {
                if (var11 > var9) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                var13 -= 65536;
                if ((class134.field1969[class154.field2392][var7][var9] & 0x4) != 0) {
                    class58.method470(var9, false, var7, 1, 1, class83.field1138);
                    break;
                }
            }
        }
    }
}
