import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class314 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    private int field4605;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    private int field4610;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Z")
    private boolean field4617;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    private int field4614;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    private int field4613;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
    private static int[] field4611 = new int[4];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private int field4615;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lqg;")
    private static class307 field4602;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lqg;")
    private class307 field4606;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lqg;")
    private static class307 field4616;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lva;")
    private static class327 field4601;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leq;)V", line = 9)
    private static final void method1888(class134 arg0) {
        if (field4601 != null) {
            return;
        }
        class499 var1 = new class499(580, 1104, 1);
        var1.method3004((short) 0, 17526, (short) 1024, (short) 1024, (byte) 0, (short) 1024, (short) 0, (byte) 0, (byte) 0, (short) 32767);
        var1.method2996(0, 126, 0, 128);
        var1.method2996(0, 127, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class323.field4731[var3];
            int var5 = class323.field4733[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class323.field4733[var12] >> 8;
                int var14 = class323.field4731[var12] * var4 >> 23;
                int var15 = class323.field4731[var12] * var5 >> 23;
                var1.method2996(-var14, 126, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2995((short) 127, var7, (short) 0, (byte) 0, 0, (byte) -86, (byte) 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2995((short) 127, var7, (short) 0, (byte) 0, var8, (byte) -86, (byte) 0, (byte) 0, var10);
                    var1.method2995((short) 127, var7, (short) 0, (byte) 0, var10, (byte) -86, (byte) 0, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2995((short) 127, 1, (short) 0, (byte) 0, var7, (byte) -86, (byte) 0, (byte) 0, var8);
            }
        }
        var1.field7621 = var1.field7624;
        var1.field7609 = null;
        var1.field7617 = null;
        var1.field7599 = null;
        field4601 = arg0.method737(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Z", line = 95)
    public final boolean method1889(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4617) {
            this.field4612 = 1073741823;
            var8 = this.field4605;
            var9 = this.field4603;
            var10 = this.field4610;
        } else {
            int var5 = this.field4605 - arg0;
            int var6 = this.field4603 - arg1;
            int var7 = this.field4610 - arg2;
            this.field4612 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4612 == 0) {
                this.field4612 = 1;
            }
            var8 = (var5 << 8) / this.field4612;
            var9 = (var6 << 8) / this.field4612;
            var10 = (var7 << 8) / this.field4612;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4615 = this.field4608 * arg3 / (this.field4617 ? 1024 : this.field4612);
        } else {
            this.field4615 = 0;
        }
        if (this.field4615 < 8) {
            this.field4606 = null;
            return false;
        }
        int var12 = class340.method2064(54, this.field4615);
        if (var12 > arg3) {
            var12 = class70.method477(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4607 != var12) {
            this.field4607 = var12;
        }
        this.field4618 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4609 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4606 = null;
        return true;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V", line = 153)
    public static final void method1890() {
        field4601 = null;
        field4602 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leq;Lka;)Z", line = 171)
    public final boolean method1891(class134 arg0, class314 arg1) {
        return this.field4606 != null || this.method1897(arg0, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Leq;Lka;)V", line = 174)
    private final void method1892(class134 arg0, class314 arg1) {
        method1888(arg0);
        method1898(arg0);
        arg0.method785(field4611);
        arg0.method810(0, 0, this.field4607, this.field4607);
        arg0.method756();
        arg0.method770(0, 0, this.field4607, this.field4607, this.field4604 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4617) {
                var3 = -arg1.field4605;
                var4 = -arg1.field4603;
                var5 = -arg1.field4610;
            } else {
                var3 = arg1.field4605 - this.field4605;
                var4 = arg1.field4603 - this.field4603;
                var5 = arg1.field4610 - this.field4610;
            }
        }
        if (this.field4618 != 0) {
            int var6 = class323.field4731[this.field4618];
            int var7 = class323.field4733[this.field4618];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4609 != 0) {
            int var9 = class323.field4731[this.field4609];
            int var10 = class323.field4733[this.field4609];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class327 var12 = field4601.method194((byte) 0, 51200, true);
        if (arg0.method749()) {
            var12.method172((short) 0, (short) this.field4614);
        } else {
            var12.method175((short) 127, class136.field1758.method432(this.field4614, true).field1532);
            var12.method172((short) 0, (short) -1);
        }
        arg0.method791(1.0F);
        arg0.method799(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4607 * 1024 / (var12.method208() - var12.method188());
        if (this.field4604 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method769(this.field4607 / 2, this.field4607 / 2, var13, var13);
        arg0.method837(arg0.method823());
        class33 var14 = arg0.method823();
        var14.method278(0, 0, arg0.method757() - var12.method186());
        var12.method179(var14, null, 1024, 1);
        int var15 = this.field4607 * 13 / 16;
        int var16 = (this.field4607 - var15) / 2;
        field4616.method86(var16, var16, var15, var15, 0, this.field4604 | 0xFF000000, 1);
        this.field4606 = arg0.method780(0, 0, this.field4607, this.field4607, true);
        arg0.method756();
        arg0.method770(0, 0, this.field4607, this.field4607, 0, 0);
        field4602.method86(0, 0, this.field4607, this.field4607, 1, 0, 0);
        this.field4606.method1325(0, 0, 0);
        arg0.method810(field4611[0], field4611[1], field4611[2], field4611[3]);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Leq;Lka;)V", line = 264)
    private final void method1893(class134 arg0, class314 arg1) {
        class499 var3 = class319.method1920(this.field4614, 3424, class162.field2103, 0);
        if (var3 == null) {
            return;
        }
        arg0.method785(field4611);
        arg0.method810(0, 0, this.field4607, this.field4607);
        arg0.method770(0, 0, this.field4607, this.field4607, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4617) {
                var4 = -arg1.field4605;
                var5 = -arg1.field4603;
                var6 = -arg1.field4610;
            } else {
                var4 = this.field4605 - arg1.field4605;
                var5 = this.field4603 - arg1.field4603;
                var6 = this.field4610 - arg1.field4610;
            }
        }
        if (this.field4618 != 0) {
            int var7 = -this.field4618 & 0x3FFF;
            int var8 = class323.field4731[var7];
            int var9 = class323.field4733[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4609 != 0) {
            int var11 = -this.field4609 & 0x3FFF;
            int var12 = class323.field4731[var11];
            int var13 = class323.field4733[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method791(1.0F);
        arg0.method799(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class327 var15 = arg0.method737(var3, 2048, 0, 64, 768);
        int var16 = var15.method208() - var15.method188();
        int var17 = var15.method174() - var15.method195();
        int var18 = var15.method188() + var16 / 2;
        int var19 = var15.method195() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method769(var18, var19, var20, var20);
        arg0.method837(arg0.method823());
        class33 var21 = arg0.method830();
        var21.method278(0, 0, arg0.method757() - var15.method186());
        var15.method179(var21, null, arg0.method757(), 1);
        this.field4606 = arg0.method780(0, 0, this.field4607, this.field4607, true);
        this.field4606.method1325(0, 0, 3);
        arg0.method810(field4611[0], field4611[1], field4611[2], field4611[3]);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Leq;IIIIII)V", line = 348)
    public final void method1894(class134 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4606 == null) {
            return;
        }
        int var8 = this.field4618 - arg5 & 0x3FFF;
        int var9 = this.field4609 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4615) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4615) / 2;
        if (var10 < arg4 && this.field4615 + var10 > 0 && var11 < arg3 && this.field4615 + var11 > 0) {
            this.field4606.method1844(arg1 + var11, arg2 + var10, this.field4615, this.field4615);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V", line = 373)
    public static void method1895() {
        field4601 = null;
        field4616 = null;
        field4602 = null;
        field4611 = null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V", line = 379)
    public final void method1896() {
        this.field4606 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 382)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4605 = arg2;
        this.field4603 = arg3;
        this.field4610 = arg4;
        this.field4617 = arg7;
        this.field4614 = arg1;
        this.field4604 = arg6;
        this.field4608 = arg5;
        this.field4613 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(Leq;Lka;)Z", line = 394)
    private final boolean method1897(class134 arg0, class314 arg1) {
        if (this.field4606 == null) {
            if (this.field4613 == 0) {
                if (class136.field1758.method428(-14471, this.field4614)) {
                    int[] var3 = class136.field1758.method430(0.7F, this.field4607, false, this.field4607, (byte) -21, this.field4614);
                    this.field4606 = arg0.method784(var3, 0, this.field4607, this.field4607, this.field4607);
                }
            } else if (this.field4613 == 2) {
                this.method1893(arg0, arg1);
            } else if (this.field4613 == 1) {
                this.method1892(arg0, arg1);
            }
        }
        return this.field4606 != null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Leq;)V", line = 428)
    private static final void method1898(class134 arg0) {
        if (field4602 != null) {
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
        field4602 = arg0.method784(var2, 0, 128, 128, 128);
        field4616 = arg0.method784(var1, 0, 128, 128, 128);
    }
}
