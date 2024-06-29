import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class148 extends class113 {

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "B")
    private byte field2675 = 0;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Z")
    public boolean field2672 = false;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "B")
    private byte field2677 = 0;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public int field2671 = 0;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    private int field2682 = 0;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
    private int[] field2660;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[I")
    public int[] field2679;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "[I")
    public int[] field2692;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
    public int[] field2674;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "[I")
    private int[] field2652;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "[Leh;")
    public class170[] field2678;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[Lue;")
    public class15[] field2658;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "[S")
    private short[] field2680;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "[S")
    private short[] field2683;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[S")
    private short[] field2684;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[S")
    private short[] field2651;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "[F")
    private float[] field2689;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "[F")
    private float[] field2681;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[S")
    private short[] field2687;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[B")
    private byte[] field2653;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "[S")
    private short[] field2663;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[S")
    private short[] field2666;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[S")
    private short[] field2655;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[S")
    private short[] field2668;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[B")
    private byte[] field2656;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lrf;")
    public class279 field2686;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "Lmd;")
    public class255 field2667;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Lmd;")
    private class255 field2659;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lmd;")
    private class255 field2661;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Lmd;")
    private class255 field2662;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lmd;")
    private class255 field2665;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "S")
    private short field2669;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "S")
    private short field2664;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "[S")
    private short[] field2690;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "[I")
    private int[] field2694;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Lrm;")
    private static class249 field2657 = new class249(10000);

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "Lab;")
    private static class148 field2685 = new class148();

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "Lab;")
    private static class148 field2695 = new class148();

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "Lab;")
    private static class148 field2696 = new class148();

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "Lab;")
    private static class148 field2697 = new class148();

    @OriginalMember(owner = "client!ab", name = "pb", descriptor = "[I")
    private static int[] field2699 = new int[1];

    @OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
    private static int[] field2707 = new int[1];

    @OriginalMember(owner = "client!ab", name = "qb", descriptor = "F")
    private static float field2700;

    @OriginalMember(owner = "client!ab", name = "sb", descriptor = "F")
    private static float field2702;

    @OriginalMember(owner = "client!ab", name = "tb", descriptor = "F")
    private static float field2703;

    @OriginalMember(owner = "client!ab", name = "ub", descriptor = "F")
    private static float field2704;

    @OriginalMember(owner = "client!ab", name = "vb", descriptor = "F")
    private static float field2705;

    @OriginalMember(owner = "client!ab", name = "yb", descriptor = "F")
    private static float field2708;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "I")
    private static int field2698;

    @OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
    private static int field2701;

    @OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
    private static int field2706;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Lqb;")
    private class102 field2670;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "Lnd;")
    private class319 field2673;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2688;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[J")
    private static long[] field2676;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[[I")
    private int[][] field2654;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "[[I")
    private int[][] field2693;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 7)
    public final void method297() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2679[var1] = -this.field2679[var1];
            this.field2674[var1] = -this.field2674[var1];
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FFF)I", line = 22)
    private static final int method1025(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lt;)Lt;", line = 57)
    public final class257 method1026(class257 arg0) {
        if (this.field2682 == 0) {
            return null;
        }
        if (!this.field2686.field4891) {
            this.method1048();
        }
        int var2;
        int var3;
        if (class217.field3860 > 0) {
            var2 = this.field2686.field4894 - (class217.field3860 * this.field2686.field4889 >> 8) >> 3;
            var3 = this.field2686.field4888 - (class217.field3860 * this.field2686.field4890 >> 8) >> 3;
        } else {
            var2 = this.field2686.field4894 - (class217.field3860 * this.field2686.field4890 >> 8) >> 3;
            var3 = this.field2686.field4888 - (class217.field3860 * this.field2686.field4889 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class217.field3872 > 0) {
            var4 = this.field2686.field4892 - (class217.field3872 * this.field2686.field4889 >> 8) >> 3;
            var5 = this.field2686.field4895 - (class217.field3872 * this.field2686.field4890 >> 8) >> 3;
        } else {
            var4 = this.field2686.field4892 - (class217.field3872 * this.field2686.field4890 >> 8) >> 3;
            var5 = this.field2686.field4895 - (class217.field3872 * this.field2686.field4889 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class257 var8;
        if (arg0 == null || arg0.field4551.length < var6 * var7) {
            var8 = new class257(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field888 = arg0.field889 = var6;
            arg0.field886 = arg0.field884 = var7;
            arg0.method1829();
        }
        var8.field878 = var2;
        var8.field881 = var4;
        if (field2699.length < this.field2682) {
            field2699 = new int[this.field2682];
            field2707 = new int[this.field2682];
        }
        for (int var9 = 0; var9 < this.field2671; var9++) {
            int var10 = (this.field2679[var9] - (this.field2692[var9] * class217.field3860 >> 8) >> 3) - var2;
            int var11 = (this.field2674[var9] - (this.field2692[var9] * class217.field3872 >> 8) >> 3) - var4;
            int var12 = this.field2660[var9];
            int var13 = this.field2660[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2690[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2699[var15] = var10;
                field2707[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2691; var16++) {
            if (this.field2653[var16] <= 128) {
                short var17 = this.field2663[var16];
                short var18 = this.field2666[var16];
                short var19 = this.field2655[var16];
                int var20 = field2699[var17];
                int var21 = field2699[var18];
                int var22 = field2699[var19];
                int var23 = field2707[var17];
                int var24 = field2707[var18];
                int var25 = field2707[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class263.method1908(var8.field4551, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()V", line = 180)
    public final void method1027() {
        int var10002;
        if (this.field2652 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2671; var3++) {
                int var4 = this.field2652[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2654 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2654[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2671) {
                int var7 = this.field2652[var6] & 0xFF;
                this.field2654[var7][var1[var7]++] = var6++;
            }
            this.field2652 = null;
        }
        if (this.field2656 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2691; var10++) {
            int var11 = this.field2656[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2693 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2693[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2691) {
            int var14 = this.field2656[var13] & 0xFF;
            this.field2693[var14][var8[var14]++] = var13++;
        }
        this.field2656 = null;
    }

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "()V", line = 272)
    private final void method1028() {
        if (field2657.field4338.length < this.field2682 * 12) {
            field2657 = new class249((this.field2682 + 100) * 12);
        } else {
            field2657.field4314 = 0;
        }
        if (class231.field4068) {
            for (int var1 = 0; var1 < this.field2691; var1++) {
                field2657.method1741(this.field2663[var1], -1580277072);
                field2657.method1741(this.field2666[var1], -1580277072);
                field2657.method1741(this.field2655[var1], -1580277072);
            }
        } else {
            for (int var2 = 0; var2 < this.field2691; var2++) {
                field2657.method1745(this.field2663[var2], -427081032);
                field2657.method1745(this.field2666[var2], -427081032);
                field2657.method1745(this.field2655[var2], -427081032);
            }
        }
        if (!class231.field4060) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2657.field4314);
            var5.put(field2657.field4338, 0, field2657.field4314);
            var5.flip();
            this.field2665.field4429 = true;
            this.field2665.field4433 = var5;
            this.field2665.field4432 = null;
            return;
        }
        class319 var3 = new class319();
        ByteBuffer var4 = ByteBuffer.wrap(field2657.field4338, 0, field2657.field4314);
        var3.method2211(var4);
        this.field2665.field4429 = true;
        this.field2665.field4433 = null;
        this.field2665.field4432 = var3;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V", line = 332)
    public final void method304(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2671; var4++) {
            this.field2679[var4] = this.field2679[var4] * arg0 >> 7;
            this.field2692[var4] = this.field2692[var4] * arg1 >> 7;
            this.field2674[var4] = this.field2674[var4] * arg2 >> 7;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()Z", line = 345)
    public final boolean method1029() {
        return this.field2672 && this.field2679 != null && this.field2680 != null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V", line = 350)
    public final void method312(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2671; var4++) {
            this.field2679[var4] += arg0;
            this.field2692[var4] += arg1;
            this.field2674[var4] += arg2;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIFFF)[F", line = 365)
    private static final float[] method1030(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()I", line = 438)
    public final int method314() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4895;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lee;ILee;I[IZ)V", line = 444)
    public final void method286(class284 arg0, int arg1, class284 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method284(arg0, arg1, arg5);
            return;
        }
        class208 var7 = arg0.field4968[arg1];
        class208 var8 = arg2.field4968[arg3];
        class172 var9 = var7.field3717;
        for (int var10 = 0; var10 < this.field2671; var10++) {
            this.field2679[var10] <<= 0x4;
            this.field2692[var10] <<= 0x4;
            this.field2674[var10] <<= 0x4;
        }
        field2706 = 0;
        field2698 = 0;
        field2701 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field3725; var13++) {
            short var14 = var7.field3723[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field3137[var14] == 0) {
                if (var7.field3715[var13] != -1) {
                    this.method1061(0, var9.field3133[var7.field3715[var13]], 0, 0, 0, arg5);
                }
                this.method1061(var9.field3137[var14], var9.field3133[var14], var7.field3722[var13], var7.field3716[var13], var7.field3721[var13], arg5);
            }
        }
        field2706 = 0;
        field2698 = 0;
        field2701 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field3725; var17++) {
            short var18 = var8.field3723[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field3137[var18] == 0) {
                if (var8.field3715[var17] != -1) {
                    this.method1061(0, var9.field3133[var8.field3715[var17]], 0, 0, 0, arg5);
                }
                this.method1061(var9.field3137[var18], var9.field3133[var18], var8.field3722[var17], var8.field3716[var17], var8.field3721[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2671; var19++) {
            this.field2679[var19] >>= 0x4;
            this.field2692[var19] >>= 0x4;
            this.field2674[var19] >>= 0x4;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Lma;", line = 539)
    public final class290 method1031(int arg0, int arg1, int arg2) {
        this.field2672 = false;
        if (this.field2670 != null) {
            this.field2680 = this.field2670.field1783;
            this.field2683 = this.field2670.field1785;
            this.field2684 = this.field2670.field1784;
            this.field2651 = this.field2670.field1786;
            this.field2670 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljf;IJIIIIFF)S", line = 553)
    private final short method1032(class230 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2660[arg1];
        int var12 = this.field2660[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2690[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2676[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2690[var13] = (short) (this.field2682 + 1);
        field2676[var13] = arg2;
        this.field2680[this.field2682] = (short) arg3;
        this.field2683[this.field2682] = (short) arg4;
        this.field2684[this.field2682] = (short) arg5;
        this.field2651[this.field2682] = (short) arg6;
        this.field2689[this.field2682] = arg7;
        this.field2681[this.field2682] = arg8;
        return (short) (this.field2682++);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 589)
    public final void method306(int arg0) {
        int var2 = class263.field4653[arg0];
        int var3 = class263.field4649[arg0];
        for (int var4 = 0; var4 < this.field2671; var4++) {
            int var5 = this.field2679[var4] * var3 + this.field2674[var4] * var2 >> 16;
            this.field2674[var4] = this.field2674[var4] * var3 - this.field2679[var4] * var2 >> 16;
            this.field2679[var4] = var5;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()I", line = 609)
    public final int method302() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4893;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIJ)V", line = 616)
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2682 == 0) {
            return;
        }
        GL var10 = class231.field4052;
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
        this.method1058();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZZZZ)V", line = 642)
    private final void method1033(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2667.field4426 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2659.field4426 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2661.field4426 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2662.field4426 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2657.field4338.length < this.field2682 * var6) {
            field2657 = new class249((this.field2682 + 100) * var6);
        } else {
            field2657.field4314 = 0;
        }
        if (arg1) {
            if (class231.field4068) {
                for (int var7 = 0; var7 < this.field2671; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2679[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2692[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2674[var7]);
                    int var11 = this.field2660[var7];
                    int var12 = this.field2660[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2690[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2657.field4314 = var6 * var14;
                        field2657.method1741(var8, -1580277072);
                        field2657.method1741(var9, -1580277072);
                        field2657.method1741(var10, -1580277072);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2671; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2679[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2692[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2674[var15]);
                    int var19 = this.field2660[var15];
                    int var20 = this.field2660[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2690[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2657.field4314 = var6 * var22;
                        field2657.method1745(var16, -427081032);
                        field2657.method1745(var17, -427081032);
                        field2657.method1745(var18, -427081032);
                    }
                }
            }
        }
        if (arg2) {
            if (class26.field397) {
                for (int var42 = 0; var42 < this.field2691; var42++) {
                    int var43 = method1050(this.field2687[var42], this.field2668[var42], this.field2669, this.field2653[var42]);
                    field2657.field4314 = this.field2663[var42] * var6 + this.field2659.field4426;
                    field2657.method1741(var43, -1580277072);
                    field2657.field4314 = this.field2666[var42] * var6 + this.field2659.field4426;
                    field2657.method1741(var43, -1580277072);
                    field2657.field4314 = this.field2655[var42] * var6 + this.field2659.field4426;
                    field2657.method1741(var43, -1580277072);
                }
            } else {
                int var23 = (int) class217.field3862[0];
                int var24 = (int) class217.field3862[1];
                int var25 = (int) class217.field3862[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2669 * 1.3F);
                int var28 = this.field2664 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2691; var29++) {
                    short var30 = this.field2663[var29];
                    short var31 = this.field2651[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2684[var30] * var25 + this.field2683[var30] * var24 + this.field2680[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2684[var30] * var25 + this.field2683[var30] * var24 + this.field2680[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2651[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2666[var29];
                    short var34 = this.field2651[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2684[var33] * var25 + this.field2683[var33] * var24 + this.field2680[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2684[var33] * var25 + this.field2683[var33] * var24 + this.field2680[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2651[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2655[var29];
                    short var37 = this.field2651[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2684[var36] * var25 + this.field2683[var36] * var24 + this.field2680[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2684[var36] * var25 + this.field2683[var36] * var24 + this.field2680[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2651[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1050(this.field2687[var29], this.field2668[var29], var32, this.field2653[var29]);
                    int var40 = method1050(this.field2687[var29], this.field2668[var29], var35, this.field2653[var29]);
                    int var41 = method1050(this.field2687[var29], this.field2668[var29], var38, this.field2653[var29]);
                    field2657.field4314 = var6 * var30 + this.field2659.field4426;
                    field2657.method1741(var39, -1580277072);
                    field2657.field4314 = var6 * var33 + this.field2659.field4426;
                    field2657.method1741(var40, -1580277072);
                    field2657.field4314 = var6 * var36 + this.field2659.field4426;
                    field2657.method1741(var41, -1580277072);
                }
                this.field2680 = null;
                this.field2683 = null;
                this.field2684 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2664;
            float var45 = 3.0F / (float) (this.field2664 / 2 + this.field2664);
            field2657.field4314 = this.field2661.field4426;
            if (class231.field4068) {
                for (int var46 = 0; var46 < this.field2682; var46++) {
                    short var47 = this.field2651[var46];
                    if (var47 == 0) {
                        field2657.method1743((byte) 65, (float) this.field2680[var46] * var45);
                        field2657.method1743((byte) 65, (float) this.field2683[var46] * var45);
                        field2657.method1743((byte) 65, (float) this.field2684[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2657.method1743((byte) 65, (float) this.field2680[var46] * var48);
                        field2657.method1743((byte) 65, (float) this.field2683[var46] * var48);
                        field2657.method1743((byte) 65, (float) this.field2684[var46] * var48);
                    }
                    field2657.field4314 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2682; var49++) {
                    short var50 = this.field2651[var49];
                    if (var50 == 0) {
                        field2657.method1722(90, (float) this.field2680[var49] * var45);
                        field2657.method1722(-33, (float) this.field2683[var49] * var45);
                        field2657.method1722(-76, (float) this.field2684[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2657.method1722(-77, (float) this.field2680[var49] * var51);
                        field2657.method1722(105, (float) this.field2683[var49] * var51);
                        field2657.method1722(-52, (float) this.field2684[var49] * var51);
                    }
                    field2657.field4314 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2657.field4314 = this.field2662.field4426;
            if (class231.field4068) {
                for (int var52 = 0; var52 < this.field2682; var52++) {
                    field2657.method1743((byte) 65, this.field2689[var52]);
                    field2657.method1743((byte) 65, this.field2681[var52]);
                    field2657.field4314 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2682; var53++) {
                    field2657.method1722(-106, this.field2689[var53]);
                    field2657.method1722(118, this.field2681[var53]);
                    field2657.field4314 += var6 - 8;
                }
            }
        }
        field2657.field4314 = this.field2682 * var6;
        if (arg0) {
            if (class231.field4070) {
                ByteBuffer var54 = ByteBuffer.wrap(field2657.field4338, 0, field2657.field4314);
                if (this.field2673 == null) {
                    this.field2673 = new class319(true);
                    this.field2673.method2211(var54);
                } else {
                    this.field2673.method2212(var54);
                }
                if (arg1) {
                    this.field2667.field4429 = true;
                    this.field2667.field4433 = null;
                    this.field2667.field4432 = this.field2673;
                    this.field2667.field4430 = var6;
                }
                if (arg2) {
                    this.field2659.field4429 = true;
                    this.field2659.field4433 = null;
                    this.field2659.field4432 = this.field2673;
                    this.field2659.field4430 = var6;
                }
                if (arg3) {
                    this.field2661.field4429 = true;
                    this.field2661.field4433 = null;
                    this.field2661.field4432 = this.field2673;
                    this.field2661.field4430 = var6;
                }
                if (arg4) {
                    this.field2662.field4429 = true;
                    this.field2662.field4433 = null;
                    this.field2662.field4432 = this.field2673;
                    this.field2662.field4430 = var6;
                }
            } else {
                if (field2688 == null || field2688.capacity() < field2657.field4314) {
                    field2688 = ByteBuffer.allocateDirect(var6 * 100 + field2657.field4314);
                } else {
                    field2688.clear();
                }
                field2688.put(field2657.field4338, 0, field2657.field4314);
                field2688.flip();
                if (arg1) {
                    this.field2667.field4429 = true;
                    this.field2667.field4433 = field2688;
                    this.field2667.field4432 = null;
                    this.field2667.field4430 = var6;
                }
                if (arg2) {
                    this.field2659.field4429 = true;
                    this.field2659.field4433 = field2688;
                    this.field2667.field4432 = null;
                    this.field2659.field4430 = var6;
                }
                if (arg3) {
                    this.field2661.field4429 = true;
                    this.field2661.field4433 = field2688;
                    this.field2661.field4432 = null;
                    this.field2661.field4430 = var6;
                }
                if (arg4) {
                    this.field2662.field4429 = true;
                    this.field2662.field4433 = field2688;
                    this.field2662.field4432 = null;
                    this.field2662.field4430 = var6;
                }
            }
        } else if (class231.field4060) {
            class319 var55 = new class319();
            ByteBuffer var56 = ByteBuffer.wrap(field2657.field4338, 0, field2657.field4314);
            var55.method2211(var56);
            if (arg1) {
                this.field2667.field4429 = true;
                this.field2667.field4433 = null;
                this.field2667.field4432 = var55;
                this.field2667.field4430 = var6;
            }
            if (arg2) {
                this.field2659.field4429 = true;
                this.field2659.field4433 = null;
                this.field2659.field4432 = var55;
                this.field2659.field4430 = var6;
            }
            if (arg3) {
                this.field2661.field4429 = true;
                this.field2661.field4433 = null;
                this.field2661.field4432 = var55;
                this.field2661.field4430 = var6;
            }
            if (arg4) {
                this.field2662.field4429 = true;
                this.field2662.field4433 = null;
                this.field2662.field4432 = var55;
                this.field2662.field4430 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2657.field4314);
            var57.put(field2657.field4338, 0, field2657.field4314);
            var57.flip();
            if (arg1) {
                this.field2667.field4429 = true;
                this.field2667.field4433 = var57;
                this.field2667.field4432 = null;
                this.field2667.field4430 = var6;
            }
            if (arg2) {
                this.field2659.field4429 = true;
                this.field2659.field4433 = var57;
                this.field2667.field4432 = null;
                this.field2659.field4430 = var6;
            }
            if (arg3) {
                this.field2661.field4429 = true;
                this.field2661.field4433 = var57;
                this.field2661.field4432 = null;
                this.field2661.field4430 = var6;
            }
            if (arg4) {
                this.field2662.field4429 = true;
                this.field2662.field4433 = var57;
                this.field2662.field4432 = null;
                this.field2662.field4430 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lee;I)V", line = 1172)
    public final void method310(class284 arg0, int arg1) {
        if (this.field2654 == null || arg1 == -1) {
            return;
        }
        class208 var3 = arg0.field4968[arg1];
        class172 var4 = var3.field3717;
        field2706 = 0;
        field2698 = 0;
        field2701 = 0;
        for (int var5 = 0; var5 < var3.field3725; var5++) {
            short var6 = var3.field3723[var5];
            if (var4.field3147[var6]) {
                if (var3.field3715[var5] != -1) {
                    this.method1047(0, 0, 0, 0);
                }
                this.method1047(var4.field3137[var6], var3.field3722[var5], var3.field3716[var5], var3.field3721[var5]);
            }
        }
        this.field2667.field4429 = false;
        this.field2686.field4891 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(SS)V", line = 1209)
    public final void method1034(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2691; var3++) {
            if (this.field2687[var3] == arg0) {
                this.field2687[var3] = arg1;
            }
        }
        this.field2659.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lee;IZ)V", line = 1223)
    public final void method284(class284 arg0, int arg1, boolean arg2) {
        if (this.field2654 == null || arg1 == -1) {
            return;
        }
        class208 var4 = arg0.field4968[arg1];
        class172 var5 = var4.field3717;
        for (int var6 = 0; var6 < this.field2671; var6++) {
            this.field2679[var6] <<= 0x4;
            this.field2692[var6] <<= 0x4;
            this.field2674[var6] <<= 0x4;
        }
        field2706 = 0;
        field2698 = 0;
        field2701 = 0;
        for (int var7 = 0; var7 < var4.field3725; var7++) {
            short var8 = var4.field3723[var7];
            if (var4.field3715[var7] != -1) {
                this.method1061(0, var5.field3133[var4.field3715[var7]], 0, 0, 0, arg2);
            }
            this.method1061(var5.field3137[var8], var5.field3133[var8], var4.field3722[var7], var4.field3716[var7], var4.field3721[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2671; var9++) {
            this.field2679[var9] >>= 0x4;
            this.field2692[var9] >>= 0x4;
            this.field2674[var9] >>= 0x4;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 1277)
    public final void method290(int arg0) {
        int var2 = class263.field4653[arg0];
        int var3 = class263.field4649[arg0];
        for (int var4 = 0; var4 < this.field2671; var4++) {
            int var5 = this.field2692[var4] * var2 + this.field2679[var4] * var3 >> 16;
            this.field2692[var4] = this.field2692[var4] * var3 - this.field2679[var4] * var2 >> 16;
            this.field2679[var4] = var5;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lma;IIIZ)V", line = 1300)
    public final void method1035(class290 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class148 var6 = (class148) arg0;
        if (this.field2691 == 0 || var6.field2691 == 0) {
            return;
        }
        int var7 = var6.field2671;
        int[] var8 = var6.field2679;
        int[] var9 = var6.field2692;
        int[] var10 = var6.field2674;
        short[] var11 = var6.field2680;
        short[] var12 = var6.field2683;
        short[] var13 = var6.field2684;
        short[] var14 = var6.field2651;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2670 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2670.field1783;
            var16 = this.field2670.field1785;
            var17 = this.field2670.field1784;
            var18 = this.field2670.field1786;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2670 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2670.field1783;
            var20 = var6.field2670.field1785;
            var21 = var6.field2670.field1784;
            var22 = var6.field2670.field1786;
        }
        int[] var23 = var6.field2660;
        short[] var24 = var6.field2690;
        if (!var6.field2686.field4891) {
            var6.method1048();
        }
        short var25 = var6.field2686.field4890;
        short var26 = var6.field2686.field4889;
        short var27 = var6.field2686.field4894;
        short var28 = var6.field2686.field4888;
        short var29 = var6.field2686.field4892;
        short var30 = var6.field2686.field4895;
        for (int var31 = 0; var31 < this.field2671; var31++) {
            int var32 = this.field2692[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2679[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2674[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2660[var31];
                        int var37 = this.field2660[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2690[var38] - 1;
                            if (var35 == -1 || this.field2651[var35] != 0) {
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
                                            this.field2670 = new class102();
                                            var15 = this.field2670.field1783 = class84.method579(this.field2680, (byte) -66);
                                            var16 = this.field2670.field1785 = class84.method579(this.field2683, (byte) -66);
                                            var17 = this.field2670.field1784 = class84.method579(this.field2684, (byte) -66);
                                            var18 = this.field2670.field1786 = class84.method579(this.field2651, (byte) -66);
                                        }
                                        if (var19 == null) {
                                            class102 var44 = var6.field2670 = new class102();
                                            var19 = var44.field1783 = class84.method579(var11, (byte) -66);
                                            var20 = var44.field1785 = class84.method579(var12, (byte) -66);
                                            var21 = var44.field1784 = class84.method579(var13, (byte) -66);
                                            var22 = var44.field1786 = class84.method579(var14, (byte) -66);
                                        }
                                        short var45 = this.field2680[var35];
                                        short var46 = this.field2683[var35];
                                        short var47 = this.field2684[var35];
                                        short var48 = this.field2651[var35];
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
                                        int var57 = this.field2660[var31];
                                        int var58 = this.field2660[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2690[var59] - 1;
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

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()I", line = 1539)
    public final int method292() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4894;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)Lke;", line = 1548)
    public final class113 method288(boolean arg0, boolean arg1) {
        return this.method1054(arg0, arg1, field2697, field2696);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 1551)
    private static final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field2705 = var18;
        field2700 = var19;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()I", line = 1634)
    public final int method289() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4892;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I", line = 1642)
    public final int method282() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4888;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 1648)
    public final void method1037(int arg0) {
        this.field2664 = (short) arg0;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(SS)V", line = 1656)
    public final void method1038(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2691; var3++) {
            if (this.field2668[var3] == arg0) {
                this.field2668[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class263.field4661.method572(arg0 & 0xFFFF, 255);
            var5 = class263.field4661.method573(arg0 & 0xFFFF, (byte) -103);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class263.field4661.method572(arg1 & 0xFFFF, 255);
            var7 = class263.field4661.method573(arg1 & 0xFFFF, (byte) -103);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2659.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V", line = 1690)
    public final void method1039(int arg0) {
        this.field2669 = (short) arg0;
        this.field2659.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZZZZZZ)V", line = 1698)
    public final void method1040(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2675 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2682 != 0) {
            if (arg6) {
                boolean var8 = !this.field2659.field4429 && (arg1 || arg2 && !class26.field397);
                this.method1033(false, !this.field2667.field4429 && arg0, var8, this.field2661 != null && !this.field2661.field4429 && arg2, !this.field2662.field4429 && arg3);
                if (!this.field2665.field4429 && arg4 && arg1) {
                    this.method1028();
                }
            }
            if (arg0) {
                if (this.field2667.field4429) {
                    if (!this.field2686.field4891) {
                        this.method1048();
                    }
                    this.field2679 = null;
                    this.field2692 = null;
                    this.field2674 = null;
                    this.field2690 = null;
                    this.field2660 = null;
                } else {
                    this.field2677 = (byte) (this.field2677 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2659.field4429) {
                    this.field2687 = null;
                    this.field2653 = null;
                } else {
                    this.field2677 = (byte) (this.field2677 | 0x2);
                }
            }
            if (arg2 && class26.field397) {
                if (this.field2661.field4429) {
                    this.field2680 = null;
                    this.field2683 = null;
                    this.field2684 = null;
                    this.field2651 = null;
                } else {
                    this.field2677 = (byte) (this.field2677 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2662.field4429) {
                    this.field2689 = null;
                    this.field2681 = null;
                } else {
                    this.field2677 = (byte) (this.field2677 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2665.field4429 && this.field2659.field4429) {
                    this.field2663 = null;
                    this.field2666 = null;
                    this.field2655 = null;
                } else {
                    this.field2677 = (byte) (this.field2677 | 0x10);
                }
            }
            if (arg5) {
                this.field2652 = null;
                this.field2656 = null;
                this.field2654 = (int[][]) null;
                this.field2693 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILab;[[I[[IIII)V", line = 1793)
    public final void method1041(int arg0, int arg1, class148 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2686.field4891) {
            arg2.method1048();
        }
        int var9 = arg2.field2686.field4894 + arg5;
        int var10 = arg2.field2686.field4888 + arg5;
        int var11 = arg2.field2686.field4892 + arg7;
        int var12 = arg2.field2686.field4895 + arg7;
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
            for (int var17 = 0; var17 < this.field2671; var17++) {
                int var18 = this.field2679[var17] + arg5;
                int var19 = this.field2674[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2692[var17] = this.field2692[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2686.field4890;
            for (int var28 = 0; var28 < this.field2671; var28++) {
                int var29 = (this.field2692[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2679[var28] + arg5;
                    int var31 = this.field2674[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2692[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method807(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2686.field4889 - arg2.field2686.field4890;
            for (int var42 = 0; var42 < this.field2671; var42++) {
                int var43 = this.field2679[var42] + arg5;
                int var44 = this.field2674[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2692[var42] = var51 + this.field2692[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2686.field4889 - arg2.field2686.field4890;
            for (int var53 = 0; var53 < this.field2671; var53++) {
                int var54 = this.field2679[var53] + arg5;
                int var55 = this.field2674[var53] + arg7;
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
                this.field2692[var53] = ((this.field2692[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2667.field4429 = false;
        this.field2686.field4891 = false;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 1991)
    public final void method307(int arg0) {
        int var2 = class263.field4653[arg0];
        int var3 = class263.field4649[arg0];
        for (int var4 = 0; var4 < this.field2671; var4++) {
            int var5 = this.field2692[var4] * var3 - this.field2674[var4] * var2 >> 16;
            this.field2674[var4] = this.field2692[var4] * var2 + this.field2674[var4] * var3 >> 16;
            this.field2692[var4] = var5;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "()V", line = 2012)
    public static final void method1042() {
        field2685 = new class148();
        field2695 = new class148();
        field2696 = new class148();
        field2697 = new class148();
    }

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "()V", line = 2018)
    public final void method1043() {
        if (this.field2680 == null) {
            this.method297();
            return;
        }
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2679[var1] = -this.field2679[var1];
            this.field2674[var1] = -this.field2674[var1];
        }
        for (int var2 = 0; var2 < this.field2682; var2++) {
            this.field2680[var2] = (short) (-this.field2680[var2]);
            this.field2684[var2] = (short) (-this.field2684[var2]);
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 3756)
    private class148() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljf;IIZ)V", line = 3758)
    public class148(class230 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field4010];
        this.field2660 = new int[arg0.field4009 + 1];
        for (int var6 = 0; var6 < arg0.field4010; var6++) {
            if ((arg0.field4016 == null || arg0.field4016[var6] != 2) && (arg0.field4012 == null || arg0.field4012[var6] == -1 || !class263.field4661.method584((byte) -18, arg0.field4012[var6] & 0xFFFF))) {
                var5[this.field2691++] = var6;
                this.field2660[arg0.field4047[var6]]++;
                this.field2660[arg0.field4045[var6]]++;
                this.field2660[arg0.field4021[var6]]++;
            }
        }
        long[] var7 = new long[this.field2691];
        for (int var8 = 0; var8 < this.field2691; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field4012 != null) {
                var14 = arg0.field4012[var9];
                if (var14 != -1) {
                    var12 = class263.field4661.method569((byte) -96, var14 & 0xFFFF);
                    var13 = class263.field4661.method566((byte) 111, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field4046 != null && arg0.field4046[var9] != 0 || var14 != -1 && !class263.field4661.method561(-94, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field4030 != null) {
                var10 += arg0.field4030[var9] << 17;
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
        class302.method2125(-127, var7, var5);
        this.field2671 = arg0.field4009;
        this.field2679 = arg0.field4035;
        this.field2692 = arg0.field4020;
        this.field2674 = arg0.field4029;
        this.field2652 = arg0.field4048;
        this.field2678 = arg0.field4044;
        this.field2658 = arg0.field4037;
        int var20 = this.field2691 * 3;
        this.field2680 = new short[var20];
        this.field2683 = new short[var20];
        this.field2684 = new short[var20];
        this.field2651 = new short[var20];
        this.field2689 = new float[var20];
        this.field2681 = new float[var20];
        this.field2687 = new short[this.field2691];
        this.field2653 = new byte[this.field2691];
        this.field2663 = new short[this.field2691];
        this.field2666 = new short[this.field2691];
        this.field2655 = new short[this.field2691];
        this.field2668 = new short[this.field2691];
        if (arg0.field4000 != null) {
            this.field2656 = new byte[this.field2691];
        }
        this.field2686 = new class279();
        this.field2667 = new class255();
        this.field2659 = new class255();
        if (class26.field397) {
            this.field2661 = new class255();
        }
        this.field2662 = new class255();
        this.field2665 = new class255();
        this.field2669 = (short) arg1;
        this.field2664 = (short) arg2;
        this.field2690 = new short[var20];
        field2676 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field4009; var22++) {
            int var23 = this.field2660[var22];
            this.field2660[var22] = var21;
            var21 += var23;
        }
        this.field2660[arg0.field4009] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field4034 != null) {
            int var28 = arg0.field4024;
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
            for (int var36 = 0; var36 < this.field2691; var36++) {
                int var37 = var5[var36];
                if (arg0.field4034[var37] != -1) {
                    int var38 = arg0.field4034[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field4047[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field4045[var37];
                        } else {
                            var40 = arg0.field4021[var37];
                        }
                        int var41 = arg0.field4035[var40];
                        int var42 = arg0.field4020[var40];
                        int var43 = arg0.field4029[var40];
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
                byte var45 = arg0.field4015[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field4004[var44];
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
                        var49 = 64.0F / (float) (arg0.field4005[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field4004[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field4005[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field4019[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field4004[var44] / 1024.0F;
                        var49 = (float) arg0.field4005[var44] / 1024.0F;
                        var48 = (float) arg0.field4019[var44] / 1024.0F;
                    }
                    var27[var44] = method1030(arg0.field4014[var44], arg0.field4013[var44], arg0.field4003[var44], arg0.field4041[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2691; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field4023[var51] & 0xFFFF;
            short var53;
            if (arg0.field4012 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field4012[var51];
            }
            int var54;
            if (arg0.field4034 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field4034[var51];
            }
            int var55;
            if (arg0.field4046 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field4046[var51] & 0xFF;
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
                    byte var65 = arg0.field4015[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field4047[var51];
                        int var67 = arg0.field4045[var51];
                        int var68 = arg0.field4021[var51];
                        short var69 = arg0.field4014[var54];
                        short var70 = arg0.field4013[var54];
                        short var71 = arg0.field4003[var54];
                        float var72 = (float) arg0.field4035[var69];
                        float var73 = (float) arg0.field4020[var69];
                        float var74 = (float) arg0.field4029[var69];
                        float var75 = (float) arg0.field4035[var70] - var72;
                        float var76 = (float) arg0.field4020[var70] - var73;
                        float var77 = (float) arg0.field4029[var70] - var74;
                        float var78 = (float) arg0.field4035[var71] - var72;
                        float var79 = (float) arg0.field4020[var71] - var73;
                        float var80 = (float) arg0.field4029[var71] - var74;
                        float var81 = (float) arg0.field4035[var66] - var72;
                        float var82 = (float) arg0.field4020[var66] - var73;
                        float var83 = (float) arg0.field4029[var66] - var74;
                        float var84 = (float) arg0.field4035[var67] - var72;
                        float var85 = (float) arg0.field4020[var67] - var73;
                        float var86 = (float) arg0.field4029[var67] - var74;
                        float var87 = (float) arg0.field4035[var68] - var72;
                        float var88 = (float) arg0.field4020[var68] - var73;
                        float var89 = (float) arg0.field4029[var68] - var74;
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
                        int var101 = arg0.field4047[var51];
                        int var102 = arg0.field4045[var51];
                        int var103 = arg0.field4021[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field4007[var54];
                        float var109 = (float) arg0.field4006[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field4019[var54] & 0xFFFF) / 1024.0F;
                            method1053(arg0.field4035[var101], arg0.field4020[var101], arg0.field4029[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2702;
                            var57 = field2708;
                            method1053(arg0.field4035[var102], arg0.field4020[var102], arg0.field4029[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2702;
                            var59 = field2708;
                            method1053(arg0.field4035[var103], arg0.field4020[var103], arg0.field4029[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2702;
                            var61 = field2708;
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
                            float var112 = (float) arg0.field4018[var54] / 256.0F;
                            float var113 = (float) arg0.field4033[var54] / 256.0F;
                            int var114 = arg0.field4035[var102] - arg0.field4035[var101];
                            int var115 = arg0.field4020[var102] - arg0.field4020[var101];
                            int var116 = arg0.field4029[var102] - arg0.field4029[var101];
                            int var117 = arg0.field4035[var103] - arg0.field4035[var101];
                            int var118 = arg0.field4020[var103] - arg0.field4020[var101];
                            int var119 = arg0.field4029[var103] - arg0.field4029[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field4004[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field4005[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field4019[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1025(var126, var127, var128);
                            method1036(arg0.field4035[var101], arg0.field4020[var101], arg0.field4029[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2705;
                            var57 = field2700;
                            method1036(arg0.field4035[var102], arg0.field4020[var102], arg0.field4029[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2705;
                            var59 = field2700;
                            method1036(arg0.field4035[var103], arg0.field4020[var103], arg0.field4029[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2705;
                            var61 = field2700;
                        } else if (var65 == 3) {
                            method1046(arg0.field4035[var101], arg0.field4020[var101], arg0.field4029[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2704;
                            var57 = field2703;
                            method1046(arg0.field4035[var102], arg0.field4020[var102], arg0.field4029[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2704;
                            var59 = field2703;
                            method1046(arg0.field4035[var103], arg0.field4020[var103], arg0.field4029[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2704;
                            var61 = field2703;
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
            arg0.method1542();
            byte var129;
            if (arg0.field4016 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field4016[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field4047[var51];
                class54 var133 = arg0.field4042[var132];
                this.field2663[var50] = this.method1032(arg0, var132, var130, var133.field800, var133.field785, var133.field795, var133.field798, var56, var57);
                int var134 = arg0.field4045[var51];
                class54 var135 = arg0.field4042[var134];
                this.field2666[var50] = this.method1032(arg0, var134, (long) var62 + var130, var135.field800, var135.field785, var135.field795, var135.field798, var58, var59);
                int var136 = arg0.field4021[var51];
                class54 var137 = arg0.field4042[var136];
                this.field2655[var50] = this.method1032(arg0, var136, (long) var63 + var130, var137.field800, var137.field785, var137.field795, var137.field798, var60, var61);
            } else if (var129 == 1) {
                class159 var138 = arg0.field4028[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2858 > 0 ? 1024 : 2048) + (var138.field2855 + 256 << 12) + (var138.field2856 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2663[var50] = this.method1032(arg0, arg0.field4047[var51], var139, var138.field2858, var138.field2855, var138.field2856, 0, var56, var57);
                this.field2666[var50] = this.method1032(arg0, arg0.field4045[var51], (long) var62 + var139, var138.field2858, var138.field2855, var138.field2856, 0, var58, var59);
                this.field2655[var50] = this.method1032(arg0, arg0.field4021[var51], (long) var63 + var139, var138.field2858, var138.field2855, var138.field2856, 0, var60, var61);
            }
            if (arg0.field4012 == null) {
                this.field2668[var50] = -1;
            } else {
                this.field2668[var50] = arg0.field4012[var51];
            }
            if (this.field2656 != null) {
                this.field2656[var50] = (byte) arg0.field4000[var51];
            }
            this.field2687[var50] = arg0.field4023[var51];
            if (arg0.field4046 != null) {
                this.field2653[var50] = arg0.field4046[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2691; var143++) {
            short var144 = this.field2668[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2694 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2691; var147++) {
            short var148 = this.field2668[var147];
            if (var146 != var148) {
                this.field2694[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2694[var145] = this.field2691;
        field2676 = null;
        this.field2680 = method1059(this.field2680, this.field2682);
        this.field2683 = method1059(this.field2683, this.field2682);
        this.field2684 = method1059(this.field2684, this.field2682);
        this.field2651 = method1059(this.field2651, this.field2682);
        this.field2689 = method1055(this.field2689, this.field2682);
        this.field2681 = method1055(this.field2681, this.field2682);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()V", line = 2058)
    public final void method299() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2674[var1];
            this.field2674[var1] = this.field2679[var1];
            this.field2679[var1] = -var2;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "()V", line = 2073)
    public static void method1044() {
        field2676 = null;
        field2657 = null;
        field2688 = null;
        field2685 = null;
        field2695 = null;
        field2696 = null;
        field2697 = null;
        field2699 = null;
        field2707 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(ZZ)Lke;", line = 2085)
    public final class113 method313(boolean arg0, boolean arg1) {
        return this.method1054(arg0, arg1, field2695, field2685);
    }

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "()V", line = 2094)
    public final void method1045() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2674[var1] = -this.field2674[var1];
        }
        if (this.field2684 != null) {
            for (int var2 = 0; var2 < this.field2682; var2++) {
                this.field2684[var2] = (short) (-this.field2684[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2691; var3++) {
            short var4 = this.field2663[var3];
            this.field2663[var3] = this.field2655[var3];
            this.field2655[var3] = var4;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
        this.field2665.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII[FIF)V", line = 2130)
    private static final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field2704 = var16;
        field2703 = var17;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V", line = 2176)
    private final void method1047(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2706 = 0;
            field2698 = 0;
            field2701 = 0;
            for (int var6 = 0; var6 < this.field2671; var6++) {
                field2706 += this.field2679[var6];
                field2698 += this.field2692[var6];
                field2701 += this.field2674[var6];
                var5++;
            }
            if (var5 > 0) {
                field2706 = field2706 / var5 + arg1;
                field2698 = field2698 / var5 + arg2;
                field2701 = field2701 / var5 + arg3;
            } else {
                field2706 = arg1;
                field2698 = arg2;
                field2701 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2671; var7++) {
                this.field2679[var7] += arg1;
                this.field2692[var7] += arg2;
                this.field2674[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2671; var8++) {
                this.field2679[var8] -= field2706;
                this.field2692[var8] -= field2698;
                this.field2674[var8] -= field2701;
                if (arg3 != 0) {
                    int var9 = class263.field4653[arg3];
                    int var10 = class263.field4649[arg3];
                    int var11 = this.field2692[var8] * var9 + this.field2679[var8] * var10 + 32767 >> 16;
                    this.field2692[var8] = this.field2692[var8] * var10 + 32767 - this.field2679[var8] * var9 >> 16;
                    this.field2679[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class263.field4653[arg1];
                    int var13 = class263.field4649[arg1];
                    int var14 = this.field2692[var8] * var13 + 32767 - this.field2674[var8] * var12 >> 16;
                    this.field2674[var8] = this.field2692[var8] * var12 + this.field2674[var8] * var13 + 32767 >> 16;
                    this.field2692[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class263.field4653[arg2];
                    int var16 = class263.field4649[arg2];
                    int var17 = this.field2679[var8] * var16 + this.field2674[var8] * var15 + 32767 >> 16;
                    this.field2674[var8] = this.field2674[var8] * var16 + 32767 - this.field2679[var8] * var15 >> 16;
                    this.field2679[var8] = var17;
                }
                this.field2679[var8] += field2706;
                this.field2692[var8] += field2698;
                this.field2674[var8] += field2701;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2671; var18++) {
                this.field2679[var18] -= field2706;
                this.field2692[var18] -= field2698;
                this.field2674[var18] -= field2701;
                this.field2679[var18] = this.field2679[var18] * arg1 / 128;
                this.field2692[var18] = this.field2692[var18] * arg2 / 128;
                this.field2674[var18] = this.field2674[var18] * arg3 / 128;
                this.field2679[var18] += field2706;
                this.field2692[var18] += field2698;
                this.field2674[var18] += field2701;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2691; var19++) {
                int var20 = (this.field2653[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2653[var19] = (byte) var20;
            }
            this.field2659.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 2332)
    public final void method316() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2679[var1];
            this.field2679[var1] = this.field2674[var1];
            this.field2674[var1] = -var2;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I", line = 2347)
    public final int method95() {
        if (!this.field2686.field4891) {
            this.method1048();
        }
        return this.field2686.field4890;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 2353)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        if (this.field2682 == 0) {
            return;
        }
        if (!this.field2686.field4891) {
            this.method1048();
        }
        short var13 = this.field2686.field4893;
        short var14 = this.field2686.field4890;
        short var15 = this.field2686.field4889;
        if (arg10 != null) {
            arg10.method1142(arg0, arg9, arg5, arg6, arg7);
        }
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
        if (var21 / var18 <= class21.field308) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class64.field1022) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class122.field2080) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class299.field5216) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class263.field4653[arg0];
            var27 = class263.field4649[arg0];
        }
        if (arg8 > 0L && class212.field3783 && var19 > 0) {
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
            if (class289.field5048 >= var28 && class289.field5048 <= var29 && class172.field3146 >= var30 && class172.field3146 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2686.field4894;
                short var37 = this.field2686.field4888;
                short var38 = this.field2686.field4892;
                short var39 = this.field2686.field4895;
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
                if (class289.field5048 >= var32 && class289.field5048 <= var33 && class172.field3146 >= var34 && class172.field3146 <= var35) {
                    if (this.field1950) {
                        class252.field4399[class289.field5066++] = arg8;
                    } else {
                        if (field2699.length < this.field2682) {
                            field2699 = new int[this.field2682];
                            field2707 = new int[this.field2682];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field2671) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2691) {
                                        break label124;
                                    }
                                    short var80 = this.field2663[var79];
                                    short var81 = this.field2666[var79];
                                    short var82 = this.field2655[var79];
                                    if (this.method1062(class289.field5048, class172.field3146, field2707[var80], field2707[var81], field2707[var82], field2699[var80], field2699[var81], field2699[var82])) {
                                        class252.field4399[class289.field5066++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2679[var59];
                            int var61 = this.field2692[var59];
                            int var62 = this.field2674[var59];
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
                            int var75 = this.field2660[var59];
                            int var76 = this.field2660[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2690[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2699[var78] = var73;
                                field2707[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class231.field4052;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1058();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        if (arg10 != null) {
            arg10.method1139(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "()V", line = 2638)
    private final void method1048() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2671; var9++) {
            int var10 = this.field2679[var9];
            int var11 = this.field2692[var9];
            int var12 = this.field2674[var9];
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
        this.field2686.field4894 = (short) var1;
        this.field2686.field4888 = (short) var4;
        this.field2686.field4890 = (short) var2;
        this.field2686.field4889 = (short) var5;
        this.field2686.field4892 = (short) var3;
        this.field2686.field4895 = (short) var6;
        this.field2686.field4893 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2686.field4891 = true;
    }

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "()I", line = 2707)
    public final int method1049() {
        return this.field2664;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ISIB)I", line = 2714)
    private static final int method1050(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class263.field4657[class44.method301(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class263.field4661.method572(arg1 & 0xFFFF, 255);
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
            int var9 = class263.field4661.method573(arg1 & 0xFFFF, (byte) -103);
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

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "()V", line = 2772)
    public final void method1051() {
        if (this.field2680 == null) {
            this.method299();
            return;
        }
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2674[var1];
            this.field2674[var1] = this.field2679[var1];
            this.field2679[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2682; var3++) {
            short var4 = this.field2684[var3];
            this.field2684[var3] = this.field2680[var3];
            this.field2680[var3] = (short) (-var4);
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V", line = 2810)
    public final void method1052(int arg0) {
        if (this.field2680 == null) {
            this.method306(arg0);
            return;
        }
        int var2 = class263.field4653[arg0];
        int var3 = class263.field4649[arg0];
        for (int var4 = 0; var4 < this.field2671; var4++) {
            int var5 = this.field2679[var4] * var3 + this.field2674[var4] * var2 >> 16;
            this.field2674[var4] = this.field2674[var4] * var3 - this.field2679[var4] * var2 >> 16;
            this.field2679[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2682; var6++) {
            int var7 = this.field2684[var6] * var2 + this.field2680[var6] * var3 >> 16;
            this.field2684[var6] = (short) (this.field2684[var6] * var3 - this.field2680[var6] * var2 >> 16);
            this.field2680[var6] = (short) var7;
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2856)
    private static final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field2702 = var16;
        field2708 = var17;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZLab;Lab;)Lke;", line = 2904)
    private final class113 method1054(boolean arg0, boolean arg1, class148 arg2, class148 arg3) {
        arg2.field2671 = this.field2671;
        arg2.field2682 = this.field2682;
        arg2.field2691 = this.field2691;
        arg2.field2669 = this.field2669;
        arg2.field2664 = this.field2664;
        arg2.field2675 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2679 == null || arg2.field2679.length < this.field2671) {
            arg2.field2679 = new int[this.field2671 + 100];
            arg2.field2692 = new int[this.field2671 + 100];
            arg2.field2674 = new int[this.field2671 + 100];
        }
        for (int var5 = 0; var5 < this.field2671; var5++) {
            arg2.field2679[var5] = this.field2679[var5];
            arg2.field2692[var5] = this.field2692[var5];
            arg2.field2674[var5] = this.field2674[var5];
        }
        if (arg2.field2667 == null) {
            arg2.field2667 = new class255();
        }
        arg2.field2667.field4429 = false;
        if (arg2.field2686 == null) {
            arg2.field2686 = new class279();
        }
        arg2.field2686.field4891 = false;
        if (arg0) {
            arg2.field2653 = this.field2653;
            arg2.field2659 = this.field2659;
        } else {
            if (arg3.field2653 == null || arg3.field2653.length < this.field2691) {
                arg3.field2653 = new byte[this.field2691 + 100];
            }
            arg2.field2653 = arg3.field2653;
            for (int var6 = 0; var6 < this.field2691; var6++) {
                arg2.field2653[var6] = this.field2653[var6];
            }
            if (arg3.field2659 == null) {
                arg3.field2659 = new class255();
            }
            arg2.field2659 = arg3.field2659;
            arg2.field2659.field4429 = false;
        }
        if (arg1) {
            arg2.field2680 = this.field2680;
            arg2.field2683 = this.field2683;
            arg2.field2684 = this.field2684;
            arg2.field2651 = this.field2651;
            arg2.field2661 = this.field2661;
        } else {
            if (arg3.field2680 == null || arg3.field2680.length < this.field2682) {
                arg3.field2680 = new short[this.field2682 + 100];
                arg3.field2683 = new short[this.field2682 + 100];
                arg3.field2684 = new short[this.field2682 + 100];
                arg3.field2651 = new short[this.field2682 + 100];
            }
            arg2.field2680 = arg3.field2680;
            arg2.field2683 = arg3.field2683;
            arg2.field2684 = arg3.field2684;
            arg2.field2651 = arg3.field2651;
            for (int var7 = 0; var7 < this.field2682; var7++) {
                arg2.field2680[var7] = this.field2680[var7];
                arg2.field2683[var7] = this.field2683[var7];
                arg2.field2684[var7] = this.field2684[var7];
                arg2.field2651[var7] = this.field2651[var7];
            }
            if (class26.field397) {
                if (arg3.field2661 == null) {
                    arg3.field2661 = new class255();
                }
                arg2.field2661 = arg3.field2661;
                arg2.field2661.field4429 = false;
            } else {
                arg2.field2661 = null;
            }
        }
        arg2.field2689 = this.field2689;
        arg2.field2681 = this.field2681;
        arg2.field2652 = this.field2652;
        arg2.field2654 = this.field2654;
        arg2.field2687 = this.field2687;
        arg2.field2663 = this.field2663;
        arg2.field2666 = this.field2666;
        arg2.field2655 = this.field2655;
        arg2.field2668 = this.field2668;
        arg2.field2656 = this.field2656;
        arg2.field2693 = this.field2693;
        arg2.field2662 = this.field2662;
        arg2.field2665 = this.field2665;
        arg2.field2694 = this.field2694;
        arg2.field2690 = this.field2690;
        arg2.field2660 = this.field2660;
        arg2.field1950 = this.field1950;
        arg2.field2678 = this.field2678;
        arg2.field2658 = this.field2658;
        return arg2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([FI)[F", line = 3035)
    private static final float[] method1055(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class23.method161(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "()I", line = 3040)
    public final int method1056() {
        return this.field2669;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZZZZZZZZZZ)Lab;", line = 3045)
    public final class148 method1057(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class148 var12 = new class148();
        var12.field2671 = this.field2671;
        var12.field2682 = this.field2682;
        var12.field2691 = this.field2691;
        if (arg0) {
            var12.field2679 = this.field2679;
            var12.field2674 = this.field2674;
        } else {
            var12.field2679 = class262.method1878(0, this.field2679);
            var12.field2674 = class262.method1878(0, this.field2674);
        }
        if (arg1) {
            var12.field2692 = this.field2692;
        } else {
            var12.field2692 = class262.method1878(0, this.field2692);
        }
        if (arg0 && arg1) {
            var12.field2667 = this.field2667;
            var12.field2686 = this.field2686;
        } else {
            var12.field2667 = new class255();
            var12.field2686 = new class279();
        }
        if (arg2) {
            var12.field2687 = this.field2687;
        } else {
            var12.field2687 = class84.method579(this.field2687, (byte) -66);
        }
        if (arg3) {
            var12.field2653 = this.field2653;
        } else {
            var12.field2653 = class271.method1953(this.field2653, (byte) -103);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class26.field397) {
            var12.field2659 = new class255();
        } else {
            var12.field2659 = this.field2659;
        }
        if (arg5) {
            var12.field2680 = this.field2680;
            var12.field2683 = this.field2683;
            var12.field2684 = this.field2684;
            var12.field2651 = this.field2651;
        } else {
            var12.field2680 = class84.method579(this.field2680, (byte) -66);
            var12.field2683 = class84.method579(this.field2683, (byte) -66);
            var12.field2684 = class84.method579(this.field2684, (byte) -66);
            var12.field2651 = class84.method579(this.field2651, (byte) -66);
        }
        if (!class26.field397) {
            var12.field2661 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2661 = this.field2661;
        } else {
            var12.field2661 = new class255();
        }
        if (arg8) {
            var12.field2689 = this.field2689;
            var12.field2681 = this.field2681;
            var12.field2662 = this.field2662;
        } else {
            var12.field2689 = class273.method1974(0, this.field2689);
            var12.field2681 = class273.method1974(0, this.field2681);
            var12.field2662 = new class255();
        }
        if (arg9) {
            var12.field2663 = this.field2663;
            var12.field2666 = this.field2666;
            var12.field2655 = this.field2655;
            var12.field2665 = this.field2665;
        } else {
            var12.field2663 = class84.method579(this.field2663, (byte) -66);
            var12.field2666 = class84.method579(this.field2666, (byte) -66);
            var12.field2655 = class84.method579(this.field2655, (byte) -66);
            var12.field2665 = new class255();
        }
        if (arg10) {
            var12.field2668 = this.field2668;
        } else {
            var12.field2668 = class84.method579(this.field2668, (byte) -66);
        }
        var12.field2652 = this.field2652;
        var12.field2654 = this.field2654;
        var12.field2656 = this.field2656;
        var12.field2693 = this.field2693;
        var12.field2694 = this.field2694;
        var12.field2690 = this.field2690;
        var12.field2660 = this.field2660;
        var12.field2669 = this.field2669;
        var12.field2664 = this.field2664;
        var12.field2678 = this.field2678;
        var12.field2658 = this.field2658;
        return var12;
    }

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "()V", line = 3185)
    private final void method1058() {
        GL var1 = class231.field4052;
        if (this.field2691 == 0) {
            return;
        }
        if (this.field2675 != 0) {
            this.method1033(true, !this.field2667.field4429 && (this.field2675 & 0x1) != 0, !this.field2659.field4429 && (this.field2675 & 0x2) != 0, this.field2661 != null && !this.field2661.field4429 && (this.field2675 & 0x4) != 0, false);
        }
        this.method1033(false, !this.field2667.field4429, !this.field2659.field4429, this.field2661 != null && !this.field2661.field4429, !this.field2662.field4429);
        if (!this.field2665.field4429) {
            this.method1028();
        }
        if (this.field2677 != 0) {
            if ((this.field2677 & 0x1) != 0) {
                this.field2679 = null;
                this.field2692 = null;
                this.field2674 = null;
                this.field2690 = null;
                this.field2660 = null;
            }
            if ((this.field2677 & 0x2) != 0) {
                this.field2687 = null;
                this.field2653 = null;
            }
            if ((this.field2677 & 0x4) != 0) {
                this.field2680 = null;
                this.field2683 = null;
                this.field2684 = null;
                this.field2651 = null;
            }
            if ((this.field2677 & 0x8) != 0) {
                this.field2689 = null;
                this.field2681 = null;
            }
            if ((this.field2677 & 0x10) != 0) {
                this.field2663 = null;
                this.field2666 = null;
                this.field2655 = null;
            }
            this.field2677 = 0;
        }
        class319 var2 = null;
        if (this.field2667.field4432 != null) {
            this.field2667.field4432.method2215();
            var2 = this.field2667.field4432;
            var1.glVertexPointer(3, 5126, this.field2667.field4430, (long) this.field2667.field4426);
        }
        if (this.field2659.field4432 != null) {
            if (this.field2659.field4432 != var2) {
                this.field2659.field4432.method2215();
                var2 = this.field2659.field4432;
            }
            var1.glColorPointer(4, 5121, this.field2659.field4430, (long) this.field2659.field4426);
        }
        if (class26.field397 && this.field2661.field4432 != null) {
            if (this.field2661.field4432 != var2) {
                this.field2661.field4432.method2215();
                var2 = this.field2661.field4432;
            }
            var1.glNormalPointer(5126, this.field2661.field4430, (long) this.field2661.field4426);
        }
        if (this.field2662.field4432 != null) {
            if (this.field2662.field4432 != var2) {
                this.field2662.field4432.method2215();
                class319 var3 = this.field2662.field4432;
            }
            var1.glTexCoordPointer(2, 5126, this.field2662.field4430, (long) this.field2662.field4426);
        }
        if (this.field2665.field4432 != null) {
            this.field2665.field4432.method2214();
        }
        if (this.field2667.field4432 == null || this.field2659.field4432 == null || class26.field397 && this.field2661.field4432 == null || this.field2662.field4432 == null) {
            if (class231.field4060) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2667.field4432 == null) {
                this.field2667.field4433.position(this.field2667.field4426);
                var1.glVertexPointer(3, 5126, this.field2667.field4430, this.field2667.field4433);
            }
            if (this.field2659.field4432 == null) {
                this.field2659.field4433.position(this.field2659.field4426);
                var1.glColorPointer(4, 5121, this.field2659.field4430, this.field2659.field4433);
            }
            if (class26.field397 && this.field2661.field4432 == null) {
                this.field2661.field4433.position(this.field2661.field4426);
                var1.glNormalPointer(5126, this.field2661.field4430, this.field2661.field4433);
            }
            if (this.field2662.field4432 == null) {
                this.field2662.field4433.position(this.field2662.field4426);
                var1.glTexCoordPointer(2, 5126, this.field2662.field4430, this.field2662.field4433);
            }
        }
        if (this.field2665.field4432 == null && class231.field4060) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2694.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2694[var5];
            int var7 = this.field2694[var5 + 1];
            short var8 = this.field2668[var6];
            if (var8 == -1) {
                class231.method1597(-1);
                class59.method403(0, (byte) -43, 0);
            } else {
                class263.field4661.method583(22259, var8 & 0xFFFF);
            }
            if (this.field2665.field4432 == null) {
                this.field2665.field4433.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2665.field4433);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([SI)[S", line = 3359)
    private static final short[] method1059(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class23.method160(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "()V", line = 3371)
    public final void method1060() {
        if (this.field2680 == null) {
            this.method316();
            return;
        }
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2679[var1];
            this.field2679[var1] = this.field2674[var1];
            this.field2674[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2682; var3++) {
            short var4 = this.field2680[var3];
            this.field2680[var3] = this.field2684[var3];
            this.field2684[var3] = (short) (-var4);
        }
        this.field2686.field4891 = false;
        this.field2667.field4429 = false;
        if (this.field2661 != null) {
            this.field2661.field4429 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[IIIIZ)V", line = 3410)
    private final void method1061(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2706 = 0;
            field2698 = 0;
            field2701 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2654.length) {
                    int[] var14 = this.field2654[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2706 += this.field2679[var16];
                        field2698 += this.field2692[var16];
                        field2701 += this.field2674[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2706 = field2706 / var11 + var8;
                field2698 = field2698 / var11 + var9;
                field2701 = field2701 / var11 + var10;
            } else {
                field2706 = var8;
                field2698 = var9;
                field2701 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2654.length) {
                    int[] var22 = this.field2654[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2679[var24] += var17;
                        this.field2692[var24] += var18;
                        this.field2674[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2654.length) {
                    int[] var27 = this.field2654[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2679[var29] -= field2706;
                        this.field2692[var29] -= field2698;
                        this.field2674[var29] -= field2701;
                        if (arg4 != 0) {
                            int var30 = class263.field4653[arg4];
                            int var31 = class263.field4649[arg4];
                            int var32 = this.field2692[var29] * var30 + this.field2679[var29] * var31 + 32767 >> 16;
                            this.field2692[var29] = this.field2692[var29] * var31 + 32767 - this.field2679[var29] * var30 >> 16;
                            this.field2679[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class263.field4653[arg2];
                            int var34 = class263.field4649[arg2];
                            int var35 = this.field2692[var29] * var34 + 32767 - this.field2674[var29] * var33 >> 16;
                            this.field2674[var29] = this.field2692[var29] * var33 + this.field2674[var29] * var34 + 32767 >> 16;
                            this.field2692[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class263.field4653[arg3];
                            int var37 = class263.field4649[arg3];
                            int var38 = this.field2679[var29] * var37 + this.field2674[var29] * var36 + 32767 >> 16;
                            this.field2674[var29] = this.field2674[var29] * var37 + 32767 - this.field2679[var29] * var36 >> 16;
                            this.field2679[var29] = var38;
                        }
                        this.field2679[var29] += field2706;
                        this.field2692[var29] += field2698;
                        this.field2674[var29] += field2701;
                    }
                }
            }
            if (arg5 && this.field2680 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2654.length) {
                        int[] var41 = this.field2654[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2660[var43];
                            int var45 = this.field2660[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2690[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class263.field4653[arg4];
                                    int var49 = class263.field4649[arg4];
                                    int var50 = this.field2683[var47] * var48 + this.field2680[var47] * var49 + 32767 >> 16;
                                    this.field2683[var47] = (short) (this.field2683[var47] * var49 + 32767 - this.field2680[var47] * var48 >> 16);
                                    this.field2680[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class263.field4653[arg2];
                                    int var52 = class263.field4649[arg2];
                                    int var53 = this.field2683[var47] * var52 + 32767 - this.field2684[var47] * var51 >> 16;
                                    this.field2684[var47] = (short) (this.field2684[var47] * var52 + this.field2683[var47] * var51 + 32767 >> 16);
                                    this.field2683[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class263.field4653[arg3];
                                    int var55 = class263.field4649[arg3];
                                    int var56 = this.field2684[var47] * var54 + this.field2680[var47] * var55 + 32767 >> 16;
                                    this.field2684[var47] = (short) (this.field2684[var47] * var55 + 32767 - this.field2680[var47] * var54 >> 16);
                                    this.field2680[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2661 != null) {
                    this.field2661.field4429 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2654.length) {
                    int[] var59 = this.field2654[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2679[var61] -= field2706;
                        this.field2692[var61] -= field2698;
                        this.field2674[var61] -= field2701;
                        this.field2679[var61] = this.field2679[var61] * arg2 >> 7;
                        this.field2692[var61] = this.field2692[var61] * arg3 >> 7;
                        this.field2674[var61] = this.field2674[var61] * arg4 >> 7;
                        this.field2679[var61] += field2706;
                        this.field2692[var61] += field2698;
                        this.field2674[var61] += field2701;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2693 != null && this.field2653 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2693.length) {
                    int[] var64 = this.field2693[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2653[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2653[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2659.field4429 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIII)Z", line = 4510)
    private final boolean method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
