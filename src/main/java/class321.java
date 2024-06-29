import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class321 extends class394 implements class175 {

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Lhga;")
    public static class186 field3976 = new class186(0, 0);

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!vt", name = "E", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "[I")
    public static int[] field3985;

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lnv;IIZ[III)V")
    public class321(class439 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class141.field1759, class748.field10384, arg1 * arg2, arg3);
        this.field3983 = arg2;
        this.field3977 = arg1;
        super.field5105.method2643(-2, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method2317(super.field5112, arg2, arg4, -22784, arg1);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field5112, 0, 6408, this.field3977, this.field3983, 0, 32993, super.field5105.field5891, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[BILpe;II)V")
    public final void method1195(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, class636 arg6, int arg7, int arg8) {
        super.field5105.method2643(-2, this);
        ++field3988;
        if (arg2 != -6201) {
            this.method1194(-78, 99, -62, 51, (int[]) null, -40, (byte) -119, 87);
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Dub(super.field5112, 0, arg1, arg0, arg7, arg8, class563.method3265((byte) -126, arg6), 5121, arg4, arg3);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lnv;Lpe;IIZ[FII)V")
    public class321(class439 arg0, class636 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class748.field10388, arg2 * arg3, arg4);
        this.field3977 = arg2;
        this.field3983 = arg3;
        super.field5105.method2643(-2, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method2309(1477883553, super.field5112, arg2, arg3, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field5112, 0, this.method2311(-588507160), arg2, arg3, 0, class563.method3265((byte) -126, super.field5099), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BF)F")
    public final float method1200(byte arg0, float arg1) {
        ++field3987;
        int var3 = -81 % ((arg0 - -52) / 53);
        return arg1 / (float) this.field3983;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
    public final int method1199(int arg0) {
        ++field3972;
        int var2 = 3 % ((arg0 - 16) / 45);
        return this.field3977;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lkg;I)V")
    public static final void method1916(class287 arg0, int arg1) {
        ++field3975;
        boolean var2 = false;
        if (class228.field2707 != arg0.field3428 && arg0.field3420 != -1 && arg0.field3359 == 0) {
            class582 var3 = class362.field4504.method3600(-102, arg0.field3420);
            if (var3.field7932 || ~(arg0.field3368 + 1) < ~var3.field7936[arg0.field3392]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg0.field3375 + arg0.field3428;
            int var5 = -arg0.field3375 + class228.field2707;
            int var6 = arg0.field3383 * 512 - -(arg0.method1665(1720746760) * 256);
            int var7 = arg0.field3401 * 512 - -(256 * arg0.method1665(1720746760));
            int var8 = arg0.field3357 * 512 + arg0.method1665(1720746760) * 256;
            int var9 = arg0.field3398 * 512 - -(256 * arg0.method1665(1720746760));
            arg0.field823 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg0.field813 = ((-var5 + var4) * var7 + var5 * var9) / var4;
        }
        arg0.field3457 = 0;
        if (arg1 == 512) {
            if (~arg0.field3418 == -1) {
                arg0.method1677(8192, false, 116);
            }
            if (arg0.field3418 == 1) {
                arg0.method1677(12288, false, 117);
            }
            if (~arg0.field3418 == -3) {
                arg0.method1677(0, false, 93);
            }
            if (~arg0.field3418 == -4) {
                arg0.method1677(4096, false, arg1 + -427);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZZB)V")
    public final void method1198(boolean arg0, boolean arg1, byte arg2) {
        ++field3986;
        super.field5105.method2643(-2, this);
        int var4 = 87 % ((arg2 - -68) / 55);
        OpenGL.glTexParameteri(super.field5112, 10242, arg0 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field5112, 10243, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lnv;Lpe;IIZ[BII)V")
    public class321(class439 arg0, class636 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class748.field10384, arg2 * arg3, arg4);
        this.field3977 = arg2;
        this.field3983 = arg3;
        super.field5105.method2643(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method2313(arg2, arg3, super.field5112, (byte) -122, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field5112, 0, this.method2311(-588507160), arg2, arg3, 0, class563.method3265((byte) -126, super.field5099), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lnv;Lpe;Ldw;II)V")
    public class321(class439 arg0, class636 arg1, class748 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3983 = arg4;
        this.field3977 = arg3;
        super.field5105.method2643(-2, this);
        OpenGL.glTexImage2Dub(super.field5112, 0, this.method2311(-588507160), arg3, arg4, 0, class563.method3265((byte) -126, super.field5099), class468.method2809(super.field5118, 5120), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[IBI)V")
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6) {
        ++field3978;
        int[] var8 = new int[this.field3983 * this.field3977];
        super.field5105.method2643(-2, this);
        OpenGL.glGetTexImagei(super.field5112, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~arg6 < ~var9; ++var9) {
            class211.method1332(var8, (arg6 + -1 + arg0 + -var9) * this.field3977, arg4, arg3 * var9 + arg2, arg3);
        }
        if (arg5 < 50) {
            this.field3977 = -31;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILpe;IIIBI[FI)V")
    public final void method1917(int arg0, class636 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, float[] arg7, int arg8) {
        if (arg5 > 117) {
            super.field5105.method2643(-2, this);
            ++field3984;
            OpenGL.glPixelStorei(3314, arg8);
            OpenGL.glTexSubImage2Df(super.field5112, 0, arg4, arg0, arg6, arg2, class563.method3265((byte) -126, arg1), 5121, arg7, arg3);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[IIBI)V")
    public final void method1194(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7) {
        super.field5105.method2643(-2, this);
        ++field3982;
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexSubImage2Di(super.field5112, 0, arg2, arg7, arg0, arg3, 32993, super.field5105.field5891, arg4, arg1);
        if (arg6 != -96) {
            this.field3983 = -27;
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public static final void method1918(int arg0, int arg1) {
        ++field3979;
        class714 var2 = class350.method2072((long) arg1, 10, (byte) 122);
        if (arg0 != 256) {
            field3985 = null;
        }
        var2.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
    public final boolean method1192(int arg0) {
        if (arg0 >= -70) {
            return false;
        } else {
            ++field3973;
            return true;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IF)F")
    public final float method1196(int arg0, float arg1) {
        ++field3981;
        if (arg0 != -23865) {
            this.method1917(105, (class636) null, -34, -79, 15, (byte) -11, -82, (float[]) null, -10);
        }
        return arg1 / (float) this.field3977;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
    public final int method1197(int arg0) {
        ++field3980;
        return arg0 != 7676 ? -72 : this.field3983;
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V")
    public static void method1919(int arg0) {
        field3976 = null;
        field3985 = null;
        if (arg0 >= -29) {
            method1919(-123);
        }
    }
}
