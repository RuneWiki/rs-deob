import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class439 {

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    public static boolean field6081;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lrg;")
    public static class548 field6080;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field6078;

    static {
        new class180("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field6081 = false;
        field6080 = new class548(46, 8);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V", line = 21)
    public class439(int arg0, int arg1, int arg2) {
        this.field6077 = arg0;
        this.field6079 = arg2;
        this.field6076 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 31)
    public static void method2583(int arg0) {
        int var1 = 38 % ((arg0 + 62) / 50);
        field6080 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public abstract void method498(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
    public abstract void method501(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
    public abstract void method500(byte arg0, int arg1, int arg2);
}
