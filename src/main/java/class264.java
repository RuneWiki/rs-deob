import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class264 extends class40 {

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    private int field3648 = -1;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    private int field3649 = -1;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Lwj;")
    public static class270 field3646 = new class270(33, 7);

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field3653 = -2;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "[I")
    public static int[] field3654 = new int[2];

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;IIIIZ[IZ)V", line = 6)
    public class264(class338 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3645 = arg4;
        this.field3641 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 - 1) * arg3;
                for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field503.method1996(2, this);
        if (arg5 && ~super.field505 != -34038) {
            class497.method2903(super.field503.field4874, arg6, this.field3645, super.field505, super.field496, this.field3641, 32993, (byte) 111);
            this.method342(true, 9729);
        } else {
            OpenGL.glTexImage2Di(super.field505, 0, super.field496, this.field3641, this.field3645, 0, 32993, super.field503.field4874, arg6, 0);
            this.method342(false, 9729);
        }
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZZ)V", line = 57)
    public final void method1579(int arg0, boolean arg1, boolean arg2) {
        if (super.field505 == 3553) {
            super.field503.method1996(2, this);
            OpenGL.glTexParameteri(super.field505, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field505, 10243, arg2 ? 10497 : 33071);
        }
        ++field3643;
        if (arg0 != -6746) {
            this.method1584(100, -41, 47, 5, 100, -99, false, 31, (byte[]) null, 88);
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 76)
    public static void method1580(int arg0) {
        int var1 = -48 / ((arg0 - -73) / 41);
        field3654 = null;
        field3646 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;IIIII)V", line = 87)
    public class264(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3641 = arg4;
        this.field3645 = arg5;
        int var7 = -arg3 + super.field503.field4548 + -arg5;
        super.field503.method1996(2, this);
        OpenGL.glCopyTexImage2D(super.field505, 0, super.field496, arg2, var7, arg4, arg5, 0);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V", line = 101)
    public final void method1581(int arg0, int arg1, int arg2, int arg3) {
        ++field3652;
        int var5 = 50 % ((arg0 - 65) / 54);
        OpenGL.glFramebufferTexture2DEXT(arg3, arg1, super.field505, super.field501, arg2);
        this.field3649 = arg3;
        this.field3648 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V", line = 116)
    public final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3642;
        int var8 = -arg3 + -arg6 + super.field503.field4548;
        super.field503.method1996(arg4 + 3, this);
        OpenGL.glCopyTexSubImage2D(super.field505, 0, arg2, this.field3645 - (arg1 + arg3), arg0, var8, arg5, arg3);
        OpenGL.glFlush();
        if (arg4 != -1) {
            this.field3641 = -55;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;IIII)V", line = 253)
    public class264(class338 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3645 = arg4;
        this.field3641 = arg3;
        super.field503.method1996(2, this);
        OpenGL.glTexImage2Dub(super.field505, 0, super.field496, arg3, arg4, 0, class217.method1344(super.field496, (byte) -100), 5121, (byte[]) null, 0);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;IIIIZ[BIZ)V", line = 266)
    public class264(class338 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3641 = arg3;
        this.field3645 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; arg4 > var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg4 - (var11 - -1)) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field503.method1996(2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field505 != -34038) {
            class492.method2880(arg3, arg1, arg4, arg6, arg7, arg2, -125);
            this.method342(true, 9729);
        } else {
            OpenGL.glTexImage2Dub(super.field505, 0, super.field496, this.field3641, this.field3645, 0, arg7, 5121, arg6, 0);
            this.method342(false, 9729);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lef;IIIIZ[FI)V", line = 369)
    public class264(class338 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3641 = arg3;
        this.field3645 = arg4;
        super.field503.method1996(2, this);
        if (arg5 && ~super.field505 != -34038) {
            class312.method1809(arg3, arg4, 0, arg7, arg2, arg1, arg6);
            this.method342(true, 9729);
        } else {
            OpenGL.glTexImage2Df(super.field505, 0, super.field496, this.field3641, this.field3645, 0, arg7, 5126, arg6, 0);
            this.method342(false, 9729);
        }
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsi;I)V", line = 136)
    public static final void method1583(class391 arg0, int arg1) {
        ++field3644;
        if (~(arg0.field5678.length + -arg0.field5719) <= -2) {
            int var2 = arg0.method2348(-2);
            if (var2 >= 0 && var2 <= 1) {
                if (~(arg0.field5678.length - arg0.field5719) <= -3) {
                    int var3 = arg0.method2353((byte) 123);
                    if (arg1 == 17351) {
                        if (var3 * 6 == arg0.field5678.length + -arg0.field5719) {
                            while (true) {
                                int var4;
                                int var5;
                                do {
                                    do {
                                        do {
                                            if (arg0.field5678.length <= arg0.field5719) {
                                                return;
                                            }
                                            var4 = arg0.method2353((byte) 117);
                                            var5 = arg0.method2361((byte) -56);
                                        } while (~class263.field3635.length >= ~var4);
                                    } while (!class357.field5216[var4]);
                                } while (~class176.field2614.method972(var4, (byte) 69).field7625 == -50 && (~var5 > 0 || ~var5 < -2));
                                class263.field3635[var4] = var5;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIZI[BI)V", line = 182)
    public final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte[] arg8, int arg9) {
        if (~arg0 == -1) {
            arg0 = arg4;
        }
        ++field3650;
        if (arg6) {
            int var11 = class359.method2149(arg3, 4);
            int var12 = arg4 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg2 * var12];
            for (int var15 = 0; ~var15 > ~arg2; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg2 - 1 + -var15) * var13 + arg7;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field503.method1996(2, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg4) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field505, arg1, arg9, arg5, arg4, arg2, arg3, 5121, arg8, arg7);
        if (~arg0 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 238)
    public final void method332(byte arg0) {
        if (arg0 != 37) {
            method1586(35, -90);
        }
        ++field3647;
        OpenGL.glFramebufferTexture2DEXT(this.field3649, this.field3648, super.field505, 0, 0);
        this.field3649 = -1;
        this.field3648 = -1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIIIII[III)V", line = 319)
    public final void method1585(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        if (~arg1 == -1) {
            arg1 = arg4;
        }
        ++field3640;
        if (arg0) {
            int[] var10 = new int[arg4 * arg7];
            for (int var11 = 0; arg7 > var11; ++var11) {
                int var12 = arg4 * var11;
                int var13 = (arg7 - 1 + -var11) * arg1 + arg8;
                for (int var14 = 0; var14 < arg4; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        int var15 = 46 % ((arg3 - 58) / 54);
        super.field503.method1996(2, this);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Di(super.field505, 0, arg2, arg5, arg4, arg7, 32993, super.field503.field4874, arg6, arg8);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lrm;", line = 400)
    public static final class282 method1586(int arg0, int arg1) {
        if (arg1 >= -117) {
            field3654 = null;
        }
        ++field3651;
        class282[] var2 = class360.method2157(true);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class282 var4 = var2[var3];
            if (~var4.field3863 == ~arg0) {
                return var4;
            }
        }
        return null;
    }
}
