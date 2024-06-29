import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class247 extends class287 {

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    private int field3880 = 0;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field3870 = 0;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    private int field3899 = 0;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public int field3898 = 0;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field3901 = 0;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public int field3897 = 0;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "F")
    private float field3878;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "Z")
    public boolean field3891;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
    private boolean field3877;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "Lpf;")
    private class264 field3888;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Lqf;")
    private class311 field3890;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Lvl;")
    private static class6 field3879;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Lvl;")
    private static class6 field3881;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3884;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3892;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3896;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[F")
    private float[] field3872;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[F")
    private float[] field3875;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "[F")
    private float[] field3883;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "[F")
    private float[] field3893;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    private int[] field3871;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[I")
    private int[] field3874;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "[I")
    private int[] field3876;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[I")
    private int[] field3882;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[I")
    private int[] field3887;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[I")
    private int[] field3895;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "[I")
    private int[] field3900;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[Z")
    private boolean[] field3873;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[[I")
    private int[][] field3885;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "[[I")
    private int[][] field3894;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III[I[IZ)I", line = 9)
    public final int method1779(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3891) {
            this.field3894[this.field3901] = arg4;
            this.field3873[this.field3901] = arg5;
            if (arg4 != null) {
                this.field3899 += arg4.length;
            }
            if (arg5) {
                this.field3899 += (arg3.length - 2) * 3;
            } else {
                this.field3880 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3880 += (arg3.length - 2) * 3;
        }
        this.field3887[this.field3901] = arg0;
        this.field3882[this.field3901] = arg1;
        this.field3876[this.field3901] = arg2;
        this.field3885[this.field3901] = arg3;
        return this.field3901++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([[[Lsm;FZ)V", line = 32)
    public final void method1780(class124[][][] arg0, float arg1, boolean arg2) {
        if (field3881 == null || field3881.field115.length < this.field3880 * 4) {
            field3881 = new class6(this.field3880 * 4);
        } else {
            field3881.field111 = 0;
        }
        if (field3879 == null || field3879.field115.length < this.field3899 * 4) {
            field3879 = new class6(this.field3899 * 4);
        } else {
            field3879.field111 = 0;
        }
        if (class109.field1464) {
            for (int var4 = 0; var4 < this.field3901; var4++) {
                class124 var5 = arg0[this.field3887[var4]][this.field3882[var4]][this.field3876[var4]];
                if (var5 != null && var5.field1785) {
                    int[] var6 = this.field3885[var4];
                    class6 var9;
                    if (this.field3891) {
                        int[] var7 = this.field3894[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3879.method34(var7[var8], 294335144);
                            }
                        }
                        var9 = this.field3873[var4] ? field3879 : field3881;
                    } else {
                        var9 = field3881;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method34(var6[0], 294335144);
                        var9.method34(var6[var10], 294335144);
                        var9.method34(var6[var10 + 1], 294335144);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3901; var11++) {
                class124 var12 = arg0[this.field3887[var11]][this.field3882[var11]][this.field3876[var11]];
                if (var12 != null && var12.field1785) {
                    int[] var13 = this.field3885[var11];
                    class6 var16;
                    if (this.field3891) {
                        int[] var14 = this.field3894[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3879.method44(854292648, var14[var15]);
                            }
                        }
                        var16 = this.field3873[var11] ? field3879 : field3881;
                    } else {
                        var16 = field3881;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method44(854292648, var13[0]);
                        var16.method44(854292648, var13[var17]);
                        var16.method44(854292648, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3881.field111 == 0 && field3879.field111 == 0) {
            return;
        }
        GL var18 = class109.field1456;
        if (this.field3889 == -1 || arg2) {
            class109.method752(-1);
            class256.method1855(0, 14, 0);
        } else {
            class31.field466.method446(128, this.field3889);
        }
        int var19 = this.field3877 ? 40 : 36;
        if (this.field3888 == null) {
            if (class109.field1496) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3884.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3884);
            this.field3884.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3884);
            if (class220.field3482) {
                this.field3884.position(16);
                var18.glNormalPointer(5126, var19, this.field3884);
            }
            this.field3884.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3884);
            if (this.field3877) {
                var18.glClientActiveTexture(class74.method563());
                this.field3884.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3884);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3888.method1888();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class220.field3482) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3877) {
                var18.glClientActiveTexture(class74.method563());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class109.field1496) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3881.field111 != 0) {
            if (field3896 == null || field3896.capacity() < field3881.field111) {
                field3896 = ByteBuffer.allocateDirect(field3881.field111).order(ByteOrder.nativeOrder());
            } else {
                field3896.clear();
            }
            field3896.put(field3881.field115, 0, field3881.field111);
            field3896.flip();
            class109.method745(arg1);
            var18.glDrawElements(4, field3881.field111 / 4, 5125, field3896);
        }
        if (field3879.field111 == 0) {
            return;
        }
        if (field3892 == null || field3892.capacity() < field3879.field111) {
            field3892 = ByteBuffer.allocateDirect(field3879.field111).order(ByteOrder.nativeOrder());
        } else {
            field3892.clear();
        }
        field3892.put(field3879.field115, 0, field3879.field111);
        field3892.flip();
        class109.method745(arg1 - 100.0F);
        class109.method768();
        var18.glDrawElements(4, field3879.field111 / 4, 5125, field3892);
        class109.method776();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 239)
    public final void method1781() {
        class6 var1 = new class6((this.field3877 ? 40 : 36) * this.field3897);
        for (int var2 = 0; var2 < this.field3897; var2++) {
            if (class109.field1464) {
                var1.method36((float) this.field3874[var2], (byte) 121);
                var1.method36((float) this.field3900[var2], (byte) 119);
                var1.method36((float) this.field3895[var2], (byte) 127);
                var1.method34(this.field3871[var2], 294335144);
                var1.method36(this.field3872[var2], (byte) 121);
                var1.method36(this.field3875[var2], (byte) 123);
                var1.method36(this.field3883[var2], (byte) 120);
                var1.method36((float) this.field3874[var2] / this.field3878, (byte) 127);
                var1.method36((float) this.field3895[var2] / this.field3878, (byte) 124);
                if (this.field3877) {
                    var1.method36(this.field3893[var2], (byte) 123);
                }
            } else {
                var1.method91((float) this.field3874[var2], -211870840);
                var1.method91((float) this.field3900[var2], -211870840);
                var1.method91((float) this.field3895[var2], -211870840);
                var1.method34(this.field3871[var2], 294335144);
                var1.method91(this.field3872[var2], -211870840);
                var1.method91(this.field3875[var2], -211870840);
                var1.method91(this.field3883[var2], -211870840);
                var1.method91((float) this.field3874[var2] / this.field3878, -211870840);
                var1.method91((float) this.field3895[var2] / this.field3878, -211870840);
                if (this.field3877) {
                    var1.method91(this.field3893[var2], -211870840);
                }
            }
        }
        if (class109.field1496) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field115, 0, var1.field111);
            this.field3888 = new class264();
            this.field3888.method1892(var3);
        } else {
            this.field3884 = ByteBuffer.allocateDirect(var1.field111).order(ByteOrder.nativeOrder());
            this.field3884.put(var1.field115, 0, var1.field111);
            this.field3884.flip();
        }
        this.field3874 = null;
        this.field3900 = null;
        this.field3895 = null;
        this.field3871 = null;
        this.field3872 = null;
        this.field3875 = null;
        this.field3883 = null;
        this.field3890 = null;
        this.field3893 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V", line = 305)
    public static void method1782() {
        field3881 = null;
        field3879 = null;
        field3896 = null;
        field3892 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIFFFIF)I", line = 313)
    public final int method1783(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class233 var11 = (class233) this.field3890.method2168(var9, (byte) -107);
            if (var11 != null) {
                if (arg1 < this.field3900[var11.field3633]) {
                    this.field3900[var11.field3633] = arg1;
                }
                return var11.field3633;
            }
        }
        this.field3874[this.field3897] = arg0;
        this.field3900[this.field3897] = arg1;
        this.field3895[this.field3897] = arg2;
        if (this.field3877) {
            this.field3893[this.field3897] = arg7;
        }
        this.field3872[this.field3897] = arg3;
        this.field3875[this.field3897] = arg4;
        this.field3883[this.field3897] = arg5;
        this.field3871[this.field3897] = arg6;
        if (var9 != 0L) {
            this.field3890.method2161(new class233(this.field3897), var9, -1);
        }
        return this.field3897++;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class247(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3889 = arg0;
        this.field3878 = arg1;
        this.field3891 = arg2;
        this.field3877 = arg3;
        this.field3886 = arg4;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V", line = 364)
    public final void method1784() {
        this.field3874 = new int[this.field3870];
        this.field3900 = new int[this.field3870];
        this.field3895 = new int[this.field3870];
        if (this.field3877) {
            this.field3893 = new float[this.field3870];
        }
        this.field3871 = new int[this.field3870];
        this.field3872 = new float[this.field3870];
        this.field3875 = new float[this.field3870];
        this.field3883 = new float[this.field3870];
        this.field3882 = new int[this.field3898];
        this.field3876 = new int[this.field3898];
        this.field3887 = new int[this.field3898];
        this.field3885 = new int[this.field3898][];
        this.field3890 = new class311(class215.method1568(479166497, this.field3870));
        if (this.field3891) {
            this.field3894 = new int[this.field3898][];
            this.field3873 = new boolean[this.field3898];
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V", line = 399)
    public static final void method1785() {
        field3881 = null;
        field3879 = null;
        field3896 = null;
        field3892 = null;
    }
}
