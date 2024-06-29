import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class513 extends class282 {

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field7618 = (int) (class246.method1705((byte) 28) / 1000L);

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Ljava/lang/String;")
    public String field7611;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "S")
    public short field7617;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field7615 = 0;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lnj;")
    public static class317 field7612 = new class317();

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lbi;")
    public static class104 field7619 = new class104(110, 3);

    @OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
    public static int[] field7620 = new int[8];

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "[[[Lce;")
    public static class409[][][] field7614;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    public static void method3093(int arg0) {
        field7619 = null;
        field7614 = null;
        if (arg0 != 8) {
            field7612 = null;
        }
        field7620 = null;
        field7612 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
    public static final void method3094(byte arg0, int arg1) {
        class201.field3060 = arg1;
        field7616++;
        class6.field71 = -1;
        class484.field7357 = -1;
        if (arg0 != 36) {
            method3093(111);
        }
        class100.method676(91);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class513(String arg0, int arg1) {
        this.field7611 = arg0;
        this.field7617 = (short) arg1;
    }
}
