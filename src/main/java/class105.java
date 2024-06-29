import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class105 extends class270 {

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Lmb;")
    public class288 field1784;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[Ldl;")
    public static class48[] field1782 = new class48[14];

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lnk;")
    public static class326 field1786;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1785;

    static {
        new class306("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field1786 = new class326(21, 8);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 3)
    public static void method723(int arg0) {
        field1782 = null;
        field1786 = null;
        if (arg0 != 2164) {
            method724(51, (byte) -87, 1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IBI)Z", line = 15)
    public static final boolean method724(int arg0, byte arg1, int arg2) {
        field1785++;
        if (arg1 <= 58) {
            return false;
        } else {
            return (arg0 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lmb;I)V", line = 47)
    public class105(class288 arg0, int arg1) {
        this.field1784 = arg0;
        this.field1783 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)Z")
    public abstract boolean method360(boolean arg0);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method361(int arg0);
}
