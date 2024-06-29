import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class175 extends class188 {

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field2642 = 0;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field2649 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field2655 = 0;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field2651 = 0;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field2660 = 0;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public int field2661 = 0;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "F")
    private float field2639;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Z")
    public boolean field2657;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Z")
    private boolean field2658;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lqb;")
    private class117 field2641;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Llf;")
    private static class143 field2648;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Llf;")
    private static class143 field2656;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lan;")
    private class354 field2645;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2643;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2652;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2662;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[F")
    private float[] field2636;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[F")
    private float[] field2646;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[F")
    private float[] field2663;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "[F")
    private float[] field2667;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    private int[] field2644;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    private int[] field2650;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "[I")
    private int[] field2653;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "[I")
    private int[] field2659;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "[I")
    private int[] field2664;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
    private int[] field2665;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[I")
    private int[] field2666;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[Z")
    private boolean[] field2654;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[[I")
    private int[][] field2638;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[[I")
    private int[][] field2647;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIFFFIF)I", line = 11)
    public final int method1215(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class305 var11 = (class305) this.field2641.method770(var9, 104);
            if (var11 != null) {
                if (arg1 < this.field2644[var11.field4748]) {
                    this.field2644[var11.field4748] = arg1;
                }
                return var11.field4748;
            }
        }
        this.field2665[this.field2655] = arg0;
        this.field2644[this.field2655] = arg1;
        this.field2653[this.field2655] = arg2;
        if (this.field2658) {
            this.field2667[this.field2655] = arg7;
        }
        this.field2636[this.field2655] = arg3;
        this.field2663[this.field2655] = arg4;
        this.field2646[this.field2655] = arg5;
        this.field2666[this.field2655] = arg6;
        if (var9 != 0L) {
            this.field2641.method764(24369, new class305(this.field2655), var9);
        }
        return this.field2655++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 55)
    public final void method1216() {
        class143 var1 = new class143((this.field2658 ? 40 : 36) * this.field2655);
        for (int var2 = 0; var2 < this.field2655; var2++) {
            if (class272.field4318) {
                var1.method1053((byte) 91, (float) this.field2665[var2]);
                var1.method1053((byte) 109, (float) this.field2644[var2]);
                var1.method1053((byte) 124, (float) this.field2653[var2]);
                var1.method1052(this.field2666[var2], false);
                var1.method1053((byte) 118, this.field2636[var2]);
                var1.method1053((byte) 114, this.field2663[var2]);
                var1.method1053((byte) 108, this.field2646[var2]);
                var1.method1053((byte) 112, (float) this.field2665[var2] / this.field2639);
                var1.method1053((byte) 99, (float) this.field2653[var2] / this.field2639);
                if (this.field2658) {
                    var1.method1053((byte) 91, this.field2667[var2]);
                }
            } else {
                var1.method1060((byte) 47, (float) this.field2665[var2]);
                var1.method1060((byte) 47, (float) this.field2644[var2]);
                var1.method1060((byte) 47, (float) this.field2653[var2]);
                var1.method1052(this.field2666[var2], false);
                var1.method1060((byte) 47, this.field2636[var2]);
                var1.method1060((byte) 47, this.field2663[var2]);
                var1.method1060((byte) 47, this.field2646[var2]);
                var1.method1060((byte) 47, (float) this.field2665[var2] / this.field2639);
                var1.method1060((byte) 47, (float) this.field2653[var2] / this.field2639);
                if (this.field2658) {
                    var1.method1060((byte) 47, this.field2667[var2]);
                }
            }
        }
        if (class272.field4302) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field2260, 0, var1.field2295);
            this.field2645 = new class354();
            this.field2645.method2446(var3);
        } else {
            this.field2652 = ByteBuffer.allocateDirect(var1.field2295).order(ByteOrder.nativeOrder());
            this.field2652.put(var1.field2260, 0, var1.field2295);
            this.field2652.flip();
        }
        this.field2665 = null;
        this.field2644 = null;
        this.field2653 = null;
        this.field2666 = null;
        this.field2636 = null;
        this.field2663 = null;
        this.field2646 = null;
        this.field2641 = null;
        this.field2667 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class175(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2640 = arg0;
        this.field2639 = arg1;
        this.field2657 = arg2;
        this.field2658 = arg3;
        this.field2637 = arg4;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V", line = 137)
    public static void method1217() {
        field2656 = null;
        field2648 = null;
        field2662 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V", line = 143)
    public final void method1218() {
        this.field2665 = new int[this.field2661];
        this.field2644 = new int[this.field2661];
        this.field2653 = new int[this.field2661];
        if (this.field2658) {
            this.field2667 = new float[this.field2661];
        }
        this.field2666 = new int[this.field2661];
        this.field2636 = new float[this.field2661];
        this.field2663 = new float[this.field2661];
        this.field2646 = new float[this.field2661];
        this.field2650 = new int[this.field2649];
        this.field2664 = new int[this.field2649];
        this.field2659 = new int[this.field2649];
        this.field2647 = new int[this.field2649][];
        this.field2641 = new class117(class226.method1571(true, this.field2661));
        if (this.field2657) {
            this.field2638 = new int[this.field2649][];
            this.field2654 = new boolean[this.field2649];
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()V", line = 175)
    public static final void method1219() {
        field2656 = null;
        field2648 = null;
        field2662 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([[[Lwk;FZ)V", line = 185)
    public final void method1220(class196[][][] arg0, float arg1, boolean arg2) {
        if (field2656 == null || field2656.field2260.length < this.field2660 * 4) {
            field2656 = new class143(this.field2660 * 4);
        } else {
            field2656.field2295 = 0;
        }
        if (field2648 == null || field2648.field2260.length < this.field2651 * 4) {
            field2648 = new class143(this.field2651 * 4);
        } else {
            field2648.field2295 = 0;
        }
        if (class272.field4318) {
            for (int var4 = 0; var4 < this.field2642; var4++) {
                class196 var5 = arg0[this.field2659[var4]][this.field2650[var4]][this.field2664[var4]];
                if (var5 != null && var5.field2983) {
                    int[] var6 = this.field2647[var4];
                    class143 var9;
                    if (this.field2657) {
                        int[] var7 = this.field2638[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2648.method1052(var7[var8], false);
                            }
                        }
                        var9 = this.field2654[var4] ? field2648 : field2656;
                    } else {
                        var9 = field2656;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1052(var6[0], false);
                        var9.method1052(var6[var10], false);
                        var9.method1052(var6[var10 + 1], false);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2642; var11++) {
                class196 var12 = arg0[this.field2659[var11]][this.field2650[var11]][this.field2664[var11]];
                if (var12 != null && var12.field2983) {
                    int[] var13 = this.field2647[var11];
                    class143 var16;
                    if (this.field2657) {
                        int[] var14 = this.field2638[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2648.method1012(var14[var15], -11);
                            }
                        }
                        var16 = this.field2654[var11] ? field2648 : field2656;
                    } else {
                        var16 = field2656;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1012(var13[0], -11);
                        var16.method1012(var13[var17], -11);
                        var16.method1012(var13[var17 + 1], -11);
                    }
                }
            }
        }
        if (field2656.field2295 == 0 && field2648.field2295 == 0) {
            return;
        }
        GL var18 = class272.field4310;
        if (this.field2640 == -1 || arg2) {
            class272.method1965(-1);
            class11.method69(-97, 0, 0);
        } else {
            class104.field1438.method883((byte) -20, this.field2640);
        }
        int var19 = this.field2658 ? 40 : 36;
        if (this.field2645 == null) {
            if (class272.field4302) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2652.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2652);
            this.field2652.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2652);
            if (class290.field4566) {
                this.field2652.position(16);
                var18.glNormalPointer(5126, var19, this.field2652);
            }
            this.field2652.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2652);
            if (this.field2658) {
                var18.glClientActiveTexture(class167.method1190());
                this.field2652.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2652);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2645.method2447();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class290.field4566) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2658) {
                var18.glClientActiveTexture(class167.method1190());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class272.field4302) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2656.field2295 != 0) {
            if (field2662 == null || field2662.capacity() < field2656.field2295) {
                field2662 = ByteBuffer.allocateDirect(field2656.field2295).order(ByteOrder.nativeOrder());
            } else {
                field2662.clear();
            }
            field2662.put(field2656.field2260, 0, field2656.field2295);
            field2662.flip();
            class272.method1924(arg1);
            var18.glDrawElements(4, field2656.field2295 / 4, 5125, field2662);
        }
        if (field2648.field2295 == 0) {
            return;
        }
        if (field2643 == null || field2643.capacity() < field2648.field2295) {
            field2643 = ByteBuffer.allocateDirect(field2648.field2295).order(ByteOrder.nativeOrder());
        } else {
            field2643.clear();
        }
        field2643.put(field2648.field2260, 0, field2648.field2295);
        field2643.flip();
        class272.method1924(arg1 - 100.0F);
        class272.method1922();
        var18.glDrawElements(4, field2648.field2295 / 4, 5125, field2643);
        class272.method1942();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[I[IZ)I", line = 393)
    public final int method1221(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2657) {
            this.field2638[this.field2642] = arg4;
            this.field2654[this.field2642] = arg5;
            if (arg4 != null) {
                this.field2651 += arg4.length;
            }
            if (arg5) {
                this.field2651 += (arg3.length - 2) * 3;
            } else {
                this.field2660 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2660 += (arg3.length - 2) * 3;
        }
        this.field2659[this.field2642] = arg0;
        this.field2650[this.field2642] = arg1;
        this.field2664[this.field2642] = arg2;
        this.field2647[this.field2642] = arg3;
        return this.field2642++;
    }
}
