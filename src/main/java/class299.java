import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class299 {

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[F")
    private static float[] field4638 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private static int field4629;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private static int field4630;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private static int field4631;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private static int field4633;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private static int field4634;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private static int field4637;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    private static int field4642;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private static int field4643;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    private static int[] field4628;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
    private static int[] field4640;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[Ljn;")
    public static class186[] field4636;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[Z")
    private static boolean[] field4632;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Z")
    private static boolean[] field4641;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[[[I")
    private static int[][][] field4635;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjn;III)V", line = 6)
    private static final void method2143(int arg0, class186 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class240.field3771;
        if (!field4632[arg0]) {
            var6.glEnable(var5);
            field4632[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field2923);
        var6.glLightfv(var5, 4609, arg1.field2928, 0);
        field4638[0] = (float) (arg1.field2909 - arg2);
        field4638[1] = (float) (arg1.field2913 - arg3);
        field4638[2] = (float) (arg1.field2924 - arg4);
        var6.glLightfv(var5, 4611, field4638, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 25)
    public static final void method2144() {
        GL var0 = class240.field3771;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field4628[var3] = -1;
            method2156(var3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 51)
    public static final void method2145() {
        field4639 = 0;
        for (int var0 = 0; var0 < field4629; var0++) {
            for (int var1 = 0; var1 < field4637; var1++) {
                for (int var2 = 0; var2 < field4633; var2++) {
                    field4635[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 83)
    public static final void method2146() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4628[var0] = -1;
            method2156(var0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljn;)V", line = 93)
    public static final void method2147(class186 arg0) {
        if (field4639 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4636[field4639++] = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V", line = 107)
    public static final void method2148() {
        for (int var0 = 0; var0 < field4639; var0++) {
            class186 var1 = field4636[var0];
            int var2 = var1.field2922;
            if (var1.field2931) {
                var2 = 0;
            }
            int var3 = var1.field2922;
            if (var1.field2918) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field2924 >> 7) - var1.field2914;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field2924 >> 7) + var1.field2914;
                if (var7 > field4633 - 1) {
                    var7 = field4633 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field2915[var5++];
                    int var10 = (var9 >> 8) + ((var1.field2909 >> 7) - var1.field2914);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4637 - 1) {
                        var11 = field4637 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4635[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4635[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4635[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4635[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4635[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V", line = 195)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class59.field927) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4628[var5] != -1) {
                int var6 = field4635[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4628[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4635[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4628[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4628[var5] = -1;
            method2156(var5);
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V", line = 239)
    public static final void method2150() {
        field4636 = new class186[255];
        field4628 = new int[4];
        field4632 = new boolean[4];
        field4640 = new int[4];
        field4641 = new boolean[4];
        field4635 = new int[field4629][field4637][field4633];
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()V", line = 253)
    public static final void method2151() {
        field4636 = null;
        field4628 = null;
        field4632 = null;
        field4640 = null;
        field4641 = null;
        field4635 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIII)V", line = 261)
    public static final void method2152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class59.field927 || field4634 == arg3 && field4642 == arg4 && field4630 == arg5 && field4631 == arg6 && field4643 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4641[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4635[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4640[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4628[var16] == var14) {
                                    if (!field4641[var16]) {
                                        field4641[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4640[var10++] = var14;
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
                if (!field4641[var18]) {
                    field4628[var18] = field4640[var17];
                    field4641[var18] = true;
                    method2143(var18, field4636[field4640[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4641[var19]) {
                field4628[var19] = -1;
                method2156(var19);
            }
        }
        field4634 = arg3;
        field4642 = arg4;
        field4630 = arg5;
        field4631 = arg6;
        field4643 = arg7;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V", line = 390)
    public static final void method2153(int arg0, int arg1, int arg2) {
        field4629 = arg0;
        field4637 = arg1;
        field4633 = arg2;
        field4635 = new int[field4629][field4637][field4633];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[[[Lqo;)V", line = 397)
    public static final void method2154(int arg0, int arg1, class329[][][] arg2) {
        if (!class59.field927) {
            return;
        }
        GL var3 = class240.field3771;
        class211.method1562(0, 0, -46);
        class240.method1814(0);
        class240.method1805();
        class240.method1786(class240.field3744);
        var3.glDepthMask(false);
        class240.method1801(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field4639; var4++) {
            class186 var5 = field4636[var4];
            int var6 = var5.field2922;
            if (var5.field2911) {
                var6--;
            }
            if (var5.field2925 != null) {
                int var7 = 0;
                int var8 = (var5.field2924 >> 7) - var5.field2914;
                int var9 = (var5.field2924 >> 7) + var5.field2914;
                if (var9 >= class33.field512) {
                    var9 = class33.field512 - 1;
                }
                if (var8 < class185.field2896) {
                    var7 += class185.field2896 - var8;
                    var8 = class185.field2896;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field2915[var7++];
                    int var12 = (var11 >> 8) + ((var5.field2909 >> 7) - var5.field2914);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class79.field1147) {
                        var12 = class79.field1147;
                    }
                    if (var13 >= class120.field1857) {
                        var13 = class120.field1857 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class329 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field5076) {
                            class240.method1784(201.5F - (float) var5.field2922 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field2916 }, 0);
                            var5.field2925.method2361();
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
        var3.glFogfv(2918, class103.field1540, 0);
        var3.glEnableClientState(32888);
        class240.method1812();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V", line = 500)
    public static final void method2155(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4639; var2++) {
            field4636[var2].method1433(-126, arg0, arg1);
        }
        field4634 = -1;
        field4642 = -1;
        field4630 = -1;
        field4631 = -1;
        field4643 = -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 515)
    private static final void method2156(int arg0) {
        if (field4632[arg0]) {
            field4632[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class240.field3771;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V", line = 530)
    public static final void method2157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class59.field927 || field4634 == arg3 && field4642 == arg4 && field4630 == arg5 && field4631 == arg4 && field4643 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4641[var6] = false;
        }
        int var7 = 0;
        int var8 = field4635[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4628[var10] == var9) {
                        field4641[var10] = true;
                        continue label72;
                    }
                }
                field4640[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4641[var12]) {
                        field4628[var12] = field4640[var11];
                        field4641[var12] = true;
                        method2143(var12, field4636[field4640[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4641[var13]) {
                    field4628[var13] = -1;
                    method2156(var13);
                }
            }
            field4634 = arg3;
            field4642 = arg4;
            field4630 = arg5;
            field4631 = arg4;
            field4643 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V", line = 618)
    public static final void method2158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class59.field927) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method2157(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4637 - 1) {
            method2157(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method2157(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4633 - 1) {
            method2157(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4633 - 1) {
            method2157(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4637 - 1 && arg6 < field4633 - 1) {
            method2157(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method2157(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4637 - 1 && arg6 > 0) {
            method2157(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()V", line = 677)
    public static void method2159() {
        field4636 = null;
        field4635 = (int[][][]) null;
        field4628 = null;
        field4632 = null;
        field4638 = null;
        field4640 = null;
        field4641 = null;
    }
}
