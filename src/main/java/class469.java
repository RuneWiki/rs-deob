import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class469 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lpja;")
    private class43 field6341 = new class43(64);

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lgj;")
    public class662 field6345;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Lgj;")
    private class662 field6346;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lfja;")
    public static class783 field6339 = new class783(9, 6);

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field6348 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2695(int arg0, int arg1, byte arg2) {
        field6344++;
        if (arg2 < 87) {
            return false;
        } else {
            return (arg1 & 0x40000) != 0 | class584.method3360(arg1, true, arg0) || class104.method895(arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method2696(int arg0) {
        field6342++;
        class43 var2 = this.field6341;
        synchronized (this.field6341) {
            if (arg0 < -50) {
                this.field6341.method272(20);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lwca;")
    public final class706 method2697(int arg0, int arg1) {
        field6340++;
        class43 var3 = this.field6341;
        class706 var4;
        synchronized (this.field6341) {
            var4 = (class706) this.field6341.method266((byte) -112, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field6346;
        byte[] var6;
        synchronized (this.field6346) {
            if (arg1 != 9505) {
                this.field6341 = null;
            }
            var6 = this.field6346.method3732(arg0, 8906, 3);
        }
        class706 var7 = new class706();
        var7.field9710 = this;
        if (var6 != null) {
            var7.method3940(true, new class93(var6));
        }
        class43 var8 = this.field6341;
        synchronized (this.field6341) {
            this.field6341.method270(var7, (long) arg0, arg1 - 9630);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    public final void method2698(int arg0, int arg1) {
        class43 var3 = this.field6341;
        synchronized (this.field6341) {
            this.field6341.method265(arg0, arg1 - 121);
            if (arg1 != 64) {
                field6339 = null;
            }
        }
        field6338++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static void method2699(int arg0) {
        if (arg0 != 6) {
            method2695(-6, -41, (byte) -126);
        }
        field6339 = null;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public final void method2700(int arg0) {
        class43 var2 = this.field6341;
        synchronized (this.field6341) {
            if (arg0 != 3) {
                this.field6345 = null;
            }
            this.field6341.method273(-36);
        }
        field6343++;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V")
    public class469(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field6345 = arg3;
        this.field6346 = arg2;
        this.field6346.method3730((byte) -126, 3);
    }
}
