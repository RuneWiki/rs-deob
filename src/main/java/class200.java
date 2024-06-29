import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class200 {

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    private int field2617;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
    private boolean field2620;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    private int field2613;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    private int field2615;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "[I")
    private static int[] field2612 = new int[4];

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    private int field2607;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    private int field2611;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    private int field2621;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Lha;")
    private class116 field2608;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Lha;")
    private static class116 field2610;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "Lha;")
    private static class116 field2622;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Lr;")
    private static class521 field2619;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lqa;Lkv;)V")
    private final void method1273(class167 arg0, class200 arg1) {
        class528 var3 = class624.method3603(-102, 0, this.field2613, class486.field6784);
        if (var3 == null) {
            return;
        }
        arg0.method980(field2612);
        arg0.method977(0, 0, this.field2611, this.field2611);
        arg0.method997(0, 0, this.field2611, this.field2611, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2620) {
                var4 = -arg1.field2617;
                var5 = -arg1.field2618;
                var6 = -arg1.field2609;
            } else {
                var4 = this.field2617 - arg1.field2617;
                var5 = this.field2618 - arg1.field2618;
                var6 = this.field2609 - arg1.field2609;
            }
        }
        if (this.field2607 != 0) {
            int var7 = -this.field2607 & 0x3FFF;
            int var8 = class310.field3966[var7];
            int var9 = class310.field3965[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field2606 != 0) {
            int var11 = -this.field2606 & 0x3FFF;
            int var12 = class310.field3966[var11];
            int var13 = class310.field3965[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method993(1.0F);
        arg0.method981(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class521 var15 = arg0.method197(var3, 2048, 0, 64, 768);
        int var16 = var15.method1563() - var15.method1561();
        int var17 = var15.method1592() - var15.method1579();
        int var18 = var15.method1561() + var16 / 2;
        int var19 = var15.method1579() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method961(var18, var19, var20, var20);
        arg0.method956(arg0.method987());
        class105 var21 = arg0.method964();
        var21.method361(0, 0, arg0.method958() - var15.method1565());
        var15.method1562(var21, null, arg0.method958(), 1);
        this.field2608 = arg0.method969(0, 0, this.field2611, this.field2611, true);
        this.field2608.method626(0, 0, 3);
        arg0.method977(field2612[0], field2612[1], field2612[2], field2612[3]);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lqa;Lkv;)Z")
    public final boolean method1274(class167 arg0, class200 arg1) {
        return this.field2608 != null || this.method1282(arg0, arg1);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lqa;)V")
    private static final void method1275(class167 arg0) {
        if (field2610 != null) {
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
        field2610 = arg0.method976(var2, 0, 128, 128, 128);
        field2622 = arg0.method976(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII)Z")
    public final boolean method1276(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2620) {
            this.field2616 = 1073741823;
            var8 = this.field2617;
            var9 = this.field2618;
            var10 = this.field2609;
        } else {
            int var5 = this.field2617 - arg0;
            int var6 = this.field2618 - arg1;
            int var7 = this.field2609 - arg2;
            this.field2616 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2616 == 0) {
                this.field2616 = 1;
            }
            var8 = (var5 << 8) / this.field2616;
            var9 = (var6 << 8) / this.field2616;
            var10 = (var7 << 8) / this.field2616;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2621 = this.field2614 * arg3 / (this.field2620 ? 1024 : this.field2616);
        } else {
            this.field2621 = 0;
        }
        if (this.field2621 < 8) {
            this.field2608 = null;
            return false;
        }
        int var12 = class468.method2685(this.field2621, false);
        if (var12 > arg3) {
            var12 = class103.method565(32085, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2611 != var12) {
            this.field2611 = var12;
        }
        this.field2607 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2606 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2608 = null;
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
    public static void method1277() {
        field2619 = null;
        field2622 = null;
        field2610 = null;
        field2612 = null;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(Lqa;Lkv;)V")
    private final void method1278(class167 arg0, class200 arg1) {
        method1281(arg0);
        method1275(arg0);
        arg0.method980(field2612);
        arg0.method977(0, 0, this.field2611, this.field2611);
        arg0.method996();
        arg0.method997(0, 0, this.field2611, this.field2611, this.field2615 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2620) {
                var3 = -arg1.field2617;
                var4 = -arg1.field2618;
                var5 = -arg1.field2609;
            } else {
                var3 = arg1.field2617 - this.field2617;
                var4 = arg1.field2618 - this.field2618;
                var5 = arg1.field2609 - this.field2609;
            }
        }
        if (this.field2607 != 0) {
            int var6 = class310.field3966[this.field2607];
            int var7 = class310.field3965[this.field2607];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field2606 != 0) {
            int var9 = class310.field3966[this.field2606];
            int var10 = class310.field3965[this.field2606];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class521 var12 = field2619.method1607((byte) 0, 51200, true);
        if (arg0.method924()) {
            var12.method1586((short) 0, (short) this.field2613);
        } else {
            var12.method1587((short) 127, class431.field5871.method2151(true, this.field2613).field612);
            var12.method1586((short) 0, (short) -1);
        }
        arg0.method993(1.0F);
        arg0.method981(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2611 * 1024 / (var12.method1563() - var12.method1561());
        if (this.field2615 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method961(this.field2611 / 2, this.field2611 / 2, var13, var13);
        arg0.method956(arg0.method987());
        class105 var14 = arg0.method987();
        var14.method361(0, 0, arg0.method958() - var12.method1565());
        var12.method1562(var14, null, 1024, 1);
        int var15 = this.field2611 * 13 / 16;
        int var16 = (this.field2611 - var15) / 2;
        field2622.method625(var16, var16, var15, var15, 0, this.field2615 | 0xFF000000, 1);
        this.field2608 = arg0.method969(0, 0, this.field2611, this.field2611, true);
        arg0.method996();
        arg0.method997(0, 0, this.field2611, this.field2611, 0, 0);
        field2610.method625(0, 0, this.field2611, this.field2611, 1, 0, 0);
        this.field2608.method626(0, 0, 0);
        arg0.method977(field2612[0], field2612[1], field2612[2], field2612[3]);
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public static final void method1279() {
        field2619 = null;
        field2610 = null;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()V")
    public final void method1280() {
        this.field2608 = null;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Lqa;)V")
    private static final void method1281(class167 arg0) {
        if (field2619 != null) {
            return;
        }
        class528 var1 = new class528(580, 1104, 1);
        var1.method2944((short) 0, (byte) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, -26208, (short) 0, (byte) 0, (short) 32767);
        var1.method2936(0, 128, 0, (byte) -113);
        var1.method2936(0, -128, 0, (byte) -122);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class310.field3966[var3];
            int var5 = class310.field3965[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class310.field3965[var12] >> 7;
                int var14 = class310.field3966[var12] * var4 >> 21;
                int var15 = class310.field3966[var12] * var5 >> 21;
                var1.method2936(-var14, var13, var15, (byte) -115);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2950(var8, (short) 127, (byte) 0, var7, -15280, (byte) 0, (byte) 0, (short) 0, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2950(var10, (short) 127, (byte) 0, var7, -15280, (byte) 0, (byte) 0, (short) 0, var8);
                    var1.method2950(var11, (short) 127, (byte) 0, var7, -15280, (byte) 0, (byte) 0, (short) 0, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2950(var8, (short) 127, (byte) 0, 1, -15280, (byte) 0, (byte) 0, (short) 0, var7);
            }
        }
        var1.field7355 = var1.field7389;
        var1.field7340 = null;
        var1.field7346 = null;
        var1.field7369 = null;
        field2619 = arg0.method197(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(Lqa;Lkv;)Z")
    private final boolean method1282(class167 arg0, class200 arg1) {
        if (this.field2608 == null) {
            if (this.field2623 == 0) {
                if (class431.field5871.method2144(127, this.field2613)) {
                    int[] var3 = class431.field5871.method2146(-20243, this.field2611, this.field2613, this.field2611, false, 0.7F);
                    this.field2608 = arg0.method976(var3, 0, this.field2611, this.field2611, this.field2611);
                }
            } else if (this.field2623 == 2) {
                this.method1273(arg0, arg1);
            } else if (this.field2623 == 1) {
                this.method1278(arg0, arg1);
            }
        }
        return this.field2608 != null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method1283(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2608 == null) {
            return;
        }
        int var8 = this.field2607 - arg5 & 0x3FFF;
        int var9 = this.field2606 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2621) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2621) / 2;
        if (var10 < arg4 && this.field2621 + var10 > 0 && var11 < arg3 && this.field2621 + var11 > 0) {
            this.field2608.method638(arg1 + var11, arg2 + var10, this.field2621, this.field2621);
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2617 = arg2;
        this.field2618 = arg3;
        this.field2609 = arg4;
        this.field2620 = arg7;
        this.field2613 = arg1;
        this.field2615 = arg6;
        this.field2614 = arg5;
        this.field2623 = arg0;
    }
}
