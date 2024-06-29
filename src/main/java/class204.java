import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class204 {

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient;")
    public static client field2997;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wo", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2998;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1408(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1405(int arg0) {
        int var1 = 105 / ((28 - arg0) / 46);
        class162.field2347.method2109(-1);
        field2994++;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 27)
    public static void method1406(int arg0) {
        if (arg0 != 1) {
            field2997 = null;
        }
        field2997 = null;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 37)
    public static final void method1407(int arg0) {
        field2995++;
        if (class65.field961 == 2) {
            class364.field5008 = 96;
        } else {
            try {
                Method var1 = (field2998 == null ? (field2998 = method1408("java.lang.Runtime")) : field2998).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class364.field5008 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != 1048576) {
            field2997 = null;
        }
    }
}
