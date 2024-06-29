import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class395 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
    public boolean field5974 = false;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[[I")
    public static int[][] field5982 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5975 = 0;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5984 = 1406;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lla;")
    public static class393 field5976;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
    public abstract int method1011();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILmq;)V")
    public static final void method2453(int arg0, class71 arg1) {
        field5983++;
        if (arg0 > -46) {
            field5984 = 111;
        }
        class65 var2 = (class65) class587.field8519.method2002((byte) -124, (long) arg1.field7405);
        if (var2 == null) {
            class61.method381(arg1.field7430[0], arg1, 0, arg1.field7429[0], arg1.field7905, null, 0, null);
        } else {
            var2.method396((byte) 58);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIBILi;I)V")
    public final void method2454(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class682 arg7, int arg8) {
        field5980++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg7.method3824(arg3 + var13, 124, arg0 + var14);
        int var16 = arg1 / 2;
        if (arg5 != -55) {
            this.method1028();
        }
        int var17 = -arg8 / 2;
        int var18 = arg7.method3824(arg3 + var16, 110, arg0 + var17);
        int var19 = -arg1 / 2;
        int var20 = arg8 / 2;
        int var21 = arg7.method3824(arg3 + var19, 121, arg0 + var20);
        int var22 = arg1 / 2;
        int var23 = arg8 / 2;
        int var24 = arg7.method3824(arg3 + var22, 114, arg0 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg8 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg2 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg2;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg2 < var29) {
                        var29 = arg2;
                    }
                }
                this.method1048(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg1 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg4 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg4;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg4 < var32) {
                        var32 = arg4;
                    }
                }
                this.method1044(var32);
            }
        }
        if (var31 > (var18 + var21)) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg6;
        if (var34 != 0) {
            this.method1019(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public abstract int method1009();

    @OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
    public abstract void method1025();

    @OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILi;Li;III)V")
    public abstract void method1014(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public abstract boolean method1008();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public static final void method2455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5979++;
        int var6 = class79.method461((byte) 91, class148.field2106, arg0, class323.field4704);
        int var7 = class79.method461((byte) 121, class148.field2106, arg1, class323.field4704);
        int var8 = class79.method461((byte) 58, class375.field5631, arg4, class175.field2455);
        int var9 = class79.method461((byte) 81, class375.field5631, arg3, class175.field2455);
        if (arg5 == -2413) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class41.method235(var8, class565.field8253[var10], 0, var9, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
    public abstract int method1053();

    @OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
    public abstract int method1015();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
    public abstract void method1048(int arg0);

    @OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
    public abstract int method1018();

    @OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
    public abstract void method1040();

    @OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
    public abstract void method1010(int arg0);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
    public abstract void method1034(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
    public abstract void method1052(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public abstract void method1016();

    @OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
    public abstract void method1017(int arg0);

    @OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
    public abstract int method1007();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
    public abstract void method1042(int arg0);

    @OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
    public abstract boolean method1024();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lqh;II)V")
    public abstract void method1030(class151 arg0, class67 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILofa;Lofa;IIIZ)V")
    public final void method2456(int arg0, int arg1, int arg2, class128 arg3, class128 arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field5986++;
        if (~arg1 == arg7) {
            return;
        }
        this.method1051();
        if (!this.method1023()) {
            this.method1028();
            return;
        }
        class333 var10 = arg4.field1851[arg1];
        class639 var11 = var10.field4833;
        class333 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field1851[arg6];
            if (var12.field4833 != var11) {
                var12 = null;
            }
        }
        this.method2459(null, false, arg2, 65535, (byte) 31, var11, arg0, null, arg8, arg5, var10, var12);
        this.method1040();
        this.method1028();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILofa;)V")
    public final void method2457(int arg0, int arg1, class128 arg2) {
        field5985++;
        if (arg0 == -1) {
            return;
        }
        this.method1051();
        if (!this.method1023()) {
            this.method1028();
            return;
        }
        class333 var4 = arg2.field1851[arg0];
        class639 var5 = var4.field4833;
        if (arg1 != 16383) {
            field5975 = 58;
        }
        for (int var6 = 0; var6 < var4.field4841; var6++) {
            short var7 = var4.field4845[var6];
            if (var5.field9176[var7]) {
                if (var4.field4834[var6] != -1) {
                    this.method1034(0, 0, 0, 0);
                }
                this.method1034(var5.field9175[var7], var4.field4831[var6], var4.field4846[var6], var4.field4836[var6]);
            }
        }
        this.method1040();
        this.method1028();
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
    public abstract void method1037(int arg0);

    @OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
    public abstract void method1050(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIII[IILofa;Lofa;)V")
    public final void method2458(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, class128 arg9, class128 arg10) {
        field5981++;
        if (arg3 == -1) {
            return;
        }
        this.method1051();
        if (!this.method1023()) {
            this.method1028();
            return;
        }
        class333 var12 = arg9.field1851[arg3];
        class639 var13 = var12.field4833;
        class333 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field1851[arg5];
            if (var14.field4833 != var13) {
                var14 = null;
            }
        }
        this.method2459(null, false, arg6, arg4, (byte) 49, var13, arg2, arg7, arg0, arg1, var12, var14);
        this.method1040();
        if (arg8 >= -127) {
            field5975 = -49;
        }
        this.method1028();
    }

    @OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
    public abstract boolean method1023();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ZZIIBLhba;I[IZILeq;Leq;)V")
    private final void method2459(boolean[] arg0, boolean arg1, int arg2, int arg3, byte arg4, class639 arg5, int arg6, int[] arg7, boolean arg8, int arg9, class333 arg10, class333 arg11) {
        field5977++;
        if (arg11 == null || arg9 == 0) {
            for (int var39 = 0; var39 < arg10.field4841; var39++) {
                short var40 = arg10.field4845[var39];
                if (arg0 == null || arg1 == arg0[var40] || arg5.field9175[var40] == 0) {
                    short var41 = arg10.field4834[var39];
                    if (var41 != -1) {
                        this.method2463((byte) 42, arg5.field9178[var41], 0, arg2, arg5.field9181[var41] & arg3, arg8, 0, 0, 0, arg7);
                    }
                    this.method2463((byte) 42, arg5.field9178[var40], arg10.field4831[var39], arg2, arg5.field9181[var40] & arg3, arg8, arg10.field4836[var39], arg10.field4846[var39], arg5.field9175[var40], arg7);
                }
            }
            return;
        }
        int var13 = -47 / ((arg4 + 59) / 48);
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg5.field9179; var16++) {
            boolean var17 = false;
            if (var14 < arg10.field4841 && arg10.field4845[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (var15 < arg11.field4841 && arg11.field4845[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg0 == null || arg0[var16] == arg1 || arg5.field9175[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg5.field9175[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    short var25;
                    if (var17) {
                        var21 = arg10.field4834[var14];
                        var22 = arg10.field4831[var14];
                        var23 = arg10.field4846[var14];
                        var24 = arg10.field4844[var14];
                        var25 = arg10.field4836[var14];
                        var14++;
                    } else {
                        var25 = var19;
                        var21 = -1;
                        var23 = var19;
                        var22 = var19;
                        var24 = 0;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var28 = arg11.field4836[var15];
                        var26 = arg11.field4834[var15];
                        var27 = arg11.field4844[var15];
                        var29 = arg11.field4831[var15];
                        var30 = arg11.field4846[var15];
                        var15++;
                    } else {
                        var26 = -1;
                        var27 = 0;
                        var28 = var19;
                        var29 = var19;
                        var30 = var19;
                    }
                    if (var21 != -1) {
                        this.method2463((byte) 42, arg5.field9178[var21], 0, arg2, arg5.field9181[var21] & arg3, arg8, 0, 0, 0, arg7);
                    } else if (var26 != -1) {
                        this.method2463((byte) 42, arg5.field9178[var26], 0, arg2, arg3 & arg5.field9181[var26], arg8, 0, 0, 0, arg7);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var34 = var22;
                        var35 = var23;
                        var36 = var25;
                    } else if (var20 == 2) {
                        int var31 = var29 - var22 & 0x3FFF;
                        int var32 = var30 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var33 = var28 - var25 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg9 * var31 / arg6 + var22 & 0x3FFF;
                        var35 = arg9 * var32 / arg6 + var23 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = arg9 * var33 / arg6 + var25 & 0x3FFF;
                    } else if (var20 == 9) {
                        int var38 = var29 - var22 & 0x3FFF;
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var36 = 0;
                        var35 = 0;
                        var34 = arg9 * var38 / arg6 + var22 & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var29 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = arg9 * var37 / arg6 + var22 & 0x3F;
                        var36 = (var28 - var25) * arg9 / arg6 + var25;
                        var35 = (var30 - var23) * arg9 / arg6 + var23;
                    } else {
                        var34 = (var29 - var22) * arg9 / arg6 + var22;
                        var36 = (var28 - var25) * arg9 / arg6 + var25;
                        var35 = var23 + ((var30 - var23) * arg9 / arg6);
                    }
                    this.method2463((byte) 42, arg5.field9178[var16], var34, arg2, arg5.field9181[var16] & arg3, arg8, var36, var35, var20, arg7);
                } else {
                    if (var18) {
                        var15++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLofa;ILofa;IILofa;ZLofa;IIII[ZI)V")
    public final void method2460(boolean arg0, class128 arg1, int arg2, class128 arg3, int arg4, int arg5, class128 arg6, boolean arg7, class128 arg8, int arg9, int arg10, int arg11, int arg12, boolean[] arg13, int arg14) {
        field5972++;
        if (arg12 == -1) {
            return;
        }
        if (arg13 == null || arg11 == -1) {
            this.method2456(arg10, arg12, 0, arg8, arg1, arg5, arg14, 0, arg7);
            return;
        }
        this.method1051();
        if (!this.method1023()) {
            this.method1028();
            return;
        }
        class333 var16 = arg1.field1851[arg12];
        class639 var17 = var16.field4833;
        class333 var18 = null;
        if (arg8 != null) {
            var18 = arg8.field1851[arg14];
            if (var18.field4833 != var17) {
                var18 = null;
            }
        }
        this.method2459(arg13, false, 0, 65535, (byte) 120, var17, arg10, null, arg7, arg5, var16, var18);
        class333 var19 = arg3.field1851[arg11];
        class333 var20 = null;
        if (arg6 != null) {
            var20 = arg6.field1851[arg9];
            if (var20.field4833 != var17) {
                var20 = null;
            }
        }
        this.method1046(0, new int[0], 0, 0, 0, 0, arg7);
        this.method2459(arg13, arg0, 0, 65535, (byte) 101, var19.field4833, arg2, null, arg7, arg4, var19, var20);
        this.method1040();
        this.method1028();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public abstract void method1055(class395 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public abstract void method1051();

    @OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
    public abstract int method1029();

    @OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
    public abstract int method1041();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()[Lil;")
    public abstract class586[] method1058();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;Lqh;I)V")
    public abstract void method1054(class151 arg0, class67 arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method1026(int arg0, int arg1, class151 arg2, boolean arg3);

    @OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1049(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1046(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
    public abstract int method1012();

    @OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
    public abstract int method1039();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method2461(int arg0) {
        field5982 = null;
        if (arg0 != 16383) {
            method2464(-7);
        }
        field5976 = null;
    }

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
    public abstract void method1033(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lrca;")
    public abstract class30[] method1057();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;IZ)V")
    public abstract void method1043(class151 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)I")
    public static final int method2462(byte arg0) {
        int var1 = 60 % ((arg0 - 61) / 42);
        field5971++;
        return class394.field5963;
    }

    @OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
    public abstract void method1019(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B[IIIIZIII[I)V")
    private final void method2463(byte arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg3 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg2;
                arg2 = arg6;
                arg6 = var16;
            } else if (arg8 == 3) {
                int var14 = arg2;
                arg2 = arg6;
                arg6 = var14;
            } else if (arg8 == 2) {
                int var15 = arg2;
                arg2 = -arg6 & 0x3FFF;
                arg6 = var15 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg6 = -arg6;
                arg2 = -arg2;
            } else if (arg8 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg6 = -arg6 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg2;
                arg2 = -arg6;
                arg6 = var13;
            } else if (arg8 == 3) {
                int var11 = arg2;
                arg2 = arg6;
                arg6 = var11;
            } else if (arg8 == 2) {
                int var12 = arg2;
                arg2 = arg6 & 0x3FFF;
                arg6 = -var12 & 0x3FFF;
            }
        }
        field5973++;
        if (arg0 != 42) {
            field5976 = null;
        }
        if (arg4 == 65535) {
            this.method1046(arg8, arg1, arg2, arg7, arg6, arg3, arg5);
        } else {
            this.method1049(arg8, arg1, arg2, arg7, arg6, arg5, arg4, arg9);
        }
    }

    @OriginalMember(owner = "client!da", name = "S", descriptor = "(Lha;)Lha;")
    public abstract class425 method1031(class425 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lda;")
    public abstract class395 method1038(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
    public abstract void method1045(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILq;ZI)Z")
    public abstract boolean method1022(int arg0, int arg1, class151 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lq;)V")
    public abstract void method1032(class151 arg0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static final void method2464(int arg0) {
        if (arg0 != 4752) {
            return;
        }
        field5978++;
        class147 var1 = (class147) class430.field6262.method1904(false);
        boolean var2 = class188.field2561 != null || class393.field5949 > 0;
        if (var2) {
            class44.field659 = 1;
        }
        if (class51.field790 && class18.field362.method1609(81, -27453) && class373.field5520 > 2) {
            if (var2) {
                class606.field8763 = (class426) class152.field2150.field4475.field5735.field5735;
            } else {
                class85.method482((class426) class152.field2150.field4475.field5735.field5735, 0, var1.method475(arg0 - 4754), var1.method478(0));
            }
        } else if (var2) {
            class606.field8763 = (class426) class152.field2150.field4475.field5735;
        } else {
            class85.method482((class426) class152.field2150.field4475.field5735, arg0 - 4752, var1.method475(-2), var1.method478(0));
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public abstract void method1047(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public abstract int method1027();

    @OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
    public abstract void method1028();
}
