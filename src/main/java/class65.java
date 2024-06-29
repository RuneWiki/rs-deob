import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class65 extends class270 {

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Z")
    public boolean field1024 = false;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public int field1028 = 0;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Lh;")
    private class240 field1022 = new class240();

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    private int field1032 = 0;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lc;")
    public class331 field1030 = new class331();

    @OriginalMember(owner = "client!il", name = "B", descriptor = "Z")
    private boolean field1033 = false;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Z")
    private boolean field1042 = false;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    private int field1045 = 0;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[Lwg;")
    public class315[] field1014;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "J")
    private long field1025;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
    public static boolean field1027 = false;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Z")
    public static boolean field1029 = false;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Ltg;")
    public static class339 field1012 = new class339(8);

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    private static int field1054 = 0;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "[Z")
    private static boolean[] field1049 = new boolean[8];

    @OriginalMember(owner = "client!il", name = "P", descriptor = "[Z")
    private static boolean[] field1047 = new boolean[8];

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field1055 = 2;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Lpi;")
    private static class336 field1051 = new class336(131056);

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "F")
    public static float field1059 = 1.0F;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "J")
    private long field1015;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "J")
    public long field1026;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lh;")
    private static class240 field1018;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1060;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "[I")
    public static int[] field1050;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "[I")
    public static int[] field1058;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[Lwg;")
    public static class315[] field1031;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "[[S")
    public static short[][] field1052;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "[[S")
    public static short[][] field1056;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([Lgo;Z[I[I[I)V", line = 11)
    private final void method610(class85[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1049[var6] = false;
        }
        label79: for (class197 var7 = (class197) this.field1022.method1685((byte) 84); var7 != null; var7 = (class197) this.field1022.method1688(0)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field3363) {
                        field1049[var8] = true;
                        var7.field3378 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field3382 == 0) {
                    var7.method1849((byte) -64);
                    this.field1032--;
                } else {
                    var7.field3378 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field1032 != 8; var9++) {
            if (!field1049[var9]) {
                class197 var10 = new class197(arg0[var9], this, this.field1026);
                this.field1022.method1689(var10, 9893);
                this.field1032++;
                field1049[var9] = true;
            }
        }
        for (class197 var11 = (class197) this.field1022.method1685((byte) 77); var11 != null; var11 = (class197) this.field1022.method1688(0)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field1049[var12] && arg0[var12] == var11.field3363) {
                    var11.method1491(arg4[var11.field3363.field1365], false, arg4[var11.field3363.field1363], arg2[var11.field3363.field1363], arg3[var11.field3363.field1361], arg4[var11.field3363.field1361], arg3[var11.field3363.field1365], arg2[var11.field3363.field1361], arg3[var11.field3363.field1363], arg2[var11.field3363.field1365]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 107)
    public static final void method611(int arg0, int arg1, int arg2) {
        GL var3 = class43.field651;
        if (field1027) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class83.method749(0, 0, 98);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class292.field4677, 0);
        if (class64.field1001) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class43.field650) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lcg;)V", line = 131)
    public static final void method612(class49 arg0) {
        field1016 = 0;
        field1013 = 0;
        field1018 = new class240();
        field1031 = new class315[1024];
        class48.method425(arg0, false);
        class352.method2452((byte) 107, arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([Lgo;[Lkd;Z[I[I[I)V", line = 139)
    public final void method613(class85[] arg0, class86[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field1024) {
            this.method610(arg0, arg2, arg3, arg4, arg5);
            this.method630(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 147)
    public final void method614(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class64.field1001) {
            arg0.glDisable(2896);
        }
        field1051.field5353 = 0;
        if (class43.field639) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field1058[var5] > 32 ? 32 : field1058[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class315 var8 = this.field1014[field1056[var5][var7]];
                        field1051.method2353((float) (var8.field4985 >> 12), (byte) 25);
                        field1051.method2353((float) (var8.field4987 >> 12), (byte) 71);
                        field1051.method2353((float) (var8.field4995 >> 12), (byte) 89);
                        int var9 = var8.field4990;
                        field1051.method2370((byte) (var9 >> 16), (byte) -20);
                        field1051.method2370((byte) (var9 >> 8), (byte) -20);
                        field1051.method2370((byte) var9, (byte) -20);
                        field1051.method2370((byte) (var9 >> 24), (byte) -20);
                    }
                    if (field1058[var5] > 32) {
                        int var10 = field1058[var5] - 32 - 1;
                        for (int var11 = field1050[var10] - 1; var11 >= 0; var11--) {
                            class315 var12 = this.field1014[field1052[var10][var11]];
                            field1051.method2353((float) (var12.field4985 >> 12), (byte) 81);
                            field1051.method2353((float) (var12.field4987 >> 12), (byte) 62);
                            field1051.method2353((float) (var12.field4995 >> 12), (byte) 67);
                            int var13 = var12.field4990;
                            field1051.method2370((byte) (var13 >> 16), (byte) -20);
                            field1051.method2370((byte) (var13 >> 8), (byte) -20);
                            field1051.method2370((byte) var13, (byte) -20);
                            field1051.method2370((byte) (var13 >> 24), (byte) -20);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field1058[var14] > 32 ? 32 : field1058[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class315 var17 = this.field1014[field1056[var14][var16]];
                        field1051.method2341((float) (var17.field4985 >> 12), 21536);
                        field1051.method2341((float) (var17.field4987 >> 12), 21536);
                        field1051.method2341((float) (var17.field4995 >> 12), 21536);
                        int var18 = var17.field4990;
                        field1051.method2370((byte) (var18 >> 16), (byte) -20);
                        field1051.method2370((byte) (var18 >> 8), (byte) -20);
                        field1051.method2370((byte) var18, (byte) -20);
                        field1051.method2370((byte) (var18 >> 24), (byte) -20);
                    }
                    if (field1058[var14] > 32) {
                        int var19 = field1058[var14] - 32 - 1;
                        for (int var20 = field1050[var19] - 1; var20 >= 0; var20--) {
                            class315 var21 = this.field1014[field1052[var19][var20]];
                            field1051.method2341((float) (var21.field4985 >> 12), 21536);
                            field1051.method2341((float) (var21.field4987 >> 12), 21536);
                            field1051.method2341((float) (var21.field4995 >> 12), 21536);
                            int var22 = var21.field4990;
                            field1051.method2370((byte) (var22 >> 16), (byte) -20);
                            field1051.method2370((byte) (var22 >> 8), (byte) -20);
                            field1051.method2370((byte) var22, (byte) -20);
                            field1051.method2370((byte) (var22 >> 24), (byte) -20);
                        }
                    }
                }
            }
        }
        if (field1051.field5353 != 0) {
            if (class43.field674) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field1060 == null || field1060.capacity() < field1051.field5353) {
                field1060 = ByteBuffer.allocateDirect(field1051.field5353).order(ByteOrder.nativeOrder());
            } else {
                field1060.clear();
            }
            field1060.put(field1051.field5342, 0, field1051.field5353);
            field1060.flip();
            field1060.position(0);
            arg0.glVertexPointer(3, 5126, 16, field1060);
            field1060.position(12);
            arg0.glColorPointer(4, 5121, 16, field1060);
            arg0.glDrawArrays(0, 0, field1051.field5353 >> 4);
        }
        if (!arg3 && class64.field1001) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 298)
    public final void method615(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1024) {
            return;
        }
        if (this.field1038 != arg0) {
            for (class197 var6 = (class197) this.field1022.method1685((byte) 85); var6 != null; var6 = (class197) this.field1022.method1688(0)) {
                var6.field3375 = true;
            }
        }
        this.field1015 = this.field1026;
        this.field1038 = arg0;
        this.field1035 = arg1;
        this.field1057 = arg2;
        this.field1040 = arg3;
        this.field1053 = arg4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I", line = 322)
    public final int method616() {
        if (this.field1046 == this.field1037 && this.field1041 == this.field1039) {
            return 92;
        }
        int var1 = this.field1046 << 7;
        int var2 = (this.field1037 << 7) + 128;
        int var3 = this.field1041 << 7;
        int var4 = (this.field1039 << 7) + 128;
        int var5 = this.field1057 - var1;
        int var6 = var2 - this.field1057;
        if (var5 > var6) {
            int var7 = this.field1053 - var3;
            int var8 = var4 - this.field1053;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field1053 - var3;
            int var10 = var4 - this.field1053;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 367)
    public static final void method617(int arg0) {
        field1055 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 375)
    public static final void method618() {
        GL var0 = class43.field651;
        if (class64.field1001) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class43.field650) {
            var0.glEnable(2912);
        }
        if (field1027) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V", line = 396)
    public static final void method619() {
        field1012 = new class339(8);
        field1054 = 0;
        for (class65 var0 = (class65) field1018.method1685((byte) 68); var0 != null; var0 = (class65) field1018.method1688(0)) {
            var0.method624();
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V", line = 416)
    public final void method620() {
        this.field1042 = true;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()V", line = 419)
    public static final void method621() {
        field1056 = (short[][]) null;
        field1052 = (short[][]) null;
        field1058 = null;
        field1050 = null;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "()I", line = 429)
    public static final int method622() {
        return field1055;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIII)V", line = 433)
    public final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field1024 || !this.field1033 || !class43.field680) {
            return;
        }
        GL var10 = class43.field651;
        int var11 = class233.field3870;
        int var12 = class205.field3502;
        int var13 = class75.field1226;
        method611(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method616();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field1044 - this.field1043) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field1029) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method618();
            return;
        }
        class270 var20 = this.field1022.field3921;
        for (class270 var21 = var20.field4310; var21 != var20; var21 = var21.field4310) {
            class197 var22 = (class197) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field1058[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field1050[var24] = 0;
            }
            field1048 = 0;
            class270 var25 = var22.field3373.field3921;
            for (class270 var26 = var25.field4310; var26 != var25; var26 = var26.field4310) {
                class315 var27 = (class315) var26;
                if (!var27.field4996) {
                    int var28 = (var27.field4985 >> 12) - var11;
                    int var29 = (var27.field4987 >> 12) - var12;
                    int var30 = (var27.field4995 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field1058[var32] < 32) {
                        field1056[var32][field1058[var32]++] = var27.field4989;
                    } else {
                        if (field1058[var32] == 32) {
                            if (field1048 == 32) {
                                if (field1029) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field1058[var32] += field1048++ + 1;
                        }
                        short[] var10000 = field1052[field1058[var32] - 32 - 1];
                        int var10002 = field1058[var32] - 32 - 1;
                        int var10004 = field1050[field1058[var32] - 32 - 1];
                        field1050[var10002] = field1050[field1058[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field4989;
                    }
                }
            }
            boolean var33 = false;
            if (field1027 && var22.field3353.field3273 != -1) {
                class62.field953.method1210(var22.field3353.field3273, 4880);
                var33 = true;
            } else {
                class43.method390(-1);
            }
            float var34 = (float) var22.field3353.field3315 * field1059;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method614(var10, var19, var33, var22.field3353.field3298);
        }
        method618();
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "()V", line = 571)
    public final void method624() {
        this.field1024 = true;
        for (class234 var1 = (class234) this.field1030.method2297(14204); var1 != null; var1 = (class234) this.field1030.method2291(-101)) {
            if (var1.field3875.field1370.field4786 == 1) {
                var1.method1067(40000);
            }
        }
        this.field1014 = new class315[8192];
        this.field1028 = 0;
        this.field1022 = new class240();
        this.field1032 = 0;
        this.field1030 = new class331();
        this.field1045 = 0;
        this.method1849((byte) -64);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(J)V", line = 596)
    public static final void method625(long arg0) {
        field1021 = field1023;
        field1017 = 0;
        field1023 = 0;
        long var2 = class306.method2102(-289);
        for (class65 var4 = (class65) field1018.method1685((byte) 125); var4 != null; var4 = (class65) field1018.method1688(0)) {
            if (var4.method631(arg0)) {
                field1017++;
            }
        }
        if (field1029 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field1018.method1686(0) + ", running: " + field1017 + ". Particles: " + field1023 + ". Time taken: " + (class306.method2102(-289) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!il", name = "h", descriptor = "()V", line = 620)
    public static final void method626() {
        GL var0 = class43.field651;
        if (var0.isExtensionAvailable("GL_ARB_point_parameters")) {
            float[] var1 = new float[] { 1.0F, 0.0F, 5.0E-7F };
            var0.glPointParameterfvARB(33065, var1, 0);
            FloatBuffer var2 = FloatBuffer.allocate(1);
            var0.glGetFloatv(33063, var2);
            float var3 = var2.get(0);
            if (var3 > 64.0F) {
                var3 = 64.0F;
            }
            var0.glPointParameterfARB(33062, 1.0F);
            var0.glPointParameterfARB(33063, var3);
        }
        if (var0.isExtensionAvailable("GL_ARB_point_sprite")) {
            field1027 = true;
        }
        field1056 = new short[1600][32];
        field1052 = new short[32][768];
        field1058 = new int[1600];
        field1050 = new int[32];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 649)
    private final void method627(int arg0, int arg1) {
        for (class234 var3 = (class234) this.field1030.method2297(14204); var3 != null; var3 = (class234) this.field1030.method2291(61)) {
            var3.field3880 = this.field1057 + var3.field3874;
            var3.field3879 = this.field1040 + var3.field3876;
            var3.field3873 = this.field1053 + var3.field3881;
            if (this.field1038 == 0) {
                var3.field3877 = var3.field3875.field1370.field4792;
                var3.field3872 = var3.field3875.field1370.field4806;
            } else {
                int var4 = var3.field3875.field1370.field4792;
                int var5 = var3.field3875.field1370.field4806;
                var3.field3877 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3872 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "()V", line = 675)
    public static void method628() {
        field1018 = null;
        field1031 = null;
        field1012 = null;
        field1049 = null;
        field1047 = null;
        field1056 = (short[][]) null;
        field1052 = (short[][]) null;
        field1058 = null;
        field1050 = null;
        field1051 = null;
        field1060 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIII)V", line = 688)
    public final void method629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method615(arg0, arg1, class233.field3870 + arg2, class205.field3502 + arg3, class75.field1226 + arg4);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(III)V", line = 954)
    public class65(int arg0, int arg1, int arg2) {
        this.field1036 = arg1;
        this.field1034 = arg2;
        this.field1014 = new class315[8192];
        this.field1025 = (long) arg0;
        this.field1042 = true;
        field1018.method1689(this, 9893);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([Lkd;Z[I[I[I)V", line = 701)
    private final void method630(class86[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field1047[var6] = false;
        }
        label88: for (class234 var7 = (class234) this.field1030.method2297(14204); var7 != null; var7 = (class234) this.field1030.method2291(-116)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field3875) {
                        field1047[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method2195(-1);
                this.field1045--;
                if (var7.method1065(true)) {
                    var7.method1067(40000);
                    field1054--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field1045 != 8; var9++) {
            if (!field1047[var9]) {
                class234 var10 = null;
                if (arg0[var9].field1370.field4786 == 1 && field1054 < 32) {
                    var10 = new class234(arg0[var9], this);
                    field1012.method2391((long) arg0[var9].field1370.field4787, var10, -20410);
                    field1054++;
                }
                if (var10 == null) {
                    var10 = new class234(arg0[var9], this);
                }
                this.field1030.method2303((byte) -124, var10);
                this.field1045++;
                field1047[var9] = true;
            }
        }
        for (class234 var11 = (class234) this.field1030.method2297(14204); var11 != null; var11 = (class234) this.field1030.method2291(-106)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field1047[var12] && arg0[var12] == var11.field3875) {
                    var11.method1676(arg2[var11.field3875.field1373], 100, arg3[var11.field3875.field1373], arg4[var11.field3875.field1373]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(J)Z", line = 808)
    private final boolean method631(long arg0) {
        long var3;
        if (this.field1025 > this.field1015) {
            var3 = this.field1025;
        } else {
            var3 = this.field1015;
        }
        int var5 = (int) (this.field1026 - var3);
        if (var5 > 750) {
            this.method624();
            return false;
        }
        if (this.field1015 > 0L) {
            this.field1046 = this.field1057 - (this.field1036 << 6) >> 7;
            this.field1037 = ((this.field1036 << 6) + this.field1057 >> 7) - 1;
            this.field1041 = this.field1053 - (this.field1034 << 6) >> 7;
            this.field1039 = ((this.field1034 << 6) + this.field1053 >> 7) - 1;
            this.field1044 = this.field1040;
            if (this.field1035 < 3) {
                this.field1043 = class137.field2487[this.field1035 + 1][this.field1046][this.field1041] + class137.field2487[this.field1035 + 1][this.field1037][this.field1041] + class137.field2487[this.field1035 + 1][this.field1046][this.field1039] + class137.field2487[this.field1035 + 1][this.field1037][this.field1039] >> 2;
            } else {
                this.field1043 = this.field1044 - 1024;
            }
            this.field1033 = true;
            int var6 = class62.field962[this.field1038];
            int var7 = class62.field961[this.field1038];
            this.method627(var6, var7);
            if (this.field1042) {
                class197 var8 = (class197) this.field1022.method1685((byte) 75);
                while (true) {
                    if (var8 == null) {
                        this.field1042 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field3353.field3260; var9++) {
                        var8.method1489(this.field1026, (byte) -114, true, var7, var6, 1);
                    }
                    var8 = (class197) this.field1022.method1688(0);
                }
            }
            int var10 = (int) (arg0 - this.field1026);
            for (class197 var11 = (class197) this.field1022.method1685((byte) 100); var11 != null; var11 = (class197) this.field1022.method1688(0)) {
                var11.method1489(arg0, (byte) -114, var5 < 10, var7, var6, var10);
            }
        }
        this.field1026 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V", line = 891)
    public static final void method632(int arg0, int arg1) {
        field1059 = (float) arg1 / 334.0F;
    }
}
