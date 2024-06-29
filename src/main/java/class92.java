import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class92 implements class573 {

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lcea;")
    public static class180 field1128 = new class180("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lfc;")
    public static class216 field1129;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Ldn;")
    public static class438 field1132;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 4)
    public static void method557(byte arg0) {
        field1132 = null;
        field1129 = null;
        field1128 = null;
        if (arg0 != -112) {
            field1132 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field1133++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 30)
    public static final void method558(String arg0, boolean arg1) {
        field1134++;
        if (arg1) {
            field1129 = null;
        }
        if (!arg0.equals("")) {
            class418.method2378(17984, class19.field130);
            class84.field1033++;
            class136.field1663.method2093(class88.method528((byte) -115, arg0), -116);
            class136.field1663.method2106(-97, arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 56)
    public class92(String arg0, int arg1) {
        this.field1131 = arg1;
    }
}
