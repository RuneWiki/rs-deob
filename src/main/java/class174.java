import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class174 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Liq;")
    public static class362 field2389 = new class362("M", "M", "M", "M");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Liq;")
    public static class362 field2390 = new class362("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Liq;")
    public static class362 field2392;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lsj;")
    public static class266 field2391;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lwq;")
    public static class92 field2393;

    static {
        new class362("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field2392 = new class362("wave2:", "welle2:", "ondulation2:", "onda2:");
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method1191(int arg0, byte arg1) {
        field2387++;
        if (arg0 == 58 || arg0 == 11 || arg0 == 57 || arg0 == 6 || arg0 == 22) {
            return true;
        } else if (arg0 == 46 || arg0 == 1001) {
            return true;
        } else {
            if (arg1 != -110) {
                method1194((class186) null, -101);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 24)
    public static void method1192(int arg0) {
        field2391 = null;
        if (arg0 != 0) {
            field2391 = null;
        }
        field2393 = null;
        field2392 = null;
        field2390 = null;
        field2389 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Loe;", line = 43)
    public static final class109 method1193(int arg0) {
        field2386++;
        try {
            if (arg0 != -417) {
                method1191(-64, (byte) -74);
            }
            return (class109) Class.forName("jr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljg;I)V", line = 62)
    public static final void method1194(class186 arg0, int arg1) {
        field2388++;
        arg0.field2703 = null;
        int var2 = arg0.field2704.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2704[var3].field1705 = false;
        }
        class393[] var4 = class262.field3740;
        synchronized (class262.field3740) {
            if (var2 < class262.field3740.length && class452.field6476[var2] < 200) {
                class262.field3740[var2].method2511(-117, arg0);
                int var10002 = class452.field6476[var2]++;
            }
        }
        if (arg1 != -17173) {
            method1192(-28);
        }
    }
}
