import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class258 {

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Lfba;")
    private class348 field3694 = new class348(64);

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "Lla;")
    private class423 field3696;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "Lgr;")
    public static class530 field3695 = new class530(72, 8);

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field3700 = 1;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "Lle;")
    public static class734 field3697;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)Lfi;", line = 5)
    public final class12 method1714(int arg0, int arg1) {
        field3692++;
        class348 var3 = this.field3694;
        class12 var4;
        synchronized (this.field3694) {
            var4 = (class12) this.field3694.method2216(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field3696;
        byte[] var6;
        synchronized (this.field3696) {
            var6 = this.field3696.method2600(0, arg0, arg1);
        }
        class12 var7 = new class12();
        if (var6 != null) {
            var7.method59(new class479(var6), 117);
        }
        var7.method64((byte) -116);
        class348 var8 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 36)
    public static void method1715(int arg0) {
        field3695 = null;
        field3697 = null;
        if (arg0 != 4243) {
            field3700 = 41;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method1716(int arg0, int arg1, int arg2) {
        field3698++;
        return arg2 == -17051 ? class705.method3953(arg1, arg0, 0) & (class275.method1780(arg0, arg1, 127) | (arg1 & 0x2000) != 0 | class370.method2319((byte) -124, arg1, arg0)) : false;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V", line = 64)
    public final void method1717(int arg0) {
        if (arg0 < 24) {
            field3695 = null;
        }
        class348 var2 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method2219(-5300);
        }
        field3691++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZI)V", line = 82)
    public final void method1718(boolean arg0, int arg1) {
        field3693++;
        class348 var3 = this.field3694;
        synchronized (this.field3694) {
            this.field3694.method2207(arg1, 1);
            if (!arg0) {
                this.field3696 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 98)
    public class258(class315 arg0, int arg1, class423 arg2) {
        this.field3696 = arg2;
        if (this.field3696 != null) {
            this.field3696.method2616(35, 0);
        }
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V", line = 118)
    public final void method1719(int arg0) {
        class348 var2 = this.field3694;
        synchronized (this.field3694) {
            if (arg0 != 72) {
                this.method1719(47);
            }
            this.field3694.method2220(false);
        }
        field3699++;
    }
}
