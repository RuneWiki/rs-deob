import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class609 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "B")
    private byte field8587;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public int field8585;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field8591;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field8592;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public int field8586;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public int field8588;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Ljn;")
    public static class134 field8583 = new class134(71, 12);

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field8590 = 1;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Ljn;")
    public static class134 field8595 = new class134(92, 2);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[[Lsha;")
    public static class115[][] field8594;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIB)V", line = 19)
    public static final void method3529(boolean arg0, int arg1, byte arg2) {
        int var3 = -4 % ((arg2 - 15) / 34);
        field8584++;
        class717 var4 = class159.method1020(arg0, false, arg1);
        if (var4 != null) {
            var4.method527(-11229);
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 38)
    public class609() {
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I", line = 42)
    public final int method3530(byte arg0) {
        field8589++;
        return arg0 == 91 ? this.field8587 & 0x7 : -80;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 53)
    public static void method3531(byte arg0) {
        if (arg0 > -126) {
            field8583 = null;
        }
        field8583 = null;
        field8594 = null;
        field8595 = null;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lgga;)V", line = 65)
    public class609(class511 arg0) {
        this.field8587 = arg0.method3030(-25984);
        this.field8585 = arg0.method3002(-1);
        this.field8591 = arg0.method3008(64);
        this.field8592 = arg0.method3008(64);
        this.field8586 = arg0.method3008(64);
        this.field8588 = arg0.method3008(64);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)I", line = 78)
    public final int method3532(byte arg0) {
        field8593++;
        if (arg0 == -40) {
            return (this.field8587 & 0x8) == 8 ? 1 : 0;
        } else {
            return 47;
        }
    }
}
