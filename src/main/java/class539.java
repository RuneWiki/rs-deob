import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class539 extends class496 {

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field7977;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public int field7975;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Lnj;")
    public static class487 field7978 = new class487("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3164(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class587.field8718[var1] = true;
        }
        if (arg0 >= -87) {
            method3164(-70);
        }
        field7976++;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(II)V", line = 25)
    public class539(int arg0, int arg1) {
        this.field7977 = arg0;
        this.field7975 = arg1;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 38)
    public static void method3165(byte arg0) {
        field7978 = null;
        if (arg0 != 61) {
            field7978 = null;
        }
    }
}
