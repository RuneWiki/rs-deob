import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class267 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[F")
    private static float[] field4652 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    private static int field4649;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private static int field4650;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    private static int field4653;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    private static int field4654;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    private static int field4655;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    private static int field4657;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    private static int field4659;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    private static int field4661;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
    private static int[] field4658;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "[I")
    private static int[] field4660;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[Lbg;")
    public static class284[] field4651;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[Z")
    private static boolean[] field4646;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "[Z")
    private static boolean[] field4656;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[[[I")
    private static int[][][] field4648;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 4)
    private static final void method1881(int arg0) {
        if (field4646[arg0]) {
            field4646[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class257.field4409;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 17)
    public static final void method1882() {
        for (int var0 = 0; var0 < field4647; var0++) {
            class284 var1 = field4651[var0];
            int var2 = var1.field4900;
            if (var1.field4885) {
                var2 = 0;
            }
            int var3 = var1.field4900;
            if (var1.field4878) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4892 >> 7) - var1.field4874;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4892 >> 7) + var1.field4874;
                if (var7 > field4661 - 1) {
                    var7 = field4661 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4886[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4877 >> 7) - var1.field4874);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field4655 - 1) {
                        var11 = field4655 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field4648[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field4648[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field4648[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field4648[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field4648[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V", line = 107)
    public static final void method1883(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field4647; var2++) {
            field4651[var2].method1988((byte) -49, arg0, arg1);
        }
        field4659 = -1;
        field4649 = -1;
        field4654 = -1;
        field4657 = -1;
        field4650 = -1;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()V", line = 121)
    public static final void method1884() {
        field4647 = 0;
        for (int var0 = 0; var0 < field4653; var0++) {
            for (int var1 = 0; var1 < field4655; var1++) {
                for (int var2 = 0; var2 < field4661; var2++) {
                    field4648[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 149)
    public static void method1885() {
        field4651 = null;
        field4648 = (int[][][]) null;
        field4658 = null;
        field4646 = null;
        field4652 = null;
        field4660 = null;
        field4656 = null;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()V", line = 162)
    public static final void method1886() {
        GL var0 = class257.field4409;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field4651 = new class284[255];
        field4658 = new int[4];
        field4646 = new boolean[4];
        field4660 = new int[4];
        field4656 = new boolean[4];
        field4648 = new int[field4653][field4655][field4661];
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 187)
    public static final void method1887(int arg0, int arg1, int arg2) {
        field4653 = arg0;
        field4655 = arg1;
        field4661 = arg2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[[[Llf;)V", line = 198)
    public static final void method1888(int arg0, int arg1, class228[][][] arg2) {
        if (!class4.field62) {
            return;
        }
        GL var3 = class257.field4409;
        class107.method795(0, 58, 0);
        class257.method1758(0);
        class257.method1743();
        class257.method1736(class257.field4417);
        var3.glDepthMask(false);
        class257.method1763(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field4647; var4++) {
            class284 var5 = field4651[var4];
            if (var5.field4893 != null) {
                int var6 = 0;
                int var7 = (var5.field4892 >> 7) - var5.field4874;
                int var8 = (var5.field4892 >> 7) + var5.field4874;
                if (var8 >= class45.field688) {
                    var8 = class45.field688 - 1;
                }
                if (var7 < class30.field360) {
                    var6 += class30.field360 - var7;
                    var7 = class30.field360;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field4886[var6++];
                    int var11 = (var10 >> 8) + ((var5.field4877 >> 7) - var5.field4874);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class121.field2144) {
                        var11 = class121.field2144;
                    }
                    if (var12 >= class171.field3009) {
                        var12 = class171.field3009 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class228 var14 = arg2[var5.field4900][var13][var9];
                        if (var14 != null && var14.field3927) {
                            class257.method1735(201.5F - (float) var5.field4900 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4870 }, 0);
                            var5.field4893.method140();
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
        var3.glFogfv(2918, class304.field5185, 0);
        var3.glEnableClientState(32888);
        class257.method1734();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIII)V", line = 297)
    public static final void method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class4.field62 || field4659 == arg3 && field4649 == arg4 && field4654 == arg5 && field4657 == arg6 && field4650 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field4656[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field4648[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field4660[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field4658[var16] == var14) {
                                    if (!field4656[var16]) {
                                        field4656[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field4660[var10++] = var14;
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
                if (!field4656[var18]) {
                    field4658[var18] = field4660[var17];
                    field4656[var18] = true;
                    method1890(var18, field4651[field4660[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field4656[var19]) {
                field4658[var19] = -1;
                method1881(var19);
            }
        }
        field4659 = arg3;
        field4649 = arg4;
        field4654 = arg5;
        field4657 = arg6;
        field4650 = arg7;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILbg;III)V", line = 431)
    private static final void method1890(int arg0, class284 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class257.field4409;
        if (!field4646[arg0]) {
            var6.glEnable(var5);
            field4646[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4890);
        var6.glLightfv(var5, 4609, arg1.field4872, 0);
        field4652[0] = (float) (arg1.field4877 - arg2);
        field4652[1] = (float) (arg1.field4883 - arg3);
        field4652[2] = (float) (arg1.field4892 - arg4);
        var6.glLightfv(var5, 4611, field4652, 0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII)V", line = 448)
    public static final void method1891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class4.field62 || field4659 == arg3 && field4649 == arg4 && field4654 == arg5 && field4657 == arg4 && field4650 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field4656[var6] = false;
        }
        int var7 = 0;
        int var8 = field4648[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field4658[var10] == var9) {
                        field4656[var10] = true;
                        continue label72;
                    }
                }
                field4660[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field4656[var12]) {
                        field4658[var12] = field4660[var11];
                        field4656[var12] = true;
                        method1890(var12, field4651[field4660[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field4656[var13]) {
                    field4658[var13] = -1;
                    method1881(var13);
                }
            }
            field4659 = arg3;
            field4649 = arg4;
            field4654 = arg5;
            field4657 = arg4;
            field4650 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lbg;)V", line = 537)
    public static final void method1892(class284 arg0) {
        if (field4647 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field4651[field4647++] = arg0;
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "()V", line = 550)
    public static final void method1893() {
        for (int var0 = 0; var0 < 4; var0++) {
            field4658[var0] = -1;
            method1881(var0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V", line = 561)
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class4.field62) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1891(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field4655 - 1) {
            method1891(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1891(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field4661 - 1) {
            method1891(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field4661 - 1) {
            method1891(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field4655 - 1 && arg6 < field4661 - 1) {
            method1891(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1891(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field4655 - 1 && arg6 > 0) {
            method1891(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "()V", line = 617)
    public static final void method1895() {
        field4651 = null;
        field4658 = null;
        field4646 = null;
        field4660 = null;
        field4656 = null;
        field4648 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V", line = 625)
    public static final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class4.field62) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field4658[var5] != -1) {
                int var6 = field4648[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field4658[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field4648[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field4658[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field4658[var5] = -1;
            method1881(var5);
        }
    }
}
