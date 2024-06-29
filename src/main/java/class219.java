import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class219 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[F")
    private static float[] field3416 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    private static int field3415;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    private static int field3417;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    private static int field3418;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    private static int field3420;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    private static int field3422;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    private static int field3423;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    private static int field3427;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    private static int field3429;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    private static int[] field3419;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    private static int[] field3424;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[Lck;")
    public static class253[] field3426;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[Z")
    private static boolean[] field3414;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[Z")
    private static boolean[] field3428;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[[[I")
    private static int[][][] field3425;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1582(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3421; var2++) {
            field3426[var2].method1750(194, arg0, arg1);
        }
        field3423 = -1;
        field3429 = -1;
        field3415 = -1;
        field3427 = -1;
        field3417 = -1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILck;III)V", line = 23)
    private static final void method1583(int arg0, class253 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class162.field2654;
        if (!field3428[arg0]) {
            var6.glEnable(var5);
            field3428[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3721);
        var6.glLightfv(var5, 4609, arg1.field3730, 0);
        field3416[0] = (float) (arg1.field3725 - arg2);
        field3416[1] = (float) (arg1.field3723 - arg3);
        field3416[2] = (float) (arg1.field3747 - arg4);
        var6.glLightfv(var5, 4611, field3416, 0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 41)
    public static final void method1584(int arg0, int arg1, int arg2) {
        field3422 = arg0;
        field3420 = arg1;
        field3418 = arg2;
        field3425 = new int[field3422][field3420][field3418];
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 47)
    public static final void method1585() {
        field3421 = 0;
        for (int var0 = 0; var0 < field3422; var0++) {
            for (int var1 = 0; var1 < field3420; var1++) {
                for (int var2 = 0; var2 < field3418; var2++) {
                    field3425[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()V", line = 76)
    public static final void method1586() {
        GL var0 = class162.field2654;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field3424[var3] = -1;
            method1593(var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()V", line = 106)
    public static final void method1587() {
        field3426 = new class253[255];
        field3424 = new int[4];
        field3428 = new boolean[4];
        field3419 = new int[4];
        field3414 = new boolean[4];
        field3425 = new int[field3422][field3420][field3418];
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()V", line = 116)
    public static void method1588() {
        field3426 = null;
        field3425 = (int[][][]) null;
        field3424 = null;
        field3428 = null;
        field3416 = null;
        field3419 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lck;)V", line = 127)
    public static final void method1589(class253 arg0) {
        if (field3421 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3426[field3421++] = arg0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)V", line = 138)
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class229.field3531 || field3423 == arg3 && field3429 == arg4 && field3415 == arg5 && field3427 == arg6 && field3417 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3414[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3425[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3419[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3424[var16] == var14) {
                                    if (!field3414[var16]) {
                                        field3414[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3419[var10++] = var14;
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
                if (!field3414[var18]) {
                    field3424[var18] = field3419[var17];
                    field3414[var18] = true;
                    method1583(var18, field3426[field3419[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3414[var19]) {
                field3424[var19] = -1;
                method1593(var19);
            }
        }
        field3423 = arg3;
        field3429 = arg4;
        field3415 = arg5;
        field3427 = arg6;
        field3417 = arg7;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[[[Lsg;)V", line = 268)
    public static final void method1591(int arg0, int arg1, class42[][][] arg2) {
        if (!class229.field3531) {
            return;
        }
        GL var3 = class162.field2654;
        class102.method830(0, 14804, 0);
        class162.method1206(0);
        class162.method1214();
        class162.method1219(class162.field2658);
        var3.glDepthMask(false);
        class162.method1205(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field3421; var4++) {
            class253 var5 = field3426[var4];
            int var6 = var5.field3736;
            if (var5.field3737) {
                var6--;
            }
            if (var5.field3717 != null) {
                int var7 = 0;
                int var8 = (var5.field3747 >> 7) - var5.field3746;
                int var9 = (var5.field3747 >> 7) + var5.field3746;
                if (var9 >= class6.field130) {
                    var9 = class6.field130 - 1;
                }
                if (var8 < class151.field2492) {
                    var7 += class151.field2492 - var8;
                    var8 = class151.field2492;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3732[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3725 >> 7) - var5.field3746);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class345.field5356) {
                        var12 = class345.field5356;
                    }
                    if (var13 >= class191.field2986) {
                        var13 = class191.field2986 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class42 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field653) {
                            class162.method1190(201.5F - (float) var5.field3736 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3733 }, 0);
                            var5.field3717.method1362();
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
        var3.glFogfv(2918, class261.field3885, 0);
        var3.glEnableClientState(32888);
        class162.method1199();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V", line = 373)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class229.field3531 || field3423 == arg3 && field3429 == arg4 && field3415 == arg5 && field3427 == arg4 && field3417 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3414[var6] = false;
        }
        int var7 = 0;
        int var8 = field3425[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3424[var10] == var9) {
                        field3414[var10] = true;
                        continue label72;
                    }
                }
                field3419[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3414[var12]) {
                        field3424[var12] = field3419[var11];
                        field3414[var12] = true;
                        method1583(var12, field3426[field3419[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3414[var13]) {
                    field3424[var13] = -1;
                    method1593(var13);
                }
            }
            field3423 = arg3;
            field3429 = arg4;
            field3415 = arg5;
            field3427 = arg4;
            field3417 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 460)
    private static final void method1593(int arg0) {
        if (field3428[arg0]) {
            field3428[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class162.field2654;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V", line = 473)
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class229.field3531) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3424[var5] != -1) {
                int var6 = field3425[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3424[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3425[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3424[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3424[var5] = -1;
            method1593(var5);
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "()V", line = 516)
    public static final void method1595() {
        field3426 = null;
        field3424 = null;
        field3428 = null;
        field3419 = null;
        field3414 = null;
        field3425 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "()V", line = 526)
    public static final void method1596() {
        for (int var0 = 0; var0 < field3421; var0++) {
            class253 var1 = field3426[var0];
            int var2 = var1.field3736;
            if (var1.field3724) {
                var2 = 0;
            }
            int var3 = var1.field3736;
            if (var1.field3744) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3747 >> 7) - var1.field3746;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3747 >> 7) + var1.field3746;
                if (var7 > field3418 - 1) {
                    var7 = field3418 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3732[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3725 >> 7) - var1.field3746);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3420 - 1) {
                        var11 = field3420 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3425[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3425[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3425[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3425[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3425[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "()V", line = 619)
    public static final void method1597() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3424[var0] = -1;
            method1593(var0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V", line = 637)
    public static final void method1598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class229.field3531) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1592(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3420 - 1) {
            method1592(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1592(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3418 - 1) {
            method1592(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3418 - 1) {
            method1592(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3420 - 1 && arg6 < field3418 - 1) {
            method1592(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1592(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3420 - 1 && arg6 > 0) {
            method1592(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }
}
