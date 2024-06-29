import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class123 extends class380 {

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[B")
    public byte[] field1605;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
    public final void method732(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        this.field1602 = arg4;
        this.field1604 = arg2 - arg1;
        if (arg3) {
            this.field1604 = -15;
        }
        this.field1603 = arg0 - arg4;
        this.field1601 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIBI)V")
    public final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 >= -28) {
            return;
        }
        int var8 = 0;
        if (arg1 != arg4) {
            var8 = (arg2 - arg0 << 16) / (arg4 - arg1);
        }
        int var9 = 0;
        if (arg4 != arg6) {
            var9 = (arg3 - arg2 << 16) / (arg6 - arg4);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg0 - arg3 << 16) / (arg1 - arg6);
        }
        if (arg4 >= arg1 && arg1 <= arg6) {
            if (arg6 > arg4) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg1 == arg4 || var10 >= var8) && (arg1 != arg4 || var9 >= var10)) {
                    int var17 = arg6 - arg4;
                    int var18 = arg4 - arg1;
                    int var19 = this.field1604 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method734(var12 >> 16, (byte) 113, 0, var19, var13 >> 16, this.field1605);
                                var19 += this.field1604;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        method734(var12 >> 16, (byte) 100, 0, var19, var11 >> 16, this.field1605);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field1604;
                    }
                } else {
                    int var14 = arg6 - arg4;
                    int var15 = arg4 - arg1;
                    int var16 = this.field1604 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method734(var13 >> 16, (byte) 89, 0, var16, var12 >> 16, this.field1605);
                                var16 += this.field1604;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        method734(var11 >> 16, (byte) 100, 0, var16, var12 >> 16, this.field1605);
                        var11 += var8;
                        var16 += this.field1604;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg0 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg3 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg1 == arg6 || var10 >= var8) && (arg1 != arg6 || var9 <= var8)) {
                    int var26 = arg4 - arg6;
                    int var27 = arg6 - arg1;
                    int var28 = this.field1604 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method734(var22 >> 16, (byte) 43, 0, var28, var20 >> 16, this.field1605);
                                var28 += this.field1604;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        method734(var21 >> 16, (byte) 64, 0, var28, var20 >> 16, this.field1605);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field1604;
                    }
                } else {
                    int var23 = arg4 - arg6;
                    int var24 = arg6 - arg1;
                    int var25 = this.field1604 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method734(var20 >> 16, (byte) 52, 0, var25, var22 >> 16, this.field1605);
                                var20 += var8;
                                var25 += this.field1604;
                                var22 += var9;
                            }
                        }
                        method734(var20 >> 16, (byte) 126, 0, var25, var21 >> 16, this.field1605);
                        var21 += var10;
                        var25 += this.field1604;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 < arg4) {
            if (arg4 > arg1) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                int var31 = arg0 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg6;
                    int var34 = this.field1604 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method734(var31 >> 16, (byte) 95, 0, var34, var30 >> 16, this.field1605);
                                var30 += var9;
                                var31 += var8;
                                var34 += this.field1604;
                            }
                        }
                        method734(var29 >> 16, (byte) 40, 0, var34, var30 >> 16, this.field1605);
                        var34 += this.field1604;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg6;
                    int var37 = this.field1604 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method734(var30 >> 16, (byte) 66, 0, var37, var31 >> 16, this.field1605);
                                var31 += var8;
                                var37 += this.field1604;
                                var30 += var9;
                            }
                        }
                        method734(var30 >> 16, (byte) 115, 0, var37, var29 >> 16, this.field1605);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field1604;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg2 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg6;
                    int var43 = this.field1604 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method734(var38 >> 16, (byte) 116, 0, var43, var40 >> 16, this.field1605);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field1604;
                            }
                        }
                        method734(var38 >> 16, (byte) 70, 0, var43, var39 >> 16, this.field1605);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field1604;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg6;
                    int var46 = this.field1604 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method734(var40 >> 16, (byte) 115, 0, var46, var38 >> 16, this.field1605);
                                var40 += var8;
                                var38 += var10;
                                var46 += this.field1604;
                            }
                        }
                        method734(var39 >> 16, (byte) 73, 0, var46, var38 >> 16, this.field1605);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field1604;
                    }
                }
            }
        } else if (arg1 > arg6) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg3 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var8;
                var47 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if ((arg4 == arg6 || var9 <= var8) && (arg4 != arg6 || var10 >= var8)) {
                int var53 = arg1 - arg6;
                int var54 = arg6 - arg4;
                int var55 = this.field1604 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method734(var48 >> 16, (byte) 113, 0, var55, var49 >> 16, this.field1605);
                            var55 += this.field1604;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    method734(var48 >> 16, (byte) 115, 0, var55, var47 >> 16, this.field1605);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field1604;
                }
            } else {
                int var50 = arg1 - arg6;
                int var51 = arg6 - arg4;
                int var52 = this.field1604 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method734(var49 >> 16, (byte) 61, 0, var52, var48 >> 16, this.field1605);
                            var48 += var8;
                            var52 += this.field1604;
                            var49 += var10;
                        }
                    }
                    method734(var47 >> 16, (byte) 41, 0, var52, var48 >> 16, this.field1605);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field1604;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            int var58 = arg0 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var8;
                var56 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg1 < 0) {
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            if (var8 < var9) {
                int var59 = arg6 - arg1;
                int var60 = arg1 - arg4;
                int var61 = this.field1604 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method734(var56 >> 16, (byte) 48, 0, var61, var58 >> 16, this.field1605);
                            var61 += this.field1604;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    method734(var56 >> 16, (byte) 115, 0, var61, var57 >> 16, this.field1605);
                    var56 += var9;
                    var61 += this.field1604;
                    var57 += var8;
                }
            } else {
                int var62 = arg6 - arg1;
                int var63 = arg1 - arg4;
                int var64 = this.field1604 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method734(var58 >> 16, (byte) 62, 0, var64, var56 >> 16, this.field1605);
                            var64 += this.field1604;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    method734(var57 >> 16, (byte) 47, 0, var64, var56 >> 16, this.field1605);
                    var57 += var8;
                    var64 += this.field1604;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIII[B)V")
    private static final void method734(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 <= arg4) {
            return;
        }
        int var6 = arg0 - arg4 >> 2;
        int var7 = arg3 + arg4;
        if (arg1 <= 38) {
            return;
        }
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg0 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public final void method735(int arg0) {
        if (arg0 != 1012568080) {
            this.field1602 = -74;
        }
        int var2 = -1;
        int var3 = this.field1605.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
            var2++;
            this.field1605[var2] = 0;
        }
        while (var2 < (this.field1605.length - 1)) {
            var2++;
            this.field1605[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZI)Z")
    public final boolean method736(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field1603 = 44;
        }
        return (arg0 * arg2) <= this.field1605.length;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lcg;II)V")
    public class123(class393 arg0, int arg1, int arg2) {
        this.field1605 = new byte[arg1 * arg2];
    }
}
