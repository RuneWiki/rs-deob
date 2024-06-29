import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class239 {

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "Z")
    public boolean field3447;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "J")
    public static long field3445 = 0L;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3440 = 0;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Lvh;")
    public static class328 field3442 = new class328(10);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "Liq;")
    public class555 field3439;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "Liq;")
    public class555 field3446;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Z")
    public boolean field3444;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLjava/lang/String;)V", line = 4)
    public static final void method1503(byte arg0, String arg1) {
        field3443++;
        int var2 = 1 / ((arg0 - 65) / 54);
        System.out.println("Error: " + class602.method3337("%0a", "\n", arg1, 90));
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method1504(int arg0) {
        field3441++;
        if (arg0 == 0) {
            return this.field3444 && !this.field3447;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Z)V", line = 39)
    public class239(boolean arg0) {
        this.field3447 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V", line = 47)
    public final void method1505(boolean arg0) {
        if (this.field3439 != null) {
            this.field3439.method776(!arg0);
        }
        if (!arg0) {
            this.method1505(true);
        }
        field3438++;
        this.field3444 = false;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(Z)V", line = 62)
    public static void method1506(boolean arg0) {
        field3442 = null;
        if (!arg0) {
            method1506(false);
        }
    }
}
