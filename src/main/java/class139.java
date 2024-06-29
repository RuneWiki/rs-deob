import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class139 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lhh;")
    public class500 field1851;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "B")
    public byte field1850;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "S")
    public short field1852;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "B")
    public byte field1854;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lpi;")
    public static class340 field1853 = new class340(58, 6);

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Lhb;")
    public static class250 field1857 = new class250(75, 8);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 5)
    public static void method967(int arg0) {
        field1857 = null;
        field1853 = null;
        if (arg0 < 80) {
            field1857 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lgk;Lhh;III)V", line = 27)
    public class139(class463 arg0, class500 arg1, int arg2, int arg3, int arg4) {
        this.field1851 = arg1;
        this.field1850 = (byte) arg3;
        this.field1852 = (short) arg2;
        this.field1854 = (byte) arg4;
    }
}
