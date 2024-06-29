import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class588 {

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lgt;")
    private class454 field8301 = new class454();

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "Ljava/lang/String;")
    public String field8306;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    private volatile int field8308;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "Lgv;")
    private class81 field8307;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lrr;I)V")
    public final void method3369(class361 arg0, int arg1) {
        field8303++;
        arg0.field4640 = false;
        class454 var3 = this.field8301;
        synchronized (this.field8301) {
            if (arg1 != -1) {
                return;
            }
            this.field8301.method2792((byte) -13, arg0);
            this.field8308++;
        }
        if (this.field8307 != null) {
            class81 var4 = this.field8307;
            synchronized (this.field8307) {
                this.field8307.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILgv;)V")
    public final void method3370(int arg0, class81 arg1) {
        this.field8307 = arg1;
        if (arg0 != -1) {
            this.field8307 = null;
        }
        field8296++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLeha;)V")
    public final void method3371(boolean arg0, class89 arg1) {
        if (arg0) {
            this.method3372((byte) 77);
        }
        class454 var3 = this.field8301;
        synchronized (this.field8301) {
            this.field8301.method2792((byte) -13, arg1);
            this.field8308++;
        }
        field8297++;
        if (this.field8307 != null) {
            class81 var4 = this.field8307;
            synchronized (this.field8307) {
                this.field8307.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Z")
    public final boolean method3372(byte arg0) {
        if (arg0 == -38) {
            field8305++;
            return this.field8308 == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)V")
    public static final void method3373(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field8300 = 67;
        }
        field8302++;
        if (class188.field2237 == null) {
            class287.method1711((byte) 92);
        }
        if (arg0) {
            class188.field2237.method4043(235);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ltm;")
    public final class389 method3374(int arg0) {
        field8304++;
        Object var2 = null;
        class454 var3 = this.field8301;
        class389 var4;
        synchronized (this.field8301) {
            var4 = this.field8301.method2790(107);
            var4.method2401((byte) -57);
            this.field8308--;
        }
        int var5 = 116 % ((arg0 - 25) / 45);
        return var4;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILrr;)V")
    public final void method3375(int arg0, class361 arg1) {
        arg1.field4640 = true;
        field8298++;
        class454 var3 = this.field8301;
        synchronized (this.field8301) {
            this.field8301.method2792((byte) -13, arg1);
            this.field8308++;
        }
        if (arg0 == 4438 && this.field8307 != null) {
            class81 var4 = this.field8307;
            synchronized (this.field8307) {
                this.field8307.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class588(String arg0) {
        this.field8306 = arg0;
    }
}
