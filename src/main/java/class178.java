import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class178 extends class49 {

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public int field2904 = 0;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "B")
    public byte field2906 = 0;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Z")
    private boolean field2909 = false;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "I")
    public int field2949 = 0;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "[I")
    public int[] field2944;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "[I")
    public int[] field2941;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "[I")
    public int[] field2931;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "[I")
    private int[] field2920;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "[I")
    public int[] field2917;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "[I")
    public int[] field2950;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "[I")
    public int[] field2918;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "[B")
    public byte[] field2946;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "[B")
    public byte[] field2938;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "[B")
    public byte[] field2912;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "[S")
    public short[] field2922;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "[S")
    public short[] field2940;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "[B")
    public byte[] field2948;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "[I")
    private int[] field2935;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "[B")
    public byte[] field2921;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "[S")
    public short[] field2924;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "[S")
    public short[] field2951;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "[S")
    public short[] field2937;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[S")
    private short[] field2936;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "[S")
    private short[] field2927;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "[S")
    private short[] field2915;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "[B")
    private byte[] field2933;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "[B")
    private byte[] field2942;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[B")
    private byte[] field2905;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "[B")
    private byte[] field2914;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "[B")
    private byte[] field2913;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "[[I")
    public int[][] field2925;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "[[I")
    public int[][] field2910;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "[Lsb;")
    public class207[] field2934;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "[Lof;")
    public class246[] field2926;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "[Lsb;")
    public class207[] field2929;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "S")
    public short field2939;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "S")
    public short field2903;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
    private static int[] field2908 = new int[10000];

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    private static int field2932 = 0;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "[I")
    private static int[] field2945 = class73.field1155;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "[I")
    private static int[] field2911 = new int[10000];

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "[I")
    private static int[] field2943 = class73.field1167;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "S")
    private short field2907;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "S")
    private short field2916;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "S")
    private short field2919;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "S")
    private short field2928;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "S")
    private short field2930;

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "S")
    private short field2947;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(SS)V")
    public final void method1245(short arg0, short arg1) {
        if (this.field2940 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2904; var3++) {
            if (this.field2940[var3] == arg0) {
                this.field2940[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)Ltb;")
    public final class65 method1246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class137(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()Lma;")
    public final class178 method1247() {
        class178 var1 = new class178();
        if (this.field2946 != null) {
            var1.field2946 = new byte[this.field2904];
            for (int var2 = 0; var2 < this.field2904; var2++) {
                var1.field2946[var2] = this.field2946[var2];
            }
        }
        var1.field2949 = this.field2949;
        var1.field2904 = this.field2904;
        var1.field2923 = this.field2923;
        var1.field2944 = this.field2944;
        var1.field2941 = this.field2941;
        var1.field2931 = this.field2931;
        var1.field2917 = this.field2917;
        var1.field2950 = this.field2950;
        var1.field2918 = this.field2918;
        var1.field2938 = this.field2938;
        var1.field2912 = this.field2912;
        var1.field2948 = this.field2948;
        var1.field2922 = this.field2922;
        var1.field2940 = this.field2940;
        var1.field2906 = this.field2906;
        var1.field2921 = this.field2921;
        var1.field2924 = this.field2924;
        var1.field2951 = this.field2951;
        var1.field2937 = this.field2937;
        var1.field2936 = this.field2936;
        var1.field2927 = this.field2927;
        var1.field2915 = this.field2915;
        var1.field2933 = this.field2933;
        var1.field2942 = this.field2942;
        var1.field2905 = this.field2905;
        var1.field2914 = this.field2914;
        var1.field2913 = this.field2913;
        var1.field2920 = this.field2920;
        var1.field2935 = this.field2935;
        var1.field2925 = this.field2925;
        var1.field2910 = this.field2910;
        var1.field2934 = this.field2934;
        var1.field2926 = this.field2926;
        var1.field2939 = this.field2939;
        var1.field2903 = this.field2903;
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([B)V")
    private final void method1248(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class121 var4 = new class121(arg0);
        class121 var5 = new class121(arg0);
        class121 var6 = new class121(arg0);
        class121 var7 = new class121(arg0);
        class121 var8 = new class121(arg0);
        var4.field2026 = arg0.length - 18;
        int var9 = var4.method876(false);
        int var10 = var4.method876(false);
        int var11 = var4.method897(-30);
        int var12 = var4.method897(126);
        int var13 = var4.method897(106);
        int var14 = var4.method897(-63);
        int var15 = var4.method897(-66);
        int var16 = var4.method897(110);
        int var17 = var4.method876(false);
        int var18 = var4.method876(false);
        int var19 = var4.method876(false);
        int var20 = var4.method876(false);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2949 = var9;
        this.field2904 = var10;
        this.field2923 = var11;
        this.field2944 = new int[var9];
        this.field2941 = new int[var9];
        this.field2931 = new int[var9];
        this.field2917 = new int[var10];
        this.field2950 = new int[var10];
        this.field2918 = new int[var10];
        if (var11 > 0) {
            this.field2921 = new byte[var11];
            this.field2924 = new short[var11];
            this.field2951 = new short[var11];
            this.field2937 = new short[var11];
        }
        if (var16 == 1) {
            this.field2920 = new int[var9];
        }
        if (var12 == 1) {
            this.field2946 = new byte[var10];
            this.field2948 = new byte[var10];
            this.field2940 = new short[var10];
        }
        if (var13 == 255) {
            this.field2938 = new byte[var10];
        } else {
            this.field2906 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2912 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2935 = new int[var10];
        }
        this.field2922 = new short[var10];
        var4.field2026 = var21;
        var5.field2026 = var36;
        var6.field2026 = var38;
        var7.field2026 = var40;
        var8.field2026 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method897(110);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method902((byte) 101);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method902((byte) 125);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method902((byte) 78);
            }
            this.field2944[var46] = var43 + var63;
            this.field2941[var46] = var44 + var64;
            this.field2931[var46] = var45 + var65;
            var43 = this.field2944[var46];
            var44 = this.field2941[var46];
            var45 = this.field2931[var46];
            if (var16 == 1) {
                this.field2920[var46] = var8.method897(118);
            }
        }
        var4.field2026 = var32;
        var5.field2026 = var28;
        var6.field2026 = var26;
        var7.field2026 = var30;
        var8.field2026 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2922[var47] = (short) var4.method876(false);
            if (var12 == 1) {
                int var61 = var5.method897(-79);
                if ((var61 & 0x1) == 1) {
                    this.field2946[var47] = 1;
                    var2 = true;
                } else {
                    this.field2946[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2948[var47] = (byte) (var61 >> 2);
                    this.field2940[var47] = this.field2922[var47];
                    this.field2922[var47] = 127;
                    if (this.field2940[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2948[var47] = -1;
                    this.field2940[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2938[var47] = var6.method912((byte) -90);
            }
            if (var14 == 1) {
                this.field2912[var47] = var7.method912((byte) -90);
            }
            if (var15 == 1) {
                this.field2935[var47] = var8.method897(-119);
            }
        }
        var4.field2026 = var25;
        var5.field2026 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method897(109);
            if (var57 == 1) {
                var48 = var4.method902((byte) 15) + var51;
                var49 = var4.method902((byte) 108) + var48;
                var50 = var4.method902((byte) 21) + var49;
                var51 = var50;
                this.field2917[var52] = var48;
                this.field2950[var52] = var49;
                this.field2918[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method902((byte) 116) + var51;
                var51 = var50;
                this.field2917[var52] = var48;
                this.field2950[var52] = var49;
                this.field2918[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method902((byte) 93) + var51;
                var51 = var50;
                this.field2917[var52] = var48;
                this.field2950[var52] = var49;
                this.field2918[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method902((byte) 119) + var51;
                var51 = var50;
                this.field2917[var52] = var48;
                this.field2950[var52] = var60;
                this.field2918[var52] = var50;
            }
        }
        var4.field2026 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2921[var53] = 0;
            this.field2924[var53] = (short) var4.method876(false);
            this.field2951[var53] = (short) var4.method876(false);
            this.field2937[var53] = (short) var4.method876(false);
        }
        if (this.field2948 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2948[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2924[var56] & 0xFFFF) == this.field2917[var55] && (this.field2951[var56] & 0xFFFF) == this.field2950[var55] && (this.field2937[var56] & 0xFFFF) == this.field2918[var55]) {
                        this.field2948[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2948 = null;
            }
        }
        if (!var3) {
            this.field2940 = null;
        }
        if (!var2) {
            this.field2946 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
    private final void method1249() {
        this.field2934 = null;
        this.field2929 = null;
        this.field2926 = null;
        this.field2909 = false;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()V")
    public final void method1250() {
        this.field2920 = null;
        this.field2935 = null;
        this.field2925 = null;
        this.field2910 = null;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public final void method1251(int arg0) {
        int var2 = field2945[arg0];
        int var3 = field2943[arg0];
        for (int var4 = 0; var4 < this.field2949; var4++) {
            int var5 = this.field2944[var4] * var3 + this.field2931[var4] * var2 >> 16;
            this.field2931[var4] = this.field2931[var4] * var3 - this.field2944[var4] * var2 >> 16;
            this.field2944[var4] = var5;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[IIIIII)V")
    private final void method1252(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1253(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1253(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1253(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1253(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1270(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1259(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1273(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[III)I")
    private static final int method1253(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[[I[[IIIIZZ)Lma;")
    public final class178 method1254(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1264();
        int var10 = this.field2930 + arg4;
        int var11 = this.field2919 + arg4;
        int var12 = this.field2916 + arg6;
        int var13 = this.field2928 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class178 var18;
        if (arg7) {
            var18 = new class178();
            var18.field2949 = this.field2949;
            var18.field2904 = this.field2904;
            var18.field2923 = this.field2923;
            var18.field2917 = this.field2917;
            var18.field2950 = this.field2950;
            var18.field2918 = this.field2918;
            var18.field2946 = this.field2946;
            var18.field2938 = this.field2938;
            var18.field2912 = this.field2912;
            var18.field2948 = this.field2948;
            var18.field2922 = this.field2922;
            var18.field2940 = this.field2940;
            var18.field2906 = this.field2906;
            var18.field2921 = this.field2921;
            var18.field2924 = this.field2924;
            var18.field2951 = this.field2951;
            var18.field2937 = this.field2937;
            var18.field2936 = this.field2936;
            var18.field2927 = this.field2927;
            var18.field2915 = this.field2915;
            var18.field2933 = this.field2933;
            var18.field2942 = this.field2942;
            var18.field2905 = this.field2905;
            var18.field2914 = this.field2914;
            var18.field2913 = this.field2913;
            var18.field2920 = this.field2920;
            var18.field2935 = this.field2935;
            var18.field2925 = this.field2925;
            var18.field2910 = this.field2910;
            var18.field2939 = this.field2939;
            var18.field2903 = this.field2903;
            var18.field2934 = this.field2934;
            var18.field2926 = this.field2926;
            var18.field2929 = this.field2929;
            if (arg0 == 3) {
                var18.field2944 = class172.method1210(80, this.field2944);
                var18.field2941 = class172.method1210(80, this.field2941);
                var18.field2931 = class172.method1210(80, this.field2931);
            } else {
                var18.field2944 = this.field2944;
                var18.field2941 = new int[var18.field2949];
                var18.field2931 = this.field2931;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2949; var19++) {
                int var20 = this.field2944[var19] + arg4;
                int var21 = this.field2931[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2941[var19] = this.field2941[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2949; var29++) {
                int var30 = (this.field2941[var29] << 16) / this.field2947;
                if (var30 < arg1) {
                    int var31 = this.field2944[var29] + arg4;
                    int var32 = this.field2931[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2941[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2941[var29];
                } else {
                    var18.field2941[var29] = this.field2941[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1252(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2907 - this.field2947;
            for (int var43 = 0; var43 < this.field2949; var43++) {
                int var44 = this.field2944[var43] + arg4;
                int var45 = this.field2931[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2941[var43] = var52 + this.field2941[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2907 - this.field2947;
            for (int var54 = 0; var54 < this.field2949; var54++) {
                int var55 = this.field2944[var54] + arg4;
                int var56 = this.field2931[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2941[var54] = ((this.field2941[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1249();
        } else {
            this.field2909 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lkb;")
    public final class49 method260(int arg0, int arg1, int arg2) {
        return this.method1246(this.field2939, this.field2903, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "()V")
    public final void method1255() {
        for (int var1 = 0; var1 < this.field2949; var1++) {
            int var2 = this.field2931[var1];
            this.field2931[var1] = this.field2944[var1];
            this.field2944[var1] = -var2;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lma;I)I")
    private final int method1256(class178 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2944[arg1];
        int var5 = arg0.field2941[arg1];
        int var6 = arg0.field2931[arg1];
        for (int var7 = 0; var7 < this.field2949; var7++) {
            if (this.field2944[var7] == var4 && this.field2941[var7] == var5 && this.field2931[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2944[this.field2949] = var4;
            this.field2941[this.field2949] = var5;
            this.field2931[this.field2949] = var6;
            if (arg0.field2920 != null) {
                this.field2920[this.field2949] = arg0.field2920[arg1];
            }
            var3 = this.field2949++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "()V")
    public final void method1257() {
        for (int var1 = 0; var1 < this.field2949; var1++) {
            this.field2944[var1] = -this.field2944[var1];
            this.field2931[var1] = -this.field2931[var1];
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "()V")
    public final void method1258() {
        for (int var1 = 0; var1 < this.field2949; var1++) {
            int var2 = this.field2944[var1];
            this.field2944[var1] = this.field2931[var1];
            this.field2931[var1] = -var2;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lkb;IIIZ)V")
    public final void method261(class49 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class178 var6 = (class178) arg0;
        var6.method1264();
        var6.method1268();
        field2932++;
        int var7 = 0;
        int[] var8 = var6.field2944;
        int var9 = var6.field2949;
        for (int var10 = 0; var10 < this.field2949; var10++) {
            class207 var13 = this.field2934[var10];
            if (var13.field3463 != 0) {
                int var14 = this.field2941[var10] - arg2;
                if (var14 >= var6.field2947 && var14 <= var6.field2907) {
                    int var15 = this.field2944[var10] - arg1;
                    if (var15 >= var6.field2930 && var15 <= var6.field2919) {
                        int var16 = this.field2931[var10] - arg3;
                        if (var16 >= var6.field2916 && var16 <= var6.field2928) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class207 var18 = var6.field2934[var17];
                                if (var8[var17] == var15 && var6.field2931[var17] == var16 && var6.field2941[var17] == var14 && var18.field3463 != 0) {
                                    if (this.field2929 == null) {
                                        this.field2929 = new class207[this.field2949];
                                    }
                                    if (var6.field2929 == null) {
                                        var6.field2929 = new class207[var9];
                                    }
                                    class207 var19 = this.field2929[var10];
                                    if (var19 == null) {
                                        var19 = this.field2929[var10] = new class207(var13);
                                    }
                                    class207 var20 = var6.field2929[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2929[var17] = new class207(var18);
                                    }
                                    var19.field3464 += var18.field3464;
                                    var19.field3458 += var18.field3458;
                                    var19.field3462 += var18.field3462;
                                    var19.field3463 += var18.field3463;
                                    var20.field3464 += var13.field3464;
                                    var20.field3458 += var13.field3458;
                                    var20.field3462 += var13.field3462;
                                    var20.field3463 += var13.field3463;
                                    var7++;
                                    field2908[var10] = field2932;
                                    field2911[var17] = field2932;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2904; var11++) {
            if (field2908[this.field2917[var11]] == field2932 && field2908[this.field2950[var11]] == field2932 && field2908[this.field2918[var11]] == field2932) {
                if (this.field2946 == null) {
                    this.field2946 = new byte[this.field2904];
                }
                this.field2946[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2904; var12++) {
            if (field2911[var6.field2917[var12]] == field2932 && field2911[var6.field2950[var12]] == field2932 && field2911[var6.field2918[var12]] == field2932) {
                if (var6.field2946 == null) {
                    var6.field2946 = new byte[var6.field2904];
                }
                var6.field2946[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    private final void method1259(int arg0) {
        int var2 = field2945[arg0];
        int var3 = field2943[arg0];
        for (int var4 = 0; var4 < this.field2949; var4++) {
            int var5 = this.field2944[var4] * var3 + this.field2941[var4] * var2 >> 16;
            this.field2941[var4] = this.field2941[var4] * var3 - this.field2944[var4] * var2 >> 16;
            this.field2944[var4] = var5;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(SS)V")
    public final void method1260(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2904; var3++) {
            if (this.field2922[var3] == arg0) {
                this.field2922[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V")
    public final void method1261(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2949; var4++) {
            this.field2944[var4] = this.field2944[var4] * arg0 / 128;
            this.field2941[var4] = this.field2941[var4] * arg1 / 128;
            this.field2931[var4] = this.field2931[var4] * arg2 / 128;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "()V")
    public static void method1262() {
        field2908 = null;
        field2911 = null;
        field2945 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(III)I")
    public final int method1263(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2949; var4++) {
            if (this.field2944[var4] == arg0 && this.field2941[var4] == arg1 && this.field2931[var4] == arg2) {
                return var4;
            }
        }
        this.field2944[this.field2949] = arg0;
        this.field2941[this.field2949] = arg1;
        this.field2931[this.field2949] = arg2;
        return this.field2949++;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "()V")
    private final void method1264() {
        if (this.field2909) {
            return;
        }
        this.field2909 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2949; var7++) {
            int var8 = this.field2944[var7];
            int var9 = this.field2941[var7];
            int var10 = this.field2931[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2930 = (short) var1;
        this.field2919 = (short) var4;
        this.field2947 = (short) var2;
        this.field2907 = (short) var5;
        this.field2916 = (short) var3;
        this.field2928 = (short) var6;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(III)V")
    public final void method1265(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2945[arg2];
            int var5 = field2943[arg2];
            for (int var6 = 0; var6 < this.field2949; var6++) {
                int var7 = this.field2944[var6] * var5 + this.field2941[var6] * var4 >> 16;
                this.field2941[var6] = this.field2941[var6] * var5 - this.field2944[var6] * var4 >> 16;
                this.field2944[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2945[arg0];
            int var9 = field2943[arg0];
            for (int var10 = 0; var10 < this.field2949; var10++) {
                int var11 = this.field2941[var10] * var9 - this.field2931[var10] * var8 >> 16;
                this.field2931[var10] = this.field2941[var10] * var8 + this.field2931[var10] * var9 >> 16;
                this.field2941[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2945[arg1];
        int var13 = field2943[arg1];
        for (int var14 = 0; var14 < this.field2949; var14++) {
            int var15 = this.field2944[var14] * var13 + this.field2931[var14] * var12 >> 16;
            this.field2931[var14] = this.field2931[var14] * var13 - this.field2944[var14] * var12 >> 16;
            this.field2944[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "()V")
    public final void method1266() {
        int var10002;
        if (this.field2920 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2949; var3++) {
                int var7 = this.field2920[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2925 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2925[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2949) {
                int var6 = this.field2920[var5];
                this.field2925[var6][var1[var6]++] = var5++;
            }
            this.field2920 = null;
        }
        if (this.field2935 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2904; var10++) {
            int var14 = this.field2935[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2910 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2910[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2904) {
            int var13 = this.field2935[var12];
            this.field2910[var13][var8[var13]++] = var12++;
        }
        this.field2935 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lu;II)Lma;")
    public static final class178 method1267(class111 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method828(arg1, (byte) 97, arg2);
        return var3 == null ? null : new class178(var3);
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "()V")
    public final void method1268() {
        if (this.field2934 != null) {
            return;
        }
        this.field2934 = new class207[this.field2949];
        for (int var1 = 0; var1 < this.field2949; var1++) {
            this.field2934[var1] = new class207();
        }
        for (int var2 = 0; var2 < this.field2904; var2++) {
            int var3 = this.field2917[var2];
            int var4 = this.field2950[var2];
            int var5 = this.field2918[var2];
            int var6 = this.field2944[var4] - this.field2944[var3];
            int var7 = this.field2941[var4] - this.field2941[var3];
            int var8 = this.field2931[var4] - this.field2931[var3];
            int var9 = this.field2944[var5] - this.field2944[var3];
            int var10 = this.field2941[var5] - this.field2941[var3];
            int var11 = this.field2931[var5] - this.field2931[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2946 == null) {
                var19 = 0;
            } else {
                var19 = this.field2946[var2];
            }
            if (var19 == 0) {
                class207 var20 = this.field2934[var3];
                var20.field3464 += var16;
                var20.field3458 += var17;
                var20.field3462 += var18;
                var20.field3463++;
                class207 var21 = this.field2934[var4];
                var21.field3464 += var16;
                var21.field3458 += var17;
                var21.field3462 += var18;
                var21.field3463++;
                class207 var22 = this.field2934[var5];
                var22.field3464 += var16;
                var22.field3458 += var17;
                var22.field3462 += var18;
                var22.field3463++;
            } else if (var19 == 1) {
                if (this.field2926 == null) {
                    this.field2926 = new class246[this.field2904];
                }
                class246 var23 = this.field2926[var2] = new class246();
                var23.field4261 = var16;
                var23.field4265 = var17;
                var23.field4267 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIII)Lab;")
    public final class137 method1269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class137(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
    public final boolean method259() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    private final void method1270(int arg0) {
        int var2 = field2945[arg0];
        int var3 = field2943[arg0];
        for (int var4 = 0; var4 < this.field2949; var4++) {
            int var5 = this.field2941[var4] * var3 - this.field2931[var4] * var2 >> 16;
            this.field2931[var4] = this.field2941[var4] * var2 + this.field2931[var4] * var3 >> 16;
            this.field2941[var4] = var5;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "()V")
    public final void method1271() {
        for (int var1 = 0; var1 < this.field2949; var1++) {
            this.field2931[var1] = -this.field2931[var1];
        }
        for (int var2 = 0; var2 < this.field2904; var2++) {
            int var3 = this.field2917[var2];
            this.field2917[var2] = this.field2918[var2];
            this.field2918[var2] = var3;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([B)V")
    private final void method1272(byte[] arg0) {
        class121 var2 = new class121(arg0);
        class121 var3 = new class121(arg0);
        class121 var4 = new class121(arg0);
        class121 var5 = new class121(arg0);
        class121 var6 = new class121(arg0);
        class121 var7 = new class121(arg0);
        class121 var8 = new class121(arg0);
        var2.field2026 = arg0.length - 23;
        int var9 = var2.method876(false);
        int var10 = var2.method876(false);
        int var11 = var2.method897(-115);
        int var12 = var2.method897(106);
        int var13 = var2.method897(112);
        int var14 = var2.method897(-101);
        int var15 = var2.method897(-110);
        int var16 = var2.method897(-79);
        int var17 = var2.method897(-107);
        int var18 = var2.method876(false);
        int var19 = var2.method876(false);
        int var20 = var2.method876(false);
        int var21 = var2.method876(false);
        int var22 = var2.method876(false);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2921 = new byte[var11];
            var2.field2026 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2921[var26] = var2.method912((byte) -90);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2949 = var9;
        this.field2904 = var10;
        this.field2923 = var11;
        this.field2944 = new int[var9];
        this.field2941 = new int[var9];
        this.field2931 = new int[var9];
        this.field2917 = new int[var10];
        this.field2950 = new int[var10];
        this.field2918 = new int[var10];
        if (var17 == 1) {
            this.field2920 = new int[var9];
        }
        if (var12 == 1) {
            this.field2946 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2938 = new byte[var10];
        } else {
            this.field2906 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2912 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2935 = new int[var10];
        }
        if (var16 == 1) {
            this.field2940 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2948 = new byte[var10];
        }
        this.field2922 = new short[var10];
        if (var11 > 0) {
            this.field2924 = new short[var11];
            this.field2951 = new short[var11];
            this.field2937 = new short[var11];
            if (var24 > 0) {
                this.field2936 = new short[var24];
                this.field2927 = new short[var24];
                this.field2915 = new short[var24];
                this.field2933 = new byte[var24];
                this.field2942 = new byte[var24];
                this.field2905 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2914 = new byte[var25];
                this.field2913 = new byte[var25];
            }
        }
        var2.field2026 = var11;
        var3.field2026 = var44;
        var4.field2026 = var46;
        var5.field2026 = var48;
        var6.field2026 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method897(-124);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method902((byte) 99);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method902((byte) 70);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method902((byte) 67);
            }
            this.field2944[var66] = var63 + var80;
            this.field2941[var66] = var64 + var81;
            this.field2931[var66] = var65 + var82;
            var63 = this.field2944[var66];
            var64 = this.field2941[var66];
            var65 = this.field2931[var66];
            if (var17 == 1) {
                this.field2920[var66] = var6.method897(121);
            }
        }
        var2.field2026 = var42;
        var3.field2026 = var31;
        var4.field2026 = var34;
        var5.field2026 = var37;
        var6.field2026 = var35;
        var7.field2026 = var40;
        var8.field2026 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2922[var67] = (short) var2.method876(false);
            if (var12 == 1) {
                this.field2946[var67] = var3.method912((byte) -90);
            }
            if (var13 == 255) {
                this.field2938[var67] = var4.method912((byte) -90);
            }
            if (var14 == 1) {
                this.field2912[var67] = var5.method912((byte) -90);
            }
            if (var15 == 1) {
                this.field2935[var67] = var6.method897(110);
            }
            if (var16 == 1) {
                this.field2940[var67] = (short) (var7.method876(false) - 1);
            }
            if (this.field2948 != null) {
                if (this.field2940[var67] == -1) {
                    this.field2948[var67] = -1;
                } else {
                    this.field2948[var67] = (byte) (var8.method897(-91) - 1);
                }
            }
        }
        var2.field2026 = var33;
        var3.field2026 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method897(-97);
            if (var75 == 1) {
                var68 = var2.method902((byte) 63) + var71;
                var69 = var2.method902((byte) 107) + var68;
                var70 = var2.method902((byte) 97) + var69;
                var71 = var70;
                this.field2917[var72] = var68;
                this.field2950[var72] = var69;
                this.field2918[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method902((byte) 17) + var71;
                var71 = var70;
                this.field2917[var72] = var68;
                this.field2950[var72] = var69;
                this.field2918[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method902((byte) 40) + var71;
                var71 = var70;
                this.field2917[var72] = var68;
                this.field2950[var72] = var69;
                this.field2918[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method902((byte) 104) + var71;
                var71 = var70;
                this.field2917[var72] = var68;
                this.field2950[var72] = var78;
                this.field2918[var72] = var70;
            }
        }
        var2.field2026 = var50;
        var3.field2026 = var52;
        var4.field2026 = var54;
        var5.field2026 = var56;
        var6.field2026 = var58;
        var7.field2026 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2921[var73] & 0xFF;
            if (var74 == 0) {
                this.field2924[var73] = (short) var2.method876(false);
                this.field2951[var73] = (short) var2.method876(false);
                this.field2937[var73] = (short) var2.method876(false);
            }
            if (var74 == 1) {
                this.field2924[var73] = (short) var3.method876(false);
                this.field2951[var73] = (short) var3.method876(false);
                this.field2937[var73] = (short) var3.method876(false);
                this.field2936[var73] = (short) var4.method876(false);
                this.field2927[var73] = (short) var4.method876(false);
                this.field2915[var73] = (short) var4.method876(false);
                this.field2933[var73] = var5.method912((byte) -90);
                this.field2942[var73] = var6.method912((byte) -90);
                this.field2905[var73] = var7.method912((byte) -90);
            }
            if (var74 == 2) {
                this.field2924[var73] = (short) var3.method876(false);
                this.field2951[var73] = (short) var3.method876(false);
                this.field2937[var73] = (short) var3.method876(false);
                this.field2936[var73] = (short) var4.method876(false);
                this.field2927[var73] = (short) var4.method876(false);
                this.field2915[var73] = (short) var4.method876(false);
                this.field2933[var73] = var5.method912((byte) -90);
                this.field2942[var73] = var6.method912((byte) -90);
                this.field2905[var73] = var7.method912((byte) -90);
                this.field2914[var73] = var7.method912((byte) -90);
                this.field2913[var73] = var7.method912((byte) -90);
            }
            if (var74 == 3) {
                this.field2924[var73] = (short) var3.method876(false);
                this.field2951[var73] = (short) var3.method876(false);
                this.field2937[var73] = (short) var3.method876(false);
                this.field2936[var73] = (short) var4.method876(false);
                this.field2927[var73] = (short) var4.method876(false);
                this.field2915[var73] = (short) var4.method876(false);
                this.field2933[var73] = var5.method912((byte) -90);
                this.field2942[var73] = var6.method912((byte) -90);
                this.field2905[var73] = var7.method912((byte) -90);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
    public final int method94() {
        if (!this.field2909) {
            this.method1264();
        }
        return this.field2947;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(III)V")
    public final void method1273(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2949; var4++) {
            this.field2944[var4] += arg0;
            this.field2941[var4] += arg1;
            this.field2931[var4] += arg2;
        }
        this.method1249();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIBSB)I")
    public final int method1274(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2917[this.field2904] = arg0;
        this.field2950[this.field2904] = arg1;
        this.field2918[this.field2904] = arg2;
        this.field2946[this.field2904] = arg3;
        this.field2948[this.field2904] = -1;
        this.field2922[this.field2904] = arg4;
        this.field2940[this.field2904] = -1;
        this.field2912[this.field2904] = arg5;
        return this.field2904++;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    private class178() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
    private class178(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1272(arg0);
        } else {
            this.method1248(arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
    public class178(int arg0, int arg1, int arg2) {
        this.field2944 = new int[arg0];
        this.field2941 = new int[arg0];
        this.field2931 = new int[arg0];
        this.field2920 = new int[arg0];
        this.field2917 = new int[arg1];
        this.field2950 = new int[arg1];
        this.field2918 = new int[arg1];
        this.field2946 = new byte[arg1];
        this.field2938 = new byte[arg1];
        this.field2912 = new byte[arg1];
        this.field2922 = new short[arg1];
        this.field2940 = new short[arg1];
        this.field2948 = new byte[arg1];
        this.field2935 = new int[arg1];
        if (arg2 > 0) {
            this.field2921 = new byte[arg2];
            this.field2924 = new short[arg2];
            this.field2951 = new short[arg2];
            this.field2937 = new short[arg2];
            this.field2936 = new short[arg2];
            this.field2927 = new short[arg2];
            this.field2915 = new short[arg2];
            this.field2933 = new byte[arg2];
            this.field2942 = new byte[arg2];
            this.field2905 = new byte[arg2];
            this.field2914 = new byte[arg2];
            this.field2913 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([Lma;I)V")
    public class178(class178[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2949 = 0;
        this.field2904 = 0;
        this.field2923 = 0;
        this.field2906 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class178 var15 = arg0[var9];
            if (var15 != null) {
                this.field2949 += var15.field2949;
                this.field2904 += var15.field2904;
                this.field2923 += var15.field2923;
                if (var15.field2938 == null) {
                    if (this.field2906 == -1) {
                        this.field2906 = var15.field2906;
                    }
                    if (this.field2906 != var15.field2906) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2946 != null;
                var5 |= var15.field2912 != null;
                var6 |= var15.field2935 != null;
                var7 |= var15.field2940 != null;
                var8 |= var15.field2948 != null;
            }
        }
        this.field2944 = new int[this.field2949];
        this.field2941 = new int[this.field2949];
        this.field2931 = new int[this.field2949];
        this.field2920 = new int[this.field2949];
        this.field2917 = new int[this.field2904];
        this.field2950 = new int[this.field2904];
        this.field2918 = new int[this.field2904];
        if (var3) {
            this.field2946 = new byte[this.field2904];
        }
        if (var4) {
            this.field2938 = new byte[this.field2904];
        }
        if (var5) {
            this.field2912 = new byte[this.field2904];
        }
        if (var6) {
            this.field2935 = new int[this.field2904];
        }
        if (var7) {
            this.field2940 = new short[this.field2904];
        }
        if (var8) {
            this.field2948 = new byte[this.field2904];
        }
        this.field2922 = new short[this.field2904];
        if (this.field2923 > 0) {
            this.field2921 = new byte[this.field2923];
            this.field2924 = new short[this.field2923];
            this.field2951 = new short[this.field2923];
            this.field2937 = new short[this.field2923];
            this.field2936 = new short[this.field2923];
            this.field2927 = new short[this.field2923];
            this.field2915 = new short[this.field2923];
            this.field2933 = new byte[this.field2923];
            this.field2942 = new byte[this.field2923];
            this.field2905 = new byte[this.field2923];
            this.field2914 = new byte[this.field2923];
            this.field2913 = new byte[this.field2923];
        }
        this.field2949 = 0;
        this.field2904 = 0;
        this.field2923 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class178 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2904; var12++) {
                    if (var3 && var11.field2946 != null) {
                        this.field2946[this.field2904] = var11.field2946[var12];
                    }
                    if (var4) {
                        if (var11.field2938 == null) {
                            this.field2938[this.field2904] = var11.field2906;
                        } else {
                            this.field2938[this.field2904] = var11.field2938[var12];
                        }
                    }
                    if (var5 && var11.field2912 != null) {
                        this.field2912[this.field2904] = var11.field2912[var12];
                    }
                    if (var6 && var11.field2935 != null) {
                        this.field2935[this.field2904] = var11.field2935[var12];
                    }
                    if (var7) {
                        if (var11.field2940 == null) {
                            this.field2940[this.field2904] = -1;
                        } else {
                            this.field2940[this.field2904] = var11.field2940[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2948 == null || var11.field2948[var12] == -1) {
                            this.field2948[this.field2904] = -1;
                        } else {
                            this.field2948[this.field2904] = (byte) (var11.field2948[var12] + this.field2923);
                        }
                    }
                    this.field2922[this.field2904] = var11.field2922[var12];
                    this.field2917[this.field2904] = this.method1256(var11, var11.field2917[var12]);
                    this.field2950[this.field2904] = this.method1256(var11, var11.field2950[var12]);
                    this.field2918[this.field2904] = this.method1256(var11, var11.field2918[var12]);
                    this.field2904++;
                }
                for (int var13 = 0; var13 < var11.field2923; var13++) {
                    byte var14 = this.field2921[this.field2923] = var11.field2921[var13];
                    if (var14 == 0) {
                        this.field2924[this.field2923] = (short) this.method1256(var11, var11.field2924[var13]);
                        this.field2951[this.field2923] = (short) this.method1256(var11, var11.field2951[var13]);
                        this.field2937[this.field2923] = (short) this.method1256(var11, var11.field2937[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2924[this.field2923] = var11.field2924[var13];
                        this.field2951[this.field2923] = var11.field2951[var13];
                        this.field2937[this.field2923] = var11.field2937[var13];
                        this.field2936[this.field2923] = var11.field2936[var13];
                        this.field2927[this.field2923] = var11.field2927[var13];
                        this.field2915[this.field2923] = var11.field2915[var13];
                        this.field2933[this.field2923] = var11.field2933[var13];
                        this.field2942[this.field2923] = var11.field2942[var13];
                        this.field2905[this.field2923] = var11.field2905[var13];
                    }
                    if (var14 == 2) {
                        this.field2914[this.field2923] = var11.field2914[var13];
                        this.field2913[this.field2923] = var11.field2913[var13];
                    }
                    this.field2923++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lma;ZZZZ)V")
    public class178(class178 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2949 = arg0.field2949;
        this.field2904 = arg0.field2904;
        this.field2923 = arg0.field2923;
        if (arg1) {
            this.field2944 = arg0.field2944;
            this.field2941 = arg0.field2941;
            this.field2931 = arg0.field2931;
        } else {
            this.field2944 = new int[this.field2949];
            this.field2941 = new int[this.field2949];
            this.field2931 = new int[this.field2949];
            for (int var6 = 0; var6 < this.field2949; var6++) {
                this.field2944[var6] = arg0.field2944[var6];
                this.field2941[var6] = arg0.field2941[var6];
                this.field2931[var6] = arg0.field2931[var6];
            }
        }
        if (arg2) {
            this.field2922 = arg0.field2922;
        } else {
            this.field2922 = new short[this.field2904];
            for (int var7 = 0; var7 < this.field2904; var7++) {
                this.field2922[var7] = arg0.field2922[var7];
            }
        }
        if (arg3 || arg0.field2940 == null) {
            this.field2940 = arg0.field2940;
        } else {
            this.field2940 = new short[this.field2904];
            for (int var8 = 0; var8 < this.field2904; var8++) {
                this.field2940[var8] = arg0.field2940[var8];
            }
        }
        if (arg4) {
            this.field2912 = arg0.field2912;
        } else {
            this.field2912 = new byte[this.field2904];
            if (arg0.field2912 == null) {
                for (int var9 = 0; var9 < this.field2904; var9++) {
                    this.field2912[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2904; var10++) {
                    this.field2912[var10] = arg0.field2912[var10];
                }
            }
        }
        this.field2917 = arg0.field2917;
        this.field2950 = arg0.field2950;
        this.field2918 = arg0.field2918;
        this.field2946 = arg0.field2946;
        this.field2938 = arg0.field2938;
        this.field2948 = arg0.field2948;
        this.field2906 = arg0.field2906;
        this.field2921 = arg0.field2921;
        this.field2924 = arg0.field2924;
        this.field2951 = arg0.field2951;
        this.field2937 = arg0.field2937;
        this.field2936 = arg0.field2936;
        this.field2927 = arg0.field2927;
        this.field2915 = arg0.field2915;
        this.field2933 = arg0.field2933;
        this.field2942 = arg0.field2942;
        this.field2905 = arg0.field2905;
        this.field2914 = arg0.field2914;
        this.field2913 = arg0.field2913;
        this.field2920 = arg0.field2920;
        this.field2935 = arg0.field2935;
        this.field2925 = arg0.field2925;
        this.field2910 = arg0.field2910;
        this.field2934 = arg0.field2934;
        this.field2926 = arg0.field2926;
        this.field2929 = arg0.field2929;
        this.field2939 = arg0.field2939;
        this.field2903 = arg0.field2903;
    }
}
