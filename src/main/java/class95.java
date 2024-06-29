import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class95 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Z")
    public boolean field1488;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1486 = -1;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1487 = 503;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "Log;")
    public class601 field1490;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Log;")
    public class601 field1493;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Lri;")
    public static class97 field1491;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Z")
    public boolean field1485;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "[I")
    public static int[] field1483;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Z", line = 12)
    public final boolean method906(byte arg0) {
        if (arg0 != 74) {
            this.field1490 = null;
        }
        field1484++;
        return this.field1485 && !this.field1488;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 23)
    public static void method907(int arg0) {
        int var1 = 38 % ((arg0 + 32) / 36);
        field1483 = null;
        field1491 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V", line = 46)
    public final void method908(byte arg0) {
        if (this.field1493 != null) {
            this.field1493.method431(arg0 ^ 0xFFFFEA47);
        }
        if (arg0 != 52) {
            field1486 = 12;
        }
        field1492++;
        this.field1485 = false;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Z)V", line = 59)
    public class95(boolean arg0) {
        this.field1488 = arg0;
    }
}
