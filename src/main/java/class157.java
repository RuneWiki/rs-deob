import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class157 extends class154 {

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    private int field2685 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private int field2683 = 0;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    private int field2700 = 0;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public int field2701 = 0;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public int field2702 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public int field2693 = 0;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "F")
    private float field2688;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Z")
    public boolean field2673;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Z")
    private boolean field2692;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lfk;")
    private class144 field2697;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lva;")
    private static class235 field2672;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Lva;")
    private static class235 field2696;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lhk;")
    private class66 field2677;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2686;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2687;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2695;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[F")
    private float[] field2676;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[F")
    private float[] field2678;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "[F")
    private float[] field2689;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "[F")
    private float[] field2699;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
    private int[] field2671;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
    private int[] field2674;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[I")
    private int[] field2681;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[I")
    private int[] field2682;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "[I")
    private int[] field2690;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "[I")
    private int[] field2691;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "[I")
    private int[] field2694;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[Z")
    private boolean[] field2679;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[[I")
    private int[][] field2675;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[[I")
    private int[][] field2680;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIFFFIF)I", line = 11)
    public final int method1067(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class119 var11 = (class119) this.field2697.method986(var9, 0);
            if (var11 != null) {
                if (arg1 < this.field2671[var11.field2107]) {
                    this.field2671[var11.field2107] = arg1;
                }
                return var11.field2107;
            }
        }
        this.field2682[this.field2701] = arg0;
        this.field2671[this.field2701] = arg1;
        this.field2674[this.field2701] = arg2;
        if (this.field2692) {
            this.field2676[this.field2701] = arg7;
        }
        this.field2689[this.field2701] = arg3;
        this.field2699[this.field2701] = arg4;
        this.field2678[this.field2701] = arg5;
        this.field2694[this.field2701] = arg6;
        if (var9 != 0L) {
            this.field2697.method984((byte) -118, new class119(this.field2701), var9);
        }
        return this.field2701++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[I[IZ)I", line = 44)
    public final int method1068(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2673) {
            this.field2675[this.field2700] = arg4;
            this.field2679[this.field2700] = arg5;
            if (arg4 != null) {
                this.field2685 += arg4.length;
            }
            if (arg5) {
                this.field2685 += (arg3.length - 2) * 3;
            } else {
                this.field2683 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2683 += (arg3.length - 2) * 3;
        }
        this.field2681[this.field2700] = arg0;
        this.field2690[this.field2700] = arg1;
        this.field2691[this.field2700] = arg2;
        this.field2680[this.field2700] = arg3;
        return this.field2700++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()V", line = 71)
    public static final void method1069() {
        field2672 = null;
        field2696 = null;
        field2686 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V", line = 81)
    public final void method1070() {
        class235 var1 = new class235((this.field2692 ? 40 : 36) * this.field2701);
        for (int var2 = 0; var2 < this.field2701; var2++) {
            if (class257.field4402) {
                var1.method1579((float) this.field2682[var2], -1890);
                var1.method1579((float) this.field2671[var2], -1890);
                var1.method1579((float) this.field2674[var2], -1890);
                var1.method1577(true, this.field2694[var2]);
                var1.method1579(this.field2689[var2], -1890);
                var1.method1579(this.field2699[var2], -1890);
                var1.method1579(this.field2678[var2], -1890);
                var1.method1579((float) this.field2682[var2] / this.field2688, -1890);
                var1.method1579((float) this.field2674[var2] / this.field2688, -1890);
                if (this.field2692) {
                    var1.method1579(this.field2676[var2], -1890);
                }
            } else {
                var1.method1581((byte) 121, (float) this.field2682[var2]);
                var1.method1581((byte) -96, (float) this.field2671[var2]);
                var1.method1581((byte) 127, (float) this.field2674[var2]);
                var1.method1577(true, this.field2694[var2]);
                var1.method1581((byte) 13, this.field2689[var2]);
                var1.method1581((byte) 126, this.field2699[var2]);
                var1.method1581((byte) 120, this.field2678[var2]);
                var1.method1581((byte) -116, (float) this.field2682[var2] / this.field2688);
                var1.method1581((byte) 121, (float) this.field2674[var2] / this.field2688);
                if (this.field2692) {
                    var1.method1581((byte) 125, this.field2676[var2]);
                }
            }
        }
        if (class257.field4393) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field4066, 0, var1.field4051);
            this.field2677 = new class66();
            this.field2677.method505(var3);
        } else {
            this.field2687 = ByteBuffer.allocateDirect(var1.field4051).order(ByteOrder.nativeOrder());
            this.field2687.put(var1.field4066, 0, var1.field4051);
            this.field2687.flip();
        }
        this.field2682 = null;
        this.field2671 = null;
        this.field2674 = null;
        this.field2694 = null;
        this.field2689 = null;
        this.field2699 = null;
        this.field2678 = null;
        this.field2697 = null;
        this.field2676 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class157(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2684 = arg0;
        this.field2688 = arg1;
        this.field2673 = arg2;
        this.field2692 = arg3;
        this.field2698 = arg4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([[[Llf;FZ)V", line = 156)
    public final void method1071(class228[][][] arg0, float arg1, boolean arg2) {
        if (field2672 == null || field2672.field4066.length < this.field2683 * 4) {
            field2672 = new class235(this.field2683 * 4);
        } else {
            field2672.field4051 = 0;
        }
        if (field2696 == null || field2696.field4066.length < this.field2685 * 4) {
            field2696 = new class235(this.field2685 * 4);
        } else {
            field2696.field4051 = 0;
        }
        if (class257.field4402) {
            for (int var4 = 0; var4 < this.field2700; var4++) {
                class228 var5 = arg0[this.field2681[var4]][this.field2690[var4]][this.field2691[var4]];
                if (var5 != null && var5.field3927) {
                    int[] var6 = this.field2680[var4];
                    class235 var9;
                    if (this.field2673) {
                        int[] var7 = this.field2675[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2696.method1577(true, var7[var8]);
                            }
                        }
                        var9 = this.field2679[var4] ? field2696 : field2672;
                    } else {
                        var9 = field2672;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1577(true, var6[0]);
                        var9.method1577(true, var6[var10]);
                        var9.method1577(true, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2700; var11++) {
                class228 var12 = arg0[this.field2681[var11]][this.field2690[var11]][this.field2691[var11]];
                if (var12 != null && var12.field3927) {
                    int[] var13 = this.field2680[var11];
                    class235 var16;
                    if (this.field2673) {
                        int[] var14 = this.field2675[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2696.method1616(var14[var15], (byte) 46);
                            }
                        }
                        var16 = this.field2679[var11] ? field2696 : field2672;
                    } else {
                        var16 = field2672;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1616(var13[0], (byte) 46);
                        var16.method1616(var13[var17], (byte) 46);
                        var16.method1616(var13[var17 + 1], (byte) 46);
                    }
                }
            }
        }
        if (field2672.field4051 == 0 && field2696.field4051 == 0) {
            return;
        }
        GL var18 = class257.field4409;
        if (this.field2684 == -1 || arg2) {
            class257.method1736(-1);
            class107.method795(0, 58, 0);
        } else {
            class266.field4643.method191(this.field2684, 255);
        }
        int var19 = this.field2692 ? 40 : 36;
        if (this.field2677 == null) {
            if (class257.field4393) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2687.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2687);
            this.field2687.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2687);
            if (class4.field62) {
                this.field2687.position(16);
                var18.glNormalPointer(5126, var19, this.field2687);
            }
            this.field2687.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2687);
            if (this.field2692) {
                var18.glClientActiveTexture(class53.method422());
                this.field2687.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2687);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2677.method506();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class4.field62) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2692) {
                var18.glClientActiveTexture(class53.method422());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class257.field4393) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2672.field4051 != 0) {
            if (field2686 == null || field2686.capacity() < field2672.field4051) {
                field2686 = ByteBuffer.allocateDirect(field2672.field4051).order(ByteOrder.nativeOrder());
            } else {
                field2686.clear();
            }
            field2686.put(field2672.field4066, 0, field2672.field4051);
            field2686.flip();
            class257.method1735(arg1);
            var18.glDrawElements(4, field2672.field4051 / 4, 5125, field2686);
        }
        if (field2696.field4051 == 0) {
            return;
        }
        if (field2695 == null || field2695.capacity() < field2696.field4051) {
            field2695 = ByteBuffer.allocateDirect(field2696.field4051).order(ByteOrder.nativeOrder());
        } else {
            field2695.clear();
        }
        field2695.put(field2696.field4066, 0, field2696.field4051);
        field2695.flip();
        class257.method1735(arg1 - 100.0F);
        class257.method1746();
        var18.glDrawElements(4, field2696.field4051 / 4, 5125, field2695);
        class257.method1754();
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V", line = 372)
    public static void method1072() {
        field2672 = null;
        field2696 = null;
        field2686 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()V", line = 381)
    public final void method1073() {
        this.field2682 = new int[this.field2693];
        this.field2671 = new int[this.field2693];
        this.field2674 = new int[this.field2693];
        if (this.field2692) {
            this.field2676 = new float[this.field2693];
        }
        this.field2694 = new int[this.field2693];
        this.field2689 = new float[this.field2693];
        this.field2699 = new float[this.field2693];
        this.field2678 = new float[this.field2693];
        this.field2690 = new int[this.field2702];
        this.field2691 = new int[this.field2702];
        this.field2681 = new int[this.field2702];
        this.field2680 = new int[this.field2702][];
        this.field2697 = new class144(class286.method2014(this.field2693, 783135696));
        if (this.field2673) {
            this.field2675 = new int[this.field2702][];
            this.field2679 = new boolean[this.field2702];
        }
    }
}
