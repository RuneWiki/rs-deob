import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class144 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private int field2090;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
    private boolean field2084;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "[I")
    private static int[] field2075 = new int[4];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    private int field2081;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    private int field2087;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lwb;")
    private static class219 field2091;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lwh;")
    private class289 field2080;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
    private static byte[] field2076;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    private final void method975() {
        int var1 = this.field2089;
        int var2 = this.field2089;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class72.field1173 - var1;
        if (var2 > class72.field1178) {
            var2 -= var2 - class72.field1178;
        }
        if (class72.field1176 > 0) {
            int var9 = class72.field1176;
            var2 -= var9;
            var7 += class72.field1173 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class72.field1179) {
            int var10 = var1 - class72.field1179;
            var1 -= var10;
            var8 += var10;
        }
        if (class72.field1172 > 0) {
            int var11 = class72.field1172;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method977(class72.field1174, this.field2088, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
    private final void method976() {
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method977(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field2076[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method976();
        super.finalize();
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
    private static final void method978() {
        if (field2076 != null) {
            return;
        }
        field2076 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field2076[var4 + var6] = field2076[var4 + var9] = field2076[var5 + var6] = field2076[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
    public static void method979() {
        field2091 = null;
        field2076 = null;
        field2075 = null;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "()V")
    private final void method980() {
        int var1 = this.field2089 * 3 / 32;
        int var3 = this.field2089 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class72.field1173 * var1 + var1;
        int var8 = class72.field1173 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class72.field1178) {
            var4 = var3 - (var1 + var3 - class72.field1178);
        }
        if (var1 < class72.field1176) {
            int var11 = class72.field1176 - var1;
            var4 -= var11;
            var7 += class72.field1173 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class72.field1179) {
            int var12 = var1 + var3 - class72.field1179;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class72.field1172) {
            int var13 = class72.field1172 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method987(class72.field1174, 0, this.field2088, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIILkf;)V")
    public final void method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6) {
        int var8 = this.field2086 - arg4 & 0x7FF;
        int var9 = this.field2081 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field2087) / 2 + var10;
        int var13 = (arg2 - this.field2087) / 2 + var11;
        if (var12 < arg3 && this.field2087 + var12 > 0 && var13 < arg2 && this.field2087 + var13 > 0 && this.method982(arg6)) {
            this.field2080.method1225(arg0 + var13, arg1 + var12, this.field2087, this.field2087);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lkf;)Z")
    private final boolean method982(class144 arg0) {
        if (this.field2080 == null) {
            if (this.field2083 == 0) {
                this.field2080 = class119.field1790.method1833(true, (byte) -110, class119.field1781, this.field2089, this.field2078);
            } else if (this.field2083 == 2) {
                this.method983(arg0);
            } else if (this.field2083 == 1) {
                this.method985(arg0);
            }
        }
        return this.field2080 != null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lkf;)V")
    private final void method983(class144 arg0) {
        class219 var2 = class219.method1502(class204.field3059, this.field2078, 0);
        if (var2 == null) {
            return;
        }
        this.field2080 = new class289(this.field2089, this.field2089);
        class72.method580(field2075);
        this.field2080.method1915();
        class119.method842();
        class72.method576(0, 0, this.field2089, this.field2089, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field2084) {
                var3 = -arg0.field2077;
                var4 = -arg0.field2090;
                var5 = -arg0.field2085;
            } else {
                var3 = this.field2077 - arg0.field2077;
                var4 = this.field2090 - arg0.field2090;
                var5 = this.field2085 - arg0.field2085;
            }
        }
        if (this.field2086 != 0) {
            int var6 = class119.field1774[this.field2086];
            int var7 = class119.field1776[this.field2086];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field2081 != 0) {
            int var9 = this.field2081 - 1024 & 0x7FF;
            int var10 = class119.field1774[var9];
            int var11 = class119.field1776[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class263 var13 = var2.method1472(64, 768, -var3, -var4, -var5);
        int var14 = var13.method31() - var13.method28();
        int var15 = var13.method1786() - var13.method19();
        int var16 = var13.method28() + var14 / 2;
        int var17 = var13.method19() + var15 / 2;
        if (var14 > var15) {
            var13.method1787(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field2089);
        } else {
            var13.method1787(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field2089);
        }
        class148.field2148.method1703(5061);
        class72.method562(field2075);
        class119.method842();
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "()V")
    private static final void method984() {
        if (field2091 != null) {
            return;
        }
        class219 var0 = field2091 = new class219(260, 480, 0);
        int[] var1 = var0.field3362;
        int[] var2 = var0.field3377;
        int[] var3 = var0.field3381;
        int[] var4 = var0.field3397;
        int[] var5 = var0.field3368;
        int[] var6 = var0.field3364;
        var0.field3372 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class119.field1774[var8] >> 1;
            int var10 = class119.field1776[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class119.field1776[var17] >> 9;
                int var19 = (class119.field1774[var17] >> 1) * var9 >> 23;
                int var20 = (class119.field1774[var17] >> 1) * var10 >> 23;
                var1[var0.field3372] = var20;
                var2[var0.field3372] = var18;
                var3[var0.field3372] = -var19;
                var0.field3372++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3373] = 0;
                var5[var0.field3373] = var13;
                var6[var0.field3373] = var12;
                var0.field3373++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3373] = var13;
                    var5[var0.field3373] = var15;
                    var6[var0.field3373] = var12;
                    var0.field3373++;
                    var4[var0.field3373] = var15;
                    var5[var0.field3373] = var16;
                    var6[var0.field3373] = var12;
                    var0.field3373++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3373] = var12;
                var5[var0.field3373] = var13;
                var6[var0.field3373] = 1;
                var0.field3373++;
            }
        }
        var0.field3354 = var0.field3372;
        var0.field3375 = null;
        var0.field3396 = null;
        var0.field3388 = null;
        var0.field3376 = null;
        var0.field3383 = null;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Lkf;)V")
    private final void method985(class144 arg0) {
        method984();
        method978();
        this.field2080 = new class187(this.field2089, this.field2089);
        class72.method580(field2075);
        this.field2080.method1915();
        class119.method842();
        class72.method576(0, 0, this.field2089, this.field2089, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field2084) {
                var2 = -arg0.field2077;
                var3 = -arg0.field2090;
                var4 = -arg0.field2085;
            } else {
                var2 = this.field2077 - arg0.field2077;
                var3 = this.field2090 - arg0.field2090;
                var4 = this.field2085 - arg0.field2085;
            }
        }
        if (this.field2086 != 0) {
            int var5 = class119.field1774[this.field2086];
            int var6 = class119.field1776[this.field2086];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field2081 != 0) {
            int var8 = this.field2081 - 1024 & 0x7FF;
            int var9 = class119.field1774[var8];
            int var10 = class119.field1776[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class41.method336(field2091.field3389, 0, field2091.field3373, (short) class119.field1790.method1829(false, this.field2078));
        class263 var12 = field2091.method1472(64, 512, -var2, -var3, -var4);
        int var13 = var12.method31() - var12.method28();
        int var14 = var12.method1786() - var12.method19();
        if (var13 > var14) {
            int var15 = this.field2088 == 0 ? (var13 << 9) / this.field2089 : (var13 * 16 << 9) / (this.field2089 * 13);
            var12.method1787(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field2088 == 0 ? (var14 << 9) / this.field2089 : (var14 * 16 << 9) / (this.field2089 * 13);
            var12.method1787(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field2088 == 0) {
            for (int var17 = 0; var17 < class72.field1174.length; var17++) {
                if (class72.field1174[var17] != 0) {
                    class72.field1174[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method980();
            this.method975();
        }
        class148.field2148.method1703(5061);
        class72.method562(field2075);
        class119.method842();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z")
    public final boolean method986(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2084) {
            this.field2082 = 1073741823;
            var8 = this.field2077;
            var9 = this.field2090;
            var10 = this.field2085;
        } else {
            int var5 = this.field2077 - arg0;
            int var6 = this.field2090 - arg1;
            int var7 = this.field2085 - arg2;
            this.field2082 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2082 == 0) {
                this.field2082 = 1;
            }
            var8 = (var5 << 8) / this.field2082;
            var9 = (var6 << 8) / this.field2082;
            var10 = (var7 << 8) / this.field2082;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2087 = this.field2079 * arg3 / (this.field2084 ? 1024 : this.field2082);
        } else {
            this.field2087 = 0;
        }
        if (this.field2087 < 8) {
            this.method976();
            this.field2080 = null;
            return false;
        }
        int var12 = class259.method1747(this.field2087, 5539);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2089 != var12) {
            this.field2089 = var12;
        }
        this.field2086 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field2081 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field2080 = null;
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method987(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field2076[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2077 = arg2;
        this.field2090 = arg3;
        this.field2085 = arg4;
        this.field2084 = arg7;
        this.field2078 = arg1;
        this.field2088 = arg6;
        this.field2079 = arg5;
        this.field2083 = arg0;
    }
}
