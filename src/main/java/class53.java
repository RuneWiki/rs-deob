import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[F")
    private static float[] field954 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    private static int field955;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    private static int field958;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    private static int field959;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    private static int field960;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    private static int field961;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    private static int field965;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    private static int field966;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    private static int field969;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[I")
    private static int[] field962;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[I")
    private static int[] field964;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[Ls;")
    public static class266[] field956;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[Z")
    private static boolean[] field957;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[Z")
    private static boolean[] field963;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[[[I")
    private static int[][][] field967;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 8)
    public static final void method427(int arg0, int arg1, int arg2) {
        field960 = arg0;
        field958 = arg1;
        field959 = arg2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 14)
    public static final void method428() {
        field956 = null;
        field962 = null;
        field963 = null;
        field964 = null;
        field957 = null;
        field967 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V", line = 26)
    public static final void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class102.field1641 || field965 == arg3 && field966 == arg4 && field961 == arg5 && field955 == arg6 && field969 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field957[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field967[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field964[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field962[var16] == var14) {
                                    if (!field957[var16]) {
                                        field957[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field964[var10++] = var14;
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
                if (!field957[var18]) {
                    field962[var18] = field964[var17];
                    field957[var18] = true;
                    method430(var18, field956[field964[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field957[var19]) {
                field962[var19] = -1;
                method442(var19);
            }
        }
        field965 = arg3;
        field966 = arg4;
        field961 = arg5;
        field955 = arg6;
        field969 = arg7;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILs;III)V", line = 156)
    private static final void method430(int arg0, class266 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class271.field4641;
        if (!field963[arg0]) {
            var6.glEnable(var5);
            field963[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4564);
        var6.glLightfv(var5, 4609, arg1.field4566, 0);
        field954[0] = (float) (arg1.field4583 - arg2);
        field954[1] = (float) (arg1.field4589 - arg3);
        field954[2] = (float) (arg1.field4578 - arg4);
        var6.glLightfv(var5, 4611, field954, 0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[[[Lse;)V", line = 175)
    public static final void method431(int arg0, int arg1, class11[][][] arg2) {
        if (!class102.field1641) {
            return;
        }
        GL var3 = class271.field4641;
        class140.method1033(0, 0, -5);
        class271.method1974(0);
        class271.method1953();
        class271.method1978(class271.field4644);
        var3.glDepthMask(false);
        class271.method1989(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field968; var4++) {
            class266 var5 = field956[var4];
            int var6 = var5.field4568;
            if (var5.field4594) {
                var6--;
            }
            if (var5.field4570 != null) {
                int var7 = 0;
                int var8 = (var5.field4578 >> 7) - var5.field4565;
                int var9 = (var5.field4578 >> 7) + var5.field4565;
                if (var9 >= class36.field664) {
                    var9 = class36.field664 - 1;
                }
                if (var8 < class189.field3129) {
                    var7 += class189.field3129 - var8;
                    var8 = class189.field3129;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field4571[var7++];
                    int var12 = (var11 >> 8) + ((var5.field4583 >> 7) - var5.field4565);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class218.field3611) {
                        var12 = class218.field3611;
                    }
                    if (var13 >= class43.field740) {
                        var13 = class43.field740 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class11 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field207) {
                            class271.method1979(201.5F - (float) var5.field4568 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4596 }, 0);
                            var5.field4570.method469();
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
        var3.glFogfv(2918, class231.field3864, 0);
        var3.glEnableClientState(32888);
        class271.method1981();
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 277)
    public static void method432() {
        field956 = null;
        field967 = (int[][][]) null;
        field962 = null;
        field963 = null;
        field954 = null;
        field964 = null;
        field957 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V", line = 289)
    public static final void method433(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field968; var2++) {
            field956[var2].method1934(arg1, 96, arg0);
        }
        field965 = -1;
        field966 = -1;
        field961 = -1;
        field955 = -1;
        field969 = -1;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V", line = 310)
    public static final void method434() {
        GL var0 = class271.field4641;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field956 = new class266[255];
        field962 = new int[4];
        field963 = new boolean[4];
        field964 = new int[4];
        field957 = new boolean[4];
        field967 = new int[field960][field958][field959];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V", line = 333)
    public static final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class102.field1641) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method438(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field958 - 1) {
            method438(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method438(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field959 - 1) {
            method438(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field959 - 1) {
            method438(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field958 - 1 && arg6 < field959 - 1) {
            method438(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method438(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field958 - 1 && arg6 > 0) {
            method438(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V", line = 387)
    public static final void method436() {
        field968 = 0;
        for (int var0 = 0; var0 < field960; var0++) {
            for (int var1 = 0; var1 < field958; var1++) {
                for (int var2 = 0; var2 < field959; var2++) {
                    field967[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()V", line = 418)
    public static final void method437() {
        for (int var0 = 0; var0 < field968; var0++) {
            class266 var1 = field956[var0];
            int var2 = var1.field4568;
            if (var1.field4595) {
                var2 = 0;
            }
            int var3 = var1.field4568;
            if (var1.field4591) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4578 >> 7) - var1.field4565;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4578 >> 7) + var1.field4565;
                if (var7 > field959 - 1) {
                    var7 = field959 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4571[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4583 >> 7) - var1.field4565);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field958 - 1) {
                        var11 = field958 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field967[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field967[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field967[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field967[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field967[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)V", line = 506)
    public static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class102.field1641 || field965 == arg3 && field966 == arg4 && field961 == arg5 && field955 == arg4 && field969 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field957[var6] = false;
        }
        int var7 = 0;
        int var8 = field967[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field962[var10] == var9) {
                        field957[var10] = true;
                        continue label72;
                    }
                }
                field964[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field957[var12]) {
                        field962[var12] = field964[var11];
                        field957[var12] = true;
                        method430(var12, field956[field964[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field957[var13]) {
                    field962[var13] = -1;
                    method442(var13);
                }
            }
            field965 = arg3;
            field966 = arg4;
            field961 = arg5;
            field955 = arg4;
            field969 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "()V", line = 595)
    public static final void method439() {
        for (int var0 = 0; var0 < 4; var0++) {
            field962[var0] = -1;
            method442(var0);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ls;)V", line = 607)
    public static final void method440(class266 arg0) {
        if (field968 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field956[field968++] = arg0;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 618)
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class102.field1641) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field962[var5] != -1) {
                int var6 = field967[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field962[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field967[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field962[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field962[var5] = -1;
            method442(var5);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 665)
    private static final void method442(int arg0) {
        if (field963[arg0]) {
            field963[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class271.field4641;
            var2.glDisable(var1);
        }
    }
}
