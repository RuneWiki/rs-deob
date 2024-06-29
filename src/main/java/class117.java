import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class117 extends class178 implements class19 {

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "Lgw;")
    public static class690 field1551 = new class690(8);

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "Lid;")
    public static class467 field1545;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILiv;[BIIZI)V", line = 4)
    public final void method99(int arg0, int arg1, int arg2, class25 arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
        super.field2431.method1458(399403340, this);
        ++field1542;
        if (~arg1 == -1) {
            arg1 = arg2;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (!arg7) {
            field1545 = null;
        }
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field2445, 0, arg0, arg5, arg2, arg8, class71.method547(arg3, -8807), 5121, arg4, arg6);
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I", line = 30)
    public final int method94(int arg0) {
        ++field1543;
        if (arg0 != 16949) {
            field1545 = null;
        }
        return this.field1550;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I", line = 43)
    public final int method95(byte arg0) {
        ++field1549;
        return arg0 > -36 ? -38 : this.field1540;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lht;Z)Z", line = 55)
    public static final boolean method738(class395 arg0, boolean arg1) {
        boolean var2 = class433.field6043 == class371.field5240;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method2468(-114);
        if (arg0.field5680 >= 0 && arg0.field5673 >= 0 && arg0.field5683 < class61.field877 && arg0.field5679 < class713.field9959) {
            short var6 = 0;
            for (int var7 = arg0.field5680; var7 <= arg0.field5683; ++var7) {
                for (int var11 = arg0.field5673; var11 <= arg0.field5679; ++var11) {
                    class262 var12 = class670.method3779(arg0.field4408, var7, var11);
                    if (var12 != null) {
                        class638 var13 = class44.method238(0, arg0);
                        class638 var14 = var12.field3846;
                        if (var14 == null) {
                            var12.field3846 = var13;
                        } else {
                            while (var14.field8564 != null) {
                                var14 = var14.field8564;
                            }
                            var14.field8564 = var13;
                        }
                        if (var2 && (class644.field8632[var7][var11] & -16777216) != 0) {
                            var3 = class644.field8632[var7][var11];
                            var4 = class680.field9452[var7][var11];
                            var5 = class151.field2085[var7][var11];
                        }
                        if (!arg1 && var12.field3844 != null && var12.field3844.field6133 > var6) {
                            var6 = var12.field3844.field6133;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field5680; var8 <= arg0.field5683; ++var8) {
                    for (int var9 = arg0.field5673; var9 <= arg0.field5679; ++var9) {
                        if ((class644.field8632[var8][var9] & -16777216) == 0) {
                            class644.field8632[var8][var9] = var3;
                            class680.field9452[var8][var9] = var4;
                            class151.field2085[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class529.field7337[class323.field4472++] = arg0;
            } else {
                int var10 = class433.field6043 == class371.field5240 ? 1 : 0;
                if (arg0.method783(0)) {
                    if (arg0.method785(-118)) {
                        arg0.field4412 = class333.field4710[var10];
                        class333.field4710[var10] = arg0;
                    } else {
                        arg0.field4412 = class234.field3474[var10];
                        class234.field3474[var10] = arg0;
                        class569.field7870 = true;
                    }
                } else {
                    arg0.field4412 = class204.field2694[var10];
                    class204.field2694[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field4413 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(III[IIII)V", line = 180)
    public final void method98(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        ++field1547;
        int[] var8 = new int[this.field1550 * this.field1540];
        if (arg4 == 4549) {
            super.field2431.method1458(399403340, this);
            OpenGL.glGetTexImagei(super.field2445, 0, 32993, 5121, var8, 0);
            for (int var9 = 0; var9 < arg1; ++var9) {
                class245.method1647(var8, (arg0 + -1 + arg1 + -var9) * this.field1540, arg3, arg2 - -(arg5 * var9), arg5);
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lhj;II[III)V", line = 205)
    public class117(class47 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class623.field8394, class38.field472, arg1 * arg2, false);
        this.field1550 = arg2;
        this.field1540 = arg1;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field2445, 0, 6408, this.field1540, this.field1550, 0, 32993, super.field2431.field716, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(FI)F", line = 219)
    public final float method96(float arg0, int arg1) {
        ++field1552;
        if (arg1 != -21696) {
            this.method98(33, -18, -78, (int[]) null, -104, 16, -27);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZZI)V", line = 233)
    public final void method100(boolean arg0, boolean arg1, int arg2) {
        ++field1546;
        if (arg2 < 40) {
            this.method101(-19, 94, (int[]) null, 99, -36, 76, -13, -10);
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lhj;Liv;Ljt;II)V", line = 245)
    public class117(class47 arg0, class25 arg1, class38 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field1550 = arg4;
        this.field1540 = arg3;
        super.field2431.method1458(399403340, this);
        OpenGL.glTexImage2Dub(super.field2445, 0, this.method1122(109), arg3, arg4, 0, class71.method547(super.field2442, -8807), class466.method2849(super.field2430, -11595), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lhj;Liv;II[BII)V", line = 256)
    public class117(class47 arg0, class25 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class38.field472, arg2 * arg3, false);
        this.field1550 = arg3;
        this.field1540 = arg2;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field2445, 0, this.method1122(110), arg2, arg3, 0, class71.method547(super.field2442, -8807), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lhj;Liv;II[FII)V", line = 271)
    public class117(class47 arg0, class25 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class38.field476, arg2 * arg3, false);
        this.field1540 = arg2;
        this.field1550 = arg3;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field2445, 0, this.method1122(124), arg2, arg3, 0, class71.method547(super.field2442, -8807), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II[IIIIII)V", line = 284)
    public final void method101(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1544;
        if (arg0 == 0) {
            arg0 = arg6;
        }
        super.field2431.method1458(399403340, this);
        if (arg3 != -28425) {
            this.method95((byte) 107);
        }
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field2445, 0, arg7, arg4, arg6, arg1, 32993, super.field2431.field716, arg2, arg5);
        if (arg0 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IF)F", line = 312)
    public final float method97(int arg0, float arg1) {
        ++field1541;
        return arg0 != -28409 ? -0.85210097F : arg1;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z", line = 323)
    public final boolean method93(int arg0) {
        ++field1548;
        return arg0 < 110 ? false : false;
    }

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)V", line = 334)
    public static void method739(int arg0) {
        field1551 = null;
        field1545 = null;
        if (arg0 != 16101) {
            method739(-63);
        }
    }
}
