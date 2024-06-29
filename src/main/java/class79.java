import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class79 extends class89 {

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lqm;")
    public class97 field1023;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
    public static int[] field1022 = new int[256];

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lga;")
    public static class278 field1024;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
    public static int[] field1025;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 13)
    public static void method671(int arg0) {
        field1024 = null;
        if (arg0 != 256) {
            method671(-25);
        }
        field1022 = null;
        field1025 = null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lqm;)V", line = 26)
    public class79(class97 arg0) {
        this.field1023 = arg0;
    }
}
