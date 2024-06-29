import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class65 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field935 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[Lv;")
    public static class263[] field936;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z", line = 15)
    public static final boolean method519(int arg0) {
        field934++;
        if (arg0 < 89) {
            return true;
        } else if (class202.field3228 == 0) {
            return class92.field1228.method1160((byte) 46);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I", line = 29)
    public static final int method520(byte arg0) {
        if (arg0 <= 118) {
            field935 = 89;
        }
        field937++;
        return 15;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 44)
    public static void method521(int arg0) {
        field936 = null;
        if (arg0 != -16) {
            field935 = 46;
        }
    }
}
