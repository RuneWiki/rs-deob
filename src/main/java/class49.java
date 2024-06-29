import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class49 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lwt;")
    public static class194 field752 = new class194("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field754 = new String[100];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lhe;")
    public static class239 field755;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Z")
    public static boolean field753;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILog;)V", line = 8)
    public static final void method373(int arg0, class441 arg1) {
        class311.field4527[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 11)
    public static final void method374(byte arg0) {
        for (class173 var1 = (class173) class173.field2360.method2096(-21400); var1 != null; var1 = (class173) class173.field2360.method2084((byte) 19)) {
            if (var1.field2377) {
                var1.method1090(-1);
            }
        }
        if (arg0 > -110) {
            field753 = true;
        }
        field751++;
        for (class173 var2 = (class173) class443.field6469.method2096(-21400); var2 != null; var2 = (class173) class443.field6469.method2084((byte) 19)) {
            if (var2.field2377) {
                var2.method1090(-1);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 44)
    public static void method375(boolean arg0) {
        field755 = null;
        field754 = null;
        field752 = null;
        if (!arg0) {
            method375(true);
        }
    }
}
