import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class200 extends class205 {

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    private int field3645 = 3072;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    private int field3647 = 1024;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    private int field3659 = 2048;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3650 = 2;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lvd;")
    public static class222 field3648 = class212.method1357("gelb:", 10731);

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lvd;")
    public static class222 field3655 = class212.method1357(")1p", 10731);

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lvd;")
    public static class222 field3649 = class212.method1357("Spiel)2Engine wird gestartet)3)3)3", 10731);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lvd;")
    private static class222 field3653 = class212.method1357("This computers address has been blocked", 10731);

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lvd;")
    public static class222 field3660 = class212.method1357("labels)3dat", 10731);

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lvd;")
    public static class222 field3663 = field3653;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Lvd;")
    public static class222 field3644 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3643 = 0;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "Lvd;")
    public static class222 field3662 = class212.method1357("Suche nach Updates )2 ", 10731);

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lbg;")
    public static class19 field3652;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(BII)I")
    public static final int method1278(byte arg0, int arg1, int arg2) {
        ++field3654;
        if (arg0 != 5) {
            return 121;
        } else {
            int var3 = 0;
            while (~arg1 < -1) {
                var3 = var3 << 1 | arg2 & 1;
                arg2 >>>= 1;
                --arg1;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        this.field3659 = this.field3645 - this.field3647;
        ++field3664;
        if (arg0) {
            field3649 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static final void method1279(byte arg0) {
        class35.method293(class25.field580, class70.field1315, class122.field2321, true);
        if (arg0 == -25) {
            ++field3656;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class200() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            method1278((byte) 60, -20, -104);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[][] var4 = this.method1323(0, arg0, -5920);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class118.field2245; ++var11) {
                var7[var11] = this.field3647 - -(var5[var11] * this.field3659 >> 12);
                var9[var11] = (var6[var11] * this.field3659 >> 12) + this.field3647;
                var10[var11] = (var8[var11] * this.field3659 >> 12) + this.field3647;
            }
        }
        ++field3651;
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)J")
    public static final long method1280(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field2299; ++var4) {
                class23 var5 = var3.field2297[var4];
                if ((var5.field536 >> 29 & 3L) == 2L && var5.field534 == arg1 && var5.field539 == arg2) {
                    return var5.field536;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Ljh;")
    public static final class105 method1281(int arg0, int arg1) {
        ++field3642;
        class105 var2 = (class105) class55.field1028.method601((long) arg0, 65);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class81.field1555.method33(-29616, 4, arg0);
            class105 var4 = new class105();
            if (var3 != null) {
                var4.method645(-4936, new class109(var3), arg0);
            }
            if (arg1 < 22) {
                method1281(-84, -84);
            }
            class55.field1028.method593((long) arg0, var4, (byte) -12);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3658;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3812 = ~arg0.method662((byte) -86) == -2;
                }
            } else {
                this.field3645 = arg0.method675(2);
            }
        } else {
            this.field3647 = arg0.method675(2);
        }
        int var5 = 3 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3657;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1, (byte) 87, 0);
            for (int var5 = 0; ~class118.field2245 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field3659 >> 12) + this.field3647;
            }
        }
        if (arg0 != 0) {
            field3648 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
    public static void method1282(int arg0) {
        field3662 = null;
        field3649 = null;
        field3652 = null;
        field3655 = null;
        field3648 = null;
        field3660 = null;
        field3653 = null;
        field3663 = null;
        if (arg0 != -1539315028) {
            field3660 = null;
        }
        field3644 = null;
    }
}
