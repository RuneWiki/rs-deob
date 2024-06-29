import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class359 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ltm;")
    private class412 field5250;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljw;")
    public static class581 field5247 = new class581(113, 0);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ltm;")
    public static class412 field5249 = new class412();

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ldba;")
    private class101 field5246;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Ldba;", line = 6)
    public final class101 method2253(int arg0) {
        field5248++;
        class101 var2 = this.field5250.field5921.field1412;
        if (this.field5250.field5921 == var2) {
            this.field5246 = null;
            return null;
        } else {
            this.field5246 = var2.field1412;
            return arg0 == 3530 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 32)
    public static void method2254(int arg0) {
        field5247 = null;
        field5249 = null;
        if (arg0 != 0) {
            field5247 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Ldba;", line = 52)
    public final class101 method2255(byte arg0) {
        field5243++;
        class101 var2 = this.field5246;
        if (this.field5250.field5921 == var2) {
            this.field5246 = null;
            return null;
        }
        if (arg0 != 17) {
            field5247 = null;
        }
        this.field5246 = var2.field1412;
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ltm;I)V", line = 73)
    public final void method2256(class412 arg0, int arg1) {
        this.field5250 = arg0;
        if (arg1 != 113) {
            field5247 = null;
        }
        field5244++;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 87)
    public class359() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ltm;)V", line = 89)
    public class359(class412 arg0) {
        this.field5250 = arg0;
    }
}
