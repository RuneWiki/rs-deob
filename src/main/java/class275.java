import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class275 extends class367 {

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
    private int field3851 = -1;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    private int field3857 = -1;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!gaa", name = "I", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "[Z")
    public static boolean[] field3847 = new boolean[8];

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "Los;")
    public static class412 field3855 = new class412(6, 1);

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!gaa", name = "H", descriptor = "I")
    public static int field3858;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field3860;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
    public final void method1663(int arg0, int arg1, int arg2, int arg3) {
        ++field3846;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, super.field4968, super.field4961, arg2);
        this.field3857 = arg3;
        if (arg0 != -5427) {
            this.method773(-27);
        }
        this.field3851 = arg1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZB)V")
    public final void method1664(boolean arg0, boolean arg1, byte arg2) {
        ++field3849;
        if (super.field4968 == 3553) {
            super.field4971.method3630(this, arg2 ^ -20);
            OpenGL.glTexParameteri(super.field4968, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field4968, 10243, arg1 ? 10497 : 33071);
        }
        if (arg2 != 18) {
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public final void method773(int arg0) {
        ++field3852;
        OpenGL.glFramebufferTexture2DEXT(this.field3857, this.field3851, super.field4968, 0, 0);
        this.field3851 = -1;
        this.field3857 = arg0;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lno;IIIIZ[BIZ)V")
    public class275(class658 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3856 = arg4;
        this.field3859 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field4971.method3630(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field4968 != 34037) {
            class146.method1054(arg2, arg4, arg1, arg6, -5, arg7, arg3);
            this.method2161((byte) 117, true);
        } else {
            OpenGL.glTexImage2Dub(super.field4968, 0, super.field4966, this.field3859, this.field3856, 0, arg7, 5121, arg6, 0);
            this.method2161((byte) 117, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lno;IIIIZ[FI)V")
    public class275(class658 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3856 = arg4;
        this.field3859 = arg3;
        super.field4971.method3630(this, -2);
        if (arg5 && ~super.field4968 != -34038) {
            class705.method3894(arg2, -15189, arg4, arg7, arg6, arg3, arg1);
            this.method2161((byte) 117, true);
        } else {
            OpenGL.glTexImage2Df(super.field4968, 0, super.field4966, this.field3859, this.field3856, 0, arg7, 5126, arg6, 0);
            this.method2161((byte) 117, false);
        }
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lcea;I)V")
    public static final void method1665(class201 arg0, int arg1) {
        if (arg1 <= -68) {
            ++field3845;
            for (int var2 = 0; ~var2 > ~class220.field3113; ++var2) {
                int var3 = class24.field415[var2];
                class403 var4 = class572.field7601[var3];
                int var5 = arg0.method2034(255);
                if (~(var5 & 32) != -1) {
                    var5 += arg0.method2034(255) << 8;
                }
                if ((var5 & 32768) != 0) {
                    var5 += arg0.method2034(255) << 16;
                }
                class127.method977(var4, arg0, var5, 31136, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIIII)V")
    public final void method1666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3848;
        if (arg0 <= 30) {
            method1671((String) null, 98, false);
        }
        int var8 = -arg6 - (arg2 - super.field4971.field9051);
        super.field4971.method3630(this, -2);
        OpenGL.glCopyTexSubImage2D(super.field4968, 0, arg3, -arg2 + this.field3856 + -arg4, arg5, var8, arg1, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIIIIIIIZ)V")
    public final void method1667(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg3 == 0) {
            arg3 = arg7;
        }
        ++field3858;
        if (arg8) {
            int[] var10 = new int[arg4 * arg7];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (arg4 - var11 + -1) * arg3 + arg5;
                for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field4971.method3630(this, -2);
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Di(super.field4968, arg2, arg6, arg1, arg7, arg4, 32993, super.field4971.field9243, arg0, arg5);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static void method1668(byte arg0) {
        field3847 = null;
        if (arg0 != 107) {
            method1668((byte) -78);
        }
        field3855 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lno;IIII)V")
    public class275(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3856 = arg4;
        this.field3859 = arg3;
        super.field4971.method3630(this, -2);
        OpenGL.glTexImage2Dub(super.field4968, 0, super.field4966, arg3, arg4, 0, class501.method2783(true, super.field4966), 5121, (byte[]) null, 0);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1669(int arg0, String arg1) {
        if (arg0 != 0) {
            field3847 = null;
        }
        ++field3854;
        return class200.method1289(field3860 != null ? field3860 : (field3860 = method1672("tw")), arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lno;IIIII)V")
    public class275(class658 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3859 = arg4;
        this.field3856 = arg5;
        int var7 = -arg3 - arg5 + super.field4971.field9051;
        super.field4971.method3630(this, -2);
        OpenGL.glCopyTexImage2D(super.field4968, 0, super.field4966, arg2, var7, arg4, arg5, 0);
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lno;IIIIZ[IZ)V")
    public class275(class658 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3856 = arg4;
        this.field3859 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field4971.method3630(this, -2);
        if (arg5 && super.field4968 != 34037) {
            class698.method3862(32993, arg6, super.field4968, -19250, this.field3859, super.field4966, this.field3856, super.field4971.field9243);
            this.method2161((byte) 117, true);
        } else {
            OpenGL.glTexImage2Di(super.field4968, 0, super.field4966, this.field3859, this.field3856, 0, 32993, super.field4971.field9243, arg6, 0);
            this.method2161((byte) 117, false);
        }
        this.method2163(-30033, true);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIII[BIZI)V")
    public final void method1670(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8, int arg9) {
        if (arg1 == 0) {
            arg1 = arg5;
        }
        ++field3853;
        if (arg8) {
            int var11 = class73.method549(-6411, arg4);
            int var12 = arg5 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; ~var15 > ~arg7; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg7 + -1) * var13 - -arg2;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg6[var17++];
                }
            }
            arg6 = var14;
        }
        super.field4971.method3630(this, -2);
        if (arg0 == 12) {
            OpenGL.glPixelStorei(3317, 1);
            if (~arg1 != ~arg5) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Dub(super.field4968, 0, arg3, arg9, arg5, arg7, arg4, 5121, arg6, arg2);
            if (~arg1 != ~arg5) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1671(String arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1671((String) null, -7, true);
        }
        ++field3850;
        class382 var3 = class396.method2276(110, 2, arg1);
        var3.method2232(-12);
        var3.field5103 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1672(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
