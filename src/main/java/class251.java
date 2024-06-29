import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class251 {

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Z")
    private boolean field3439;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    private int field3428;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    private int field3424;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[I")
    private static int[] field3431 = new int[4];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    private int field3425;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field3432;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lba;")
    private static class107 field3423;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lxa;")
    private class511 field3427;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Lxa;")
    private static class511 field3430;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Lxa;")
    private static class511 field3434;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 4)
    public static final void method1590() {
        field3423 = null;
        field3430 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Loa;Lfm;)Z", line = 9)
    private final boolean method1591(class43 arg0, class251 arg1) {
        if (this.field3427 == null) {
            if (this.field3426 == 0) {
                if (class547.field7106.method3164((byte) -31, this.field3428)) {
                    int[] var3 = class547.field7106.method3160(false, this.field3433, this.field3428, this.field3433, 0.7F, 61);
                    this.field3427 = arg0.method381(var3, 0, this.field3433, this.field3433, this.field3433);
                }
            } else if (this.field3426 == 2) {
                this.method1595(arg0, arg1);
            } else if (this.field3426 == 1) {
                this.method1597(arg0, arg1);
            }
        }
        return this.field3427 != null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()V", line = 44)
    public final void method1592() {
        this.field3427 = null;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "()V", line = 48)
    public static void method1593() {
        field3423 = null;
        field3434 = null;
        field3430 = null;
        field3431 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Loa;)V", line = 56)
    private static final void method1594(class43 arg0) {
        if (field3423 != null) {
            return;
        }
        class645 var1 = new class645(580, 1104, 1);
        var1.method3540((short) 32767, (byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 1024, (byte) 0, 255);
        var1.method3549(0, 128, -26138, 0);
        var1.method3549(0, -128, -26138, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class237.field3193[var3];
            int var5 = class237.field3196[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class237.field3196[var12] >> 7;
                int var14 = class237.field3193[var12] * var4 >> 21;
                int var15 = class237.field3193[var12] * var5 >> 21;
                var1.method3549(var15, var13, -26138, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3538((byte) 0, (byte) 0, (short) 127, (short) 0, 0, (byte) -97, (byte) 0, var8, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3538((byte) 0, (byte) 0, (short) 127, (short) 0, var8, (byte) 112, (byte) 0, var10, var7);
                    var1.method3538((byte) 0, (byte) 0, (short) 127, (short) 0, var10, (byte) -112, (byte) 0, var11, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3538((byte) 0, (byte) 0, (short) 127, (short) 0, var7, (byte) 87, (byte) 0, var8, 1);
            }
        }
        var1.field8941 = var1.field8938;
        var1.field8993 = null;
        var1.field8944 = null;
        var1.field8949 = null;
        field3423 = arg0.method410(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Loa;Lfm;)V", line = 138)
    private final void method1595(class43 arg0, class251 arg1) {
        class645 var3 = class463.method2591(true, this.field3428, 0, class647.field9016);
        if (var3 == null) {
            return;
        }
        arg0.method356(field3431);
        arg0.method376(0, 0, this.field3433, this.field3433);
        arg0.method353(0, 0, this.field3433, this.field3433, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3439) {
                var4 = -arg1.field3438;
                var5 = -arg1.field3422;
                var6 = -arg1.field3429;
            } else {
                var4 = this.field3438 - arg1.field3438;
                var5 = this.field3422 - arg1.field3422;
                var6 = this.field3429 - arg1.field3429;
            }
        }
        if (this.field3425 != 0) {
            int var7 = -this.field3425 & 0x3FFF;
            int var8 = class237.field3193[var7];
            int var9 = class237.field3196[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3432 != 0) {
            int var11 = -this.field3432 & 0x3FFF;
            int var12 = class237.field3193[var11];
            int var13 = class237.field3196[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method360(1.0F);
        arg0.method390(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class107 var15 = arg0.method410(var3, 2048, 0, 64, 768);
        int var16 = var15.method799() - var15.method820();
        int var17 = var15.method793() - var15.method816();
        int var18 = var15.method820() + var16 / 2;
        int var19 = var15.method816() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method393(var18, var19, var20, var20);
        arg0.method342(arg0.method346());
        class151 var21 = arg0.method402();
        var21.method146(0, 0, arg0.method343() - var15.method805());
        var15.method792(var21, null, arg0.method343(), 1);
        this.field3427 = arg0.method341(0, 0, this.field3433, this.field3433, true);
        this.field3427.method597(0, 0, 3);
        arg0.method376(field3431[0], field3431[1], field3431[2], field3431[3]);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(Loa;Lfm;)Z", line = 229)
    public final boolean method1596(class43 arg0, class251 arg1) {
        return this.field3427 != null || this.method1591(arg0, arg1);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(Loa;Lfm;)V", line = 235)
    private final void method1597(class43 arg0, class251 arg1) {
        method1594(arg0);
        method1599(arg0);
        arg0.method356(field3431);
        arg0.method376(0, 0, this.field3433, this.field3433);
        arg0.method205();
        arg0.method353(0, 0, this.field3433, this.field3433, this.field3435 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3439) {
                var3 = -arg1.field3438;
                var4 = -arg1.field3422;
                var5 = -arg1.field3429;
            } else {
                var3 = arg1.field3438 - this.field3438;
                var4 = arg1.field3422 - this.field3422;
                var5 = arg1.field3429 - this.field3429;
            }
        }
        if (this.field3425 != 0) {
            int var6 = class237.field3193[this.field3425];
            int var7 = class237.field3196[this.field3425];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3432 != 0) {
            int var9 = class237.field3193[this.field3432];
            int var10 = class237.field3196[this.field3432];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class107 var12 = field3423.method479((byte) 0, 51200, true);
        if (arg0.method338()) {
            var12.method790((short) 0, (short) this.field3428);
        } else {
            var12.method829((short) 127, class547.field7106.method3162((byte) -104, this.field3428).field804);
            var12.method790((short) 0, (short) -1);
        }
        arg0.method360(1.0F);
        arg0.method390(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3433 * 1024 / (var12.method799() - var12.method820());
        if (this.field3435 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method393(this.field3433 / 2, this.field3433 / 2, var13, var13);
        arg0.method342(arg0.method346());
        class151 var14 = arg0.method346();
        var14.method146(0, 0, arg0.method343() - var12.method805());
        var12.method792(var14, null, 1024, 1);
        int var15 = this.field3433 * 13 / 16;
        int var16 = (this.field3433 - var15) / 2;
        field3434.method604(var16, var16, var15, var15, 0, this.field3435 | 0xFF000000, 1);
        this.field3427 = arg0.method341(0, 0, this.field3433, this.field3433, true);
        arg0.method205();
        arg0.method353(0, 0, this.field3433, this.field3433, 0, 0);
        field3430.method604(0, 0, this.field3433, this.field3433, 1, 0, 0);
        this.field3427.method597(0, 0, 0);
        arg0.method376(field3431[0], field3431[1], field3431[2], field3431[3]);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Loa;IIIIII)V", line = 334)
    public final void method1598(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3427 == null) {
            return;
        }
        int var8 = this.field3425 - arg5 & 0x3FFF;
        int var9 = this.field3432 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3436) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3436) / 2;
        if (var10 < arg4 && this.field3436 + var10 > 0 && var11 < arg3 && this.field3436 + var11 > 0) {
            this.field3427.method2754(arg1 + var11, arg2 + var10, this.field3436, this.field3436);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Loa;)V", line = 359)
    private static final void method1599(class43 arg0) {
        if (field3430 != null) {
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
        field3430 = arg0.method381(var2, 0, 128, 128, 128);
        field3434 = arg0.method381(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)Z", line = 422)
    public final boolean method1600(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3439) {
            this.field3437 = 1073741823;
            var8 = this.field3438;
            var9 = this.field3422;
            var10 = this.field3429;
        } else {
            int var5 = this.field3438 - arg0;
            int var6 = this.field3422 - arg1;
            int var7 = this.field3429 - arg2;
            this.field3437 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3437 == 0) {
                this.field3437 = 1;
            }
            var8 = (var5 << 8) / this.field3437;
            var9 = (var6 << 8) / this.field3437;
            var10 = (var7 << 8) / this.field3437;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3436 = this.field3424 * arg3 / (this.field3439 ? 1024 : this.field3437);
        } else {
            this.field3436 = 0;
        }
        if (this.field3436 < 8) {
            this.field3427 = null;
            return false;
        }
        int var12 = class426.method2447(this.field3436, 250);
        if (var12 > arg3) {
            var12 = class71.method571(arg3, (byte) 93);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3433 != var12) {
            this.field3433 = var12;
        }
        this.field3425 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3432 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field3427 = null;
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3438 = arg2;
        this.field3422 = arg3;
        this.field3429 = arg4;
        this.field3439 = arg7;
        this.field3428 = arg1;
        this.field3435 = arg6;
        this.field3424 = arg5;
        this.field3426 = arg0;
    }
}
