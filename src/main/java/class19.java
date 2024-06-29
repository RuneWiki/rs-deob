import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class184 {

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Z")
    public boolean field205 = false;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "Z")
    public boolean field213 = true;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Lqe;")
    public static class469 field220 = new class469(21, 0);

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "Lle;")
    public static class308 field217;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "Lfe;")
    public class572 field216;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIB)V", line = 3)
    public static final void method107(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 95) {
            field220 = null;
        }
        class463.field6818 = arg1;
        class66.field937 = arg0;
        field206++;
        class454.field6693 = arg2;
        class347.field5005 = arg3;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 38)
    public static void method108(int arg0) {
        field220 = null;
        field217 = null;
        if (arg0 != 0) {
            method107(1, 49, 58, -68, (byte) 12);
        }
    }
}
