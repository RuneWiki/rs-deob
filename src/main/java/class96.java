import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class96 extends class189 {

    @OriginalMember(owner = "client!kg", name = "Ib", descriptor = "Lje;")
    public static class85 field2021 = null;

    @OriginalMember(owner = "client!kg", name = "Pb", descriptor = "[I")
    public static int[] field2028 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kg", name = "Rb", descriptor = "I")
    public static int field2030 = -1;

    @OriginalMember(owner = "client!kg", name = "Mb", descriptor = "Lcd;")
    public static class23 field2025 = class54.method414("Clientscript error in: ", -1);

    @OriginalMember(owner = "client!kg", name = "Fb", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!kg", name = "Hb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!kg", name = "Jb", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!kg", name = "Kb", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!kg", name = "Lb", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!kg", name = "Nb", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!kg", name = "Ob", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!kg", name = "Qb", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!kg", name = "Tb", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!kg", name = "Ub", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!kg", name = "Sb", descriptor = "Lsf;")
    private class167 field2031;

    @OriginalMember(owner = "client!kg", name = "Gb", descriptor = "Ljava/lang/String;")
    public static String field2019;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "(II)I")
    public final int method626(int arg0, int arg1) {
        ++field2033;
        int var3 = -(7 & this.field2018) + 8;
        if (arg0 != 16789) {
            return 13;
        } else {
            int var4 = this.field2018 >> 3;
            this.field2018 += arg1;
            int var5 = 0;
            while (~var3 > ~arg1) {
                var5 += (super.field3753[var4++] & class30.field653[var3]) << arg1 - var3;
                arg1 -= var3;
                var3 = 8;
            }
            int var6;
            if (~arg1 == ~var3) {
                var6 = (super.field3753[var4] & class30.field653[var3]) + var5;
            } else {
                var6 = (super.field3753[var4] >> -arg1 + var3 & class30.field653[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "(II)I")
    public final int method627(int arg0, int arg1) {
        int var3 = -85 % ((arg1 - 12) / 58);
        ++field2027;
        return arg0 * 8 + -this.field2018;
    }

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "(I)I")
    public final int method628(int arg0) {
        if (arg0 != 7) {
            field2019 = null;
        }
        ++field2026;
        return super.field3753[super.field3752++] + -this.field2031.method1027(-51) & 255;
    }

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "(I)V")
    public static void method629(int arg0) {
        field2028 = null;
        field2019 = null;
        field2025 = null;
        if (arg0 <= 13) {
            method635((class23) null, (class23) null, (byte) 102, (class97) null);
        }
    }

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "(I)V")
    public final void method630(int arg0) {
        if (arg0 <= -110) {
            super.field3752 = (this.field2018 + 7) / 8;
            ++field2022;
        }
    }

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "(II)V")
    public final void method631(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method628(-98);
        }
        super.field3753[super.field3752++] = (byte) (arg0 + this.field2031.method1027(-64));
        ++field2020;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IB)V")
    public final void method632(int[] arg0, byte arg1) {
        if (arg1 >= -91) {
            field2025 = null;
        }
        ++field2024;
        this.field2031 = new class167(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
    public class96(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "(I)V")
    public static final void method633(int arg0) {
        ++field2029;
        if (class176.field3499 != null) {
            class193 var1 = class176.field3499;
            synchronized (class176.field3499) {
                class176.field3499 = null;
            }
        }
        if (arg0 != 8) {
            method629(-72);
        }
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(B)V")
    public final void method634(byte arg0) {
        this.field2018 = super.field3752 * 8;
        ++field2032;
        if (arg0 <= 70) {
            this.method628(62);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lcd;Lcd;BLkh;)[Lea;")
    public static final class38[] method635(class23 arg0, class23 arg1, byte arg2, class97 arg3) {
        ++field2023;
        if (arg2 != -63) {
            field2021 = null;
        }
        int var4 = arg3.method647((byte) -40, arg0);
        int var5 = arg3.method642(var4, (byte) -114, arg1);
        return class120.method748(arg3, arg2 + 64, var4, var5);
    }
}
