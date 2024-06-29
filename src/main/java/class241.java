import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class241 extends class135 {

    @OriginalMember(owner = "client!v", name = "A", descriptor = "[B")
    public byte[] field3478;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
    public final void method1756(byte arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            method1757((byte) -119, 22, 17, -68, -24, (byte[]) null);
        }
        int var3 = this.field3478.length - 8;
        while (var2 < var3) {
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
            var2++;
            this.field3478[var2] = 0;
        }
        while ((this.field3478.length - 1) > var2) {
            var2++;
            this.field3478[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII[B)V")
    private static final void method1757(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg1 >= arg2) {
            return;
        }
        int var6 = arg2 - arg1 >> 2;
        if (arg0 != -67) {
            return;
        }
        int var7 = arg1 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg2 - arg1 & 0x3;
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

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.method1756((byte) -57);
        }
        this.field3480 = arg4;
        this.field3481 = arg3 - arg4;
        this.field3482 = arg1 - arg0;
        this.field3479 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Z")
    public final boolean method1759(int arg0, int arg1, int arg2) {
        int var4 = 47 / ((2 - arg2) / 59);
        return (arg0 * arg1) <= this.field3478.length;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
    public final void method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg5 - arg0 << 16) / (arg3 - arg1);
        }
        int var9 = 0;
        if (arg3 != arg6) {
            var9 = (arg4 - arg5 << 16) / (arg6 - arg3);
        }
        if (arg2 != -1840888080) {
            this.field3482 = 80;
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg0 - arg4 << 16) / (arg1 - arg6);
        }
        if (arg3 >= arg1 && arg6 >= arg1) {
            if (arg3 >= arg6) {
                int var11;
                int var12 = var11 = arg0 << 16;
                int var13 = arg4 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var9 > var8) {
                    int var14 = arg3 - arg6;
                    int var15 = arg6 - arg1;
                    int var16 = this.field3481 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var13 >> 16, var11 >> 16, var16, 0, this.field3478);
                                var13 += var9;
                                var11 += var8;
                                var16 += this.field3481;
                            }
                        }
                        method1757((byte) -67, var12 >> 16, var11 >> 16, var16, 0, this.field3478);
                        var12 += var10;
                        var16 += this.field3481;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg3 - arg6;
                    int var18 = arg6 - arg1;
                    int var19 = this.field3481 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var11 >> 16, var13 >> 16, var19, 0, this.field3478);
                                var11 += var8;
                                var19 += this.field3481;
                                var13 += var9;
                            }
                        }
                        method1757((byte) -67, var11 >> 16, var12 >> 16, var19, 0, this.field3478);
                        var12 += var10;
                        var19 += this.field3481;
                        var11 += var8;
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
                int var22 = arg5 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg1 == arg3 || var10 >= var8) && (arg1 != arg3 || var10 <= var9)) {
                    int var26 = arg6 - arg3;
                    int var27 = arg3 - arg1;
                    int var28 = this.field3481 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var22 >> 16, var21 >> 16, var28, 0, this.field3478);
                                var22 += var9;
                                var28 += this.field3481;
                                var21 += var10;
                            }
                        }
                        method1757((byte) -67, var20 >> 16, var21 >> 16, var28, 0, this.field3478);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field3481;
                    }
                } else {
                    int var23 = arg6 - arg3;
                    int var24 = arg3 - arg1;
                    int var25 = this.field3481 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var21 >> 16, var22 >> 16, var25, 0, this.field3478);
                                var25 += this.field3481;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        method1757((byte) -67, var21 >> 16, var20 >> 16, var25, 0, this.field3478);
                        var25 += this.field3481;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg6 < arg3) {
            if (arg1 < arg3) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var31 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg3 - arg1;
                    int var33 = arg1 - arg6;
                    int var34 = this.field3481 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var31 >> 16, var30 >> 16, var34, 0, this.field3478);
                                var30 += var9;
                                var31 += var8;
                                var34 += this.field3481;
                            }
                        }
                        method1757((byte) -67, var29 >> 16, var30 >> 16, var34, 0, this.field3478);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field3481;
                    }
                } else {
                    int var35 = arg3 - arg1;
                    int var36 = arg1 - arg6;
                    int var37 = this.field3481 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var30 >> 16, var31 >> 16, var37, 0, this.field3478);
                                var30 += var9;
                                var37 += this.field3481;
                                var31 += var8;
                            }
                        }
                        method1757((byte) -67, var30 >> 16, var29 >> 16, var37, 0, this.field3478);
                        var37 += this.field3481;
                        var29 += var10;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                int var40 = arg5 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var9;
                    var38 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg1 - arg3;
                    int var42 = arg3 - arg6;
                    int var43 = this.field3481 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var38 >> 16, var40 >> 16, var43, 0, this.field3478);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field3481;
                            }
                        }
                        method1757((byte) -67, var38 >> 16, var39 >> 16, var43, 0, this.field3478);
                        var39 += var9;
                        var43 += this.field3481;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg1 - arg3;
                    int var45 = arg3 - arg6;
                    int var46 = this.field3481 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                method1757((byte) -67, var40 >> 16, var38 >> 16, var46, 0, this.field3478);
                                var46 += this.field3481;
                                var38 += var10;
                                var40 += var8;
                            }
                        }
                        method1757((byte) -67, var39 >> 16, var38 >> 16, var46, 0, this.field3478);
                        var46 += this.field3481;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg6 >= arg1) {
            int var47;
            int var48 = var47 = arg5 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            int var49 = arg0 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var9 <= var8) {
                int var50 = arg6 - arg1;
                int var51 = arg1 - arg3;
                int var52 = this.field3481 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            method1757((byte) -67, var47 >> 16, var49 >> 16, var52, 0, this.field3478);
                            var47 += var9;
                            var52 += this.field3481;
                            var49 += var10;
                        }
                    }
                    method1757((byte) -67, var47 >> 16, var48 >> 16, var52, 0, this.field3478);
                    var48 += var8;
                    var52 += this.field3481;
                    var47 += var9;
                }
            } else {
                int var53 = arg6 - arg1;
                int var54 = arg1 - arg3;
                int var55 = this.field3481 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            method1757((byte) -67, var49 >> 16, var47 >> 16, var55, 0, this.field3478);
                            var47 += var9;
                            var55 += this.field3481;
                            var49 += var10;
                        }
                    }
                    method1757((byte) -67, var48 >> 16, var47 >> 16, var55, 0, this.field3478);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field3481;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg4 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var9;
                var57 -= arg3 * var8;
                arg3 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg3 != arg6 && var9 > var8 || arg3 == arg6 && var8 > var10) {
                int var59 = arg1 - arg6;
                int var60 = arg6 - arg3;
                int var61 = this.field3481 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            method1757((byte) -67, var57 >> 16, var58 >> 16, var61, 0, this.field3478);
                            var58 += var10;
                            var61 += this.field3481;
                            var57 += var8;
                        }
                    }
                    method1757((byte) -67, var57 >> 16, var56 >> 16, var61, 0, this.field3478);
                    var61 += this.field3481;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg1 - arg6;
                int var63 = arg6 - arg3;
                int var64 = this.field3481 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            method1757((byte) -67, var58 >> 16, var57 >> 16, var64, 0, this.field3478);
                            var57 += var8;
                            var64 += this.field3481;
                            var58 += var10;
                        }
                    }
                    method1757((byte) -67, var56 >> 16, var57 >> 16, var64, 0, this.field3478);
                    var57 += var8;
                    var56 += var9;
                    var64 += this.field3481;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lge;II)V")
    public class241(class104 arg0, int arg1, int arg2) {
        this.field3478 = new byte[arg1 * arg2];
    }
}
