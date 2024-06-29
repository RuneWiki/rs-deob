import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class94 extends class271 {

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field1454 = -1;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    private int field1452 = -1;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Z")
    public static boolean field1462;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field1461;

    static {
        new class347("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field1462 = true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[IIIIIBZ)V", line = 3)
    public final void method734(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, boolean arg8) {
        if (arg5 == 0) {
            arg5 = arg6;
        }
        if (arg7 < -16) {
            ++field1451;
            if (arg8) {
                int[] var10 = new int[arg1 * arg6];
                for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                    int var12 = arg6 * var11;
                    int var13 = (-var11 + arg1 + -1) * arg5 + arg3;
                    for (int var14 = 0; ~var14 > ~arg6; ++var14) {
                        var10[var12++] = arg2[var13++];
                    }
                }
                arg2 = var10;
            }
            super.field4047.method1546(-2, this);
            if (~arg5 != ~arg6) {
                OpenGL.glPixelStorei(3314, arg5);
            }
            OpenGL.glTexSubImage2Di(super.field4033, 0, arg0, arg4, arg6, arg1, 32993, super.field4047.field3846, arg2, arg3);
            if (arg5 != arg6) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;IIIII)V", line = 54)
    public class94(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field1459 = arg5;
        this.field1457 = arg4;
        int var7 = -arg3 - arg5 + super.field4047.field3610;
        super.field4047.method1546(-2, this);
        OpenGL.glCopyTexImage2D(super.field4033, 0, super.field4044, arg2, var7, arg4, arg5, 0);
        this.method1693(true, (byte) 49);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;IIIIZ[FI)V", line = 147)
    public class94(class258 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1457 = arg3;
        this.field1459 = arg4;
        super.field4047.method1546(-2, this);
        if (arg5 && super.field4033 != 34037) {
            class520.method3072(arg6, arg7, arg4, arg1, arg3, 0, arg2);
            this.method1690((byte) -127, true);
        } else {
            OpenGL.glTexImage2Df(super.field4033, 0, super.field4044, this.field1457, this.field1459, 0, arg7, 5126, arg6, 0);
            this.method1690((byte) -36, false);
        }
        this.method1693(true, (byte) -74);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;IIII)V", line = 169)
    public class94(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field1457 = arg3;
        this.field1459 = arg4;
        super.field4047.method1546(-2, this);
        OpenGL.glTexImage2Dub(super.field4033, 0, super.field4044, arg3, arg4, 0, class399.method2406(super.field4044, true), 5121, (byte[]) null, 0);
        this.method1693(true, (byte) -120);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;IIIIZ[IZ)V", line = 209)
    public class94(class258 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1457 = arg3;
        this.field1459 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field4047.method1546(-2, this);
        if (arg5 && super.field4033 != 34037) {
            class465.method2703(this.field1457, super.field4033, super.field4044, arg6, this.field1459, (byte) -52, super.field4047.field3846, 32993);
            this.method1690((byte) -90, true);
        } else {
            OpenGL.glTexImage2Di(super.field4033, 0, super.field4044, this.field1457, this.field1459, 0, 32993, super.field4047.field3846, arg6, 0);
            this.method1690((byte) -55, false);
        }
        this.method1693(true, (byte) 102);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvd;IIIIZ[BIZ)V", line = 311)
    public class94(class258 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field1457 = arg3;
        this.field1459 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 + -1 - var11) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field4047.method1546(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field4033 != -34038) {
            class469.method2781(arg6, arg7, arg2, arg1, arg3, arg4, (byte) 72);
            this.method1690((byte) -70, true);
        } else {
            OpenGL.glTexImage2Dub(super.field4033, 0, super.field4044, this.field1457, this.field1459, 0, arg7, 5121, arg6, 0);
            this.method1690((byte) -84, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1693(true, (byte) -72);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III[BIIIIZI)V", line = 78)
    public final void method735(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (~arg7 == -1) {
            arg7 = arg6;
        }
        ++field1460;
        if (arg8) {
            int var11 = class96.method753(true, arg0);
            int var12 = arg6 * var11;
            int var13 = arg7 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; ~arg9 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg9 - var15 - 1) * var13 - -arg5;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field4047.method1546(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field4033, 0, arg2, arg4, arg6, arg9, arg0, 5121, arg3, arg5);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(arg1, 4);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBII)V", line = 132)
    public final void method736(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 81) {
            this.method739(87, -71, 47, 76);
        }
        ++field1458;
        int var8 = super.field4047.field3610 - arg5 - arg6;
        super.field4047.method1546(-2, this);
        OpenGL.glCopyTexSubImage2D(super.field4033, 0, arg3, this.field1459 - (arg0 + arg6), arg2, var8, arg1, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 182)
    public final void method737(int arg0) {
        if (arg0 == 6407) {
            OpenGL.glFramebufferTexture2DEXT(this.field1452, this.field1454, super.field4033, 0, 0);
            ++field1449;
            this.field1454 = -1;
            this.field1452 = -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lga;Lok;Z)V", line = 196)
    public static final void method738(class243 arg0, class74 arg1, boolean arg2) {
        if (arg2) {
            field1456 = 2;
        }
        class483.field7131 = arg0;
        ++field1450;
        class426.field6349 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V", line = 259)
    public final void method739(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field4033, super.field4042, arg2);
        ++field1461;
        this.field1452 = arg0;
        this.field1454 = arg1;
        if (arg3 < 84) {
            this.method735(33, 40, 98, (byte[]) null, -42, -8, -3, -128, false, -25);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIIZ)V", line = 282)
    public static final void method740(int[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field1456 = 30;
        }
        ++field1455;
        --arg1;
        int var8 = arg2 - 1;
        int var5 = -7 + var8;
        while (~var5 < ~arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var9 = var7 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var12 = var11 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            arg1 = var13 + 1;
            arg0[arg1] = arg3;
        }
        while (~arg1 > ~var8) {
            ++arg1;
            arg0[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZB)V", line = 364)
    public final void method741(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 <= -91) {
            ++field1453;
            if (super.field4033 == 3553) {
                super.field4047.method1546(-2, this);
                OpenGL.glTexParameteri(super.field4033, 10242, arg1 ? 10497 : 33071);
                OpenGL.glTexParameteri(super.field4033, 10243, !arg0 ? 33071 : 10497);
            }
        }
    }
}
