import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class673 extends class657 {

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    private int field9504 = -1;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    private int field9517 = -1;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public int field9515;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public int field9511;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "Lqs;")
    public static class559 field9510 = new class559();

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "Lnea;")
    public static class664 field9518 = new class664(94, 2);

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "Lkr;")
    public static class693 field9519 = new class693("stellardawn", 1);

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public static int field9513;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field9514;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lok;IIIIZ[IZ)V", line = 366)
    public class673(class228 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9515 = arg4;
        this.field9511 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field9210.method1505(-2, this);
        if (arg5 && ~super.field9226 != -34038) {
            class329.method2072(super.field9208, this.field9511, this.field9515, arg6, 32993, 2, super.field9226, super.field9210.field3547);
            this.method3622(true, 9728);
        } else {
            OpenGL.glTexImage2Di(super.field9226, 0, super.field9208, this.field9511, this.field9515, 0, 32993, super.field9210.field3547, arg6, 0);
            this.method3622(false, 9728);
        }
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lok;IIIIZ[BIZ)V", line = 527)
    public class673(class228 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9515 = arg4;
        this.field9511 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - (var11 - -1)) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field9210.method1505(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field9226 != -34038) {
            class323.method2027(arg7, arg3, arg2, arg4, arg1, arg6, 0);
            this.method3622(true, 9728);
        } else {
            OpenGL.glTexImage2Dub(super.field9226, 0, super.field9208, this.field9511, this.field9515, 0, arg7, 5121, arg6, 0);
            this.method3622(false, 9728);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lok;IIIII)V", line = 580)
    public class673(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field9515 = arg5;
        this.field9511 = arg4;
        int var7 = -arg5 + super.field9210.field3332 + -arg3;
        super.field9210.method1505(-2, this);
        OpenGL.glCopyTexImage2D(super.field9226, 0, super.field9208, arg2, var7, arg4, arg5, 0);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lok;IIIIZ[FI)V", line = 595)
    public class673(class228 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9511 = arg3;
        this.field9515 = arg4;
        super.field9210.method1505(-2, this);
        if (arg5 && super.field9226 != 34037) {
            class621.method3452(true, arg6, arg3, arg7, arg1, arg2, arg4);
            this.method3622(true, 9728);
        } else {
            OpenGL.glTexImage2Df(super.field9226, 0, super.field9208, this.field9511, this.field9515, 0, arg7, 5126, arg6, 0);
            this.method3622(false, 9728);
        }
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lok;IIII)V", line = 678)
    public class673(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field9515 = arg4;
        this.field9511 = arg3;
        super.field9210.method1505(-2, this);
        OpenGL.glTexImage2Dub(super.field9226, 0, super.field9208, arg3, arg4, 0, class145.method1035(super.field9208, 6408), 5121, (byte[]) null, 0);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)V", line = 12)
    public static void method3729(boolean arg0) {
        field9518 = null;
        field9519 = null;
        if (arg0) {
            field9519 = null;
        }
        field9510 = null;
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)I", line = 25)
    public static final int method3730(int arg0) {
        ++field9509;
        return arg0 < 14 ? -83 : class407.field5955++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 36)
    public final void method226(int arg0) {
        ++field9506;
        OpenGL.glFramebufferTexture2DEXT(this.field9517, this.field9504, super.field9226, 0, 0);
        this.field9504 = arg0;
        this.field9517 = -1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)Lap;", line = 47)
    public static final class440 method3731(int arg0, boolean arg1) {
        if (arg1) {
            method3731(-104, false);
        }
        ++field9512;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 != 8) {
                                            if (~arg0 != -10) {
                                                if (arg0 != 10) {
                                                    if (arg0 != 11) {
                                                        if (~arg0 != -13) {
                                                            if (arg0 != 13) {
                                                                if (arg0 != 14) {
                                                                    if (arg0 != 15) {
                                                                        if (~arg0 != -17) {
                                                                            if (arg0 != 17) {
                                                                                if (arg0 != 18) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (arg0 != 20) {
                                                                                            if (arg0 != 21) {
                                                                                                if (arg0 != 22) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (arg0 != 24) {
                                                                                                            if (arg0 != 25) {
                                                                                                                if (~arg0 != -27) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (arg0 != 28) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (~arg0 != -32) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (arg0 != 34) {
                                                                                                                                                    if (~arg0 != -36) {
                                                                                                                                                        if (~arg0 != -37) {
                                                                                                                                                            if (arg0 != 37) {
                                                                                                                                                                if (arg0 != 38) {
                                                                                                                                                                    return ~arg0 == -40 ? new class385() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class105();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class514();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class477();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class24();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class61();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class488();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class517();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class136();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class201();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class179();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class192();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class662();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class596();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class331();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class261();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class319();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class259();
                                                                                                }
                                                                                            } else {
                                                                                                return new class573();
                                                                                            }
                                                                                        } else {
                                                                                            return new class672();
                                                                                        }
                                                                                    } else {
                                                                                        return new class88();
                                                                                    }
                                                                                } else {
                                                                                    return new class426();
                                                                                }
                                                                            } else {
                                                                                return new class185();
                                                                            }
                                                                        } else {
                                                                            return new class67();
                                                                        }
                                                                    } else {
                                                                        return new class502();
                                                                    }
                                                                } else {
                                                                    return new class341();
                                                                }
                                                            } else {
                                                                return new class489();
                                                            }
                                                        } else {
                                                            return new class661();
                                                        }
                                                    } else {
                                                        return new class403();
                                                    }
                                                } else {
                                                    return new class204();
                                                }
                                            } else {
                                                return new class629();
                                            }
                                        } else {
                                            return new class20();
                                        }
                                    } else {
                                        return new class654();
                                    }
                                } else {
                                    return new class379();
                                }
                            } else {
                                return new class678();
                            }
                        } else {
                            return new class686();
                        }
                    } else {
                        return new class51();
                    }
                } else {
                    return new class345();
                }
            } else {
                return new class534();
            }
        } else {
            return new class195();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIIIIZIIII)V", line = 416)
    public final void method3732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg3 == -1) {
            arg3 = arg2;
        }
        if (arg1 != -6577) {
            this.method3733((int[]) null, 66, -44, (byte) 82, -80, -123, 33, false, -40);
        }
        ++field9507;
        if (arg5) {
            int var11 = class385.method2304(-15499, arg8);
            int var12 = arg2 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; ~var15 > ~arg9; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg9 - 1) * var13 + arg6;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field9210.method1505(arg1 ^ 6577, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field9226, 0, arg7, arg4, arg2, arg9, arg8, 5121, arg0, arg6);
        if (arg2 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([IIIBIIIZI)V", line = 476)
    public final void method3733(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field9514;
        if (arg5 == 0) {
            arg5 = arg6;
        }
        if (arg7) {
            int[] var10 = new int[arg1 * arg6];
            for (int var11 = 0; var11 < arg1; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (arg1 - var11 + -1) * arg5 + arg4;
                for (int var14 = 0; arg6 > var14; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        if (arg3 <= 44) {
            field9519 = null;
        }
        super.field9210.method1505(-2, this);
        if (arg5 != arg6) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field9226, 0, arg8, arg2, arg6, arg1, 32993, super.field9210.field3547, arg0, arg4);
        if (~arg5 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLqs;)I", line = 621)
    public static final int method3734(boolean arg0, class559 arg1) {
        ++field9508;
        if (arg0) {
            method3730(-49);
        }
        if (class69.field1243 != arg1) {
            if (class268.field4040 == arg1) {
                return 34065;
            } else if (class559.field7887 == arg1) {
                return 34066;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V", line = 647)
    public final void method3735(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field9226, super.field9223, arg0);
        ++field9505;
        if (arg1 == -32) {
            this.field9504 = arg2;
            this.field9517 = arg3;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZZ)V", line = 660)
    public final void method3736(int arg0, boolean arg1, boolean arg2) {
        ++field9516;
        if (arg0 > -73) {
            field9510 = null;
        }
        if (super.field9226 == 3553) {
            super.field9210.method1505(-2, this);
            OpenGL.glTexParameteri(super.field9226, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field9226, 10243, !arg2 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBIIIII)V", line = 693)
    public final void method3737(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == -58) {
            ++field9513;
            int var8 = -arg4 + super.field9210.field3332 + -arg5;
            super.field9210.method1505(-2, this);
            OpenGL.glCopyTexSubImage2D(super.field9226, 0, arg0, -arg5 + this.field9515 + -arg2, arg6, var8, arg3, arg5);
            OpenGL.glFlush();
        }
    }
}
