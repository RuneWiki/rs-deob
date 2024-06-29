import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class158 extends class20 {

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Z")
    public boolean field2485 = false;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public int field2489 = 0;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lqe;")
    private class38 field2481 = new class38();

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    private int field2499 = 0;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lci;")
    public class327 field2495 = new class327();

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    private int field2502 = 0;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Z")
    private boolean field2511 = false;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Z")
    private boolean field2515 = false;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    private int field2516;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[Lgm;")
    public class262[] field2482;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "J")
    private long field2483;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Z")
    public static boolean field2491 = false;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field2496 = 0;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Z")
    public static boolean field2486 = false;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Lmk;")
    public static class169 field2497 = new class169(8);

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    private static int field2522 = 0;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "[Z")
    private static boolean[] field2523 = new boolean[8];

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "[Z")
    private static boolean[] field2518 = new boolean[8];

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field2524 = 2;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lqm;")
    private static class227 field2520 = new class227(131056);

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "F")
    public static float field2528 = 1.0F;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public int field2513;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "J")
    public long field2480;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "J")
    private long field2484;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lqe;")
    private static class38 field2493;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2527;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
    public static int[] field2517;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "[I")
    public static int[] field2521;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[Lgm;")
    public static class262[] field2494;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "[[S")
    public static short[][] field2519;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "[[S")
    public static short[][] field2525;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()I", line = 7)
    public static final int method1219() {
        return field2524;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 17)
    public final void method1220(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class3.field36) {
            arg0.glDisable(2896);
        }
        field2520.field3760 = 0;
        if (class42.field625) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2517[var5] > 32 ? 32 : field2517[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class262 var8 = this.field2482[field2525[var5][var7]];
                        field2520.method1713(false, (float) (var8.field4409 >> 12));
                        field2520.method1713(false, (float) (var8.field4411 >> 12));
                        field2520.method1713(false, (float) (var8.field4414 >> 12));
                        int var9 = var8.field4412;
                        field2520.method1712((byte) (var9 >> 16), -60);
                        field2520.method1712((byte) (var9 >> 8), -109);
                        field2520.method1712((byte) var9, -76);
                        field2520.method1712((byte) (var9 >> 24), -85);
                    }
                    if (field2517[var5] > 32) {
                        int var10 = field2517[var5] - 32 - 1;
                        for (int var11 = field2521[var10] - 1; var11 >= 0; var11--) {
                            class262 var12 = this.field2482[field2519[var10][var11]];
                            field2520.method1713(false, (float) (var12.field4409 >> 12));
                            field2520.method1713(false, (float) (var12.field4411 >> 12));
                            field2520.method1713(false, (float) (var12.field4414 >> 12));
                            int var13 = var12.field4412;
                            field2520.method1712((byte) (var13 >> 16), -62);
                            field2520.method1712((byte) (var13 >> 8), -91);
                            field2520.method1712((byte) var13, -82);
                            field2520.method1712((byte) (var13 >> 24), -64);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2517[var14] > 32 ? 32 : field2517[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class262 var17 = this.field2482[field2525[var14][var16]];
                        field2520.method1738((float) (var17.field4409 >> 12), (byte) -39);
                        field2520.method1738((float) (var17.field4411 >> 12), (byte) -39);
                        field2520.method1738((float) (var17.field4414 >> 12), (byte) -39);
                        int var18 = var17.field4412;
                        field2520.method1712((byte) (var18 >> 16), -65);
                        field2520.method1712((byte) (var18 >> 8), -68);
                        field2520.method1712((byte) var18, -60);
                        field2520.method1712((byte) (var18 >> 24), -67);
                    }
                    if (field2517[var14] > 32) {
                        int var19 = field2517[var14] - 32 - 1;
                        for (int var20 = field2521[var19] - 1; var20 >= 0; var20--) {
                            class262 var21 = this.field2482[field2519[var19][var20]];
                            field2520.method1738((float) (var21.field4409 >> 12), (byte) -39);
                            field2520.method1738((float) (var21.field4411 >> 12), (byte) -39);
                            field2520.method1738((float) (var21.field4414 >> 12), (byte) -39);
                            int var22 = var21.field4412;
                            field2520.method1712((byte) (var22 >> 16), -93);
                            field2520.method1712((byte) (var22 >> 8), -87);
                            field2520.method1712((byte) var22, -76);
                            field2520.method1712((byte) (var22 >> 24), -124);
                        }
                    }
                }
            }
        }
        if (field2520.field3760 != 0) {
            if (class42.field645) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field2527 == null || field2527.capacity() < field2520.field3760) {
                field2527 = ByteBuffer.allocateDirect(field2520.field3760).order(ByteOrder.nativeOrder());
            } else {
                field2527.clear();
            }
            field2527.put(field2520.field3793, 0, field2520.field3760);
            field2527.flip();
            field2527.position(0);
            arg0.glVertexPointer(3, 5126, 16, field2527);
            field2527.position(12);
            arg0.glColorPointer(4, 5121, 16, field2527);
            arg0.glDrawArrays(0, 0, field2520.field3760 >> 4);
        }
        if (!arg3 && class3.field36) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 170)
    public static final void method1221() {
        GL var0 = class42.field627;
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
            field2491 = true;
        }
        field2525 = new short[1600][32];
        field2519 = new short[32][768];
        field2517 = new int[1600];
        field2521 = new int[32];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIII)V", line = 197)
    public final void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2485 || !this.field2511 || !class42.field607) {
            return;
        }
        GL var10 = class42.field627;
        int var11 = class291.field4713;
        int var12 = class66.field1175;
        int var13 = class36.field550;
        method1236(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method1226();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field2504 - this.field2510) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field2486) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method1227();
            return;
        }
        class20 var20 = this.field2481.field556;
        for (class20 var21 = var20.field233; var21 != var20; var21 = var21.field233) {
            class76 var22 = (class76) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field2517[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field2521[var24] = 0;
            }
            field2526 = 0;
            class20 var25 = var22.field1290.field556;
            for (class20 var26 = var25.field233; var26 != var25; var26 = var26.field233) {
                class262 var27 = (class262) var26;
                if (!var27.field4408) {
                    int var28 = (var27.field4409 >> 12) - var11;
                    int var29 = (var27.field4411 >> 12) - var12;
                    int var30 = (var27.field4414 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field2517[var32] < 32) {
                        field2525[var32][field2517[var32]++] = var27.field4407;
                    } else {
                        if (field2517[var32] == 32) {
                            if (field2526 == 32) {
                                if (field2486) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2517[var32] += field2526++ + 1;
                        }
                        short[] var10000 = field2519[field2517[var32] - 32 - 1];
                        int var10002 = field2517[var32] - 32 - 1;
                        int var10004 = field2521[field2517[var32] - 32 - 1];
                        field2521[var10002] = field2521[field2517[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field4407;
                    }
                }
            }
            boolean var33 = false;
            if (field2491 && var22.field1288.field3322 != -1) {
                class153.field2439.method762(-120, var22.field1288.field3322);
                var33 = true;
            } else {
                class42.method273(-1);
            }
            float var34 = (float) var22.field1288.field3303 * field2528;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1220(var10, var19, var33, var22.field1288.field3326);
        }
        method1227();
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 338)
    public static final void method1223() {
        field2525 = (short[][]) null;
        field2519 = (short[][]) null;
        field2517 = null;
        field2521 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 348)
    public static final void method1224(int arg0) {
        field2524 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V", line = 927)
    public class158(int arg0, int arg1, int arg2) {
        this.field2516 = arg1;
        this.field2503 = arg2;
        this.field2482 = new class262[8192];
        this.field2483 = (long) arg0;
        this.field2515 = true;
        field2493.method247(this, (byte) -108);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 358)
    private final void method1225(int arg0, int arg1) {
        for (class23 var3 = (class23) this.field2495.method2300((byte) 107); var3 != null; var3 = (class23) this.field2495.method2306(-23)) {
            var3.field287 = this.field2508 + var3.field279;
            var3.field288 = this.field2507 + var3.field273;
            var3.field272 = this.field2514 + var3.field277;
            if (this.field2512 == 0) {
                var3.field282 = var3.field283.field572.field4381;
                var3.field276 = var3.field283.field572.field4386;
            } else {
                int var4 = var3.field283.field572.field4381;
                int var5 = var3.field283.field572.field4386;
                var3.field282 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field276 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()I", line = 389)
    public final int method1226() {
        if (this.field2506 == this.field2500 && this.field2513 == this.field2509) {
            return 92;
        }
        int var1 = this.field2500 << 7;
        int var2 = (this.field2506 << 7) + 128;
        int var3 = this.field2509 << 7;
        int var4 = (this.field2513 << 7) + 128;
        int var5 = this.field2508 - var1;
        int var6 = var2 - this.field2508;
        if (var5 > var6) {
            int var7 = this.field2514 - var3;
            int var8 = var4 - this.field2514;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2514 - var3;
            int var10 = var4 - this.field2514;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "()V", line = 435)
    public static final void method1227() {
        GL var0 = class42.field627;
        if (class3.field36) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class42.field638) {
            var0.glEnable(2912);
        }
        if (field2491) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lq;[Lje;Z[I[I[I)V", line = 454)
    public final void method1228(class79[] arg0, class39[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2485) {
            this.method1240(arg0, arg2, arg3, arg4, arg5);
            this.method1233(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "()V", line = 461)
    public static void method1229() {
        field2493 = null;
        field2494 = null;
        field2497 = null;
        field2523 = null;
        field2518 = null;
        field2525 = (short[][]) null;
        field2519 = (short[][]) null;
        field2517 = null;
        field2521 = null;
        field2520 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V", line = 475)
    public final void method1230(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2485) {
            return;
        }
        if (this.field2512 != arg0) {
            for (class76 var6 = (class76) this.field2481.method254((byte) -96); var6 != null; var6 = (class76) this.field2481.method250(58)) {
                var6.field1286 = true;
            }
        }
        this.field2484 = this.field2480;
        this.field2512 = arg0;
        this.field2505 = arg1;
        this.field2508 = arg2;
        this.field2507 = arg3;
        this.field2514 = arg4;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIII)V", line = 499)
    public final void method1231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1230(arg0, arg1, class291.field4713 + arg2, class66.field1175 + arg3, class36.field550 + arg4);
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "()V", line = 503)
    public final void method1232() {
        this.field2485 = true;
        for (class23 var1 = (class23) this.field2495.method2300((byte) 99); var1 != null; var1 = (class23) this.field2495.method2306(-23)) {
            if (var1.field283.field572.field4365 == 1) {
                var1.method1352(-78);
            }
        }
        this.field2482 = new class262[8192];
        this.field2489 = 0;
        this.field2481 = new class38();
        this.field2499 = 0;
        this.field2495 = new class327();
        this.field2502 = 0;
        this.method120(127);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lje;Z[I[I[I)V", line = 526)
    private final void method1233(class39[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2518[var6] = false;
        }
        label88: for (class23 var7 = (class23) this.field2495.method2300((byte) 121); var7 != null; var7 = (class23) this.field2495.method2306(-23)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field283) {
                        field2518[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method330(15);
                this.field2502--;
                if (var7.method1354(20934)) {
                    var7.method1352(-72);
                    field2522--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2502 != 8; var9++) {
            if (!field2518[var9]) {
                class23 var10 = null;
                if (arg0[var9].field572.field4365 == 1 && field2522 < 32) {
                    var10 = new class23(arg0[var9], this);
                    field2497.method1313((long) arg0[var9].field572.field4375, -19527, var10);
                    field2522++;
                }
                if (var10 == null) {
                    var10 = new class23(arg0[var9], this);
                }
                this.field2495.method2302((byte) -85, var10);
                this.field2502++;
                field2518[var9] = true;
            }
        }
        for (class23 var11 = (class23) this.field2495.method2300((byte) 103); var11 != null; var11 = (class23) this.field2495.method2306(-23)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2518[var12] && arg0[var12] == var11.field283) {
                    var11.method151(arg4[var11.field283.field573], arg2[var11.field283.field573], arg3[var11.field283.field573], 32285);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(J)V", line = 632)
    public static final void method1234(long arg0) {
        field2487 = field2490;
        field2496 = 0;
        field2490 = 0;
        long var2 = class47.method371(-114);
        for (class158 var4 = (class158) field2493.method254((byte) -96); var4 != null; var4 = (class158) field2493.method250(81)) {
            if (var4.method1238(arg0)) {
                field2496++;
            }
        }
        if (field2486 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2493.method251(0) + ", running: " + field2496 + ". Particles: " + field2490 + ". Time taken: " + (class47.method371(119) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V", line = 655)
    public static final void method1235(int arg0, int arg1) {
        field2528 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 663)
    public static final void method1236(int arg0, int arg1, int arg2) {
        GL var3 = class42.field627;
        if (field2491) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class310.method2203(0, 0, 86);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class285.field4647, 0);
        if (class3.field36) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class42.field638) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "()V", line = 686)
    public static final void method1237() {
        field2497 = new class169(8);
        field2522 = 0;
        for (class158 var0 = (class158) field2493.method254((byte) -96); var0 != null; var0 = (class158) field2493.method250(67)) {
            var0.method1232();
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(J)Z", line = 701)
    private final boolean method1238(long arg0) {
        long var3;
        if (this.field2483 > this.field2484) {
            var3 = this.field2483;
        } else {
            var3 = this.field2484;
        }
        int var5 = (int) (this.field2480 - var3);
        if (var5 > 750) {
            this.method1232();
            return false;
        }
        if (this.field2484 > 0L) {
            this.field2500 = this.field2508 - (this.field2516 << 6) >> 7;
            this.field2506 = ((this.field2516 << 6) + this.field2508 >> 7) - 1;
            this.field2509 = this.field2514 - (this.field2503 << 6) >> 7;
            this.field2513 = ((this.field2503 << 6) + this.field2514 >> 7) - 1;
            this.field2504 = this.field2507;
            if (this.field2505 < 3) {
                this.field2510 = class101.field1656[this.field2505 + 1][this.field2506][this.field2509] + class101.field1656[this.field2505 + 1][this.field2500][this.field2509] + class101.field1656[this.field2505 + 1][this.field2500][this.field2513] + class101.field1656[this.field2505 + 1][this.field2506][this.field2513] >> 2;
            } else {
                this.field2510 = this.field2504 - 1024;
            }
            this.field2511 = true;
            int var6 = class153.field2438[this.field2512];
            int var7 = class153.field2445[this.field2512];
            this.method1225(var6, var7);
            if (this.field2515) {
                class76 var8 = (class76) this.field2481.method254((byte) -96);
                while (true) {
                    if (var8 == null) {
                        this.field2515 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field1288.field3304; var9++) {
                        var8.method630(this.field2480, 29275, true, var6, 1, var7);
                    }
                    var8 = (class76) this.field2481.method250(74);
                }
            }
            int var10 = (int) (arg0 - this.field2480);
            for (class76 var11 = (class76) this.field2481.method254((byte) -96); var11 != null; var11 = (class76) this.field2481.method250(109)) {
                var11.method630(arg0, 29275, var5 < 10, var6, var10, var7);
            }
        }
        this.field2480 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "()V", line = 779)
    public final void method1239() {
        this.field2515 = true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lq;Z[I[I[I)V", line = 785)
    private final void method1240(class79[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2523[var6] = false;
        }
        label79: for (class76 var7 = (class76) this.field2481.method254((byte) -96); var7 != null; var7 = (class76) this.field2481.method250(70)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field1311) {
                        field2523[var8] = true;
                        var7.field1285 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field1291 == 0) {
                    var7.method120(124);
                    this.field2499--;
                } else {
                    var7.field1285 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2499 != 8; var9++) {
            if (!field2523[var9]) {
                class76 var10 = new class76(arg0[var9], this, this.field2480);
                this.field2481.method247(var10, (byte) -96);
                this.field2499++;
                field2523[var9] = true;
            }
        }
        for (class76 var11 = (class76) this.field2481.method254((byte) -96); var11 != null; var11 = (class76) this.field2481.method250(83)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2523[var12] && arg0[var12] == var11.field1311) {
                    var11.method628(arg2[var11.field1311.field1371], arg3[var11.field1311.field1371], arg2[var11.field1311.field1365], arg2[var11.field1311.field1366], arg3[var11.field1311.field1365], arg4[var11.field1311.field1365], 0, arg3[var11.field1311.field1366], arg4[var11.field1311.field1371], arg4[var11.field1311.field1366]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lth;)V", line = 885)
    public static final void method1241(class57 arg0) {
        field2498 = 0;
        field2488 = 0;
        field2493 = new class38();
        field2494 = new class262[1024];
        class272.method2040(arg0, (byte) 39);
        class306.method2180(2048, arg0);
    }
}
