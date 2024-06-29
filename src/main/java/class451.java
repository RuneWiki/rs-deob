import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class451 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lvp;")
    public static class123 field6585 = new class123(56, 3);

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field6588 = 0;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6586 = new String[100];

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lgf;")
    public static class180 field6589 = new class180(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method2713(byte arg0) {
        field6587++;
        if (class342.field5222) {
            return;
        }
        if (class397.field5830.field150) {
            class382.field5684 = ((int) class382.field5684 + 47 & 0xFFFFFFF0);
        } else {
            class434.field6315 += (12.0F - class434.field6315) / 2.0F;
        }
        if (arg0 < 82) {
            field6585 = null;
        }
        class342.field5222 = true;
        class163.field2465 = true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method2714(int arg0) {
        int var1 = -53 / ((-arg0 - 16) / 54);
        field6586 = null;
        field6585 = null;
        field6589 = null;
    }

    @OriginalMember(owner = "client!ck", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6591++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(II)V")
    public class451(int arg0, int arg1) {
        this.field6584 = arg0;
    }

    static {
        new class180(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
