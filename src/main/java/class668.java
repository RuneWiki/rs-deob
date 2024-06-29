import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class668 {

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    private int field9398 = 0;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
    private int field9394 = -1;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
    private boolean field9411 = false;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    private int field9405 = -1;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    private int field9401 = -1;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    private int field9413 = 0;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "Z")
    private boolean field9410 = false;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "B")
    private byte field9416;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "Lvj;")
    private class204 field9403;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "B")
    private byte field9383;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "I")
    public int field9418;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public int field9390;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public int field9382;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Z")
    private boolean field9386;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    public static int field9391 = 1339;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    private int field9388;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    private int field9397;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    private int field9402;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "Lda;")
    private class397 field9408;

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "Lha;")
    private class427 field9396;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "Lfo;")
    private class606 field9407;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "Lhda;")
    public class635 field9415;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "[Z")
    private boolean[] field9393;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZILr;ZZ)Lda;", line = 8)
    public final class397 method3758(boolean arg0, int arg1, class98 arg2, boolean arg3, boolean arg4) {
        field9404++;
        class119 var6 = class14.field224.method2834(0, this.field9382);
        if (var6.field1924 != null) {
            var6 = var6.method969(class230.field3404, 92);
        }
        if (var6 == null) {
            this.method3762(arg2, (byte) -19);
            this.field9401 = -1;
            this.field9394 = -1;
            this.field9405 = -1;
            return null;
        }
        if (!this.field9410 && this.field9394 != var6.field1953) {
            this.field9408 = null;
            this.method3769(-1, 2);
        }
        this.method3760(this.field9403, -1);
        if (arg3) {
            boolean var7 = arg3 & this.field9386 & class525.field7713.method2484(class76.field1182, false) != 0;
            arg3 = var7 & (this.field9405 != var6.field1953 || this.field9407 != null && class525.field7713.method2484(class76.field1182, !arg0) >= 2 && (this.field9406 != this.field9401 || (this.field9407.field8726 || class61.field888) && this.field9406 != this.field9388));
        }
        if (arg4 && !arg3) {
            this.field9394 = var6.field1953;
            return null;
        }
        if (arg3) {
            class68.method564(this.field9396, this.field9416, this.field9403.field3155, this.field9403.field3154, this.field9393);
            this.field9401 = -1;
            this.field9405 = -1;
        }
        if (!arg0) {
            this.field9402 = -113;
        }
        class682 var8 = class687.field9745[this.field9416];
        class682 var9;
        if (this.field9411) {
            var9 = class621.field8841[0];
        } else {
            var9 = this.field9416 < 3 ? class687.field9745[this.field9416 + 1] : null;
        }
        class397 var10 = null;
        if (this.field9407 != null) {
            if (arg3) {
                arg1 |= 0x40000;
            }
            var10 = var6.method966(this.field9418 == 11 ? 10 : this.field9418, var8, arg2, var8.method3861((byte) 108, this.field9403.field3155, this.field9403.field3154), this.field9403.field3154, this.field9406, var9, this.field9388, arg1, this.field9418 == 11 ? this.field9390 + 4 : this.field9390, (byte) 89, this.field9403.field3155, this.field9407, this.field9402);
            if (var10 == null) {
                this.field9393 = null;
                this.field9396 = null;
                this.field9398 = 0;
                this.field9413 = 0;
            } else {
                if (arg3) {
                    if (this.field9393 == null) {
                        this.field9393 = new boolean[4];
                    }
                    this.field9396 = var10.method483(this.field9396);
                    class123.method986(this.field9396, this.field9416, this.field9403.field3155, this.field9403.field3154, this.field9393);
                    this.field9405 = var6.field1953;
                    this.field9401 = this.field9406;
                }
                this.field9398 = var10.method478();
                this.field9413 = var10.method434();
            }
            this.field9408 = null;
        } else if (this.field9408 != null && (this.field9408.method468() & arg1) == arg1 && this.field9394 == var6.field1953) {
            var10 = this.field9408;
        } else {
            if (this.field9408 != null) {
                arg1 |= this.field9408.method468();
            }
            class75 var11 = var6.method960(-118, var9, var8.method3861((byte) 83, this.field9403.field3155, this.field9403.field3154), this.field9418 == 11 ? this.field9390 + 4 : this.field9390, arg2, this.field9418 == 11 ? 10 : this.field9418, this.field9403.field3155, var8, arg1, arg3, this.field9403.field3154);
            if (var11 == null) {
                this.field9408 = null;
                this.field9413 = 0;
                this.field9398 = 0;
                this.field9393 = null;
                this.field9396 = null;
            } else {
                var10 = var11.field1179;
                this.field9408 = var11.field1179;
                if (arg3) {
                    this.field9396 = var11.field1178;
                    this.field9393 = null;
                    class123.method986(this.field9396, this.field9416, this.field9403.field3155, this.field9403.field3154, null);
                    this.field9401 = -1;
                    this.field9405 = var6.field1953;
                }
                this.field9398 = var10.method478();
                this.field9413 = var10.method434();
            }
        }
        this.field9394 = var6.field1953;
        return var10;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)I", line = 148)
    public final int method3759(byte arg0) {
        field9385++;
        if (arg0 != 60) {
            this.field9386 = false;
        }
        return this.field9413;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lvj;I)V", line = 159)
    private final void method3760(class204 arg0, int arg1) {
        field9409++;
        if (arg1 != -1) {
            this.field9401 = 62;
        }
        label90: while (true) {
            if (this.field9407 == null) {
                if (this.field9410) {
                    return;
                }
                this.method3769(-1, arg1 + 3);
                if (this.field9407 == null) {
                    return;
                }
            }
            int var3 = class148.field2508 - this.field9397;
            if (var3 > 100 && this.field9407.field8721 > 0) {
                int var4 = this.field9407.field8707.length - this.field9407.field8721;
                while (this.field9406 < var4 && var3 > this.field9407.field8699[this.field9406]) {
                    var3 -= this.field9407.field8699[this.field9406];
                    this.field9406++;
                }
                if (var4 <= this.field9406) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field9407.field8707.length; var6++) {
                        var5 += this.field9407.field8699[var6];
                    }
                    var3 %= var5;
                }
                this.field9388 = this.field9406 + 1;
                if (this.field9407.field8707.length <= this.field9388) {
                    this.field9388 -= this.field9407.field8721;
                    if (this.field9388 < 0 || this.field9388 >= this.field9407.field8707.length) {
                        this.field9388 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field9407.field8699[this.field9406] >= var3) {
                            this.field9402 = var3;
                            this.field9397 = class148.field2508 - var3;
                            return;
                        }
                        class150.method1144(this.field9406, (byte) 74, arg0, this.field9407);
                        var3 -= this.field9407.field8699[this.field9406];
                        this.field9406++;
                        if (this.field9407.field8707.length <= this.field9406) {
                            this.field9406 -= this.field9407.field8721;
                            if (this.field9406 < 0 || this.field9406 >= this.field9407.field8707.length) {
                                this.field9407 = null;
                                continue label90;
                            }
                        }
                        this.field9388 = this.field9406 + 1;
                    } while (this.field9388 < this.field9407.field8707.length);
                    this.field9388 -= this.field9407.field8721;
                } while (this.field9388 >= 0 && this.field9388 < this.field9407.field8707.length);
                this.field9388 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z", line = 257)
    public final boolean method3761(int arg0) {
        if (arg0 >= -101) {
            this.method3760(null, 96);
        }
        field9399++;
        return this.field9386;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lr;B)V", line = 268)
    public final void method3762(class98 arg0, byte arg1) {
        if (arg1 != -19) {
            this.method3762(null, (byte) -47);
        }
        if (this.field9396 != null) {
            class68.method564(this.field9396, this.field9416, this.field9403.field3155, this.field9403.field3154, this.field9393);
            this.field9393 = null;
            this.field9396 = null;
        }
        field9392++;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILkfa;BI)Lbb;", line = 292)
    public static final class196 method3763(int arg0, int arg1, class382 arg2, byte arg3, int arg4) {
        if (arg3 != 23) {
            method3768(-25, -51, 36, -62, true, -100, -110);
        }
        field9395++;
        if (!arg2.field5507 && (!class452.method2633(arg0, (byte) 127) || !class452.method2633(arg1, (byte) 127))) {
            return arg2.field5528 ? new class196(arg2, 34037, arg4, arg0, arg1) : new class196(arg2, arg4, arg0, arg1, class99.method830(arg0, false), class99.method830(arg1, false));
        } else {
            return new class196(arg2, 3553, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V", line = 318)
    public final void method3764(int arg0, boolean arg1) {
        this.field9410 = true;
        if (arg1) {
            this.field9410 = false;
        }
        field9412++;
        this.method3769(arg0, 2);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZLr;IIILq;ILda;)V", line = 332)
    public final void method3765(int arg0, boolean arg1, class98 arg2, int arg3, int arg4, int arg5, class152 arg6, int arg7, class397 arg8) {
        int var10 = 123 / ((arg3 - 68) / 32);
        field9414++;
        class7[] var11 = arg8.method480();
        class94[] var12 = arg8.method486();
        if ((this.field9415 == null || this.field9415.field8982) && (var11 != null || var12 != null)) {
            class119 var13 = class14.field224.method2834(0, this.field9382);
            if (var13.field1924 != null) {
                var13 = var13.method969(class230.field3404, 92);
            }
            if (var13 != null) {
                this.field9415 = class635.method3580(class148.field2508, true);
            }
        }
        if (this.field9415 == null) {
            return;
        }
        arg8.method471(arg6);
        if (arg1) {
            this.field9415.method3579(arg2, (long) class148.field2508, var11, var12, false);
        } else {
            this.field9415.method3576((long) class148.field2508);
        }
        this.field9415.method3587(this.field9383, arg5, arg4, arg0, arg7);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILr;)V", line = 371)
    public final void method3766(int arg0, class98 arg1) {
        field9417++;
        this.method3758(true, arg0, arg1, true, true);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I", line = 379)
    public final int method3767(int arg0) {
        field9387++;
        int var2 = -54 % ((arg0 - 78) / 42);
        return this.field9398;
    }

    @OriginalMember(owner = "client!bba", name = "finalize", descriptor = "()V", line = 391)
    protected final void finalize() {
        field9400++;
        if (this.field9415 != null) {
            this.field9415.method3584();
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIZII)V", line = 402)
    public static final void method3768(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class337.method2006(-21241, arg0);
        field9381++;
        int var7 = 0;
        int var8 = arg0 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        if (!arg4) {
            field9389 = -82;
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class198.field3084 <= arg5 && class627.field8931 >= arg5) {
            int[] var15 = class657.field9275[arg5];
            int var16 = class367.method2203(class512.field7620, class94.field1398, arg1 - arg0, true);
            int var17 = class367.method2203(class512.field7620, class94.field1398, arg0 + arg1, true);
            int var18 = class367.method2203(class512.field7620, class94.field1398, arg1 - var8, true);
            int var19 = class367.method2203(class512.field7620, class94.field1398, arg1 + var8, arg4);
            class223.method1484(var15, var18, -126, arg3, var16);
            class223.method1484(var15, var19, -90, arg6, var18);
            class223.method1484(var15, var17, -124, arg3, var19);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class534.field7850[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 + var9;
                if (var21 >= class198.field3084 && class627.field8931 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class367.method2203(class512.field7620, class94.field1398, arg1 + var7, arg4);
                        int var23 = class367.method2203(class512.field7620, class94.field1398, arg1 - var7, arg4);
                        if (class627.field8931 >= var21) {
                            class223.method1484(class657.field9275[var21], var22, -121, arg3, var23);
                        }
                        if (var20 >= class198.field3084) {
                            class223.method1484(class657.field9275[var20], var22, -80, arg3, var23);
                        }
                    } else {
                        int var24 = class534.field7850[var9];
                        int var25 = class367.method2203(class512.field7620, class94.field1398, arg1 + var7, true);
                        int var26 = class367.method2203(class512.field7620, class94.field1398, arg1 - var7, true);
                        int var27 = class367.method2203(class512.field7620, class94.field1398, arg1 + var24, true);
                        int var28 = class367.method2203(class512.field7620, class94.field1398, arg1 - var24, true);
                        if (var21 <= class627.field8931) {
                            int[] var29 = class657.field9275[var21];
                            class223.method1484(var29, var28, -99, arg3, var26);
                            class223.method1484(var29, var27, -112, arg6, var28);
                            class223.method1484(var29, var25, -97, arg3, var27);
                        }
                        if (class198.field3084 <= var20) {
                            int[] var30 = class657.field9275[var20];
                            class223.method1484(var30, var28, -106, arg3, var26);
                            class223.method1484(var30, var27, -85, arg6, var28);
                            class223.method1484(var30, var25, -114, arg3, var27);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 + var7;
            if (var32 >= class198.field3084 && var31 <= class627.field8931) {
                int var33 = arg1 + var9;
                int var34 = arg1 - var9;
                if (var33 >= class512.field7620 && class94.field1398 >= var34) {
                    int var35 = class367.method2203(class512.field7620, class94.field1398, var33, true);
                    int var36 = class367.method2203(class512.field7620, class94.field1398, var34, true);
                    if (var7 >= var8) {
                        if (class627.field8931 >= var32) {
                            class223.method1484(class657.field9275[var32], var35, -128, arg3, var36);
                        }
                        if (class198.field3084 <= var31) {
                            class223.method1484(class657.field9275[var31], var35, -112, arg3, var36);
                        }
                    } else {
                        int var37 = var11 < var7 ? class534.field7850[var7] : var11;
                        int var38 = class367.method2203(class512.field7620, class94.field1398, arg1 + var37, true);
                        int var39 = class367.method2203(class512.field7620, class94.field1398, arg1 - var37, true);
                        if (class627.field8931 >= var32) {
                            int[] var40 = class657.field9275[var32];
                            class223.method1484(var40, var39, -113, arg3, var36);
                            class223.method1484(var40, var38, -117, arg6, var39);
                            class223.method1484(var40, var35, -108, arg3, var38);
                        }
                        if (var31 >= class198.field3084) {
                            int[] var41 = class657.field9275[var31];
                            class223.method1484(var41, var39, -119, arg3, var36);
                            class223.method1484(var41, var38, -113, arg6, var39);
                            class223.method1484(var41, var35, -108, arg3, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lr;Lnf;IIIILvj;ZI)V", line = 748)
    public class668(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, class204 arg6, boolean arg7, int arg8) {
        this.field9416 = (byte) arg5;
        this.field9411 = arg7;
        this.field9403 = arg6;
        this.field9383 = (byte) arg4;
        this.field9418 = arg2;
        this.field9390 = arg3;
        this.field9382 = arg1.field1953;
        this.field9386 = arg0.method742() && arg1.field1964 && !this.field9411;
        if (arg8 != -1) {
            this.field9410 = true;
        }
        this.method3769(arg8, 2);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V", line = 611)
    private final void method3769(int arg0, int arg1) {
        field9384++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class119 var5 = class14.field224.method2834(0, this.field9382);
            class119 var6 = var5;
            if (var5.field1924 != null) {
                var5 = var5.method969(class230.field3404, 92);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1962 != null) {
                if (this.field9407 != null && var5.method961(this.field9407.field8725, arg1 ^ 0x2)) {
                    return;
                }
                var3 = var5.method971(-15803);
                if (this.field9394 != var5.field1953) {
                    var4 = var5.field1968;
                }
            } else if (var5.field1905 == -1) {
                if (var6 != null && var6.field1962 != null) {
                    if (this.field9407 != null && var6.method961(this.field9407.field8725, 0)) {
                        return;
                    }
                    var3 = var6.method971(-15803);
                    if (this.field9394 != var6.field1953) {
                        var4 = var6.field1968;
                    }
                } else if (var6 != null && var6.field1905 != -1 && this.field9394 != var6.field1953) {
                    var3 = var6.field1905;
                    var4 = var6.field1968;
                }
            } else if (this.field9394 != var5.field1953) {
                var4 = var5.field1968;
                var3 = var5.field1905;
            }
        }
        if (var3 == -1) {
            this.field9407 = null;
            return;
        }
        this.field9408 = null;
        if (arg1 != 2) {
            return;
        }
        if (this.field9407 == null || this.field9407.field8725 != var3) {
            this.field9407 = class480.field6871.method1417(-3585, var3);
        } else if (this.field9407.field8710 == 0) {
            return;
        }
        if (this.field9407.field8707 == null) {
            this.field9407 = null;
            return;
        }
        if (var4) {
            this.field9406 = (int) ((double) this.field9407.field8707.length * Math.random());
            this.field9402 = ((int) (Math.random() * (double) this.field9407.field8699[this.field9406])) + 1;
        } else {
            this.field9406 = 0;
            this.field9402 = 1;
        }
        this.field9388 = this.field9406 + 1;
        if (this.field9388 < 0 || this.field9388 >= this.field9407.field8707.length) {
            this.field9388 = -1;
        }
        this.field9397 = class148.field2508 - this.field9402;
    }
}
