import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class11 extends class656 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lhda;")
    public static class752 field177 = new class752(71, 17);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lhda;")
    public static class752 field180 = new class752(18, 11);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lwu;")
    public static class376 field175;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method102(int arg0) {
        field177 = null;
        field175 = null;
        if (arg0 != 11) {
            field180 = null;
        }
        field180 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        this.field179 = arg0;
        this.field176 = arg1;
    }
}
