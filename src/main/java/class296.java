import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class296 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5075 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V", line = 15)
    public static final void method2053(byte arg0, int arg1) {
        field5074++;
        class156 var2 = class206.method1525(7, -32701, arg1);
        int var3 = -79 % ((arg0 + 4) / 35);
        var2.method1184((byte) 87);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V", line = 30)
    public static final void method2054(int arg0, int arg1) {
        field5078++;
        if (arg1 > 19) {
            class156 var2 = class206.method1525(12, -32701, arg0);
            var2.method1184((byte) 87);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lvl;", line = 52)
    public static final class73 method2055(int arg0) {
        field5076++;
        try {
            if (arg0 != 12) {
                method2053((byte) 104, -16);
            }
            return (class73) Class.forName("qc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
