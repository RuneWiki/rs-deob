import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class252 extends class287 {

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Ltl;")
    public class59 field4195;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Ltl;")
    public static class59 field4190 = class85.method639("<col=ff7000>", 9588);

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ltl;")
    public static class59 field4193 = class85.method639("gleiten:", 9588);

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Lmb;")
    public static class171 field4192;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Loh;")
    public static class257 field4194;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V", line = 10)
    public static void method1758(boolean arg0) {
        if (!arg0) {
            field4190 = (class59) null;
        }
        field4190 = null;
        field4194 = null;
        field4192 = null;
        field4193 = null;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 42)
    public class252() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ltl;)V", line = 44)
    public class252(class59 arg0) {
        this.field4195 = arg0;
    }
}
