import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class358 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lig;")
    public static class206 field5086 = new class206(78, 2);

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lea;")
    public static class474 field5087 = new class474("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 3)
    public static void method2243(byte arg0) {
        int var1 = -12 / ((arg0 - 32) / 45);
        field5087 = null;
        field5086 = null;
    }
}
