import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class393 extends class14 {

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private int field5970 = -1;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field5981 = -1;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[B")
    public static byte[] field5974 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lpg;")
    public static class492 field5969 = new class492(40, 12);

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Lgo;")
    public static class331 field5983 = null;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILjo;Ljo;)V")
    public static final void method2414(int arg0, int arg1, int arg2, class255 arg3, class255 arg4) {
        class420 var5 = class422.method2542(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6277 = arg3;
            var5.field6283 = arg4;
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method2415(int arg0) {
        field5983 = null;
        if (arg0 < -2) {
            field5974 = null;
            field5969 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbv;IIIIZ[FI)V")
    public class393(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5980 = arg3;
        this.field5979 = arg4;
        super.field241.method1787(this, (byte) 121);
        if (arg5 && super.field240 != 34037) {
            class111.method733(arg4, arg3, arg1, arg6, (byte) -39, arg2, arg7);
            this.method126(true, (byte) 123);
        } else {
            OpenGL.glTexImage2Df(super.field240, 0, super.field223, this.field5980, this.field5979, 0, arg7, 5126, arg6, 0);
            this.method126(false, (byte) 118);
        }
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
    public static final boolean method2416(int arg0, int arg1, int arg2) {
        int var3 = -75 / ((arg0 - -62) / 61);
        ++field5978;
        return ~(arg1 & 32768) != -1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZZ)V")
    public final void method2417(boolean arg0, boolean arg1, boolean arg2) {
        if (super.field240 == 3553) {
            super.field241.method1787(this, (byte) 121);
            OpenGL.glTexParameteri(super.field240, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field240, 10243, !arg1 ? 33071 : 10497);
        }
        if (!arg0) {
            this.method2422(93, (byte[]) null, 32, -111, 81, -83, -23, true, true, -96);
        }
        ++field5976;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbv;IIIIZ[BIZ)V")
    public class393(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5980 = arg3;
        this.field5979 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field241.method1787(this, (byte) 121);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field240 != -34038) {
            class88.method573(arg4, arg7, arg6, arg3, arg2, arg1, -75);
            this.method126(true, (byte) -50);
        } else {
            OpenGL.glTexImage2Dub(super.field240, 0, super.field223, this.field5980, this.field5979, 0, arg7, 5121, arg6, 0);
            this.method126(false, (byte) 124);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbv;IIIIZ[IZ)V")
    public class393(class282 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field5980 = arg3;
        this.field5979 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 - 1 + arg4) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field241.method1787(this, (byte) 121);
        if (arg5 && ~super.field240 != -34038) {
            class352.method2226(true, super.field223, super.field240, super.field241.field4121, this.field5980, arg6, this.field5979, 32993);
            this.method126(true, (byte) 18);
        } else {
            OpenGL.glTexImage2Di(super.field240, 0, super.field223, this.field5980, this.field5979, 0, 32993, super.field241.field4121, arg6, 0);
            this.method126(false, (byte) -81);
        }
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbv;IIII)V")
    public class393(class282 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field5979 = arg4;
        this.field5980 = arg3;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glTexImage2Dub(super.field240, 0, super.field223, arg3, arg4, 0, class501.method2996(super.field223, (byte) 83), 5121, (byte[]) null, 0);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
    public final void method2418(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field240, super.field230, arg1);
        ++field5971;
        this.field5970 = arg0;
        this.field5981 = arg2;
        if (arg3 < 77) {
            this.method2419(95, 17, 77, 104, 56, 35, 98);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
    public final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5972;
        int var8 = -124 % ((16 - arg4) / 49);
        int var9 = super.field241.field3964 - (arg1 + arg6);
        super.field241.method1787(this, (byte) 121);
        OpenGL.glCopyTexSubImage2D(super.field240, 0, arg2, -arg3 + this.field5979 + -arg1, arg0, var9, arg5, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lbv;IIIII)V")
    public class393(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field5979 = arg5;
        this.field5980 = arg4;
        int var7 = -arg5 - arg3 + super.field241.field3964;
        super.field241.method1787(this, (byte) 121);
        OpenGL.glCopyTexImage2D(super.field240, 0, super.field223, arg2, var7, arg4, arg5, 0);
        this.method123(false, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljb;I)V")
    public static final void method2420(class499 arg0, int arg1) {
        ++field5982;
        if (class500.field7455) {
            if (arg0.field7430 != null) {
                class499 var2 = class458.method2757(class186.field2616, false, class126.field1798);
                if (var2 != null) {
                    class199 var3 = new class199();
                    var3.field2810 = var2;
                    var3.field2813 = arg0.field7430;
                    var3.field2817 = arg0;
                    class291.method1886(var3);
                }
            }
            ++class97.field1405;
            class179.method1287(false, class209.field2967);
            class75.field1006.method615(28010, arg0.field7312);
            if (arg1 != 28613) {
                method2414(72, -95, -61, (class255) null, (class255) null);
            }
            class75.field1006.method582(-117, class126.field1798);
            class75.field1006.method615(28010, class186.field2616);
            class75.field1006.method582(-99, arg0.field7310);
            class75.field1006.method582(-96, class91.field1336);
            class75.field1006.method637((byte) 64, arg0.field7304);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        ++field5977;
        OpenGL.glFramebufferTexture2DEXT(this.field5981, this.field5970, super.field240, 0, 0);
        if (!arg0) {
            this.field5970 = -1;
            this.field5981 = -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI[IIIBI)V")
    public final void method2421(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field5973;
        if (arg8 == 0) {
            arg8 = arg6;
        }
        if (arg7 != -35) {
            this.field5980 = -57;
        }
        if (arg2) {
            int[] var10 = new int[arg1 * arg6];
            for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (-var11 + -1 + arg1) * arg8 + arg0;
                for (int var14 = 0; var14 < arg6; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field241.method1787(this, (byte) 121);
        if (~arg6 != ~arg8) {
            OpenGL.glPixelStorei(3314, arg8);
        }
        OpenGL.glTexSubImage2Di(super.field240, 0, arg5, arg3, arg6, arg1, 32993, super.field241.field4121, arg4, arg0);
        if (arg6 != arg8) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIIIIIZZI)V")
    public final void method2422(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9) {
        if (arg6 == 0) {
            arg6 = arg3;
        }
        ++field5975;
        if (arg8) {
            this.method2418(49, 107, 39, -16);
        }
        if (arg7) {
            int var11 = class519.method3091(9910, arg2);
            int var12 = arg3 * var11;
            int var13 = arg6 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; var15 < arg9; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg9 + -1) * var13 + arg5;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg1[var17++];
                }
            }
            arg1 = var14;
        }
        super.field241.method1787(this, (byte) 121);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg3 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Dub(super.field240, 0, arg4, arg0, arg3, arg9, arg2, 5121, arg1, arg5);
        if (~arg3 != ~arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
