import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class431 extends class587 implements class617 {

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    private int field6133;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    private int field6131;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Lcba;")
    public static class471 field6128 = new class471(5, 6);

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
    public static int[] field6129;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
    public static void method2560(boolean arg0) {
        field6128 = null;
        field6129 = null;
        if (arg0) {
            field6128 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpi;Ldk;Lge;II)V")
    public class431(class424 arg0, class435 arg1, class608 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field6133 = arg4;
        this.field6131 = arg3;
        super.field8393.method2267(2, this);
        OpenGL.glTexImage2Dub(super.field8403, 0, this.method3448(-1), arg3, arg4, 0, class32.method327(super.field8412, (byte) -63), class64.method543(super.field8413, 113), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6134;
        class438 var10 = null;
        for (class438 var11 = (class438) class311.field4187.method456((byte) -43); var11 != null; var11 = (class438) class311.field4187.method460((byte) 90)) {
            if (var11.field6224 == arg5 && ~var11.field6220 == ~arg3 && var11.field6213 == arg8 && ~var11.field6222 == ~arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class438();
            var10.field6222 = arg1;
            var10.field6220 = arg3;
            var10.field6213 = arg8;
            var10.field6224 = arg5;
            if (~arg3 <= -1 && arg8 >= 0 && class32.field513 > arg3 && arg8 < class611.field8786) {
                class505.method2920((byte) 1, var10);
            }
            class311.field4187.method463(var10, arg4 + -113);
        }
        var10.field6216 = arg9;
        var10.field6212 = arg0;
        var10.field6209 = arg6;
        if (arg4 != 0) {
            method2561(3, -16, 101, 45, -25, -98, 31, -5, 110, -95);
        }
        var10.field6214 = arg2;
        var10.field6217 = arg7;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
    public final int method1809(int arg0) {
        ++field6127;
        if (arg0 != 18814) {
            field6129 = null;
        }
        return this.field6131;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IF)F")
    public final float method1815(int arg0, float arg1) {
        ++field6130;
        if (arg0 != 25485) {
            method2561(21, -7, -118, 123, 60, -81, -71, 115, -10, -54);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpi;Ldk;II[BII)V")
    public class431(class424 arg0, class435 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class608.field8759, arg2 * arg3, false);
        this.field6131 = arg2;
        this.field6133 = arg3;
        super.field8393.method2267(2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field8403, 0, this.method3448(-1), arg2, arg3, 0, class32.method327(super.field8412, (byte) 101), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
    public static final void method2562(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field8985 != null) {
                var3.field8985 = null;
            }
            if (var3.field8982 != null) {
                var3.field8982 = null;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z")
    public final boolean method1811(int arg0) {
        if (arg0 != 3460) {
            return false;
        } else {
            ++field6132;
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZI)V")
    public final void method1812(boolean arg0, boolean arg1, int arg2) {
        ++field6140;
        if (arg2 != -21501) {
            method2560(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Llm;)V")
    public static final void method2563(class425 arg0) {
        for (int var1 = arg0.field6036; var1 <= arg0.field6030; ++var1) {
            for (int var2 = arg0.field6028; var2 <= arg0.field6031; ++var2) {
                class622 var3 = class356.field4807[arg0.field6035][var1][var2];
                if (var3 != null) {
                    class559 var4 = var3.field8973;
                    class559 var5 = null;
                    while (var4 != null) {
                        if (var4.field7742 == arg0) {
                            if (var5 != null) {
                                var5.field7736 = var4.field7736;
                            } else {
                                var3.field8973 = var4.field7736;
                            }
                            var4.method3184(-501);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field7736;
                    }
                    var3.field8983 = 0;
                    for (class559 var6 = var3.field8973; var6 != null; var6 = var6.field7736) {
                        var3.field8983 = (byte) (var3.field8983 | var6.field7744);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IF)F")
    public final float method1814(int arg0, float arg1) {
        if (arg0 < 120) {
            this.field6131 = 102;
        }
        ++field6138;
        return arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
    public final int method1808(boolean arg0) {
        if (arg0) {
            return -10;
        } else {
            ++field6136;
            return this.field6133;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V")
    public static final void method2564(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6137;
        if (~arg1 <= -8001 && arg1 <= 48000) {
            class626.field9116 = arg0;
            class622.field8980 = arg3;
            class223.field3180 = arg1;
            if (arg2 != -1) {
                field6128 = null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIBIIII)V")
    public final void method1813(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6135;
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        super.field8393.method2267(2, this);
        if (arg3 > 73) {
            if (arg1 != arg4) {
                OpenGL.glPixelStorei(3314, arg1);
            }
            OpenGL.glTexSubImage2Di(super.field8403, 0, arg7, arg2, arg4, arg5, 32993, super.field8393.field6024, arg0, arg6);
            if (arg1 != arg4) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BIILdk;IIIII)V")
    public final void method1810(byte[] arg0, int arg1, int arg2, class435 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field8393.method2267(arg5 + 30788, this);
        if (arg2 == 0) {
            arg2 = arg4;
        }
        ++field6139;
        OpenGL.glPixelStorei(3317, 1);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Dub(super.field8403, 0, arg6, arg8, arg4, arg1, class32.method327(arg3, (byte) -106), 5121, arg0, arg7);
        if (arg5 != -30786) {
            field6129 = null;
        }
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpi;Ldk;II[FII)V")
    public class431(class424 arg0, class435 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class608.field8763, arg2 * arg3, false);
        this.field6133 = arg3;
        this.field6131 = arg2;
        super.field8393.method2267(2, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field8403, 0, this.method3448(-1), arg2, arg3, 0, class32.method327(super.field8412, (byte) 107), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lpi;II[III)V")
    public class431(class424 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class49.field958, class608.field8759, arg1 * arg2, false);
        this.field6131 = arg1;
        this.field6133 = arg2;
        super.field8393.method2267(2, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field8403, 0, 6408, this.field6131, this.field6133, 0, 32993, super.field8393.field6024, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
