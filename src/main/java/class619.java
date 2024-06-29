import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class619 {

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "Lan;")
    private class23 field8531 = new class23();

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "Ljava/lang/String;")
    public String field8535;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "F")
    public static float field8536;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    public static int field8538;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    private volatile int field8542;

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "Lwga;")
    private class750 field8541;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "[[[Z")
    public static boolean[][][] field8537;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)Lnfa;", line = 3)
    public final class681 method3453(boolean arg0) {
        field8534++;
        Object var2 = null;
        class23 var3 = this.field8531;
        class681 var4;
        synchronized (this.field8531) {
            var4 = this.field8531.method162(-22305);
            var4.method3835(0);
            this.field8542--;
        }
        return arg0 ? var4 : null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILrba;)V", line = 25)
    public final void method3454(int arg0, class435 arg1) {
        arg1.field5799 = true;
        field8538++;
        int var3 = -76 / ((76 - arg0) / 37);
        class23 var4 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method166(-8839, arg1);
            this.field8542++;
        }
        if (this.field8541 != null) {
            class750 var5 = this.field8541;
            synchronized (this.field8541) {
                this.field8541.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)Z", line = 50)
    public final boolean method3455(byte arg0) {
        field8532++;
        if (arg0 > -48) {
            method3457(true);
        }
        return this.field8542 == 0;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLwga;)V", line = 62)
    public final void method3456(byte arg0, class750 arg1) {
        this.field8541 = arg1;
        int var3 = -24 / ((arg0 + 52) / 55);
        field8540++;
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(Z)V", line = 72)
    public static void method3457(boolean arg0) {
        if (arg0) {
            field8537 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(ILrba;)V", line = 84)
    public final void method3458(int arg0, class435 arg1) {
        arg1.field5799 = false;
        field8539++;
        class23 var3 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method166(-8839, arg1);
            if (arg0 != -1) {
                return;
            }
            this.field8542++;
        }
        if (this.field8541 != null) {
            class750 var4 = this.field8541;
            synchronized (this.field8541) {
                this.field8541.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lir;Z)V", line = 109)
    public final void method3459(class26 arg0, boolean arg1) {
        class23 var3 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method166(-8839, arg0);
            if (!arg1) {
                this.field8535 = null;
            }
            this.field8542++;
        }
        field8533++;
        if (this.field8541 != null) {
            class750 var4 = this.field8541;
            synchronized (this.field8541) {
                this.field8541.notify();
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 136)
    public class619(String arg0) {
        this.field8535 = arg0;
    }
}
