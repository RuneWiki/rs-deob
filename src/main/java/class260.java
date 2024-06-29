import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class260 extends class125 {

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field4542 = 0;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Loa;")
    public static class99 field4554 = class221.method1463(2844, ")0");

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Loa;")
    public static class99 field4555 = class221.method1463(2844, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Z")
    public static boolean field4537 = false;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Ltf;")
    public class107 field4544;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "Ltf;")
    public class107 field4553;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Ltg;")
    public static class182 field4535;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Ltg;")
    public static class182 field4536;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Ltg;")
    public static class182 field4547;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Loa;")
    public class99 field4539;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
    public boolean field4550;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "[Ljava/lang/Object;")
    public Object[] field4543;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1689(String arg0, boolean arg1) {
        field4548++;
        if (!arg1) {
            for (int var2 = arg0.indexOf("%0a"); var2 != -1; var2 = arg0.indexOf("%0a", var2)) {
                arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
            }
            System.out.println("Error: " + arg0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1690(int arg0) {
        field4554 = null;
        if (arg0 < 31) {
            field4540 = -123;
        }
        field4547 = null;
        field4535 = null;
        field4555 = null;
        field4536 = null;
    }
}
