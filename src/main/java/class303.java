import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class303 extends class238 {

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    private int field3858 = -1;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    private int field3863 = -1;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Lvj;")
    public static class373 field3860 = new class373(40, 10);

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "[[I")
    public static int[][] field3871 = new int[128][128];

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "Lrg;")
    public static class548 field3872;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field3870;

    static {
        new class180(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field3872 = new class548(38, 8);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V", line = 4)
    public final void method1667(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 12459) {
            ++field3864;
            OpenGL.glFramebufferTexture2DEXT(arg0, arg3, super.field2973, super.field2992, arg1);
            this.field3858 = arg3;
            this.field3863 = arg0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmh;IIII)V", line = 17)
    public class303(class537 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3862 = arg4;
        this.field3869 = arg3;
        super.field2988.method3083((byte) 109, this);
        OpenGL.glTexImage2Dub(super.field2973, 0, super.field2990, arg3, arg4, 0, class13.method105(6410, super.field2990), 5121, (byte[]) null, 0);
        this.method1358((byte) 98, true);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZBIIIII)V", line = 30)
    public final void method1668(int[] arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 == 0) {
            arg7 = arg6;
        }
        ++field3866;
        if (arg3 == -23) {
            if (arg2) {
                int[] var10 = new int[arg1 * arg6];
                for (int var11 = 0; arg1 > var11; ++var11) {
                    int var12 = arg6 * var11;
                    int var13 = (arg1 - var11 + -1) * arg7 + arg5;
                    for (int var14 = 0; arg6 > var14; ++var14) {
                        var10[var12++] = arg0[var13++];
                    }
                }
                arg0 = var10;
            }
            super.field2988.method3083((byte) 69, this);
            if (arg6 != arg7) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Di(super.field2973, 0, arg4, arg8, arg6, arg1, 32993, super.field2988.field7776, arg0, arg5);
            if (~arg6 != ~arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III[B)I", line = 82)
    public static final int method1669(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field3867;
        int var4 = -1;
        if (arg2 < 60) {
            method1674(-115, -94, -37, -83);
        }
        for (int var5 = arg0; ~var5 > ~arg1; ++var5) {
            var4 = class391.field5171[(arg3[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmh;IIIIZ[FI)V", line = 105)
    public class303(class537 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3869 = arg3;
        this.field3862 = arg4;
        super.field2988.method3083((byte) 86, this);
        if (arg5 && ~super.field2973 != -34038) {
            class602.method3467(arg4, arg1, arg2, true, arg7, arg6, arg3);
            this.method1353(126, true);
        } else {
            OpenGL.glTexImage2Df(super.field2973, 0, super.field2990, this.field3869, this.field3862, 0, arg7, 5126, arg6, 0);
            this.method1353(123, false);
        }
        this.method1358((byte) 124, true);
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 127)
    public static void method1670(int arg0) {
        field3872 = null;
        field3871 = null;
        field3860 = null;
        if (arg0 >= -37) {
            field3871 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmh;IIIII)V", line = 140)
    public class303(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3869 = arg4;
        this.field3862 = arg5;
        int var7 = -arg3 + -arg5 + super.field2988.field7549;
        super.field2988.method3083((byte) 110, this);
        OpenGL.glCopyTexImage2D(super.field2973, 0, super.field2990, arg2, var7, arg4, arg5, 0);
        this.method1358((byte) 121, true);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmh;IIIIZ[BIZ)V", line = 154)
    public class303(class537 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3862 = arg4;
        this.field3869 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; var14 < arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2988.method3083((byte) 114, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2973 != -34038) {
            class164.method896(arg4, arg1, arg2, arg3, arg6, 1, arg7);
            this.method1353(100, true);
        } else {
            OpenGL.glTexImage2Dub(super.field2973, 0, super.field2990, this.field3869, this.field3862, 0, arg7, 5121, arg6, 0);
            this.method1353(86, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1358((byte) -45, true);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZZ)V", line = 206)
    public final void method1671(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -46) {
            this.field3869 = 78;
        }
        if (super.field2973 == 3553) {
            super.field2988.method3083((byte) 86, this);
            OpenGL.glTexParameteri(super.field2973, 10242, arg2 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field2973, 10243, arg1 ? 10497 : 33071);
        }
        ++field3870;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V", line = 227)
    public final void method1672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3859;
        int var8 = super.field2988.field7549 - arg6 - arg3;
        super.field2988.method3083((byte) 100, this);
        int var9 = 72 % ((71 - arg1) / 43);
        OpenGL.glCopyTexSubImage2D(super.field2973, 0, arg2, this.field3862 - (arg4 + arg6), arg5, var8, arg0, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI[BIIIIIZI)V", line = 241)
    public final void method1673(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        ++field3857;
        if (arg6 == 0) {
            arg6 = arg7;
        }
        if (!arg8) {
            if (arg0) {
                int var11 = class53.method302((byte) -126, arg1);
                int var12 = arg7 * var11;
                int var13 = arg6 * var11;
                byte[] var14 = new byte[arg4 * var12];
                for (int var15 = 0; ~arg4 < ~var15; ++var15) {
                    int var16 = var12 * var15;
                    int var17 = (arg4 - 1 + -var15) * var13 + arg9;
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var14[var16++] = arg2[var17++];
                    }
                }
                arg2 = var14;
            }
            super.field2988.method3083((byte) 88, this);
            OpenGL.glPixelStorei(3317, 1);
            if (arg6 != arg7) {
                OpenGL.glPixelStorei(3314, arg6);
            }
            OpenGL.glTexSubImage2Dub(super.field2973, 0, arg3, arg5, arg7, arg4, arg1, 5121, arg2, arg9);
            if (arg6 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIII)V", line = 300)
    public static final void method1674(int arg0, int arg1, int arg2, int arg3) {
        ++field3865;
        if (arg0 != 10417) {
            field3860 = null;
        }
        class330.field4304 = new byte[arg3][arg2][arg1];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 311)
    public final void method112(byte arg0) {
        ++field3861;
        OpenGL.glFramebufferTexture2DEXT(this.field3863, this.field3858, super.field2973, 0, 0);
        this.field3863 = -1;
        this.field3858 = -1;
        if (arg0 != 53) {
            this.method1667(52, 22, -103, -61);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lmh;IIIIZ[IZ)V", line = 325)
    public class303(class537 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3862 = arg4;
        this.field3869 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 + -1 + -var10) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2988.method3083((byte) 111, this);
        if (arg5 && super.field2973 != 34037) {
            class313.method1738(super.field2973, super.field2990, arg6, 94, this.field3869, this.field3862, 32993, super.field2988.field7776);
            this.method1353(91, true);
        } else {
            OpenGL.glTexImage2Di(super.field2973, 0, super.field2990, this.field3869, this.field3862, 0, 32993, super.field2988.field7776, arg6, 0);
            this.method1353(96, false);
        }
        this.method1358((byte) -60, true);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)Lmca;", line = 384)
    public static final class29 method1675(byte arg0, int arg1) {
        ++field3868;
        if (class125.field1537 && ~arg1 <= ~class90.field1119 && ~class204.field2443 <= ~arg1) {
            if (arg0 <= 0) {
                method1674(14, -76, -25, 52);
            }
            return class341.field4400[-class90.field1119 + arg1];
        } else {
            return null;
        }
    }
}
