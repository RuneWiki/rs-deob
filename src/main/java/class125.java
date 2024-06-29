import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class125 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[Z")
    private static boolean[] field1921 = new boolean[4];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field1927 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[Z")
    private static boolean[] field1922 = new boolean[4];

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[F")
    private static float[] field1928 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "[I")
    private static int[] field1933 = new int[4];

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[I")
    private static int[] field1931 = new int[4];

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[Ltg;")
    public static class243[] field1934 = new class243[255];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    private static int field1919;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    private static int field1920;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    private static int field1923;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    private static int field1924;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    private static int field1926;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    private static int field1929;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    private static int field1930;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    private static int field1932;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[[[I")
    private static int[][][] field1925;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 7)
    public static final void method830() {
        for (int var0 = 0; var0 < 4; var0++) {
            field1931[var0] = -1;
            method831(var0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 19)
    private static final void method831(int arg0) {
        if (field1921[arg0]) {
            field1921[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class264.field4313;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[[[Li;I)V", line = 31)
    public static final void method832(int arg0, int arg1, class104[][][] arg2, int arg3) {
        if (!class6.field146) {
            return;
        }
        GL var4 = class264.field4313;
        class103.method677(0, 30359, 0);
        class264.method1719(0);
        class264.method1706();
        class264.method1722(class264.field4298);
        var4.glDepthMask(false);
        class264.method1710(false);
        var4.glBlendFunc(774, 1);
        var4.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var4.glTexEnvi(8960, 34176, 34166);
        var4.glTexEnvi(8960, 34192, 770);
        label61: for (int var5 = 0; var5 < field1927; var5++) {
            class243 var6 = field1934[var5];
            if (var6.field3925 != null && var6.field3928 <= arg3) {
                int var7 = 0;
                int var8 = (var6.field3906 >> 7) - var6.field3923;
                int var9 = (var6.field3906 >> 7) + var6.field3923;
                if (var9 >= class114.field1724) {
                    var9 = class114.field1724 - 1;
                }
                if (var8 < class99.field1511) {
                    var7 += class99.field1511 - var8;
                    var8 = class99.field1511;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var6.field3902[var7++];
                    int var12 = (var11 >> 8) + ((var6.field3929 >> 7) - var6.field3923);
                    int var13 = (var11 & 0xFF) + var12 - 1;
                    if (var12 < class10.field186) {
                        var12 = class10.field186;
                    }
                    if (var13 >= class75.field1167) {
                        var13 = class75.field1167 - 1;
                    }
                    for (int var14 = var12; var14 <= var13; var14++) {
                        class104 var15 = arg2[var6.field3928][var14][var10];
                        if (var15 != null && var15.field1613) {
                            class264.method1740(201.5F - (float) var6.field3928 * 50.0F - 1.5F);
                            var4.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var6.field3896 }, 0);
                            var6.field3925.method1018();
                            continue label61;
                        }
                    }
                }
            }
        }
        var4.glTexEnvi(8960, 34176, 5890);
        var4.glTexEnvi(8960, 34192, 768);
        var4.glBlendFunc(770, 771);
        var4.glDepthMask(true);
        var4.glFogfv(2918, class178.field2850, 0);
        var4.glEnableClientState(32888);
        class264.method1736();
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()V", line = 125)
    public static final void method833() {
        GL var0 = class264.field4313;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIII)V", line = 142)
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class6.field146) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method841(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field1924 - 1) {
            method841(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method841(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field1929 - 1) {
            method841(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field1929 - 1) {
            method841(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field1924 - 1 && arg6 < field1929 - 1) {
            method841(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method841(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field1924 - 1 && arg6 > 0) {
            method841(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ltg;)V", line = 195)
    public static final void method835(class243 arg0) {
        if (field1927 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field1934[field1927++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V", line = 206)
    public static final void method836(int arg0, int arg1, int arg2) {
        field1926 = arg0;
        field1924 = arg1;
        field1929 = arg2;
        field1925 = new int[field1926][field1924][field1929];
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 215)
    public static final void method837(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field1927; var2++) {
            field1934[var2].method1587(false, arg1, arg0);
        }
        field1932 = -1;
        field1930 = -1;
        field1923 = -1;
        field1919 = -1;
        field1920 = -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILtg;III)V", line = 236)
    private static final void method838(int arg0, class243 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class264.field4313;
        if (!field1921[arg0]) {
            var6.glEnable(var5);
            field1921[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field3918);
        var6.glLightfv(var5, 4609, arg1.field3914, 0);
        field1928[0] = (float) (arg1.field3929 - arg2);
        field1928[1] = (float) (arg1.field3903 - arg3);
        field1928[2] = (float) (arg1.field3906 - arg4);
        var6.glLightfv(var5, 4611, field1928, 0);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "()V", line = 257)
    public static void method839() {
        field1934 = null;
        field1925 = (int[][][]) null;
        field1931 = null;
        field1921 = null;
        field1928 = null;
        field1933 = null;
        field1922 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V", line = 267)
    public static final void method840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class6.field146) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field1931[var5] != -1) {
                int var6 = field1925[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field1931[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field1925[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field1931[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field1931[var5] = -1;
            method831(var5);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII)V", line = 321)
    public static final void method841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class6.field146 || field1932 == arg3 && field1930 == arg4 && field1923 == arg5 && field1919 == arg4 && field1920 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field1922[var6] = false;
        }
        int var7 = 0;
        int var8 = field1925[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field1931[var10] == var9) {
                        field1922[var10] = true;
                        continue label72;
                    }
                }
                field1933[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field1922[var12]) {
                        field1931[var12] = field1933[var11];
                        field1922[var12] = true;
                        method838(var12, field1934[field1933[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field1922[var13]) {
                    field1931[var13] = -1;
                    method831(var13);
                }
            }
            field1932 = arg3;
            field1930 = arg4;
            field1923 = arg5;
            field1919 = arg4;
            field1920 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "()V", line = 411)
    public static final void method842() {
        for (int var0 = 0; var0 < field1927; var0++) {
            class243 var1 = field1934[var0];
            int var2 = var1.field3928;
            if (var1.field3926) {
                var2 = 0;
            }
            int var3 = var1.field3928;
            if (var1.field3932) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field3906 >> 7) - var1.field3923;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field3906 >> 7) + var1.field3923;
                if (var7 > field1929 - 1) {
                    var7 = field1929 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field3902[var5++];
                    int var10 = (var9 >> 8) + ((var1.field3929 >> 7) - var1.field3923);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field1924 - 1) {
                        var11 = field1924 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field1925[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field1925[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field1925[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field1925[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field1925[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "()V", line = 500)
    public static final void method843() {
        field1927 = 0;
        for (int var0 = 0; var0 < field1926; var0++) {
            for (int var1 = 0; var1 < field1924; var1++) {
                for (int var2 = 0; var2 < field1929; var2++) {
                    field1925[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIII)V", line = 531)
    public static final void method844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class6.field146 || field1932 == arg3 && field1930 == arg4 && field1923 == arg5 && field1919 == arg6 && field1920 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field1922[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field1925[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field1933[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field1931[var16] == var14) {
                                    if (!field1922[var16]) {
                                        field1922[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field1933[var10++] = var14;
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
                if (!field1922[var18]) {
                    field1931[var18] = field1933[var17];
                    field1922[var18] = true;
                    method838(var18, field1934[field1933[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field1922[var19]) {
                field1931[var19] = -1;
                method831(var19);
            }
        }
        field1932 = arg3;
        field1930 = arg4;
        field1923 = arg5;
        field1919 = arg6;
        field1920 = arg7;
    }
}
