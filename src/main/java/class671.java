import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class671 {

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lhda;")
    private class747 field9409 = new class747();

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/lang/String;")
    public String field9404;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lqaa;")
    public static class27 field9401 = new class27(77, -1);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Z")
    public static boolean field9408 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field9405 = 0;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
    public static boolean field9412 = true;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    private volatile int field9413;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lno;")
    private class699 field9414;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lkba;")
    public final class105 method3787(byte arg0) {
        field9407++;
        Object var2 = null;
        class747 var3 = this.field9409;
        synchronized (this.field9409) {
            if (arg0 > -108) {
                this.method3793(true, null);
            }
            class105 var4 = this.field9409.method4159(0);
            var4.method909(74);
            this.field9413--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLtia;)V")
    public final void method3788(byte arg0, class266 arg1) {
        field9410++;
        class747 var3 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method4152(arg1, 0);
            this.field9413++;
        }
        if (arg0 == 123 && this.field9414 != null) {
            class699 var4 = this.field9414;
            synchronized (this.field9414) {
                this.field9414.notify();
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLgs;)V")
    public final void method3789(byte arg0, class43 arg1) {
        field9406++;
        arg1.field656 = true;
        class747 var3 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method4152(arg1, 0);
            this.field9413++;
        }
        if (this.field9414 != null) {
            class699 var4 = this.field9414;
            synchronized (this.field9414) {
                this.field9414.notify();
            }
        }
        int var5 = 84 / ((arg0 - 16) / 33);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lno;B)V")
    public final void method3790(class699 arg0, byte arg1) {
        this.field9414 = arg0;
        int var3 = -3 / ((arg1 - 80) / 36);
        field9411++;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method3791(byte arg0) {
        if (arg0 <= -84) {
            field9401 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
    public final boolean method3792(int arg0) {
        if (arg0 <= 108) {
            return true;
        } else {
            field9402++;
            return this.field9413 == 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLgs;)V")
    public final void method3793(boolean arg0, class43 arg1) {
        if (!arg0) {
            this.method3790(null, (byte) 34);
        }
        field9403++;
        arg1.field656 = false;
        class747 var3 = this.field9409;
        synchronized (this.field9409) {
            this.field9409.method4152(arg1, 0);
            this.field9413++;
        }
        if (this.field9414 != null) {
            class699 var4 = this.field9414;
            synchronized (this.field9414) {
                this.field9414.notify();
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class671(String arg0) {
        this.field9404 = arg0;
    }
}
