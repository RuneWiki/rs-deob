import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class176 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
    private boolean field2409;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    private int field2412;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    private static int[] field2401 = new int[4];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    private int field2408;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    private int field2411;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lsg;")
    private class226 field2400;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lsg;")
    private static class226 field2404;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lsg;")
    private static class226 field2410;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lmj;")
    private static class394 field2403;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Luo;Ldb;)Z")
    private final boolean method1153(class345 arg0, class176 arg1) {
        if (this.field2400 == null) {
            if (this.field2406 == 0) {
                if (class291.field4080.method473(this.field2412, 118)) {
                    int[] var3 = class291.field4080.method468(this.field2415, 0.7F, -24250, this.field2415, this.field2412, false);
                    this.field2400 = arg0.method128(var3, 0, this.field2415, this.field2415, this.field2415);
                }
            } else if (this.field2406 == 2) {
                this.method1162(arg0, arg1);
            } else if (this.field2406 == 1) {
                this.method1163(arg0, arg1);
            }
        }
        return this.field2400 != null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Z")
    public final boolean method1154(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2409) {
            this.field2405 = 1073741823;
            var8 = this.field2399;
            var9 = this.field2413;
            var10 = this.field2416;
        } else {
            int var5 = this.field2399 - arg0;
            int var6 = this.field2413 - arg1;
            int var7 = this.field2416 - arg2;
            this.field2405 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2405 == 0) {
                this.field2405 = 1;
            }
            var8 = (var5 << 8) / this.field2405;
            var9 = (var6 << 8) / this.field2405;
            var10 = (var7 << 8) / this.field2405;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2407 = this.field2402 * arg3 / (this.field2409 ? 1024 : this.field2405);
        } else {
            this.field2407 = 0;
        }
        if (this.field2407 < 8) {
            this.field2400 = null;
            return false;
        }
        int var12 = class438.method2748((byte) 121, this.field2407);
        if (var12 > arg3) {
            var12 = class414.method2594(arg3, (byte) -125);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2415 != var12) {
            this.field2415 = var12;
        }
        this.field2408 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2411 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2400 = null;
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
    public static final void method1155() {
        field2403 = null;
        field2404 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Luo;)V")
    private static final void method1156(class345 arg0) {
        if (field2403 != null) {
            return;
        }
        class223 var1 = new class223(580, 1104, 1);
        var1.method1479((short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 0, (byte) 0, -256, (short) 32767, (byte) 0, (short) 1024);
        var1.method1486((byte) 26, 0, 128, 0);
        var1.method1486((byte) -117, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class133.field1913[var3];
            int var5 = class133.field1908[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class133.field1908[var12] >> 8;
                int var14 = class133.field1913[var12] * var4 >> 23;
                int var15 = class133.field1913[var12] * var5 >> 23;
                var1.method1486((byte) -94, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1493((short) 0, (byte) -118, 0, (byte) 0, var7, (byte) 0, (short) 127, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1493((short) 0, (byte) -113, var8, (byte) 0, var7, (byte) 0, (short) 127, (byte) 0, var10);
                    var1.method1493((short) 0, (byte) -110, var10, (byte) 0, var7, (byte) 0, (short) 127, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1493((short) 0, (byte) -118, var7, (byte) 0, 1, (byte) 0, (short) 127, (byte) 0, var8);
            }
        }
        var1.field3132 = var1.field3150;
        var1.field3147 = null;
        var1.field3164 = null;
        var1.field3139 = null;
        field2403 = arg0.method62(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
    public final void method1157() {
        this.field2400 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V")
    public static void method1158() {
        field2403 = null;
        field2410 = null;
        field2404 = null;
        field2401 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Luo;Ldb;)Z")
    public final boolean method1159(class345 arg0, class176 arg1) {
        return this.field2400 != null || this.method1153(arg0, arg1);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Luo;)V")
    private static final void method1160(class345 arg0) {
        if (field2404 != null) {
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
        field2404 = arg0.method128(var2, 0, 128, 128, 128);
        field2410 = arg0.method128(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Luo;IIIIII)V")
    public final void method1161(class345 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2400 == null) {
            return;
        }
        int var8 = this.field2408 - arg5 & 0x3FFF;
        int var9 = this.field2411 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2407) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2407) / 2;
        if (var10 < arg4 && this.field2407 + var10 > 0 && var11 < arg3 && this.field2407 + var11 > 0) {
            this.field2400.method1498(arg1 + var11, arg2 + var10, this.field2407, this.field2407);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Luo;Ldb;)V")
    private final void method1162(class345 arg0, class176 arg1) {
        class223 var3 = class121.method823(0, false, class288.field4048, this.field2412);
        if (var3 == null) {
            return;
        }
        arg0.method107(field2401);
        arg0.method136(0, 0, this.field2415, this.field2415);
        arg0.method56(0, 0, this.field2415, this.field2415, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2409) {
                var4 = -arg1.field2399;
                var5 = -arg1.field2413;
                var6 = -arg1.field2416;
            } else {
                var4 = this.field2399 - arg1.field2399;
                var5 = this.field2413 - arg1.field2413;
                var6 = this.field2416 - arg1.field2416;
            }
        }
        if (this.field2408 != 0) {
            int var7 = -this.field2408 & 0x3FFF;
            int var8 = class133.field1913[var7];
            int var9 = class133.field1908[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2411 != 0) {
            int var11 = -this.field2411 & 0x3FFF;
            int var12 = class133.field1913[var11];
            int var13 = class133.field1908[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method90(1.0F);
        arg0.method67(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class394 var15 = arg0.method62(var3, 1024, 0, 64, 768);
        int var16 = var15.method1458() - var15.method1450();
        int var17 = var15.method1426() - var15.method1443();
        int var18 = var15.method1450() + var16 / 2;
        int var19 = var15.method1443() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method63(var18, var19, var20, var20);
        arg0.method126(arg0.method101());
        class417 var21 = arg0.method84();
        var21.method702(0, 0, arg0.method49() - var15.method1433());
        var15.method1464(var21, (class84) null, arg0.method49(), 1);
        this.field2400 = arg0.method117(0, 0, this.field2415, this.field2415, true);
        this.field2400.method591(0, 0, 3);
        arg0.method136(field2401[0], field2401[1], field2401[2], field2401[3]);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(Luo;Ldb;)V")
    private final void method1163(class345 arg0, class176 arg1) {
        method1156(arg0);
        method1160(arg0);
        arg0.method107(field2401);
        arg0.method136(0, 0, this.field2415, this.field2415);
        arg0.method135();
        arg0.method56(0, 0, this.field2415, this.field2415, this.field2414 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2409) {
                var3 = -arg1.field2399;
                var4 = -arg1.field2413;
                var5 = -arg1.field2416;
            } else {
                var3 = arg1.field2399 - this.field2399;
                var4 = arg1.field2413 - this.field2413;
                var5 = arg1.field2416 - this.field2416;
            }
        }
        if (this.field2408 != 0) {
            int var6 = class133.field1913[this.field2408];
            int var7 = class133.field1908[this.field2408];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2411 != 0) {
            int var9 = class133.field1913[this.field2411];
            int var10 = class133.field1908[this.field2411];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class394 var12 = field2403.method1430((byte) 0, 25600, true);
        if (arg0.method109()) {
            var12.method1452((short) 0, (short) this.field2412);
        } else {
            var12.method1460((short) 127, class291.field4080.method469(this.field2412, (byte) -69).field6489);
            var12.method1452((short) 0, (short) -1);
        }
        arg0.method90(1.0F);
        arg0.method67(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2415 * 1024 / (var12.method1458() - var12.method1450());
        if (this.field2414 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method63(this.field2415 / 2, this.field2415 / 2, var13, var13);
        arg0.method126(arg0.method101());
        class417 var14 = arg0.method101();
        var14.method702(0, 0, arg0.method49() - var12.method1433());
        var12.method1464(var14, (class84) null, 1024, 1);
        int var15 = this.field2415 * 13 / 16;
        int var16 = (this.field2415 - var15) / 2;
        field2410.method588(var16, var16, var15, var15, 1, this.field2414 | 0xFF000000, 1);
        this.field2400 = arg0.method117(0, 0, this.field2415, this.field2415, true);
        arg0.method135();
        arg0.method56(0, 0, this.field2415, this.field2415, 0, 0);
        field2404.method588(0, 0, this.field2415, this.field2415, 0, 0, 0);
        this.field2400.method591(0, 0, 0);
        arg0.method136(field2401[0], field2401[1], field2401[2], field2401[3]);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2399 = arg2;
        this.field2413 = arg3;
        this.field2416 = arg4;
        this.field2409 = arg7;
        this.field2412 = arg1;
        this.field2414 = arg6;
        this.field2402 = arg5;
        this.field2406 = arg0;
    }
}
