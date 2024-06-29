import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class346 extends class31 {

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    private int field4404 = -1;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    private int field4410 = -1;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "Lpi;")
    public static class340 field4406 = new class340(24, 4);

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "[Z")
    public static boolean[] field4415;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIB)V")
    public final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field4411;
        int var8 = super.field512.field6677 - arg3 + -arg2;
        super.field512.method2771(this, arg6 ^ -16808);
        OpenGL.glCopyTexSubImage2D(super.field521, 0, arg0, -arg1 - (arg2 - this.field4416), arg5, var8, arg4, arg2);
        if (arg6 != 55) {
            this.field4416 = -91;
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V")
    public final void method2034(int arg0, int arg1, int arg2, int arg3) {
        ++field4418;
        if (arg1 != 0) {
            method2036((class518) null, (int[]) null, (int[]) null, (int[]) null, (byte) -30);
        }
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field521, super.field509, arg0);
        this.field4404 = arg2;
        this.field4410 = arg3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) {
        ++field4405;
        OpenGL.glFramebufferTexture2DEXT(this.field4410, this.field4404, super.field521, arg0, 0);
        this.field4410 = -1;
        this.field4404 = -1;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgk;IIII)V")
    public class346(class463 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4409 = arg3;
        this.field4416 = arg4;
        super.field512.method2771(this, -16785);
        OpenGL.glTexImage2Dub(super.field521, 0, super.field519, arg3, arg4, 0, class65.method365(super.field519, false), 5121, (byte[]) null, 0);
        this.method210(true, (byte) 37);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgk;IIIII)V")
    public class346(class463 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4416 = arg5;
        this.field4409 = arg4;
        int var7 = -arg3 - arg5 + super.field512.field6677;
        super.field512.method2771(this, -16785);
        OpenGL.glCopyTexImage2D(super.field521, 0, super.field519, arg2, var7, arg4, arg5, 0);
        this.method210(true, (byte) 69);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgk;IIIIZ[IZ)V")
    public class346(class463 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4409 = arg3;
        this.field4416 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field512.method2771(this, -16785);
        if (arg5 && ~super.field521 != -34038) {
            class518.method3074(super.field512.field6793, this.field4416, arg6, 32993, super.field521, 20943, this.field4409, super.field519);
            this.method215(true, 0);
        } else {
            OpenGL.glTexImage2Di(super.field521, 0, super.field519, this.field4409, this.field4416, 0, 32993, super.field512.field6793, arg6, 0);
            this.method215(false, 0);
        }
        this.method210(true, (byte) -89);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([IIIIIIBZI)V")
    public final void method2035(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, int arg8) {
        if (arg6 == 90) {
            ++field4414;
            if (arg2 == 0) {
                arg2 = arg1;
            }
            if (arg7) {
                int[] var10 = new int[arg1 * arg8];
                for (int var11 = 0; arg8 > var11; ++var11) {
                    int var12 = arg1 * var11;
                    int var13 = (-var11 + -1 + arg8) * arg2 + arg5;
                    for (int var14 = 0; ~var14 > ~arg1; ++var14) {
                        var10[var12++] = arg0[var13++];
                    }
                }
                arg0 = var10;
            }
            super.field512.method2771(this, -16785);
            if (~arg1 != ~arg2) {
                OpenGL.glPixelStorei(3314, arg2);
            }
            OpenGL.glTexSubImage2Di(super.field521, 0, arg4, arg3, arg1, arg8, 32993, super.field512.field6793, arg0, arg5);
            if (~arg1 != ~arg2) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lmv;[I[I[IB)V")
    public static final void method2036(class518 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        ++field4417;
        if (arg4 == 105) {
            for (int var5 = 0; var5 < arg3.length; ++var5) {
                int var6 = arg3[var5];
                int var7 = arg2[var5];
                int var8 = arg1[var5];
                int var9 = 0;
                while (var7 != 0 && arg0.field5183.length > var9) {
                    if (~(1 & var7) != -1) {
                        if (~var6 != 0) {
                            class44 var10 = class403.field5429.method1962(var6, false);
                            int var11 = var10.field643;
                            class447 var12 = arg0.field5183[var9];
                            if (var12 != null) {
                                if (var12.field6218 != var6) {
                                    if (~var10.field648 <= ~class403.field5429.method1962(var12.field6218, false).field648) {
                                        var12 = arg0.field5183[var9] = null;
                                    }
                                } else if (var11 == 0) {
                                    var12 = arg0.field5183[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6214 = 0;
                                    var12.field6215 = 0;
                                    var12.field6212 = var8;
                                    var12.field6219 = 1;
                                    var12.field6210 = 0;
                                    class284.method1729(arg0.field6239, 0, 119, arg0.field6220, arg0.field6241, var10, class37.field573 == arg0);
                                } else if (var11 == 2) {
                                    var12.field6215 = 0;
                                }
                            }
                            if (var12 == null) {
                                class447 var13 = arg0.field5183[var9] = new class447();
                                var13.field6210 = 0;
                                var13.field6219 = 1;
                                var13.field6215 = 0;
                                var13.field6214 = 0;
                                var13.field6212 = var8;
                                var13.field6218 = var6;
                                class284.method1729(arg0.field6239, 0, 115, arg0.field6220, arg0.field6241, var10, class37.field573 == arg0);
                            }
                        } else {
                            arg0.field5183[var9] = null;
                        }
                    }
                    ++var9;
                    var7 >>>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII[BZIIII)V")
    public final void method2037(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg7) {
            arg3 = arg1;
        }
        ++field4407;
        if (arg5) {
            int var11 = class163.method1083(arg2, (byte) -92);
            int var12 = arg1 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; ~arg0 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg0 + -1) * var13 + arg9;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        super.field512.method2771(this, -16785);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field521, 0, arg8, arg6, arg1, arg0, arg2, 5121, arg4, arg9);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILjava/lang/Class;)Loh;")
    public static final class448 method2038(int arg0, int arg1, int arg2, Class arg3) {
        class510 var4 = class470.field6877[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class319 var5 = var4.field7494; var5 != null; var5 = var5.field4102) {
                class448 var6 = var5.field4107;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field6238 == arg1 && var6.field6228 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)V")
    public static final void method2039(boolean arg0) {
        class71.field881 = null;
        if (!arg0) {
            class303.field3927 = null;
            class347.field4436 = null;
            class269.field3407 = null;
            ++field4408;
            class334.field4280 = null;
            class254.field3211 = null;
            class43.field635 = null;
            class328.field4215 = null;
            class9.field95 = null;
            class52.field716 = null;
            class475.field6950 = null;
            class517.field7622 = null;
            class492.field7189 = null;
            class200.field2590 = null;
            class54.field745 = null;
            class350.field4482 = null;
            class310.field4007 = null;
            class271.field3446 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgk;IIIIZ[BIZ)V")
    public class346(class463 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4416 = arg4;
        this.field4409 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - 1 + -var11) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field512.method2771(this, -16785);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field521 != -34038) {
            class174.method1136(arg7, arg3, arg2, arg4, 79, arg6, arg1);
            this.method215(true, 0);
        } else {
            OpenGL.glTexImage2Dub(super.field521, 0, super.field519, this.field4409, this.field4416, 0, arg7, 5121, arg6, 0);
            this.method215(false, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method210(true, (byte) -111);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lgk;IIIIZ[FI)V")
    public class346(class463 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4416 = arg4;
        this.field4409 = arg3;
        super.field512.method2771(this, -16785);
        if (arg5 && ~super.field521 != -34038) {
            class132.method930((byte) -86, arg3, arg7, arg4, arg6, arg1, arg2);
            this.method215(true, 0);
        } else {
            OpenGL.glTexImage2Df(super.field521, 0, super.field519, this.field4409, this.field4416, 0, arg7, 5126, arg6, 0);
            this.method215(false, 0);
        }
        this.method210(true, (byte) 106);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZBZ)V")
    public final void method2040(boolean arg0, byte arg1, boolean arg2) {
        if (super.field521 == 3553) {
            super.field512.method2771(this, arg1 + -16874);
            OpenGL.glTexParameteri(super.field521, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field521, 10243, !arg0 ? 33071 : 10497);
        }
        ++field4412;
        if (arg1 != 89) {
            this.method2035((int[]) null, -48, -67, -77, -123, -60, (byte) -10, false, 11);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method2041(byte arg0) {
        field4415 = null;
        field4406 = null;
        if (arg0 < 1) {
            field4415 = null;
        }
    }
}
