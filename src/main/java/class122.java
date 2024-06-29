import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class122 extends class433 implements class324 {

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[I")
    public static int[] field2044 = new int[14];

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Ldb;")
    public static class298 field2035 = new class298(31, -2);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I", line = 6)
    public final int method939(byte arg0) {
        ++field2039;
        int var2 = 127 % ((arg0 - 26) / 33);
        return this.field2041;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FZ)F", line = 16)
    public final float method940(float arg0, boolean arg1) {
        if (arg1) {
            return 0.8674699F;
        } else {
            ++field2037;
            return arg0 / (float) this.field2041;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII[I)V", line = 27)
    public final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg6 < -86) {
            super.field5925.method897(this, true);
            ++field2034;
            OpenGL.glPixelStorei(3314, arg3);
            OpenGL.glTexSubImage2Di(super.field5915, 0, arg0, arg4, arg2, arg1, 32993, super.field5925.field144, arg7, arg5);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lne;I)I", line = 41)
    public static final int method942(class294 arg0, int arg1) {
        ++field2042;
        if (class294.field4156 != arg0) {
            if (class294.field4158 == arg0) {
                return 5122;
            } else if (class294.field4159 != arg0) {
                if (class294.field4160 != arg0) {
                    if (class294.field4161 != arg0) {
                        if (class294.field4162 != arg0) {
                            if (class294.field4163 == arg0) {
                                return 5131;
                            } else if (class294.field4164 == arg0) {
                                return 5126;
                            } else {
                                int var2 = 28 % ((46 - arg1) / 54);
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 5125;
                        }
                    } else {
                        return 5123;
                    }
                } else {
                    return 5121;
                }
            } else {
                return 5124;
            }
        } else {
            return 5120;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ldc;Lhi;IIZ[BII)V", line = 86)
    public class122(class5 arg0, class193 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class294.field4160, arg2 * arg3, arg4);
        this.field2036 = arg2;
        this.field2041 = arg3;
        super.field5925.method897(this, true);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method2463(super.field5915, arg5, 1875741761, arg3, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field5915, 0, this.method2461(-106), arg2, arg3, 0, class420.method2414(144, super.field5922), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ldc;Lhi;Lne;II)V", line = 108)
    public class122(class5 arg0, class193 arg1, class294 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field2041 = arg4;
        this.field2036 = arg3;
        super.field5925.method897(this, true);
        OpenGL.glTexImage2Dub(super.field5915, 0, this.method2461(-103), arg3, arg4, 0, class420.method2414(144, super.field5922), method942(super.field5931, -75), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V", line = 119)
    public static void method943(byte arg0) {
        int var1 = -6 / ((arg0 - 17) / 43);
        field2035 = null;
        field2044 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)I", line = 131)
    public final int method944(boolean arg0) {
        ++field2048;
        if (!arg0) {
            this.method944(true);
        }
        return this.field2036;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII[BLhi;III)V", line = 142)
    public final void method945(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, class193 arg5, int arg6, int arg7, int arg8) {
        ++field2047;
        super.field5925.method897(this, true);
        if (arg1 != 52) {
            this.method941(-45, -19, -117, -47, 75, -128, -97, (int[]) null);
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field5915, 0, arg2, arg6, arg8, arg0, class420.method2414(144, arg5), 5121, arg4, arg3);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z", line = 158)
    public final boolean method946(byte arg0) {
        int var2 = -40 / ((arg0 - 69) / 48);
        ++field2045;
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZZ)V", line = 169)
    public final void method947(byte arg0, boolean arg1, boolean arg2) {
        ++field2040;
        int var4 = -107 % ((46 - arg0) / 36);
        super.field5925.method897(this, true);
        OpenGL.glTexParameteri(super.field5915, 10242, arg2 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field5915, 10243, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IF)F", line = 182)
    public final float method948(int arg0, float arg1) {
        if (arg0 != 22051) {
            this.method940(-1.7136017F, true);
        }
        ++field2046;
        return arg1 / (float) this.field2036;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIII)V", line = 196)
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2038;
        if (arg8 == 3314) {
            if (class600.field7959 <= arg5 && ~arg5 >= ~class366.field4956 && arg4 >= class600.field7959 && ~arg4 >= ~class366.field4956 && ~class600.field7959 >= ~arg0 && class366.field4956 >= arg0 && arg6 >= class600.field7959 && class366.field4956 >= arg6 && arg3 >= class310.field4279 && ~arg3 >= ~class442.field6058 && ~class310.field4279 >= ~arg9 && ~class442.field6058 <= ~arg9 && class310.field4279 <= arg7 && ~class442.field6058 <= ~arg7 && ~arg1 <= ~class310.field4279 && ~arg1 >= ~class442.field6058) {
                class191.method1247(arg6, arg8 ^ -942201570, arg5, arg2, arg3, arg1, arg7, arg9, arg0, arg4);
            } else {
                class617.method3379(arg9, arg1, arg4, arg3, arg7, arg5, arg0, (byte) 80, arg2, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ldc;Lhi;IIZ[FII)V", line = 218)
    public class122(class5 arg0, class193 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class294.field4164, arg2 * arg3, arg4);
        this.field2036 = arg2;
        this.field2041 = arg3;
        super.field5925.method897(this, true);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method2460(arg2, arg3, arg5, super.field5915, 0);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field5915, 0, this.method2461(-116), arg2, arg3, 0, class420.method2414(144, super.field5922), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ldc;IIZ[III)V", line = 242)
    public class122(class5 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class5.field100, class294.field4160, arg1 * arg2, arg3);
        this.field2036 = arg1;
        this.field2041 = arg2;
        super.field5925.method897(this, true);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method2462(super.field5915, arg4, arg1, 22784, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field5915, 0, 6408, this.field2036, this.field2041, 0, 32993, super.field5925.field144, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[FIIILhi;IB)V", line = 261)
    public final void method950(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, class193 arg6, int arg7, byte arg8) {
        if (arg8 < 120) {
            field2035 = null;
        }
        super.field5925.method897(this, true);
        ++field2043;
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Df(super.field5915, 0, arg4, arg7, arg5, arg3, class420.method2414(144, arg6), 5121, arg2, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }
}
