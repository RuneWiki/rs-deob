import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class46 extends class242 {

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[B")
    public byte[] field853;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static volatile int field851 = 0;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Ljf;")
    public static class229 field854 = null;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Lek;")
    public static class185 field852;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)V", line = 26)
    public static void method403(byte arg0) {
        field852 = null;
        field854 = null;
        if (arg0 != -99) {
            method403((byte) -41);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V", line = 44)
    public class46(byte[] arg0) {
        this.field853 = arg0;
    }
}
