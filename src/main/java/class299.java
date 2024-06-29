import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class299 extends class45 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private int field4792 = 0;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public int field4793 = 0;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    private int field4807 = 0;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    private int field4806 = 0;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field4815 = 0;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public int field4804 = 0;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "F")
    private float field4809;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
    public boolean field4797;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "Z")
    private boolean field4820;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lvl;")
    private class164 field4802;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lqm;")
    private static class227 field4808;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lqm;")
    private static class227 field4819;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lbk;")
    private class53 field4813;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4812;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4814;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4822;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[F")
    private float[] field4795;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[F")
    private float[] field4799;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[F")
    private float[] field4801;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[F")
    private float[] field4805;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[I")
    private int[] field4796;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    private int[] field4798;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[I")
    private int[] field4800;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
    private int[] field4803;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "[I")
    private int[] field4811;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[I")
    private int[] field4816;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
    private int[] field4818;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[Z")
    private boolean[] field4794;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[[I")
    private int[][] field4817;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[[I")
    private int[][] field4821;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 6)
    public final void method2137() {
        this.field4800 = new int[this.field4804];
        this.field4811 = new int[this.field4804];
        this.field4816 = new int[this.field4804];
        if (this.field4820) {
            this.field4805 = new float[this.field4804];
        }
        this.field4798 = new int[this.field4804];
        this.field4799 = new float[this.field4804];
        this.field4795 = new float[this.field4804];
        this.field4801 = new float[this.field4804];
        this.field4818 = new int[this.field4815];
        this.field4796 = new int[this.field4815];
        this.field4803 = new int[this.field4815];
        this.field4821 = new int[this.field4815][];
        this.field4802 = new class164(class206.method1575(this.field4804, (byte) 99));
        if (this.field4797) {
            this.field4817 = new int[this.field4815][];
            this.field4794 = new boolean[this.field4815];
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 31)
    public final void method2138() {
        class227 var1 = new class227((this.field4820 ? 40 : 36) * this.field4793);
        for (int var2 = 0; var2 < this.field4793; var2++) {
            if (class42.field625) {
                var1.method1713(false, (float) this.field4800[var2]);
                var1.method1713(false, (float) this.field4811[var2]);
                var1.method1713(false, (float) this.field4816[var2]);
                var1.method1757(this.field4798[var2], -127);
                var1.method1713(false, this.field4799[var2]);
                var1.method1713(false, this.field4795[var2]);
                var1.method1713(false, this.field4801[var2]);
                var1.method1713(false, (float) this.field4800[var2] / this.field4809);
                var1.method1713(false, (float) this.field4816[var2] / this.field4809);
                if (this.field4820) {
                    var1.method1713(false, this.field4805[var2]);
                }
            } else {
                var1.method1738((float) this.field4800[var2], (byte) -39);
                var1.method1738((float) this.field4811[var2], (byte) -39);
                var1.method1738((float) this.field4816[var2], (byte) -39);
                var1.method1757(this.field4798[var2], -120);
                var1.method1738(this.field4799[var2], (byte) -39);
                var1.method1738(this.field4795[var2], (byte) -39);
                var1.method1738(this.field4801[var2], (byte) -39);
                var1.method1738((float) this.field4800[var2] / this.field4809, (byte) -39);
                var1.method1738((float) this.field4816[var2] / this.field4809, (byte) -39);
                if (this.field4820) {
                    var1.method1738(this.field4805[var2], (byte) -39);
                }
            }
        }
        if (class42.field645) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3793, 0, var1.field3760);
            this.field4813 = new class53();
            this.field4813.method421(var3);
        } else {
            this.field4822 = ByteBuffer.allocateDirect(var1.field3760).order(ByteOrder.nativeOrder());
            this.field4822.put(var1.field3793, 0, var1.field3760);
            this.field4822.flip();
        }
        this.field4800 = null;
        this.field4811 = null;
        this.field4816 = null;
        this.field4798 = null;
        this.field4799 = null;
        this.field4795 = null;
        this.field4801 = null;
        this.field4802 = null;
        this.field4805 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class299(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field4810 = arg0;
        this.field4809 = arg1;
        this.field4797 = arg2;
        this.field4820 = arg3;
        this.field4823 = arg4;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V", line = 111)
    public static final void method2139() {
        field4808 = null;
        field4819 = null;
        field4814 = null;
        field4812 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIFFFIF)I", line = 121)
    public final int method2140(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class301 var11 = (class301) this.field4802.method1268(124, var9);
            if (var11 != null) {
                if (arg1 < this.field4811[var11.field4846]) {
                    this.field4811[var11.field4846] = arg1;
                }
                return var11.field4846;
            }
        }
        this.field4800[this.field4793] = arg0;
        this.field4811[this.field4793] = arg1;
        this.field4816[this.field4793] = arg2;
        if (this.field4820) {
            this.field4805[this.field4793] = arg7;
        }
        this.field4799[this.field4793] = arg3;
        this.field4795[this.field4793] = arg4;
        this.field4801[this.field4793] = arg5;
        this.field4798[this.field4793] = arg6;
        if (var9 != 0L) {
            this.field4802.method1273(1, var9, new class301(this.field4793));
        }
        return this.field4793++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[[Laa;FZ)V", line = 156)
    public final void method2141(class36[][][] arg0, float arg1, boolean arg2) {
        if (field4808 == null || field4808.field3793.length < this.field4807 * 4) {
            field4808 = new class227(this.field4807 * 4);
        } else {
            field4808.field3760 = 0;
        }
        if (field4819 == null || field4819.field3793.length < this.field4806 * 4) {
            field4819 = new class227(this.field4806 * 4);
        } else {
            field4819.field3760 = 0;
        }
        if (class42.field625) {
            for (int var4 = 0; var4 < this.field4792; var4++) {
                class36 var5 = arg0[this.field4803[var4]][this.field4818[var4]][this.field4796[var4]];
                if (var5 != null && var5.field543) {
                    int[] var6 = this.field4821[var4];
                    class227 var9;
                    if (this.field4797) {
                        int[] var7 = this.field4817[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field4819.method1757(var7[var8], -113);
                            }
                        }
                        var9 = this.field4794[var4] ? field4819 : field4808;
                    } else {
                        var9 = field4808;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1757(var6[0], -111);
                        var9.method1757(var6[var10], -110);
                        var9.method1757(var6[var10 + 1], -109);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field4792; var11++) {
                class36 var12 = arg0[this.field4803[var11]][this.field4818[var11]][this.field4796[var11]];
                if (var12 != null && var12.field543) {
                    int[] var13 = this.field4821[var11];
                    class227 var16;
                    if (this.field4797) {
                        int[] var14 = this.field4817[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4819.method1754(false, var14[var15]);
                            }
                        }
                        var16 = this.field4794[var11] ? field4819 : field4808;
                    } else {
                        var16 = field4808;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1754(false, var13[0]);
                        var16.method1754(false, var13[var17]);
                        var16.method1754(false, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field4808.field3760 == 0 && field4819.field3760 == 0) {
            return;
        }
        GL var18 = class42.field627;
        if (this.field4810 == -1 || arg2) {
            class42.method273(-1);
            class310.method2203(0, 0, -124);
        } else {
            class153.field2439.method762(-106, this.field4810);
        }
        int var19 = this.field4820 ? 40 : 36;
        if (this.field4813 == null) {
            if (class42.field645) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field4822.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field4822);
            this.field4822.position(12);
            var18.glColorPointer(4, 5121, var19, this.field4822);
            if (class3.field36) {
                this.field4822.position(16);
                var18.glNormalPointer(5126, var19, this.field4822);
            }
            this.field4822.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field4822);
            if (this.field4820) {
                var18.glClientActiveTexture(class269.method2032());
                this.field4822.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field4822);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field4813.method422();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class3.field36) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field4820) {
                var18.glClientActiveTexture(class269.method2032());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class42.field645) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field4808.field3760 != 0) {
            if (field4814 == null || field4814.capacity() < field4808.field3760) {
                field4814 = ByteBuffer.allocateDirect(field4808.field3760).order(ByteOrder.nativeOrder());
            } else {
                field4814.clear();
            }
            field4814.put(field4808.field3793, 0, field4808.field3760);
            field4814.flip();
            class42.method298(arg1);
            var18.glDrawElements(4, field4808.field3760 / 4, 5125, field4814);
        }
        if (field4819.field3760 == 0) {
            return;
        }
        if (field4812 == null || field4812.capacity() < field4819.field3760) {
            field4812 = ByteBuffer.allocateDirect(field4819.field3760).order(ByteOrder.nativeOrder());
        } else {
            field4812.clear();
        }
        field4812.put(field4819.field3793, 0, field4819.field3760);
        field4812.flip();
        class42.method298(arg1 - 100.0F);
        class42.method279();
        var18.glDrawElements(4, field4819.field3760 / 4, 5125, field4812);
        class42.method282();
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V", line = 371)
    public static void method2142() {
        field4808 = null;
        field4819 = null;
        field4814 = null;
        field4812 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[I[IZ)I", line = 394)
    public final int method2143(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field4797) {
            this.field4817[this.field4792] = arg4;
            this.field4794[this.field4792] = arg5;
            if (arg4 != null) {
                this.field4806 += arg4.length;
            }
            if (arg5) {
                this.field4806 += (arg3.length - 2) * 3;
            } else {
                this.field4807 += (arg3.length - 2) * 3;
            }
        } else {
            this.field4807 += (arg3.length - 2) * 3;
        }
        this.field4803[this.field4792] = arg0;
        this.field4818[this.field4792] = arg1;
        this.field4796[this.field4792] = arg2;
        this.field4821[this.field4792] = arg3;
        return this.field4792++;
    }
}
