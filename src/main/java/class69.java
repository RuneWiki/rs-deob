import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class69 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lec;")
    public static class40 field854 = new class40("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field855 = -1;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/lang/String;")
    public String field852;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method349(int arg0) {
        if (arg0 != -1) {
            field855 = 93;
        }
        field854 = null;
    }
}
