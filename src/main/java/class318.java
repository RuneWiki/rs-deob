import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class318 extends class48 implements class297 {

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    private int field4535;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Llaa;Lqda;IIZ[BII)V", line = 6)
    public class318(class122 arg0, class105 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class408.field5668, arg2 * arg3, arg4);
        this.field4535 = arg3;
        this.field4530 = arg2;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method343(arg5, (byte) -64, arg3, super.field618, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field618, 0, this.method342(true), arg2, arg3, 0, class711.method3993(super.field626, true), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[FLqda;IIIIII)V", line = 31)
    public final void method1928(int arg0, float[] arg1, class105 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4533;
        if (arg0 == 6408) {
            super.field602.method823(this, -8423);
            OpenGL.glPixelStorei(3314, arg8);
            OpenGL.glTexSubImage2Df(super.field618, 0, arg5, arg4, arg7, arg3, class711.method3993(arg2, true), 5121, arg1, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILqda;IBIIII[B)V", line = 45)
    public final void method593(int arg0, class105 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field4538;
        super.field602.method823(this, -8423);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg0);
        OpenGL.glTexSubImage2Dub(super.field618, 0, arg5, arg7, arg2, arg6, class711.method3993(arg1, true), 5121, arg8, arg4);
        if (arg3 >= -114) {
            this.method594(48, 92, (int[]) null, -46, -13, -43, 70);
        }
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Llaa;Lqda;IIZ[FII)V", line = 61)
    public class318(class122 arg0, class105 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class408.field5672, arg2 * arg3, arg4);
        this.field4535 = arg3;
        this.field4530 = arg2;
        super.field602.method823(this, -8423);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method347(arg3, (byte) 72, super.field618, arg2, arg5);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field618, 0, this.method342(true), arg2, arg3, 0, class711.method3993(super.field626, true), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Llaa;IIZ[III)V", line = 81)
    public class318(class122 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class315.field4498, class408.field5668, arg1 * arg2, arg3);
        this.field4535 = arg2;
        this.field4530 = arg1;
        super.field602.method823(this, -8423);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method348(arg4, super.field618, arg2, false, arg1);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field618, 0, 6408, this.field4530, this.field4535, 0, 32993, super.field602.field2046, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I", line = 100)
    public final int method598(byte arg0) {
        ++field4532;
        if (arg0 != 111) {
            this.method594(74, -57, (int[]) null, -104, 76, 19, -74);
        }
        return this.field4535;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII[IIB)V", line = 111)
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7) {
        super.field602.method823(this, -8423);
        ++field4540;
        if (arg7 < 57) {
            this.method1928(-59, (float[]) null, (class105) null, -116, 87, -80, 110, 36, -90);
        }
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Di(super.field618, 0, arg2, arg0, arg4, arg6, 32993, super.field602.field2046, arg5, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I", line = 126)
    public final int method592(byte arg0) {
        ++field4541;
        int var2 = -9 / ((arg0 - 60) / 54);
        return this.field4530;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(FI)F", line = 137)
    public final float method597(float arg0, int arg1) {
        ++field4539;
        int var3 = -90 % ((-25 - arg1) / 45);
        return arg0 / (float) this.field4535;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[IIIII)V", line = 148)
    public final void method594(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4531;
        int[] var8 = new int[this.field4535 * this.field4530];
        super.field602.method823(this, -8423);
        if (arg5 != 12679) {
            this.field4535 = 105;
        }
        OpenGL.glGetTexImagei(super.field618, 0, 32993, 5121, var8, 0);
        for (int var9 = 0; ~var9 > ~arg1; ++var9) {
            class335.method2016(var8, (-var9 + arg3 - (-arg1 + 1)) * this.field4530, arg2, arg4 - -(arg6 * var9), arg6);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z", line = 171)
    public final boolean method599(byte arg0) {
        int var2 = -9 % ((48 - arg0) / 53);
        ++field4529;
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZZ)V", line = 181)
    public final void method595(int arg0, boolean arg1, boolean arg2) {
        super.field602.method823(this, -8423);
        ++field4542;
        if (arg0 != 1645) {
            this.field4530 = -103;
        }
        OpenGL.glTexParameteri(super.field618, 10242, !arg2 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field618, 10243, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V", line = 196)
    public static final void method1929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class317[] var7 = class27.field435;
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class317 var9 = var7[var8];
            if (var9 != null && ~var9.field4526 == -3) {
                class494.method2791(var9.field4517, arg4 >> 1, arg0 >> 1, arg6, var9.field4520, var9.field4522 * 2, var9.field4516, arg1, (byte) -105);
                if (~class259.field3621[0] < 0 && ~(class29.field474 % 20) > -11) {
                    class133 var10 = class308.field4434[var9.field4524];
                    int var11 = class259.field3621[0] + -12 + arg2;
                    int var12 = arg3 - -class259.field3621[1] + -28;
                    var10.method1035(var11, var12);
                    class62.method539(var11 + var10.method1036(), var11, (byte) -54, var10.method1048() + var12, var12);
                }
            }
        }
        if (arg5 < -5) {
            ++field4536;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 235)
    public static final String method1930(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field4534;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg3 > -50) {
            return null;
        } else {
            for (int var6 = 0; ~var6 > ~arg1; ++var6) {
                int var7 = arg2[arg0 + var6] & 255;
                if (~var7 != -1) {
                    if (var7 >= 128 && ~var7 > -161) {
                        char var8 = class540.field7158[var7 - 128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Llaa;Lqda;Lns;II)V", line = 279)
    public class318(class122 arg0, class105 arg1, class408 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field4530 = arg3;
        this.field4535 = arg4;
        super.field602.method823(this, -8423);
        OpenGL.glTexImage2Dub(super.field618, 0, this.method342(true), arg3, arg4, 0, class711.method3993(super.field626, true), class53.method367(5126, super.field623), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IF)F", line = 291)
    public final float method591(int arg0, float arg1) {
        if (arg0 != -2092) {
            return 1.0554568F;
        } else {
            ++field4537;
            return arg1 / (float) this.field4530;
        }
    }
}
