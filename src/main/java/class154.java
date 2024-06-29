import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class154 extends class287 {

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    private int field2641 = 0;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public int field2666 = 0;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field2639 = 0;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    private int field2665 = 0;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public int field2649 = 0;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "F")
    private float field2648;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Z")
    public boolean field2651;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Z")
    private boolean field2657;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Loe;")
    private class120 field2654;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lbg;")
    private static class194 field2635;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lbg;")
    private static class194 field2640;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lam;")
    private class244 field2655;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2645;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2650;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2664;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "[F")
    private float[] field2643;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[F")
    private float[] field2647;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "[F")
    private float[] field2661;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "[F")
    private float[] field2662;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
    private int[] field2636;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "[I")
    private int[] field2644;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[I")
    private int[] field2646;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
    private int[] field2653;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "[I")
    private int[] field2658;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "[I")
    private int[] field2660;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "[I")
    private int[] field2663;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[Z")
    private boolean[] field2652;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[[I")
    private int[][] field2642;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[[I")
    private int[][] field2659;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V", line = 9)
    public final void method1022() {
        this.field2663 = new int[this.field2639];
        this.field2644 = new int[this.field2639];
        this.field2636 = new int[this.field2639];
        if (this.field2657) {
            this.field2661 = new float[this.field2639];
        }
        this.field2658 = new int[this.field2639];
        this.field2662 = new float[this.field2639];
        this.field2643 = new float[this.field2639];
        this.field2647 = new float[this.field2639];
        this.field2660 = new int[this.field2666];
        this.field2646 = new int[this.field2666];
        this.field2653 = new int[this.field2666];
        this.field2659 = new int[this.field2666][];
        this.field2654 = new class120(class58.method383((byte) -63, this.field2639));
        if (this.field2651) {
            this.field2642 = new int[this.field2666][];
            this.field2652 = new boolean[this.field2666];
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class154(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2637 = arg0;
        this.field2648 = arg1;
        this.field2651 = arg2;
        this.field2657 = arg3;
        this.field2656 = arg4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[[Le;FZ)V", line = 38)
    public final void method1023(class150[][][] arg0, float arg1, boolean arg2) {
        if (field2635 == null || field2635.field3417.length < this.field2665 * 4) {
            field2635 = new class194(this.field2665 * 4);
        } else {
            field2635.field3380 = 0;
        }
        if (field2640 == null || field2640.field3417.length < this.field2638 * 4) {
            field2640 = new class194(this.field2638 * 4);
        } else {
            field2640.field3380 = 0;
        }
        if (class247.field4235) {
            for (int var4 = 0; var4 < this.field2641; var4++) {
                class150 var5 = arg0[this.field2653[var4]][this.field2660[var4]][this.field2646[var4]];
                if (var5 != null && var5.field2574) {
                    int[] var6 = this.field2659[var4];
                    class194 var9;
                    if (this.field2651) {
                        int[] var7 = this.field2642[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2640.method1337(-115, var7[var8]);
                            }
                        }
                        var9 = this.field2652[var4] ? field2640 : field2635;
                    } else {
                        var9 = field2635;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1337(-103, var6[0]);
                        var9.method1337(-97, var6[var10]);
                        var9.method1337(-91, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2641; var11++) {
                class150 var12 = arg0[this.field2653[var11]][this.field2660[var11]][this.field2646[var11]];
                if (var12 != null && var12.field2574) {
                    int[] var13 = this.field2659[var11];
                    class194 var16;
                    if (this.field2651) {
                        int[] var14 = this.field2642[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2640.method1333(var14[var15], (byte) -124);
                            }
                        }
                        var16 = this.field2652[var11] ? field2640 : field2635;
                    } else {
                        var16 = field2635;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1333(var13[0], (byte) -82);
                        var16.method1333(var13[var17], (byte) -96);
                        var16.method1333(var13[var17 + 1], (byte) -55);
                    }
                }
            }
        }
        if (field2635.field3380 == 0 && field2640.field3380 == 0) {
            return;
        }
        GL var18 = class247.field4253;
        if (this.field2637 == -1 || arg2) {
            class247.method1691(-1);
            class217.method1498((byte) -29, 0, 0);
        } else {
            class141.field2419.method99(this.field2637, (byte) 114);
        }
        int var19 = this.field2657 ? 40 : 36;
        if (this.field2655 == null) {
            if (class247.field4248) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2645.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2645);
            this.field2645.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2645);
            if (class90.field1536) {
                this.field2645.position(16);
                var18.glNormalPointer(5126, var19, this.field2645);
            }
            this.field2645.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2645);
            if (this.field2657) {
                var18.glClientActiveTexture(class277.method1938());
                this.field2645.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2645);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2655.method1661();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class90.field1536) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2657) {
                var18.glClientActiveTexture(class277.method1938());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class247.field4248) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2635.field3380 != 0) {
            if (field2664 == null || field2664.capacity() < field2635.field3380) {
                field2664 = ByteBuffer.allocateDirect(field2635.field3380).order(ByteOrder.nativeOrder());
            } else {
                field2664.clear();
            }
            field2664.put(field2635.field3417, 0, field2635.field3380);
            field2664.flip();
            class247.method1718(arg1);
            var18.glDrawElements(4, field2635.field3380 / 4, 5125, field2664);
        }
        if (field2640.field3380 == 0) {
            return;
        }
        if (field2650 == null || field2650.capacity() < field2640.field3380) {
            field2650 = ByteBuffer.allocateDirect(field2640.field3380).order(ByteOrder.nativeOrder());
        } else {
            field2650.clear();
        }
        field2650.put(field2640.field3417, 0, field2640.field3380);
        field2650.flip();
        class247.method1718(arg1 - 100.0F);
        class247.method1688();
        var18.glDrawElements(4, field2640.field3380 / 4, 5125, field2650);
        class247.method1692();
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V", line = 244)
    public static void method1024() {
        field2635 = null;
        field2640 = null;
        field2664 = null;
        field2650 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[I[IZ)I", line = 250)
    public final int method1025(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2651) {
            this.field2642[this.field2641] = arg4;
            this.field2652[this.field2641] = arg5;
            if (arg4 != null) {
                this.field2638 += arg4.length;
            }
            if (arg5) {
                this.field2638 += (arg3.length - 2) * 3;
            } else {
                this.field2665 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2665 += (arg3.length - 2) * 3;
        }
        this.field2653[this.field2641] = arg0;
        this.field2660[this.field2641] = arg1;
        this.field2646[this.field2641] = arg2;
        this.field2659[this.field2641] = arg3;
        return this.field2641++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIFFFIF)I", line = 296)
    public final int method1026(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class155 var11 = (class155) this.field2654.method728(false, var9);
            if (var11 != null) {
                if (arg1 < this.field2644[var11.field2672]) {
                    this.field2644[var11.field2672] = arg1;
                }
                return var11.field2672;
            }
        }
        this.field2663[this.field2649] = arg0;
        this.field2644[this.field2649] = arg1;
        this.field2636[this.field2649] = arg2;
        if (this.field2657) {
            this.field2661[this.field2649] = arg7;
        }
        this.field2662[this.field2649] = arg3;
        this.field2643[this.field2649] = arg4;
        this.field2647[this.field2649] = arg5;
        this.field2658[this.field2649] = arg6;
        if (var9 != 0L) {
            this.field2654.method730(new class155(this.field2649), var9, (byte) 1);
        }
        return this.field2649++;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V", line = 331)
    public static final void method1027() {
        field2635 = null;
        field2640 = null;
        field2664 = null;
        field2650 = null;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()V", line = 339)
    public final void method1028() {
        class194 var1 = new class194((this.field2657 ? 40 : 36) * this.field2649);
        for (int var2 = 0; var2 < this.field2649; var2++) {
            if (class247.field4235) {
                var1.method1328(24180, (float) this.field2663[var2]);
                var1.method1328(24180, (float) this.field2644[var2]);
                var1.method1328(24180, (float) this.field2636[var2]);
                var1.method1337(-88, this.field2658[var2]);
                var1.method1328(24180, this.field2662[var2]);
                var1.method1328(24180, this.field2643[var2]);
                var1.method1328(24180, this.field2647[var2]);
                var1.method1328(24180, (float) this.field2663[var2] / this.field2648);
                var1.method1328(24180, (float) this.field2636[var2] / this.field2648);
                if (this.field2657) {
                    var1.method1328(24180, this.field2661[var2]);
                }
            } else {
                var1.method1302((float) this.field2663[var2], -550459832);
                var1.method1302((float) this.field2644[var2], -550459832);
                var1.method1302((float) this.field2636[var2], -550459832);
                var1.method1337(-66, this.field2658[var2]);
                var1.method1302(this.field2662[var2], -550459832);
                var1.method1302(this.field2643[var2], -550459832);
                var1.method1302(this.field2647[var2], -550459832);
                var1.method1302((float) this.field2663[var2] / this.field2648, -550459832);
                var1.method1302((float) this.field2636[var2] / this.field2648, -550459832);
                if (this.field2657) {
                    var1.method1302(this.field2661[var2], -550459832);
                }
            }
        }
        if (class247.field4248) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3417, 0, var1.field3380);
            this.field2655 = new class244();
            this.field2655.method1662(var3);
        } else {
            this.field2645 = ByteBuffer.allocateDirect(var1.field3380).order(ByteOrder.nativeOrder());
            this.field2645.put(var1.field3417, 0, var1.field3380);
            this.field2645.flip();
        }
        this.field2663 = null;
        this.field2644 = null;
        this.field2636 = null;
        this.field2658 = null;
        this.field2662 = null;
        this.field2643 = null;
        this.field2647 = null;
        this.field2654 = null;
        this.field2661 = null;
    }
}
