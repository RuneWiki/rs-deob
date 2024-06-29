import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class256 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[F")
    private static float[] field4304 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    private static int field4300;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private static int field4302;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    private static int field4303;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    private static int field4306;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    private static int field4307;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    private static int field4309;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    private static int field4311;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private static int field4313;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
    private static int[] field4308;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[I")
    private static int[] field4314;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[Lod;")
    public static class209[] field4312;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Z")
    private static boolean[] field4299;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[Z")
    private static boolean[] field4305;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[[[I")
    private static int[][][] field4310;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V", line = 7)
    public static final void method1726() {
        field4312 = null;
        field4314 = null;
        field4305 = null;
        field4308 = null;
        field4299 = null;
        field4310 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V", line = 16)
    public static final void method1727(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class249.field4166) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4314[var5] != -1) {
                int var6 = field4310[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4314[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4310[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4314[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4314[var5] = -1;
            method1737(var5);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIII)V", line = 59)
    public static final void method1728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class249.field4166) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1732(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4313 - 1) {
            method1732(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1732(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4303 - 1) {
            method1732(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4303 - 1) {
            method1732(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4313 - 1 && arg6 < field4303 - 1) {
            method1732(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1732(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4313 - 1 && arg6 > 0) {
            method1732(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()V", line = 117)
    public static final void method1729() {
        for (int var0 = 0; var0 < field4301; var0++) {
            class209 var1 = field4312[var0];
            int var2 = var1.field3590;
            if (var1.field3588) {
                var2 = 0;
            }
            int var3 = var1.field3590;
            if (var1.field3563) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3570 >> 7) - var1.field3587;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3570 >> 7) + var1.field3587;
                if (var7 > field4303 - 1) {
                    var7 = field4303 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3580[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3577 >> 7) - var1.field3587);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4313 - 1) {
                        var11 = field4313 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4310[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4310[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4310[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4310[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4310[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILod;III)V", line = 206)
    private static final void method1730(int arg0, class209 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class56.field848;
        if (!field4305[arg0]) {
            var6.glEnable(var5);
            field4305[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3579);
        var6.glLightfv(var5, 4609, arg1.field3581, 0);
        field4304[0] = (float) (arg1.field3577 - arg2);
        field4304[1] = (float) (arg1.field3567 - arg3);
        field4304[2] = (float) (arg1.field3570 - arg4);
        var6.glLightfv(var5, 4611, field4304, 0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V", line = 227)
    public static final void method1731() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4314[var0] = -1;
            method1737(var0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V", line = 238)
    public static final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class249.field4166 || field4306 == arg3 && field4307 == arg4 && field4302 == arg5 && field4309 == arg4 && field4300 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4299[var6] = false;
        }
        int var7 = 0;
        int var8 = field4310[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4314[var10] == var9) {
                        field4299[var10] = true;
                        continue label72;
                    }
                }
                field4308[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4299[var12]) {
                        field4314[var12] = field4308[var11];
                        field4299[var12] = true;
                        method1730(var12, field4312[field4308[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4299[var13]) {
                    field4314[var13] = -1;
                    method1737(var13);
                }
            }
            field4306 = arg3;
            field4307 = arg4;
            field4302 = arg5;
            field4309 = arg4;
            field4300 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V", line = 327)
    public static final void method1733(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4301; var2++) {
            field4312[var2].method1458(arg0, arg1, 76);
        }
        field4306 = -1;
        field4307 = -1;
        field4302 = -1;
        field4309 = -1;
        field4300 = -1;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()V", line = 343)
    public static final void method1734() {
        field4301 = 0;
        for (int var0 = 0; var0 < field4311; var0++) {
            for (int var1 = 0; var1 < field4313; var1++) {
                for (int var2 = 0; var2 < field4303; var2++) {
                    field4310[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()V", line = 372)
    public static final void method1735() {
        GL var0 = class56.field848;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field4312 = new class209[255];
        field4314 = new int[4];
        field4305 = new boolean[4];
        field4308 = new int[4];
        field4299 = new boolean[4];
        field4310 = new int[field4311][field4313][field4303];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[[[Lma;)V", line = 405)
    public static final void method1736(int arg0, int arg1, class5[][][] arg2) {
        if (!class249.field4166) {
            return;
        }
        GL var3 = class56.field848;
        class51.method325(0, 0, 26604);
        class56.method381(0);
        class56.method382();
        class56.method354(class56.field854);
        var3.glDepthMask(false);
        class56.method384(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4301; var4++) {
            class209 var5 = field4312[var4];
            int var6 = var5.field3590;
            if (var5.field3565) {
                var6--;
            }
            if (var5.field3593 != null) {
                int var7 = 0;
                int var8 = (var5.field3570 >> 7) - var5.field3587;
                int var9 = (var5.field3570 >> 7) + var5.field3587;
                if (var9 >= class112.field1846) {
                    var9 = class112.field1846 - 1;
                }
                if (var8 < class270.field4558) {
                    var7 += class270.field4558 - var8;
                    var8 = class270.field4558;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field3580[var7++];
                    int var12 = (var11 >> 8) + ((var5.field3577 >> 7) - var5.field3587);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class300.field4970) {
                        var12 = class300.field4970;
                    }
                    if (var13 >= class130.field2226) {
                        var13 = class130.field2226 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class5 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field39) {
                            class56.method355(201.5F - (float) var5.field3590 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3573 }, 0);
                            var5.field3593.method1586();
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
        var3.glFogfv(2918, class235.field3960, 0);
        var3.glEnableClientState(32888);
        class56.method368();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 506)
    private static final void method1737(int arg0) {
        if (field4305[arg0]) {
            field4305[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class56.field848;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()V", line = 519)
    public static void method1738() {
        field4312 = null;
        field4310 = (int[][][]) null;
        field4314 = null;
        field4305 = null;
        field4304 = null;
        field4308 = null;
        field4299 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 528)
    public static final void method1739(int arg0, int arg1, int arg2) {
        field4311 = arg0;
        field4313 = arg1;
        field4303 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lod;)V", line = 533)
    public static final void method1740(class209 arg0) {
        if (field4301 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4312[field4301++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIII)V", line = 548)
    public static final void method1741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class249.field4166 || field4306 == arg3 && field4307 == arg4 && field4302 == arg5 && field4309 == arg6 && field4300 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4299[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4310[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4308[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4314[var16] == var14) {
                                    if (!field4299[var16]) {
                                        field4299[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4308[var10++] = var14;
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
                if (!field4299[var18]) {
                    field4314[var18] = field4308[var17];
                    field4299[var18] = true;
                    method1730(var18, field4312[field4308[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4299[var19]) {
                field4314[var19] = -1;
                method1737(var19);
            }
        }
        field4306 = arg3;
        field4307 = arg4;
        field4302 = arg5;
        field4309 = arg6;
        field4300 = arg7;
    }
}
