import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class87 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    private boolean field1296;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[I")
    private static int[] field1302 = new int[4];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lak;")
    private class140 field1297;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Laa;")
    private static class173 field1295;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[B")
    private static byte[] field1292;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    private static final void method651() {
        if (field1292 != null) {
            return;
        }
        field1292 = new byte[16384];
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
                field1292[var4 + var6] = field1292[var4 + var9] = field1292[var5 + var6] = field1292[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    private static final void method652() {
        if (field1295 != null) {
            return;
        }
        class173 var0 = field1295 = new class173(260, 480, 0);
        int[] var1 = var0.field2788;
        int[] var2 = var0.field2779;
        int[] var3 = var0.field2787;
        int[] var4 = var0.field2813;
        int[] var5 = var0.field2819;
        int[] var6 = var0.field2796;
        var0.field2820 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class47.field679[var8] >> 1;
            int var10 = class47.field695[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class47.field695[var17] >> 9;
                int var19 = (class47.field679[var17] >> 1) * var9 >> 23;
                int var20 = (class47.field679[var17] >> 1) * var10 >> 23;
                var1[var0.field2820] = var20;
                var2[var0.field2820] = var18;
                var3[var0.field2820] = -var19;
                var0.field2820++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2791] = 0;
                var5[var0.field2791] = var13;
                var6[var0.field2791] = var12;
                var0.field2791++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2791] = var13;
                    var5[var0.field2791] = var15;
                    var6[var0.field2791] = var12;
                    var0.field2791++;
                    var4[var0.field2791] = var15;
                    var5[var0.field2791] = var16;
                    var6[var0.field2791] = var12;
                    var0.field2791++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2791] = var12;
                var5[var0.field2791] = var13;
                var6[var0.field2791] = 1;
                var0.field2791++;
            }
        }
        var0.field2773 = var0.field2820;
        var0.field2780 = null;
        var0.field2798 = null;
        var0.field2790 = null;
        var0.field2801 = null;
        var0.field2789 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method653(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1292[(arg3 >> 16) + var15] & 0xFF) + 64;
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method654(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1292[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
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

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method657();
        super.finalize();
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnc;)Z")
    private final boolean method655(class87 arg0) {
        if (this.field1297 == null) {
            if (this.field1290 == 0) {
                this.field1297 = class47.field689.method234(255, this.field1301, class47.field683, true, this.field1293);
            } else if (this.field1290 == 2) {
                this.method661(arg0);
            } else if (this.field1290 == 1) {
                this.method656(arg0);
            }
        }
        return this.field1297 != null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lnc;)V")
    private final void method656(class87 arg0) {
        method652();
        method651();
        this.field1297 = new class9(this.field1301, this.field1301);
        class70.method507(field1302);
        this.field1297.method989();
        class47.method357();
        class70.method508(0, 0, this.field1301, this.field1301, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1296) {
                var2 = -arg0.field1300;
                var3 = -arg0.field1298;
                var4 = -arg0.field1303;
            } else {
                var2 = this.field1300 - arg0.field1300;
                var3 = this.field1298 - arg0.field1298;
                var4 = this.field1303 - arg0.field1303;
            }
        }
        if (this.field1288 != 0) {
            int var5 = class47.field679[this.field1288];
            int var6 = class47.field695[this.field1288];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1304 != 0) {
            int var8 = this.field1304 - 1024 & 0x7FF;
            int var9 = class47.field679[var8];
            int var10 = class47.field695[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class158.method1178(field1295.field2793, 0, field1295.field2791, (short) class47.field689.method237(this.field1293, 65535));
        class246 var12 = field1295.method1299(64, 512, -var2, -var3, -var4);
        int var13 = var12.method166() - var12.method146();
        int var14 = var12.method1764() - var12.method3();
        if (var13 > var14) {
            int var15 = this.field1294 == 0 ? (var13 << 9) / this.field1301 : (var13 * 16 << 9) / (this.field1301 * 13);
            var12.method1775(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1294 == 0 ? (var14 << 9) / this.field1301 : (var14 * 16 << 9) / (this.field1301 * 13);
            var12.method1775(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1294 == 0) {
            for (int var17 = 0; var17 < class70.field1031.length; var17++) {
                if (class70.field1031[var17] != 0) {
                    class70.field1031[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method662();
            this.method658();
        }
        class29.field367.method111((byte) 50);
        class70.method495(field1302);
        class47.method357();
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()V")
    private final void method657() {
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
    private final void method658() {
        int var1 = this.field1301;
        int var2 = this.field1301;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class70.field1030 - var1;
        if (var2 > class70.field1035) {
            var2 -= var2 - class70.field1035;
        }
        if (class70.field1027 > 0) {
            int var9 = class70.field1027;
            var2 -= var9;
            var7 += class70.field1030 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class70.field1032) {
            int var10 = var1 - class70.field1032;
            var1 -= var10;
            var8 += var10;
        }
        if (class70.field1029 > 0) {
            int var11 = class70.field1029;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method654(class70.field1031, this.field1294, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIILnc;)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6) {
        int var8 = this.field1288 - arg4 & 0x7FF;
        int var9 = this.field1304 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1291) / 2 + var10;
        int var13 = (arg2 - this.field1291) / 2 + var11;
        if (var12 < arg3 && this.field1291 + var12 > 0 && var13 < arg2 && this.field1291 + var13 > 0 && this.method655(arg6)) {
            this.field1297.method74(arg0 + var13, arg1 + var12, this.field1291, this.field1291);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)Z")
    public final boolean method660(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1296) {
            this.field1289 = 1073741823;
            var8 = this.field1300;
            var9 = this.field1298;
            var10 = this.field1303;
        } else {
            int var5 = this.field1300 - arg0;
            int var6 = this.field1298 - arg1;
            int var7 = this.field1303 - arg2;
            this.field1289 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1289 == 0) {
                this.field1289 = 1;
            }
            var8 = (var5 << 8) / this.field1289;
            var9 = (var6 << 8) / this.field1289;
            var10 = (var7 << 8) / this.field1289;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1291 = this.field1299 * arg3 / (this.field1296 ? 1024 : this.field1289);
        } else {
            this.field1291 = 0;
        }
        if (this.field1291 < 8) {
            this.method657();
            this.field1297 = null;
            return false;
        }
        int var12 = class98.method755(-18002, this.field1291);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1301 != var12) {
            this.field1301 = var12;
        }
        this.field1288 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1304 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1297 = null;
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lnc;)V")
    private final void method661(class87 arg0) {
        class173 var2 = class173.method1281(class219.field3510, this.field1293, 0);
        if (var2 == null) {
            return;
        }
        this.field1297 = new class140(this.field1301, this.field1301);
        class70.method507(field1302);
        this.field1297.method989();
        class47.method357();
        class70.method508(0, 0, this.field1301, this.field1301, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1296) {
                var3 = -arg0.field1300;
                var4 = -arg0.field1298;
                var5 = -arg0.field1303;
            } else {
                var3 = this.field1300 - arg0.field1300;
                var4 = this.field1298 - arg0.field1298;
                var5 = this.field1303 - arg0.field1303;
            }
        }
        if (this.field1288 != 0) {
            int var6 = class47.field679[this.field1288];
            int var7 = class47.field695[this.field1288];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1304 != 0) {
            int var9 = this.field1304 - 1024 & 0x7FF;
            int var10 = class47.field679[var9];
            int var11 = class47.field695[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class246 var13 = var2.method1299(64, 768, -var3, -var4, -var5);
        int var14 = var13.method166() - var13.method146();
        int var15 = var13.method1764() - var13.method3();
        int var16 = var13.method146() + var14 / 2;
        int var17 = var13.method3() + var15 / 2;
        if (var14 > var15) {
            var13.method1775(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1301);
        } else {
            var13.method1775(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1301);
        }
        class29.field367.method111((byte) 50);
        class70.method495(field1302);
        class47.method357();
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
    private final void method662() {
        int var1 = this.field1301 * 3 / 32;
        int var3 = this.field1301 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class70.field1030 * var1 + var1;
        int var8 = class70.field1030 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class70.field1035) {
            var4 = var3 - (var1 + var3 - class70.field1035);
        }
        if (var1 < class70.field1027) {
            int var11 = class70.field1027 - var1;
            var4 -= var11;
            var7 += class70.field1030 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class70.field1032) {
            int var12 = var1 + var3 - class70.field1032;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class70.field1029) {
            int var13 = class70.field1029 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method653(class70.field1031, 0, this.field1294, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()V")
    public static void method663() {
        field1295 = null;
        field1292 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1300 = arg2;
        this.field1298 = arg3;
        this.field1303 = arg4;
        this.field1296 = arg7;
        this.field1293 = arg1;
        this.field1294 = arg6;
        this.field1299 = arg5;
        this.field1290 = arg0;
    }
}
