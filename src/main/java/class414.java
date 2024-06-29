import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class414 extends class602 implements class196 {

    @OriginalMember(owner = "client!vja", name = "db", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!vja", name = "R", descriptor = "I")
    private int field5943;

    @OriginalMember(owner = "client!vja", name = "fb", descriptor = "[Ljava/lang/String;")
    private static final String[] field5967 = new String[] { method3235(method3234("D\u0003D`")), method3235(method3234("QX\u0006\"Q")), method3235(method3234("\\\u001cI\"\u0010C\u0018Ax\u0012\u0002")), method3235(method3234("\\\u001cI\"c\u0002")), method3235(method3234("\\\u001cI\"o\u0002")), method3235(method3234("\\\u001cI\"d\u0002")), method3235(method3234("\\\u001cI\"h\u0002")), method3235(method3234("\\\u001cI\"i\u0002")), method3235(method3234("\\\u001cI\"e\u0002")), method3235(method3234("\\\u001cI\"m\u0002")), method3235(method3234("\\\u001cI\"f\u0002")), method3235(method3234("\\\u001cI\"k\u0002")), method3235(method3234("\\\u001cI\"b\u0002")), method3235(method3234("\\\u001cI\"`\u0002")), method3235(method3234("\\\u001cI\"a\u0002")), method3235(method3234("\\\u001cI\"n\u0002")) };

    @OriginalMember(owner = "client!vja", name = "Y", descriptor = "Lff;")
    public static class733 field5944 = new class733();

    @OriginalMember(owner = "client!vja", name = "U", descriptor = "Lhn;")
    public static class357 field5949 = new class357(14, 0);

    @OriginalMember(owner = "client!vja", name = "D", descriptor = "Lhn;")
    public static class357 field5952 = new class357(15, 4);

    @OriginalMember(owner = "client!vja", name = "Z", descriptor = "Lhn;")
    public static class357 field5953 = new class357(16, -2);

    @OriginalMember(owner = "client!vja", name = "W", descriptor = "Lhn;")
    public static class357 field5954 = new class357(17, 0);

    @OriginalMember(owner = "client!vja", name = "eb", descriptor = "Lhn;")
    public static class357 field5955 = new class357(19, -2);

    @OriginalMember(owner = "client!vja", name = "ab", descriptor = "Lhn;")
    public static class357 field5956 = new class357(22, -2);

    @OriginalMember(owner = "client!vja", name = "V", descriptor = "Lhn;")
    public static class357 field5957 = new class357(23, 4);

    @OriginalMember(owner = "client!vja", name = "G", descriptor = "Lhn;")
    public static class357 field5958 = new class357(24, -1);

    @OriginalMember(owner = "client!vja", name = "K", descriptor = "Lhn;")
    public static class357 field5959 = new class357(26, 0);

    @OriginalMember(owner = "client!vja", name = "bb", descriptor = "Lhn;")
    public static class357 field5960 = new class357(27, 0);

    @OriginalMember(owner = "client!vja", name = "B", descriptor = "Lhn;")
    public static class357 field5961 = new class357(28, -2);

    @OriginalMember(owner = "client!vja", name = "T", descriptor = "Lhn;")
    public static class357 field5962 = new class357(29, -2);

    @OriginalMember(owner = "client!vja", name = "A", descriptor = "Lhn;")
    public static class357 field5963 = new class357(30, -2);

    @OriginalMember(owner = "client!vja", name = "P", descriptor = "[Lhn;")
    private static class357[] field5964 = new class357[32];

    @OriginalMember(owner = "client!vja", name = "M", descriptor = "Ldfa;")
    public static class477 field5965;

    @OriginalMember(owner = "client!vja", name = "H", descriptor = "Lmv;")
    public static class125 field5966;

    @OriginalMember(owner = "client!vja", name = "O", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!vja", name = "Q", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!vja", name = "N", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!vja", name = "F", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!vja", name = "E", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!vja", name = "C", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!vja", name = "J", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!vja", name = "L", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!vja", name = "I", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!vja", name = "cb", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!vja", name = "X", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!vja", name = "S", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(I)I")
    public final int method1701(int arg0) {
        try {
            if (arg0 != 9259) {
                field5960 = null;
            }
            ++field5938;
            return this.field5939;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5967[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)V")
    public static final void method3230(byte arg0) {
        try {
            ++field5948;
            if (arg0 < 63) {
                method3232(102);
            }
            class496.field7286.method2603((byte) -104);
            class604.field8668.method2888((byte) 125);
            class572.field8287.method4979(127);
            class560.field8153.setBackground(Color.black);
            class304.field4232 = -1;
            class496.field7286 = class772.method5560(class560.field8153, true);
            class604.field8668 = class182.method1510(class560.field8153, 0, true);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5967[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "h", descriptor = "(I)V")
    public static final void method3231(int arg0) {
        try {
            if (arg0 == 25606) {
                class550.field8037.method2043(false);
                ++field5940;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5967[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)Z")
    public final boolean method1705(byte arg0) {
        try {
            ++field5950;
            if (arg0 <= 101) {
                method3231(-22);
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5967[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIBI[IIII)V")
    public final void method1704(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        try {
            ++field5942;
            super.field8615.method2668(24, this);
            if (arg2 <= 5) {
                field5954 = null;
            }
            OpenGL.glPixelStorei(3314, arg3);
            OpenGL.glTexSubImage2Di(super.field8634, 0, arg7, arg1, arg6, arg5, 32993, super.field8615.field10126, arg4, arg0);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5967[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5967[1] : field5967[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ldga;Lhh;IIZ[FII)V")
    public class414(class713 arg0, class250 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class496.field7285, arg2 * arg3, arg4);
        try {
            this.field5939 = arg3;
            this.field5943 = arg2;
            super.field8615.method2668(24, this);
            if (!arg4 && ~arg7 == -1 && arg6 == 0) {
                this.method4451(arg5, super.field8634, 118, arg2, arg3);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Df(super.field8634, 0, this.method4454(false), arg2, arg3, 0, class341.method2740((byte) -111, super.field8635), 5126, arg5, arg6 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5967[2] + (arg0 != null ? field5967[1] : field5967[0]) + ',' + (arg1 != null ? field5967[1] : field5967[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5967[1] : field5967[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIII[IB)V")
    public final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6) {
        try {
            ++field5945;
            if (arg6 != 41) {
                field5957 = null;
            }
            int[] var8 = new int[this.field5943 * this.field5939];
            super.field8615.method2668(24, this);
            OpenGL.glGetTexImagei(super.field8634, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; arg4 > var9; ++var9) {
                class569.method4248(var8, (arg2 - (-arg4 + 1) + -var9) * this.field5943, arg5, arg1 * var9 + arg3, arg1);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5967[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5967[1] : field5967[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ZF)F")
    public final float method1703(boolean arg0, float arg1) {
        try {
            if (arg0) {
                return 1.0768456F;
            } else {
                ++field5951;
                return arg1 / (float) this.field5939;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5967[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ldga;IIZ[III)V")
    public class414(class713 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class385.field5635, class496.field7281, arg1 * arg2, arg3);
        try {
            this.field5943 = arg1;
            this.field5939 = arg2;
            super.field8615.method2668(24, this);
            if (arg3 && arg6 == 0 && ~arg5 == -1) {
                this.method4450((byte) -91, arg4, super.field8634, arg1, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg6);
                OpenGL.glTexImage2Di(super.field8634, 0, 6408, this.field5943, this.field5939, 0, 32993, super.field8615.field10126, arg4, arg5 * 4);
                OpenGL.glPixelStorei(3314, 0);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5967[2] + (arg0 != null ? field5967[1] : field5967[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5967[1] : field5967[0]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)I")
    public final int method1707(int arg0) {
        try {
            int var2 = 66 % ((17 - arg0) / 40);
            ++field5936;
            return this.field5943;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5967[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ldga;Lhh;IIZ[BII)V")
    public class414(class713 arg0, class250 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class496.field7281, arg2 * arg3, arg4);
        try {
            this.field5939 = arg3;
            this.field5943 = arg2;
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg4 && arg7 == 0 && arg6 == 0) {
                this.method4446((byte) 122, super.field8634, arg5, arg3, arg2);
            } else {
                OpenGL.glPixelStorei(3314, arg7);
                OpenGL.glTexImage2Dub(super.field8634, 0, this.method4454(false), arg2, arg3, 0, class341.method2740((byte) -93, super.field8635), 5121, arg5, arg6);
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5967[2] + (arg0 != null ? field5967[1] : field5967[0]) + ',' + (arg1 != null ? field5967[1] : field5967[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5967[1] : field5967[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IF)F")
    public final float method1702(int arg0, float arg1) {
        try {
            if (arg0 < 39) {
                this.method1706(-25, true, true);
            }
            ++field5937;
            return arg1 / (float) this.field5943;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5967[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "g", descriptor = "(I)V")
    public static void method3232(int arg0) {
        try {
            field5963 = null;
            field5964 = null;
            field5965 = null;
            field5961 = null;
            field5957 = null;
            field5962 = null;
            field5944 = null;
            field5966 = null;
            field5952 = null;
            field5958 = null;
            field5954 = null;
            field5960 = null;
            field5959 = null;
            field5955 = null;
            field5956 = null;
            if (arg0 != 3314) {
                field5959 = null;
            }
            field5953 = null;
            field5949 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5967[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lhh;I[BIIIIII)V")
    public final void method1699(class250 arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field5946;
            if (arg3 != -19548) {
                field5944 = null;
            }
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg4);
            OpenGL.glTexSubImage2Dub(super.field8634, 0, arg1, arg8, arg6, arg5, class341.method2740((byte) 80, arg0), 5121, arg2, arg7);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5967[13] + (arg0 != null ? field5967[1] : field5967[0]) + ',' + arg1 + ',' + (arg2 != null ? field5967[1] : field5967[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IZZ)V")
    public final void method1706(int arg0, boolean arg1, boolean arg2) {
        try {
            ++field5941;
            super.field8615.method2668(24, this);
            OpenGL.glTexParameteri(super.field8634, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field8634, 10243, arg2 ? 10497 : 33071);
            if (arg0 != -18440) {
                field5956 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5967[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ldga;Lhh;Lon;II)V")
    public class414(class713 arg0, class250 arg1, class496 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        try {
            this.field5943 = arg3;
            this.field5939 = arg4;
            super.field8615.method2668(24, this);
            OpenGL.glTexImage2Dub(super.field8634, 0, this.method4454(false), arg3, arg4, 0, class341.method2740((byte) 68, super.field8635), class800.method5769(-68, super.field8626), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5967[2] + (arg0 != null ? field5967[1] : field5967[0]) + ',' + (arg1 != null ? field5967[1] : field5967[0]) + ',' + (arg2 != null ? field5967[1] : field5967[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII[FLhh;III)V")
    public final void method3233(int arg0, int arg1, int arg2, int arg3, float[] arg4, class250 arg5, int arg6, int arg7, int arg8) {
        try {
            super.field8615.method2668(24, this);
            ++field5947;
            OpenGL.glPixelStorei(3314, arg8);
            OpenGL.glTexSubImage2Df(super.field8634, 0, arg2, arg1, arg0, arg3, class341.method2740((byte) -127, arg5), 5121, arg4, arg6);
            OpenGL.glPixelStorei(3314, arg7);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5967[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5967[1] : field5967[0]) + ',' + (arg5 != null ? field5967[1] : field5967[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    static {
        class357[] var0 = class657.method4768(2);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field5964[var0[var1].field5193] = var0[var1];
        }
        field5965 = new class477(64);
        field5966 = new class125(59, -1);
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3234(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3235(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
