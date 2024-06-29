import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class649 extends class224 {

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
    private int field9307 = -1;

    @OriginalMember(owner = "client!kia", name = "A", descriptor = "I")
    private int field9312 = -1;

    @OriginalMember(owner = "client!kia", name = "C", descriptor = "I")
    public int field9309;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "I")
    public int field9310;

    @OriginalMember(owner = "client!kia", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field9313 = new String[] { method4738(method4737("(d\u001aL3")), method4738(method4737("8#UL\f{")), method4738(method4737("=?X\u000e")), method4738(method4737("8#ULr:$]\u0016p{")), method4738(method4737("8#UL\u0006{")), method4738(method4737("8#UL\b{")), method4738(method4737("8#UL\r{")), method4738(method4737("8#UL\n{")), method4738(method4737("8#UL\u000f{")), method4738(method4737("8#UL\t{")), method4738(method4737("8#UL\u000b{")) };

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "Lvn;")
    public static class330 field9305 = new class330(24, 4);

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!kia", name = "E", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!kia", name = "y", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!kia", name = "B", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lvf;IIIIZ[BIZ)V", line = 3)
    public class649(class159 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9309 = arg3;
            this.field9310 = arg4;
            if (arg8) {
                byte[] var10 = new byte[arg6.length];
                for (int var11 = 0; var11 < arg4; ++var11) {
                    int var12 = arg3 * var11;
                    int var13 = (-var11 + arg4 - 1) * arg3;
                    for (int var14 = 0; arg3 > var14; ++var14) {
                        var10[var12++] = arg6[var13++];
                    }
                }
                arg6 = var10;
            }
            super.field3517.method1497(this, true);
            OpenGL.glPixelStorei(3317, 1);
            if (arg5 && super.field3507 != 34037) {
                class91.method887(arg2, arg1, arg4, arg7, 0, arg3, arg6);
                this.method1974(true, true);
            } else {
                OpenGL.glTexImage2Dub(super.field3507, 0, super.field3516, this.field9309, this.field9310, 0, arg7, 5121, arg6, 0);
                this.method1974(false, true);
            }
            OpenGL.glPixelStorei(3317, 4);
            this.method1967(-122, true);
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field9313[3] + (arg0 != null ? field9313[0] : field9313[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9313[0] : field9313[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIBIIII)V", line = 55)
    public final void method4730(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field9306;
            int var8 = -arg5 - arg3 + super.field3517.field2299;
            super.field3517.method1497(this, true);
            OpenGL.glCopyTexSubImage2D(super.field3507, 0, arg0, -arg3 + -arg4 + this.field9310, arg1, var8, arg6, arg3);
            OpenGL.glFlush();
            if (arg2 >= -16) {
                this.field9312 = -62;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9313[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II[BZIIIIII)V", line = 70)
    public final void method4731(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            ++field9304;
            if (~arg8 == -1) {
                arg8 = arg0;
            }
            if (arg3) {
                int var11 = class766.method5522(false, arg1);
                int var12 = arg0 * var11;
                int var13 = arg8 * var11;
                byte[] var14 = new byte[arg9 * var12];
                for (int var15 = 0; ~arg9 < ~var15; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (arg9 - (var15 - -1)) * var13 + arg6;
                    for (int var18 = 0; var12 > var18; ++var18) {
                        var14[var16++] = arg2[var17++];
                    }
                }
                arg2 = var14;
            }
            super.field3517.method1497(this, true);
            OpenGL.glPixelStorei(3317, 1);
            if (arg0 != arg8) {
                OpenGL.glPixelStorei(3314, arg8);
            }
            if (arg7 != -26658) {
                this.method4732(true, -78, true);
            }
            OpenGL.glTexSubImage2Dub(super.field3507, 0, arg5, arg4, arg0, arg9, arg1, 5121, arg2, arg6);
            if (~arg0 != ~arg8) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field9313[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9313[0] : field9313[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZIZ)V", line = 131)
    public final void method4732(boolean arg0, int arg1, boolean arg2) {
        try {
            if (arg1 <= 115) {
                this.method4730(-14, -123, (byte) 41, -32, 65, 120, 37);
            }
            if (~super.field3507 == -3554) {
                super.field3517.method1497(this, true);
                OpenGL.glTexParameteri(super.field3507, 10242, arg2 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field3507, 10243, arg0 ? 10497 : 33071);
            }
            ++field9311;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9313[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I[IIZIBIII)V", line = 151)
    public final void method4733(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        try {
            ++field9302;
            if (arg8 == 0) {
                arg8 = arg6;
            }
            if (arg5 <= -124) {
                if (arg3) {
                    int[] var10 = new int[arg4 * arg6];
                    for (int var11 = 0; var11 < arg4; ++var11) {
                        int var12 = arg6 * var11;
                        int var13 = (-var11 + -1 + arg4) * arg8 + arg0;
                        for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                            var10[var12++] = arg1[var13++];
                        }
                    }
                    arg1 = var10;
                }
                super.field3517.method1497(this, true);
                if (arg6 != arg8) {
                    OpenGL.glPixelStorei(3314, arg8);
                }
                OpenGL.glTexSubImage2Di(super.field3507, 0, arg2, this.field9310 - arg4 + -arg7, arg6, arg4, 32993, super.field3517.field2490, arg1, arg0);
                if (~arg6 != ~arg8) {
                    OpenGL.glPixelStorei(3314, 0);
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field9313[1] + arg0 + ',' + (arg1 != null ? field9313[0] : field9313[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIII)V", line = 203)
    public final void method4734(int arg0, int arg1, int arg2, int arg3) {
        try {
            OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field3507, super.field3515, arg3);
            ++field9303;
            this.field9307 = arg0;
            if (arg2 == -1) {
                this.field9312 = arg1;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9313[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lvf;IIIII)V", line = 222)
    public class649(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        try {
            this.field9310 = arg5;
            this.field9309 = arg4;
            int var7 = super.field3517.field2299 - (arg3 - -arg5);
            super.field3517.method1497(this, true);
            OpenGL.glCopyTexImage2D(super.field3507, 0, super.field3516, arg2, var7, arg4, arg5, 0);
            this.method1967(-128, true);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9313[3] + (arg0 != null ? field9313[0] : field9313[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lvf;IIIIZ[IIIZ)V", line = 240)
    public class649(class159 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9309 = arg3;
            this.field9310 = arg4;
            if (arg9) {
                int[] var11 = new int[arg6.length];
                for (int var12 = 0; arg4 > var12; ++var12) {
                    int var13 = arg3 * var12;
                    int var14 = (arg4 + -1 - var12) * arg3;
                    for (int var15 = 0; var15 < arg3; ++var15) {
                        var11[var13++] = arg6[var14++];
                    }
                }
                arg6 = var11;
            }
            super.field3517.method1497(this, true);
            if (super.field3507 != 34037 && arg5 && ~arg7 == -1 && arg8 == 0) {
                class78.method818(this.field9310, arg6, 32993, super.field3507, super.field3517.field2490, super.field3516, this.field9309, false);
                this.method1974(true, true);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Di(super.field3507, 0, super.field3516, this.field9309, this.field9310, 0, 32993, super.field3517.field2490, arg6, arg8 * 4);
                OpenGL.glPixelStorei(3314, 0);
                this.method1974(false, true);
            }
            this.method1967(80, true);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field9313[3] + (arg0 != null ? field9313[0] : field9313[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9313[0] : field9313[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lvf;IIIIZ[FI)V", line = 293)
    public class649(class159 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        try {
            this.field9309 = arg3;
            this.field9310 = arg4;
            super.field3517.method1497(this, true);
            if (arg5 && ~super.field3507 != -34038) {
                class782.method5614(arg2, arg4, arg7, arg3, 0, arg6, arg1);
                this.method1974(true, true);
            } else {
                OpenGL.glTexImage2Df(super.field3507, 0, super.field3516, this.field9309, this.field9310, 0, arg7, 5126, arg6, 0);
                this.method1974(false, true);
            }
            this.method1967(116, true);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field9313[3] + (arg0 != null ? field9313[0] : field9313[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9313[0] : field9313[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lvf;IIII)V", line = 327)
    public class649(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        try {
            this.field9309 = arg3;
            this.field9310 = arg4;
            super.field3517.method1497(this, true);
            OpenGL.glTexImage2Dub(super.field3507, 0, super.field3516, arg3, arg4, 0, class126.method1215(13522, super.field3516), 5121, (byte[]) null, 0);
            this.method1967(90, true);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9313[3] + (arg0 != null ? field9313[0] : field9313[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V", line = 315)
    public final void method86(int arg0) {
        try {
            ++field9301;
            OpenGL.glFramebufferTexture2DEXT(this.field9307, this.field9312, super.field3507, 0, arg0);
            this.field9312 = -1;
            this.field9307 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9313[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IZILjava/lang/String;I)V", line = 340)
    public static final void method4735(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
        try {
            class656.method4783(arg2, arg1, (String) null, 85, false, arg0, arg3);
            ++field9308;
            if (arg4 != 5121) {
                method4736(117);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9313[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9313[0] : field9313[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "(I)V", line = 355)
    public static void method4736(int arg0) {
        try {
            if (arg0 <= 5) {
                field9305 = null;
            }
            field9305 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9313[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4737(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4738(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
