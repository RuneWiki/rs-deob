import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class238 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
    private boolean field3143;

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    private int field3147;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "[I")
    private static int[] field3150 = new int[4];

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    private int field3148;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "Lda;")
    private static class470 field3149;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "Lf;")
    private static class532 field3146;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "Lf;")
    private class532 field3151;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "Lf;")
    private static class532 field3152;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lr;Laba;)Z")
    public final boolean method1469(class562 arg0, class238 arg1) {
        return this.field3151 != null || this.method1472(arg0, arg1);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
    public static final void method1470() {
        field3149 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lr;)V")
    private static final void method1471(class562 arg0) {
        if (field3149 != null) {
            return;
        }
        class250 var1 = new class250(580, 1104, 1);
        var1.method1526((short) 0, (short) 1024, (byte) 0, (short) 32767, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) -85, (short) 0);
        var1.method1519(0, 0, false, 128);
        var1.method1519(0, 0, false, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class240.field3176[var3];
            int var5 = class240.field3177[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class240.field3177[var12] >> 7;
                int var14 = class240.field3176[var12] * var4 >> 21;
                int var15 = class240.field3176[var12] * var5 >> 21;
                var1.method1519(-var14, var15, false, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1520((byte) 0, -120, (short) 127, var7, (byte) 0, 0, (short) 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1520((byte) 0, -35, (short) 127, var7, (byte) 0, var8, (short) 0, (byte) 0, var10);
                    var1.method1520((byte) 0, -31, (short) 127, var7, (byte) 0, var10, (short) 0, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1520((byte) 0, 125, (short) 127, 1, (byte) 0, var7, (short) 0, (byte) 0, var8);
            }
        }
        var1.field3293 = var1.field3284;
        var1.field3258 = null;
        var1.field3277 = null;
        var1.field3274 = null;
        field3149 = arg0.method1089(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Lr;Laba;)Z")
    private final boolean method1472(class562 arg0, class238 arg1) {
        if (this.field3151 == null) {
            if (this.field3156 == 0) {
                if (class574.field7845.method2961(true, this.field3155)) {
                    int[] var3 = class574.field7845.method2963(false, this.field3157, true, this.field3157, 0.7F, this.field3155);
                    this.field3151 = arg0.method1122(var3, 0, this.field3157, this.field3157, this.field3157);
                }
            } else if (this.field3156 == 2) {
                this.method1477(arg0, arg1);
            } else if (this.field3156 == 1) {
                this.method1476(arg0, arg1);
            }
        }
        return this.field3151 != null;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "()V")
    public static void method1473() {
        field3149 = null;
        field3152 = null;
        field3146 = null;
        field3150 = null;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Lr;)V")
    private static final void method1474(class562 arg0) {
        if (field3146 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field3146 = arg0.method1122(var2, 0, 128, 128, 128);
        field3152 = arg0.method1122(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method1475(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3151 == null) {
            return;
        }
        int var8 = this.field3144 - arg5 & 0x3FFF;
        int var9 = this.field3148 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3154) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3154) / 2;
        if (var10 < arg4 && this.field3154 + var10 > 0 && var11 < arg3 && this.field3154 + var11 > 0) {
            this.field3151.method2993(arg1 + var11, arg2 + var10, this.field3154, this.field3154);
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(Lr;Laba;)V")
    private final void method1476(class562 arg0, class238 arg1) {
        method1471(arg0);
        method1474(arg0);
        arg0.method1057(field3150);
        arg0.method1042(0, 0, this.field3157, this.field3157);
        arg0.method1147();
        arg0.method1113(0, 0, this.field3157, this.field3157, this.field3158 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3143) {
                var3 = -arg1.field3141;
                var4 = -arg1.field3145;
                var5 = -arg1.field3142;
            } else {
                var3 = arg1.field3141 - this.field3141;
                var4 = arg1.field3145 - this.field3145;
                var5 = arg1.field3142 - this.field3142;
            }
        }
        if (this.field3144 != 0) {
            int var6 = class240.field3176[this.field3144];
            int var7 = class240.field3177[this.field3144];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3148 != 0) {
            int var9 = class240.field3176[this.field3148];
            int var10 = class240.field3177[this.field3148];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class470 var12 = field3149.method649((byte) 0, 51200, true);
        if (arg0.method1087()) {
            var12.method624((short) 0, (short) this.field3155);
        } else {
            var12.method638((short) 127, class574.field7845.method2959(92, this.field3155).field1262);
            var12.method624((short) 0, (short) -1);
        }
        arg0.method1041(1.0F);
        arg0.method1060(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3157 * 1024 / (var12.method647() - var12.method650());
        if (this.field3158 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1088(this.field3157 / 2, this.field3157 / 2, var13, var13);
        arg0.method1123(arg0.method1075());
        class487 var14 = arg0.method1075();
        var14.method359(0, 0, arg0.method1054() - var12.method656());
        var12.method648(var14, null, 1024, 1);
        int var15 = this.field3157 * 13 / 16;
        int var16 = (this.field3157 - var15) / 2;
        field3152.method2991(var16, var16, var15, var15, 0, this.field3158 | 0xFF000000, 1);
        this.field3151 = arg0.method1076(0, 0, this.field3157, this.field3157, true);
        arg0.method1147();
        arg0.method1113(0, 0, this.field3157, this.field3157, 0, 0);
        field3146.method2991(0, 0, this.field3157, this.field3157, 1, 0, 0);
        this.field3151.method218(0, 0, 0);
        arg0.method1042(field3150[0], field3150[1], field3150[2], field3150[3]);
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(Lr;Laba;)V")
    private final void method1477(class562 arg0, class238 arg1) {
        class250 var3 = class258.method1563(0, class609.field8466, this.field3155, 65535);
        if (var3 == null) {
            return;
        }
        arg0.method1057(field3150);
        arg0.method1042(0, 0, this.field3157, this.field3157);
        arg0.method1113(0, 0, this.field3157, this.field3157, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3143) {
                var4 = -arg1.field3141;
                var5 = -arg1.field3145;
                var6 = -arg1.field3142;
            } else {
                var4 = this.field3141 - arg1.field3141;
                var5 = this.field3145 - arg1.field3145;
                var6 = this.field3142 - arg1.field3142;
            }
        }
        if (this.field3144 != 0) {
            int var7 = -this.field3144 & 0x3FFF;
            int var8 = class240.field3176[var7];
            int var9 = class240.field3177[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3148 != 0) {
            int var11 = -this.field3148 & 0x3FFF;
            int var12 = class240.field3176[var11];
            int var13 = class240.field3177[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method1041(1.0F);
        arg0.method1060(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class470 var15 = arg0.method1089(var3, 2048, 0, 64, 768);
        int var16 = var15.method647() - var15.method650();
        int var17 = var15.method627() - var15.method613();
        int var18 = var15.method650() + var16 / 2;
        int var19 = var15.method613() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1088(var18, var19, var20, var20);
        arg0.method1123(arg0.method1075());
        class487 var21 = arg0.method1153();
        var21.method359(0, 0, arg0.method1054() - var15.method656());
        var15.method648(var21, null, arg0.method1054(), 1);
        this.field3151 = arg0.method1076(0, 0, this.field3157, this.field3157, true);
        this.field3151.method218(0, 0, 3);
        arg0.method1042(field3150[0], field3150[1], field3150[2], field3150[3]);
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "()V")
    public final void method1478() {
        this.field3151 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)Z")
    public final boolean method1479(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3143) {
            this.field3153 = 1073741823;
            var8 = this.field3141;
            var9 = this.field3145;
            var10 = this.field3142;
        } else {
            int var5 = this.field3141 - arg0;
            int var6 = this.field3145 - arg1;
            int var7 = this.field3142 - arg2;
            this.field3153 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3153 == 0) {
                this.field3153 = 1;
            }
            var8 = (var5 << 8) / this.field3153;
            var9 = (var6 << 8) / this.field3153;
            var10 = (var7 << 8) / this.field3153;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3154 = this.field3147 * arg3 / (this.field3143 ? 1024 : this.field3153);
        } else {
            this.field3154 = 0;
        }
        if (this.field3154 < 8) {
            this.field3151 = null;
            return false;
        }
        int var12 = class385.method2206(0, this.field3154);
        if (var12 > arg3) {
            var12 = class245.method1497(arg3, (byte) -124);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3157 != var12) {
            this.field3157 = var12;
        }
        this.field3144 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3148 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3151 = null;
        return true;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3141 = arg2;
        this.field3145 = arg3;
        this.field3142 = arg4;
        this.field3143 = arg7;
        this.field3155 = arg1;
        this.field3158 = arg6;
        this.field3147 = arg5;
        this.field3156 = arg0;
    }
}
