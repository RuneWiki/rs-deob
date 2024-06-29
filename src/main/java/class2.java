import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "B")
    public byte field3;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lqo;")
    public class21 field2;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "S")
    public short field4;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "B")
    public byte field6;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lrg;")
    public static class548 field5 = new class548(54, -1);

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lraa;")
    public static class520 field7 = new class520();

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Z")
    public static boolean field8 = false;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method8(int arg0) {
        if (arg0 != 54) {
            field5 = null;
        }
        field7 = null;
        field5 = null;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lqo;III)V")
    public class2(class21 arg0, int arg1, int arg2, int arg3) {
        this.field3 = (byte) arg3;
        this.field2 = arg0;
        this.field4 = (short) arg1;
        this.field6 = (byte) arg2;
    }
}
