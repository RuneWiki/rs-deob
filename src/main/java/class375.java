import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class375 {

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "S")
    public short field4587;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "B")
    public byte field4585;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "B")
    public byte field4586;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "Lnk;")
    public class447 field4583;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Luw;")
    public static class208 field4584 = new class208(40, 1);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 5)
    public static void method2150(byte arg0) {
        field4584 = null;
        if (arg0 != 92) {
            method2150((byte) -68);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lnk;III)V", line = 25)
    public class375(class447 arg0, int arg1, int arg2, int arg3) {
        this.field4587 = (short) arg1;
        this.field4585 = (byte) arg3;
        this.field4586 = (byte) arg2;
        this.field4583 = arg0;
    }
}
