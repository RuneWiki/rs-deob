import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class172 extends class147 {

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field2677 = 0;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    private int field2694 = 0;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field2678 = 0;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public int field2679 = 0;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    private int field2701 = 0;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public int field2686;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "F")
    private float field2708;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "Z")
    public boolean field2699;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Z")
    private boolean field2682;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Lsc;")
    private class259 field2688;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lvi;")
    private class6 field2698;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Lwa;")
    private static class82 field2697;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "Lwa;")
    private static class82 field2707;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2680;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2696;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2703;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "[F")
    private float[] field2681;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "[F")
    private float[] field2689;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "[F")
    private float[] field2700;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "[F")
    private float[] field2704;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
    private int[] field2683;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "[I")
    private int[] field2684;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[I")
    private int[] field2685;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[I")
    private int[] field2687;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "[I")
    private int[] field2693;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "[I")
    private int[] field2702;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "[I")
    private int[] field2706;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "[Z")
    private boolean[] field2705;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "[[I")
    private int[][] field2692;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "[[I")
    private int[][] field2695;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 15)
    public static final void method1178() {
        field2707 = null;
        field2697 = null;
        field2703 = null;
        field2696 = null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 23)
    public final void method1179() {
        this.field2706 = new int[this.field2677];
        this.field2693 = new int[this.field2677];
        this.field2687 = new int[this.field2677];
        if (this.field2682) {
            this.field2681 = new float[this.field2677];
        }
        this.field2683 = new int[this.field2677];
        this.field2704 = new float[this.field2677];
        this.field2700 = new float[this.field2677];
        this.field2689 = new float[this.field2677];
        this.field2685 = new int[this.field2679];
        this.field2684 = new int[this.field2679];
        this.field2702 = new int[this.field2679];
        this.field2692 = new int[this.field2679][];
        this.field2688 = new class259(class313.method2175((byte) 123, this.field2677));
        if (this.field2699) {
            this.field2695 = new int[this.field2679][];
            this.field2705 = new boolean[this.field2679];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIFFFIF)I", line = 49)
    public final int method1180(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class188 var11 = (class188) this.field2688.method1827(var9, 0);
            if (var11 != null) {
                if (arg1 < this.field2693[var11.field2961]) {
                    this.field2693[var11.field2961] = arg1;
                }
                return var11.field2961;
            }
        }
        this.field2706[this.field2678] = arg0;
        this.field2693[this.field2678] = arg1;
        this.field2687[this.field2678] = arg2;
        if (this.field2682) {
            this.field2681[this.field2678] = arg7;
        }
        this.field2704[this.field2678] = arg3;
        this.field2700[this.field2678] = arg4;
        this.field2689[this.field2678] = arg5;
        this.field2683[this.field2678] = arg6;
        if (var9 != 0L) {
            this.field2688.method1826(1, new class188(this.field2678), var9);
        }
        return this.field2678++;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V", line = 81)
    public static void method1181() {
        field2707 = null;
        field2697 = null;
        field2703 = null;
        field2696 = null;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()V", line = 91)
    public final void method1182() {
        class82 var1 = new class82((this.field2682 ? 40 : 36) * this.field2678);
        for (int var2 = 0; var2 < this.field2678; var2++) {
            if (class255.field4167) {
                var1.method640(881, (float) this.field2706[var2]);
                var1.method640(881, (float) this.field2693[var2]);
                var1.method640(881, (float) this.field2687[var2]);
                var1.method577(-123, this.field2683[var2]);
                var1.method640(881, this.field2704[var2]);
                var1.method640(881, this.field2700[var2]);
                var1.method640(881, this.field2689[var2]);
                var1.method640(881, (float) this.field2706[var2] / this.field2708);
                var1.method640(881, (float) this.field2687[var2] / this.field2708);
                if (this.field2682) {
                    var1.method640(881, this.field2681[var2]);
                }
            } else {
                var1.method601((float) this.field2706[var2], (byte) 94);
                var1.method601((float) this.field2693[var2], (byte) 121);
                var1.method601((float) this.field2687[var2], (byte) 101);
                var1.method577(-124, this.field2683[var2]);
                var1.method601(this.field2704[var2], (byte) 121);
                var1.method601(this.field2700[var2], (byte) 117);
                var1.method601(this.field2689[var2], (byte) 77);
                var1.method601((float) this.field2706[var2] / this.field2708, (byte) 97);
                var1.method601((float) this.field2687[var2] / this.field2708, (byte) 101);
                if (this.field2682) {
                    var1.method601(this.field2681[var2], (byte) 126);
                }
            }
        }
        if (class255.field4190) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1280, 0, var1.field1301);
            this.field2698 = new class6();
            this.field2698.method42(var3);
        } else {
            this.field2680 = ByteBuffer.allocateDirect(var1.field1301).order(ByteOrder.nativeOrder());
            this.field2680.put(var1.field1280, 0, var1.field1301);
            this.field2680.flip();
        }
        this.field2706 = null;
        this.field2693 = null;
        this.field2687 = null;
        this.field2683 = null;
        this.field2704 = null;
        this.field2700 = null;
        this.field2689 = null;
        this.field2688 = null;
        this.field2681 = null;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class172(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field2686 = arg0;
        this.field2708 = arg1;
        this.field2699 = arg2;
        this.field2682 = arg3;
        this.field2690 = arg4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([[[Lbj;FZ)V", line = 168)
    public final void method1183(class55[][][] arg0, float arg1, boolean arg2) {
        if (field2707 == null || field2707.field1280.length < this.field2694 * 4) {
            field2707 = new class82(this.field2694 * 4);
        } else {
            field2707.field1301 = 0;
        }
        if (field2697 == null || field2697.field1280.length < this.field2691 * 4) {
            field2697 = new class82(this.field2691 * 4);
        } else {
            field2697.field1301 = 0;
        }
        if (class255.field4167) {
            for (int var4 = 0; var4 < this.field2701; var4++) {
                class55 var5 = arg0[this.field2702[var4]][this.field2685[var4]][this.field2684[var4]];
                if (var5 != null && var5.field878) {
                    int[] var6 = this.field2692[var4];
                    class82 var9;
                    if (this.field2699) {
                        int[] var7 = this.field2695[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field2697.method577(-124, var7[var8]);
                            }
                        }
                        var9 = this.field2705[var4] ? field2697 : field2707;
                    } else {
                        var9 = field2707;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method577(-128, var6[0]);
                        var9.method577(-123, var6[var10]);
                        var9.method577(-123, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field2701; var11++) {
                class55 var12 = arg0[this.field2702[var11]][this.field2685[var11]][this.field2684[var11]];
                if (var12 != null && var12.field878) {
                    int[] var13 = this.field2692[var11];
                    class82 var16;
                    if (this.field2699) {
                        int[] var14 = this.field2695[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2697.method596(var14[var15], 79);
                            }
                        }
                        var16 = this.field2705[var11] ? field2697 : field2707;
                    } else {
                        var16 = field2707;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method596(var13[0], 84);
                        var16.method596(var13[var17], 103);
                        var16.method596(var13[var17 + 1], 82);
                    }
                }
            }
        }
        if (field2707.field1301 == 0 && field2697.field1301 == 0) {
            return;
        }
        GL var18 = class255.field4181;
        if (this.field2686 == -1 || arg2) {
            class255.method1790(-1);
            class281.method1973(0, 0, 0);
        } else {
            class200.field3102.method86(this.field2686, true);
        }
        int var19 = this.field2682 ? 40 : 36;
        if (this.field2698 == null) {
            if (class255.field4190) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field2680.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field2680);
            this.field2680.position(12);
            var18.glColorPointer(4, 5121, var19, this.field2680);
            if (class25.field360) {
                this.field2680.position(16);
                var18.glNormalPointer(5126, var19, this.field2680);
            }
            this.field2680.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field2680);
            if (this.field2682) {
                var18.glClientActiveTexture(class288.method2026());
                this.field2680.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field2680);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field2698.method39();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class25.field360) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field2682) {
                var18.glClientActiveTexture(class288.method2026());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class255.field4190) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field2707.field1301 != 0) {
            if (field2703 == null || field2703.capacity() < field2707.field1301) {
                field2703 = ByteBuffer.allocateDirect(field2707.field1301).order(ByteOrder.nativeOrder());
            } else {
                field2703.clear();
            }
            field2703.put(field2707.field1280, 0, field2707.field1301);
            field2703.flip();
            class255.method1772(arg1);
            var18.glDrawElements(4, field2707.field1301 / 4, 5125, field2703);
        }
        if (field2697.field1301 == 0) {
            return;
        }
        if (field2696 == null || field2696.capacity() < field2697.field1301) {
            field2696 = ByteBuffer.allocateDirect(field2697.field1301).order(ByteOrder.nativeOrder());
        } else {
            field2696.clear();
        }
        field2696.put(field2697.field1280, 0, field2697.field1301);
        field2696.flip();
        class255.method1772(arg1 - 100.0F);
        class255.method1791();
        var18.glDrawElements(4, field2697.field1301 / 4, 5125, field2696);
        class255.method1770();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[I[IZ)I", line = 384)
    public final int method1184(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field2699) {
            this.field2695[this.field2701] = arg4;
            this.field2705[this.field2701] = arg5;
            if (arg4 != null) {
                this.field2691 += arg4.length;
            }
            if (arg5) {
                this.field2691 += (arg3.length - 2) * 3;
            } else {
                this.field2694 += (arg3.length - 2) * 3;
            }
        } else {
            this.field2694 += (arg3.length - 2) * 3;
        }
        this.field2702[this.field2701] = arg0;
        this.field2685[this.field2701] = arg1;
        this.field2684[this.field2701] = arg2;
        this.field2692[this.field2701] = arg3;
        return this.field2701++;
    }
}
