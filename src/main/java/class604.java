import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class604 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field8705;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field8701;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Ljk;")
    public static class585 field8710 = new class585(26, 4);

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8713 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field8702;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field8703;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public int field8704;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ldi;")
    public static class110 field8711;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lfc;")
    public static class236 field8712;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lq;")
    public class394 field8709;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lfk;")
    public class604 field8706;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3479(int arg0) {
        if (arg0 == 16538) {
            field8711 = null;
            field8712 = null;
            field8710 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lfk;")
    public final class604 method3480(boolean arg0, int arg1) {
        if (arg0) {
            method3479(63);
        }
        field8707++;
        return new class604(this.field8701, arg1);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lmp;")
    public final class705 method3481(int arg0) {
        if (arg0 != 4) {
            this.method3481(39);
        }
        field8708++;
        return class323.method1875(this.field8701, (byte) -104);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V")
    public class604(int arg0, int arg1) {
        this.field8705 = arg1;
        this.field8701 = arg0;
    }
}
