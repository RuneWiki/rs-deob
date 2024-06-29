import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class280 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Lku;")
    private class232 field4129 = new class232(64);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lb;")
    private class201 field4123;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lb;")
    public class201 field4131;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[Ltr;")
    public static class176[] field4126;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(JB)V")
    public static final void method1769(long arg0, byte arg1) {
        if (class330.field4786 != null) {
            if (class136.field1807 == 1 || class136.field1807 == 5) {
                class172.method1063(11, arg0);
            } else if (class136.field1807 == 4) {
                class361.method2230(-66, arg0);
            }
        }
        field4127++;
        class171.method1057(class141.field1878, 0, (long) class353.field5090);
        if (class36.field472 != -1) {
            class89.method505(class36.field472, (byte) -105);
        }
        for (int var3 = 0; var3 < class420.field5872; var3++) {
            if (class359.field5166[var3]) {
                class422.field5917[var3] = true;
            }
            class452.field6302[var3] = class359.field5166[var3];
            class359.field5166[var3] = false;
        }
        class420.field5874 = class353.field5090;
        if (class141.field1878.method655()) {
            class259.field3799 = true;
        }
        if (class36.field472 != -1) {
            class420.field5872 = 0;
            class434.method2563(-1412584499);
        }
        class141.field1878.method691();
        class167.method1033(-1, class141.field1878);
        int var4 = class291.method1823((byte) 127);
        if (var4 == -1) {
            var4 = class387.field5502;
        }
        int var5 = 37 / ((-arg1 - 10) / 62);
        class163.method1022(false, var4);
        class111.method710(class492.field6935.field4331, class492.field6935.field4319, class332.field4840, false, class492.field6935.field4317);
        class332.field4840 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static final void method1770(int arg0) {
        if (class430.field6023 != 3) {
            class185.field2746 = -1;
        }
        if (arg0 != 4) {
            field4134 = 28;
        }
        field4133++;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public final void method1771(int arg0) {
        class232 var2 = this.field4129;
        synchronized (this.field4129) {
            this.field4129.method1478((byte) -125);
        }
        if (arg0 != 0) {
            this.method1771(60);
        }
        field4125++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
    public final void method1772(boolean arg0, int arg1) {
        field4130++;
        if (arg0) {
            method1769(53L, (byte) -58);
        }
        class232 var3 = this.field4129;
        synchronized (this.field4129) {
            this.field4129.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public static void method1773(int arg0) {
        if (arg0 != -4) {
            method1774(true, (byte) 105, false);
        }
        field4126 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBZ)V")
    public static final void method1774(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != -66) {
            method1773(124);
        }
        field4124++;
        if (arg2) {
            class401.field5682++;
            class369.method2270((byte) -127);
        }
        if (arg0) {
            class143.field1896++;
            class334.method2106(35);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method1775(boolean arg0) {
        field4132++;
        class232 var2 = this.field4129;
        synchronized (this.field4129) {
            if (!arg0) {
                this.field4129 = null;
            }
            this.field4129.method1475(0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lea;ILb;Lb;)V")
    public class280(class353 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field4123 = arg2;
        this.field4131 = arg3;
        this.field4123.method1235(0, 3);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Llo;")
    public final class490 method1776(byte arg0, int arg1) {
        field4128++;
        class232 var3 = this.field4129;
        class490 var4;
        synchronized (this.field4129) {
            var4 = (class490) this.field4129.method1479(0, (long) arg1);
        }
        if (arg0 < 93) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field4123.method1257(arg1, 3, 24558);
            class490 var6 = new class490();
            var6.field6902 = this;
            if (var5 != null) {
                var6.method2873((byte) 3, new class276(var5));
            }
            class232 var7 = this.field4129;
            synchronized (this.field4129) {
                this.field4129.method1473(var6, (long) arg1, 121);
                return var6;
            }
        } else {
            return var4;
        }
    }
}
