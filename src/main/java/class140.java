import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class140 extends class553 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Lcba;")
    public static class471 field2180 = new class471(68, 0);

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Ldv;")
    public static class566 field2181 = new class566(32, -1);

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Lej;")
    public static class104 field2182 = new class104("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)I")
    public static final int method931(byte arg0) {
        field2179++;
        if (class483.field6820) {
            return 6;
        } else if (class401.field5717 == null) {
            return 0;
        } else {
            int var1 = class401.field5717.field6298;
            if (arg0 > -21) {
                method931((byte) -12);
            }
            if (class526.method3030(var1, 1)) {
                return 1;
            } else if (class311.method1946(var1, 89)) {
                return 2;
            } else if (class532.method3060(var1, 59)) {
                return 3;
            } else if (class35.method366(var1, (byte) 2)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method932(int arg0) {
        field2182 = null;
        if (arg0 != 68) {
            method932(-78);
        }
        field2181 = null;
        field2180 = null;
    }
}
