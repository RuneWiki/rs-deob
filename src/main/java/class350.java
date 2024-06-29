import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class350 extends class559 {

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    private int field4965 = -1;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "I")
    private int field4976 = -1;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "Z")
    public static boolean field4966 = false;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "J")
    public static long field4971 = 0L;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZZ)V")
    public final void method2230(int arg0, boolean arg1, boolean arg2) {
        if (arg0 == 3314) {
            ++field4973;
            if (super.field7768 == 3553) {
                super.field7765.method3681(this, arg0 ^ 3314);
                OpenGL.glTexParameteri(super.field7768, 10242, !arg2 ? 33071 : 10497);
                OpenGL.glTexParameteri(super.field7768, 10243, !arg1 ? 33071 : 10497);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZIII[Luv;)V")
    public static final void method2231(int arg0, boolean arg1, int arg2, int arg3, int arg4, class755[] arg5) {
        int var6 = 0;
        int var7 = -12 % ((arg3 - -12) / 51);
        while (~arg5.length < ~var6) {
            class755 var8 = arg5[var6];
            if (var8 != null && ~var8.field10552 == ~arg2) {
                class652.method3646(arg4, arg1, var8, true, arg0);
                class459.method2801(arg0, arg4, 67, var8);
                if (var8.field10535 > -var8.field10393 + var8.field10433) {
                    var8.field10535 = -var8.field10393 + var8.field10433;
                }
                if (var8.field10535 < 0) {
                    var8.field10535 = 0;
                }
                if (var8.field10532 > -var8.field10501 + var8.field10479) {
                    var8.field10532 = -var8.field10501 + var8.field10479;
                }
                if (var8.field10532 < 0) {
                    var8.field10532 = 0;
                }
                if (~var8.field10416 == -1) {
                    class194.method1202(84, arg1, var8);
                }
            }
            ++var6;
        }
        ++field4969;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIII)V")
    public final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4962;
        int var8 = -arg5 - arg3 + super.field7765.field8986;
        super.field7765.method3681(this, 0);
        OpenGL.glCopyTexSubImage2D(super.field7768, arg2, arg4, -arg6 - arg5 + this.field4972, arg1, var8, arg0, arg5);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ldw;IIIIZ[BIZ)V")
    public class350(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4964 = arg3;
        this.field4972 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~arg4 < ~var11; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7765.method3681(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field7768 != -34038) {
            class522.method3111(arg2, arg4, arg7, arg6, arg1, arg3, 19559);
            this.method3285(true, true);
        } else {
            OpenGL.glTexImage2Dub(super.field7768, 0, super.field7777, this.field4964, this.field4972, 0, arg7, 5121, arg6, 0);
            this.method3285(true, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
    public static final void method2233(int arg0) {
        ++field4975;
        if (arg0 == 5121) {
            if (class159.field2227.field1936 && class639.field8572.field6484 != -1) {
                class137.method909(arg0 + -12121, class639.field8572.field6484, class639.field8572.field6485);
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILmg;Lmg;)V")
    public static final void method2234(int arg0, class498 arg1, class498 arg2) {
        if (arg2.field6962 != null) {
            arg2.method3012(arg0 ^ 8248);
        }
        ++field4967;
        if (arg0 != 8270) {
            field4966 = false;
        }
        arg2.field6964 = arg1;
        arg2.field6962 = arg1.field6962;
        arg2.field6962.field6964 = arg2;
        arg2.field6964.field6962 = arg2;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public final void method2235(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field4965, this.field4976, super.field7768, arg0, 0);
        ++field4974;
        this.field4965 = -1;
        this.field4976 = -1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I[BIIZIIZII)V")
    public final void method2236(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        ++field4963;
        if (arg0 == 0) {
            arg0 = arg2;
        }
        if (arg4) {
            int var11 = class284.method1887(arg8, false);
            int var12 = arg2 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; var15 < arg6; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg6 + -1) * var13 + arg3;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg1[var17++];
                }
            }
            arg1 = var14;
        }
        super.field7765.method3681(this, 0);
        if (arg7) {
            this.field4976 = -96;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field7768, 0, arg5, arg9, arg2, arg6, arg8, 5121, arg1, arg3);
        if (~arg0 != ~arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ldw;IIIII)V")
    public class350(class664 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field4972 = arg5;
        this.field4964 = arg4;
        int var7 = -arg3 - (arg5 - super.field7765.field8986);
        super.field7765.method3681(this, 0);
        OpenGL.glCopyTexImage2D(super.field7768, 0, super.field7777, arg2, var7, arg4, arg5, 0);
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIII)V")
    public final void method2237(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 15949) {
            this.field4965 = -112;
        }
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field7768, super.field7785, arg0);
        ++field4968;
        this.field4965 = arg2;
        this.field4976 = arg1;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ldw;IIIIZ[FI)V")
    public class350(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4964 = arg3;
        this.field4972 = arg4;
        super.field7765.method3681(this, 0);
        if (arg5 && super.field7768 != 34037) {
            class28.method161(arg4, arg3, arg7, arg1, arg2, arg6, (byte) 123);
            this.method3285(true, true);
        } else {
            OpenGL.glTexImage2Df(super.field7768, 0, super.field7777, this.field4964, this.field4972, 0, arg7, 5126, arg6, 0);
            this.method3285(true, false);
        }
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIIIIIII[I)V")
    public final void method2238(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
        if (~arg7 == -1) {
            arg7 = arg3;
        }
        ++field4970;
        if (arg0) {
            int[] var10 = new int[arg3 * arg5];
            for (int var11 = 0; ~var11 > ~arg5; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (arg5 - var11 + -1) * arg7 + arg2;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg8[var13++];
                }
            }
            arg8 = var10;
        }
        super.field7765.method3681(this, arg1 ^ arg1);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field7768, 0, arg4, this.field4972 - (arg5 + arg6), arg3, arg5, 32993, super.field7765.field9086, arg8, arg2);
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ldw;IIIIZ[IIIZ)V")
    public class350(class664 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field4972 = arg4;
        this.field4964 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - 1 + -var12) * arg3;
                for (int var15 = 0; ~arg3 < ~var15; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field7765.method3681(this, 0);
        if (super.field7768 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class251.method1715(36, 32993, super.field7765.field9086, super.field7768, this.field4964, super.field7777, this.field4972, arg6);
            this.method3285(true, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field7768, 0, super.field7777, this.field4964, this.field4972, 0, 32993, super.field7765.field9086, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method3285(true, false);
        }
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ldw;IIII)V")
    public class350(class664 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field4964 = arg3;
        this.field4972 = arg4;
        super.field7765.method3681(this, 0);
        OpenGL.glTexImage2Dub(super.field7768, 0, super.field7777, arg3, arg4, 0, class434.method2679(true, super.field7777), 5121, (byte[]) null, 0);
        this.method3292(3, true);
    }
}
