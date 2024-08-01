import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bh")
public class class19 extends class95 {

    @OriginalMember(owner = "bh", name = "gb", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "bh", name = "mb", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "bh", name = "qb", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "bh", name = "lb", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "bh", name = "nb", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "bh", name = "hb", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "bh", name = "ab", descriptor = "Lbi;")
    private class20 field412;

    @OriginalMember(owner = "bh", name = "db", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "bh", name = "pb", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "bh", name = "cb", descriptor = "Llf;")
    public static class109 field414 = class35.method275("oder benutzen Sie eine andere Welt)3", 2);

    @OriginalMember(owner = "bh", name = "ib", descriptor = "Llf;")
    public static class109 field420 = null;

    @OriginalMember(owner = "bh", name = "bb", descriptor = "I")
    public static volatile int field413 = 0;

    @OriginalMember(owner = "bh", name = "ob", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "bh", name = "rb", descriptor = "I")
    public static int field429 = 500;

    @OriginalMember(owner = "bh", name = "eb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "bh", name = "jb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "bh", name = "kb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "bh", name = "sb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "bh", name = "fb", descriptor = "Lad;")
    public static class5 field417;

    @OriginalMember(owner = "bh", name = "b", descriptor = "(I)Lue;")
    public final class189 method177(int arg0) {
        if (this.field412 != null) {
            int var2 = class143.field2754 - this.field415;
            if (var2 > 100 && this.field412.field454 > 0) {
                var2 = 100;
            }
            label48: {
                do {
                    do {
                        if (var2 <= this.field412.field442[this.field427]) {
                            break label48;
                        }
                        var2 -= this.field412.field442[this.field427];
                        this.field427++;
                    } while (this.field412.field440.length > this.field427);
                    this.field427 -= this.field412.field454;
                } while (this.field427 >= 0 && this.field412.field440.length > this.field427);
                this.field412 = null;
            }
            this.field415 = class143.field2754 - var2;
        }
        field430++;
        class78 var3 = class140.method1000(this.field423, 0);
        if (var3.field1528 != null) {
            var3 = var3.method495(41);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field424 == 1 || this.field424 == 3) {
            var4 = var3.field1498;
            var5 = var3.field1501;
        } else {
            var4 = var3.field1501;
            var5 = var3.field1498;
        }
        int var6 = (var4 + 1 >> 1) + this.field418;
        int var7 = (var5 + 1 >> 1) + this.field428;
        int var8 = (var5 >> 1) + this.field428;
        int var9 = (var4 >> 1) + this.field418;
        int[][] var10 = class184.field3448[this.field419];
        int var11 = var10[var9][var8] + var10[var6][var7] + var10[var9][var7] + var10[var6][var8] >> 2;
        int var12 = 102 / ((arg0 - 61) / 46);
        int var13 = (this.field428 << 7) + (var5 << 6);
        int var14 = (this.field418 << 7) + (var4 << 6);
        return var3.method505(this.field412, this.field425, var14, this.field427, var13, -59, this.field424, var11, var10);
    }

    @OriginalMember(owner = "bh", name = "a", descriptor = "(ZLbg;Lbg;I)V")
    public static final void method178(boolean arg0, class18 arg1, class18 arg2, int arg3) {
        class7.field104 = arg0;
        class68.field1321 = arg2;
        field422++;
        if (arg3 < 42) {
            method179((byte) -110);
        }
        class177.field3342 = arg1;
    }

    @OriginalMember(owner = "bh", name = "d", descriptor = "(B)V")
    public static void method179(byte arg0) {
        if (arg0 != -42) {
            field417 = null;
        }
        field414 = null;
        field417 = null;
        field420 = null;
    }

    @OriginalMember(owner = "bh", name = "a", descriptor = "(IZII)I")
    public static final int method180(int arg0, boolean arg1, int arg2, int arg3) {
        field416++;
        int var4 = arg3 >> 7;
        if (arg1) {
            return 18;
        }
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class88.field1827[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class184.field3448[var6][var4][var5 - -1] + class184.field3448[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class184.field3448[var6][var4][var5] + class184.field3448[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "bh", name = "<init>", descriptor = "(IIIIIIIZLka;)V")
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class95 arg8) {
        this.field418 = arg4;
        this.field424 = arg2;
        this.field428 = arg5;
        this.field423 = arg0;
        this.field425 = arg1;
        this.field419 = arg3;
        if (arg6 != -1) {
            this.field412 = client.method246(12, arg6);
            this.field415 = class143.field2754 - 1;
            this.field427 = 0;
            if (this.field412.field452 == 0 && arg8 != null && arg8 instanceof class19) {
                class19 var10 = (class19) arg8;
                if (this.field412 == var10.field412) {
                    this.field415 = var10.field415;
                    this.field427 = var10.field427;
                    return;
                }
            }
            if (arg7 && this.field412.field454 != -1) {
                this.field427 = (int) (Math.random() * (double) this.field412.field440.length);
                this.field415 -= (int) (Math.random() * (double) this.field412.field442[this.field427]);
                return;
            }
        }
    }

    @OriginalMember(owner = "bh", name = "a", descriptor = "(III)Llf;")
    public static final class109 method181(int arg0, int arg1, int arg2) {
        field421++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class111.field2188;
        } else if (var3 < -6) {
            return class27.field584;
        } else if (var3 < -3) {
            return class38.field823;
        } else if (var3 < 0) {
            return class150.field2891;
        } else if (var3 > 9) {
            return class40.field840;
        } else if (var3 > 6) {
            return class12.field182;
        } else if (var3 > 3) {
            return class153.field2911;
        } else {
            if (arg2 != 32139) {
                field413 = -40;
            }
            return var3 > 0 ? class18.field382 : class111.field2189;
        }
    }
}
