import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class683 extends class41 {

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field9348 = -1;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lhj;")
    public static class596 field9347 = new class596(117, 6);

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Lkq;")
    public static class620 field9354 = null;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lfj;")
    public static class684 field9352 = new class684(11, -1);

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "B")
    private byte field9345;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "B")
    private byte field9346;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "B")
    private byte field9349;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "B")
    private byte field9351;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
    private boolean field9350;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILes;)V", line = 9)
    public final void method329(int arg0, class403 arg1) {
        field9343++;
        this.field9350 = arg1.method2396((byte) 29) == 1;
        this.field9346 = arg1.method2392(-49);
        this.field9345 = arg1.method2392(122);
        this.field9351 = arg1.method2392(arg0 ^ 0xFFFFF01B);
        if (arg0 != -3999) {
            this.field9350 = false;
        }
        this.field9349 = arg1.method2392(119);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Loga;I)V", line = 27)
    public final void method331(class500 arg0, int arg1) {
        arg0.field6988 = this.field9345;
        arg0.field7010 = this.field9349;
        arg0.field6982 = this.field9350;
        if (arg1 != 55) {
            method3836((byte) 70);
        }
        arg0.field7019 = this.field9351;
        arg0.field6996 = this.field9346;
        field9344++;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 45)
    public static void method3836(byte arg0) {
        field9352 = null;
        field9354 = null;
        if (arg0 == 13) {
            field9347 = null;
        }
    }
}
