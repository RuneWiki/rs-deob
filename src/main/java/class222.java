import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class222 extends class248 {

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Ljr;")
    public static class112 field3183 = new class112(4);

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[Ljj;")
    public static class120[] field3181;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lcea;Z)Lnfa;", line = 14)
    public static final class679 method1575(class215 arg0, boolean arg1) {
        field3184++;
        int var2 = arg0.method1478(842397944);
        if (!arg1) {
            method1576(-27);
        }
        return new class679(var2);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 28)
    public static void method1576(int arg0) {
        field3181 = null;
        field3183 = null;
        if (arg0 != -1) {
            method1576(58);
        }
    }
}
