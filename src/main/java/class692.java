import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class692 extends class487 {

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    private int field9809 = -1;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    private int field9815 = -1;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    public int field9818;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public int field9807;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public static int field9814 = 0;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    public static int field9817;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wo", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field9819;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3865(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrs;IIIII)V", line = 3)
    public class692(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field9818 = arg4;
        this.field9807 = arg5;
        int var7 = -arg3 - arg5 + super.field7044.field2697;
        super.field7044.method1306(this, 36);
        OpenGL.glCopyTexImage2D(super.field7045, 0, super.field7033, arg2, var7, arg4, arg5, 0);
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIIIIIIZ[BI)V", line = 19)
    public final void method3858(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9) {
        ++field9812;
        if (~arg1 == -1) {
            arg1 = arg2;
        }
        if (arg7) {
            int var11 = class254.method1721((byte) -9, arg6);
            int var12 = arg2 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; ~var15 > ~arg5; ++var15) {
                int var16 = var12 * var15;
                int var17 = (arg5 - 1 + -var15) * var13 + arg9;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg8[var17++];
                }
            }
            arg8 = var14;
        }
        super.field7044.method1306(this, 65);
        OpenGL.glPixelStorei(3317, 1);
        int var19 = -60 % ((arg0 - -40) / 46);
        if (~arg1 != ~arg2) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field7045, 0, arg4, arg3, arg2, arg5, arg6, 5121, arg8, arg9);
        if (arg1 != arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "()V", line = 82)
    public static final void method3859() {
        for (int var0 = 0; var0 < class145.field2253; ++var0) {
            if (!class700.field9901[var0]) {
                class639 var1 = class96.field1422[var0];
                class759 var2 = var1.field8979;
                int var3 = var1.field8965;
                int var4 = var2.method4224((byte) 127) - class581.field8224;
                int var5 = (var4 * 2 >> class662.field9425) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method4228(-120) - var4 >> class662.field9425;
                int var9 = var2.method4223((byte) -100) - var4 >> class662.field9425;
                int var10 = var2.method4223((byte) -14) + var4 >> class662.field9425;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class54.field870) {
                    var10 = class54.field870 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field8986[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class42.field727) {
                        var16 = class42.field727 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class559 var19 = class140.method1093(var3, var17, var11, field9819 != null ? field9819 : (field9819 = method3865("vp")));
                        if (var19 != null && var19.field7926 != 0) {
                            if (var19.field7926 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8986[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8986[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field8986[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8986[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class700.field9901[var0] = true;
                class211.field3511[var3].method617(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrs;IIIIZ[BIZ)V", line = 255)
    public class692(class166 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9818 = arg3;
        this.field9807 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 + -1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field7044.method1306(this, 109);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field7045 != -34038) {
            class384.method2410(arg1, arg4, false, arg2, arg7, arg3, arg6);
            this.method2966(true, 40);
        } else {
            OpenGL.glTexImage2Dub(super.field7045, 0, super.field7033, this.field9818, this.field9807, 0, arg7, 5121, arg6, 0);
            this.method2966(false, 40);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrs;IIIIZ[IIIZ)V", line = 367)
    public class692(class166 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9807 = arg4;
        this.field9818 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - var12 + -1) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field7044.method1306(this, 77);
        if (super.field7045 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class380.method2397(arg6, this.field9807, super.field7033, 32993, this.field9818, -30633, super.field7044.field2878, super.field7045);
            this.method2966(true, 40);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field7045, 0, super.field7033, this.field9818, this.field9807, 0, 32993, super.field7044.field2878, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method2966(false, 40);
        }
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrs;IIIIZ[FI)V", line = 457)
    public class692(class166 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field9818 = arg3;
        this.field9807 = arg4;
        super.field7044.method1306(this, 122);
        if (arg5 && ~super.field7045 != -34038) {
            class80.method720(arg7, arg4, arg1, 17876, arg3, arg6, arg2);
            this.method2966(true, 40);
        } else {
            OpenGL.glTexImage2Df(super.field7045, 0, super.field7033, this.field9818, this.field9807, 0, arg7, 5126, arg6, 0);
            this.method2966(false, 40);
        }
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrs;IIII)V", line = 498)
    public class692(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field9807 = arg4;
        this.field9818 = arg3;
        super.field7044.method1306(this, 70);
        OpenGL.glTexImage2Dub(super.field7045, 0, super.field7033, arg3, arg4, 0, class468.method2868((byte) -2, super.field7033), 5121, (byte[]) null, 0);
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII[IIIZI)V", line = 314)
    public final void method3860(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg6 > -6) {
            this.method3858((byte) 21, -11, 123, 113, 24, -32, 19, true, (byte[]) null, -73);
        }
        ++field9816;
        if (arg5 == 0) {
            arg5 = arg1;
        }
        if (arg7) {
            int[] var10 = new int[arg1 * arg8];
            for (int var11 = 0; var11 < arg8; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (-var11 + arg8 + -1) * arg5 + arg3;
                for (int var14 = 0; var14 < arg1; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field7044.method1306(this, 44);
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field7045, 0, arg2, this.field9807 - arg8 + -arg0, arg1, arg8, 32993, super.field7044.field2878, arg4, arg3);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZII)V", line = 422)
    public final void method3861(int arg0, boolean arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, super.field7045, super.field7047, arg0);
        ++field9811;
        this.field9809 = arg2;
        if (arg1) {
            this.field9815 = arg3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZI)V", line = 438)
    public final void method3862(boolean arg0, boolean arg1, int arg2) {
        ++field9813;
        if (arg2 != -29630) {
            this.method3863(true, 48, -73, 96, -39, -16, -83);
        }
        if (~super.field7045 == -3554) {
            super.field7044.method1306(this, 50);
            OpenGL.glTexParameteri(super.field7045, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field7045, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 482)
    public final void method2069(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field9809, this.field9815, super.field7045, 0, 0);
        if (arg0 == -31) {
            ++field9817;
            this.field9815 = -1;
            this.field9809 = -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIIII)V", line = 510)
    public final void method3863(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9808;
        int var8 = -arg6 + super.field7044.field2697 + -arg2;
        if (arg0) {
            super.field7044.method1306(this, 111);
            OpenGL.glCopyTexSubImage2D(super.field7045, 0, arg3, this.field9807 - (arg4 - -arg2), arg5, var8, arg1, arg2);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIIBIILha;II[[[B)V", line = 525)
    public static final void method3864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class544 arg9, int arg10, int arg11, byte[][][] arg12) {
        ++field9810;
        if (arg6 > 109) {
            if (~arg0 != -1 && arg5 != 0) {
                if (~arg0 == -10) {
                    arg0 = 1;
                    arg2 = arg2 + 1 & 3;
                }
                if (~arg0 == -11) {
                    arg0 = 1;
                    arg2 = arg2 + 3 & 3;
                }
                if (~arg0 == -12) {
                    arg2 = 3 & arg2 - -3;
                    arg0 = 8;
                }
                arg9.method388(arg11, arg3, arg7, arg1, arg8, arg10, arg12[arg0 - 1][arg2], arg5, arg4);
            }
        }
    }
}
