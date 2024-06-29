import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class373 extends class188 {

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    private int field5149 = -1;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    private int field5145 = -1;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field5153 = 0;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public final void method1319(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field5149, this.field5145, super.field2899, 0, 0);
        if (arg0 != -17115) {
            this.field5145 = -65;
        }
        ++field5143;
        this.field5149 = -1;
        this.field5145 = -1;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqfa;IIII)V")
    public class373(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5152 = arg4;
        this.field5144 = arg3;
        super.field2905.method808((byte) 34, this);
        OpenGL.glTexImage2Dub(super.field2899, 0, super.field2906, arg3, arg4, 0, class434.method2600(-6407, super.field2906), 5121, (byte[]) null, 0);
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
    public static final void method2311(int arg0) {
        if (arg0 == 0) {
            ++field5146;
            for (class506 var1 = (class506) class240.field3597.method1731((byte) -125); var1 != null; var1 = (class506) class240.field3597.method1724(0)) {
                if (var1.field7194) {
                    var1.method3387((byte) 114);
                } else {
                    var1.field7197 = true;
                    if (var1.field7189 >= 0 && var1.field7192 >= 0 && var1.field7189 < class768.field10571 && class350.field4898 > var1.field7192) {
                        class49.method349((byte) 97, var1);
                    }
                }
            }
            for (class506 var2 = (class506) class779.field10697.method1731((byte) -123); var2 != null; var2 = (class506) class779.field10697.method1724(arg0)) {
                if (!var2.field7194) {
                    var2.field7197 = true;
                } else {
                    var2.method3387((byte) -125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqfa;IIIIZ[BIZ)V")
    public class373(class106 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5152 = arg4;
        this.field5144 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 + -var11) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2905.method808((byte) 34, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2899 != -34038) {
            class107.method826(true, arg2, arg7, arg4, arg3, arg1, arg6);
            this.method1314(113, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2899, 0, super.field2906, this.field5144, this.field5152, 0, arg7, 5121, arg6, 0);
            this.method1314(104, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBI)V")
    public final void method2312(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, super.field2899, super.field2900, arg0);
        ++field5141;
        this.field5149 = arg3;
        this.field5145 = arg1;
        int var5 = 34 / ((65 - arg2) / 50);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BIIZIIIIB)V")
    public final void method2313(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (~arg6 == -1) {
            arg6 = arg3;
        }
        ++field5147;
        int var11 = -5 / ((27 - arg9) / 53);
        if (arg4) {
            int var12 = class397.method2449(4, arg8);
            int var13 = arg3 * var12;
            int var14 = arg6 * var12;
            byte[] var15 = new byte[arg7 * var13];
            for (int var16 = 0; arg7 > var16; ++var16) {
                int var17 = var13 * var16;
                int var18 = (arg7 - var16 + -1) * var14 - -arg5;
                for (int var19 = 0; ~var19 > ~var13; ++var19) {
                    var15[var17++] = arg1[var18++];
                }
            }
            arg1 = var15;
        }
        super.field2905.method808((byte) 34, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Dub(super.field2899, 0, arg0, arg2, arg3, arg7, arg8, 5121, arg1, arg5);
        if (arg3 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqfa;IIIIZ[FI)V")
    public class373(class106 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5152 = arg4;
        this.field5144 = arg3;
        super.field2905.method808((byte) 34, this);
        if (arg5 && ~super.field2899 != -34038) {
            class111.method850(arg6, arg4, arg2, arg1, 1, arg3, arg7);
            this.method1314(123, true);
        } else {
            OpenGL.glTexImage2Df(super.field2899, 0, super.field2906, this.field5144, this.field5152, 0, arg7, 5126, arg6, 0);
            this.method1314(120, false);
        }
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZI)V")
    public final void method2314(boolean arg0, boolean arg1, int arg2) {
        ++field5142;
        if (arg2 != 0) {
            field5148 = -47;
        }
        if (super.field2899 == 3553) {
            super.field2905.method808((byte) 34, this);
            OpenGL.glTexParameteri(super.field2899, 10242, !arg0 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2899, 10243, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[IIIIIIIZ)V")
    public final void method2315(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field5150;
        if (~arg0 == -1) {
            arg0 = arg6;
        }
        if (arg8) {
            int[] var10 = new int[arg4 * arg6];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 - 1 + arg4) * arg0 - -arg5;
                for (int var14 = 0; arg6 > var14; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field2905.method808((byte) 34, this);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field2899, 0, arg2, -arg4 + this.field5152 + -arg7, arg6, arg4, 32993, super.field2905.field1474, arg1, arg5);
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg3 > -91) {
            this.method2314(false, true, 94);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqfa;IIIII)V")
    public class373(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5144 = arg4;
        this.field5152 = arg5;
        int var7 = -arg3 + -arg5 + super.field2905.field1223;
        super.field2905.method808((byte) 34, this);
        OpenGL.glCopyTexImage2D(super.field2899, 0, super.field2906, arg2, var7, arg4, arg5, 0);
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIBII)V")
    public final void method2316(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field5154;
        int var8 = -arg3 + super.field2905.field1223 + -arg6;
        if (arg4 != -55) {
            field5148 = 109;
        }
        super.field2905.method808((byte) 34, this);
        OpenGL.glCopyTexSubImage2D(super.field2899, 0, arg5, -arg2 + -arg3 + this.field5152, arg0, var8, arg1, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqfa;IIIIZ[IIIZ)V")
    public class373(class106 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5144 = arg3;
        this.field5152 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; var12 < arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + arg4 + -1) * arg3;
                for (int var15 = 0; var15 < arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2905.method808((byte) 34, this);
        if (super.field2899 != 34037 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
            class665.method3784(this.field5152, super.field2899, (byte) 51, this.field5144, super.field2905.field1474, arg6, super.field2906, 32993);
            this.method1314(118, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2899, 0, super.field2906, this.field5144, this.field5152, 0, 32993, super.field2905.field1474, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1314(123, false);
        }
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
    public static final void method2317(int arg0, int arg1) {
        class104.field1206 = 2;
        ++field5151;
        int var2 = -91 / ((-5 - arg1) / 33);
        class55.field709 = arg0;
        String var3 = null;
        if (class378.field5220 != null) {
            class494 var4 = new class494(class378.field5220);
            var3 = class288.method1856(var4.method3005(-98), 37);
            class189.field2920 = var4.method3005(-78);
        }
        if (var3 == null) {
            class757.method4204(35, 1);
        } else {
            class642.method3660(11084, false, true, "", var3);
        }
    }
}
