import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class195 extends class134 {

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "Z")
    private boolean field3861;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    private int field3853;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    private int field3854;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    private int field3855;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    private int field3856;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public final synchronized void method1242(int arg0) {
        if (arg0 == 0) {
            this.method1280(0);
            this.method417(104);
        } else if (this.field3855 == 0 && this.field3853 == 0) {
            this.field3858 = 0;
            this.field3848 = 0;
            this.field3856 = 0;
            this.method417(-7);
        } else {
            int var2 = -this.field3856;
            if (this.field3856 > var2) {
                var2 = this.field3856;
            }
            if (-this.field3855 > var2) {
                var2 = -this.field3855;
            }
            if (this.field3855 > var2) {
                var2 = this.field3855;
            }
            if (-this.field3853 > var2) {
                var2 = -this.field3853;
            }
            if (this.field3853 > var2) {
                var2 = this.field3853;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3858 = arg0;
            this.field3848 = Integer.MIN_VALUE;
            this.field3847 = -this.field3856 / arg0;
            this.field3854 = -this.field3855 / arg0;
            this.field3850 = -this.field3853 / arg0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    private static final int method1243(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "()I")
    public final synchronized int method1244() {
        return this.field3860 < 0 ? -this.field3860 : this.field3860;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[B[IIIIIIIILve;II)I")
    private static final int method1245(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class195 arg11, int arg12, int arg13) {
        arg11.field3855 -= arg11.field3854 * arg5;
        arg11.field3853 -= arg11.field3850 * arg5;
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
        arg11.field3855 += arg11.field3854 * arg5;
        arg11.field3853 += arg11.field3850 * arg5;
        arg11.field3856 = arg6;
        arg11.field3859 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public final synchronized void method1246(int arg0) {
        if (this.field3860 < 0) {
            this.field3860 = -arg0;
        } else {
            this.field3860 = arg0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()Log;")
    public final class134 method655() {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
    public final int method654() {
        return this.field3848 == 0 && this.field3858 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[B[IIIIIIIIIILve;II)I")
    private static final int method1247(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class195 arg13, int arg14, int arg15) {
        arg13.field3856 -= arg13.field3847 * arg5;
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
        arg13.field3856 += arg13.field3847 * var22;
        arg13.field3855 = arg6;
        arg13.field3853 = arg7;
        arg13.field3859 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z")
    private final boolean method1248() {
        int var1 = this.field3848;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1270(var1, this.field3852);
            var2 = method1243(var1, this.field3852);
        }
        if (this.field3856 == var1 && this.field3855 == var3 && this.field3853 == var2) {
            if (this.field3848 == Integer.MIN_VALUE) {
                this.field3848 = 0;
                this.field3856 = this.field3855 = this.field3853 = 0;
                this.method417(114);
                return true;
            } else {
                this.method1254();
                return false;
            }
        } else {
            if (this.field3856 < var1) {
                this.field3847 = 1;
                this.field3858 = var1 - this.field3856;
            } else if (this.field3856 > var1) {
                this.field3847 = -1;
                this.field3858 = this.field3856 - var1;
            } else {
                this.field3847 = 0;
            }
            if (this.field3855 < var3) {
                this.field3854 = 1;
                if (this.field3858 == 0 || this.field3858 > var3 - this.field3855) {
                    this.field3858 = var3 - this.field3855;
                }
            } else if (this.field3855 > var3) {
                this.field3854 = -1;
                if (this.field3858 == 0 || this.field3858 > this.field3855 - var3) {
                    this.field3858 = this.field3855 - var3;
                }
            } else {
                this.field3854 = 0;
            }
            if (this.field3853 < var2) {
                this.field3850 = 1;
                if (this.field3858 == 0 || this.field3858 > var2 - this.field3853) {
                    this.field3858 = var2 - this.field3853;
                }
            } else if (this.field3853 > var2) {
                this.field3850 = -1;
                if (this.field3858 == 0 || this.field3858 > this.field3853 - var2) {
                    this.field3858 = this.field3853 - var2;
                }
            } else {
                this.field3850 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([B[IIIIIIIILve;)I")
    private static final int method1249(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class195 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3855 += (var14 - arg3) * arg9.field3854;
        arg9.field3853 += (var14 - arg3) * arg9.field3850;
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
        arg9.field3856 = var12 >> 2;
        arg9.field3859 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z")
    public final boolean method1250() {
        return this.field3859 < 0 || this.field3859 >= ((class62) super.field2791).field1262.length << 8;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[B[IIIIIIIIIILve;)I")
    private static final int method1251(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class195 arg12) {
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
        arg12.field3856 += (var19 - arg4) * arg12.field3847;
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
        arg12.field3855 = var15 >> 2;
        arg12.field3853 = var16 >> 2;
        arg12.field3859 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public final synchronized void method1252(boolean arg0) {
        this.field3860 = (this.field3860 >>> 31) + (this.field3860 ^ this.field3860 >> 31);
        if (arg0) {
            this.field3860 = -this.field3860;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lgf;III)Lve;")
    public static final class195 method1253(class62 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1262 != null && arg0.field1262.length != 0 ? new class195(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "()V")
    private final void method1254() {
        this.field3856 = this.field3848;
        this.field3855 = method1270(this.field3848, this.field3852);
        this.field3853 = method1243(this.field3848, this.field3852);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([B[IIIIIIIILve;)I")
    private static final int method1255(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class195 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3855 += (var14 - arg3) * arg9.field3854;
        arg9.field3853 += (var14 - arg3) * arg9.field3850;
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
        arg9.field3856 = var12 >> 2;
        arg9.field3859 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[B[IIIIIIIILve;)I")
    private static final int method1256(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class195 arg10) {
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
        arg10.field3859 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public final synchronized void method652(int arg0) {
        if (this.field3858 > 0) {
            if (arg0 >= this.field3858) {
                if (this.field3848 == Integer.MIN_VALUE) {
                    this.field3848 = 0;
                    this.field3856 = this.field3855 = this.field3853 = 0;
                    this.method417(-127);
                    arg0 = this.field3858;
                }
                this.field3858 = 0;
                this.method1254();
            } else {
                this.field3856 += this.field3847 * arg0;
                this.field3855 += this.field3854 * arg0;
                this.field3853 += this.field3850 * arg0;
                this.field3858 -= arg0;
            }
        }
        class62 var2 = (class62) super.field2791;
        int var3 = this.field3857 << 8;
        int var4 = this.field3851 << 8;
        int var5 = var2.field1262.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3849 = 0;
        }
        if (this.field3859 < 0) {
            if (this.field3860 <= 0) {
                this.method1262();
                this.method417(113);
                return;
            }
            this.field3859 = 0;
        }
        if (this.field3859 >= var5) {
            if (this.field3860 >= 0) {
                this.method1262();
                this.method417(-46);
                return;
            }
            this.field3859 = var5 - 1;
        }
        this.field3859 += this.field3860 * arg0;
        if (this.field3849 < 0) {
            if (!this.field3861) {
                if (this.field3860 < 0) {
                    if (this.field3859 < var3) {
                        this.field3859 = var4 - 1 - (var4 - 1 - this.field3859) % var6;
                    }
                } else if (this.field3859 >= var4) {
                    this.field3859 = (this.field3859 - var3) % var6 + var3;
                }
            } else {
                if (this.field3860 < 0) {
                    if (this.field3859 >= var3) {
                        return;
                    }
                    this.field3859 = var3 + var3 - 1 - this.field3859;
                    this.field3860 = -this.field3860;
                }
                while (this.field3859 >= var4) {
                    this.field3859 = var4 + var4 - 1 - this.field3859;
                    this.field3860 = -this.field3860;
                    if (this.field3859 >= var3) {
                        return;
                    }
                    this.field3859 = var3 + var3 - 1 - this.field3859;
                    this.field3860 = -this.field3860;
                }
            }
        } else {
            if (this.field3849 > 0) {
                if (this.field3861) {
                    label125: {
                        if (this.field3860 < 0) {
                            if (this.field3859 >= var3) {
                                return;
                            }
                            this.field3859 = var3 + var3 - 1 - this.field3859;
                            this.field3860 = -this.field3860;
                            if (--this.field3849 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3859 < var4) {
                                return;
                            }
                            this.field3859 = var4 + var4 - 1 - this.field3859;
                            this.field3860 = -this.field3860;
                            if (--this.field3849 == 0) {
                                break;
                            }
                            if (this.field3859 >= var3) {
                                return;
                            }
                            this.field3859 = var3 + var3 - 1 - this.field3859;
                            this.field3860 = -this.field3860;
                        } while (--this.field3849 != 0);
                    }
                } else if (this.field3860 < 0) {
                    if (this.field3859 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3859) / var6;
                    if (var7 < this.field3849) {
                        this.field3859 += var6 * var7;
                        this.field3849 -= var7;
                        return;
                    }
                    this.field3859 += this.field3849 * var6;
                    this.field3849 = 0;
                } else {
                    if (this.field3859 < var4) {
                        return;
                    }
                    int var8 = (this.field3859 - var3) / var6;
                    if (var8 < this.field3849) {
                        this.field3859 -= var6 * var8;
                        this.field3849 -= var8;
                        return;
                    }
                    this.field3859 -= this.field3849 * var6;
                    this.field3849 = 0;
                }
            }
            if (this.field3860 < 0) {
                if (this.field3859 < 0) {
                    this.field3859 = -1;
                    this.method1262();
                    this.method417(115);
                    return;
                }
            } else if (this.field3859 >= var5) {
                this.field3859 = var5;
                this.method1262();
                this.method417(106);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
    public final int method859() {
        int var1 = this.field3856 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3849 == 0) {
            var2 -= this.field3859 * var2 / (((class62) super.field2791).field1262.length << 8);
        } else if (this.field3849 >= 0) {
            var2 -= this.field3857 * var2 / ((class62) super.field2791).field1262.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I[B[IIIIIIIILve;)I")
    private static final int method1257(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class195 arg10) {
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
        arg10.field3859 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lgf;II)Lve;")
    public static final class195 method1258(class62 arg0, int arg1, int arg2) {
        return arg0.field1262 != null && arg0.field1262.length != 0 ? new class195(arg0, (int) ((long) arg0.field1258 * 256L * (long) arg1 / (long) (class38.field726 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
    public final synchronized void method653(int[] arg0, int arg1, int arg2) {
        if (this.field3848 == 0 && this.field3858 == 0) {
            this.method652(arg2);
        } else {
            class62 var4 = (class62) super.field2791;
            int var5 = this.field3857 << 8;
            int var6 = this.field3851 << 8;
            int var7 = var4.field1262.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3849 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3859 < 0) {
                if (this.field3860 <= 0) {
                    this.method1262();
                    this.method417(119);
                    return;
                }
                this.field3859 = 0;
            }
            if (this.field3859 >= var7) {
                if (this.field3860 >= 0) {
                    this.method1262();
                    this.method417(106);
                    return;
                }
                this.field3859 = var7 - 1;
            }
            if (this.field3849 < 0) {
                if (this.field3861) {
                    if (this.field3860 < 0) {
                        var9 = this.method1281(arg0, arg1, var5, var10, var4.field1262[this.field3857]);
                        if (this.field3859 >= var5) {
                            return;
                        }
                        this.field3859 = var5 + var5 - 1 - this.field3859;
                        this.field3860 = -this.field3860;
                    }
                    while (true) {
                        int var11 = this.method1260(arg0, var9, var6, var10, var4.field1262[this.field3851 - 1]);
                        if (this.field3859 < var6) {
                            return;
                        }
                        this.field3859 = var6 + var6 - 1 - this.field3859;
                        this.field3860 = -this.field3860;
                        var9 = this.method1281(arg0, var11, var5, var10, var4.field1262[this.field3857]);
                        if (this.field3859 >= var5) {
                            return;
                        }
                        this.field3859 = var5 + var5 - 1 - this.field3859;
                        this.field3860 = -this.field3860;
                    }
                } else if (this.field3860 < 0) {
                    while (true) {
                        var9 = this.method1281(arg0, var9, var5, var10, var4.field1262[this.field3851 - 1]);
                        if (this.field3859 >= var5) {
                            return;
                        }
                        this.field3859 = var6 - 1 - (var6 - 1 - this.field3859) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1260(arg0, var9, var6, var10, var4.field1262[this.field3857]);
                        if (this.field3859 < var6) {
                            return;
                        }
                        this.field3859 = (this.field3859 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3849 > 0) {
                    if (this.field3861) {
                        label130: {
                            if (this.field3860 < 0) {
                                var9 = this.method1281(arg0, arg1, var5, var10, var4.field1262[this.field3857]);
                                if (this.field3859 >= var5) {
                                    return;
                                }
                                this.field3859 = var5 + var5 - 1 - this.field3859;
                                this.field3860 = -this.field3860;
                                if (--this.field3849 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1260(arg0, var9, var6, var10, var4.field1262[this.field3851 - 1]);
                                if (this.field3859 < var6) {
                                    return;
                                }
                                this.field3859 = var6 + var6 - 1 - this.field3859;
                                this.field3860 = -this.field3860;
                                if (--this.field3849 == 0) {
                                    break;
                                }
                                var9 = this.method1281(arg0, var9, var5, var10, var4.field1262[this.field3857]);
                                if (this.field3859 >= var5) {
                                    return;
                                }
                                this.field3859 = var5 + var5 - 1 - this.field3859;
                                this.field3860 = -this.field3860;
                            } while (--this.field3849 != 0);
                        }
                    } else if (this.field3860 < 0) {
                        while (true) {
                            var9 = this.method1281(arg0, var9, var5, var10, var4.field1262[this.field3851 - 1]);
                            if (this.field3859 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3859) / var8;
                            if (var12 >= this.field3849) {
                                this.field3859 += this.field3849 * var8;
                                this.field3849 = 0;
                                break;
                            }
                            this.field3859 += var8 * var12;
                            this.field3849 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1260(arg0, var9, var6, var10, var4.field1262[this.field3857]);
                            if (this.field3859 < var6) {
                                return;
                            }
                            int var13 = (this.field3859 - var5) / var8;
                            if (var13 >= this.field3849) {
                                this.field3859 -= this.field3849 * var8;
                                this.field3849 = 0;
                                break;
                            }
                            this.field3859 -= var8 * var13;
                            this.field3849 -= var13;
                        }
                    }
                }
                if (this.field3860 < 0) {
                    this.method1281(arg0, var9, 0, var10, 0);
                    if (this.field3859 < 0) {
                        this.field3859 = -1;
                        this.method1262();
                        this.method417(-119);
                        return;
                    }
                } else {
                    this.method1260(arg0, var9, var7, var10, 0);
                    if (this.field3859 >= var7) {
                        this.field3859 = var7;
                        this.method1262();
                        this.method417(-45);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II[B[IIIIIIIILve;II)I")
    private static final int method1259(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class195 arg11, int arg12, int arg13) {
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
        arg11.field3859 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIII)I")
    private final int method1260(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3858 <= 0) {
                if (this.field3860 == 256 && (this.field3859 & 255) == 0) {
                    if (class88.field1708) {
                        return method1256(0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, 0, arg3, arg2, this);
                    }
                    return method1272(((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, 0, arg3, arg2, this);
                }
                if (class88.field1708) {
                    return method1265(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, 0, arg3, arg2, this, this.field3860, arg4);
                }
                return method1269(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, 0, arg3, arg2, this, this.field3860, arg4);
            }
            int var6 = this.field3858 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3858 += arg1;
            if (this.field3860 == 256 && (this.field3859 & 255) == 0) {
                if (class88.field1708) {
                    arg1 = method1251(0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, this.field3854, this.field3850, 0, var6, arg2, this);
                } else {
                    arg1 = method1249(((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, this.field3847, 0, var6, arg2, this);
                }
            } else if (class88.field1708) {
                arg1 = method1278(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, this.field3854, this.field3850, 0, var6, arg2, this, this.field3860, arg4);
            } else {
                arg1 = method1275(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, this.field3847, 0, var6, arg2, this, this.field3860, arg4);
            }
            this.field3858 -= arg1;
            if (this.field3858 != 0) {
                return arg1;
            }
        } while (!this.method1248());
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I[B[IIIIIIIIIILve;)I")
    private static final int method1261(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class195 arg12) {
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
        arg12.field3856 += (var19 - arg4) * arg12.field3847;
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
        arg12.field3855 = var15 >> 2;
        arg12.field3853 = var16 >> 2;
        arg12.field3859 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "()V")
    private final void method1262() {
        if (this.field3858 != 0) {
            if (this.field3848 == Integer.MIN_VALUE) {
                this.field3848 = 0;
            }
            this.field3858 = 0;
            this.method1254();
        }
    }

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "()I")
    public final synchronized int method1263() {
        return this.field3848 == Integer.MIN_VALUE ? 0 : this.field3848;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
    public final synchronized void method1264(int arg0, int arg1) {
        this.method1276(arg0, arg1, this.method1274());
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II[B[IIIIIIIILve;II)I")
    private static final int method1265(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class195 arg11, int arg12, int arg13) {
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
        arg11.field3859 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V")
    public final synchronized void method1266(int arg0) {
        this.field3849 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([B[IIIIIIILve;)I")
    private static final int method1267(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class195 arg8) {
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
        arg8.field3859 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
    private final synchronized void method1268(int arg0, int arg1) {
        this.field3848 = arg0;
        this.field3852 = arg1;
        this.field3858 = 0;
        this.method1254();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[B[IIIIIIILve;II)I")
    private static final int method1269(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class195 arg10, int arg11, int arg12) {
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
        arg10.field3859 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(II)I")
    private static final int method1270(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "()Z")
    public final boolean method1271() {
        return this.field3858 != 0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([B[IIIIIIILve;)I")
    private static final int method1272(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class195 arg8) {
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
        arg8.field3859 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()Log;")
    public final class134 method651() {
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lgf;II)V")
    private class195(class62 arg0, int arg1, int arg2) {
        super.field2791 = arg0;
        this.field3857 = arg0.field1260;
        this.field3851 = arg0.field1259;
        this.field3861 = arg0.field1261;
        this.field3860 = arg1;
        this.field3848 = arg2;
        this.field3852 = 8192;
        this.field3859 = 0;
        this.method1254();
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V")
    public final synchronized void method1273(int arg0) {
        this.method1268(arg0 << 6, this.method1274());
    }

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "()I")
    public final synchronized int method1274() {
        return this.field3852 < 0 ? -1 : this.field3852;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(II[B[IIIIIIIILve;II)I")
    private static final int method1275(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class195 arg11, int arg12, int arg13) {
        arg11.field3855 -= arg11.field3854 * arg5;
        arg11.field3853 -= arg11.field3850 * arg5;
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
        arg11.field3855 += arg11.field3854 * arg5;
        arg11.field3853 += arg11.field3850 * arg5;
        arg11.field3856 = arg6;
        arg11.field3859 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public final synchronized void method1276(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1268(arg1, arg2);
        } else {
            int var4 = method1270(arg1, arg2);
            int var5 = method1243(arg1, arg2);
            if (this.field3855 == var4 && this.field3853 == var5) {
                this.field3858 = 0;
            } else {
                int var6 = arg1 - this.field3856;
                if (this.field3856 - arg1 > var6) {
                    var6 = this.field3856 - arg1;
                }
                if (var4 - this.field3855 > var6) {
                    var6 = var4 - this.field3855;
                }
                if (this.field3855 - var4 > var6) {
                    var6 = this.field3855 - var4;
                }
                if (var5 - this.field3853 > var6) {
                    var6 = var5 - this.field3853;
                }
                if (this.field3853 - var5 > var6) {
                    var6 = this.field3853 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3858 = arg0;
                this.field3848 = arg1;
                this.field3852 = arg2;
                this.field3847 = (arg1 - this.field3856) / arg0;
                this.field3854 = (var4 - this.field3855) / arg0;
                this.field3850 = (var5 - this.field3853) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II[B[IIIIIIILve;II)I")
    private static final int method1277(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class195 arg10, int arg11, int arg12) {
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
        arg10.field3859 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II[B[IIIIIIIIIILve;II)I")
    private static final int method1278(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class195 arg13, int arg14, int arg15) {
        arg13.field3856 -= arg13.field3847 * arg5;
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
        arg13.field3856 += arg13.field3847 * var22;
        arg13.field3855 = arg6;
        arg13.field3853 = arg7;
        arg13.field3859 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V")
    public final synchronized void method1279(int arg0) {
        int var2 = ((class62) super.field2791).field1262.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3859 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)V")
    private final synchronized void method1280(int arg0) {
        this.method1268(arg0, this.method1274());
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([IIIII)I")
    private final int method1281(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3858 <= 0) {
                if (this.field3860 == -256 && (this.field3859 & 255) == 0) {
                    if (class88.field1708) {
                        return method1257(0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, 0, arg3, arg2, this);
                    }
                    return method1267(((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, 0, arg3, arg2, this);
                }
                if (class88.field1708) {
                    return method1259(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, 0, arg3, arg2, this, this.field3860, arg4);
                }
                return method1277(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, 0, arg3, arg2, this, this.field3860, arg4);
            }
            int var6 = this.field3858 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3858 += arg1;
            if (this.field3860 == -256 && (this.field3859 & 255) == 0) {
                if (class88.field1708) {
                    arg1 = method1261(0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, this.field3854, this.field3850, 0, var6, arg2, this);
                } else {
                    arg1 = method1255(((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, this.field3847, 0, var6, arg2, this);
                }
            } else if (class88.field1708) {
                arg1 = method1247(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3855, this.field3853, this.field3854, this.field3850, 0, var6, arg2, this, this.field3860, arg4);
            } else {
                arg1 = method1245(0, 0, ((class62) super.field2791).field1262, arg0, this.field3859, arg1, this.field3856, this.field3847, 0, var6, arg2, this, this.field3860, arg4);
            }
            this.field3858 -= arg1;
            if (this.field3858 != 0) {
                return arg1;
            }
        } while (!this.method1248());
        return arg3;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lgf;III)V")
    private class195(class62 arg0, int arg1, int arg2, int arg3) {
        super.field2791 = arg0;
        this.field3857 = arg0.field1260;
        this.field3851 = arg0.field1259;
        this.field3861 = arg0.field1261;
        this.field3860 = arg1;
        this.field3848 = arg2;
        this.field3852 = arg3;
        this.field3859 = 0;
        this.method1254();
    }
}
