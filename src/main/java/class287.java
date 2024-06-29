import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class287 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    private int field4423;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Z")
    private boolean field4418;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    private int field4416;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    private int field4424;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
    private static int[] field4410 = new int[4];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    private int field4421;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    private int field4422;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lka;")
    private static class282 field4412;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lit;")
    private static class34 field4407;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lit;")
    private class34 field4417;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lit;")
    private static class34 field4419;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lha;Lpg;)V", line = 4)
    private final void method1873(class544 arg0, class287 arg1) {
        class352 var3 = class357.method2284(class642.field9105, this.field4413, 0, (byte) -128);
        if (var3 == null) {
            return;
        }
        arg0.method331(field4410);
        arg0.method240(0, 0, this.field4420, this.field4420);
        arg0.method410(0, 0, this.field4420, this.field4420, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4418) {
                var4 = -arg1.field4414;
                var5 = -arg1.field4423;
                var6 = -arg1.field4411;
            } else {
                var4 = this.field4414 - arg1.field4414;
                var5 = this.field4423 - arg1.field4423;
                var6 = this.field4411 - arg1.field4411;
            }
        }
        if (this.field4421 != 0) {
            int var7 = -this.field4421 & 0x3FFF;
            int var8 = class582.field8226[var7];
            int var9 = class582.field8230[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field4409 != 0) {
            int var11 = -this.field4409 & 0x3FFF;
            int var12 = class582.field8226[var11];
            int var13 = class582.field8230[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method328(1.0F);
        arg0.method259(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class282 var15 = arg0.method301(var3, 2048, 0, 64, 768);
        int var16 = var15.method1024() - var15.method1008();
        int var17 = var15.method1005() - var15.method1033();
        int var18 = var15.method1008() + var16 / 2;
        int var19 = var15.method1033() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method288(var18, var19, var20, var20);
        arg0.method244(arg0.method414());
        class73 var21 = arg0.method343();
        var21.method675(0, 0, arg0.method294() - var15.method996());
        var15.method1026(var21, null, arg0.method294(), 1);
        this.field4417 = arg0.method270(0, 0, this.field4420, this.field4420, true);
        this.field4417.method51(0, 0, 3);
        arg0.method240(field4410[0], field4410[1], field4410[2], field4410[3]);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lha;IIIIII)V", line = 87)
    public final void method1874(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4417 == null) {
            return;
        }
        int var8 = this.field4421 - arg5 & 0x3FFF;
        int var9 = this.field4409 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4422) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4422) / 2;
        if (var10 < arg4 && this.field4422 + var10 > 0 && var11 < arg3 && this.field4422 + var11 > 0) {
            this.field4417.method187(arg1 + var11, arg2 + var10, this.field4422, this.field4422);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V", line = 111)
    public final void method1875() {
        this.field4417 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lha;Lpg;)V", line = 117)
    private final void method1876(class544 arg0, class287 arg1) {
        method1879(arg0);
        method1882(arg0);
        arg0.method331(field4410);
        arg0.method240(0, 0, this.field4420, this.field4420);
        arg0.method1287();
        arg0.method410(0, 0, this.field4420, this.field4420, this.field4416 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4418) {
                var3 = -arg1.field4414;
                var4 = -arg1.field4423;
                var5 = -arg1.field4411;
            } else {
                var3 = arg1.field4414 - this.field4414;
                var4 = arg1.field4423 - this.field4423;
                var5 = arg1.field4411 - this.field4411;
            }
        }
        if (this.field4421 != 0) {
            int var6 = class582.field8226[this.field4421];
            int var7 = class582.field8230[this.field4421];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field4409 != 0) {
            int var9 = class582.field8226[this.field4409];
            int var10 = class582.field8230[this.field4409];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class282 var12 = field4412.method1025((byte) 0, 51200, true);
        var12.method1029((short) 0, (short) this.field4413);
        arg0.method328(1.0F);
        arg0.method259(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4420 * 1024 / (var12.method1024() - var12.method1008());
        if (this.field4416 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method288(this.field4420 / 2, this.field4420 / 2, var13, var13);
        arg0.method244(arg0.method414());
        class73 var14 = arg0.method414();
        var14.method675(0, 0, arg0.method294() - var12.method996());
        var12.method1026(var14, null, 1024, 1);
        int var15 = this.field4420 * 13 / 16;
        int var16 = (this.field4420 - var15) / 2;
        field4407.method191(var16, var16, var15, var15, 0, this.field4416 | 0xFF000000, 1);
        this.field4417 = arg0.method270(0, 0, this.field4420, this.field4420, true);
        arg0.method1287();
        arg0.method410(0, 0, this.field4420, this.field4420, 0, 0);
        field4419.method191(0, 0, this.field4420, this.field4420, 1, 0, 0);
        this.field4417.method51(0, 0, 0);
        arg0.method240(field4410[0], field4410[1], field4410[2], field4410[3]);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V", line = 209)
    public static final void method1877() {
        field4412 = null;
        field4419 = null;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Lha;Lpg;)Z", line = 216)
    public final boolean method1878(class544 arg0, class287 arg1) {
        return this.field4417 != null || this.method1881(arg0, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lha;)V", line = 225)
    private static final void method1879(class544 arg0) {
        if (field4412 != null) {
            return;
        }
        class352 var1 = new class352(580, 1104, 1);
        var1.method2230((short) 1024, (byte) 70, (byte) 0, (short) 1024, (short) 0, (short) 1024, (short) 32767, (byte) 0, (byte) 0, (short) 0);
        var1.method2239(0, 0, 128, 0);
        var1.method2239(0, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class582.field8226[var3];
            int var5 = class582.field8230[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class582.field8230[var12] >> 7;
                int var14 = class582.field8226[var12] * var4 >> 21;
                int var15 = class582.field8226[var12] * var5 >> 21;
                var1.method2239(-var14, var15, var13, 0);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2243((short) 127, var7, true, 0, var8, (byte) 0, (byte) 0, (byte) 0, (short) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2243((short) 127, var7, true, var8, var10, (byte) 0, (byte) 0, (byte) 0, (short) 0);
                    var1.method2243((short) 127, var7, true, var10, var11, (byte) 0, (byte) 0, (byte) 0, (short) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2243((short) 127, 1, true, var7, var8, (byte) 0, (byte) 0, (byte) 0, (short) 0);
            }
        }
        var1.field5145 = var1.field5180;
        var1.field5178 = null;
        var1.field5194 = null;
        var1.field5143 = null;
        field4412 = arg0.method301(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)Z", line = 310)
    public final boolean method1880(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4418) {
            this.field4415 = 1073741823;
            var8 = this.field4414;
            var9 = this.field4423;
            var10 = this.field4411;
        } else {
            int var5 = this.field4414 - arg0;
            int var6 = this.field4423 - arg1;
            int var7 = this.field4411 - arg2;
            this.field4415 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4415 == 0) {
                this.field4415 = 1;
            }
            var8 = (var5 << 8) / this.field4415;
            var9 = (var6 << 8) / this.field4415;
            var10 = (var7 << 8) / this.field4415;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4422 = this.field4408 * arg3 / (this.field4418 ? 1024 : this.field4415);
        } else {
            this.field4422 = 0;
        }
        if (this.field4422 < 8) {
            this.field4417 = null;
            return false;
        }
        int var12 = class567.method3292(this.field4422, -76);
        if (var12 > arg3) {
            var12 = class602.method3455(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4420 != var12) {
            this.field4420 = var12;
        }
        this.field4421 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field4409 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field4417 = null;
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(Lha;Lpg;)Z", line = 368)
    private final boolean method1881(class544 arg0, class287 arg1) {
        if (this.field4417 == null) {
            if (this.field4424 == 0) {
                if (class99.field1467.method1772(-5919, this.field4413)) {
                    int[] var3 = class99.field1467.method1776(false, 0.7F, this.field4420, (byte) 45, this.field4420, this.field4413);
                    this.field4417 = arg0.method3185(0, var3, false, this.field4420, this.field4420, this.field4420);
                }
            } else if (this.field4424 == 2) {
                this.method1873(arg0, arg1);
            } else if (this.field4424 == 1) {
                this.method1876(arg0, arg1);
            }
        }
        return this.field4417 != null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lha;)V", line = 404)
    private static final void method1882(class544 arg0) {
        if (field4419 != null) {
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
        field4419 = arg0.method3185(0, var2, false, 128, 128, 128);
        field4407 = arg0.method3185(0, var1, false, 128, 128, 128);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V", line = 466)
    public static void method1883() {
        field4412 = null;
        field4407 = null;
        field4419 = null;
        field4410 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4414 = arg2;
        this.field4423 = arg3;
        this.field4411 = arg4;
        this.field4418 = arg7;
        this.field4413 = arg1;
        this.field4416 = arg6;
        this.field4408 = arg5;
        this.field4424 = arg0;
    }
}
