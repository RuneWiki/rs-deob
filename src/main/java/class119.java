import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class119 extends class367 implements class278 {

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Lja;")
    public class101 field1675;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
    private boolean field1657;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "Ldu;")
    public static class479 field1669 = new class479();

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[S")
    public static short[] field1676 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public final void method217(boolean arg0) {
        if (arg0) {
            this.method217(false);
        }
        ++field1659;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static final void method745(byte arg0) {
        ++field1661;
        if (~class228.field3232.length() != -1) {
            class109.method680("--> " + class228.field3232, 12245);
            class183.method1200(class228.field3232, false, -1);
            class168.field2494 = 0;
            class327.field4510 = 0;
            if (arg0 == 96) {
                class228.field3232 = "";
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I")
    public final int method219(int arg0) {
        ++field1666;
        return arg0 != -17942 ? 41 : this.field1675.field1425;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
    public final boolean method214(int arg0) {
        ++field1667;
        if (arg0 <= 24) {
            this.method195(59);
        }
        return this.field1675.method638(0);
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1676 = null;
        if (arg0 != 255) {
            method749(-42);
        }
        field1669 = null;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
    public final boolean method195(int arg0) {
        ++field1668;
        if (arg0 <= 91) {
            this.method202((byte) -97);
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkm;I)V")
    public final void method216(class487 arg0, int arg1) {
        ++field1663;
        this.field1675.method645(arg0, true);
        int var3 = 17 / ((arg1 - -12) / 60);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lkm;I)V")
    public final void method197(class487 arg0, int arg1) {
        ++field1655;
        class232 var3 = this.field1675.method636(super.field5223, true, true, super.field5224, arg0, 131072, (byte) -123);
        if (var3 != null) {
            this.field1675.method642(super.field5224 >> 7, super.field5224 >> 7, super.field5223 >> 7, arg0, 124, super.field5223 >> 7, var3, false);
        }
        int var4 = -62 / ((64 - arg1) / 59);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (arg0 < 42) {
            this.method217(false);
        }
        ++field1670;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
    public final int method215(int arg0) {
        if (arg0 != -11524) {
            this.method197((class487) null, 87);
        }
        ++field1662;
        return this.field1675.field1444;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BC)Z")
    public static final boolean method747(byte arg0, char arg1) {
        ++field1671;
        int var2 = -90 % ((arg0 - -62) / 60);
        if ((arg1 <= 0 || arg1 >= 128) && (~arg1 > -161 || arg1 > 255)) {
            if (arg1 != 0) {
                char[] var3 = class480.field6793;
                for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                    char var5 = var3[var4];
                    if (~arg1 == ~var5) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
    public static final int method748(int arg0) {
        if (arg0 != 22461) {
            return 56;
        } else {
            ++field1665;
            return 16;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkm;II)Lab;")
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = -11 % ((arg1 - -12) / 47);
        ++field1660;
        return this.field1675.method636(0, false, false, 0, arg0, arg2, (byte) -128);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(Lkm;I)Lto;")
    public final class370 method193(class487 arg0, int arg1) {
        ++field1658;
        class232 var3 = this.field1675.method636(super.field5223, false, true, super.field5224, arg0, 1024, (byte) -124);
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = arg0.method1105();
            if (arg1 > -6) {
                this.method195(8);
            }
            var4.method1382(super.field5224, super.field5216, super.field5223);
            class370 var5 = null;
            if (this.field1657) {
                var5 = class277.method1737((byte) 28, 1);
            }
            if (this.field1675.field1445 == null) {
                var3.method41(var4, var5 != null ? var5.field5233[0] : null, 0);
            } else {
                class473 var6 = this.field1675.field1445.method567();
                arg0.method1063(var3, var6, var4, var5 != null ? var5.field5233[0] : null, 0);
            }
            this.field1675.method642(super.field5224 >> 7, super.field5224 >> 7, super.field5223 >> 7, arg0, 126, super.field5223 >> 7, var3, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lkm;I)V")
    public final void method218(class487 arg0, int arg1) {
        if (arg1 <= -73) {
            this.field1675.method637(false, arg0);
            ++field1673;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIZII)V")
    public class119(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field6732, arg1.field6650);
        this.field1675 = new class101(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1657 = ~arg1.field6681 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I")
    public final int method211(boolean arg0) {
        if (!arg0) {
            return 39;
        } else {
            ++field1674;
            return this.field1675.field1413;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkm;BII)Z")
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field1656;
        class232 var5 = this.field1675.method636(super.field5223, false, false, super.field5224, arg0, 65536, (byte) -123);
        if (var5 == null) {
            return false;
        } else {
            class250 var6 = arg0.method1105();
            if (arg1 <= 123) {
                field1669 = null;
            }
            var6.method1382(super.field5224, super.field5216, super.field5223);
            return var5.method75(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
    public static final void method749(int arg0) {
        if (arg0 != 0) {
            field1676 = null;
        }
        class101.field1411.method656(127);
        ++field1672;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILkm;IZILkj;B)V")
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            field1669 = null;
        }
        ++field1664;
        throw new IllegalStateException();
    }
}
