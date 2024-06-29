import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class183 extends class287 {

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public int field2954 = 0;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    private int field2967 = 0;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "B")
    private byte field2949 = 0;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "B")
    private byte field2953 = 0;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Z")
    public boolean field2973 = false;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    private int field2986 = 0;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
    private int[] field2974;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "[I")
    public int[] field2966;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[I")
    public int[] field2955;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    public int[] field2951;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "[I")
    private int[] field2979;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[S")
    private short[] field2950;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[S")
    private short[] field2982;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "[S")
    private short[] field2970;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "[S")
    private short[] field2972;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[F")
    private float[] field2983;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[F")
    private float[] field2989;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[S")
    private short[] field2968;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[B")
    private byte[] field2981;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[S")
    private short[] field2965;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[S")
    private short[] field2971;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[S")
    private short[] field2961;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "[S")
    private short[] field2984;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "[B")
    private byte[] field2957;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Lpm;")
    public class61 field2976;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lt;")
    public class235 field2964;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Lt;")
    private class235 field2962;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lt;")
    private class235 field2969;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lt;")
    private class235 field2980;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lt;")
    private class235 field2977;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "S")
    private short field2959;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "S")
    private short field2988;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "[S")
    private short[] field2975;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "[I")
    private int[] field2960;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Llb;")
    private static class112 field2963 = new class112(10000);

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lub;")
    private static class183 field2987 = new class183();

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Lub;")
    private static class183 field2991 = new class183();

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lub;")
    private static class183 field2992 = new class183();

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lub;")
    private static class183 field2993 = new class183();

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "[I")
    private static int[] field2995 = new int[1];

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "[I")
    private static int[] field3002 = new int[1];

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "F")
    private static float field2994;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "F")
    private static float field2999;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "F")
    private static float field3000;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "F")
    private static float field3001;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "F")
    private static float field3003;

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "F")
    private static float field3004;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    private static int field2996;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    private static int field2997;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    private static int field2998;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lcc;")
    private class209 field2985;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ltl;")
    private class257 field2958;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2990;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "[J")
    private static long[] field2952;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[[I")
    private int[][] field2956;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "[[I")
    private int[][] field2978;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 6)
    public final void method109(int arg0) {
        int var2 = class31.field450[arg0];
        int var3 = class31.field455[arg0];
        for (int var4 = 0; var4 < this.field2954; var4++) {
            int var5 = this.field2966[var4] * var3 + this.field2951[var4] * var2 >> 16;
            this.field2951[var4] = this.field2951[var4] * var3 - this.field2966[var4] * var2 >> 16;
            this.field2966[var4] = var5;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZLub;Lub;)Ljc;", line = 28)
    private final class287 method1300(boolean arg0, boolean arg1, class183 arg2, class183 arg3) {
        arg2.field2954 = this.field2954;
        arg2.field2967 = this.field2967;
        arg2.field2986 = this.field2986;
        arg2.field2959 = this.field2959;
        arg2.field2988 = this.field2988;
        arg2.field2949 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field2966 == null || arg2.field2966.length < this.field2954) {
            arg2.field2966 = new int[this.field2954 + 100];
            arg2.field2955 = new int[this.field2954 + 100];
            arg2.field2951 = new int[this.field2954 + 100];
        }
        for (int var5 = 0; var5 < this.field2954; var5++) {
            arg2.field2966[var5] = this.field2966[var5];
            arg2.field2955[var5] = this.field2955[var5];
            arg2.field2951[var5] = this.field2951[var5];
        }
        if (arg2.field2964 == null) {
            arg2.field2964 = new class235();
        }
        arg2.field2964.field3778 = false;
        if (arg2.field2976 == null) {
            arg2.field2976 = new class61();
        }
        arg2.field2976.field898 = false;
        if (arg0) {
            arg2.field2981 = this.field2981;
            arg2.field2962 = this.field2962;
        } else {
            if (arg3.field2981 == null || arg3.field2981.length < this.field2986) {
                arg3.field2981 = new byte[this.field2986 + 100];
            }
            arg2.field2981 = arg3.field2981;
            for (int var6 = 0; var6 < this.field2986; var6++) {
                arg2.field2981[var6] = this.field2981[var6];
            }
            if (arg3.field2962 == null) {
                arg3.field2962 = new class235();
            }
            arg2.field2962 = arg3.field2962;
            arg2.field2962.field3778 = false;
        }
        if (arg1) {
            arg2.field2950 = this.field2950;
            arg2.field2982 = this.field2982;
            arg2.field2970 = this.field2970;
            arg2.field2972 = this.field2972;
            arg2.field2969 = this.field2969;
        } else {
            if (arg3.field2950 == null || arg3.field2950.length < this.field2967) {
                arg3.field2950 = new short[this.field2967 + 100];
                arg3.field2982 = new short[this.field2967 + 100];
                arg3.field2970 = new short[this.field2967 + 100];
                arg3.field2972 = new short[this.field2967 + 100];
            }
            arg2.field2950 = arg3.field2950;
            arg2.field2982 = arg3.field2982;
            arg2.field2970 = arg3.field2970;
            arg2.field2972 = arg3.field2972;
            for (int var7 = 0; var7 < this.field2967; var7++) {
                arg2.field2950[var7] = this.field2950[var7];
                arg2.field2982[var7] = this.field2982[var7];
                arg2.field2970[var7] = this.field2970[var7];
                arg2.field2972[var7] = this.field2972[var7];
            }
            if (class66.field1006) {
                if (arg3.field2969 == null) {
                    arg3.field2969 = new class235();
                }
                arg2.field2969 = arg3.field2969;
                arg2.field2969.field3778 = false;
            } else {
                arg2.field2969 = null;
            }
        }
        arg2.field2983 = this.field2983;
        arg2.field2989 = this.field2989;
        arg2.field2979 = this.field2979;
        arg2.field2956 = this.field2956;
        arg2.field2968 = this.field2968;
        arg2.field2965 = this.field2965;
        arg2.field2971 = this.field2971;
        arg2.field2961 = this.field2961;
        arg2.field2984 = this.field2984;
        arg2.field2957 = this.field2957;
        arg2.field2978 = this.field2978;
        arg2.field2980 = this.field2980;
        arg2.field2977 = this.field2977;
        arg2.field2960 = this.field2960;
        arg2.field2975 = this.field2975;
        arg2.field2974 = this.field2974;
        arg2.field4660 = this.field4660;
        return arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ISIB)I", line = 154)
    private static final int method1301(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class31.field447[class19.method101(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class31.field461.method691(arg1 & 0xFFFF, (byte) -110);
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
            int var9 = class31.field461.method695(arg1 & 0xFFFF, 255);
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

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V", line = 214)
    public final void method95() {
        for (int var1 = 0; var1 < this.field2954; var1++) {
            this.field2966[var1] = -this.field2966[var1];
            this.field2951[var1] = -this.field2951[var1];
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lka;)Lka;", line = 226)
    public final class279 method1302(class279 arg0) {
        if (this.field2967 == 0) {
            return null;
        }
        if (!this.field2976.field898) {
            this.method1303();
        }
        int var2;
        int var3;
        if (class58.field826 > 0) {
            var2 = this.field2976.field894 - (class58.field826 * this.field2976.field893 >> 8) >> 3;
            var3 = this.field2976.field899 - (class58.field826 * this.field2976.field896 >> 8) >> 3;
        } else {
            var2 = this.field2976.field894 - (class58.field826 * this.field2976.field896 >> 8) >> 3;
            var3 = this.field2976.field899 - (class58.field826 * this.field2976.field893 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class58.field834 > 0) {
            var4 = this.field2976.field900 - (class58.field834 * this.field2976.field893 >> 8) >> 3;
            var5 = this.field2976.field897 - (class58.field834 * this.field2976.field896 >> 8) >> 3;
        } else {
            var4 = this.field2976.field900 - (class58.field834 * this.field2976.field896 >> 8) >> 3;
            var5 = this.field2976.field897 - (class58.field834 * this.field2976.field893 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class279 var8;
        if (arg0 == null || arg0.field4561.length < var6 * var7) {
            var8 = new class279(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field5292 = arg0.field5306 = var6;
            arg0.field5291 = arg0.field5300 = var7;
            arg0.method1970();
        }
        var8.field5304 = var2;
        var8.field5290 = var4;
        if (field3002.length < this.field2967) {
            field3002 = new int[this.field2967];
            field2995 = new int[this.field2967];
        }
        for (int var9 = 0; var9 < this.field2954; var9++) {
            int var10 = (this.field2966[var9] - (this.field2955[var9] * class58.field826 >> 8) >> 3) - var2;
            int var11 = (this.field2951[var9] - (this.field2955[var9] * class58.field834 >> 8) >> 3) - var4;
            int var12 = this.field2974[var9];
            int var13 = this.field2974[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2975[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3002[var15] = var10;
                field2995[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2986; var16++) {
            if (this.field2981[var16] <= 128) {
                short var17 = this.field2965[var16];
                short var18 = this.field2971[var16];
                short var19 = this.field2961[var16];
                int var20 = field3002[var17];
                int var21 = field3002[var18];
                int var22 = field3002[var19];
                int var23 = field2995[var17];
                int var24 = field2995[var18];
                int var25 = field2995[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class31.method213(var8.field4561, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "()V", line = 351)
    private final void method1303() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2954; var9++) {
            int var10 = this.field2966[var9];
            int var11 = this.field2955[var9];
            int var12 = this.field2951[var9];
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
        this.field2976.field894 = (short) var1;
        this.field2976.field899 = (short) var4;
        this.field2976.field896 = (short) var2;
        this.field2976.field893 = (short) var5;
        this.field2976.field900 = (short) var3;
        this.field2976.field897 = (short) var6;
        this.field2976.field895 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2976.field898 = true;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "()V", line = 428)
    public final void method104() {
        for (int var1 = 0; var1 < this.field2954; var1++) {
            int var2 = this.field2966[var1];
            this.field2966[var1] = this.field2951[var1];
            this.field2951[var1] = -var2;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "()V", line = 444)
    public final void method115() {
        for (int var1 = 0; var1 < this.field2954; var1++) {
            int var2 = this.field2951[var1];
            this.field2951[var1] = this.field2966[var1];
            this.field2966[var1] = -var2;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 3701)
    private class183() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ln;IIZ)V", line = 3706)
    public class183(class233 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3692];
        this.field2974 = new int[arg0.field3725 + 1];
        for (int var6 = 0; var6 < arg0.field3692; var6++) {
            if ((arg0.field3706 == null || arg0.field3706[var6] != 2) && (arg0.field3693 == null || arg0.field3693[var6] == -1 || !class31.field461.method683(1, arg0.field3693[var6] & 0xFFFF))) {
                var5[this.field2986++] = var6;
                this.field2974[arg0.field3687[var6]]++;
                this.field2974[arg0.field3720[var6]]++;
                this.field2974[arg0.field3697[var6]]++;
            }
        }
        long[] var7 = new long[this.field2986];
        for (int var8 = 0; var8 < this.field2986; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3693 != null) {
                var14 = arg0.field3693[var9];
                if (var14 != -1) {
                    var12 = class31.field461.method690(var14 & 0xFFFF, (byte) -29);
                    var13 = class31.field461.method685((byte) 90, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field3679 != null && arg0.field3679[var9] != 0 || var14 != -1 && !class31.field461.method694(var14 & 0xFFFF, -9737);
            if ((arg3 || var15) && arg0.field3677 != null) {
                var10 += arg0.field3677[var9] << 17;
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
        class174.method1246(var7, var5, (byte) 101);
        this.field2954 = arg0.field3725;
        this.field2966 = arg0.field3695;
        this.field2955 = arg0.field3701;
        this.field2951 = arg0.field3709;
        this.field2979 = arg0.field3690;
        int var20 = this.field2986 * 3;
        this.field2950 = new short[var20];
        this.field2982 = new short[var20];
        this.field2970 = new short[var20];
        this.field2972 = new short[var20];
        this.field2983 = new float[var20];
        this.field2989 = new float[var20];
        this.field2968 = new short[this.field2986];
        this.field2981 = new byte[this.field2986];
        this.field2965 = new short[this.field2986];
        this.field2971 = new short[this.field2986];
        this.field2961 = new short[this.field2986];
        this.field2984 = new short[this.field2986];
        if (arg0.field3689 != null) {
            this.field2957 = new byte[this.field2986];
        }
        this.field2976 = new class61();
        this.field2964 = new class235();
        this.field2962 = new class235();
        if (class66.field1006) {
            this.field2969 = new class235();
        }
        this.field2980 = new class235();
        this.field2977 = new class235();
        this.field2959 = (short) arg1;
        this.field2988 = (short) arg2;
        this.field2975 = new short[var20];
        field2952 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3725; var22++) {
            int var23 = this.field2974[var22];
            this.field2974[var22] = var21;
            var21 += var23;
        }
        this.field2974[arg0.field3725] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3696 != null) {
            int var28 = arg0.field3704;
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
            for (int var36 = 0; var36 < this.field2986; var36++) {
                int var37 = var5[var36];
                if (arg0.field3696[var37] != -1) {
                    int var38 = arg0.field3696[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3687[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3720[var37];
                        } else {
                            var40 = arg0.field3697[var37];
                        }
                        int var41 = arg0.field3695[var40];
                        int var42 = arg0.field3701[var40];
                        int var43 = arg0.field3709[var40];
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
                byte var45 = arg0.field3699[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3686[var44];
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
                        var49 = 64.0F / (float) (arg0.field3708[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3686[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3708[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3688[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3686[var44] / 1024.0F;
                        var49 = (float) arg0.field3708[var44] / 1024.0F;
                        var48 = (float) arg0.field3688[var44] / 1024.0F;
                    }
                    var27[var44] = method1311(arg0.field3700[var44], arg0.field3685[var44], arg0.field3694[var44], arg0.field3723[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2986; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3684[var51] & 0xFFFF;
            short var53;
            if (arg0.field3693 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3693[var51];
            }
            int var54;
            if (arg0.field3696 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3696[var51];
            }
            int var55;
            if (arg0.field3679 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3679[var51] & 0xFF;
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
                    byte var65 = arg0.field3699[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3687[var51];
                        int var67 = arg0.field3720[var51];
                        int var68 = arg0.field3697[var51];
                        short var69 = arg0.field3700[var54];
                        short var70 = arg0.field3685[var54];
                        short var71 = arg0.field3694[var54];
                        float var72 = (float) arg0.field3695[var69];
                        float var73 = (float) arg0.field3701[var69];
                        float var74 = (float) arg0.field3709[var69];
                        float var75 = (float) arg0.field3695[var70] - var72;
                        float var76 = (float) arg0.field3701[var70] - var73;
                        float var77 = (float) arg0.field3709[var70] - var74;
                        float var78 = (float) arg0.field3695[var71] - var72;
                        float var79 = (float) arg0.field3701[var71] - var73;
                        float var80 = (float) arg0.field3709[var71] - var74;
                        float var81 = (float) arg0.field3695[var66] - var72;
                        float var82 = (float) arg0.field3701[var66] - var73;
                        float var83 = (float) arg0.field3709[var66] - var74;
                        float var84 = (float) arg0.field3695[var67] - var72;
                        float var85 = (float) arg0.field3701[var67] - var73;
                        float var86 = (float) arg0.field3709[var67] - var74;
                        float var87 = (float) arg0.field3695[var68] - var72;
                        float var88 = (float) arg0.field3701[var68] - var73;
                        float var89 = (float) arg0.field3709[var68] - var74;
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
                        int var101 = arg0.field3687[var51];
                        int var102 = arg0.field3720[var51];
                        int var103 = arg0.field3697[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3681[var54];
                        float var109 = (float) arg0.field3715[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3688[var54] & 0xFFFF) / 1024.0F;
                            method1332(arg0.field3695[var101], arg0.field3701[var101], arg0.field3709[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3004;
                            var57 = field2999;
                            method1332(arg0.field3695[var102], arg0.field3701[var102], arg0.field3709[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3004;
                            var59 = field2999;
                            method1332(arg0.field3695[var103], arg0.field3701[var103], arg0.field3709[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3004;
                            var61 = field2999;
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
                            float var112 = (float) arg0.field3716[var54] / 256.0F;
                            float var113 = (float) arg0.field3683[var54] / 256.0F;
                            int var114 = arg0.field3695[var102] - arg0.field3695[var101];
                            int var115 = arg0.field3701[var102] - arg0.field3701[var101];
                            int var116 = arg0.field3709[var102] - arg0.field3709[var101];
                            int var117 = arg0.field3695[var103] - arg0.field3695[var101];
                            int var118 = arg0.field3701[var103] - arg0.field3701[var101];
                            int var119 = arg0.field3709[var103] - arg0.field3709[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3686[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3708[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3688[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1314(var126, var127, var128);
                            method1306(arg0.field3695[var101], arg0.field3701[var101], arg0.field3709[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3001;
                            var57 = field3000;
                            method1306(arg0.field3695[var102], arg0.field3701[var102], arg0.field3709[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3001;
                            var59 = field3000;
                            method1306(arg0.field3695[var103], arg0.field3701[var103], arg0.field3709[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3001;
                            var61 = field3000;
                        } else if (var65 == 3) {
                            method1333(arg0.field3695[var101], arg0.field3701[var101], arg0.field3709[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2994;
                            var57 = field3003;
                            method1333(arg0.field3695[var102], arg0.field3701[var102], arg0.field3709[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2994;
                            var59 = field3003;
                            method1333(arg0.field3695[var103], arg0.field3701[var103], arg0.field3709[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2994;
                            var61 = field3003;
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
            arg0.method1658();
            byte var129;
            if (arg0.field3706 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3706[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3687[var51];
                class310 var133 = arg0.field3711[var132];
                this.field2965[var50] = this.method1316(arg0, var132, var130, var133.field5219, var133.field5223, var133.field5214, var133.field5222, var56, var57);
                int var134 = arg0.field3720[var51];
                class310 var135 = arg0.field3711[var134];
                this.field2971[var50] = this.method1316(arg0, var134, (long) var62 + var130, var135.field5219, var135.field5223, var135.field5214, var135.field5222, var58, var59);
                int var136 = arg0.field3697[var51];
                class310 var137 = arg0.field3711[var136];
                this.field2961[var50] = this.method1316(arg0, var136, (long) var63 + var130, var137.field5219, var137.field5223, var137.field5214, var137.field5222, var60, var61);
            } else if (var129 == 1) {
                class97 var138 = arg0.field3717[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1421 > 0 ? 1024 : 2048) + (var138.field1429 + 256 << 12) + (var138.field1422 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2965[var50] = this.method1316(arg0, arg0.field3687[var51], var139, var138.field1421, var138.field1429, var138.field1422, 0, var56, var57);
                this.field2971[var50] = this.method1316(arg0, arg0.field3720[var51], (long) var62 + var139, var138.field1421, var138.field1429, var138.field1422, 0, var58, var59);
                this.field2961[var50] = this.method1316(arg0, arg0.field3697[var51], (long) var63 + var139, var138.field1421, var138.field1429, var138.field1422, 0, var60, var61);
            }
            if (arg0.field3693 == null) {
                this.field2984[var50] = -1;
            } else {
                this.field2984[var50] = arg0.field3693[var51];
            }
            if (this.field2957 != null) {
                this.field2957[var50] = (byte) arg0.field3689[var51];
            }
            this.field2968[var50] = arg0.field3684[var51];
            if (arg0.field3679 != null) {
                this.field2981[var50] = arg0.field3679[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2986; var143++) {
            short var144 = this.field2984[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2960 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2986; var147++) {
            short var148 = this.field2984[var147];
            if (var146 != var148) {
                this.field2960[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2960[var145] = this.field2986;
        field2952 = null;
        this.field2950 = method1318(this.field2950, this.field2967);
        this.field2982 = method1318(this.field2982, this.field2967);
        this.field2970 = method1318(this.field2970, this.field2967);
        this.field2972 = method1318(this.field2972, this.field2967);
        this.field2983 = method1304(this.field2983, this.field2967);
        this.field2989 = method1304(this.field2989, this.field2967);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lth;", line = 464)
    public final class126 method888(int arg0, int arg1, int arg2) {
        this.field2973 = false;
        if (this.field2985 != null) {
            this.field2950 = this.field2985.field3374;
            this.field2982 = this.field2985.field3371;
            this.field2970 = this.field2985.field3372;
            this.field2972 = this.field2985.field3373;
            this.field2985 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljl;I)V", line = 477)
    public final void method98(class57 arg0, int arg1) {
        if (this.field2956 == null || arg1 == -1) {
            return;
        }
        class39 var3 = arg0.field815[arg1];
        class9 var4 = var3.field601;
        field2997 = 0;
        field2996 = 0;
        field2998 = 0;
        for (int var5 = 0; var5 < var3.field608; var5++) {
            short var6 = var3.field598[var5];
            if (var4.field125[var6]) {
                if (var3.field606[var5] != -1) {
                    this.method1320(0, 0, 0, 0);
                }
                this.method1320(var4.field116[var6], var3.field604[var5], var3.field607[var5], var3.field609[var5]);
            }
        }
        this.field2964.field3778 = false;
        this.field2976.field898 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([FI)[F", line = 516)
    private static final float[] method1304(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class21.method147(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "()V", line = 521)
    private final void method1305() {
        if (field2963.field1607.length < this.field2967 * 12) {
            field2963 = new class112((this.field2967 + 100) * 12);
        } else {
            field2963.field1640 = 0;
        }
        if (class166.field2642) {
            for (int var1 = 0; var1 < this.field2986; var1++) {
                field2963.method787(853918096, this.field2965[var1]);
                field2963.method787(853918096, this.field2971[var1]);
                field2963.method787(853918096, this.field2961[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2986; var2++) {
                field2963.method804(true, this.field2965[var2]);
                field2963.method804(true, this.field2971[var2]);
                field2963.method804(true, this.field2961[var2]);
            }
        }
        if (!class166.field2622) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2963.field1640);
            var5.put(field2963.field1607, 0, field2963.field1640);
            var5.flip();
            this.field2977.field3778 = true;
            this.field2977.field3773 = var5;
            this.field2977.field3775 = null;
            return;
        }
        class257 var3 = new class257();
        ByteBuffer var4 = ByteBuffer.wrap(field2963.field1607, 0, field2963.field1640);
        var3.method1821(var4);
        this.field2977.field3778 = true;
        this.field2977.field3773 = null;
        this.field2977.field3775 = var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljl;ILjl;I[IZ)V", line = 581)
    public final void method127(class57 arg0, int arg1, class57 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method116(arg0, arg1, arg5);
            return;
        }
        class39 var7 = arg0.field815[arg1];
        class39 var8 = arg2.field815[arg3];
        class9 var9 = var7.field601;
        for (int var10 = 0; var10 < this.field2954; var10++) {
            this.field2966[var10] <<= 0x4;
            this.field2955[var10] <<= 0x4;
            this.field2951[var10] <<= 0x4;
        }
        field2997 = 0;
        field2996 = 0;
        field2998 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field608; var13++) {
            short var14 = var7.field598[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field116[var14] == 0) {
                if (var7.field606[var13] != -1) {
                    this.method1328(0, var9.field123[var7.field606[var13]], 0, 0, 0, arg5);
                }
                this.method1328(var9.field116[var14], var9.field123[var14], var7.field604[var13], var7.field607[var13], var7.field609[var13], arg5);
            }
        }
        field2997 = 0;
        field2996 = 0;
        field2998 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field608; var17++) {
            short var18 = var8.field598[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field116[var18] == 0) {
                if (var8.field606[var17] != -1) {
                    this.method1328(0, var9.field123[var8.field606[var17]], 0, 0, 0, arg5);
                }
                this.method1328(var9.field116[var18], var9.field123[var18], var8.field604[var17], var8.field607[var17], var8.field609[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field2954; var19++) {
            this.field2966[var19] >>= 0x4;
            this.field2955[var19] >>= 0x4;
            this.field2951[var19] >>= 0x4;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()I", line = 677)
    public final int method119() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field894;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 684)
    private static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field3001 = var18;
        field3000 = var19;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZZZZZZ)V", line = 766)
    public final void method1307(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2949 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2967 != 0) {
            if (arg6) {
                boolean var8 = !this.field2962.field3778 && (arg1 || arg2 && !class66.field1006);
                this.method1313(false, !this.field2964.field3778 && arg0, var8, this.field2969 != null && !this.field2969.field3778 && arg2, !this.field2980.field3778 && arg3);
                if (!this.field2977.field3778 && arg4 && arg1) {
                    this.method1305();
                }
            }
            if (arg0) {
                if (this.field2964.field3778) {
                    this.field2966 = null;
                    this.field2955 = null;
                    this.field2951 = null;
                    this.field2975 = null;
                    this.field2974 = null;
                } else {
                    this.field2953 = (byte) (this.field2953 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2962.field3778) {
                    this.field2968 = null;
                    this.field2981 = null;
                } else {
                    this.field2953 = (byte) (this.field2953 | 0x2);
                }
            }
            if (arg2 && class66.field1006) {
                if (this.field2969.field3778) {
                    this.field2950 = null;
                    this.field2982 = null;
                    this.field2970 = null;
                    this.field2972 = null;
                } else {
                    this.field2953 = (byte) (this.field2953 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2980.field3778) {
                    this.field2983 = null;
                    this.field2989 = null;
                } else {
                    this.field2953 = (byte) (this.field2953 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2977.field3778 && this.field2962.field3778) {
                    this.field2965 = null;
                    this.field2971 = null;
                    this.field2961 = null;
                } else {
                    this.field2953 = (byte) (this.field2953 | 0x10);
                }
            }
            if (arg5) {
                this.field2979 = null;
                this.field2957 = null;
                this.field2956 = (int[][]) null;
                this.field2978 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "()V", line = 858)
    public static final void method1308() {
        field2987 = new class183();
        field2991 = new class183();
        field2992 = new class183();
        field2993 = new class183();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(SS)V", line = 867)
    public final void method1309(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2986; var3++) {
            if (this.field2968[var3] == arg0) {
                this.field2968[var3] = arg1;
            }
        }
        this.field2962.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 879)
    public final void method1310(int arg0) {
        this.field2959 = (short) arg0;
        this.field2962.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)V", line = 888)
    public final void method112(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2954; var4++) {
            this.field2966[var4] = this.field2966[var4] * arg0 >> 7;
            this.field2955[var4] = this.field2955[var4] * arg1 >> 7;
            this.field2951[var4] = this.field2951[var4] * arg2 >> 7;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIFFF)[F", line = 903)
    private static final float[] method1311(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 977)
    public final void method110(int arg0) {
        int var2 = class31.field450[arg0];
        int var3 = class31.field455[arg0];
        for (int var4 = 0; var4 < this.field2954; var4++) {
            int var5 = this.field2966[var4] * var3 + this.field2955[var4] * var2 >> 16;
            this.field2955[var4] = this.field2955[var4] * var3 - this.field2966[var4] * var2 >> 16;
            this.field2966[var4] = var5;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lth;IIIZ)V", line = 997)
    public final void method885(class126 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class183 var6 = (class183) arg0;
        if (this.field2986 == 0 || var6.field2986 == 0) {
            return;
        }
        int var7 = var6.field2954;
        int[] var8 = var6.field2966;
        int[] var9 = var6.field2955;
        int[] var10 = var6.field2951;
        short[] var11 = var6.field2950;
        short[] var12 = var6.field2982;
        short[] var13 = var6.field2970;
        short[] var14 = var6.field2972;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2985 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2985.field3374;
            var16 = this.field2985.field3371;
            var17 = this.field2985.field3372;
            var18 = this.field2985.field3373;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2985 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2985.field3374;
            var20 = var6.field2985.field3371;
            var21 = var6.field2985.field3372;
            var22 = var6.field2985.field3373;
        }
        int[] var23 = var6.field2974;
        short[] var24 = var6.field2975;
        if (!var6.field2976.field898) {
            var6.method1303();
        }
        short var25 = var6.field2976.field896;
        short var26 = var6.field2976.field893;
        short var27 = var6.field2976.field894;
        short var28 = var6.field2976.field899;
        short var29 = var6.field2976.field900;
        short var30 = var6.field2976.field897;
        for (int var31 = 0; var31 < this.field2954; var31++) {
            int var32 = this.field2955[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2966[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2951[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2974[var31];
                        int var37 = this.field2974[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2975[var38] - 1;
                            if (var35 == -1 || this.field2972[var35] != 0) {
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
                                            this.field2985 = new class209();
                                            var15 = this.field2985.field3374 = class129.method905(0, this.field2950);
                                            var16 = this.field2985.field3371 = class129.method905(0, this.field2982);
                                            var17 = this.field2985.field3372 = class129.method905(0, this.field2970);
                                            var18 = this.field2985.field3373 = class129.method905(0, this.field2972);
                                        }
                                        if (var19 == null) {
                                            class209 var44 = var6.field2985 = new class209();
                                            var19 = var44.field3374 = class129.method905(0, var11);
                                            var20 = var44.field3371 = class129.method905(0, var12);
                                            var21 = var44.field3372 = class129.method905(0, var13);
                                            var22 = var44.field3373 = class129.method905(0, var14);
                                        }
                                        short var45 = this.field2950[var35];
                                        short var46 = this.field2982[var35];
                                        short var47 = this.field2970[var35];
                                        short var48 = this.field2972[var35];
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
                                        int var57 = this.field2974[var31];
                                        int var58 = this.field2974[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2975[var59] - 1;
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

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "()V", line = 1235)
    public static void method1312() {
        field2952 = null;
        field2963 = null;
        field2990 = null;
        field2987 = null;
        field2991 = null;
        field2992 = null;
        field2993 = null;
        field3002 = null;
        field2995 = null;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()I", line = 1246)
    public final int method124() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field895;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZZZZ)V", line = 1253)
    private final void method1313(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2964.field3765 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2962.field3765 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2969.field3765 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2980.field3765 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2963.field1607.length < this.field2967 * var6) {
            field2963 = new class112((this.field2967 + 100) * var6);
        } else {
            field2963.field1640 = 0;
        }
        if (arg1) {
            if (class166.field2642) {
                for (int var7 = 0; var7 < this.field2954; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2966[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2955[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2951[var7]);
                    int var11 = this.field2974[var7];
                    int var12 = this.field2974[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2975[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2963.field1640 = var6 * var14;
                        field2963.method787(853918096, var8);
                        field2963.method787(853918096, var9);
                        field2963.method787(853918096, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2954; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2966[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2955[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2951[var15]);
                    int var19 = this.field2974[var15];
                    int var20 = this.field2974[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2975[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2963.field1640 = var6 * var22;
                        field2963.method804(true, var16);
                        field2963.method804(true, var17);
                        field2963.method804(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class66.field1006) {
                for (int var42 = 0; var42 < this.field2986; var42++) {
                    int var43 = method1301(this.field2968[var42], this.field2984[var42], this.field2959, this.field2981[var42]);
                    field2963.field1640 = this.field2965[var42] * var6 + this.field2962.field3765;
                    field2963.method787(853918096, var43);
                    field2963.field1640 = this.field2971[var42] * var6 + this.field2962.field3765;
                    field2963.method787(853918096, var43);
                    field2963.field1640 = this.field2961[var42] * var6 + this.field2962.field3765;
                    field2963.method787(853918096, var43);
                }
            } else {
                int var23 = (int) class58.field832[0];
                int var24 = (int) class58.field832[1];
                int var25 = (int) class58.field832[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2959 * 1.3F);
                int var28 = this.field2988 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2986; var29++) {
                    short var30 = this.field2965[var29];
                    short var31 = this.field2972[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2970[var30] * var25 + this.field2982[var30] * var24 + this.field2950[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2970[var30] * var25 + this.field2982[var30] * var24 + this.field2950[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2972[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2971[var29];
                    short var34 = this.field2972[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2970[var33] * var25 + this.field2982[var33] * var24 + this.field2950[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2970[var33] * var25 + this.field2982[var33] * var24 + this.field2950[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2972[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2961[var29];
                    short var37 = this.field2972[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2970[var36] * var25 + this.field2982[var36] * var24 + this.field2950[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2970[var36] * var25 + this.field2982[var36] * var24 + this.field2950[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2972[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1301(this.field2968[var29], this.field2984[var29], var32, this.field2981[var29]);
                    int var40 = method1301(this.field2968[var29], this.field2984[var29], var35, this.field2981[var29]);
                    int var41 = method1301(this.field2968[var29], this.field2984[var29], var38, this.field2981[var29]);
                    field2963.field1640 = var6 * var30 + this.field2962.field3765;
                    field2963.method787(853918096, var39);
                    field2963.field1640 = var6 * var33 + this.field2962.field3765;
                    field2963.method787(853918096, var40);
                    field2963.field1640 = var6 * var36 + this.field2962.field3765;
                    field2963.method787(853918096, var41);
                }
                this.field2950 = null;
                this.field2982 = null;
                this.field2970 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2988;
            float var45 = 3.0F / (float) (this.field2988 / 2 + this.field2988);
            field2963.field1640 = this.field2969.field3765;
            if (class166.field2642) {
                for (int var46 = 0; var46 < this.field2967; var46++) {
                    short var47 = this.field2972[var46];
                    if (var47 == 0) {
                        field2963.method770(false, (float) this.field2950[var46] * var45);
                        field2963.method770(false, (float) this.field2982[var46] * var45);
                        field2963.method770(false, (float) this.field2970[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2963.method770(false, (float) this.field2950[var46] * var48);
                        field2963.method770(false, (float) this.field2982[var46] * var48);
                        field2963.method770(false, (float) this.field2970[var46] * var48);
                    }
                    field2963.field1640 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2967; var49++) {
                    short var50 = this.field2972[var49];
                    if (var50 == 0) {
                        field2963.method812(-17216, (float) this.field2950[var49] * var45);
                        field2963.method812(-17216, (float) this.field2982[var49] * var45);
                        field2963.method812(-17216, (float) this.field2970[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2963.method812(-17216, (float) this.field2950[var49] * var51);
                        field2963.method812(-17216, (float) this.field2982[var49] * var51);
                        field2963.method812(-17216, (float) this.field2970[var49] * var51);
                    }
                    field2963.field1640 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2963.field1640 = this.field2980.field3765;
            if (class166.field2642) {
                for (int var52 = 0; var52 < this.field2967; var52++) {
                    field2963.method770(false, this.field2983[var52]);
                    field2963.method770(false, this.field2989[var52]);
                    field2963.field1640 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2967; var53++) {
                    field2963.method812(-17216, this.field2983[var53]);
                    field2963.method812(-17216, this.field2989[var53]);
                    field2963.field1640 += var6 - 8;
                }
            }
        }
        field2963.field1640 = this.field2967 * var6;
        if (arg0) {
            if (class166.field2635) {
                ByteBuffer var54 = ByteBuffer.wrap(field2963.field1607, 0, field2963.field1640);
                if (this.field2958 == null) {
                    this.field2958 = new class257(true);
                    this.field2958.method1821(var54);
                } else {
                    this.field2958.method1825(var54);
                }
                if (arg1) {
                    this.field2964.field3778 = true;
                    this.field2964.field3773 = null;
                    this.field2964.field3775 = this.field2958;
                    this.field2964.field3763 = var6;
                }
                if (arg2) {
                    this.field2962.field3778 = true;
                    this.field2962.field3773 = null;
                    this.field2962.field3775 = this.field2958;
                    this.field2962.field3763 = var6;
                }
                if (arg3) {
                    this.field2969.field3778 = true;
                    this.field2969.field3773 = null;
                    this.field2969.field3775 = this.field2958;
                    this.field2969.field3763 = var6;
                }
                if (arg4) {
                    this.field2980.field3778 = true;
                    this.field2980.field3773 = null;
                    this.field2980.field3775 = this.field2958;
                    this.field2980.field3763 = var6;
                }
            } else {
                if (field2990 == null || field2990.capacity() < field2963.field1640) {
                    field2990 = ByteBuffer.allocateDirect(var6 * 100 + field2963.field1640);
                } else {
                    field2990.clear();
                }
                field2990.put(field2963.field1607, 0, field2963.field1640);
                field2990.flip();
                if (arg1) {
                    this.field2964.field3778 = true;
                    this.field2964.field3773 = field2990;
                    this.field2964.field3775 = null;
                    this.field2964.field3763 = var6;
                }
                if (arg2) {
                    this.field2962.field3778 = true;
                    this.field2962.field3773 = field2990;
                    this.field2964.field3775 = null;
                    this.field2962.field3763 = var6;
                }
                if (arg3) {
                    this.field2969.field3778 = true;
                    this.field2969.field3773 = field2990;
                    this.field2969.field3775 = null;
                    this.field2969.field3763 = var6;
                }
                if (arg4) {
                    this.field2980.field3778 = true;
                    this.field2980.field3773 = field2990;
                    this.field2980.field3775 = null;
                    this.field2980.field3763 = var6;
                }
            }
        } else if (class166.field2622) {
            class257 var55 = new class257();
            ByteBuffer var56 = ByteBuffer.wrap(field2963.field1607, 0, field2963.field1640);
            var55.method1821(var56);
            if (arg1) {
                this.field2964.field3778 = true;
                this.field2964.field3773 = null;
                this.field2964.field3775 = var55;
                this.field2964.field3763 = var6;
            }
            if (arg2) {
                this.field2962.field3778 = true;
                this.field2962.field3773 = null;
                this.field2962.field3775 = var55;
                this.field2962.field3763 = var6;
            }
            if (arg3) {
                this.field2969.field3778 = true;
                this.field2969.field3773 = null;
                this.field2969.field3775 = var55;
                this.field2969.field3763 = var6;
            }
            if (arg4) {
                this.field2980.field3778 = true;
                this.field2980.field3773 = null;
                this.field2980.field3775 = var55;
                this.field2980.field3763 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2963.field1640);
            var57.put(field2963.field1607, 0, field2963.field1640);
            var57.flip();
            if (arg1) {
                this.field2964.field3778 = true;
                this.field2964.field3773 = var57;
                this.field2964.field3775 = null;
                this.field2964.field3763 = var6;
            }
            if (arg2) {
                this.field2962.field3778 = true;
                this.field2962.field3773 = var57;
                this.field2964.field3775 = null;
                this.field2962.field3763 = var6;
            }
            if (arg3) {
                this.field2969.field3778 = true;
                this.field2969.field3773 = var57;
                this.field2969.field3775 = null;
                this.field2969.field3763 = var6;
            }
            if (arg4) {
                this.field2980.field3778 = true;
                this.field2980.field3773 = var57;
                this.field2980.field3775 = null;
                this.field2980.field3763 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "()I", line = 1781)
    public final int method103() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field899;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(FFF)I", line = 1788)
    private static final int method1314(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(SS)V", line = 1825)
    public final void method1315(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2986; var3++) {
            if (this.field2984[var3] == arg0) {
                this.field2984[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class31.field461.method691(arg0 & 0xFFFF, (byte) 80);
            var5 = class31.field461.method695(arg0 & 0xFFFF, 255);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class31.field461.method691(arg1 & 0xFFFF, (byte) 41);
            var7 = class31.field461.method695(arg1 & 0xFFFF, 255);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2962.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljl;IZ)V", line = 1859)
    public final void method116(class57 arg0, int arg1, boolean arg2) {
        if (this.field2956 == null || arg1 == -1) {
            return;
        }
        class39 var4 = arg0.field815[arg1];
        class9 var5 = var4.field601;
        for (int var6 = 0; var6 < this.field2954; var6++) {
            this.field2966[var6] <<= 0x4;
            this.field2955[var6] <<= 0x4;
            this.field2951[var6] <<= 0x4;
        }
        field2997 = 0;
        field2996 = 0;
        field2998 = 0;
        for (int var7 = 0; var7 < var4.field608; var7++) {
            short var8 = var4.field598[var7];
            if (var4.field606[var7] != -1) {
                this.method1328(0, var5.field123[var4.field606[var7]], 0, 0, 0, arg2);
            }
            this.method1328(var5.field116[var8], var5.field123[var8], var4.field604[var7], var4.field607[var7], var4.field609[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field2954; var9++) {
            this.field2966[var9] >>= 0x4;
            this.field2955[var9] >>= 0x4;
            this.field2951[var9] >>= 0x4;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ln;IJIIIIFF)S", line = 1913)
    private final short method1316(class233 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2974[arg1];
        int var12 = this.field2974[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2975[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2952[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2975[var13] = (short) (this.field2967 + 1);
        field2952[var13] = arg2;
        this.field2950[this.field2967] = (short) arg3;
        this.field2982[this.field2967] = (short) arg4;
        this.field2970[this.field2967] = (short) arg5;
        this.field2972[this.field2967] = (short) arg6;
        this.field2983[this.field2967] = arg7;
        this.field2989[this.field2967] = arg8;
        return (short) (this.field2967++);
    }

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "()V", line = 1952)
    private final void method1317() {
        GL var1 = class166.field2648;
        if (this.field2986 == 0) {
            return;
        }
        if (this.field2949 != 0) {
            this.method1313(true, !this.field2964.field3778 && (this.field2949 & 0x1) != 0, !this.field2962.field3778 && (this.field2949 & 0x2) != 0, this.field2969 != null && !this.field2969.field3778 && (this.field2949 & 0x4) != 0, false);
        }
        this.method1313(false, !this.field2964.field3778, !this.field2962.field3778, this.field2969 != null && !this.field2969.field3778, !this.field2980.field3778);
        if (!this.field2977.field3778) {
            this.method1305();
        }
        if (this.field2953 != 0) {
            if ((this.field2953 & 0x1) != 0) {
                this.field2966 = null;
                this.field2955 = null;
                this.field2951 = null;
                this.field2975 = null;
                this.field2974 = null;
            }
            if ((this.field2953 & 0x2) != 0) {
                this.field2968 = null;
                this.field2981 = null;
            }
            if ((this.field2953 & 0x4) != 0) {
                this.field2950 = null;
                this.field2982 = null;
                this.field2970 = null;
                this.field2972 = null;
            }
            if ((this.field2953 & 0x8) != 0) {
                this.field2983 = null;
                this.field2989 = null;
            }
            if ((this.field2953 & 0x10) != 0) {
                this.field2965 = null;
                this.field2971 = null;
                this.field2961 = null;
            }
            this.field2953 = 0;
        }
        class257 var2 = null;
        if (this.field2964.field3775 != null) {
            this.field2964.field3775.method1823();
            var2 = this.field2964.field3775;
            var1.glVertexPointer(3, 5126, this.field2964.field3763, (long) this.field2964.field3765);
        }
        if (this.field2962.field3775 != null) {
            if (this.field2962.field3775 != var2) {
                this.field2962.field3775.method1823();
                var2 = this.field2962.field3775;
            }
            var1.glColorPointer(4, 5121, this.field2962.field3763, (long) this.field2962.field3765);
        }
        if (class66.field1006 && this.field2969.field3775 != null) {
            if (this.field2969.field3775 != var2) {
                this.field2969.field3775.method1823();
                var2 = this.field2969.field3775;
            }
            var1.glNormalPointer(5126, this.field2969.field3763, (long) this.field2969.field3765);
        }
        if (this.field2980.field3775 != null) {
            if (this.field2980.field3775 != var2) {
                this.field2980.field3775.method1823();
                class257 var3 = this.field2980.field3775;
            }
            var1.glTexCoordPointer(2, 5126, this.field2980.field3763, (long) this.field2980.field3765);
        }
        if (this.field2977.field3775 != null) {
            this.field2977.field3775.method1824();
        }
        if (this.field2964.field3775 == null || this.field2962.field3775 == null || class66.field1006 && this.field2969.field3775 == null || this.field2980.field3775 == null) {
            if (class166.field2622) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2964.field3775 == null) {
                this.field2964.field3773.position(this.field2964.field3765);
                var1.glVertexPointer(3, 5126, this.field2964.field3763, this.field2964.field3773);
            }
            if (this.field2962.field3775 == null) {
                this.field2962.field3773.position(this.field2962.field3765);
                var1.glColorPointer(4, 5121, this.field2962.field3763, this.field2962.field3773);
            }
            if (class66.field1006 && this.field2969.field3775 == null) {
                this.field2969.field3773.position(this.field2969.field3765);
                var1.glNormalPointer(5126, this.field2969.field3763, this.field2969.field3773);
            }
            if (this.field2980.field3775 == null) {
                this.field2980.field3773.position(this.field2980.field3765);
                var1.glTexCoordPointer(2, 5126, this.field2980.field3763, this.field2980.field3773);
            }
        }
        if (this.field2977.field3775 == null && class166.field2622) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2960.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2960[var5];
            int var7 = this.field2960[var5 + 1];
            short var8 = this.field2984[var6];
            if (var8 == -1) {
                class166.method1182(-1);
                class274.method1934(0, 0, (byte) -119);
            } else {
                class31.field461.method692(0, var8 & 0xFFFF);
            }
            if (this.field2977.field3775 == null) {
                this.field2977.field3773.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2977.field3773);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZZ)Ljc;", line = 2123)
    public final class287 method108(boolean arg0, boolean arg1) {
        return this.method1300(arg0, arg1, field2991, field2987);
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "()I", line = 2126)
    public final int method99() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field900;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([SI)[S", line = 2133)
    private static final short[] method1318(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class21.method140(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZZZZZZZZZZ)Lub;", line = 2139)
    public final class183 method1319(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class183 var12 = new class183();
        var12.field2954 = this.field2954;
        var12.field2967 = this.field2967;
        var12.field2986 = this.field2986;
        if (arg0) {
            var12.field2966 = this.field2966;
            var12.field2951 = this.field2951;
        } else {
            var12.field2966 = class289.method2014(this.field2966, 2669);
            var12.field2951 = class289.method2014(this.field2951, 2669);
        }
        if (arg1) {
            var12.field2955 = this.field2955;
        } else {
            var12.field2955 = class289.method2014(this.field2955, 2669);
        }
        if (arg0 && arg1) {
            var12.field2964 = this.field2964;
            var12.field2976 = this.field2976;
        } else {
            var12.field2964 = new class235();
            var12.field2976 = new class61();
        }
        if (arg2) {
            var12.field2968 = this.field2968;
        } else {
            var12.field2968 = class129.method905(0, this.field2968);
        }
        if (arg3) {
            var12.field2981 = this.field2981;
        } else {
            var12.field2981 = class109.method737(9492, this.field2981);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class66.field1006) {
            var12.field2962 = new class235();
        } else {
            var12.field2962 = this.field2962;
        }
        if (arg5) {
            var12.field2950 = this.field2950;
            var12.field2982 = this.field2982;
            var12.field2970 = this.field2970;
            var12.field2972 = this.field2972;
        } else {
            var12.field2950 = class129.method905(0, this.field2950);
            var12.field2982 = class129.method905(0, this.field2982);
            var12.field2970 = class129.method905(0, this.field2970);
            var12.field2972 = class129.method905(0, this.field2972);
        }
        if (!class66.field1006) {
            var12.field2969 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2969 = this.field2969;
        } else {
            var12.field2969 = new class235();
        }
        if (arg8) {
            var12.field2983 = this.field2983;
            var12.field2989 = this.field2989;
            var12.field2980 = this.field2980;
        } else {
            var12.field2983 = class59.method419(this.field2983, (byte) -84);
            var12.field2989 = class59.method419(this.field2989, (byte) -84);
            var12.field2980 = new class235();
        }
        if (arg9) {
            var12.field2965 = this.field2965;
            var12.field2971 = this.field2971;
            var12.field2961 = this.field2961;
            var12.field2977 = this.field2977;
        } else {
            var12.field2965 = class129.method905(0, this.field2965);
            var12.field2971 = class129.method905(0, this.field2971);
            var12.field2961 = class129.method905(0, this.field2961);
            var12.field2977 = new class235();
        }
        if (arg10) {
            var12.field2984 = this.field2984;
        } else {
            var12.field2984 = class129.method905(0, this.field2984);
        }
        var12.field2979 = this.field2979;
        var12.field2956 = this.field2956;
        var12.field2957 = this.field2957;
        var12.field2978 = this.field2978;
        var12.field2960 = this.field2960;
        var12.field2975 = this.field2975;
        var12.field2974 = this.field2974;
        var12.field2959 = this.field2959;
        var12.field2988 = this.field2988;
        return var12;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V", line = 2274)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2967 == 0) {
            return;
        }
        GL var8 = class166.field2648;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1317();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V", line = 2301)
    private final void method1320(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2997 = 0;
            field2996 = 0;
            field2998 = 0;
            for (int var6 = 0; var6 < this.field2954; var6++) {
                field2997 += this.field2966[var6];
                field2996 += this.field2955[var6];
                field2998 += this.field2951[var6];
                var5++;
            }
            if (var5 > 0) {
                field2997 = field2997 / var5 + arg1;
                field2996 = field2996 / var5 + arg2;
                field2998 = field2998 / var5 + arg3;
            } else {
                field2997 = arg1;
                field2996 = arg2;
                field2998 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2954; var7++) {
                this.field2966[var7] += arg1;
                this.field2955[var7] += arg2;
                this.field2951[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2954; var8++) {
                this.field2966[var8] -= field2997;
                this.field2955[var8] -= field2996;
                this.field2951[var8] -= field2998;
                if (arg3 != 0) {
                    int var9 = class31.field450[arg3];
                    int var10 = class31.field455[arg3];
                    int var11 = this.field2966[var8] * var10 + this.field2955[var8] * var9 + 32767 >> 16;
                    this.field2955[var8] = this.field2955[var8] * var10 + 32767 - this.field2966[var8] * var9 >> 16;
                    this.field2966[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class31.field450[arg1];
                    int var13 = class31.field455[arg1];
                    int var14 = this.field2955[var8] * var13 + 32767 - this.field2951[var8] * var12 >> 16;
                    this.field2951[var8] = this.field2955[var8] * var12 + this.field2951[var8] * var13 + 32767 >> 16;
                    this.field2955[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class31.field450[arg2];
                    int var16 = class31.field455[arg2];
                    int var17 = this.field2966[var8] * var16 + this.field2951[var8] * var15 + 32767 >> 16;
                    this.field2951[var8] = this.field2951[var8] * var16 + 32767 - this.field2966[var8] * var15 >> 16;
                    this.field2966[var8] = var17;
                }
                this.field2966[var8] += field2997;
                this.field2955[var8] += field2996;
                this.field2951[var8] += field2998;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2954; var18++) {
                this.field2966[var18] -= field2997;
                this.field2955[var18] -= field2996;
                this.field2951[var18] -= field2998;
                this.field2966[var18] = this.field2966[var18] * arg1 / 128;
                this.field2955[var18] = this.field2955[var18] * arg2 / 128;
                this.field2951[var18] = this.field2951[var18] * arg3 / 128;
                this.field2966[var18] += field2997;
                this.field2955[var18] += field2996;
                this.field2951[var18] += field2998;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2986; var19++) {
                int var20 = (this.field2981[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2981[var19] = (byte) var20;
            }
            this.field2962.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "()V", line = 2455)
    public final void method1321() {
        if (this.field2950 == null) {
            this.method95();
            return;
        }
        for (int var1 = 0; var1 < this.field2954; var1++) {
            this.field2966[var1] = -this.field2966[var1];
            this.field2951[var1] = -this.field2951[var1];
        }
        for (int var2 = 0; var2 < this.field2967; var2++) {
            this.field2950[var2] = (short) (-this.field2950[var2]);
            this.field2970[var2] = (short) (-this.field2970[var2]);
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 2491)
    public final void method97(int arg0) {
        int var2 = class31.field450[arg0];
        int var3 = class31.field455[arg0];
        for (int var4 = 0; var4 < this.field2954; var4++) {
            int var5 = this.field2955[var4] * var3 - this.field2951[var4] * var2 >> 16;
            this.field2951[var4] = this.field2955[var4] * var2 + this.field2951[var4] * var3 >> 16;
            this.field2955[var4] = var5;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "()I", line = 2514)
    public final int method1322() {
        return this.field2959;
    }

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "()I", line = 2519)
    public final int method1323() {
        return this.field2988;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILub;[[I[[IIII)V", line = 2522)
    public final void method1324(int arg0, int arg1, class183 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2976.field898) {
            arg2.method1303();
        }
        int var9 = arg2.field2976.field894 + arg5;
        int var10 = arg2.field2976.field899 + arg5;
        int var11 = arg2.field2976.field900 + arg7;
        int var12 = arg2.field2976.field897 + arg7;
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
            for (int var17 = 0; var17 < this.field2954; var17++) {
                int var18 = this.field2966[var17] + arg5;
                int var19 = this.field2951[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2955[var17] = this.field2955[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2976.field896;
            for (int var28 = 0; var28 < this.field2954; var28++) {
                int var29 = (this.field2955[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2966[var28] + arg5;
                    int var31 = this.field2951[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2955[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2009(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2976.field893 - arg2.field2976.field896;
            for (int var42 = 0; var42 < this.field2954; var42++) {
                int var43 = this.field2966[var42] + arg5;
                int var44 = this.field2951[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2955[var42] = var51 + this.field2955[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2976.field893 - arg2.field2976.field896;
            for (int var53 = 0; var53 < this.field2954; var53++) {
                int var54 = this.field2966[var53] + arg5;
                int var55 = this.field2951[var53] + arg7;
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
                this.field2955[var53] = ((this.field2955[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2964.field3778 = false;
        this.field2976.field898 = false;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 2719)
    public final void method1325(int arg0) {
        this.field2988 = (short) arg0;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "()V", line = 2725)
    public final void method1326() {
        if (this.field2950 == null) {
            this.method104();
            return;
        }
        for (int var1 = 0; var1 < this.field2954; var1++) {
            int var2 = this.field2966[var1];
            this.field2966[var1] = this.field2951[var1];
            this.field2951[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2967; var3++) {
            short var4 = this.field2950[var3];
            this.field2950[var3] = this.field2970[var3];
            this.field2970[var3] = (short) (-var4);
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "()V", line = 2765)
    public final void method1327() {
        for (int var1 = 0; var1 < this.field2954; var1++) {
            this.field2951[var1] = -this.field2951[var1];
        }
        if (this.field2970 != null) {
            for (int var2 = 0; var2 < this.field2967; var2++) {
                this.field2970[var2] = (short) (-this.field2970[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2986; var3++) {
            short var4 = this.field2965[var3];
            this.field2965[var3] = this.field2961[var3];
            this.field2961[var3] = var4;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
        this.field2977.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[IIIIZ)V", line = 2806)
    private final void method1328(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2997 = 0;
            field2996 = 0;
            field2998 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2956.length) {
                    int[] var14 = this.field2956[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2997 += this.field2966[var16];
                        field2996 += this.field2955[var16];
                        field2998 += this.field2951[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2997 = field2997 / var11 + var8;
                field2996 = field2996 / var11 + var9;
                field2998 = field2998 / var11 + var10;
            } else {
                field2997 = var8;
                field2996 = var9;
                field2998 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2956.length) {
                    int[] var22 = this.field2956[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2966[var24] += var17;
                        this.field2955[var24] += var18;
                        this.field2951[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2956.length) {
                    int[] var27 = this.field2956[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2966[var29] -= field2997;
                        this.field2955[var29] -= field2996;
                        this.field2951[var29] -= field2998;
                        if (arg4 != 0) {
                            int var30 = class31.field450[arg4];
                            int var31 = class31.field455[arg4];
                            int var32 = this.field2966[var29] * var31 + this.field2955[var29] * var30 + 32767 >> 16;
                            this.field2955[var29] = this.field2955[var29] * var31 + 32767 - this.field2966[var29] * var30 >> 16;
                            this.field2966[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class31.field450[arg2];
                            int var34 = class31.field455[arg2];
                            int var35 = this.field2955[var29] * var34 + 32767 - this.field2951[var29] * var33 >> 16;
                            this.field2951[var29] = this.field2955[var29] * var33 + this.field2951[var29] * var34 + 32767 >> 16;
                            this.field2955[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class31.field450[arg3];
                            int var37 = class31.field455[arg3];
                            int var38 = this.field2966[var29] * var37 + this.field2951[var29] * var36 + 32767 >> 16;
                            this.field2951[var29] = this.field2951[var29] * var37 + 32767 - this.field2966[var29] * var36 >> 16;
                            this.field2966[var29] = var38;
                        }
                        this.field2966[var29] += field2997;
                        this.field2955[var29] += field2996;
                        this.field2951[var29] += field2998;
                    }
                }
            }
            if (arg5 && this.field2950 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2956.length) {
                        int[] var41 = this.field2956[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2974[var43];
                            int var45 = this.field2974[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2975[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class31.field450[arg4];
                                    int var49 = class31.field455[arg4];
                                    int var50 = this.field2982[var47] * var48 + this.field2950[var47] * var49 + 32767 >> 16;
                                    this.field2982[var47] = (short) (this.field2982[var47] * var49 + 32767 - this.field2950[var47] * var48 >> 16);
                                    this.field2950[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class31.field450[arg2];
                                    int var52 = class31.field455[arg2];
                                    int var53 = this.field2982[var47] * var52 + 32767 - this.field2970[var47] * var51 >> 16;
                                    this.field2970[var47] = (short) (this.field2982[var47] * var51 + this.field2970[var47] * var52 + 32767 >> 16);
                                    this.field2982[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class31.field450[arg3];
                                    int var55 = class31.field455[arg3];
                                    int var56 = this.field2970[var47] * var54 + this.field2950[var47] * var55 + 32767 >> 16;
                                    this.field2970[var47] = (short) (this.field2970[var47] * var55 + 32767 - this.field2950[var47] * var54 >> 16);
                                    this.field2950[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2969 != null) {
                    this.field2969.field3778 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2956.length) {
                    int[] var59 = this.field2956[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2966[var61] -= field2997;
                        this.field2955[var61] -= field2996;
                        this.field2951[var61] -= field2998;
                        this.field2966[var61] = this.field2966[var61] * arg2 >> 7;
                        this.field2955[var61] = this.field2955[var61] * arg3 >> 7;
                        this.field2951[var61] = this.field2951[var61] * arg4 >> 7;
                        this.field2966[var61] += field2997;
                        this.field2955[var61] += field2996;
                        this.field2951[var61] += field2998;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2978 != null && this.field2981 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field2978.length) {
                    int[] var64 = this.field2978[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field2981[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field2981[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field2962.field3778 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "()V", line = 3149)
    public final void method1329() {
        if (this.field2950 == null) {
            this.method115();
            return;
        }
        for (int var1 = 0; var1 < this.field2954; var1++) {
            int var2 = this.field2951[var1];
            this.field2951[var1] = this.field2966[var1];
            this.field2966[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2967; var3++) {
            short var4 = this.field2970[var3];
            this.field2970[var3] = this.field2950[var3];
            this.field2950[var3] = (short) (-var4);
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I", line = 3189)
    public final int method125() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field896;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V", line = 3195)
    public final void method1330(int arg0) {
        if (this.field2950 == null) {
            this.method109(arg0);
            return;
        }
        int var2 = class31.field450[arg0];
        int var3 = class31.field455[arg0];
        for (int var4 = 0; var4 < this.field2954; var4++) {
            int var5 = this.field2966[var4] * var3 + this.field2951[var4] * var2 >> 16;
            this.field2951[var4] = this.field2951[var4] * var3 - this.field2966[var4] * var2 >> 16;
            this.field2966[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2967; var6++) {
            int var7 = this.field2970[var6] * var2 + this.field2950[var6] * var3 >> 16;
            this.field2970[var6] = (short) (this.field2970[var6] * var3 - this.field2950[var6] * var2 >> 16);
            this.field2950[var6] = (short) var7;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
        if (this.field2969 != null) {
            this.field2969.field3778 = false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "()I", line = 3236)
    public final int method93() {
        if (!this.field2976.field898) {
            this.method1303();
        }
        return this.field2976.field897;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()Z", line = 3242)
    public final boolean method889() {
        return this.field2973 && this.field2966 != null && this.field2950 != null;
    }

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "()V", line = 3247)
    public final void method1331() {
        int var10002;
        if (this.field2979 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2954; var3++) {
                int var4 = this.field2979[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2956 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2956[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2954) {
                int var7 = this.field2979[var6] & 0xFF;
                this.field2956[var7][var1[var7]++] = var6++;
            }
            this.field2979 = null;
        }
        if (this.field2957 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2986; var10++) {
            int var11 = this.field2957[var10] & 0xFF;
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
        while (var13 < this.field2986) {
            int var14 = this.field2957[var13] & 0xFF;
            this.field2978[var14][var8[var14]++] = var13++;
        }
        this.field2957 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3343)
    private static final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field3004 = var16;
        field2999 = var17;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII[FIF)V", line = 3387)
    private static final void method1333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field3003 = var17;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZ)Ljc;", line = 3430)
    public final class287 method113(boolean arg0, boolean arg1) {
        return this.method1300(arg0, arg1, field2993, field2992);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIJ)V", line = 3433)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2967 == 0) {
            return;
        }
        if (!this.field2976.field898) {
            this.method1303();
        }
        short var11 = this.field2976.field895;
        short var12 = this.field2976.field896;
        short var13 = this.field2976.field893;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class174.field2826) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class22.field327) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class302.field5003) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class50.field760) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class31.field450[arg0];
            var25 = class31.field455[arg0];
        }
        if (arg8 > 0L && class104.field1472 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class46.field732 >= var26 && class46.field732 <= var27 && class205.field3315 >= var28 && class205.field3315 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field2976.field894;
                short var35 = this.field2976.field899;
                short var36 = this.field2976.field900;
                short var37 = this.field2976.field897;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class46.field732 >= var30 && class46.field732 <= var31 && class205.field3315 >= var32 && class205.field3315 <= var33) {
                    if (this.field4660) {
                        class91.field1315[class268.field4316++] = arg8;
                    } else {
                        if (field3002.length < this.field2967) {
                            field3002 = new int[this.field2967];
                            field2995 = new int[this.field2967];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field2954) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field2986) {
                                        break label118;
                                    }
                                    short var78 = this.field2965[var77];
                                    short var79 = this.field2971[var77];
                                    short var80 = this.field2961[var77];
                                    if (this.method1334(class46.field732, class205.field3315, field2995[var78], field2995[var79], field2995[var80], field3002[var78], field3002[var79], field3002[var80])) {
                                        class91.field1315[class268.field4316++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field2966[var57];
                            int var59 = this.field2955[var57];
                            int var60 = this.field2951[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field2974[var57];
                            int var74 = this.field2974[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field2975[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3002[var76] = var71;
                                field2995[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class166.field2648;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1317();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V", line = 4454)
    public final void method105(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2954; var4++) {
            this.field2966[var4] += arg0;
            this.field2955[var4] += arg1;
            this.field2951[var4] += arg2;
        }
        this.field2976.field898 = false;
        this.field2964.field3778 = false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIII)Z", line = 4467)
    private final boolean method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
