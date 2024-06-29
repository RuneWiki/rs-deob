import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class22 extends class117 {

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lig;")
    public class281 field371;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Lbd;")
    public static class464 field370 = new class464(8, 7);

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "[Laa;")
    public static class13[] field374 = new class13[14];

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "[S")
    public static short[] field376 = new short[256];

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "Ltm;")
    public static class112 field375 = new class112("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "[I")
    public static int[] field372;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)Z")
    public abstract boolean method183(boolean arg0);

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public static void method184(byte arg0) {
        field372 = null;
        if (arg0 == 76) {
            field375 = null;
            field374 = null;
            field376 = null;
            field370 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method185(int arg0);

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lig;I)V")
    public class22(class281 arg0, int arg1) {
        this.field371 = arg0;
        this.field373 = arg1;
    }
}
