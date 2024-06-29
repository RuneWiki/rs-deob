import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class329 extends RuntimeException {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/lang/String;")
    public String field4927;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4928;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lo;")
    public static class332 field4926 = new class332("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4929 = 1339;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2016(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class329(Throwable arg0, String arg1) {
        this.field4927 = arg1;
        this.field4928 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method2017(int arg0) {
        if (arg0 != 1339) {
            method2017(-60);
        }
        field4926 = null;
    }
}
