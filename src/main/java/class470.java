import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class470 extends class539 {

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    private int field6507 = -1;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    private int field6511 = -1;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public int field6517;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
    public int field6516;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "[I")
    public static int[] field6514 = new int[13];

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
    public static int field6518 = 1408;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "Lqk;")
    public static class1 field6510 = new class1(77, -1);

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII[IIIIZI)V")
    public final void method2801(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            field6518 = 116;
        }
        if (~arg2 == -1) {
            arg2 = arg4;
        }
        ++field6509;
        if (arg0) {
            int[] var10 = new int[arg4 * arg5];
            for (int var11 = 0; arg5 > var11; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (arg5 + -1 - var11) * arg2 + arg6;
                for (int var14 = 0; ~arg4 < ~var14; ++var14) {
                    var10[var12++] = arg3[var13++];
                }
            }
            arg3 = var10;
        }
        super.field7457.method1219((byte) 104, this);
        if (~arg2 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field7453, 0, arg1, -arg5 + this.field6516 - arg8, arg4, arg5, 32993, super.field7457.field2728, arg3, arg6);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public static void method2802(int arg0) {
        field6514 = null;
        if (arg0 != 0) {
            method2802(73);
        }
        field6510 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZII)V")
    public final void method2803(int arg0, boolean arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, super.field7453, super.field7456, arg3);
        if (arg1) {
            ++field6520;
            this.field6507 = arg0;
            this.field6511 = arg2;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpq;IIIIZ[IIIZ)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6517 = arg3;
        this.field6516 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - 1 + -var12) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field7457.method1219((byte) 116, this);
        if (super.field7453 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class68.method525(32993, this.field6517, arg6, super.field7461, this.field6516, super.field7453, 0, super.field7457.field2728);
            this.method3207(0, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field7453, 0, super.field7461, this.field6517, this.field6516, 0, 32993, super.field7457.field2728, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method3207(0, false);
        }
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpq;IIII)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6516 = arg4;
        this.field6517 = arg3;
        super.field7457.method1219((byte) 82, this);
        OpenGL.glTexImage2Dub(super.field7453, 0, super.field7461, arg3, arg4, 0, class648.method3717(super.field7461, false), 5121, (byte[]) null, 0);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpq;IIIII)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6516 = arg5;
        this.field6517 = arg4;
        int var7 = super.field7457.field2423 - (arg3 + arg5);
        super.field7457.method1219((byte) 77, this);
        OpenGL.glCopyTexImage2D(super.field7453, 0, super.field7461, arg2, var7, arg4, arg5, 0);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIZ)V")
    public final void method2804(boolean arg0, int arg1, boolean arg2) {
        ++field6515;
        if (arg1 != 10243) {
            this.method2803(17, false, 27, 25);
        }
        if (super.field7453 == 3553) {
            super.field7457.method1219((byte) 124, this);
            OpenGL.glTexParameteri(super.field7453, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field7453, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public final void method1737(int arg0) {
        ++field6508;
        OpenGL.glFramebufferTexture2DEXT(this.field6511, this.field6507, super.field7453, arg0, 0);
        this.field6507 = -1;
        this.field6511 = -1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method2805(String arg0, boolean arg1) {
        if (arg1) {
            field6518 = -96;
        }
        ++field6519;
        class116 var2 = class743.method4117(80);
        var2.field1575.method3005(255, class377.field5422.field4450);
        var2.field1575.method2986(0, 125);
        int var3 = var2.field1575.field6962;
        var2.field1575.method2986(646, -104);
        int[] var4 = class686.method3908(518, var2);
        int var5 = var2.field1575.field6962;
        var2.field1575.method3037(0, arg0);
        var2.field1575.method3005(255, class553.field7667);
        var2.field1575.field6962 += 7;
        var2.field1575.method2999(var5, var2.field1575.field6962, -30341, var4);
        var2.field1575.method3033(-var3 + var2.field1575.field6962, (byte) -41);
        class443.method2655(0, var2);
        class383.field5492 = -3;
        class482.field6670 = 0;
        class785.field10773 = 1;
        class218.field2995 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpq;IIIIZ[BIZ)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6516 = arg4;
        this.field6517 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7457.method1219((byte) 97, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field7453 != -34038) {
            class360.method2267(arg1, arg4, 1, arg7, arg2, arg6, arg3);
            this.method3207(0, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7453, 0, super.field7461, this.field6517, this.field6516, 0, arg7, 5121, arg6, 0);
            this.method3207(0, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V")
    public final void method2806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 3314) {
            field6518 = -41;
        }
        ++field6512;
        int var8 = -arg3 - (arg6 - super.field7457.field2423);
        super.field7457.method1219((byte) 87, this);
        OpenGL.glCopyTexSubImage2D(super.field7453, 0, arg4, this.field6516 - (arg1 + arg3), arg2, var8, arg5, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI[BIIIIIII)V")
    public final void method2807(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 <= 44) {
            this.method2807(true, -50, (byte[]) null, -6, -70, -66, 89, -117, -46, -90);
        }
        if (arg4 == 0) {
            arg4 = arg6;
        }
        ++field6513;
        if (arg0) {
            int var11 = class97.method698(-29695, arg9);
            int var12 = arg6 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg1 * var12];
            for (int var15 = 0; arg1 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg1 + -1 - var15) * var13 + arg8;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg2[var17++];
                }
            }
            arg2 = var14;
        }
        super.field7457.method1219((byte) 117, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg4 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field7453, 0, arg7, arg3, arg6, arg1, arg9, 5121, arg2, arg8);
        if (arg4 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lpq;IIIIZ[FI)V")
    public class470(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6517 = arg3;
        this.field6516 = arg4;
        super.field7457.method1219((byte) 83, this);
        if (arg5 && ~super.field7453 != -34038) {
            class414.method2520(arg2, arg7, arg1, arg4, arg3, -28547, arg6);
            this.method3207(0, true);
        } else {
            OpenGL.glTexImage2Df(super.field7453, 0, super.field7461, this.field6517, this.field6516, 0, arg7, 5126, arg6, 0);
            this.method3207(0, false);
        }
        this.method3201(true, true);
    }
}
