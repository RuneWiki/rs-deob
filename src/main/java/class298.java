import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class298 extends class197 {

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    private int field4007 = -1;

    @OriginalMember(owner = "client!saa", name = "F", descriptor = "I")
    private int field4010 = -1;

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!saa", name = "E", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "[I")
    public static int[] field4002 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "Ljk;")
    public static class585 field4008 = new class585(65, 0);

    @OriginalMember(owner = "client!saa", name = "L", descriptor = "[I")
    public static int[] field4016 = new int[120];

    @OriginalMember(owner = "client!saa", name = "N", descriptor = "Lwo;")
    public static class690 field4018;

    @OriginalMember(owner = "client!saa", name = "P", descriptor = "Ljk;")
    public static class585 field4020;

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!saa", name = "G", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!saa", name = "H", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!saa", name = "I", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!saa", name = "J", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!saa", name = "K", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!saa", name = "O", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!saa", name = "M", descriptor = "Lr;")
    public static class165 field4017;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field4016[var1] = var0 / 4;
        }
        field4018 = new class690(85, 6);
        field4020 = new class585(0, 8);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method1766(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, super.field2380, super.field2397, arg2);
        ++field4013;
        this.field4010 = arg3;
        this.field4007 = arg1;
        if (arg0 != 2216) {
            field4002 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZZI)V", line = 19)
    public final void method1767(boolean arg0, boolean arg1, int arg2) {
        if (arg2 == 10242) {
            if (super.field2380 == 3553) {
                super.field2388.method2932(true, this);
                OpenGL.glTexParameteri(super.field2380, 10242, arg0 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field2380, 10243, arg1 ? 10497 : 33071);
            }
            ++field4004;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIZZIII[BI)V", line = 36)
    public final void method1768(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (arg4) {
            if (~arg0 == -1) {
                arg0 = arg5;
            }
            ++field4011;
            if (arg3) {
                int var11 = class665.method3755(1, arg9);
                int var12 = arg5 * var11;
                int var13 = arg0 * var11;
                byte[] var14 = new byte[arg2 * var12];
                for (int var15 = 0; arg2 > var15; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (-var15 + arg2 + -1) * var13 + arg7;
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var14[var16++] = arg8[var17++];
                    }
                }
                arg8 = var14;
            }
            super.field2388.method2932(arg4, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg0 != arg5) {
                OpenGL.glPixelStorei(3314, arg0);
            }
            OpenGL.glTexSubImage2Dub(super.field2380, 0, arg1, arg6, arg5, arg2, arg9, 5121, arg8, arg7);
            if (arg0 != arg5) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkga;IIIIZ[BIZ)V", line = 98)
    public class298(class506 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4006 = arg3;
        this.field4009 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2388.method2932(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2380 != -34038) {
            class518.method3069(arg6, (byte) -49, arg7, arg4, arg2, arg3, arg1);
            this.method1208(true, (byte) 14);
        } else {
            OpenGL.glTexImage2Dub(super.field2380, 0, super.field2394, this.field4006, this.field4009, 0, arg7, 5121, arg6, 0);
            this.method1208(false, (byte) 14);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkga;IIIIZ[FI)V", line = 154)
    public class298(class506 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4006 = arg3;
        this.field4009 = arg4;
        super.field2388.method2932(true, this);
        if (arg5 && super.field2380 != 34037) {
            class139.method919(arg4, arg3, arg6, (byte) -61, arg1, arg2, arg7);
            this.method1208(true, (byte) 14);
        } else {
            OpenGL.glTexImage2Df(super.field2380, 0, super.field2394, this.field4006, this.field4009, 0, arg7, 5126, arg6, 0);
            this.method1208(false, (byte) 14);
        }
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I[IIIZIIIB)V", line = 177)
    public final void method1769(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg2 == 0) {
            arg2 = arg6;
        }
        ++field4015;
        if (arg4) {
            int[] var10 = new int[arg6 * arg7];
            for (int var11 = 0; arg7 > var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 + arg7 + -1) * arg2 + arg3;
                for (int var14 = 0; var14 < arg6; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field2388.method2932(true, this);
        if (arg8 != 82) {
            this.field4010 = -62;
        }
        if (~arg2 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field2380, 0, arg0, arg5, arg6, arg7, 32993, super.field2388.field7310, arg1, arg3);
        if (~arg2 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "(I)V", line = 231)
    public static void method1770(int arg0) {
        field4002 = null;
        field4016 = null;
        field4020 = null;
        field4018 = null;
        field4017 = null;
        field4008 = null;
        if (arg0 != -7650) {
            method1770(-128);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZIIZ)I", line = 246)
    public static final int method1771(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        ++field4003;
        class122 var5 = class673.method3829(1, arg4, arg0);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            if (arg2 != 16400) {
                method1772(15, -105, (class17) null);
            }
            for (int var7 = 0; ~var7 > ~var5.field1574.length; ++var7) {
                if (~var5.field1574[var7] <= -1 && ~class65.field1021.field310 < ~var5.field1574[var7]) {
                    class238 var8 = class65.field1021.method178(false, var5.field1574[var7]);
                    int var9 = var8.method1459(class582.field8483.method2536((byte) -114, arg3).field2253, -7356, arg3);
                    if (arg1) {
                        var6 += var5.field1572[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILn;)Ljava/lang/String;", line = 285)
    public static final String method1772(int arg0, int arg1, class17 arg2) {
        ++field4012;
        if (!client.method1659(arg2).method994(true, arg0) && arg2.field338 == null) {
            return null;
        } else if (arg1 != 15073) {
            return null;
        } else if (arg2.field339 != null && ~arg0 > ~arg2.field339.length && arg2.field339[arg0] != null && arg2.field339[arg0].trim().length() != 0) {
            return arg2.field339[arg0];
        } else {
            return class679.field9734 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkga;IIIIZ[IZ)V", line = 308)
    public class298(class506 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4006 = arg3;
        this.field4009 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - (var10 - -1)) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2388.method2932(true, this);
        if (arg5 && ~super.field2380 != -34038) {
            class375.method2180(super.field2380, this.field4006, super.field2388.field7310, 32993, super.field2394, 0, this.field4009, arg6);
            this.method1208(true, (byte) 14);
        } else {
            OpenGL.glTexImage2Di(super.field2380, 0, super.field2394, this.field4006, this.field4009, 0, 32993, super.field2388.field7310, arg6, 0);
            this.method1208(false, (byte) 14);
        }
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkga;IIIII)V", line = 382)
    public class298(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4006 = arg4;
        this.field4009 = arg5;
        int var7 = -arg3 + -arg5 + super.field2388.field7059;
        super.field2388.method2932(true, this);
        OpenGL.glCopyTexImage2D(super.field2380, 0, super.field2394, arg2, var7, arg4, arg5, 0);
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lkga;IIII)V", line = 409)
    public class298(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4009 = arg4;
        this.field4006 = arg3;
        super.field2388.method2932(true, this);
        OpenGL.glTexImage2Dub(super.field2380, 0, super.field2394, arg3, arg4, 0, class215.method1313((byte) -101, super.field2394), 5121, (byte[]) null, 0);
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 368)
    public final void method1160(byte arg0) {
        ++field4014;
        int var2 = 120 % ((arg0 - -50) / 54);
        OpenGL.glFramebufferTexture2DEXT(this.field4010, this.field4007, super.field2380, 0, 0);
        this.field4010 = -1;
        this.field4007 = -1;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIII)V", line = 397)
    public final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4005;
        int var8 = -arg0 + -arg6 + super.field2388.field7059;
        super.field2388.method2932(true, this);
        OpenGL.glCopyTexSubImage2D(super.field2380, arg1, arg4, -arg2 - arg0 + this.field4009, arg5, var8, arg3, arg0);
        OpenGL.glFlush();
    }
}
