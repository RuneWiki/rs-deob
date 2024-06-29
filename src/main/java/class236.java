import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class236 extends class440 {

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    private int field3422 = -1;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    private int field3428 = -1;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "F")
    public static float field3423;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIBII)V", line = 4)
    public final void method1531(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field3418;
        int var8 = super.field6421.field4737 - arg2 - arg0;
        if (arg4 <= 36) {
            method1536(true, -127, 23, (byte[]) null);
        }
        super.field6421.method2042(this, 0);
        OpenGL.glCopyTexSubImage2D(super.field6424, 0, arg5, this.field3429 - arg0 - arg1, arg3, var8, arg6, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqg;IIIII)V", line = 22)
    public class236(class321 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3430 = arg4;
        this.field3429 = arg5;
        int var7 = -arg3 + -arg5 + super.field6421.field4737;
        super.field6421.method2042(this, 0);
        OpenGL.glCopyTexImage2D(super.field6424, 0, super.field6412, arg2, var7, arg4, arg5, 0);
        this.method2673(68, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method1532(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field6424, super.field6422, arg1);
        ++field3419;
        this.field3422 = arg2;
        this.field3428 = arg0;
        int var5 = 89 / ((-23 - arg3) / 46);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ[BIIIZIII)V", line = 49)
    public final void method1533(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        ++field3421;
        if (arg7 == 0) {
            arg7 = arg9;
        }
        if (arg1) {
            int var11 = class80.method645(-6408, arg3);
            int var12 = arg9 * var11;
            int var13 = arg7 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; ~arg4 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg4 + -1) * var13 - -arg8;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field6421.method2042(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg7 != ~arg9) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field6424, 0, arg5, arg0, arg9, arg4, arg3, 5121, arg2, arg8);
        if (!arg6) {
            this.field3430 = -1;
        }
        if (~arg7 != ~arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIZ)V", line = 108)
    public final void method1534(boolean arg0, int arg1, boolean arg2) {
        if (arg1 <= 98) {
            this.method1532(108, 39, 32, 17);
        }
        if (super.field6424 == 3553) {
            super.field6421.method2042(this, 0);
            OpenGL.glTexParameteri(super.field6424, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field6424, 10243, !arg2 ? 33071 : 10497);
        }
        ++field3420;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqg;IIII)V", line = 126)
    public class236(class321 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3430 = arg3;
        this.field3429 = arg4;
        super.field6421.method2042(this, 0);
        OpenGL.glTexImage2Dub(super.field6424, 0, super.field6412, arg3, arg4, 0, class347.method2251(120, super.field6412), 5121, (byte[]) null, 0);
        this.method2673(-128, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[IIZIIIII)V", line = 138)
    public final void method1535(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 == 0) {
            arg8 = arg0;
        }
        if (arg2 > -21) {
            this.method1533(47, true, (byte[]) null, 120, 51, -86, false, 87, 79, -72);
        }
        ++field3426;
        if (arg3) {
            int[] var10 = new int[arg0 * arg6];
            for (int var11 = 0; ~arg6 < ~var11; ++var11) {
                int var12 = arg0 * var11;
                int var13 = (-var11 + -1 + arg6) * arg8 + arg5;
                for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field6421.method2042(this, 0);
        if (~arg0 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field6424, 0, arg4, arg7, arg0, arg6, 32993, super.field6421.field4860, arg1, arg5);
        if (~arg0 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqg;IIIIZ[BIZ)V", line = 194)
    public class236(class321 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3430 = arg3;
        this.field3429 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6421.method2042(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field6424 != -34038) {
            class348.method2255(arg7, arg3, arg4, arg2, (byte) -121, arg1, arg6);
            this.method2674((byte) -119, true);
        } else {
            OpenGL.glTexImage2Dub(super.field6424, 0, super.field6412, this.field3430, this.field3429, 0, arg7, 5121, arg6, 0);
            this.method2674((byte) -112, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2673(-97, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 248)
    public final void method329(boolean arg0) {
        ++field3425;
        OpenGL.glFramebufferTexture2DEXT(this.field3422, this.field3428, super.field6424, 0, 0);
        this.field3422 = -1;
        this.field3428 = -1;
        if (!arg0) {
            this.field3422 = -102;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqg;IIIIZ[IZ)V", line = 261)
    public class236(class321 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3430 = arg3;
        this.field3429 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - (var10 + 1)) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6421.method2042(this, 0);
        if (arg5 && ~super.field6424 != -34038) {
            class51.method369((byte) 78, 32993, this.field3429, super.field6424, super.field6421.field4860, this.field3430, arg6, super.field6412);
            this.method2674((byte) -114, true);
        } else {
            OpenGL.glTexImage2Di(super.field6424, 0, super.field6412, this.field3430, this.field3429, 0, 32993, super.field6421.field4860, arg6, 0);
            this.method2674((byte) -117, false);
        }
        this.method2673(-108, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZII[B)I", line = 312)
    public static final int method1536(boolean arg0, int arg1, int arg2, byte[] arg3) {
        ++field3424;
        int var4 = -1;
        for (int var5 = arg1; ~arg2 < ~var5; ++var5) {
            var4 = class240.field3491[(var4 ^ arg3[var5]) & 255] ^ var4 >>> 8;
        }
        if (!arg0) {
            method1537(7, (byte) 40);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lqg;IIIIZ[FI)V", line = 339)
    public class236(class321 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3429 = arg4;
        this.field3430 = arg3;
        super.field6421.method2042(this, 0);
        if (arg5 && super.field6424 != 34037) {
            class398.method2475(arg3, arg4, arg7, 5126, arg2, arg1, arg6);
            this.method2674((byte) -127, true);
        } else {
            OpenGL.glTexImage2Df(super.field6424, 0, super.field6412, this.field3430, this.field3429, 0, arg7, 5126, arg6, 0);
            this.method2674((byte) -125, false);
        }
        this.method2673(-77, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)Ljq;", line = 364)
    public static final class354 method1537(int arg0, byte arg1) {
        ++field3427;
        if (arg1 >= -80) {
            field3423 = 0.9485239F;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 != -9) {
                                            if (arg0 != 9) {
                                                if (arg0 != 10) {
                                                    if (arg0 != 11) {
                                                        if (arg0 != 12) {
                                                            if (arg0 != 13) {
                                                                if (~arg0 != -15) {
                                                                    if (arg0 != 15) {
                                                                        if (~arg0 != -17) {
                                                                            if (~arg0 != -18) {
                                                                                if (arg0 != 18) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (arg0 != 21) {
                                                                                                if (arg0 != 22) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (~arg0 != -25) {
                                                                                                            if (arg0 != 25) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (~arg0 != -28) {
                                                                                                                        if (~arg0 != -29) {
                                                                                                                            if (arg0 != 29) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (arg0 != 31) {
                                                                                                                                        if (arg0 != 32) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (arg0 != 35) {
                                                                                                                                                        if (~arg0 != -37) {
                                                                                                                                                            if (~arg0 != -38) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    return arg0 == 39 ? new class24() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class454();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class405();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class79();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class31();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class371();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class305();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class479();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class367();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class132();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class270();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class98();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class101();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class432();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class291();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class80();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class289();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class186();
                                                                                                }
                                                                                            } else {
                                                                                                return new class399();
                                                                                            }
                                                                                        } else {
                                                                                            return new class127();
                                                                                        }
                                                                                    } else {
                                                                                        return new class424();
                                                                                    }
                                                                                } else {
                                                                                    return new class32();
                                                                                }
                                                                            } else {
                                                                                return new class459();
                                                                            }
                                                                        } else {
                                                                            return new class55();
                                                                        }
                                                                    } else {
                                                                        return new class450();
                                                                    }
                                                                } else {
                                                                    return new class272();
                                                                }
                                                            } else {
                                                                return new class119();
                                                            }
                                                        } else {
                                                            return new class452();
                                                        }
                                                    } else {
                                                        return new class526();
                                                    }
                                                } else {
                                                    return new class436();
                                                }
                                            } else {
                                                return new class416();
                                            }
                                        } else {
                                            return new class265();
                                        }
                                    } else {
                                        return new class38();
                                    }
                                } else {
                                    return new class457();
                                }
                            } else {
                                return new class513();
                            }
                        } else {
                            return new class491();
                        }
                    } else {
                        return new class520();
                    }
                } else {
                    return new class176();
                }
            } else {
                return new class193();
            }
        } else {
            return new class226();
        }
    }
}
