import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class176 extends class208 {

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    private int field2941 = 0;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Z")
    public boolean field2955 = false;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    private int field2957 = 0;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public int field2962 = 0;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "B")
    private byte field2956 = 0;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "B")
    private byte field2977 = 0;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "[I")
    private int[] field2976;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    public int[] field2940;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "[I")
    public int[] field2960;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "[I")
    public int[] field2973;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[I")
    private int[] field2951;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[S")
    private short[] field2975;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[S")
    private short[] field2942;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[S")
    private short[] field2952;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[S")
    private short[] field2947;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[F")
    private float[] field2943;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "[F")
    private float[] field2964;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[S")
    private short[] field2949;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[B")
    private byte[] field2939;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[S")
    private short[] field2948;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "[S")
    private short[] field2968;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "[S")
    private short[] field2946;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "[S")
    private short[] field2970;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "[B")
    private byte[] field2966;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lwf;")
    public class54 field2950;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Luk;")
    public class89 field2967;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Luk;")
    private class89 field2971;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Luk;")
    private class89 field2954;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Luk;")
    private class89 field2963;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Luk;")
    private class89 field2959;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "S")
    private short field2969;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "S")
    private short field2972;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "[S")
    private short[] field2974;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "[I")
    private int[] field2945;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Lwe;")
    private static class47 field2958 = new class47(10000);

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "Lmc;")
    private static class176 field2979 = new class176();

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Lmc;")
    private static class176 field2981 = new class176();

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lmc;")
    private static class176 field2982 = new class176();

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "Lmc;")
    private static class176 field2983 = new class176();

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "[I")
    private static int[] field2985 = new int[1];

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "[I")
    private static int[] field2993 = new int[1];

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "F")
    private static float field2984;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "F")
    private static float field2987;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "F")
    private static float field2989;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "F")
    private static float field2990;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "F")
    private static float field2992;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "F")
    private static float field2994;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    private static int field2986;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    private static int field2988;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "I")
    private static int field2991;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lc;")
    private class299 field2965;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lsg;")
    private class34 field2953;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2980;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[J")
    private static long[] field2961;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[[I")
    private int[][] field2944;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "[[I")
    private int[][] field2978;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()V", line = 8)
    public final void method1349() {
        for (int var1 = 0; var1 < this.field2962; var1++) {
            int var2 = this.field2973[var1];
            this.field2973[var1] = this.field2940[var1];
            this.field2940[var1] = -var2;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([SI)[S", line = 24)
    private static final short[] method1350(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class244.method1763(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(SS)V", line = 31)
    public final void method1351(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2941; var3++) {
            if (this.field2970[var3] == arg0) {
                this.field2970[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class109.field1747.method835(arg0 & 0xFFFF, true);
            var5 = class109.field1747.method828(-12560, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class109.field1747.method835(arg1 & 0xFFFF, true);
            var7 = class109.field1747.method828(-12560, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2971.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V", line = 65)
    private final void method1352(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2988 = 0;
            field2986 = 0;
            field2991 = 0;
            for (int var6 = 0; var6 < this.field2962; var6++) {
                field2988 += this.field2940[var6];
                field2986 += this.field2960[var6];
                field2991 += this.field2973[var6];
                var5++;
            }
            if (var5 > 0) {
                field2988 = field2988 / var5 + arg1;
                field2986 = field2986 / var5 + arg2;
                field2991 = field2991 / var5 + arg3;
            } else {
                field2988 = arg1;
                field2986 = arg2;
                field2991 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2962; var7++) {
                this.field2940[var7] += arg1;
                this.field2960[var7] += arg2;
                this.field2973[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2962; var8++) {
                this.field2940[var8] -= field2988;
                this.field2960[var8] -= field2986;
                this.field2973[var8] -= field2991;
                if (arg3 != 0) {
                    int var9 = class109.field1750[arg3];
                    int var10 = class109.field1757[arg3];
                    int var11 = this.field2960[var8] * var9 + this.field2940[var8] * var10 + 32767 >> 16;
                    this.field2960[var8] = this.field2960[var8] * var10 + 32767 - this.field2940[var8] * var9 >> 16;
                    this.field2940[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class109.field1750[arg1];
                    int var13 = class109.field1757[arg1];
                    int var14 = this.field2960[var8] * var13 + 32767 - this.field2973[var8] * var12 >> 16;
                    this.field2973[var8] = this.field2973[var8] * var13 + this.field2960[var8] * var12 + 32767 >> 16;
                    this.field2960[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class109.field1750[arg2];
                    int var16 = class109.field1757[arg2];
                    int var17 = this.field2973[var8] * var15 + this.field2940[var8] * var16 + 32767 >> 16;
                    this.field2973[var8] = this.field2973[var8] * var16 + 32767 - this.field2940[var8] * var15 >> 16;
                    this.field2940[var8] = var17;
                }
                this.field2940[var8] += field2988;
                this.field2960[var8] += field2986;
                this.field2973[var8] += field2991;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2962; var18++) {
                this.field2940[var18] -= field2988;
                this.field2960[var18] -= field2986;
                this.field2973[var18] -= field2991;
                this.field2940[var18] = this.field2940[var18] * arg1 / 128;
                this.field2960[var18] = this.field2960[var18] * arg2 / 128;
                this.field2973[var18] = this.field2973[var18] * arg3 / 128;
                this.field2940[var18] += field2988;
                this.field2960[var18] += field2986;
                this.field2973[var18] += field2991;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2941; var19++) {
                int var20 = (this.field2939[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2939[var19] = (byte) var20;
            }
            this.field2971.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "()V", line = 219)
    public static final void method1353() {
        field2979 = new class176();
        field2981 = new class176();
        field2982 = new class176();
        field2983 = new class176();
    }

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "()I", line = 225)
    public final int method1354() {
        return this.field2972;
    }

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "()V", line = 230)
    public final void method1355() {
        if (this.field2975 == null) {
            this.method1349();
            return;
        }
        for (int var1 = 0; var1 < this.field2962; var1++) {
            int var2 = this.field2973[var1];
            this.field2973[var1] = this.field2940[var1];
            this.field2940[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2957; var3++) {
            short var4 = this.field2952[var3];
            this.field2952[var3] = this.field2975[var3];
            this.field2975[var3] = (short) (-var4);
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()Z", line = 267)
    public final boolean method947() {
        return this.field2955 && this.field2940 != null && this.field2975 != null;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "()V", line = 273)
    public final void method1356() {
        for (int var1 = 0; var1 < this.field2962; var1++) {
            this.field2940[var1] = -this.field2940[var1];
            this.field2973[var1] = -this.field2973[var1];
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(III)V", line = 287)
    public final void method1357(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2962; var4++) {
            this.field2940[var4] = this.field2940[var4] * arg0 >> 7;
            this.field2960[var4] = this.field2960[var4] * arg1 >> 7;
            this.field2973[var4] = this.field2973[var4] * arg2 >> 7;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "()V", line = 300)
    public final void method1358() {
        int var10002;
        if (this.field2951 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2962; var3++) {
                int var4 = this.field2951[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2944 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2944[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2962) {
                int var7 = this.field2951[var6] & 0xFF;
                this.field2944[var7][var1[var7]++] = var6++;
            }
            this.field2951 = null;
        }
        if (this.field2966 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2941; var10++) {
            int var11 = this.field2966[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2978 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2978[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2941) {
            int var14 = this.field2966[var13] & 0xFF;
            this.field2978[var14][var8[var14]++] = var13++;
        }
        this.field2966 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()I", line = 394)
    public final int method325() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field976;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZLmc;Lmc;)Lfg;", line = 400)
    private final class208 method1359(boolean arg0, boolean arg1, class176 arg2, class176 arg3) {
        arg2.field2962 = this.field2962;
        arg2.field2957 = this.field2957;
        arg2.field2941 = this.field2941;
        arg2.field2969 = this.field2969;
        arg2.field2972 = this.field2972;
        arg2.field2956 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2940 == null || arg2.field2940.length < this.field2962) {
            arg2.field2940 = new int[this.field2962 + 100];
            arg2.field2960 = new int[this.field2962 + 100];
            arg2.field2973 = new int[this.field2962 + 100];
        }
        for (int var5 = 0; var5 < this.field2962; var5++) {
            arg2.field2940[var5] = this.field2940[var5];
            arg2.field2960[var5] = this.field2960[var5];
            arg2.field2973[var5] = this.field2973[var5];
        }
        if (arg2.field2967 == null) {
            arg2.field2967 = new class89();
        }
        arg2.field2967.field1419 = false;
        if (arg2.field2950 == null) {
            arg2.field2950 = new class54();
        }
        arg2.field2950.field974 = false;
        if (arg0) {
            arg2.field2939 = this.field2939;
            arg2.field2971 = this.field2971;
        } else {
            if (arg3.field2939 == null || arg3.field2939.length < this.field2941) {
                arg3.field2939 = new byte[this.field2941 + 100];
            }
            arg2.field2939 = arg3.field2939;
            for (int var6 = 0; var6 < this.field2941; var6++) {
                arg2.field2939[var6] = this.field2939[var6];
            }
            if (arg3.field2971 == null) {
                arg3.field2971 = new class89();
            }
            arg2.field2971 = arg3.field2971;
            arg2.field2971.field1419 = false;
        }
        if (arg1) {
            arg2.field2975 = this.field2975;
            arg2.field2942 = this.field2942;
            arg2.field2952 = this.field2952;
            arg2.field2947 = this.field2947;
            arg2.field2954 = this.field2954;
        } else {
            if (arg3.field2975 == null || arg3.field2975.length < this.field2957) {
                arg3.field2975 = new short[this.field2957 + 100];
                arg3.field2942 = new short[this.field2957 + 100];
                arg3.field2952 = new short[this.field2957 + 100];
                arg3.field2947 = new short[this.field2957 + 100];
            }
            arg2.field2975 = arg3.field2975;
            arg2.field2942 = arg3.field2942;
            arg2.field2952 = arg3.field2952;
            arg2.field2947 = arg3.field2947;
            for (int var7 = 0; var7 < this.field2957; var7++) {
                arg2.field2975[var7] = this.field2975[var7];
                arg2.field2942[var7] = this.field2942[var7];
                arg2.field2952[var7] = this.field2952[var7];
                arg2.field2947[var7] = this.field2947[var7];
            }
            if (class102.field1641) {
                if (arg3.field2954 == null) {
                    arg3.field2954 = new class89();
                }
                arg2.field2954 = arg3.field2954;
                arg2.field2954.field1419 = false;
            } else {
                arg2.field2954 = null;
            }
        }
        arg2.field2943 = this.field2943;
        arg2.field2964 = this.field2964;
        arg2.field2951 = this.field2951;
        arg2.field2944 = this.field2944;
        arg2.field2949 = this.field2949;
        arg2.field2948 = this.field2948;
        arg2.field2968 = this.field2968;
        arg2.field2946 = this.field2946;
        arg2.field2970 = this.field2970;
        arg2.field2966 = this.field2966;
        arg2.field2978 = this.field2978;
        arg2.field2963 = this.field2963;
        arg2.field2959 = this.field2959;
        arg2.field2945 = this.field2945;
        arg2.field2974 = this.field2974;
        arg2.field2976 = this.field2976;
        arg2.field3470 = this.field3470;
        return arg2;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()I", line = 526)
    public final int method1360() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field975;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 532)
    public final void method1361(int arg0) {
        this.field2969 = (short) arg0;
        this.field2971.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "()V", line = 537)
    public final void method1362() {
        if (this.field2975 == null) {
            this.method1356();
            return;
        }
        for (int var1 = 0; var1 < this.field2962; var1++) {
            this.field2940[var1] = -this.field2940[var1];
            this.field2973[var1] = -this.field2973[var1];
        }
        for (int var2 = 0; var2 < this.field2957; var2++) {
            this.field2975[var2] = (short) (-this.field2975[var2]);
            this.field2952[var2] = (short) (-this.field2952[var2]);
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII[FIF)V", line = 570)
    private static final void method1363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field2994 = var16;
        field2990 = var17;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ISIB)I", line = 614)
    private static final int method1364(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class109.field1746[class220.method1625(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class109.field1747.method835(arg1 & 0xFFFF, true);
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
            int var9 = class109.field1747.method828(-12560, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 3749)
    private class176() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lvd;IIZ)V", line = 3752)
    public class176(class130 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2194];
        this.field2976 = new int[arg0.field2176 + 1];
        for (int var6 = 0; var6 < arg0.field2194; var6++) {
            if ((arg0.field2192 == null || arg0.field2192[var6] != 2) && (arg0.field2190 == null || arg0.field2190[var6] == -1 || !class109.field1747.method837(arg0.field2190[var6] & 0xFFFF, (byte) -11))) {
                var5[this.field2941++] = var6;
                this.field2976[arg0.field2199[var6]]++;
                this.field2976[arg0.field2201[var6]]++;
                this.field2976[arg0.field2189[var6]]++;
            }
        }
        long[] var7 = new long[this.field2941];
        for (int var8 = 0; var8 < this.field2941; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2190 != null) {
                var14 = arg0.field2190[var9];
                if (var14 != -1) {
                    var12 = class109.field1747.method822(var14 & 0xFFFF, (byte) 102);
                    var13 = class109.field1747.method824(var14 & 0xFFFF, (byte) 5);
                }
            }
            boolean var15 = arg0.field2181 != null && arg0.field2181[var9] != 0 || var14 != -1 && !class109.field1747.method817(var14 & 0xFFFF, -2);
            if ((arg3 || var15) && arg0.field2185 != null) {
                var10 += arg0.field2185[var9] << 17;
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
        class92.method631(var7, var5, 128);
        this.field2962 = arg0.field2176;
        this.field2940 = arg0.field2191;
        this.field2960 = arg0.field2180;
        this.field2973 = arg0.field2172;
        this.field2951 = arg0.field2183;
        int var20 = this.field2941 * 3;
        this.field2975 = new short[var20];
        this.field2942 = new short[var20];
        this.field2952 = new short[var20];
        this.field2947 = new short[var20];
        this.field2943 = new float[var20];
        this.field2964 = new float[var20];
        this.field2949 = new short[this.field2941];
        this.field2939 = new byte[this.field2941];
        this.field2948 = new short[this.field2941];
        this.field2968 = new short[this.field2941];
        this.field2946 = new short[this.field2941];
        this.field2970 = new short[this.field2941];
        if (arg0.field2212 != null) {
            this.field2966 = new byte[this.field2941];
        }
        this.field2950 = new class54();
        this.field2967 = new class89();
        this.field2971 = new class89();
        if (class102.field1641) {
            this.field2954 = new class89();
        }
        this.field2963 = new class89();
        this.field2959 = new class89();
        this.field2969 = (short) arg1;
        this.field2972 = (short) arg2;
        this.field2974 = new short[var20];
        field2961 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2176; var22++) {
            int var23 = this.field2976[var22];
            this.field2976[var22] = var21;
            var21 += var23;
        }
        this.field2976[arg0.field2176] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2219 != null) {
            int var28 = arg0.field2220;
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
            for (int var36 = 0; var36 < this.field2941; var36++) {
                int var37 = var5[var36];
                if (arg0.field2219[var37] != -1) {
                    int var38 = arg0.field2219[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2199[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2201[var37];
                        } else {
                            var40 = arg0.field2189[var37];
                        }
                        int var41 = arg0.field2191[var40];
                        int var42 = arg0.field2180[var40];
                        int var43 = arg0.field2172[var40];
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
                byte var45 = arg0.field2196[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2204[var44];
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
                        var49 = 64.0F / (float) (arg0.field2177[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2204[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2177[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2215[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2204[var44] / 1024.0F;
                        var49 = (float) arg0.field2177[var44] / 1024.0F;
                        var48 = (float) arg0.field2215[var44] / 1024.0F;
                    }
                    var27[var44] = method1369(arg0.field2187[var44], arg0.field2182[var44], arg0.field2202[var44], arg0.field2197[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2941; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2186[var51] & 0xFFFF;
            short var53;
            if (arg0.field2190 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2190[var51];
            }
            int var54;
            if (arg0.field2219 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2219[var51];
            }
            int var55;
            if (arg0.field2181 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2181[var51] & 0xFF;
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
                    byte var65 = arg0.field2196[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2199[var51];
                        int var67 = arg0.field2201[var51];
                        int var68 = arg0.field2189[var51];
                        short var69 = arg0.field2187[var54];
                        short var70 = arg0.field2182[var54];
                        short var71 = arg0.field2202[var54];
                        float var72 = (float) arg0.field2191[var69];
                        float var73 = (float) arg0.field2180[var69];
                        float var74 = (float) arg0.field2172[var69];
                        float var75 = (float) arg0.field2191[var70] - var72;
                        float var76 = (float) arg0.field2180[var70] - var73;
                        float var77 = (float) arg0.field2172[var70] - var74;
                        float var78 = (float) arg0.field2191[var71] - var72;
                        float var79 = (float) arg0.field2180[var71] - var73;
                        float var80 = (float) arg0.field2172[var71] - var74;
                        float var81 = (float) arg0.field2191[var66] - var72;
                        float var82 = (float) arg0.field2180[var66] - var73;
                        float var83 = (float) arg0.field2172[var66] - var74;
                        float var84 = (float) arg0.field2191[var67] - var72;
                        float var85 = (float) arg0.field2180[var67] - var73;
                        float var86 = (float) arg0.field2172[var67] - var74;
                        float var87 = (float) arg0.field2191[var68] - var72;
                        float var88 = (float) arg0.field2180[var68] - var73;
                        float var89 = (float) arg0.field2172[var68] - var74;
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
                        int var101 = arg0.field2199[var51];
                        int var102 = arg0.field2201[var51];
                        int var103 = arg0.field2189[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2193[var54];
                        float var109 = (float) arg0.field2184[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2215[var54] & 0xFFFF) / 1024.0F;
                            method1397(arg0.field2191[var101], arg0.field2180[var101], arg0.field2172[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2984;
                            var57 = field2987;
                            method1397(arg0.field2191[var102], arg0.field2180[var102], arg0.field2172[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2984;
                            var59 = field2987;
                            method1397(arg0.field2191[var103], arg0.field2180[var103], arg0.field2172[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2984;
                            var61 = field2987;
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
                            float var112 = (float) arg0.field2207[var54] / 256.0F;
                            float var113 = (float) arg0.field2173[var54] / 256.0F;
                            int var114 = arg0.field2191[var102] - arg0.field2191[var101];
                            int var115 = arg0.field2180[var102] - arg0.field2180[var101];
                            int var116 = arg0.field2172[var102] - arg0.field2172[var101];
                            int var117 = arg0.field2191[var103] - arg0.field2191[var101];
                            int var118 = arg0.field2180[var103] - arg0.field2180[var101];
                            int var119 = arg0.field2172[var103] - arg0.field2172[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2204[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2177[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2215[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1402(var126, var127, var128);
                            method1387(arg0.field2191[var101], arg0.field2180[var101], arg0.field2172[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2989;
                            var57 = field2992;
                            method1387(arg0.field2191[var102], arg0.field2180[var102], arg0.field2172[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2989;
                            var59 = field2992;
                            method1387(arg0.field2191[var103], arg0.field2180[var103], arg0.field2172[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2989;
                            var61 = field2992;
                        } else if (var65 == 3) {
                            method1363(arg0.field2191[var101], arg0.field2180[var101], arg0.field2172[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2994;
                            var57 = field2990;
                            method1363(arg0.field2191[var102], arg0.field2180[var102], arg0.field2172[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2994;
                            var59 = field2990;
                            method1363(arg0.field2191[var103], arg0.field2180[var103], arg0.field2172[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2994;
                            var61 = field2990;
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
            arg0.method960();
            byte var129;
            if (arg0.field2192 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2192[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2199[var51];
                class306 var133 = arg0.field2209[var132];
                this.field2948[var50] = this.method1395(arg0, var132, var130, var133.field5235, var133.field5231, var133.field5240, var133.field5241, var56, var57);
                int var134 = arg0.field2201[var51];
                class306 var135 = arg0.field2209[var134];
                this.field2968[var50] = this.method1395(arg0, var134, (long) var62 + var130, var135.field5235, var135.field5231, var135.field5240, var135.field5241, var58, var59);
                int var136 = arg0.field2189[var51];
                class306 var137 = arg0.field2209[var136];
                this.field2946[var50] = this.method1395(arg0, var136, (long) var63 + var130, var137.field5235, var137.field5231, var137.field5240, var137.field5241, var60, var61);
            } else if (var129 == 1) {
                class81 var138 = arg0.field2214[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1302 > 0 ? 1024 : 2048) + (var138.field1301 + 256 << 12) + (var138.field1295 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2948[var50] = this.method1395(arg0, arg0.field2199[var51], var139, var138.field1302, var138.field1301, var138.field1295, 0, var56, var57);
                this.field2968[var50] = this.method1395(arg0, arg0.field2201[var51], (long) var62 + var139, var138.field1302, var138.field1301, var138.field1295, 0, var58, var59);
                this.field2946[var50] = this.method1395(arg0, arg0.field2189[var51], (long) var63 + var139, var138.field1302, var138.field1301, var138.field1295, 0, var60, var61);
            }
            if (arg0.field2190 == null) {
                this.field2970[var50] = -1;
            } else {
                this.field2970[var50] = arg0.field2190[var51];
            }
            if (this.field2966 != null) {
                this.field2966[var50] = (byte) arg0.field2212[var51];
            }
            this.field2949[var50] = arg0.field2186[var51];
            if (arg0.field2181 != null) {
                this.field2939[var50] = arg0.field2181[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2941; var143++) {
            short var144 = this.field2970[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2945 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2941; var147++) {
            short var148 = this.field2970[var147];
            if (var146 != var148) {
                this.field2945[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2945[var145] = this.field2941;
        field2961 = null;
        this.field2975 = method1350(this.field2975, this.field2957);
        this.field2942 = method1350(this.field2942, this.field2957);
        this.field2952 = method1350(this.field2952, this.field2957);
        this.field2947 = method1350(this.field2947, this.field2957);
        this.field2943 = method1385(this.field2943, this.field2957);
        this.field2964 = method1385(this.field2964, this.field2957);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 680)
    public final void method1365(int arg0) {
        int var2 = class109.field1750[arg0];
        int var3 = class109.field1757[arg0];
        for (int var4 = 0; var4 < this.field2962; var4++) {
            int var5 = this.field2960[var4] * var3 - this.field2973[var4] * var2 >> 16;
            this.field2973[var4] = this.field2973[var4] * var3 + this.field2960[var4] * var2 >> 16;
            this.field2960[var4] = var5;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIJILmk;)V", line = 699)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10) {
        if (this.field2957 == 0) {
            return;
        }
        if (!this.field2950.field974) {
            this.method1394();
        }
        short var13 = this.field2950.field972;
        short var14 = this.field2950.field976;
        short var15 = this.field2950.field971;
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
        if (var21 / var18 <= class120.field1970) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class167.field2822) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class137.field2281) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class148.field2512) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class109.field1750[arg0];
            var27 = class109.field1757[arg0];
        }
        if (arg8 > 0L && class9.field186 && var19 > 0) {
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
            if (class202.field3369 >= var28 && class202.field3369 <= var29 && class199.field3319 >= var30 && class199.field3319 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2950.field975;
                short var37 = this.field2950.field970;
                short var38 = this.field2950.field977;
                short var39 = this.field2950.field973;
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
                if (class202.field3369 >= var32 && class202.field3369 <= var33 && class199.field3319 >= var34 && class199.field3319 <= var35) {
                    if (this.field3470) {
                        class140.field2334[class199.field3334++] = arg8;
                    } else {
                        if (field2993.length < this.field2957) {
                            field2993 = new int[this.field2957];
                            field2985 = new int[this.field2957];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2962) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2941) {
                                        break label118;
                                    }
                                    short var80 = this.field2948[var79];
                                    short var81 = this.field2968[var79];
                                    short var82 = this.field2946[var79];
                                    if (this.method1396(class202.field3369, class199.field3319, field2985[var80], field2985[var81], field2985[var82], field2993[var80], field2993[var81], field2993[var82])) {
                                        class140.field2334[class199.field3334++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2940[var59];
                            int var61 = this.field2960[var59];
                            int var62 = this.field2973[var59];
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
                            int var75 = this.field2976[var59];
                            int var76 = this.field2976[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2974[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2993[var78] = var73;
                                field2985[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class271.field4641;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1383();
        var83.glRotatef((float) (-arg0) * 0.17578125F, 0.0F, 1.0F, 0.0F);
        var83.glTranslatef((float) (-arg5), (float) (-arg6), (float) (-arg7));
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V", line = 974)
    public final void method1366(int arg0) {
        this.field2972 = (short) arg0;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)Lfg;", line = 982)
    public final class208 method1367(boolean arg0, boolean arg1) {
        return this.method1359(arg0, arg1, field2983, field2982);
    }

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "()V", line = 990)
    private final void method1368() {
        if (field2958.field860.length < this.field2957 * 12) {
            field2958 = new class47((this.field2957 + 100) * 12);
        } else {
            field2958.field857 = 0;
        }
        if (class271.field4657) {
            for (int var1 = 0; var1 < this.field2941; var1++) {
                field2958.method387(this.field2948[var1], 85);
                field2958.method387(this.field2968[var1], 107);
                field2958.method387(this.field2946[var1], 125);
            }
        } else {
            for (int var2 = 0; var2 < this.field2941; var2++) {
                field2958.method382((byte) 1, this.field2948[var2]);
                field2958.method382((byte) 1, this.field2968[var2]);
                field2958.method382((byte) 1, this.field2946[var2]);
            }
        }
        if (!class271.field4634) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2958.field857);
            var5.put(field2958.field860, 0, field2958.field857);
            var5.flip();
            this.field2959.field1419 = true;
            this.field2959.field1415 = var5;
            this.field2959.field1417 = null;
            return;
        }
        class34 var3 = new class34();
        ByteBuffer var4 = ByteBuffer.wrap(field2958.field860, 0, field2958.field857);
        var3.method244(var4);
        this.field2959.field1419 = true;
        this.field2959.field1415 = null;
        this.field2959.field1417 = var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIFFF)[F", line = 1049)
    private static final float[] method1369(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V", line = 1122)
    public final void method1370(int arg0) {
        if (this.field2975 == null) {
            this.method1398(arg0);
            return;
        }
        int var2 = class109.field1750[arg0];
        int var3 = class109.field1757[arg0];
        for (int var4 = 0; var4 < this.field2962; var4++) {
            int var5 = this.field2973[var4] * var2 + this.field2940[var4] * var3 >> 16;
            this.field2973[var4] = this.field2973[var4] * var3 - this.field2940[var4] * var2 >> 16;
            this.field2940[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2957; var6++) {
            int var7 = this.field2975[var6] * var3 + this.field2952[var6] * var2 >> 16;
            this.field2952[var6] = (short) (this.field2952[var6] * var3 - this.field2975[var6] * var2 >> 16);
            this.field2975[var6] = (short) var7;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "()V", line = 1163)
    public final void method1371() {
        if (this.field2975 == null) {
            this.method1386();
            return;
        }
        for (int var1 = 0; var1 < this.field2962; var1++) {
            int var2 = this.field2940[var1];
            this.field2940[var1] = this.field2973[var1];
            this.field2973[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2957; var3++) {
            short var4 = this.field2975[var3];
            this.field2975[var3] = this.field2952[var3];
            this.field2952[var3] = (short) (-var4);
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "()I", line = 1203)
    public final int method1372() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field977;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V", line = 1210)
    public final void method1373(int arg0) {
        int var2 = class109.field1750[arg0];
        int var3 = class109.field1757[arg0];
        for (int var4 = 0; var4 < this.field2962; var4++) {
            int var5 = this.field2960[var4] * var2 + this.field2940[var4] * var3 >> 16;
            this.field2960[var4] = this.field2960[var4] * var3 - this.field2940[var4] * var2 >> 16;
            this.field2940[var4] = var5;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V", line = 1235)
    public final void method1374(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2962; var4++) {
            this.field2940[var4] += arg0;
            this.field2960[var4] += arg1;
            this.field2973[var4] += arg2;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkd;IZ)V", line = 1253)
    public final void method1375(class72 arg0, int arg1, boolean arg2) {
        if (this.field2944 == null || arg1 == -1) {
            return;
        }
        class291 var4 = arg0.field1180[arg1];
        class230 var5 = var4.field4952;
        for (int var6 = 0; var6 < this.field2962; var6++) {
            this.field2940[var6] <<= 0x4;
            this.field2960[var6] <<= 0x4;
            this.field2973[var6] <<= 0x4;
        }
        field2988 = 0;
        field2986 = 0;
        field2991 = 0;
        for (int var7 = 0; var7 < var4.field4961; var7++) {
            short var8 = var4.field4957[var7];
            if (var4.field4960[var7] != -1) {
                this.method1401(0, var5.field3849[var4.field4960[var7]], 0, 0, 0, arg2);
            }
            this.method1401(var5.field3844[var8], var5.field3849[var8], var4.field4959[var7], var4.field4955[var7], var4.field4949[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2962; var9++) {
            this.field2940[var9] >>= 0x4;
            this.field2960[var9] >>= 0x4;
            this.field2973[var9] >>= 0x4;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkd;I)V", line = 1306)
    public final void method1376(class72 arg0, int arg1) {
        if (this.field2944 == null || arg1 == -1) {
            return;
        }
        class291 var3 = arg0.field1180[arg1];
        class230 var4 = var3.field4952;
        field2988 = 0;
        field2986 = 0;
        field2991 = 0;
        for (int var5 = 0; var5 < var3.field4961; var5++) {
            short var6 = var3.field4957[var5];
            if (var4.field3851[var6]) {
                if (var3.field4960[var5] != -1) {
                    this.method1352(0, 0, 0, 0);
                }
                this.method1352(var4.field3844[var6], var3.field4959[var5], var3.field4955[var5], var3.field4949[var5]);
            }
        }
        this.field2967.field1419 = false;
        this.field2950.field974 = false;
    }

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "()V", line = 1341)
    public static void method1377() {
        field2961 = null;
        field2958 = null;
        field2980 = null;
        field2979 = null;
        field2981 = null;
        field2982 = null;
        field2983 = null;
        field2993 = null;
        field2985 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lbf;", line = 1352)
    public final class322 method950(int arg0, int arg1, int arg2) {
        this.field2955 = false;
        if (this.field2965 != null) {
            this.field2975 = this.field2965.field5072;
            this.field2942 = this.field2965.field5073;
            this.field2952 = this.field2965.field5070;
            this.field2947 = this.field2965.field5071;
            this.field2965 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZZZZ)V", line = 1366)
    private final void method1378(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2967.field1414 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2971.field1414 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2954.field1414 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2963.field1414 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2958.field860.length < this.field2957 * var6) {
            field2958 = new class47((this.field2957 + 100) * var6);
        } else {
            field2958.field857 = 0;
        }
        if (arg1) {
            if (class271.field4657) {
                for (int var7 = 0; var7 < this.field2962; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2940[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2960[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2973[var7]);
                    int var11 = this.field2976[var7];
                    int var12 = this.field2976[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2974[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2958.field857 = var6 * var14;
                        field2958.method387(var8, 77);
                        field2958.method387(var9, 92);
                        field2958.method387(var10, 126);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2962; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2940[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2960[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2973[var15]);
                    int var19 = this.field2976[var15];
                    int var20 = this.field2976[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2974[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2958.field857 = var6 * var22;
                        field2958.method382((byte) 1, var16);
                        field2958.method382((byte) 1, var17);
                        field2958.method382((byte) 1, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class102.field1641) {
                for (int var42 = 0; var42 < this.field2941; var42++) {
                    int var43 = method1364(this.field2949[var42], this.field2970[var42], this.field2969, this.field2939[var42]);
                    field2958.field857 = this.field2948[var42] * var6 + this.field2971.field1414;
                    field2958.method387(var43, 90);
                    field2958.field857 = this.field2968[var42] * var6 + this.field2971.field1414;
                    field2958.method387(var43, 103);
                    field2958.field857 = this.field2946[var42] * var6 + this.field2971.field1414;
                    field2958.method387(var43, 102);
                }
            } else {
                int var23 = (int) class231.field3866[0];
                int var24 = (int) class231.field3866[1];
                int var25 = (int) class231.field3866[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2969 * 1.3F);
                int var28 = this.field2972 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2941; var29++) {
                    short var30 = this.field2948[var29];
                    short var31 = this.field2947[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2952[var30] * var25 + this.field2975[var30] * var23 + this.field2942[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2952[var30] * var25 + this.field2975[var30] * var23 + this.field2942[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2947[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2968[var29];
                    short var34 = this.field2947[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2952[var33] * var25 + this.field2975[var33] * var23 + this.field2942[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2952[var33] * var25 + this.field2975[var33] * var23 + this.field2942[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2947[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2946[var29];
                    short var37 = this.field2947[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2952[var36] * var25 + this.field2975[var36] * var23 + this.field2942[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2952[var36] * var25 + this.field2975[var36] * var23 + this.field2942[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2947[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1364(this.field2949[var29], this.field2970[var29], var32, this.field2939[var29]);
                    int var40 = method1364(this.field2949[var29], this.field2970[var29], var35, this.field2939[var29]);
                    int var41 = method1364(this.field2949[var29], this.field2970[var29], var38, this.field2939[var29]);
                    field2958.field857 = var6 * var30 + this.field2971.field1414;
                    field2958.method387(var39, 81);
                    field2958.field857 = var6 * var33 + this.field2971.field1414;
                    field2958.method387(var40, 120);
                    field2958.field857 = var6 * var36 + this.field2971.field1414;
                    field2958.method387(var41, 112);
                }
                this.field2975 = null;
                this.field2942 = null;
                this.field2952 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2972;
            float var45 = 3.0F / (float) (this.field2972 / 2 + this.field2972);
            field2958.field857 = this.field2954.field1414;
            if (class271.field4657) {
                for (int var46 = 0; var46 < this.field2957; var46++) {
                    short var47 = this.field2947[var46];
                    if (var47 == 0) {
                        field2958.method384((byte) 108, (float) this.field2975[var46] * var45);
                        field2958.method384((byte) 108, (float) this.field2942[var46] * var45);
                        field2958.method384((byte) 108, (float) this.field2952[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2958.method384((byte) 108, (float) this.field2975[var46] * var48);
                        field2958.method384((byte) 108, (float) this.field2942[var46] * var48);
                        field2958.method384((byte) 108, (float) this.field2952[var46] * var48);
                    }
                    field2958.field857 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2957; var49++) {
                    short var50 = this.field2947[var49];
                    if (var50 == 0) {
                        field2958.method340((float) this.field2975[var49] * var45, -1489617032);
                        field2958.method340((float) this.field2942[var49] * var45, -1489617032);
                        field2958.method340((float) this.field2952[var49] * var45, -1489617032);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2958.method340((float) this.field2975[var49] * var51, -1489617032);
                        field2958.method340((float) this.field2942[var49] * var51, -1489617032);
                        field2958.method340((float) this.field2952[var49] * var51, -1489617032);
                    }
                    field2958.field857 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2958.field857 = this.field2963.field1414;
            if (class271.field4657) {
                for (int var52 = 0; var52 < this.field2957; var52++) {
                    field2958.method384((byte) 108, this.field2943[var52]);
                    field2958.method384((byte) 108, this.field2964[var52]);
                    field2958.field857 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2957; var53++) {
                    field2958.method340(this.field2943[var53], -1489617032);
                    field2958.method340(this.field2964[var53], -1489617032);
                    field2958.field857 += var6 - 8;
                }
            }
        }
        field2958.field857 = this.field2957 * var6;
        if (arg0) {
            if (class271.field4630) {
                ByteBuffer var54 = ByteBuffer.wrap(field2958.field860, 0, field2958.field857);
                if (this.field2953 == null) {
                    this.field2953 = new class34(true);
                    this.field2953.method244(var54);
                } else {
                    this.field2953.method247(var54);
                }
                if (arg1) {
                    this.field2967.field1419 = true;
                    this.field2967.field1415 = null;
                    this.field2967.field1417 = this.field2953;
                    this.field2967.field1420 = var6;
                }
                if (arg2) {
                    this.field2971.field1419 = true;
                    this.field2971.field1415 = null;
                    this.field2971.field1417 = this.field2953;
                    this.field2971.field1420 = var6;
                }
                if (arg3) {
                    this.field2954.field1419 = true;
                    this.field2954.field1415 = null;
                    this.field2954.field1417 = this.field2953;
                    this.field2954.field1420 = var6;
                }
                if (arg4) {
                    this.field2963.field1419 = true;
                    this.field2963.field1415 = null;
                    this.field2963.field1417 = this.field2953;
                    this.field2963.field1420 = var6;
                }
            } else {
                if (field2980 == null || field2980.capacity() < field2958.field857) {
                    field2980 = ByteBuffer.allocateDirect(var6 * 100 + field2958.field857);
                } else {
                    field2980.clear();
                }
                field2980.put(field2958.field860, 0, field2958.field857);
                field2980.flip();
                if (arg1) {
                    this.field2967.field1419 = true;
                    this.field2967.field1415 = field2980;
                    this.field2967.field1417 = null;
                    this.field2967.field1420 = var6;
                }
                if (arg2) {
                    this.field2971.field1419 = true;
                    this.field2971.field1415 = field2980;
                    this.field2967.field1417 = null;
                    this.field2971.field1420 = var6;
                }
                if (arg3) {
                    this.field2954.field1419 = true;
                    this.field2954.field1415 = field2980;
                    this.field2954.field1417 = null;
                    this.field2954.field1420 = var6;
                }
                if (arg4) {
                    this.field2963.field1419 = true;
                    this.field2963.field1415 = field2980;
                    this.field2963.field1417 = null;
                    this.field2963.field1420 = var6;
                }
            }
        } else if (class271.field4634) {
            class34 var55 = new class34();
            ByteBuffer var56 = ByteBuffer.wrap(field2958.field860, 0, field2958.field857);
            var55.method244(var56);
            if (arg1) {
                this.field2967.field1419 = true;
                this.field2967.field1415 = null;
                this.field2967.field1417 = var55;
                this.field2967.field1420 = var6;
            }
            if (arg2) {
                this.field2971.field1419 = true;
                this.field2971.field1415 = null;
                this.field2971.field1417 = var55;
                this.field2971.field1420 = var6;
            }
            if (arg3) {
                this.field2954.field1419 = true;
                this.field2954.field1415 = null;
                this.field2954.field1417 = var55;
                this.field2954.field1420 = var6;
            }
            if (arg4) {
                this.field2963.field1419 = true;
                this.field2963.field1415 = null;
                this.field2963.field1417 = var55;
                this.field2963.field1420 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2958.field857);
            var57.put(field2958.field860, 0, field2958.field857);
            var57.flip();
            if (arg1) {
                this.field2967.field1419 = true;
                this.field2967.field1415 = var57;
                this.field2967.field1417 = null;
                this.field2967.field1420 = var6;
            }
            if (arg2) {
                this.field2971.field1419 = true;
                this.field2971.field1415 = var57;
                this.field2967.field1417 = null;
                this.field2971.field1420 = var6;
            }
            if (arg3) {
                this.field2954.field1419 = true;
                this.field2954.field1415 = var57;
                this.field2954.field1417 = null;
                this.field2954.field1420 = var6;
            }
            if (arg4) {
                this.field2963.field1419 = true;
                this.field2963.field1415 = var57;
                this.field2963.field1417 = null;
                this.field2963.field1420 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILmc;[[I[[IIII)V", line = 1894)
    public final void method1379(int arg0, int arg1, class176 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2950.field974) {
            arg2.method1394();
        }
        int var9 = arg2.field2950.field975 + arg5;
        int var10 = arg2.field2950.field970 + arg5;
        int var11 = arg2.field2950.field977 + arg7;
        int var12 = arg2.field2950.field973 + arg7;
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
            for (int var17 = 0; var17 < this.field2962; var17++) {
                int var18 = this.field2940[var17] + arg5;
                int var19 = this.field2973[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2960[var17] = this.field2960[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2950.field976;
            for (int var28 = 0; var28 < this.field2962; var28++) {
                int var29 = (this.field2960[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2940[var28] + arg5;
                    int var31 = this.field2973[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2960[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1576(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2950.field971 - arg2.field2950.field976;
            for (int var42 = 0; var42 < this.field2962; var42++) {
                int var43 = this.field2940[var42] + arg5;
                int var44 = this.field2973[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2960[var42] = var51 + this.field2960[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2950.field971 - arg2.field2950.field976;
            for (int var53 = 0; var53 < this.field2962; var53++) {
                int var54 = this.field2940[var53] + arg5;
                int var55 = this.field2973[var53] + arg7;
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
                this.field2960[var53] = ((this.field2960[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2967.field1419 = false;
        this.field2950.field974 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIJ)V", line = 2091)
    public final void method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2957 == 0) {
            return;
        }
        GL var10 = class271.field4641;
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
        this.method1383();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lan;)Lan;", line = 2114)
    public final class315 method1381(class315 arg0) {
        if (this.field2957 == 0) {
            return null;
        }
        if (!this.field2950.field974) {
            this.method1394();
        }
        int var2;
        int var3;
        if (class231.field3855 > 0) {
            var2 = this.field2950.field975 - (class231.field3855 * this.field2950.field971 >> 8) >> 3;
            var3 = this.field2950.field970 - (class231.field3855 * this.field2950.field976 >> 8) >> 3;
        } else {
            var2 = this.field2950.field975 - (class231.field3855 * this.field2950.field976 >> 8) >> 3;
            var3 = this.field2950.field970 - (class231.field3855 * this.field2950.field971 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class231.field3860 > 0) {
            var4 = this.field2950.field977 - (class231.field3860 * this.field2950.field971 >> 8) >> 3;
            var5 = this.field2950.field973 - (class231.field3860 * this.field2950.field976 >> 8) >> 3;
        } else {
            var4 = this.field2950.field977 - (class231.field3860 * this.field2950.field976 >> 8) >> 3;
            var5 = this.field2950.field973 - (class231.field3860 * this.field2950.field971 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class315 var8;
        if (arg0 == null || arg0.field5355.length < var6 * var7) {
            var8 = new class315(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field482 = arg0.field480 = var6;
            arg0.field488 = arg0.field485 = var7;
            arg0.method2204();
        }
        var8.field486 = var2;
        var8.field490 = var4;
        if (field2993.length < this.field2957) {
            field2993 = new int[this.field2957];
            field2985 = new int[this.field2957];
        }
        for (int var9 = 0; var9 < this.field2962; var9++) {
            int var10 = (this.field2940[var9] - (this.field2960[var9] * class231.field3855 >> 8) >> 3) - var2;
            int var11 = (this.field2973[var9] - (this.field2960[var9] * class231.field3860 >> 8) >> 3) - var4;
            int var12 = this.field2976[var9];
            int var13 = this.field2976[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2974[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2993[var15] = var10;
                field2985[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2941; var16++) {
            if (this.field2939[var16] <= 128) {
                short var17 = this.field2948[var16];
                short var18 = this.field2968[var16];
                short var19 = this.field2946[var16];
                int var20 = field2993[var17];
                int var21 = field2993[var18];
                int var22 = field2993[var19];
                int var23 = field2985[var17];
                int var24 = field2985[var18];
                int var25 = field2985[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class109.method731(var8.field5355, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "()I", line = 2237)
    public final int method1382() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field970;
    }

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "()V", line = 2245)
    private final void method1383() {
        GL var1 = class271.field4641;
        if (this.field2941 == 0) {
            return;
        }
        if (this.field2956 != 0) {
            this.method1378(true, !this.field2967.field1419 && (this.field2956 & 0x1) != 0, !this.field2971.field1419 && (this.field2956 & 0x2) != 0, this.field2954 != null && !this.field2954.field1419 && (this.field2956 & 0x4) != 0, false);
        }
        this.method1378(false, !this.field2967.field1419, !this.field2971.field1419, this.field2954 != null && !this.field2954.field1419, !this.field2963.field1419);
        if (!this.field2959.field1419) {
            this.method1368();
        }
        if (this.field2977 != 0) {
            if ((this.field2977 & 0x1) != 0) {
                this.field2940 = null;
                this.field2960 = null;
                this.field2973 = null;
                this.field2974 = null;
                this.field2976 = null;
            }
            if ((this.field2977 & 0x2) != 0) {
                this.field2949 = null;
                this.field2939 = null;
            }
            if ((this.field2977 & 0x4) != 0) {
                this.field2975 = null;
                this.field2942 = null;
                this.field2952 = null;
                this.field2947 = null;
            }
            if ((this.field2977 & 0x8) != 0) {
                this.field2943 = null;
                this.field2964 = null;
            }
            if ((this.field2977 & 0x10) != 0) {
                this.field2948 = null;
                this.field2968 = null;
                this.field2946 = null;
            }
            this.field2977 = 0;
        }
        class34 var2 = null;
        if (this.field2967.field1417 != null) {
            this.field2967.field1417.method246();
            var2 = this.field2967.field1417;
            var1.glVertexPointer(3, 5126, this.field2967.field1420, (long) this.field2967.field1414);
        }
        if (this.field2971.field1417 != null) {
            if (this.field2971.field1417 != var2) {
                this.field2971.field1417.method246();
                var2 = this.field2971.field1417;
            }
            var1.glColorPointer(4, 5121, this.field2971.field1420, (long) this.field2971.field1414);
        }
        if (class102.field1641 && this.field2954.field1417 != null) {
            if (this.field2954.field1417 != var2) {
                this.field2954.field1417.method246();
                var2 = this.field2954.field1417;
            }
            var1.glNormalPointer(5126, this.field2954.field1420, (long) this.field2954.field1414);
        }
        if (this.field2963.field1417 != null) {
            if (this.field2963.field1417 != var2) {
                this.field2963.field1417.method246();
                class34 var3 = this.field2963.field1417;
            }
            var1.glTexCoordPointer(2, 5126, this.field2963.field1420, (long) this.field2963.field1414);
        }
        if (this.field2959.field1417 != null) {
            this.field2959.field1417.method248();
        }
        if (this.field2967.field1417 == null || this.field2971.field1417 == null || class102.field1641 && this.field2954.field1417 == null || this.field2963.field1417 == null) {
            if (class271.field4634) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2967.field1417 == null) {
                this.field2967.field1415.position(this.field2967.field1414);
                var1.glVertexPointer(3, 5126, this.field2967.field1420, this.field2967.field1415);
            }
            if (this.field2971.field1417 == null) {
                this.field2971.field1415.position(this.field2971.field1414);
                var1.glColorPointer(4, 5121, this.field2971.field1420, this.field2971.field1415);
            }
            if (class102.field1641 && this.field2954.field1417 == null) {
                this.field2954.field1415.position(this.field2954.field1414);
                var1.glNormalPointer(5126, this.field2954.field1420, this.field2954.field1415);
            }
            if (this.field2963.field1417 == null) {
                this.field2963.field1415.position(this.field2963.field1414);
                var1.glTexCoordPointer(2, 5126, this.field2963.field1420, this.field2963.field1415);
            }
        }
        if (this.field2959.field1417 == null && class271.field4634) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2945.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2945[var5];
            int var7 = this.field2945[var5 + 1];
            short var8 = this.field2970[var6];
            if (var8 == -1) {
                class271.method1978(-1);
                class140.method1033(0, 0, -5);
            } else {
                class109.field1747.method830(var8 & 0xFFFF, (byte) -72);
            }
            if (this.field2959.field1417 == null) {
                this.field2959.field1415.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2959.field1415);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(SS)V", line = 2421)
    public final void method1384(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2941; var3++) {
            if (this.field2949[var3] == arg0) {
                this.field2949[var3] = arg1;
            }
        }
        this.field2971.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lbf;IIIZ)V", line = 2439)
    public final void method945(class322 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class176 var6 = (class176) arg0;
        if (this.field2941 == 0 || var6.field2941 == 0) {
            return;
        }
        int var7 = var6.field2962;
        int[] var8 = var6.field2940;
        int[] var9 = var6.field2960;
        int[] var10 = var6.field2973;
        short[] var11 = var6.field2975;
        short[] var12 = var6.field2942;
        short[] var13 = var6.field2952;
        short[] var14 = var6.field2947;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2965 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2965.field5072;
            var16 = this.field2965.field5073;
            var17 = this.field2965.field5070;
            var18 = this.field2965.field5071;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2965 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2965.field5072;
            var20 = var6.field2965.field5073;
            var21 = var6.field2965.field5070;
            var22 = var6.field2965.field5071;
        }
        int[] var23 = var6.field2976;
        short[] var24 = var6.field2974;
        if (!var6.field2950.field974) {
            var6.method1394();
        }
        short var25 = var6.field2950.field976;
        short var26 = var6.field2950.field971;
        short var27 = var6.field2950.field975;
        short var28 = var6.field2950.field970;
        short var29 = var6.field2950.field977;
        short var30 = var6.field2950.field973;
        for (int var31 = 0; var31 < this.field2962; var31++) {
            int var32 = this.field2960[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2940[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2973[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2976[var31];
                        int var37 = this.field2976[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2974[var38] - 1;
                            if (var35 == -1 || this.field2947[var35] != 0) {
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
                                            this.field2965 = new class299();
                                            var15 = this.field2965.field5072 = class164.method1281(this.field2975, (byte) -69);
                                            var16 = this.field2965.field5073 = class164.method1281(this.field2942, (byte) -69);
                                            var17 = this.field2965.field5070 = class164.method1281(this.field2952, (byte) -69);
                                            var18 = this.field2965.field5071 = class164.method1281(this.field2947, (byte) -69);
                                        }
                                        if (var19 == null) {
                                            class299 var44 = var6.field2965 = new class299();
                                            var19 = var44.field5072 = class164.method1281(var11, (byte) -69);
                                            var20 = var44.field5073 = class164.method1281(var12, (byte) -69);
                                            var21 = var44.field5070 = class164.method1281(var13, (byte) -69);
                                            var22 = var44.field5071 = class164.method1281(var14, (byte) -69);
                                        }
                                        short var45 = this.field2975[var35];
                                        short var46 = this.field2942[var35];
                                        short var47 = this.field2952[var35];
                                        short var48 = this.field2947[var35];
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
                                        int var57 = this.field2976[var31];
                                        int var58 = this.field2976[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2974[var59] - 1;
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

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([FI)[F", line = 2679)
    private static final float[] method1385(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class244.method1769(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "()V", line = 2686)
    public final void method1386() {
        for (int var1 = 0; var1 < this.field2962; var1++) {
            int var2 = this.field2940[var1];
            this.field2940[var1] = this.field2973[var1];
            this.field2973[var1] = -var2;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 2700)
    private static final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field2989 = var18;
        field2992 = var19;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZZZZZZZZZZ)Lmc;", line = 2782)
    public final class176 method1388(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class176 var12 = new class176();
        var12.field2962 = this.field2962;
        var12.field2957 = this.field2957;
        var12.field2941 = this.field2941;
        if (arg0) {
            var12.field2940 = this.field2940;
            var12.field2973 = this.field2973;
        } else {
            var12.field2940 = class173.method1342((byte) -41, this.field2940);
            var12.field2973 = class173.method1342((byte) -115, this.field2973);
        }
        if (arg1) {
            var12.field2960 = this.field2960;
        } else {
            var12.field2960 = class173.method1342((byte) -41, this.field2960);
        }
        if (arg0 && arg1) {
            var12.field2967 = this.field2967;
            var12.field2950 = this.field2950;
        } else {
            var12.field2967 = new class89();
            var12.field2950 = new class54();
        }
        if (arg2) {
            var12.field2949 = this.field2949;
        } else {
            var12.field2949 = class164.method1281(this.field2949, (byte) -69);
        }
        if (arg3) {
            var12.field2939 = this.field2939;
        } else {
            var12.field2939 = class276.method2012(1884298340, this.field2939);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class102.field1641) {
            var12.field2971 = new class89();
        } else {
            var12.field2971 = this.field2971;
        }
        if (arg5) {
            var12.field2975 = this.field2975;
            var12.field2942 = this.field2942;
            var12.field2952 = this.field2952;
            var12.field2947 = this.field2947;
        } else {
            var12.field2975 = class164.method1281(this.field2975, (byte) -69);
            var12.field2942 = class164.method1281(this.field2942, (byte) -69);
            var12.field2952 = class164.method1281(this.field2952, (byte) -69);
            var12.field2947 = class164.method1281(this.field2947, (byte) -69);
        }
        if (!class102.field1641) {
            var12.field2954 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2954 = this.field2954;
        } else {
            var12.field2954 = new class89();
        }
        if (arg8) {
            var12.field2943 = this.field2943;
            var12.field2964 = this.field2964;
            var12.field2963 = this.field2963;
        } else {
            var12.field2943 = class26.method174(this.field2943, (byte) 116);
            var12.field2964 = class26.method174(this.field2964, (byte) 125);
            var12.field2963 = new class89();
        }
        if (arg9) {
            var12.field2948 = this.field2948;
            var12.field2968 = this.field2968;
            var12.field2946 = this.field2946;
            var12.field2959 = this.field2959;
        } else {
            var12.field2948 = class164.method1281(this.field2948, (byte) -69);
            var12.field2968 = class164.method1281(this.field2968, (byte) -69);
            var12.field2946 = class164.method1281(this.field2946, (byte) -69);
            var12.field2959 = new class89();
        }
        if (arg10) {
            var12.field2970 = this.field2970;
        } else {
            var12.field2970 = class164.method1281(this.field2970, (byte) -69);
        }
        var12.field2951 = this.field2951;
        var12.field2944 = this.field2944;
        var12.field2966 = this.field2966;
        var12.field2978 = this.field2978;
        var12.field2945 = this.field2945;
        var12.field2974 = this.field2974;
        var12.field2976 = this.field2976;
        var12.field2969 = this.field2969;
        var12.field2972 = this.field2972;
        return var12;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZZZZZZ)V", line = 2917)
    public final void method1389(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2956 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2957 != 0) {
            if (arg6) {
                boolean var8 = !this.field2971.field1419 && (arg1 || arg2 && !class102.field1641);
                this.method1378(false, !this.field2967.field1419 && arg0, var8, this.field2954 != null && !this.field2954.field1419 && arg2, !this.field2963.field1419 && arg3);
                if (!this.field2959.field1419 && arg4 && arg1) {
                    this.method1368();
                }
            }
            if (arg0) {
                if (this.field2967.field1419) {
                    if (!this.field2950.field974) {
                        this.method1394();
                    }
                    this.field2940 = null;
                    this.field2960 = null;
                    this.field2973 = null;
                    this.field2974 = null;
                    this.field2976 = null;
                } else {
                    this.field2977 = (byte) (this.field2977 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2971.field1419) {
                    this.field2949 = null;
                    this.field2939 = null;
                } else {
                    this.field2977 = (byte) (this.field2977 | 0x2);
                }
            }
            if (arg2 && class102.field1641) {
                if (this.field2954.field1419) {
                    this.field2975 = null;
                    this.field2942 = null;
                    this.field2952 = null;
                    this.field2947 = null;
                } else {
                    this.field2977 = (byte) (this.field2977 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2963.field1419) {
                    this.field2943 = null;
                    this.field2964 = null;
                } else {
                    this.field2977 = (byte) (this.field2977 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2959.field1419 && this.field2971.field1419) {
                    this.field2948 = null;
                    this.field2968 = null;
                    this.field2946 = null;
                } else {
                    this.field2977 = (byte) (this.field2977 | 0x10);
                }
            }
            if (arg5) {
                this.field2951 = null;
                this.field2966 = null;
                this.field2944 = (int[][]) null;
                this.field2978 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "()V", line = 3014)
    public final void method1390() {
        for (int var1 = 0; var1 < this.field2962; var1++) {
            this.field2973[var1] = -this.field2973[var1];
        }
        if (this.field2952 != null) {
            for (int var2 = 0; var2 < this.field2957; var2++) {
                this.field2952[var2] = (short) (-this.field2952[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2941; var3++) {
            short var4 = this.field2948[var3];
            this.field2948[var3] = this.field2946[var3];
            this.field2946[var3] = var4;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
        if (this.field2954 != null) {
            this.field2954.field1419 = false;
        }
        this.field2959.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "()I", line = 3050)
    public final int method1391() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field973;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()I", line = 3056)
    public final int method1392() {
        if (!this.field2950.field974) {
            this.method1394();
        }
        return this.field2950.field972;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lkd;ILkd;I[IZ)V", line = 3062)
    public final void method1393(class72 arg0, int arg1, class72 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1375(arg0, arg1, arg5);
            return;
        }
        class291 var7 = arg0.field1180[arg1];
        class291 var8 = arg2.field1180[arg3];
        class230 var9 = var7.field4952;
        for (int var10 = 0; var10 < this.field2962; var10++) {
            this.field2940[var10] <<= 0x4;
            this.field2960[var10] <<= 0x4;
            this.field2973[var10] <<= 0x4;
        }
        field2988 = 0;
        field2986 = 0;
        field2991 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field4961; var13++) {
            short var14 = var7.field4957[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field3844[var14] == 0) {
                if (var7.field4960[var13] != -1) {
                    this.method1401(0, var9.field3849[var7.field4960[var13]], 0, 0, 0, arg5);
                }
                this.method1401(var9.field3844[var14], var9.field3849[var14], var7.field4959[var13], var7.field4955[var13], var7.field4949[var13], arg5);
            }
        }
        field2988 = 0;
        field2986 = 0;
        field2991 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field4961; var17++) {
            short var18 = var8.field4957[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field3844[var18] == 0) {
                if (var8.field4960[var17] != -1) {
                    this.method1401(0, var9.field3849[var8.field4960[var17]], 0, 0, 0, arg5);
                }
                this.method1401(var9.field3844[var18], var9.field3849[var18], var8.field4959[var17], var8.field4955[var17], var8.field4949[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2962; var19++) {
            this.field2940[var19] >>= 0x4;
            this.field2960[var19] >>= 0x4;
            this.field2973[var19] >>= 0x4;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "()V", line = 3161)
    private final void method1394() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2962; var9++) {
            int var10 = this.field2940[var9];
            int var11 = this.field2960[var9];
            int var12 = this.field2973[var9];
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
        this.field2950.field975 = (short) var1;
        this.field2950.field970 = (short) var4;
        this.field2950.field976 = (short) var2;
        this.field2950.field971 = (short) var5;
        this.field2950.field977 = (short) var3;
        this.field2950.field973 = (short) var6;
        this.field2950.field972 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2950.field974 = true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lvd;IJIIIIFF)S", line = 3231)
    private final short method1395(class130 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2976[arg1];
        int var12 = this.field2976[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2974[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2961[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2974[var13] = (short) (this.field2957 + 1);
        field2961[var13] = arg2;
        this.field2975[this.field2957] = (short) arg3;
        this.field2942[this.field2957] = (short) arg4;
        this.field2952[this.field2957] = (short) arg5;
        this.field2947[this.field2957] = (short) arg6;
        this.field2943[this.field2957] = arg7;
        this.field2964[this.field2957] = arg8;
        return (short) (this.field2957++);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIII)Z", line = 3267)
    private final boolean method1396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3284)
    private static final void method1397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field2984 = var16;
        field2987 = var17;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 3332)
    public final void method1398(int arg0) {
        int var2 = class109.field1750[arg0];
        int var3 = class109.field1757[arg0];
        for (int var4 = 0; var4 < this.field2962; var4++) {
            int var5 = this.field2973[var4] * var2 + this.field2940[var4] * var3 >> 16;
            this.field2973[var4] = this.field2973[var4] * var3 - this.field2940[var4] * var2 >> 16;
            this.field2940[var4] = var5;
        }
        this.field2950.field974 = false;
        this.field2967.field1419 = false;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZZ)Lfg;", line = 3351)
    public final class208 method1399(boolean arg0, boolean arg1) {
        return this.method1359(arg0, arg1, field2981, field2979);
    }

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "()I", line = 3354)
    public final int method1400() {
        return this.field2969;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[IIIIZ)V", line = 3358)
    private final void method1401(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2988 = 0;
            field2986 = 0;
            field2991 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2944.length) {
                    int[] var14 = this.field2944[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2988 += this.field2940[var16];
                        field2986 += this.field2960[var16];
                        field2991 += this.field2973[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2988 = field2988 / var11 + var8;
                field2986 = field2986 / var11 + var9;
                field2991 = field2991 / var11 + var10;
            } else {
                field2988 = var8;
                field2986 = var9;
                field2991 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2944.length) {
                    int[] var22 = this.field2944[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2940[var24] += var17;
                        this.field2960[var24] += var18;
                        this.field2973[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2944.length) {
                    int[] var27 = this.field2944[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2940[var29] -= field2988;
                        this.field2960[var29] -= field2986;
                        this.field2973[var29] -= field2991;
                        if (arg4 != 0) {
                            int var30 = class109.field1750[arg4];
                            int var31 = class109.field1757[arg4];
                            int var32 = this.field2960[var29] * var30 + this.field2940[var29] * var31 + 32767 >> 16;
                            this.field2960[var29] = this.field2960[var29] * var31 + 32767 - this.field2940[var29] * var30 >> 16;
                            this.field2940[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class109.field1750[arg2];
                            int var34 = class109.field1757[arg2];
                            int var35 = this.field2960[var29] * var34 + 32767 - this.field2973[var29] * var33 >> 16;
                            this.field2973[var29] = this.field2973[var29] * var34 + this.field2960[var29] * var33 + 32767 >> 16;
                            this.field2960[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class109.field1750[arg3];
                            int var37 = class109.field1757[arg3];
                            int var38 = this.field2973[var29] * var36 + this.field2940[var29] * var37 + 32767 >> 16;
                            this.field2973[var29] = this.field2973[var29] * var37 + 32767 - this.field2940[var29] * var36 >> 16;
                            this.field2940[var29] = var38;
                        }
                        this.field2940[var29] += field2988;
                        this.field2960[var29] += field2986;
                        this.field2973[var29] += field2991;
                    }
                }
            }
            if (arg5 && this.field2975 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2944.length) {
                        int[] var41 = this.field2944[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2976[var43];
                            int var45 = this.field2976[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2974[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class109.field1750[arg4];
                                    int var49 = class109.field1757[arg4];
                                    int var50 = this.field2975[var47] * var49 + this.field2942[var47] * var48 + 32767 >> 16;
                                    this.field2942[var47] = (short) (this.field2942[var47] * var49 + 32767 - this.field2975[var47] * var48 >> 16);
                                    this.field2975[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class109.field1750[arg2];
                                    int var52 = class109.field1757[arg2];
                                    int var53 = this.field2942[var47] * var52 + 32767 - this.field2952[var47] * var51 >> 16;
                                    this.field2952[var47] = (short) (this.field2952[var47] * var52 + this.field2942[var47] * var51 + 32767 >> 16);
                                    this.field2942[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class109.field1750[arg3];
                                    int var55 = class109.field1757[arg3];
                                    int var56 = this.field2975[var47] * var55 + this.field2952[var47] * var54 + 32767 >> 16;
                                    this.field2952[var47] = (short) (this.field2952[var47] * var55 + 32767 - this.field2975[var47] * var54 >> 16);
                                    this.field2975[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2954 != null) {
                    this.field2954.field1419 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2944.length) {
                    int[] var59 = this.field2944[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2940[var61] -= field2988;
                        this.field2960[var61] -= field2986;
                        this.field2973[var61] -= field2991;
                        this.field2940[var61] = this.field2940[var61] * arg2 >> 7;
                        this.field2960[var61] = this.field2960[var61] * arg3 >> 7;
                        this.field2973[var61] = this.field2973[var61] * arg4 >> 7;
                        this.field2940[var61] += field2988;
                        this.field2960[var61] += field2986;
                        this.field2973[var61] += field2991;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2978 != null && this.field2939 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2978.length) {
                    int[] var64 = this.field2978[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2939[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2939[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2971.field1419 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(FFF)I", line = 3702)
    private static final int method1402(float arg0, float arg1, float arg2) {
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
}
