import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class172 extends class203 implements class305 {

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[Lbs;")
    public static class201[] field2225 = new class201[50];

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lvba;")
    public static class231[] field2232 = new class231[32];

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Lbe;")
    public static class189 field2222 = new class189();

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public final int method1050(byte arg0) {
        if (arg0 >= -47) {
            return -61;
        } else {
            ++field2224;
            return this.field2227;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IF)F")
    public final float method1051(int arg0, float arg1) {
        ++field2228;
        if (arg0 != -3008) {
            method1058(true, -106, -89);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lph;Luda;II[FII)V")
    public class172(class442 arg0, class509 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class280.field3667, arg2 * arg3, false);
        this.field2234 = arg3;
        this.field2227 = arg2;
        super.field2672.method3344(29639, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field2657, 0, this.method1301(34843), arg2, arg3, 0, class562.method3158((byte) -74, super.field2656), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIZ)V")
    public final void method1052(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -25920) {
            this.method1059(-81);
        }
        ++field2233;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BF)F")
    public final float method1053(byte arg0, float arg1) {
        ++field2230;
        if (arg0 != 3) {
            this.field2234 = 60;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BIBLuda;III)V")
    public final void method1054(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, class509 arg5, int arg6, int arg7, int arg8) {
        super.field2672.method3344(29639, this);
        ++field2229;
        if (arg1 == 0) {
            arg1 = arg3;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field2657, 0, arg0, arg8, arg3, arg7, class562.method3158((byte) -92, arg5), 5121, arg2, arg6);
        if (~arg1 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg4 != -21) {
            this.method1054(-39, -119, (byte[]) null, -49, (byte) 50, (class509) null, 9, 84, 69);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[IIIII)V")
    public final void method1055(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2235;
        if (arg1 != 30519) {
            this.method1050((byte) 76);
        }
        super.field2672.method3344(29639, this);
        if (arg2 == 0) {
            arg2 = arg6;
        }
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field2657, 0, arg4, arg7, arg6, arg5, 32993, super.field2672.field6096, arg3, arg0);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
    public static void method1056(int arg0) {
        int var1 = -110 % ((51 - arg0) / 55);
        field2225 = null;
        field2222 = null;
        field2232 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
    public final boolean method1057(int arg0) {
        if (arg0 <= 41) {
            this.method1057(48);
        }
        ++field2223;
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lph;Luda;II[BII)V")
    public class172(class442 arg0, class509 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class280.field3663, arg2 * arg3, false);
        this.field2227 = arg2;
        this.field2234 = arg3;
        super.field2672.method3344(29639, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field2657, 0, this.method1301(34843), arg2, arg3, 0, class562.method3158((byte) -106, super.field2656), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lph;Luda;Lsb;II)V")
    public class172(class442 arg0, class509 arg1, class280 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2227 = arg3;
        this.field2234 = arg4;
        super.field2672.method3344(29639, this);
        OpenGL.glTexImage2Dub(super.field2657, 0, this.method1301(34843), arg3, arg4, 0, class562.method3158((byte) 123, super.field2656), class329.method2043(super.field2653, -119), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)I")
    public static final int method1058(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1056(32);
        }
        ++field2231;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lph;II[III)V")
    public class172(class442 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class532.field7430, class280.field3663, arg1 * arg2, false);
        this.field2227 = arg1;
        this.field2234 = arg2;
        super.field2672.method3344(29639, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field2657, 0, 6408, this.field2227, this.field2234, 0, 32993, super.field2672.field6096, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
    public final int method1059(int arg0) {
        ++field2226;
        if (arg0 != -23624) {
            field2232 = null;
        }
        return this.field2234;
    }
}
