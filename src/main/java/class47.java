import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class47 {

    @OriginalMember(owner = "client!en", name = "f", descriptor = "[F")
    private static float[] field636 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    private static int field631;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    private static int field634;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    private static int field637;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    private static int field638;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    private static int field639;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    private static int field640;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    private static int field641;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    private static int field645;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[I")
    private static int[] field632;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "[I")
    private static int[] field644;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[Lmm;")
    public static class272[] field633;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[Z")
    private static boolean[] field635;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "[Z")
    private static boolean[] field643;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "[[[I")
    private static int[][][] field642;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILmm;III)V", line = 7)
    private static final void method313(int arg0, class272 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class186.field2990;
        if (!field643[arg0]) {
            var6.glEnable(var5);
            field643[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4328);
        var6.glLightfv(var5, 4609, arg1.field4333, 0);
        field636[0] = (float) (arg1.field4325 - arg2);
        field636[1] = (float) (arg1.field4312 - arg3);
        field636[2] = (float) (arg1.field4317 - arg4);
        var6.glLightfv(var5, 4611, field636, 0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V", line = 24)
    public static final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class269.field4250 || field638 == arg3 && field631 == arg4 && field645 == arg5 && field640 == arg6 && field634 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field635[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field642[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field644[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field632[var16] == var14) {
                                    if (!field635[var16]) {
                                        field635[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field644[var10++] = var14;
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
                if (!field635[var18]) {
                    field632[var18] = field644[var17];
                    field635[var18] = true;
                    method313(var18, field633[field644[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field635[var19]) {
                field632[var19] = -1;
                method323(var19);
            }
        }
        field638 = arg3;
        field631 = arg4;
        field645 = arg5;
        field640 = arg6;
        field634 = arg7;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lmm;)V", line = 155)
    public static final void method315(class272 arg0) {
        if (field646 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field633[field646++] = arg0;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V", line = 167)
    public static final void method316(int arg0, int arg1, int arg2) {
        field639 = arg0;
        field637 = arg1;
        field641 = arg2;
        field642 = new int[field639][field637][field641];
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)V", line = 175)
    public static final void method317(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field646; var2++) {
            field633[var2].method1941(arg0, arg1, -20145);
        }
        field638 = -1;
        field631 = -1;
        field645 = -1;
        field640 = -1;
        field634 = -1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 189)
    public static final void method318() {
        field633 = new class272[255];
        field632 = new int[4];
        field643 = new boolean[4];
        field644 = new int[4];
        field635 = new boolean[4];
        field642 = new int[field639][field637][field641];
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()V", line = 197)
    public static final void method319() {
        field633 = null;
        field632 = null;
        field643 = null;
        field644 = null;
        field635 = null;
        field642 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()V", line = 207)
    public static final void method320() {
        for (int var0 = 0; var0 < 4; var0++) {
            field632[var0] = -1;
            method323(var0);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V", line = 217)
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class269.field4250 || field638 == arg3 && field631 == arg4 && field645 == arg5 && field640 == arg4 && field634 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field635[var6] = false;
        }
        int var7 = 0;
        int var8 = field642[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field632[var10] == var9) {
                        field635[var10] = true;
                        continue label72;
                    }
                }
                field644[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field635[var12]) {
                        field632[var12] = field644[var11];
                        field635[var12] = true;
                        method313(var12, field633[field644[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field635[var13]) {
                    field632[var13] = -1;
                    method323(var13);
                }
            }
            field638 = arg3;
            field631 = arg4;
            field645 = arg5;
            field640 = arg4;
            field634 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()V", line = 311)
    public static final void method322() {
        field646 = 0;
        for (int var0 = 0; var0 < field639; var0++) {
            for (int var1 = 0; var1 < field637; var1++) {
                for (int var2 = 0; var2 < field641; var2++) {
                    field642[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 342)
    private static final void method323(int arg0) {
        if (field643[arg0]) {
            field643[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class186.field2990;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()V", line = 358)
    public static final void method324() {
        GL var0 = class186.field2990;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field632[var3] = -1;
            method323(var3);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V", line = 384)
    public static final void method325(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class269.field4250) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field632[var5] != -1) {
                int var6 = field642[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field632[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field642[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field632[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field632[var5] = -1;
            method323(var5);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()V", line = 430)
    public static final void method326() {
        for (int var0 = 0; var0 < field646; var0++) {
            class272 var1 = field633[var0];
            int var2 = var1.field4311;
            if (var1.field4310) {
                var2 = 0;
            }
            int var3 = var1.field4311;
            if (var1.field4330) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4317 >> 7) - var1.field4324;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4317 >> 7) + var1.field4324;
                if (var7 > field641 - 1) {
                    var7 = field641 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4331[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4325 >> 7) - var1.field4324);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field637 - 1) {
                        var11 = field637 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field642[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field642[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field642[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field642[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field642[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 518)
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class269.field4250) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field637 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field641 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field641 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field637 - 1 && arg6 < field641 - 1) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field637 - 1 && arg6 > 0) {
            method321(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[[Li;)V", line = 571)
    public static final void method328(int arg0, int arg1, class230[][][] arg2) {
        if (!class269.field4250) {
            return;
        }
        GL var3 = class186.field2990;
        class188.method1328(0, 0, (byte) 114);
        class186.method1281(0);
        class186.method1287();
        class186.method1288(class186.field2982);
        var3.glDepthMask(false);
        class186.method1316(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field646; var4++) {
            class272 var5 = field633[var4];
            int var6 = var5.field4311;
            if (var5.field4308) {
                var6--;
            }
            if (var5.field4332 != null) {
                int var7 = 0;
                int var8 = (var5.field4317 >> 7) - var5.field4324;
                int var9 = (var5.field4317 >> 7) + var5.field4324;
                if (var9 >= class127.field1901) {
                    var9 = class127.field1901 - 1;
                }
                if (var8 < class239.field3782) {
                    var7 += class239.field3782 - var8;
                    var8 = class239.field3782;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4331[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4325 >> 7) - var5.field4324);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class95.field1461) {
                        var12 = class95.field1461;
                    }
                    if (var13 >= class160.field2486) {
                        var13 = class160.field2486 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class230 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field3679) {
                            class186.method1282(201.5F - (float) var5.field4311 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4322 }, 0);
                            var5.field4332.method63();
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
        var3.glFogfv(2918, class109.field1640, 0);
        var3.glEnableClientState(32888);
        class186.method1298();
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "()V", line = 674)
    public static void method329() {
        field633 = null;
        field642 = (int[][][]) null;
        field632 = null;
        field643 = null;
        field636 = null;
        field644 = null;
        field635 = null;
    }
}
