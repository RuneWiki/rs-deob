import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class50 extends class24 {

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Lri;")
    public static class273 field609 = new class273();

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Luf;")
    public static class168 field610 = null;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field612 = 0;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Luf;")
    public static class168 field614 = class148.method1019(-1720, "gelb:");

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "[I")
    public static int[] field615 = new int[5];

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "[I")
    public static int[] field613 = new int[2];

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
    public int[] field603;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
    public int[] field608;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[Lhj;")
    public class112[] field601;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[Lhj;")
    public class112[] field602;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[Lwa;")
    public static class284[] field611;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[[[B")
    public byte[][][] field600;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lth;", line = 25)
    public static final class121 method281(int arg0) {
        field605++;
        try {
            if (arg0 != 5) {
                field614 = (class168) null;
            }
            return (class121) Class.forName("ic").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 50)
    public static void method282(byte arg0) {
        field613 = null;
        field611 = null;
        if (arg0 == 120) {
            field610 = null;
            field614 = null;
            field615 = null;
            field609 = null;
        }
    }
}
