import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class318 {

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field4624 = 1;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lefa;")
    public static class322 field4623 = new class322(8);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4626 = 1;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4625++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static void method1971(boolean arg0) {
        field4623 = null;
        if (arg0) {
            field4626 = -64;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class318(String arg0, int arg1) {
        this.field4627 = arg1;
    }
}
