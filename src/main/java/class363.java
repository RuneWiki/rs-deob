import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class363 extends class147 {

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field5221;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lec;")
    public static class40 field5222 = new class40("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Lec;")
    public static class40 field5223 = new class40("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class363() {
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
    public class363(int arg0) {
        this.field5221 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)V")
    public static void method2206(boolean arg0) {
        field5222 = null;
        if (arg0) {
            method2206(false);
        }
        field5223 = null;
    }
}
