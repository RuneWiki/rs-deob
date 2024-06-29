import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[F")
    private static float[] field61 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    private static int field48;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    private static int field53;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    private static int field54;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    private static int field56;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    private static int field57;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    private static int field58;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    private static int field59;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    private static int field62;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[I")
    private static int[] field49;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    private static int[] field60;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[Lsd;")
    public static class33[] field63;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Z")
    private static boolean[] field51;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[Z")
    private static boolean[] field52;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[[[I")
    private static int[][][] field55;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 5)
    public static final void method13() {
        field63 = null;
        field60 = null;
        field52 = null;
        field49 = null;
        field51 = null;
        field55 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method14(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class281.field4606) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field60[var5] != -1) {
                int var6 = field55[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field60[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field55[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field60[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field60[var5] = -1;
            method16(var5);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()V", line = 60)
    public static void method15() {
        field63 = null;
        field55 = (int[][][]) null;
        field60 = null;
        field52 = null;
        field61 = null;
        field49 = null;
        field51 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 70)
    private static final void method16(int arg0) {
        if (field52[arg0]) {
            field52[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class241.field4012;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILsd;III)V", line = 82)
    private static final void method17(int arg0, class33 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class241.field4012;
        if (!field52[arg0]) {
            var6.glEnable(var5);
            field52[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field730);
        var6.glLightfv(var5, 4609, arg1.field734, 0);
        field61[0] = (float) (arg1.field750 - arg2);
        field61[1] = (float) (arg1.field737 - arg3);
        field61[2] = (float) (arg1.field733 - arg4);
        var6.glLightfv(var5, 4611, field61, 0);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()V", line = 100)
    public static final void method18() {
        field63 = new class33[255];
        field60 = new int[4];
        field52 = new boolean[4];
        field49 = new int[4];
        field51 = new boolean[4];
        field55 = new int[field53][field58][field62];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V", line = 109)
    public static final void method19(int arg0, int arg1, int arg2) {
        field53 = arg0;
        field58 = arg1;
        field62 = arg2;
        field55 = new int[field53][field58][field62];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V", line = 115)
    public static final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class281.field4606 || field48 == arg3 && field54 == arg4 && field56 == arg5 && field59 == arg4 && field57 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field51[var6] = false;
        }
        int var7 = 0;
        int var8 = field55[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field60[var10] == var9) {
                        field51[var10] = true;
                        continue label72;
                    }
                }
                field49[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field51[var12]) {
                        field60[var12] = field49[var11];
                        field51[var12] = true;
                        method17(var12, field63[field49[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field51[var13]) {
                    field60[var13] = -1;
                    method16(var13);
                }
            }
            field48 = arg3;
            field54 = arg4;
            field56 = arg5;
            field59 = arg4;
            field57 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V", line = 203)
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class281.field4606) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method20(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field58 - 1) {
            method20(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method20(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field62 - 1) {
            method20(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field62 - 1) {
            method20(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field58 - 1 && arg6 < field62 - 1) {
            method20(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method20(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field58 - 1 && arg6 > 0) {
            method20(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V", line = 258)
    public static final void method22() {
        for (int var0 = 0; var0 < field50; var0++) {
            class33 var1 = field63[var0];
            int var2 = var1.field746;
            if (var1.field729) {
                var2 = 0;
            }
            int var3 = var1.field746;
            if (var1.field732) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field733 >> 7) - var1.field723;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field733 >> 7) + var1.field723;
                if (var7 > field62 - 1) {
                    var7 = field62 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field743[var5++];
                    int var10 = (var9 >> 8) + ((var1.field750 >> 7) - var1.field723);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field58 - 1) {
                        var11 = field58 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field55[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field55[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field55[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field55[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field55[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V", line = 352)
    public static final void method23(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field50; var2++) {
            field63[var2].method239(arg1, arg0, 50);
        }
        field48 = -1;
        field54 = -1;
        field56 = -1;
        field59 = -1;
        field57 = -1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsd;)V", line = 367)
    public static final void method24(class33 arg0) {
        if (field50 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field63[field50++] = arg0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()V", line = 379)
    public static final void method25() {
        GL var0 = class241.field4012;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field60[var3] = -1;
            method16(var3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[[[Lee;)V", line = 405)
    public static final void method26(int arg0, int arg1, class312[][][] arg2) {
        if (!class281.field4606) {
            return;
        }
        GL var3 = class241.field4012;
        class109.method815(-120, 0, 0);
        class241.method1719(0);
        class241.method1702();
        class241.method1687(class241.field4001);
        var3.glDepthMask(false);
        class241.method1716(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field50; var4++) {
            class33 var5 = field63[var4];
            int var6 = var5.field746;
            if (var5.field749) {
                var6--;
            }
            if (var5.field744 != null) {
                int var7 = 0;
                int var8 = (var5.field733 >> 7) - var5.field723;
                int var9 = (var5.field733 >> 7) + var5.field723;
                if (var9 >= class251.field4121) {
                    var9 = class251.field4121 - 1;
                }
                if (var8 < class26.field673) {
                    var7 += class26.field673 - var8;
                    var8 = class26.field673;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field743[var7++];
                    int var12 = (var11 >> 8) + ((var5.field750 >> 7) - var5.field723);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class266.field4341) {
                        var12 = class266.field4341;
                    }
                    if (var13 >= class129.field2247) {
                        var13 = class129.field2247 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class312 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field5081) {
                            class241.method1699(201.5F - (float) var5.field746 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field747 }, 0);
                            var5.field744.method513();
                            continue label72;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class259.field4242, 0);
        var3.glEnableClientState(32888);
        class241.method1695();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V", line = 506)
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class281.field4606 || field48 == arg3 && field54 == arg4 && field56 == arg5 && field59 == arg6 && field57 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field51[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field55[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field49[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field60[var16] == var14) {
                                    if (!field51[var16]) {
                                        field51[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field49[var10++] = var14;
                            var9++;
                            if (var9 == 4) {
                                break label112;
                            }
                        }
                    }
                }
            }
        }
        for (int var17 = 0; var17 < var10; var17++) {
            for (int var18 = 0; var18 < 4; var18++) {
                if (!field51[var18]) {
                    field60[var18] = field49[var17];
                    field51[var18] = true;
                    method17(var18, field63[field49[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field51[var19]) {
                field60[var19] = -1;
                method16(var19);
            }
        }
        field48 = arg3;
        field54 = arg4;
        field56 = arg5;
        field59 = arg6;
        field57 = arg7;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "()V", line = 639)
    public static final void method28() {
        field50 = 0;
        for (int var0 = 0; var0 < field53; var0++) {
            for (int var1 = 0; var1 < field58; var1++) {
                for (int var2 = 0; var2 < field62; var2++) {
                    field55[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "()V", line = 676)
    public static final void method29() {
        for (int var0 = 0; var0 < 4; var0++) {
            field60[var0] = -1;
            method16(var0);
        }
    }
}
