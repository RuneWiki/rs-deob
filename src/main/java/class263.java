import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class263 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3378 = "";

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lhq;")
    public static class365 field3379 = new class365(260);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lts;")
    public static class33 field3380;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        field3378 = null;
        if (arg0 != 96) {
            field3380 = null;
        }
        field3379 = null;
        field3380 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
    public static final void method1660(int arg0, int arg1, int arg2, int arg3) {
        class301.field4014 = arg2;
        int var4 = 55 / ((arg1 + 29) / 63);
        field3377++;
        class213.field2621 = arg0;
        class242.field3232 = arg3;
    }

    static {
        new class72("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}
