import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class379 {

    @OriginalMember(owner = "client!f", name = "d", descriptor = "B")
    private byte field5634;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public int field5631;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field5637;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "J")
    public static long field5640;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field5641;

    static {
        new class332("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field5640 = 0L;
        field5642 = 104;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I", line = 12)
    public final int method2321(byte arg0) {
        field5638++;
        if (arg0 <= 7) {
            return -88;
        } else if ((this.field5634 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I", line = 25)
    public final int method2322(byte arg0) {
        if (arg0 < 64) {
            field5640 = -45L;
        }
        field5635++;
        return this.field5634 & 0x7;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 48)
    public class379() {
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lre;)V", line = 50)
    public class379(class446 arg0) {
        this.field5634 = arg0.method2642(true);
        this.field5632 = arg0.method2631(2530);
        this.field5636 = arg0.method2604(-118);
        this.field5633 = arg0.method2604(36);
        this.field5631 = arg0.method2604(47);
        this.field5637 = arg0.method2604(46);
    }
}
