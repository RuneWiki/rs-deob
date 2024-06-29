import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class157 extends class54 {

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lhm;")
    private class280 field1987;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    private int field2006;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[[I")
    public int[][] field1998;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[[I")
    private int[][] field1997;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    private int field1989;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[[B")
    private byte[][] field1999;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[[B")
    private byte[][] field1988;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    private int field1993;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[[Lde;")
    private class163[][] field1984;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "[[Lqj;")
    private class237[][] field2002;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "[[Lse;")
    private class331[][] field1986;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "[[Lmm;")
    private class355[][] field1996;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lve;IIIIZ)V", line = 2)
    public final void method273(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I", line = 5)
    public final int method271(int arg0, int arg1) {
        return this.field1998[arg0][arg1];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V", line = 10)
    public final void method280() {
        this.field1999 = null;
        this.field1988 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lfs;[I)V", line = 13)
    public final void method270(class349 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 17)
    public final void method267(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field2002 == null) {
            this.field2002 = new class237[super.field556][super.field550];
            this.field1984 = new class163[super.field556][super.field550];
        } else if (this.field1986 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1989 != var18 || var19 != 0 && this.field1989 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class163 var20 = new class163();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field2089 = var21;
            var20.field2080 = new short[var21];
            var20.field2084 = new int[var21];
            var20.field2079 = new int[var21];
            var20.field2082 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field2080[var23] = (short) (this.field1999[arg0][arg1] - this.field1988[arg0][arg1]);
                } else if (var28 == 0 && this.field1989 == var29) {
                    var20.field2080[var23] = (short) (this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]);
                } else if (this.field1989 == var28 && this.field1989 == var29) {
                    var20.field2080[var23] = (short) (this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]);
                } else if (this.field1989 == var28 && var29 == 0) {
                    var20.field2080[var23] = (short) (this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]) * var28 + (this.field1999[arg0][arg1] - this.field1988[arg0][arg1]) * (this.field1989 - var28);
                    int var31 = (this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]) * var28 + (this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]) * (this.field1989 - var28);
                    var20.field2080[var23] = (short) ((this.field1989 - var29) * var30 + var29 * var31 >> this.field1985 * 2);
                }
                int var32 = (arg0 << this.field1985) + var28;
                int var33 = (arg1 << this.field1985) + var29;
                var20.field2084[var23] = var32;
                var20.field2082[var23] = var33;
                var20.field2079[var23] = this.method265(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field2080[var23] < 2) {
                    var20.field2080[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1987.field3817.method1660(arg10[var26], (byte) -117).field823) {
                    var24 = true;
                }
            }
            var20.field2081 = new int[var25];
            if (arg9 != null) {
                var20.field2078 = new int[var25];
            }
            var20.field2088 = new short[var25];
            var20.field2085 = new short[var25];
            var20.field2077 = new short[var25];
            if (var24) {
                var20.field2083 = new short[var25];
                var20.field2087 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field2081[var20.field2086] = class347.method2109(arg8[var27], 125);
                    } else {
                        var20.field2081[var20.field2086] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field2078[var20.field2086] = class347.method2109(arg9[var27], 118);
                        } else {
                            var20.field2078[var20.field2086] = -1;
                        }
                    }
                    var20.field2088[var20.field2086] = (short) arg5[var27];
                    var20.field2085[var20.field2086] = (short) arg6[var27];
                    var20.field2077[var20.field2086] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1987.field3817.method1660(arg10[var27], (byte) -110).field823) {
                            var20.field2083[var20.field2086] = (short) arg10[var27];
                            var20.field2087[var20.field2086] = (short) arg11[var27];
                        } else {
                            var20.field2083[var20.field2086] = -1;
                        }
                    }
                    ++var20.field2086;
                }
            }
            this.field1984[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class237 var34 = new class237();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field3263 = class385.method2390(class347.method2109(arg9[0], -103), this.field1999[arg0][arg1] - this.field1988[arg0][arg1], (byte) -72);
                    if (var35 == -1) {
                        var34.field3262 = (byte) (var34.field3262 | 2);
                    }
                }
                if (this.field1998[arg0 + 1][arg1] == this.field1998[arg0][arg1] && this.field1998[arg0 + 1][arg1 + 1] == this.field1998[arg0][arg1] && this.field1998[arg0][arg1 + 1] == this.field1998[arg0][arg1]) {
                    var34.field3262 = (byte) (var34.field3262 | 1);
                }
                if (var36 != -1 && (var34.field3262 & 2) == 0 && !this.field1987.field3817.method1660(var36, (byte) -113).field823) {
                    var34.field3267 = (short) (this.field1999[arg0][arg1] - this.field1988[arg0][arg1]);
                    var34.field3265 = (short) (this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]);
                    var34.field3266 = (short) (this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]);
                    var34.field3268 = (short) (this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]);
                    var34.field3264 = (short) var36;
                } else {
                    short var37 = class347.method2109(var35, 121);
                    var34.field3267 = (short) class385.method2390(var37, this.field1999[arg0][arg1] - this.field1988[arg0][arg1], (byte) -72);
                    var34.field3265 = (short) class385.method2390(var37, this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1], (byte) -72);
                    var34.field3266 = (short) class385.method2390(var37, this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1], (byte) -72);
                    var34.field3268 = (short) class385.method2390(var37, this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1], (byte) -72);
                    var34.field3264 = -1;
                }
                this.field2002[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V", line = 247)
    public final void method277(int arg0, int arg1, int arg2) {
        if (this.field1988[arg0][arg1] < arg2) {
            this.field1988[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I", line = 253)
    public final int method265(int arg0, int arg1) {
        int var3 = arg0 >> this.field1985;
        int var4 = arg1 >> this.field1985;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field556 - 1 && var4 <= super.field550 - 1) {
            int var5 = arg0 & this.field1989 - 1;
            int var6 = arg1 & this.field1989 - 1;
            int var7 = (this.field1989 - var5) * this.field1998[var3][var4] + this.field1998[var3 + 1][var4] * var5 >> this.field1985;
            int var8 = (this.field1989 - var5) * this.field1998[var3][var4 + 1] + this.field1998[var3 + 1][var4 + 1] * var5 >> this.field1985;
            return (this.field1989 - var6) * var7 + var6 * var8 >> this.field1985;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZLvh;[I[I[I)V", line = 271)
    private final void method843(int arg0, int arg1, boolean arg2, class431 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class331 var8 = this.field1986[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4415 & 2) == 0) {
                int var9 = this.field1989 * arg0;
                int var10 = this.field1989 + var9;
                int var11 = this.field1989 * arg1;
                int var12 = this.field1989 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field4415 & 1) != 0 && !arg2) {
                    int var17 = this.field1998[arg0][arg1];
                    int var18 = this.field2000 * var17;
                    var19 = (this.field2004 * var11 + this.field1992 * var9 + var18 >> 15) + this.field1990;
                    if (var19 <= this.field1987.field3825) {
                        return;
                    }
                    var20 = (this.field2004 * var11 + this.field1992 * var10 + var18 >> 15) + this.field1990;
                    if (var20 <= this.field1987.field3825) {
                        return;
                    }
                    var21 = (this.field2004 * var12 + this.field1992 * var10 + var18 >> 15) + this.field1990;
                    if (var21 <= this.field1987.field3825) {
                        return;
                    }
                    var22 = (this.field2004 * var12 + this.field1992 * var9 + var18 >> 15) + this.field1990;
                    if (var22 <= this.field1987.field3825) {
                        return;
                    }
                    if (this.field1987.field3813) {
                        int var23 = var19 - this.field1987.field3818;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1987.field3818;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1987.field3818;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1987.field3818;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field2007 * var17;
                    int var28 = this.field1995 * var17;
                    var29 = (this.field1993 * var11 + this.field2001 * var9 + var27 >> 15) + this.field2003;
                    var30 = this.field1987.field3830 * var29 / var19 + arg3.field6331;
                    var31 = (this.field1994 * var11 + this.field1991 * var9 + var28 >> 15) + this.field2005;
                    var32 = this.field1987.field3811 * var31 / var19 + arg3.field6322;
                    var33 = (this.field1993 * var11 + this.field2001 * var10 + var27 >> 15) + this.field2003;
                    var34 = this.field1987.field3830 * var33 / var20 + arg3.field6331;
                    var35 = (this.field1994 * var11 + this.field1991 * var10 + var28 >> 15) + this.field2005;
                    var36 = this.field1987.field3811 * var35 / var20 + arg3.field6322;
                    var37 = (this.field1993 * var12 + this.field2001 * var10 + var27 >> 15) + this.field2003;
                    var38 = this.field1987.field3830 * var37 / var21 + arg3.field6331;
                    var39 = (this.field1994 * var12 + this.field1991 * var10 + var28 >> 15) + this.field2005;
                    var40 = this.field1987.field3811 * var39 / var21 + arg3.field6322;
                    var41 = (this.field1993 * var12 + this.field2001 * var9 + var27 >> 15) + this.field2003;
                    var42 = this.field1987.field3830 * var41 / var22 + arg3.field6331;
                    var43 = (this.field1994 * var12 + this.field1991 * var9 + var28 >> 15) + this.field2005;
                    var44 = this.field1987.field3811 * var43 / var22 + arg3.field6322;
                } else {
                    int var45 = this.field1998[arg0][arg1];
                    int var46 = this.field1998[arg0 + 1][arg1];
                    int var47 = this.field1998[arg0 + 1][arg1 + 1];
                    int var48 = this.field1998[arg0][arg1 + 1];
                    var19 = (this.field2004 * var11 + this.field2000 * var45 + this.field1992 * var9 >> 15) + this.field1990;
                    if (var19 <= this.field1987.field3825) {
                        return;
                    }
                    var20 = (this.field2004 * var11 + this.field2000 * var46 + this.field1992 * var10 >> 15) + this.field1990;
                    if (var20 <= this.field1987.field3825) {
                        return;
                    }
                    var21 = (this.field2004 * var12 + this.field2000 * var47 + this.field1992 * var10 >> 15) + this.field1990;
                    if (var21 <= this.field1987.field3825) {
                        return;
                    }
                    var22 = (this.field2004 * var12 + this.field2000 * var48 + this.field1992 * var9 >> 15) + this.field1990;
                    if (var22 <= this.field1987.field3825) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1987.field3818;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1997[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1987.field3818;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1997[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1987.field3818;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1997[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1987.field3818;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1997[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1987.field3813) {
                        int var57 = var19 - this.field1987.field3818;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1987.field3818;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1987.field3818;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1987.field3818;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1993 * var11 + this.field2007 * var45 + this.field2001 * var9 >> 15) + this.field2003;
                    var30 = this.field1987.field3830 * var29 / var19 + arg3.field6331;
                    var31 = (this.field1994 * var11 + this.field1995 * var45 + this.field1991 * var9 >> 15) + this.field2005;
                    var32 = this.field1987.field3811 * var31 / var19 + arg3.field6322;
                    var33 = (this.field1993 * var11 + this.field2007 * var46 + this.field2001 * var10 >> 15) + this.field2003;
                    var34 = this.field1987.field3830 * var33 / var20 + arg3.field6331;
                    var35 = (this.field1994 * var11 + this.field1995 * var46 + this.field1991 * var10 >> 15) + this.field2005;
                    var36 = this.field1987.field3811 * var35 / var20 + arg3.field6322;
                    var37 = (this.field1993 * var12 + this.field2007 * var47 + this.field2001 * var10 >> 15) + this.field2003;
                    var38 = this.field1987.field3830 * var37 / var21 + arg3.field6331;
                    var39 = (this.field1994 * var12 + this.field1995 * var47 + this.field1991 * var10 >> 15) + this.field2005;
                    var40 = this.field1987.field3811 * var39 / var21 + arg3.field6322;
                    var41 = (this.field1993 * var12 + this.field2007 * var48 + this.field2001 * var9 >> 15) + this.field2003;
                    var42 = this.field1987.field3830 * var41 / var22 + arg3.field6331;
                    var43 = (this.field1994 * var12 + this.field1995 * var48 + this.field1991 * var9 >> 15) + this.field2005;
                    var44 = this.field1987.field3811 * var43 / var22 + arg3.field6322;
                }
                boolean var61 = var8.field4414 != -1 && this.method844(this.field1987.field3817.method1660(var8.field4414, (byte) -114).field824);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6323 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6330 || var42 > arg3.field6330 || var34 > arg3.field6330;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6334 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4414 >= 0) {
                                arg3.method2672(var40, var44, var36, var38, var42, var34, this.field1987.field3842, var15, var16, var14, var8.field4416, var8.field4418, var8.field4417, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4414);
                            } else {
                                arg3.method2665(var40, var44, var36, var38, var42, var34, class75.method427(var15 << 24 | this.field1987.field3842, var8.field4416, -121), class75.method427(var16 << 24 | this.field1987.field3842, var8.field4418, -27), class75.method427(var14 << 24 | this.field1987.field3842, var8.field4417, -36));
                            }
                        } else if (var8.field4414 >= 0) {
                            arg3.method2671(var40, var44, var36, var38, var42, var34, var8.field4416, var8.field4418, var8.field4417, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4414);
                        } else {
                            arg3.method2665(var40, var44, var36, var38, var42, var34, var8.field4416, var8.field4418, var8.field4417);
                        }
                        arg3.field6334 = 0;
                    } else {
                        arg3.method2673(var40, var44, var36, var38, var42, var34, this.field1987.field3842);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6323 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6330 || var34 > arg3.field6330 || var42 > arg3.field6330;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6334 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4414 >= 0) {
                                arg3.method2672(var32, var36, var44, var30, var34, var42, this.field1987.field3842, var13, var14, var16, var8.field4420, var8.field4417, var8.field4418, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4414);
                            } else {
                                arg3.method2665(var32, var36, var44, var30, var34, var42, class75.method427(var13 << 24 | this.field1987.field3842, var8.field4420, -103), class75.method427(var14 << 24 | this.field1987.field3842, var8.field4417, -48), class75.method427(var16 << 24 | this.field1987.field3842, var8.field4418, -39));
                            }
                        } else if (var8.field4414 >= 0) {
                            arg3.method2671(var32, var36, var44, var30, var34, var42, var8.field4420, var8.field4417, var8.field4418, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4414);
                        } else {
                            arg3.method2665(var32, var36, var44, var30, var34, var42, var8.field4420, var8.field4417, var8.field4418);
                        }
                        arg3.field6334 = 0;
                        return;
                    }
                    arg3.method2673(var32, var36, var44, var30, var34, var42, this.field1987.field3842);
                }
            }
        } else {
            class355 var64 = this.field1996[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5019; ++var65) {
                    short var105 = var64.field5012[var65];
                    int var106 = var64.field5015[var65];
                    short var107 = var64.field5018[var65];
                    int var108 = (this.field2004 * var107 + this.field2000 * var106 + this.field1992 * var105 >> 15) + this.field1990;
                    if (var108 <= this.field1987.field3825) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1987.field3818;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5014[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1987.field3813) {
                        int var111 = var108 - this.field1987.field3818;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1993 * var107 + this.field2007 * var106 + this.field2001 * var105 >> 15) + this.field2003;
                    int var113 = (this.field1994 * var107 + this.field1995 * var106 + this.field1991 * var105 >> 15) + this.field2005;
                    arg4[var65] = this.field1987.field3830 * var112 / var108 + arg3.field6331;
                    arg5[var65] = this.field1987.field3811 * var113 / var108 + arg3.field6322;
                }
                if (var64.field5016 != null) {
                    int var66 = this.field1998[arg0][arg1];
                    int var67 = this.field1998[arg0 + 1][arg1];
                    int var68 = this.field1998[arg0][arg1 + 1];
                    int var69 = this.field1989 * arg0;
                    int var70 = this.field1989 + var69;
                    int var71 = this.field1989 * arg1;
                    int var72 = this.field1989 + var71;
                    int var73 = (this.field1993 * var71 + this.field2007 * var66 + this.field2001 * var69 >> 15) + this.field2003;
                    int var74 = (this.field1994 * var71 + this.field1995 * var66 + this.field1991 * var69 >> 15) + this.field2005;
                    int var75 = (this.field2004 * var71 + this.field2000 * var66 + this.field1992 * var69 >> 15) + this.field1990;
                    int var76 = (this.field1993 * var71 + this.field2007 * var67 + this.field2001 * var70 >> 15) + this.field2003;
                    int var77 = (this.field1994 * var71 + this.field1995 * var67 + this.field1991 * var70 >> 15) + this.field2005;
                    int var78 = (this.field2004 * var71 + this.field2000 * var67 + this.field1992 * var70 >> 15) + this.field1990;
                    int var79 = (this.field1993 * var72 + this.field2007 * var68 + this.field2001 * var69 >> 15) + this.field2003;
                    int var80 = (this.field1994 * var72 + this.field1995 * var68 + this.field1991 * var69 >> 15) + this.field2005;
                    int var81 = (this.field2004 * var72 + this.field2000 * var68 + this.field1992 * var69 >> 15) + this.field1990;
                    for (int var82 = 0; var82 < var64.field5011; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field6323 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field6330 || var87 > arg3.field6330 || var88 > arg3.field6330;
                            short var93 = var64.field5016[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method844(this.field1987.field3817.method1660(var93, (byte) -103).field824)) {
                                    arg3.field6334 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2672(var89, var90, var91, var86, var87, var88, this.field1987.field3842, arg6[var83], arg6[var84], arg6[var85], var64.field5017[var83], var64.field5017[var84], var64.field5017[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5017[var83] & 16777215) != 0) {
                                        arg3.method2665(var89, var90, var91, var86, var87, var88, class75.method427(arg6[var83] << 24 | this.field1987.field3842, var64.field5017[var83], -50), class75.method427(arg6[var84] << 24 | this.field1987.field3842, var64.field5017[var84], -74), class75.method427(arg6[var85] << 24 | this.field1987.field3842, var64.field5017[var85], -93));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2671(var89, var90, var91, var86, var87, var88, var64.field5017[var83], var64.field5017[var84], var64.field5017[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5017[var83] & 16777215) != 0) {
                                    arg3.method2665(var89, var90, var91, var86, var87, var88, var64.field5017[var83], var64.field5017[var84], var64.field5017[var85]);
                                }
                                arg3.field6334 = 0;
                            } else {
                                arg3.method2673(var89, var90, var91, var86, var87, var88, this.field1987.field3842);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5011; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field6323 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field6330 || var99 > arg3.field6330 || var100 > arg3.field6330;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5017[var95] & 16777215) != 0) {
                                    arg3.method2665(var101, var102, var103, var98, var99, var100, class401.method2518(this.field1987.field3842, -125, var64.field5017[var95], arg6[var95]), class401.method2518(this.field1987.field3842, -126, var64.field5017[var96], arg6[var96]), class401.method2518(this.field1987.field3842, -110, var64.field5017[var97], arg6[var97]));
                                }
                            } else if ((var64.field5017[var95] & 16777215) != 0) {
                                arg3.method2665(var101, var102, var103, var98, var99, var100, var64.field5017[var95], var64.field5017[var96], var64.field5017[var97]);
                            }
                        } else {
                            arg3.method2673(var101, var102, var103, var98, var99, var100, this.field1987.field3842);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILve;)Lve;", line = 838)
    public final class307 method274(int arg0, int arg1, class307 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Z", line = 844)
    private final boolean method844(int arg0) {
        if ((this.field2006 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lve;IIIIZ)V", line = 860)
    public final void method266(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)I", line = 866)
    private static final int method845(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[ZLvh;[I[I)V", line = 896)
    private final void method846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class431 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6328 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2002[var16][var17] != null) {
                        class237 var18 = this.field2002[var16][var17];
                        if (var18.field3264 != -1 && (var18.field3262 & 2) == 0 && var18.field3263 == -1) {
                            int var19 = this.field1987.method1640(var18.field3264);
                            arg8.method2674(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class385.method2390(var19, var18.field3266 & 65535, (byte) -72), class385.method2390(var19, var18.field3268 & 65535, (byte) -72), class385.method2390(var19, var18.field3265 & 65535, (byte) -72));
                            arg8.method2674(var15, var15, var15 - var13, var14, var13 + var14, var14, class385.method2390(var19, var18.field3267 & 65535, (byte) -72), class385.method2390(var19, var18.field3265 & 65535, (byte) -72), class385.method2390(var19, var18.field3268 & 65535, (byte) -72));
                        } else if (var18.field3263 == -1) {
                            arg8.method2674(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3266 & 65535, var18.field3268 & 65535, var18.field3265 & 65535);
                            arg8.method2674(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3267 & 65535, var18.field3265 & 65535, var18.field3268 & 65535);
                        } else {
                            int var20 = var18.field3263;
                            arg8.method2674(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2674(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1984[var16][var17] != null) {
                        class163 var21 = this.field1984[var16][var17];
                        for (int var22 = 0; var22 < var21.field2089; ++var22) {
                            arg9[var22] = (var21.field2084[var22] - this.field1989 * var16) * var13 / this.field1989 + var14;
                            arg10[var22] = var15 - (var21.field2082[var22] - this.field1989 * var17) * var13 / this.field1989;
                        }
                        for (int var23 = 0; var23 < var21.field2086; ++var23) {
                            short var24 = var21.field2088[var23];
                            short var25 = var21.field2085[var23];
                            short var26 = var21.field2077[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2078 != null && var21.field2078[var23] != -1) {
                                int var33 = var21.field2078[var23];
                                arg8.method2674(var30, var31, var32, var27, var28, var29, class385.method2390(var33, var21.field2080[var24], (byte) -72), class385.method2390(var33, var21.field2080[var25], (byte) -72), class385.method2390(var33, var21.field2080[var26], (byte) -72));
                            } else if (var21.field2083 != null && var21.field2083[var23] != -1) {
                                int var34 = this.field1987.method1640(var21.field2083[var23]);
                                arg8.method2674(var30, var31, var32, var27, var28, var29, class385.method2390(var34, var21.field2080[var24], (byte) -72), class385.method2390(var34, var21.field2080[var25], (byte) -72), class385.method2390(var34, var21.field2080[var26], (byte) -72));
                            } else {
                                int var35 = var21.field2081[var23];
                                arg8.method2674(var30, var31, var32, var27, var28, var29, class385.method2390(var35, var21.field2080[var24], (byte) -72), class385.method2390(var35, var21.field2080[var25], (byte) -72), class385.method2390(var35, var21.field2080[var26], (byte) -72));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6328 = true;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)V", line = 1028)
    public final void method276(int arg0, int arg1) {
        class373 var3 = this.field1987.method1606(Thread.currentThread());
        var3.field5210.field6334 = 0;
        if (this.field1986 != null) {
            this.method843(arg0, arg1, this.field1987.field3820, var3.field5210, var3.field5225, var3.field5221, var3.field5234);
        } else {
            if (this.field2002 != null) {
                this.method848(arg0, arg1, var3.field5210, var3.field5225, var3.field5221, var3.field5234);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lve;IIIIZ)Z", line = 1043)
    public final boolean method278(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIIIIII[[ZLvh;[I[I)V", line = 1049)
    private final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class431 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6328 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1986[var16][var17] != null) {
                        class331 var18 = this.field1986[var16][var17];
                        if (var18.field4414 != -1 && (var18.field4415 & 2) == 0 && var18.field4419 == 0) {
                            int var19 = this.field1987.method1640(var18.field4414);
                            arg8.method2674(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class385.method2390(var19, var18.field4416, (byte) -72), class385.method2390(var19, var18.field4418, (byte) -72), class385.method2390(var19, var18.field4417, (byte) -72));
                            arg8.method2674(var15, var15, var15 - var13, var14, var13 + var14, var14, class385.method2390(var19, var18.field4420, (byte) -72), class385.method2390(var19, var18.field4417, (byte) -72), class385.method2390(var19, var18.field4418, (byte) -72));
                        } else if (var18.field4419 == 0) {
                            arg8.method2665(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4416, var18.field4418, var18.field4417);
                            arg8.method2665(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4420, var18.field4417, var18.field4418);
                        } else {
                            int var20 = var18.field4419;
                            arg8.method2665(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class75.method427(var18.field4416 & -16777216, var20, -9), class75.method427(var18.field4418 & -16777216, var20, -37), class75.method427(var18.field4417 & -16777216, var20, -58));
                            arg8.method2665(var15, var15, var15 - var13, var14, var13 + var14, var14, class75.method427(var18.field4420 & -16777216, var20, -78), class75.method427(var18.field4417 & -16777216, var20, -30), class75.method427(var18.field4418 & -16777216, var20, -11));
                        }
                    } else if (this.field1996[var16][var17] != null) {
                        class355 var21 = this.field1996[var16][var17];
                        for (int var22 = 0; var22 < var21.field5019; ++var22) {
                            arg9[var22] = (var21.field5012[var22] - this.field1989 * var16) * var13 / this.field1989 + var14;
                            arg10[var22] = var15 - (var21.field5018[var22] - this.field1989 * var17) * var13 / this.field1989;
                        }
                        for (int var23 = 0; var23 < var21.field5011; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5020 != null && var21.field5020[var23] != 0 && (var21.field5016 == null || var21.field5016 != null && var21.field5016[var23] == -1)) {
                                int var33 = var21.field5020[var23];
                                arg8.method2665(var30, var31, var32, var27, var28, var29, class75.method427(-16777216 - (var21.field5017[var24] & -16777216), var33, -96), class75.method427(-16777216 - (var21.field5017[var25] & -16777216), var33, -28), class75.method427(-16777216 - (var21.field5017[var26] & -16777216), var33, -36));
                            } else if (var21.field5016 != null && var21.field5016[var23] != -1) {
                                int var34 = this.field1987.method1640(var21.field5016[var23]);
                                arg8.method2674(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2665(var30, var31, var32, var27, var28, var29, var21.field5017[var24], var21.field5017[var25], var21.field5017[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6328 = true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILvh;[I[I[I)V", line = 1179)
    private final void method848(int arg0, int arg1, class431 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class237 var7 = this.field2002[arg0][arg1];
        if (var7 != null) {
            if ((var7.field3262 & 2) == 0) {
                int var8 = this.field1989 * arg0;
                int var9 = this.field1989 + var8;
                int var10 = this.field1989 * arg1;
                int var11 = this.field1989 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field3262 & 1) != 0) {
                    int var12 = this.field1998[arg0][arg1];
                    int var13 = this.field2000 * var12;
                    var14 = (this.field2004 * var10 + this.field1992 * var8 + var13 >> 15) + this.field1990;
                    if (var14 <= this.field1987.field3825) {
                        return;
                    }
                    var15 = (this.field2004 * var10 + this.field1992 * var9 + var13 >> 15) + this.field1990;
                    if (var15 <= this.field1987.field3825) {
                        return;
                    }
                    int var16 = (this.field2004 * var11 + this.field1992 * var9 + var13 >> 15) + this.field1990;
                    if (var16 <= this.field1987.field3825) {
                        return;
                    }
                    var17 = (this.field2004 * var11 + this.field1992 * var8 + var13 >> 15) + this.field1990;
                    if (var17 <= this.field1987.field3825) {
                        return;
                    }
                    int var18 = this.field2007 * var12;
                    int var19 = this.field1995 * var12;
                    var20 = (this.field1993 * var10 + this.field2001 * var8 + var18 >> 15) + this.field2003;
                    var21 = this.field1987.field3830 * var20 / var14 + arg2.field6331;
                    var22 = (this.field1994 * var10 + this.field1991 * var8 + var19 >> 15) + this.field2005;
                    var23 = this.field1987.field3811 * var22 / var14 + arg2.field6322;
                    var24 = (this.field1993 * var10 + this.field2001 * var9 + var18 >> 15) + this.field2003;
                    var25 = this.field1987.field3830 * var24 / var15 + arg2.field6331;
                    var26 = (this.field1994 * var10 + this.field1991 * var9 + var19 >> 15) + this.field2005;
                    var27 = this.field1987.field3811 * var26 / var15 + arg2.field6322;
                    int var28 = (this.field1993 * var11 + this.field2001 * var9 + var18 >> 15) + this.field2003;
                    var29 = this.field1987.field3830 * var28 / var16 + arg2.field6331;
                    int var30 = (this.field1994 * var11 + this.field1991 * var9 + var19 >> 15) + this.field2005;
                    var31 = this.field1987.field3811 * var30 / var16 + arg2.field6322;
                    var32 = (this.field1993 * var11 + this.field2001 * var8 + var18 >> 15) + this.field2003;
                    var33 = this.field1987.field3830 * var32 / var17 + arg2.field6331;
                    var34 = (this.field1994 * var11 + this.field1991 * var8 + var19 >> 15) + this.field2005;
                    var35 = this.field1987.field3811 * var34 / var17 + arg2.field6322;
                } else {
                    int var36 = this.field1998[arg0][arg1];
                    int var37 = this.field1998[arg0 + 1][arg1];
                    int var38 = this.field1998[arg0 + 1][arg1 + 1];
                    int var39 = this.field1998[arg0][arg1 + 1];
                    var14 = (this.field2004 * var10 + this.field2000 * var36 + this.field1992 * var8 >> 15) + this.field1990;
                    if (var14 <= this.field1987.field3825) {
                        return;
                    }
                    var15 = (this.field2004 * var10 + this.field2000 * var37 + this.field1992 * var9 >> 15) + this.field1990;
                    if (var15 <= this.field1987.field3825) {
                        return;
                    }
                    int var40 = (this.field2004 * var11 + this.field2000 * var38 + this.field1992 * var9 >> 15) + this.field1990;
                    if (var40 <= this.field1987.field3825) {
                        return;
                    }
                    var17 = (this.field2004 * var11 + this.field2000 * var39 + this.field1992 * var8 >> 15) + this.field1990;
                    if (var17 <= this.field1987.field3825) {
                        return;
                    }
                    var20 = (this.field1993 * var10 + this.field2007 * var36 + this.field2001 * var8 >> 15) + this.field2003;
                    var21 = this.field1987.field3830 * var20 / var14 + arg2.field6331;
                    var22 = (this.field1994 * var10 + this.field1995 * var36 + this.field1991 * var8 >> 15) + this.field2005;
                    var23 = this.field1987.field3811 * var22 / var14 + arg2.field6322;
                    var24 = (this.field1993 * var10 + this.field2007 * var37 + this.field2001 * var9 >> 15) + this.field2003;
                    var25 = this.field1987.field3830 * var24 / var15 + arg2.field6331;
                    var26 = (this.field1994 * var10 + this.field1995 * var37 + this.field1991 * var9 >> 15) + this.field2005;
                    var27 = this.field1987.field3811 * var26 / var15 + arg2.field6322;
                    int var41 = (this.field1993 * var11 + this.field2007 * var38 + this.field2001 * var9 >> 15) + this.field2003;
                    var29 = this.field1987.field3830 * var41 / var40 + arg2.field6331;
                    int var42 = (this.field1994 * var11 + this.field1995 * var38 + this.field1991 * var9 >> 15) + this.field2005;
                    var31 = this.field1987.field3811 * var42 / var40 + arg2.field6322;
                    var32 = (this.field1993 * var11 + this.field2007 * var39 + this.field2001 * var8 >> 15) + this.field2003;
                    var33 = this.field1987.field3830 * var32 / var17 + arg2.field6331;
                    var34 = (this.field1994 * var11 + this.field1995 * var39 + this.field1991 * var8 >> 15) + this.field2005;
                    var35 = this.field1987.field3811 * var34 / var17 + arg2.field6322;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6323 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6330 || var33 > arg2.field6330 || var25 > arg2.field6330;
                    if (var7.field3264 >= 0) {
                        if (this.method844(this.field1987.field3817.method1660(var7.field3264, (byte) -117).field824)) {
                            arg2.field6334 = 100;
                        }
                        arg2.method2671(var31, var35, var27, var29, var33, var25, var7.field3266 & 65535, var7.field3268 & 65535, var7.field3265 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3264);
                        arg2.field6334 = 0;
                    } else {
                        arg2.method2674(var31, var35, var27, var29, var33, var25, var7.field3266 & 65535, var7.field3268 & 65535, var7.field3265 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6323 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6330 || var25 > arg2.field6330 || var33 > arg2.field6330;
                    if (var7.field3264 >= 0) {
                        if (this.method844(this.field1987.field3817.method1660(var7.field3264, (byte) -126).field824)) {
                            arg2.field6334 = 100;
                        }
                        arg2.method2671(var23, var27, var35, var21, var25, var33, var7.field3267 & 65535, var7.field3265 & 65535, var7.field3268 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field3264);
                        arg2.field6334 = 0;
                        return;
                    }
                    arg2.method2674(var23, var27, var35, var21, var25, var33, var7.field3267 & 65535, var7.field3265 & 65535, var7.field3268 & 65535);
                }
            }
        } else {
            class163 var43 = this.field1984[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field2089; ++var44) {
                    int var84 = var43.field2084[var44];
                    int var85 = var43.field2079[var44];
                    int var86 = var43.field2082[var44];
                    int var87 = (this.field2004 * var86 + this.field2000 * var85 + this.field1992 * var84 >> 15) + this.field1990;
                    if (var87 <= this.field1987.field3825) {
                        return;
                    }
                    int var88 = (this.field1993 * var86 + this.field2007 * var85 + this.field2001 * var84 >> 15) + this.field2003;
                    int var89 = (this.field1994 * var86 + this.field1995 * var85 + this.field1991 * var84 >> 15) + this.field2005;
                    arg3[var44] = this.field1987.field3830 * var88 / var87 + arg2.field6331;
                    arg4[var44] = this.field1987.field3811 * var89 / var87 + arg2.field6322;
                }
                if (var43.field2083 != null) {
                    int var45 = this.field1998[arg0][arg1];
                    int var46 = this.field1998[arg0 + 1][arg1];
                    int var47 = this.field1998[arg0][arg1 + 1];
                    int var48 = this.field1989 * arg0;
                    int var49 = this.field1989 + var48;
                    int var50 = this.field1989 * arg1;
                    int var51 = this.field1989 + var50;
                    int var52 = (this.field1993 * var50 + this.field2007 * var45 + this.field2001 * var48 >> 15) + this.field2003;
                    int var53 = (this.field1994 * var50 + this.field1995 * var45 + this.field1991 * var48 >> 15) + this.field2005;
                    int var54 = (this.field2004 * var50 + this.field2000 * var45 + this.field1992 * var48 >> 15) + this.field1990;
                    int var55 = (this.field1993 * var50 + this.field2007 * var46 + this.field2001 * var49 >> 15) + this.field2003;
                    int var56 = (this.field1994 * var50 + this.field1995 * var46 + this.field1991 * var49 >> 15) + this.field2005;
                    int var57 = (this.field2004 * var50 + this.field2000 * var46 + this.field1992 * var49 >> 15) + this.field1990;
                    int var58 = (this.field1993 * var51 + this.field2007 * var47 + this.field2001 * var48 >> 15) + this.field2003;
                    int var59 = (this.field1994 * var51 + this.field1995 * var47 + this.field1991 * var48 >> 15) + this.field2005;
                    int var60 = (this.field2004 * var51 + this.field2000 * var47 + this.field1992 * var48 >> 15) + this.field1990;
                    for (int var61 = 0; var61 < var43.field2086; ++var61) {
                        short var62 = var43.field2088[var61];
                        short var63 = var43.field2085[var61];
                        short var64 = var43.field2077[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field6323 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field6330 || var66 > arg2.field6330 || var67 > arg2.field6330;
                            short var71 = var43.field2083[var61];
                            if (var71 != -1) {
                                if (this.method844(this.field1987.field3817.method1660(var71, (byte) -90).field824)) {
                                    arg2.field6334 = 100;
                                }
                                arg2.method2671(var68, var69, var70, var65, var66, var67, var43.field2080[var62], var43.field2080[var63], var43.field2080[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field6334 = 0;
                            } else {
                                int var72 = var43.field2081[var61];
                                if (var72 != -1) {
                                    arg2.method2674(var68, var69, var70, var65, var66, var67, class385.method2390(var72, var43.field2080[var62], (byte) -72), class385.method2390(var72, var43.field2080[var63], (byte) -72), class385.method2390(var72, var43.field2080[var64], (byte) -72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field2086; ++var73) {
                    short var74 = var43.field2088[var73];
                    short var75 = var43.field2085[var73];
                    short var76 = var43.field2077[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field2081[var73];
                        if (var83 != -1) {
                            arg2.field6323 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field6330 || var78 > arg2.field6330 || var79 > arg2.field6330;
                            arg2.method2674(var80, var81, var82, var77, var78, var79, class385.method2390(var83, var43.field2080[var74], (byte) -72), class385.method2390(var83, var43.field2080[var75], (byte) -72), class385.method2390(var83, var43.field2080[var76], (byte) -72));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1499)
    public final void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class373 var9 = this.field1987.method1606(Thread.currentThread());
        class431 var10 = var9.field5210;
        var10.field6334 = 0;
        var10.field6323 = false;
        if (this.field1986 != null) {
            this.method847(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5225, var9.field5221);
        } else {
            if (this.field2002 != null) {
                this.method846(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5225, var9.field5221);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lhm;IIII[[I[[II)V", line = 1513)
    public class157(class280 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1987 = arg0;
        this.field2006 = arg2;
        this.field1998 = arg5;
        this.field1997 = arg6;
        this.field1989 = arg7;
        this.field1985 = 0;
        while (arg7 > 1) {
            ++this.field1985;
            arg7 >>= 1;
        }
        this.field1999 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1987.field3815 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1998[var11 + 1][var10] - this.field1998[var11 - 1][var10];
                int var14 = this.field1998[var11][var10 + 1] - this.field1998[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1987.field3834 * var18 + this.field1987.field3840 * var17 + this.field1987.field3837 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1999[var11][var10] = (byte) var20;
            }
        }
        this.field1988 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V", line = 1575)
    public final void method268(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class290 var6 = this.field1987.field3839;
        this.field2001 = var6.field3944;
        this.field2007 = var6.field3941;
        this.field1993 = var6.field3946;
        this.field2003 = var6.field3945;
        this.field1991 = var6.field3942;
        this.field1995 = var6.field3950;
        this.field1994 = var6.field3949;
        this.field2005 = var6.field3952;
        this.field1992 = var6.field3948;
        this.field2000 = var6.field3943;
        this.field2004 = var6.field3951;
        this.field1990 = var6.field3947;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 1591)
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1986 == null) {
            this.field1986 = new class331[super.field556][super.field550];
            this.field1996 = new class355[super.field556][super.field550];
        } else if (this.field2002 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class284.field3878[class347.method2109(arg5[var13], 12) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class284.field3878[class347.method2109(arg6[var14], 122) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field1989 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1989 && arg4[var20] == this.field1989) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1989) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1989 != arg2[var22] && arg2[0] - this.field1989 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1989 != arg4[var22] && arg4[0] - this.field1989 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class331 var23 = new class331();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field4419 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field4415 = (byte) (var23.field4415 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1998[arg0 + 1][arg1] == this.field1998[arg0][arg1] && this.field1998[arg0 + 1][arg1 + 1] == this.field1998[arg0][arg1] && this.field1998[arg0][arg1 + 1] == this.field1998[arg0][arg1]) {
                    var23.field4415 = (byte) (var23.field4415 | 1);
                }
                if (var25 != -1 && (var23.field4415 & 2) == 0 && !this.field1987.field3817.method1660(var25, (byte) -79).field823) {
                    var23.field4420 = this.field1999[arg0][arg1] - this.field1988[arg0][arg1];
                    var23.field4417 = this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1];
                    var23.field4416 = this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1];
                    var23.field4418 = this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1];
                    var23.field4414 = (short) var25;
                } else {
                    int var26;
                    if (this.field1997 != null && arg10 != 0) {
                        var26 = this.field1997[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field4420 = class401.method2518(arg9, -120, method845(arg5[var16] >> 8, this.field1999[arg0][arg1] - this.field1988[arg0][arg1]), var26);
                    if (var23.field4419 != 0) {
                        var23.field4420 |= 255 - (this.field1999[arg0][arg1] - this.field1988[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1997 != null && arg10 != 0) {
                        var27 = this.field1997[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field4417 = class401.method2518(arg9, -125, method845(arg5[var17] >> 8, this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]), var27);
                    if (var23.field4419 != 0) {
                        var23.field4417 |= 255 - (this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1997 != null && arg10 != 0) {
                        var28 = this.field1997[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field4416 = class401.method2518(arg9, -109, method845(arg5[var18] >> 8, this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]), var28);
                    if (var23.field4419 != 0) {
                        var23.field4416 |= 255 - (this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1997 != null && arg10 != 0) {
                        var29 = this.field1997[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field4418 = class401.method2518(arg9, -126, method845(arg5[var19] >> 8, this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]), var29);
                    if (var23.field4419 != 0) {
                        var23.field4418 |= 255 - (this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]) << 25;
                    }
                    var23.field4414 = -1;
                }
                this.field1986[arg0][arg1] = var23;
            } else {
                class355 var30 = new class355();
                var30.field5019 = (short) arg2.length;
                var30.field5011 = (short) (arg2.length / 3);
                var30.field5012 = new short[var30.field5019];
                var30.field5015 = new short[var30.field5019];
                var30.field5018 = new short[var30.field5019];
                var30.field5017 = new int[var30.field5019];
                if (this.field1997 != null) {
                    var30.field5014 = new short[var30.field5019];
                }
                for (int var31 = 0; var31 < var30.field5019; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1999[arg0][arg1] - this.field1988[arg0][arg1];
                    } else if (var46 == 0 && this.field1989 == var47) {
                        var49 = this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1];
                    } else if (this.field1989 == var46 && this.field1989 == var47) {
                        var49 = this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1];
                    } else if (this.field1989 == var46 && var47 == 0) {
                        var49 = this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1999[arg0 + 1][arg1] - this.field1988[arg0 + 1][arg1]) * var46 + (this.field1999[arg0][arg1] - this.field1988[arg0][arg1]) * (this.field1989 - var46);
                        int var51 = (this.field1999[arg0 + 1][arg1 + 1] - this.field1988[arg0 + 1][arg1 + 1]) * var46 + (this.field1999[arg0][arg1 + 1] - this.field1988[arg0][arg1 + 1]) * (this.field1989 - var46);
                        var49 = (this.field1989 - var47) * var50 + var47 * var51 >> this.field1985 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1985) + var46);
                    short var53 = (short) ((arg1 << this.field1985) + var47);
                    var30.field5012[var31] = var52;
                    var30.field5018[var31] = var53;
                    var30.field5015[var31] = (short) (this.method265(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1987.field3817.method1660(arg7[var31], (byte) -117).field823) {
                        var30.field5017[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5017[var31] = var49 << 25;
                        } else {
                            var30.field5017[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1997 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1997[arg0][arg1];
                            } else if (var46 == 0 && this.field1989 == var47) {
                                var56 = this.field1997[arg0][arg1 + 1];
                            } else if (this.field1989 == var46 && this.field1989 == var47) {
                                var56 = this.field1997[arg0 + 1][arg1 + 1];
                            } else if (this.field1989 == var46 && var47 == 0) {
                                var56 = this.field1997[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1989 - var46) * this.field1997[arg0][arg1] + this.field1997[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1989 - var46) * this.field1997[arg0][arg1 + 1] + this.field1997[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1989 - var47) * var57 + var47 * var58 >> this.field1985 * 2;
                            }
                            var30.field5014[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5017[var31] = class401.method2518(arg9, -124, method845(arg5[var31] >> 8, var49), var54);
                        if (arg6 != null) {
                            var30.field5017[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5011; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1987.field3817.method1660(arg7[var33 * 3], (byte) -123).field823) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5020 = new int[var30.field5011];
                }
                if (var32) {
                    var30.field5016 = new short[var30.field5011];
                    var30.field5013 = new short[var30.field5011];
                }
                for (int var34 = 0; var34 < var30.field5011; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5020[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1987.field3817.method1660(var40, (byte) -108).field823) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1987.field3817.method1660(var41, (byte) -74).field823) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1987.field3817.method1660(var42, (byte) -99).field823) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5016[var34] = (short) var42;
                            var30.field5013[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1987.field3817.method1660(var43, (byte) -120).field823) {
                                    var30.field5017[var35] = class284.field3878[class347.method2109(this.field1987.field3817.method1660(var43, (byte) -75).field827 & 65535, -127) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1987.field3817.method1660(var44, (byte) -89).field823) {
                                    var30.field5017[var36] = class284.field3878[class347.method2109(this.field1987.field3817.method1660(var44, (byte) -96).field827 & 65535, -91) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1987.field3817.method1660(var45, (byte) -90).field823) {
                                    var30.field5017[var37] = class284.field3878[class347.method2109(this.field1987.field3817.method1660(var45, (byte) -76).field827 & 65535, 108) & 65535];
                                }
                            }
                            var30.field5016[var34] = -1;
                        }
                    }
                }
                this.field1996[arg0][arg1] = var30;
            }
        }
    }
}
