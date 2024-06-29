import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class696 extends class602 implements class196 {

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    private int field9743;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field9751;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field9755 = new String[] { method5019(method5018("ujbBD\u007fe8@\u0005")), method5019(method5018("j\"bPP")), method5019(method5018("\u007fy \u0012")), method5019(method5018("ujb:\u0005")), method5019(method5018("ujb4\u0005")), method5019(method5018("ujb3\u0005")), method5019(method5018("ujb=\u0005")), method5019(method5018("ujb?\u0005")), method5019(method5018("ujb0\u0005")), method5019(method5018("ujb7\u0005")), method5019(method5018("ujb6\u0005")), method5019(method5018("ujb2\u0005")), method5019(method5018("ujb;\u0005")), method5019(method5018("ujb<\u0005")) };

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Lcb;")
    public static class700 field9752 = new class700();

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field9754;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I", line = 4)
    public final int method1701(int arg0) {
        try {
            if (arg0 != 9259) {
                this.field9743 = -55;
            }
            ++field9753;
            return this.field9743;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9755[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 15)
    public static void method5015(byte arg0) {
        try {
            if (arg0 != -75) {
                method5015((byte) 121);
            }
            field9752 = null;
            field9754 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9755[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldga;Lhh;II[BII)V", line = 27)
    public class696(class713 arg0, class250 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class496.field7281, arg2 * arg3, false);
        try {
            this.field9743 = arg3;
            this.field9751 = arg2;
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Dub(super.field8634, 0, this.method4454(false), arg2, arg3, 0, class341.method2740((byte) 122, super.field8635), 5121, arg4, arg5);
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9755[0] + (arg0 != null ? field9755[1] : field9755[2]) + ',' + (arg1 != null ? field9755[1] : field9755[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9755[1] : field9755[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhh;I[BIIIIII)V", line = 42)
    public final void method1699(class250 arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            super.field8615.method2668(24, this);
            if (arg3 != -19548) {
                this.field9751 = 22;
            }
            ++field9747;
            if (arg4 == 0) {
                arg4 = arg6;
            }
            OpenGL.glPixelStorei(3317, 1);
            if (~arg4 != ~arg6) {
                OpenGL.glPixelStorei(3314, arg4);
            }
            OpenGL.glTexSubImage2Dub(super.field8634, 0, arg1, arg8, arg6, arg5, class341.method2740((byte) -99, arg0), 5121, arg2, arg7);
            if (arg4 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field9755[11] + (arg0 != null ? field9755[1] : field9755[2]) + ',' + arg1 + ',' + (arg2 != null ? field9755[1] : field9755[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII[FII[FF)V", line = 67)
    public static final void method5016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, float[] arg9, float arg10) {
        try {
            int var21 = arg1 - arg0;
            int var22 = arg5 - arg2;
            int var23 = arg8 - arg3;
            ++field9742;
            float var11 = arg6[2] * (float) var22 + arg6[0] * (float) var21 + arg6[1] * (float) var23;
            float var12 = arg6[5] * (float) var22 + arg6[3] * (float) var21 + arg6[4] * (float) var23;
            float var13 = arg6[8] * (float) var22 + arg6[6] * (float) var21 + arg6[7] * (float) var23;
            float var14 = (float) Math.sqrt((double) (var13 * var13 + var11 * var11 + var12 * var12));
            float var15 = (float) Math.atan2((double) var11, (double) var13) / 6.2831855F + 0.5F;
            if (arg4 != 3314) {
                method5016(-76, 39, -18, -50, -77, 79, (float[]) null, 1, 58, (float[]) null, 1.5987977F);
            }
            float var16 = arg10 + (float) Math.asin((double) (var12 / var14)) / 3.1415927F + 0.5F;
            if (arg7 == 1) {
                float var17 = var15;
                var15 = -var16;
                var16 = var17;
            } else if (arg7 != 2) {
                if (arg7 == 3) {
                    float var18 = var15;
                    var15 = var16;
                    var16 = -var18;
                }
            } else {
                var15 = -var15;
                var16 = -var16;
            }
            arg9[1] = var16;
            arg9[0] = var15;
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field9755[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9755[1] : field9755[2]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field9755[1] : field9755[2]) + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldga;Lhh;Lon;II)V", line = 119)
    public class696(class713 arg0, class250 arg1, class496 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        try {
            this.field9751 = arg3;
            this.field9743 = arg4;
            super.field8615.method2668(24, this);
            OpenGL.glTexImage2Dub(super.field8634, 0, this.method4454(false), arg3, arg4, 0, class341.method2740((byte) 86, super.field8635), class800.method5769(-67, super.field8626), (byte[]) null, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9755[0] + (arg0 != null ? field9755[1] : field9755[2]) + ',' + (arg1 != null ? field9755[1] : field9755[2]) + ',' + (arg2 != null ? field9755[1] : field9755[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IF)F", line = 131)
    public final float method1702(int arg0, float arg1) {
        try {
            ++field9745;
            return arg0 <= 39 ? 0.3060405F : arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9755[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII[IB)V", line = 142)
    public final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6) {
        try {
            ++field9744;
            int[] var8 = new int[this.field9751 * this.field9743];
            super.field8615.method2668(24, this);
            OpenGL.glGetTexImagei(super.field8634, 0, 32993, 5121, var8, 0);
            if (arg6 != 41) {
                this.field9751 = -5;
            }
            for (int var9 = 0; var9 < arg4; ++var9) {
                class569.method4248(var8, (arg2 - -arg4 - (var9 + 1)) * this.field9751, arg5, arg1 * var9 + arg3, arg1);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field9755[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9755[1] : field9755[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z", line = 165)
    public final boolean method1705(byte arg0) {
        try {
            ++field9741;
            return arg0 <= 101 ? false : false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9755[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I", line = 176)
    public final int method1707(int arg0) {
        try {
            int var2 = 127 / ((17 - arg0) / 40);
            ++field9748;
            return this.field9751;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9755[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZZ)V", line = 189)
    public final void method1706(int arg0, boolean arg1, boolean arg2) {
        try {
            ++field9749;
            if (arg0 != -18440) {
                this.method1707(109);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9755[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldga;Lhh;II[FII)V", line = 201)
    public class696(class713 arg0, class250 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class496.field7285, arg2 * arg3, false);
        try {
            this.field9743 = arg3;
            this.field9751 = arg2;
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Df(super.field8634, 0, this.method4454(false), arg2, arg3, 0, class341.method2740((byte) -84, super.field8635), 5126, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field9755[0] + (arg0 != null ? field9755[1] : field9755[2]) + ',' + (arg1 != null ? field9755[1] : field9755[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9755[1] : field9755[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZF)F", line = 215)
    public final float method1703(boolean arg0, float arg1) {
        try {
            ++field9750;
            if (arg0) {
                this.field9751 = 80;
            }
            return arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9755[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldga;II[III)V", line = 227)
    public class696(class713 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class385.field5635, class496.field7281, arg1 * arg2, false);
        try {
            this.field9751 = arg1;
            this.field9743 = arg2;
            super.field8615.method2668(24, this);
            OpenGL.glPixelStorei(3314, arg5);
            OpenGL.glTexImage2Di(super.field8634, 0, 6408, this.field9751, this.field9743, 0, 32993, super.field8615.field10126, arg3, arg4 * 4);
            OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field9755[0] + (arg0 != null ? field9755[1] : field9755[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9755[1] : field9755[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI[IIII)V", line = 242)
    public final void method1704(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg3 == 0) {
                arg3 = arg6;
            }
            ++field9746;
            super.field8615.method2668(24, this);
            if (arg3 != arg6) {
                OpenGL.glPixelStorei(3314, arg3);
            }
            if (arg2 >= 5) {
                OpenGL.glTexSubImage2Di(super.field8634, 0, arg7, arg1, arg6, arg5, 32993, super.field8615.field10126, arg4, arg0);
                if (~arg3 != ~arg6) {
                    OpenGL.glPixelStorei(3314, 0);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field9755[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9755[1] : field9755[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V", line = 266)
    public static final void method5017(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        if (var3 != null) {
            class478.method3703(var3.field8842);
            class478.method3703(var3.field8845);
            if (var3.field8842 != null) {
                var3.field8842 = null;
            }
            if (var3.field8845 != null) {
                var3.field8845 = null;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5018(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!df", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5019(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
