import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class308 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4526 = new String[100];

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lec;")
    public static class40 field4525 = new class40("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lhn;")
    public static class278 field4529;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 11)
    public static void method1916(byte arg0) {
        field4529 = null;
        field4526 = null;
        if (arg0 >= 13) {
            field4525 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Loj;Z)V", line = 23)
    public static final void method1917(class280 arg0, boolean arg1) {
        if (!arg1) {
            field4526 = null;
        }
        field4528++;
        if (class242.field3316.method804(0) == 0) {
            return;
        }
        if (class375.field5347 == 0) {
            for (class232 var2 = (class232) class242.field3316.method802((byte) 106); var2 != null; var2 = (class232) class242.field3316.method806((byte) 104)) {
                class422.field6096.method114(false, var2.field3217 ? class19.field258.field2722 : null, false, var2.field3212, arg0, arg0, var2.field3214, var2.field3218, class304.field4500, var2.field3216, var2.field3213, 84);
                var2.method702((byte) -114);
            }
            class415.method2469((byte) 121);
            return;
        }
        if (class94.field1179 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class94.field1179 = class280.method1757(0, 0, class42.field512, class314.field4583, 0, var3);
            class346.field4945 = class94.field1179.method1484(class144.method681(0, (byte) -110, class421.field6070, class39.field470), class473.method2794(class171.field2022, class421.field6070, 0), true);
        }
        for (class232 var4 = (class232) class242.field3316.method802((byte) 113); var4 != null; var4 = (class232) class242.field3316.method806((byte) 104)) {
            class422.field6096.method114(false, var4.field3217 ? class19.field258.field2722 : null, false, var4.field3212, arg0, class94.field1179, var4.field3214, var4.field3218, class346.field4945, var4.field3216, var4.field3213, 82);
            var4.method702((byte) -114);
        }
    }
}
