import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class283 {

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "J")
    public long field3921;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "Loia;")
    private class97 field3920;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IB)C", line = 7)
    public static final char method1823(int arg0, byte arg1) {
        if (arg0 != -27037) {
            return '!';
        }
        field3922++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class762.field10525[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!wja", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        field3919++;
        this.field3920.method858(this.field3921, 1217792760);
        super.finalize();
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Loia;JI)V", line = 44)
    public class283(class97 arg0, long arg1, int arg2) {
        this.field3921 = arg1;
        this.field3920 = arg0;
    }
}
