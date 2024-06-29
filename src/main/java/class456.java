import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class456 extends class205 {

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
    private int field6527 = -1;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
    private int field6534 = -1;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public int field6528;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "[I")
    public static int[] field6531 = new int[4];

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "Lmw;")
    public static class517 field6529 = new class517(10, -1);

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "I")
    public static int field6535;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rba", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field6538;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "[I")
    public static int[] field6536;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "[[B")
    public static byte[][] field6537;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2711(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Llf;IIIIZ[BIZ)V", line = 4)
    public class456(class250 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6523 = arg3;
        this.field6528 = arg4;
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
        super.field2640.method1595((byte) 116, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field2649 != 34037) {
            class254.method1675(arg2, arg4, 121, arg7, arg3, arg1, arg6);
            this.method1340(true, -2692);
        } else {
            OpenGL.glTexImage2Dub(super.field2649, 0, super.field2644, this.field6523, this.field6528, 0, arg7, 5121, arg6, 0);
            this.method1340(false, -2692);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "(I)V", line = 57)
    public static void method2703(int arg0) {
        field6537 = null;
        field6536 = null;
        field6529 = null;
        if (arg0 != 26609) {
            method2705((class66) null, 113, true, 71, -77, -106, 98);
        }
        field6531 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V", line = 70)
    public final void method804(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field6527, this.field6534, super.field2649, arg0, 0);
        ++field6532;
        this.field6534 = -1;
        this.field6527 = -1;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Llf;IIII)V", line = 81)
    public class456(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field6523 = arg3;
        this.field6528 = arg4;
        super.field2640.method1595((byte) 113, this);
        OpenGL.glTexImage2Dub(super.field2649, 0, super.field2644, arg3, arg4, 0, class172.method1167(4229, super.field2644), 5121, (byte[]) null, 0);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIB)V", line = 94)
    public final void method2704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field6524;
        if (arg6 > -1) {
            this.method2704(-61, 115, 76, 63, -113, -90, (byte) 126);
        }
        int var8 = super.field2640.field3421 - arg4 - arg1;
        super.field2640.method1595((byte) 114, this);
        OpenGL.glCopyTexSubImage2D(super.field2649, 0, arg3, -arg4 - (arg2 - this.field6528), arg5, var8, arg0, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Llf;IIIII)V", line = 109)
    public class456(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field6528 = arg5;
        this.field6523 = arg4;
        int var7 = super.field2640.field3421 - (arg3 + arg5);
        super.field2640.method1595((byte) 73, this);
        OpenGL.glCopyTexImage2D(super.field2649, 0, super.field2644, arg2, var7, arg4, arg5, 0);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lha;IZIIII)V", line = 124)
    public static final void method2705(class66 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2) {
            ++field6533;
            if ((class34.field374 == null || class339.field4752 == null || class120.field1627 == null) && class490.field6826.method1185(class199.field2572, 9330) && class490.field6826.method1185(class492.field6921, 9330) && class490.field6826.method1185(class285.field4089, 9330)) {
                class162 var7 = class162.method1115(class490.field6826, class492.field6921, 0);
                class339.field4752 = arg0.method466(var7, true);
                var7.method1128();
                class446.field6414 = arg0.method466(var7, true);
                class34.field374 = arg0.method466(class162.method1115(class490.field6826, class199.field2572, 0), true);
                class162 var8 = class162.method1115(class490.field6826, class285.field4089, 0);
                class120.field1627 = arg0.method466(var8, true);
                var8.method1128();
                class90.field1279 = arg0.method466(var8, true);
            }
            if (class34.field374 != null && class339.field4752 != null && class120.field1627 != null) {
                int var9 = (arg3 - 2 * class120.field1627.method350()) / class34.field374.method350();
                for (int var10 = 0; ~var10 > ~var9; ++var10) {
                    class34.field374.method968(class120.field1627.method350() + arg1 - -(var10 * class34.field374.method350()), -class34.field374.method351() + arg5 + arg6);
                }
                int var11 = (arg5 + -arg4 + -class120.field1627.method351()) / class339.field4752.method351();
                for (int var12 = 0; var12 < var11; ++var12) {
                    class339.field4752.method968(arg1, arg6 - -arg4 - -(var12 * class339.field4752.method351()));
                    class446.field6414.method968(arg1 + arg3 - class446.field6414.method350(), class339.field4752.method351() * var12 + arg4 + arg6);
                }
                class120.field1627.method968(arg1, -class120.field1627.method351() + arg6 - -arg5);
                class90.field1279.method968(-class120.field1627.method350() + arg1 - -arg3, arg6 - (-arg5 + class120.field1627.method351()));
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Llf;IIIIZ[IIIZ)V", line = 182)
    public class456(class250 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6528 = arg4;
        this.field6523 = arg3;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; ~var12 > ~arg4; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (arg4 - (var12 - -1)) * arg3;
                for (int var15 = 0; ~var15 > ~arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field2640.method1595((byte) 124, this);
        if (super.field2649 != 34037 && arg5 && ~arg7 == -1 && ~arg8 == -1) {
            class368.method2307(arg6, super.field2644, this.field6528, 32993, super.field2649, this.field6523, -125, super.field2640.field3660);
            this.method1340(true, -2692);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field2649, 0, super.field2644, this.field6523, this.field6528, 0, 32993, super.field2640.field3660, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method1340(false, -2692);
        }
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIZ)V", line = 237)
    public final void method2706(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method2707((byte[]) null, -89, 39, -85, 111, -44, false, true, -71, -119);
        }
        ++field6535;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg1, super.field2649, super.field2637, arg0);
        this.field6527 = arg2;
        this.field6534 = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "([BIIIIIZZII)V", line = 253)
    public final void method2707(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9) {
        ++field6525;
        if (arg5 == 0) {
            arg5 = arg9;
        }
        if (arg7) {
            int var11 = class478.method2826(arg1, (byte) 107);
            int var12 = arg9 * var11;
            int var13 = arg5 * var11;
            byte[] var14 = new byte[arg8 * var12];
            for (int var15 = 0; ~var15 > ~arg8; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg8 + -1) * var13 + arg2;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg0[var17++];
                }
            }
            arg0 = var14;
        }
        super.field2640.method1595((byte) 126, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 != arg9) {
            OpenGL.glPixelStorei(3314, arg5);
        }
        OpenGL.glTexSubImage2Dub(super.field2649, 0, arg4, arg3, arg9, arg8, arg1, 5121, arg0, arg2);
        if (arg6) {
            if (arg5 != arg9) {
                OpenGL.glPixelStorei(3314, 0);
            }
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BZZ)V", line = 312)
    public final void method2708(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 != -126) {
            field6529 = null;
        }
        if (~super.field2649 == -3554) {
            super.field2640.method1595((byte) 75, this);
            OpenGL.glTexParameteri(super.field2649, 10242, !arg2 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2649, 10243, !arg1 ? 33071 : 10497);
        }
        ++field6530;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Llf;IIIIZ[FI)V", line = 331)
    public class456(class250 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field6528 = arg4;
        this.field6523 = arg3;
        super.field2640.method1595((byte) 116, this);
        if (arg5 && ~super.field2649 != -34038) {
            class38.method217(arg6, arg4, arg7, 65, arg1, arg2, arg3);
            this.method1340(true, -2692);
        } else {
            OpenGL.glTexImage2Df(super.field2649, 0, super.field2644, this.field6523, this.field6528, 0, arg7, 5126, arg6, 0);
            this.method1340(false, -2692);
        }
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIZIII[I)V", line = 363)
    public final void method2709(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8) {
        ++field6522;
        int var10 = -32 / ((17 - arg5) / 59);
        if (~arg3 == -1) {
            arg3 = arg0;
        }
        if (arg4) {
            int[] var11 = new int[arg0 * arg6];
            for (int var12 = 0; ~var12 > ~arg6; ++var12) {
                int var13 = arg0 * var12;
                int var14 = (-var12 + arg6 + -1) * arg3 - -arg7;
                for (int var15 = 0; arg0 > var15; ++var15) {
                    var11[var13++] = arg8[var14++];
                }
            }
            arg8 = var11;
        }
        super.field2640.method1595((byte) 112, this);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Di(super.field2649, 0, arg1, this.field6528 - (arg2 + arg6), arg0, arg6, 32993, super.field2640.field3660, arg8, arg7);
        if (~arg0 != ~arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lha;II)Z", line = 418)
    public static final boolean method2710(class66 arg0, int arg1, int arg2) {
        ++field6526;
        int var3 = (class102.field1467 + -104) / 2;
        int var4 = (class393.field5663 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~(var3 + 104) < ~var6; ++var6) {
            for (int var57 = var4; ~(var4 - -104) < ~var57; ++var57) {
                for (int var58 = arg2; ~var58 >= -4; ++var58) {
                    if (class616.method3419(var57, arg2, -1, var58, var6)) {
                        int var59 = var58;
                        if (class49.method310(var6, var57, (byte) 98)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class616.method3418(var59, var57, var6, (byte) 39);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            if (arg1 != 4) {
                field6529 = null;
            }
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                var7[var8] = -16777216;
            }
            class103.field1472 = arg0.method446(var7, arg1 ^ -119, 512, 512, 512, 0);
            class133.method941((byte) 115);
            int var9 = -16777216 | -10 - (-((int) (20.0D * Math.random())) + -238) + (((int) (Math.random() * 20.0D) + 238 + -10 << 16) - -(228 - -((int) (Math.random() * 20.0D)) << 8));
            int var10 = (238 - (-((int) (20.0D * Math.random())) - -10) | 477298432) << 16;
            int var11 = (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random());
            boolean[][] var12 = new boolean[class687.field9192 + 1 + 2][class687.field9192 + 2 - -1];
            for (int var13 = var3; var3 + 104 > var13; var13 += class687.field9192) {
                for (int var36 = var4; ~var36 > ~(var4 + 104); var36 += class687.field9192) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var37 += 4;
                        var39 = var13 - 1;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class687.field9192 + var13;
                    if (var41 < 104) {
                        ++var41;
                    }
                    int var42 = var36 - -class687.field9192;
                    if (~var42 > -105) {
                        ++var42;
                        var38 += 4;
                    }
                    arg0.method453(0, 0, class687.field9192 * 4 + var37, var38 - -(class687.field9192 * 4));
                    arg0.method493(-16777216);
                    for (int var43 = arg2; ~var43 >= -4; ++var43) {
                        for (int var50 = 0; ~class687.field9192 <= ~var50; ++var50) {
                            for (int var56 = 0; var56 <= class687.field9192; ++var56) {
                                var12[var50][var56] = class616.method3419(var40 - -var56, arg2, -1, var43, var39 + var50);
                            }
                        }
                        class648.field8748[var43].method203(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class250.field3506) {
                            for (int var51 = -4; class687.field9192 > var51; ++var51) {
                                for (int var52 = -4; ~class687.field9192 < ~var52; ++var52) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (~var3 >= ~var53 && var4 <= var54 && class616.method3419(var54, arg2, -1, var43, var53)) {
                                        int var55 = var43;
                                        if (class49.method310(var53, var54, (byte) 86)) {
                                            var55 = var43 - 1;
                                        }
                                        if (~var55 <= -1) {
                                            class710.method3940(arg0, 0, var54, var53, var10, var55, (class687.field9192 - var52) * 4 + (var38 - 4), var9, var51 * 4 + var37);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class250.field3506) {
                        class224 var44 = class257.field3830[arg2];
                        for (int var45 = 0; class687.field9192 > var45; ++var45) {
                            for (int var46 = 0; class687.field9192 > var46; ++var46) {
                                int var47 = var13 - -var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field2908[var47 - var44.field2896][-var44.field2912 + var48];
                                if (~(1076101120 & var49) != -1) {
                                    arg0.method529(4, (class687.field9192 - var46) * 4 + var38 - 4, 4, var37 - -(var45 * 4), -1713569622, 1);
                                } else if (~(8388608 & var49) != -1) {
                                    arg0.method544(var45 * 4 + var37, 4, (-var46 + class687.field9192) * 4 + var38 + -4, -1713569622, (byte) 127);
                                } else if (~(var49 & 33554432) != -1) {
                                    arg0.method457(var45 * 4 + var37 + 3, -1713569622, 0, (-var46 + class687.field9192) * 4 - 4 + var38, 4);
                                } else if (~(134217728 & var49) != -1) {
                                    arg0.method544(var45 * 4 + var37, 4, (-var46 + class687.field9192) * 4 - 4 + var38 + 3, -1713569622, (byte) 127);
                                } else if (~(var49 & 536870912) != -1) {
                                    arg0.method457(var37 - -(var45 * 4), -1713569622, 0, (class687.field9192 - var46) * 4 + var38 + -4, 4);
                                }
                            }
                        }
                    }
                    arg0.method434(var37, var38, class687.field9192 * 4, class687.field9192 * 4, var11, 2);
                    class103.field1472.method341((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class687.field9192 * 4), class687.field9192 * 4, class687.field9192 * 4, var37, var38);
                }
            }
            arg0.method526();
            arg0.method493(-16777215);
            class166.method1137(false);
            class684.field9142 = 0;
            class655.field8839.method690(arg1 + 20130);
            if (!class250.field3506) {
                for (int var14 = var3; ~var14 > ~(var3 + 104); ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg2; arg2 + 1 >= var21 && ~var21 >= -4; ++var21) {
                            if (class616.method3419(var20, arg2, -1, var21, var14)) {
                                class602 var22 = (class602) class257.method1754(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class602) class4.method28(var21, var14, var20, field6538 != null ? field6538 : (field6538 = method2711("nf")));
                                }
                                if (var22 == null) {
                                    var22 = (class602) class634.method3501(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class602) class506.method2944(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class412 var23 = class210.field2705.method1362(0, var22.method1748(5875));
                                    if (!var23.field5889 || class86.field1212) {
                                        int var24 = var23.field5881;
                                        if (var23.field5919 != null) {
                                            for (int var25 = 0; ~var23.field5919.length < ~var25; ++var25) {
                                                if (~var23.field5919[var25] != 0) {
                                                    class412 var26 = class210.field2705.method1362(0, var23.field5919[var25]);
                                                    if (var26.field5881 >= 0) {
                                                        var24 = var26.field5881;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class349 var28 = class323.field4586.method2074(97, var24);
                                                if (var28 != null && var28.field5054) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class257.field3830[var21].field2908;
                                                int var32 = class257.field3830[var21].field2896;
                                                int var33 = class257.field3830[var21].field2912;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && var29 > var3 && ~(var14 + -3) > ~var29 && ~(var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == -1) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && var3 + 104 + -1 > var29 && ~var29 > ~(var14 + 3) && (var31[-var32 + var29 + 1][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var4 < var30 && ~var30 < ~(var20 - 3) && ~(2883842 & var31[-var32 + var29][var30 - (1 - -var33)]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && var30 < var4 - -104 + -1 && var30 < var20 + 3 && ~(var31[-var32 + var29][var30 + 1 + -var33] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class383.field5567[class684.field9142] = var23.field5850;
                                            class781.field10717[class684.field9142] = var29;
                                            class322.field4567[class684.field9142] = var30;
                                            ++class684.field9142;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class498.field6992 != null) {
                    class677.field9085.field2259 = 1;
                    class323.field4586.method2067(-13764, 64, 1024);
                    for (int var15 = 0; ~var15 > ~class498.field6992.field4680; ++var15) {
                        int var16 = class498.field6992.field4677[var15];
                        if (~(var16 >> 28) == ~class625.field8475.field2813) {
                            int var17 = (var16 >> 14 & 16383) + -class120.field1625;
                            int var18 = (var16 & 16383) + -class259.field3849;
                            if (~var17 <= -1 && ~var17 > ~class102.field1467 && ~var18 <= -1 && var18 < class393.field5663) {
                                class655.field8839.method689(new class445(var15), 111);
                            } else {
                                class349 var19 = class323.field4586.method2074(89, class498.field6992.field4679[var15]);
                                if (var19.field5090 != null && var19.field5087 + var17 >= 0 && class102.field1467 > var19.field5095 + var17 && var18 - -var19.field5093 >= 0 && ~(var18 - -var19.field5059) > ~class393.field5663) {
                                    class655.field8839.method689(new class445(var15), 120);
                                }
                            }
                        }
                    }
                    class323.field4586.method2067(-13764, 64, 128);
                    class677.field9085.field2259 = 2;
                    class677.field9085.method1187(39);
                }
            }
            return true;
        }
    }
}
