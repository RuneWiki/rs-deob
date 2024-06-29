import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class164 extends class136 {

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
    private int field2353 = -1;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    private int field2354 = -1;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "Lem;")
    public static class206 field2355 = new class206(51, 3);

    @OriginalMember(owner = "client!cw", name = "H", descriptor = "Lfc;")
    public static class235 field2358 = new class235("LIVE", 0);

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "[I")
    public static int[] field2362 = new int[1];

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!cw", name = "F", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "Lf;")
    public static class702 field2361;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIZIIIIB[BI)V", line = 4)
    public final void method1146(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, byte[] arg8, int arg9) {
        ++field2349;
        if (~arg4 == -1) {
            arg4 = arg6;
        }
        if (arg2) {
            int var11 = class363.method2070(120, arg0);
            int var12 = arg6 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; arg9 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg9 + -1 - var15) * var13 - -arg5;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field1927.method3206(this, (byte) 26);
        if (arg7 > 105) {
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 != arg6) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            OpenGL.glTexSubImage2Dub(super.field1925, 0, arg1, arg3, arg6, arg9, arg0, 5121, arg8, arg5);
            if (arg4 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 67)
    public final void method240(byte arg0) {
        if (arg0 != -8) {
            field2355 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(this.field2353, this.field2354, super.field1925, 0, 0);
        ++field2352;
        this.field2354 = -1;
        this.field2353 = -1;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIIIZ[BIZ)V", line = 80)
    public class164(class565 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2350 = arg4;
        this.field2346 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field1925 != 34037) {
            class254.method1555(arg4, arg6, arg2, -28473, arg1, arg3, arg7);
            this.method951(125, true);
        } else {
            OpenGL.glTexImage2Dub(super.field1925, 0, super.field1930, this.field2346, this.field2350, 0, arg7, 5121, arg6, 0);
            this.method951(124, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(I)V", line = 134)
    public static void method1147(int arg0) {
        field2362 = null;
        field2358 = null;
        if (arg0 != -1) {
            method1147(19);
        }
        field2355 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2351;
        if (arg5 > -75) {
            this.field2346 = 42;
        }
        int var8 = super.field1927.field7789 - arg1 - arg4;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glCopyTexSubImage2D(super.field1925, 0, arg6, -arg3 - (arg1 - this.field2350), arg2, var8, arg0, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)V", line = 165)
    public final void method1149(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3317) {
            field2355 = null;
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field1925, super.field1915, arg3);
        ++field2357;
        this.field2353 = arg0;
        this.field2354 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIIIZ[FI)V", line = 180)
    public class164(class565 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2350 = arg4;
        this.field2346 = arg3;
        super.field1927.method3206(this, (byte) 26);
        if (arg5 && ~super.field1925 != -34038) {
            class655.method3691(-128, arg6, arg4, arg3, arg1, arg2, arg7);
            this.method951(126, true);
        } else {
            OpenGL.glTexImage2Df(super.field1925, 0, super.field1930, this.field2346, this.field2350, 0, arg7, 5126, arg6, 0);
            this.method951(121, false);
        }
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIIII)V", line = 202)
    public class164(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2346 = arg4;
        this.field2350 = arg5;
        int var7 = -arg5 - arg3 + super.field1927.field7789;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glCopyTexImage2D(super.field1925, 0, super.field1930, arg2, var7, arg4, arg5, 0);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIII)V", line = 218)
    public class164(class565 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2350 = arg4;
        this.field2346 = arg3;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glTexImage2Dub(super.field1925, 0, super.field1930, arg3, arg4, 0, class589.method3346(super.field1930, (byte) -99), 5121, (byte[]) null, 0);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIZ[IIIII)V", line = 232)
    public final void method1150(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 == 0) {
            arg1 = arg6;
        }
        ++field2347;
        if (arg3) {
            int[] var10 = new int[arg0 * arg6];
            for (int var11 = 0; ~var11 > ~arg0; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (arg0 + -1 + -var11) * arg1 + arg2;
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field1927.method3206(this, (byte) 26);
        if (arg1 != arg6) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        if (arg5 != 3314) {
            this.method1150(109, -124, 3, true, (int[]) null, -48, -50, -38, 4);
        }
        OpenGL.glTexSubImage2Di(super.field1925, 0, arg7, arg8, arg6, arg0, 32993, super.field1927.field7942, arg4, arg2);
        if (arg1 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIIIZ[IIIZ)V", line = 292)
    public class164(class565 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2350 = arg4;
        this.field2346 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 + -1 - var12) * arg3;
                for (int var15 = 0; arg3 > var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field1927.method3206(this, (byte) 26);
        if (~super.field1925 != -34038 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
            class86.method643(arg6, 32993, 81, super.field1930, this.field2346, super.field1927.field7942, this.field2350, super.field1925);
            this.method951(127, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field1925, 0, super.field1930, this.field2346, this.field2350, 0, 32993, super.field1927.field7942, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method951(120, false);
        }
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIZ)V", line = 347)
    public final void method1151(boolean arg0, int arg1, boolean arg2) {
        if (super.field1925 == 3553) {
            super.field1927.method3206(this, (byte) 26);
            OpenGL.glTexParameteri(super.field1925, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field1925, 10243, !arg0 ? 33071 : 10497);
        }
        ++field2348;
        if (arg1 < 30) {
            field2345 = 75;
        }
    }
}
