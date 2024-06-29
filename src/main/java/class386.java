import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class386 extends class117 {

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "[B")
    public byte[] field5443;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "[I")
    public static int[] field5441;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Ltm;")
    public static class112 field5442;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "[[[I")
    public static int[][][] field5444;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Lad;")
    public static class209 field5445;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([B)V")
    public class386(byte[] arg0) {
        this.field5443 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static void method2302(int arg0) {
        field5445 = null;
        field5442 = null;
        field5444 = null;
        field5441 = null;
        if (arg0 <= 37) {
            field5445 = null;
        }
    }

    static {
        new class112("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field5441 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
        field5442 = new class112("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
        field5444 = new int[2][][];
    }
}
