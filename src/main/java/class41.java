import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 {

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Z")
    private boolean field603;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "[I")
    private static int[] field602 = new int[4];

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lf;")
    private static class404 field592;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lf;")
    private static class404 field593;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lf;")
    private class404 field594;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lc;")
    private static class507 field599;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
    public static void method253() {
        field599 = null;
        field592 = null;
        field593 = null;
        field602 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqa;Llj;)V")
    private final void method254(class129 arg0, class41 arg1) {
        method257(arg0);
        method255(arg0);
        arg0.method846(field602);
        arg0.method925(0, 0, this.field605, this.field605);
        arg0.method822();
        arg0.method861(0, 0, this.field605, this.field605, this.field600 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field603) {
                var3 = -arg1.field601;
                var4 = -arg1.field591;
                var5 = -arg1.field604;
            } else {
                var3 = arg1.field601 - this.field601;
                var4 = arg1.field591 - this.field591;
                var5 = arg1.field604 - this.field604;
            }
        }
        if (this.field596 != 0) {
            int var6 = class21.field385[this.field596];
            int var7 = class21.field397[this.field596];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field607 != 0) {
            int var9 = class21.field385[this.field607];
            int var10 = class21.field397[this.field607];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class507 var12 = field599.method510((byte) 0, 51200, true);
        if (arg0.method915()) {
            var12.method508((short) 0, (short) this.field595);
        } else {
            var12.method478((short) 127, class362.field4668.method460(-26282, this.field595).field7344);
            var12.method508((short) 0, (short) -1);
        }
        arg0.method901(1.0F);
        arg0.method840(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field605 * 1024 / (var12.method490() - var12.method491());
        if (this.field600 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method821(this.field605 / 2, this.field605 / 2, var13, var13);
        arg0.method829(arg0.method916());
        class142 var14 = arg0.method916();
        var14.method982(0, 0, arg0.method871() - var12.method515());
        var12.method512(var14, null, 1024, 1);
        int var15 = this.field605 * 13 / 16;
        int var16 = (this.field605 - var15) / 2;
        field592.method356(var16, var16, var15, var15, 0, this.field600 | 0xFF000000, 1);
        this.field594 = arg0.method905(0, 0, this.field605, this.field605, true);
        arg0.method822();
        arg0.method861(0, 0, this.field605, this.field605, 0, 0);
        field593.method356(0, 0, this.field605, this.field605, 1, 0, 0);
        this.field594.method355(0, 0, 0);
        arg0.method925(field602[0], field602[1], field602[2], field602[3]);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqa;)V")
    private static final void method255(class129 arg0) {
        if (field593 != null) {
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
        field593 = arg0.method921(var2, 0, 128, 128, 128);
        field592 = arg0.method921(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lqa;Llj;)V")
    private final void method256(class129 arg0, class41 arg1) {
        class420 var3 = class370.method2154(10481, this.field595, 0, class217.field2780);
        if (var3 == null) {
            return;
        }
        arg0.method846(field602);
        arg0.method925(0, 0, this.field605, this.field605);
        arg0.method861(0, 0, this.field605, this.field605, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field603) {
                var4 = -arg1.field601;
                var5 = -arg1.field591;
                var6 = -arg1.field604;
            } else {
                var4 = this.field601 - arg1.field601;
                var5 = this.field591 - arg1.field591;
                var6 = this.field604 - arg1.field604;
            }
        }
        if (this.field596 != 0) {
            int var7 = -this.field596 & 0x3FFF;
            int var8 = class21.field385[var7];
            int var9 = class21.field397[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field607 != 0) {
            int var11 = -this.field607 & 0x3FFF;
            int var12 = class21.field385[var11];
            int var13 = class21.field397[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method901(1.0F);
        arg0.method840(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class507 var15 = arg0.method888(var3, 2048, 0, 64, 768);
        int var16 = var15.method490() - var15.method491();
        int var17 = var15.method511() - var15.method507();
        int var18 = var15.method491() + var16 / 2;
        int var19 = var15.method507() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method821(var18, var19, var20, var20);
        arg0.method829(arg0.method916());
        class142 var21 = arg0.method847();
        var21.method982(0, 0, arg0.method871() - var15.method515());
        var15.method512(var21, null, arg0.method871(), 1);
        this.field594 = arg0.method905(0, 0, this.field605, this.field605, true);
        this.field594.method355(0, 0, 3);
        arg0.method925(field602[0], field602[1], field602[2], field602[3]);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lqa;)V")
    private static final void method257(class129 arg0) {
        if (field599 != null) {
            return;
        }
        class420 var1 = new class420(580, 1104, 1);
        var1.method2469((short) 32767, (short) 0, (byte) 0, (byte) 0, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 1024, 255);
        var1.method2477((byte) -107, 0, 0, 128);
        var1.method2477((byte) -41, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class21.field385[var3];
            int var5 = class21.field397[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class21.field397[var12] >> 8;
                int var14 = class21.field385[var12] * var4 >> 23;
                int var15 = class21.field385[var12] * var5 >> 23;
                var1.method2477((byte) 105, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2475((byte) 0, (short) 127, (byte) 0, var8, 0, (short) 0, -31562, (byte) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2475((byte) 0, (short) 127, (byte) 0, var10, var8, (short) 0, -31562, (byte) 0, var7);
                    var1.method2475((byte) 0, (short) 127, (byte) 0, var11, var10, (short) 0, -31562, (byte) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2475((byte) 0, (short) 127, (byte) 0, var8, var7, (short) 0, -31562, (byte) 0, 1);
            }
        }
        var1.field5615 = var1.field5631;
        var1.field5610 = null;
        var1.field5614 = null;
        var1.field5594 = null;
        field599 = arg0.method888(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Lqa;Llj;)Z")
    private final boolean method258(class129 arg0, class41 arg1) {
        if (this.field594 == null) {
            if (this.field597 == 0) {
                if (class362.field4668.method461(this.field595, false)) {
                    int[] var3 = class362.field4668.method457(this.field605, false, 0.7F, 12071, this.field595, this.field605);
                    this.field594 = arg0.method921(var3, 0, this.field605, this.field605, this.field605);
                }
            } else if (this.field597 == 2) {
                this.method256(arg0, arg1);
            } else if (this.field597 == 1) {
                this.method254(arg0, arg1);
            }
        }
        return this.field594 != null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method259(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field594 == null) {
            return;
        }
        int var8 = this.field596 - arg5 & 0x3FFF;
        int var9 = this.field607 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field606) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field606) / 2;
        if (var10 < arg4 && this.field606 + var10 > 0 && var11 < arg3 && this.field606 + var11 > 0) {
            this.field594.method2407(arg1 + var11, arg2 + var10, this.field606, this.field606);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)Z")
    public final boolean method260(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field603) {
            this.field608 = 1073741823;
            var8 = this.field601;
            var9 = this.field591;
            var10 = this.field604;
        } else {
            int var5 = this.field601 - arg0;
            int var6 = this.field591 - arg1;
            int var7 = this.field604 - arg2;
            this.field608 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field608 == 0) {
                this.field608 = 1;
            }
            var8 = (var5 << 8) / this.field608;
            var9 = (var6 << 8) / this.field608;
            var10 = (var7 << 8) / this.field608;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field606 = this.field598 * arg3 / (this.field603 ? 1024 : this.field608);
        } else {
            this.field606 = 0;
        }
        if (this.field606 < 8) {
            this.field594 = null;
            return false;
        }
        int var12 = class124.method788(this.field606, -117);
        if (var12 > arg3) {
            var12 = class342.method2014((byte) -29, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field605 != var12) {
            this.field605 = var12;
        }
        this.field596 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field607 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field594 = null;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(Lqa;Llj;)Z")
    public final boolean method261(class129 arg0, class41 arg1) {
        return this.field594 != null || this.method258(arg0, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
    public static final void method262() {
        field599 = null;
        field593 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field601 = arg2;
        this.field591 = arg3;
        this.field604 = arg4;
        this.field603 = arg7;
        this.field595 = arg1;
        this.field600 = arg6;
        this.field598 = arg5;
        this.field597 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
    public final void method263() {
        this.field594 = null;
    }
}
