import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class87 extends class217 {

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[B")
    public byte[] field1591;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Llc;")
    private static class143 field1589 = class66.method374("Checking for updates )2 ", -1);

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1588 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1590 = 0;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Llc;")
    public static class143 field1592 = field1589;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1592 = null;
        field1589 = null;
        if (arg0 != 16) {
            field1592 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class87(byte[] arg0) {
        this.field1591 = arg0;
    }
}
