import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class298 extends class238 {

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public volatile int field4286 = -1;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field4284;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Ldk;")
    public static class326 field4288 = new class326("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4289 = "";

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "[Lvo;")
    public static class31[] field4291 = new class31[14];

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1838(int arg0, String[] arg1) {
        if (arg0 <= 25) {
            field4290 = -71;
        }
        field4287++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1839(int arg0) {
        if (arg0 != -7863) {
            method1840(true);
        }
        field4289 = null;
        field4291 = null;
        field4288 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
    public static final void method1840(boolean arg0) {
        class476.field6690 = 0;
        field4285++;
        class160.field2365.method2838((byte) 25);
        class19.field260 = false;
        if (!arg0) {
            field4291 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class298(String arg0) {
        this.field4284 = arg0;
    }
}
