import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class365 {

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "Lgs;")
    private class389 field4717 = new class389();

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "Lgs;")
    private class389 field4721;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
    public final boolean method2095(byte arg0) {
        int var2 = -116 / ((arg0 + 22) / 62);
        field4719++;
        return this.field4717.field4989 == this.field4717;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lgga;Z)I")
    public static final int method2096(class462 arg0, boolean arg1) {
        if (arg1) {
            return 107;
        }
        field4715++;
        if (class510.field6687 == arg0) {
            return 7681;
        } else if (class219.field2875 == arg0) {
            return 8448;
        } else if (class456.field5976 == arg0) {
            return 34165;
        } else if (class600.field8091 == arg0) {
            return 260;
        } else if (class473.field6161 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
    public final int method2097(byte arg0) {
        field4720++;
        int var2 = 0;
        class389 var3 = this.field4717.field4989;
        while (this.field4717 != var3) {
            var3 = var3.field4989;
            var2++;
        }
        if (arg0 != 106) {
            this.method2101(-88);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)Lgs;")
    public final class389 method2098(byte arg0) {
        field4712++;
        if (arg0 != 57) {
            return null;
        }
        class389 var2 = this.field4721;
        if (this.field4717 == var2) {
            this.field4721 = null;
            return null;
        } else {
            this.field4721 = var2.field4989;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "([BII)I")
    public static final int method2099(byte[] arg0, int arg1, int arg2) {
        if (arg1 == 3228) {
            field4722++;
            return class199.method1307(arg2, 0, arg0, -409282360);
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)V")
    public final void method2100(byte arg0) {
        field4723++;
        while (true) {
            class389 var2 = this.field4717.field4989;
            if (this.field4717 == var2) {
                this.field4721 = null;
                if (arg0 > -43) {
                    this.field4721 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method2227(46);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lgs;")
    public final class389 method2101(int arg0) {
        field4711++;
        if (arg0 != 260) {
            this.field4717 = null;
        }
        class389 var2 = this.field4717.field4989;
        if (this.field4717 == var2) {
            this.field4721 = null;
            return null;
        } else {
            this.field4721 = var2.field4989;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Lgs;")
    public final class389 method2102(int arg0) {
        field4714++;
        class389 var2 = this.field4717.field4989;
        if (this.field4717 == var2) {
            return null;
        } else {
            var2.method2227(60);
            return arg0 > -75 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)Lgs;")
    public final class389 method2103(int arg0) {
        field4716++;
        class389 var2 = this.field4717.field4988;
        if (this.field4717 == var2) {
            this.field4721 = null;
            return null;
        }
        if (arg0 != -7394) {
            method2099(null, -2, 80);
        }
        this.field4721 = var2.field4988;
        return var2;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
    public class365() {
        this.field4717.field4989 = this.field4717;
        this.field4717.field4988 = this.field4717;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLgs;)V")
    public final void method2104(byte arg0, class389 arg1) {
        if (arg1.field4988 != null) {
            arg1.method2227(arg0 + 47);
        }
        field4718++;
        arg1.field4988 = this.field4717.field4988;
        arg1.field4989 = this.field4717;
        arg1.field4988.field4989 = arg1;
        arg1.field4989.field4988 = arg1;
        if (arg0 != -22) {
            this.method2102(94);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V")
    public static final void method2105(int arg0, byte arg1) {
        field4713++;
        if (arg1 != -113) {
            return;
        }
        for (class424 var2 = class691.field9442.method42((byte) 112); var2 != null; var2 = class691.field9442.method40(false)) {
            if (((long) arg0) == (var2.field5499 >> 48 & 0xFFFFL)) {
                var2.method2438((byte) -97);
            }
        }
    }
}
