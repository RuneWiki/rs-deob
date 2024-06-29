import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class175 {

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    private int field2483;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
    private boolean field2488;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    private int field2489;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    private int field2486;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
    private static int[] field2481 = new int[4];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    private int field2479;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Ldp;")
    private class319 field2482;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Ldp;")
    private static class319 field2485;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "Ldp;")
    private static class319 field2494;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lns;")
    private static class57 field2480;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ltq;Lvr;)V", line = 3)
    private final void method1196(class63 arg0, class175 arg1) {
        method1204(arg0);
        method1198(arg0);
        arg0.method540(field2481);
        arg0.method500(0, 0, this.field2484, this.field2484);
        arg0.method563();
        arg0.method508(0, 0, this.field2484, this.field2484, this.field2486 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2488) {
                var3 = -arg1.field2490;
                var4 = -arg1.field2493;
                var5 = -arg1.field2483;
            } else {
                var3 = arg1.field2490 - this.field2490;
                var4 = arg1.field2493 - this.field2493;
                var5 = arg1.field2483 - this.field2483;
            }
        }
        if (this.field2479 != 0) {
            int var6 = class172.field2450[this.field2479];
            int var7 = class172.field2456[this.field2479];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2487 != 0) {
            int var9 = class172.field2450[this.field2487];
            int var10 = class172.field2456[this.field2487];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class57 var12 = field2480.method437((byte) 0, 25600, true);
        if (arg0.method571()) {
            var12.method415((short) 0, (short) this.field2489);
        } else {
            var12.method420((short) 127, class163.field2268.method1331(9386, this.field2489).field1213);
            var12.method415((short) 0, (short) -1);
        }
        arg0.method585(1.0F);
        arg0.method575(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2484 * 1024 / (var12.method425() - var12.method413());
        if (this.field2486 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method516(this.field2484 / 2, this.field2484 / 2, var13, var13);
        arg0.method544(arg0.method580());
        class315 var14 = arg0.method580();
        var14.method482(0, 0, arg0.method534() - var12.method431());
        var12.method405(var14, (class117) null, 1024, 1);
        int var15 = this.field2484 * 13 / 16;
        int var16 = (this.field2484 - var15) / 2;
        field2494.method792(var16, var16, var15, var15, 1, this.field2486 | 0xFF000000, 1);
        this.field2482 = arg0.method574(0, 0, this.field2484, this.field2484, true);
        arg0.method563();
        arg0.method508(0, 0, this.field2484, this.field2484, 0, 0);
        field2485.method792(0, 0, this.field2484, this.field2484, 0, 0, 0);
        this.field2482.method814(0, 0, 0);
        arg0.method500(field2481[0], field2481[1], field2481[2], field2481[3]);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ltq;IIIIII)V", line = 92)
    public final void method1197(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2482 == null) {
            return;
        }
        int var8 = this.field2479 - arg5 & 0x3FFF;
        int var9 = this.field2487 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2492) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2492) / 2;
        if (var10 < arg4 && this.field2492 + var10 > 0 && var11 < arg3 && this.field2492 + var11 > 0) {
            this.field2482.method1962(arg1 + var11, arg2 + var10, this.field2492, this.field2492);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ltq;)V", line = 120)
    private static final void method1198(class63 arg0) {
        if (field2485 != null) {
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
        field2485 = arg0.method536(var2, 0, 128, 128, 128);
        field2494 = arg0.method536(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V", line = 185)
    public final void method1199() {
        this.field2482 = null;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()V", line = 188)
    public static final void method1200() {
        field2480 = null;
        field2485 = null;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Ltq;Lvr;)Z", line = 193)
    public final boolean method1201(class63 arg0, class175 arg1) {
        return this.field2482 != null || this.method1202(arg0, arg1);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(Ltq;Lvr;)Z", line = 203)
    private final boolean method1202(class63 arg0, class175 arg1) {
        if (this.field2482 == null) {
            if (this.field2491 == 0) {
                if (class163.field2268.method1335(this.field2489, (byte) 9)) {
                    int[] var3 = class163.field2268.method1333(103, false, 0.7F, this.field2484, this.field2484, this.field2489);
                    this.field2482 = arg0.method536(var3, 0, this.field2484, this.field2484, this.field2484);
                }
            } else if (this.field2491 == 2) {
                this.method1203(arg0, arg1);
            } else if (this.field2491 == 1) {
                this.method1196(arg0, arg1);
            }
        }
        return this.field2482 != null;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(Ltq;Lvr;)V", line = 241)
    private final void method1203(class63 arg0, class175 arg1) {
        class246 var3 = class340.method2085((byte) 77, this.field2489, class484.field6797, 0);
        if (var3 == null) {
            return;
        }
        arg0.method540(field2481);
        arg0.method500(0, 0, this.field2484, this.field2484);
        arg0.method508(0, 0, this.field2484, this.field2484, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2488) {
                var4 = -arg1.field2490;
                var5 = -arg1.field2493;
                var6 = -arg1.field2483;
            } else {
                var4 = this.field2490 - arg1.field2490;
                var5 = this.field2493 - arg1.field2493;
                var6 = this.field2483 - arg1.field2483;
            }
        }
        if (this.field2479 != 0) {
            int var7 = -this.field2479 & 0x3FFF;
            int var8 = class172.field2450[var7];
            int var9 = class172.field2456[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2487 != 0) {
            int var11 = -this.field2487 & 0x3FFF;
            int var12 = class172.field2450[var11];
            int var13 = class172.field2456[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method585(1.0F);
        arg0.method575(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class57 var15 = arg0.method555(var3, 1024, 0, 64, 768);
        int var16 = var15.method425() - var15.method413();
        int var17 = var15.method416() - var15.method400();
        int var18 = var15.method413() + var16 / 2;
        int var19 = var15.method400() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method516(var18, var19, var20, var20);
        arg0.method544(arg0.method580());
        class315 var21 = arg0.method565();
        var21.method482(0, 0, arg0.method534() - var15.method431());
        var15.method405(var21, (class117) null, arg0.method534(), 1);
        this.field2482 = arg0.method574(0, 0, this.field2484, this.field2484, true);
        this.field2482.method814(0, 0, 3);
        arg0.method500(field2481[0], field2481[1], field2481[2], field2481[3]);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Ltq;)V", line = 326)
    private static final void method1204(class63 arg0) {
        if (field2480 != null) {
            return;
        }
        class246 var1 = new class246(580, 1104, 1);
        var1.method1578((byte) 0, (byte) 0, (short) 1024, (short) 1024, (short) 0, (short) 32767, (short) 1024, (short) 0, (byte) 0, 11083);
        var1.method1573(128, 1, 0, 0);
        var1.method1573(-128, 1, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class172.field2450[var3];
            int var5 = class172.field2456[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class172.field2456[var12] >> 8;
                int var14 = class172.field2450[var12] * var4 >> 23;
                int var15 = class172.field2450[var12] * var5 >> 23;
                var1.method1573(var13, 1, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1564((byte) 0, (short) 0, (byte) 0, var7, (short) 127, 2, (byte) 0, 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1564((byte) 0, (short) 0, (byte) 0, var7, (short) 127, 2, (byte) 0, var8, var10);
                    var1.method1564((byte) 0, (short) 0, (byte) 0, var7, (short) 127, 2, (byte) 0, var10, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1564((byte) 0, (short) 0, (byte) 0, 1, (short) 127, 2, (byte) 0, var7, var8);
            }
        }
        var1.field3549 = var1.field3550;
        var1.field3541 = null;
        var1.field3542 = null;
        var1.field3533 = null;
        field2480 = arg0.method555(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "()V", line = 413)
    public static void method1205() {
        field2480 = null;
        field2494 = null;
        field2485 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)Z", line = 422)
    public final boolean method1206(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2488) {
            this.field2495 = 1073741823;
            var8 = this.field2490;
            var9 = this.field2493;
            var10 = this.field2483;
        } else {
            int var5 = this.field2490 - arg0;
            int var6 = this.field2493 - arg1;
            int var7 = this.field2483 - arg2;
            this.field2495 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2495 == 0) {
                this.field2495 = 1;
            }
            var8 = (var5 << 8) / this.field2495;
            var9 = (var6 << 8) / this.field2495;
            var10 = (var7 << 8) / this.field2495;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2492 = this.field2496 * arg3 / (this.field2488 ? 1024 : this.field2495);
        } else {
            this.field2492 = 0;
        }
        if (this.field2492 < 8) {
            this.field2482 = null;
            return false;
        }
        int var12 = class158.method1078((byte) -65, this.field2492);
        if (var12 > arg3) {
            var12 = class183.method1257(23132, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2484 != var12) {
            this.field2484 = var12;
        }
        this.field2479 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2487 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2482 = null;
        return true;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2490 = arg2;
        this.field2493 = arg3;
        this.field2483 = arg4;
        this.field2488 = arg7;
        this.field2489 = arg1;
        this.field2486 = arg6;
        this.field2496 = arg5;
        this.field2491 = arg0;
    }
}
