import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class586 extends class337 {

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    private int field8568 = -1;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    private int field8565 = -1;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public int field8571;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field8567;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field8575 = 0;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "[I")
    public static int[] field8572 = new int[1000];

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "J")
    public static long field8574;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lvo;")
    public static class345 field8566;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
    public final void method3376(int arg0, int arg1, int arg2, int arg3) {
        ++field8570;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field4684, super.field4687, arg2);
        this.field8565 = arg3;
        this.field8568 = arg0;
        if (arg1 != 492) {
            method3380((byte) 46);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkfa;IIII)V")
    public class586(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field8571 = arg4;
        this.field8567 = arg3;
        super.field4696.method2295((byte) 17, this);
        OpenGL.glTexImage2Dub(super.field4684, 0, super.field4685, arg3, arg4, 0, class701.method3942(super.field4685, 15), 5121, (byte[]) null, 0);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZIII[I)V")
    public final void method3377(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8) {
        ++field8578;
        if (arg2 == 0) {
            arg2 = arg5;
        }
        int var10 = 10 / ((-63 - arg6) / 46);
        if (arg4) {
            int[] var11 = new int[arg0 * arg5];
            for (int var12 = 0; ~var12 > ~arg0; ++var12) {
                int var13 = arg5 * var12;
                int var14 = (-var12 + arg0 + -1) * arg2 + arg7;
                for (int var15 = 0; var15 < arg5; ++var15) {
                    var11[var13++] = arg8[var14++];
                }
            }
            arg8 = var11;
        }
        super.field4696.method2295((byte) -99, this);
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field4684, 0, arg1, arg3, arg5, arg0, 32993, super.field4696.field5509, arg8, arg7);
        if (~arg2 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public static void method3378(int arg0) {
        field8572 = null;
        if (arg0 != 0) {
            method3383(79, -82, (byte) -53, false, (String) null);
        }
        field8566 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkfa;IIIIZ[FI)V")
    public class586(class382 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8571 = arg4;
        this.field8567 = arg3;
        super.field4696.method2295((byte) -104, this);
        if (arg5 && super.field4684 != 34037) {
            class679.method3844(117, arg1, arg6, arg4, arg3, arg7, arg2);
            this.method2011(17868, true);
        } else {
            OpenGL.glTexImage2Df(super.field4684, 0, super.field4685, this.field8567, this.field8571, 0, arg7, 5126, arg6, 0);
            this.method2011(17868, false);
        }
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkfa;IIIIZ[IIIZ)V")
    public class586(class382 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8571 = arg4;
        this.field8567 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 + -1 - var12) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field4696.method2295((byte) -113, this);
        if (super.field4684 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class529.method3115(this.field8567, super.field4685, 32993, arg6, super.field4684, (byte) -92, this.field8571, super.field4696.field5509);
            this.method2011(17868, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field4684, 0, super.field4685, this.field8567, this.field8571, 0, 32993, super.field4696.field5509, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2011(17868, false);
        }
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BZZ)V")
    public final void method3379(byte arg0, boolean arg1, boolean arg2) {
        ++field8562;
        if (arg0 != 102) {
            method3380((byte) 106);
        }
        if (~super.field4684 == -3554) {
            super.field4696.method2295((byte) -124, this);
            OpenGL.glTexParameteri(super.field4684, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field4684, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
    public static final void method3380(byte arg0) {
        class324.field4519 = false;
        ++field8577;
        if (arg0 > -79) {
            method3378(-122);
        }
        class41.method336(0, class150.field2534, class69.field1093, class485.field6918, class273.field3904);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkfa;IIIII)V")
    public class586(class382 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field8567 = arg4;
        this.field8571 = arg5;
        int var7 = -arg5 - (arg3 - super.field4696.field5289);
        super.field4696.method2295((byte) 73, this);
        OpenGL.glCopyTexImage2D(super.field4684, 0, super.field4685, arg2, var7, arg4, arg5, 0);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBIIII)V")
    public final void method3381(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8564;
        int var8 = -arg3 - arg1 + super.field4696.field5289;
        if (arg2 != -117) {
            field8572 = null;
        }
        super.field4696.method2295((byte) 54, this);
        OpenGL.glCopyTexSubImage2D(super.field4684, 0, arg0, this.field8571 - (arg1 + arg4), arg5, var8, arg6, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Z")
    public static final boolean method3382(int arg0, byte arg1) {
        ++field8573;
        if (~arg0 != -5 && ~arg0 != -47 && ~arg0 != -22 && ~arg0 != -49 && arg0 != 2) {
            if (arg1 != 45) {
                return true;
            } else {
                return ~arg0 == -20 || arg0 == 1011;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBZLjava/lang/String;)V")
    public static final void method3383(int arg0, int arg1, byte arg2, boolean arg3, String arg4) {
        ++field8563;
        class49.method386(arg0, (String) null, arg4, arg3, -13808, false, arg1);
        if (arg2 != 30) {
            field8575 = -109;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ[BIIIIIII)V")
    public final void method3384(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg8 == -1) {
            arg8 = arg0;
        }
        ++field8569;
        if (arg1) {
            int var11 = class312.method1891(-68, arg9);
            int var12 = arg0 * var11;
            int var13 = arg8 * var11;
            byte[] var14 = new byte[arg7 * var12];
            for (int var15 = 0; arg7 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg7) * var13 - -arg6;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field4696.method2295((byte) -93, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Dub(super.field4684, arg3, arg4, arg5, arg0, arg7, arg9, 5121, arg2, arg6);
        if (arg0 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lkfa;IIIIZ[BIZ)V")
    public class586(class382 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field8571 = arg4;
        this.field8567 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field4696.method2295((byte) 53, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field4684 != 34037) {
            class332.method1974(arg2, arg1, arg3, arg7, arg4, arg6, false);
            this.method2011(17868, true);
        } else {
            OpenGL.glTexImage2Dub(super.field4684, 0, super.field4685, this.field8567, this.field8571, 0, arg7, 5121, arg6, 0);
            this.method2011(17868, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field8565, this.field8568, super.field4684, 0, 0);
        ++field8576;
        this.field8568 = -1;
        this.field8565 = -1;
        if (arg0 <= 49) {
            method3378(30);
        }
    }
}
