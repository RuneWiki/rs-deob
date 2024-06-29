import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class187 extends class179 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    private int field2921 = -1;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    private int field2925 = -1;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Lbs;")
    public static class111 field2932;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Z")
    public static boolean field2934;

    static {
        new class306("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        new class306("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2932 = new class111(0);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZZ)V", line = 3)
    public final void method1262(int arg0, boolean arg1, boolean arg2) {
        if (~super.field2829 == -3554) {
            super.field2845.method1471(true, this);
            OpenGL.glTexParameteri(super.field2829, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field2829, 10243, !arg2 ? 33071 : 10497);
        }
        if (arg0 != -1) {
            this.field2914 = -115;
        }
        ++field2928;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 24)
    public final void method1213(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field2921, this.field2925, super.field2829, arg0, 0);
        ++field2919;
        this.field2925 = -1;
        this.field2921 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)V", line = 34)
    public final void method1263(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -1) {
            OpenGL.glFramebufferTexture2DEXT(arg1, arg2, super.field2829, super.field2843, arg3);
            ++field2927;
            this.field2921 = arg1;
            this.field2925 = arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIIII)V", line = 49)
    public final void method1264(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2923;
        int var8 = super.field2845.field3569 - arg1 + -arg4;
        super.field2845.method1471(arg2, this);
        OpenGL.glCopyTexSubImage2D(super.field2829, 0, arg0, -arg5 - (arg4 - this.field2914), arg6, var8, arg3, arg4);
        if (!arg2) {
            field2933 = 113;
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lih;IIII)V", line = 67)
    public class187(class214 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2920 = arg3;
        this.field2914 = arg4;
        super.field2845.method1471(true, this);
        OpenGL.glTexImage2Dub(super.field2829, 0, super.field2832, arg3, arg4, 0, class344.method2215(super.field2832, -12017), 5121, (byte[]) null, 0);
        this.method1208(true, -112);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lih;IIIII)V", line = 79)
    public class187(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2920 = arg4;
        this.field2914 = arg5;
        int var7 = -arg3 + super.field2845.field3569 - arg5;
        super.field2845.method1471(true, this);
        OpenGL.glCopyTexImage2D(super.field2829, 0, super.field2832, arg2, var7, arg4, arg5, 0);
        this.method1208(true, -101);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 93)
    public static final void method1265(int arg0) {
        ++field2924;
        if (arg0 != 256) {
            field2934 = true;
        }
        if (class309.field4912 == null || class162.field2583 == null) {
            class162.field2583 = new int[256];
            class309.field4912 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class309.field4912[var1] = (int) (Math.sin(var2) * 4096.0D);
                class162.field2583[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lih;IIIIZ[IZ)V", line = 124)
    public class187(class214 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, boolean arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2914 = arg4;
        this.field2920 = arg3;
        if (arg7) {
            int[] var9 = new int[arg6.length];
            for (int var10 = 0; arg4 > var10; ++var10) {
                int var11 = arg3 * var10;
                int var12 = (-var10 + arg4 + -1) * arg3;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    var9[var11++] = arg6[var12++];
                }
            }
            arg6 = var9;
        }
        super.field2845.method1471(true, this);
        if (arg5 && super.field2829 != 34037) {
            class531.method3142(super.field2832, arg6, super.field2845.field3671, super.field2829, (byte) 7, this.field2914, 32993, this.field2920);
            this.method1210(true, (byte) -119);
        } else {
            OpenGL.glTexImage2Di(super.field2829, 0, super.field2832, this.field2920, this.field2914, 0, 32993, super.field2845.field3671, arg6, 0);
            this.method1210(false, (byte) -121);
        }
        this.method1208(true, -122);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLnv;ILjava/awt/Canvas;Ll;)Lza;", line = 174)
    public static final class491 method1266(byte arg0, class493 arg1, int arg2, Canvas arg3, class196 arg4) {
        ++field2930;
        if (arg0 <= 113) {
            method1269(89);
        }
        return new class454(arg2, arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V", line = 185)
    public static final void method1267(boolean arg0) {
        ++field2917;
        class300.field4809.method2783((byte) -19);
        class1.field7.method2958(-123);
        class106.field1901.method1503(3);
        class61.field928.method792((byte) -95);
        class22.field239.method1097(-88);
        class20.field218.method2218(250);
        class130.field2232.method636(-81);
        class30.field482.method2634(64);
        class189.field2953.method2904(64);
        class338.field5296.method2578(0);
        class224.field3870.method1936(3018);
        class272.field4515.method2007(-54);
        class94.field1585.method493(2);
        class446.field6660.method2980((byte) -128);
        class213.field3383.method2255(0);
        class503.field7338.method1618(6095);
        if (arg0) {
            class279.field4582.method2507((byte) -62);
            class343.field5367.method407(!arg0);
            class209.field3313.method1915(64);
            class160.field2563.method1347(-117);
            class130.method997(-122);
            class55.method382(0);
            class135.method1019((byte) -118);
            class446.method2683((byte) 113);
            class462.field6872.method1598(-121);
            class115.field2049.method1598(-65);
            class22.field235.method1598(-93);
            class469.field6965.method1598(-62);
            class521.field7693.method1598(95);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBZI[BIIIII)V", line = 229)
    public final void method1268(int arg0, byte arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == 0) {
            arg7 = arg0;
        }
        ++field2926;
        if (arg2) {
            int var11 = class214.method1412(arg6, -97);
            int var12 = arg0 * var11;
            int var13 = arg7 * var11;
            byte[] var14 = new byte[arg5 * var12];
            for (int var15 = 0; arg5 > var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg5 + -1) * var13 + arg9;
                for (int var18 = 0; ~var18 > ~var12; ++var18) {
                    var14[var16++] = arg4[var17++];
                }
            }
            arg4 = var14;
        }
        super.field2845.method1471(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Dub(super.field2829, 0, arg8, arg3, arg0, arg5, arg6, 5121, arg4, arg9);
        if (arg1 != 125) {
            method1271(13, (byte) -123);
        }
        if (arg0 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lih;IIIIZ[BIZ)V", line = 295)
    public class187(class214 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2914 = arg4;
        this.field2920 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; var11 < arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + arg4 - 1) * arg3;
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field2845.method1471(true, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && ~super.field2829 != -34038) {
            class466.method2770(arg4, arg7, arg6, arg2, 0, arg3, arg1);
            this.method1210(true, (byte) -115);
        } else {
            OpenGL.glTexImage2Dub(super.field2829, 0, super.field2832, this.field2920, this.field2914, 0, arg7, 5121, arg6, 0);
            this.method1210(false, (byte) -127);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method1208(true, -127);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lih;IIIIZ[FI)V", line = 574)
    public class187(class214 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2914 = arg4;
        this.field2920 = arg3;
        super.field2845.method1471(true, this);
        if (arg5 && ~super.field2829 != -34038) {
            class97.method676(arg6, arg2, arg4, arg1, 4, arg3, arg7);
            this.method1210(true, (byte) -108);
        } else {
            OpenGL.glTexImage2Df(super.field2829, 0, super.field2832, this.field2920, this.field2914, 0, arg7, 5126, arg6, 0);
            this.method1210(false, (byte) -113);
        }
        this.method1208(true, -113);
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 348)
    public static void method1269(int arg0) {
        field2932 = null;
        if (arg0 >= -92) {
            method1270((byte) -103, (class340) null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLap;)V", line = 362)
    public static final void method1270(byte arg0, class340 arg1) {
        ++field2931;
        arg1.method2154((byte) -126);
        int var2 = 0;
        for (int var3 = 0; var3 < class151.field2425; ++var3) {
            int var16 = class45.field734[var3];
            if ((1 & class434.field6474[var16]) == 0) {
                if (var2 > 0) {
                    class434.field6474[var16] = (byte) class338.method2141(class434.field6474[var16], 2);
                    --var2;
                } else {
                    int var17 = arg1.method2155(1, 30390);
                    if (var17 == 0) {
                        var2 = class291.method1878(0, arg1);
                        class434.field6474[var16] = (byte) class338.method2141(class434.field6474[var16], 2);
                    } else {
                        class202.method1332(arg1, var16, (byte) 72);
                    }
                }
            }
        }
        arg1.method2149(30795);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method2154((byte) -119);
            int var4 = 65 % ((-21 - arg0) / 58);
            for (int var5 = 0; ~var5 > ~class151.field2425; ++var5) {
                int var14 = class45.field734[var5];
                if ((1 & class434.field6474[var14]) != 0) {
                    if (~var2 < -1) {
                        --var2;
                        class434.field6474[var14] = (byte) class338.method2141(class434.field6474[var14], 2);
                    } else {
                        int var15 = arg1.method2155(1, 30390);
                        if (var15 == 0) {
                            var2 = class291.method1878(0, arg1);
                            class434.field6474[var14] = (byte) class338.method2141(class434.field6474[var14], 2);
                        } else {
                            class202.method1332(arg1, var14, (byte) 72);
                        }
                    }
                }
            }
            arg1.method2149(30795);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method2154((byte) -128);
                for (int var6 = 0; ~class328.field5181 < ~var6; ++var6) {
                    int var12 = class100.field1662[var6];
                    if (~(class434.field6474[var12] & 1) != -1) {
                        if (~var2 < -1) {
                            --var2;
                            class434.field6474[var12] = (byte) class338.method2141(class434.field6474[var12], 2);
                        } else {
                            int var13 = arg1.method2155(1, 30390);
                            if (~var13 == -1) {
                                var2 = class291.method1878(0, arg1);
                                class434.field6474[var12] = (byte) class338.method2141(class434.field6474[var12], 2);
                            } else if (class457.method2738(255, var12, arg1)) {
                                class434.field6474[var12] = (byte) class338.method2141(class434.field6474[var12], 2);
                            }
                        }
                    }
                }
                arg1.method2149(30795);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method2154((byte) -125);
                    for (int var7 = 0; var7 < class328.field5181; ++var7) {
                        int var10 = class100.field1662[var7];
                        if (~(1 & class434.field6474[var10]) == -1) {
                            if (var2 > 0) {
                                --var2;
                                class434.field6474[var10] = (byte) class338.method2141(class434.field6474[var10], 2);
                            } else {
                                int var11 = arg1.method2155(1, 30390);
                                if (var11 == 0) {
                                    var2 = class291.method1878(0, arg1);
                                    class434.field6474[var10] = (byte) class338.method2141(class434.field6474[var10], 2);
                                } else if (class457.method2738(255, var10, arg1)) {
                                    class434.field6474[var10] = (byte) class338.method2141(class434.field6474[var10], 2);
                                }
                            }
                        }
                    }
                    arg1.method2149(30795);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class328.field5181 = 0;
                        class151.field2425 = 0;
                        for (int var8 = 1; var8 < 2048; ++var8) {
                            class434.field6474[var8] = (byte) (class434.field6474[var8] >> 1);
                            class166 var9 = class435.field6489[var8];
                            if (var9 != null) {
                                class45.field734[class151.field2425++] = var8;
                            } else {
                                class100.field1662[class328.field5181++] = var8;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z", line = 563)
    public static final boolean method1271(int arg0, byte arg1) {
        ++field2915;
        if (arg1 < 39) {
            method1266((byte) -108, (class493) null, 90, (Canvas) null, (class196) null);
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIB[IIIII)V", line = 606)
    public final void method1272(int arg0, boolean arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2918;
        if (arg7 == 0) {
            arg7 = arg6;
        }
        if (arg1) {
            int[] var10 = new int[arg2 * arg6];
            for (int var11 = 0; ~arg2 < ~var11; ++var11) {
                int var12 = arg6 * var11;
                int var13 = (arg2 - var11 + -1) * arg7 + arg8;
                for (int var14 = 0; var14 < arg6; ++var14) {
                    var10[var12++] = arg4[var13++];
                }
            }
            arg4 = var10;
        }
        super.field2845.method1471(true, this);
        if (arg3 != -27) {
            field2929 = -95;
        }
        if (arg6 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field2829, 0, arg0, arg5, arg6, arg2, 32993, super.field2845.field3671, arg4, arg8);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
