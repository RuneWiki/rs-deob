import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class503 extends class322 implements class228 {

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    private int field7232;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    private int field7236;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lpr;")
    public static class407 field7237 = new class407(30, -1);

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Z")
    public static boolean field7243 = false;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII[BLvj;III)V", line = 3)
    public final void method1325(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class402 arg5, int arg6, int arg7, int arg8) {
        ++field7233;
        super.field4183.method2696(-2, this);
        if (arg0 != -24967) {
            this.field7236 = 21;
        }
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexSubImage2Dub(super.field4190, 0, arg8, arg1, arg2, arg3, class590.method3313((byte) 71, arg5), 5121, arg4, arg7);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZ)V", line = 19)
    public final void method1331(int arg0, boolean arg1, boolean arg2) {
        super.field4183.method2696(-2, this);
        if (arg0 == -7684) {
            ++field7246;
            OpenGL.glTexParameteri(super.field4190, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field4190, 10243, arg2 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method1327(int arg0) {
        if (arg0 != 12832) {
            this.field7236 = 36;
        }
        ++field7235;
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I", line = 46)
    public final int method1328(int arg0) {
        ++field7244;
        if (arg0 >= -13) {
            this.field7236 = 0;
        }
        return this.field7232;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(FI)F", line = 57)
    public final float method1332(float arg0, int arg1) {
        ++field7241;
        if (arg1 != 30994) {
            field7243 = true;
        }
        return arg0 / (float) this.field7236;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([FIBILvj;IIII)V", line = 68)
    public final void method2891(float[] arg0, int arg1, byte arg2, int arg3, class402 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7239;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3314, arg1);
        int var10 = -67 / ((arg2 - -32) / 40);
        OpenGL.glTexSubImage2Df(super.field4190, 0, arg5, arg7, arg8, arg3, class590.method3313((byte) 71, arg4), 5121, arg0, arg6);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 81)
    public static final void method2892(int arg0) {
        ++field7240;
        class259.field3300.method999(false);
        for (int var1 = 0; var1 < 32; ++var1) {
            class41.field437[var1] = 0L;
        }
        if (arg0 != 10497) {
            field7237 = null;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class690.field9739[var2] = 0L;
        }
        class359.field4707 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lnfa;Lvj;Lnb;II)V", line = 107)
    public class503(class621 arg0, class402 arg1, class271 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field7232 = arg4;
        this.field7236 = arg3;
        super.field4183.method2696(-2, this);
        OpenGL.glTexImage2Dub(super.field4190, 0, this.method1819((byte) -119), arg3, arg4, 0, class590.method3313((byte) 71, super.field4176), class680.method3799(super.field4193, (byte) -42), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lnfa;Lvj;IIZ[BII)V", line = 122)
    public class503(class621 arg0, class402 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class271.field3429, arg2 * arg3, arg4);
        this.field7232 = arg3;
        this.field7236 = arg2;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && arg6 == 0) {
            this.method1821(arg5, arg3, arg2, (byte) -52, super.field4190);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field4190, 0, this.method1819((byte) -105), arg2, arg3, 0, class590.method3313((byte) 71, super.field4176), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V", line = 144)
    public static void method2893(int arg0) {
        if (arg0 == 19601) {
            field7237 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIB[I)V", line = 156)
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7) {
        int var9 = -46 % ((arg6 - 58) / 58);
        ++field7245;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field4190, 0, arg4, arg0, arg5, arg3, 32993, super.field4183.field8814, arg7, arg1);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V", line = 172)
    public static final void method2894(int arg0, byte arg1) {
        if (arg1 > -95) {
            field7243 = false;
        }
        class580.field8249 = -1;
        ++field7242;
        if (arg0 != 37) {
            if (arg0 == 50) {
                class637.field9024 = 4.0F;
            } else if (arg0 == 75) {
                class637.field9024 = 6.0F;
            } else if (~arg0 != -101) {
                if (~arg0 == -201) {
                    class637.field9024 = 16.0F;
                }
            } else {
                class637.field9024 = 8.0F;
            }
        } else {
            class637.field9024 = 3.0F;
        }
        class580.field8249 = -1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)F", line = 204)
    public final float method1326(int arg0, float arg1) {
        ++field7234;
        if (arg0 != 30658) {
            field7237 = null;
        }
        return arg1 / (float) this.field7232;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I", line = 218)
    public final int method1330(int arg0) {
        ++field7238;
        return arg0 != -32601 ? -127 : this.field7236;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lnfa;IIZ[III)V", line = 229)
    public class503(class621 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class581.field8260, class271.field3429, arg1 * arg2, arg3);
        this.field7236 = arg1;
        this.field7232 = arg2;
        super.field4183.method2696(-2, this);
        if (arg3 && ~arg6 == -1 && ~arg5 == -1) {
            this.method1818(arg2, -2061612424, super.field4190, arg1, arg4);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field4190, 0, 6408, this.field7236, this.field7232, 0, 32993, super.field4183.field8814, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lnfa;Lvj;IIZ[FII)V", line = 252)
    public class503(class621 arg0, class402 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class271.field3433, arg2 * arg3, arg4);
        this.field7232 = arg3;
        this.field7236 = arg2;
        super.field4183.method2696(-2, this);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method1823(arg2, super.field4190, arg3, (byte) -63, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field4190, 0, this.method1819((byte) 29), arg2, arg3, 0, class590.method3313((byte) 71, super.field4176), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
