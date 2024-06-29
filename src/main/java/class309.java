import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class309 extends class80 {

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Lke;")
    public class423 field4232;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "[Ltf;")
    public static class192[] field4234 = new class192[2048];

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "Lsg;")
    public static class272 field4235 = new class272();

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "Lbb;")
    public static class217 field4237;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "[Lal;")
    public static class65[] field4236;

    static {
        new class83("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field4238 = 0;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lke;)V", line = 9)
    public class309(class423 arg0) {
        this.field4232 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V", line = 23)
    public static void method1754(byte arg0) {
        field4234 = null;
        field4237 = null;
        field4235 = null;
        if (arg0 != 119) {
            method1754((byte) 12);
        }
        field4236 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 37)
    public static final void method1755(int arg0) {
        class492.method2919((byte) -86);
        field4233++;
        class503.method2959(false);
        if (arg0 != -13359) {
            method1754((byte) -123);
        }
    }
}
