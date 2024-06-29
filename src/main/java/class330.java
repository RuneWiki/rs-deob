import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class330 extends class84 implements class145 {

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!saa", name = "G", descriptor = "I")
    private int field4217;

    @OriginalMember(owner = "client!saa", name = "E", descriptor = "Lqk;")
    public static class16 field4215 = new class16();

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!saa", name = "F", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!saa", name = "H", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!saa", name = "I", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!saa", name = "J", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!saa", name = "K", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!saa", name = "L", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!saa", name = "M", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!saa", name = "N", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)I", line = 5)
    public final int method815(int arg0) {
        if (arg0 != 11283) {
            this.method803(-52);
        }
        ++field4221;
        return this.field4217;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ltk;IIZ[III)V", line = 16)
    public class330(class347 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class269.field3396, class285.field3589, arg1 * arg2, arg3);
        this.field4214 = arg2;
        this.field4217 = arg1;
        super.field1159.method2396(22357, this);
        if (arg3 && arg6 == 0 && ~arg5 == -1) {
            this.method695(arg1, super.field1141, arg2, arg4, 0);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field1141, 0, 6408, this.field4217, this.field4214, 0, 32993, super.field1159.field4487, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(FI)F", line = 35)
    public final float method808(float arg0, int arg1) {
        if (arg1 != 9347) {
            return 0.44088134F;
        } else {
            ++field4211;
            return arg0 / (float) this.field4214;
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(Z)V", line = 46)
    public static void method1912(boolean arg0) {
        field4215 = null;
        if (!arg0) {
            field4215 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BZZ)V", line = 56)
    public final void method813(byte arg0, boolean arg1, boolean arg2) {
        ++field4210;
        super.field1159.method2396(22357, this);
        OpenGL.glTexParameteri(super.field1141, 10242, arg2 ? 10497 : 33071);
        int var4 = -124 % ((7 - arg0) / 50);
        OpenGL.glTexParameteri(super.field1141, 10243, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I", line = 68)
    public final int method806(int arg0) {
        ++field4218;
        return arg0 <= 116 ? 66 : this.field4214;
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(B)V", line = 82)
    public static final void method1913(byte arg0) {
        ++field4213;
        if (class520.field7296 != null) {
            class520.field7296.method478((byte) 106);
            class520.field7296 = null;
            class66.field952 = null;
        }
        int var1 = -31 % ((arg0 - 59) / 47);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IF)F", line = 99)
    public final float method814(int arg0, float arg1) {
        ++field4216;
        return arg0 != 20275 ? 0.5683418F : arg1 / (float) this.field4217;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZJ)V", line = 114)
    public static final void method1914(boolean arg0, long arg1) {
        ++field4220;
        int var3 = class289.field3789;
        int var4 = class116.field1724;
        if (arg0) {
            field4224 = -2;
        }
        if (class758.field10586 != var3) {
            int var5 = -class758.field10586 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 != 0) {
                    if (~var5 < ~var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (var6 != 0) {
                if (var6 > var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class758.field10586 += var6;
        }
        class521.field7309 += (float) arg1 * class749.field10471 / 40.0F * 8.0F;
        if (class347.field4454 != var4) {
            int var7 = -class347.field4454 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (~var8 != -1) {
                    if (~var8 > ~var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (~var8 != -1) {
                if (~var8 < ~var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class347.field4454 += var8;
        }
        class101.field1404 += (float) arg1 * class631.field8710 / 40.0F * 8.0F;
        class176.method1208(15030);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ltk;Let;IIZ[FII)V", line = 195)
    public class330(class347 arg0, class596 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class285.field3593, arg2 * arg3, arg4);
        this.field4217 = arg2;
        this.field4214 = arg3;
        super.field1159.method2396(22357, this);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method706(super.field1141, arg2, arg5, -1, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field1141, 0, this.method702(96), arg2, arg3, 0, class705.method3951(super.field1161, 105), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ltk;Let;IIZ[BII)V", line = 215)
    public class330(class347 arg0, class596 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class285.field3589, arg2 * arg3, arg4);
        this.field4217 = arg2;
        this.field4214 = arg3;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method699((byte) 127, super.field1141, arg3, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field1141, 0, this.method702(124), arg2, arg3, 0, class705.method3951(super.field1161, -38), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I[FILet;BIIII)V", line = 241)
    public final void method1915(int arg0, float[] arg1, int arg2, class596 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        super.field1159.method2396(22357, this);
        ++field4219;
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Df(super.field1141, 0, arg6, arg0, arg5, arg8, class705.method3951(arg3, arg4 ^ 109), 5121, arg1, arg2);
        if (arg4 != -20) {
            this.method813((byte) -67, true, true);
        }
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ltk;Let;Lwha;II)V", line = 256)
    public class330(class347 arg0, class596 arg1, class285 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field4217 = arg3;
        this.field4214 = arg4;
        super.field1159.method2396(22357, this);
        OpenGL.glTexImage2Dub(super.field1141, 0, this.method702(104), arg3, arg4, 0, class705.method3951(super.field1161, 55), class93.method753(-101, super.field1142), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILet;III[BIII)V", line = 267)
    public final void method805(int arg0, class596 arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -8981) {
            this.field4214 = 37;
        }
        ++field4222;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Dub(super.field1141, 0, arg4, arg7, arg6, arg0, class705.method3951(arg1, -31), 5121, arg5, arg8);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII[IIII)V", line = 283)
    public final void method812(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        ++field4223;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Di(super.field1141, 0, arg0, arg3, arg5, arg6, 32993, super.field1159.field4487, arg4, arg2);
        OpenGL.glPixelStorei(3314, 0);
        if (arg7 != -25782) {
            this.field4217 = -122;
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)Z", line = 297)
    public final boolean method803(int arg0) {
        ++field4209;
        if (arg0 >= -36) {
            field4215 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II[IIIII)V", line = 309)
    public final void method807(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4212;
        int[] var8 = new int[this.field4217 * this.field4214];
        super.field1159.method2396(22357, this);
        if (arg5 != 19229) {
            this.method805(-44, (class596) null, -17, -46, -110, (byte[]) null, -20, 42, -115);
        }
        OpenGL.glGetTexImagei(super.field1141, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; var9 < arg4; ++var9) {
            class135.method995(var8, (arg4 + arg6 + -var9 - 1) * this.field4217, arg2, arg0 * var9 + arg3, arg0);
        }
    }
}
