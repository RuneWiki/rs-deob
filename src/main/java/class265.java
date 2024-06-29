import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class265 extends class119 {

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    private int field3337 = -1;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field3346 = -1;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lap;")
    public static class335 field3341 = new class335("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBIIIIII)Z")
    public static final boolean method1573(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3347;
        int var9 = 117 % ((arg2 - -37) / 54);
        if (arg6 + arg8 > arg3 && arg3 + arg7 > arg8) {
            return ~(arg4 + arg5) < ~arg1 && ~(arg0 + arg1) < ~arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([IB[J)V")
    public static final void method1574(int[] arg0, byte arg1, long[] arg2) {
        if (arg1 <= 84) {
            method1573(65, -96, (byte) 68, 30, -113, 110, 111, 115, -114);
        }
        class533.method3156(arg0, arg2, arg2.length + -1, -125, 0);
        ++field3344;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BIIIZIIBI)V")
    public final void method1575(int arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9) {
        ++field3336;
        if (~arg4 == -1) {
            arg4 = arg2;
        }
        if (arg5) {
            int var11 = class303.method1789(1, arg3);
            int var12 = arg2 * var11;
            int var13 = arg4 * var11;
            byte[] var14 = new byte[arg0 * var12];
            for (int var15 = 0; arg0 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + -1 + arg0) * var13 - -arg7;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg1[var17++];
                }
            }
            arg1 = var14;
        }
        super.field1607.method2322(this, 14);
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        if (arg8 > 16) {
            OpenGL.glTexSubImage2Dub(super.field1604, 0, arg9, arg6, arg2, arg0, arg3, 5121, arg1, arg7);
            if (arg2 != arg4) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
    public final void method1576(int arg0, int arg1, int arg2, int arg3) {
        ++field3342;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field1604, super.field1599, arg3);
        if (arg2 != 17) {
            this.field3337 = 7;
        }
        this.field3346 = arg0;
        this.field3337 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V")
    public final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3335;
        int var8 = -arg3 - arg1 + super.field1607.field5352;
        super.field1607.method2322(this, 14);
        if (arg6 > -91) {
            method1581(73, true);
        }
        OpenGL.glCopyTexSubImage2D(super.field1604, 0, arg4, -arg1 + -arg2 + this.field3339, arg5, var8, arg0, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIZ)V")
    public final void method1578(boolean arg0, int arg1, boolean arg2) {
        if (super.field1604 == 3553) {
            super.field1607.method2322(this, 14);
            OpenGL.glTexParameteri(super.field1604, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field1604, 10243, !arg2 ? 33071 : 10497);
        }
        ++field3345;
        if (arg1 != 0) {
            field3349 = -72;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lug;IIIIZ[BIZ)V")
    public class265(class395 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3340 = arg3;
        this.field3339 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field1607.method2322(this, 14);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field1604 != 34037) {
            class375.method2132((byte) 125, arg3, arg4, arg2, arg6, arg1, arg7);
            this.method853(false, true);
        } else {
            OpenGL.glTexImage2Dub(super.field1604, 0, super.field1611, this.field3340, this.field3339, 0, arg7, 5121, arg6, 0);
            this.method853(false, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
    public static final void method1579(byte arg0) {
        if (arg0 < -53) {
            ++field3348;
            class472.field6843.method2024(false);
            class469.field6810.method2024(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lug;IIIIZ[FI)V")
    public class265(class395 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3340 = arg3;
        this.field3339 = arg4;
        super.field1607.method2322(this, 14);
        if (arg5 && ~super.field1604 != -34038) {
            class73.method639(arg4, arg6, arg7, arg2, arg3, arg1, (byte) 57);
            this.method853(false, true);
        } else {
            OpenGL.glTexImage2Df(super.field1604, 0, super.field1611, this.field3340, this.field3339, 0, arg7, 5126, arg6, 0);
            this.method853(false, false);
        }
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        if (arg0 == -36) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1581(int arg0, boolean arg1) {
        ++field3334;
        if (arg1) {
            field3341 = null;
        }
        return ~arg0 <= -13 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lug;IIIIZ[IZ)V")
    public class265(class395 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3340 = arg3;
        this.field3339 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 - 1) * arg3;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field1607.method2322(this, 14);
        if (arg5 && ~super.field1604 != -34038) {
            class475.method2864(32993, this.field3340, super.field1607.field5566, super.field1611, this.field3339, super.field1604, arg6, -6495);
            this.method853(false, true);
        } else {
            OpenGL.glTexImage2Di(super.field1604, 0, super.field1611, this.field3340, this.field3339, 0, 32993, super.field1607.field5566, arg6, 0);
            this.method853(false, false);
        }
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[IIIIZII)V")
    public final void method1582(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field3343;
        if (arg4 == 0) {
            arg4 = arg5;
        }
        if (arg0 != 4) {
            method1580((byte) -119);
        }
        if (arg6) {
            int[] var10 = new int[arg1 * arg5];
            for (int var11 = 0; arg1 > var11; ++var11) {
                int var12 = arg5 * var11;
                int var13 = (arg1 - (var11 - -1)) * arg4 + arg7;
                for (int var14 = 0; var14 < arg5; ++var14) {
                    var10[var12++] = arg2[var13++];
                }
            }
            arg2 = var10;
        }
        super.field1607.method2322(this, arg0 ^ 10);
        if (arg4 != arg5) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field1604, 0, arg8, arg3, arg5, arg1, 32993, super.field1607.field5566, arg2, arg7);
        if (~arg4 != ~arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method864(int arg0) {
        ++field3338;
        OpenGL.glFramebufferTexture2DEXT(this.field3346, this.field3337, super.field1604, 0, 0);
        this.field3337 = -1;
        this.field3346 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lug;IIII)V")
    public class265(class395 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3340 = arg3;
        this.field3339 = arg4;
        super.field1607.method2322(this, 14);
        OpenGL.glTexImage2Dub(super.field1604, 0, super.field1611, arg3, arg4, 0, class100.method757(super.field1611, (byte) -40), 5121, (byte[]) null, 0);
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lug;IIIII)V")
    public class265(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3339 = arg5;
        this.field3340 = arg4;
        int var7 = -arg3 - arg5 + super.field1607.field5352;
        super.field1607.method2322(this, 14);
        OpenGL.glCopyTexImage2D(super.field1604, 0, super.field1611, arg2, var7, arg4, arg5, 0);
        this.method861(true, 9984);
    }
}
