import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class65 extends class169 {

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    private int field1031 = -1;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field1036 = -1;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lpu;")
    public static class179 field1037 = new class179(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field1032;
        int var2 = 18 / ((arg0 - -44) / 56);
        OpenGL.glFramebufferTexture2DEXT(this.field1036, this.field1031, super.field2564, 0, 0);
        this.field1036 = -1;
        this.field1031 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)V")
    public final void method436(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 53) {
            this.method441(-111, 71, -16, -19, (byte) 112, (int[]) null, -93, 62, true);
        }
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field2564, super.field2561, arg3);
        ++field1025;
        this.field1036 = arg2;
        this.field1031 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltt;IIIII)V")
    public class65(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1026 = arg4;
        this.field1027 = arg5;
        int var7 = -arg3 + super.field2559.field3786 - arg5;
        super.field2559.method1749(25752, this);
        OpenGL.glCopyTexImage2D(super.field2564, 0, super.field2566, arg2, var7, arg4, arg5, 0);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZBZ)V")
    public final void method437(boolean arg0, byte arg1, boolean arg2) {
        if (super.field2564 == 3553) {
            super.field2559.method1749(25752, this);
            OpenGL.glTexParameteri(super.field2564, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2564, 10243, !arg2 ? 33071 : 10497);
        }
        ++field1035;
        int var4 = 85 / ((-33 - arg1) / 61);
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static void method438(int arg0) {
        field1037 = null;
        if (arg0 != 0) {
            field1037 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltt;IIIIZ[FI)V")
    public class65(class249 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1027 = arg4;
        this.field1026 = arg3;
        super.field2559.method1749(25752, this);
        if (arg5 && ~super.field2564 != -34038) {
            class391.method2467(-128, arg7, arg6, arg4, arg2, arg3, arg1);
            this.method1206(true, (byte) 115);
        } else {
            OpenGL.glTexImage2Df(super.field2564, 0, super.field2566, this.field1026, this.field1027, 0, arg7, 5126, arg6, 0);
            this.method1206(false, (byte) 115);
        }
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        ++field1029;
        class103 var8 = new class103();
        var8.field1590 = arg6;
        var8.field1589 = arg1;
        var8.field1587 = arg2;
        if (arg4 != -7383) {
            method443((class66) null, 45, -68, (byte) -2, 0, 14);
        }
        var8.field1600 = arg7;
        var8.field1595 = arg0;
        var8.field1599 = arg5;
        var8.field1598 = class446.field6625 + arg3;
        class470.field6904.method1082(var8, 113);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1030;
        int var8 = super.field2559.field3786 - (arg3 - -arg6);
        super.field2559.method1749(25752, this);
        OpenGL.glCopyTexSubImage2D(super.field2564, arg1, arg0, -arg4 + -arg6 + this.field1027, arg5, var8, arg2, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIB[IIIZ)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7, boolean arg8) {
        ++field1034;
        if (arg1 == 0) {
            arg1 = arg3;
        }
        if (arg4 == -37) {
            if (arg8) {
                int[] var10 = new int[arg3 * arg7];
                for (int var11 = 0; ~arg7 < ~var11; ++var11) {
                    int var12 = arg3 * var11;
                    int var13 = (-var11 + -1 + arg7) * arg1 + arg6;
                    for (int var14 = 0; arg3 > var14; ++var14) {
                        var10[var12++] = arg5[var13++];
                    }
                }
                arg5 = var10;
            }
            super.field2559.method1749(arg4 + 25789, this);
            if (arg1 != arg3) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Di(super.field2564, 0, arg0, arg2, arg3, arg7, 32993, super.field2559.field4048, arg5, arg6);
            if (~arg1 != ~arg3) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltt;IIII)V")
    public class65(class249 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1027 = arg4;
        this.field1026 = arg3;
        super.field2559.method1749(25752, this);
        OpenGL.glTexImage2Dub(super.field2564, 0, super.field2566, arg3, arg4, 0, class26.method159(super.field2566, -9640), 5121, (byte[]) null, 0);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltt;IIIIZ[BIZ)V")
    public class65(class249 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1027 = arg4;
        this.field1026 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2559.method1749(25752, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2564 != -34038) {
            class530.method3131(arg6, arg4, arg3, (byte) 81, arg7, arg2, arg1);
            this.method1206(true, (byte) 115);
        } else {
            OpenGL.glTexImage2Dub(super.field2564, 0, super.field2566, this.field1026, this.field1027, 0, arg7, 5121, arg6, 0);
            this.method1206(false, (byte) 115);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltt;IIIIZ[IZ)V")
    public class65(class249 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1026 = arg3;
        this.field1027 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2559.method1749(25752, this);
        if (arg5 && super.field2564 != 34037) {
            class460.method2821(arg6, 71, this.field1027, super.field2559.field4048, this.field1026, super.field2564, super.field2566, 32993);
            this.method1206(true, (byte) 115);
        } else {
            OpenGL.glTexImage2Di(super.field2564, 0, super.field2566, this.field1026, this.field1027, 0, 32993, super.field2559.field4048, arg6, 0);
            this.method1206(false, (byte) 115);
        }
        this.method1210((byte) -81, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII[BIIZI)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field1028;
        if (arg9 == 3314) {
            if (~arg1 == -1) {
                arg1 = arg7;
            }
            if (arg8) {
                int var11 = class46.method309(arg6, (byte) -101);
                int var12 = arg7 * var11;
                int var13 = arg1 * var11;
                byte[] var14 = new byte[arg2 * var12];
                for (int var15 = 0; ~var15 > ~arg2; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (-var15 + arg2 + -1) * var13 + arg0;
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        var14[var16++] = arg5[var17++];
                    }
                }
                arg5 = var14;
            }
            super.field2559.method1749(arg9 ^ 26730, this);
            OpenGL.glPixelStorei(3317, 1);
            if (~arg1 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Dub(super.field2564, 0, arg4, arg3, arg7, arg2, arg6, 5121, arg5, arg0);
            if (~arg1 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lgt;IIBII)Ljava/awt/Frame;")
    public static final Frame method443(class66 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field1033;
        if (!arg0.method447(96)) {
            return null;
        } else {
            if (~arg1 == -1) {
                class138[] var6 = class343.method2207(false, arg0);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; ++var8) {
                    if (~var6[var8].field2085 == ~arg2 && var6[var8].field2086 == arg5 && (arg4 == 0 || ~var6[var8].field2084 == ~arg4) && (!var7 || ~arg1 > ~var6[var8].field2090)) {
                        var7 = true;
                        arg1 = var6[var8].field2090;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class329 var9 = arg0.method458(arg1, arg5, -113, arg2, arg4);
            while (var9.field4974 == 0) {
                class468.method2848(10L, (byte) -93);
            }
            Frame var10 = (Frame) var9.field4975;
            int var11 = -50 % ((arg3 - 12) / 53);
            if (var10 == null) {
                return null;
            } else if (~var9.field4974 == -3) {
                class234.method1587(arg0, 87, var10);
                return null;
            } else {
                return var10;
            }
        }
    }
}
