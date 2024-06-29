import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class87 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1294 = new String[200];

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1296 = "white:";

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lrl;", line = 7)
    public static final class264 method778(byte arg0) {
        field1299++;
        if (arg0 != 2) {
            return null;
        }
        class264 var1 = (class264) class394.field5513.method897((byte) -32);
        if (var1 == null) {
            return new class264();
        } else {
            class183.field2661--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 27)
    public static void method779(int arg0) {
        if (arg0 >= -30) {
            field1296 = null;
        }
        field1296 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V", line = 51)
    public static final void method780(int arg0, int arg1) {
        if (arg0 >= 4) {
            class151.field2308.method2534(0, arg1);
            field1295++;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lrk;I)V", line = 74)
    public static final void method781(class427 arg0, int arg1) {
        field1297++;
        class239.field3316 = arg0.method2643("titlebg", arg1);
        class232.field3200 = arg0.method2643("logo", arg1);
    }
}
