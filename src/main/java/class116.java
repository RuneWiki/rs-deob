import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class116 {

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "Lmea;")
    public static class357 field1840;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z", line = 3)
    public static final boolean method932(byte arg0) {
        field1841++;
        class435 var1 = class150.field2533.field9799.field6258;
        int var2 = 103 / ((arg0 + 73) / 37);
        if (var1 == null || class150.field2533.field9799 == var1) {
            return false;
        }
        class673 var3 = (class673) var1;
        if (var3.field9544 >= 2000) {
            var3.field9544 -= 2000;
        }
        return var3.field9544 == 1009;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V", line = 33)
    public static void method933(boolean arg0) {
        field1840 = null;
        if (arg0) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field1845++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)I", line = 54)
    public final int method934(int arg0) {
        if (arg0 <= 90) {
            return -27;
        } else {
            field1842++;
            return this.field1839;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(II)V", line = 65)
    public class116(int arg0, int arg1) {
        this.field1839 = arg0;
        this.field1843 = arg1;
    }
}
