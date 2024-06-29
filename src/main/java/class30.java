import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class30 {

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[F")
    private static float[] field707 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    private static int field697;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    private static int field698;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    private static int field704;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    private static int field705;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    private static int field708;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    private static int field709;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    private static int field710;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    private static int field711;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
    private static int[] field700;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    private static int[] field702;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[Lsg;")
    public static class37[] field706;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[Z")
    private static boolean[] field701;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[Z")
    private static boolean[] field703;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[[[I")
    private static int[][][] field699;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V", line = 5)
    public static final void method270(int arg0, int arg1, int arg2) {
        field708 = arg0;
        field705 = arg1;
        field704 = arg2;
        field699 = new int[field708][field705][field704];
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIII)V", line = 14)
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class126.field2340 || field698 == arg3 && field711 == arg4 && field709 == arg5 && field697 == arg4 && field710 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field703[var6] = false;
        }
        int var7 = 0;
        int var8 = field699[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field700[var10] == var9) {
                        field703[var10] = true;
                        continue label72;
                    }
                }
                field702[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field703[var12]) {
                        field700[var12] = field702[var11];
                        field703[var12] = true;
                        method278(var12, field706[field702[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field703[var13]) {
                    field700[var13] = -1;
                    method275(var13);
                }
            }
            field698 = arg3;
            field711 = arg4;
            field709 = arg5;
            field697 = arg4;
            field710 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 101)
    public static final void method272() {
        field712 = 0;
        for (int var0 = 0; var0 < field708; var0++) {
            for (int var1 = 0; var1 < field705; var1++) {
                for (int var2 = 0; var2 < field704; var2++) {
                    field699[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V", line = 131)
    public static final void method273(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field712; var2++) {
            field706[var2].method329(arg0, 5, arg1);
        }
        field698 = -1;
        field711 = -1;
        field709 = -1;
        field697 = -1;
        field710 = -1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 150)
    public static final void method274() {
        field706 = new class37[255];
        field700 = new int[4];
        field701 = new boolean[4];
        field702 = new int[4];
        field703 = new boolean[4];
        field699 = new int[field708][field705][field704];
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 159)
    private static final void method275(int arg0) {
        if (field701[arg0]) {
            field701[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class97.field1801;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lsg;)V", line = 171)
    public static final void method276(class37 arg0) {
        if (field712 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field706[field712++] = arg0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V", line = 186)
    public static final void method277(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class126.field2340) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field700[var5] != -1) {
                int var6 = field699[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field700[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field699[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field700[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field700[var5] = -1;
            method275(var5);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILsg;III)V", line = 231)
    private static final void method278(int arg0, class37 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class97.field1801;
        if (!field701[arg0]) {
            var6.glEnable(var5);
            field701[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field812);
        var6.glLightfv(var5, 4609, arg1.field835, 0);
        field707[0] = (float) (arg1.field843 - arg2);
        field707[1] = (float) (arg1.field837 - arg3);
        field707[2] = (float) (arg1.field814 - arg4);
        var6.glLightfv(var5, 4611, field707, 0);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 250)
    public static final void method279() {
        GL var0 = class97.field1801;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field700[var3] = -1;
            method275(var3);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIII)V", line = 279)
    public static final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class126.field2340 || field698 == arg3 && field711 == arg4 && field709 == arg5 && field697 == arg6 && field710 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field703[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field699[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field702[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field700[var16] == var14) {
                                    if (!field703[var16]) {
                                        field703[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field702[var10++] = var14;
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
                if (!field703[var18]) {
                    field700[var18] = field702[var17];
                    field703[var18] = true;
                    method278(var18, field706[field702[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field703[var19]) {
                field700[var19] = -1;
                method275(var19);
            }
        }
        field698 = arg3;
        field711 = arg4;
        field709 = arg5;
        field697 = arg6;
        field710 = arg7;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()V", line = 408)
    public static void method281() {
        field706 = null;
        field699 = (int[][][]) null;
        field700 = null;
        field701 = null;
        field707 = null;
        field702 = null;
        field703 = null;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()V", line = 420)
    public static final void method282() {
        for (int var0 = 0; var0 < field712; var0++) {
            class37 var1 = field706[var0];
            int var2 = var1.field817;
            if (var1.field810) {
                var2 = 0;
            }
            int var3 = var1.field817;
            if (var1.field819) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field814 >> 7) - var1.field836;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field814 >> 7) + var1.field836;
                if (var7 > field704 - 1) {
                    var7 = field704 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field829[var5++];
                    int var10 = (var9 >> 8) + ((var1.field843 >> 7) - var1.field836);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field705 - 1) {
                        var11 = field705 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field699[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field699[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field699[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field699[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field699[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[[[Lpl;)V", line = 508)
    public static final void method283(int arg0, int arg1, class191[][][] arg2) {
        if (!class126.field2340) {
            return;
        }
        GL var3 = class97.field1801;
        class162.method1279(0, 0, 0);
        class97.method835(0);
        class97.method829();
        class97.method803(class97.field1812);
        var3.glDepthMask(false);
        class97.method818(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field712; var4++) {
            class37 var5 = field706[var4];
            int var6 = var5.field817;
            if (var5.field813) {
                var6--;
            }
            if (var5.field824 != null) {
                int var7 = 0;
                int var8 = (var5.field814 >> 7) - var5.field836;
                int var9 = (var5.field814 >> 7) + var5.field836;
                if (var9 >= class302.field5369) {
                    var9 = class302.field5369 - 1;
                }
                if (var8 < class272.field4848) {
                    var7 += class272.field4848 - var8;
                    var8 = class272.field4848;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field829[var7++];
                    int var12 = (var11 >> 8) + ((var5.field843 >> 7) - var5.field836);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class195.field3529) {
                        var12 = class195.field3529;
                    }
                    if (var13 >= class183.field3363) {
                        var13 = class183.field3363 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class191 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field3461) {
                            class97.method838(201.5F - (float) var5.field817 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field830 }, 0);
                            var5.field824.method65();
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
        var3.glFogfv(2918, class219.field3868, 0);
        var3.glEnableClientState(32888);
        class97.method808();
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "()V", line = 612)
    public static final void method284() {
        field706 = null;
        field700 = null;
        field701 = null;
        field702 = null;
        field703 = null;
        field699 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIII)V", line = 625)
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class126.field2340) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method271(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field705 - 1) {
            method271(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method271(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field704 - 1) {
            method271(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field704 - 1) {
            method271(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field705 - 1 && arg6 < field704 - 1) {
            method271(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method271(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field705 - 1 && arg6 > 0) {
            method271(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "()V", line = 680)
    public static final void method286() {
        for (int var0 = 0; var0 < 4; var0++) {
            field700[var0] = -1;
            method275(var0);
        }
    }
}
