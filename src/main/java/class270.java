import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class270 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Ljk;")
    private class449 field3406 = new class449(64);

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Lqn;")
    private class47 field3410;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
    public final void method1599(int arg0, int arg1) {
        field3404++;
        class449 var3 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method2648(false, arg0);
        }
        if (arg1 < 82) {
            this.field3406 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BJ)V")
    public static final void method1600(byte arg0, long arg1) {
        try {
            if (arg0 != 16) {
                method1600((byte) -102, 64L);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field3407++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)Lof;")
    public final class440 method1601(byte arg0, int arg1) {
        field3409++;
        class449 var3 = this.field3406;
        class440 var4;
        synchronized (this.field3406) {
            var4 = (class440) this.field3406.method2647(-109, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -104) {
            this.field3410 = null;
        }
        class47 var5 = this.field3410;
        byte[] var6;
        synchronized (this.field3410) {
            var6 = this.field3410.method481(31, arg1, -105);
        }
        class440 var7 = new class440();
        if (var6 != null) {
            var7.method2588(-107, new class463(var6));
        }
        class449 var8 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
    public final void method1602(boolean arg0) {
        class449 var2 = this.field3406;
        synchronized (this.field3406) {
            if (!arg0) {
                this.method1602(false);
            }
            this.field3406.method2640(99);
        }
        field3405++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method1603(int arg0) {
        class449 var2 = this.field3406;
        synchronized (this.field3406) {
            this.field3406.method2642(0);
        }
        if (arg0 > 92) {
            field3408++;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lae;ILqn;)V")
    public class270(class165 arg0, int arg1, class47 arg2) {
        this.field3410 = arg2;
        this.field3410.method469(30322, 31);
    }
}
