import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class256 extends class60 {

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    private int field3790 = 0;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    private int field3789 = 0;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public int field3796 = 0;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field3781 = 0;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public int field3801 = 0;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    private int field3802 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "F")
    private float field3794;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Z")
    public boolean field3785;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Z")
    private boolean field3780;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Laj;")
    private static class1 field3773;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Laj;")
    private static class1 field3791;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Ll;")
    private class312 field3795;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Lpd;")
    private class3 field3800;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3774;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3797;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3804;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[F")
    private float[] field3776;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "[F")
    private float[] field3777;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[F")
    private float[] field3784;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "[F")
    private float[] field3798;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "[I")
    private int[] field3775;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[I")
    private int[] field3778;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[I")
    private int[] field3782;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[I")
    private int[] field3787;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "[I")
    private int[] field3793;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[I")
    private int[] field3799;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
    private int[] field3803;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[Z")
    private boolean[] field3779;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[[I")
    private int[][] field3783;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "[[I")
    private int[][] field3788;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V", line = 13)
    public static void method1768() {
        field3791 = null;
        field3773 = null;
        field3804 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([[[Lsg;FZ)V", line = 22)
    public final void method1769(class42[][][] arg0, float arg1, boolean arg2) {
        if (field3791 == null || field3791.field34.length < this.field3790 * 4) {
            field3791 = new class1(this.field3790 * 4);
        } else {
            field3791.field48 = 0;
        }
        if (field3773 == null || field3773.field34.length < this.field3789 * 4) {
            field3773 = new class1(this.field3789 * 4);
        } else {
            field3773.field48 = 0;
        }
        if (class162.field2624) {
            for (int var4 = 0; var4 < this.field3802; var4++) {
                class42 var5 = arg0[this.field3793[var4]][this.field3775[var4]][this.field3803[var4]];
                if (var5 != null && var5.field653) {
                    int[] var6 = this.field3788[var4];
                    class1 var9;
                    if (this.field3785) {
                        int[] var7 = this.field3783[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3773.method11(var7[var8], 31932);
                            }
                        }
                        var9 = this.field3779[var4] ? field3773 : field3791;
                    } else {
                        var9 = field3791;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method11(var6[0], 31932);
                        var9.method11(var6[var10], 31932);
                        var9.method11(var6[var10 + 1], 31932);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3802; var11++) {
                class42 var12 = arg0[this.field3793[var11]][this.field3775[var11]][this.field3803[var11]];
                if (var12 != null && var12.field653) {
                    int[] var13 = this.field3788[var11];
                    class1 var16;
                    if (this.field3785) {
                        int[] var14 = this.field3783[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3773.method13(true, var14[var15]);
                            }
                        }
                        var16 = this.field3779[var11] ? field3773 : field3791;
                    } else {
                        var16 = field3791;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method13(true, var13[0]);
                        var16.method13(true, var13[var17]);
                        var16.method13(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3791.field48 == 0 && field3773.field48 == 0) {
            return;
        }
        GL var18 = class162.field2654;
        if (this.field3792 == -1 || arg2) {
            class162.method1219(-1);
            class102.method830(0, 14804, 0);
        } else {
            class40.field614.method259(this.field3792, 255);
        }
        int var19 = this.field3780 ? 40 : 36;
        if (this.field3795 == null) {
            if (class162.field2639) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3774.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3774);
            this.field3774.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3774);
            if (class229.field3531) {
                this.field3774.position(16);
                var18.glNormalPointer(5126, var19, this.field3774);
            }
            this.field3774.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3774);
            if (this.field3780) {
                var18.glClientActiveTexture(class300.method2122());
                this.field3774.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3774);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3795.method2199();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class229.field3531) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3780) {
                var18.glClientActiveTexture(class300.method2122());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class162.field2639) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3791.field48 != 0) {
            if (field3804 == null || field3804.capacity() < field3791.field48) {
                field3804 = ByteBuffer.allocateDirect(field3791.field48).order(ByteOrder.nativeOrder());
            } else {
                field3804.clear();
            }
            field3804.put(field3791.field34, 0, field3791.field48);
            field3804.flip();
            class162.method1190(arg1);
            var18.glDrawElements(4, field3791.field48 / 4, 5125, field3804);
        }
        if (field3773.field48 == 0) {
            return;
        }
        if (field3797 == null || field3797.capacity() < field3773.field48) {
            field3797 = ByteBuffer.allocateDirect(field3773.field48).order(ByteOrder.nativeOrder());
        } else {
            field3797.clear();
        }
        field3797.put(field3773.field34, 0, field3773.field48);
        field3797.flip();
        class162.method1190(arg1 - 100.0F);
        class162.method1196();
        var18.glDrawElements(4, field3773.field48 / 4, 5125, field3797);
        class162.method1203();
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V", line = 229)
    public static final void method1770() {
        field3791 = null;
        field3773 = null;
        field3804 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IFZZI)V", line = 350)
    public class256(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3792 = arg0;
        this.field3794 = arg1;
        this.field3785 = arg2;
        this.field3780 = arg3;
        this.field3786 = arg4;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()V", line = 250)
    public final void method1771() {
        this.field3787 = new int[this.field3781];
        this.field3782 = new int[this.field3781];
        this.field3778 = new int[this.field3781];
        if (this.field3780) {
            this.field3798 = new float[this.field3781];
        }
        this.field3799 = new int[this.field3781];
        this.field3777 = new float[this.field3781];
        this.field3776 = new float[this.field3781];
        this.field3784 = new float[this.field3781];
        this.field3775 = new int[this.field3801];
        this.field3803 = new int[this.field3801];
        this.field3793 = new int[this.field3801];
        this.field3788 = new int[this.field3801][];
        this.field3800 = new class3(class319.method2255(1, this.field3781));
        if (this.field3785) {
            this.field3783 = new int[this.field3801][];
            this.field3779 = new boolean[this.field3801];
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III[I[IZ)I", line = 273)
    public final int method1772(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3785) {
            this.field3783[this.field3802] = arg4;
            this.field3779[this.field3802] = arg5;
            if (arg4 != null) {
                this.field3789 += arg4.length;
            }
            if (arg5) {
                this.field3789 += (arg3.length - 2) * 3;
            } else {
                this.field3790 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3790 += (arg3.length - 2) * 3;
        }
        this.field3793[this.field3802] = arg0;
        this.field3775[this.field3802] = arg1;
        this.field3803[this.field3802] = arg2;
        this.field3788[this.field3802] = arg3;
        return this.field3802++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIFFFIF)I", line = 312)
    public final int method1773(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class304 var11 = (class304) this.field3800.method79(var9, (byte) 0);
            if (var11 != null) {
                if (arg1 < this.field3782[var11.field4844]) {
                    this.field3782[var11.field4844] = arg1;
                }
                return var11.field4844;
            }
        }
        this.field3787[this.field3796] = arg0;
        this.field3782[this.field3796] = arg1;
        this.field3778[this.field3796] = arg2;
        if (this.field3780) {
            this.field3798[this.field3796] = arg7;
        }
        this.field3777[this.field3796] = arg3;
        this.field3776[this.field3796] = arg4;
        this.field3784[this.field3796] = arg5;
        this.field3799[this.field3796] = arg6;
        if (var9 != 0L) {
            this.field3800.method75(new class304(this.field3796), -1, var9);
        }
        return this.field3796++;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V", line = 360)
    public final void method1774() {
        class1 var1 = new class1((this.field3780 ? 40 : 36) * this.field3796);
        for (int var2 = 0; var2 < this.field3796; var2++) {
            if (class162.field2624) {
                var1.method64((float) this.field3787[var2], (byte) 41);
                var1.method64((float) this.field3782[var2], (byte) 41);
                var1.method64((float) this.field3778[var2], (byte) 41);
                var1.method11(this.field3799[var2], 31932);
                var1.method64(this.field3777[var2], (byte) 41);
                var1.method64(this.field3776[var2], (byte) 41);
                var1.method64(this.field3784[var2], (byte) 41);
                var1.method64((float) this.field3787[var2] / this.field3794, (byte) 41);
                var1.method64((float) this.field3778[var2] / this.field3794, (byte) 41);
                if (this.field3780) {
                    var1.method64(this.field3798[var2], (byte) 41);
                }
            } else {
                var1.method5(15852, (float) this.field3787[var2]);
                var1.method5(15852, (float) this.field3782[var2]);
                var1.method5(15852, (float) this.field3778[var2]);
                var1.method11(this.field3799[var2], 31932);
                var1.method5(15852, this.field3777[var2]);
                var1.method5(15852, this.field3776[var2]);
                var1.method5(15852, this.field3784[var2]);
                var1.method5(15852, (float) this.field3787[var2] / this.field3794);
                var1.method5(15852, (float) this.field3778[var2] / this.field3794);
                if (this.field3780) {
                    var1.method5(15852, this.field3798[var2]);
                }
            }
        }
        if (class162.field2639) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field34, 0, var1.field48);
            this.field3795 = new class312();
            this.field3795.method2202(var3);
        } else {
            this.field3774 = ByteBuffer.allocateDirect(var1.field48).order(ByteOrder.nativeOrder());
            this.field3774.put(var1.field34, 0, var1.field48);
            this.field3774.flip();
        }
        this.field3787 = null;
        this.field3782 = null;
        this.field3778 = null;
        this.field3799 = null;
        this.field3777 = null;
        this.field3776 = null;
        this.field3784 = null;
        this.field3800 = null;
        this.field3798 = null;
    }
}
