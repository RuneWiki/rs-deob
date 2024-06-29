import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class221 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[F")
    private static float[] field3693 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private static int field3684;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private static int field3688;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private static int field3689;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private static int field3691;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    private static int field3696;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    private static int field3697;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    private static int field3698;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    private static int field3699;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[I")
    private static int[] field3685;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    private static int[] field3687;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[Laa;")
    public static class196[] field3695;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[Z")
    private static boolean[] field3692;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "[Z")
    private static boolean[] field3694;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[[[I")
    private static int[][][] field3686;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class92.field1634) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3685[var5] != -1) {
                int var6 = field3686[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3685[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3686[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3685[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3685[var5] = -1;
            method1603(var5);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILaa;III)V", line = 50)
    private static final void method1593(int arg0, class196 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class117.field2143;
        if (!field3692[arg0]) {
            var6.glEnable(var5);
            field3692[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3347);
        var6.glLightfv(var5, 4609, arg1.field3346, 0);
        field3693[0] = (float) (arg1.field3334 - arg2);
        field3693[1] = (float) (arg1.field3352 - arg3);
        field3693[2] = (float) (arg1.field3335 - arg4);
        var6.glLightfv(var5, 4611, field3693, 0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 69)
    public static final void method1594() {
        field3690 = 0;
        for (int var0 = 0; var0 < field3699; var0++) {
            for (int var1 = 0; var1 < field3689; var1++) {
                for (int var2 = 0; var2 < field3688; var2++) {
                    field3686[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)V", line = 102)
    public static final void method1595(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3690; var2++) {
            field3695[var2].method1471(arg1, arg0, (byte) 126);
        }
        field3691 = -1;
        field3697 = -1;
        field3684 = -1;
        field3698 = -1;
        field3696 = -1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V", line = 116)
    public static final void method1596() {
        field3695 = null;
        field3685 = null;
        field3692 = null;
        field3687 = null;
        field3694 = null;
        field3686 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II[[[Lnm;)V", line = 131)
    public static final void method1597(int arg0, int arg1, class225[][][] arg2) {
        if (!class92.field1634) {
            return;
        }
        GL var3 = class117.field2143;
        class116.method913(true, 0, 0);
        class117.method961(0);
        class117.method959();
        class117.method939(class117.field2155);
        var3.glDepthMask(false);
        class117.method962(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field3690; var4++) {
            class196 var5 = field3695[var4];
            if (var5.field3350 != null) {
                int var6 = 0;
                int var7 = (var5.field3335 >> 7) - var5.field3349;
                int var8 = (var5.field3335 >> 7) + var5.field3349;
                if (var8 >= class135.field2405) {
                    var8 = class135.field2405 - 1;
                }
                if (var7 < class196.field3348) {
                    var6 += class196.field3348 - var7;
                    var7 = class196.field3348;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3345[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3334 >> 7) - var5.field3349);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class177.field3037) {
                        var11 = class177.field3037;
                    }
                    if (var12 >= class157.field2770) {
                        var12 = class157.field2770 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class225 var14 = arg2[var5.field3337][var13][var9];
                        if (var14 != null && var14.field3760) {
                            class117.method969(201.5F - (float) var5.field3337 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3343 }, 0);
                            var5.field3350.method1041();
                            continue label58;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class108.field1952, 0);
        var3.glEnableClientState(32888);
        class117.method966();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Laa;)V", line = 224)
    public static final void method1598(class196 arg0) {
        if (field3690 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3695[field3690++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()V", line = 241)
    public static final void method1599() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3685[var0] = -1;
            method1603(var0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V", line = 252)
    public static void method1600() {
        field3695 = null;
        field3686 = (int[][][]) null;
        field3685 = null;
        field3692 = null;
        field3693 = null;
        field3687 = null;
        field3694 = null;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "()V", line = 264)
    public static final void method1601() {
        for (int var0 = 0; var0 < field3690; var0++) {
            class196 var1 = field3695[var0];
            int var2 = var1.field3337;
            if (var1.field3340) {
                var2 = 0;
            }
            int var3 = var1.field3337;
            if (var1.field3332) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3335 >> 7) - var1.field3349;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3335 >> 7) + var1.field3349;
                if (var7 > field3688 - 1) {
                    var7 = field3688 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3345[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3334 >> 7) - var1.field3349);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3689 - 1) {
                        var11 = field3689 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3686[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3686[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3686[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3686[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3686[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "()V", line = 355)
    public static final void method1602() {
        GL var0 = class117.field2143;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field3695 = new class196[255];
        field3685 = new int[4];
        field3692 = new boolean[4];
        field3687 = new int[4];
        field3694 = new boolean[4];
        field3686 = new int[field3699][field3689][field3688];
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 382)
    private static final void method1603(int arg0) {
        if (field3692[arg0]) {
            field3692[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class117.field2143;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V", line = 393)
    public static final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class92.field1634 || field3691 == arg3 && field3697 == arg4 && field3684 == arg5 && field3698 == arg4 && field3696 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3694[var6] = false;
        }
        int var7 = 0;
        int var8 = field3686[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3685[var10] == var9) {
                        field3694[var10] = true;
                        continue label72;
                    }
                }
                field3687[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3694[var12]) {
                        field3685[var12] = field3687[var11];
                        field3694[var12] = true;
                        method1593(var12, field3695[field3687[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3694[var13]) {
                    field3685[var13] = -1;
                    method1603(var13);
                }
            }
            field3691 = arg3;
            field3697 = arg4;
            field3684 = arg5;
            field3698 = arg4;
            field3696 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V", line = 481)
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class92.field1634) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1604(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3689 - 1) {
            method1604(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1604(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3688 - 1) {
            method1604(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3688 - 1) {
            method1604(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3689 - 1 && arg6 < field3688 - 1) {
            method1604(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1604(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3689 - 1 && arg6 > 0) {
            method1604(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 534)
    public static final void method1606(int arg0, int arg1, int arg2) {
        field3699 = arg0;
        field3689 = arg1;
        field3688 = arg2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V", line = 540)
    public static final void method1607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class92.field1634 || field3691 == arg3 && field3697 == arg4 && field3684 == arg5 && field3698 == arg6 && field3696 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3694[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3686[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3687[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3685[var16] == var14) {
                                    if (!field3694[var16]) {
                                        field3694[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3687[var10++] = var14;
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
                if (!field3694[var18]) {
                    field3685[var18] = field3687[var17];
                    field3694[var18] = true;
                    method1593(var18, field3695[field3687[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3694[var19]) {
                field3685[var19] = -1;
                method1603(var19);
            }
        }
        field3691 = arg3;
        field3697 = arg4;
        field3684 = arg5;
        field3698 = arg6;
        field3696 = arg7;
    }
}
