import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class293 extends class695 {

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    private int field3860 = -1;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    private int field3859 = -1;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "[Lno;")
    public static class704[] field3861 = new class704[75];

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "Lal;")
    public static class102 field3867 = null;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field3869;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bq", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field3870;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1764(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZZI)V", line = 5)
    public final void method1756(boolean arg0, boolean arg1, int arg2) {
        if (arg2 <= 2) {
            this.method1760(114, -1, 6, 92);
        }
        ++field3864;
        if (~super.field9659 == -3554) {
            super.field9655.method2850(102, this);
            OpenGL.glTexParameteri(super.field9659, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field9659, 10243, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 22)
    public final void method633(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3859, this.field3860, super.field9659, 0, 0);
        ++field3868;
        this.field3859 = -1;
        if (arg0 >= -70) {
            this.method633(-87);
        }
        this.field3860 = -1;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lbi;IIIIZ[FI)V", line = 35)
    public class293(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3856 = arg3;
        this.field3862 = arg4;
        super.field9655.method2850(102, this);
        if (arg5 && super.field9659 != 34037) {
            class337.method1934(arg2, arg7, -20169, arg6, arg4, arg1, arg3);
            this.method3892(true, -29829);
        } else {
            OpenGL.glTexImage2Df(super.field9659, 0, super.field9670, this.field3856, this.field3862, 0, arg7, 5126, arg6, 0);
            this.method3892(false, -29829);
        }
        this.method3898(true, 90);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lbi;IIIII)V", line = 60)
    public class293(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3862 = arg5;
        this.field3856 = arg4;
        int var7 = -arg3 + -arg5 + super.field9655.field6671;
        super.field9655.method2850(102, this);
        OpenGL.glCopyTexImage2D(super.field9659, 0, super.field9670, arg2, var7, arg4, arg5, 0);
        this.method3898(true, 28);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZIIII[IIB)V", line = 74)
    public final void method1757(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte arg8) {
        ++field3869;
        if (~arg3 == -1) {
            arg3 = arg5;
        }
        if (arg1) {
            int[] var10 = new int[arg2 * arg5];
            for (int var11 = 0; ~arg2 < ~var11; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (-var11 + -1 + arg2) * arg3 - -arg7;
                for (int var14 = 0; arg5 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field9655.method2850(-60, this);
        int var15 = 51 / ((arg8 - -38) / 39);
        if (arg3 != arg5) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Di(super.field9659, 0, arg0, this.field3862 - arg2 + -arg4, arg5, arg2, 32993, super.field9655.field6837, arg6, arg7);
        if (arg3 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lbi;IIII)V", line = 127)
    public class293(class483 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3856 = arg3;
        this.field3862 = arg4;
        super.field9655.method2850(-47, this);
        OpenGL.glTexImage2Dub(super.field9659, 0, super.field9670, arg3, arg4, 0, class212.method1362(6410, super.field9670), 5121, (byte[]) null, 0);
        this.method3898(true, 104);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lbi;IIIIZ[IIIZ)V", line = 288)
    public class293(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3856 = arg3;
        this.field3862 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~arg4 < ~var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; arg3 > var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field9655.method2850(-36, this);
        if (~super.field9659 != -34038 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class336.method1932(this.field3856, 255, this.field3862, super.field9655.field6837, super.field9670, super.field9659, 32993, arg6);
            this.method3892(true, -29829);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field9659, 0, super.field9670, this.field3856, this.field3862, 0, 32993, super.field9655.field6837, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method3892(false, -29829);
        }
        this.method3898(true, 28);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lbi;IIIIZ[BIZ)V", line = 378)
    public class293(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3862 = arg4;
        this.field3856 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field9655.method2850(69, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field9659 != 34037) {
            class586.method3331(arg7, arg6, arg2, arg1, 4, arg3, arg4);
            this.method3892(true, -29829);
        } else {
            OpenGL.glTexImage2Dub(super.field9659, 0, super.field9670, this.field3856, this.field3862, 0, arg7, 5121, arg6, 0);
            this.method3892(false, -29829);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3898(true, 33);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIII)V", line = 142)
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 > -52) {
            field3867 = null;
        }
        ++field3858;
        if (arg7 >= 0 && arg0 >= 0 && ~arg7 > ~(class409.field5183 + -1) && ~arg0 > ~(class543.field7597 + -1)) {
            if (class197.field2689 == null) {
                return;
            }
            if (~arg4 == -1) {
                class457 var8 = (class457) class527.method3046(arg5, arg7, arg0);
                class457 var9 = (class457) class586.method3330(arg5, arg7, arg0);
                if (var8 != null && arg6 != 2) {
                    if (var8 instanceof class359) {
                        ((class359) var8).field4647.method1755(-128, arg2);
                    } else {
                        class52.method395(arg5, arg0, arg4, var8.method745((byte) -109), arg1, arg6, arg2, arg7, -2);
                    }
                }
                if (var9 != null) {
                    if (!(var9 instanceof class359)) {
                        class52.method395(arg5, arg0, arg4, var9.method745((byte) 30), arg1, arg6, arg2, arg7, -2);
                        return;
                    }
                    ((class359) var9).field4647.method1755(-75, arg2);
                    return;
                }
                return;
            }
            if (~arg4 != -2) {
                if (~arg4 != -3) {
                    if (~arg4 == -4) {
                        class457 var10 = (class457) class146.method1046(arg5, arg7, arg0);
                        if (var10 != null) {
                            if (!(var10 instanceof class718)) {
                                class52.method395(arg5, arg0, arg4, var10.method745((byte) 56), arg1, arg6, arg2, arg7, -2);
                                return;
                            }
                            ((class718) var10).field10009.method1755(-75, arg2);
                            return;
                        }
                    }
                } else {
                    class457 var11 = (class457) class290.method1735(arg5, arg7, arg0, field3870 != null ? field3870 : (field3870 = method1764("rca")));
                    if (var11 == null) {
                        return;
                    }
                    if (~arg6 == -12) {
                        arg6 = 10;
                    }
                    if (!(var11 instanceof class214)) {
                        class52.method395(arg5, arg0, arg4, var11.method745((byte) 41), arg1, arg6, arg2, arg7, -2);
                        return;
                    }
                    ((class214) var11).field2838.method1755(-33, arg2);
                }
                return;
            }
            class457 var12 = (class457) class67.method624(arg5, arg7, arg0);
            if (var12 != null) {
                if (var12 instanceof class625) {
                    ((class625) var12).field8584.method1755(-47, arg2);
                    return;
                }
                int var13 = var12.method745((byte) 88);
                if (arg6 != 4 && arg6 != 5) {
                    if (arg6 == 6) {
                        class52.method395(arg5, arg0, arg4, var13, arg1 + 4, 4, arg2, arg7, -2);
                        return;
                    }
                    if (arg6 != 7) {
                        if (arg6 == 8) {
                            class52.method395(arg5, arg0, arg4, var13, arg1 + 4, 4, arg2, arg7, -2);
                            class52.method395(arg5, arg0, arg4, var13, (3 & arg1 + 2) - -4, 4, arg2, arg7, -2);
                            return;
                        }
                    } else {
                        class52.method395(arg5, arg0, arg4, var13, (3 & arg1 + 2) + 4, 4, arg2, arg7, -2);
                    }
                    return;
                }
                class52.method395(arg5, arg0, arg4, var13, arg1, 4, arg2, arg7, -2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)V", line = 262)
    public static void method1759(int arg0) {
        field3861 = null;
        if (arg0 >= -24) {
            field3867 = null;
        }
        field3867 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)V", line = 273)
    public final void method1760(int arg0, int arg1, int arg2, int arg3) {
        ++field3865;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field9659, super.field9663, arg3);
        this.field3859 = arg2;
        this.field3860 = arg0;
        if (arg1 != 21271) {
            field3867 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)V", line = 341)
    public final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3863;
        int var8 = -arg1 - arg5 + super.field9655.field6671;
        if (arg4 != 4) {
            this.method1760(19, -33, -108, -69);
        }
        super.field9655.method2850(-69, this);
        OpenGL.glCopyTexSubImage2D(super.field9659, 0, arg6, -arg0 - arg1 + this.field3862, arg3, var8, arg2, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Llk;", line = 356)
    public static final class589 method1762(int arg0) {
        ++field3857;
        class589 var1 = class659.method3711(arg0 + 6331);
        var1.field8246 = null;
        var1.field8248 = 0;
        if (arg0 != -6331) {
            method1759(1);
        }
        var1.field8251 = new class180(5000);
        return var1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ[BIIIIBII)V", line = 430)
    public final void method1763(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (~arg3 == -1) {
            arg3 = arg8;
        }
        ++field3866;
        if (arg1) {
            int var11 = class686.method3854(arg9, 0);
            int var12 = arg8 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; ~var15 > ~arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg6 - (var15 + 1)) * var13 - -arg4;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field9655.method2850(-119, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field9659, 0, arg0, arg5, arg8, arg6, arg9, 5121, arg2, arg4);
        if (arg3 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg7 <= 23) {
            this.method1763(-42, false, (byte[]) null, -72, -18, 68, -29, (byte) -91, 79, 20);
        }
    }
}
