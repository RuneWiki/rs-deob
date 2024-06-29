import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class114 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 3)
    public static final void method848(byte arg0) {
        field1537++;
        int var1 = 0;
        if (arg0 != -53) {
            field1539 = 71;
        }
        for (int var2 = 0; var2 < class86.field1185; var2++) {
            for (int var3 = 0; var3 < class526.field7212; var3++) {
                if (class264.method1606(var3, class658.field9266, true, var2, var1, (byte) -115)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI)V", line = 45)
    public static final void method849(int arg0, byte arg1, int arg2) {
        field1538++;
        class679 var3 = class669.method3708(6, arg2, arg1 + 1403048867);
        var3.method3748(true);
        var3.field9574 = arg0;
        if (arg1 != 61) {
            method849(24, (byte) -80, 79);
        }
    }
}
