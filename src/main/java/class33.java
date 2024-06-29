import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class33 extends class80 {

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Z")
    public static boolean field492 = true;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lnj;")
    public static class230 field498 = new class230(64);

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lsg;")
    public static class247 field497;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Laf;")
    public static class39 field501;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method190(byte arg0) {
        field497 = null;
        field498 = null;
        field501 = null;
        int var1 = -79 % (-arg0 / 46);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(II)V")
    public class33(int arg0, int arg1) {
        this.field499 = arg1;
        this.field493 = arg0;
    }
}
