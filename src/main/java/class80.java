import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class80 extends class259 {

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    private int field1719 = 2048;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    private int field1718 = 3072;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    private int field1713 = 1024;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lsg;")
    public static class30 field1710 = class167.method1221((byte) 33, "settings=");

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "Lsg;")
    public static class30 field1723 = class167.method1221((byte) 33, ": ");

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "[I")
    public static int[] field1727 = new int[32];

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "Z")
    public static boolean field1722 = false;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[I")
    public static int[] field1714 = new int[5];

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "Lsg;")
    public static class30 field1729 = class167.method1221((byte) 33, "blinken3:");

    @OriginalMember(owner = "client!p", name = "db", descriptor = "Lsg;")
    public static class30 field1721 = class167.method1221((byte) 33, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1717 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field1715;
        if (arg1) {
            this.method3((byte) 21, -120);
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int[] var4 = this.method1799(0, arg0, 115);
            for (int var5 = 0; ~class223.field3999 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1719 >> 12) + this.field1713;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method4(-119, -91, (class8) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field4588 = ~arg2.method63((byte) 102) == -2;
                }
            } else {
                this.field1718 = arg2.method65((byte) 120);
            }
        } else {
            this.field1713 = arg2.method65((byte) 123);
        }
        ++field1725;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)I")
    public static final int method696(byte arg0, int arg1, int arg2) {
        ++field1728;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 1;
            arg1 *= arg1;
        }
        int var4 = 35 % ((arg0 - 88) / 32);
        if (~arg2 == -2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    public static final void method697(int arg0, int arg1) {
        ++field1730;
        --class52.field1165;
        if (~class52.field1165 != ~arg0) {
            class26.method231(class167.field3078, arg0 + 1, class167.field3078, arg0, class52.field1165 - arg0);
            class26.method231(class48.field1088, arg0 + 1, class48.field1088, arg0, -arg0 + class52.field1165);
            class26.method232(class30.field602, arg0 - -1, class30.field602, arg0, -arg0 + class52.field1165);
            class26.method230(class43.field1031, arg0 + 1, class43.field1031, arg0, -arg0 + class52.field1165);
            class26.method229(class231.field4108, arg0 + arg1, class231.field4108, arg0, -arg0 + class52.field1165);
            class26.method229(class97.field1969, arg0 - -1, class97.field1969, arg0, -arg0 + class52.field1165);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class80() {
        super(1, false);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        ++field1726;
        class123 var1 = (class123) class238.field4237.method478(0);
        if (arg0 != -86) {
            field1723 = null;
        }
        while (var1 != null) {
            class186 var2 = var1.field2420;
            if (~class159.field2998 == ~var2.field3425 && !var2.field3409) {
                if (class133.field2617 >= var2.field3429) {
                    var2.method1343(class195.field3517, -1);
                    if (!var2.field3409) {
                        class22.method206(var2.field3425, var2.field3424, var2.field3423, var2.field3418, 60, var2, 0, -1L, false);
                    } else {
                        var1.method1681(false);
                    }
                }
            } else {
                var1.method1681(false);
            }
            var1 = (class123) class238.field4237.method476((byte) 13);
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        this.field1719 = -this.field1713 + this.field1718;
        if (arg0 <= 11) {
            method699(52);
        }
        ++field1712;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1711;
        int[][] var3 = super.field4568.method241(67, arg1);
        int var4 = -84 / ((-48 - arg0) / 42);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[2];
            int[] var11 = var3[2];
            for (int var12 = 0; class223.field3999 > var12; ++var12) {
                var8[var12] = (var6[var12] * this.field1719 >> 12) + this.field1713;
                var9[var12] = (var7[var12] * this.field1719 >> 12) + this.field1713;
                var11[var12] = (var10[var12] * this.field1719 >> 12) + this.field1713;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(I)V")
    public static void method699(int arg0) {
        if (arg0 < 46) {
            method696((byte) -65, 23, 96);
        }
        field1727 = null;
        field1717 = null;
        field1714 = null;
        field1721 = null;
        field1710 = null;
        field1729 = null;
        field1723 = null;
    }
}
