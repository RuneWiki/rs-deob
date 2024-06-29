import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class135 extends class181 {

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[S")
    public static short[] field1977 = new short[256];

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
    public static int[] field1973;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[Lji;")
    public static class256[] field1974;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1980;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method926(int arg0) {
        field1974 = null;
        if (arg0 != -1) {
            method927(11);
        }
        field1980 = null;
        field1977 = null;
        field1973 = null;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static final void method927(int arg0) {
        if (class184.field2677 != -1) {
            class160.method1080(36, class184.field2677);
        }
        field1978++;
        for (int var1 = 0; var1 < class123.field1818; var1++) {
            if (class17.field315[var1]) {
                class285.field4371[var1] = true;
            }
            class92.field1391[var1] = class17.field315[var1];
            class17.field315[var1] = false;
        }
        if (arg0 <= 13) {
            field1973 = null;
        }
        class154.field2252 = null;
        class208.field3115 = -1;
        class124.field1842 = class120.field1794;
        class239.field3679 = -1;
        if (class184.field2677 != -1) {
            class123.field1818 = 0;
            class149.method1012(-31601);
        }
        class72.method561();
        class177.field2599 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class135() {
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
    public static final void method928(int arg0, byte arg1) {
        class246.field3828 = 1000 / arg0;
        if (arg1 != 70) {
            method926(40);
        }
        field1976++;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
    public class135(int arg0) {
        this.field1975 = arg0;
    }
}
