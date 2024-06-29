import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class133 extends class615 {

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    private int field1741 = -1;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    private int field1745 = -1;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "J")
    public static long field1731 = 0L;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "F")
    public static float field1739 = 1024.0F;

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!pm", name = "C", descriptor = "F")
    public static float field1736;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "F")
    public static float field1744;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Lla;")
    public static class413 field1729;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILes;)Laea;", line = 3)
    public static final class39 method766(int arg0, class630 arg1) {
        ++field1742;
        if (arg0 != 0) {
            field1739 = -1.0086068F;
        }
        class529 var2 = class16.method113(arg1, 78);
        int var3 = arg1.method3510(86);
        return new class39(var2.field1625, var2.field1622, var2.field1623, var2.field1616, var2.field1621, var2.field1617, var2.field1619, var2.field1614, var2.field1618, var2.field7157, var2.field7159, var2.field7153, var2.field7150, var2.field7154, var2.field7162, var3);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method767(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class314.field4052 = arg0;
        if (arg4 != 0) {
            method773(-125);
        }
        class289.field3595 = arg2;
        class159.field2063 = arg3;
        ++field1738;
        class263.field3294 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZIII[BI)V", line = 36)
    public final void method768(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        ++field1727;
        if (~arg0 == -1) {
            arg0 = arg9;
        }
        if (arg4) {
            int var11 = class358.method1973(arg1, (byte) -56);
            int var12 = arg9 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; arg5 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 - 1 + arg5) * var13 - -arg2;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field8644.method2960(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg9) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field8638, 0, arg7, arg3, arg9, arg5, arg1, 5121, arg8, arg2);
        if (arg6 != 3314) {
            this.method768(-126, -49, -49, -57, true, 21, -104, -68, (byte[]) null, -103);
        }
        if (~arg0 != ~arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBIIIII)V", line = 97)
    public final void method769(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == 40) {
            ++field1743;
            int var8 = -arg6 - arg2 + super.field8644.field7320;
            super.field8644.method2960(this, -2);
            OpenGL.glCopyTexSubImage2D(super.field8638, 0, arg0, -arg4 + -arg6 + this.field1740, arg3, var8, arg5, arg6);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 117)
    public final void method216(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field1745, this.field1741, super.field8638, 0, 0);
        ++field1733;
        this.field1741 = -1;
        this.field1745 = -1;
        if (arg0 != 29468) {
            field1744 = -0.5307147F;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lqj;IIIIZ[BIZ)V", line = 130)
    public class133(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1740 = arg4;
        this.field1728 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field8644.method2960(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field8638 != 34037) {
            class374.method2035(arg1, arg3, arg7, arg6, true, arg4, arg2);
            this.method3395(true, 3);
        } else {
            OpenGL.glTexImage2Dub(super.field8638, 0, super.field8640, this.field1728, this.field1740, 0, arg7, 5121, arg6, 0);
            this.method3395(false, 3);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lqj;IIII)V", line = 184)
    public class133(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1728 = arg3;
        this.field1740 = arg4;
        super.field8644.method2960(this, -2);
        OpenGL.glTexImage2Dub(super.field8638, 0, super.field8640, arg3, arg4, 0, class568.method3141(super.field8640, (byte) 29), 5121, (byte[]) null, 0);
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lqj;IIIIZ[IZ)V", line = 199)
    public class133(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1740 = arg4;
        this.field1728 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~var10 > ~arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - 1 + -var10) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field8644.method2960(this, -2);
        if (arg5 && super.field8638 != 34037) {
            class595.method3275(super.field8638, super.field8640, this.field1728, 160, this.field1740, 32993, arg6, super.field8644.field7622);
            this.method3395(true, 3);
        } else {
            OpenGL.glTexImage2Di(super.field8638, 0, super.field8640, this.field1728, this.field1740, 0, 32993, super.field8644.field7622, arg6, 0);
            this.method3395(false, 3);
        }
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZII[II)V", line = 249)
    public final void method770(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8) {
        if (~arg6 == -1) {
            arg6 = arg3;
        }
        ++field1734;
        if (arg0 > 86) {
            if (arg4) {
                int[] var10 = new int[arg3 * arg5];
                for (int var11 = 0; var11 < arg5; ++var11) {
                    int var12 = arg3 * var11;
                    int var13 = (-var11 + -1 + arg5) * arg6 + arg8;
                    for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                        var10[var12++] = arg7[var13++];
                    }
                }
                arg7 = var10;
            }
            super.field8644.method2960(this, -2);
            if (arg3 != arg6) {
                OpenGL.glPixelStorei(3314, arg6);
            }
            OpenGL.glTexSubImage2Di(super.field8638, 0, arg2, arg1, arg3, arg5, 32993, super.field8644.field7622, arg7, arg8);
            if (~arg3 != ~arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lqj;IIIIZ[FI)V", line = 319)
    public class133(class548 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1740 = arg4;
        this.field1728 = arg3;
        super.field8644.method2960(this, -2);
        if (arg5 && super.field8638 != 34037) {
            class307.method1778(arg4, arg6, arg3, arg7, arg2, arg1, (byte) -65);
            this.method3395(true, 3);
        } else {
            OpenGL.glTexImage2Df(super.field8638, 0, super.field8640, this.field1728, this.field1740, 0, arg7, 5126, arg6, 0);
            this.method3395(false, 3);
        }
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lqj;IIIII)V", line = 341)
    public class133(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1728 = arg4;
        this.field1740 = arg5;
        int var7 = super.field8644.field7320 - arg3 - arg5;
        super.field8644.method2960(this, -2);
        OpenGL.glCopyTexImage2D(super.field8638, 0, super.field8640, arg2, var7, arg4, arg5, 0);
        this.method3396(true, 17137);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V", line = 309)
    public static void method771(byte arg0) {
        field1729 = null;
        if (arg0 > -82) {
            method767(-54, -9, -73, -3, -107);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIB)V", line = 360)
    public final void method772(int arg0, int arg1, int arg2, byte arg3) {
        ++field1737;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg2, super.field8638, super.field8646, arg0);
        this.field1745 = arg1;
        if (arg3 > 67) {
            this.field1741 = arg2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Ljava/lang/String;", line = 379)
    public static final String method773(int arg0) {
        if (arg0 != -9316) {
            return null;
        } else {
            ++field1732;
            String var1 = "www";
            if (class591.field8310 != class193.field2404) {
                if (class591.field8310 == class468.field5946) {
                    var1 = "www-wtqa";
                } else if (class591.field8310 == class557.field7737) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtrc";
            }
            String var2 = "";
            if (class92.field1288 != null) {
                var2 = "/p=" + class92.field1288;
            }
            return "http://" + var1 + "." + class98.field1337.field1468 + ".com/l=" + class250.field3068 + "/a=" + class322.field4130 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZBZ)V", line = 409)
    public final void method774(boolean arg0, byte arg1, boolean arg2) {
        if (super.field8638 == 3553) {
            super.field8644.method2960(this, -2);
            OpenGL.glTexParameteri(super.field8638, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field8638, 10243, arg0 ? 10497 : 33071);
        }
        if (arg1 < -6) {
            ++field1730;
        }
    }
}
