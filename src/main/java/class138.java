import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class138 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method1062(int arg0, int arg1) {
        field2243++;
        return arg0 <= arg1 && class122.field1988.length > arg1 ? class122.field1988[arg1] : false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Z", line = 23)
    public static final boolean method1063(int arg0) {
        if (arg0 <= 64) {
            method1063(83);
        }
        field2242++;
        if (class115.field1849) {
            try {
                class51.method419((byte) 110, class92.field1484.field1037, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }
}
