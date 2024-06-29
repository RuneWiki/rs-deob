import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class232 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Ltl;")
    private class400 field3404 = new class400(64);

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Lui;")
    private class451 field3405;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Lje;")
    public static class178 field3403 = null;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public final void method1518(boolean arg0) {
        class400 var2 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method2401((byte) -126);
            if (!arg0) {
                this.field3405 = null;
            }
        }
        field3399++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)Lkr;")
    public final class245 method1519(boolean arg0, int arg1) {
        field3402++;
        if (arg0) {
            this.method1518(false);
        }
        class400 var3 = this.field3404;
        class245 var4;
        synchronized (this.field3404) {
            var4 = (class245) this.field3404.method2393(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3405.method2691(arg1, 35, 0);
        class245 var6 = new class245();
        if (var5 != null) {
            var6.method1560((byte) 103, new class446(var5));
        }
        var6.method1562(14);
        class400 var7 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    public final void method1520(int arg0, int arg1) {
        class400 var3 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method2389(false, arg1);
        }
        field3400++;
        if (arg0 != -1518) {
            this.field3405 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1521(int arg0) {
        field3403 = null;
        if (arg0 != 35) {
            method1521(-34);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V")
    public static final void method1522(int arg0, byte arg1) {
        field3401++;
        if (arg1 >= -121) {
            method1522(94, (byte) -124);
        }
        class186 var2 = class275.method1789(arg0, (byte) 123, 12);
        var2.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public final void method1523(byte arg0) {
        field3406++;
        if (arg0 != 95) {
            this.field3404 = null;
        }
        class400 var2 = this.field3404;
        synchronized (this.field3404) {
            this.field3404.method2388(-124);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lgp;ILui;)V")
    public class232(class430 arg0, int arg1, class451 arg2) {
        this.field3405 = arg2;
        if (this.field3405 != null) {
            this.field3405.method2662(35, (byte) -7);
        }
    }
}
