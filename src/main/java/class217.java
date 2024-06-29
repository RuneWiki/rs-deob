import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class217 {

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Lgk;")
    private class616 field2615;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "[I")
    public static int[] field2616 = new int[25];

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "Lgga;")
    private class333 field2614;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILgk;)V")
    public final void method1266(int arg0, class616 arg1) {
        if (arg0 != 65) {
            method1267(false);
        }
        this.field2615 = arg1;
        field2613++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V")
    public static final void method1267(boolean arg0) {
        field2612++;
        if (class188.field2163) {
            return;
        }
        class119.field1336 = true;
        if (class639.field9075.field6762) {
            class508.field7300 = ((int) class508.field7300 - 65 & 0xFFFFFF80);
        } else {
            class9.field94 += (-class9.field94 - 24.0F) / 2.0F;
        }
        class188.field2163 = arg0;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
    public class217() {
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Lgga;")
    public final class333 method1268(int arg0) {
        field2617++;
        if (arg0 != -15212) {
            this.field2614 = null;
        }
        class333 var2 = this.field2614;
        if (this.field2615.field8677 == var2) {
            this.field2614 = null;
            return null;
        } else {
            this.field2614 = var2.field4181;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        field2616 = null;
        if (arg0) {
            field2619 = 87;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(Z)Lgga;")
    public final class333 method1270(boolean arg0) {
        field2618++;
        class333 var2 = this.field2615.field8677.field4181;
        if (this.field2615.field8677 == var2) {
            this.field2614 = null;
            return null;
        }
        this.field2614 = var2.field4181;
        if (!arg0) {
            this.field2614 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lgk;)V")
    public class217(class616 arg0) {
        this.field2615 = arg0;
    }
}
