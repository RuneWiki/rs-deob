import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class239 extends class710 {

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
    private int field3211 = -1;

    @OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
    private int field3214 = -1;

    @OriginalMember(owner = "client!vga", name = "y", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!vga", name = "B", descriptor = "Lra;")
    public static class361 field3215 = new class361(19, 4);

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!vga", name = "C", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!vga", name = "D", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!vga", name = "E", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!vga", name = "F", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!vga", name = "G", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!vga", name = "H", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lji;IIIII)V", line = 3)
    public class239(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field3212 = arg4;
        this.field3213 = arg5;
        int var7 = -arg5 + super.field9933.field8407 + -arg3;
        super.field9933.method3388(this, false);
        OpenGL.glCopyTexImage2D(super.field9928, 0, super.field9923, arg2, var7, arg4, arg5, 0);
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 21)
    public final void method1502(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3211, this.field3214, super.field9928, 0, 0);
        ++field3208;
        if (arg0 < 33) {
            this.field3213 = -4;
        }
        this.field3214 = -1;
        this.field3211 = -1;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lji;IIIIZ[IZ)V", line = 38)
    public class239(class622 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3212 = arg3;
        this.field3213 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + -1 + arg4) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field9933.method3388(this, false);
        if (arg5 && super.field9928 != 34037) {
            class537.method2856(super.field9933.field8676, this.field3212, super.field9928, 5, this.field3213, arg6, 32993, super.field9923);
            this.method3898(72, true);
        } else {
            OpenGL.glTexImage2Di(super.field9928, 0, super.field9923, this.field3212, this.field3213, 0, 32993, super.field9933.field8676, arg6, 0);
            this.method3898(48, false);
        }
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lji;IIIIZ[FI)V", line = 251)
    public class239(class622 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3212 = arg3;
        this.field3213 = arg4;
        super.field9933.method3388(this, false);
        if (arg5 && super.field9928 != 34037) {
            class222.method1408((byte) 73, arg4, arg1, arg6, arg7, arg3, arg2);
            this.method3898(126, true);
        } else {
            OpenGL.glTexImage2Df(super.field9928, 0, super.field9923, this.field3212, this.field3213, 0, arg7, 5126, arg6, 0);
            this.method3898(83, false);
        }
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lji;IIIIZ[BIZ)V", line = 339)
    public class239(class622 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field3212 = arg3;
        this.field3213 = arg4;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; arg3 > var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field9933.method3388(this, false);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field9928 != -34038) {
            class611.method3315(arg7, arg6, arg1, arg4, arg3, arg2, 81);
            this.method3898(113, true);
        } else {
            OpenGL.glTexImage2Dub(super.field9928, 0, super.field9923, this.field3212, this.field3213, 0, arg7, 5121, arg6, 0);
            this.method3898(107, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lji;IIII)V", line = 599)
    public class239(class622 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field3212 = arg3;
        this.field3213 = arg4;
        super.field9933.method3388(this, false);
        OpenGL.glTexImage2Dub(super.field9928, 0, super.field9923, arg3, arg4, 0, class149.method1100(super.field9923, 6409), 5121, (byte[]) null, 0);
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZILpca;)V", line = 91)
    public static final void method1503(boolean arg0, int arg1, class532 arg2) {
        ++field3216;
        if (~class291.field3758 > -401) {
            class699 var3 = arg2.field6914;
            if (var3.field9714 != null) {
                var3 = var3.method3823(class397.field5054, -32574);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field9685) {
                if (arg1 == 3314) {
                    String var4 = var3.field9729;
                    if (~var3.field9706 != -1) {
                        String var5 = class50.field699 == class153.field1947 ? class604.field8154.method3280((byte) 78, class144.field1890) : class604.field8152.method3280((byte) 126, class144.field1890);
                        var4 = var4 + class25.method139(var3.field9706, class233.field3130.field2499, 27371) + " (" + var5 + var3.field9706 + ")";
                    }
                    if (class499.field6560 && !arg0) {
                        class428 var6 = class203.field2642 == -1 ? null : class191.field2445.method1075((byte) -65, class203.field2642);
                        if ((class345.field4410 & 2) != 0 && (var6 == null || var3.method3827(var6.field5546, arg1 + -3178, class203.field2642) != var6.field5546)) {
                            class47.method433(0, class542.field7044 + " -> <col=ffff00>" + var4, (long) arg2.field2960, class295.field3842, 22, -1, false, class368.field4752, 0, true, (byte) 122);
                            ++class186.field2377;
                        }
                    }
                    if (!arg0) {
                        String[] var7 = var3.field9688;
                        if (class434.field5595) {
                            var7 = class191.method1249(7489, var7);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; ~var8 <= -1; --var8) {
                                if (var7[var8] != null && (var3.field9731 == 0 || !var7[var8].equalsIgnoreCase(class604.field8147.method3280((byte) 125, class144.field1890)))) {
                                    byte var9 = 0;
                                    int var10 = class384.field4916;
                                    if (var8 == 0) {
                                        var9 = 45;
                                    }
                                    if (var8 == 1) {
                                        var9 = 25;
                                    }
                                    if (~var8 == -3) {
                                        var9 = 10;
                                    }
                                    if (var8 == 3) {
                                        var9 = 8;
                                    }
                                    if (var3.field9687 == var8) {
                                        var10 = var3.field9746;
                                    }
                                    if (var8 == 4) {
                                        var9 = 13;
                                    }
                                    if (var3.field9692 == var8) {
                                        var10 = var3.field9701;
                                    }
                                    ++class329.field4283;
                                    class47.method433(0, "<col=ffff00>" + var4, (long) arg2.field2960, var7[var8], var9, -1, false, var7[var8].equalsIgnoreCase(class604.field8147.method3280((byte) 91, class144.field1890)) ? var3.field9751 : var10, 0, true, (byte) -41);
                                }
                            }
                        }
                        if (~var3.field9731 == -2 && var7 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class604.field8147.method3280((byte) 87, class144.field1890))) {
                                    short var12 = 0;
                                    if (~var3.field9706 < ~class233.field3130.field2499) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (~var11 == -1) {
                                        var13 = 45;
                                    }
                                    if (~var11 == -2) {
                                        var13 = 25;
                                    }
                                    if (~var11 == -3) {
                                        var13 = 10;
                                    }
                                    if (~var11 == -4) {
                                        var13 = 8;
                                    }
                                    if (var11 == 4) {
                                        var13 = 13;
                                    }
                                    if (~var13 != -1) {
                                        var13 += var12;
                                    }
                                    ++class81.field1108;
                                    class47.method433(0, "<col=ffff00>" + var4, (long) arg2.field2960, var7[var11], var13, -1, false, var3.field9751, 0, true, (byte) -113);
                                }
                            }
                        }
                    }
                    ++class242.field3247;
                    class47.method433(0, "<col=ffff00>" + var4, (long) arg2.field2960, class604.field8146.method3280((byte) -98, class144.field1890), 1001, -1, arg0, class482.field6415, 0, true, (byte) 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZBZ)V", line = 277)
    public final void method1504(boolean arg0, byte arg1, boolean arg2) {
        if (~super.field9928 == -3554) {
            super.field9933.method3388(this, false);
            OpenGL.glTexParameteri(super.field9928, 10242, arg0 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field9928, 10243, arg2 ? 10497 : 33071);
        }
        if (arg1 < 20) {
            method1503(false, 19, (class532) null);
        }
        ++field3219;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIII)V", line = 294)
    public final void method1505(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, super.field9928, super.field9924, arg1);
        ++field3221;
        this.field3211 = arg3;
        if (arg0 == 29480) {
            this.field3214 = arg2;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIBIIII)V", line = 307)
    public final void method1506(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3217;
        if (arg2 == -75) {
            int var8 = super.field9933.field8407 - (arg0 - -arg4);
            super.field9933.method3388(this, false);
            OpenGL.glCopyTexSubImage2D(super.field9928, 0, arg3, -arg4 + this.field3213 + -arg5, arg6, var8, arg1, arg4);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(B)[Loca;", line = 325)
    public static final class573[] method1507(byte arg0) {
        ++field3209;
        if (arg0 != -37) {
            method1510(76, -9, 118);
        }
        return new class573[] { class581.field7910, class106.field1386, class233.field3110 };
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V", line = 394)
    public static void method1508(int arg0) {
        if (arg0 != 1264) {
            field3215 = null;
        }
        field3215 = null;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lufa;IBIII)Ljava/awt/Frame;", line = 404)
    public static final Frame method1509(class140 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field3220;
        if (!arg0.method1059(arg2 ^ 85)) {
            return null;
        } else {
            if (~arg5 == -1) {
                class169[] var6 = class105.method783((byte) 88, arg0);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
                    if (~var6[var8].field2105 == ~arg1 && var6[var8].field2103 == arg3 && (~arg4 == -1 || ~var6[var8].field2100 == ~arg4) && (!var7 || ~var6[var8].field2102 < ~arg5)) {
                        var7 = true;
                        arg5 = var6[var8].field2102;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class548 var9 = arg0.method1060(arg5, arg3, arg1, -3492, arg4);
            while (~var9.field7108 == -1) {
                class122.method905(10L, -6145);
            }
            Frame var10 = (Frame) var9.field7113;
            if (var10 == null) {
                return null;
            } else if (~var9.field7108 == -3) {
                class294.method1737(var10, arg0, (byte) 113);
                return null;
            } else {
                if (arg2 != 84) {
                    field3215 = null;
                }
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Z", line = 478)
    public static final boolean method1510(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class47.field664; ++var3) {
            class24 var4 = class645.field8990[var3];
            if (var4.field274 == 1) {
                int var5 = var4.field272 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field273 * var5 >> 8) + var4.field265;
                    int var7 = (var4.field264 * var5 >> 8) + var4.field276;
                    int var8 = (var4.field261 * var5 >> 8) + var4.field271;
                    int var9 = (var4.field262 * var5 >> 8) + var4.field267;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field274 == 2) {
                int var10 = arg0 - var4.field272;
                if (var10 > 0) {
                    int var11 = (var4.field273 * var10 >> 8) + var4.field265;
                    int var12 = (var4.field264 * var10 >> 8) + var4.field276;
                    int var13 = (var4.field261 * var10 >> 8) + var4.field271;
                    int var14 = (var4.field262 * var10 >> 8) + var4.field267;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field274 == 3) {
                int var15 = var4.field265 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field278 * var15 >> 8) + var4.field272;
                    int var17 = (var4.field269 * var15 >> 8) + var4.field277;
                    int var18 = (var4.field261 * var15 >> 8) + var4.field271;
                    int var19 = (var4.field262 * var15 >> 8) + var4.field267;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field274 == 4) {
                int var20 = arg2 - var4.field265;
                if (var20 > 0) {
                    int var21 = (var4.field278 * var20 >> 8) + var4.field272;
                    int var22 = (var4.field269 * var20 >> 8) + var4.field277;
                    int var23 = (var4.field261 * var20 >> 8) + var4.field271;
                    int var24 = (var4.field262 * var20 >> 8) + var4.field267;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field274 == 5) {
                int var25 = arg1 - var4.field271;
                if (var25 > 0) {
                    int var26 = (var4.field278 * var25 >> 8) + var4.field272;
                    int var27 = (var4.field269 * var25 >> 8) + var4.field277;
                    int var28 = (var4.field273 * var25 >> 8) + var4.field265;
                    int var29 = (var4.field264 * var25 >> 8) + var4.field276;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIIII[IZ)V", line = 611)
    public final void method1511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, boolean arg8) {
        ++field3218;
        if (arg4 == 0) {
            arg4 = arg1;
        }
        if (arg8) {
            int[] var10 = new int[arg1 * arg2];
            for (int var11 = 0; arg2 > var11; ++var11) {
                int var12 = arg1 * var11;
                int var13 = (arg2 - var11 + -1) * arg4 - -arg3;
                for (int var14 = 0; var14 < arg1; ++var14) {
                    var10[var12++] = arg7[var13++];
                }
            }
            arg7 = var10;
        }
        super.field9933.method3388(this, false);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field9928, arg0, arg6, arg5, arg1, arg2, 32993, super.field9933.field8676, arg7, arg3);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III[BZIIIII)V", line = 660)
    public final void method1512(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3210;
        if (arg0 == 0) {
            arg0 = arg5;
        }
        if (arg4) {
            int var11 = class168.method1158(arg7, (byte) 67);
            int var12 = arg5 * var11;
            int var13 = arg0 * var11;
            byte[] var14 = new byte[arg9 * var12];
            for (int var15 = 0; arg9 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg9 + -1) * var13 - -arg8;
                for (int var18 = 0; var12 > var18; ++var18) {
                    var14[var16++] = arg3[var17++];
                }
            }
            arg3 = var14;
        }
        super.field9933.method3388(this, false);
        if (arg1 != 5065) {
            method1503(true, -5, (class532) null);
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field9928, 0, arg6, arg2, arg5, arg9, arg7, 5121, arg3, arg8);
        if (arg0 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
