import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class462 extends class344 {

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    private int field6705;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    private int field6710;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
    private boolean field6715;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    private int field6708;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    private int field6706;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    private int field6701;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    private int field6702;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    private int field6703;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    private int field6704;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    private int field6707;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    private int field6709;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    private int field6711;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    private int field6712;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method650(int arg0) {
        if (this.field6702 > 0) {
            if (arg0 >= this.field6702) {
                if (this.field6714 == Integer.MIN_VALUE) {
                    this.field6714 = 0;
                    this.field6701 = this.field6703 = this.field6709 = 0;
                    this.method536(false);
                    arg0 = this.field6702;
                }
                this.field6702 = 0;
                this.method2678();
            } else {
                this.field6701 += this.field6704 * arg0;
                this.field6703 += this.field6711 * arg0;
                this.field6709 += this.field6707 * arg0;
                this.field6702 -= arg0;
            }
        }
        class80 var2 = (class80) super.field4987;
        int var3 = this.field6705 << 8;
        int var4 = this.field6710 << 8;
        int var5 = var2.field1112.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6712 = 0;
        }
        if (this.field6713 < 0) {
            if (this.field6708 <= 0) {
                this.method2679();
                this.method536(false);
                return;
            }
            this.field6713 = 0;
        }
        if (this.field6713 >= var5) {
            if (this.field6708 >= 0) {
                this.method2679();
                this.method536(false);
                return;
            }
            this.field6713 = var5 - 1;
        }
        this.field6713 += this.field6708 * arg0;
        if (this.field6712 < 0) {
            if (!this.field6715) {
                if (this.field6708 < 0) {
                    if (this.field6713 < var3) {
                        this.field6713 = var4 - 1 - (var4 - 1 - this.field6713) % var6;
                    }
                } else if (this.field6713 >= var4) {
                    this.field6713 = (this.field6713 - var3) % var6 + var3;
                }
            } else {
                if (this.field6708 < 0) {
                    if (this.field6713 >= var3) {
                        return;
                    }
                    this.field6713 = var3 + var3 - 1 - this.field6713;
                    this.field6708 = -this.field6708;
                }
                while (this.field6713 >= var4) {
                    this.field6713 = var4 + var4 - 1 - this.field6713;
                    this.field6708 = -this.field6708;
                    if (this.field6713 >= var3) {
                        return;
                    }
                    this.field6713 = var3 + var3 - 1 - this.field6713;
                    this.field6708 = -this.field6708;
                }
            }
        } else {
            if (this.field6712 > 0) {
                if (this.field6715) {
                    label125: {
                        if (this.field6708 < 0) {
                            if (this.field6713 >= var3) {
                                return;
                            }
                            this.field6713 = var3 + var3 - 1 - this.field6713;
                            this.field6708 = -this.field6708;
                            if (--this.field6712 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6713 < var4) {
                                return;
                            }
                            this.field6713 = var4 + var4 - 1 - this.field6713;
                            this.field6708 = -this.field6708;
                            if (--this.field6712 == 0) {
                                break;
                            }
                            if (this.field6713 >= var3) {
                                return;
                            }
                            this.field6713 = var3 + var3 - 1 - this.field6713;
                            this.field6708 = -this.field6708;
                        } while (--this.field6712 != 0);
                    }
                } else if (this.field6708 < 0) {
                    if (this.field6713 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6713) / var6;
                    if (var7 < this.field6712) {
                        this.field6713 += var6 * var7;
                        this.field6712 -= var7;
                        return;
                    }
                    this.field6713 += this.field6712 * var6;
                    this.field6712 = 0;
                } else {
                    if (this.field6713 < var4) {
                        return;
                    }
                    int var8 = (this.field6713 - var3) / var6;
                    if (var8 < this.field6712) {
                        this.field6713 -= var6 * var8;
                        this.field6712 -= var8;
                        return;
                    }
                    this.field6713 -= this.field6712 * var6;
                    this.field6712 = 0;
                }
            }
            if (this.field6708 < 0) {
                if (this.field6713 < 0) {
                    this.field6713 = -1;
                    this.method2679();
                    this.method536(false);
                    return;
                }
            } else if (this.field6713 >= var5) {
                this.field6713 = var5;
                this.method2679();
                this.method536(false);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[B[IIIIIIIILar;)I", line = 221)
    private static final int method2677(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class462 arg10) {
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
        arg10.field6713 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lcb;", line = 260)
    public final class344 method645() {
        return null;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "()I", line = 265)
    public final int method2075() {
        int var1 = this.field6701 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6712 == 0) {
            var2 -= this.field6713 * var2 / (((class80) super.field4987).field1112.length << 8);
        } else if (this.field6712 >= 0) {
            var2 -= this.field6705 * var2 / ((class80) super.field4987).field1112.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "()V", line = 277)
    private final void method2678() {
        this.field6701 = this.field6714;
        this.field6703 = method2700(this.field6714, this.field6706);
        this.field6709 = method2683(this.field6714, this.field6706);
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "()V", line = 282)
    private final void method2679() {
        if (this.field6702 != 0) {
            if (this.field6714 == Integer.MIN_VALUE) {
                this.field6714 = 0;
            }
            this.field6702 = 0;
            this.method2678();
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lhh;III)Lar;", line = 293)
    public static final class462 method2680(class80 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1112 != null && arg0.field1112.length != 0 ? new class462(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lhh;II)Lar;", line = 299)
    public static final class462 method2681(class80 arg0, int arg1, int arg2) {
        return arg0.field1112 != null && arg0.field1112.length != 0 ? new class462(arg0, (int) ((long) arg0.field1114 * 256L * (long) arg1 / (long) (class266.field3763 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[B[IIIIIIIIIILar;)I", line = 305)
    private static final int method2682(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class462 arg12) {
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
        arg12.field6701 += (var19 - arg4) * arg12.field6704;
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
        arg12.field6703 = var15 >> 2;
        arg12.field6709 = var16 >> 2;
        arg12.field6713 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I", line = 360)
    private static final int method2683(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "()Z", line = 363)
    public final boolean method2684() {
        return this.field6713 < 0 || this.field6713 >= ((class80) super.field4987).field1112.length << 8;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V", line = 370)
    public final synchronized void method2685(int arg0) {
        this.field6712 = arg0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIIII)I", line = 373)
    private final int method2686(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6702 <= 0) {
                if (this.field6708 == 256 && (this.field6713 & 255) == 0) {
                    if (class281.field4017) {
                        return method2677(0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, 0, arg3, arg2, this);
                    }
                    return method2715(((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, 0, arg3, arg2, this);
                }
                if (class281.field4017) {
                    return method2697(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, 0, arg3, arg2, this, this.field6708, arg4);
                }
                return method2694(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, 0, arg3, arg2, this, this.field6708, arg4);
            }
            int var6 = this.field6702 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6702 += arg1;
            if (this.field6708 == 256 && (this.field6713 & 255) == 0) {
                if (class281.field4017) {
                    arg1 = method2682(0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, this.field6711, this.field6707, 0, var6, arg2, this);
                } else {
                    arg1 = method2688(((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, this.field6704, 0, var6, arg2, this);
                }
            } else if (class281.field4017) {
                arg1 = method2693(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, this.field6711, this.field6707, 0, var6, arg2, this, this.field6708, arg4);
            } else {
                arg1 = method2704(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, this.field6704, 0, var6, arg2, this, this.field6708, arg4);
            }
            this.field6702 -= arg1;
            if (this.field6702 != 0) {
                return arg1;
            }
        } while (!this.method2691());
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[B[IIIIIIIIIILar;II)I", line = 428)
    private static final int method2687(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class462 arg13, int arg14, int arg15) {
        arg13.field6701 -= arg13.field6704 * arg5;
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
        arg13.field6701 += arg13.field6704 * var22;
        arg13.field6703 = arg6;
        arg13.field6709 = arg7;
        arg13.field6713 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([B[IIIIIIIILar;)I", line = 469)
    private static final int method2688(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class462 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6703 += (var14 - arg3) * arg9.field6711;
        arg9.field6709 += (var14 - arg3) * arg9.field6707;
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
        arg9.field6701 = var12 >> 2;
        arg9.field6713 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "()Z", line = 504)
    public final boolean method2689() {
        return this.field6702 != 0;
    }

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "()I", line = 508)
    public final synchronized int method2690() {
        return this.field6714 == Integer.MIN_VALUE ? 0 : this.field6714;
    }

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "()Z", line = 515)
    private final boolean method2691() {
        int var1 = this.field6714;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2700(var1, this.field6706);
            var2 = method2683(var1, this.field6706);
        }
        if (this.field6701 == var1 && this.field6703 == var3 && this.field6709 == var2) {
            if (this.field6714 == Integer.MIN_VALUE) {
                this.field6714 = 0;
                this.field6701 = this.field6703 = this.field6709 = 0;
                this.method536(false);
                return true;
            } else {
                this.method2678();
                return false;
            }
        } else {
            if (this.field6701 < var1) {
                this.field6704 = 1;
                this.field6702 = var1 - this.field6701;
            } else if (this.field6701 > var1) {
                this.field6704 = -1;
                this.field6702 = this.field6701 - var1;
            } else {
                this.field6704 = 0;
            }
            if (this.field6703 < var3) {
                this.field6711 = 1;
                if (this.field6702 == 0 || this.field6702 > var3 - this.field6703) {
                    this.field6702 = var3 - this.field6703;
                }
            } else if (this.field6703 > var3) {
                this.field6711 = -1;
                if (this.field6702 == 0 || this.field6702 > this.field6703 - var3) {
                    this.field6702 = this.field6703 - var3;
                }
            } else {
                this.field6711 = 0;
            }
            if (this.field6709 < var2) {
                this.field6707 = 1;
                if (this.field6702 == 0 || this.field6702 > var2 - this.field6709) {
                    this.field6702 = var2 - this.field6709;
                }
            } else if (this.field6709 > var2) {
                this.field6707 = -1;
                if (this.field6702 == 0 || this.field6702 > this.field6709 - var2) {
                    this.field6702 = this.field6709 - var2;
                }
            } else {
                this.field6707 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V", line = 600)
    public final synchronized void method651(int[] arg0, int arg1, int arg2) {
        if (this.field6714 == 0 && this.field6702 == 0) {
            this.method650(arg2);
        } else {
            class80 var4 = (class80) super.field4987;
            int var5 = this.field6705 << 8;
            int var6 = this.field6710 << 8;
            int var7 = var4.field1112.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6712 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6713 < 0) {
                if (this.field6708 <= 0) {
                    this.method2679();
                    this.method536(false);
                    return;
                }
                this.field6713 = 0;
            }
            if (this.field6713 >= var7) {
                if (this.field6708 >= 0) {
                    this.method2679();
                    this.method536(false);
                    return;
                }
                this.field6713 = var7 - 1;
            }
            if (this.field6712 < 0) {
                if (this.field6715) {
                    if (this.field6708 < 0) {
                        var9 = this.method2701(arg0, arg1, var5, var10, var4.field1112[this.field6705]);
                        if (this.field6713 >= var5) {
                            return;
                        }
                        this.field6713 = var5 + var5 - 1 - this.field6713;
                        this.field6708 = -this.field6708;
                    }
                    while (true) {
                        int var11 = this.method2686(arg0, var9, var6, var10, var4.field1112[this.field6710 - 1]);
                        if (this.field6713 < var6) {
                            return;
                        }
                        this.field6713 = var6 + var6 - 1 - this.field6713;
                        this.field6708 = -this.field6708;
                        var9 = this.method2701(arg0, var11, var5, var10, var4.field1112[this.field6705]);
                        if (this.field6713 >= var5) {
                            return;
                        }
                        this.field6713 = var5 + var5 - 1 - this.field6713;
                        this.field6708 = -this.field6708;
                    }
                } else if (this.field6708 < 0) {
                    while (true) {
                        var9 = this.method2701(arg0, var9, var5, var10, var4.field1112[this.field6710 - 1]);
                        if (this.field6713 >= var5) {
                            return;
                        }
                        this.field6713 = var6 - 1 - (var6 - 1 - this.field6713) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2686(arg0, var9, var6, var10, var4.field1112[this.field6705]);
                        if (this.field6713 < var6) {
                            return;
                        }
                        this.field6713 = (this.field6713 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6712 > 0) {
                    if (this.field6715) {
                        label130: {
                            if (this.field6708 < 0) {
                                var9 = this.method2701(arg0, arg1, var5, var10, var4.field1112[this.field6705]);
                                if (this.field6713 >= var5) {
                                    return;
                                }
                                this.field6713 = var5 + var5 - 1 - this.field6713;
                                this.field6708 = -this.field6708;
                                if (--this.field6712 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2686(arg0, var9, var6, var10, var4.field1112[this.field6710 - 1]);
                                if (this.field6713 < var6) {
                                    return;
                                }
                                this.field6713 = var6 + var6 - 1 - this.field6713;
                                this.field6708 = -this.field6708;
                                if (--this.field6712 == 0) {
                                    break;
                                }
                                var9 = this.method2701(arg0, var9, var5, var10, var4.field1112[this.field6705]);
                                if (this.field6713 >= var5) {
                                    return;
                                }
                                this.field6713 = var5 + var5 - 1 - this.field6713;
                                this.field6708 = -this.field6708;
                            } while (--this.field6712 != 0);
                        }
                    } else if (this.field6708 < 0) {
                        while (true) {
                            var9 = this.method2701(arg0, var9, var5, var10, var4.field1112[this.field6710 - 1]);
                            if (this.field6713 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6713) / var8;
                            if (var12 >= this.field6712) {
                                this.field6713 += this.field6712 * var8;
                                this.field6712 = 0;
                                break;
                            }
                            this.field6713 += var8 * var12;
                            this.field6712 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2686(arg0, var9, var6, var10, var4.field1112[this.field6705]);
                            if (this.field6713 < var6) {
                                return;
                            }
                            int var13 = (this.field6713 - var5) / var8;
                            if (var13 >= this.field6712) {
                                this.field6713 -= this.field6712 * var8;
                                this.field6712 = 0;
                                break;
                            }
                            this.field6713 -= var8 * var13;
                            this.field6712 -= var13;
                        }
                    }
                }
                if (this.field6708 < 0) {
                    this.method2701(arg0, var9, 0, var10, 0);
                    if (this.field6713 < 0) {
                        this.field6713 = -1;
                        this.method2679();
                        this.method536(false);
                        return;
                    }
                } else {
                    this.method2686(arg0, var9, var7, var10, 0);
                    if (this.field6713 >= var7) {
                        this.field6713 = var7;
                        this.method2679();
                        this.method536(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V", line = 835)
    public final synchronized void method2692(int arg0) {
        if (this.field6708 < 0) {
            this.field6708 = -arg0;
        } else {
            this.field6708 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II[B[IIIIIIIIIILar;II)I", line = 843)
    private static final int method2693(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class462 arg13, int arg14, int arg15) {
        arg13.field6701 -= arg13.field6704 * arg5;
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
        arg13.field6701 += arg13.field6704 * var22;
        arg13.field6703 = arg6;
        arg13.field6709 = arg7;
        arg13.field6713 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[B[IIIIIIILar;II)I", line = 885)
    private static final int method2694(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class462 arg10, int arg11, int arg12) {
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
        arg10.field6713 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V", line = 911)
    public final synchronized void method2695(boolean arg0) {
        this.field6708 = (this.field6708 >>> 31) + (this.field6708 ^ this.field6708 >> 31);
        if (arg0) {
            this.field6708 = -this.field6708;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([B[IIIIIIILar;)I", line = 919)
    private static final int method2696(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class462 arg8) {
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
        arg8.field6713 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II[B[IIIIIIIILar;II)I", line = 947)
    private static final int method2697(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class462 arg11, int arg12, int arg13) {
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
        arg11.field6713 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V", line = 980)
    public final synchronized void method2698(int arg0, int arg1) {
        this.method2706(arg0, arg1, this.method2708());
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V", line = 986)
    public final synchronized void method2699(int arg0) {
        int var2 = ((class80) super.field4987).field1112.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6713 = arg0;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)I", line = 996)
    private static final int method2700(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "([IIIII)I", line = 1000)
    private final int method2701(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6702 <= 0) {
                if (this.field6708 == -256 && (this.field6713 & 255) == 0) {
                    if (class281.field4017) {
                        return method2711(0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, 0, arg3, arg2, this);
                    }
                    return method2696(((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, 0, arg3, arg2, this);
                }
                if (class281.field4017) {
                    return method2716(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, 0, arg3, arg2, this, this.field6708, arg4);
                }
                return method2712(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, 0, arg3, arg2, this, this.field6708, arg4);
            }
            int var6 = this.field6702 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6702 += arg1;
            if (this.field6708 == -256 && (this.field6713 & 255) == 0) {
                if (class281.field4017) {
                    arg1 = method2707(0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, this.field6711, this.field6707, 0, var6, arg2, this);
                } else {
                    arg1 = method2703(((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, this.field6704, 0, var6, arg2, this);
                }
            } else if (class281.field4017) {
                arg1 = method2687(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6703, this.field6709, this.field6711, this.field6707, 0, var6, arg2, this, this.field6708, arg4);
            } else {
                arg1 = method2714(0, 0, ((class80) super.field4987).field1112, arg0, this.field6713, arg1, this.field6701, this.field6704, 0, var6, arg2, this, this.field6708, arg4);
            }
            this.field6702 -= arg1;
            if (this.field6702 != 0) {
                return arg1;
            }
        } while (!this.method2691());
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(II)V", line = 1056)
    private final synchronized void method2702(int arg0, int arg1) {
        this.field6714 = arg0;
        this.field6706 = arg1;
        this.field6702 = 0;
        this.method2678();
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "([B[IIIIIIIILar;)I", line = 1062)
    private static final int method2703(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class462 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6703 += (var14 - arg3) * arg9.field6711;
        arg9.field6709 += (var14 - arg3) * arg9.field6707;
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
        arg9.field6701 = var12 >> 2;
        arg9.field6713 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II[B[IIIIIIIILar;II)I", line = 1096)
    private static final int method2704(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class462 arg11, int arg12, int arg13) {
        arg11.field6703 -= arg11.field6711 * arg5;
        arg11.field6709 -= arg11.field6707 * arg5;
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
        arg11.field6703 += arg11.field6711 * arg5;
        arg11.field6709 += arg11.field6707 * arg5;
        arg11.field6701 = arg6;
        arg11.field6713 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "()I", line = 1132)
    public final synchronized int method2705() {
        return this.field6708 < 0 ? -this.field6708 : this.field6708;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V", line = 1135)
    public final synchronized void method2706(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2702(arg1, arg2);
        } else {
            int var4 = method2700(arg1, arg2);
            int var5 = method2683(arg1, arg2);
            if (this.field6703 == var4 && this.field6709 == var5) {
                this.field6702 = 0;
            } else {
                int var6 = arg1 - this.field6701;
                if (this.field6701 - arg1 > var6) {
                    var6 = this.field6701 - arg1;
                }
                if (var4 - this.field6703 > var6) {
                    var6 = var4 - this.field6703;
                }
                if (this.field6703 - var4 > var6) {
                    var6 = this.field6703 - var4;
                }
                if (var5 - this.field6709 > var6) {
                    var6 = var5 - this.field6709;
                }
                if (this.field6709 - var5 > var6) {
                    var6 = this.field6709 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6702 = arg0;
                this.field6714 = arg1;
                this.field6706 = arg2;
                this.field6704 = (arg1 - this.field6701) / arg0;
                this.field6711 = (var4 - this.field6703) / arg0;
                this.field6707 = (var5 - this.field6709) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I[B[IIIIIIIIIILar;)I", line = 1181)
    private static final int method2707(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class462 arg12) {
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
        arg12.field6701 += (var19 - arg4) * arg12.field6704;
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
        arg12.field6703 = var15 >> 2;
        arg12.field6709 = var16 >> 2;
        arg12.field6713 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "()Lcb;", line = 1234)
    public final class344 method642() {
        return null;
    }

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "()I", line = 1238)
    public final synchronized int method2708() {
        return this.field6706 < 0 ? -1 : this.field6706;
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 1243)
    private final synchronized void method2709(int arg0) {
        this.method2702(arg0, this.method2708());
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V", line = 1248)
    public final synchronized void method2710(int arg0) {
        if (arg0 == 0) {
            this.method2709(0);
            this.method536(false);
        } else if (this.field6703 == 0 && this.field6709 == 0) {
            this.field6702 = 0;
            this.field6714 = 0;
            this.field6701 = 0;
            this.method536(false);
        } else {
            int var2 = -this.field6701;
            if (this.field6701 > var2) {
                var2 = this.field6701;
            }
            if (-this.field6703 > var2) {
                var2 = -this.field6703;
            }
            if (this.field6703 > var2) {
                var2 = this.field6703;
            }
            if (-this.field6709 > var2) {
                var2 = -this.field6709;
            }
            if (this.field6709 > var2) {
                var2 = this.field6709;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6702 = arg0;
            this.field6714 = Integer.MIN_VALUE;
            this.field6704 = -this.field6701 / arg0;
            this.field6711 = -this.field6703 / arg0;
            this.field6707 = -this.field6709 / arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I[B[IIIIIIIILar;)I", line = 1293)
    private static final int method2711(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class462 arg10) {
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
        arg10.field6713 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()I", line = 1331)
    public final int method644() {
        return this.field6714 == 0 && this.field6702 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II[B[IIIIIIILar;II)I", line = 1337)
    private static final int method2712(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class462 arg10, int arg11, int arg12) {
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
        arg10.field6713 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V", line = 1364)
    public final synchronized void method2713(int arg0) {
        this.method2702(arg0 << 6, this.method2708());
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(II[B[IIIIIIIILar;II)I", line = 1367)
    private static final int method2714(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class462 arg11, int arg12, int arg13) {
        arg11.field6703 -= arg11.field6711 * arg5;
        arg11.field6709 -= arg11.field6707 * arg5;
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
        arg11.field6703 += arg11.field6711 * arg5;
        arg11.field6709 += arg11.field6707 * arg5;
        arg11.field6701 = arg6;
        arg11.field6713 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "([B[IIIIIIILar;)I", line = 1400)
    private static final int method2715(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class462 arg8) {
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
        arg8.field6713 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(II[B[IIIIIIIILar;II)I", line = 1425)
    private static final int method2716(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class462 arg11, int arg12, int arg13) {
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
        arg11.field6713 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lhh;II)V", line = 1458)
    private class462(class80 arg0, int arg1, int arg2) {
        super.field4987 = arg0;
        this.field6705 = arg0.field1116;
        this.field6710 = arg0.field1115;
        this.field6715 = arg0.field1113;
        this.field6708 = arg1;
        this.field6714 = arg2;
        this.field6706 = 8192;
        this.field6713 = 0;
        this.method2678();
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lhh;III)V", line = 1469)
    private class462(class80 arg0, int arg1, int arg2, int arg3) {
        super.field4987 = arg0;
        this.field6705 = arg0.field1116;
        this.field6710 = arg0.field1115;
        this.field6715 = arg0.field1113;
        this.field6708 = arg1;
        this.field6714 = arg2;
        this.field6706 = arg3;
        this.field6713 = 0;
        this.method2678();
    }
}
