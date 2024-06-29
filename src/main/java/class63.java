import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class63 extends RuntimeException {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1054;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljava/lang/String;")
    public String field1055;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lai;")
    public static class10 field1053 = class44.method278("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -62);

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lai;")
    public static class10 field1058 = class44.method278("mapscene", 121);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class63(Throwable arg0, String arg1) {
        this.field1054 = arg0;
        this.field1055 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method418(boolean arg0) {
        field1053 = null;
        field1058 = null;
        if (!arg0) {
            field1057 = 63;
        }
    }
}
