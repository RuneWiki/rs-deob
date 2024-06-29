import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class168 extends class226 {

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field2885 = 0;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public int field2892 = 0;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Z")
    private boolean field2907 = false;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "B")
    public byte field2928 = 0;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "[I")
    public int[] field2910;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
    public int[] field2919;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "[I")
    public int[] field2927;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "[I")
    public int[] field2932;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "[I")
    public int[] field2925;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "[I")
    public int[] field2884;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "[I")
    public int[] field2923;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[B")
    public byte[] field2886;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "[B")
    public byte[] field2922;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "[B")
    public byte[] field2909;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "[S")
    public short[] field2894;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[S")
    public short[] field2887;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "[B")
    public byte[] field2893;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "[I")
    public int[] field2914;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "[B")
    public byte[] field2913;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "[S")
    public short[] field2901;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[S")
    public short[] field2898;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "[S")
    public short[] field2924;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[S")
    public short[] field2891;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[S")
    public short[] field2903;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "[S")
    public short[] field2896;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "[B")
    public byte[] field2931;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "[B")
    public byte[] field2906;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "[B")
    public byte[] field2929;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[B")
    public byte[] field2890;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "[B")
    public byte[] field2902;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "[[I")
    public int[][] field2895;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "[[I")
    public int[][] field2905;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "[Ldi;")
    public class143[] field2916;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[Lsc;")
    public class250[] field2897;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "[Ldi;")
    public class143[] field2915;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "S")
    public short field2889;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "S")
    public short field2888;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "[I")
    private static int[] field2899 = new int[10000];

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "[I")
    private static int[] field2917 = new int[10000];

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "[I")
    private static int[] field2918 = class141.field2424;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    private static int field2930 = 0;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "[I")
    private static int[] field2904 = class141.field2411;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "S")
    private short field2900;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "S")
    private short field2908;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "S")
    private short field2911;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "S")
    private short field2912;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "S")
    private short field2920;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "S")
    private short field2926;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIBSB)I", line = 4)
    public final int method1100(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2925[this.field2885] = arg0;
        this.field2884[this.field2885] = arg1;
        this.field2923[this.field2885] = arg2;
        this.field2886[this.field2885] = arg3;
        this.field2893[this.field2885] = -1;
        this.field2894[this.field2885] = arg4;
        this.field2887[this.field2885] = -1;
        this.field2909[this.field2885] = arg5;
        return this.field2885++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()Lig;", line = 27)
    public final class168 method1101() {
        class168 var1 = new class168();
        if (this.field2886 != null) {
            var1.field2886 = new byte[this.field2885];
            for (int var2 = 0; var2 < this.field2885; var2++) {
                var1.field2886[var2] = this.field2886[var2];
            }
        }
        var1.field2892 = this.field2892;
        var1.field2885 = this.field2885;
        var1.field2921 = this.field2921;
        var1.field2910 = this.field2910;
        var1.field2919 = this.field2919;
        var1.field2927 = this.field2927;
        var1.field2925 = this.field2925;
        var1.field2884 = this.field2884;
        var1.field2923 = this.field2923;
        var1.field2922 = this.field2922;
        var1.field2909 = this.field2909;
        var1.field2893 = this.field2893;
        var1.field2894 = this.field2894;
        var1.field2887 = this.field2887;
        var1.field2928 = this.field2928;
        var1.field2913 = this.field2913;
        var1.field2901 = this.field2901;
        var1.field2898 = this.field2898;
        var1.field2924 = this.field2924;
        var1.field2891 = this.field2891;
        var1.field2903 = this.field2903;
        var1.field2896 = this.field2896;
        var1.field2931 = this.field2931;
        var1.field2906 = this.field2906;
        var1.field2929 = this.field2929;
        var1.field2890 = this.field2890;
        var1.field2902 = this.field2902;
        var1.field2932 = this.field2932;
        var1.field2914 = this.field2914;
        var1.field2895 = this.field2895;
        var1.field2905 = this.field2905;
        var1.field2916 = this.field2916;
        var1.field2897 = this.field2897;
        var1.field2889 = this.field2889;
        var1.field2888 = this.field2888;
        return var1;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 81)
    private final void method1102(int arg0) {
        int var2 = field2918[arg0];
        int var3 = field2904[arg0];
        for (int var4 = 0; var4 < this.field2892; var4++) {
            int var5 = this.field2919[var4] * var3 - this.field2927[var4] * var2 >> 16;
            this.field2927[var4] = this.field2927[var4] * var3 + this.field2919[var4] * var2 >> 16;
            this.field2919[var4] = var5;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)I", line = 102)
    public final int method1103(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2892; var4++) {
            if (this.field2910[var4] == arg0 && this.field2919[var4] == arg1 && this.field2927[var4] == arg2) {
                return var4;
            }
        }
        this.field2910[this.field2892] = arg0;
        this.field2919[this.field2892] = arg1;
        this.field2927[this.field2892] = arg2;
        return this.field2892++;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()V", line = 115)
    public static void method1104() {
        field2917 = null;
        field2899 = null;
        field2918 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIII)Lja;", line = 123)
    public final class60 method1105(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class247.field4247) {
            class126 var6 = new class126(this, arg0, arg1, true);
            var6.method788();
            return var6;
        } else {
            return new class29(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljm;IIIZ)V", line = 135)
    public final void method779(class226 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class168 var6 = (class168) arg0;
        var6.method1113();
        var6.method1124();
        field2930++;
        int var7 = 0;
        int[] var8 = var6.field2910;
        int var9 = var6.field2892;
        for (int var10 = 0; var10 < this.field2892; var10++) {
            class143 var11 = this.field2916[var10];
            if (var11.field2451 != 0) {
                int var12 = this.field2919[var10] - arg2;
                if (var12 >= var6.field2911 && var12 <= var6.field2920) {
                    int var13 = this.field2910[var10] - arg1;
                    if (var13 >= var6.field2926 && var13 <= var6.field2900) {
                        int var14 = this.field2927[var10] - arg3;
                        if (var14 >= var6.field2912 && var14 <= var6.field2908) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class143 var16 = var6.field2916[var15];
                                if (var8[var15] == var13 && var6.field2927[var15] == var14 && var6.field2919[var15] == var12 && var16.field2451 != 0) {
                                    if (this.field2915 == null) {
                                        this.field2915 = new class143[this.field2892];
                                    }
                                    if (var6.field2915 == null) {
                                        var6.field2915 = new class143[var9];
                                    }
                                    class143 var17 = this.field2915[var10];
                                    if (var17 == null) {
                                        var17 = this.field2915[var10] = new class143(var11);
                                    }
                                    class143 var18 = var6.field2915[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2915[var15] = new class143(var16);
                                    }
                                    var17.field2449 += var16.field2449;
                                    var17.field2444 += var16.field2444;
                                    var17.field2450 += var16.field2450;
                                    var17.field2451 += var16.field2451;
                                    var18.field2449 += var11.field2449;
                                    var18.field2444 += var11.field2444;
                                    var18.field2450 += var11.field2450;
                                    var18.field2451 += var11.field2451;
                                    var7++;
                                    field2917[var10] = field2930;
                                    field2899[var15] = field2930;
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
        for (int var19 = 0; var19 < this.field2885; var19++) {
            if (field2917[this.field2925[var19]] == field2930 && field2917[this.field2884[var19]] == field2930 && field2917[this.field2923[var19]] == field2930) {
                if (this.field2886 == null) {
                    this.field2886 = new byte[this.field2885];
                }
                this.field2886[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2885; var20++) {
            if (field2899[var6.field2925[var20]] == field2930 && field2899[var6.field2884[var20]] == field2930 && field2899[var6.field2923[var20]] == field2930) {
                if (var6.field2886 == null) {
                    var6.field2886 = new byte[var6.field2885];
                }
                var6.field2886[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ldj;II)Lig;", line = 252)
    public static final class168 method1106(class314 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2155(arg2, arg1, (byte) 70);
        return var3 == null ? null : new class168(var3);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(SS)V", line = 270)
    public final void method1107(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2885; var3++) {
            if (this.field2894[var3] == arg0) {
                this.field2894[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(SS)V", line = 284)
    public final void method1108(short arg0, short arg1) {
        if (this.field2887 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2885; var3++) {
            if (this.field2887[var3] == arg0) {
                this.field2887[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()I", line = 300)
    public final int method204() {
        if (!this.field2907) {
            this.method1113();
        }
        return this.field2911;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "()V", line = 309)
    public final void method1109() {
        for (int var1 = 0; var1 < this.field2892; var1++) {
            this.field2910[var1] = -this.field2910[var1];
            this.field2927[var1] = -this.field2927[var1];
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIJ)V", line = 320)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "()V", line = 324)
    public final void method1110() {
        for (int var1 = 0; var1 < this.field2892; var1++) {
            this.field2927[var1] = -this.field2927[var1];
        }
        for (int var2 = 0; var2 < this.field2885; var2++) {
            int var3 = this.field2925[var2];
            this.field2925[var2] = this.field2923[var2];
            this.field2923[var2] = var3;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([B)V", line = 347)
    private final void method1111(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var4.field3380 = arg0.length - 18;
        int var9 = var4.method1308(-55);
        int var10 = var4.method1308(-71);
        int var11 = var4.method1325(7627);
        int var12 = var4.method1325(7627);
        int var13 = var4.method1325(7627);
        int var14 = var4.method1325(7627);
        int var15 = var4.method1325(7627);
        int var16 = var4.method1325(7627);
        int var17 = var4.method1308(-80);
        int var18 = var4.method1308(-49);
        int var19 = var4.method1308(-122);
        int var20 = var4.method1308(-89);
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
        this.field2892 = var9;
        this.field2885 = var10;
        this.field2921 = var11;
        this.field2910 = new int[var9];
        this.field2919 = new int[var9];
        this.field2927 = new int[var9];
        this.field2925 = new int[var10];
        this.field2884 = new int[var10];
        this.field2923 = new int[var10];
        if (var11 > 0) {
            this.field2913 = new byte[var11];
            this.field2901 = new short[var11];
            this.field2898 = new short[var11];
            this.field2924 = new short[var11];
        }
        if (var16 == 1) {
            this.field2932 = new int[var9];
        }
        if (var12 == 1) {
            this.field2886 = new byte[var10];
            this.field2893 = new byte[var10];
            this.field2887 = new short[var10];
        }
        if (var13 == 255) {
            this.field2922 = new byte[var10];
        } else {
            this.field2928 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2909 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2914 = new int[var10];
        }
        this.field2894 = new short[var10];
        var4.field3380 = var21;
        var5.field3380 = var36;
        var6.field3380 = var38;
        var7.field3380 = var40;
        var8.field3380 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1325(7627);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1317(128);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1317(128);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1317(128);
            }
            this.field2910[var46] = var43 + var48;
            this.field2919[var46] = var44 + var49;
            this.field2927[var46] = var45 + var50;
            var43 = this.field2910[var46];
            var44 = this.field2919[var46];
            var45 = this.field2927[var46];
            if (var16 == 1) {
                this.field2932[var46] = var8.method1325(7627);
            }
        }
        var4.field3380 = var32;
        var5.field3380 = var28;
        var6.field3380 = var26;
        var7.field3380 = var30;
        var8.field3380 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2894[var51] = (short) var4.method1308(-63);
            if (var12 == 1) {
                int var52 = var5.method1325(7627);
                if ((var52 & 0x1) == 1) {
                    this.field2886[var51] = 1;
                    var2 = true;
                } else {
                    this.field2886[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2893[var51] = (byte) (var52 >> 2);
                    this.field2887[var51] = this.field2894[var51];
                    this.field2894[var51] = 127;
                    if (this.field2887[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2893[var51] = -1;
                    this.field2887[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2922[var51] = var6.method1326((byte) 93);
            }
            if (var14 == 1) {
                this.field2909[var51] = var7.method1326((byte) 87);
            }
            if (var15 == 1) {
                this.field2914[var51] = var8.method1325(7627);
            }
        }
        var4.field3380 = var25;
        var5.field3380 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1325(7627);
            if (var58 == 1) {
                var53 = var4.method1317(128) + var56;
                var54 = var4.method1317(128) + var53;
                var55 = var4.method1317(128) + var54;
                var56 = var55;
                this.field2925[var57] = var53;
                this.field2884[var57] = var54;
                this.field2923[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1317(128) + var56;
                var56 = var55;
                this.field2925[var57] = var53;
                this.field2884[var57] = var54;
                this.field2923[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1317(128) + var56;
                var56 = var55;
                this.field2925[var57] = var53;
                this.field2884[var57] = var54;
                this.field2923[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1317(128) + var56;
                var56 = var55;
                this.field2925[var57] = var53;
                this.field2884[var57] = var61;
                this.field2923[var57] = var55;
            }
        }
        var4.field3380 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2913[var62] = 0;
            this.field2901[var62] = (short) var4.method1308(-118);
            this.field2898[var62] = (short) var4.method1308(-121);
            this.field2924[var62] = (short) var4.method1308(-79);
        }
        if (this.field2893 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2893[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2901[var65] & 0xFFFF) == this.field2925[var64] && (this.field2898[var65] & 0xFFFF) == this.field2884[var64] && (this.field2924[var65] & 0xFFFF) == this.field2923[var64]) {
                        this.field2893[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2893 = null;
            }
        }
        if (!var3) {
            this.field2887 = null;
        }
        if (!var2) {
            this.field2886 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "()V", line = 689)
    public final void method1112() {
        for (int var1 = 0; var1 < this.field2892; var1++) {
            int var2 = this.field2910[var1];
            this.field2910[var1] = this.field2927[var1];
            this.field2927[var1] = -var2;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "()V", line = 703)
    private final void method1113() {
        if (this.field2907) {
            return;
        }
        this.field2907 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2892; var7++) {
            int var8 = this.field2910[var7];
            int var9 = this.field2919[var7];
            int var10 = this.field2927[var7];
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
        this.field2926 = (short) var1;
        this.field2900 = (short) var4;
        this.field2911 = (short) var2;
        this.field2920 = (short) var5;
        this.field2912 = (short) var3;
        this.field2908 = (short) var6;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 763)
    public final void method1114(int arg0) {
        int var2 = field2918[arg0];
        int var3 = field2904[arg0];
        for (int var4 = 0; var4 < this.field2892; var4++) {
            int var5 = this.field2927[var4] * var2 + this.field2910[var4] * var3 >> 16;
            this.field2927[var4] = this.field2927[var4] * var3 - this.field2910[var4] * var2 >> 16;
            this.field2910[var4] = var5;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 1977)
    private class168() {
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V", line = 1979)
    private class168(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1118(arg0);
        } else {
            this.method1111(arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(III)V", line = 1986)
    public class168(int arg0, int arg1, int arg2) {
        this.field2910 = new int[arg0];
        this.field2919 = new int[arg0];
        this.field2927 = new int[arg0];
        this.field2932 = new int[arg0];
        this.field2925 = new int[arg1];
        this.field2884 = new int[arg1];
        this.field2923 = new int[arg1];
        this.field2886 = new byte[arg1];
        this.field2922 = new byte[arg1];
        this.field2909 = new byte[arg1];
        this.field2894 = new short[arg1];
        this.field2887 = new short[arg1];
        this.field2893 = new byte[arg1];
        this.field2914 = new int[arg1];
        if (arg2 > 0) {
            this.field2913 = new byte[arg2];
            this.field2901 = new short[arg2];
            this.field2898 = new short[arg2];
            this.field2924 = new short[arg2];
            this.field2891 = new short[arg2];
            this.field2903 = new short[arg2];
            this.field2896 = new short[arg2];
            this.field2931 = new byte[arg2];
            this.field2906 = new byte[arg2];
            this.field2929 = new byte[arg2];
            this.field2890 = new byte[arg2];
            this.field2902 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([Lig;I)V", line = 2018)
    public class168(class168[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2892 = 0;
        this.field2885 = 0;
        this.field2921 = 0;
        this.field2928 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class168 var10 = arg0[var9];
            if (var10 != null) {
                this.field2892 += var10.field2892;
                this.field2885 += var10.field2885;
                this.field2921 += var10.field2921;
                if (var10.field2922 == null) {
                    if (this.field2928 == -1) {
                        this.field2928 = var10.field2928;
                    }
                    if (this.field2928 != var10.field2928) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2886 != null;
                var5 |= var10.field2909 != null;
                var6 |= var10.field2914 != null;
                var7 |= var10.field2887 != null;
                var8 |= var10.field2893 != null;
            }
        }
        this.field2910 = new int[this.field2892];
        this.field2919 = new int[this.field2892];
        this.field2927 = new int[this.field2892];
        this.field2932 = new int[this.field2892];
        this.field2925 = new int[this.field2885];
        this.field2884 = new int[this.field2885];
        this.field2923 = new int[this.field2885];
        if (var3) {
            this.field2886 = new byte[this.field2885];
        }
        if (var4) {
            this.field2922 = new byte[this.field2885];
        }
        if (var5) {
            this.field2909 = new byte[this.field2885];
        }
        if (var6) {
            this.field2914 = new int[this.field2885];
        }
        if (var7) {
            this.field2887 = new short[this.field2885];
        }
        if (var8) {
            this.field2893 = new byte[this.field2885];
        }
        this.field2894 = new short[this.field2885];
        if (this.field2921 > 0) {
            this.field2913 = new byte[this.field2921];
            this.field2901 = new short[this.field2921];
            this.field2898 = new short[this.field2921];
            this.field2924 = new short[this.field2921];
            this.field2891 = new short[this.field2921];
            this.field2903 = new short[this.field2921];
            this.field2896 = new short[this.field2921];
            this.field2931 = new byte[this.field2921];
            this.field2906 = new byte[this.field2921];
            this.field2929 = new byte[this.field2921];
            this.field2890 = new byte[this.field2921];
            this.field2902 = new byte[this.field2921];
        }
        this.field2892 = 0;
        this.field2885 = 0;
        this.field2921 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class168 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2885; var13++) {
                    if (var3 && var12.field2886 != null) {
                        this.field2886[this.field2885] = var12.field2886[var13];
                    }
                    if (var4) {
                        if (var12.field2922 == null) {
                            this.field2922[this.field2885] = var12.field2928;
                        } else {
                            this.field2922[this.field2885] = var12.field2922[var13];
                        }
                    }
                    if (var5 && var12.field2909 != null) {
                        this.field2909[this.field2885] = var12.field2909[var13];
                    }
                    if (var6 && var12.field2914 != null) {
                        this.field2914[this.field2885] = var12.field2914[var13];
                    }
                    if (var7) {
                        if (var12.field2887 == null) {
                            this.field2887[this.field2885] = -1;
                        } else {
                            this.field2887[this.field2885] = var12.field2887[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2893 == null || var12.field2893[var13] == -1) {
                            this.field2893[this.field2885] = -1;
                        } else {
                            this.field2893[this.field2885] = (byte) (var12.field2893[var13] + this.field2921);
                        }
                    }
                    this.field2894[this.field2885] = var12.field2894[var13];
                    this.field2925[this.field2885] = this.method1116(var12, var12.field2925[var13]);
                    this.field2884[this.field2885] = this.method1116(var12, var12.field2884[var13]);
                    this.field2923[this.field2885] = this.method1116(var12, var12.field2923[var13]);
                    this.field2885++;
                }
                for (int var14 = 0; var14 < var12.field2921; var14++) {
                    byte var15 = this.field2913[this.field2921] = var12.field2913[var14];
                    if (var15 == 0) {
                        this.field2901[this.field2921] = (short) this.method1116(var12, var12.field2901[var14]);
                        this.field2898[this.field2921] = (short) this.method1116(var12, var12.field2898[var14]);
                        this.field2924[this.field2921] = (short) this.method1116(var12, var12.field2924[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2901[this.field2921] = var12.field2901[var14];
                        this.field2898[this.field2921] = var12.field2898[var14];
                        this.field2924[this.field2921] = var12.field2924[var14];
                        this.field2891[this.field2921] = var12.field2891[var14];
                        this.field2903[this.field2921] = var12.field2903[var14];
                        this.field2896[this.field2921] = var12.field2896[var14];
                        this.field2931[this.field2921] = var12.field2931[var14];
                        this.field2906[this.field2921] = var12.field2906[var14];
                        this.field2929[this.field2921] = var12.field2929[var14];
                    }
                    if (var15 == 2) {
                        this.field2890[this.field2921] = var12.field2890[var14];
                        this.field2902[this.field2921] = var12.field2902[var14];
                    }
                    this.field2921++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lig;ZZZZ)V", line = 2227)
    public class168(class168 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2892 = arg0.field2892;
        this.field2885 = arg0.field2885;
        this.field2921 = arg0.field2921;
        if (arg1) {
            this.field2910 = arg0.field2910;
            this.field2919 = arg0.field2919;
            this.field2927 = arg0.field2927;
        } else {
            this.field2910 = new int[this.field2892];
            this.field2919 = new int[this.field2892];
            this.field2927 = new int[this.field2892];
            for (int var6 = 0; var6 < this.field2892; var6++) {
                this.field2910[var6] = arg0.field2910[var6];
                this.field2919[var6] = arg0.field2919[var6];
                this.field2927[var6] = arg0.field2927[var6];
            }
        }
        if (arg2) {
            this.field2894 = arg0.field2894;
        } else {
            this.field2894 = new short[this.field2885];
            for (int var7 = 0; var7 < this.field2885; var7++) {
                this.field2894[var7] = arg0.field2894[var7];
            }
        }
        if (arg3 || arg0.field2887 == null) {
            this.field2887 = arg0.field2887;
        } else {
            this.field2887 = new short[this.field2885];
            for (int var8 = 0; var8 < this.field2885; var8++) {
                this.field2887[var8] = arg0.field2887[var8];
            }
        }
        if (arg4) {
            this.field2909 = arg0.field2909;
        } else {
            this.field2909 = new byte[this.field2885];
            if (arg0.field2909 == null) {
                for (int var9 = 0; var9 < this.field2885; var9++) {
                    this.field2909[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2885; var10++) {
                    this.field2909[var10] = arg0.field2909[var10];
                }
            }
        }
        this.field2925 = arg0.field2925;
        this.field2884 = arg0.field2884;
        this.field2923 = arg0.field2923;
        this.field2886 = arg0.field2886;
        this.field2922 = arg0.field2922;
        this.field2893 = arg0.field2893;
        this.field2928 = arg0.field2928;
        this.field2913 = arg0.field2913;
        this.field2901 = arg0.field2901;
        this.field2898 = arg0.field2898;
        this.field2924 = arg0.field2924;
        this.field2891 = arg0.field2891;
        this.field2903 = arg0.field2903;
        this.field2896 = arg0.field2896;
        this.field2931 = arg0.field2931;
        this.field2906 = arg0.field2906;
        this.field2929 = arg0.field2929;
        this.field2890 = arg0.field2890;
        this.field2902 = arg0.field2902;
        this.field2932 = arg0.field2932;
        this.field2914 = arg0.field2914;
        this.field2895 = arg0.field2895;
        this.field2905 = arg0.field2905;
        this.field2916 = arg0.field2916;
        this.field2897 = arg0.field2897;
        this.field2915 = arg0.field2915;
        this.field2889 = arg0.field2889;
        this.field2888 = arg0.field2888;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIIII)Lnl;", line = 789)
    public final class29 method1115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class29(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lig;I)I", line = 802)
    private final int method1116(class168 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2910[arg1];
        int var5 = arg0.field2919[arg1];
        int var6 = arg0.field2927[arg1];
        for (int var7 = 0; var7 < this.field2892; var7++) {
            if (this.field2910[var7] == var4 && this.field2919[var7] == var5 && this.field2927[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2910[this.field2892] = var4;
            this.field2919[this.field2892] = var5;
            this.field2927[this.field2892] = var6;
            if (arg0.field2932 != null) {
                this.field2932[this.field2892] = arg0.field2932[arg1];
            }
            var3 = this.field2892++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "()V", line = 837)
    public final void method1117() {
        this.field2932 = null;
        this.field2914 = null;
        this.field2895 = (int[][]) null;
        this.field2905 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Ljm;", line = 846)
    public final class226 method780(int arg0, int arg1, int arg2) {
        return this.method1105(this.field2889, this.field2888, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "([B)V", line = 850)
    private final void method1118(byte[] arg0) {
        class194 var2 = new class194(arg0);
        class194 var3 = new class194(arg0);
        class194 var4 = new class194(arg0);
        class194 var5 = new class194(arg0);
        class194 var6 = new class194(arg0);
        class194 var7 = new class194(arg0);
        class194 var8 = new class194(arg0);
        var2.field3380 = arg0.length - 23;
        int var9 = var2.method1308(-128);
        int var10 = var2.method1308(-85);
        int var11 = var2.method1325(7627);
        int var12 = var2.method1325(7627);
        int var13 = var2.method1325(7627);
        int var14 = var2.method1325(7627);
        int var15 = var2.method1325(7627);
        int var16 = var2.method1325(7627);
        int var17 = var2.method1325(7627);
        int var18 = var2.method1308(-94);
        int var19 = var2.method1308(-16);
        int var20 = var2.method1308(-75);
        int var21 = var2.method1308(-42);
        int var22 = var2.method1308(-47);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2913 = new byte[var11];
            var2.field3380 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2913[var26] = var2.method1326((byte) 111);
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
        this.field2892 = var9;
        this.field2885 = var10;
        this.field2921 = var11;
        this.field2910 = new int[var9];
        this.field2919 = new int[var9];
        this.field2927 = new int[var9];
        this.field2925 = new int[var10];
        this.field2884 = new int[var10];
        this.field2923 = new int[var10];
        if (var17 == 1) {
            this.field2932 = new int[var9];
        }
        if (var12 == 1) {
            this.field2886 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2922 = new byte[var10];
        } else {
            this.field2928 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2909 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2914 = new int[var10];
        }
        if (var16 == 1) {
            this.field2887 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2893 = new byte[var10];
        }
        this.field2894 = new short[var10];
        if (var11 > 0) {
            this.field2901 = new short[var11];
            this.field2898 = new short[var11];
            this.field2924 = new short[var11];
            if (var24 > 0) {
                this.field2891 = new short[var24];
                this.field2903 = new short[var24];
                this.field2896 = new short[var24];
                this.field2931 = new byte[var24];
                this.field2906 = new byte[var24];
                this.field2929 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2890 = new byte[var25];
                this.field2902 = new byte[var25];
            }
        }
        var2.field3380 = var11;
        var3.field3380 = var44;
        var4.field3380 = var46;
        var5.field3380 = var48;
        var6.field3380 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method1325(7627);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method1317(128);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method1317(128);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method1317(128);
            }
            this.field2910[var66] = var63 + var68;
            this.field2919[var66] = var64 + var69;
            this.field2927[var66] = var65 + var70;
            var63 = this.field2910[var66];
            var64 = this.field2919[var66];
            var65 = this.field2927[var66];
            if (var17 == 1) {
                this.field2932[var66] = var6.method1325(7627);
            }
        }
        var2.field3380 = var42;
        var3.field3380 = var31;
        var4.field3380 = var34;
        var5.field3380 = var37;
        var6.field3380 = var35;
        var7.field3380 = var40;
        var8.field3380 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field2894[var71] = (short) var2.method1308(-41);
            if (var12 == 1) {
                this.field2886[var71] = var3.method1326((byte) 125);
            }
            if (var13 == 255) {
                this.field2922[var71] = var4.method1326((byte) 126);
            }
            if (var14 == 1) {
                this.field2909[var71] = var5.method1326((byte) 101);
            }
            if (var15 == 1) {
                this.field2914[var71] = var6.method1325(7627);
            }
            if (var16 == 1) {
                this.field2887[var71] = (short) (var7.method1308(-66) - 1);
            }
            if (this.field2893 != null) {
                if (this.field2887[var71] == -1) {
                    this.field2893[var71] = -1;
                } else {
                    this.field2893[var71] = (byte) (var8.method1325(7627) - 1);
                }
            }
        }
        var2.field3380 = var33;
        var3.field3380 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method1325(7627);
            if (var77 == 1) {
                var72 = var2.method1317(128) + var75;
                var73 = var2.method1317(128) + var72;
                var74 = var2.method1317(128) + var73;
                var75 = var74;
                this.field2925[var76] = var72;
                this.field2884[var76] = var73;
                this.field2923[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method1317(128) + var75;
                var75 = var74;
                this.field2925[var76] = var72;
                this.field2884[var76] = var73;
                this.field2923[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method1317(128) + var75;
                var75 = var74;
                this.field2925[var76] = var72;
                this.field2884[var76] = var73;
                this.field2923[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method1317(128) + var75;
                var75 = var74;
                this.field2925[var76] = var72;
                this.field2884[var76] = var80;
                this.field2923[var76] = var74;
            }
        }
        var2.field3380 = var50;
        var3.field3380 = var52;
        var4.field3380 = var54;
        var5.field3380 = var56;
        var6.field3380 = var58;
        var7.field3380 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field2913[var81] & 0xFF;
            if (var82 == 0) {
                this.field2901[var81] = (short) var2.method1308(-124);
                this.field2898[var81] = (short) var2.method1308(-54);
                this.field2924[var81] = (short) var2.method1308(-95);
            }
            if (var82 == 1) {
                this.field2901[var81] = (short) var3.method1308(-20);
                this.field2898[var81] = (short) var3.method1308(-121);
                this.field2924[var81] = (short) var3.method1308(-61);
                this.field2891[var81] = (short) var4.method1308(-105);
                this.field2903[var81] = (short) var4.method1308(-19);
                this.field2896[var81] = (short) var4.method1308(-46);
                this.field2931[var81] = var5.method1326((byte) 122);
                this.field2906[var81] = var6.method1326((byte) 110);
                this.field2929[var81] = var7.method1326((byte) 108);
            }
            if (var82 == 2) {
                this.field2901[var81] = (short) var3.method1308(-83);
                this.field2898[var81] = (short) var3.method1308(-90);
                this.field2924[var81] = (short) var3.method1308(-63);
                this.field2891[var81] = (short) var4.method1308(-23);
                this.field2903[var81] = (short) var4.method1308(-28);
                this.field2896[var81] = (short) var4.method1308(-90);
                this.field2931[var81] = var5.method1326((byte) 119);
                this.field2906[var81] = var6.method1326((byte) 107);
                this.field2929[var81] = var7.method1326((byte) 122);
                this.field2890[var81] = var7.method1326((byte) 114);
                this.field2902[var81] = var7.method1326((byte) 111);
            }
            if (var82 == 3) {
                this.field2901[var81] = (short) var3.method1308(-19);
                this.field2898[var81] = (short) var3.method1308(-33);
                this.field2924[var81] = (short) var3.method1308(-125);
                this.field2891[var81] = (short) var4.method1308(-77);
                this.field2903[var81] = (short) var4.method1308(-83);
                this.field2896[var81] = (short) var4.method1308(-55);
                this.field2931[var81] = var5.method1326((byte) 105);
                this.field2906[var81] = var6.method1326((byte) 104);
                this.field2929[var81] = var7.method1326((byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([[III)I", line = 1273)
    private static final int method1119(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "()V", line = 1300)
    public final void method1120() {
        int var10002;
        if (this.field2932 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2892; var3++) {
                int var4 = this.field2932[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2895 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2895[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2892) {
                int var7 = this.field2932[var6];
                this.field2895[var7][var1[var7]++] = var6++;
            }
            this.field2932 = null;
        }
        if (this.field2914 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2885; var10++) {
            int var11 = this.field2914[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2905 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2905[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2885) {
            int var14 = this.field2914[var13];
            this.field2905[var14][var8[var14]++] = var13++;
        }
        this.field2914 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[[I[[IIIIZZ)Lig;", line = 1400)
    public final class168 method1121(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1113();
        int var10 = this.field2926 + arg4;
        int var11 = this.field2900 + arg4;
        int var12 = this.field2912 + arg6;
        int var13 = this.field2908 + arg6;
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
        class168 var18;
        if (arg7) {
            var18 = new class168();
            var18.field2892 = this.field2892;
            var18.field2885 = this.field2885;
            var18.field2921 = this.field2921;
            var18.field2925 = this.field2925;
            var18.field2884 = this.field2884;
            var18.field2923 = this.field2923;
            var18.field2886 = this.field2886;
            var18.field2922 = this.field2922;
            var18.field2909 = this.field2909;
            var18.field2893 = this.field2893;
            var18.field2894 = this.field2894;
            var18.field2887 = this.field2887;
            var18.field2928 = this.field2928;
            var18.field2913 = this.field2913;
            var18.field2901 = this.field2901;
            var18.field2898 = this.field2898;
            var18.field2924 = this.field2924;
            var18.field2891 = this.field2891;
            var18.field2903 = this.field2903;
            var18.field2896 = this.field2896;
            var18.field2931 = this.field2931;
            var18.field2906 = this.field2906;
            var18.field2929 = this.field2929;
            var18.field2890 = this.field2890;
            var18.field2902 = this.field2902;
            var18.field2932 = this.field2932;
            var18.field2914 = this.field2914;
            var18.field2895 = this.field2895;
            var18.field2905 = this.field2905;
            var18.field2889 = this.field2889;
            var18.field2888 = this.field2888;
            var18.field2916 = this.field2916;
            var18.field2897 = this.field2897;
            var18.field2915 = this.field2915;
            if (arg0 == 3) {
                var18.field2910 = class273.method1915(-26424, this.field2910);
                var18.field2919 = class273.method1915(-26424, this.field2919);
                var18.field2927 = class273.method1915(-26424, this.field2927);
            } else {
                var18.field2910 = this.field2910;
                var18.field2919 = new int[var18.field2892];
                var18.field2927 = this.field2927;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2892; var19++) {
                int var20 = this.field2910[var19] + arg4;
                int var21 = this.field2927[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2919[var19] = this.field2919[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2892; var29++) {
                int var30 = (this.field2919[var29] << 16) / this.field2911;
                if (var30 < arg1) {
                    int var31 = this.field2910[var29] + arg4;
                    int var32 = this.field2927[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2919[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2919[var29];
                } else {
                    var18.field2919[var29] = this.field2919[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1126(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2920 - this.field2911;
            for (int var43 = 0; var43 < this.field2892; var43++) {
                int var44 = this.field2910[var43] + arg4;
                int var45 = this.field2927[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2919[var43] = var52 + this.field2919[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2920 - this.field2911;
            for (int var54 = 0; var54 < this.field2892; var54++) {
                int var55 = this.field2910[var54] + arg4;
                int var56 = this.field2927[var54] + arg6;
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
                var18.field2919[var54] = ((this.field2919[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1123();
        } else {
            this.field2907 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)V", line = 1663)
    public final void method1122(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2892; var4++) {
            this.field2910[var4] += arg0;
            this.field2919[var4] += arg1;
            this.field2927[var4] += arg2;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "()V", line = 1676)
    private final void method1123() {
        this.field2916 = null;
        this.field2915 = null;
        this.field2897 = null;
        this.field2907 = false;
    }

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "()V", line = 1682)
    public final void method1124() {
        if (this.field2916 != null) {
            return;
        }
        this.field2916 = new class143[this.field2892];
        for (int var1 = 0; var1 < this.field2892; var1++) {
            this.field2916[var1] = new class143();
        }
        for (int var2 = 0; var2 < this.field2885; var2++) {
            int var3 = this.field2925[var2];
            int var4 = this.field2884[var2];
            int var5 = this.field2923[var2];
            int var6 = this.field2910[var4] - this.field2910[var3];
            int var7 = this.field2919[var4] - this.field2919[var3];
            int var8 = this.field2927[var4] - this.field2927[var3];
            int var9 = this.field2910[var5] - this.field2910[var3];
            int var10 = this.field2919[var5] - this.field2919[var3];
            int var11 = this.field2927[var5] - this.field2927[var3];
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
            if (this.field2886 == null) {
                var19 = 0;
            } else {
                var19 = this.field2886[var2];
            }
            if (var19 == 0) {
                class143 var20 = this.field2916[var3];
                var20.field2449 += var16;
                var20.field2444 += var17;
                var20.field2450 += var18;
                var20.field2451++;
                class143 var21 = this.field2916[var4];
                var21.field2449 += var16;
                var21.field2444 += var17;
                var21.field2450 += var18;
                var21.field2451++;
                class143 var22 = this.field2916[var5];
                var22.field2449 += var16;
                var22.field2444 += var17;
                var22.field2450 += var18;
                var22.field2451++;
            } else if (var19 == 1) {
                if (this.field2897 == null) {
                    this.field2897 = new class250[this.field2885];
                }
                class250 var23 = this.field2897[var2] = new class250();
                var23.field4335 = var16;
                var23.field4331 = var17;
                var23.field4328 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(III)V", line = 1783)
    public final void method1125(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2892; var4++) {
            this.field2910[var4] = this.field2910[var4] * arg0 / 128;
            this.field2919[var4] = this.field2919[var4] * arg1 / 128;
            this.field2927[var4] = this.field2927[var4] * arg2 / 128;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([[IIIIII)V", line = 1797)
    private final void method1126(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1119(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1119(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1119(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1119(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1102(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1127(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1122(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 1863)
    private final void method1127(int arg0) {
        int var2 = field2918[arg0];
        int var3 = field2904[arg0];
        for (int var4 = 0; var4 < this.field2892; var4++) {
            int var5 = this.field2919[var4] * var2 + this.field2910[var4] * var3 >> 16;
            this.field2919[var4] = this.field2919[var4] * var3 - this.field2910[var4] * var2 >> 16;
            this.field2910[var4] = var5;
        }
        this.method1123();
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(III)V", line = 1887)
    public final void method1128(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2918[arg2];
            int var5 = field2904[arg2];
            for (int var6 = 0; var6 < this.field2892; var6++) {
                int var7 = this.field2919[var6] * var4 + this.field2910[var6] * var5 >> 16;
                this.field2919[var6] = this.field2919[var6] * var5 - this.field2910[var6] * var4 >> 16;
                this.field2910[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2918[arg0];
            int var9 = field2904[arg0];
            for (int var10 = 0; var10 < this.field2892; var10++) {
                int var11 = this.field2919[var10] * var9 - this.field2927[var10] * var8 >> 16;
                this.field2927[var10] = this.field2927[var10] * var9 + this.field2919[var10] * var8 >> 16;
                this.field2919[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2918[arg1];
        int var13 = field2904[arg1];
        for (int var14 = 0; var14 < this.field2892; var14++) {
            int var15 = this.field2927[var14] * var12 + this.field2910[var14] * var13 >> 16;
            this.field2927[var14] = this.field2927[var14] * var13 - this.field2910[var14] * var12 >> 16;
            this.field2910[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()Z", line = 1952)
    public final boolean method771() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "()V", line = 1961)
    public final void method1129() {
        for (int var1 = 0; var1 < this.field2892; var1++) {
            int var2 = this.field2927[var1];
            this.field2927[var1] = this.field2910[var1];
            this.field2910[var1] = -var2;
        }
        this.method1123();
    }
}
