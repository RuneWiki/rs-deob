import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class171 extends class199 {

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    private int field2660 = 0;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Z")
    public boolean field2687 = false;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public int field2666 = 0;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "B")
    private byte field2671 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "B")
    private byte field2656 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2675 = 0;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[I")
    private int[] field2683;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
    public int[] field2690;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
    public int[] field2676;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "[I")
    public int[] field2668;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "[I")
    private int[] field2691;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "[S")
    private short[] field2681;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[S")
    private short[] field2695;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "[S")
    private short[] field2693;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "[S")
    private short[] field2685;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "[S")
    private short[] field2684;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "[F")
    private float[] field2670;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "[F")
    private float[] field2692;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "[S")
    private short[] field2665;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "[B")
    private byte[] field2678;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[S")
    private short[] field2655;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[S")
    private short[] field2674;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[S")
    private short[] field2673;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "[S")
    private short[] field2680;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[B")
    private byte[] field2654;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[S")
    private short[] field2672;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lnm;")
    public class187 field2662;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "Lu;")
    public class256 field2696;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lu;")
    private class256 field2669;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Lu;")
    private class256 field2664;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lu;")
    private class256 field2663;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Lu;")
    private class256 field2686;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "S")
    private short field2657;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "S")
    private short field2659;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "[S")
    private short[] field2694;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    private int[] field2682;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lpe;")
    private static class101 field2658 = new class101(10000);

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "Lgb;")
    private static class171 field2679 = new class171();

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lgb;")
    private static class171 field2698 = new class171();

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lgb;")
    private static class171 field2699 = new class171();

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "Lgb;")
    private static class171 field2700 = new class171();

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lgb;")
    private static class171 field2701 = new class171();

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "Lgb;")
    private static class171 field2702 = new class171();

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "Z")
    private static boolean field2704 = false;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "[I")
    private static int[] field2708 = new int[1];

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "[I")
    private static int[] field2707 = new int[1];

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "F")
    private static float field2703;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "F")
    private static float field2705;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "F")
    private static float field2709;

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "F")
    private static float field2710;

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "F")
    private static float field2712;

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "F")
    private static float field2714;

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
    private static int field2706;

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "I")
    private static int field2711;

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
    private static int field2713;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lll;")
    private class158 field2688;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lgg;")
    private class72 field2661;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2697;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "[J")
    private static long[] field2677;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "[[I")
    private int[][] field2667;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "[[I")
    private int[][] field2689;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 6)
    private static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field2712 = var18;
        field2703 = var19;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([FI)[F", line = 86)
    private static final float[] method1244(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class271.method1956(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Ldg;", line = 91)
    public final class320 method988(int arg0, int arg1, int arg2) {
        this.field2687 = false;
        if (this.field2661 != null) {
            this.field2695 = this.field2661.field1123;
            this.field2693 = this.field2661.field1126;
            this.field2685 = this.field2661.field1125;
            this.field2684 = this.field2661.field1124;
            this.field2661 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V", line = 104)
    public final void method1127(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2713 = 0;
            field2706 = 0;
            field2711 = 0;
            for (int var6 = 0; var6 < this.field2666; var6++) {
                field2713 += this.field2690[var6];
                field2706 += this.field2676[var6];
                field2711 += this.field2668[var6];
                var5++;
            }
            if (var5 > 0) {
                field2713 = field2713 / var5 + arg1;
                field2706 = field2706 / var5 + arg2;
                field2711 = field2711 / var5 + arg3;
            } else {
                field2713 = arg1;
                field2706 = arg2;
                field2711 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2666; var7++) {
                this.field2690[var7] += arg1;
                this.field2676[var7] += arg2;
                this.field2668[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2666; var8++) {
                this.field2690[var8] -= field2713;
                this.field2676[var8] -= field2706;
                this.field2668[var8] -= field2711;
                if (arg3 != 0) {
                    int var9 = class174.field2731[arg3];
                    int var10 = class174.field2732[arg3];
                    int var11 = this.field2690[var8] * var10 + this.field2676[var8] * var9 + 32767 >> 16;
                    this.field2676[var8] = this.field2676[var8] * var10 + 32767 - this.field2690[var8] * var9 >> 16;
                    this.field2690[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class174.field2731[arg1];
                    int var13 = class174.field2732[arg1];
                    int var14 = this.field2676[var8] * var13 + 32767 - this.field2668[var8] * var12 >> 16;
                    this.field2668[var8] = this.field2676[var8] * var12 + this.field2668[var8] * var13 + 32767 >> 16;
                    this.field2676[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class174.field2731[arg2];
                    int var16 = class174.field2732[arg2];
                    int var17 = this.field2690[var8] * var16 + this.field2668[var8] * var15 + 32767 >> 16;
                    this.field2668[var8] = this.field2668[var8] * var16 + 32767 - this.field2690[var8] * var15 >> 16;
                    this.field2690[var8] = var17;
                }
                this.field2690[var8] += field2713;
                this.field2676[var8] += field2706;
                this.field2668[var8] += field2711;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2666; var18++) {
                this.field2690[var18] -= field2713;
                this.field2676[var18] -= field2706;
                this.field2668[var18] -= field2711;
                this.field2690[var18] = this.field2690[var18] * arg1 / 128;
                this.field2676[var18] = this.field2676[var18] * arg2 / 128;
                this.field2668[var18] = this.field2668[var18] * arg3 / 128;
                this.field2690[var18] += field2713;
                this.field2676[var18] += field2706;
                this.field2668[var18] += field2711;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2675; var19++) {
                int var20 = (this.field2678[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2678[var19] = (byte) var20;
            }
            this.field2669.field3964 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field2675; var21++) {
                int var22 = this.field2665[var21] & 0xFFFF;
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
                this.field2665[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field2669.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "()I", line = 298)
    public final int method1102() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2990;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIFFF)[F", line = 305)
    private static final float[] method1245(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)Z", line = 378)
    private final boolean method1246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lnb;)Lnb;", line = 393)
    public final class315 method1247(class315 arg0) {
        if (this.field2660 == 0) {
            return null;
        }
        if (!this.field2662.field2985) {
            this.method1249();
        }
        int var2;
        int var3;
        if (class97.field1614 > 0) {
            var2 = this.field2662.field2983 - (class97.field1614 * this.field2662.field2987 >> 8) >> 3;
            var3 = this.field2662.field2989 - (class97.field1614 * this.field2662.field2988 >> 8) >> 3;
        } else {
            var2 = this.field2662.field2983 - (class97.field1614 * this.field2662.field2988 >> 8) >> 3;
            var3 = this.field2662.field2989 - (class97.field1614 * this.field2662.field2987 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class97.field1612 > 0) {
            var4 = this.field2662.field2990 - (class97.field1612 * this.field2662.field2987 >> 8) >> 3;
            var5 = this.field2662.field2986 - (class97.field1612 * this.field2662.field2988 >> 8) >> 3;
        } else {
            var4 = this.field2662.field2990 - (class97.field1612 * this.field2662.field2988 >> 8) >> 3;
            var5 = this.field2662.field2986 - (class97.field1612 * this.field2662.field2987 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class315 var8;
        if (arg0 == null || arg0.field4925.length < var6 * var7) {
            var8 = new class315(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4263 = arg0.field4264 = var6;
            arg0.field4266 = arg0.field4256 = var7;
            arg0.method2168();
        }
        var8.field4262 = var2;
        var8.field4267 = var4;
        if (field2708.length < this.field2660) {
            field2708 = new int[this.field2660];
            field2707 = new int[this.field2660];
        }
        for (int var9 = 0; var9 < this.field2666; var9++) {
            int var10 = (this.field2690[var9] - (this.field2676[var9] * class97.field1614 >> 8) >> 3) - var2;
            int var11 = (this.field2668[var9] - (this.field2676[var9] * class97.field1612 >> 8) >> 3) - var4;
            int var12 = this.field2683[var9];
            int var13 = this.field2683[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2694[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2708[var15] = var10;
                field2707[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2675; var16++) {
            if (this.field2678[var16] <= 128) {
                short var17 = this.field2655[var16];
                short var18 = this.field2674[var16];
                short var19 = this.field2673[var16];
                int var20 = field2708[var17];
                int var21 = field2708[var18];
                int var22 = field2708[var19];
                int var23 = field2707[var17];
                int var24 = field2707[var18];
                int var25 = field2707[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class174.method1285(var8.field4925, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I", line = 516)
    public final int method207() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2988;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lqa;IJIIIIFF)S", line = 526)
    private final short method1248(class130 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2683[arg1];
        int var12 = this.field2683[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2694[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2677[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2694[var13] = (short) (this.field2660 + 1);
        field2677[var13] = arg2;
        this.field2695[this.field2660] = (short) arg3;
        this.field2693[this.field2660] = (short) arg4;
        this.field2685[this.field2660] = (short) arg5;
        this.field2684[this.field2660] = (short) arg6;
        this.field2670[this.field2660] = arg7;
        this.field2692[this.field2660] = arg8;
        return (short) (this.field2660++);
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "()V", line = 566)
    public final void method1112() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2690[var1] = -this.field2690[var1];
            this.field2668[var1] = -this.field2668[var1];
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 4527)
    private class171() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lqa;IIZ)V", line = 4529)
    public class171(class130 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2083];
        this.field2683 = new int[arg0.field2053 + 1];
        for (int var6 = 0; var6 < arg0.field2083; var6++) {
            if ((arg0.field2055 == null || arg0.field2055[var6] != 2) && (arg0.field2101 == null || arg0.field2101[var6] == -1 || !class174.field2734.method1475(arg0.field2101[var6] & 0xFFFF, 60))) {
                var5[this.field2675++] = var6;
                this.field2683[arg0.field2098[var6]]++;
                this.field2683[arg0.field2057[var6]]++;
                this.field2683[arg0.field2070[var6]]++;
            }
        }
        long[] var7 = new long[this.field2675];
        for (int var8 = 0; var8 < this.field2675; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2101 != null) {
                var14 = arg0.field2101[var9];
                if (var14 != -1) {
                    var12 = class174.field2734.method1478(255, var14 & 0xFFFF);
                    var13 = class174.field2734.method1483(false, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2078 != null && arg0.field2078[var9] != 0 || var14 != -1 && !class174.field2734.method1466(0, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2097 != null) {
                var10 += arg0.field2097[var9] << 17;
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
        class42.method347(var5, var7, 0);
        this.field2666 = arg0.field2053;
        this.field2690 = arg0.field2061;
        this.field2676 = arg0.field2092;
        this.field2668 = arg0.field2062;
        this.field2691 = arg0.field2093;
        this.field2681 = arg0.field2080;
        int var20 = this.field2675 * 3;
        this.field2695 = new short[var20];
        this.field2693 = new short[var20];
        this.field2685 = new short[var20];
        this.field2684 = new short[var20];
        this.field2670 = new float[var20];
        this.field2692 = new float[var20];
        this.field2665 = new short[this.field2675];
        this.field2678 = new byte[this.field2675];
        this.field2655 = new short[this.field2675];
        this.field2674 = new short[this.field2675];
        this.field2673 = new short[this.field2675];
        this.field2680 = new short[this.field2675];
        if (arg0.field2085 != null) {
            this.field2654 = new byte[this.field2675];
        }
        if (arg0.field2095 != null) {
            this.field2672 = new short[this.field2675];
        }
        this.field2662 = new class187();
        this.field2696 = new class256();
        this.field2669 = new class256();
        if (class302.field4753) {
            this.field2664 = new class256();
        }
        this.field2663 = new class256();
        this.field2686 = new class256();
        this.field2657 = (short) arg1;
        this.field2659 = (short) arg2;
        this.field2694 = new short[var20];
        field2677 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2053; var22++) {
            int var23 = this.field2683[var22];
            this.field2683[var22] = var21;
            var21 += var23;
        }
        this.field2683[arg0.field2053] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2102 != null) {
            int var28 = arg0.field2068;
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
            for (int var36 = 0; var36 < this.field2675; var36++) {
                int var37 = var5[var36];
                if (arg0.field2102[var37] != -1) {
                    int var38 = arg0.field2102[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2098[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2057[var37];
                        } else {
                            var40 = arg0.field2070[var37];
                        }
                        int var41 = arg0.field2061[var40];
                        int var42 = arg0.field2092[var40];
                        int var43 = arg0.field2062[var40];
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
                byte var45 = arg0.field2079[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2091[var44];
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
                        var49 = 64.0F / (float) (arg0.field2066[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2091[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2066[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2071[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2091[var44] / 1024.0F;
                        var49 = (float) arg0.field2066[var44] / 1024.0F;
                        var48 = (float) arg0.field2071[var44] / 1024.0F;
                    }
                    var27[var44] = method1245(arg0.field2099[var44], arg0.field2082[var44], arg0.field2056[var44], arg0.field2075[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2675; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2060[var51] & 0xFFFF;
            short var53;
            if (arg0.field2101 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2101[var51];
            }
            int var54;
            if (arg0.field2102 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2102[var51];
            }
            int var55;
            if (arg0.field2078 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2078[var51] & 0xFF;
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
                    byte var65 = arg0.field2079[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2098[var51];
                        int var67 = arg0.field2057[var51];
                        int var68 = arg0.field2070[var51];
                        short var69 = arg0.field2099[var54];
                        short var70 = arg0.field2082[var54];
                        short var71 = arg0.field2056[var54];
                        float var72 = (float) arg0.field2061[var69];
                        float var73 = (float) arg0.field2092[var69];
                        float var74 = (float) arg0.field2062[var69];
                        float var75 = (float) arg0.field2061[var70] - var72;
                        float var76 = (float) arg0.field2092[var70] - var73;
                        float var77 = (float) arg0.field2062[var70] - var74;
                        float var78 = (float) arg0.field2061[var71] - var72;
                        float var79 = (float) arg0.field2092[var71] - var73;
                        float var80 = (float) arg0.field2062[var71] - var74;
                        float var81 = (float) arg0.field2061[var66] - var72;
                        float var82 = (float) arg0.field2092[var66] - var73;
                        float var83 = (float) arg0.field2062[var66] - var74;
                        float var84 = (float) arg0.field2061[var67] - var72;
                        float var85 = (float) arg0.field2092[var67] - var73;
                        float var86 = (float) arg0.field2062[var67] - var74;
                        float var87 = (float) arg0.field2061[var68] - var72;
                        float var88 = (float) arg0.field2092[var68] - var73;
                        float var89 = (float) arg0.field2062[var68] - var74;
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
                        int var101 = arg0.field2098[var51];
                        int var102 = arg0.field2057[var51];
                        int var103 = arg0.field2070[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2089[var54];
                        float var109 = (float) arg0.field2096[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2071[var54] & 0xFFFF) / 1024.0F;
                            method1274(arg0.field2061[var101], arg0.field2092[var101], arg0.field2062[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2714;
                            var57 = field2709;
                            method1274(arg0.field2061[var102], arg0.field2092[var102], arg0.field2062[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2714;
                            var59 = field2709;
                            method1274(arg0.field2061[var103], arg0.field2092[var103], arg0.field2062[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2714;
                            var61 = field2709;
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
                            float var112 = (float) arg0.field2088[var54] / 256.0F;
                            float var113 = (float) arg0.field2059[var54] / 256.0F;
                            int var114 = arg0.field2061[var102] - arg0.field2061[var101];
                            int var115 = arg0.field2092[var102] - arg0.field2092[var101];
                            int var116 = arg0.field2062[var102] - arg0.field2062[var101];
                            int var117 = arg0.field2061[var103] - arg0.field2061[var101];
                            int var118 = arg0.field2092[var103] - arg0.field2092[var101];
                            int var119 = arg0.field2062[var103] - arg0.field2062[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2091[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2066[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2071[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1262(var126, var127, var128);
                            method1243(arg0.field2061[var101], arg0.field2092[var101], arg0.field2062[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2712;
                            var57 = field2703;
                            method1243(arg0.field2061[var102], arg0.field2092[var102], arg0.field2062[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2712;
                            var59 = field2703;
                            method1243(arg0.field2061[var103], arg0.field2092[var103], arg0.field2062[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2712;
                            var61 = field2703;
                        } else if (var65 == 3) {
                            method1257(arg0.field2061[var101], arg0.field2092[var101], arg0.field2062[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2705;
                            var57 = field2710;
                            method1257(arg0.field2061[var102], arg0.field2092[var102], arg0.field2062[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2705;
                            var59 = field2710;
                            method1257(arg0.field2061[var103], arg0.field2092[var103], arg0.field2062[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2705;
                            var61 = field2710;
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
            arg0.method978();
            byte var129;
            if (arg0.field2055 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2055[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2098[var51];
                class160 var133 = arg0.field2058[var132];
                this.field2655[var50] = this.method1248(arg0, var132, var130, var133.field2523, var133.field2515, var133.field2520, var133.field2519, var56, var57);
                int var134 = arg0.field2057[var51];
                class160 var135 = arg0.field2058[var134];
                this.field2674[var50] = this.method1248(arg0, var134, (long) var62 + var130, var135.field2523, var135.field2515, var135.field2520, var135.field2519, var58, var59);
                int var136 = arg0.field2070[var51];
                class160 var137 = arg0.field2058[var136];
                this.field2673[var50] = this.method1248(arg0, var136, (long) var63 + var130, var137.field2523, var137.field2515, var137.field2520, var137.field2519, var60, var61);
            } else if (var129 == 1) {
                class48 var138 = arg0.field2076[var51];
                long var139 = (long) ((var54 << 2) + (var138.field798 > 0 ? 1024 : 2048) + (var138.field797 + 256 << 12) + (var138.field799 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2655[var50] = this.method1248(arg0, arg0.field2098[var51], var139, var138.field798, var138.field797, var138.field799, 0, var56, var57);
                this.field2674[var50] = this.method1248(arg0, arg0.field2057[var51], (long) var62 + var139, var138.field798, var138.field797, var138.field799, 0, var58, var59);
                this.field2673[var50] = this.method1248(arg0, arg0.field2070[var51], (long) var63 + var139, var138.field798, var138.field797, var138.field799, 0, var60, var61);
            }
            if (arg0.field2101 == null) {
                this.field2680[var50] = -1;
            } else {
                this.field2680[var50] = arg0.field2101[var51];
            }
            if (this.field2654 != null) {
                this.field2654[var50] = (byte) arg0.field2085[var51];
            }
            this.field2665[var50] = arg0.field2060[var51];
            if (arg0.field2078 != null) {
                this.field2678[var50] = arg0.field2078[var51];
            }
            if (arg0.field2095 != null) {
                this.field2672[var50] = arg0.field2095[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2675; var143++) {
            short var144 = this.field2680[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2682 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2675; var147++) {
            short var148 = this.field2680[var147];
            if (var146 != var148) {
                this.field2682[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2682[var145] = this.field2675;
        field2677 = null;
        this.field2695 = method1255(this.field2695, this.field2660);
        this.field2693 = method1255(this.field2693, this.field2660);
        this.field2685 = method1255(this.field2685, this.field2660);
        this.field2684 = method1255(this.field2684, this.field2660);
        this.field2670 = method1244(this.field2670, this.field2660);
        this.field2692 = method1244(this.field2692, this.field2660);
    }

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "()V", line = 582)
    private final void method1249() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2666; var9++) {
            int var10 = this.field2690[var9];
            int var11 = this.field2676[var9];
            int var12 = this.field2668[var9];
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
        this.field2662.field2983 = (short) var1;
        this.field2662.field2989 = (short) var4;
        this.field2662.field2988 = (short) var2;
        this.field2662.field2987 = (short) var5;
        this.field2662.field2990 = (short) var3;
        this.field2662.field2986 = (short) var6;
        this.field2662.field2984 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2662.field2985 = true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ISIB)I", line = 652)
    private static final int method1250(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class174.field2740[class146.method1124(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class174.field2734.method1471((byte) -100, arg1 & 0xFFFF);
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
            int var9 = class174.field2734.method1481(arg1 & 0xFFFF, -23794);
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

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V", line = 710)
    public final void method1251(int arg0) {
        if (this.field2695 == null) {
            this.method1134(arg0);
            return;
        }
        int var2 = class174.field2731[arg0];
        int var3 = class174.field2732[arg0];
        for (int var4 = 0; var4 < this.field2666; var4++) {
            int var5 = this.field2690[var4] * var3 + this.field2668[var4] * var2 >> 16;
            this.field2668[var4] = this.field2668[var4] * var3 - this.field2690[var4] * var2 >> 16;
            this.field2690[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2660; var6++) {
            int var7 = this.field2695[var6] * var3 + this.field2685[var6] * var2 >> 16;
            this.field2685[var6] = (short) (this.field2685[var6] * var3 - this.field2695[var6] * var2 >> 16);
            this.field2695[var6] = (short) var7;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "()V", line = 751)
    public static final void method1252() {
        field2679 = new class171();
        field2698 = new class171();
        field2699 = new class171();
        field2700 = new class171();
        field2701 = new class171();
        field2702 = new class171();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(SS)V", line = 762)
    public final void method1253(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2675; var3++) {
            if (this.field2665[var3] == arg0) {
                this.field2665[var3] = arg1;
            }
        }
        this.field2669.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[IIIIZI[I)V", line = 775)
    public final void method1126(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field2713 = 0;
            field2706 = 0;
            field2711 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2667.length) {
                    int[] var16 = this.field2667[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2681 == null || (arg6 & this.field2681[var18]) != 0) {
                            field2713 += this.field2690[var18];
                            field2706 += this.field2676[var18];
                            field2711 += this.field2668[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field2713 = field2713 / var13 + var10;
                field2706 = field2706 / var13 + var11;
                field2711 = field2711 / var13 + var12;
                field2704 = true;
            } else {
                field2713 = var10;
                field2706 = var11;
                field2711 = var12;
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
                if (var26 < this.field2667.length) {
                    int[] var27 = this.field2667[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2681 == null || (arg6 & this.field2681[var29]) != 0) {
                            this.field2690[var29] += var22;
                            this.field2676[var29] += var23;
                            this.field2668[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field2667.length) {
                        int[] var92 = this.field2667[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field2681 == null || (arg6 & this.field2681[var94]) != 0) {
                                this.field2690[var94] -= field2713;
                                this.field2676[var94] -= field2706;
                                this.field2668[var94] -= field2711;
                                if (arg4 != 0) {
                                    int var95 = class174.field2731[arg4];
                                    int var96 = class174.field2732[arg4];
                                    int var97 = this.field2690[var94] * var96 + this.field2676[var94] * var95 + 32767 >> 16;
                                    this.field2676[var94] = this.field2676[var94] * var96 + 32767 - this.field2690[var94] * var95 >> 16;
                                    this.field2690[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class174.field2731[arg2];
                                    int var99 = class174.field2732[arg2];
                                    int var100 = this.field2676[var94] * var99 + 32767 - this.field2668[var94] * var98 >> 16;
                                    this.field2668[var94] = this.field2676[var94] * var98 + this.field2668[var94] * var99 + 32767 >> 16;
                                    this.field2676[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class174.field2731[arg3];
                                    int var102 = class174.field2732[arg3];
                                    int var103 = this.field2690[var94] * var102 + this.field2668[var94] * var101 + 32767 >> 16;
                                    this.field2668[var94] = this.field2668[var94] * var102 + 32767 - this.field2690[var94] * var101 >> 16;
                                    this.field2690[var94] = var103;
                                }
                                this.field2690[var94] += field2713;
                                this.field2676[var94] += field2706;
                                this.field2668[var94] += field2711;
                            }
                        }
                    }
                }
                if (arg5 && this.field2695 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field2667.length) {
                            int[] var106 = this.field2667[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field2681 == null || (arg6 & this.field2681[var108]) != 0) {
                                    int var109 = this.field2683[var108];
                                    int var110 = this.field2683[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field2694[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class174.field2731[arg4];
                                            int var114 = class174.field2732[arg4];
                                            int var115 = this.field2695[var112] * var114 + this.field2693[var112] * var113 + 32767 >> 16;
                                            this.field2693[var112] = (short) (this.field2693[var112] * var114 + 32767 - this.field2695[var112] * var113 >> 16);
                                            this.field2695[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class174.field2731[arg2];
                                            int var117 = class174.field2732[arg2];
                                            int var118 = this.field2693[var112] * var117 + 32767 - this.field2685[var112] * var116 >> 16;
                                            this.field2685[var112] = (short) (this.field2693[var112] * var116 + this.field2685[var112] * var117 + 32767 >> 16);
                                            this.field2693[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class174.field2731[arg3];
                                            int var120 = class174.field2732[arg3];
                                            int var121 = this.field2695[var112] * var120 + this.field2685[var112] * var119 + 32767 >> 16;
                                            this.field2685[var112] = (short) (this.field2685[var112] * var120 + 32767 - this.field2695[var112] * var119 >> 16);
                                            this.field2695[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2664 != null) {
                        this.field2664.field3964 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field2704) {
                    int var36 = arg7[6] * field2711 + arg7[0] * field2713 + arg7[3] * field2706 + 16384 >> 15;
                    int var37 = arg7[7] * field2711 + arg7[1] * field2713 + arg7[4] * field2706 + 16384 >> 15;
                    int var38 = arg7[8] * field2711 + arg7[2] * field2713 + arg7[5] * field2706 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field2713 = var39;
                    field2706 = var40;
                    field2711 = var41;
                    field2704 = false;
                }
                int[] var42 = new int[9];
                int var43 = class174.field2732[arg2] >> 1;
                int var44 = class174.field2731[arg2] >> 1;
                int var45 = class174.field2732[arg3] >> 1;
                int var46 = class174.field2731[arg3] >> 1;
                int var47 = class174.field2732[arg4] >> 1;
                int var48 = class174.field2731[arg4] >> 1;
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
                int var51 = var42[2] * -field2711 + var42[0] * -field2713 + var42[1] * -field2706 + 16384 >> 15;
                int var52 = var42[5] * -field2711 + var42[3] * -field2713 + var42[4] * -field2706 + 16384 >> 15;
                int var53 = var42[8] * -field2711 + var42[6] * -field2713 + var42[7] * -field2706 + 16384 >> 15;
                int var54 = field2713 + var51;
                int var55 = field2706 + var52;
                int var56 = field2711 + var53;
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
                    if (var80 < this.field2667.length) {
                        int[] var81 = this.field2667[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field2681 == null || (arg6 & this.field2681[var83]) != 0) {
                                int var84 = this.field2668[var83] * var68[2] + this.field2690[var83] * var68[0] + this.field2676[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field2668[var83] * var68[5] + this.field2690[var83] * var68[3] + this.field2676[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field2668[var83] * var68[8] + this.field2690[var83] * var68[6] + this.field2676[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field2690[var83] = var87;
                                this.field2676[var83] = var88;
                                this.field2668[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field2667.length) {
                        int[] var174 = this.field2667[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2681 == null || (arg6 & this.field2681[var176]) != 0) {
                                this.field2690[var176] -= field2713;
                                this.field2676[var176] -= field2706;
                                this.field2668[var176] -= field2711;
                                this.field2690[var176] = this.field2690[var176] * arg2 >> 7;
                                this.field2676[var176] = this.field2676[var176] * arg3 >> 7;
                                this.field2668[var176] = this.field2668[var176] * arg4 >> 7;
                                this.field2690[var176] += field2713;
                                this.field2676[var176] += field2706;
                                this.field2668[var176] += field2711;
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
                if (field2704) {
                    int var128 = arg7[6] * field2711 + arg7[0] * field2713 + arg7[3] * field2706 + 16384 >> 15;
                    int var129 = arg7[7] * field2711 + arg7[1] * field2713 + arg7[4] * field2706 + 16384 >> 15;
                    int var130 = arg7[8] * field2711 + arg7[2] * field2713 + arg7[5] * field2706 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field2713 = var131;
                    field2706 = var132;
                    field2711 = var133;
                    field2704 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field2713 * var134 + 16384 >> 15;
                int var138 = -field2706 * var135 + 16384 >> 15;
                int var139 = -field2711 * var136 + 16384 >> 15;
                int var140 = field2713 + var137;
                int var141 = field2706 + var138;
                int var142 = field2711 + var139;
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
                    if (var162 < this.field2667.length) {
                        int[] var163 = this.field2667[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field2681 == null || (arg6 & this.field2681[var165]) != 0) {
                                int var166 = this.field2668[var165] * var150[2] + this.field2690[var165] * var150[0] + this.field2676[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field2668[var165] * var150[5] + this.field2690[var165] * var150[3] + this.field2676[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field2668[var165] * var150[8] + this.field2690[var165] * var150[6] + this.field2676[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field2690[var165] = var169;
                                this.field2676[var165] = var170;
                                this.field2668[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2689 != null && this.field2678 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field2689.length) {
                        int[] var179 = this.field2689[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field2672 == null || (arg6 & this.field2672[var181]) != 0) {
                                int var182 = (this.field2678[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field2678[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field2669.field3964 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2689 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field2689.length) {
                    int[] var185 = this.field2689[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field2672 == null || (arg6 & this.field2672[var187]) != 0) {
                            int var188 = this.field2665[var187] & 0xFFFF;
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
                            this.field2665[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field2669.field3964 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "()V", line = 1566)
    private final void method1254() {
        GL var1 = class265.field4099;
        if (this.field2675 == 0) {
            return;
        }
        if (this.field2671 != 0) {
            this.method1273(true, !this.field2696.field3964 && (this.field2671 & 0x1) != 0, !this.field2669.field3964 && (this.field2671 & 0x2) != 0, this.field2664 != null && !this.field2664.field3964 && (this.field2671 & 0x4) != 0, false);
        }
        this.method1273(false, !this.field2696.field3964, !this.field2669.field3964, this.field2664 != null && !this.field2664.field3964, !this.field2663.field3964);
        if (!this.field2686.field3964) {
            this.method1264();
        }
        if (this.field2656 != 0) {
            if ((this.field2656 & 0x1) != 0) {
                this.field2690 = null;
                this.field2676 = null;
                this.field2668 = null;
                this.field2694 = null;
                this.field2683 = null;
            }
            if ((this.field2656 & 0x2) != 0) {
                this.field2665 = null;
                this.field2678 = null;
            }
            if ((this.field2656 & 0x4) != 0) {
                this.field2695 = null;
                this.field2693 = null;
                this.field2685 = null;
                this.field2684 = null;
            }
            if ((this.field2656 & 0x8) != 0) {
                this.field2670 = null;
                this.field2692 = null;
            }
            if ((this.field2656 & 0x10) != 0) {
                this.field2655 = null;
                this.field2674 = null;
                this.field2673 = null;
            }
            this.field2656 = 0;
        }
        class158 var2 = null;
        if (this.field2696.field3960 != null) {
            this.field2696.field3960.method1184();
            var2 = this.field2696.field3960;
            var1.glVertexPointer(3, 5126, this.field2696.field3957, (long) this.field2696.field3955);
        }
        if (this.field2669.field3960 != null) {
            if (this.field2669.field3960 != var2) {
                this.field2669.field3960.method1184();
                var2 = this.field2669.field3960;
            }
            var1.glColorPointer(4, 5121, this.field2669.field3957, (long) this.field2669.field3955);
        }
        if (class302.field4753 && this.field2664.field3960 != null) {
            if (this.field2664.field3960 != var2) {
                this.field2664.field3960.method1184();
                var2 = this.field2664.field3960;
            }
            var1.glNormalPointer(5126, this.field2664.field3957, (long) this.field2664.field3955);
        }
        if (this.field2663.field3960 != null) {
            if (this.field2663.field3960 != var2) {
                this.field2663.field3960.method1184();
                class158 var3 = this.field2663.field3960;
            }
            var1.glTexCoordPointer(2, 5126, this.field2663.field3957, (long) this.field2663.field3955);
        }
        if (this.field2686.field3960 != null) {
            this.field2686.field3960.method1186();
        }
        if (this.field2696.field3960 == null || this.field2669.field3960 == null || class302.field4753 && this.field2664.field3960 == null || this.field2663.field3960 == null) {
            if (class265.field4111) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2696.field3960 == null) {
                this.field2696.field3954.position(this.field2696.field3955);
                var1.glVertexPointer(3, 5126, this.field2696.field3957, this.field2696.field3954);
            }
            if (this.field2669.field3960 == null) {
                this.field2669.field3954.position(this.field2669.field3955);
                var1.glColorPointer(4, 5121, this.field2669.field3957, this.field2669.field3954);
            }
            if (class302.field4753 && this.field2664.field3960 == null) {
                this.field2664.field3954.position(this.field2664.field3955);
                var1.glNormalPointer(5126, this.field2664.field3957, this.field2664.field3954);
            }
            if (this.field2663.field3960 == null) {
                this.field2663.field3954.position(this.field2663.field3955);
                var1.glTexCoordPointer(2, 5126, this.field2663.field3957, this.field2663.field3954);
            }
        }
        if (this.field2686.field3960 == null && class265.field4111) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2682.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2682[var5];
            int var7 = this.field2682[var5 + 1];
            short var8 = this.field2680[var6];
            if (var8 == -1) {
                class265.method1889(-1);
                class308.method2132(0, (byte) -28, 0);
            } else {
                class174.field2734.method1469(var8 & 0xFFFF, (byte) -95);
            }
            if (this.field2686.field3960 == null) {
                this.field2686.field3954.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2686.field3954);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V", line = 1742)
    public final void method1106(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2666; var4++) {
            this.field2690[var4] = this.field2690[var4] * arg0 >> 7;
            this.field2676[var4] = this.field2676[var4] * arg1 >> 7;
            this.field2668[var4] = this.field2668[var4] * arg2 >> 7;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([SI)[S", line = 1756)
    private static final short[] method1255(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class271.method1957(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "()I", line = 1761)
    public final int method1256() {
        return this.field2657;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII[FIF)V", line = 1765)
    private static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field2705 = var16;
        field2710 = var17;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 1809)
    public final void method1134(int arg0) {
        int var2 = class174.field2731[arg0];
        int var3 = class174.field2732[arg0];
        for (int var4 = 0; var4 < this.field2666; var4++) {
            int var5 = this.field2690[var4] * var3 + this.field2668[var4] * var2 >> 16;
            this.field2668[var4] = this.field2668[var4] * var3 - this.field2690[var4] * var2 >> 16;
            this.field2690[var4] = var5;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "()V", line = 1828)
    public final void method1258() {
        int var10002;
        if (this.field2691 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2666; var3++) {
                int var4 = this.field2691[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2667 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2667[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2666) {
                int var7 = this.field2691[var6] & 0xFF;
                this.field2667[var7][var1[var7]++] = var6++;
            }
            this.field2691 = null;
        }
        if (this.field2654 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2675; var10++) {
            int var11 = this.field2654[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2689 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2689[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2675) {
            int var14 = this.field2654[var13] & 0xFF;
            this.field2689[var14][var8[var14]++] = var13++;
        }
        this.field2654 = null;
    }

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "()V", line = 1921)
    public final void method1259() {
        if (this.field2695 == null) {
            this.method1105();
            return;
        }
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2690[var1];
            this.field2690[var1] = this.field2668[var1];
            this.field2668[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2660; var3++) {
            short var4 = this.field2695[var3];
            this.field2695[var3] = this.field2685[var3];
            this.field2685[var3] = (short) (-var4);
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ldg;IIIZ)V", line = 1960)
    public final void method989(class320 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class171 var6 = (class171) arg0;
        if (this.field2675 == 0 || var6.field2675 == 0) {
            return;
        }
        int var7 = var6.field2666;
        int[] var8 = var6.field2690;
        int[] var9 = var6.field2676;
        int[] var10 = var6.field2668;
        short[] var11 = var6.field2695;
        short[] var12 = var6.field2693;
        short[] var13 = var6.field2685;
        short[] var14 = var6.field2684;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2661 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2661.field1123;
            var16 = this.field2661.field1126;
            var17 = this.field2661.field1125;
            var18 = this.field2661.field1124;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2661 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2661.field1123;
            var20 = var6.field2661.field1126;
            var21 = var6.field2661.field1125;
            var22 = var6.field2661.field1124;
        }
        int[] var23 = var6.field2683;
        short[] var24 = var6.field2694;
        if (!var6.field2662.field2985) {
            var6.method1249();
        }
        short var25 = var6.field2662.field2988;
        short var26 = var6.field2662.field2987;
        short var27 = var6.field2662.field2983;
        short var28 = var6.field2662.field2989;
        short var29 = var6.field2662.field2990;
        short var30 = var6.field2662.field2986;
        for (int var31 = 0; var31 < this.field2666; var31++) {
            int var32 = this.field2676[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2690[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2668[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2683[var31];
                        int var37 = this.field2683[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2694[var38] - 1;
                            if (var35 == -1 || this.field2684[var35] != 0) {
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
                                            this.field2661 = new class72();
                                            var15 = this.field2661.field1123 = class278.method1986(this.field2695, true);
                                            var16 = this.field2661.field1126 = class278.method1986(this.field2693, true);
                                            var17 = this.field2661.field1125 = class278.method1986(this.field2685, true);
                                            var18 = this.field2661.field1124 = class278.method1986(this.field2684, true);
                                        }
                                        if (var19 == null) {
                                            class72 var44 = var6.field2661 = new class72();
                                            var19 = var44.field1123 = class278.method1986(var11, true);
                                            var20 = var44.field1126 = class278.method1986(var12, true);
                                            var21 = var44.field1125 = class278.method1986(var13, true);
                                            var22 = var44.field1124 = class278.method1986(var14, true);
                                        }
                                        short var45 = this.field2695[var35];
                                        short var46 = this.field2693[var35];
                                        short var47 = this.field2685[var35];
                                        short var48 = this.field2684[var35];
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
                                        int var57 = this.field2683[var31];
                                        int var58 = this.field2683[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2694[var59] - 1;
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZZLgb;Lgb;)Lfa;", line = 2197)
    private final class199 method1260(boolean arg0, boolean arg1, boolean arg2, class171 arg3, class171 arg4) {
        arg3.field2666 = this.field2666;
        arg3.field2660 = this.field2660;
        arg3.field2675 = this.field2675;
        arg3.field2657 = this.field2657;
        arg3.field2659 = this.field2659;
        arg3.field2671 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field2690 == null || arg3.field2690.length < this.field2666) {
            arg3.field2690 = new int[this.field2666 + 100];
            arg3.field2676 = new int[this.field2666 + 100];
            arg3.field2668 = new int[this.field2666 + 100];
        }
        for (int var6 = 0; var6 < this.field2666; var6++) {
            arg3.field2690[var6] = this.field2690[var6];
            arg3.field2676[var6] = this.field2676[var6];
            arg3.field2668[var6] = this.field2668[var6];
        }
        if (arg3.field2696 == null) {
            arg3.field2696 = new class256();
        }
        arg3.field2696.field3964 = false;
        if (arg3.field2662 == null) {
            arg3.field2662 = new class187();
        }
        arg3.field2662.field2985 = false;
        if (arg0) {
            arg3.field2678 = this.field2678;
        } else {
            if (arg4.field2678 == null || arg4.field2678.length < this.field2675) {
                arg4.field2678 = new byte[this.field2675 + 100];
            }
            arg3.field2678 = arg4.field2678;
            for (int var7 = 0; var7 < this.field2675; var7++) {
                arg3.field2678[var7] = this.field2678[var7];
            }
        }
        if (arg1) {
            arg3.field2665 = this.field2665;
        } else {
            if (arg4.field2665 == null || arg4.field2665.length < this.field2675) {
                arg4.field2665 = new short[this.field2675 + 100];
            }
            arg3.field2665 = arg4.field2665;
            for (int var8 = 0; var8 < this.field2675; var8++) {
                arg3.field2665[var8] = this.field2665[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field2669 = this.field2669;
        } else {
            if (arg4.field2669 == null) {
                arg4.field2669 = new class256();
            }
            arg3.field2669 = arg4.field2669;
            arg3.field2669.field3964 = false;
        }
        if (arg2 || this.field2695 == null) {
            arg3.field2695 = this.field2695;
            arg3.field2693 = this.field2693;
            arg3.field2685 = this.field2685;
            arg3.field2684 = this.field2684;
            arg3.field2664 = this.field2664;
        } else {
            if (arg4.field2695 == null || arg4.field2695.length < this.field2660) {
                arg4.field2695 = new short[this.field2660 + 100];
                arg4.field2693 = new short[this.field2660 + 100];
                arg4.field2685 = new short[this.field2660 + 100];
                arg4.field2684 = new short[this.field2660 + 100];
            }
            arg3.field2695 = arg4.field2695;
            arg3.field2693 = arg4.field2693;
            arg3.field2685 = arg4.field2685;
            arg3.field2684 = arg4.field2684;
            for (int var9 = 0; var9 < this.field2660; var9++) {
                arg3.field2695[var9] = this.field2695[var9];
                arg3.field2693[var9] = this.field2693[var9];
                arg3.field2685[var9] = this.field2685[var9];
                arg3.field2684[var9] = this.field2684[var9];
            }
            if (class302.field4753) {
                if (arg4.field2664 == null) {
                    arg4.field2664 = new class256();
                }
                arg3.field2664 = arg4.field2664;
                arg3.field2664.field3964 = false;
            } else {
                arg3.field2664 = null;
            }
        }
        arg3.field2670 = this.field2670;
        arg3.field2692 = this.field2692;
        arg3.field2691 = this.field2691;
        arg3.field2667 = this.field2667;
        arg3.field2655 = this.field2655;
        arg3.field2674 = this.field2674;
        arg3.field2673 = this.field2673;
        arg3.field2680 = this.field2680;
        arg3.field2654 = this.field2654;
        arg3.field2689 = this.field2689;
        arg3.field2663 = this.field2663;
        arg3.field2686 = this.field2686;
        arg3.field2682 = this.field2682;
        arg3.field2694 = this.field2694;
        arg3.field2683 = this.field2683;
        arg3.field3145 = this.field3145;
        arg3.field2681 = this.field2681;
        arg3.field2672 = this.field2672;
        return arg3;
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "()V", line = 2350)
    public final void method1105() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2690[var1];
            this.field2690[var1] = this.field2668[var1];
            this.field2668[var1] = -var2;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[IIIIZ)V", line = 2365)
    public final void method1108(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2713 = 0;
            field2706 = 0;
            field2711 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2667.length) {
                    int[] var14 = this.field2667[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2713 += this.field2690[var16];
                        field2706 += this.field2676[var16];
                        field2711 += this.field2668[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2713 = field2713 / var11 + var8;
                field2706 = field2706 / var11 + var9;
                field2711 = field2711 / var11 + var10;
            } else {
                field2713 = var8;
                field2706 = var9;
                field2711 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2667.length) {
                    int[] var22 = this.field2667[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2690[var24] += var17;
                        this.field2676[var24] += var18;
                        this.field2668[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2667.length) {
                    int[] var27 = this.field2667[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2690[var29] -= field2713;
                        this.field2676[var29] -= field2706;
                        this.field2668[var29] -= field2711;
                        if (arg4 != 0) {
                            int var30 = class174.field2731[arg4];
                            int var31 = class174.field2732[arg4];
                            int var32 = this.field2690[var29] * var31 + this.field2676[var29] * var30 + 32767 >> 16;
                            this.field2676[var29] = this.field2676[var29] * var31 + 32767 - this.field2690[var29] * var30 >> 16;
                            this.field2690[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class174.field2731[arg2];
                            int var34 = class174.field2732[arg2];
                            int var35 = this.field2676[var29] * var34 + 32767 - this.field2668[var29] * var33 >> 16;
                            this.field2668[var29] = this.field2676[var29] * var33 + this.field2668[var29] * var34 + 32767 >> 16;
                            this.field2676[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class174.field2731[arg3];
                            int var37 = class174.field2732[arg3];
                            int var38 = this.field2690[var29] * var37 + this.field2668[var29] * var36 + 32767 >> 16;
                            this.field2668[var29] = this.field2668[var29] * var37 + 32767 - this.field2690[var29] * var36 >> 16;
                            this.field2690[var29] = var38;
                        }
                        this.field2690[var29] += field2713;
                        this.field2676[var29] += field2706;
                        this.field2668[var29] += field2711;
                    }
                }
            }
            if (arg5 && this.field2695 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2667.length) {
                        int[] var41 = this.field2667[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2683[var43];
                            int var45 = this.field2683[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2694[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class174.field2731[arg4];
                                    int var49 = class174.field2732[arg4];
                                    int var50 = this.field2695[var47] * var49 + this.field2693[var47] * var48 + 32767 >> 16;
                                    this.field2693[var47] = (short) (this.field2693[var47] * var49 + 32767 - this.field2695[var47] * var48 >> 16);
                                    this.field2695[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class174.field2731[arg2];
                                    int var52 = class174.field2732[arg2];
                                    int var53 = this.field2693[var47] * var52 + 32767 - this.field2685[var47] * var51 >> 16;
                                    this.field2685[var47] = (short) (this.field2693[var47] * var51 + this.field2685[var47] * var52 + 32767 >> 16);
                                    this.field2693[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class174.field2731[arg3];
                                    int var55 = class174.field2732[arg3];
                                    int var56 = this.field2695[var47] * var55 + this.field2685[var47] * var54 + 32767 >> 16;
                                    this.field2685[var47] = (short) (this.field2685[var47] * var55 + 32767 - this.field2695[var47] * var54 >> 16);
                                    this.field2695[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2664 != null) {
                    this.field2664.field3964 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2667.length) {
                    int[] var59 = this.field2667[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2690[var61] -= field2713;
                        this.field2676[var61] -= field2706;
                        this.field2668[var61] -= field2711;
                        this.field2690[var61] = this.field2690[var61] * arg2 >> 7;
                        this.field2676[var61] = this.field2676[var61] * arg3 >> 7;
                        this.field2668[var61] = this.field2668[var61] * arg4 >> 7;
                        this.field2690[var61] += field2713;
                        this.field2676[var61] += field2706;
                        this.field2668[var61] += field2711;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2689 != null && this.field2678 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field2689.length) {
                        int[] var64 = this.field2689[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field2678[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field2678[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field2669.field3964 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2689 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field2689.length) {
                    int[] var70 = this.field2689[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field2665[var72] & 0xFFFF;
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
                        this.field2665[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field2669.field3964 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()Z", line = 2773)
    public final boolean method983() {
        return this.field2687 && this.field2690 != null && this.field2695 != null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIJ)V", line = 2777)
    public final void method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2660 == 0) {
            return;
        }
        GL var10 = class265.field4099;
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
        this.method1254();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()I", line = 2801)
    public final int method1109() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2983;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 2808)
    public final void method1132(int arg0) {
        int var2 = class174.field2731[arg0];
        int var3 = class174.field2732[arg0];
        for (int var4 = 0; var4 < this.field2666; var4++) {
            int var5 = this.field2676[var4] * var3 - this.field2668[var4] * var2 >> 16;
            this.field2668[var4] = this.field2676[var4] * var2 + this.field2668[var4] * var3 >> 16;
            this.field2676[var4] = var5;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "()V", line = 2829)
    public final void method1261() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2668[var1] = -this.field2668[var1];
        }
        if (this.field2685 != null) {
            for (int var2 = 0; var2 < this.field2660; var2++) {
                this.field2685[var2] = (short) (-this.field2685[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2675; var3++) {
            short var4 = this.field2655[var3];
            this.field2655[var3] = this.field2673[var3];
            this.field2673[var3] = var4;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
        this.field2686.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(FFF)I", line = 2866)
    private static final int method1262(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(ZZZ)Lfa;", line = 2902)
    public final class199 method1133(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1260(arg0, arg1, arg2, field2698, field2679);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZZZ)Lfa;", line = 2905)
    public final class199 method1103(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1260(arg0, arg1, arg2, field2700, field2699);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(SS)V", line = 2911)
    public final void method1263(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2675; var3++) {
            if (this.field2680[var3] == arg0) {
                this.field2680[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class174.field2734.method1471((byte) 57, arg0 & 0xFFFF);
            var5 = class174.field2734.method1481(arg0 & 0xFFFF, -23794);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class174.field2734.method1471((byte) -113, arg1 & 0xFFFF);
            var7 = class174.field2734.method1481(arg1 & 0xFFFF, -23794);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2669.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "()V", line = 2949)
    private final void method1264() {
        if (field2658.field1661.length < this.field2660 * 12) {
            field2658 = new class101((this.field2660 + 100) * 12);
        } else {
            field2658.field1667 = 0;
        }
        if (class265.field4109) {
            for (int var1 = 0; var1 < this.field2675; var1++) {
                field2658.method784(-58, this.field2655[var1]);
                field2658.method784(-51, this.field2674[var1]);
                field2658.method784(70, this.field2673[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2675; var2++) {
                field2658.method725(this.field2655[var2], false);
                field2658.method725(this.field2674[var2], false);
                field2658.method725(this.field2673[var2], false);
            }
        }
        if (!class265.field4111) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2658.field1667);
            var5.put(field2658.field1661, 0, field2658.field1667);
            var5.flip();
            this.field2686.field3964 = true;
            this.field2686.field3954 = var5;
            this.field2686.field3960 = null;
            return;
        }
        class158 var3 = new class158();
        ByteBuffer var4 = ByteBuffer.wrap(field2658.field1661, 0, field2658.field1667);
        var3.method1185(var4);
        this.field2686.field3964 = true;
        this.field2686.field3954 = null;
        this.field2686.field3960 = var3;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V", line = 3008)
    public final void method1265(int arg0) {
        this.field2657 = (short) arg0;
        this.field2669.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "()V", line = 3012)
    public final void method1266() {
        if (this.field2695 == null) {
            this.method1115();
            return;
        }
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2668[var1];
            this.field2668[var1] = this.field2690[var1];
            this.field2690[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2660; var3++) {
            short var4 = this.field2685[var3];
            this.field2685[var3] = this.field2695[var3];
            this.field2695[var3] = (short) (-var4);
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 3050)
    public final void method1129(int arg0) {
        int var2 = class174.field2731[arg0];
        int var3 = class174.field2732[arg0];
        for (int var4 = 0; var4 < this.field2666; var4++) {
            int var5 = this.field2690[var4] * var3 + this.field2676[var4] * var2 >> 16;
            this.field2676[var4] = this.field2676[var4] * var3 - this.field2690[var4] * var2 >> 16;
            this.field2690[var4] = var5;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILgb;[[I[[IIII)V", line = 3070)
    public final void method1267(int arg0, int arg1, class171 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2662.field2985) {
            arg2.method1249();
        }
        int var9 = arg2.field2662.field2983 + arg5;
        int var10 = arg2.field2662.field2989 + arg5;
        int var11 = arg2.field2662.field2990 + arg7;
        int var12 = arg2.field2662.field2986 + arg7;
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
            for (int var17 = 0; var17 < this.field2666; var17++) {
                int var18 = this.field2690[var17] + arg5;
                int var19 = this.field2668[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2676[var17] = this.field2676[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2662.field2988;
            for (int var28 = 0; var28 < this.field2666; var28++) {
                int var29 = (this.field2676[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2690[var28] + arg5;
                    int var31 = this.field2668[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2676[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1450(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2662.field2987 - arg2.field2662.field2988;
            for (int var42 = 0; var42 < this.field2666; var42++) {
                int var43 = this.field2690[var42] + arg5;
                int var44 = this.field2668[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2676[var42] = var51 + this.field2676[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2662.field2987 - arg2.field2662.field2988;
            for (int var53 = 0; var53 < this.field2666; var53++) {
                int var54 = this.field2690[var53] + arg5;
                int var55 = this.field2668[var53] + arg7;
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
                this.field2676[var53] = ((this.field2676[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2696.field3964 = false;
        this.field2662.field2985 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZZZZZZ)V", line = 3267)
    public final void method1268(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2671 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2660 != 0) {
            if (arg6) {
                boolean var8 = !this.field2669.field3964 && (arg1 || arg2 && !class302.field4753);
                this.method1273(false, !this.field2696.field3964 && arg0, var8, this.field2664 != null && !this.field2664.field3964 && arg2, !this.field2663.field3964 && arg3);
                if (!this.field2686.field3964 && arg4 && arg1) {
                    this.method1264();
                }
            }
            if (arg0) {
                if (this.field2696.field3964) {
                    if (!this.field2662.field2985) {
                        this.method1249();
                    }
                    this.field2690 = null;
                    this.field2676 = null;
                    this.field2668 = null;
                    this.field2694 = null;
                    this.field2683 = null;
                } else {
                    this.field2656 = (byte) (this.field2656 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2669.field3964) {
                    this.field2665 = null;
                    this.field2678 = null;
                } else {
                    this.field2656 = (byte) (this.field2656 | 0x2);
                }
            }
            if (arg2 && class302.field4753) {
                if (this.field2664.field3964) {
                    this.field2695 = null;
                    this.field2693 = null;
                    this.field2685 = null;
                    this.field2684 = null;
                } else {
                    this.field2656 = (byte) (this.field2656 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2663.field3964) {
                    this.field2670 = null;
                    this.field2692 = null;
                } else {
                    this.field2656 = (byte) (this.field2656 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2686.field3964 && this.field2669.field3964) {
                    this.field2655 = null;
                    this.field2674 = null;
                    this.field2673 = null;
                } else {
                    this.field2656 = (byte) (this.field2656 | 0x10);
                }
            }
            if (arg5) {
                this.field2691 = null;
                this.field2654 = null;
                this.field2667 = (int[][]) null;
                this.field2689 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZZ)Lfa;", line = 3362)
    public final class199 method1104(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1260(arg0, arg1, arg2, field2702, field2701);
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V", line = 3367)
    public final void method1269(int arg0) {
        this.field2659 = (short) arg0;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "()V", line = 3373)
    public static void method1270() {
        field2677 = null;
        field2658 = null;
        field2697 = null;
        field2679 = null;
        field2698 = null;
        field2699 = null;
        field2700 = null;
        field2701 = null;
        field2702 = null;
        field2708 = null;
        field2707 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZZZZZZZZZZ)Lgb;", line = 3390)
    public final class171 method1271(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class171 var12 = new class171();
        var12.field2666 = this.field2666;
        var12.field2660 = this.field2660;
        var12.field2675 = this.field2675;
        if (arg0) {
            var12.field2690 = this.field2690;
            var12.field2668 = this.field2668;
        } else {
            var12.field2690 = class274.method1971(this.field2690, 0);
            var12.field2668 = class274.method1971(this.field2668, 0);
        }
        if (arg1) {
            var12.field2676 = this.field2676;
        } else {
            var12.field2676 = class274.method1971(this.field2676, 0);
        }
        if (arg0 && arg1) {
            var12.field2696 = this.field2696;
            var12.field2662 = this.field2662;
        } else {
            var12.field2696 = new class256();
            var12.field2662 = new class187();
        }
        if (arg2) {
            var12.field2665 = this.field2665;
        } else {
            var12.field2665 = class278.method1986(this.field2665, true);
        }
        if (arg3) {
            var12.field2678 = this.field2678;
        } else {
            var12.field2678 = class79.method581((byte) -80, this.field2678);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class302.field4753) {
            var12.field2669 = new class256();
        } else {
            var12.field2669 = this.field2669;
        }
        if (arg5) {
            var12.field2695 = this.field2695;
            var12.field2693 = this.field2693;
            var12.field2685 = this.field2685;
            var12.field2684 = this.field2684;
        } else {
            var12.field2695 = class278.method1986(this.field2695, true);
            var12.field2693 = class278.method1986(this.field2693, true);
            var12.field2685 = class278.method1986(this.field2685, true);
            var12.field2684 = class278.method1986(this.field2684, true);
        }
        if (!class302.field4753) {
            var12.field2664 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2664 = this.field2664;
        } else {
            var12.field2664 = new class256();
        }
        if (arg8) {
            var12.field2670 = this.field2670;
            var12.field2692 = this.field2692;
            var12.field2663 = this.field2663;
        } else {
            var12.field2670 = class328.method2243(true, this.field2670);
            var12.field2692 = class328.method2243(true, this.field2692);
            var12.field2663 = new class256();
        }
        if (arg9) {
            var12.field2655 = this.field2655;
            var12.field2674 = this.field2674;
            var12.field2673 = this.field2673;
            var12.field2686 = this.field2686;
        } else {
            var12.field2655 = class278.method1986(this.field2655, true);
            var12.field2674 = class278.method1986(this.field2674, true);
            var12.field2673 = class278.method1986(this.field2673, true);
            var12.field2686 = new class256();
        }
        if (arg10) {
            var12.field2680 = this.field2680;
        } else {
            var12.field2680 = class278.method1986(this.field2680, true);
        }
        var12.field2691 = this.field2691;
        var12.field2667 = this.field2667;
        var12.field2654 = this.field2654;
        var12.field2689 = this.field2689;
        var12.field2682 = this.field2682;
        var12.field2694 = this.field2694;
        var12.field2683 = this.field2683;
        var12.field2657 = this.field2657;
        var12.field2659 = this.field2659;
        var12.field2681 = this.field2681;
        var12.field2672 = this.field2672;
        return var12;
    }

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "()Z", line = 3531)
    public final boolean method1130() {
        if (this.field2667 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2690[var1] <<= 0x4;
            this.field2676[var1] <<= 0x4;
            this.field2668[var1] <<= 0x4;
        }
        field2713 = 0;
        field2706 = 0;
        field2711 = 0;
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "()V", line = 3553)
    public final void method1136() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2690[var1] = this.field2690[var1] + 7 >> 4;
            this.field2676[var1] = this.field2676[var1] + 7 >> 4;
            this.field2668[var1] = this.field2668[var1] + 7 >> 4;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "()V", line = 3566)
    public final void method1272() {
        if (this.field2695 == null) {
            this.method1112();
            return;
        }
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2690[var1] = -this.field2690[var1];
            this.field2668[var1] = -this.field2668[var1];
        }
        for (int var2 = 0; var2 < this.field2660; var2++) {
            this.field2695[var2] = (short) (-this.field2695[var2]);
            this.field2685[var2] = (short) (-this.field2685[var2]);
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
        if (this.field2664 != null) {
            this.field2664.field3964 = false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()I", line = 3600)
    public final int method1107() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2989;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 3606)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        if (this.field2660 == 0) {
            return;
        }
        if (!this.field2662.field2985) {
            this.method1249();
        }
        short var13 = this.field2662.field2984;
        short var14 = this.field2662.field2988;
        short var15 = this.field2662.field2987;
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
        if (var21 / var18 <= class328.field5079) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class190.field3029) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class96.field1577) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class116.field1891) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class174.field2731[arg0];
            var27 = class174.field2732[arg0];
        }
        if (arg8 > 0L && class56.field903 && var19 > 0) {
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
            if (class195.field3106 >= var28 && class195.field3106 <= var29 && class281.field4339 >= var30 && class281.field4339 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2662.field2983;
                short var37 = this.field2662.field2989;
                short var38 = this.field2662.field2990;
                short var39 = this.field2662.field2986;
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
                if (class195.field3106 >= var32 && class195.field3106 <= var33 && class281.field4339 >= var34 && class281.field4339 <= var35) {
                    if (this.field3145) {
                        class278.field4306[class55.field876++] = arg8;
                    } else {
                        if (field2708.length < this.field2660) {
                            field2708 = new int[this.field2660];
                            field2707 = new int[this.field2660];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2666) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2675) {
                                        break label118;
                                    }
                                    short var80 = this.field2655[var79];
                                    short var81 = this.field2674[var79];
                                    short var82 = this.field2673[var79];
                                    if (this.method1246(class195.field3106, class281.field4339, field2707[var80], field2707[var81], field2707[var82], field2708[var80], field2708[var81], field2708[var82])) {
                                        class278.field4306[class55.field876++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2690[var59];
                            int var61 = this.field2676[var59];
                            int var62 = this.field2668[var59];
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
                            int var75 = this.field2683[var59];
                            int var76 = this.field2683[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2694[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2708[var78] = var73;
                                field2707[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class265.field4099;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1254();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()I", line = 3894)
    public final int method1122() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2984;
    }

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "()I", line = 3901)
    public final int method1117() {
        if (!this.field2662.field2985) {
            this.method1249();
        }
        return this.field2662.field2986;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZZZZ)V", line = 3908)
    private final void method1273(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2696.field3955 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2669.field3955 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2664.field3955 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2663.field3955 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2658.field1661.length < this.field2660 * var6) {
            field2658 = new class101((this.field2660 + 100) * var6);
        } else {
            field2658.field1667 = 0;
        }
        if (arg1) {
            if (class265.field4109) {
                for (int var7 = 0; var7 < this.field2666; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2690[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2676[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2668[var7]);
                    int var11 = this.field2683[var7];
                    int var12 = this.field2683[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2694[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2658.field1667 = var6 * var14;
                        field2658.method784(67, var8);
                        field2658.method784(-73, var9);
                        field2658.method784(67, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2666; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2690[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2676[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2668[var15]);
                    int var19 = this.field2683[var15];
                    int var20 = this.field2683[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2694[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2658.field1667 = var6 * var22;
                        field2658.method725(var16, false);
                        field2658.method725(var17, false);
                        field2658.method725(var18, false);
                    }
                }
            }
        }
        if (arg2) {
            if (class302.field4753) {
                for (int var42 = 0; var42 < this.field2675; var42++) {
                    int var43 = method1250(this.field2665[var42], this.field2680[var42], this.field2657, this.field2678[var42]);
                    field2658.field1667 = this.field2655[var42] * var6 + this.field2669.field3955;
                    field2658.method784(-93, var43);
                    field2658.field1667 = this.field2674[var42] * var6 + this.field2669.field3955;
                    field2658.method784(-56, var43);
                    field2658.field1667 = this.field2673[var42] * var6 + this.field2669.field3955;
                    field2658.method784(-116, var43);
                }
            } else {
                int var23 = (int) class97.field1620[0];
                int var24 = (int) class97.field1620[1];
                int var25 = (int) class97.field1620[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2657 * 1.3F);
                int var28 = this.field2659 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2675; var29++) {
                    short var30 = this.field2655[var29];
                    short var31 = this.field2684[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2685[var30] * var25 + this.field2695[var30] * var23 + this.field2693[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2685[var30] * var25 + this.field2695[var30] * var23 + this.field2693[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2684[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2674[var29];
                    short var34 = this.field2684[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2685[var33] * var25 + this.field2695[var33] * var23 + this.field2693[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2685[var33] * var25 + this.field2695[var33] * var23 + this.field2693[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2684[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2673[var29];
                    short var37 = this.field2684[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2685[var36] * var25 + this.field2695[var36] * var23 + this.field2693[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2685[var36] * var25 + this.field2695[var36] * var23 + this.field2693[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2684[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1250(this.field2665[var29], this.field2680[var29], var32, this.field2678[var29]);
                    int var40 = method1250(this.field2665[var29], this.field2680[var29], var35, this.field2678[var29]);
                    int var41 = method1250(this.field2665[var29], this.field2680[var29], var38, this.field2678[var29]);
                    field2658.field1667 = var6 * var30 + this.field2669.field3955;
                    field2658.method784(125, var39);
                    field2658.field1667 = var6 * var33 + this.field2669.field3955;
                    field2658.method784(-61, var40);
                    field2658.field1667 = var6 * var36 + this.field2669.field3955;
                    field2658.method784(96, var41);
                }
                this.field2695 = null;
                this.field2693 = null;
                this.field2685 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2659;
            float var45 = 3.0F / (float) (this.field2659 / 2 + this.field2659);
            field2658.field1667 = this.field2664.field3955;
            if (class265.field4109) {
                for (int var46 = 0; var46 < this.field2660; var46++) {
                    short var47 = this.field2684[var46];
                    if (var47 == 0) {
                        field2658.method744((float) this.field2695[var46] * var45, (byte) -85);
                        field2658.method744((float) this.field2693[var46] * var45, (byte) -85);
                        field2658.method744((float) this.field2685[var46] * var45, (byte) -85);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2658.method744((float) this.field2695[var46] * var48, (byte) -85);
                        field2658.method744((float) this.field2693[var46] * var48, (byte) -85);
                        field2658.method744((float) this.field2685[var46] * var48, (byte) -85);
                    }
                    field2658.field1667 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2660; var49++) {
                    short var50 = this.field2684[var49];
                    if (var50 == 0) {
                        field2658.method765(-1, (float) this.field2695[var49] * var45);
                        field2658.method765(-1, (float) this.field2693[var49] * var45);
                        field2658.method765(-1, (float) this.field2685[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2658.method765(-1, (float) this.field2695[var49] * var51);
                        field2658.method765(-1, (float) this.field2693[var49] * var51);
                        field2658.method765(-1, (float) this.field2685[var49] * var51);
                    }
                    field2658.field1667 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2658.field1667 = this.field2663.field3955;
            if (class265.field4109) {
                for (int var52 = 0; var52 < this.field2660; var52++) {
                    field2658.method744(this.field2670[var52], (byte) -85);
                    field2658.method744(this.field2692[var52], (byte) -85);
                    field2658.field1667 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2660; var53++) {
                    field2658.method765(-1, this.field2670[var53]);
                    field2658.method765(-1, this.field2692[var53]);
                    field2658.field1667 += var6 - 8;
                }
            }
        }
        field2658.field1667 = this.field2660 * var6;
        if (arg0) {
            if (class265.field4117) {
                ByteBuffer var54 = ByteBuffer.wrap(field2658.field1661, 0, field2658.field1667);
                if (this.field2688 == null) {
                    this.field2688 = new class158(true);
                    this.field2688.method1185(var54);
                } else {
                    this.field2688.method1188(var54);
                }
                if (arg1) {
                    this.field2696.field3964 = true;
                    this.field2696.field3954 = null;
                    this.field2696.field3960 = this.field2688;
                    this.field2696.field3957 = var6;
                }
                if (arg2) {
                    this.field2669.field3964 = true;
                    this.field2669.field3954 = null;
                    this.field2669.field3960 = this.field2688;
                    this.field2669.field3957 = var6;
                }
                if (arg3) {
                    this.field2664.field3964 = true;
                    this.field2664.field3954 = null;
                    this.field2664.field3960 = this.field2688;
                    this.field2664.field3957 = var6;
                }
                if (arg4) {
                    this.field2663.field3964 = true;
                    this.field2663.field3954 = null;
                    this.field2663.field3960 = this.field2688;
                    this.field2663.field3957 = var6;
                }
            } else {
                if (field2697 == null || field2697.capacity() < field2658.field1667) {
                    field2697 = ByteBuffer.allocateDirect(var6 * 100 + field2658.field1667);
                } else {
                    field2697.clear();
                }
                field2697.put(field2658.field1661, 0, field2658.field1667);
                field2697.flip();
                if (arg1) {
                    this.field2696.field3964 = true;
                    this.field2696.field3954 = field2697;
                    this.field2696.field3960 = null;
                    this.field2696.field3957 = var6;
                }
                if (arg2) {
                    this.field2669.field3964 = true;
                    this.field2669.field3954 = field2697;
                    this.field2696.field3960 = null;
                    this.field2669.field3957 = var6;
                }
                if (arg3) {
                    this.field2664.field3964 = true;
                    this.field2664.field3954 = field2697;
                    this.field2664.field3960 = null;
                    this.field2664.field3957 = var6;
                }
                if (arg4) {
                    this.field2663.field3964 = true;
                    this.field2663.field3954 = field2697;
                    this.field2663.field3960 = null;
                    this.field2663.field3957 = var6;
                }
            }
        } else if (class265.field4111) {
            class158 var55 = new class158();
            ByteBuffer var56 = ByteBuffer.wrap(field2658.field1661, 0, field2658.field1667);
            var55.method1185(var56);
            if (arg1) {
                this.field2696.field3964 = true;
                this.field2696.field3954 = null;
                this.field2696.field3960 = var55;
                this.field2696.field3957 = var6;
            }
            if (arg2) {
                this.field2669.field3964 = true;
                this.field2669.field3954 = null;
                this.field2669.field3960 = var55;
                this.field2669.field3957 = var6;
            }
            if (arg3) {
                this.field2664.field3964 = true;
                this.field2664.field3954 = null;
                this.field2664.field3960 = var55;
                this.field2664.field3957 = var6;
            }
            if (arg4) {
                this.field2663.field3964 = true;
                this.field2663.field3954 = null;
                this.field2663.field3960 = var55;
                this.field2663.field3957 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2658.field1667);
            var57.put(field2658.field1661, 0, field2658.field1667);
            var57.flip();
            if (arg1) {
                this.field2696.field3964 = true;
                this.field2696.field3954 = var57;
                this.field2696.field3960 = null;
                this.field2696.field3957 = var6;
            }
            if (arg2) {
                this.field2669.field3964 = true;
                this.field2669.field3954 = var57;
                this.field2696.field3960 = null;
                this.field2669.field3957 = var6;
            }
            if (arg3) {
                this.field2664.field3964 = true;
                this.field2664.field3954 = var57;
                this.field2664.field3960 = null;
                this.field2664.field3957 = var6;
            }
            if (arg4) {
                this.field2663.field3964 = true;
                this.field2663.field3954 = var57;
                this.field2663.field3960 = null;
                this.field2663.field3957 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII[FFIF)V", line = 4439)
    private static final void method1274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field2714 = var16;
        field2709 = var17;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V", line = 4485)
    public final void method1119(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2666; var4++) {
            this.field2690[var4] += arg0;
            this.field2676[var4] += arg1;
            this.field2668[var4] += arg2;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()V", line = 4505)
    public final void method1115() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2668[var1];
            this.field2668[var1] = this.field2690[var1];
            this.field2690[var1] = -var2;
        }
        this.field2662.field2985 = false;
        this.field2696.field3964 = false;
    }

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "()I", line = 4523)
    public final int method1275() {
        return this.field2659;
    }
}
