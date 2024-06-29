import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class106 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field1483 = -1;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "S")
    public static short field1485 = 205;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lfa;")
    public static class371 field1484 = new class371(8);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Z")
    public static boolean field1486 = true;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1487;

    static {
        new class332("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 13)
    public static void method786(int arg0) {
        int var1 = -37 / ((arg0 - 3) / 40);
        field1484 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLin;)Lin;")
    public abstract class156 method785(byte arg0, class156 arg1);
}
