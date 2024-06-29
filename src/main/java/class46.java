import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class381 {

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field959 = -1;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    private int field960 = -1;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[[S")
    public static short[][] field961;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lbj;")
    public static class162 field962;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "Z")
    public static boolean field967;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "Lgh;")
    public static class388 field968;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "[Lo;")
    public static class24[] field963;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public static void method455(int arg0) {
        if (arg0 != 6) {
            method455(82);
        }
        field968 = null;
        field961 = null;
        field963 = null;
        field962 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lda;IIZ[[BI)V")
    public class46(class44 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field957 = arg2;
        super.field5575.method381((byte) 28, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5568, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILsd;IIIIIIIII)Z")
    public static final boolean method456(int arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field966;
        int var11 = arg9;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class416.field6275[var13][var14] = 99;
        int var16 = -var14 + arg10;
        class290.field4437[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        if (arg2 != 3917) {
            return true;
        } else {
            class246.field3801[var17] = arg9;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class441.field6555[var10001] = arg10;
            int[][] var19 = arg1.field1283;
            while (var26 != var18) {
                var11 = class246.field3801[var18];
                var12 = class441.field6555[var18];
                int var20 = var12 - var16;
                var18 = var18 + 1 & 4095;
                int var21 = -var15 + var11;
                int var22 = var11 - arg1.field1301;
                int var23 = var12 - arg1.field1286;
                if (arg6 != -4) {
                    if (~arg6 != 2) {
                        if (arg6 != -2) {
                            if (arg6 != -1) {
                                if (~arg6 != -1 && arg6 != 1 && ~arg6 != -3 && ~arg6 != -4 && arg6 != 9) {
                                    if (arg1.method550(2, var12, arg6, arg7, arg5, var11, arg0, (byte) 109)) {
                                        class129.field2204 = var11;
                                        class81.field1634 = var12;
                                        return true;
                                    }
                                } else if (arg1.method557(arg7, var12, arg6, arg0, arg5, (byte) 73, var11, 2)) {
                                    class81.field1634 = var12;
                                    class129.field2204 = var11;
                                    return true;
                                }
                            } else if (arg1.method565(arg8, var11, arg4, false, var12, 2, arg3, arg7, arg5)) {
                                class81.field1634 = var12;
                                class129.field2204 = var11;
                                return true;
                            }
                        } else if (arg1.method561(arg5, 2, arg7, arg8, arg4, arg3, var12, var11, 8388608, 2)) {
                            class129.field2204 = var11;
                            class81.field1634 = var12;
                            return true;
                        }
                    } else if (class202.method1391(25356, arg5, arg4, var12, var11, 2, 2, arg3, arg7)) {
                        class129.field2204 = var11;
                        class81.field1634 = var12;
                        return true;
                    }
                } else if (~arg5 == ~var11 && arg7 == var12) {
                    class129.field2204 = var11;
                    class81.field1634 = var12;
                    return true;
                }
                int var25 = class290.field4437[var21][var20] + 1;
                if (~var21 < -1 && ~class416.field6275[var21 - 1][var20] == -1 && ~(var19[var22 + -1][var23] & 1134821376) == -1 && ~(var19[var22 + -1][var23 + 1] & 1310982144) == -1) {
                    class246.field3801[var26] = var11 - 1;
                    class441.field6555[var26] = var12;
                    class416.field6275[var21 + -1][var20] = 2;
                    var26 = 4095 & var26 + 1;
                    class290.field4437[var21 + -1][var20] = var25;
                }
                if (~var21 > -127 && ~class416.field6275[var21 - -1][var20] == -1 && (1625554944 & var19[var22 + 2][var23]) == 0 && ~(var19[var22 - -2][var23 + 1] & 2015625216) == -1) {
                    class246.field3801[var26] = var11 - -1;
                    class441.field6555[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class416.field6275[var21 + 1][var20] = 8;
                    class290.field4437[var21 - -1][var20] = var25;
                }
                if (var20 > 0 && ~class416.field6275[var21][var20 + -1] == -1 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && ~(var19[var22 + 1][var23 - 1] & 1625554944) == -1) {
                    class246.field3801[var26] = var11;
                    class441.field6555[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class416.field6275[var21][var20 + -1] = 1;
                    class290.field4437[var21][var20 + -1] = var25;
                }
                if (~var20 > -127 && ~class416.field6275[var21][var20 + 1] == -1 && (1310982144 & var19[var22][var23 + 2]) == 0 && ~(2015625216 & var19[var22 + 1][var23 + 2]) == -1) {
                    class246.field3801[var26] = var11;
                    class441.field6555[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class416.field6275[var21][var20 + 1] = 4;
                    class290.field4437[var21][var20 - -1] = var25;
                }
                if (var21 > 0 && ~var20 < -1 && ~class416.field6275[var21 - 1][var20 - 1] == -1 && ~(var19[var22 + -1][var23] & 1336147968) == -1 && (var19[var22 + -1][var23 - 1] & 1134821376) == 0 && ~(var19[var22][var23 + -1] & 1675886592) == -1) {
                    class246.field3801[var26] = var11 + -1;
                    class441.field6555[var26] = var12 + -1;
                    class416.field6275[var21 - 1][var20 + -1] = 3;
                    var26 = 4095 & var26 + 1;
                    class290.field4437[var21 + -1][var20 - 1] = var25;
                }
                if (~var21 > -127 && ~var20 < -1 && class416.field6275[var21 + 1][var20 + -1] == 0 && ~(1675886592 & var19[var22 + 1][var23 + -1]) == -1 && (1625554944 & var19[var22 - -2][var23 + -1]) == 0 && ~(2028208128 & var19[var22 - -2][var23]) == -1) {
                    class246.field3801[var26] = var11 + 1;
                    class441.field6555[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class416.field6275[var21 + 1][var20 + -1] = 9;
                    class290.field4437[var21 + 1][var20 + -1] = var25;
                }
                if (var21 > 0 && var20 < 126 && ~class416.field6275[var21 - 1][var20 + 1] == -1 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && ~(2116288512 & var19[var22][var23 + 2]) == -1) {
                    class246.field3801[var26] = var11 + -1;
                    class441.field6555[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class416.field6275[var21 + -1][var20 + 1] = 6;
                    class290.field4437[var21 + -1][var20 - -1] = var25;
                }
                if (var21 < 126 && ~var20 > -127 && ~class416.field6275[var21 + 1][var20 + 1] == -1 && (var19[var22 + 1][var23 + 2] & 2116288512) == 0 && ~(var19[var22 - -2][var23 + 2] & 2015625216) == -1 && (var19[var22 + 2][var23 + 1] & 2028208128) == 0) {
                    class246.field3801[var26] = var11 - -1;
                    class441.field6555[var26] = var12 + 1;
                    var26 = 4095 & var26 - -1;
                    class416.field6275[var21 - -1][var20 + 1] = 12;
                    class290.field4437[var21 - -1][var20 + 1] = var25;
                }
            }
            class129.field2204 = var11;
            class81.field1634 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIB)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field958;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg0, super.field5561, arg1);
        if (arg4 > -62) {
            field967 = true;
        }
        this.field959 = arg2;
        this.field960 = arg3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (arg0 != 1) {
            method456(105, (class63) null, -57, 112, 72, -57, 72, -20, 82, -25, 52);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field959, this.field960, 3553, 0, 0);
        ++field965;
        this.field960 = -1;
        this.field959 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lda;II)V")
    public class46(class44 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field957 = arg2;
        super.field5575.method381((byte) 28, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field5568, arg2, arg2, 0, class174.method1201((byte) -57, super.field5568), 5121, (byte[]) null, 0);
        }
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lda;IIZ[[I)V")
    public class46(class44 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field957 = arg2;
        super.field5575.method381((byte) 28, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field5568, arg2, arg2, 0, 32993, super.field5575.field833, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class88.method808(super.field5568, arg2, super.field5575.field833, 32993, var7 + 34069, arg4[var7], 0, arg2);
            }
        }
        this.method2346(3, true);
    }

    static {
        new class309("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field961 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
        field962 = new class162(38, 5);
        field967 = false;
        field968 = null;
        field969 = 0;
    }
}
