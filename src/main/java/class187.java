import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class187 extends class86 {

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field2557 = 0;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Z")
    public boolean field2565 = false;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lug;")
    private class92 field2566 = new class92();

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private int field2574 = 0;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lll;")
    public class54 field2575 = new class54();

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Z")
    private boolean field2579 = false;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    private int field2594 = 0;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Z")
    private boolean field2600 = false;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    private int field2585;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[Llm;")
    public class136[] field2564;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "J")
    private long field2558;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
    public static boolean field2556 = false;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field2563 = 0;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Z")
    public static boolean field2571 = false;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field2572 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lak;")
    public static class306 field2555 = new class306(8);

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "[Z")
    private static boolean[] field2592 = new boolean[8];

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[Z")
    private static boolean[] field2595 = new boolean[8];

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2597 = 2;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    private static int field2601 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Lfd;")
    private static class299 field2590 = new class299(131056);

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "F")
    public static float field2602 = 1.0F;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "J")
    private long field2561;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "J")
    public long field2568;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lug;")
    private static class92 field2570;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2603;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
    public static int[] field2598;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "[I")
    public static int[] field2599;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[Llm;")
    public static class136[] field2559;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[S")
    public static short[][] field2587;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[[S")
    public static short[][] field2596;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lsk;Z[I[I[I)V", line = 9)
    private final void method1350(class238[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2595[var6] = false;
        }
        label79: for (class32 var7 = (class32) this.field2566.method668((byte) 56); var7 != null; var7 = (class32) this.field2566.method663(-2069)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field375) {
                        field2595[var8] = true;
                        var7.field396 = false;
                        continue label79;
                    }
                }
            }
            if (!arg1) {
                if (var7.field387 == 0) {
                    var7.method623(64);
                    this.field2574--;
                } else {
                    var7.field396 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2574 != 8; var9++) {
            if (!field2595[var9]) {
                class32 var10 = new class32(arg0[var9], this, this.field2568);
                this.field2566.method670((byte) 91, var10);
                this.field2574++;
                field2595[var9] = true;
            }
        }
        for (class32 var11 = (class32) this.field2566.method668((byte) 56); var11 != null; var11 = (class32) this.field2566.method663(-2069)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2595[var12] && arg0[var12] == var11.field375) {
                    var11.method208(arg2[var11.field375.field3438], arg3[var11.field375.field3447], arg2[var11.field375.field3447], arg3[var11.field375.field3438], arg3[var11.field375.field3446], -74, arg2[var11.field375.field3446], arg4[var11.field375.field3446], arg4[var11.field375.field3447], arg4[var11.field375.field3438]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 105)
    public final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2565) {
            return;
        }
        if (this.field2586 != arg0) {
            for (class32 var6 = (class32) this.field2566.method668((byte) 56); var6 != null; var6 = (class32) this.field2566.method663(-2069)) {
                var6.field383 = true;
            }
        }
        this.field2561 = this.field2568;
        this.field2586 = arg0;
        this.field2583 = arg1;
        this.field2588 = arg2;
        this.field2581 = arg3;
        this.field2577 = arg4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lfh;)V", line = 131)
    public static final void method1352(class140 arg0) {
        field2562 = 0;
        field2563 = 0;
        field2570 = new class92();
        field2559 = new class136[1024];
        class207.method1530(arg0, 2123471014);
        class157.method1209(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 140)
    public static final void method1353() {
        field2587 = (short[][]) null;
        field2596 = (short[][]) null;
        field2598 = null;
        field2599 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 147)
    public final void method1354() {
        this.field2600 = true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIII)V", line = 154)
    public final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2565 || !this.field2579 || !class47.field623) {
            return;
        }
        GL var10 = class47.field592;
        int var11 = class181.field2479;
        int var12 = class125.field1659;
        int var13 = class338.field5269;
        method1363(var11, var12, var13);
        int var14 = arg4 * arg8 - arg3 * arg6 >> 16;
        int var15 = arg1 * arg7 + arg2 * var14 >> 16;
        int var16 = this.method1361();
        int var17 = (arg1 * 0 + arg2 * var16 >> 16) + var15;
        int var18 = (-var16 * arg2 - (this.field2578 - this.field2591) * arg1 >> 16) + var15;
        int var19 = var17 + 2 - var18;
        if (var19 >= 1600) {
            if (field2571) {
                System.out.println("Model too big for particles - radixsize:" + var19 + " maxmodelsize:" + 1600);
            }
            method1364();
            return;
        }
        class86 var20 = this.field2566.field1196;
        for (class86 var21 = var20.field1098; var21 != var20; var21 = var21.field1098) {
            class32 var22 = (class32) var21;
            for (int var23 = 0; var23 < var19; var23++) {
                field2598[var23] = 0;
            }
            for (int var24 = 0; var24 < 32; var24++) {
                field2599[var24] = 0;
            }
            field2589 = 0;
            class86 var25 = var22.field394.field1196;
            for (class86 var26 = var25.field1098; var26 != var25; var26 = var26.field1098) {
                class136 var27 = (class136) var26;
                if (!var27.field1860) {
                    int var28 = (var27.field1850 >> 12) - var11;
                    int var29 = (var27.field1851 >> 12) - var12;
                    int var30 = (var27.field1853 >> 12) - var13;
                    int var31 = arg4 * var30 - arg3 * var28 >> 16;
                    int var32 = (arg1 * var29 + arg2 * var31 >> 16) - var18;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= var19) {
                        var32 = var19 - 1;
                    }
                    if (field2598[var32] < 32) {
                        field2587[var32][field2598[var32]++] = var27.field1857;
                    } else {
                        if (field2598[var32] == 32) {
                            if (field2589 == 32) {
                                if (field2571) {
                                    System.out.println("Overflowed model-based radix sort");
                                }
                                continue;
                            }
                            field2598[var32] += field2589++ + 1;
                        }
                        short[] var10000 = field2596[field2598[var32] - 32 - 1];
                        int var10002 = field2598[var32] - 32 - 1;
                        int var10004 = field2599[field2598[var32] - 32 - 1];
                        field2599[var10002] = field2599[field2598[var32] - 32 - 1] + 1;
                        var10000[var10004] = var27.field1857;
                    }
                }
            }
            boolean var33 = false;
            if (field2556 && var22.field376.field2065 != -1) {
                class350.field5467.method912(64, var22.field376.field2065);
                var33 = true;
            } else {
                class47.method357(-1);
            }
            float var34 = (float) var22.field376.field2061 * field2602;
            if (var34 > 64.0F) {
                var34 = 64.0F;
            }
            var10.glPointSize(var34);
            this.method1357(var10, var19, var33, var22.field376.field2092);
        }
        method1364();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 296)
    public static final int method1356() {
        return field2597;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljavax/media/opengl/GL;IZZ)V", line = 302)
    public final void method1357(GL arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3 && class67.field856) {
            arg0.glDisable(2896);
        }
        field2590.field4351 = 0;
        if (class47.field593) {
            for (int var5 = arg1 - 1; var5 >= 0; var5--) {
                int var6 = field2598[var5] > 32 ? 32 : field2598[var5];
                if (var6 > 0) {
                    for (int var7 = var6 - 1; var7 >= 0; var7--) {
                        class136 var8 = this.field2564[field2587[var5][var7]];
                        field2590.method2071(true, (float) (var8.field1850 >> 12));
                        field2590.method2071(true, (float) (var8.field1851 >> 12));
                        field2590.method2071(true, (float) (var8.field1853 >> 12));
                        int var9 = var8.field1854;
                        field2590.method2048((byte) (var9 >> 16), 122);
                        field2590.method2048((byte) (var9 >> 8), 124);
                        field2590.method2048((byte) var9, 91);
                        field2590.method2048((byte) (var9 >> 24), 125);
                    }
                    if (field2598[var5] > 32) {
                        int var10 = field2598[var5] - 32 - 1;
                        for (int var11 = field2599[var10] - 1; var11 >= 0; var11--) {
                            class136 var12 = this.field2564[field2596[var10][var11]];
                            field2590.method2071(true, (float) (var12.field1850 >> 12));
                            field2590.method2071(true, (float) (var12.field1851 >> 12));
                            field2590.method2071(true, (float) (var12.field1853 >> 12));
                            int var13 = var12.field1854;
                            field2590.method2048((byte) (var13 >> 16), 122);
                            field2590.method2048((byte) (var13 >> 8), 97);
                            field2590.method2048((byte) var13, 62);
                            field2590.method2048((byte) (var13 >> 24), 111);
                        }
                    }
                }
            }
        } else {
            for (int var14 = arg1 - 1; var14 >= 0; var14--) {
                int var15 = field2598[var14] > 32 ? 32 : field2598[var14];
                if (var15 > 0) {
                    for (int var16 = var15 - 1; var16 >= 0; var16--) {
                        class136 var17 = this.field2564[field2587[var14][var16]];
                        field2590.method2099((float) (var17.field1850 >> 12), -2503);
                        field2590.method2099((float) (var17.field1851 >> 12), -2503);
                        field2590.method2099((float) (var17.field1853 >> 12), -2503);
                        int var18 = var17.field1854;
                        field2590.method2048((byte) (var18 >> 16), 103);
                        field2590.method2048((byte) (var18 >> 8), 68);
                        field2590.method2048((byte) var18, 86);
                        field2590.method2048((byte) (var18 >> 24), 110);
                    }
                    if (field2598[var14] > 32) {
                        int var19 = field2598[var14] - 32 - 1;
                        for (int var20 = field2599[var19] - 1; var20 >= 0; var20--) {
                            class136 var21 = this.field2564[field2596[var19][var20]];
                            field2590.method2099((float) (var21.field1850 >> 12), -2503);
                            field2590.method2099((float) (var21.field1851 >> 12), -2503);
                            field2590.method2099((float) (var21.field1853 >> 12), -2503);
                            int var22 = var21.field1854;
                            field2590.method2048((byte) (var22 >> 16), 101);
                            field2590.method2048((byte) (var22 >> 8), 91);
                            field2590.method2048((byte) var22, 89);
                            field2590.method2048((byte) (var22 >> 24), 89);
                        }
                    }
                }
            }
        }
        if (field2590.field4351 != 0) {
            if (class47.field618) {
                arg0.glBindBufferARB(34962, 0);
            }
            if (field2603 == null || field2603.capacity() < field2590.field4351) {
                field2603 = ByteBuffer.allocateDirect(field2590.field4351).order(ByteOrder.nativeOrder());
            } else {
                field2603.clear();
            }
            field2603.put(field2590.field4350, 0, field2590.field4351);
            field2603.flip();
            field2603.position(0);
            arg0.glVertexPointer(3, 5126, 16, field2603);
            field2603.position(12);
            arg0.glColorPointer(4, 5121, 16, field2603);
            arg0.glDrawArrays(0, 0, field2590.field4351 >> 4);
        }
        if (!arg3 && class67.field856) {
            arg0.glEnable(2896);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 453)
    public static void method1358() {
        field2570 = null;
        field2559 = null;
        field2555 = null;
        field2595 = null;
        field2592 = null;
        field2587 = (short[][]) null;
        field2596 = (short[][]) null;
        field2598 = null;
        field2599 = null;
        field2590 = null;
        field2603 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 466)
    public static final void method1359(int arg0) {
        field2597 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 469)
    public final void method1360() {
        this.field2565 = true;
        for (class121 var1 = (class121) this.field2575.method413(1253231568); var1 != null; var1 = (class121) this.field2575.method419(32)) {
            if (var1.field1585.field432.field3580 == 1) {
                var1.method1556(255);
            }
        }
        this.field2564 = new class136[8192];
        this.field2557 = 0;
        this.field2566 = new class92();
        this.field2574 = 0;
        this.field2575 = new class54();
        this.field2594 = 0;
        this.method623(94);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()I", line = 490)
    public final int method1361() {
        if (this.field2593 == this.field2582 && this.field2584 == this.field2576) {
            return 92;
        }
        int var1 = this.field2582 << 7;
        int var2 = (this.field2593 << 7) + 128;
        int var3 = this.field2576 << 7;
        int var4 = (this.field2584 << 7) + 128;
        int var5 = this.field2588 - var1;
        int var6 = var2 - this.field2588;
        if (var5 > var6) {
            int var7 = this.field2577 - var3;
            int var8 = var4 - this.field2577;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2577 - var3;
            int var10 = var4 - this.field2577;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 537)
    private final void method1362(int arg0, int arg1) {
        for (class121 var3 = (class121) this.field2575.method413(1253231568); var3 != null; var3 = (class121) this.field2575.method419(16)) {
            var3.field1595 = this.field2588 + var3.field1581;
            var3.field1588 = this.field2581 + var3.field1582;
            var3.field1586 = this.field2577 + var3.field1589;
            if (this.field2586 == 0) {
                var3.field1590 = var3.field1585.field432.field3570;
                var3.field1587 = var3.field1585.field432.field3563;
            } else {
                int var4 = var3.field1585.field432.field3570;
                int var5 = var3.field1585.field432.field3563;
                var3.field1590 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field1587 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 565)
    public static final void method1363(int arg0, int arg1, int arg2) {
        GL var3 = class47.field592;
        if (field2556) {
            var3.glEnable(34913);
            var3.glTexEnvi(34913, 34914, 1);
        }
        var3.glDepthMask(false);
        class255.method1781(0, 0, -85);
        var3.glColorMaterial(1028, 4609);
        var3.glMaterialfv(1028, 4608, class262.field3809, 0);
        if (class67.field856) {
            var3.glDisableClientState(32885);
        }
        var3.glDisableClientState(32888);
        var3.glPushMatrix();
        var3.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        var3.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!class47.field624) {
            var3.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 589)
    public static final void method1364() {
        GL var0 = class47.field592;
        if (class67.field856) {
            var0.glEnableClientState(32885);
        }
        var0.glEnableClientState(32888);
        var0.glDepthMask(true);
        var0.glColorMaterial(1028, 5634);
        var0.glPopMatrix();
        if (!class47.field624) {
            var0.glEnable(2912);
        }
        if (field2556) {
            var0.glTexEnvi(34913, 34914, 0);
            var0.glDisable(34913);
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "()V", line = 613)
    public static final void method1365() {
        field2555 = new class306(8);
        field2601 = 0;
        for (class187 var0 = (class187) field2570.method668((byte) 56); var0 != null; var0 = (class187) field2570.method663(-2069)) {
            var0.method1360();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V", line = 629)
    public static final void method1366(long arg0) {
        field2560 = field2569;
        field2572 = 0;
        field2569 = 0;
        long var2 = class6.method37(10828);
        for (class187 var4 = (class187) field2570.method668((byte) 56); var4 != null; var4 = (class187) field2570.method663(-2069)) {
            if (var4.method1370(arg0)) {
                field2572++;
            }
        }
        if (field2571 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2570.method664(-74) + ", running: " + field2572 + ". Particles: " + field2569 + ". Time taken: " + (class6.method37(10828) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lu;Z[I[I[I)V", line = 654)
    private final void method1367(class35[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2592[var6] = false;
        }
        label88: for (class121 var7 = (class121) this.field2575.method413(1253231568); var7 != null; var7 = (class121) this.field2575.method419(97)) {
            if (arg0 != null) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    if (arg0[var8] == var7.field1585) {
                        field2592[var8] = true;
                        continue label88;
                    }
                }
            }
            if (!arg1) {
                var7.method179((byte) 51);
                this.field2594--;
                if (var7.method1558((byte) -105)) {
                    var7.method1556(255);
                    field2601--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length && this.field2594 != 8; var9++) {
            if (!field2592[var9]) {
                class121 var10 = null;
                if (arg0[var9].field432.field3580 == 1 && field2601 < 32) {
                    var10 = new class121(arg0[var9], this);
                    field2555.method2141((long) arg0[var9].field432.field3572, var10, 0);
                    field2601++;
                }
                if (var10 == null) {
                    var10 = new class121(arg0[var9], this);
                }
                this.field2575.method415((byte) -90, var10);
                this.field2594++;
                field2592[var9] = true;
            }
        }
        for (class121 var11 = (class121) this.field2575.method413(1253231568); var11 != null; var11 = (class121) this.field2575.method419(71)) {
            for (int var12 = 0; var12 < arg0.length; var12++) {
                if (field2592[var12] && arg0[var12] == var11.field1585) {
                    var11.method877(-30263, arg4[var11.field1585.field429], arg3[var11.field1585.field429], arg2[var11.field1585.field429]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 761)
    public static final void method1368(int arg0, int arg1) {
        field2602 = (float) arg1 / 334.0F;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V", line = 955)
    public class187(int arg0, int arg1, int arg2) {
        this.field2585 = arg1;
        this.field2580 = arg2;
        this.field2564 = new class136[8192];
        this.field2558 = (long) arg0;
        this.field2600 = true;
        field2570.method670((byte) 108, this);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lsk;[Lu;Z[I[I[I)V", line = 767)
    public final void method1369(class238[] arg0, class35[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2565) {
            this.method1350(arg0, arg2, arg3, arg4, arg5);
            this.method1367(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(J)Z", line = 776)
    private final boolean method1370(long arg0) {
        long var3;
        if (this.field2558 > this.field2561) {
            var3 = this.field2558;
        } else {
            var3 = this.field2561;
        }
        int var5 = (int) (this.field2568 - var3);
        if (var5 > 750) {
            this.method1360();
            return false;
        }
        if (this.field2561 > 0L) {
            this.field2582 = this.field2588 - (this.field2585 << 6) >> 7;
            this.field2593 = ((this.field2585 << 6) + this.field2588 >> 7) - 1;
            this.field2576 = this.field2577 - (this.field2580 << 6) >> 7;
            this.field2584 = ((this.field2580 << 6) + this.field2577 >> 7) - 1;
            this.field2578 = this.field2581;
            if (this.field2583 < 3) {
                this.field2591 = class74.field978[this.field2583 + 1][this.field2593][this.field2576] + class74.field978[this.field2583 + 1][this.field2582][this.field2576] + class74.field978[this.field2583 + 1][this.field2582][this.field2584] + class74.field978[this.field2583 + 1][this.field2593][this.field2584] >> 2;
            } else {
                this.field2591 = this.field2578 - 1024;
            }
            this.field2579 = true;
            int var6 = class350.field5476[this.field2586];
            int var7 = class350.field5474[this.field2586];
            this.method1362(var6, var7);
            if (this.field2600) {
                class32 var8 = (class32) this.field2566.method668((byte) 56);
                while (true) {
                    if (var8 == null) {
                        this.field2600 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field376.field2081; var9++) {
                        var8.method206(1, var6, true, var7, this.field2568, 121);
                    }
                    var8 = (class32) this.field2566.method663(-2069);
                }
            }
            int var10 = (int) (arg0 - this.field2568);
            for (class32 var11 = (class32) this.field2566.method668((byte) 56); var11 != null; var11 = (class32) this.field2566.method663(-2069)) {
                var11.method206(var10, var6, var5 < 10, var7, arg0, 115);
            }
        }
        this.field2568 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "()V", line = 855)
    public static final void method1371() {
        GL var0 = class47.field592;
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
            field2556 = true;
        }
        field2587 = new short[1600][32];
        field2596 = new short[32][768];
        field2598 = new int[1600];
        field2599 = new int[32];
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V", line = 882)
    public final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1351(arg0, arg1, class181.field2479 + arg2, class125.field1659 + arg3, class338.field5269 + arg4);
    }
}
