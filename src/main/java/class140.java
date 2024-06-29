import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class140 extends class74 {

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "B")
    private byte field2108 = 0;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "B")
    private byte field2119 = 0;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    private int field2123 = 0;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Z")
    public boolean field2103 = false;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    private int field2098 = 0;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public int field2132 = 0;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "[I")
    private int[] field2107;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "[I")
    public int[] field2131;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[I")
    public int[] field2102;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "[I")
    public int[] field2128;

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "[I")
    private int[] field2141;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "[S")
    private short[] field2115;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "[S")
    private short[] field2133;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[S")
    private short[] field2127;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "[S")
    private short[] field2140;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "[S")
    private short[] field2112;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "[F")
    private float[] field2111;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "[F")
    private float[] field2110;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "[S")
    private short[] field2120;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[B")
    private byte[] field2097;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[S")
    private short[] field2100;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "[S")
    private short[] field2122;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "[S")
    private short[] field2124;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "[S")
    private short[] field2134;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "[B")
    private byte[] field2099;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "[S")
    private short[] field2117;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lsh;")
    public class33 field2101;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Llh;")
    public class233 field2104;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Llh;")
    private class233 field2126;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "Llh;")
    private class233 field2136;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Llh;")
    private class233 field2106;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Llh;")
    private class233 field2105;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "S")
    private short field2118;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "S")
    private short field2138;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "[S")
    private short[] field2114;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
    private int[] field2113;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lwm;")
    private static class254 field2096 = new class254(10000);

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Ldh;")
    private static class140 field2125 = new class140();

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "Ldh;")
    private static class140 field2137 = new class140();

    @OriginalMember(owner = "client!dh", name = "lb", descriptor = "Ldh;")
    private static class140 field2142 = new class140();

    @OriginalMember(owner = "client!dh", name = "mb", descriptor = "Ldh;")
    private static class140 field2143 = new class140();

    @OriginalMember(owner = "client!dh", name = "nb", descriptor = "Ldh;")
    private static class140 field2144 = new class140();

    @OriginalMember(owner = "client!dh", name = "ob", descriptor = "Ldh;")
    private static class140 field2145 = new class140();

    @OriginalMember(owner = "client!dh", name = "rb", descriptor = "Z")
    private static boolean field2148 = false;

    @OriginalMember(owner = "client!dh", name = "zb", descriptor = "[I")
    private static int[] field2156 = new int[1];

    @OriginalMember(owner = "client!dh", name = "xb", descriptor = "[I")
    private static int[] field2154 = new int[1];

    @OriginalMember(owner = "client!dh", name = "pb", descriptor = "F")
    private static float field2146;

    @OriginalMember(owner = "client!dh", name = "qb", descriptor = "F")
    private static float field2147;

    @OriginalMember(owner = "client!dh", name = "ub", descriptor = "F")
    private static float field2151;

    @OriginalMember(owner = "client!dh", name = "vb", descriptor = "F")
    private static float field2152;

    @OriginalMember(owner = "client!dh", name = "yb", descriptor = "F")
    private static float field2155;

    @OriginalMember(owner = "client!dh", name = "Ab", descriptor = "F")
    private static float field2157;

    @OriginalMember(owner = "client!dh", name = "sb", descriptor = "I")
    private static int field2149;

    @OriginalMember(owner = "client!dh", name = "tb", descriptor = "I")
    private static int field2150;

    @OriginalMember(owner = "client!dh", name = "wb", descriptor = "I")
    private static int field2153;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "Lde;")
    private class236 field2139;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "Lri;")
    private class45 field2135;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2129;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "[J")
    private static long[] field2121;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "[[I")
    private int[][] field2116;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "[[I")
    private int[][] field2130;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "()I", line = 6)
    public final int method585() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field485;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lhk;)Lhk;", line = 12)
    public final class42 method1048(class42 arg0) {
        if (this.field2109 == 0) {
            return null;
        }
        if (!this.field2101.field488) {
            this.method1055();
        }
        int var2;
        int var3;
        if (class179.field2850 > 0) {
            var2 = this.field2101.field484 - (class179.field2850 * this.field2101.field485 >> 8) >> 3;
            var3 = this.field2101.field482 - (class179.field2850 * this.field2101.field489 >> 8) >> 3;
        } else {
            var2 = this.field2101.field484 - (class179.field2850 * this.field2101.field489 >> 8) >> 3;
            var3 = this.field2101.field482 - (class179.field2850 * this.field2101.field485 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class179.field2846 > 0) {
            var4 = this.field2101.field486 - (class179.field2846 * this.field2101.field485 >> 8) >> 3;
            var5 = this.field2101.field487 - (class179.field2846 * this.field2101.field489 >> 8) >> 3;
        } else {
            var4 = this.field2101.field486 - (class179.field2846 * this.field2101.field489 >> 8) >> 3;
            var5 = this.field2101.field487 - (class179.field2846 * this.field2101.field485 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class42 var8;
        if (arg0 == null || arg0.field603.length < var6 * var7) {
            var8 = new class42(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field5052 = arg0.field5047 = var6;
            arg0.field5051 = arg0.field5049 = var7;
            arg0.method327();
        }
        var8.field5044 = var2;
        var8.field5045 = var4;
        if (field2156.length < this.field2109) {
            field2156 = new int[this.field2109];
            field2154 = new int[this.field2109];
        }
        for (int var9 = 0; var9 < this.field2098; var9++) {
            int var10 = (this.field2131[var9] - (this.field2102[var9] * class179.field2850 >> 8) >> 3) - var2;
            int var11 = (this.field2128[var9] - (this.field2102[var9] * class179.field2846 >> 8) >> 3) - var4;
            int var12 = this.field2107[var9];
            int var13 = this.field2107[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2114[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2156[var15] = var10;
                field2154[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2123; var16++) {
            if (this.field2097[var16] <= 128) {
                short var17 = this.field2100[var16];
                short var18 = this.field2122[var16];
                short var19 = this.field2124[var16];
                int var20 = field2156[var17];
                int var21 = field2156[var18];
                int var22 = field2156[var19];
                int var23 = field2154[var17];
                int var24 = field2154[var18];
                int var25 = field2154[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class164.method1229(var8.field603, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII[FIF)V", line = 135)
    private static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field2147 = var16;
        field2146 = var17;
    }

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "()V", line = 181)
    public final void method1050() {
        if (this.field2133 == null) {
            this.method570();
            return;
        }
        for (int var1 = 0; var1 < this.field2132; var1++) {
            int var2 = this.field2128[var1];
            this.field2128[var1] = this.field2131[var1];
            this.field2131[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2109; var3++) {
            short var4 = this.field2140[var3];
            this.field2140[var3] = this.field2133[var3];
            this.field2133[var3] = (short) (-var4);
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "()V", line = 219)
    private final void method1051() {
        GL var1 = class73.field1051;
        if (this.field2123 == 0) {
            return;
        }
        if (this.field2108 != 0) {
            this.method1070(true, !this.field2104.field3547 && (this.field2108 & 0x1) != 0, !this.field2126.field3547 && (this.field2108 & 0x2) != 0, this.field2136 != null && !this.field2136.field3547 && (this.field2108 & 0x4) != 0, false);
        }
        this.method1070(false, !this.field2104.field3547, !this.field2126.field3547, this.field2136 != null && !this.field2136.field3547, !this.field2106.field3547);
        if (!this.field2105.field3547) {
            this.method1068();
        }
        if (this.field2119 != 0) {
            if ((this.field2119 & 0x1) != 0) {
                this.field2131 = null;
                this.field2102 = null;
                this.field2128 = null;
                this.field2114 = null;
                this.field2107 = null;
            }
            if ((this.field2119 & 0x2) != 0) {
                this.field2120 = null;
                this.field2097 = null;
            }
            if ((this.field2119 & 0x4) != 0) {
                this.field2133 = null;
                this.field2127 = null;
                this.field2140 = null;
                this.field2112 = null;
            }
            if ((this.field2119 & 0x8) != 0) {
                this.field2111 = null;
                this.field2110 = null;
            }
            if ((this.field2119 & 0x10) != 0) {
                this.field2100 = null;
                this.field2122 = null;
                this.field2124 = null;
            }
            this.field2119 = 0;
        }
        class236 var2 = null;
        if (this.field2104.field3551 != null) {
            this.field2104.field3551.method1644();
            var2 = this.field2104.field3551;
            var1.glVertexPointer(3, 5126, this.field2104.field3550, (long) this.field2104.field3539);
        }
        if (this.field2126.field3551 != null) {
            if (this.field2126.field3551 != var2) {
                this.field2126.field3551.method1644();
                var2 = this.field2126.field3551;
            }
            var1.glColorPointer(4, 5121, this.field2126.field3550, (long) this.field2126.field3539);
        }
        if (class309.field4812 && this.field2136.field3551 != null) {
            if (this.field2136.field3551 != var2) {
                this.field2136.field3551.method1644();
                var2 = this.field2136.field3551;
            }
            var1.glNormalPointer(5126, this.field2136.field3550, (long) this.field2136.field3539);
        }
        if (this.field2106.field3551 != null) {
            if (this.field2106.field3551 != var2) {
                this.field2106.field3551.method1644();
                class236 var3 = this.field2106.field3551;
            }
            var1.glTexCoordPointer(2, 5126, this.field2106.field3550, (long) this.field2106.field3539);
        }
        if (this.field2105.field3551 != null) {
            this.field2105.field3551.method1646();
        }
        if (this.field2104.field3551 == null || this.field2126.field3551 == null || class309.field4812 && this.field2136.field3551 == null || this.field2106.field3551 == null) {
            if (class73.field1066) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2104.field3551 == null) {
                this.field2104.field3553.position(this.field2104.field3539);
                var1.glVertexPointer(3, 5126, this.field2104.field3550, this.field2104.field3553);
            }
            if (this.field2126.field3551 == null) {
                this.field2126.field3553.position(this.field2126.field3539);
                var1.glColorPointer(4, 5121, this.field2126.field3550, this.field2126.field3553);
            }
            if (class309.field4812 && this.field2136.field3551 == null) {
                this.field2136.field3553.position(this.field2136.field3539);
                var1.glNormalPointer(5126, this.field2136.field3550, this.field2136.field3553);
            }
            if (this.field2106.field3551 == null) {
                this.field2106.field3553.position(this.field2106.field3539);
                var1.glTexCoordPointer(2, 5126, this.field2106.field3550, this.field2106.field3553);
            }
        }
        if (this.field2105.field3551 == null && class73.field1066) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2113.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2113[var5];
            int var7 = this.field2113[var5 + 1];
            short var8 = this.field2134[var6];
            if (var8 == -1) {
                class73.method537(-1);
                class241.method1672(0, -128, 0);
            } else {
                class164.field2662.method663(var8 & 0xFFFF, 16374);
            }
            if (this.field2105.field3551 == null) {
                this.field2105.field3553.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2105.field3553);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([SI)[S", line = 393)
    private static final short[] method1052(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class126.method945(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "()V", line = 399)
    public final void method1053() {
        if (this.field2133 == null) {
            this.method574();
            return;
        }
        for (int var1 = 0; var1 < this.field2132; var1++) {
            int var2 = this.field2131[var1];
            this.field2131[var1] = this.field2128[var1];
            this.field2128[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2109; var3++) {
            short var4 = this.field2133[var3];
            this.field2133[var3] = this.field2140[var3];
            this.field2140[var3] = (short) (-var4);
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 439)
    public final void method579(int arg0) {
        int var2 = class164.field2650[arg0];
        int var3 = class164.field2664[arg0];
        for (int var4 = 0; var4 < this.field2132; var4++) {
            int var5 = this.field2131[var4] * var3 + this.field2128[var4] * var2 >> 16;
            this.field2128[var4] = this.field2128[var4] * var3 - this.field2131[var4] * var2 >> 16;
            this.field2131[var4] = var5;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIFFF)[F", line = 459)
    private static final float[] method1054(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Lfc;", line = 525)
    public final class110 method844(int arg0, int arg1, int arg2) {
        this.field2103 = false;
        if (this.field2135 != null) {
            this.field2133 = this.field2135.field632;
            this.field2127 = this.field2135.field633;
            this.field2140 = this.field2135.field630;
            this.field2112 = this.field2135.field631;
            this.field2135 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[IIIIZ)V", line = 541)
    public final void method568(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2149 = 0;
            field2150 = 0;
            field2153 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2116.length) {
                    int[] var14 = this.field2116[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2149 += this.field2131[var16];
                        field2150 += this.field2102[var16];
                        field2153 += this.field2128[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2149 = field2149 / var11 + var8;
                field2150 = field2150 / var11 + var9;
                field2153 = field2153 / var11 + var10;
            } else {
                field2149 = var8;
                field2150 = var9;
                field2153 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2116.length) {
                    int[] var22 = this.field2116[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2131[var24] += var17;
                        this.field2102[var24] += var18;
                        this.field2128[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2116.length) {
                    int[] var27 = this.field2116[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2131[var29] -= field2149;
                        this.field2102[var29] -= field2150;
                        this.field2128[var29] -= field2153;
                        if (arg4 != 0) {
                            int var30 = class164.field2650[arg4];
                            int var31 = class164.field2664[arg4];
                            int var32 = this.field2131[var29] * var31 + this.field2102[var29] * var30 + 32767 >> 16;
                            this.field2102[var29] = this.field2102[var29] * var31 + 32767 - this.field2131[var29] * var30 >> 16;
                            this.field2131[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class164.field2650[arg2];
                            int var34 = class164.field2664[arg2];
                            int var35 = this.field2102[var29] * var34 + 32767 - this.field2128[var29] * var33 >> 16;
                            this.field2128[var29] = this.field2128[var29] * var34 + this.field2102[var29] * var33 + 32767 >> 16;
                            this.field2102[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class164.field2650[arg3];
                            int var37 = class164.field2664[arg3];
                            int var38 = this.field2131[var29] * var37 + this.field2128[var29] * var36 + 32767 >> 16;
                            this.field2128[var29] = this.field2128[var29] * var37 + 32767 - this.field2131[var29] * var36 >> 16;
                            this.field2131[var29] = var38;
                        }
                        this.field2131[var29] += field2149;
                        this.field2102[var29] += field2150;
                        this.field2128[var29] += field2153;
                    }
                }
            }
            if (arg5 && this.field2133 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2116.length) {
                        int[] var41 = this.field2116[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2107[var43];
                            int var45 = this.field2107[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2114[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class164.field2650[arg4];
                                    int var49 = class164.field2664[arg4];
                                    int var50 = this.field2133[var47] * var49 + this.field2127[var47] * var48 + 32767 >> 16;
                                    this.field2127[var47] = (short) (this.field2127[var47] * var49 + 32767 - this.field2133[var47] * var48 >> 16);
                                    this.field2133[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class164.field2650[arg2];
                                    int var52 = class164.field2664[arg2];
                                    int var53 = this.field2127[var47] * var52 + 32767 - this.field2140[var47] * var51 >> 16;
                                    this.field2140[var47] = (short) (this.field2140[var47] * var52 + this.field2127[var47] * var51 + 32767 >> 16);
                                    this.field2127[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class164.field2650[arg3];
                                    int var55 = class164.field2664[arg3];
                                    int var56 = this.field2140[var47] * var54 + this.field2133[var47] * var55 + 32767 >> 16;
                                    this.field2140[var47] = (short) (this.field2140[var47] * var55 + 32767 - this.field2133[var47] * var54 >> 16);
                                    this.field2133[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2136 != null) {
                    this.field2136.field3547 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2116.length) {
                    int[] var59 = this.field2116[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2131[var61] -= field2149;
                        this.field2102[var61] -= field2150;
                        this.field2128[var61] -= field2153;
                        this.field2131[var61] = this.field2131[var61] * arg2 >> 7;
                        this.field2102[var61] = this.field2102[var61] * arg3 >> 7;
                        this.field2128[var61] = this.field2128[var61] * arg4 >> 7;
                        this.field2131[var61] += field2149;
                        this.field2102[var61] += field2150;
                        this.field2128[var61] += field2153;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2130 != null && this.field2097 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field2130.length) {
                        int[] var64 = this.field2130[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field2097[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field2097[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field2126.field3547 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2130 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field2130.length) {
                    int[] var70 = this.field2130[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field2120[var72] & 0xFFFF;
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
                        this.field2120[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field2126.field3547 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "()V", line = 950)
    private final void method1055() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2098; var9++) {
            int var10 = this.field2131[var9];
            int var11 = this.field2102[var9];
            int var12 = this.field2128[var9];
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
        this.field2101.field484 = (short) var1;
        this.field2101.field482 = (short) var4;
        this.field2101.field489 = (short) var2;
        this.field2101.field485 = (short) var5;
        this.field2101.field486 = (short) var3;
        this.field2101.field487 = (short) var6;
        this.field2101.field483 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2101.field488 = true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lfc;IIIZ)V", line = 1022)
    public final void method835(class110 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class140 var6 = (class140) arg0;
        if (this.field2123 == 0 || var6.field2123 == 0) {
            return;
        }
        int var7 = var6.field2098;
        int[] var8 = var6.field2131;
        int[] var9 = var6.field2102;
        int[] var10 = var6.field2128;
        short[] var11 = var6.field2133;
        short[] var12 = var6.field2127;
        short[] var13 = var6.field2140;
        short[] var14 = var6.field2112;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2135 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2135.field632;
            var16 = this.field2135.field633;
            var17 = this.field2135.field630;
            var18 = this.field2135.field631;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2135 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2135.field632;
            var20 = var6.field2135.field633;
            var21 = var6.field2135.field630;
            var22 = var6.field2135.field631;
        }
        int[] var23 = var6.field2107;
        short[] var24 = var6.field2114;
        if (!var6.field2101.field488) {
            var6.method1055();
        }
        short var25 = var6.field2101.field489;
        short var26 = var6.field2101.field485;
        short var27 = var6.field2101.field484;
        short var28 = var6.field2101.field482;
        short var29 = var6.field2101.field486;
        short var30 = var6.field2101.field487;
        for (int var31 = 0; var31 < this.field2098; var31++) {
            int var32 = this.field2102[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2131[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2128[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2107[var31];
                        int var37 = this.field2107[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2114[var38] - 1;
                            if (var35 == -1 || this.field2112[var35] != 0) {
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
                                            this.field2135 = new class45();
                                            var15 = this.field2135.field632 = class8.method79(this.field2133, 107);
                                            var16 = this.field2135.field633 = class8.method79(this.field2127, 117);
                                            var17 = this.field2135.field630 = class8.method79(this.field2140, 115);
                                            var18 = this.field2135.field631 = class8.method79(this.field2112, 127);
                                        }
                                        if (var19 == null) {
                                            class45 var44 = var6.field2135 = new class45();
                                            var19 = var44.field632 = class8.method79(var11, 102);
                                            var20 = var44.field633 = class8.method79(var12, 106);
                                            var21 = var44.field630 = class8.method79(var13, 119);
                                            var22 = var44.field631 = class8.method79(var14, 126);
                                        }
                                        short var45 = this.field2133[var35];
                                        short var46 = this.field2127[var35];
                                        short var47 = this.field2140[var35];
                                        short var48 = this.field2112[var35];
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
                                        int var57 = this.field2107[var31];
                                        int var58 = this.field2107[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2114[var59] - 1;
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

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "()V", line = 1262)
    public final void method571() {
        for (int var1 = 0; var1 < this.field2132; var1++) {
            this.field2131[var1] = this.field2131[var1] + 7 >> 4;
            this.field2102[var1] = this.field2102[var1] + 7 >> 4;
            this.field2128[var1] = this.field2128[var1] + 7 >> 4;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 4538)
    private class140() {
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ltf;IIZ)V", line = 4540)
    public class140(class128 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1902];
        this.field2107 = new int[arg0.field1933 + 1];
        for (int var6 = 0; var6 < arg0.field1902; var6++) {
            if ((arg0.field1918 == null || arg0.field1918[var6] != 2) && (arg0.field1901 == null || arg0.field1901[var6] == -1 || !class164.field2662.method671(-7427, arg0.field1901[var6] & 0xFFFF))) {
                var5[this.field2123++] = var6;
                this.field2107[arg0.field1912[var6]]++;
                this.field2107[arg0.field1943[var6]]++;
                this.field2107[arg0.field1936[var6]]++;
            }
        }
        long[] var7 = new long[this.field2123];
        for (int var8 = 0; var8 < this.field2123; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1901 != null) {
                var14 = arg0.field1901[var9];
                if (var14 != -1) {
                    var12 = class164.field2662.method667(28, var14 & 0xFFFF);
                    var13 = class164.field2662.method674((byte) 105, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field1949 != null && arg0.field1949[var9] != 0 || var14 != -1 && !class164.field2662.method664(var14 & 0xFFFF, 56);
            if ((arg3 || var15) && arg0.field1919 != null) {
                var10 += arg0.field1919[var9] << 17;
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
        class191.method1408(var5, -95, var7);
        this.field2132 = arg0.field1933;
        this.field2098 = arg0.field1946;
        this.field2131 = arg0.field1916;
        this.field2102 = arg0.field1900;
        this.field2128 = arg0.field1920;
        this.field2141 = arg0.field1923;
        this.field2115 = arg0.field1929;
        int var20 = this.field2123 * 3;
        this.field2133 = new short[var20];
        this.field2127 = new short[var20];
        this.field2140 = new short[var20];
        this.field2112 = new short[var20];
        this.field2111 = new float[var20];
        this.field2110 = new float[var20];
        this.field2120 = new short[this.field2123];
        this.field2097 = new byte[this.field2123];
        this.field2100 = new short[this.field2123];
        this.field2122 = new short[this.field2123];
        this.field2124 = new short[this.field2123];
        this.field2134 = new short[this.field2123];
        if (arg0.field1932 != null) {
            this.field2099 = new byte[this.field2123];
        }
        if (arg0.field1940 != null) {
            this.field2117 = new short[this.field2123];
        }
        this.field2101 = new class33();
        this.field2104 = new class233();
        this.field2126 = new class233();
        if (class309.field4812) {
            this.field2136 = new class233();
        }
        this.field2106 = new class233();
        this.field2105 = new class233();
        this.field2118 = (short) arg1;
        this.field2138 = (short) arg2;
        this.field2114 = new short[var20];
        field2121 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field2098; var22++) {
            int var23 = this.field2107[var22];
            this.field2107[var22] = var21;
            var21 += var23;
        }
        this.field2107[this.field2098] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1922 != null) {
            int var28 = arg0.field1927;
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
            for (int var36 = 0; var36 < this.field2123; var36++) {
                int var37 = var5[var36];
                if (arg0.field1922[var37] != -1) {
                    int var38 = arg0.field1922[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1912[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1943[var37];
                        } else {
                            var40 = arg0.field1936[var37];
                        }
                        int var41 = arg0.field1916[var40];
                        int var42 = arg0.field1900[var40];
                        int var43 = arg0.field1920[var40];
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
                byte var45 = arg0.field1904[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1906[var44];
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
                        var49 = 64.0F / (float) (arg0.field1937[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1906[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1937[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1909[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1906[var44] / 1024.0F;
                        var49 = (float) arg0.field1937[var44] / 1024.0F;
                        var48 = (float) arg0.field1909[var44] / 1024.0F;
                    }
                    var27[var44] = method1054(arg0.field1908[var44], arg0.field1925[var44], arg0.field1926[var44], arg0.field1939[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2123; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1950[var51] & 0xFFFF;
            short var53;
            if (arg0.field1901 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1901[var51];
            }
            int var54;
            if (arg0.field1922 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1922[var51];
            }
            int var55;
            if (arg0.field1949 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1949[var51] & 0xFF;
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
                    byte var65 = arg0.field1904[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1912[var51];
                        int var67 = arg0.field1943[var51];
                        int var68 = arg0.field1936[var51];
                        short var69 = arg0.field1908[var54];
                        short var70 = arg0.field1925[var54];
                        short var71 = arg0.field1926[var54];
                        float var72 = (float) arg0.field1916[var69];
                        float var73 = (float) arg0.field1900[var69];
                        float var74 = (float) arg0.field1920[var69];
                        float var75 = (float) arg0.field1916[var70] - var72;
                        float var76 = (float) arg0.field1900[var70] - var73;
                        float var77 = (float) arg0.field1920[var70] - var74;
                        float var78 = (float) arg0.field1916[var71] - var72;
                        float var79 = (float) arg0.field1900[var71] - var73;
                        float var80 = (float) arg0.field1920[var71] - var74;
                        float var81 = (float) arg0.field1916[var66] - var72;
                        float var82 = (float) arg0.field1900[var66] - var73;
                        float var83 = (float) arg0.field1920[var66] - var74;
                        float var84 = (float) arg0.field1916[var67] - var72;
                        float var85 = (float) arg0.field1900[var67] - var73;
                        float var86 = (float) arg0.field1920[var67] - var74;
                        float var87 = (float) arg0.field1916[var68] - var72;
                        float var88 = (float) arg0.field1900[var68] - var73;
                        float var89 = (float) arg0.field1920[var68] - var74;
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
                        int var101 = arg0.field1912[var51];
                        int var102 = arg0.field1943[var51];
                        int var103 = arg0.field1936[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1931[var54];
                        float var109 = (float) arg0.field1924[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1909[var54] & 0xFFFF) / 1024.0F;
                            method1075(arg0.field1916[var101], arg0.field1900[var101], arg0.field1920[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2157;
                            var57 = field2155;
                            method1075(arg0.field1916[var102], arg0.field1900[var102], arg0.field1920[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2157;
                            var59 = field2155;
                            method1075(arg0.field1916[var103], arg0.field1900[var103], arg0.field1920[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2157;
                            var61 = field2155;
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
                            float var112 = (float) arg0.field1911[var54] / 256.0F;
                            float var113 = (float) arg0.field1913[var54] / 256.0F;
                            int var114 = arg0.field1916[var102] - arg0.field1916[var101];
                            int var115 = arg0.field1900[var102] - arg0.field1900[var101];
                            int var116 = arg0.field1920[var102] - arg0.field1920[var101];
                            int var117 = arg0.field1916[var103] - arg0.field1916[var101];
                            int var118 = arg0.field1900[var103] - arg0.field1900[var101];
                            int var119 = arg0.field1920[var103] - arg0.field1920[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1906[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1937[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1909[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1079(var126, var127, var128);
                            method1062(arg0.field1916[var101], arg0.field1900[var101], arg0.field1920[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2152;
                            var57 = field2151;
                            method1062(arg0.field1916[var102], arg0.field1900[var102], arg0.field1920[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2152;
                            var59 = field2151;
                            method1062(arg0.field1916[var103], arg0.field1900[var103], arg0.field1920[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2152;
                            var61 = field2151;
                        } else if (var65 == 3) {
                            method1049(arg0.field1916[var101], arg0.field1900[var101], arg0.field1920[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2147;
                            var57 = field2146;
                            method1049(arg0.field1916[var102], arg0.field1900[var102], arg0.field1920[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2147;
                            var59 = field2146;
                            method1049(arg0.field1916[var103], arg0.field1900[var103], arg0.field1920[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2147;
                            var61 = field2146;
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
            arg0.method959();
            byte var129;
            if (arg0.field1918 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1918[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1912[var51];
                class319 var133 = arg0.field1944[var132];
                this.field2100[var50] = this.method1060(arg0, var132, var130, var133.field4933, var133.field4927, var133.field4925, var133.field4924, var56, var57);
                int var134 = arg0.field1943[var51];
                class319 var135 = arg0.field1944[var134];
                this.field2122[var50] = this.method1060(arg0, var134, (long) var62 + var130, var135.field4933, var135.field4927, var135.field4925, var135.field4924, var58, var59);
                int var136 = arg0.field1936[var51];
                class319 var137 = arg0.field1944[var136];
                this.field2124[var50] = this.method1060(arg0, var136, (long) var63 + var130, var137.field4933, var137.field4927, var137.field4925, var137.field4924, var60, var61);
            } else if (var129 == 1) {
                class187 var138 = arg0.field1903[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2947 > 0 ? 1024 : 2048) + (var138.field2948 + 256 << 12) + (var138.field2945 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2100[var50] = this.method1060(arg0, arg0.field1912[var51], var139, var138.field2947, var138.field2948, var138.field2945, 0, var56, var57);
                this.field2122[var50] = this.method1060(arg0, arg0.field1943[var51], (long) var62 + var139, var138.field2947, var138.field2948, var138.field2945, 0, var58, var59);
                this.field2124[var50] = this.method1060(arg0, arg0.field1936[var51], (long) var63 + var139, var138.field2947, var138.field2948, var138.field2945, 0, var60, var61);
            }
            if (arg0.field1901 == null) {
                this.field2134[var50] = -1;
            } else {
                this.field2134[var50] = arg0.field1901[var51];
            }
            if (this.field2099 != null) {
                this.field2099[var50] = (byte) arg0.field1932[var51];
            }
            this.field2120[var50] = arg0.field1950[var51];
            if (arg0.field1949 != null) {
                this.field2097[var50] = arg0.field1949[var51];
            }
            if (arg0.field1940 != null) {
                this.field2117[var50] = arg0.field1940[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2123; var143++) {
            short var144 = this.field2134[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2113 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2123; var147++) {
            short var148 = this.field2134[var147];
            if (var146 != var148) {
                this.field2113[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2113[var145] = this.field2123;
        field2121 = null;
        this.field2133 = method1052(this.field2133, this.field2109);
        this.field2127 = method1052(this.field2127, this.field2109);
        this.field2140 = method1052(this.field2140, this.field2109);
        this.field2112 = method1052(this.field2112, this.field2109);
        this.field2111 = method1059(this.field2111, this.field2109);
        this.field2110 = method1059(this.field2110, this.field2109);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILdh;[[I[[IIII)V", line = 1278)
    public final void method1056(int arg0, int arg1, class140 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2101.field488) {
            arg2.method1055();
        }
        int var9 = arg2.field2101.field484 + arg5;
        int var10 = arg2.field2101.field482 + arg5;
        int var11 = arg2.field2101.field486 + arg7;
        int var12 = arg2.field2101.field487 + arg7;
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
            for (int var17 = 0; var17 < this.field2098; var17++) {
                int var18 = this.field2131[var17] + arg5;
                int var19 = this.field2128[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2102[var17] = this.field2102[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2101.field489;
            for (int var28 = 0; var28 < this.field2098; var28++) {
                int var29 = (this.field2102[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2131[var28] + arg5;
                    int var31 = this.field2128[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2102[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method580(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2101.field485 - arg2.field2101.field489;
            for (int var42 = 0; var42 < this.field2098; var42++) {
                int var43 = this.field2131[var42] + arg5;
                int var44 = this.field2128[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2102[var42] = var51 + this.field2102[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2101.field485 - arg2.field2101.field489;
            for (int var53 = 0; var53 < this.field2098; var53++) {
                int var54 = this.field2131[var53] + arg5;
                int var55 = this.field2128[var53] + arg7;
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
                this.field2102[var53] = ((this.field2102[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2104.field3547 = false;
        this.field2101.field488 = false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 1476)
    public final void method564(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2149 = 0;
            field2150 = 0;
            field2153 = 0;
            for (int var6 = 0; var6 < this.field2132; var6++) {
                field2149 += this.field2131[var6];
                field2150 += this.field2102[var6];
                field2153 += this.field2128[var6];
                var5++;
            }
            if (var5 > 0) {
                field2149 = field2149 / var5 + arg1;
                field2150 = field2150 / var5 + arg2;
                field2153 = field2153 / var5 + arg3;
            } else {
                field2149 = arg1;
                field2150 = arg2;
                field2153 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2132; var7++) {
                this.field2131[var7] += arg1;
                this.field2102[var7] += arg2;
                this.field2128[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2132; var8++) {
                this.field2131[var8] -= field2149;
                this.field2102[var8] -= field2150;
                this.field2128[var8] -= field2153;
                if (arg3 != 0) {
                    int var9 = class164.field2650[arg3];
                    int var10 = class164.field2664[arg3];
                    int var11 = this.field2131[var8] * var10 + this.field2102[var8] * var9 + 32767 >> 16;
                    this.field2102[var8] = this.field2102[var8] * var10 + 32767 - this.field2131[var8] * var9 >> 16;
                    this.field2131[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class164.field2650[arg1];
                    int var13 = class164.field2664[arg1];
                    int var14 = this.field2102[var8] * var13 + 32767 - this.field2128[var8] * var12 >> 16;
                    this.field2128[var8] = this.field2128[var8] * var13 + this.field2102[var8] * var12 + 32767 >> 16;
                    this.field2102[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class164.field2650[arg2];
                    int var16 = class164.field2664[arg2];
                    int var17 = this.field2131[var8] * var16 + this.field2128[var8] * var15 + 32767 >> 16;
                    this.field2128[var8] = this.field2128[var8] * var16 + 32767 - this.field2131[var8] * var15 >> 16;
                    this.field2131[var8] = var17;
                }
                this.field2131[var8] += field2149;
                this.field2102[var8] += field2150;
                this.field2128[var8] += field2153;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2132; var18++) {
                this.field2131[var18] -= field2149;
                this.field2102[var18] -= field2150;
                this.field2128[var18] -= field2153;
                this.field2131[var18] = this.field2131[var18] * arg1 / 128;
                this.field2102[var18] = this.field2102[var18] * arg2 / 128;
                this.field2128[var18] = this.field2128[var18] * arg3 / 128;
                this.field2131[var18] += field2149;
                this.field2102[var18] += field2150;
                this.field2128[var18] += field2153;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2123; var19++) {
                int var20 = (this.field2097[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2097[var19] = (byte) var20;
            }
            this.field2126.field3547 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field2123; var21++) {
                int var22 = this.field2120[var21] & 0xFFFF;
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
                this.field2120[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field2126.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "()I", line = 1670)
    public final int method582() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field484;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZZZZZ)V", line = 1676)
    public final void method1057(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2108 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2109 != 0) {
            if (arg6) {
                boolean var8 = !this.field2126.field3547 && (arg1 || arg2 && !class309.field4812);
                this.method1070(false, !this.field2104.field3547 && arg0, var8, this.field2136 != null && !this.field2136.field3547 && arg2, !this.field2106.field3547 && arg3);
                if (!this.field2105.field3547 && arg4 && arg1) {
                    this.method1068();
                }
            }
            if (arg0) {
                if (this.field2104.field3547) {
                    if (!this.field2101.field488) {
                        this.method1055();
                    }
                    this.field2131 = null;
                    this.field2102 = null;
                    this.field2128 = null;
                    this.field2114 = null;
                    this.field2107 = null;
                } else {
                    this.field2119 = (byte) (this.field2119 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2126.field3547) {
                    this.field2120 = null;
                    this.field2097 = null;
                } else {
                    this.field2119 = (byte) (this.field2119 | 0x2);
                }
            }
            if (arg2 && class309.field4812) {
                if (this.field2136.field3547) {
                    this.field2133 = null;
                    this.field2127 = null;
                    this.field2140 = null;
                    this.field2112 = null;
                } else {
                    this.field2119 = (byte) (this.field2119 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2106.field3547) {
                    this.field2111 = null;
                    this.field2110 = null;
                } else {
                    this.field2119 = (byte) (this.field2119 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2105.field3547 && this.field2126.field3547) {
                    this.field2100 = null;
                    this.field2122 = null;
                    this.field2124 = null;
                } else {
                    this.field2119 = (byte) (this.field2119 | 0x10);
                }
            }
            if (arg5) {
                this.field2141 = null;
                this.field2099 = null;
                this.field2116 = (int[][]) null;
                this.field2130 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIII)Z", line = 1774)
    private final boolean method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([FI)[F", line = 1792)
    private static final float[] method1059(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class126.method948(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "()V", line = 1799)
    public final void method574() {
        for (int var1 = 0; var1 < this.field2132; var1++) {
            int var2 = this.field2131[var1];
            this.field2131[var1] = this.field2128[var1];
            this.field2128[var1] = -var2;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(III)V", line = 1815)
    public final void method588(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2132; var4++) {
            this.field2131[var4] = this.field2131[var4] * arg0 >> 7;
            this.field2102[var4] = this.field2102[var4] * arg1 >> 7;
            this.field2128[var4] = this.field2128[var4] * arg2 >> 7;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "()I", line = 1829)
    public final int method583() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field487;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ltf;IJIIIIFF)S", line = 1836)
    private final short method1060(class128 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2107[arg1];
        int var12 = this.field2107[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2114[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2121[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2114[var13] = (short) (this.field2109 + 1);
        field2121[var13] = arg2;
        this.field2133[this.field2109] = (short) arg3;
        this.field2127[this.field2109] = (short) arg4;
        this.field2140[this.field2109] = (short) arg5;
        this.field2112[this.field2109] = (short) arg6;
        this.field2111[this.field2109] = arg7;
        this.field2110[this.field2109] = arg8;
        return (short) (this.field2109++);
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "()I", line = 1871)
    public final int method575() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field482;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIJILnl;)V", line = 1879)
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        if (this.field2109 == 0) {
            return;
        }
        if (!this.field2101.field488) {
            this.method1055();
        }
        short var13 = this.field2101.field483;
        short var14 = this.field2101.field489;
        short var15 = this.field2101.field485;
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
        if (var21 / var18 <= class250.field3768) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class231.field3524) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class38.field565) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class201.field3100) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class164.field2650[arg0];
            var27 = class164.field2664[arg0];
        }
        if (arg8 > 0L && class273.field4266 && var19 > 0) {
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
            if (class25.field273 >= var28 && class25.field273 <= var29 && class147.field2237 >= var30 && class147.field2237 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2101.field484;
                short var37 = this.field2101.field482;
                short var38 = this.field2101.field486;
                short var39 = this.field2101.field487;
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
                if (class25.field273 >= var32 && class25.field273 <= var33 && class147.field2237 >= var34 && class147.field2237 <= var35) {
                    if (this.field1085) {
                        class159.field2417[class205.field3143++] = arg8;
                    } else {
                        if (field2156.length < this.field2109) {
                            field2156 = new int[this.field2109];
                            field2154 = new int[this.field2109];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2098) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2123) {
                                        break label118;
                                    }
                                    short var80 = this.field2100[var79];
                                    short var81 = this.field2122[var79];
                                    short var82 = this.field2124[var79];
                                    if (this.method1058(class25.field273, class147.field2237, field2154[var80], field2154[var81], field2154[var82], field2156[var80], field2156[var81], field2156[var82])) {
                                        class159.field2417[class205.field3143++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2131[var59];
                            int var61 = this.field2102[var59];
                            int var62 = this.field2128[var59];
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
                            int var75 = this.field2107[var59];
                            int var76 = this.field2107[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2114[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2156[var78] = var73;
                                field2154[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class73.field1051;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1051();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "()I", line = 2152)
    public final int method1061() {
        return this.field2138;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2155)
    private static final void method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field2152 = var18;
        field2151 = var19;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 2234)
    public final void method578(int arg0) {
        int var2 = class164.field2650[arg0];
        int var3 = class164.field2664[arg0];
        for (int var4 = 0; var4 < this.field2132; var4++) {
            int var5 = this.field2131[var4] * var3 + this.field2102[var4] * var2 >> 16;
            this.field2102[var4] = this.field2102[var4] * var3 - this.field2131[var4] * var2 >> 16;
            this.field2131[var4] = var5;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "()V", line = 2253)
    public static final void method1063() {
        field2125 = new class140();
        field2137 = new class140();
        field2142 = new class140();
        field2143 = new class140();
        field2144 = new class140();
        field2145 = new class140();
    }

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "()V", line = 2261)
    public final void method1064() {
        int var10002;
        if (this.field2141 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2132; var3++) {
                int var4 = this.field2141[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2116 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2116[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2132) {
                int var7 = this.field2141[var6] & 0xFF;
                this.field2116[var7][var1[var7]++] = var6++;
            }
            this.field2141 = null;
        }
        if (this.field2099 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2123; var10++) {
            int var11 = this.field2099[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2130 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2130[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2123) {
            int var14 = this.field2099[var13] & 0xFF;
            this.field2130[var14][var8[var14]++] = var13++;
        }
        this.field2099 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(SS)V", line = 2355)
    public final void method1065(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2123; var3++) {
            if (this.field2120[var3] == arg0) {
                this.field2120[var3] = arg1;
            }
        }
        this.field2126.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "()I", line = 2367)
    public final int method1066() {
        return this.field2118;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZZZZZZZZZ)Ldh;", line = 2371)
    public final class140 method1067(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class140 var12 = new class140();
        var12.field2132 = this.field2132;
        var12.field2098 = this.field2098;
        var12.field2109 = this.field2109;
        var12.field2123 = this.field2123;
        if (arg0) {
            var12.field2131 = this.field2131;
            var12.field2128 = this.field2128;
        } else {
            var12.field2131 = class111.method854(14, this.field2131);
            var12.field2128 = class111.method854(127, this.field2128);
        }
        if (arg1) {
            var12.field2102 = this.field2102;
        } else {
            var12.field2102 = class111.method854(-118, this.field2102);
        }
        if (arg0 && arg1) {
            var12.field2104 = this.field2104;
            var12.field2101 = this.field2101;
        } else {
            var12.field2104 = new class233();
            var12.field2101 = new class33();
        }
        if (arg2) {
            var12.field2120 = this.field2120;
        } else {
            var12.field2120 = class8.method79(this.field2120, 101);
        }
        if (arg3) {
            var12.field2097 = this.field2097;
        } else {
            var12.field2097 = class293.method2028(this.field2097, true);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class309.field4812) {
            var12.field2126 = new class233();
        } else {
            var12.field2126 = this.field2126;
        }
        if (arg5) {
            var12.field2133 = this.field2133;
            var12.field2127 = this.field2127;
            var12.field2140 = this.field2140;
            var12.field2112 = this.field2112;
        } else {
            var12.field2133 = class8.method79(this.field2133, 124);
            var12.field2127 = class8.method79(this.field2127, 95);
            var12.field2140 = class8.method79(this.field2140, 125);
            var12.field2112 = class8.method79(this.field2112, 125);
        }
        if (!class309.field4812) {
            var12.field2136 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2136 = this.field2136;
        } else {
            var12.field2136 = new class233();
        }
        if (arg8) {
            var12.field2111 = this.field2111;
            var12.field2110 = this.field2110;
            var12.field2106 = this.field2106;
        } else {
            var12.field2111 = class318.method2212(this.field2111, true);
            var12.field2110 = class318.method2212(this.field2110, true);
            var12.field2106 = new class233();
        }
        if (arg9) {
            var12.field2100 = this.field2100;
            var12.field2122 = this.field2122;
            var12.field2124 = this.field2124;
            var12.field2105 = this.field2105;
        } else {
            var12.field2100 = class8.method79(this.field2100, 98);
            var12.field2122 = class8.method79(this.field2122, 109);
            var12.field2124 = class8.method79(this.field2124, 97);
            var12.field2105 = new class233();
        }
        if (arg10) {
            var12.field2134 = this.field2134;
        } else {
            var12.field2134 = class8.method79(this.field2134, 104);
        }
        var12.field2141 = this.field2141;
        var12.field2116 = this.field2116;
        var12.field2099 = this.field2099;
        var12.field2130 = this.field2130;
        var12.field2113 = this.field2113;
        var12.field2114 = this.field2114;
        var12.field2107 = this.field2107;
        var12.field2118 = this.field2118;
        var12.field2138 = this.field2138;
        var12.field2115 = this.field2115;
        var12.field2117 = this.field2117;
        return var12;
    }

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "()V", line = 2514)
    private final void method1068() {
        if (field2096.field3840.length < this.field2123 * 12) {
            field2096 = new class254((this.field2123 + 100) * 12);
        } else {
            field2096.field3866 = 0;
        }
        if (class73.field1075) {
            for (int var1 = 0; var1 < this.field2123; var1++) {
                field2096.method1773(this.field2100[var1], false);
                field2096.method1773(this.field2122[var1], false);
                field2096.method1773(this.field2124[var1], false);
            }
        } else {
            for (int var2 = 0; var2 < this.field2123; var2++) {
                field2096.method1772(this.field2100[var2], (byte) 121);
                field2096.method1772(this.field2122[var2], (byte) 105);
                field2096.method1772(this.field2124[var2], (byte) 114);
            }
        }
        if (!class73.field1066) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2096.field3866);
            var5.put(field2096.field3840, 0, field2096.field3866);
            var5.flip();
            this.field2105.field3547 = true;
            this.field2105.field3553 = var5;
            this.field2105.field3551 = null;
            return;
        }
        class236 var3 = new class236();
        ByteBuffer var4 = ByteBuffer.wrap(field2096.field3840, 0, field2096.field3866);
        var3.method1643(var4);
        this.field2105.field3547 = true;
        this.field2105.field3553 = null;
        this.field2105.field3551 = var3;
    }

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "()I", line = 2572)
    public final int method587() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field486;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V", line = 2583)
    public final void method1069(int arg0) {
        if (this.field2133 == null) {
            this.method579(arg0);
            return;
        }
        int var2 = class164.field2650[arg0];
        int var3 = class164.field2664[arg0];
        for (int var4 = 0; var4 < this.field2132; var4++) {
            int var5 = this.field2131[var4] * var3 + this.field2128[var4] * var2 >> 16;
            this.field2128[var4] = this.field2128[var4] * var3 - this.field2131[var4] * var2 >> 16;
            this.field2131[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2109; var6++) {
            int var7 = this.field2140[var6] * var2 + this.field2133[var6] * var3 >> 16;
            this.field2140[var6] = (short) (this.field2140[var6] * var3 - this.field2133[var6] * var2 >> 16);
            this.field2133[var6] = (short) var7;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()Z", line = 2629)
    public final boolean method563() {
        if (this.field2116 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2132; var1++) {
            this.field2131[var1] <<= 0x4;
            this.field2102[var1] <<= 0x4;
            this.field2128[var1] <<= 0x4;
        }
        field2149 = 0;
        field2150 = 0;
        field2153 = 0;
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[IIIIZI[I)V", line = 2650)
    public final void method566(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field2149 = 0;
            field2150 = 0;
            field2153 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2116.length) {
                    int[] var16 = this.field2116[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2115 == null || (arg6 & this.field2115[var18]) != 0) {
                            field2149 += this.field2131[var18];
                            field2150 += this.field2102[var18];
                            field2153 += this.field2128[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field2149 = field2149 / var13 + var10;
                field2150 = field2150 / var13 + var11;
                field2153 = field2153 / var13 + var12;
                field2148 = true;
            } else {
                field2149 = var10;
                field2150 = var11;
                field2153 = var12;
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
                if (var26 < this.field2116.length) {
                    int[] var27 = this.field2116[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2115 == null || (arg6 & this.field2115[var29]) != 0) {
                            this.field2131[var29] += var22;
                            this.field2102[var29] += var23;
                            this.field2128[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field2116.length) {
                        int[] var92 = this.field2116[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field2115 == null || (arg6 & this.field2115[var94]) != 0) {
                                this.field2131[var94] -= field2149;
                                this.field2102[var94] -= field2150;
                                this.field2128[var94] -= field2153;
                                if (arg4 != 0) {
                                    int var95 = class164.field2650[arg4];
                                    int var96 = class164.field2664[arg4];
                                    int var97 = this.field2131[var94] * var96 + this.field2102[var94] * var95 + 32767 >> 16;
                                    this.field2102[var94] = this.field2102[var94] * var96 + 32767 - this.field2131[var94] * var95 >> 16;
                                    this.field2131[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class164.field2650[arg2];
                                    int var99 = class164.field2664[arg2];
                                    int var100 = this.field2102[var94] * var99 + 32767 - this.field2128[var94] * var98 >> 16;
                                    this.field2128[var94] = this.field2128[var94] * var99 + this.field2102[var94] * var98 + 32767 >> 16;
                                    this.field2102[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class164.field2650[arg3];
                                    int var102 = class164.field2664[arg3];
                                    int var103 = this.field2131[var94] * var102 + this.field2128[var94] * var101 + 32767 >> 16;
                                    this.field2128[var94] = this.field2128[var94] * var102 + 32767 - this.field2131[var94] * var101 >> 16;
                                    this.field2131[var94] = var103;
                                }
                                this.field2131[var94] += field2149;
                                this.field2102[var94] += field2150;
                                this.field2128[var94] += field2153;
                            }
                        }
                    }
                }
                if (arg5 && this.field2133 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field2116.length) {
                            int[] var106 = this.field2116[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field2115 == null || (arg6 & this.field2115[var108]) != 0) {
                                    int var109 = this.field2107[var108];
                                    int var110 = this.field2107[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field2114[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class164.field2650[arg4];
                                            int var114 = class164.field2664[arg4];
                                            int var115 = this.field2133[var112] * var114 + this.field2127[var112] * var113 + 32767 >> 16;
                                            this.field2127[var112] = (short) (this.field2127[var112] * var114 + 32767 - this.field2133[var112] * var113 >> 16);
                                            this.field2133[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class164.field2650[arg2];
                                            int var117 = class164.field2664[arg2];
                                            int var118 = this.field2127[var112] * var117 + 32767 - this.field2140[var112] * var116 >> 16;
                                            this.field2140[var112] = (short) (this.field2140[var112] * var117 + this.field2127[var112] * var116 + 32767 >> 16);
                                            this.field2127[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class164.field2650[arg3];
                                            int var120 = class164.field2664[arg3];
                                            int var121 = this.field2140[var112] * var119 + this.field2133[var112] * var120 + 32767 >> 16;
                                            this.field2140[var112] = (short) (this.field2140[var112] * var120 + 32767 - this.field2133[var112] * var119 >> 16);
                                            this.field2133[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2136 != null) {
                        this.field2136.field3547 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field2148) {
                    int var36 = arg7[6] * field2153 + arg7[0] * field2149 + arg7[3] * field2150 + 16384 >> 15;
                    int var37 = arg7[7] * field2153 + arg7[1] * field2149 + arg7[4] * field2150 + 16384 >> 15;
                    int var38 = arg7[8] * field2153 + arg7[2] * field2149 + arg7[5] * field2150 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field2149 = var39;
                    field2150 = var40;
                    field2153 = var41;
                    field2148 = false;
                }
                int[] var42 = new int[9];
                int var43 = class164.field2664[arg2] >> 1;
                int var44 = class164.field2650[arg2] >> 1;
                int var45 = class164.field2664[arg3] >> 1;
                int var46 = class164.field2650[arg3] >> 1;
                int var47 = class164.field2664[arg4] >> 1;
                int var48 = class164.field2650[arg4] >> 1;
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
                int var51 = var42[2] * -field2153 + var42[0] * -field2149 + var42[1] * -field2150 + 16384 >> 15;
                int var52 = var42[5] * -field2153 + var42[3] * -field2149 + var42[4] * -field2150 + 16384 >> 15;
                int var53 = var42[8] * -field2153 + var42[6] * -field2149 + var42[7] * -field2150 + 16384 >> 15;
                int var54 = field2149 + var51;
                int var55 = field2150 + var52;
                int var56 = field2153 + var53;
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
                    if (var80 < this.field2116.length) {
                        int[] var81 = this.field2116[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field2115 == null || (arg6 & this.field2115[var83]) != 0) {
                                int var84 = this.field2128[var83] * var68[2] + this.field2131[var83] * var68[0] + this.field2102[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field2128[var83] * var68[5] + this.field2131[var83] * var68[3] + this.field2102[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field2128[var83] * var68[8] + this.field2131[var83] * var68[6] + this.field2102[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field2131[var83] = var87;
                                this.field2102[var83] = var88;
                                this.field2128[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field2116.length) {
                        int[] var174 = this.field2116[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2115 == null || (arg6 & this.field2115[var176]) != 0) {
                                this.field2131[var176] -= field2149;
                                this.field2102[var176] -= field2150;
                                this.field2128[var176] -= field2153;
                                this.field2131[var176] = this.field2131[var176] * arg2 >> 7;
                                this.field2102[var176] = this.field2102[var176] * arg3 >> 7;
                                this.field2128[var176] = this.field2128[var176] * arg4 >> 7;
                                this.field2131[var176] += field2149;
                                this.field2102[var176] += field2150;
                                this.field2128[var176] += field2153;
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
                if (field2148) {
                    int var128 = arg7[6] * field2153 + arg7[0] * field2149 + arg7[3] * field2150 + 16384 >> 15;
                    int var129 = arg7[7] * field2153 + arg7[1] * field2149 + arg7[4] * field2150 + 16384 >> 15;
                    int var130 = arg7[8] * field2153 + arg7[2] * field2149 + arg7[5] * field2150 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field2149 = var131;
                    field2150 = var132;
                    field2153 = var133;
                    field2148 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field2149 * var134 + 16384 >> 15;
                int var138 = -field2150 * var135 + 16384 >> 15;
                int var139 = -field2153 * var136 + 16384 >> 15;
                int var140 = field2149 + var137;
                int var141 = field2150 + var138;
                int var142 = field2153 + var139;
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
                    if (var162 < this.field2116.length) {
                        int[] var163 = this.field2116[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field2115 == null || (arg6 & this.field2115[var165]) != 0) {
                                int var166 = this.field2128[var165] * var150[2] + this.field2131[var165] * var150[0] + this.field2102[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field2128[var165] * var150[5] + this.field2131[var165] * var150[3] + this.field2102[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field2128[var165] * var150[8] + this.field2131[var165] * var150[6] + this.field2102[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field2131[var165] = var169;
                                this.field2102[var165] = var170;
                                this.field2128[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2130 != null && this.field2097 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field2130.length) {
                        int[] var179 = this.field2130[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field2117 == null || (arg6 & this.field2117[var181]) != 0) {
                                int var182 = (this.field2097[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field2097[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field2126.field3547 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2130 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field2130.length) {
                    int[] var185 = this.field2130[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field2117 == null || (arg6 & this.field2117[var187]) != 0) {
                            int var188 = this.field2120[var187] & 0xFFFF;
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
                            this.field2120[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field2126.field3547 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZZZ)V", line = 3441)
    private final void method1070(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2104.field3539 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2126.field3539 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2136.field3539 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2106.field3539 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2096.field3840.length < this.field2109 * var6) {
            field2096 = new class254((this.field2109 + 100) * var6);
        } else {
            field2096.field3866 = 0;
        }
        if (arg1) {
            if (class73.field1075) {
                for (int var7 = 0; var7 < this.field2098; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2131[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2102[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2128[var7]);
                    int var11 = this.field2107[var7];
                    int var12 = this.field2107[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2114[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2096.field3866 = var6 * var14;
                        field2096.method1773(var8, false);
                        field2096.method1773(var9, false);
                        field2096.method1773(var10, false);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2098; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2131[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2102[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2128[var15]);
                    int var19 = this.field2107[var15];
                    int var20 = this.field2107[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2114[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2096.field3866 = var6 * var22;
                        field2096.method1772(var16, (byte) 123);
                        field2096.method1772(var17, (byte) 119);
                        field2096.method1772(var18, (byte) 100);
                    }
                }
            }
        }
        if (arg2) {
            if (class309.field4812) {
                for (int var42 = 0; var42 < this.field2123; var42++) {
                    int var43 = method1074(this.field2120[var42], this.field2134[var42], this.field2118, this.field2097[var42]);
                    field2096.field3866 = this.field2100[var42] * var6 + this.field2126.field3539;
                    field2096.method1773(var43, false);
                    field2096.field3866 = this.field2122[var42] * var6 + this.field2126.field3539;
                    field2096.method1773(var43, false);
                    field2096.field3866 = this.field2124[var42] * var6 + this.field2126.field3539;
                    field2096.method1773(var43, false);
                }
            } else {
                int var23 = (int) class179.field2848[0];
                int var24 = (int) class179.field2848[1];
                int var25 = (int) class179.field2848[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2118 * 1.3F);
                int var28 = this.field2138 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2123; var29++) {
                    short var30 = this.field2100[var29];
                    short var31 = this.field2112[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2140[var30] * var25 + this.field2133[var30] * var23 + this.field2127[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2140[var30] * var25 + this.field2133[var30] * var23 + this.field2127[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2112[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2122[var29];
                    short var34 = this.field2112[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2140[var33] * var25 + this.field2133[var33] * var23 + this.field2127[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2140[var33] * var25 + this.field2133[var33] * var23 + this.field2127[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2112[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2124[var29];
                    short var37 = this.field2112[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2140[var36] * var25 + this.field2133[var36] * var23 + this.field2127[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2140[var36] * var25 + this.field2133[var36] * var23 + this.field2127[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2112[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1074(this.field2120[var29], this.field2134[var29], var32, this.field2097[var29]);
                    int var40 = method1074(this.field2120[var29], this.field2134[var29], var35, this.field2097[var29]);
                    int var41 = method1074(this.field2120[var29], this.field2134[var29], var38, this.field2097[var29]);
                    field2096.field3866 = var6 * var30 + this.field2126.field3539;
                    field2096.method1773(var39, false);
                    field2096.field3866 = var6 * var33 + this.field2126.field3539;
                    field2096.method1773(var40, false);
                    field2096.field3866 = var6 * var36 + this.field2126.field3539;
                    field2096.method1773(var41, false);
                }
                this.field2133 = null;
                this.field2127 = null;
                this.field2140 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2138;
            float var45 = 3.0F / (float) (this.field2138 / 2 + this.field2138);
            field2096.field3866 = this.field2136.field3539;
            if (class73.field1075) {
                for (int var46 = 0; var46 < this.field2109; var46++) {
                    short var47 = this.field2112[var46];
                    if (var47 == 0) {
                        field2096.method1779((byte) 126, (float) this.field2133[var46] * var45);
                        field2096.method1779((byte) -12, (float) this.field2127[var46] * var45);
                        field2096.method1779((byte) 119, (float) this.field2140[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2096.method1779((byte) 4, (float) this.field2133[var46] * var48);
                        field2096.method1779((byte) -53, (float) this.field2127[var46] * var48);
                        field2096.method1779((byte) 127, (float) this.field2140[var46] * var48);
                    }
                    field2096.field3866 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2109; var49++) {
                    short var50 = this.field2112[var49];
                    if (var50 == 0) {
                        field2096.method1757(116, (float) this.field2133[var49] * var45);
                        field2096.method1757(113, (float) this.field2127[var49] * var45);
                        field2096.method1757(126, (float) this.field2140[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2096.method1757(-57, (float) this.field2133[var49] * var51);
                        field2096.method1757(116, (float) this.field2127[var49] * var51);
                        field2096.method1757(-59, (float) this.field2140[var49] * var51);
                    }
                    field2096.field3866 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2096.field3866 = this.field2106.field3539;
            if (class73.field1075) {
                for (int var52 = 0; var52 < this.field2109; var52++) {
                    field2096.method1779((byte) -121, this.field2111[var52]);
                    field2096.method1779((byte) 16, this.field2110[var52]);
                    field2096.field3866 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2109; var53++) {
                    field2096.method1757(104, this.field2111[var53]);
                    field2096.method1757(-118, this.field2110[var53]);
                    field2096.field3866 += var6 - 8;
                }
            }
        }
        field2096.field3866 = this.field2109 * var6;
        if (arg0) {
            if (class73.field1056) {
                ByteBuffer var54 = ByteBuffer.wrap(field2096.field3840, 0, field2096.field3866);
                if (this.field2139 == null) {
                    this.field2139 = new class236(true);
                    this.field2139.method1643(var54);
                } else {
                    this.field2139.method1645(var54);
                }
                if (arg1) {
                    this.field2104.field3547 = true;
                    this.field2104.field3553 = null;
                    this.field2104.field3551 = this.field2139;
                    this.field2104.field3550 = var6;
                }
                if (arg2) {
                    this.field2126.field3547 = true;
                    this.field2126.field3553 = null;
                    this.field2126.field3551 = this.field2139;
                    this.field2126.field3550 = var6;
                }
                if (arg3) {
                    this.field2136.field3547 = true;
                    this.field2136.field3553 = null;
                    this.field2136.field3551 = this.field2139;
                    this.field2136.field3550 = var6;
                }
                if (arg4) {
                    this.field2106.field3547 = true;
                    this.field2106.field3553 = null;
                    this.field2106.field3551 = this.field2139;
                    this.field2106.field3550 = var6;
                }
            } else {
                if (field2129 == null || field2129.capacity() < field2096.field3866) {
                    field2129 = ByteBuffer.allocateDirect(var6 * 100 + field2096.field3866);
                } else {
                    field2129.clear();
                }
                field2129.put(field2096.field3840, 0, field2096.field3866);
                field2129.flip();
                if (arg1) {
                    this.field2104.field3547 = true;
                    this.field2104.field3553 = field2129;
                    this.field2104.field3551 = null;
                    this.field2104.field3550 = var6;
                }
                if (arg2) {
                    this.field2126.field3547 = true;
                    this.field2126.field3553 = field2129;
                    this.field2104.field3551 = null;
                    this.field2126.field3550 = var6;
                }
                if (arg3) {
                    this.field2136.field3547 = true;
                    this.field2136.field3553 = field2129;
                    this.field2136.field3551 = null;
                    this.field2136.field3550 = var6;
                }
                if (arg4) {
                    this.field2106.field3547 = true;
                    this.field2106.field3553 = field2129;
                    this.field2106.field3551 = null;
                    this.field2106.field3550 = var6;
                }
            }
        } else if (class73.field1066) {
            class236 var55 = new class236();
            ByteBuffer var56 = ByteBuffer.wrap(field2096.field3840, 0, field2096.field3866);
            var55.method1643(var56);
            if (arg1) {
                this.field2104.field3547 = true;
                this.field2104.field3553 = null;
                this.field2104.field3551 = var55;
                this.field2104.field3550 = var6;
            }
            if (arg2) {
                this.field2126.field3547 = true;
                this.field2126.field3553 = null;
                this.field2126.field3551 = var55;
                this.field2126.field3550 = var6;
            }
            if (arg3) {
                this.field2136.field3547 = true;
                this.field2136.field3553 = null;
                this.field2136.field3551 = var55;
                this.field2136.field3550 = var6;
            }
            if (arg4) {
                this.field2106.field3547 = true;
                this.field2106.field3553 = null;
                this.field2106.field3551 = var55;
                this.field2106.field3550 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2096.field3866);
            var57.put(field2096.field3840, 0, field2096.field3866);
            var57.flip();
            if (arg1) {
                this.field2104.field3547 = true;
                this.field2104.field3553 = var57;
                this.field2104.field3551 = null;
                this.field2104.field3550 = var6;
            }
            if (arg2) {
                this.field2126.field3547 = true;
                this.field2126.field3553 = var57;
                this.field2104.field3551 = null;
                this.field2126.field3550 = var6;
            }
            if (arg3) {
                this.field2136.field3547 = true;
                this.field2136.field3553 = var57;
                this.field2136.field3551 = null;
                this.field2136.field3550 = var6;
            }
            if (arg4) {
                this.field2106.field3547 = true;
                this.field2106.field3553 = var57;
                this.field2106.field3551 = null;
                this.field2106.field3550 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "()V", line = 3971)
    public final void method1071() {
        for (int var1 = 0; var1 < this.field2132; var1++) {
            this.field2128[var1] = -this.field2128[var1];
        }
        if (this.field2140 != null) {
            for (int var2 = 0; var2 < this.field2109; var2++) {
                this.field2140[var2] = (short) (-this.field2140[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2123; var3++) {
            short var4 = this.field2100[var3];
            this.field2100[var3] = this.field2124[var3];
            this.field2124[var3] = var4;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
        this.field2105.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "()V", line = 4007)
    public static void method1072() {
        field2121 = null;
        field2096 = null;
        field2129 = null;
        field2125 = null;
        field2137 = null;
        field2142 = null;
        field2143 = null;
        field2144 = null;
        field2145 = null;
        field2156 = null;
        field2154 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(ZZZ)Lr;", line = 4020)
    public final class74 method589(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1078(arg0, arg1, arg2, field2145, field2144);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()Z", line = 4023)
    public final boolean method846() {
        return this.field2103 && this.field2131 != null && this.field2133 != null;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 4026)
    public final void method1073(int arg0) {
        this.field2118 = (short) arg0;
        this.field2126.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ISIB)I", line = 4032)
    private static final int method1074(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class164.field2659[class113.method866(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class164.field2662.method665((byte) -90, arg1 & 0xFFFF);
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
            int var9 = class164.field2662.method662((byte) 3, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII[FFIF)V", line = 4092)
    private static final void method1075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field2157 = var16;
        field2155 = var17;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()I", line = 4137)
    public final int method565() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field489;
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V", line = 4145)
    public final void method1076(int arg0) {
        this.field2138 = (short) arg0;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(ZZZ)Lr;", line = 4155)
    public final class74 method591(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1078(arg0, arg1, arg2, field2143, field2142);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(SS)V", line = 4163)
    public final void method1077(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2123; var3++) {
            if (this.field2134[var3] == arg0) {
                this.field2134[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class164.field2662.method665((byte) -68, arg0 & 0xFFFF);
            var5 = class164.field2662.method662((byte) 115, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class164.field2662.method665((byte) 53, arg1 & 0xFFFF);
            var7 = class164.field2662.method662((byte) 112, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2126.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "()V", line = 4200)
    public final void method573() {
        for (int var1 = 0; var1 < this.field2132; var1++) {
            this.field2131[var1] = -this.field2131[var1];
            this.field2128[var1] = -this.field2128[var1];
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()I", line = 4220)
    public final int method562() {
        if (!this.field2101.field488) {
            this.method1055();
        }
        return this.field2101.field483;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZLdh;Ldh;)Lr;", line = 4226)
    private final class74 method1078(boolean arg0, boolean arg1, boolean arg2, class140 arg3, class140 arg4) {
        arg3.field2132 = this.field2132;
        arg3.field2098 = this.field2098;
        arg3.field2109 = this.field2109;
        arg3.field2123 = this.field2123;
        arg3.field2118 = this.field2118;
        arg3.field2138 = this.field2138;
        arg3.field2108 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field2131 == null || arg3.field2131.length < this.field2132) {
            arg3.field2131 = new int[this.field2132 + 100];
            arg3.field2102 = new int[this.field2132 + 100];
            arg3.field2128 = new int[this.field2132 + 100];
        }
        for (int var6 = 0; var6 < this.field2132; var6++) {
            arg3.field2131[var6] = this.field2131[var6];
            arg3.field2102[var6] = this.field2102[var6];
            arg3.field2128[var6] = this.field2128[var6];
        }
        if (arg3.field2104 == null) {
            arg3.field2104 = new class233();
        }
        arg3.field2104.field3547 = false;
        if (arg3.field2101 == null) {
            arg3.field2101 = new class33();
        }
        arg3.field2101.field488 = false;
        if (arg0) {
            arg3.field2097 = this.field2097;
        } else {
            if (arg4.field2097 == null || arg4.field2097.length < this.field2123) {
                arg4.field2097 = new byte[this.field2123 + 100];
            }
            arg3.field2097 = arg4.field2097;
            for (int var7 = 0; var7 < this.field2123; var7++) {
                arg3.field2097[var7] = this.field2097[var7];
            }
        }
        if (arg1) {
            arg3.field2120 = this.field2120;
        } else {
            if (arg4.field2120 == null || arg4.field2120.length < this.field2123) {
                arg4.field2120 = new short[this.field2123 + 100];
            }
            arg3.field2120 = arg4.field2120;
            for (int var8 = 0; var8 < this.field2123; var8++) {
                arg3.field2120[var8] = this.field2120[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field2126 = this.field2126;
        } else {
            if (arg4.field2126 == null) {
                arg4.field2126 = new class233();
            }
            arg3.field2126 = arg4.field2126;
            arg3.field2126.field3547 = false;
        }
        if (arg2 || this.field2133 == null) {
            arg3.field2133 = this.field2133;
            arg3.field2127 = this.field2127;
            arg3.field2140 = this.field2140;
            arg3.field2112 = this.field2112;
            arg3.field2136 = this.field2136;
        } else {
            if (arg4.field2133 == null || arg4.field2133.length < this.field2109) {
                arg4.field2133 = new short[this.field2109 + 100];
                arg4.field2127 = new short[this.field2109 + 100];
                arg4.field2140 = new short[this.field2109 + 100];
                arg4.field2112 = new short[this.field2109 + 100];
            }
            arg3.field2133 = arg4.field2133;
            arg3.field2127 = arg4.field2127;
            arg3.field2140 = arg4.field2140;
            arg3.field2112 = arg4.field2112;
            for (int var9 = 0; var9 < this.field2109; var9++) {
                arg3.field2133[var9] = this.field2133[var9];
                arg3.field2127[var9] = this.field2127[var9];
                arg3.field2140[var9] = this.field2140[var9];
                arg3.field2112[var9] = this.field2112[var9];
            }
            if (class309.field4812) {
                if (arg4.field2136 == null) {
                    arg4.field2136 = new class233();
                }
                arg3.field2136 = arg4.field2136;
                arg3.field2136.field3547 = false;
            } else {
                arg3.field2136 = null;
            }
        }
        arg3.field2111 = this.field2111;
        arg3.field2110 = this.field2110;
        arg3.field2141 = this.field2141;
        arg3.field2116 = this.field2116;
        arg3.field2100 = this.field2100;
        arg3.field2122 = this.field2122;
        arg3.field2124 = this.field2124;
        arg3.field2134 = this.field2134;
        arg3.field2099 = this.field2099;
        arg3.field2130 = this.field2130;
        arg3.field2106 = this.field2106;
        arg3.field2105 = this.field2105;
        arg3.field2113 = this.field2113;
        arg3.field2114 = this.field2114;
        arg3.field2107 = this.field2107;
        arg3.field1085 = this.field1085;
        arg3.field2115 = this.field2115;
        arg3.field2117 = this.field2117;
        return arg3;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 4386)
    public final void method559(int arg0) {
        int var2 = class164.field2650[arg0];
        int var3 = class164.field2664[arg0];
        for (int var4 = 0; var4 < this.field2132; var4++) {
            int var5 = this.field2102[var4] * var3 - this.field2128[var4] * var2 >> 16;
            this.field2128[var4] = this.field2128[var4] * var3 + this.field2102[var4] * var2 >> 16;
            this.field2102[var4] = var5;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FFF)I", line = 4406)
    private static final int method1079(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZZ)Lr;", line = 4440)
    public final class74 method586(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1078(arg0, arg1, arg2, field2137, field2125);
    }

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "()V", line = 4443)
    public final void method1080() {
        if (this.field2133 == null) {
            this.method573();
            return;
        }
        for (int var1 = 0; var1 < this.field2132; var1++) {
            this.field2131[var1] = -this.field2131[var1];
            this.field2128[var1] = -this.field2128[var1];
        }
        for (int var2 = 0; var2 < this.field2109; var2++) {
            this.field2133[var2] = (short) (-this.field2133[var2]);
            this.field2140[var2] = (short) (-this.field2140[var2]);
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
        if (this.field2136 != null) {
            this.field2136.field3547 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "()V", line = 4478)
    public final void method570() {
        for (int var1 = 0; var1 < this.field2132; var1++) {
            int var2 = this.field2128[var1];
            this.field2128[var1] = this.field2131[var1];
            this.field2131[var1] = -var2;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIJ)V", line = 4495)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2109 == 0) {
            return;
        }
        GL var10 = class73.field1051;
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
        this.method1051();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V", line = 4526)
    public final void method567(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2132; var4++) {
            this.field2131[var4] += arg0;
            this.field2102[var4] += arg1;
            this.field2128[var4] += arg2;
        }
        this.field2101.field488 = false;
        this.field2104.field3547 = false;
    }
}
