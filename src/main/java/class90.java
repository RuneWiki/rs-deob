import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class90 {

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Z")
    private boolean field1292;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    private static int[] field1281 = new int[4];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ll;")
    private class16 field1288;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ll;")
    private static class16 field1289;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ll;")
    private static class16 field1295;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lt;")
    private static class475 field1282;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Z", line = 7)
    public final boolean method733(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1292) {
            this.field1291 = 1073741823;
            var8 = this.field1294;
            var9 = this.field1286;
            var10 = this.field1285;
        } else {
            int var5 = this.field1294 - arg0;
            int var6 = this.field1286 - arg1;
            int var7 = this.field1285 - arg2;
            this.field1291 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1291 == 0) {
                this.field1291 = 1;
            }
            var8 = (var5 << 8) / this.field1291;
            var9 = (var6 << 8) / this.field1291;
            var10 = (var7 << 8) / this.field1291;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1284 = this.field1290 * arg3 / (this.field1292 ? 1024 : this.field1291);
        } else {
            this.field1284 = 0;
        }
        if (this.field1284 < 8) {
            this.field1288 = null;
            return false;
        }
        int var12 = class396.method2493((byte) 66, this.field1284);
        if (var12 > arg3) {
            var12 = class324.method2059((byte) 45, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1280 != var12) {
            this.field1280 = var12;
        }
        this.field1279 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1296 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1288 = null;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V", line = 67)
    public final void method734() {
        this.field1288 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lya;)V", line = 77)
    private static final void method735(class38 arg0) {
        if (field1289 != null) {
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
        field1289 = arg0.method350(var2, 0, 128, 128, 128);
        field1295 = arg0.method350(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lya;IIIIII)V", line = 139)
    public final void method736(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1288 == null) {
            return;
        }
        int var8 = this.field1279 - arg5 & 0x3FFF;
        int var9 = this.field1296 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1284) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1284) / 2;
        if (var10 < arg4 && this.field1284 + var10 > 0 && var11 < arg3 && this.field1284 + var11 > 0) {
            this.field1288.method126(arg1 + var11, arg2 + var10, this.field1284, this.field1284);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lya;Lmc;)V", line = 163)
    private final void method737(class38 arg0, class90 arg1) {
        method738(arg0);
        method735(arg0);
        arg0.method351(field1281);
        arg0.method313(0, 0, this.field1280, this.field1280);
        arg0.method306();
        arg0.method284(0, 0, this.field1280, this.field1280, this.field1293 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1292) {
                var3 = -arg1.field1294;
                var4 = -arg1.field1286;
                var5 = -arg1.field1285;
            } else {
                var3 = arg1.field1294 - this.field1294;
                var4 = arg1.field1286 - this.field1286;
                var5 = arg1.field1285 - this.field1285;
            }
        }
        if (this.field1279 != 0) {
            int var6 = class281.field4278[this.field1279];
            int var7 = class281.field4279[this.field1279];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1296 != 0) {
            int var9 = class281.field4278[this.field1296];
            int var10 = class281.field4279[this.field1296];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class475 var12 = field1282.method449((byte) 0, 51200, true);
        if (arg0.method323()) {
            var12.method457((short) 0, (short) this.field1283);
        } else {
            var12.method436((short) 127, class172.field2560.method584(true, this.field1283).field4263);
            var12.method457((short) 0, (short) -1);
        }
        arg0.method271(1.0F);
        arg0.method324(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1280 * 1024 / (var12.method451() - var12.method423());
        if (this.field1293 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method268(this.field1280 / 2, this.field1280 / 2, var13, var13);
        arg0.method362(arg0.method291());
        class125 var14 = arg0.method291();
        var14.method206(0, 0, arg0.method308() - var12.method416());
        var12.method437(var14, null, 1024, 1);
        int var15 = this.field1280 * 13 / 16;
        int var16 = (this.field1280 - var15) / 2;
        field1295.method135(var16, var16, var15, var15, 0, this.field1293 | 0xFF000000, 1);
        this.field1288 = arg0.method269(0, 0, this.field1280, this.field1280, true);
        arg0.method306();
        arg0.method284(0, 0, this.field1280, this.field1280, 0, 0);
        field1289.method135(0, 0, this.field1280, this.field1280, 1, 0, 0);
        this.field1288.method133(0, 0, 0);
        arg0.method313(field1281[0], field1281[1], field1281[2], field1281[3]);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lya;)V", line = 256)
    private static final void method738(class38 arg0) {
        if (field1282 != null) {
            return;
        }
        class374 var1 = new class374(580, 1104, 1);
        var1.method2341((short) 32767, (short) 0, (byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024, (byte) -126, (short) 1024, (byte) 0);
        var1.method2348(128, 0, 0, (byte) 60);
        var1.method2348(-128, 0, 0, (byte) 99);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class281.field4278[var3];
            int var5 = class281.field4279[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class281.field4279[var12] >> 8;
                int var14 = class281.field4278[var12] * var4 >> 23;
                int var15 = class281.field4278[var12] * var5 >> 23;
                var1.method2348(var13, -var14, var15, (byte) 80);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2344(0, (byte) 122, (byte) 0, var7, (short) 127, var8, (byte) 0, (short) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2344(var8, (byte) -64, (byte) 0, var7, (short) 127, var10, (byte) 0, (short) 0, (byte) 0);
                    var1.method2344(var10, (byte) 93, (byte) 0, var7, (short) 127, var11, (byte) 0, (short) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2344(var7, (byte) 102, (byte) 0, 1, (short) 127, var8, (byte) 0, (short) 0, (byte) 0);
            }
        }
        var1.field5572 = var1.field5561;
        var1.field5607 = null;
        var1.field5563 = null;
        var1.field5567 = null;
        field1282 = arg0.method330(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V", line = 345)
    public static void method739() {
        field1282 = null;
        field1295 = null;
        field1289 = null;
        field1281 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lya;Lmc;)Z", line = 351)
    public final boolean method740(class38 arg0, class90 arg1) {
        return this.field1288 != null || this.method741(arg0, arg1);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lya;Lmc;)Z", line = 355)
    private final boolean method741(class38 arg0, class90 arg1) {
        if (this.field1288 == null) {
            if (this.field1287 == 0) {
                if (class172.field2560.method579(this.field1283, true)) {
                    int[] var3 = class172.field2560.method581(this.field1283, false, this.field1280, 116, this.field1280, 0.7F);
                    this.field1288 = arg0.method350(var3, 0, this.field1280, this.field1280, this.field1280);
                }
            } else if (this.field1287 == 2) {
                this.method743(arg0, arg1);
            } else if (this.field1287 == 1) {
                this.method737(arg0, arg1);
            }
        }
        return this.field1288 != null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V", line = 389)
    public static final void method742() {
        field1282 = null;
        field1289 = null;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lya;Lmc;)V", line = 394)
    private final void method743(class38 arg0, class90 arg1) {
        class374 var3 = class356.method2233(this.field1283, (byte) -71, 0, class224.field3665);
        if (var3 == null) {
            return;
        }
        arg0.method351(field1281);
        arg0.method313(0, 0, this.field1280, this.field1280);
        arg0.method284(0, 0, this.field1280, this.field1280, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1292) {
                var4 = -arg1.field1294;
                var5 = -arg1.field1286;
                var6 = -arg1.field1285;
            } else {
                var4 = this.field1294 - arg1.field1294;
                var5 = this.field1286 - arg1.field1286;
                var6 = this.field1285 - arg1.field1285;
            }
        }
        if (this.field1279 != 0) {
            int var7 = -this.field1279 & 0x3FFF;
            int var8 = class281.field4278[var7];
            int var9 = class281.field4279[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1296 != 0) {
            int var11 = -this.field1296 & 0x3FFF;
            int var12 = class281.field4278[var11];
            int var13 = class281.field4279[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method271(1.0F);
        arg0.method324(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class475 var15 = arg0.method330(var3, 2048, 0, 64, 768);
        int var16 = var15.method451() - var15.method423();
        int var17 = var15.method432() - var15.method427();
        int var18 = var15.method423() + var16 / 2;
        int var19 = var15.method427() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method268(var18, var19, var20, var20);
        arg0.method362(arg0.method291());
        class125 var21 = arg0.method296();
        var21.method206(0, 0, arg0.method308() - var15.method416());
        var15.method437(var21, null, arg0.method308(), 1);
        this.field1288 = arg0.method269(0, 0, this.field1280, this.field1280, true);
        this.field1288.method133(0, 0, 3);
        arg0.method313(field1281[0], field1281[1], field1281[2], field1281[3]);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1294 = arg2;
        this.field1286 = arg3;
        this.field1285 = arg4;
        this.field1292 = arg7;
        this.field1283 = arg1;
        this.field1293 = arg6;
        this.field1290 = arg5;
        this.field1287 = arg0;
    }
}
