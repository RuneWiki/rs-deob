import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class497 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lqfa;")
    public static class98 field7142 = new class98(8, 6);

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Llda;")
    public static class485 field7145 = new class485();

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
    public byte[] field7147;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "[S")
    public short[] field7143;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[S")
    public short[] field7144;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[S")
    public short[] field7146;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 11)
    public static void method2964(int arg0) {
        field7145 = null;
        if (arg0 != 8) {
            method2964(103);
        }
        field7142 = null;
    }
}
