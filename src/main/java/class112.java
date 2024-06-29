import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class112 extends class681 {

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1618 = 1;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1621 = 52;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Lrv;")
    public class112 field1622;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Lrv;")
    public class112 field1623;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
    public static final void method888(int arg0, int arg1) {
        field1620++;
        class373.field4792.method3070(arg0, 119);
        if (arg1 != 19519) {
            method888(-31, 125);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public final void method889(byte arg0) {
        field1619++;
        if (this.field1622 == null) {
            return;
        }
        this.field1622.field1623 = this.field1623;
        this.field1623.field1622 = this.field1622;
        if (arg0 <= 73) {
            method888(-14, 92);
        }
        this.field1623 = null;
        this.field1622 = null;
    }
}
