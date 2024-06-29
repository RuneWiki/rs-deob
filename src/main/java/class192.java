import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class192 extends class87 {

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    private int field2750 = -1;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private int field2752 = -1;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "F")
    public static float field2757;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method1344(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg0, super.field1567, super.field1568, arg1);
        ++field2759;
        if (arg2 == -31812) {
            this.field2752 = arg0;
            this.field2750 = arg3;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIZIIII[BI)V", line = 16)
    public final void method1345(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        ++field2748;
        if (arg3) {
            int var11 = class209.method1468(-6411, arg6);
            int var12 = arg4 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; ~arg9 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg9 - 1) * var13 - -arg5;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field1571.method3425(this, arg2 + 82);
        OpenGL.glPixelStorei(3317, 1);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field1567, arg2, arg0, arg7, arg4, arg9, arg6, 5121, arg8, arg5);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BZZ)V", line = 73)
    public final void method1346(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 > -57) {
            this.method1347(-79, (byte) -55, -16, 14, false, 73, -65, 45, (int[]) null);
        }
        ++field2751;
        if (~super.field1567 == -3554) {
            super.field1571.method3425(this, 100);
            OpenGL.glTexParameteri(super.field1567, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field1567, 10243, !arg2 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBIIZIII[I)V", line = 95)
    public final void method1347(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8) {
        ++field2755;
        if (arg6 == 0) {
            arg6 = arg3;
        }
        if (arg4) {
            int[] var10 = new int[arg3 * arg5];
            for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg5 + -1) * arg6 + arg2;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg8[var13++];
                }
            }
            arg8 = var10;
        }
        super.field1571.method3425(this, 107);
        if (arg3 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(super.field1567, 0, arg7, arg0, arg3, arg5, 32993, super.field1571.field8651, arg8, arg2);
        if (~arg3 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg1 != -70) {
            field2757 = -0.6999948F;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 147)
    public static final void method1348(int arg0, int arg1, int arg2) {
        class343.method2174((byte) 127, arg1, arg2);
        ++field2758;
        if (arg0 != 32993) {
            field2757 = -0.1593821F;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Loea;IIIII)V", line = 190)
    public class192(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2753 = arg5;
        this.field2756 = arg4;
        int var7 = -arg3 + -arg5 + super.field1571.field8520;
        super.field1571.method3425(this, -89);
        OpenGL.glCopyTexImage2D(super.field1567, 0, super.field1562, arg2, var7, arg4, arg5, 0);
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Loea;IIII)V", line = 207)
    public class192(class594 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2753 = arg4;
        this.field2756 = arg3;
        super.field1571.method3425(this, -36);
        OpenGL.glTexImage2Dub(super.field1567, 0, super.field1562, arg3, arg4, 0, class634.method3649(super.field1562, (byte) -68), 5121, (byte[]) null, 0);
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Loea;IIIIZ[IIIZ)V", line = 221)
    public class192(class594 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2753 = arg4;
        this.field2756 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 + -1 + -var12) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field1571.method3425(this, 70);
        if (super.field1567 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class77.method773(-118, this.field2753, super.field1571.field8651, arg6, super.field1567, this.field2756, 32993, super.field1562);
            this.method823(9728, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field1567, 0, super.field1562, this.field2756, this.field2753, 0, 32993, super.field1571.field8651, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method823(9728, false);
        }
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Loea;IIIIZ[BIZ)V", line = 275)
    public class192(class594 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2756 = arg3;
        this.field2753 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1571.method3425(this, -32);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field1567 != -34038) {
            class289.method1871(-2130771968, arg7, arg2, arg4, arg3, arg1, arg6);
            this.method823(9728, true);
        } else {
            OpenGL.glTexImage2Dub(super.field1567, 0, super.field1562, this.field2756, this.field2753, 0, arg7, 5121, arg6, 0);
            this.method823(9728, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Loea;IIIIZ[FI)V", line = 328)
    public class192(class594 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2753 = arg4;
        this.field2756 = arg3;
        super.field1571.method3425(this, 121);
        if (arg5 && super.field1567 != 34037) {
            class148.method1143(arg6, arg4, arg3, -50, arg2, arg1, arg7);
            this.method823(9728, true);
        } else {
            OpenGL.glTexImage2Df(super.field1567, 0, super.field1562, this.field2756, this.field2753, 0, arg7, 5126, arg6, 0);
            this.method823(9728, false);
        }
        this.method818(true, (byte) 11);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 161)
    public final void method827(int arg0) {
        ++field2749;
        OpenGL.glFramebufferTexture2DEXT(this.field2750, this.field2752, super.field1567, 0, arg0);
        this.field2752 = -1;
        this.field2750 = -1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)V", line = 171)
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2754;
        int var8 = super.field1571.field8520 - arg5 - arg1;
        if (arg6 != 3314) {
            this.field2756 = -117;
        }
        super.field1571.method3425(this, 75);
        OpenGL.glCopyTexSubImage2D(super.field1567, 0, arg2, -arg3 + -arg5 + this.field2753, arg4, var8, arg0, arg5);
        OpenGL.glFlush();
    }
}
