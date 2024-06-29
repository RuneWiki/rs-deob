import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class268 {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4082 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[F")
    private static float[] field4087 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    private static int field4080;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    private static int field4084;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    private static int field4086;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    private static int field4088;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    private static int field4089;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    private static int field4090;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    private static int field4091;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    private static int field4093;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    private static int[] field4079;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[I")
    private static int[] field4094;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[Ltm;")
    public static class277[] field4081;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[Z")
    private static boolean[] field4083;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "[Z")
    private static boolean[] field4092;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[[[I")
    private static int[][][] field4085;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class98.field1379) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1987(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4084 - 1) {
            method1987(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1987(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4089 - 1) {
            method1987(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4089 - 1) {
            method1987(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4084 - 1 && arg6 < field4089 - 1) {
            method1987(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1987(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4084 - 1 && arg6 > 0) {
            method1987(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 61)
    public static final void method1975() {
        field4081 = new class277[255];
        field4094 = new int[4];
        field4083 = new boolean[4];
        field4079 = new int[4];
        field4092 = new boolean[4];
        field4085 = new int[field4090][field4084][field4089];
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ltm;)V", line = 69)
    public static final void method1976(class277 arg0) {
        if (field4082 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4081[field4082++] = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 80)
    public static final void method1977(int arg0, int arg1, int arg2) {
        field4090 = arg0;
        field4084 = arg1;
        field4089 = arg2;
        field4085 = new int[field4090][field4084][field4089];
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILtm;III)V", line = 87)
    private static final void method1978(int arg0, class277 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class141.field2025;
        if (!field4083[arg0]) {
            var6.glEnable(var5);
            field4083[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4223);
        var6.glLightfv(var5, 4609, arg1.field4202, 0);
        field4087[0] = (float) (arg1.field4222 - arg2);
        field4087[1] = (float) (arg1.field4224 - arg3);
        field4087[2] = (float) (arg1.field4208 - arg4);
        var6.glLightfv(var5, 4611, field4087, 0);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 106)
    public static final void method1979() {
        field4081 = null;
        field4094 = null;
        field4083 = null;
        field4079 = null;
        field4092 = null;
        field4085 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V", line = 114)
    public static final void method1980() {
        field4082 = 0;
        for (int var0 = 0; var0 < field4090; var0++) {
            for (int var1 = 0; var1 < field4084; var1++) {
                for (int var2 = 0; var2 < field4089; var2++) {
                    field4085[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[[[Lmc;)V", line = 143)
    public static final void method1981(int arg0, int arg1, class167[][][] arg2) {
        if (!class98.field1379) {
            return;
        }
        GL var3 = class141.field2025;
        class2.method9(0, 10691, 0);
        class141.method986(0);
        class141.method987();
        class141.method1000(class141.field2030);
        var3.glDepthMask(false);
        class141.method1021(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4082; var4++) {
            class277 var5 = field4081[var4];
            int var6 = var5.field4214;
            if (var5.field4218) {
                var6--;
            }
            if (var5.field4205 != null) {
                int var7 = 0;
                int var8 = (var5.field4208 >> 7) - var5.field4225;
                int var9 = (var5.field4208 >> 7) + var5.field4225;
                if (var9 >= class207.field3032) {
                    var9 = class207.field3032 - 1;
                }
                if (var8 < class107.field1542) {
                    var7 += class107.field1542 - var8;
                    var8 = class107.field1542;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4204[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4222 >> 7) - var5.field4225);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class99.field1401) {
                        var12 = class99.field1401;
                    }
                    if (var13 >= class88.field1241) {
                        var13 = class88.field1241 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class167 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field2396) {
                            class141.method989(201.5F - (float) var5.field4214 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4206 }, 0);
                            var5.field4205.method1205();
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
        var3.glFogfv(2918, class222.field3340, 0);
        var3.glEnableClientState(32888);
        class141.method983();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 244)
    private static final void method1982(int arg0) {
        if (field4083[arg0]) {
            field4083[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class141.field2025;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V", line = 258)
    public static final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class98.field1379) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4094[var5] != -1) {
                int var6 = field4085[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4094[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4085[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4094[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4094[var5] = -1;
            method1982(var5);
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 302)
    public static final void method1984() {
        GL var0 = class141.field2025;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4094[var3] = -1;
            method1982(var3);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()V", line = 328)
    public static void method1985() {
        field4081 = null;
        field4085 = (int[][][]) null;
        field4094 = null;
        field4083 = null;
        field4087 = null;
        field4079 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()V", line = 341)
    public static final void method1986() {
        for (int var0 = 0; var0 < field4082; var0++) {
            class277 var1 = field4081[var0];
            int var2 = var1.field4214;
            if (var1.field4219) {
                var2 = 0;
            }
            int var3 = var1.field4214;
            if (var1.field4198) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4208 >> 7) - var1.field4225;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4208 >> 7) + var1.field4225;
                if (var7 > field4089 - 1) {
                    var7 = field4089 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4204[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4222 >> 7) - var1.field4225);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4084 - 1) {
                        var11 = field4084 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4085[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4085[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4085[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4085[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4085[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V", line = 429)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class98.field1379 || field4091 == arg3 && field4093 == arg4 && field4080 == arg5 && field4088 == arg4 && field4086 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4092[var6] = false;
        }
        int var7 = 0;
        int var8 = field4085[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4094[var10] == var9) {
                        field4092[var10] = true;
                        continue label72;
                    }
                }
                field4079[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4092[var12]) {
                        field4094[var12] = field4079[var11];
                        field4092[var12] = true;
                        method1978(var12, field4081[field4079[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4092[var13]) {
                    field4094[var13] = -1;
                    method1982(var13);
                }
            }
            field4091 = arg3;
            field4093 = arg4;
            field4080 = arg5;
            field4088 = arg4;
            field4086 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V", line = 522)
    public static final void method1988(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4082; var2++) {
            field4081[var2].method2020(arg1, arg0, false);
        }
        field4091 = -1;
        field4093 = -1;
        field4080 = -1;
        field4088 = -1;
        field4086 = -1;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()V", line = 541)
    public static final void method1989() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4094[var0] = -1;
            method1982(var0);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V", line = 561)
    public static final void method1990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class98.field1379 || field4091 == arg3 && field4093 == arg4 && field4080 == arg5 && field4088 == arg6 && field4086 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4092[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4085[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4079[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4094[var16] == var14) {
                                    if (!field4092[var16]) {
                                        field4092[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4079[var10++] = var14;
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
                if (!field4092[var18]) {
                    field4094[var18] = field4079[var17];
                    field4092[var18] = true;
                    method1978(var18, field4081[field4079[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4092[var19]) {
                field4094[var19] = -1;
                method1982(var19);
            }
        }
        field4091 = arg3;
        field4093 = arg4;
        field4080 = arg5;
        field4088 = arg6;
        field4086 = arg7;
    }
}
