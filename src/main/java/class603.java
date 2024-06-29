import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class603 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "S")
    public short field8706;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lqd;")
    public class381 field8705;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "B")
    public byte field8704;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "B")
    public byte field8702;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Ldv;")
    public static class566 field8708;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lan;")
    public static class21 field8707;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILnj;)I")
    public static final int method3555(int arg0, class204 arg1) {
        field8703++;
        if (arg0 >= -54) {
            field8707 = null;
        }
        int var2 = arg1.method1237(592256579, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1237(592256579, 5);
        } else if (var2 == 2) {
            var3 = arg1.method1237(592256579, 8);
        } else {
            var3 = arg1.method1237(592256579, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3556(byte arg0) {
        field8707 = null;
        field8708 = null;
        if (arg0 != 31) {
            field8707 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lqd;III)V")
    public class603(class381 arg0, int arg1, int arg2, int arg3) {
        this.field8706 = (short) arg1;
        this.field8705 = arg0;
        this.field8704 = (byte) arg2;
        this.field8702 = (byte) arg3;
    }

    static {
        new class104("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field8708 = new class566(25, 8);
    }
}
