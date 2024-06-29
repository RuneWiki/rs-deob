import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class82 extends class68 {

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Z")
    private boolean field1150;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 5)
    public final synchronized void method639(int arg0) {
        this.field1145 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([B[IIIIIIIILwa;)I", line = 8)
    private static final int method640(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1141;
        arg9.field1138 += (var14 - arg3) * arg9.field1148;
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
        arg9.field1139 = var12 >> 2;
        arg9.field1144 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V", line = 43)
    public final synchronized void method641(int arg0, int arg1) {
        this.method673(arg0, arg1, this.method662());
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([B[IIIIIIILwa;)I", line = 46)
    private static final int method642(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1144 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[B[IIIIIIIILwa;)I", line = 72)
    private static final int method643(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1144 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 110)
    public final synchronized void method571(int arg0) {
        if (this.field1149 > 0) {
            if (arg0 >= this.field1149) {
                if (this.field1152 == Integer.MIN_VALUE) {
                    this.field1152 = 0;
                    this.field1139 = this.field1147 = this.field1138 = 0;
                    this.method1554((byte) -112);
                    arg0 = this.field1149;
                }
                this.field1149 = 0;
                this.method650();
            } else {
                this.field1139 += this.field1143 * arg0;
                this.field1147 += this.field1141 * arg0;
                this.field1138 += this.field1148 * arg0;
                this.field1149 -= arg0;
            }
        }
        class259 var2 = (class259) this.field1007;
        int var3 = this.field1151 << 8;
        int var4 = this.field1142 << 8;
        int var5 = var2.field3850.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1145 = 0;
        }
        if (this.field1144 < 0) {
            if (this.field1140 <= 0) {
                this.method665();
                this.method1554((byte) -123);
                return;
            }
            this.field1144 = 0;
        }
        if (this.field1144 >= var5) {
            if (this.field1140 >= 0) {
                this.method665();
                this.method1554((byte) -68);
                return;
            }
            this.field1144 = var5 - 1;
        }
        this.field1144 += this.field1140 * arg0;
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1150) {
                    label121: {
                        if (this.field1140 < 0) {
                            if (this.field1144 >= var3) {
                                return;
                            }
                            this.field1144 = var3 + var3 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                            if (--this.field1145 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1144 < var4) {
                                return;
                            }
                            this.field1144 = var4 + var4 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            if (this.field1144 >= var3) {
                                return;
                            }
                            this.field1144 = var3 + var3 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                        } while (--this.field1145 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1140 < 0) {
                            if (this.field1144 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1144 - 1) / var6;
                            if (var7 >= this.field1145) {
                                this.field1144 += this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1144 += var6 * var7;
                            this.field1145 -= var7;
                        } else if (this.field1144 >= var4) {
                            int var8 = (this.field1144 - var3) / var6;
                            if (var8 >= this.field1145) {
                                this.field1144 -= this.field1145 * var6;
                                this.field1145 = 0;
                                break label153;
                            }
                            this.field1144 -= var6 * var8;
                            this.field1145 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1140 < 0) {
                if (this.field1144 < 0) {
                    this.field1144 = -1;
                    this.method665();
                    this.method1554((byte) -101);
                }
            } else if (this.field1144 >= var5) {
                this.field1144 = var5;
                this.method665();
                this.method1554((byte) -25);
            }
        } else if (this.field1150) {
            if (this.field1140 < 0) {
                if (this.field1144 >= var3) {
                    return;
                }
                this.field1144 = var3 + var3 - this.field1144 - 1;
                this.field1140 = -this.field1140;
            }
            while (this.field1144 >= var4) {
                this.field1144 = var4 + var4 - this.field1144 - 1;
                this.field1140 = -this.field1140;
                if (this.field1144 >= var3) {
                    return;
                }
                this.field1144 = var3 + var3 - this.field1144 - 1;
                this.field1140 = -this.field1140;
            }
        } else if (this.field1140 < 0) {
            if (this.field1144 >= var3) {
                return;
            }
            this.field1144 = var4 - (var4 - 1 - this.field1144) % var6 - 1;
        } else if (this.field1144 >= var4) {
            this.field1144 = (this.field1144 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 328)
    public final synchronized void method644(int arg0) {
        if (arg0 == 0) {
            this.method675(0);
            this.method1554((byte) -100);
        } else if (this.field1147 == 0 && this.field1138 == 0) {
            this.field1149 = 0;
            this.field1152 = 0;
            this.field1139 = 0;
            this.method1554((byte) -108);
        } else {
            int var2 = -this.field1139;
            if (this.field1139 > var2) {
                var2 = this.field1139;
            }
            if (-this.field1147 > var2) {
                var2 = -this.field1147;
            }
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1138 > var2) {
                var2 = -this.field1138;
            }
            if (this.field1138 > var2) {
                var2 = this.field1138;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1149 = arg0;
            this.field1152 = Integer.MIN_VALUE;
            this.field1143 = -this.field1139 / arg0;
            this.field1141 = -this.field1147 / arg0;
            this.field1148 = -this.field1138 / arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([B[IIIIIIILwa;)I", line = 373)
    private static final int method645(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1144 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([III)V", line = 398)
    public final synchronized void method576(int[] arg0, int arg1, int arg2) {
        if (this.field1152 == 0 && this.field1149 == 0) {
            this.method571(arg2);
            return;
        }
        class259 var4 = (class259) this.field1007;
        int var5 = this.field1151 << 8;
        int var6 = this.field1142 << 8;
        int var7 = var4.field3850.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1145 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1144 < 0) {
            if (this.field1140 <= 0) {
                this.method665();
                this.method1554((byte) -75);
                return;
            }
            this.field1144 = 0;
        }
        if (this.field1144 >= var7) {
            if (this.field1140 >= 0) {
                this.method665();
                this.method1554((byte) -115);
                return;
            }
            this.field1144 = var7 - 1;
        }
        if (this.field1145 >= 0) {
            if (this.field1145 > 0) {
                if (this.field1150) {
                    label131: {
                        if (this.field1140 < 0) {
                            var9 = this.method677(arg0, arg1, var5, var10, var4.field3850[this.field1151]);
                            if (this.field1144 >= var5) {
                                return;
                            }
                            this.field1144 = var5 + var5 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                            if (--this.field1145 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method655(arg0, var9, var6, var10, var4.field3850[this.field1142 - 1]);
                            if (this.field1144 < var6) {
                                return;
                            }
                            this.field1144 = var6 + var6 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                            if (--this.field1145 == 0) {
                                break;
                            }
                            var9 = this.method677(arg0, var9, var5, var10, var4.field3850[this.field1151]);
                            if (this.field1144 >= var5) {
                                return;
                            }
                            this.field1144 = var5 + var5 - this.field1144 - 1;
                            this.field1140 = -this.field1140;
                        } while (--this.field1145 != 0);
                    }
                } else if (this.field1140 < 0) {
                    while (true) {
                        var9 = this.method677(arg0, var9, var5, var10, var4.field3850[this.field1142 - 1]);
                        if (this.field1144 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1144 - 1) / var8;
                        if (var12 >= this.field1145) {
                            this.field1144 += this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1144 += var8 * var12;
                        this.field1145 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method655(arg0, var9, var6, var10, var4.field3850[this.field1151]);
                        if (this.field1144 < var6) {
                            return;
                        }
                        int var13 = (this.field1144 - var5) / var8;
                        if (var13 >= this.field1145) {
                            this.field1144 -= this.field1145 * var8;
                            this.field1145 = 0;
                            break;
                        }
                        this.field1144 -= var8 * var13;
                        this.field1145 -= var13;
                    }
                }
            }
            if (this.field1140 < 0) {
                this.method677(arg0, var9, 0, var10, 0);
                if (this.field1144 < 0) {
                    this.field1144 = -1;
                    this.method665();
                    this.method1554((byte) -28);
                }
            } else {
                this.method655(arg0, var9, var7, var10, 0);
                if (this.field1144 >= var7) {
                    this.field1144 = var7;
                    this.method665();
                    this.method1554((byte) -60);
                }
            }
        } else if (this.field1150) {
            if (this.field1140 < 0) {
                var9 = this.method677(arg0, arg1, var5, var10, var4.field3850[this.field1151]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var5 + var5 - this.field1144 - 1;
                this.field1140 = -this.field1140;
            }
            while (true) {
                int var11 = this.method655(arg0, var9, var6, var10, var4.field3850[this.field1142 - 1]);
                if (this.field1144 < var6) {
                    return;
                }
                this.field1144 = var6 + var6 - this.field1144 - 1;
                this.field1140 = -this.field1140;
                var9 = this.method677(arg0, var11, var5, var10, var4.field3850[this.field1151]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var5 + var5 - this.field1144 - 1;
                this.field1140 = -this.field1140;
            }
        } else if (this.field1140 < 0) {
            while (true) {
                var9 = this.method677(arg0, var9, var5, var10, var4.field3850[this.field1142 - 1]);
                if (this.field1144 >= var5) {
                    return;
                }
                this.field1144 = var6 - (var6 - 1 - this.field1144) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method655(arg0, var9, var6, var10, var4.field3850[this.field1151]);
                if (this.field1144 < var6) {
                    return;
                }
                this.field1144 = (this.field1144 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()Z", line = 635)
    public final boolean method646() {
        return this.field1149 != 0;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I[B[IIIIIIIILwa;)I", line = 638)
    private static final int method647(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1144 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lri;", line = 676)
    public final class68 method570() {
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[B[IIIIIIIIIILwa;)I", line = 681)
    private static final int method648(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1139 += (var19 - arg4) * arg12.field1143;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1147 = var15 >> 2;
        arg12.field1138 = var16 >> 2;
        arg12.field1144 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIIIIILwa;II)I", line = 734)
    private static final int method649(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1139 -= arg13.field1143 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field1139 += arg13.field1143 * var26;
        arg13.field1147 = arg6;
        arg13.field1138 = arg7;
        arg13.field1144 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "()V", line = 777)
    private final void method650() {
        this.field1139 = this.field1152;
        this.field1147 = method666(this.field1152, this.field1146);
        this.field1138 = method658(this.field1152, this.field1146);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIIIIILwa;II)I", line = 786)
    private static final int method651(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1139 -= arg13.field1143 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field1139 += arg13.field1143 * var27;
        arg13.field1147 = arg6;
        arg13.field1138 = arg7;
        arg13.field1144 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 828)
    private static final int method652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1141 * arg5;
        arg11.field1138 -= arg11.field1148 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field1147 += arg11.field1141 * arg5;
        arg11.field1138 += arg11.field1148 * arg5;
        arg11.field1139 = arg6;
        arg11.field1144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I[B[IIIIIIIIIILwa;)I", line = 861)
    private static final int method653(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1139 += (var19 - arg4) * arg12.field1143;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1147 = var15 >> 2;
        arg12.field1138 = var16 >> 2;
        arg12.field1144 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V", line = 914)
    private final synchronized void method654(int arg0, int arg1) {
        this.field1152 = arg0;
        this.field1146 = arg1;
        this.field1149 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()Lri;", line = 920)
    public final class68 method575() {
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIII)I", line = 924)
    private final int method655(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1140 == 256 && (this.field1144 & 0xFF) == 0) {
                    if (class196.field3112) {
                        arg1 = method648(0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, this.field1141, this.field1148, 0, var6, arg2, this);
                    } else {
                        arg1 = method640(((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, this.field1143, 0, var6, arg2, this);
                    }
                } else if (class196.field3112) {
                    arg1 = method651(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, this.field1141, this.field1148, 0, var6, arg2, this, this.field1140, arg4);
                } else {
                    arg1 = method652(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, this.field1143, 0, var6, arg2, this, this.field1140, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method657()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1140 == 256 && (this.field1144 & 0xFF) == 0) {
                if (class196.field3112) {
                    return method647(0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, 0, arg3, arg2, this);
                }
                return method645(((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this);
            }
            if (class196.field3112) {
                return method678(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, 0, arg3, arg2, this, this.field1140, arg4);
            }
            return method668(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this, this.field1140, arg4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 979)
    private static final int method656(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field1144 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "()Z", line = 1012)
    private final boolean method657() {
        int var1 = this.field1152;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method666(var1, this.field1146);
            var2 = method658(var1, this.field1146);
        }
        if (this.field1139 != var1 || this.field1147 != var3 || this.field1138 != var2) {
            if (this.field1139 < var1) {
                this.field1143 = 1;
                this.field1149 = var1 - this.field1139;
            } else if (this.field1139 > var1) {
                this.field1143 = -1;
                this.field1149 = this.field1139 - var1;
            } else {
                this.field1143 = 0;
            }
            if (this.field1147 < var3) {
                this.field1141 = 1;
                if (this.field1149 == 0 || this.field1149 > var3 - this.field1147) {
                    this.field1149 = var3 - this.field1147;
                }
            } else if (this.field1147 > var3) {
                this.field1141 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1147 - var3) {
                    this.field1149 = this.field1147 - var3;
                }
            } else {
                this.field1141 = 0;
            }
            if (this.field1138 < var2) {
                this.field1148 = 1;
                if (this.field1149 == 0 || this.field1149 > var2 - this.field1138) {
                    this.field1149 = var2 - this.field1138;
                }
            } else if (this.field1138 > var2) {
                this.field1148 = -1;
                if (this.field1149 == 0 || this.field1149 > this.field1138 - var2) {
                    this.field1149 = this.field1138 - var2;
                }
            } else {
                this.field1148 = 0;
            }
            return false;
        } else if (this.field1152 == Integer.MIN_VALUE) {
            this.field1152 = 0;
            this.field1139 = this.field1147 = this.field1138 = 0;
            this.method1554((byte) -99);
            return true;
        } else {
            this.method650();
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I", line = 1097)
    private static final int method658(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 1100)
    public final synchronized void method659(boolean arg0) {
        this.field1140 = (this.field1140 >>> 31) + (this.field1140 ^ this.field1140 >> 31);
        if (arg0) {
            this.field1140 = -this.field1140;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 1106)
    public final synchronized void method660(int arg0) {
        this.method654(arg0 << 6, this.method662());
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()I", line = 1110)
    public final int method574() {
        int var1 = this.field1139 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1145 == 0) {
            var2 -= this.field1144 * var2 / (((class259) this.field1007).field3850.length << 8);
        } else if (this.field1145 >= 0) {
            var2 -= this.field1151 * var2 / ((class259) this.field1007).field3850.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "()I", line = 1122)
    public final synchronized int method661() {
        return this.field1152 == Integer.MIN_VALUE ? 0 : this.field1152;
    }

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "()I", line = 1127)
    public final synchronized int method662() {
        return this.field1146 < 0 ? -1 : this.field1146;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 1130)
    private static final int method663(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1141 * arg5;
        arg11.field1138 -= arg11.field1148 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field1147 += arg11.field1141 * arg5;
        arg11.field1138 += arg11.field1148 * arg5;
        arg11.field1139 = arg6;
        arg11.field1144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()I", line = 1166)
    public final int method573() {
        return this.field1152 == 0 && this.field1149 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIILwa;II)I", line = 1172)
    private static final int method664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field1144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "()V", line = 1198)
    private final void method665() {
        if (this.field1149 == 0) {
            return;
        }
        if (this.field1152 == Integer.MIN_VALUE) {
            this.field1152 = 0;
        }
        this.field1149 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)I", line = 1209)
    private static final int method666(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([B[IIIIIIIILwa;)I", line = 1212)
    private static final int method667(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1141;
        arg9.field1138 += (var14 - arg3) * arg9.field1148;
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
        arg9.field1139 = var12 >> 2;
        arg9.field1144 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIILwa;II)I", line = 1247)
    private static final int method668(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 1274)
    public final synchronized void method669(int arg0) {
        int var2 = ((class259) this.field1007).field3850.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1144 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "()I", line = 1284)
    public final synchronized int method670() {
        return this.field1140 < 0 ? -this.field1140 : this.field1140;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lik;II)Lwa;", line = 1290)
    public static final class82 method671(class259 arg0, int arg1, int arg2) {
        return arg0.field3850 == null || arg0.field3850.length == 0 ? null : new class82(arg0, (int) ((long) arg0.field3848 * 256L * (long) arg1 / (long) (class41.field607 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V", line = 1296)
    public final synchronized void method672(int arg0) {
        if (this.field1140 < 0) {
            this.field1140 = -arg0;
        } else {
            this.field1140 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V", line = 1305)
    public final synchronized void method673(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method654(arg1, arg2);
            return;
        }
        int var4 = method666(arg1, arg2);
        int var5 = method658(arg1, arg2);
        if (this.field1147 == var4 && this.field1138 == var5) {
            this.field1149 = 0;
            return;
        }
        int var6 = arg1 - this.field1139;
        if (this.field1139 - arg1 > var6) {
            var6 = this.field1139 - arg1;
        }
        if (var4 - this.field1147 > var6) {
            var6 = var4 - this.field1147;
        }
        if (this.field1147 - var4 > var6) {
            var6 = this.field1147 - var4;
        }
        if (var5 - this.field1138 > var6) {
            var6 = var5 - this.field1138;
        }
        if (this.field1138 - var5 > var6) {
            var6 = this.field1138 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1149 = arg0;
        this.field1152 = arg1;
        this.field1146 = arg2;
        this.field1143 = (arg1 - this.field1139) / arg0;
        this.field1141 = (var4 - this.field1147) / arg0;
        this.field1148 = (var5 - this.field1138) / arg0;
    }

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "()Z", line = 1353)
    public final boolean method674() {
        return this.field1144 < 0 || this.field1144 >= ((class259) this.field1007).field3850.length << 8;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V", line = 1357)
    private final synchronized void method675(int arg0) {
        this.method654(arg0, this.method662());
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lik;III)Lwa;", line = 1362)
    public static final class82 method676(class259 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3850 == null || arg0.field3850.length == 0 ? null : new class82(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([IIIII)I", line = 1368)
    private final int method677(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1149 > 0) {
                int var6 = this.field1149 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1149 += arg1;
                if (this.field1140 == -256 && (this.field1144 & 0xFF) == 0) {
                    if (class196.field3112) {
                        arg1 = method653(0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, this.field1141, this.field1148, 0, var6, arg2, this);
                    } else {
                        arg1 = method667(((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, this.field1143, 0, var6, arg2, this);
                    }
                } else if (class196.field3112) {
                    arg1 = method649(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, this.field1141, this.field1148, 0, var6, arg2, this, this.field1140, arg4);
                } else {
                    arg1 = method663(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, this.field1143, 0, var6, arg2, this, this.field1140, arg4);
                }
                this.field1149 -= arg1;
                if (this.field1149 != 0) {
                    return arg1;
                }
                if (!this.method657()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1140 == -256 && (this.field1144 & 0xFF) == 0) {
                if (class196.field3112) {
                    return method643(0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, 0, arg3, arg2, this);
                }
                return method642(((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this);
            }
            if (class196.field3112) {
                return method656(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1147, this.field1138, 0, arg3, arg2, this, this.field1140, arg4);
            }
            return method664(0, 0, ((class259) this.field1007).field3850, arg0, this.field1144, arg1, this.field1139, 0, arg3, arg2, this, this.field1140, arg4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lik;II)V", line = 1423)
    private class82(class259 arg0, int arg1, int arg2) {
        this.field1007 = arg0;
        this.field1151 = arg0.field3847;
        this.field1142 = arg0.field3851;
        this.field1150 = arg0.field3849;
        this.field1140 = arg1;
        this.field1152 = arg2;
        this.field1146 = 8192;
        this.field1144 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lik;III)V", line = 1435)
    private class82(class259 arg0, int arg1, int arg2, int arg3) {
        this.field1007 = arg0;
        this.field1151 = arg0.field3847;
        this.field1142 = arg0.field3851;
        this.field1150 = arg0.field3849;
        this.field1140 = arg1;
        this.field1152 = arg2;
        this.field1146 = arg3;
        this.field1144 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 1448)
    private static final int method678(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field1144 = arg4;
        return var15 >> 1;
    }
}
