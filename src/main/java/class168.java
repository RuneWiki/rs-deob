import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class168 extends class166 {

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
    private int field3422 = 0;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    private int field3406 = 0;

    @OriginalMember(owner = "client!sb", name = "Db", descriptor = "Z")
    private boolean field3433 = false;

    @OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
    private int field3425;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!sb", name = "Bb", descriptor = "I")
    private int field3431;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    private int field3419;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "Lre;")
    private class162 field3424;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lrf;")
    public static class163 field3403 = class53.method392(-55, "<col=ffffff>");

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "[[S")
    public static short[][] field3400 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field3405 = -1;

    @OriginalMember(owner = "client!sb", name = "wb", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lrf;")
    public static class163 field3416 = class53.method392(-123, "leuchten1:");

    @OriginalMember(owner = "client!sb", name = "zb", descriptor = "Lrf;")
    public static class163 field3429 = class53.method392(72, "jolt");

    @OriginalMember(owner = "client!sb", name = "Eb", descriptor = "[I")
    public static int[] field3434 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "D")
    private double field3407;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "D")
    private double field3411;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "D")
    public double field3412;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "D")
    public double field3414;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "D")
    private double field3418;

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "D")
    public double field3423;

    @OriginalMember(owner = "client!sb", name = "xb", descriptor = "D")
    private double field3427;

    @OriginalMember(owner = "client!sb", name = "Ab", descriptor = "D")
    private double field3430;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!sb", name = "yb", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!sb", name = "Cb", descriptor = "[Lpf;")
    public static class145[] field3432;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3433) {
            double var6 = (double) (arg4 - this.field3419);
            double var8 = (double) (arg2 - this.field3410);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3412 = (double) this.field3431 * var6 / var10 + (double) this.field3419;
            this.field3414 = (double) this.field3431 * var8 / var10 + (double) this.field3410;
            this.field3423 = this.field3415;
        }
        field3428++;
        double var12 = (double) (this.field3409 + 1 - arg3);
        if (arg0 > -45) {
            this.method406(true);
        }
        this.field3411 = ((double) arg4 - this.field3412) / var12;
        this.field3418 = ((double) arg2 - this.field3414) / var12;
        this.field3427 = Math.sqrt(this.field3418 * this.field3418 + this.field3411 * this.field3411);
        if (!this.field3433) {
            this.field3430 = -this.field3427 * Math.tan((double) this.field3425 * 0.02454369D);
        }
        this.field3407 = ((double) arg1 - this.field3423 - this.field3430 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Lje;")
    public final class91 method406(boolean arg0) {
        field3413++;
        if (arg0) {
            this.method1139(109, 20, 89, 105, -30);
        }
        class208 var2 = class93.method650(15575, this.field3402);
        class91 var3 = var2.method1359((byte) 103, this.field3422);
        if (var3 == null) {
            return null;
        } else {
            var3.method633(this.field3420);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    public final void method1140(int arg0, int arg1) {
        this.field3423 += this.field3407 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3430;
        this.field3414 += (double) arg1 * this.field3418;
        if (arg0 < 106) {
            return;
        }
        field3408++;
        this.field3430 += (double) arg1 * this.field3407;
        this.field3412 += (double) arg1 * this.field3411;
        this.field3433 = true;
        this.field3401 = (int) (Math.atan2(this.field3411, this.field3418) * 325.949D) + 1024 & 0x7FF;
        this.field3420 = (int) (Math.atan2(this.field3430, this.field3427) * 325.949D) & 0x7FF;
        if (this.field3424 == null) {
            return;
        }
        this.field3406 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3406 <= this.field3424.field3292[this.field3422]) {
                        return;
                    }
                    this.field3406 -= this.field3424.field3292[this.field3422];
                    this.field3422++;
                } while (this.field3424.field3263.length > this.field3422);
                this.field3422 -= this.field3424.field3287;
            } while (this.field3422 >= 0 && this.field3422 < this.field3424.field3263.length);
            this.field3422 = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field3434 = null;
        if (arg0 != 0) {
            field3405 = 21;
        }
        field3403 = null;
        field3400 = null;
        field3429 = null;
        field3416 = null;
        field3432 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3425 = arg7;
        this.field3402 = arg0;
        this.field3415 = arg4;
        this.field3399 = arg10;
        this.field3433 = false;
        this.field3431 = arg8;
        this.field3419 = arg2;
        this.field3409 = arg6;
        this.field3404 = arg9;
        this.field3417 = arg5;
        this.field3421 = arg1;
        this.field3410 = arg3;
        int var12 = class93.method650(15575, this.field3402).field4052;
        if (var12 == -1) {
            this.field3424 = null;
        } else {
            this.field3424 = class97.method668(var12, (byte) 44);
        }
    }
}
