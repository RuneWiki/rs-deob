import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class675 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Lhs;")
    public static class325 field9561 = new class325(6, 1);

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Lhs;")
    public static class325 field9563 = new class325(9, 2);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lhu;")
    public static class131 field9564;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "[Lhu;")
    public static class131[] field9562;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "[Lwi;")
    public static class464[] field9565;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method3841(byte arg0) {
        field9560++;
        int var1 = 64 / ((7 - arg0) / 48);
        return class79.method555(33, "jaclib") ? class79.method555(33, "hw3d") : false;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 21)
    public static void method3842(int arg0) {
        field9565 = null;
        field9563 = null;
        field9562 = null;
        if (arg0 != 1) {
            method3841((byte) -63);
        }
        field9564 = null;
        field9561 = null;
    }
}
