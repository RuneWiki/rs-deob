import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class240 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
    private boolean field3628;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private int field3626;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    private static int[] field3619 = new int[4];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field3625;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lig;")
    private static class154 field3615;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lig;")
    private class154 field3618;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lig;")
    private static class154 field3623;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lcd;")
    private static class198 field3621;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static void method1435() {
        field3621 = null;
        field3623 = null;
        field3615 = null;
        field3619 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lqq;Lhe;)Z")
    public final boolean method1436(class318 arg0, class240 arg1) {
        return this.field3618 != null || this.method1437(arg0, arg1);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lqq;Lhe;)Z")
    private final boolean method1437(class318 arg0, class240 arg1) {
        if (this.field3618 == null) {
            if (this.field3616 == 0) {
                if (class505.field7629.method61(this.field3622, (byte) -71)) {
                    int[] var3 = class505.field7629.method58(this.field3625, 0.7F, false, this.field3622, this.field3625, 19907);
                    this.field3618 = arg0.method1924(var3, 0, this.field3625, this.field3625, this.field3625);
                }
            } else if (this.field3616 == 2) {
                this.method1444(arg0, arg1);
            } else if (this.field3616 == 1) {
                this.method1438(arg0, arg1);
            }
        }
        return this.field3618 != null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Lqq;Lhe;)V")
    private final void method1438(class318 arg0, class240 arg1) {
        method1441(arg0);
        method1445(arg0);
        arg0.method1936(field3619);
        arg0.method1982(0, 0, this.field3625, this.field3625);
        arg0.method1964();
        arg0.method1971(0, 0, this.field3625, this.field3625, this.field3614 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3628) {
                var3 = -arg1.field3612;
                var4 = -arg1.field3624;
                var5 = -arg1.field3620;
            } else {
                var3 = arg1.field3612 - this.field3612;
                var4 = arg1.field3624 - this.field3624;
                var5 = arg1.field3620 - this.field3620;
            }
        }
        if (this.field3617 != 0) {
            int var6 = class195.field3075[this.field3617];
            int var7 = class195.field3077[this.field3617];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3613 != 0) {
            int var9 = class195.field3075[this.field3613];
            int var10 = class195.field3077[this.field3613];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class198 var12 = field3621.method511((byte) 0, 51200, true);
        if (arg0.method1988()) {
            var12.method505((short) 0, (short) this.field3622);
        } else {
            var12.method485((short) 127, class505.field7629.method59(this.field3622, 21645).field737);
            var12.method505((short) 0, (short) -1);
        }
        arg0.method1995(1.0F);
        arg0.method1941(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3625 * 1024 / (var12.method490() - var12.method483());
        if (this.field3614 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1931(this.field3625 / 2, this.field3625 / 2, var13, var13);
        arg0.method1921(arg0.method1925());
        class496 var14 = arg0.method1925();
        var14.method198(0, 0, arg0.method1955() - var12.method466());
        var12.method480(var14, null, 1024, 1);
        int var15 = this.field3625 * 13 / 16;
        int var16 = (this.field3625 - var15) / 2;
        field3623.method572(var16, var16, var15, var15, 0, this.field3614 | 0xFF000000, 1);
        this.field3618 = arg0.method1930(0, 0, this.field3625, this.field3625, true);
        arg0.method1964();
        arg0.method1971(0, 0, this.field3625, this.field3625, 0, 0);
        field3615.method572(0, 0, this.field3625, this.field3625, 1, 0, 0);
        this.field3618.method575(0, 0, 0);
        arg0.method1982(field3619[0], field3619[1], field3619[2], field3619[3]);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public static final void method1439() {
        field3621 = null;
        field3615 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
    public final boolean method1440(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3628) {
            this.field3627 = 1073741823;
            var8 = this.field3612;
            var9 = this.field3624;
            var10 = this.field3620;
        } else {
            int var5 = this.field3612 - arg0;
            int var6 = this.field3624 - arg1;
            int var7 = this.field3620 - arg2;
            this.field3627 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3627 == 0) {
                this.field3627 = 1;
            }
            var8 = (var5 << 8) / this.field3627;
            var9 = (var6 << 8) / this.field3627;
            var10 = (var7 << 8) / this.field3627;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3629 = this.field3626 * arg3 / (this.field3628 ? 1024 : this.field3627);
        } else {
            this.field3629 = 0;
        }
        if (this.field3629 < 8) {
            this.field3618 = null;
            return false;
        }
        int var12 = class99.method749(this.field3629, -23866);
        if (var12 > arg3) {
            var12 = class339.method2093(-122, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3625 != var12) {
            this.field3625 = var12;
        }
        this.field3617 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3613 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3618 = null;
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lqq;)V")
    private static final void method1441(class318 arg0) {
        if (field3621 != null) {
            return;
        }
        class303 var1 = new class303(580, 1104, 1);
        var1.method1819((byte) 0, (short) 1024, (short) 0, (byte) 0, (byte) 0, (short) 32767, (short) 1024, (short) 1024, (byte) 93, (short) 0);
        var1.method1826(128, 0, 0, (byte) 121);
        var1.method1826(-128, 0, 0, (byte) 102);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class195.field3075[var3];
            int var5 = class195.field3077[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class195.field3077[var12] >> 8;
                int var14 = class195.field3075[var12] * var4 >> 23;
                int var15 = class195.field3075[var12] * var5 >> 23;
                var1.method1826(var13, -var14, var15, (byte) 102);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1827((short) 127, (byte) 0, var8, var7, (byte) 124, 0, (byte) 0, (byte) 0, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1827((short) 127, (byte) 0, var10, var7, (byte) 101, var8, (byte) 0, (byte) 0, (short) 0);
                    var1.method1827((short) 127, (byte) 0, var11, var7, (byte) 113, var10, (byte) 0, (byte) 0, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1827((short) 127, (byte) 0, var8, 1, (byte) 114, var7, (byte) 0, (byte) 0, (short) 0);
            }
        }
        var1.field4606 = var1.field4577;
        var1.field4616 = null;
        var1.field4587 = null;
        var1.field4608 = null;
        field3621 = arg0.method1908(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method1442() {
        this.field3618 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lqq;IIIIII)V")
    public final void method1443(class318 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3618 == null) {
            return;
        }
        int var8 = this.field3617 - arg5 & 0x3FFF;
        int var9 = this.field3613 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3629) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3629) / 2;
        if (var10 < arg4 && this.field3629 + var10 > 0 && var11 < arg3 && this.field3629 + var11 > 0) {
            this.field3618.method996(arg1 + var11, arg2 + var10, this.field3629, this.field3629);
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Lqq;Lhe;)V")
    private final void method1444(class318 arg0, class240 arg1) {
        class303 var3 = class175.method1096(this.field3622, -58, class257.field3920, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1936(field3619);
        arg0.method1982(0, 0, this.field3625, this.field3625);
        arg0.method1971(0, 0, this.field3625, this.field3625, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3628) {
                var4 = -arg1.field3612;
                var5 = -arg1.field3624;
                var6 = -arg1.field3620;
            } else {
                var4 = this.field3612 - arg1.field3612;
                var5 = this.field3624 - arg1.field3624;
                var6 = this.field3620 - arg1.field3620;
            }
        }
        if (this.field3617 != 0) {
            int var7 = -this.field3617 & 0x3FFF;
            int var8 = class195.field3075[var7];
            int var9 = class195.field3077[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3613 != 0) {
            int var11 = -this.field3613 & 0x3FFF;
            int var12 = class195.field3075[var11];
            int var13 = class195.field3077[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1995(1.0F);
        arg0.method1941(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class198 var15 = arg0.method1908(var3, 2048, 0, 64, 768);
        int var16 = var15.method490() - var15.method483();
        int var17 = var15.method501() - var15.method492();
        int var18 = var15.method483() + var16 / 2;
        int var19 = var15.method492() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1931(var18, var19, var20, var20);
        arg0.method1921(arg0.method1925());
        class496 var21 = arg0.method1976();
        var21.method198(0, 0, arg0.method1955() - var15.method466());
        var15.method480(var21, null, arg0.method1955(), 1);
        this.field3618 = arg0.method1930(0, 0, this.field3625, this.field3625, true);
        this.field3618.method575(0, 0, 3);
        arg0.method1982(field3619[0], field3619[1], field3619[2], field3619[3]);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Lqq;)V")
    private static final void method1445(class318 arg0) {
        if (field3615 != null) {
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
        field3615 = arg0.method1924(var2, 0, 128, 128, 128);
        field3623 = arg0.method1924(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3612 = arg2;
        this.field3624 = arg3;
        this.field3620 = arg4;
        this.field3628 = arg7;
        this.field3622 = arg1;
        this.field3614 = arg6;
        this.field3626 = arg5;
        this.field3616 = arg0;
    }
}
