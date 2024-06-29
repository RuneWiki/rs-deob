import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class68 extends class238 {

    @OriginalMember(owner = "client!co", name = "m", descriptor = "S")
    public short field859;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Z")
    public static boolean field860;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class68() {
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(S)V")
    public class68(short arg0) {
        this.field859 = arg0;
    }

    static {
        new class326(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        new class326(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field860 = false;
        field861 = -1;
    }
}
