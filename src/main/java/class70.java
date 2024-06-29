import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)[Ljea;", line = 7)
    public static final class474[] method580(byte arg0) {
        if (arg0 == 54) {
            field959++;
            return new class474[] { class351.field5111, class425.field6127, class455.field6513, class706.field9657, class564.field7723, class524.field7271, class557.field7657, class620.field8397, class751.field10146, class213.field2798, class572.field7791, class116.field1561, class302.field4243, class389.field5636, class523.field7267 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 22)
    public static final void method581(int arg0) {
        field956++;
        class778 var1 = class389.method2406(-122, 0L, 15);
        var1.method4276(0);
        if (arg0 > -127) {
            field957 = -111;
        }
    }
}
