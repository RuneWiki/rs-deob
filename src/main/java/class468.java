import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class468 extends class228 {

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field6582 = -1;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    private int field6588 = -1;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public int field6587;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lte;IIIIZ[BIZ)V", line = 75)
    public class468(class527 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6587 = arg3;
        this.field6589 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - var11 + -1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field3325.method3152(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field3333 != 34037) {
            class470.method2840(arg6, arg7, arg4, arg3, arg2, arg1, (byte) -43);
            this.method1467((byte) 97, true);
        } else {
            OpenGL.glTexImage2Dub(super.field3333, 0, super.field3319, this.field6587, this.field6589, 0, arg7, 5121, arg6, 0);
            this.method1467((byte) 97, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lte;IIIII)V", line = 201)
    public class468(class527 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6589 = arg5;
        this.field6587 = arg4;
        int var7 = super.field3325.field7563 - (arg3 + arg5);
        super.field3325.method3152(-2, this);
        OpenGL.glCopyTexImage2D(super.field3333, 0, super.field3319, arg2, var7, arg4, arg5, 0);
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lte;IIII)V", line = 272)
    public class468(class527 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6589 = arg4;
        this.field6587 = arg3;
        super.field3325.method3152(-2, this);
        OpenGL.glTexImage2Dub(super.field3333, 0, super.field3319, arg3, arg4, 0, class372.method2220(119, super.field3319), 5121, (byte[]) null, 0);
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lte;IIIIZ[IZ)V", line = 305)
    public class468(class527 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6587 = arg3;
        this.field6589 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 - var10) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field3325.method3152(-2, this);
        if (arg5 && super.field3333 != 34037) {
            class195.method1317(this.field6587, super.field3325.field7869, -4090, super.field3319, this.field6589, arg6, 32993, super.field3333);
            this.method1467((byte) 97, true);
        } else {
            OpenGL.glTexImage2Di(super.field3333, 0, super.field3319, this.field6587, this.field6589, 0, 32993, super.field3325.field7869, arg6, 0);
            this.method1467((byte) 97, false);
        }
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lte;IIIIZ[FI)V", line = 356)
    public class468(class527 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6587 = arg3;
        this.field6589 = arg4;
        super.field3325.method3152(-2, this);
        if (arg5 && super.field3333 != 34037) {
            class18.method116(arg1, arg7, (byte) 14, arg3, arg2, arg6, arg4);
            this.method1467((byte) 97, true);
        } else {
            OpenGL.glTexImage2Df(super.field3333, 0, super.field3319, this.field6587, this.field6589, 0, arg7, 5126, arg6, 0);
            this.method1467((byte) 97, false);
        }
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IZIIIIIII)V", line = 10)
    public final void method2819(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 6789) {
            this.field6589 = -44;
        }
        if (arg7 == 0) {
            arg7 = arg8;
        }
        ++field6584;
        if (arg1) {
            int[] var10 = new int[arg5 * arg8];
            for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                int var12 = arg8 * var11;
                int var13 = (-var11 + arg5 + -1) * arg7 + arg3;
                for (int var14 = 0; arg8 > var14; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field3325.method3152(arg2 ^ -6789, this);
        if (~arg7 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field3333, 0, arg4, arg6, arg8, arg5, 32993, super.field3325.field7869, arg0, arg3);
        if (arg7 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V", line = 63)
    public final void method2820(int arg0, int arg1, int arg2, int arg3) {
        ++field6590;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field3333, super.field3322, arg1);
        int var5 = -65 / ((arg0 - -26) / 56);
        this.field6588 = arg3;
        this.field6582 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 128)
    public final void method642(int arg0) {
        ++field6591;
        OpenGL.glFramebufferTexture2DEXT(this.field6588, this.field6582, super.field3333, 0, 0);
        this.field6582 = -1;
        this.field6588 = -1;
        if (arg0 > -80) {
            this.field6587 = 15;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIZII[BI)V", line = 141)
    public final void method2821(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        ++field6592;
        if (arg4 == 0) {
            arg4 = arg1;
        }
        if (arg5) {
            int var11 = class488.method2926(-6410, arg9);
            int var12 = arg1 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; ~var15 > ~arg0; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg0 + -1 + -var15) * var13 + arg6;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field3325.method3152(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field3333, 0, arg7, arg3, arg1, arg0, arg9, 5121, arg8, arg6);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg2 != 10242) {
            this.method2819((int[]) null, false, -110, 57, -65, 85, 30, -50, 108);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIII)V", line = 216)
    public static final void method2822(int arg0, int arg1, int arg2, int arg3) {
        ++field6586;
        int var4 = class56.field668.field6850 * arg0 >> 8;
        if (arg3 != 24277) {
            method2822(36, -89, -59, 10);
        }
        if (var4 != 0 && ~arg1 != 0) {
            class604.method3561(arg1, -229575572, false, 0, var4, class634.field9289);
            class568.field8385 = true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 237)
    public static final void method2823(int arg0) {
        class588.field8727 = 0;
        ++field6594;
        class428.field5755 = -1;
        class349.field4776 = -1;
        int var1 = 88 % ((arg0 - -45) / 60);
        class618.field9137 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZZ)V", line = 251)
    public final void method2824(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 > -65) {
            this.field6587 = -102;
        }
        if (~super.field3333 == -3554) {
            super.field3325.method3152(-2, this);
            OpenGL.glTexParameteri(super.field3333, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field3333, 10243, !arg1 ? 33071 : 10497);
        }
        ++field6583;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V", line = 285)
    public final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 > -87) {
            this.method642(-15);
        }
        ++field6585;
        int var8 = -arg3 - arg4 + super.field3325.field7563;
        super.field3325.method3152(-2, this);
        OpenGL.glCopyTexSubImage2D(super.field3333, 0, arg0, -arg1 - (arg4 - this.field6589), arg2, var8, arg6, arg4);
        OpenGL.glFlush();
    }
}
