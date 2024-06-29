import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class185 extends class206 {

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    private int field2872;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
    private boolean field2879;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    private int field2880;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    private int field2875;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    private int field2868;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    private int field2871;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field2873;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    private int field2874;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
    public final synchronized void method1226(int arg0) {
        int var2 = ((class39) super.field3305).field492.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2869 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    private static final int method1227(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[B[IIIIIIIILwg;)I")
    private static final int method1228(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class185 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field2869 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[B[IIIIIIIIIILwg;)I")
    private static final int method1229(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class185 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field2882 += (var19 - arg4) * arg12.field2881;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field2871 = var15 >> 2;
        arg12.field2877 = var16 >> 2;
        arg12.field2869 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[B[IIIIIIIIIILwg;II)I")
    private static final int method1230(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class185 arg13, int arg14, int arg15) {
        arg13.field2882 -= arg13.field2881 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var17++;
            arg3[var10001] += arg6 * var27 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var27 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
            var10001 = var17++;
            arg3[var10001] += arg6 * var24 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field2882 += arg13.field2881 * var22;
        arg13.field2871 = arg6;
        arg13.field2877 = arg7;
        arg13.field2869 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[B[IIIIIIIILwg;II)I")
    private static final int method1231(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class185 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var22 = arg4 >> 8;
            byte var23 = arg2[var22];
            int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            byte var20 = arg2[arg4 >> 8];
            int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
            var10001 = var15++;
            arg3[var10001] += arg6 * var21 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21 >> 6;
            arg4 += arg12;
        }
        arg11.field2869 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public final synchronized void method593(int arg0) {
        if (this.field2874 > 0) {
            if (arg0 >= this.field2874) {
                if (this.field2880 == Integer.MIN_VALUE) {
                    this.field2880 = 0;
                    this.field2882 = this.field2871 = this.field2877 = 0;
                    this.method900(116);
                    arg0 = this.field2874;
                }
                this.field2874 = 0;
                this.method1250();
            } else {
                this.field2882 += this.field2881 * arg0;
                this.field2871 += this.field2876 * arg0;
                this.field2877 += this.field2873 * arg0;
                this.field2874 -= arg0;
            }
        }
        class39 var2 = (class39) super.field3305;
        int var3 = this.field2878 << 8;
        int var4 = this.field2872 << 8;
        int var5 = var2.field492.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2868 = 0;
        }
        if (this.field2869 < 0) {
            if (this.field2870 <= 0) {
                this.method1249();
                this.method900(34);
                return;
            }
            this.field2869 = 0;
        }
        if (this.field2869 >= var5) {
            if (this.field2870 >= 0) {
                this.method1249();
                this.method900(23);
                return;
            }
            this.field2869 = var5 - 1;
        }
        this.field2869 += this.field2870 * arg0;
        if (this.field2868 < 0) {
            if (!this.field2879) {
                if (this.field2870 < 0) {
                    if (this.field2869 < var3) {
                        this.field2869 = var4 - 1 - (var4 - 1 - this.field2869) % var6;
                    }
                } else if (this.field2869 >= var4) {
                    this.field2869 = (this.field2869 - var3) % var6 + var3;
                }
            } else {
                if (this.field2870 < 0) {
                    if (this.field2869 >= var3) {
                        return;
                    }
                    this.field2869 = var3 + var3 - 1 - this.field2869;
                    this.field2870 = -this.field2870;
                }
                while (this.field2869 >= var4) {
                    this.field2869 = var4 + var4 - 1 - this.field2869;
                    this.field2870 = -this.field2870;
                    if (this.field2869 >= var3) {
                        return;
                    }
                    this.field2869 = var3 + var3 - 1 - this.field2869;
                    this.field2870 = -this.field2870;
                }
            }
        } else {
            if (this.field2868 > 0) {
                if (this.field2879) {
                    label125: {
                        if (this.field2870 < 0) {
                            if (this.field2869 >= var3) {
                                return;
                            }
                            this.field2869 = var3 + var3 - 1 - this.field2869;
                            this.field2870 = -this.field2870;
                            if (--this.field2868 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2869 < var4) {
                                return;
                            }
                            this.field2869 = var4 + var4 - 1 - this.field2869;
                            this.field2870 = -this.field2870;
                            if (--this.field2868 == 0) {
                                break;
                            }
                            if (this.field2869 >= var3) {
                                return;
                            }
                            this.field2869 = var3 + var3 - 1 - this.field2869;
                            this.field2870 = -this.field2870;
                        } while (--this.field2868 != 0);
                    }
                } else if (this.field2870 < 0) {
                    if (this.field2869 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2869) / var6;
                    if (var7 < this.field2868) {
                        this.field2869 += var6 * var7;
                        this.field2868 -= var7;
                        return;
                    }
                    this.field2869 += this.field2868 * var6;
                    this.field2868 = 0;
                } else {
                    if (this.field2869 < var4) {
                        return;
                    }
                    int var8 = (this.field2869 - var3) / var6;
                    if (var8 < this.field2868) {
                        this.field2869 -= var6 * var8;
                        this.field2868 -= var8;
                        return;
                    }
                    this.field2869 -= this.field2868 * var6;
                    this.field2868 = 0;
                }
            }
            if (this.field2870 < 0) {
                if (this.field2869 < 0) {
                    this.field2869 = -1;
                    this.method1249();
                    this.method900(23);
                    return;
                }
            } else if (this.field2869 >= var5) {
                this.field2869 = var5;
                this.method1249();
                this.method900(114);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II[B[IIIIIIIILwg;II)I")
    private static final int method1232(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class185 arg11, int arg12, int arg13) {
        arg11.field2871 -= arg11.field2876 * arg5;
        arg11.field2877 -= arg11.field2873 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        while (arg5 < var15) {
            byte var17 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2871 += arg11.field2876 * arg5;
        arg11.field2877 += arg11.field2873 * arg5;
        arg11.field2882 = arg6;
        arg11.field2869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    private final synchronized void method1233(int arg0) {
        this.method1261(arg0, this.method1265());
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()Z")
    public final boolean method1234() {
        return this.field2869 < 0 || this.field2869 >= ((class39) super.field3305).field492.length << 8;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Luc;II)Lwg;")
    public static final class185 method1235(class39 arg0, int arg1, int arg2) {
        return arg0.field492 != null && arg0.field492.length != 0 ? new class185(arg0, (int) ((long) arg0.field489 * 256L * (long) arg1 / (long) (class131.field2018 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIII)I")
    private final int method1236(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2874 <= 0) {
                if (this.field2870 == -256 && (this.field2869 & 255) == 0) {
                    if (class287.field4787) {
                        return method1262(0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, 0, arg3, arg2, this);
                    }
                    return method1263(((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, 0, arg3, arg2, this);
                }
                if (class287.field4787) {
                    return method1266(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, 0, arg3, arg2, this, this.field2870, arg4);
                }
                return method1240(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, 0, arg3, arg2, this, this.field2870, arg4);
            }
            int var6 = this.field2874 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2874 += arg1;
            if (this.field2870 == -256 && (this.field2869 & 255) == 0) {
                if (class287.field4787) {
                    arg1 = method1229(0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, this.field2876, this.field2873, 0, var6, arg2, this);
                } else {
                    arg1 = method1242(((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, this.field2881, 0, var6, arg2, this);
                }
            } else if (class287.field4787) {
                arg1 = method1260(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, this.field2876, this.field2873, 0, var6, arg2, this, this.field2870, arg4);
            } else {
                arg1 = method1244(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, this.field2881, 0, var6, arg2, this, this.field2870, arg4);
            }
            this.field2874 -= arg1;
            if (this.field2874 != 0) {
                return arg1;
            }
        } while (!this.method1257());
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([IIIII)I")
    private final int method1237(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2874 <= 0) {
                if (this.field2870 == 256 && (this.field2869 & 255) == 0) {
                    if (class287.field4787) {
                        return method1228(0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, 0, arg3, arg2, this);
                    }
                    return method1246(((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, 0, arg3, arg2, this);
                }
                if (class287.field4787) {
                    return method1231(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, 0, arg3, arg2, this, this.field2870, arg4);
                }
                return method1252(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, 0, arg3, arg2, this, this.field2870, arg4);
            }
            int var6 = this.field2874 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2874 += arg1;
            if (this.field2870 == 256 && (this.field2869 & 255) == 0) {
                if (class287.field4787) {
                    arg1 = method1241(0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, this.field2876, this.field2873, 0, var6, arg2, this);
                } else {
                    arg1 = method1256(((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, this.field2881, 0, var6, arg2, this);
                }
            } else if (class287.field4787) {
                arg1 = method1230(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2871, this.field2877, this.field2876, this.field2873, 0, var6, arg2, this, this.field2870, arg4);
            } else {
                arg1 = method1232(0, 0, ((class39) super.field3305).field492, arg0, this.field2869, arg1, this.field2882, this.field2881, 0, var6, arg2, this, this.field2870, arg4);
            }
            this.field2874 -= arg1;
            if (this.field2874 != 0) {
                return arg1;
            }
        } while (!this.method1257());
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()Lgg;")
    public final class206 method587() {
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "()I")
    public final synchronized int method1238() {
        return this.field2870 < 0 ? -this.field2870 : this.field2870;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public final synchronized void method1239(int arg0) {
        this.field2868 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[B[IIIIIIILwg;II)I")
    private static final int method1240(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class185 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        int var16 = arg11;
        while (arg5 < var14) {
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
            arg4 += var16;
        }
        arg10.field2869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I[B[IIIIIIIIIILwg;)I")
    private static final int method1241(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class185 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field2882 += (var19 - arg4) * arg12.field2881;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field2871 = var15 >> 2;
        arg12.field2877 = var16 >> 2;
        arg12.field2869 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[IIIIIIIILwg;)I")
    private static final int method1242(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class185 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2871 += (var14 - arg3) * arg9.field2876;
        arg9.field2877 += (var14 - arg3) * arg9.field2873;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field2882 = var12 >> 2;
        arg9.field2869 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "()I")
    public final synchronized int method1243() {
        return this.field2880 == Integer.MIN_VALUE ? 0 : this.field2880;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(II[B[IIIIIIIILwg;II)I")
    private static final int method1244(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class185 arg11, int arg12, int arg13) {
        arg11.field2871 -= arg11.field2876 * arg5;
        arg11.field2877 -= arg11.field2873 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        int var17 = arg12;
        while (arg5 < var15) {
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var17;
        }
        arg11.field2871 += arg11.field2876 * arg5;
        arg11.field2877 += arg11.field2873 * arg5;
        arg11.field2882 = arg6;
        arg11.field2869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)V")
    public final synchronized void method1245(int arg0) {
        this.method1261(arg0 << 6, this.method1265());
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[IIIIIIILwg;)I")
    private static final int method1246(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class185 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field2869 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
    public final synchronized void method1247(int arg0) {
        if (arg0 == 0) {
            this.method1233(0);
            this.method900(44);
        } else if (this.field2871 == 0 && this.field2877 == 0) {
            this.field2874 = 0;
            this.field2880 = 0;
            this.field2882 = 0;
            this.method900(120);
        } else {
            int var2 = -this.field2882;
            if (this.field2882 > var2) {
                var2 = this.field2882;
            }
            if (-this.field2871 > var2) {
                var2 = -this.field2871;
            }
            if (this.field2871 > var2) {
                var2 = this.field2871;
            }
            if (-this.field2877 > var2) {
                var2 = -this.field2877;
            }
            if (this.field2877 > var2) {
                var2 = this.field2877;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2874 = arg0;
            this.field2880 = Integer.MIN_VALUE;
            this.field2881 = -this.field2882 / arg0;
            this.field2876 = -this.field2871 / arg0;
            this.field2873 = -this.field2877 / arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
    public final synchronized void method1248(boolean arg0) {
        this.field2870 = (this.field2870 >>> 31) + (this.field2870 ^ this.field2870 >> 31);
        if (arg0) {
            this.field2870 = -this.field2870;
        }
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "()V")
    private final void method1249() {
        if (this.field2874 != 0) {
            if (this.field2880 == Integer.MIN_VALUE) {
                this.field2880 = 0;
            }
            this.field2874 = 0;
            this.method1250();
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "()V")
    private final void method1250() {
        this.field2882 = this.field2880;
        this.field2871 = method1227(this.field2880, this.field2875);
        this.field2877 = method1259(this.field2880, this.field2875);
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)V")
    public final synchronized void method1251(int arg0) {
        if (this.field2870 < 0) {
            this.field2870 = -arg0;
        } else {
            this.field2870 = arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II[B[IIIIIIILwg;II)I")
    private static final int method1252(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class185 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        while (arg5 < var14) {
            byte var16 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "()Z")
    public final boolean method1253() {
        return this.field2874 != 0;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
    public final int method589() {
        return this.field2880 == 0 && this.field2874 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public final synchronized void method1254(int arg0, int arg1) {
        this.method1255(arg0, arg1, this.method1265());
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public final synchronized void method1255(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1261(arg1, arg2);
        } else {
            int var4 = method1227(arg1, arg2);
            int var5 = method1259(arg1, arg2);
            if (this.field2871 == var4 && this.field2877 == var5) {
                this.field2874 = 0;
            } else {
                int var6 = arg1 - this.field2882;
                if (this.field2882 - arg1 > var6) {
                    var6 = this.field2882 - arg1;
                }
                if (var4 - this.field2871 > var6) {
                    var6 = var4 - this.field2871;
                }
                if (this.field2871 - var4 > var6) {
                    var6 = this.field2871 - var4;
                }
                if (var5 - this.field2877 > var6) {
                    var6 = var5 - this.field2877;
                }
                if (this.field2877 - var5 > var6) {
                    var6 = this.field2877 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2874 = arg0;
                this.field2880 = arg1;
                this.field2875 = arg2;
                this.field2881 = (arg1 - this.field2882) / arg0;
                this.field2876 = (var4 - this.field2871) / arg0;
                this.field2873 = (var5 - this.field2877) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([III)V")
    public final synchronized void method594(int[] arg0, int arg1, int arg2) {
        if (this.field2880 == 0 && this.field2874 == 0) {
            this.method593(arg2);
        } else {
            class39 var4 = (class39) super.field3305;
            int var5 = this.field2878 << 8;
            int var6 = this.field2872 << 8;
            int var7 = var4.field492.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2868 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2869 < 0) {
                if (this.field2870 <= 0) {
                    this.method1249();
                    this.method900(21);
                    return;
                }
                this.field2869 = 0;
            }
            if (this.field2869 >= var7) {
                if (this.field2870 >= 0) {
                    this.method1249();
                    this.method900(19);
                    return;
                }
                this.field2869 = var7 - 1;
            }
            if (this.field2868 < 0) {
                if (this.field2879) {
                    if (this.field2870 < 0) {
                        var9 = this.method1236(arg0, arg1, var5, var10, var4.field492[this.field2878]);
                        if (this.field2869 >= var5) {
                            return;
                        }
                        this.field2869 = var5 + var5 - 1 - this.field2869;
                        this.field2870 = -this.field2870;
                    }
                    while (true) {
                        int var11 = this.method1237(arg0, var9, var6, var10, var4.field492[this.field2872 - 1]);
                        if (this.field2869 < var6) {
                            return;
                        }
                        this.field2869 = var6 + var6 - 1 - this.field2869;
                        this.field2870 = -this.field2870;
                        var9 = this.method1236(arg0, var11, var5, var10, var4.field492[this.field2878]);
                        if (this.field2869 >= var5) {
                            return;
                        }
                        this.field2869 = var5 + var5 - 1 - this.field2869;
                        this.field2870 = -this.field2870;
                    }
                } else if (this.field2870 < 0) {
                    while (true) {
                        var9 = this.method1236(arg0, var9, var5, var10, var4.field492[this.field2872 - 1]);
                        if (this.field2869 >= var5) {
                            return;
                        }
                        this.field2869 = var6 - 1 - (var6 - 1 - this.field2869) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1237(arg0, var9, var6, var10, var4.field492[this.field2878]);
                        if (this.field2869 < var6) {
                            return;
                        }
                        this.field2869 = (this.field2869 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2868 > 0) {
                    if (this.field2879) {
                        label130: {
                            if (this.field2870 < 0) {
                                var9 = this.method1236(arg0, arg1, var5, var10, var4.field492[this.field2878]);
                                if (this.field2869 >= var5) {
                                    return;
                                }
                                this.field2869 = var5 + var5 - 1 - this.field2869;
                                this.field2870 = -this.field2870;
                                if (--this.field2868 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1237(arg0, var9, var6, var10, var4.field492[this.field2872 - 1]);
                                if (this.field2869 < var6) {
                                    return;
                                }
                                this.field2869 = var6 + var6 - 1 - this.field2869;
                                this.field2870 = -this.field2870;
                                if (--this.field2868 == 0) {
                                    break;
                                }
                                var9 = this.method1236(arg0, var9, var5, var10, var4.field492[this.field2878]);
                                if (this.field2869 >= var5) {
                                    return;
                                }
                                this.field2869 = var5 + var5 - 1 - this.field2869;
                                this.field2870 = -this.field2870;
                            } while (--this.field2868 != 0);
                        }
                    } else if (this.field2870 < 0) {
                        while (true) {
                            var9 = this.method1236(arg0, var9, var5, var10, var4.field492[this.field2872 - 1]);
                            if (this.field2869 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2869) / var8;
                            if (var12 >= this.field2868) {
                                this.field2869 += this.field2868 * var8;
                                this.field2868 = 0;
                                break;
                            }
                            this.field2869 += var8 * var12;
                            this.field2868 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1237(arg0, var9, var6, var10, var4.field492[this.field2878]);
                            if (this.field2869 < var6) {
                                return;
                            }
                            int var13 = (this.field2869 - var5) / var8;
                            if (var13 >= this.field2868) {
                                this.field2869 -= this.field2868 * var8;
                                this.field2868 = 0;
                                break;
                            }
                            this.field2869 -= var8 * var13;
                            this.field2868 -= var13;
                        }
                    }
                }
                if (this.field2870 < 0) {
                    this.method1236(arg0, var9, 0, var10, 0);
                    if (this.field2869 < 0) {
                        this.field2869 = -1;
                        this.method1249();
                        this.method900(66);
                        return;
                    }
                } else {
                    this.method1237(arg0, var9, var7, var10, 0);
                    if (this.field2869 >= var7) {
                        this.field2869 = var7;
                        this.method1249();
                        this.method900(89);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([B[IIIIIIIILwg;)I")
    private static final int method1256(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class185 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2871 += (var14 - arg3) * arg9.field2876;
        arg9.field2877 += (var14 - arg3) * arg9.field2873;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field2882 = var12 >> 2;
        arg9.field2869 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "()Z")
    private final boolean method1257() {
        int var1 = this.field2880;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1227(var1, this.field2875);
            var2 = method1259(var1, this.field2875);
        }
        if (this.field2882 == var1 && this.field2871 == var3 && this.field2877 == var2) {
            if (this.field2880 == Integer.MIN_VALUE) {
                this.field2880 = 0;
                this.field2882 = this.field2871 = this.field2877 = 0;
                this.method900(47);
                return true;
            } else {
                this.method1250();
                return false;
            }
        } else {
            if (this.field2882 < var1) {
                this.field2881 = 1;
                this.field2874 = var1 - this.field2882;
            } else if (this.field2882 > var1) {
                this.field2881 = -1;
                this.field2874 = this.field2882 - var1;
            } else {
                this.field2881 = 0;
            }
            if (this.field2871 < var3) {
                this.field2876 = 1;
                if (this.field2874 == 0 || this.field2874 > var3 - this.field2871) {
                    this.field2874 = var3 - this.field2871;
                }
            } else if (this.field2871 > var3) {
                this.field2876 = -1;
                if (this.field2874 == 0 || this.field2874 > this.field2871 - var3) {
                    this.field2874 = this.field2871 - var3;
                }
            } else {
                this.field2876 = 0;
            }
            if (this.field2877 < var2) {
                this.field2873 = 1;
                if (this.field2874 == 0 || this.field2874 > var2 - this.field2877) {
                    this.field2874 = var2 - this.field2877;
                }
            } else if (this.field2877 > var2) {
                this.field2873 = -1;
                if (this.field2874 == 0 || this.field2874 > this.field2877 - var2) {
                    this.field2874 = this.field2877 - var2;
                }
            } else {
                this.field2873 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Luc;III)Lwg;")
    public static final class185 method1258(class39 arg0, int arg1, int arg2, int arg3) {
        return arg0.field492 != null && arg0.field492.length != 0 ? new class185(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()Lgg;")
    public final class206 method596() {
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)I")
    private static final int method1259(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II[B[IIIIIIIIIILwg;II)I")
    private static final int method1260(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class185 arg13, int arg14, int arg15) {
        arg13.field2882 -= arg13.field2881 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field2882 += arg13.field2881 * var22;
        arg13.field2871 = arg6;
        arg13.field2877 = arg7;
        arg13.field2869 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)V")
    private final synchronized void method1261(int arg0, int arg1) {
        this.field2880 = arg0;
        this.field2875 = arg1;
        this.field2874 = 0;
        this.method1250();
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I[B[IIIIIIIILwg;)I")
    private static final int method1262(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class185 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field2869 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([B[IIIIIIILwg;)I")
    private static final int method1263(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class185 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field2869 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public final int method1264() {
        int var1 = this.field2882 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2868 == 0) {
            var2 -= this.field2869 * var2 / (((class39) super.field3305).field492.length << 8);
        } else if (this.field2868 >= 0) {
            var2 -= this.field2878 * var2 / ((class39) super.field3305).field492.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "()I")
    public final synchronized int method1265() {
        return this.field2875 < 0 ? -1 : this.field2875;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Luc;II)V")
    private class185(class39 arg0, int arg1, int arg2) {
        super.field3305 = arg0;
        this.field2878 = arg0.field490;
        this.field2872 = arg0.field493;
        this.field2879 = arg0.field491;
        this.field2870 = arg1;
        this.field2880 = arg2;
        this.field2875 = 8192;
        this.field2869 = 0;
        this.method1250();
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II[B[IIIIIIIILwg;II)I")
    private static final int method1266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class185 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var21 = arg4 >> 8;
            byte var22 = arg2[var21 - 1];
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
            var10001 = var15++;
            arg3[var10001] += arg6 * var20 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20 >> 6;
            arg4 += arg12;
        }
        arg11.field2869 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Luc;III)V")
    private class185(class39 arg0, int arg1, int arg2, int arg3) {
        super.field3305 = arg0;
        this.field2878 = arg0.field490;
        this.field2872 = arg0.field493;
        this.field2879 = arg0.field491;
        this.field2870 = arg1;
        this.field2880 = arg2;
        this.field2875 = arg3;
        this.field2869 = 0;
        this.method1250();
    }
}
