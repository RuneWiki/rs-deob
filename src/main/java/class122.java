import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class122 extends class417 {

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[B")
    public byte[] field1719;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Llu;")
    public static class610 field1717 = new class610(51, 3);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Llu;")
    public static class610 field1718 = new class610(12, -1);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 6)
    public static final void method870(byte arg0) {
        field1716++;
        class517.field7365.method2800(0);
        class56.field658.method3504((byte) 95);
        if (arg0 <= -13) {
            class540.field8065.method3504((byte) 97);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 19)
    public static void method871(byte arg0) {
        field1718 = null;
        if (arg0 >= 38) {
            field1717 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V", line = 36)
    public class122(byte[] arg0) {
        this.field1719 = arg0;
    }
}
