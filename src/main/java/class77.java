import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class77 extends class651 implements class166 {

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    private int field1039;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "[J")
    public static long[] field1030 = new long[256];

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Lcb;")
    public static class544 field1029;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field1030[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FIIII[FIFII[FI)V", line = 3)
    public static final void method595(float arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10, int arg11) {
        int var12 = arg2 - arg4;
        int var13 = arg6 - arg9;
        ++field1041;
        int var14 = arg3 - arg11;
        float var15 = arg5[2] * (float) var14 + arg5[arg8] * (float) var13 + arg5[1] * (float) var12;
        float var16 = arg5[5] * (float) var14 + arg5[4] * (float) var12 + arg5[3] * (float) var13;
        float var17 = arg5[8] * (float) var14 + arg5[7] * (float) var12 + arg5[6] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var18 = arg0 * var18;
        }
        float var19 = var16 + 0.5F + arg7;
        if (arg1 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (~arg1 == -3) {
            var19 = -var19;
            var18 = -var18;
        } else if (~arg1 == -4) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg10[0] = var18;
        arg10[1] = var19;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Log;Lofa;Lkn;II)V", line = 52)
    public class77(class673 arg0, class345 arg1, class770 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field1039 = arg3;
        this.field1032 = arg4;
        super.field9169.method1104(true, this);
        OpenGL.glTexImage2Dub(super.field9160, 0, this.method3733(58), arg3, arg4, 0, class379.method2342(super.field9176, 6410), class728.method4086(super.field9179, true), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)Z", line = 65)
    public final boolean method40(int arg0) {
        ++field1028;
        return arg0 != 27610 ? true : true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIILofa;[BIZI)V", line = 78)
    public final void method43(int arg0, int arg1, int arg2, int arg3, class345 arg4, byte[] arg5, int arg6, boolean arg7, int arg8) {
        super.field9169.method1104(true, this);
        if (!arg7) {
            ++field1027;
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg2);
            OpenGL.glTexSubImage2Dub(super.field9160, 0, arg8, arg0, arg6, arg3, class379.method2342(arg4, 6410), 5121, arg5, arg1);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Log;Lofa;IIZ[BII)V", line = 95)
    public class77(class673 arg0, class345 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class770.field10614, arg2 * arg3, arg4);
        this.field1039 = arg2;
        this.field1032 = arg3;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3731(arg3, 0, super.field9160, arg5, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9160, 0, this.method3733(-126), arg2, arg3, 0, class379.method2342(super.field9176, 6410), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IF)F", line = 121)
    public final float method36(int arg0, float arg1) {
        int var3 = -23 % ((arg0 - 65) / 61);
        ++field1037;
        return arg1 / (float) this.field1032;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I", line = 133)
    public final int method38(int arg0) {
        int var2 = 127 / ((arg0 - 45) / 51);
        ++field1040;
        return this.field1032;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Log;IIZ[III)V", line = 146)
    public class77(class673 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class12.field247, class770.field10614, arg1 * arg2, arg3);
        this.field1039 = arg1;
        this.field1032 = arg2;
        super.field9169.method1104(true, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method3727(false, arg1, arg4, arg2, super.field9160);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9160, 0, 6408, this.field1039, this.field1032, 0, 32993, super.field9169.field9539, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[FILofa;IIIII)V", line = 166)
    public final void method596(int arg0, float[] arg1, int arg2, class345 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1031;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Df(super.field9160, 0, arg6, arg4, arg8, arg0, class379.method2342(arg3, arg5 + 6410), 5121, arg1, arg7);
        OpenGL.glPixelStorei(3314, arg5);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([IZIIIII)V", line = 177)
    public final void method37(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1036;
        int[] var8 = new int[this.field1039 * this.field1032];
        super.field9169.method1104(arg1, this);
        OpenGL.glGetTexImagei(super.field9160, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; arg5 > var9; ++var9) {
            class42.method289(var8, (arg5 - 1 + arg4 + -var9) * this.field1039, arg0, arg3 * var9 + arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZBZ)V", line = 198)
    public final void method42(boolean arg0, byte arg1, boolean arg2) {
        super.field9169.method1104(true, this);
        if (arg1 >= -111) {
            this.method43(59, 94, 92, 89, (class345) null, (byte[]) null, -68, false, 53);
        }
        ++field1035;
        OpenGL.glTexParameteri(super.field9160, 10242, arg2 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field9160, 10243, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I", line = 212)
    public final int method34(byte arg0) {
        if (arg0 != -109) {
            return 57;
        } else {
            ++field1034;
            return this.field1039;
        }
    }

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "(I)V", line = 224)
    public static void method597(int arg0) {
        field1030 = null;
        field1029 = null;
        if (arg0 != 8) {
            method597(-122);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Log;Lofa;IIZ[FII)V", line = 236)
    public class77(class673 arg0, class345 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class770.field10618, arg2 * arg3, arg4);
        this.field1039 = arg2;
        this.field1032 = arg3;
        super.field9169.method1104(true, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method3729(arg5, arg2, -67, super.field9160, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9160, 0, this.method3733(-111), arg2, arg3, 0, class379.method2342(super.field9176, 6410), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIZI[I)V", line = 256)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        super.field9169.method1104(true, this);
        ++field1033;
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field9160, 0, arg3, arg6, arg1, arg4, 32993, super.field9169.field9539, arg7, arg0);
        if (arg5) {
            this.field1039 = -8;
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F", line = 271)
    public final float method39(int arg0, float arg1) {
        ++field1038;
        if (arg0 != 2170) {
            field1030 = null;
        }
        return arg1 / (float) this.field1039;
    }
}
