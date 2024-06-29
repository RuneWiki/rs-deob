import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class232 extends class98 {

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Lbba;")
    public class99 field3691;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lhga;")
    public static class158 field3689 = new class158(29, 11);

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[I")
    public static int[] field3692 = new int[2];

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lbba;)V", line = 10)
    public class232(class99 arg0) {
        this.field3691 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V", line = 21)
    public static void method1691(byte arg0) {
        field3692 = null;
        field3689 = null;
        int var1 = -74 % ((arg0 - 58) / 38);
    }
}
