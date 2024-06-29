import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class185 extends class411 {

    @OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
    private int field2428 = -1;

    @OriginalMember(owner = "client!hga", name = "M", descriptor = "I")
    private int field2437 = -1;

    @OriginalMember(owner = "client!hga", name = "I", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!hga", name = "K", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!hga", name = "F", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!hga", name = "G", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!hga", name = "H", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!hga", name = "J", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!hga", name = "L", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!hga", name = "N", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "[Lfba;")
    public static class600[] field2426;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)V")
    public final void method1179(int arg0, int arg1, int arg2, int arg3) {
        ++field2429;
        OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.field5794, super.field5803, arg2);
        this.field2428 = arg1;
        this.field2437 = arg0;
        if (arg3 != 5121) {
            this.method1179(60, -28, -27, 98);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II[IIIZIII)V")
    public final void method1180(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field2427;
        if (arg1 == 0) {
            arg1 = arg7;
        }
        if (arg5) {
            int[] var10 = new int[arg4 * arg7];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (arg4 - (var11 + 1)) * arg1 + arg0;
                for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field5807.method2120(arg6 + -1, this);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field5794, arg6, arg3, -arg8 + this.field2435 + -arg4, arg7, arg4, 32993, super.field5807.field5033, arg2, arg0);
        if (~arg1 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        if (arg0) {
            OpenGL.glFramebufferTexture2DEXT(this.field2428, this.field2437, super.field5794, 0, 0);
            ++field2431;
            this.field2428 = -1;
            this.field2437 = -1;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIILha;ILqg;)V")
    public static final void method1181(int arg0, int arg1, int arg2, class454 arg3, int arg4, class290 arg5) {
        ++field2423;
        class128 var6 = class70.field946.method1483(arg5.field3736, (byte) -1);
        if (~var6.field1551 != 0) {
            int var7;
            if (!arg5.field3705) {
                var7 = 0;
            } else {
                int var8 = arg5.field3703 + arg4;
                var7 = var8 & 3;
            }
            class712 var9 = var6.method827(arg5.field3696, false, var7, arg3);
            if (var9 != null) {
                int var10 = arg5.field3724;
                if (arg2 != -19857) {
                    method1184(false);
                }
                int var11 = arg5.field3762;
                if ((var7 & 1) == 1) {
                    var11 = arg5.field3724;
                    var10 = arg5.field3762;
                }
                int var12 = var9.method1892();
                int var13 = var9.method1882();
                if (var6.field1549) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (var6.field1544 == 0) {
                    var9.method3933(arg0, -((var11 + -1) * 4) + arg1, var12, var13);
                } else {
                    var9.method3937(arg0, arg1 - (var11 * 4 - 4), var12, var13, 0, -16777216 | var6.field1544, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Leq;IIIIZ[BIZ)V")
    public class185(class357 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2433 = arg3;
        this.field2435 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field5807.method2120(-1, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field5794 != 34037) {
            class667.method3609(arg4, arg1, arg3, arg2, arg6, (byte) -15, arg7);
            this.method2436(127, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5794, 0, super.field5809, this.field2433, this.field2435, 0, arg7, 5121, arg6, 0);
            this.method2436(124, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2433(true, -85);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Leq;IIIII)V")
    public class185(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2433 = arg4;
        this.field2435 = arg5;
        int var7 = -arg5 - (arg3 - super.field5807.field4882);
        super.field5807.method2120(-1, this);
        OpenGL.glCopyTexImage2D(super.field5794, 0, super.field5809, arg2, var7, arg4, arg5, 0);
        this.method2433(true, -98);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Leq;IIIIZ[FI)V")
    public class185(class357 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2433 = arg3;
        this.field2435 = arg4;
        super.field5807.method2120(-1, this);
        if (arg5 && ~super.field5794 != -34038) {
            class750.method4192((byte) -91, arg4, arg7, arg6, arg1, arg3, arg2);
            this.method2436(124, true);
        } else {
            OpenGL.glTexImage2Df(super.field5794, 0, super.field5809, this.field2433, this.field2435, 0, arg7, 5126, arg6, 0);
            this.method2436(120, false);
        }
        this.method2433(true, -126);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Leq;IIII)V")
    public class185(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2433 = arg3;
        this.field2435 = arg4;
        super.field5807.method2120(-1, this);
        OpenGL.glTexImage2Dub(super.field5794, 0, super.field5809, arg3, arg4, 0, class606.method3328(super.field5809, false), 5121, (byte[]) null, 0);
        this.method2433(true, -125);
    }

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2426 = null;
        if (arg0 != -46) {
            method1185(6, -39);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIII)V")
    public final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2432;
        int var8 = super.field5807.field4882 - arg0 - arg4;
        super.field5807.method2120(-1, this);
        if (arg1 != 10497) {
            method1184(false);
        }
        OpenGL.glCopyTexSubImage2D(super.field5794, 0, arg3, -arg0 - (arg2 - this.field2435), arg6, var8, arg5, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "(Z)Lkl;")
    public static final class144 method1184(boolean arg0) {
        ++field2430;
        if (!arg0) {
            return null;
        } else {
            class144 var1 = (class144) class717.field10115.method1834(0);
            if (var1 != null) {
                --class88.field1122;
                return var1;
            } else {
                return new class144();
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(II)V")
    public static final void method1185(int arg0, int arg1) {
        ++field2438;
        class548 var2 = class696.method3872(arg1, 17, -1633381944);
        var2.method3127((byte) -45);
        if (arg0 <= 102) {
            method1181(92, 110, 8, (class454) null, -107, (class290) null);
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Leq;IIIIZ[IIIZ)V")
    public class185(class357 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2435 = arg4;
        this.field2433 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 - 1 + arg4) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field5807.method2120(-1, this);
        if (~super.field5794 != -34038 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
            class588.method3270((byte) 106, super.field5809, 32993, arg6, super.field5807.field5033, super.field5794, this.field2433, this.field2435);
            this.method2436(126, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field5794, 0, super.field5809, this.field2433, this.field2435, 0, 32993, super.field5807.field5033, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2436(123, false);
        }
        this.method2433(true, -101);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZI)B")
    public static final byte method1186(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1185(-83, -97);
        }
        ++field2424;
        if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) ((arg2 & 1) == 0 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIZ[BIIIIII)V")
    public final void method1187(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2436;
        if (arg9 == 0) {
            arg9 = arg0;
        }
        if (arg2) {
            int var11 = class447.method2638((byte) 18, arg6);
            int var12 = arg0 * var11;
            int var13 = arg9 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; ~var15 > ~arg1; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg1 - 1 + -var15) * var13 + arg4;
                for (int var18 = 0; var18 < var12; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field5807.method2120(-1, this);
        OpenGL.glPixelStorei(arg5, 1);
        if (~arg0 != ~arg9) {
            OpenGL.glPixelStorei(3314, arg9);
        }
        OpenGL.glTexSubImage2Dub(super.field5794, 0, arg8, arg7, arg0, arg1, arg6, 5121, arg3, arg4);
        if (arg0 != arg9) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZZ)V")
    public final void method1188(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 10242) {
            field2426 = null;
        }
        ++field2434;
        if (~super.field5794 == -3554) {
            super.field5807.method2120(arg0 ^ -10243, this);
            OpenGL.glTexParameteri(super.field5794, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field5794, 10243, arg2 ? 10497 : 33071);
        }
    }
}
