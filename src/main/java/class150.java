import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class150 extends class101 {

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Lgl;")
    public class627 field2082;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
    public boolean field2084;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field2089 = -1;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Z")
    public boolean field2085;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Z")
    public boolean field2087;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
    public boolean field2088;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        class300.method1901(11, 2);
        field2092++;
        if (arg0 >= -82) {
            method1118(-114);
        }
        class12.method94((byte) 121);
        System.gc();
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public static final void method1118(int arg0) {
        field2083++;
        if (class731.field10141 == class324.field4724) {
            return;
        }
        try {
            class623.method3414(class627.field8774, "tbrefresh", (byte) 123);
        } catch (Throwable var1) {
        }
        if (arg0 != 0) {
            method1118(-80);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(ILgl;IZ)V")
    public class150(int arg0, class627 arg1, int arg2, boolean arg3) {
        this.field2082 = arg1;
        this.field2086 = arg0;
        this.field2091 = arg2;
        this.field2084 = arg3;
    }
}
