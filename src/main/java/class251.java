import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class251 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lku;")
    private class232 field3700 = new class232(16);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lb;")
    private class201 field3699;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Ldk;")
    public static class326 field3703 = new class326(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lqm;")
    public static class87 field3705;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)Lio;")
    public final class277 method1566(boolean arg0, int arg1) {
        field3702++;
        class232 var3 = this.field3700;
        class277 var4;
        synchronized (this.field3700) {
            var4 = (class277) this.field3700.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3699.method1257(arg1, 30, 24558);
        class277 var6 = new class277();
        if (var5 != null) {
            var6.method1758(new class276(var5), false);
        }
        class232 var7 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1473(var6, (long) arg1, 118);
            if (!arg0) {
                method1569(true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public final void method1567(int arg0, int arg1) {
        if (arg1 <= 86) {
            return;
        }
        class232 var3 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1486(438127120, arg0);
        }
        field3696++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method1568(int arg0) {
        if (arg0 > -75) {
            method1571((byte) -28);
        }
        class232 var2 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1478((byte) -102);
        }
        field3701++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static final void method1569(boolean arg0) {
        field3698++;
        int var1 = class314.field4438.method1176(class437.field6083, 1);
        if (var1 == 0) {
            class177.field2545 = null;
            class249.method1555(0, (byte) 76);
        } else if (var1 == 1) {
            class421.method2474((byte) 0, 0);
            class249.method1555(512, (byte) 76);
            if (class413.field5813 != null) {
                class166.method1030((byte) 124);
            }
        } else {
            class421.method2474((byte) (class492.field6932 - 4 & 0xFF), 0);
            class249.method1555(2, (byte) 76);
        }
        class166.field2440 = class29.field394;
        if (!arg0) {
            method1569(true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public final void method1570(int arg0) {
        field3697++;
        class232 var2 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method1475(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3703 = null;
        field3705 = null;
        if (arg0 > -61) {
            field3703 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class251(class353 arg0, int arg1, class201 arg2) {
        this.field3699 = arg2;
        this.field3699.method1235(0, 30);
    }

    static {
        Math.sqrt(8192.0D);
    }
}
