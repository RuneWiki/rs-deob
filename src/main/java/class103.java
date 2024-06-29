import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class103 {

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lnfa;")
    private class621 field1118;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Z")
    public static boolean field1120 = false;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!uaa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field1118.method3483(this.field1115, 4925);
        field1117++;
        super.finalize();
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 19)
    public static final void method623(byte arg0) {
        for (class393 var1 = (class393) class415.field5507.method89((byte) 127); var1 != null; var1 = (class393) class415.field5507.method89((byte) 127)) {
            class156.method844(var1, -40);
        }
        if (arg0 != -113) {
            method623((byte) 74);
        }
        field1119++;
        int var2;
        int var3;
        if (class601.field8530.method1835(class150.field1711, (byte) 85)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class676.field9588;
            var2 = class676.field9588;
        }
        client.method1541();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method1539();
            client.method1533(var4);
            client.method1534(var4);
        }
        client.method1536();
        client.method1547();
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljo;IZ)Led;", line = 65)
    public static final class645 method624(class303 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1116++;
            byte[] var3 = arg0.method1722(arg1, 0);
            return var3 == null ? null : new class645(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lnfa;II)V", line = 81)
    public class103(class621 arg0, int arg1, int arg2) {
        this.field1118 = arg0;
        this.field1115 = arg2;
    }
}
