import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class316 extends class501 {

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    private int field4153 = -1;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    private int field4148 = -1;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "Z")
    public static boolean field4138 = false;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "[[Z")
    public static boolean[][] field4146 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "Lff;")
    public static class9 field4152 = new class9(64, 12);

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "Lcu;")
    public static class145 field4154 = new class145(64, -1);

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "Lra;")
    public static class70 field4155 = new class70(4, 1, 1, 1);

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lbo;IIIIZ[FI)V")
    public class316(class511 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4144 = arg3;
        this.field4143 = arg4;
        super.field6916.method2980(this, 113);
        if (arg5 && super.field6920 != 34037) {
            class124.method906(arg1, arg3, arg6, arg4, arg7, arg2, -1);
            this.method2859(0, true);
        } else {
            OpenGL.glTexImage2Df(super.field6920, 0, super.field6913, this.field4144, this.field4143, 0, arg7, 5126, arg6, 0);
            this.method2859(0, false);
        }
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public final void method1503(int arg0) {
        ++field4140;
        OpenGL.glFramebufferTexture2DEXT(this.field4153, this.field4148, super.field6920, 0, 0);
        this.field4153 = -1;
        this.field4148 = -1;
        if (arg0 <= 126) {
            this.method1503(-116);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBIII)V")
    public static final void method1827(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 121) {
            field4138 = false;
        }
        if (~class353.field4777 >= ~arg4 && class300.field3971 >= arg4) {
            int var5 = class99.method710(arg2, (byte) -29, class71.field1077, class308.field4055);
            int var6 = class99.method710(arg3, (byte) -29, class71.field1077, class308.field4055);
            class344.method2002(var6, arg0, var5, 0, arg4);
        }
        ++field4150;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4145;
        int var8 = -arg5 + super.field6916.field7250 + -arg2;
        super.field6916.method2980(this, 111);
        if (arg1 < -98) {
            OpenGL.glCopyTexSubImage2D(super.field6920, 0, arg0, this.field4143 - (arg3 - -arg2), arg6, var8, arg4, arg2);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lbo;IIIII)V")
    public class316(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4143 = arg5;
        this.field4144 = arg4;
        int var7 = -arg3 + -arg5 + super.field6916.field7250;
        super.field6916.method2980(this, 112);
        OpenGL.glCopyTexImage2D(super.field6920, 0, super.field6913, arg2, var7, arg4, arg5, 0);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public static void method1829(int arg0) {
        field4146 = null;
        field4154 = null;
        field4155 = null;
        field4152 = null;
        if (arg0 >= -58) {
            field4155 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lbo;IIII)V")
    public class316(class511 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4144 = arg3;
        this.field4143 = arg4;
        super.field6916.method2980(this, 124);
        OpenGL.glTexImage2Dub(super.field6920, 0, super.field6913, arg3, arg4, 0, method1835(6407, super.field6913), 5121, (byte[]) null, 0);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1830(int arg0, String arg1) {
        ++field4139;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != 18714) {
            return null;
        } else {
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                char var5 = arg1.charAt(var4);
                if (var5 > 0 && var5 < 128 || var5 >= 160 && ~var5 >= -256) {
                    var3[var4] = (byte) var5;
                } else if (~var5 != -8365) {
                    if (var5 == 8218) {
                        var3[var4] = -126;
                    } else if (~var5 != -403) {
                        if (~var5 == -8223) {
                            var3[var4] = -124;
                        } else if (var5 != 8230) {
                            if (var5 != 8224) {
                                if (~var5 == -8226) {
                                    var3[var4] = -121;
                                } else if (~var5 == -711) {
                                    var3[var4] = -120;
                                } else if (~var5 == -8241) {
                                    var3[var4] = -119;
                                } else if (~var5 == -353) {
                                    var3[var4] = -118;
                                } else if (~var5 == -8250) {
                                    var3[var4] = -117;
                                } else if (~var5 != -339) {
                                    if (~var5 != -382) {
                                        if (~var5 != -8217) {
                                            if (~var5 != -8218) {
                                                if (~var5 != -8221) {
                                                    if (var5 == 8221) {
                                                        var3[var4] = -108;
                                                    } else if (var5 == 8226) {
                                                        var3[var4] = -107;
                                                    } else if (~var5 != -8212) {
                                                        if (~var5 != -8213) {
                                                            if (~var5 == -733) {
                                                                var3[var4] = -104;
                                                            } else if (~var5 == -8483) {
                                                                var3[var4] = -103;
                                                            } else if (~var5 != -354) {
                                                                if (~var5 != -8251) {
                                                                    if (~var5 != -340) {
                                                                        if (var5 != 382) {
                                                                            if (~var5 == -377) {
                                                                                var3[var4] = -97;
                                                                            } else {
                                                                                var3[var4] = 63;
                                                                            }
                                                                        } else {
                                                                            var3[var4] = -98;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -100;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -101;
                                                                }
                                                            } else {
                                                                var3[var4] = -102;
                                                            }
                                                        } else {
                                                            var3[var4] = -105;
                                                        }
                                                    } else {
                                                        var3[var4] = -106;
                                                    }
                                                } else {
                                                    var3[var4] = -109;
                                                }
                                            } else {
                                                var3[var4] = -110;
                                            }
                                        } else {
                                            var3[var4] = -111;
                                        }
                                    } else {
                                        var3[var4] = -114;
                                    }
                                } else {
                                    var3[var4] = -116;
                                }
                            } else {
                                var3[var4] = -122;
                            }
                        } else {
                            var3[var4] = -123;
                        }
                    } else {
                        var3[var4] = -125;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZZ)V")
    public final void method1831(boolean arg0, boolean arg1, boolean arg2) {
        ++field4149;
        if (~super.field6920 == -3554) {
            super.field6916.method2980(this, 113);
            OpenGL.glTexParameteri(super.field6920, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field6920, 10243, arg1 ? 10497 : 33071);
        }
        if (!arg0) {
            method1835(-75, -72);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lbo;IIIIZ[IZ)V")
    public class316(class511 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4143 = arg4;
        this.field4144 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field6916.method2980(this, 123);
        if (arg5 && super.field6920 != 34037) {
            class275.method1645((byte) 93, this.field4144, arg6, super.field6913, super.field6916.field7442, super.field6920, 32993, this.field4143);
            this.method2859(0, true);
        } else {
            OpenGL.glTexImage2Di(super.field6920, 0, super.field6913, this.field4144, this.field4143, 0, 32993, super.field6916.field7442, arg6, 0);
            this.method2859(0, false);
        }
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZB[BIIIIII)V")
    public final void method1832(int arg0, boolean arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg4 == -1) {
            arg4 = arg6;
        }
        ++field4141;
        if (arg1) {
            int var11 = class232.method1444(true, arg7);
            int var12 = arg6 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; arg5 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg5) * var13 + arg9;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field6916.method2980(this, 123);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg4 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field6920, 0, arg8, arg0, arg6, arg5, arg7, 5121, arg3, arg9);
        if (arg2 <= -15) {
            if (~arg4 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)V")
    public final void method1833(int arg0, int arg1, int arg2, int arg3) {
        ++field4147;
        if (arg1 == 6409) {
            OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field6920, super.field6924, arg2);
            this.field4153 = arg0;
            this.field4148 = arg3;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZIIIBII[I)V")
    public final void method1834(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int[] arg8) {
        if (arg2 == 0) {
            arg2 = arg4;
        }
        ++field4151;
        if (arg1) {
            int[] var10 = new int[arg4 * arg6];
            for (int var11 = 0; ~var11 > ~arg6; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (-var11 + -1 + arg6) * arg2 + arg3;
                for (int var14 = 0; arg4 > var14; ++var14) {
                    var10[var12++] = arg8[var13++];
                }
            }
            arg8 = var10;
        }
        super.field6916.method2980(this, 120);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        int var15 = 6 % ((arg5 - 51) / 58);
        OpenGL.glTexSubImage2Di(super.field6920, 0, arg0, arg7, arg4, arg6, 32993, super.field6916.field7442, arg8, arg3);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lbo;IIIIZ[BIZ)V")
    public class316(class511 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4143 = arg4;
        this.field4144 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field6916.method2980(this, 110);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field6920 != 34037) {
            class67.method449(arg2, arg6, (byte) -81, arg3, arg7, arg1, arg4);
            this.method2859(0, true);
        } else {
            OpenGL.glTexImage2Dub(super.field6920, 0, super.field6913, this.field4144, this.field4143, 0, arg7, 5121, arg6, 0);
            this.method2859(0, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
    public static final int method1835(int arg0, int arg1) {
        ++field4137;
        if (arg0 != arg1 && arg1 != 34843 && ~arg1 != -34838) {
            if (arg1 != 6408 && arg1 != 34842 && arg1 != 34836) {
                if (~arg1 != -6407 && arg1 != 34844) {
                    if (arg1 != 6409 && ~arg1 != -34847) {
                        if (~arg1 != -6411 && ~arg1 != -34848) {
                            if (arg1 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }
}
