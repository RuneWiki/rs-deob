import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class81 {

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Z")
    private boolean field1293;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
    private static int[] field1292 = new int[4];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lgl;")
    private static class228 field1280;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lea;")
    private class38 field1286;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[B")
    private static byte[] field1290;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method538(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1290[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lph;)V")
    private final void method539(class81 arg0) {
        method542();
        method548();
        this.field1286 = new class108(this.field1281, this.field1281);
        class62.method400(field1292);
        this.field1286.method250();
        class172.method1139();
        class62.method380(0, 0, this.field1281, this.field1281, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1293) {
                var2 = -arg0.field1291;
                var3 = -arg0.field1279;
                var4 = -arg0.field1294;
            } else {
                var2 = this.field1291 - arg0.field1291;
                var3 = this.field1279 - arg0.field1279;
                var4 = this.field1294 - arg0.field1294;
            }
        }
        if (this.field1278 != 0) {
            int var5 = class172.field2669[this.field1278];
            int var6 = class172.field2658[this.field1278];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1282 != 0) {
            int var8 = this.field1282 - 1024 & 0x7FF;
            int var9 = class172.field2669[var8];
            int var10 = class172.field2658[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class158.method1048(field1280.field3652, 0, field1280.field3630, (short) class172.field2670.method1120(this.field1285, 63));
        class191 var12 = field1280.method1595(64, 512, -var2, -var3, -var4);
        int var13 = var12.method1322() - var12.method1319();
        int var14 = var12.method1305() - var12.method206();
        if (var13 > var14) {
            int var15 = this.field1288 == 0 ? (var13 << 9) / this.field1281 : (var13 * 16 << 9) / (this.field1281 * 13);
            var12.method1321(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1288 == 0 ? (var14 << 9) / this.field1281 : (var14 * 16 << 9) / (this.field1281 * 13);
            var12.method1321(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1288 == 0) {
            for (int var17 = 0; var17 < class62.field932.length; var17++) {
                if (class62.field932[var17] != 0) {
                    class62.field932[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method545();
            this.method547();
        }
        class301.field4942.method118(127);
        class62.method403(field1292);
        class172.method1139();
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Lph;)V")
    private final void method540(class81 arg0) {
        class228 var2 = class228.method1590(class205.field3294, this.field1285, 0);
        if (var2 == null) {
            return;
        }
        this.field1286 = new class38(this.field1281, this.field1281);
        class62.method400(field1292);
        this.field1286.method250();
        class172.method1139();
        class62.method380(0, 0, this.field1281, this.field1281, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1293) {
                var3 = -arg0.field1291;
                var4 = -arg0.field1279;
                var5 = -arg0.field1294;
            } else {
                var3 = this.field1291 - arg0.field1291;
                var4 = this.field1279 - arg0.field1279;
                var5 = this.field1294 - arg0.field1294;
            }
        }
        if (this.field1278 != 0) {
            int var6 = class172.field2669[this.field1278];
            int var7 = class172.field2658[this.field1278];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1282 != 0) {
            int var9 = this.field1282 - 1024 & 0x7FF;
            int var10 = class172.field2669[var9];
            int var11 = class172.field2658[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class191 var13 = var2.method1595(64, 768, -var3, -var4, -var5);
        int var14 = var13.method1322() - var13.method1319();
        int var15 = var13.method1305() - var13.method206();
        int var16 = var13.method1319() + var14 / 2;
        int var17 = var13.method206() + var15 / 2;
        if (var14 > var15) {
            var13.method1321(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1281);
        } else {
            var13.method1321(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1281);
        }
        class301.field4942.method118(127);
        class62.method403(field1292);
        class172.method1139();
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(Lph;)Z")
    private final boolean method541(class81 arg0) {
        if (this.field1286 == null) {
            if (this.field1287 == 0) {
                this.field1286 = class172.field2670.method1122(this.field1285, -8933, class172.field2664, true, this.field1281);
            } else if (this.field1287 == 2) {
                this.method540(arg0);
            } else if (this.field1287 == 1) {
                this.method539(arg0);
            }
        }
        return this.field1286 != null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
    private static final void method542() {
        if (field1280 != null) {
            return;
        }
        class228 var0 = field1280 = new class228(260, 480, 0);
        int[] var1 = var0.field3649;
        int[] var2 = var0.field3607;
        int[] var3 = var0.field3610;
        int[] var4 = var0.field3642;
        int[] var5 = var0.field3618;
        int[] var6 = var0.field3611;
        var0.field3636 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class172.field2669[var8] >> 1;
            int var10 = class172.field2658[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class172.field2658[var17] >> 9;
                int var19 = (class172.field2669[var17] >> 1) * var9 >> 23;
                int var20 = (class172.field2669[var17] >> 1) * var10 >> 23;
                var1[var0.field3636] = var20;
                var2[var0.field3636] = var18;
                var3[var0.field3636] = -var19;
                var0.field3636++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field3630] = 0;
                var5[var0.field3630] = var13;
                var6[var0.field3630] = var12;
                var0.field3630++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field3630] = var13;
                    var5[var0.field3630] = var15;
                    var6[var0.field3630] = var12;
                    var0.field3630++;
                    var4[var0.field3630] = var15;
                    var5[var0.field3630] = var16;
                    var6[var0.field3630] = var12;
                    var0.field3630++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field3630] = var12;
                var5[var0.field3630] = var13;
                var6[var0.field3630] = 1;
                var0.field3630++;
            }
        }
        var0.field3620 = var0.field3636;
        var0.field3632 = null;
        var0.field3603 = null;
        var0.field3643 = null;
        var0.field3633 = null;
        var0.field3621 = null;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method546();
        super.finalize();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method543(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1290[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()V")
    public static void method544() {
        field1280 = null;
        field1290 = null;
        field1292 = null;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()V")
    private final void method545() {
        int var1 = this.field1281 * 3 / 32;
        int var3 = this.field1281 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class62.field934 * var1 + var1;
        int var8 = class62.field934 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class62.field935) {
            var4 = var3 - (var1 + var3 - class62.field935);
        }
        if (var1 < class62.field930) {
            int var11 = class62.field930 - var1;
            var4 -= var11;
            var7 += class62.field934 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class62.field933) {
            int var12 = var1 + var3 - class62.field933;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class62.field929) {
            int var13 = class62.field929 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method543(class62.field932, 0, this.field1288, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()V")
    private final void method546() {
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()V")
    private final void method547() {
        int var1 = this.field1281;
        int var2 = this.field1281;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class62.field934 - var1;
        if (var2 > class62.field935) {
            var2 -= var2 - class62.field935;
        }
        if (class62.field930 > 0) {
            int var9 = class62.field930;
            var2 -= var9;
            var7 += class62.field934 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class62.field933) {
            int var10 = var1 - class62.field933;
            var1 -= var10;
            var8 += var10;
        }
        if (class62.field929 > 0) {
            int var11 = class62.field929;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method538(class62.field932, this.field1288, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "()V")
    private static final void method548() {
        if (field1290 != null) {
            return;
        }
        field1290 = new byte[16384];
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
                field1290[var4 + var6] = field1290[var4 + var9] = field1290[var5 + var6] = field1290[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIILph;)V")
    public final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6) {
        int var8 = this.field1278 - arg4 & 0x7FF;
        int var9 = this.field1282 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1284) / 2 + var10;
        int var13 = (arg2 - this.field1284) / 2 + var11;
        if (var12 < arg3 && this.field1284 + var12 > 0 && var13 < arg2 && this.field1284 + var13 > 0 && this.method541(arg6)) {
            this.field1286.method241(arg0 + var13, arg1 + var12, this.field1284, this.field1284);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1291 = arg2;
        this.field1279 = arg3;
        this.field1294 = arg4;
        this.field1293 = arg7;
        this.field1285 = arg1;
        this.field1288 = arg6;
        this.field1289 = arg5;
        this.field1287 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Z")
    public final boolean method550(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1293) {
            this.field1283 = 1073741823;
            var8 = this.field1291;
            var9 = this.field1279;
            var10 = this.field1294;
        } else {
            int var5 = this.field1291 - arg0;
            int var6 = this.field1279 - arg1;
            int var7 = this.field1294 - arg2;
            this.field1283 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1283 == 0) {
                this.field1283 = 1;
            }
            var8 = (var5 << 8) / this.field1283;
            var9 = (var6 << 8) / this.field1283;
            var10 = (var7 << 8) / this.field1283;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1284 = this.field1289 * arg3 / (this.field1293 ? 1024 : this.field1283);
        } else {
            this.field1284 = 0;
        }
        if (this.field1284 < 8) {
            this.method546();
            this.field1286 = null;
            return false;
        }
        int var12 = class276.method1918(this.field1284, (byte) -99);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1281 != var12) {
            this.field1281 = var12;
        }
        this.field1278 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1282 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1286 = null;
        return true;
    }
}
