import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class224 extends class206 {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public int field3886 = 0;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    private int field3896 = 0;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public int field3909 = 0;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public int field3898 = 0;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    private int field3914 = 0;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    private int field3913 = 0;

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "I")
    public int field3916;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "F")
    private float field3905;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Z")
    public boolean field3890;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Z")
    private boolean field3895;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lcb;")
    private class34 field3899;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "Led;")
    private class49 field3915;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Lmi;")
    private static class92 field3902;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "Lmi;")
    private static class92 field3903;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3888;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3892;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3900;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[F")
    private float[] field3894;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "[F")
    private float[] field3897;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[F")
    private float[] field3901;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "[F")
    private float[] field3904;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    private int[] field3885;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
    private int[] field3887;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[I")
    private int[] field3889;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "[I")
    private int[] field3891;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "[I")
    private int[] field3906;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "[I")
    private int[] field3908;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "[I")
    private int[] field3911;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "[Z")
    private boolean[] field3907;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "[[I")
    private int[][] field3893;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "[[I")
    private int[][] field3912;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 9)
    public static void method1588() {
        field3903 = null;
        field3902 = null;
        field3888 = null;
        field3892 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IFZZI)V", line = 411)
    public class224(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field3916 = arg0;
        this.field3905 = arg1;
        this.field3890 = arg2;
        this.field3895 = arg3;
        this.field3910 = arg4;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V", line = 33)
    public final void method1589() {
        class92 var1 = new class92((this.field3895 ? 40 : 36) * this.field3886);
        for (int var2 = 0; var2 < this.field3886; var2++) {
            if (class154.field2468) {
                var1.method701(12327, (float) this.field3911[var2]);
                var1.method701(12327, (float) this.field3906[var2]);
                var1.method701(12327, (float) this.field3889[var2]);
                var1.method712(this.field3885[var2], -73);
                var1.method701(12327, this.field3904[var2]);
                var1.method701(12327, this.field3901[var2]);
                var1.method701(12327, this.field3897[var2]);
                var1.method701(12327, (float) this.field3911[var2] / this.field3905);
                var1.method701(12327, (float) this.field3889[var2] / this.field3905);
                if (this.field3895) {
                    var1.method701(12327, this.field3894[var2]);
                }
            } else {
                var1.method735((float) this.field3911[var2], -3);
                var1.method735((float) this.field3906[var2], -3);
                var1.method735((float) this.field3889[var2], -3);
                var1.method712(this.field3885[var2], 116);
                var1.method735(this.field3904[var2], -3);
                var1.method735(this.field3901[var2], -3);
                var1.method735(this.field3897[var2], -3);
                var1.method735((float) this.field3911[var2] / this.field3905, -3);
                var1.method735((float) this.field3889[var2] / this.field3905, -3);
                if (this.field3895) {
                    var1.method735(this.field3894[var2], -3);
                }
            }
        }
        if (class154.field2461) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field1495, 0, var1.field1476);
            this.field3899 = new class34();
            this.field3899.method220(var3);
        } else {
            this.field3900 = ByteBuffer.allocateDirect(var1.field1476).order(ByteOrder.nativeOrder());
            this.field3900.put(var1.field1495, 0, var1.field1476);
            this.field3900.flip();
        }
        this.field3911 = null;
        this.field3906 = null;
        this.field3889 = null;
        this.field3885 = null;
        this.field3904 = null;
        this.field3901 = null;
        this.field3897 = null;
        this.field3915 = null;
        this.field3894 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "()V", line = 111)
    public final void method1590() {
        this.field3911 = new int[this.field3909];
        this.field3906 = new int[this.field3909];
        this.field3889 = new int[this.field3909];
        if (this.field3895) {
            this.field3894 = new float[this.field3909];
        }
        this.field3885 = new int[this.field3909];
        this.field3904 = new float[this.field3909];
        this.field3901 = new float[this.field3909];
        this.field3897 = new float[this.field3909];
        this.field3908 = new int[this.field3898];
        this.field3887 = new int[this.field3898];
        this.field3891 = new int[this.field3898];
        this.field3893 = new int[this.field3898][];
        this.field3915 = new class49(class229.method1622(true, this.field3909));
        if (this.field3890) {
            this.field3912 = new int[this.field3898][];
            this.field3907 = new boolean[this.field3898];
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIFFFIF)I", line = 137)
    public final int method1591(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class173 var11 = (class173) this.field3915.method311((byte) 114, var9);
            if (var11 != null) {
                if (arg1 < this.field3906[var11.field2796]) {
                    this.field3906[var11.field2796] = arg1;
                }
                return var11.field2796;
            }
        }
        this.field3911[this.field3886] = arg0;
        this.field3906[this.field3886] = arg1;
        this.field3889[this.field3886] = arg2;
        if (this.field3895) {
            this.field3894[this.field3886] = arg7;
        }
        this.field3904[this.field3886] = arg3;
        this.field3901[this.field3886] = arg4;
        this.field3897[this.field3886] = arg5;
        this.field3885[this.field3886] = arg6;
        if (var9 != 0L) {
            this.field3915.method309(new class173(this.field3886), var9, 1);
        }
        return this.field3886++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[I[IZ)I", line = 180)
    public final int method1592(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field3890) {
            this.field3912[this.field3914] = arg4;
            this.field3907[this.field3914] = arg5;
            if (arg4 != null) {
                this.field3896 += arg4.length;
            }
            if (arg5) {
                this.field3896 += (arg3.length - 2) * 3;
            } else {
                this.field3913 += (arg3.length - 2) * 3;
            }
        } else {
            this.field3913 += (arg3.length - 2) * 3;
        }
        this.field3891[this.field3914] = arg0;
        this.field3908[this.field3914] = arg1;
        this.field3887[this.field3914] = arg2;
        this.field3893[this.field3914] = arg3;
        return this.field3914++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([[[Lhk;FZ)V", line = 203)
    public final void method1593(class166[][][] arg0, float arg1, boolean arg2) {
        if (field3903 == null || field3903.field1495.length < this.field3913 * 4) {
            field3903 = new class92(this.field3913 * 4);
        } else {
            field3903.field1476 = 0;
        }
        if (field3902 == null || field3902.field1495.length < this.field3896 * 4) {
            field3902 = new class92(this.field3896 * 4);
        } else {
            field3902.field1476 = 0;
        }
        if (class154.field2468) {
            for (int var4 = 0; var4 < this.field3914; var4++) {
                class166 var5 = arg0[this.field3891[var4]][this.field3908[var4]][this.field3887[var4]];
                if (var5 != null && var5.field2729) {
                    int[] var6 = this.field3893[var4];
                    class92 var9;
                    if (this.field3890) {
                        int[] var7 = this.field3912[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field3902.method712(var7[var8], -15);
                            }
                        }
                        var9 = this.field3907[var4] ? field3902 : field3903;
                    } else {
                        var9 = field3903;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method712(var6[0], -27);
                        var9.method712(var6[var10], -36);
                        var9.method712(var6[var10 + 1], -60);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field3914; var11++) {
                class166 var12 = arg0[this.field3891[var11]][this.field3908[var11]][this.field3887[var11]];
                if (var12 != null && var12.field2729) {
                    int[] var13 = this.field3893[var11];
                    class92 var16;
                    if (this.field3890) {
                        int[] var14 = this.field3912[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3902.method715(true, var14[var15]);
                            }
                        }
                        var16 = this.field3907[var11] ? field3902 : field3903;
                    } else {
                        var16 = field3903;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method715(true, var13[0]);
                        var16.method715(true, var13[var17]);
                        var16.method715(true, var13[var17 + 1]);
                    }
                }
            }
        }
        if (field3903.field1476 == 0 && field3902.field1476 == 0) {
            return;
        }
        GL var18 = class154.field2479;
        if (this.field3916 == -1 || arg2) {
            class154.method1141(-1);
            class135.method1024(0, -97, 0);
        } else {
            class23.field248.method183(this.field3916, -27048);
        }
        int var19 = this.field3895 ? 40 : 36;
        if (this.field3899 == null) {
            if (class154.field2461) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field3900.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field3900);
            this.field3900.position(12);
            var18.glColorPointer(4, 5121, var19, this.field3900);
            if (client.field5162) {
                this.field3900.position(16);
                var18.glNormalPointer(5126, var19, this.field3900);
            }
            this.field3900.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field3900);
            if (this.field3895) {
                var18.glClientActiveTexture(class273.method1867());
                this.field3900.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field3900);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field3899.method221();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (client.field5162) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field3895) {
                var18.glClientActiveTexture(class273.method1867());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class154.field2461) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field3903.field1476 != 0) {
            if (field3888 == null || field3888.capacity() < field3903.field1476) {
                field3888 = ByteBuffer.allocateDirect(field3903.field1476).order(ByteOrder.nativeOrder());
            } else {
                field3888.clear();
            }
            field3888.put(field3903.field1495, 0, field3903.field1476);
            field3888.flip();
            class154.method1112(arg1);
            var18.glDrawElements(4, field3903.field1476 / 4, 5125, field3888);
        }
        if (field3902.field1476 == 0) {
            return;
        }
        if (field3892 == null || field3892.capacity() < field3902.field1476) {
            field3892 = ByteBuffer.allocateDirect(field3902.field1476).order(ByteOrder.nativeOrder());
        } else {
            field3892.clear();
        }
        field3892.put(field3902.field1495, 0, field3902.field1476);
        field3892.flip();
        class154.method1112(arg1 - 100.0F);
        class154.method1106();
        var18.glDrawElements(4, field3902.field1476 / 4, 5125, field3892);
        class154.method1132();
    }
}
