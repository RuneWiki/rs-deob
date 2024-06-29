import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class328 extends class319 {

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Ls;")
    private class154 field4691;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    private int field4699;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "[[I")
    public int[][] field4703;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "[[I")
    private int[][] field4700;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    private int field4694;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[[B")
    private byte[][] field4693;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "[[B")
    private byte[][] field4692;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    private int field4683;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    private int field4687;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    private int field4688;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    private int field4689;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    private int field4697;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    private int field4698;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[[Lvj;")
    private class255[][] field4696;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "[[Lve;")
    private class292[][] field4686;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "[[Ljm;")
    private class409[][] field4701;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "[[Lpj;")
    private class79[][] field4685;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 6)
    public final void method1984(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field4686 == null) {
            this.field4686 = new class292[super.field4530][super.field4531];
            this.field4696 = new class255[super.field4530][super.field4531];
        } else if (this.field4701 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field4690 != var18 || var19 != 0 && this.field4690 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class255 var20 = new class255();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field3421 = var21;
            var20.field3431 = new short[var21];
            var20.field3428 = new int[var21];
            var20.field3425 = new int[var21];
            var20.field3420 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field3431[var23] = (short) (this.field4693[arg0][arg1] - this.field4692[arg0][arg1]);
                } else if (var28 == 0 && this.field4690 == var29) {
                    var20.field3431[var23] = (short) (this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]);
                } else if (this.field4690 == var28 && this.field4690 == var29) {
                    var20.field3431[var23] = (short) (this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]);
                } else if (this.field4690 == var28 && var29 == 0) {
                    var20.field3431[var23] = (short) (this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]) * var28 + (this.field4693[arg0][arg1] - this.field4692[arg0][arg1]) * (this.field4690 - var28);
                    int var31 = (this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]) * var28 + (this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]) * (this.field4690 - var28);
                    var20.field3431[var23] = (short) ((this.field4690 - var29) * var30 + var29 * var31 >> this.field4694 * 2);
                }
                int var32 = (arg0 << this.field4694) + var28;
                int var33 = (arg1 << this.field4694) + var29;
                var20.field3428[var23] = var32;
                var20.field3420[var23] = var33;
                var20.field3425[var23] = this.method1991(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field3431[var23] < 2) {
                    var20.field3431[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field4691.field2187.method371(arg10[var26], (byte) 96).field4436) {
                    var24 = true;
                }
            }
            var20.field3424 = new int[var25];
            if (arg9 != null) {
                var20.field3426 = new int[var25];
            }
            var20.field3419 = new short[var25];
            var20.field3423 = new short[var25];
            var20.field3422 = new short[var25];
            if (var24) {
                var20.field3429 = new short[var25];
                var20.field3427 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field3424[var20.field3430] = class443.method2742(118, arg8[var27]);
                    } else {
                        var20.field3424[var20.field3430] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field3426[var20.field3430] = class443.method2742(127, arg9[var27]);
                        } else {
                            var20.field3426[var20.field3430] = -1;
                        }
                    }
                    var20.field3419[var20.field3430] = (short) arg5[var27];
                    var20.field3423[var20.field3430] = (short) arg6[var27];
                    var20.field3422[var20.field3430] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field4691.field2187.method371(arg10[var27], (byte) 96).field4436) {
                            var20.field3429[var20.field3430] = (short) arg10[var27];
                            var20.field3427[var20.field3430] = (short) arg11[var27];
                        } else {
                            var20.field3429[var20.field3430] = -1;
                        }
                    }
                    ++var20.field3430;
                }
            }
            this.field4696[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class292 var34 = new class292();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field4204 = class443.method2746(this.field4693[arg0][arg1] - this.field4692[arg0][arg1], true, class443.method2742(108, arg9[0]));
                    if (var35 == -1) {
                        var34.field4206 = (byte) (var34.field4206 | 2);
                    }
                }
                if (this.field4703[arg0 + 1][arg1] == this.field4703[arg0][arg1] && this.field4703[arg0 + 1][arg1 + 1] == this.field4703[arg0][arg1] && this.field4703[arg0][arg1 + 1] == this.field4703[arg0][arg1]) {
                    var34.field4206 = (byte) (var34.field4206 | 1);
                }
                if (var36 != -1 && (var34.field4206 & 2) == 0 && !this.field4691.field2187.method371(var36, (byte) 96).field4436) {
                    var34.field4210 = (short) (this.field4693[arg0][arg1] - this.field4692[arg0][arg1]);
                    var34.field4208 = (short) (this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]);
                    var34.field4207 = (short) (this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]);
                    var34.field4205 = (short) (this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]);
                    var34.field4209 = (short) var36;
                } else {
                    short var37 = class443.method2742(109, var35);
                    var34.field4210 = (short) class443.method2746(this.field4693[arg0][arg1] - this.field4692[arg0][arg1], true, var37);
                    var34.field4208 = (short) class443.method2746(this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1], true, var37);
                    var34.field4207 = (short) class443.method2746(this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1], true, var37);
                    var34.field4205 = (short) class443.method2746(this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1], true, var37);
                    var34.field4209 = -1;
                }
                this.field4686[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILlg;)Llg;", line = 235)
    public final class238 method1979(int arg0, int arg1, class238 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Z", line = 239)
    private final boolean method2030(int arg0) {
        if ((this.field4699 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(II)I", line = 252)
    private static final int method2031(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Ls;IIII[[I[[II)V", line = 285)
    public class328(class154 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field4691 = arg0;
        this.field4699 = arg2;
        this.field4703 = arg5;
        this.field4700 = arg6;
        this.field4690 = arg7;
        this.field4694 = 0;
        while (arg7 > 1) {
            ++this.field4694;
            arg7 >>= 1;
        }
        this.field4693 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4691.field2181 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field4703[var11 + 1][var10] - this.field4703[var11 - 1][var10];
                int var14 = this.field4703[var11][var10 + 1] - this.field4703[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4691.field2172 * var18 + this.field4691.field2169 * var17 + this.field4691.field2162 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4693[var11][var10] = (byte) var20;
            }
        }
        this.field4692 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZLkr;[I[I[I)V", line = 345)
    private final void method2032(int arg0, int arg1, boolean arg2, class445 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class409 var8 = this.field4701[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5928 & 2) == 0) {
                int var9 = this.field4690 * arg0;
                int var10 = this.field4690 + var9;
                int var11 = this.field4690 * arg1;
                int var12 = this.field4690 + var11;
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
                if ((var8.field5928 & 1) != 0 && !arg2) {
                    int var17 = this.field4703[arg0][arg1];
                    int var18 = this.field4682 * var17;
                    var19 = (this.field4702 * var11 + this.field4687 * var9 + var18 >> 15) + this.field4689;
                    if (var19 <= this.field4691.field2175) {
                        return;
                    }
                    var20 = (this.field4702 * var11 + this.field4687 * var10 + var18 >> 15) + this.field4689;
                    if (var20 <= this.field4691.field2175) {
                        return;
                    }
                    var21 = (this.field4702 * var12 + this.field4687 * var10 + var18 >> 15) + this.field4689;
                    if (var21 <= this.field4691.field2175) {
                        return;
                    }
                    var22 = (this.field4702 * var12 + this.field4687 * var9 + var18 >> 15) + this.field4689;
                    if (var22 <= this.field4691.field2175) {
                        return;
                    }
                    if (this.field4691.field2156) {
                        int var23 = var19 - this.field4691.field2200;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4691.field2200;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4691.field2200;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4691.field2200;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4695 * var17;
                    int var28 = this.field4688 * var17;
                    var29 = (this.field4697 * var11 + this.field4698 * var9 + var27 >> 15) + this.field4704;
                    var30 = this.field4691.field2195 * var29 / var19 + arg3.field6502;
                    var31 = (this.field4683 * var11 + this.field4684 * var9 + var28 >> 15) + this.field4681;
                    var32 = this.field4691.field2178 * var31 / var19 + arg3.field6496;
                    var33 = (this.field4697 * var11 + this.field4698 * var10 + var27 >> 15) + this.field4704;
                    var34 = this.field4691.field2195 * var33 / var20 + arg3.field6502;
                    var35 = (this.field4683 * var11 + this.field4684 * var10 + var28 >> 15) + this.field4681;
                    var36 = this.field4691.field2178 * var35 / var20 + arg3.field6496;
                    var37 = (this.field4697 * var12 + this.field4698 * var10 + var27 >> 15) + this.field4704;
                    var38 = this.field4691.field2195 * var37 / var21 + arg3.field6502;
                    var39 = (this.field4683 * var12 + this.field4684 * var10 + var28 >> 15) + this.field4681;
                    var40 = this.field4691.field2178 * var39 / var21 + arg3.field6496;
                    var41 = (this.field4697 * var12 + this.field4698 * var9 + var27 >> 15) + this.field4704;
                    var42 = this.field4691.field2195 * var41 / var22 + arg3.field6502;
                    var43 = (this.field4683 * var12 + this.field4684 * var9 + var28 >> 15) + this.field4681;
                    var44 = this.field4691.field2178 * var43 / var22 + arg3.field6496;
                } else {
                    int var45 = this.field4703[arg0][arg1];
                    int var46 = this.field4703[arg0 + 1][arg1];
                    int var47 = this.field4703[arg0 + 1][arg1 + 1];
                    int var48 = this.field4703[arg0][arg1 + 1];
                    var19 = (this.field4702 * var11 + this.field4687 * var9 + this.field4682 * var45 >> 15) + this.field4689;
                    if (var19 <= this.field4691.field2175) {
                        return;
                    }
                    var20 = (this.field4702 * var11 + this.field4687 * var10 + this.field4682 * var46 >> 15) + this.field4689;
                    if (var20 <= this.field4691.field2175) {
                        return;
                    }
                    var21 = (this.field4702 * var12 + this.field4687 * var10 + this.field4682 * var47 >> 15) + this.field4689;
                    if (var21 <= this.field4691.field2175) {
                        return;
                    }
                    var22 = (this.field4702 * var12 + this.field4687 * var9 + this.field4682 * var48 >> 15) + this.field4689;
                    if (var22 <= this.field4691.field2175) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4691.field2200;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field4700[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4691.field2200;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field4700[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4691.field2200;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field4700[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4691.field2200;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field4700[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4691.field2156) {
                        int var57 = var19 - this.field4691.field2200;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4691.field2200;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4691.field2200;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4691.field2200;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4697 * var11 + this.field4698 * var9 + this.field4695 * var45 >> 15) + this.field4704;
                    var30 = this.field4691.field2195 * var29 / var19 + arg3.field6502;
                    var31 = (this.field4683 * var11 + this.field4688 * var45 + this.field4684 * var9 >> 15) + this.field4681;
                    var32 = this.field4691.field2178 * var31 / var19 + arg3.field6496;
                    var33 = (this.field4697 * var11 + this.field4698 * var10 + this.field4695 * var46 >> 15) + this.field4704;
                    var34 = this.field4691.field2195 * var33 / var20 + arg3.field6502;
                    var35 = (this.field4683 * var11 + this.field4688 * var46 + this.field4684 * var10 >> 15) + this.field4681;
                    var36 = this.field4691.field2178 * var35 / var20 + arg3.field6496;
                    var37 = (this.field4697 * var12 + this.field4698 * var10 + this.field4695 * var47 >> 15) + this.field4704;
                    var38 = this.field4691.field2195 * var37 / var21 + arg3.field6502;
                    var39 = (this.field4683 * var12 + this.field4688 * var47 + this.field4684 * var10 >> 15) + this.field4681;
                    var40 = this.field4691.field2178 * var39 / var21 + arg3.field6496;
                    var41 = (this.field4697 * var12 + this.field4698 * var9 + this.field4695 * var48 >> 15) + this.field4704;
                    var42 = this.field4691.field2195 * var41 / var22 + arg3.field6502;
                    var43 = (this.field4683 * var12 + this.field4688 * var48 + this.field4684 * var9 >> 15) + this.field4681;
                    var44 = this.field4691.field2178 * var43 / var22 + arg3.field6496;
                }
                boolean var61 = var8.field5930 != -1 && this.method2030(this.field4691.field2187.method371(var8.field5930, (byte) 96).field4447);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6504 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6497 || var42 > arg3.field6497 || var34 > arg3.field6497;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6506 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5930 >= 0) {
                                arg3.method2758(var40, var44, var36, var38, var42, var34, this.field4691.field2186, var15, var16, var14, var8.field5929, var8.field5925, var8.field5927, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5930);
                            } else {
                                arg3.method2759(var40, var44, var36, var38, var42, var34, class433.method2688(var8.field5929, 2, var15 << 24 | this.field4691.field2186), class433.method2688(var8.field5925, 2, var16 << 24 | this.field4691.field2186), class433.method2688(var8.field5927, 2, var14 << 24 | this.field4691.field2186));
                            }
                        } else if (var8.field5930 >= 0) {
                            arg3.method2765(var40, var44, var36, var38, var42, var34, var8.field5929, var8.field5925, var8.field5927, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5930);
                        } else {
                            arg3.method2759(var40, var44, var36, var38, var42, var34, var8.field5929, var8.field5925, var8.field5927);
                        }
                        arg3.field6506 = 0;
                    } else {
                        arg3.method2767(var40, var44, var36, var38, var42, var34, this.field4691.field2186);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6504 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6497 || var34 > arg3.field6497 || var42 > arg3.field6497;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6506 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5930 >= 0) {
                                arg3.method2758(var32, var36, var44, var30, var34, var42, this.field4691.field2186, var13, var14, var16, var8.field5924, var8.field5927, var8.field5925, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5930);
                            } else {
                                arg3.method2759(var32, var36, var44, var30, var34, var42, class433.method2688(var8.field5924, 2, var13 << 24 | this.field4691.field2186), class433.method2688(var8.field5927, 2, var14 << 24 | this.field4691.field2186), class433.method2688(var8.field5925, 2, var16 << 24 | this.field4691.field2186));
                            }
                        } else if (var8.field5930 >= 0) {
                            arg3.method2765(var32, var36, var44, var30, var34, var42, var8.field5924, var8.field5927, var8.field5925, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5930);
                        } else {
                            arg3.method2759(var32, var36, var44, var30, var34, var42, var8.field5924, var8.field5927, var8.field5925);
                        }
                        arg3.field6506 = 0;
                        return;
                    }
                    arg3.method2767(var32, var36, var44, var30, var34, var42, this.field4691.field2186);
                }
            }
        } else {
            class79 var64 = this.field4685[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field894; ++var65) {
                    short var105 = var64.field897[var65];
                    int var106 = var64.field892[var65];
                    short var107 = var64.field893[var65];
                    int var108 = (this.field4702 * var107 + this.field4687 * var105 + this.field4682 * var106 >> 15) + this.field4689;
                    if (var108 <= this.field4691.field2175) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field4691.field2200;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field899[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field4691.field2156) {
                        int var111 = var108 - this.field4691.field2200;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field4697 * var107 + this.field4698 * var105 + this.field4695 * var106 >> 15) + this.field4704;
                    int var113 = (this.field4683 * var107 + this.field4688 * var106 + this.field4684 * var105 >> 15) + this.field4681;
                    arg4[var65] = this.field4691.field2195 * var112 / var108 + arg3.field6502;
                    arg5[var65] = this.field4691.field2178 * var113 / var108 + arg3.field6496;
                }
                if (var64.field900 != null) {
                    int var66 = this.field4703[arg0][arg1];
                    int var67 = this.field4703[arg0 + 1][arg1];
                    int var68 = this.field4703[arg0][arg1 + 1];
                    int var69 = this.field4690 * arg0;
                    int var70 = this.field4690 + var69;
                    int var71 = this.field4690 * arg1;
                    int var72 = this.field4690 + var71;
                    int var73 = (this.field4697 * var71 + this.field4698 * var69 + this.field4695 * var66 >> 15) + this.field4704;
                    int var74 = (this.field4683 * var71 + this.field4688 * var66 + this.field4684 * var69 >> 15) + this.field4681;
                    int var75 = (this.field4702 * var71 + this.field4687 * var69 + this.field4682 * var66 >> 15) + this.field4689;
                    int var76 = (this.field4697 * var71 + this.field4698 * var70 + this.field4695 * var67 >> 15) + this.field4704;
                    int var77 = (this.field4683 * var71 + this.field4688 * var67 + this.field4684 * var70 >> 15) + this.field4681;
                    int var78 = (this.field4702 * var71 + this.field4687 * var70 + this.field4682 * var67 >> 15) + this.field4689;
                    int var79 = (this.field4697 * var72 + this.field4698 * var69 + this.field4695 * var68 >> 15) + this.field4704;
                    int var80 = (this.field4683 * var72 + this.field4688 * var68 + this.field4684 * var69 >> 15) + this.field4681;
                    int var81 = (this.field4702 * var72 + this.field4687 * var69 + this.field4682 * var68 >> 15) + this.field4689;
                    for (int var82 = 0; var82 < var64.field891; ++var82) {
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
                            arg3.field6504 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field6497 || var87 > arg3.field6497 || var88 > arg3.field6497;
                            short var93 = var64.field900[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method2030(this.field4691.field2187.method371(var93, (byte) 96).field4447)) {
                                    arg3.field6506 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2758(var89, var90, var91, var86, var87, var88, this.field4691.field2186, arg6[var83], arg6[var84], arg6[var85], var64.field895[var83], var64.field895[var84], var64.field895[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field895[var83] & 16777215) != 0) {
                                        arg3.method2759(var89, var90, var91, var86, var87, var88, class433.method2688(var64.field895[var83], 2, arg6[var83] << 24 | this.field4691.field2186), class433.method2688(var64.field895[var84], 2, arg6[var84] << 24 | this.field4691.field2186), class433.method2688(var64.field895[var85], 2, arg6[var85] << 24 | this.field4691.field2186));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2765(var89, var90, var91, var86, var87, var88, var64.field895[var83], var64.field895[var84], var64.field895[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field895[var83] & 16777215) != 0) {
                                    arg3.method2759(var89, var90, var91, var86, var87, var88, var64.field895[var83], var64.field895[var84], var64.field895[var85]);
                                }
                                arg3.field6506 = 0;
                            } else {
                                arg3.method2767(var89, var90, var91, var86, var87, var88, this.field4691.field2186);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field891; ++var94) {
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
                        arg3.field6504 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field6497 || var99 > arg3.field6497 || var100 > arg3.field6497;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field895[var95] & 16777215) != 0) {
                                    arg3.method2759(var101, var102, var103, var98, var99, var100, class354.method2255(this.field4691.field2186, var64.field895[var95], arg6[var95], 0), class354.method2255(this.field4691.field2186, var64.field895[var96], arg6[var96], 109), class354.method2255(this.field4691.field2186, var64.field895[var97], arg6[var97], 122));
                                }
                            } else if ((var64.field895[var95] & 16777215) != 0) {
                                arg3.method2759(var101, var102, var103, var98, var99, var100, var64.field895[var95], var64.field895[var96], var64.field895[var97]);
                            }
                        } else {
                            arg3.method2767(var101, var102, var103, var98, var99, var100, this.field4691.field2186);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 911)
    public final void method1993(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field4701 == null) {
            this.field4701 = new class409[super.field4530][super.field4531];
            this.field4685 = new class79[super.field4530][super.field4531];
        } else if (this.field4686 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class310.field4421[class443.method2742(111, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class310.field4421[class443.method2742(110, arg6[var14]) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field4690 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field4690 && arg4[var20] == this.field4690) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field4690) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field4690 != arg2[var22] && arg2[0] - this.field4690 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field4690 != arg4[var22] && arg4[0] - this.field4690 != arg4[var22]) {
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
                class409 var23 = new class409();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field5926 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field5928 = (byte) (var23.field5928 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field4703[arg0 + 1][arg1] == this.field4703[arg0][arg1] && this.field4703[arg0 + 1][arg1 + 1] == this.field4703[arg0][arg1] && this.field4703[arg0][arg1 + 1] == this.field4703[arg0][arg1]) {
                    var23.field5928 = (byte) (var23.field5928 | 1);
                }
                if (var25 != -1 && (var23.field5928 & 2) == 0 && !this.field4691.field2187.method371(var25, (byte) 96).field4436) {
                    var23.field5924 = this.field4693[arg0][arg1] - this.field4692[arg0][arg1];
                    var23.field5927 = this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1];
                    var23.field5929 = this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1];
                    var23.field5925 = this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1];
                    var23.field5930 = (short) var25;
                } else {
                    int var26;
                    if (this.field4700 != null && arg10 != 0) {
                        var26 = this.field4700[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field5924 = class354.method2255(arg9, method2031(arg5[var16] >> 8, this.field4693[arg0][arg1] - this.field4692[arg0][arg1]), var26, 97);
                    if (var23.field5926 != 0) {
                        var23.field5924 |= 255 - (this.field4693[arg0][arg1] - this.field4692[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field4700 != null && arg10 != 0) {
                        var27 = this.field4700[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field5927 = class354.method2255(arg9, method2031(arg5[var17] >> 8, this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]), var27, -26);
                    if (var23.field5926 != 0) {
                        var23.field5927 |= 255 - (this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field4700 != null && arg10 != 0) {
                        var28 = this.field4700[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field5929 = class354.method2255(arg9, method2031(arg5[var18] >> 8, this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]), var28, 104);
                    if (var23.field5926 != 0) {
                        var23.field5929 |= 255 - (this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field4700 != null && arg10 != 0) {
                        var29 = this.field4700[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field5925 = class354.method2255(arg9, method2031(arg5[var19] >> 8, this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]), var29, 108);
                    if (var23.field5926 != 0) {
                        var23.field5925 |= 255 - (this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]) << 25;
                    }
                    var23.field5930 = -1;
                }
                this.field4701[arg0][arg1] = var23;
            } else {
                class79 var30 = new class79();
                var30.field894 = (short) arg2.length;
                var30.field891 = (short) (arg2.length / 3);
                var30.field897 = new short[var30.field894];
                var30.field892 = new short[var30.field894];
                var30.field893 = new short[var30.field894];
                var30.field895 = new int[var30.field894];
                if (this.field4700 != null) {
                    var30.field899 = new short[var30.field894];
                }
                for (int var31 = 0; var31 < var30.field894; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field4693[arg0][arg1] - this.field4692[arg0][arg1];
                    } else if (var46 == 0 && this.field4690 == var47) {
                        var49 = this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1];
                    } else if (this.field4690 == var46 && this.field4690 == var47) {
                        var49 = this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1];
                    } else if (this.field4690 == var46 && var47 == 0) {
                        var49 = this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field4693[arg0 + 1][arg1] - this.field4692[arg0 + 1][arg1]) * var46 + (this.field4693[arg0][arg1] - this.field4692[arg0][arg1]) * (this.field4690 - var46);
                        int var51 = (this.field4693[arg0 + 1][arg1 + 1] - this.field4692[arg0 + 1][arg1 + 1]) * var46 + (this.field4693[arg0][arg1 + 1] - this.field4692[arg0][arg1 + 1]) * (this.field4690 - var46);
                        var49 = (this.field4690 - var47) * var50 + var47 * var51 >> this.field4694 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field4694) + var46);
                    short var53 = (short) ((arg1 << this.field4694) + var47);
                    var30.field897[var31] = var52;
                    var30.field893[var31] = var53;
                    var30.field892[var31] = (short) (this.method1991(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field4691.field2187.method371(arg7[var31], (byte) 96).field4436) {
                        var30.field895[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field895[var31] = var49 << 25;
                        } else {
                            var30.field895[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field4700 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field4700[arg0][arg1];
                            } else if (var46 == 0 && this.field4690 == var47) {
                                var56 = this.field4700[arg0][arg1 + 1];
                            } else if (this.field4690 == var46 && this.field4690 == var47) {
                                var56 = this.field4700[arg0 + 1][arg1 + 1];
                            } else if (this.field4690 == var46 && var47 == 0) {
                                var56 = this.field4700[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field4690 - var46) * this.field4700[arg0][arg1] + this.field4700[arg0 + 1][arg1] * var46;
                                int var58 = (this.field4690 - var46) * this.field4700[arg0][arg1 + 1] + this.field4700[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field4690 - var47) * var57 + var47 * var58 >> this.field4694 * 2;
                            }
                            var30.field899[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field895[var31] = class354.method2255(arg9, method2031(arg5[var31] >> 8, var49), var54, 119);
                        if (arg6 != null) {
                            var30.field895[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field891; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field4691.field2187.method371(arg7[var33 * 3], (byte) 96).field4436) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field896 = new int[var30.field891];
                }
                if (var32) {
                    var30.field900 = new short[var30.field891];
                    var30.field898 = new short[var30.field891];
                }
                for (int var34 = 0; var34 < var30.field891; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field896[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field4691.field2187.method371(var40, (byte) 96).field4436) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field4691.field2187.method371(var41, (byte) 96).field4436) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field4691.field2187.method371(var42, (byte) 96).field4436) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field900[var34] = (short) var42;
                            var30.field898[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field4691.field2187.method371(var43, (byte) 96).field4436) {
                                    var30.field895[var35] = class310.field4421[class443.method2742(110, this.field4691.field2187.method371(var43, (byte) 96).field4451 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field4691.field2187.method371(var44, (byte) 96).field4436) {
                                    var30.field895[var36] = class310.field4421[class443.method2742(117, this.field4691.field2187.method371(var44, (byte) 96).field4451 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field4691.field2187.method371(var45, (byte) 96).field4436) {
                                    var30.field895[var37] = class310.field4421[class443.method2742(125, this.field4691.field2187.method371(var45, (byte) 96).field4451 & 65535) & 65535];
                                }
                            }
                            var30.field900[var34] = -1;
                        }
                    }
                }
                this.field4685[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Llg;IIIIZ)Z", line = 1420)
    public final boolean method1978(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Llg;IIIIZ)V", line = 1422)
    public final void method1983(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILkr;[I[I[I)V", line = 1427)
    private final void method2033(int arg0, int arg1, class445 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class292 var7 = this.field4686[arg0][arg1];
        if (var7 != null) {
            if ((var7.field4206 & 2) == 0) {
                int var8 = this.field4690 * arg0;
                int var9 = this.field4690 + var8;
                int var10 = this.field4690 * arg1;
                int var11 = this.field4690 + var10;
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
                if ((var7.field4206 & 1) != 0) {
                    int var12 = this.field4703[arg0][arg1];
                    int var13 = this.field4682 * var12;
                    var14 = (this.field4702 * var10 + this.field4687 * var8 + var13 >> 15) + this.field4689;
                    if (var14 <= this.field4691.field2175) {
                        return;
                    }
                    var15 = (this.field4702 * var10 + this.field4687 * var9 + var13 >> 15) + this.field4689;
                    if (var15 <= this.field4691.field2175) {
                        return;
                    }
                    int var16 = (this.field4702 * var11 + this.field4687 * var9 + var13 >> 15) + this.field4689;
                    if (var16 <= this.field4691.field2175) {
                        return;
                    }
                    var17 = (this.field4702 * var11 + this.field4687 * var8 + var13 >> 15) + this.field4689;
                    if (var17 <= this.field4691.field2175) {
                        return;
                    }
                    int var18 = this.field4695 * var12;
                    int var19 = this.field4688 * var12;
                    var20 = (this.field4697 * var10 + this.field4698 * var8 + var18 >> 15) + this.field4704;
                    var21 = this.field4691.field2195 * var20 / var14 + arg2.field6502;
                    var22 = (this.field4683 * var10 + this.field4684 * var8 + var19 >> 15) + this.field4681;
                    var23 = this.field4691.field2178 * var22 / var14 + arg2.field6496;
                    var24 = (this.field4697 * var10 + this.field4698 * var9 + var18 >> 15) + this.field4704;
                    var25 = this.field4691.field2195 * var24 / var15 + arg2.field6502;
                    var26 = (this.field4683 * var10 + this.field4684 * var9 + var19 >> 15) + this.field4681;
                    var27 = this.field4691.field2178 * var26 / var15 + arg2.field6496;
                    int var28 = (this.field4697 * var11 + this.field4698 * var9 + var18 >> 15) + this.field4704;
                    var29 = this.field4691.field2195 * var28 / var16 + arg2.field6502;
                    int var30 = (this.field4683 * var11 + this.field4684 * var9 + var19 >> 15) + this.field4681;
                    var31 = this.field4691.field2178 * var30 / var16 + arg2.field6496;
                    var32 = (this.field4697 * var11 + this.field4698 * var8 + var18 >> 15) + this.field4704;
                    var33 = this.field4691.field2195 * var32 / var17 + arg2.field6502;
                    var34 = (this.field4683 * var11 + this.field4684 * var8 + var19 >> 15) + this.field4681;
                    var35 = this.field4691.field2178 * var34 / var17 + arg2.field6496;
                } else {
                    int var36 = this.field4703[arg0][arg1];
                    int var37 = this.field4703[arg0 + 1][arg1];
                    int var38 = this.field4703[arg0 + 1][arg1 + 1];
                    int var39 = this.field4703[arg0][arg1 + 1];
                    var14 = (this.field4702 * var10 + this.field4687 * var8 + this.field4682 * var36 >> 15) + this.field4689;
                    if (var14 <= this.field4691.field2175) {
                        return;
                    }
                    var15 = (this.field4702 * var10 + this.field4687 * var9 + this.field4682 * var37 >> 15) + this.field4689;
                    if (var15 <= this.field4691.field2175) {
                        return;
                    }
                    int var40 = (this.field4702 * var11 + this.field4687 * var9 + this.field4682 * var38 >> 15) + this.field4689;
                    if (var40 <= this.field4691.field2175) {
                        return;
                    }
                    var17 = (this.field4702 * var11 + this.field4687 * var8 + this.field4682 * var39 >> 15) + this.field4689;
                    if (var17 <= this.field4691.field2175) {
                        return;
                    }
                    var20 = (this.field4697 * var10 + this.field4698 * var8 + this.field4695 * var36 >> 15) + this.field4704;
                    var21 = this.field4691.field2195 * var20 / var14 + arg2.field6502;
                    var22 = (this.field4683 * var10 + this.field4688 * var36 + this.field4684 * var8 >> 15) + this.field4681;
                    var23 = this.field4691.field2178 * var22 / var14 + arg2.field6496;
                    var24 = (this.field4697 * var10 + this.field4698 * var9 + this.field4695 * var37 >> 15) + this.field4704;
                    var25 = this.field4691.field2195 * var24 / var15 + arg2.field6502;
                    var26 = (this.field4683 * var10 + this.field4688 * var37 + this.field4684 * var9 >> 15) + this.field4681;
                    var27 = this.field4691.field2178 * var26 / var15 + arg2.field6496;
                    int var41 = (this.field4697 * var11 + this.field4698 * var9 + this.field4695 * var38 >> 15) + this.field4704;
                    var29 = this.field4691.field2195 * var41 / var40 + arg2.field6502;
                    int var42 = (this.field4683 * var11 + this.field4688 * var38 + this.field4684 * var9 >> 15) + this.field4681;
                    var31 = this.field4691.field2178 * var42 / var40 + arg2.field6496;
                    var32 = (this.field4697 * var11 + this.field4698 * var8 + this.field4695 * var39 >> 15) + this.field4704;
                    var33 = this.field4691.field2195 * var32 / var17 + arg2.field6502;
                    var34 = (this.field4683 * var11 + this.field4688 * var39 + this.field4684 * var8 >> 15) + this.field4681;
                    var35 = this.field4691.field2178 * var34 / var17 + arg2.field6496;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6504 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6497 || var33 > arg2.field6497 || var25 > arg2.field6497;
                    if (var7.field4209 >= 0) {
                        if (this.method2030(this.field4691.field2187.method371(var7.field4209, (byte) 96).field4447)) {
                            arg2.field6506 = 100;
                        }
                        arg2.method2765(var31, var35, var27, var29, var33, var25, var7.field4207 & 65535, var7.field4205 & 65535, var7.field4208 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4209);
                        arg2.field6506 = 0;
                    } else {
                        arg2.method2762(var31, var35, var27, var29, var33, var25, var7.field4207 & 65535, var7.field4205 & 65535, var7.field4208 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6504 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6497 || var25 > arg2.field6497 || var33 > arg2.field6497;
                    if (var7.field4209 >= 0) {
                        if (this.method2030(this.field4691.field2187.method371(var7.field4209, (byte) 96).field4447)) {
                            arg2.field6506 = 100;
                        }
                        arg2.method2765(var23, var27, var35, var21, var25, var33, var7.field4210 & 65535, var7.field4208 & 65535, var7.field4205 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4209);
                        arg2.field6506 = 0;
                        return;
                    }
                    arg2.method2762(var23, var27, var35, var21, var25, var33, var7.field4210 & 65535, var7.field4208 & 65535, var7.field4205 & 65535);
                }
            }
        } else {
            class255 var43 = this.field4696[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field3421; ++var44) {
                    int var84 = var43.field3428[var44];
                    int var85 = var43.field3425[var44];
                    int var86 = var43.field3420[var44];
                    int var87 = (this.field4702 * var86 + this.field4687 * var84 + this.field4682 * var85 >> 15) + this.field4689;
                    if (var87 <= this.field4691.field2175) {
                        return;
                    }
                    int var88 = (this.field4697 * var86 + this.field4698 * var84 + this.field4695 * var85 >> 15) + this.field4704;
                    int var89 = (this.field4683 * var86 + this.field4688 * var85 + this.field4684 * var84 >> 15) + this.field4681;
                    arg3[var44] = this.field4691.field2195 * var88 / var87 + arg2.field6502;
                    arg4[var44] = this.field4691.field2178 * var89 / var87 + arg2.field6496;
                }
                if (var43.field3429 != null) {
                    int var45 = this.field4703[arg0][arg1];
                    int var46 = this.field4703[arg0 + 1][arg1];
                    int var47 = this.field4703[arg0][arg1 + 1];
                    int var48 = this.field4690 * arg0;
                    int var49 = this.field4690 + var48;
                    int var50 = this.field4690 * arg1;
                    int var51 = this.field4690 + var50;
                    int var52 = (this.field4697 * var50 + this.field4698 * var48 + this.field4695 * var45 >> 15) + this.field4704;
                    int var53 = (this.field4683 * var50 + this.field4688 * var45 + this.field4684 * var48 >> 15) + this.field4681;
                    int var54 = (this.field4702 * var50 + this.field4687 * var48 + this.field4682 * var45 >> 15) + this.field4689;
                    int var55 = (this.field4697 * var50 + this.field4698 * var49 + this.field4695 * var46 >> 15) + this.field4704;
                    int var56 = (this.field4683 * var50 + this.field4688 * var46 + this.field4684 * var49 >> 15) + this.field4681;
                    int var57 = (this.field4702 * var50 + this.field4687 * var49 + this.field4682 * var46 >> 15) + this.field4689;
                    int var58 = (this.field4697 * var51 + this.field4698 * var48 + this.field4695 * var47 >> 15) + this.field4704;
                    int var59 = (this.field4683 * var51 + this.field4688 * var47 + this.field4684 * var48 >> 15) + this.field4681;
                    int var60 = (this.field4702 * var51 + this.field4687 * var48 + this.field4682 * var47 >> 15) + this.field4689;
                    for (int var61 = 0; var61 < var43.field3430; ++var61) {
                        short var62 = var43.field3419[var61];
                        short var63 = var43.field3423[var61];
                        short var64 = var43.field3422[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field6504 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field6497 || var66 > arg2.field6497 || var67 > arg2.field6497;
                            short var71 = var43.field3429[var61];
                            if (var71 != -1) {
                                if (this.method2030(this.field4691.field2187.method371(var71, (byte) 96).field4447)) {
                                    arg2.field6506 = 100;
                                }
                                arg2.method2765(var68, var69, var70, var65, var66, var67, var43.field3431[var62], var43.field3431[var63], var43.field3431[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field6506 = 0;
                            } else {
                                int var72 = var43.field3424[var61];
                                if (var72 != -1) {
                                    arg2.method2762(var68, var69, var70, var65, var66, var67, class443.method2746(var43.field3431[var62], true, var72), class443.method2746(var43.field3431[var63], true, var72), class443.method2746(var43.field3431[var64], true, var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field3430; ++var73) {
                    short var74 = var43.field3419[var73];
                    short var75 = var43.field3423[var73];
                    short var76 = var43.field3422[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field3424[var73];
                        if (var83 != -1) {
                            arg2.field6504 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field6497 || var78 > arg2.field6497 || var79 > arg2.field6497;
                            arg2.method2762(var80, var81, var82, var77, var78, var79, class443.method2746(var43.field3431[var74], true, var83), class443.method2746(var43.field3431[var75], true, var83), class443.method2746(var43.field3431[var76], true, var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Llg;IIIIZ)V", line = 1743)
    public final void method1980(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III[[ZZ)V", line = 1747)
    public final void method1987(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class284 var6 = this.field4691.field2170;
        this.field4698 = var6.field3976;
        this.field4695 = var6.field3980;
        this.field4697 = var6.field3983;
        this.field4704 = var6.field3977;
        this.field4684 = var6.field3982;
        this.field4688 = var6.field3981;
        this.field4683 = var6.field3979;
        this.field4681 = var6.field3978;
        this.field4687 = var6.field3986;
        this.field4682 = var6.field3985;
        this.field4702 = var6.field3984;
        this.field4689 = var6.field3975;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V", line = 1764)
    public final void method1992(int arg0, int arg1, int arg2) {
        if (this.field4692[arg0][arg1] < arg2) {
            this.field4692[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)I", line = 1771)
    public final int method1990(int arg0, int arg1) {
        return this.field4703[arg0][arg1];
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII[[ZLkr;[I[I)V", line = 1775)
    private final void method2034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class445 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6507 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4686[var16][var17] != null) {
                        class292 var18 = this.field4686[var16][var17];
                        if (var18.field4209 != -1 && (var18.field4206 & 2) == 0 && var18.field4204 == -1) {
                            int var19 = this.field4691.method967(var18.field4209);
                            arg8.method2762(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class443.method2746(var18.field4207 & 65535, true, var19), class443.method2746(var18.field4205 & 65535, true, var19), class443.method2746(var18.field4208 & 65535, true, var19));
                            arg8.method2762(var15, var15, var15 - var13, var14, var13 + var14, var14, class443.method2746(var18.field4210 & 65535, true, var19), class443.method2746(var18.field4208 & 65535, true, var19), class443.method2746(var18.field4205 & 65535, true, var19));
                        } else if (var18.field4204 == -1) {
                            arg8.method2762(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4207 & 65535, var18.field4205 & 65535, var18.field4208 & 65535);
                            arg8.method2762(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4210 & 65535, var18.field4208 & 65535, var18.field4205 & 65535);
                        } else {
                            int var20 = var18.field4204;
                            arg8.method2762(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2762(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4696[var16][var17] != null) {
                        class255 var21 = this.field4696[var16][var17];
                        for (int var22 = 0; var22 < var21.field3421; ++var22) {
                            arg9[var22] = (var21.field3428[var22] - this.field4690 * var16) * var13 / this.field4690 + var14;
                            arg10[var22] = var15 - (var21.field3420[var22] - this.field4690 * var17) * var13 / this.field4690;
                        }
                        for (int var23 = 0; var23 < var21.field3430; ++var23) {
                            short var24 = var21.field3419[var23];
                            short var25 = var21.field3423[var23];
                            short var26 = var21.field3422[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3426 != null && var21.field3426[var23] != -1) {
                                int var33 = var21.field3426[var23];
                                arg8.method2762(var30, var31, var32, var27, var28, var29, class443.method2746(var21.field3431[var24], true, var33), class443.method2746(var21.field3431[var25], true, var33), class443.method2746(var21.field3431[var26], true, var33));
                            } else if (var21.field3429 != null && var21.field3429[var23] != -1) {
                                int var34 = this.field4691.method967(var21.field3429[var23]);
                                arg8.method2762(var30, var31, var32, var27, var28, var29, class443.method2746(var21.field3431[var24], true, var34), class443.method2746(var21.field3431[var25], true, var34), class443.method2746(var21.field3431[var26], true, var34));
                            } else {
                                int var35 = var21.field3424[var23];
                                arg8.method2762(var30, var31, var32, var27, var28, var29, class443.method2746(var21.field3431[var24], true, var35), class443.method2746(var21.field3431[var25], true, var35), class443.method2746(var21.field3431[var26], true, var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6507 = true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lvg;[I)V", line = 1909)
    public final void method1989(class33 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIIIIII[[ZLkr;[I[I)V", line = 1915)
    private final void method2035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class445 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6507 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4701[var16][var17] != null) {
                        class409 var18 = this.field4701[var16][var17];
                        if (var18.field5930 != -1 && (var18.field5928 & 2) == 0 && var18.field5926 == 0) {
                            int var19 = this.field4691.method967(var18.field5930);
                            arg8.method2762(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class443.method2746(var18.field5929, true, var19), class443.method2746(var18.field5925, true, var19), class443.method2746(var18.field5927, true, var19));
                            arg8.method2762(var15, var15, var15 - var13, var14, var13 + var14, var14, class443.method2746(var18.field5924, true, var19), class443.method2746(var18.field5927, true, var19), class443.method2746(var18.field5925, true, var19));
                        } else if (var18.field5926 == 0) {
                            arg8.method2759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5929, var18.field5925, var18.field5927);
                            arg8.method2759(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5924, var18.field5927, var18.field5925);
                        } else {
                            int var20 = var18.field5926;
                            arg8.method2759(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class433.method2688(var20, 2, var18.field5929 & -16777216), class433.method2688(var20, 2, var18.field5925 & -16777216), class433.method2688(var20, 2, var18.field5927 & -16777216));
                            arg8.method2759(var15, var15, var15 - var13, var14, var13 + var14, var14, class433.method2688(var20, 2, var18.field5924 & -16777216), class433.method2688(var20, 2, var18.field5927 & -16777216), class433.method2688(var20, 2, var18.field5925 & -16777216));
                        }
                    } else if (this.field4685[var16][var17] != null) {
                        class79 var21 = this.field4685[var16][var17];
                        for (int var22 = 0; var22 < var21.field894; ++var22) {
                            arg9[var22] = (var21.field897[var22] - this.field4690 * var16) * var13 / this.field4690 + var14;
                            arg10[var22] = var15 - (var21.field893[var22] - this.field4690 * var17) * var13 / this.field4690;
                        }
                        for (int var23 = 0; var23 < var21.field891; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field896 != null && var21.field896[var23] != 0 && (var21.field900 == null || var21.field900 != null && var21.field900[var23] == -1)) {
                                int var33 = var21.field896[var23];
                                arg8.method2759(var30, var31, var32, var27, var28, var29, class433.method2688(var33, 2, -16777216 - (var21.field895[var24] & -16777216)), class433.method2688(var33, 2, -16777216 - (var21.field895[var25] & -16777216)), class433.method2688(var33, 2, -16777216 - (var21.field895[var26] & -16777216)));
                            } else if (var21.field900 != null && var21.field900[var23] != -1) {
                                int var34 = this.field4691.method967(var21.field900[var23]);
                                arg8.method2762(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2759(var30, var31, var32, var27, var28, var29, var21.field895[var24], var21.field895[var25], var21.field895[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6507 = true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 2048)
    public final void method1982(int arg0, int arg1) {
        class256 var3 = this.field4691.method976(Thread.currentThread());
        var3.field3436.field6506 = 0;
        if (this.field4701 != null) {
            this.method2032(arg0, arg1, this.field4691.field2199, var3.field3436, var3.field3475, var3.field3471, var3.field3453);
        } else {
            if (this.field4686 != null) {
                this.method2033(arg0, arg1, var3.field3436, var3.field3475, var3.field3471, var3.field3453);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2062)
    public final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class256 var9 = this.field4691.method976(Thread.currentThread());
        class445 var10 = var9.field3436;
        var10.field6506 = 0;
        var10.field6504 = false;
        if (this.field4701 != null) {
            this.method2035(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3475, var9.field3471);
        } else {
            if (this.field4686 != null) {
                this.method2034(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3475, var9.field3471);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V", line = 2077)
    public final void method1981() {
        this.field4693 = null;
        this.field4692 = null;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(II)I", line = 2082)
    public final int method1991(int arg0, int arg1) {
        int var3 = arg0 >> this.field4694;
        int var4 = arg1 >> this.field4694;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field4530 - 1 && var4 <= super.field4531 - 1) {
            int var5 = arg0 & this.field4690 - 1;
            int var6 = arg1 & this.field4690 - 1;
            int var7 = (this.field4690 - var5) * this.field4703[var3][var4] + this.field4703[var3 + 1][var4] * var5 >> this.field4694;
            int var8 = (this.field4690 - var5) * this.field4703[var3][var4 + 1] + this.field4703[var3 + 1][var4 + 1] * var5 >> this.field4694;
            return (this.field4690 - var6) * var7 + var6 * var8 >> this.field4694;
        } else {
            return 0;
        }
    }
}
