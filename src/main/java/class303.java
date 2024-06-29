import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class303 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lpk;")
    public static class133 field4321 = new class133();

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class303(String arg0, int arg1) {
        this.field4322 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4324++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
    public final int method1894(boolean arg0) {
        if (arg0) {
            this.toString();
        }
        field4323++;
        return this.field4322;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1895(int arg0) {
        if (arg0 != -15098) {
            method1895(-69);
        }
        field4321 = null;
    }
}
