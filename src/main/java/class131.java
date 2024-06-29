import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class131 extends class467 implements class278 {

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "Lja;")
    public class101 field1852;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Z")
    private boolean field1838;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Z")
    public static boolean field1836 = true;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Z")
    public static boolean field1839 = false;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method792(long arg0, int arg1) {
        ++field1837;
        int var3 = class299.field4120;
        if (arg1 != -31970) {
            method793((class351) null, 68);
        }
        int var4 = class293.field4021;
        if (class146.field2068 != var3) {
            int var5 = var3 - class146.field2068;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (~var6 > ~var5) {
                    var6 = var5;
                }
            } else if (~var6 != -1) {
                if (var6 > var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class146.field2068 += var6;
        }
        if (!class104.field1498) {
            class356.field4959 += (float) arg0 * class388.field5465 / 40.0F * 8.0F;
            class418.field5750 += (float) arg0 * class244.field3452 / 40.0F * 8.0F;
        }
        if (~class222.field3133 != ~var4) {
            int var7 = var4 - class222.field3133;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (~var7 >= -1) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (~var8 > ~var7) {
                    var8 = var7;
                }
            } else if (var8 != 0) {
                if (~var8 < ~var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class222.field3133 += var8;
        }
        class84.method580((byte) 123);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)Z", line = 90)
    public final boolean method195(int arg0) {
        ++field1853;
        return arg0 < 91;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 101)
    public final void method217(boolean arg0) {
        if (arg0) {
            field1839 = true;
        }
        ++field1846;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I", line = 111)
    public final int method215(int arg0) {
        if (arg0 != -11524) {
            return 102;
        } else {
            ++field1835;
            return this.field1852.field1444;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)I", line = 122)
    public final int method211(boolean arg0) {
        ++field1843;
        if (!arg0) {
            field1836 = false;
        }
        return this.field1852.field1413;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Lkm;I)V", line = 133)
    public final void method197(class487 arg0, int arg1) {
        int var3 = 51 / ((64 - arg1) / 59);
        ++field1842;
        class232 var4 = this.field1852.method636(super.field6549, true, true, super.field6545, arg0, 131072, (byte) -127);
        if (var4 != null) {
            this.field1852.method642(super.field6545 >> 7, super.field6545 >> 7, super.field6549 >> 7, arg0, 120, super.field6549 >> 7, var4, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I", line = 149)
    public final int method219(int arg0) {
        ++field1850;
        return arg0 != -17942 ? -24 : this.field1852.field1425;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkm;II)Lab;", line = 160)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        ++field1834;
        int var4 = 120 / ((arg1 - -12) / 47);
        return this.field1852.method636(0, false, false, 0, arg0, arg2, (byte) -125);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(Lkm;I)Lto;", line = 175)
    public final class370 method193(class487 arg0, int arg1) {
        ++field1847;
        class232 var3 = this.field1852.method636(super.field6549, false, true, super.field6545, arg0, 1024, (byte) -119);
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = arg0.method1105();
            if (arg1 >= -6) {
                this.field1838 = true;
            }
            var4.method1382(super.field6545, super.field6547, super.field6549);
            class370 var5 = null;
            if (this.field1838) {
                var5 = class277.method1737((byte) 28, 1);
            }
            if (this.field1852.field1445 != null) {
                class473 var6 = this.field1852.field1445.method567();
                arg0.method1063(var3, var6, var4, var5 == null ? null : var5.field5233[0], 0);
            } else {
                var3.method41(var4, var5 != null ? var5.field5233[0] : null, 0);
            }
            this.field1852.method642(super.field6545 >> 7, super.field6545 >> 7, super.field6549 >> 7, arg0, -37, super.field6549 >> 7, var3, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 219)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            this.field1838 = false;
        }
        ++field1845;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIZIII)V", line = 230)
    public class131(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class210.method1320(false, arg8, arg9));
        this.field1852 = new class101(arg0, arg1, arg8, arg9, arg2, arg3, super.field6545, super.field6549, arg7, arg10);
        this.field1838 = arg1.field6681 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkm;I)V", line = 241)
    public final void method216(class487 arg0, int arg1) {
        ++field1844;
        int var3 = 113 / ((arg1 - -12) / 60);
        this.field1852.method645(arg0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lkm;BII)Z", line = 251)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 123) {
            this.method215(-27);
        }
        ++field1840;
        class232 var5 = this.field1852.method636(super.field6549, false, false, super.field6545, arg0, 65536, (byte) -126);
        if (var5 == null) {
            return false;
        } else {
            class250 var6 = arg0.method1105();
            var6.method1382(super.field6545, super.field6547, super.field6549);
            return var5.method75(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lkm;I)V", line = 273)
    public final void method218(class487 arg0, int arg1) {
        if (arg1 <= -73) {
            ++field1854;
            this.field1852.method637(false, arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z", line = 284)
    public final boolean method214(int arg0) {
        ++field1841;
        if (arg0 <= 24) {
            field1839 = true;
        }
        return this.field1852.method638(0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lcs;I)V", line = 295)
    public static final void method793(class351 arg0, int arg1) {
        int var2 = -61 % ((14 - arg1) / 42);
        class366.field5214.method797(arg0.method2099(-107), (byte) 118);
        ++field1851;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 309)
    public final void method202(byte arg0) {
        if (arg0 <= 42) {
            method793((class351) null, -69);
        }
        ++field1849;
        throw new IllegalStateException();
    }
}
