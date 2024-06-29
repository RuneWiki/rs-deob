import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class110 {

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Z")
    private boolean field1521;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "[I")
    private static int[] field1520 = new int[4];

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "Lda;")
    private static class55 field1530;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "Lf;")
    private class702 field1518;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lf;")
    private static class702 field1519;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Lf;")
    private static class702 field1531;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()V", line = 3)
    public static final void method792() {
        field1530 = null;
        field1531 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lr;Lju;)Z", line = 13)
    private final boolean method793(class166 arg0, class110 arg1) {
        if (this.field1518 == null) {
            if (this.field1527 == 0) {
                if (class84.field1249.method1367(this.field1524, false)) {
                    int[] var3 = class84.field1249.method1370(0.7F, false, this.field1525, (byte) -16, this.field1525, this.field1524);
                    this.field1518 = arg0.method175(var3, 0, this.field1525, this.field1525, this.field1525);
                }
            } else if (this.field1527 == 2) {
                this.method796(arg0, arg1);
            } else if (this.field1527 == 1) {
                this.method801(arg0, arg1);
            }
        }
        return this.field1518 != null;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()V", line = 51)
    public static void method794() {
        field1530 = null;
        field1519 = null;
        field1531 = null;
        field1520 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lr;IIIIII)V", line = 59)
    public final void method795(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1518 == null) {
            return;
        }
        int var8 = this.field1523 - arg5 & 0x3FFF;
        int var9 = this.field1535 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1526) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1526) / 2;
        if (var10 < arg4 && this.field1526 + var10 > 0 && var11 < arg3 && this.field1526 + var11 > 0) {
            this.field1518.method3932(arg1 + var11, arg2 + var10, this.field1526, this.field1526);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lr;Lju;)V", line = 85)
    private final void method796(class166 arg0, class110 arg1) {
        class270 var3 = class29.method282(0, (byte) 124, this.field1524, class5.field43);
        if (var3 == null) {
            return;
        }
        arg0.method174(field1520);
        arg0.method200(0, 0, this.field1525, this.field1525);
        arg0.method110(0, 0, this.field1525, this.field1525, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1521) {
                var4 = -arg1.field1529;
                var5 = -arg1.field1532;
                var6 = -arg1.field1533;
            } else {
                var4 = this.field1529 - arg1.field1529;
                var5 = this.field1532 - arg1.field1532;
                var6 = this.field1533 - arg1.field1533;
            }
        }
        if (this.field1523 != 0) {
            int var7 = -this.field1523 & 0x3FFF;
            int var8 = class597.field8342[var7];
            int var9 = class597.field8344[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field1535 != 0) {
            int var11 = -this.field1535 & 0x3FFF;
            int var12 = class597.field8342[var11];
            int var13 = class597.field8344[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method105(1.0F);
        arg0.method117(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class55 var15 = arg0.method106(var3, 2048, 0, 64, 768);
        int var16 = var15.method415() - var15.method424();
        int var17 = var15.method464() - var15.method463();
        int var18 = var15.method424() + var16 / 2;
        int var19 = var15.method463() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method161(var18, var19, var20, var20);
        arg0.method93(arg0.method168());
        class392 var21 = arg0.method166();
        var21.method689(0, 0, arg0.method133() - var15.method420());
        var15.method453(var21, null, arg0.method133(), 1);
        this.field1518 = arg0.method156(0, 0, this.field1525, this.field1525, true);
        this.field1518.method939(0, 0, 3);
        arg0.method200(field1520[0], field1520[1], field1520[2], field1520[3]);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(Lr;Lju;)Z", line = 169)
    public final boolean method797(class166 arg0, class110 arg1) {
        return this.field1518 != null || this.method793(arg0, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "()V", line = 175)
    public final void method798() {
        this.field1518 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)Z", line = 184)
    public final boolean method799(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1521) {
            this.field1522 = 1073741823;
            var8 = this.field1529;
            var9 = this.field1532;
            var10 = this.field1533;
        } else {
            int var5 = this.field1529 - arg0;
            int var6 = this.field1532 - arg1;
            int var7 = this.field1533 - arg2;
            this.field1522 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1522 == 0) {
                this.field1522 = 1;
            }
            var8 = (var5 << 8) / this.field1522;
            var9 = (var6 << 8) / this.field1522;
            var10 = (var7 << 8) / this.field1522;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1526 = this.field1528 * arg3 / (this.field1521 ? 1024 : this.field1522);
        } else {
            this.field1526 = 0;
        }
        if (this.field1526 < 8) {
            this.field1518 = null;
            return false;
        }
        int var12 = class206.method1334(-1, this.field1526);
        if (var12 > arg3) {
            var12 = class180.method1240(arg3, -1);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1525 != var12) {
            this.field1525 = var12;
        }
        this.field1523 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field1535 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field1518 = null;
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lr;)V", line = 240)
    private static final void method800(class166 arg0) {
        if (field1530 != null) {
            return;
        }
        class270 var1 = new class270(580, 1104, 1);
        var1.method1645((byte) 0, (byte) 0, (short) 1024, (byte) 0, (short) 0, (short) 1024, (short) 32767, (short) 0, (byte) 123, (short) 1024);
        var1.method1640(0, 128, -11602, 0);
        var1.method1640(0, -128, -11602, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class597.field8342[var3];
            int var5 = class597.field8344[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class597.field8344[var12] >> 7;
                int var14 = class597.field8342[var12] * var4 >> 21;
                int var15 = class597.field8342[var12] * var5 >> 21;
                var1.method1640(-var14, var13, -11602, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1643(0, var8, (byte) 0, (short) 127, -90, (byte) 0, var7, (short) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1643(var8, var10, (byte) 0, (short) 127, -94, (byte) 0, var7, (short) 0, (byte) 0);
                    var1.method1643(var10, var11, (byte) 0, (short) 127, -62, (byte) 0, var7, (short) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1643(var7, var8, (byte) 0, (short) 127, -6, (byte) 0, 1, (short) 0, (byte) 0);
            }
        }
        var1.field3670 = var1.field3649;
        var1.field3667 = null;
        var1.field3650 = null;
        var1.field3679 = null;
        field1530 = arg0.method106(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(Lr;Lju;)V", line = 324)
    private final void method801(class166 arg0, class110 arg1) {
        method800(arg0);
        method802(arg0);
        arg0.method174(field1520);
        arg0.method200(0, 0, this.field1525, this.field1525);
        arg0.method89();
        arg0.method110(0, 0, this.field1525, this.field1525, this.field1534 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1521) {
                var3 = -arg1.field1529;
                var4 = -arg1.field1532;
                var5 = -arg1.field1533;
            } else {
                var3 = arg1.field1529 - this.field1529;
                var4 = arg1.field1532 - this.field1532;
                var5 = arg1.field1533 - this.field1533;
            }
        }
        if (this.field1523 != 0) {
            int var6 = class597.field8342[this.field1523];
            int var7 = class597.field8344[this.field1523];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field1535 != 0) {
            int var9 = class597.field8342[this.field1535];
            int var10 = class597.field8344[this.field1535];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class55 var12 = field1530.method462((byte) 0, 51200, true);
        if (arg0.method201()) {
            var12.method443((short) 0, (short) this.field1524);
        } else {
            var12.method439((short) 127, class84.field1249.method1365(-17951, this.field1524).field9777);
            var12.method443((short) 0, (short) -1);
        }
        arg0.method105(1.0F);
        arg0.method117(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1525 * 1024 / (var12.method415() - var12.method424());
        if (this.field1534 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method161(this.field1525 / 2, this.field1525 / 2, var13, var13);
        arg0.method93(arg0.method168());
        class392 var14 = arg0.method168();
        var14.method689(0, 0, arg0.method133() - var12.method420());
        var12.method453(var14, null, 1024, 1);
        int var15 = this.field1525 * 13 / 16;
        int var16 = (this.field1525 - var15) / 2;
        field1519.method3934(var16, var16, var15, var15, 0, this.field1534 | 0xFF000000, 1);
        this.field1518 = arg0.method156(0, 0, this.field1525, this.field1525, true);
        arg0.method89();
        arg0.method110(0, 0, this.field1525, this.field1525, 0, 0);
        field1531.method3934(0, 0, this.field1525, this.field1525, 1, 0, 0);
        this.field1518.method939(0, 0, 0);
        arg0.method200(field1520[0], field1520[1], field1520[2], field1520[3]);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lr;)V", line = 413)
    private static final void method802(class166 arg0) {
        if (field1531 != null) {
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
        field1531 = arg0.method175(var2, 0, 128, 128, 128);
        field1519 = arg0.method175(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 475)
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1529 = arg2;
        this.field1532 = arg3;
        this.field1533 = arg4;
        this.field1521 = arg7;
        this.field1524 = arg1;
        this.field1534 = arg6;
        this.field1528 = arg5;
        this.field1527 = arg0;
    }
}
