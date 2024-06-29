import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class176 extends class724 implements class471 {

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    private int field2303;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2315 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "Lwu;")
    public static class582 field2316 = new class582("", 17);

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field2319 = new String[200];

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "[I")
    public static int[] field2317;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "[I")
    public static int[] field2318;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Leka;B)Leka;")
    public static final class654 method1122(class654 arg0, byte arg1) {
        if (arg1 != 117) {
            field2318 = null;
        }
        ++field2307;
        class654 var2 = arg0 == null ? new class654() : new class654(arg0);
        var2.method3560(128, 9, 27);
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljc;II[III)V")
    public class176(class179 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class417.field5505, class73.field990, arg1 * arg2, false);
        this.field2311 = arg1;
        this.field2303 = arg2;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field9516, 0, 6408, this.field2311, this.field2303, 0, 32993, super.field9498.field2454, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)Z")
    public static final boolean method1123(int arg0, int arg1) {
        int var2 = -14 / ((arg0 - -36) / 60);
        ++field2299;
        return ~arg1 == -8 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z[IIIIIII)V")
    public final void method1124(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field9498.method3756(10, this);
        ++field2314;
        if (arg0) {
            if (arg7 == 0) {
                arg7 = arg5;
            }
            if (~arg5 != ~arg7) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Di(super.field9516, 0, arg2, arg4, arg5, arg3, 32993, super.field9498.field2454, arg1, arg6);
            if (arg5 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZF)F")
    public final float method1125(boolean arg0, float arg1) {
        if (!arg0) {
            return -0.34273967F;
        } else {
            ++field2306;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljc;Ltn;II[BII)V")
    public class176(class179 arg0, class749 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class73.field990, arg2 * arg3, false);
        this.field2311 = arg2;
        this.field2303 = arg3;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field9516, 0, this.method3878(255), arg2, arg3, 0, class735.method3999((byte) -85, super.field9499), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILtn;IIBI[BII)V")
    public final void method1126(int arg0, class749 arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field2309;
        super.field9498.method3756(10, this);
        if (arg2 == 0) {
            arg2 = arg8;
        }
        int var10 = -84 % ((50 - arg4) / 34);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg8) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field9516, 0, arg7, arg3, arg8, arg5, class735.method3999((byte) -85, arg1), 5121, arg6, arg0);
        if (~arg2 != ~arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
    public final int method1127(int arg0) {
        ++field2302;
        int var2 = -89 % ((arg0 - -4) / 38);
        return this.field2311;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field2319 = null;
        field2318 = null;
        field2315 = null;
        if (arg0 == 92) {
            field2317 = null;
            field2316 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IF)F")
    public final float method1129(int arg0, float arg1) {
        if (arg0 > -116) {
            return -0.2599939F;
        } else {
            ++field2313;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        class216.field2943 = 0;
        ++field2301;
        class734.field9969 = class722.field9480;
        class75.field1067 = new class318[2000];
        class86.field1201 = new int[class78.field1121][class330.field4039 + 1][class559.field7102 - -1];
        class505.field6464 = new class318[500];
        class53.field676 = false;
        class164.field2177 = 0;
        class763.field10388 = new class318[1000];
        class779.field10635 = 0;
        class656.field8454 = new class318[500];
        class100.field1333 = class722.field9480;
        class269.field3552 = 0;
        if (arg0 != 4754) {
            field2310 = -120;
        }
        if (class398.field5275 instanceof class426) {
            class750.field10229 = false;
        } else {
            class750.field10229 = true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZZI)V")
    public final void method1131(boolean arg0, boolean arg1, int arg2) {
        ++field2312;
        if (arg2 < 37) {
            field2318 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
    public final boolean method1132(int arg0) {
        ++field2300;
        if (arg0 != 30365) {
            method1130(60);
        }
        return false;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljc;Ltn;II[FII)V")
    public class176(class179 arg0, class749 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class73.field994, arg2 * arg3, false);
        this.field2303 = arg3;
        this.field2311 = arg2;
        super.field9498.method3756(10, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field9516, 0, this.method3878(255), arg2, arg3, 0, class735.method3999((byte) -85, super.field9499), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)I")
    public final int method1133(int arg0) {
        ++field2308;
        if (arg0 != 28215) {
            this.field2311 = -73;
        }
        return this.field2303;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(II)Z")
    public static final boolean method1134(int arg0, int arg1) {
        if (arg0 != 14031) {
            return true;
        } else {
            ++field2305;
            return ~arg1 != -2 && ~arg1 != -8;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljc;Ltn;Lds;II)V")
    public class176(class179 arg0, class749 arg1, class73 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field2303 = arg4;
        this.field2311 = arg3;
        super.field9498.method3756(10, this);
        OpenGL.glTexImage2Dub(super.field9516, 0, this.method3878(255), arg3, arg4, 0, class735.method3999((byte) -85, super.field9499), class168.method1066((byte) -83, super.field9517), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([IIIIIII)V")
    public final void method1135(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2304;
        int[] var8 = new int[this.field2311 * this.field2303];
        super.field9498.method3756(10, this);
        OpenGL.glGetTexImagei(super.field9516, 0, 32993, 5121, var8, 0);
        int var9 = 0;
        int var10 = -74 / ((40 - arg5) / 38);
        while (var9 < arg4) {
            class642.method3475(var8, (-var9 + arg4 - (1 - arg3)) * this.field2311, arg0, arg1 - -(arg6 * var9), arg6);
            ++var9;
        }
    }
}
