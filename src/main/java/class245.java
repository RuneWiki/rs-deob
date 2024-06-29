import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class245 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[F")
    private static float[] field3972 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    private static int field3969;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private static int field3970;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private static int field3971;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    private static int field3973;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private static int field3978;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    private static int field3980;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private static int field3981;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private static int field3983;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    private static int[] field3974;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    private static int[] field3982;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[Lqb;")
    public static class114[] field3979;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[Z")
    private static boolean[] field3976;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[Z")
    private static boolean[] field3977;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[[[I")
    private static int[][][] field3968;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method1706(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3975; var2++) {
            field3979[var2].method971(-1, arg0, arg1);
        }
        field3971 = -1;
        field3973 = -1;
        field3981 = -1;
        field3978 = -1;
        field3980 = -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 22)
    public static final void method1707() {
        field3975 = 0;
        for (int var0 = 0; var0 < field3970; var0++) {
            for (int var1 = 0; var1 < field3969; var1++) {
                for (int var2 = 0; var2 < field3983; var2++) {
                    field3968[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILqb;III)V", line = 54)
    private static final void method1708(int arg0, class114 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class43.field651;
        if (!field3977[arg0]) {
            var6.glEnable(var5);
            field3977[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1908);
        var6.glLightfv(var5, 4609, arg1.field1899, 0);
        field3972[0] = (float) (arg1.field1906 - arg2);
        field3972[1] = (float) (arg1.field1922 - arg3);
        field3972[2] = (float) (arg1.field1920 - arg4);
        var6.glLightfv(var5, 4611, field3972, 0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V", line = 74)
    public static final void method1709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class64.field1001) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1721(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3969 - 1) {
            method1721(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1721(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3983 - 1) {
            method1721(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3983 - 1) {
            method1721(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3969 - 1 && arg6 < field3983 - 1) {
            method1721(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1721(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3969 - 1 && arg6 > 0) {
            method1721(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 127)
    public static final void method1710(int arg0, int arg1, int arg2) {
        field3970 = arg0;
        field3969 = arg1;
        field3983 = arg2;
        field3968 = new int[field3970][field3969][field3983];
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 138)
    public static final void method1711() {
        GL var0 = class43.field651;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            field3974[var3] = -1;
            method1715(var3);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V", line = 164)
    public static final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class64.field1001) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3974[var5] != -1) {
                int var6 = field3968[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3974[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3968[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3974[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3974[var5] = -1;
            method1715(var5);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 210)
    public static final void method1713() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3974[var0] = -1;
            method1715(var0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V", line = 223)
    public static final void method1714() {
        for (int var0 = 0; var0 < field3975; var0++) {
            class114 var1 = field3979[var0];
            int var2 = var1.field1914;
            if (var1.field1898) {
                var2 = 0;
            }
            int var3 = var1.field1914;
            if (var1.field1901) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1920 >> 7) - var1.field1913;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1920 >> 7) + var1.field1913;
                if (var7 > field3983 - 1) {
                    var7 = field3983 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1909[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1906 >> 7) - var1.field1913);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3969 - 1) {
                        var11 = field3969 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3968[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3968[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3968[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3968[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3968[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 313)
    private static final void method1715(int arg0) {
        if (field3977[arg0]) {
            field3977[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class43.field651;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "()V", line = 329)
    public static final void method1716() {
        field3979 = null;
        field3974 = null;
        field3977 = null;
        field3982 = null;
        field3976 = null;
        field3968 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "()V", line = 341)
    public static void method1717() {
        field3979 = null;
        field3968 = (int[][][]) null;
        field3974 = null;
        field3977 = null;
        field3972 = null;
        field3982 = null;
        field3976 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[[[Lk;)V", line = 351)
    public static final void method1718(int arg0, int arg1, class257[][][] arg2) {
        if (!class64.field1001) {
            return;
        }
        GL var3 = class43.field651;
        class83.method749(0, 0, 110);
        class43.method368(0);
        class43.method371();
        class43.method390(class43.field679);
        var3.glDepthMask(false);
        class43.method352(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label72: for (int var4 = 0; var4 < field3975; var4++) {
            class114 var5 = field3979[var4];
            int var6 = var5.field1914;
            if (var5.field1905) {
                var6--;
            }
            if (var5.field1918 != null) {
                int var7 = 0;
                int var8 = (var5.field1920 >> 7) - var5.field1913;
                int var9 = (var5.field1920 >> 7) + var5.field1913;
                if (var9 >= class304.field4813) {
                    var9 = class304.field4813 - 1;
                }
                if (var8 < class332.field5292) {
                    var7 += class332.field5292 - var8;
                    var8 = class332.field5292;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var5.field1909[var7++];
                    int var12 = (var11 >> 8) + ((var5.field1906 >> 7) - var5.field1913);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class215.field3617) {
                        var12 = class215.field3617;
                    }
                    if (var13 >= class202.field3444) {
                        var13 = class202.field3444 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class257 var15 = null;
                        if (var6 >= 0) {
                            var15 = arg2[var6][var14][var10];
                        }
                        if (var6 < 0 || var15 != null && var15.field4143) {
                            class43.method359(201.5F - (float) var5.field1914 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1917 }, 0);
                            var5.field1918.method1919();
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
        var3.glFogfv(2918, class9.field122, 0);
        var3.glEnableClientState(32888);
        class43.method362();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V", line = 452)
    public static final void method1719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class64.field1001 || field3971 == arg3 && field3973 == arg4 && field3981 == arg5 && field3978 == arg6 && field3980 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3976[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3968[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3982[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3974[var16] == var14) {
                                    if (!field3976[var16]) {
                                        field3976[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3982[var10++] = var14;
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
                if (!field3976[var18]) {
                    field3974[var18] = field3982[var17];
                    field3976[var18] = true;
                    method1708(var18, field3979[field3982[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3976[var19]) {
                field3974[var19] = -1;
                method1715(var19);
            }
        }
        field3971 = arg3;
        field3973 = arg4;
        field3981 = arg5;
        field3978 = arg6;
        field3980 = arg7;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqb;)V", line = 581)
    public static final void method1720(class114 arg0) {
        if (field3975 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3979[field3975++] = arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V", line = 595)
    public static final void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class64.field1001 || field3971 == arg3 && field3973 == arg4 && field3981 == arg5 && field3978 == arg4 && field3980 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3976[var6] = false;
        }
        int var7 = 0;
        int var8 = field3968[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3974[var10] == var9) {
                        field3976[var10] = true;
                        continue label72;
                    }
                }
                field3982[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3976[var12]) {
                        field3974[var12] = field3982[var11];
                        field3976[var12] = true;
                        method1708(var12, field3979[field3982[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3976[var13]) {
                    field3974[var13] = -1;
                    method1715(var13);
                }
            }
            field3971 = arg3;
            field3973 = arg4;
            field3981 = arg5;
            field3978 = arg4;
            field3980 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "()V", line = 682)
    public static final void method1722() {
        field3979 = new class114[255];
        field3974 = new int[4];
        field3977 = new boolean[4];
        field3982 = new int[4];
        field3976 = new boolean[4];
        field3968 = new int[field3970][field3969][field3983];
    }
}
