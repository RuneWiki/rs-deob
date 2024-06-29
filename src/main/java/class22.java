import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class22 extends class205 {

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    private int field507 = -1;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "Lvd;")
    private static class222 field520 = class212.method1357("K", 10731);

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Lvd;")
    private static class222 field521 = class212.method1357("Members only world", 10731);

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "Lvd;")
    public static class222 field517 = field521;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Lvd;")
    private static class222 field515 = class212.method1357("Examine", 10731);

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "Lvd;")
    public static class222 field524 = field520;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "Lvd;")
    public static class222 field508 = class212.method1357("Verbindung abgebrochen)3", 10731);

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Lvd;")
    public static class222 field510 = class212.method1357("cookiehost", 10731);

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "Lvd;")
    public static class222 field531 = field520;

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "Lgg;")
    public static class72 field530 = null;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "Lvd;")
    public static class222 field529 = field515;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "Lvd;")
    public static class222 field532 = class212.method1357("; Expires=", 10731);

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    public final void method95(int arg0) {
        ++field523;
        super.method95(arg0);
        this.field518 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIJ)Lvd;")
    public static final class222 method208(int arg0, int[] arg1, int arg2, long arg3) {
        ++field511;
        if (~arg0 == -1) {
            class119 var5 = class205.method1320(false, arg1[0]);
            return var5.method764(5056, (int) arg3);
        } else if (arg0 == 1) {
            class204 var6 = class112.method728((int) arg3, (byte) -107);
            return var6.field3777;
        } else if (~arg0 == -6) {
            return class204.method1317((byte) 75, arg3).method1409(arg2 + 8510);
        } else if (arg0 == 6) {
            return class205.method1320(false, arg1[0]).method764(5056, (int) arg3);
        } else {
            if (arg2 != -16409) {
                field521 = null;
            }
            return class228.method1503(arg3, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field519;
        if (arg1 < 98) {
            method210(65);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015 && this.method212((byte) -14)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field509 * (~class134.field2598 != ~this.field514 ? this.field514 * arg0 / class134.field2598 : arg0);
            if (~class118.field2245 == ~this.field509) {
                for (int var8 = 0; ~var8 > ~class118.field2245; ++var8) {
                    int var9 = this.field518[var7++];
                    var6[var8] = class139.method876(var9 << 4, 4080);
                    var5[var8] = class139.method876(var9 >> 4, 4080);
                    var4[var8] = class139.method876(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class118.field2245; ++var10) {
                    int var11 = this.field509 * var10 / class118.field2245;
                    int var12 = this.field518[var7 + var11];
                    var6[var10] = class139.method876(var12, 255) << 4;
                    var5[var10] = class139.method876(65280, var12) >> 4;
                    var4[var10] = class139.method876(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
    public static final int method209(int arg0, int arg1, int arg2, int arg3) {
        ++field528;
        int var4 = -4 / ((arg2 - 25) / 54);
        if (arg0 > arg1) {
            return arg0;
        } else {
            return ~arg1 < ~arg3 ? arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
    public static void method210(int arg0) {
        field510 = null;
        field520 = null;
        field532 = null;
        field529 = null;
        if (arg0 == 1) {
            field515 = null;
            field531 = null;
            field517 = null;
            field524 = null;
            field508 = null;
            field521 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Lka;BI)Lvd;")
    public static final class222 method211(class109 arg0, byte arg1, int arg2) {
        ++field525;
        try {
            class222 var3 = new class222();
            if (arg1 > -48) {
                field531 = null;
            }
            var3.field4121 = arg0.method699(15784);
            if (~arg2 > ~var3.field4121) {
                var3.field4121 = arg2;
            }
            var3.field4163 = new byte[var3.field4121];
            arg0.field2053 += class27.field602.method632(0, arg0.field2053, var3.field4163, 7, arg0.field2006, var3.field4121);
            return var3;
        } catch (Exception var4) {
            return class10.field178;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class22() {
        super(0, false);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)Z")
    private final boolean method212(byte arg0) {
        ++field516;
        if (this.field518 != null) {
            return true;
        } else if (arg0 != -14) {
            return false;
        } else if (this.field507 >= 0) {
            int var2 = class118.field2245;
            int var3 = class134.field2598;
            int var4 = class125.field2391.method1168(this.field507, 2839) ? 64 : 128;
            this.field518 = class125.field2391.method1173(this.field507, true);
            this.field514 = var4;
            this.field509 = var4;
            class98.method616(var2, (byte) -115, var3);
            return this.field518 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field507 = arg0.method675(2);
        }
        ++field513;
        int var4 = -21 / ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lge;II)V")
    public static final void method213(class70 arg0, int arg1, int arg2) {
        if (arg2 >= -60) {
            field522 = 3;
        }
        ++field512;
        class174.method1099(arg0.field1360, arg1, arg0.field1353, -421473367);
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)I")
    public final int method214(int arg0) {
        if (arg0 >= -60) {
            this.method212((byte) -76);
        }
        ++field526;
        return this.field507;
    }
}
