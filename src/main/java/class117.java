import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class117 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Lqe;")
    public static class292[] field1951 = new class292[255];

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[F")
    private static float[] field1954 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!i", name = "j", descriptor = "[Z")
    private static boolean[] field1955 = new boolean[4];

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[I")
    private static int[] field1959 = new int[4];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[Z")
    private static boolean[] field1948 = new boolean[4];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    private static int[] field1947 = new int[4];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    private static int field1946;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private static int field1952;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    private static int field1953;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    private static int field1956;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    private static int field1957;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private static int field1958;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    private static int field1960;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private static int field1961;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[[[I")
    private static int[][][] field1949;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqe;)V", line = 5)
    public static final void method902(class292 arg0) {
        if (field1950 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field1951[field1950++] = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method903(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field1950; var2++) {
            field1951[var2].method1982(true, arg0, arg1);
        }
        field1958 = -1;
        field1961 = -1;
        field1960 = -1;
        field1957 = -1;
        field1946 = -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V", line = 37)
    public static final void method904(int arg0, int arg1, int arg2) {
        field1953 = arg0;
        field1956 = arg1;
        field1952 = arg2;
        field1949 = new int[field1953][field1956][field1952];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 45)
    public static void method905() {
        field1951 = null;
        field1949 = (int[][][]) null;
        field1959 = null;
        field1955 = null;
        field1954 = null;
        field1947 = null;
        field1948 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 64)
    public static final void method906() {
        for (int var0 = 0; var0 < 4; var0++) {
            field1959[var0] = -1;
            method911(var0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILqe;III)V", line = 75)
    private static final void method907(int arg0, class292 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class154.field2479;
        if (!field1955[arg0]) {
            var6.glEnable(var5);
            field1955[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field4958);
        var6.glLightfv(var5, 4609, arg1.field4971, 0);
        field1954[0] = (float) (arg1.field4962 - arg2);
        field1954[1] = (float) (arg1.field4973 - arg3);
        field1954[2] = (float) (arg1.field4959 - arg4);
        var6.glLightfv(var5, 4611, field1954, 0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V", line = 92)
    public static final void method908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!client.field5162) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method909(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field1956 - 1) {
            method909(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method909(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field1952 - 1) {
            method909(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field1952 - 1) {
            method909(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field1956 - 1 && arg6 < field1952 - 1) {
            method909(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method909(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field1956 - 1 && arg6 > 0) {
            method909(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V", line = 149)
    public static final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!client.field5162 || field1958 == arg3 && field1961 == arg4 && field1960 == arg5 && field1957 == arg4 && field1946 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field1948[var6] = false;
        }
        int var7 = 0;
        int var8 = field1949[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field1959[var10] == var9) {
                        field1948[var10] = true;
                        continue label72;
                    }
                }
                field1947[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field1948[var12]) {
                        field1959[var12] = field1947[var11];
                        field1948[var12] = true;
                        method907(var12, field1951[field1947[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field1948[var13]) {
                    field1959[var13] = -1;
                    method911(var13);
                }
            }
            field1958 = arg3;
            field1961 = arg4;
            field1960 = arg5;
            field1957 = arg4;
            field1946 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 238)
    public static final void method910() {
        for (int var0 = 0; var0 < field1950; var0++) {
            class292 var1 = field1951[var0];
            int var2 = var1.field4969;
            if (var1.field4960) {
                var2 = 0;
            }
            int var3 = var1.field4969;
            if (var1.field4976) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field4959 >> 7) - var1.field4961;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field4959 >> 7) + var1.field4961;
                if (var7 > field1952 - 1) {
                    var7 = field1952 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field4964[var5++];
                    int var10 = (var9 >> 8) + ((var1.field4962 >> 7) - var1.field4961);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field1956 - 1) {
                        var11 = field1956 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field1949[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field1949[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field1949[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field1949[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field1949[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 326)
    private static final void method911(int arg0) {
        if (field1955[arg0]) {
            field1955[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class154.field2479;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 340)
    public static final void method912() {
        GL var0 = class154.field2479;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V", line = 370)
    public static final void method913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!client.field5162) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field1959[var5] != -1) {
                int var6 = field1949[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field1959[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field1949[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field1959[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field1959[var5] = -1;
            method911(var5);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V", line = 413)
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!client.field5162 || field1958 == arg3 && field1961 == arg4 && field1960 == arg5 && field1957 == arg6 && field1946 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field1948[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field1949[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field1947[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field1959[var16] == var14) {
                                    if (!field1948[var16]) {
                                        field1948[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field1947[var10++] = var14;
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
                if (!field1948[var18]) {
                    field1959[var18] = field1947[var17];
                    field1948[var18] = true;
                    method907(var18, field1951[field1947[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field1948[var19]) {
                field1959[var19] = -1;
                method911(var19);
            }
        }
        field1958 = arg3;
        field1961 = arg4;
        field1960 = arg5;
        field1957 = arg6;
        field1946 = arg7;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 545)
    public static final void method915() {
        field1950 = 0;
        for (int var0 = 0; var0 < field1953; var0++) {
            for (int var1 = 0; var1 < field1956; var1++) {
                for (int var2 = 0; var2 < field1952; var2++) {
                    field1949[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[[[Lhk;)V", line = 574)
    public static final void method916(int arg0, int arg1, class166[][][] arg2) {
        if (!client.field5162) {
            return;
        }
        GL var3 = class154.field2479;
        class135.method1024(0, -108, 0);
        class154.method1115(0);
        class154.method1107();
        class154.method1141(class154.field2465);
        var3.glDepthMask(false);
        class154.method1113(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field1950; var4++) {
            class292 var5 = field1951[var4];
            if (var5.field4954 != null) {
                int var6 = 0;
                int var7 = (var5.field4959 >> 7) - var5.field4961;
                int var8 = (var5.field4959 >> 7) + var5.field4961;
                if (var8 >= class164.field2671) {
                    var8 = class164.field2671 - 1;
                }
                if (var7 < class127.field2104) {
                    var6 += class127.field2104 - var7;
                    var7 = class127.field2104;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field4964[var6++];
                    int var11 = (var10 >> 8) + ((var5.field4962 >> 7) - var5.field4961);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class49.field715) {
                        var11 = class49.field715;
                    }
                    if (var12 >= class108.field1752) {
                        var12 = class108.field1752 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class166 var14 = arg2[var5.field4969][var13][var9];
                        if (var14 != null && var14.field2729) {
                            class154.method1112(201.5F - (float) var5.field4969 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field4978 }, 0);
                            var5.field4954.method382();
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
        var3.glFogfv(2918, class179.field2852, 0);
        var3.glEnableClientState(32888);
        class154.method1122();
    }
}
