import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class84 extends class25 {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lcd;")
    public static class64 field1554 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[Lcd;")
    public static class64[] field1557 = new class64[8];

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lcd;")
    private static class64 field1561 = class44.method335((byte) 71, "Loading world list data");

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lcd;")
    public static class64 field1558 = class44.method335((byte) 71, "scrollen:");

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lcd;")
    public static class64 field1560 = field1561;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lcd;")
    private static class64 field1562 = class44.method335((byte) 71, "red:");

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lcd;")
    public static class64 field1559 = field1562;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lcd;")
    public static class64 field1551 = field1562;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Z")
    public static boolean field1555;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 16)
    public static void method645(byte arg0) {
        field1551 = null;
        field1554 = null;
        field1557 = null;
        field1558 = null;
        int var1 = -24 / ((arg0 + 24) / 54);
        field1561 = null;
        field1562 = null;
        field1559 = null;
        field1560 = null;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 36)
    public static final void method646(int arg0) {
        class143.method1018(-116);
        System.gc();
        field1563++;
        if (arg0 != 6949) {
            method646(-43);
        }
        class153.method1107(25, (byte) -109);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLkh;)Lsf;", line = 57)
    public static final class101 method647(boolean arg0, class13 arg1) {
        if (arg0) {
            field1553++;
            return new class101(arg1.method153(55), arg1.method153(104), arg1.method153(-81), arg1.method153(-102), arg1.method111(1263702152), arg1.method111(1263702152), arg1.method152((byte) -94));
        } else {
            return (class101) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 66)
    public class84() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V", line = 68)
    public class84(int arg0) {
        this.field1552 = arg0;
    }
}
