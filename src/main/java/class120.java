import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class120 extends class381 {

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    private int field2098 = -1;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    private int field2105 = -1;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Ljava/util/Random;")
    public static Random field2102 = new Random();

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "[I")
    public static int[] field2110 = new int[16];

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "Lbj;")
    public static class162 field2112 = new class162(76, 8);

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Ls;")
    public static class186 field2113 = new class186(56, -1);

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lda;IIIIZ[IZ)V")
    public class120(class44 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2097 = arg3;
        this.field2107 = arg4;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (arg4 - var10 + -1) * arg3;
                for (int var13 = 0; var13 < arg3; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field5575.method381((byte) 28, this);
        if (arg5 && ~super.field5578 != -34038) {
            class88.method808(super.field5568, this.field2097, super.field5575.field833, 32993, super.field5578, arg6, 0, this.field2107);
            this.method2347((byte) 92, true);
        } else {
            OpenGL.glTexImage2Di(super.field5578, 0, super.field5568, this.field2097, this.field2107, 0, 32993, super.field5575.field833, arg6, 0);
            this.method2347((byte) 92, false);
        }
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZ)V")
    public final void method966(int arg0, int arg1, int arg2, boolean arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.field5578, super.field5561, arg2);
        ++field2106;
        this.field2105 = arg0;
        this.field2098 = arg1;
        if (!arg3) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lda;IIIII)V")
    public class120(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2107 = arg5;
        this.field2097 = arg4;
        int var7 = -arg3 + -arg5 + super.field5575.field725;
        super.field5575.method381((byte) 28, this);
        OpenGL.glCopyTexImage2D(super.field5578, 0, super.field5568, arg2, var7, arg4, arg5, 0);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZZ)V")
    public final void method967(int arg0, boolean arg1, boolean arg2) {
        if (super.field5578 == 3553) {
            super.field5575.method381((byte) 28, this);
            OpenGL.glTexParameteri(super.field5578, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field5578, 10243, !arg2 ? 33071 : 10497);
        }
        if (arg0 != 8276) {
            this.method966(70, 80, -43, false);
        }
        ++field2099;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lda;IIIIZ[FI)V")
    public class120(class44 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2097 = arg3;
        this.field2107 = arg4;
        super.field5575.method381((byte) 28, this);
        if (arg5 && ~super.field5578 != -34038) {
            class52.method488(arg3, arg2, arg1, arg7, arg6, 100, arg4);
            this.method2347((byte) 92, true);
        } else {
            OpenGL.glTexImage2Df(super.field5578, 0, super.field5568, this.field2097, this.field2107, 0, arg7, 5126, arg6, 0);
            this.method2347((byte) 92, false);
        }
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lda;IIIIZ[BIZ)V")
    public class120(class44 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2107 = arg4;
        this.field2097 = arg3;
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
        super.field5575.method381((byte) 28, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field5578 != -34038) {
            class316.method1995(arg4, arg2, (byte) -120, arg6, arg1, arg7, arg3);
            this.method2347((byte) 92, true);
        } else {
            OpenGL.glTexImage2Dub(super.field5578, 0, super.field5568, this.field2097, this.field2107, 0, arg7, 5121, arg6, 0);
            this.method2347((byte) 92, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
    public static final void method968(Object[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 != -27256) {
            field2110 = null;
        }
        ++field2103;
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg1; ~arg2 < ~var10; ++var10) {
                if (~arg4[var10] > ~((var9 & var10) + var7)) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method968(arg0, arg1, var6 + -1, arg3, arg4);
            method968(arg0, var6 + 1, arg2, -27256, arg4);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZIIII[BII)V")
    public final void method969(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        if (arg3 == 0) {
            arg3 = arg0;
        }
        ++field2108;
        if (arg2) {
            int var11 = class185.method1258((byte) 104, arg5);
            int var12 = arg0 * var11;
            int var13 = arg3 * var11;
            byte[] var14 = new byte[arg6 * var12];
            for (int var15 = 0; arg6 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg6 + -1) * var13 + arg1;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg7[var17++];
                }
            }
            arg7 = var14;
        }
        super.field5575.method381((byte) 28, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg0 != ~arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        if (arg4 == 2) {
            OpenGL.glTexSubImage2Dub(super.field5578, 0, arg8, arg9, arg0, arg6, arg5, 5121, arg7, arg1);
            if (arg0 != arg3) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[IIIZIIIZ)V")
    public final void method970(int arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg4) {
            this.method970(75, (int[]) null, -127, -98, false, 28, 18, 22, true);
        }
        ++field2104;
        if (~arg5 == -1) {
            arg5 = arg7;
        }
        if (arg8) {
            int[] var10 = new int[arg0 * arg7];
            for (int var11 = 0; arg0 > var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (-var11 + -1 + arg0) * arg5 + arg6;
                for (int var14 = 0; ~var14 > ~arg7; ++var14) {
                    var10[var12++] = arg1[var13++];
                }
            }
            arg1 = var10;
        }
        super.field5575.method381((byte) 28, this);
        if (~arg5 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Di(super.field5578, 0, arg2, arg3, arg7, arg0, 32993, super.field5575.field833, arg1, arg6);
        if (arg5 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lda;IIII)V")
    public class120(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2107 = arg4;
        this.field2097 = arg3;
        super.field5575.method381((byte) 28, this);
        OpenGL.glTexImage2Dub(super.field5578, 0, super.field5568, arg3, arg4, 0, class174.method1201((byte) -57, super.field5568), 5121, (byte[]) null, 0);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field2105, this.field2098, super.field5578, 0, 0);
        if (arg0 == 1) {
            ++field2101;
            this.field2098 = -1;
            this.field2105 = -1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2100;
        int var8 = -arg5 - (arg2 - super.field5575.field725);
        super.field5575.method381((byte) 28, this);
        OpenGL.glCopyTexSubImage2D(super.field5578, arg6, arg0, this.field2107 - (arg1 - -arg2), arg4, var8, arg3, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 0) {
            ++field2109;
            if (~class467.field6940 >= ~arg1 && ~class43.field600 <= ~arg1) {
                int var5 = class73.method640(class216.field3415, (byte) -96, class372.field5455, arg4);
                int var6 = class73.method640(class216.field3415, (byte) -114, class372.field5455, arg0);
                class256.method1654(var6, arg1, arg3, var5, arg2 + -2);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILha;I)V")
    public static final void method973(int arg0, class43 arg1, int arg2) {
        if (arg0 == -14490) {
            ++field2111;
            boolean var3 = ~arg1.method261(1, 0) == -2;
            if (var3) {
                class522.field7575[class479.field7068++] = arg2;
            }
            int var4 = arg1.method261(2, 0);
            class366 var5 = class73.field1444[arg2];
            if (~var4 == -1) {
                if (var3) {
                    var5.field5353 = false;
                } else if (class174.field2806 == arg2) {
                    throw new RuntimeException("s:lr");
                } else {
                    class202 var6 = class253.field3890[arg2] = new class202();
                    var6.field3258 = (var5.field6084 << 28) - -(class496.field7292 - -var5.field7866[0] >> 6 << 14) - -(class212.field3378 - -var5.field7870[0] >> 6);
                    if (var5.field5342 == -1) {
                        var6.field3256 = var5.field7814.method3100((byte) -115);
                    } else {
                        var6.field3256 = var5.field5342;
                    }
                    var6.field3260 = var5.field5354;
                    var6.field3257 = var5.field7804;
                    if (var5.field5380 > 0) {
                        class380.method2338(var5, 91);
                    }
                    class73.field1444[arg2] = null;
                    if (arg1.method261(1, arg0 ^ -14490) != 0) {
                        class352.method2182(arg1, arg2, -81);
                    }
                }
            } else if (var4 == 1) {
                int var7 = arg1.method261(3, 0);
                int var8 = var5.field7866[0];
                int var9 = var5.field7870[0];
                if (var7 != 0) {
                    if (~var7 == -2) {
                        --var9;
                    } else if (~var7 != -3) {
                        if (var7 == 3) {
                            --var8;
                        } else if (~var7 != -5) {
                            if (var7 != 5) {
                                if (var7 != 6) {
                                    if (~var7 == -8) {
                                        ++var9;
                                        ++var8;
                                    }
                                } else {
                                    ++var9;
                                }
                            } else {
                                ++var9;
                                --var8;
                            }
                        } else {
                            ++var8;
                        }
                    } else {
                        --var9;
                        ++var8;
                    }
                } else {
                    --var8;
                    --var9;
                }
                if (!var3) {
                    var5.method2244((byte) -113, var9, var8, class267.field4058[arg2]);
                } else {
                    var5.field5366 = var9;
                    var5.field5353 = true;
                    var5.field5349 = var8;
                }
            } else if (var4 == 2) {
                int var10 = arg1.method261(4, 0);
                int var11 = var5.field7866[0];
                int var12 = var5.field7870[0];
                if (var10 == 0) {
                    var12 -= 2;
                    var11 -= 2;
                } else if (var10 == 1) {
                    --var11;
                    var12 -= 2;
                } else if (var10 != 2) {
                    if (~var10 == -4) {
                        var12 -= 2;
                        ++var11;
                    } else if (var10 != 4) {
                        if (var10 == 5) {
                            --var12;
                            var11 -= 2;
                        } else if (~var10 != -7) {
                            if (~var10 == -8) {
                                var11 -= 2;
                            } else if (~var10 == -9) {
                                var11 += 2;
                            } else if (~var10 != -10) {
                                if (var10 != 10) {
                                    if (~var10 == -12) {
                                        var11 -= 2;
                                        var12 += 2;
                                    } else if (~var10 != -13) {
                                        if (var10 == 13) {
                                            var12 += 2;
                                        } else if (var10 != 14) {
                                            if (var10 == 15) {
                                                var11 += 2;
                                                var12 += 2;
                                            }
                                        } else {
                                            ++var11;
                                            var12 += 2;
                                        }
                                    } else {
                                        var12 += 2;
                                        --var11;
                                    }
                                } else {
                                    var11 += 2;
                                    ++var12;
                                }
                            } else {
                                ++var12;
                                var11 -= 2;
                            }
                        } else {
                            --var12;
                            var11 += 2;
                        }
                    } else {
                        var12 -= 2;
                        var11 += 2;
                    }
                } else {
                    var12 -= 2;
                }
                if (!var3) {
                    var5.method2244((byte) -119, var12, var11, class267.field4058[arg2]);
                } else {
                    var5.field5366 = var12;
                    var5.field5353 = true;
                    var5.field5349 = var11;
                }
            } else {
                int var13 = arg1.method261(1, 0);
                if (~var13 == -1) {
                    int var14 = arg1.method261(12, 0);
                    int var15 = var14 >> 10;
                    int var16 = var14 >> 5 & 31;
                    if (~var16 < -16) {
                        var16 -= 32;
                    }
                    int var17 = 31 & var14;
                    if (~var17 < -16) {
                        var17 -= 32;
                    }
                    int var18 = var5.field7866[0] + var16;
                    int var19 = var5.field7870[0] - -var17;
                    if (!var3) {
                        var5.method2244((byte) -122, var19, var18, class267.field4058[arg2]);
                    } else {
                        var5.field5366 = var19;
                        var5.field5349 = var18;
                        var5.field5353 = true;
                    }
                    var5.field6084 = (byte) (var5.field6084 + var15 & 3);
                    if (class174.field2806 == arg2) {
                        class211.field3371 = var5.field6084;
                    }
                } else {
                    int var20 = arg1.method261(30, 0);
                    int var21 = var20 >> 28;
                    int var22 = var20 >> 14 & 16383;
                    int var23 = 16383 & var20;
                    int var24 = (class496.field7292 + var22 + var5.field7866[0] & 16383) + -class496.field7292;
                    int var25 = (var5.field7870[0] + class212.field3378 + var23 & 16383) - class212.field3378;
                    if (var3) {
                        var5.field5349 = var24;
                        var5.field5366 = var25;
                        var5.field5353 = true;
                    } else {
                        var5.method2244((byte) -109, var25, var24, class267.field4058[arg2]);
                    }
                    var5.field6084 = (byte) (3 & var5.field6084 + var21);
                    if (~class174.field2806 == ~arg2) {
                        class211.field3371 = var5.field6084;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method974(int arg0) {
        field2110 = null;
        field2112 = null;
        field2102 = null;
        if (arg0 < 21) {
            method972(-44, 23, -86, 30, 60);
        }
        field2113 = null;
    }
}
