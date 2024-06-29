import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class245 extends class332 {

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    private int field3694 = 0;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    private int field3698 = 0;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public int field3703 = 0;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    private int field3704 = 0;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public int field3709 = 0;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field3692 = 0;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "F")
    private float field3699;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "Z")
    public boolean field3713;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "Z")
    private boolean field3718;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lp;")
    private static class107 field3691;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Lp;")
    private static class107 field3696;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "Llb;")
    private class224 field3720;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lhl;")
    private class71 field3693;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3701;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3712;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3716;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "[F")
    private float[] field3702;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "[F")
    private float[] field3706;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "[F")
    private float[] field3707;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "[F")
    private float[] field3710;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
    private int[] field3689;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
    private int[] field3690;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "[I")
    private int[] field3697;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    private int[] field3700;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "[I")
    private int[] field3711;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
    private int[] field3717;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "[I")
    private int[] field3719;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "[Z")
    private boolean[] field3708;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "[[I")
    private int[][] field3714;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "[[I")
    private int[][] field3715;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I[IZ)I", line = 8)
    public final int method1761(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3713) {
            this.field3714[this.field3704] = arg4;
            this.field3708[this.field3704] = arg5;
            if (arg4 != null) {
                this.field3698 += arg4.length;
            }
            if (arg5) {
                this.field3698 += (arg3.length - 2) * 3;
            } else {
                this.field3694 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3694 += (arg3.length - 2) * 3;
        }
        this.field3697[this.field3704] = arg0;
        this.field3690[this.field3704] = arg1;
        this.field3700[this.field3704] = arg2;
        this.field3715[this.field3704] = arg3;
        return this.field3704++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 36)
    public final void method1762() {
        class107 var1 = new class107((this.field3718 ? 40 : 36) * this.field3692);
        for (int var2 = 0; var2 < this.field3692; var2++) {
            if (class250.field3825) {
                var1.method673(32166, (float) this.field3711[var2]);
                var1.method673(32166, (float) this.field3717[var2]);
                var1.method673(32166, (float) this.field3689[var2]);
                var1.method641(1773202520, this.field3719[var2]);
                var1.method673(32166, this.field3710[var2]);
                var1.method673(32166, this.field3706[var2]);
                var1.method673(32166, this.field3702[var2]);
                var1.method673(32166, (float) this.field3711[var2] / this.field3699);
                var1.method673(32166, (float) this.field3689[var2] / this.field3699);
                if (this.field3718) {
                    var1.method673(32166, this.field3707[var2]);
                }
            } else {
                var1.method682(-101, (float) this.field3711[var2]);
                var1.method682(107, (float) this.field3717[var2]);
                var1.method682(59, (float) this.field3689[var2]);
                var1.method641(1773202520, this.field3719[var2]);
                var1.method682(114, this.field3710[var2]);
                var1.method682(-126, this.field3706[var2]);
                var1.method682(-124, this.field3702[var2]);
                var1.method682(127, (float) this.field3711[var2] / this.field3699);
                var1.method682(48, (float) this.field3689[var2] / this.field3699);
                if (this.field3718) {
                    var1.method682(78, this.field3707[var2]);
                }
            }
        }
        if (class250.field3809) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1388, 0, var1.field1400);
            this.field3693 = new class71();
            this.field3693.method432(var3);
        } else {
            this.field3716 = ByteBuffer.allocateDirect(var1.field1400).order(ByteOrder.nativeOrder());
            this.field3716.put(var1.field1388, 0, var1.field1400);
            this.field3716.flip();
        }
        this.field3711 = null;
        this.field3717 = null;
        this.field3689 = null;
        this.field3719 = null;
        this.field3710 = null;
        this.field3706 = null;
        this.field3702 = null;
        this.field3720 = null;
        this.field3707 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([[[Ldk;FZ)V", line = 105)
    public final void method1763(class225[][][] arg0, float arg1, boolean arg2) {
        if (field3691 == null || field3691.field1388.length < this.field3694 * 4) {
            field3691 = new class107(this.field3694 * 4);
        } else {
            field3691.field1400 = 0;
        }
        if (field3696 == null || field3696.field1388.length < this.field3698 * 4) {
            field3696 = new class107(this.field3698 * 4);
        } else {
            field3696.field1400 = 0;
        }
        if (class250.field3825) {
            for (int var4 = 0; var4 < this.field3704; var4++) {
                class225 var5 = arg0[this.field3697[var4]][this.field3690[var4]][this.field3700[var4]];
                if (var5 != null && var5.field3215) {
                    int[] var6 = this.field3715[var4];
                    class107 var9;
                    if (this.field3713) {
                        int[] var7 = this.field3714[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3696.method641(1773202520, var7[var8]);
                            }
                        }
                        var9 = this.field3708[var4] ? field3696 : field3691;
                    } else {
                        var9 = field3691;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method641(1773202520, var6[0]);
                        var9.method641(1773202520, var6[var10]);
                        var9.method641(1773202520, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3704; var11++) {
                class225 var12 = arg0[this.field3697[var11]][this.field3690[var11]][this.field3700[var11]];
                if (var12 != null && var12.field3215) {
                    int[] var13 = this.field3715[var11];
                    class107 var16;
                    if (this.field3713) {
                        int[] var14 = this.field3714[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3696.method635(-16082, var14[var15]);
                            }
                        }
                        var16 = this.field3708[var11] ? field3696 : field3691;
                    } else {
                        var16 = field3691;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method635(-16082, var13[0]);
                        var16.method635(-16082, var13[var17]);
                        var16.method635(-16082, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3691.field1400 == 0 && field3696.field1400 == 0) {
            return;
        }
        GL var18 = class250.field3818;
        if (this.field3705 == -1 || arg2) {
            class250.method1806(-1);
            class262.method1886(0, 3, 0);
        } else {
            class215.field3020.method389(-68, this.field3705);
        }
        int var19 = this.field3718 ? 40 : 36;
        if (this.field3693 == null) {
            if (class250.field3809) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3716.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3716);
            this.field3716.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3716);
            if (class162.field2241) {
                this.field3716.position(16);
                var18.glNormalPointer(5126, var19, this.field3716);
            }
            this.field3716.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3716);
            if (this.field3718) {
                var18.glClientActiveTexture(class95.method576());
                this.field3716.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3716);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3693.method436();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class162.field2241) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3718) {
                var18.glClientActiveTexture(class95.method576());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class250.field3809) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3691.field1400 != 0) {
            if (field3701 == null || field3701.capacity() < field3691.field1400) {
                field3701 = ByteBuffer.allocateDirect(field3691.field1400).order(ByteOrder.nativeOrder());
            } else {
                field3701.clear();
            }
            field3701.put(field3691.field1388, 0, field3691.field1400);
            field3701.flip();
            class250.method1814(arg1);
            var18.glDrawElements(4, field3691.field1400 / 4, 5125, field3701);
        }
        if (field3696.field1400 == 0) {
            return;
        }
        if (field3712 == null || field3712.capacity() < field3696.field1400) {
            field3712 = ByteBuffer.allocateDirect(field3696.field1400).order(ByteOrder.nativeOrder());
        } else {
            field3712.clear();
        }
        field3712.put(field3696.field1388, 0, field3696.field1400);
        field3712.flip();
        class250.method1814(arg1 - 100.0F);
        class250.method1827();
        var18.glDrawElements(4, field3696.field1400 / 4, 5125, field3712);
        class250.method1791();
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class245(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3705 = arg0;
        this.field3699 = arg1;
        this.field3713 = arg2;
        this.field3718 = arg3;
        this.field3695 = arg4;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 326)
    public static final void method1764() {
        field3691 = null;
        field3696 = null;
        field3701 = null;
        field3712 = null;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V", line = 341)
    public static void method1765() {
        field3691 = null;
        field3696 = null;
        field3701 = null;
        field3712 = null;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V", line = 352)
    public final void method1766() {
        this.field3711 = new int[this.field3703];
        this.field3717 = new int[this.field3703];
        this.field3689 = new int[this.field3703];
        if (this.field3718) {
            this.field3707 = new float[this.field3703];
        }
        this.field3719 = new int[this.field3703];
        this.field3710 = new float[this.field3703];
        this.field3706 = new float[this.field3703];
        this.field3702 = new float[this.field3703];
        this.field3690 = new int[this.field3709];
        this.field3700 = new int[this.field3709];
        this.field3697 = new int[this.field3709];
        this.field3715 = new int[this.field3709][];
        this.field3720 = new class224(class258.method1873(this.field3703, 832520144));
        if (this.field3713) {
            this.field3714 = new int[this.field3709][];
            this.field3708 = new boolean[this.field3709];
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIFFFIF)I", line = 381)
    public final int method1767(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class172 var11 = (class172) this.field3720.method1537(var9, -22708);
            if (var11 != null) {
                if (arg1 < this.field3717[var11.field2483]) {
                    this.field3717[var11.field2483] = arg1;
                }
                return var11.field2483;
            }
        }
        this.field3711[this.field3692] = arg0;
        this.field3717[this.field3692] = arg1;
        this.field3689[this.field3692] = arg2;
        if (this.field3718) {
            this.field3707[this.field3692] = arg7;
        }
        this.field3710[this.field3692] = arg3;
        this.field3706[this.field3692] = arg4;
        this.field3702[this.field3692] = arg5;
        this.field3719[this.field3692] = arg6;
        if (var9 != 0L) {
            this.field3720.method1541(false, new class172(this.field3692), var9);
        }
        return this.field3692++;
    }
}
