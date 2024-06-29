import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class267 extends class345 {

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "Z")
    public boolean field3889 = false;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public int field3894 = 0;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "B")
    private byte field3907 = 0;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    private int field3892 = 0;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    private int field3895 = 0;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
    private int field3919 = 0;

    @OriginalMember(owner = "client!kl", name = "jb", descriptor = "B")
    private byte field3930 = 0;

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "[I")
    private int[] field3922;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "[I")
    public int[] field3904;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "[I")
    public int[] field3916;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "[I")
    public int[] field3886;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[I")
    private int[] field3898;

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "[S")
    private short[] field3921;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "[S")
    private short[] field3910;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "[S")
    private short[] field3906;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "[S")
    private short[] field3913;

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "[S")
    private short[] field3917;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "[F")
    private float[] field3905;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[F")
    private float[] field3896;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "[S")
    private short[] field3920;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "[B")
    private byte[] field3923;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "[S")
    private short[] field3891;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "[S")
    private short[] field3901;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "[S")
    private short[] field3924;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "[S")
    private short[] field3897;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "[B")
    private byte[] field3912;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "[S")
    private short[] field3902;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "Lee;")
    public class212 field3915;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "Lpf;")
    public class342 field3890;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "Lpf;")
    private class342 field3918;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Lpf;")
    private class342 field3900;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "Lpf;")
    private class342 field3925;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Lpf;")
    private class342 field3908;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "S")
    private short field3899;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "S")
    private short field3885;

    @OriginalMember(owner = "client!kl", name = "fb", descriptor = "[S")
    private short[] field3926;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "[I")
    private int[] field3888;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Lcg;")
    private static class316 field3909 = new class316(10000);

    @OriginalMember(owner = "client!kl", name = "hb", descriptor = "Lkl;")
    private static class267 field3928 = new class267();

    @OriginalMember(owner = "client!kl", name = "ib", descriptor = "Lkl;")
    private static class267 field3929 = new class267();

    @OriginalMember(owner = "client!kl", name = "kb", descriptor = "Lkl;")
    private static class267 field3931 = new class267();

    @OriginalMember(owner = "client!kl", name = "lb", descriptor = "Lkl;")
    private static class267 field3932 = new class267();

    @OriginalMember(owner = "client!kl", name = "mb", descriptor = "Lkl;")
    private static class267 field3933 = new class267();

    @OriginalMember(owner = "client!kl", name = "nb", descriptor = "Lkl;")
    private static class267 field3934 = new class267();

    @OriginalMember(owner = "client!kl", name = "rb", descriptor = "Z")
    private static boolean field3938 = false;

    @OriginalMember(owner = "client!kl", name = "zb", descriptor = "[I")
    private static int[] field3946 = new int[1];

    @OriginalMember(owner = "client!kl", name = "tb", descriptor = "[I")
    private static int[] field3940 = new int[1];

    @OriginalMember(owner = "client!kl", name = "ob", descriptor = "F")
    private static float field3935;

    @OriginalMember(owner = "client!kl", name = "pb", descriptor = "F")
    private static float field3936;

    @OriginalMember(owner = "client!kl", name = "qb", descriptor = "F")
    private static float field3937;

    @OriginalMember(owner = "client!kl", name = "sb", descriptor = "F")
    private static float field3939;

    @OriginalMember(owner = "client!kl", name = "wb", descriptor = "F")
    private static float field3943;

    @OriginalMember(owner = "client!kl", name = "yb", descriptor = "F")
    private static float field3945;

    @OriginalMember(owner = "client!kl", name = "ub", descriptor = "I")
    private static int field3941;

    @OriginalMember(owner = "client!kl", name = "vb", descriptor = "I")
    private static int field3942;

    @OriginalMember(owner = "client!kl", name = "xb", descriptor = "I")
    private static int field3944;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "Lhb;")
    private class305 field3914;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "Lbf;")
    private class58 field3887;

    @OriginalMember(owner = "client!kl", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3927;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "[J")
    private static long[] field3911;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "[[I")
    private int[][] field3893;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "[[I")
    private int[][] field3903;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ltj;)Ltj;", line = 5)
    public final class258 method1811(class258 arg0) {
        if (this.field3895 == 0) {
            return null;
        }
        if (!this.field3915.field3065) {
            this.method1820();
        }
        int var2;
        int var3;
        if (class139.field1910 > 0) {
            var2 = this.field3915.field3070 - (class139.field1910 * this.field3915.field3067 >> 8) >> 3;
            var3 = this.field3915.field3064 - (class139.field1910 * this.field3915.field3063 >> 8) >> 3;
        } else {
            var2 = this.field3915.field3070 - (class139.field1910 * this.field3915.field3063 >> 8) >> 3;
            var3 = this.field3915.field3064 - (class139.field1910 * this.field3915.field3067 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class139.field1903 > 0) {
            var4 = this.field3915.field3066 - (class139.field1903 * this.field3915.field3067 >> 8) >> 3;
            var5 = this.field3915.field3068 - (class139.field1903 * this.field3915.field3063 >> 8) >> 3;
        } else {
            var4 = this.field3915.field3066 - (class139.field1903 * this.field3915.field3063 >> 8) >> 3;
            var5 = this.field3915.field3068 - (class139.field1903 * this.field3915.field3067 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class258 var8;
        if (arg0 == null || arg0.field3809.length < var6 * var7) {
            var8 = new class258(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field31 = arg0.field28 = var6;
            arg0.field30 = arg0.field38 = var7;
            arg0.method1778();
        }
        var8.field40 = var2;
        var8.field32 = var4;
        if (field3940.length < this.field3895) {
            field3940 = new int[this.field3895];
            field3946 = new int[this.field3895];
        }
        for (int var9 = 0; var9 < this.field3892; var9++) {
            int var10 = (this.field3904[var9] - (this.field3916[var9] * class139.field1910 >> 8) >> 3) - var2;
            int var11 = (this.field3886[var9] - (this.field3916[var9] * class139.field1903 >> 8) >> 3) - var4;
            int var12 = this.field3922[var9];
            int var13 = this.field3922[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3926[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3940[var15] = var10;
                field3946[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3919; var16++) {
            if (this.field3923[var16] <= 128) {
                short var17 = this.field3891[var16];
                short var18 = this.field3901[var16];
                short var19 = this.field3924[var16];
                int var20 = field3940[var17];
                int var21 = field3940[var18];
                int var22 = field3940[var19];
                int var23 = field3946[var17];
                int var24 = field3946[var18];
                int var25 = field3946[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class184.method1298(var8.field3809, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "()V", line = 128)
    public final void method1812() {
        if (this.field3910 == null) {
            this.method324();
            return;
        }
        for (int var1 = 0; var1 < this.field3894; var1++) {
            int var2 = this.field3904[var1];
            this.field3904[var1] = this.field3886[var1];
            this.field3886[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3895; var3++) {
            short var4 = this.field3910[var3];
            this.field3910[var3] = this.field3913[var3];
            this.field3913[var3] = (short) (-var4);
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([FI)[F", line = 166)
    private static final float[] method1813(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class281.method1937(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "()I", line = 172)
    public final int method1814() {
        return this.field3899;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZZZZZZZZZZ)Lkl;", line = 176)
    public final class267 method1815(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class267 var12 = new class267();
        var12.field3894 = this.field3894;
        var12.field3892 = this.field3892;
        var12.field3895 = this.field3895;
        var12.field3919 = this.field3919;
        if (arg0) {
            var12.field3904 = this.field3904;
            var12.field3886 = this.field3886;
        } else {
            var12.field3904 = class188.method1318(this.field3904, 0);
            var12.field3886 = class188.method1318(this.field3886, 0);
        }
        if (arg1) {
            var12.field3916 = this.field3916;
        } else {
            var12.field3916 = class188.method1318(this.field3916, 0);
        }
        if (arg0 && arg1) {
            var12.field3890 = this.field3890;
            var12.field3915 = this.field3915;
        } else {
            var12.field3890 = new class342();
            var12.field3915 = new class212();
        }
        if (arg2) {
            var12.field3920 = this.field3920;
        } else {
            var12.field3920 = class59.method406(0, this.field3920);
        }
        if (arg3) {
            var12.field3923 = this.field3923;
        } else {
            var12.field3923 = class76.method560(this.field3923, -76);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class314.field4736) {
            var12.field3918 = new class342();
        } else {
            var12.field3918 = this.field3918;
        }
        if (arg5) {
            var12.field3910 = this.field3910;
            var12.field3906 = this.field3906;
            var12.field3913 = this.field3913;
            var12.field3917 = this.field3917;
        } else {
            var12.field3910 = class59.method406(0, this.field3910);
            var12.field3906 = class59.method406(0, this.field3906);
            var12.field3913 = class59.method406(0, this.field3913);
            var12.field3917 = class59.method406(0, this.field3917);
        }
        if (!class314.field4736) {
            var12.field3900 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3900 = this.field3900;
        } else {
            var12.field3900 = new class342();
        }
        if (arg8) {
            var12.field3905 = this.field3905;
            var12.field3896 = this.field3896;
            var12.field3925 = this.field3925;
        } else {
            var12.field3905 = class339.method2345((byte) 121, this.field3905);
            var12.field3896 = class339.method2345((byte) 108, this.field3896);
            var12.field3925 = new class342();
        }
        if (arg9) {
            var12.field3891 = this.field3891;
            var12.field3901 = this.field3901;
            var12.field3924 = this.field3924;
            var12.field3908 = this.field3908;
        } else {
            var12.field3891 = class59.method406(0, this.field3891);
            var12.field3901 = class59.method406(0, this.field3901);
            var12.field3924 = class59.method406(0, this.field3924);
            var12.field3908 = new class342();
        }
        if (arg10) {
            var12.field3897 = this.field3897;
        } else {
            var12.field3897 = class59.method406(0, this.field3897);
        }
        var12.field3898 = this.field3898;
        var12.field3893 = this.field3893;
        var12.field3912 = this.field3912;
        var12.field3903 = this.field3903;
        var12.field3888 = this.field3888;
        var12.field3926 = this.field3926;
        var12.field3922 = this.field3922;
        var12.field3899 = this.field3899;
        var12.field3885 = this.field3885;
        var12.field3921 = this.field3921;
        var12.field3902 = this.field3902;
        return var12;
    }

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "()I", line = 318)
    public final int method343() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3068;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)V", line = 328)
    public final void method322(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3942 = 0;
            field3941 = 0;
            field3944 = 0;
            for (int var6 = 0; var6 < this.field3894; var6++) {
                field3942 += this.field3904[var6];
                field3941 += this.field3916[var6];
                field3944 += this.field3886[var6];
                var5++;
            }
            if (var5 > 0) {
                field3942 = field3942 / var5 + arg1;
                field3941 = field3941 / var5 + arg2;
                field3944 = field3944 / var5 + arg3;
            } else {
                field3942 = arg1;
                field3941 = arg2;
                field3944 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3894; var7++) {
                this.field3904[var7] += arg1;
                this.field3916[var7] += arg2;
                this.field3886[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3894; var8++) {
                this.field3904[var8] -= field3942;
                this.field3916[var8] -= field3941;
                this.field3886[var8] -= field3944;
                if (arg3 != 0) {
                    int var9 = class184.field2538[arg3];
                    int var10 = class184.field2532[arg3];
                    int var11 = this.field3916[var8] * var9 + this.field3904[var8] * var10 + 32767 >> 16;
                    this.field3916[var8] = this.field3916[var8] * var10 + 32767 - this.field3904[var8] * var9 >> 16;
                    this.field3904[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class184.field2538[arg1];
                    int var13 = class184.field2532[arg1];
                    int var14 = this.field3916[var8] * var13 + 32767 - this.field3886[var8] * var12 >> 16;
                    this.field3886[var8] = this.field3916[var8] * var12 + this.field3886[var8] * var13 + 32767 >> 16;
                    this.field3916[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class184.field2538[arg2];
                    int var16 = class184.field2532[arg2];
                    int var17 = this.field3904[var8] * var16 + this.field3886[var8] * var15 + 32767 >> 16;
                    this.field3886[var8] = this.field3886[var8] * var16 + 32767 - this.field3904[var8] * var15 >> 16;
                    this.field3904[var8] = var17;
                }
                this.field3904[var8] += field3942;
                this.field3916[var8] += field3941;
                this.field3886[var8] += field3944;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3894; var18++) {
                this.field3904[var18] -= field3942;
                this.field3916[var18] -= field3941;
                this.field3886[var18] -= field3944;
                this.field3904[var18] = this.field3904[var18] * arg1 / 128;
                this.field3916[var18] = this.field3916[var18] * arg2 / 128;
                this.field3886[var18] = this.field3886[var18] * arg3 / 128;
                this.field3904[var18] += field3942;
                this.field3916[var18] += field3941;
                this.field3886[var18] += field3944;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3919; var19++) {
                int var20 = (this.field3923[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3923[var19] = (byte) var20;
            }
            this.field3918.field5120 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field3919; var21++) {
                int var22 = this.field3920[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field3920[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field3918.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "()I", line = 524)
    public final int method316() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3070;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V", line = 530)
    public final void method1816(int arg0) {
        this.field3885 = (short) arg0;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZZZZZZ)V", line = 538)
    public final void method1817(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3930 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3895 != 0) {
            if (arg6) {
                boolean var8 = !this.field3918.field5120 && (arg1 || arg2 && !class314.field4736);
                this.method1830(false, !this.field3890.field5120 && arg0, var8, this.field3900 != null && !this.field3900.field5120 && arg2, !this.field3925.field5120 && arg3);
                if (!this.field3908.field5120 && arg4 && arg1) {
                    this.method1842();
                }
            }
            if (arg0) {
                if (this.field3890.field5120) {
                    if (!this.field3915.field3065) {
                        this.method1820();
                    }
                    this.field3904 = null;
                    this.field3916 = null;
                    this.field3886 = null;
                    this.field3926 = null;
                    this.field3922 = null;
                } else {
                    this.field3907 = (byte) (this.field3907 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3918.field5120) {
                    this.field3920 = null;
                    this.field3923 = null;
                } else {
                    this.field3907 = (byte) (this.field3907 | 0x2);
                }
            }
            if (arg2 && class314.field4736) {
                if (this.field3900.field5120) {
                    this.field3910 = null;
                    this.field3906 = null;
                    this.field3913 = null;
                    this.field3917 = null;
                } else {
                    this.field3907 = (byte) (this.field3907 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3925.field5120) {
                    this.field3905 = null;
                    this.field3896 = null;
                } else {
                    this.field3907 = (byte) (this.field3907 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3908.field5120 && this.field3918.field5120) {
                    this.field3891 = null;
                    this.field3901 = null;
                    this.field3924 = null;
                } else {
                    this.field3907 = (byte) (this.field3907 | 0x10);
                }
            }
            if (arg5) {
                this.field3898 = null;
                this.field3912 = null;
                this.field3893 = (int[][]) null;
                this.field3903 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFF)I", line = 634)
    private static final int method1818(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ldn;IIIZ)V", line = 669)
    public final void method941(class132 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class267 var6 = (class267) arg0;
        if (this.field3919 == 0 || var6.field3919 == 0) {
            return;
        }
        int var7 = var6.field3892;
        int[] var8 = var6.field3904;
        int[] var9 = var6.field3916;
        int[] var10 = var6.field3886;
        short[] var11 = var6.field3910;
        short[] var12 = var6.field3906;
        short[] var13 = var6.field3913;
        short[] var14 = var6.field3917;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3887 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3887.field793;
            var16 = this.field3887.field790;
            var17 = this.field3887.field791;
            var18 = this.field3887.field792;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3887 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3887.field793;
            var20 = var6.field3887.field790;
            var21 = var6.field3887.field791;
            var22 = var6.field3887.field792;
        }
        int[] var23 = var6.field3922;
        short[] var24 = var6.field3926;
        if (!var6.field3915.field3065) {
            var6.method1820();
        }
        short var25 = var6.field3915.field3063;
        short var26 = var6.field3915.field3067;
        short var27 = var6.field3915.field3070;
        short var28 = var6.field3915.field3064;
        short var29 = var6.field3915.field3066;
        short var30 = var6.field3915.field3068;
        for (int var31 = 0; var31 < this.field3892; var31++) {
            int var32 = this.field3916[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3904[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3886[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3922[var31];
                        int var37 = this.field3922[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3926[var38] - 1;
                            if (var35 == -1 || this.field3917[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3887 = new class58();
                                            var15 = this.field3887.field793 = class59.method406(0, this.field3910);
                                            var16 = this.field3887.field790 = class59.method406(0, this.field3906);
                                            var17 = this.field3887.field791 = class59.method406(0, this.field3913);
                                            var18 = this.field3887.field792 = class59.method406(0, this.field3917);
                                        }
                                        if (var19 == null) {
                                            class58 var44 = var6.field3887 = new class58();
                                            var19 = var44.field793 = class59.method406(0, var11);
                                            var20 = var44.field790 = class59.method406(0, var12);
                                            var21 = var44.field791 = class59.method406(0, var13);
                                            var22 = var44.field792 = class59.method406(0, var14);
                                        }
                                        short var45 = this.field3910[var35];
                                        short var46 = this.field3906[var35];
                                        short var47 = this.field3913[var35];
                                        short var48 = this.field3917[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3922[var31];
                                        int var58 = this.field3922[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3926[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()I", line = 906)
    public final int method313() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3066;
    }

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "()V", line = 912)
    public static void method1819() {
        field3911 = null;
        field3909 = null;
        field3927 = null;
        field3928 = null;
        field3929 = null;
        field3931 = null;
        field3932 = null;
        field3933 = null;
        field3934 = null;
        field3940 = null;
        field3946 = null;
    }

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "()V", line = 927)
    private final void method1820() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3892; var9++) {
            int var10 = this.field3904[var9];
            int var11 = this.field3916[var9];
            int var12 = this.field3886[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3915.field3070 = (short) var1;
        this.field3915.field3064 = (short) var4;
        this.field3915.field3063 = (short) var2;
        this.field3915.field3067 = (short) var5;
        this.field3915.field3066 = (short) var3;
        this.field3915.field3068 = (short) var6;
        this.field3915.field3069 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3915.field3065 = true;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 997)
    public final void method344(int arg0) {
        int var2 = class184.field2538[arg0];
        int var3 = class184.field2532[arg0];
        for (int var4 = 0; var4 < this.field3894; var4++) {
            int var5 = this.field3916[var4] * var3 - this.field3886[var4] * var2 >> 16;
            this.field3886[var4] = this.field3916[var4] * var2 + this.field3886[var4] * var3 >> 16;
            this.field3916[var4] = var5;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([SI)[S", line = 1017)
    private static final short[] method1821(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class281.method1938(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILkl;[[I[[IIII)V", line = 1023)
    public final void method1822(int arg0, int arg1, class267 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3915.field3065) {
            arg2.method1820();
        }
        int var9 = arg2.field3915.field3070 + arg5;
        int var10 = arg2.field3915.field3064 + arg5;
        int var11 = arg2.field3915.field3066 + arg7;
        int var12 = arg2.field3915.field3068 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3892; var17++) {
                int var18 = this.field3904[var17] + arg5;
                int var19 = this.field3886[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3916[var17] = this.field3916[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3915.field3063;
            for (int var28 = 0; var28 < this.field3892; var28++) {
                int var29 = (this.field3916[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3904[var28] + arg5;
                    int var31 = this.field3886[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3916[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2382(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3915.field3067 - arg2.field3915.field3063;
            for (int var42 = 0; var42 < this.field3892; var42++) {
                int var43 = this.field3904[var42] + arg5;
                int var44 = this.field3886[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3916[var42] = var51 + this.field3916[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3915.field3067 - arg2.field3915.field3063;
            for (int var53 = 0; var53 < this.field3892; var53++) {
                int var54 = this.field3904[var53] + arg5;
                int var55 = this.field3886[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3916[var53] = ((this.field3916[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3890.field5120 = false;
        this.field3915.field3065 = false;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "()V", line = 1222)
    public final void method315() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            int var2 = this.field3886[var1];
            this.field3886[var1] = this.field3904[var1];
            this.field3904[var1] = -var2;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "()V", line = 1240)
    public final void method324() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            int var2 = this.field3904[var1];
            this.field3904[var1] = this.field3886[var1];
            this.field3886[var1] = -var2;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()Z", line = 1255)
    public final boolean method943() {
        return this.field3889 && this.field3904 != null && this.field3910 != null;
    }

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "()V", line = 1259)
    public final void method1823() {
        int var10002;
        if (this.field3898 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3894; var3++) {
                int var4 = this.field3898[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3893 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3893[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3894) {
                int var7 = this.field3898[var6] & 0xFF;
                this.field3893[var7][var1[var7]++] = var6++;
            }
            this.field3898 = null;
        }
        if (this.field3912 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3919; var10++) {
            int var11 = this.field3912[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3903 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3903[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3919) {
            int var14 = this.field3912[var13] & 0xFF;
            this.field3903[var14][var8[var14]++] = var13++;
        }
        this.field3912 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ldl;IJIIIIFF)S", line = 1353)
    private final short method1824(class308 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3922[arg1];
        int var12 = this.field3922[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3926[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3911[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3926[var13] = (short) (this.field3895 + 1);
        field3911[var13] = arg2;
        this.field3910[this.field3895] = (short) arg3;
        this.field3906[this.field3895] = (short) arg4;
        this.field3913[this.field3895] = (short) arg5;
        this.field3917[this.field3895] = (short) arg6;
        this.field3905[this.field3895] = arg7;
        this.field3896[this.field3895] = arg8;
        return (short) (this.field3895++);
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 1389)
    public final void method337(int arg0) {
        int var2 = class184.field2538[arg0];
        int var3 = class184.field2532[arg0];
        for (int var4 = 0; var4 < this.field3894; var4++) {
            int var5 = this.field3916[var4] * var2 + this.field3904[var4] * var3 >> 16;
            this.field3916[var4] = this.field3916[var4] * var3 - this.field3904[var4] * var2 >> 16;
            this.field3904[var4] = var5;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIFFF)[F", line = 1409)
    private static final float[] method1825(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(SS)V", line = 1476)
    public final void method1826(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3919; var3++) {
            if (this.field3897[var3] == arg0) {
                this.field3897[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class184.field2543.method666(arg0 & 0xFFFF, 66);
            var5 = class184.field2543.method674(255, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class184.field2543.method666(arg1 & 0xFFFF, -121);
            var7 = class184.field2543.method674(255, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3918.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "()V", line = 1513)
    public final void method348() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            this.field3904[var1] = -this.field3904[var1];
            this.field3886[var1] = -this.field3886[var1];
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1525)
    private static final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3943 = var18;
        field3939 = var19;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 1603)
    public final int method105() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3063;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 4543)
    private class267() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ldl;IIZ)V", line = 4545)
    public class267(class308 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field4606];
        this.field3922 = new int[arg0.field4634 + 1];
        for (int var6 = 0; var6 < arg0.field4606; var6++) {
            if ((arg0.field4639 == null || arg0.field4639[var6] != 2) && (arg0.field4646 == null || arg0.field4646[var6] == -1 || !class184.field2543.method675((byte) 105, arg0.field4646[var6] & 0xFFFF))) {
                var5[this.field3919++] = var6;
                this.field3922[arg0.field4607[var6]]++;
                this.field3922[arg0.field4610[var6]]++;
                this.field3922[arg0.field4613[var6]]++;
            }
        }
        long[] var7 = new long[this.field3919];
        for (int var8 = 0; var8 < this.field3919; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field4646 != null) {
                var14 = arg0.field4646[var9];
                if (var14 != -1) {
                    var12 = class184.field2543.method667(109, var14 & 0xFFFF);
                    var13 = class184.field2543.method677((byte) 115, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field4649 != null && arg0.field4649[var9] != 0 || var14 != -1 && !class184.field2543.method676(var14 & 0xFFFF, true);
            if ((arg3 || var15) && arg0.field4608 != null) {
                var10 += arg0.field4608[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class216.method1495(var5, 0, var7);
        this.field3894 = arg0.field4634;
        this.field3892 = arg0.field4650;
        this.field3904 = arg0.field4626;
        this.field3916 = arg0.field4622;
        this.field3886 = arg0.field4642;
        this.field3898 = arg0.field4648;
        this.field3921 = arg0.field4652;
        int var20 = this.field3919 * 3;
        this.field3910 = new short[var20];
        this.field3906 = new short[var20];
        this.field3913 = new short[var20];
        this.field3917 = new short[var20];
        this.field3905 = new float[var20];
        this.field3896 = new float[var20];
        this.field3920 = new short[this.field3919];
        this.field3923 = new byte[this.field3919];
        this.field3891 = new short[this.field3919];
        this.field3901 = new short[this.field3919];
        this.field3924 = new short[this.field3919];
        this.field3897 = new short[this.field3919];
        if (arg0.field4620 != null) {
            this.field3912 = new byte[this.field3919];
        }
        if (arg0.field4615 != null) {
            this.field3902 = new short[this.field3919];
        }
        this.field3915 = new class212();
        this.field3890 = new class342();
        this.field3918 = new class342();
        if (class314.field4736) {
            this.field3900 = new class342();
        }
        this.field3925 = new class342();
        this.field3908 = new class342();
        this.field3899 = (short) arg1;
        this.field3885 = (short) arg2;
        this.field3926 = new short[var20];
        field3911 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field3892; var22++) {
            int var23 = this.field3922[var22];
            this.field3922[var22] = var21;
            var21 += var23;
        }
        this.field3922[this.field3892] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field4641 != null) {
            int var28 = arg0.field4604;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3919; var36++) {
                int var37 = var5[var36];
                if (arg0.field4641[var37] != -1) {
                    int var38 = arg0.field4641[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field4607[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field4610[var37];
                        } else {
                            var40 = arg0.field4613[var37];
                        }
                        int var41 = arg0.field4626[var40];
                        int var42 = arg0.field4622[var40];
                        int var43 = arg0.field4642[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field4645[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field4611[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field4614[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field4611[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field4614[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field4625[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field4611[var44] / 1024.0F;
                        var49 = (float) arg0.field4614[var44] / 1024.0F;
                        var48 = (float) arg0.field4625[var44] / 1024.0F;
                    }
                    var27[var44] = method1825(arg0.field4624[var44], arg0.field4654[var44], arg0.field4655[var44], arg0.field4635[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3919; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field4627[var51] & 0xFFFF;
            short var53;
            if (arg0.field4646 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field4646[var51];
            }
            int var54;
            if (arg0.field4641 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field4641[var51];
            }
            int var55;
            if (arg0.field4649 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field4649[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field4645[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field4607[var51];
                        int var67 = arg0.field4610[var51];
                        int var68 = arg0.field4613[var51];
                        short var69 = arg0.field4624[var54];
                        short var70 = arg0.field4654[var54];
                        short var71 = arg0.field4655[var54];
                        float var72 = (float) arg0.field4626[var69];
                        float var73 = (float) arg0.field4622[var69];
                        float var74 = (float) arg0.field4642[var69];
                        float var75 = (float) arg0.field4626[var70] - var72;
                        float var76 = (float) arg0.field4622[var70] - var73;
                        float var77 = (float) arg0.field4642[var70] - var74;
                        float var78 = (float) arg0.field4626[var71] - var72;
                        float var79 = (float) arg0.field4622[var71] - var73;
                        float var80 = (float) arg0.field4642[var71] - var74;
                        float var81 = (float) arg0.field4626[var66] - var72;
                        float var82 = (float) arg0.field4622[var66] - var73;
                        float var83 = (float) arg0.field4642[var66] - var74;
                        float var84 = (float) arg0.field4626[var67] - var72;
                        float var85 = (float) arg0.field4622[var67] - var73;
                        float var86 = (float) arg0.field4642[var67] - var74;
                        float var87 = (float) arg0.field4626[var68] - var72;
                        float var88 = (float) arg0.field4622[var68] - var73;
                        float var89 = (float) arg0.field4642[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field4607[var51];
                        int var102 = arg0.field4610[var51];
                        int var103 = arg0.field4613[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field4644[var54];
                        float var109 = (float) arg0.field4647[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field4625[var54] & 0xFFFF) / 1024.0F;
                            method1833(arg0.field4626[var101], arg0.field4622[var101], arg0.field4642[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3945;
                            var57 = field3937;
                            method1833(arg0.field4626[var102], arg0.field4622[var102], arg0.field4642[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3945;
                            var59 = field3937;
                            method1833(arg0.field4626[var103], arg0.field4622[var103], arg0.field4642[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3945;
                            var61 = field3937;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field4636[var54] / 256.0F;
                            float var113 = (float) arg0.field4637[var54] / 256.0F;
                            int var114 = arg0.field4626[var102] - arg0.field4626[var101];
                            int var115 = arg0.field4622[var102] - arg0.field4622[var101];
                            int var116 = arg0.field4642[var102] - arg0.field4642[var101];
                            int var117 = arg0.field4626[var103] - arg0.field4626[var101];
                            int var118 = arg0.field4622[var103] - arg0.field4622[var101];
                            int var119 = arg0.field4642[var103] - arg0.field4642[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field4611[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field4614[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field4625[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1818(var126, var127, var128);
                            method1827(arg0.field4626[var101], arg0.field4622[var101], arg0.field4642[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3943;
                            var57 = field3939;
                            method1827(arg0.field4626[var102], arg0.field4622[var102], arg0.field4642[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3943;
                            var59 = field3939;
                            method1827(arg0.field4626[var103], arg0.field4622[var103], arg0.field4642[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3943;
                            var61 = field3939;
                        } else if (var65 == 3) {
                            method1835(arg0.field4626[var101], arg0.field4622[var101], arg0.field4642[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3935;
                            var57 = field3936;
                            method1835(arg0.field4626[var102], arg0.field4622[var102], arg0.field4642[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3935;
                            var59 = field3936;
                            method1835(arg0.field4626[var103], arg0.field4622[var103], arg0.field4642[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3935;
                            var61 = field3936;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method2115();
            byte var129;
            if (arg0.field4639 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field4639[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field4607[var51];
                class122 var133 = arg0.field4605[var132];
                this.field3891[var50] = this.method1824(arg0, var132, var130, var133.field1650, var133.field1651, var133.field1645, var133.field1649, var56, var57);
                int var134 = arg0.field4610[var51];
                class122 var135 = arg0.field4605[var134];
                this.field3901[var50] = this.method1824(arg0, var134, (long) var62 + var130, var135.field1650, var135.field1651, var135.field1645, var135.field1649, var58, var59);
                int var136 = arg0.field4613[var51];
                class122 var137 = arg0.field4605[var136];
                this.field3924[var50] = this.method1824(arg0, var136, (long) var63 + var130, var137.field1650, var137.field1651, var137.field1645, var137.field1649, var60, var61);
            } else if (var129 == 1) {
                class1 var138 = arg0.field4609[var51];
                long var139 = (long) ((var54 << 2) + (var138.field8 > 0 ? 1024 : 2048) + (var138.field6 + 256 << 12) + (var138.field3 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3891[var50] = this.method1824(arg0, arg0.field4607[var51], var139, var138.field8, var138.field6, var138.field3, 0, var56, var57);
                this.field3901[var50] = this.method1824(arg0, arg0.field4610[var51], (long) var62 + var139, var138.field8, var138.field6, var138.field3, 0, var58, var59);
                this.field3924[var50] = this.method1824(arg0, arg0.field4613[var51], (long) var63 + var139, var138.field8, var138.field6, var138.field3, 0, var60, var61);
            }
            if (arg0.field4646 == null) {
                this.field3897[var50] = -1;
            } else {
                this.field3897[var50] = arg0.field4646[var51];
            }
            if (this.field3912 != null) {
                this.field3912[var50] = (byte) arg0.field4620[var51];
            }
            this.field3920[var50] = arg0.field4627[var51];
            if (arg0.field4649 != null) {
                this.field3923[var50] = arg0.field4649[var51];
            }
            if (arg0.field4615 != null) {
                this.field3902[var50] = arg0.field4615[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3919; var143++) {
            short var144 = this.field3897[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3888 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3919; var147++) {
            short var148 = this.field3897[var147];
            if (var146 != var148) {
                this.field3888[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3888[var145] = this.field3919;
        field3911 = null;
        this.field3910 = method1821(this.field3910, this.field3895);
        this.field3906 = method1821(this.field3906, this.field3895);
        this.field3913 = method1821(this.field3913, this.field3895);
        this.field3917 = method1821(this.field3917, this.field3895);
        this.field3905 = method1813(this.field3905, this.field3895);
        this.field3896 = method1813(this.field3896, this.field3895);
    }

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "()I", line = 1618)
    public final int method319() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3069;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 1624)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        if (this.field3895 == 0) {
            return;
        }
        if (!this.field3915.field3065) {
            this.method1820();
        }
        short var13 = this.field3915.field3069;
        short var14 = this.field3915.field3063;
        short var15 = this.field3915.field3067;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class313.field4731) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class324.field4913) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class99.field1344) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class185.field2556) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class184.field2538[arg0];
            var27 = class184.field2532[arg0];
        }
        if (arg8 > 0L && class17.field239 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class89.field1252 >= var28 && class89.field1252 <= var29 && class174.field2376 >= var30 && class174.field2376 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field3915.field3070;
                short var37 = this.field3915.field3064;
                short var38 = this.field3915.field3066;
                short var39 = this.field3915.field3068;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class89.field1252 >= var32 && class89.field1252 <= var33 && class174.field2376 >= var34 && class174.field2376 <= var35) {
                    if (this.field5357) {
                        class13.field137[class188.field2600++] = arg8;
                    } else {
                        if (field3940.length < this.field3895) {
                            field3940 = new int[this.field3895];
                            field3946 = new int[this.field3895];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field3892) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field3919) {
                                        break label118;
                                    }
                                    short var80 = this.field3891[var79];
                                    short var81 = this.field3901[var79];
                                    short var82 = this.field3924[var79];
                                    if (this.method1843(class89.field1252, class174.field2376, field3946[var80], field3946[var81], field3946[var82], field3940[var80], field3940[var81], field3940[var82])) {
                                        class13.field137[class188.field2600++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field3904[var59];
                            int var61 = this.field3916[var59];
                            int var62 = this.field3886[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field3922[var59];
                            int var76 = this.field3922[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field3926[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field3940[var78] = var73;
                                field3946[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class67.field899;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1831();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V", line = 1897)
    public final void method1828(int arg0) {
        this.field3899 = (short) arg0;
        this.field3918.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "()V", line = 1901)
    public static final void method1829() {
        field3928 = new class267();
        field3929 = new class267();
        field3931 = new class267();
        field3932 = new class267();
        field3933 = new class267();
        field3934 = new class267();
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()I", line = 1909)
    public final int method347() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3064;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZZZZ)V", line = 1916)
    private final void method1830(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3890.field5125 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3918.field5125 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3900.field5125 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3925.field5125 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3909.field4798.length < this.field3895 * var6) {
            field3909 = new class316((this.field3895 + 100) * var6);
        } else {
            field3909.field4777 = 0;
        }
        if (arg1) {
            if (class67.field916) {
                for (int var7 = 0; var7 < this.field3892; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3904[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3916[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3886[var7]);
                    int var11 = this.field3922[var7];
                    int var12 = this.field3922[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3926[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3909.field4777 = var6 * var14;
                        field3909.method2188(255, var8);
                        field3909.method2188(255, var9);
                        field3909.method2188(255, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3892; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3904[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3916[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3886[var15]);
                    int var19 = this.field3922[var15];
                    int var20 = this.field3922[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3926[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3909.field4777 = var6 * var22;
                        field3909.method2155(var16, -120);
                        field3909.method2155(var17, -103);
                        field3909.method2155(var18, -128);
                    }
                }
            }
        }
        if (arg2) {
            if (class314.field4736) {
                for (int var42 = 0; var42 < this.field3919; var42++) {
                    int var43 = method1836(this.field3920[var42], this.field3897[var42], this.field3899, this.field3923[var42]);
                    field3909.field4777 = this.field3891[var42] * var6 + this.field3918.field5125;
                    field3909.method2188(255, var43);
                    field3909.field4777 = this.field3901[var42] * var6 + this.field3918.field5125;
                    field3909.method2188(255, var43);
                    field3909.field4777 = this.field3924[var42] * var6 + this.field3918.field5125;
                    field3909.method2188(255, var43);
                }
            } else {
                int var23 = (int) class139.field1912[0];
                int var24 = (int) class139.field1912[1];
                int var25 = (int) class139.field1912[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3899 * 1.3F);
                int var28 = this.field3885 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3919; var29++) {
                    short var30 = this.field3891[var29];
                    short var31 = this.field3917[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3913[var30] * var25 + this.field3910[var30] * var23 + this.field3906[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3913[var30] * var25 + this.field3910[var30] * var23 + this.field3906[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3917[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3901[var29];
                    short var34 = this.field3917[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3913[var33] * var25 + this.field3910[var33] * var23 + this.field3906[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3913[var33] * var25 + this.field3910[var33] * var23 + this.field3906[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3917[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3924[var29];
                    short var37 = this.field3917[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3913[var36] * var25 + this.field3910[var36] * var23 + this.field3906[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3913[var36] * var25 + this.field3910[var36] * var23 + this.field3906[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3917[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1836(this.field3920[var29], this.field3897[var29], var32, this.field3923[var29]);
                    int var40 = method1836(this.field3920[var29], this.field3897[var29], var35, this.field3923[var29]);
                    int var41 = method1836(this.field3920[var29], this.field3897[var29], var38, this.field3923[var29]);
                    field3909.field4777 = var6 * var30 + this.field3918.field5125;
                    field3909.method2188(255, var39);
                    field3909.field4777 = var6 * var33 + this.field3918.field5125;
                    field3909.method2188(255, var40);
                    field3909.field4777 = var6 * var36 + this.field3918.field5125;
                    field3909.method2188(255, var41);
                }
                this.field3910 = null;
                this.field3906 = null;
                this.field3913 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3885;
            float var45 = 3.0F / (float) (this.field3885 / 2 + this.field3885);
            field3909.field4777 = this.field3900.field5125;
            if (class67.field916) {
                for (int var46 = 0; var46 < this.field3895; var46++) {
                    short var47 = this.field3917[var46];
                    if (var47 == 0) {
                        field3909.method2213(-1, (float) this.field3910[var46] * var45);
                        field3909.method2213(-1, (float) this.field3906[var46] * var45);
                        field3909.method2213(-1, (float) this.field3913[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3909.method2213(-1, (float) this.field3910[var46] * var48);
                        field3909.method2213(-1, (float) this.field3906[var46] * var48);
                        field3909.method2213(-1, (float) this.field3913[var46] * var48);
                    }
                    field3909.field4777 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3895; var49++) {
                    short var50 = this.field3917[var49];
                    if (var50 == 0) {
                        field3909.method2171(-1365938680, (float) this.field3910[var49] * var45);
                        field3909.method2171(-1365938680, (float) this.field3906[var49] * var45);
                        field3909.method2171(-1365938680, (float) this.field3913[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3909.method2171(-1365938680, (float) this.field3910[var49] * var51);
                        field3909.method2171(-1365938680, (float) this.field3906[var49] * var51);
                        field3909.method2171(-1365938680, (float) this.field3913[var49] * var51);
                    }
                    field3909.field4777 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3909.field4777 = this.field3925.field5125;
            if (class67.field916) {
                for (int var52 = 0; var52 < this.field3895; var52++) {
                    field3909.method2213(-1, this.field3905[var52]);
                    field3909.method2213(-1, this.field3896[var52]);
                    field3909.field4777 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3895; var53++) {
                    field3909.method2171(-1365938680, this.field3905[var53]);
                    field3909.method2171(-1365938680, this.field3896[var53]);
                    field3909.field4777 += var6 - 8;
                }
            }
        }
        field3909.field4777 = this.field3895 * var6;
        if (arg0) {
            if (class67.field906) {
                ByteBuffer var54 = ByteBuffer.wrap(field3909.field4798, 0, field3909.field4777);
                if (this.field3914 == null) {
                    this.field3914 = new class305(true);
                    this.field3914.method2075(var54);
                } else {
                    this.field3914.method2078(var54);
                }
                if (arg1) {
                    this.field3890.field5120 = true;
                    this.field3890.field5122 = null;
                    this.field3890.field5115 = this.field3914;
                    this.field3890.field5116 = var6;
                }
                if (arg2) {
                    this.field3918.field5120 = true;
                    this.field3918.field5122 = null;
                    this.field3918.field5115 = this.field3914;
                    this.field3918.field5116 = var6;
                }
                if (arg3) {
                    this.field3900.field5120 = true;
                    this.field3900.field5122 = null;
                    this.field3900.field5115 = this.field3914;
                    this.field3900.field5116 = var6;
                }
                if (arg4) {
                    this.field3925.field5120 = true;
                    this.field3925.field5122 = null;
                    this.field3925.field5115 = this.field3914;
                    this.field3925.field5116 = var6;
                }
            } else {
                if (field3927 == null || field3927.capacity() < field3909.field4777) {
                    field3927 = ByteBuffer.allocateDirect(var6 * 100 + field3909.field4777);
                } else {
                    field3927.clear();
                }
                field3927.put(field3909.field4798, 0, field3909.field4777);
                field3927.flip();
                if (arg1) {
                    this.field3890.field5120 = true;
                    this.field3890.field5122 = field3927;
                    this.field3890.field5115 = null;
                    this.field3890.field5116 = var6;
                }
                if (arg2) {
                    this.field3918.field5120 = true;
                    this.field3918.field5122 = field3927;
                    this.field3890.field5115 = null;
                    this.field3918.field5116 = var6;
                }
                if (arg3) {
                    this.field3900.field5120 = true;
                    this.field3900.field5122 = field3927;
                    this.field3900.field5115 = null;
                    this.field3900.field5116 = var6;
                }
                if (arg4) {
                    this.field3925.field5120 = true;
                    this.field3925.field5122 = field3927;
                    this.field3925.field5115 = null;
                    this.field3925.field5116 = var6;
                }
            }
        } else if (class67.field914) {
            class305 var55 = new class305();
            ByteBuffer var56 = ByteBuffer.wrap(field3909.field4798, 0, field3909.field4777);
            var55.method2075(var56);
            if (arg1) {
                this.field3890.field5120 = true;
                this.field3890.field5122 = null;
                this.field3890.field5115 = var55;
                this.field3890.field5116 = var6;
            }
            if (arg2) {
                this.field3918.field5120 = true;
                this.field3918.field5122 = null;
                this.field3918.field5115 = var55;
                this.field3918.field5116 = var6;
            }
            if (arg3) {
                this.field3900.field5120 = true;
                this.field3900.field5122 = null;
                this.field3900.field5115 = var55;
                this.field3900.field5116 = var6;
            }
            if (arg4) {
                this.field3925.field5120 = true;
                this.field3925.field5122 = null;
                this.field3925.field5115 = var55;
                this.field3925.field5116 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3909.field4777);
            var57.put(field3909.field4798, 0, field3909.field4777);
            var57.flip();
            if (arg1) {
                this.field3890.field5120 = true;
                this.field3890.field5122 = var57;
                this.field3890.field5115 = null;
                this.field3890.field5116 = var6;
            }
            if (arg2) {
                this.field3918.field5120 = true;
                this.field3918.field5122 = var57;
                this.field3890.field5115 = null;
                this.field3918.field5116 = var6;
            }
            if (arg3) {
                this.field3900.field5120 = true;
                this.field3900.field5122 = var57;
                this.field3900.field5115 = null;
                this.field3900.field5116 = var6;
            }
            if (arg4) {
                this.field3925.field5120 = true;
                this.field3925.field5122 = var57;
                this.field3925.field5115 = null;
                this.field3925.field5116 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "()V", line = 2449)
    private final void method1831() {
        GL var1 = class67.field899;
        if (this.field3919 == 0) {
            return;
        }
        if (this.field3930 != 0) {
            this.method1830(true, !this.field3890.field5120 && (this.field3930 & 0x1) != 0, !this.field3918.field5120 && (this.field3930 & 0x2) != 0, this.field3900 != null && !this.field3900.field5120 && (this.field3930 & 0x4) != 0, false);
        }
        this.method1830(false, !this.field3890.field5120, !this.field3918.field5120, this.field3900 != null && !this.field3900.field5120, !this.field3925.field5120);
        if (!this.field3908.field5120) {
            this.method1842();
        }
        if (this.field3907 != 0) {
            if ((this.field3907 & 0x1) != 0) {
                this.field3904 = null;
                this.field3916 = null;
                this.field3886 = null;
                this.field3926 = null;
                this.field3922 = null;
            }
            if ((this.field3907 & 0x2) != 0) {
                this.field3920 = null;
                this.field3923 = null;
            }
            if ((this.field3907 & 0x4) != 0) {
                this.field3910 = null;
                this.field3906 = null;
                this.field3913 = null;
                this.field3917 = null;
            }
            if ((this.field3907 & 0x8) != 0) {
                this.field3905 = null;
                this.field3896 = null;
            }
            if ((this.field3907 & 0x10) != 0) {
                this.field3891 = null;
                this.field3901 = null;
                this.field3924 = null;
            }
            this.field3907 = 0;
        }
        class305 var2 = null;
        if (this.field3890.field5115 != null) {
            this.field3890.field5115.method2076();
            var2 = this.field3890.field5115;
            var1.glVertexPointer(3, 5126, this.field3890.field5116, (long) this.field3890.field5125);
        }
        if (this.field3918.field5115 != null) {
            if (this.field3918.field5115 != var2) {
                this.field3918.field5115.method2076();
                var2 = this.field3918.field5115;
            }
            var1.glColorPointer(4, 5121, this.field3918.field5116, (long) this.field3918.field5125);
        }
        if (class314.field4736 && this.field3900.field5115 != null) {
            if (this.field3900.field5115 != var2) {
                this.field3900.field5115.method2076();
                var2 = this.field3900.field5115;
            }
            var1.glNormalPointer(5126, this.field3900.field5116, (long) this.field3900.field5125);
        }
        if (this.field3925.field5115 != null) {
            if (this.field3925.field5115 != var2) {
                this.field3925.field5115.method2076();
                class305 var3 = this.field3925.field5115;
            }
            var1.glTexCoordPointer(2, 5126, this.field3925.field5116, (long) this.field3925.field5125);
        }
        if (this.field3908.field5115 != null) {
            this.field3908.field5115.method2077();
        }
        if (this.field3890.field5115 == null || this.field3918.field5115 == null || class314.field4736 && this.field3900.field5115 == null || this.field3925.field5115 == null) {
            if (class67.field914) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3890.field5115 == null) {
                this.field3890.field5122.position(this.field3890.field5125);
                var1.glVertexPointer(3, 5126, this.field3890.field5116, this.field3890.field5122);
            }
            if (this.field3918.field5115 == null) {
                this.field3918.field5122.position(this.field3918.field5125);
                var1.glColorPointer(4, 5121, this.field3918.field5116, this.field3918.field5122);
            }
            if (class314.field4736 && this.field3900.field5115 == null) {
                this.field3900.field5122.position(this.field3900.field5125);
                var1.glNormalPointer(5126, this.field3900.field5116, this.field3900.field5122);
            }
            if (this.field3925.field5115 == null) {
                this.field3925.field5122.position(this.field3925.field5125);
                var1.glTexCoordPointer(2, 5126, this.field3925.field5116, this.field3925.field5122);
            }
        }
        if (this.field3908.field5115 == null && class67.field914) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3888.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3888[var5];
            int var7 = this.field3888[var5 + 1];
            short var8 = this.field3897[var6];
            if (var8 == -1) {
                class67.method479(-1);
                class123.method884(0, 0, -30);
            } else {
                class184.field2543.method672(var8 & 0xFFFF, 255);
            }
            if (this.field3908.field5115 == null) {
                this.field3908.field5122.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3908.field5122);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZZLkl;Lkl;)Lq;", line = 2622)
    private final class345 method1832(boolean arg0, boolean arg1, boolean arg2, class267 arg3, class267 arg4) {
        arg3.field3894 = this.field3894;
        arg3.field3892 = this.field3892;
        arg3.field3895 = this.field3895;
        arg3.field3919 = this.field3919;
        arg3.field3899 = this.field3899;
        arg3.field3885 = this.field3885;
        arg3.field3930 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field3904 == null || arg3.field3904.length < this.field3894) {
            arg3.field3904 = new int[this.field3894 + 100];
            arg3.field3916 = new int[this.field3894 + 100];
            arg3.field3886 = new int[this.field3894 + 100];
        }
        for (int var6 = 0; var6 < this.field3894; var6++) {
            arg3.field3904[var6] = this.field3904[var6];
            arg3.field3916[var6] = this.field3916[var6];
            arg3.field3886[var6] = this.field3886[var6];
        }
        if (arg3.field3890 == null) {
            arg3.field3890 = new class342();
        }
        arg3.field3890.field5120 = false;
        if (arg3.field3915 == null) {
            arg3.field3915 = new class212();
        }
        arg3.field3915.field3065 = false;
        if (arg0) {
            arg3.field3923 = this.field3923;
        } else {
            if (arg4.field3923 == null || arg4.field3923.length < this.field3919) {
                arg4.field3923 = new byte[this.field3919 + 100];
            }
            arg3.field3923 = arg4.field3923;
            for (int var7 = 0; var7 < this.field3919; var7++) {
                arg3.field3923[var7] = this.field3923[var7];
            }
        }
        if (arg1) {
            arg3.field3920 = this.field3920;
        } else {
            if (arg4.field3920 == null || arg4.field3920.length < this.field3919) {
                arg4.field3920 = new short[this.field3919 + 100];
            }
            arg3.field3920 = arg4.field3920;
            for (int var8 = 0; var8 < this.field3919; var8++) {
                arg3.field3920[var8] = this.field3920[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field3918 = this.field3918;
        } else {
            if (arg4.field3918 == null) {
                arg4.field3918 = new class342();
            }
            arg3.field3918 = arg4.field3918;
            arg3.field3918.field5120 = false;
        }
        if (arg2 || this.field3910 == null) {
            arg3.field3910 = this.field3910;
            arg3.field3906 = this.field3906;
            arg3.field3913 = this.field3913;
            arg3.field3917 = this.field3917;
            arg3.field3900 = this.field3900;
        } else {
            if (arg4.field3910 == null || arg4.field3910.length < this.field3895) {
                arg4.field3910 = new short[this.field3895 + 100];
                arg4.field3906 = new short[this.field3895 + 100];
                arg4.field3913 = new short[this.field3895 + 100];
                arg4.field3917 = new short[this.field3895 + 100];
            }
            arg3.field3910 = arg4.field3910;
            arg3.field3906 = arg4.field3906;
            arg3.field3913 = arg4.field3913;
            arg3.field3917 = arg4.field3917;
            for (int var9 = 0; var9 < this.field3895; var9++) {
                arg3.field3910[var9] = this.field3910[var9];
                arg3.field3906[var9] = this.field3906[var9];
                arg3.field3913[var9] = this.field3913[var9];
                arg3.field3917[var9] = this.field3917[var9];
            }
            if (class314.field4736) {
                if (arg4.field3900 == null) {
                    arg4.field3900 = new class342();
                }
                arg3.field3900 = arg4.field3900;
                arg3.field3900.field5120 = false;
            } else {
                arg3.field3900 = null;
            }
        }
        arg3.field3905 = this.field3905;
        arg3.field3896 = this.field3896;
        arg3.field3898 = this.field3898;
        arg3.field3893 = this.field3893;
        arg3.field3891 = this.field3891;
        arg3.field3901 = this.field3901;
        arg3.field3924 = this.field3924;
        arg3.field3897 = this.field3897;
        arg3.field3912 = this.field3912;
        arg3.field3903 = this.field3903;
        arg3.field3925 = this.field3925;
        arg3.field3908 = this.field3908;
        arg3.field3888 = this.field3888;
        arg3.field3926 = this.field3926;
        arg3.field3922 = this.field3922;
        arg3.field5357 = this.field5357;
        arg3.field3921 = this.field3921;
        arg3.field3902 = this.field3902;
        return arg3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2776)
    private static final void method1833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3945 = var16;
        field3937 = var17;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)V", line = 2823)
    public final void method334(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3894; var4++) {
            this.field3904[var4] += arg0;
            this.field3916[var4] += arg1;
            this.field3886[var4] += arg2;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "()V", line = 2839)
    public final void method1834() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            this.field3886[var1] = -this.field3886[var1];
        }
        if (this.field3913 != null) {
            for (int var2 = 0; var2 < this.field3895; var2++) {
                this.field3913[var2] = (short) (-this.field3913[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3919; var3++) {
            short var4 = this.field3891[var3];
            this.field3891[var3] = this.field3924[var3];
            this.field3924[var3] = var4;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
        this.field3908.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII[FIF)V", line = 2876)
    private static final void method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3935 = var16;
        field3936 = var17;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ISIB)I", line = 2923)
    private static final int method1836(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class184.field2527[class50.method311(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class184.field2543.method666(arg1 & 0xFFFF, 125);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class184.field2543.method674(255, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "()V", line = 2985)
    public final void method1837() {
        if (this.field3910 == null) {
            this.method315();
            return;
        }
        for (int var1 = 0; var1 < this.field3894; var1++) {
            int var2 = this.field3886[var1];
            this.field3886[var1] = this.field3904[var1];
            this.field3904[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3895; var3++) {
            short var4 = this.field3913[var3];
            this.field3913[var3] = this.field3910[var3];
            this.field3910[var3] = (short) (-var4);
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "()I", line = 3022)
    public final int method1838() {
        return this.field3885;
    }

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "()I", line = 3033)
    public final int method312() {
        if (!this.field3915.field3065) {
            this.method1820();
        }
        return this.field3915.field3067;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(ZZZ)Lq;", line = 3041)
    public final class345 method323(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1832(arg0, arg1, arg2, field3932, field3931);
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)V", line = 3044)
    public final void method1839(int arg0) {
        if (this.field3910 == null) {
            this.method335(arg0);
            return;
        }
        int var2 = class184.field2538[arg0];
        int var3 = class184.field2532[arg0];
        for (int var4 = 0; var4 < this.field3894; var4++) {
            int var5 = this.field3904[var4] * var3 + this.field3886[var4] * var2 >> 16;
            this.field3886[var4] = this.field3886[var4] * var3 - this.field3904[var4] * var2 >> 16;
            this.field3904[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3895; var6++) {
            int var7 = this.field3913[var6] * var2 + this.field3910[var6] * var3 >> 16;
            this.field3913[var6] = (short) (this.field3913[var6] * var3 - this.field3910[var6] * var2 >> 16);
            this.field3910[var6] = (short) var7;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Ldn;", line = 3085)
    public final class132 method939(int arg0, int arg1, int arg2) {
        this.field3889 = false;
        if (this.field3887 != null) {
            this.field3910 = this.field3887.field793;
            this.field3906 = this.field3887.field790;
            this.field3913 = this.field3887.field791;
            this.field3917 = this.field3887.field792;
            this.field3887 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 3100)
    public final void method318() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            this.field3904[var1] = this.field3904[var1] + 7 >> 4;
            this.field3916[var1] = this.field3916[var1] + 7 >> 4;
            this.field3886[var1] = this.field3886[var1] + 7 >> 4;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(ZZZ)Lq;", line = 3114)
    public final class345 method338(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1832(arg0, arg1, arg2, field3929, field3928);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZZ)Lq;", line = 3117)
    public final class345 method328(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1832(arg0, arg1, arg2, field3934, field3933);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3122)
    public final void method321(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field3942 = 0;
            field3941 = 0;
            field3944 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3893.length) {
                    int[] var16 = this.field3893[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3921 == null || (arg6 & this.field3921[var18]) != 0) {
                            field3942 += this.field3904[var18];
                            field3941 += this.field3916[var18];
                            field3944 += this.field3886[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field3942 = field3942 / var13 + var10;
                field3941 = field3941 / var13 + var11;
                field3944 = field3944 / var13 + var12;
                field3938 = true;
            } else {
                field3942 = var10;
                field3941 = var11;
                field3944 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3893.length) {
                    int[] var27 = this.field3893[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3921 == null || (arg6 & this.field3921[var29]) != 0) {
                            this.field3904[var29] += var22;
                            this.field3916[var29] += var23;
                            this.field3886[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field3893.length) {
                        int[] var92 = this.field3893[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field3921 == null || (arg6 & this.field3921[var94]) != 0) {
                                this.field3904[var94] -= field3942;
                                this.field3916[var94] -= field3941;
                                this.field3886[var94] -= field3944;
                                if (arg4 != 0) {
                                    int var95 = class184.field2538[arg4];
                                    int var96 = class184.field2532[arg4];
                                    int var97 = this.field3916[var94] * var95 + this.field3904[var94] * var96 + 32767 >> 16;
                                    this.field3916[var94] = this.field3916[var94] * var96 + 32767 - this.field3904[var94] * var95 >> 16;
                                    this.field3904[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class184.field2538[arg2];
                                    int var99 = class184.field2532[arg2];
                                    int var100 = this.field3916[var94] * var99 + 32767 - this.field3886[var94] * var98 >> 16;
                                    this.field3886[var94] = this.field3916[var94] * var98 + this.field3886[var94] * var99 + 32767 >> 16;
                                    this.field3916[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class184.field2538[arg3];
                                    int var102 = class184.field2532[arg3];
                                    int var103 = this.field3904[var94] * var102 + this.field3886[var94] * var101 + 32767 >> 16;
                                    this.field3886[var94] = this.field3886[var94] * var102 + 32767 - this.field3904[var94] * var101 >> 16;
                                    this.field3904[var94] = var103;
                                }
                                this.field3904[var94] += field3942;
                                this.field3916[var94] += field3941;
                                this.field3886[var94] += field3944;
                            }
                        }
                    }
                }
                if (arg5 && this.field3910 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field3893.length) {
                            int[] var106 = this.field3893[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field3921 == null || (arg6 & this.field3921[var108]) != 0) {
                                    int var109 = this.field3922[var108];
                                    int var110 = this.field3922[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field3926[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class184.field2538[arg4];
                                            int var114 = class184.field2532[arg4];
                                            int var115 = this.field3910[var112] * var114 + this.field3906[var112] * var113 + 32767 >> 16;
                                            this.field3906[var112] = (short) (this.field3906[var112] * var114 + 32767 - this.field3910[var112] * var113 >> 16);
                                            this.field3910[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class184.field2538[arg2];
                                            int var117 = class184.field2532[arg2];
                                            int var118 = this.field3906[var112] * var117 + 32767 - this.field3913[var112] * var116 >> 16;
                                            this.field3913[var112] = (short) (this.field3913[var112] * var117 + this.field3906[var112] * var116 + 32767 >> 16);
                                            this.field3906[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class184.field2538[arg3];
                                            int var120 = class184.field2532[arg3];
                                            int var121 = this.field3913[var112] * var119 + this.field3910[var112] * var120 + 32767 >> 16;
                                            this.field3913[var112] = (short) (this.field3913[var112] * var120 + 32767 - this.field3910[var112] * var119 >> 16);
                                            this.field3910[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3900 != null) {
                        this.field3900.field5120 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field3938) {
                    int var36 = arg7[6] * field3944 + arg7[0] * field3942 + arg7[3] * field3941 + 16384 >> 15;
                    int var37 = arg7[7] * field3944 + arg7[1] * field3942 + arg7[4] * field3941 + 16384 >> 15;
                    int var38 = arg7[8] * field3944 + arg7[2] * field3942 + arg7[5] * field3941 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field3942 = var39;
                    field3941 = var40;
                    field3944 = var41;
                    field3938 = false;
                }
                int[] var42 = new int[9];
                int var43 = class184.field2532[arg2] >> 1;
                int var44 = class184.field2538[arg2] >> 1;
                int var45 = class184.field2532[arg3] >> 1;
                int var46 = class184.field2538[arg3] >> 1;
                int var47 = class184.field2532[arg4] >> 1;
                int var48 = class184.field2538[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field3944 + var42[0] * -field3942 + var42[1] * -field3941 + 16384 >> 15;
                int var52 = var42[5] * -field3944 + var42[3] * -field3942 + var42[4] * -field3941 + 16384 >> 15;
                int var53 = var42[8] * -field3944 + var42[6] * -field3942 + var42[7] * -field3941 + 16384 >> 15;
                int var54 = field3942 + var51;
                int var55 = field3941 + var52;
                int var56 = field3944 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field3893.length) {
                        int[] var81 = this.field3893[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field3921 == null || (arg6 & this.field3921[var83]) != 0) {
                                int var84 = this.field3886[var83] * var68[2] + this.field3916[var83] * var68[1] + this.field3904[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field3886[var83] * var68[5] + this.field3916[var83] * var68[4] + this.field3904[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field3886[var83] * var68[8] + this.field3916[var83] * var68[7] + this.field3904[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field3904[var83] = var87;
                                this.field3916[var83] = var88;
                                this.field3886[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3893.length) {
                        int[] var174 = this.field3893[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3921 == null || (arg6 & this.field3921[var176]) != 0) {
                                this.field3904[var176] -= field3942;
                                this.field3916[var176] -= field3941;
                                this.field3886[var176] -= field3944;
                                this.field3904[var176] = this.field3904[var176] * arg2 >> 7;
                                this.field3916[var176] = this.field3916[var176] * arg3 >> 7;
                                this.field3886[var176] = this.field3886[var176] * arg4 >> 7;
                                this.field3904[var176] += field3942;
                                this.field3916[var176] += field3941;
                                this.field3886[var176] += field3944;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field3938) {
                    int var128 = arg7[6] * field3944 + arg7[0] * field3942 + arg7[3] * field3941 + 16384 >> 15;
                    int var129 = arg7[7] * field3944 + arg7[1] * field3942 + arg7[4] * field3941 + 16384 >> 15;
                    int var130 = arg7[8] * field3944 + arg7[2] * field3942 + arg7[5] * field3941 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field3942 = var131;
                    field3941 = var132;
                    field3944 = var133;
                    field3938 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field3942 * var134 + 16384 >> 15;
                int var138 = -field3941 * var135 + 16384 >> 15;
                int var139 = -field3944 * var136 + 16384 >> 15;
                int var140 = field3942 + var137;
                int var141 = field3941 + var138;
                int var142 = field3944 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field3893.length) {
                        int[] var163 = this.field3893[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field3921 == null || (arg6 & this.field3921[var165]) != 0) {
                                int var166 = this.field3886[var165] * var150[2] + this.field3916[var165] * var150[1] + this.field3904[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field3886[var165] * var150[5] + this.field3916[var165] * var150[4] + this.field3904[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field3886[var165] * var150[8] + this.field3916[var165] * var150[7] + this.field3904[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field3904[var165] = var169;
                                this.field3916[var165] = var170;
                                this.field3886[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3903 != null && this.field3923 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field3903.length) {
                        int[] var179 = this.field3903[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field3902 == null || (arg6 & this.field3902[var181]) != 0) {
                                int var182 = (this.field3923[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field3923[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field3918.field5120 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3903 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field3903.length) {
                    int[] var185 = this.field3903[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field3902 == null || (arg6 & this.field3902[var187]) != 0) {
                            int var188 = this.field3920[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field3920[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field3918.field5120 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "()V", line = 3912)
    public final void method1840() {
        if (this.field3910 == null) {
            this.method348();
            return;
        }
        for (int var1 = 0; var1 < this.field3894; var1++) {
            this.field3904[var1] = -this.field3904[var1];
            this.field3886[var1] = -this.field3886[var1];
        }
        for (int var2 = 0; var2 < this.field3895; var2++) {
            this.field3910[var2] = (short) (-this.field3910[var2]);
            this.field3913[var2] = (short) (-this.field3913[var2]);
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
        if (this.field3900 != null) {
            this.field3900.field5120 = false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(SS)V", line = 3952)
    public final void method1841(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3919; var3++) {
            if (this.field3920[var3] == arg0) {
                this.field3920[var3] = arg1;
            }
        }
        this.field3918.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 3965)
    public final void method335(int arg0) {
        int var2 = class184.field2538[arg0];
        int var3 = class184.field2532[arg0];
        for (int var4 = 0; var4 < this.field3894; var4++) {
            int var5 = this.field3904[var4] * var3 + this.field3886[var4] * var2 >> 16;
            this.field3886[var4] = this.field3886[var4] * var3 - this.field3904[var4] * var2 >> 16;
            this.field3904[var4] = var5;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)V", line = 3986)
    public final void method332(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3894; var4++) {
            this.field3904[var4] = this.field3904[var4] * arg0 >> 7;
            this.field3916[var4] = this.field3916[var4] * arg1 >> 7;
            this.field3886[var4] = this.field3886[var4] * arg2 >> 7;
        }
        this.field3915.field3065 = false;
        this.field3890.field5120 = false;
    }

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "()V", line = 3999)
    private final void method1842() {
        if (field3909.field4798.length < this.field3919 * 12) {
            field3909 = new class316((this.field3919 + 100) * 12);
        } else {
            field3909.field4777 = 0;
        }
        if (class67.field916) {
            for (int var1 = 0; var1 < this.field3919; var1++) {
                field3909.method2188(255, this.field3891[var1]);
                field3909.method2188(255, this.field3901[var1]);
                field3909.method2188(255, this.field3924[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field3919; var2++) {
                field3909.method2155(this.field3891[var2], -103);
                field3909.method2155(this.field3901[var2], -122);
                field3909.method2155(this.field3924[var2], -121);
            }
        }
        if (!class67.field914) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3909.field4777);
            var5.put(field3909.field4798, 0, field3909.field4777);
            var5.flip();
            this.field3908.field5120 = true;
            this.field3908.field5122 = var5;
            this.field3908.field5115 = null;
            return;
        }
        class305 var3 = new class305();
        ByteBuffer var4 = ByteBuffer.wrap(field3909.field4798, 0, field3909.field4777);
        var3.method2075(var4);
        this.field3908.field5120 = true;
        this.field3908.field5122 = null;
        this.field3908.field5115 = var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[IIIIZ)V", line = 4061)
    public final void method325(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3942 = 0;
            field3941 = 0;
            field3944 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3893.length) {
                    int[] var14 = this.field3893[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3942 += this.field3904[var16];
                        field3941 += this.field3916[var16];
                        field3944 += this.field3886[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3942 = field3942 / var11 + var8;
                field3941 = field3941 / var11 + var9;
                field3944 = field3944 / var11 + var10;
            } else {
                field3942 = var8;
                field3941 = var9;
                field3944 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3893.length) {
                    int[] var22 = this.field3893[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3904[var24] += var17;
                        this.field3916[var24] += var18;
                        this.field3886[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3893.length) {
                    int[] var27 = this.field3893[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3904[var29] -= field3942;
                        this.field3916[var29] -= field3941;
                        this.field3886[var29] -= field3944;
                        if (arg4 != 0) {
                            int var30 = class184.field2538[arg4];
                            int var31 = class184.field2532[arg4];
                            int var32 = this.field3916[var29] * var30 + this.field3904[var29] * var31 + 32767 >> 16;
                            this.field3916[var29] = this.field3916[var29] * var31 + 32767 - this.field3904[var29] * var30 >> 16;
                            this.field3904[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class184.field2538[arg2];
                            int var34 = class184.field2532[arg2];
                            int var35 = this.field3916[var29] * var34 + 32767 - this.field3886[var29] * var33 >> 16;
                            this.field3886[var29] = this.field3916[var29] * var33 + this.field3886[var29] * var34 + 32767 >> 16;
                            this.field3916[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class184.field2538[arg3];
                            int var37 = class184.field2532[arg3];
                            int var38 = this.field3904[var29] * var37 + this.field3886[var29] * var36 + 32767 >> 16;
                            this.field3886[var29] = this.field3886[var29] * var37 + 32767 - this.field3904[var29] * var36 >> 16;
                            this.field3904[var29] = var38;
                        }
                        this.field3904[var29] += field3942;
                        this.field3916[var29] += field3941;
                        this.field3886[var29] += field3944;
                    }
                }
            }
            if (arg5 && this.field3910 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3893.length) {
                        int[] var41 = this.field3893[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3922[var43];
                            int var45 = this.field3922[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3926[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class184.field2538[arg4];
                                    int var49 = class184.field2532[arg4];
                                    int var50 = this.field3910[var47] * var49 + this.field3906[var47] * var48 + 32767 >> 16;
                                    this.field3906[var47] = (short) (this.field3906[var47] * var49 + 32767 - this.field3910[var47] * var48 >> 16);
                                    this.field3910[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class184.field2538[arg2];
                                    int var52 = class184.field2532[arg2];
                                    int var53 = this.field3906[var47] * var52 + 32767 - this.field3913[var47] * var51 >> 16;
                                    this.field3913[var47] = (short) (this.field3913[var47] * var52 + this.field3906[var47] * var51 + 32767 >> 16);
                                    this.field3906[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class184.field2538[arg3];
                                    int var55 = class184.field2532[arg3];
                                    int var56 = this.field3913[var47] * var54 + this.field3910[var47] * var55 + 32767 >> 16;
                                    this.field3913[var47] = (short) (this.field3913[var47] * var55 + 32767 - this.field3910[var47] * var54 >> 16);
                                    this.field3910[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3900 != null) {
                    this.field3900.field5120 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3893.length) {
                    int[] var59 = this.field3893[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3904[var61] -= field3942;
                        this.field3916[var61] -= field3941;
                        this.field3886[var61] -= field3944;
                        this.field3904[var61] = this.field3904[var61] * arg2 >> 7;
                        this.field3916[var61] = this.field3916[var61] * arg3 >> 7;
                        this.field3886[var61] = this.field3886[var61] * arg4 >> 7;
                        this.field3904[var61] += field3942;
                        this.field3916[var61] += field3941;
                        this.field3886[var61] += field3944;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3903 != null && this.field3923 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field3903.length) {
                        int[] var64 = this.field3903[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field3923[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field3923[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field3918.field5120 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3903 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field3903.length) {
                    int[] var70 = this.field3903[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field3920[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field3920[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field3918.field5120 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)Z", line = 4468)
    private final boolean method1843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "()Z", line = 4483)
    public final boolean method339() {
        if (this.field3893 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3894; var1++) {
            this.field3904[var1] <<= 0x4;
            this.field3916[var1] <<= 0x4;
            this.field3886[var1] <<= 0x4;
        }
        field3942 = 0;
        field3941 = 0;
        field3944 = 0;
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIJ)V", line = 4508)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field3895 == 0) {
            return;
        }
        GL var10 = class67.field899;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1831();
        var10.glPopMatrix();
    }
}
