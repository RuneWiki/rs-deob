import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class100 {

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "Ljava/lang/String;")
    public String field1618;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "J")
    public long field1619;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "Ljava/lang/String;")
    public String field1623;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "Lvl;")
    public static class15 field1621 = new class15(10, -1);

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "Llv;")
    public static class470 field1622;

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class100(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field1618 = arg1;
        this.field1624 = arg2;
        this.field1619 = arg4;
        this.field1623 = arg3;
        this.field1620 = arg0;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)V")
    public static void method873(boolean arg0) {
        field1622 = null;
        if (!arg0) {
            field1621 = null;
        }
    }
}
