import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class489 {

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "[J")
    public static long[] field7144 = new long[32];

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field7141 = 0;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lgf;")
    public static class180 field7143 = new class180("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lsv;")
    public static final class467 method2928(int arg0, int arg1) {
        field7140++;
        class467[] var2 = class364.method2334((byte) 95);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            if (var2[var3].field6865 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7142++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method2929(int arg0) {
        field7145++;
        String var1 = "www";
        if (class246.field3571 == class108.field1683) {
            var1 = "www-wtrc";
        } else if (class398.field5840 == class108.field1683) {
            var1 = "www-wtqa";
        } else if (class472.field6945 == class108.field1683) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (arg0 == 0) {
            if (class475.field6992 != null) {
                var2 = "/p=" + class475.field6992;
            }
            return "http://" + var1 + "." + class321.field4649.field3925 + ".com/l=" + class370.field5530 + "/a=" + class389.field5759 + var2 + "/";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(II)V")
    public class489(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method2930(byte arg0) {
        if (arg0 != -74) {
            field7144 = null;
        }
        field7143 = null;
        field7144 = null;
    }
}
