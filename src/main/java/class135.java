import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class135 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[F")
    private static float[] field2240 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    private static int field2228;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    private static int field2231;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private static int field2232;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private static int field2233;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private static int field2234;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    private static int field2235;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private static int field2236;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    private static int field2238;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    private static int[] field2226;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[I")
    private static int[] field2239;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[Luf;")
    public static class211[] field2230;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[Z")
    private static boolean[] field2225;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[Z")
    private static boolean[] field2237;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[[[I")
    private static int[][][] field2227;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class308.field5243) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method977(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field2228 - 1) {
            method977(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method977(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field2238 - 1) {
            method977(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field2238 - 1) {
            method977(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field2228 - 1 && arg6 < field2238 - 1) {
            method977(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method977(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field2228 - 1 && arg6 > 0) {
            method977(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 61)
    private static final void method976(int arg0) {
        if (field2225[arg0]) {
            field2225[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class55.field812;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 74)
    public static final void method977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class308.field5243 || field2236 == arg3 && field2234 == arg4 && field2231 == arg5 && field2235 == arg4 && field2233 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field2237[var6] = false;
        }
        int var7 = 0;
        int var8 = field2227[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field2226[var10] == var9) {
                        field2237[var10] = true;
                        continue label72;
                    }
                }
                field2239[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field2237[var12]) {
                        field2226[var12] = field2239[var11];
                        field2237[var12] = true;
                        method980(var12, field2230[field2239[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field2237[var13]) {
                    field2226[var13] = -1;
                    method976(var13);
                }
            }
            field2236 = arg3;
            field2234 = arg4;
            field2231 = arg5;
            field2235 = arg4;
            field2233 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V", line = 165)
    public static final void method978(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field2229; var2++) {
            field2230[var2].method1477(arg1, arg0, false);
        }
        field2236 = -1;
        field2234 = -1;
        field2231 = -1;
        field2235 = -1;
        field2233 = -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 180)
    public static final void method979() {
        GL var0 = class55.field812;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field2230 = new class211[255];
        field2226 = new int[4];
        field2225 = new boolean[4];
        field2239 = new int[4];
        field2237 = new boolean[4];
        field2227 = new int[field2232][field2228][field2238];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILuf;III)V", line = 203)
    private static final void method980(int arg0, class211 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class55.field812;
        if (!field2225[arg0]) {
            var6.glEnable(var5);
            field2225[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3452);
        var6.glLightfv(var5, 4609, arg1.field3445, 0);
        field2240[0] = (float) (arg1.field3443 - arg2);
        field2240[1] = (float) (arg1.field3461 - arg3);
        field2240[2] = (float) (arg1.field3441 - arg4);
        var6.glLightfv(var5, 4611, field2240, 0);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 222)
    public static final void method981() {
        for (int var0 = 0; var0 < field2229; var0++) {
            class211 var1 = field2230[var0];
            int var2 = var1.field3447;
            if (var1.field3460) {
                var2 = 0;
            }
            int var3 = var1.field3447;
            if (var1.field3432) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3441 >> 7) - var1.field3433;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3441 >> 7) + var1.field3433;
                if (var7 > field2238 - 1) {
                    var7 = field2238 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3459[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3443 >> 7) - var1.field3433);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field2228 - 1) {
                        var11 = field2228 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field2227[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field2227[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field2227[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field2227[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field2227[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 310)
    public static final void method982(int arg0, int arg1, int arg2) {
        field2232 = arg0;
        field2228 = arg1;
        field2238 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 320)
    public static final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class308.field5243 || field2236 == arg3 && field2234 == arg4 && field2231 == arg5 && field2235 == arg6 && field2233 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field2237[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field2227[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field2239[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field2226[var16] == var14) {
                                    if (!field2237[var16]) {
                                        field2237[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field2239[var10++] = var14;
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
                if (!field2237[var18]) {
                    field2226[var18] = field2239[var17];
                    field2237[var18] = true;
                    method980(var18, field2230[field2239[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field2237[var19]) {
                field2226[var19] = -1;
                method976(var19);
            }
        }
        field2236 = arg3;
        field2234 = arg4;
        field2231 = arg5;
        field2235 = arg6;
        field2233 = arg7;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V", line = 454)
    public static final void method984() {
        field2230 = null;
        field2226 = null;
        field2225 = null;
        field2239 = null;
        field2237 = null;
        field2227 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "()V", line = 464)
    public static final void method985() {
        for (int var0 = 0; var0 < 4; var0++) {
            field2226[var0] = -1;
            method976(var0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Luf;)V", line = 475)
    public static final void method986(class211 arg0) {
        if (field2229 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field2230[field2229++] = arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "()V", line = 488)
    public static final void method987() {
        field2229 = 0;
        for (int var0 = 0; var0 < field2232; var0++) {
            for (int var1 = 0; var1 < field2228; var1++) {
                for (int var2 = 0; var2 < field2238; var2++) {
                    field2227[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V", line = 518)
    public static final void method988(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class308.field5243) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field2226[var5] != -1) {
                int var6 = field2227[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field2226[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field2227[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field2226[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field2226[var5] = -1;
            method976(var5);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[[[Lcd;)V", line = 562)
    public static final void method989(int arg0, int arg1, class245[][][] arg2) {
        if (!class308.field5243) {
            return;
        }
        GL var3 = class55.field812;
        class131.method963(-12390, 0, 0);
        class55.method386(0);
        class55.method414();
        class55.method407(class55.field828);
        var3.glDepthMask(false);
        class55.method399(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field2229; var4++) {
            class211 var5 = field2230[var4];
            if (var5.field3457 != null) {
                int var6 = 0;
                int var7 = (var5.field3441 >> 7) - var5.field3433;
                int var8 = (var5.field3441 >> 7) + var5.field3433;
                if (var8 >= class309.field5248) {
                    var8 = class309.field5248 - 1;
                }
                if (var7 < class259.field4332) {
                    var6 += class259.field4332 - var7;
                    var7 = class259.field4332;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field3459[var6++];
                    int var11 = (var10 >> 8) + ((var5.field3443 >> 7) - var5.field3433);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class224.field3631) {
                        var11 = class224.field3631;
                    }
                    if (var12 >= class245.field4096) {
                        var12 = class245.field4096 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class245 var14 = arg2[var5.field3447][var13][var9];
                        if (var14 != null && var14.field4095) {
                            class55.method391(201.5F - (float) var5.field3447 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field3440 }, 0);
                            var5.field3457.method991();
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
        var3.glFogfv(2918, class141.field2350, 0);
        var3.glEnableClientState(32888);
        class55.method418();
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "()V", line = 657)
    public static void method990() {
        field2230 = null;
        field2227 = (int[][][]) null;
        field2226 = null;
        field2225 = null;
        field2240 = null;
        field2239 = null;
        field2237 = null;
    }
}
