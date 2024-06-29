import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class664 {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Lus;")
    private class1 field9544;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field9543;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "([BI)V")
    public final void method3771(byte[] arg0, int arg1) {
        if (this.field9543 == null || this.field9543.getSize() < arg1) {
            this.field9543 = this.field9544.field214.method3567(arg1, false);
        }
        this.field9543.method2721(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lus;[BI)V")
    public class664(class1 arg0, byte[] arg1, int arg2) {
        this.field9544 = arg0;
        this.field9543 = this.field9544.field214.method3567(arg2, false);
        if (arg1 != null) {
            this.field9543.method2721(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lus;Ljaclib/memory/Buffer;)V")
    public class664(class1 arg0, Buffer arg1) {
        this.field9544 = arg0;
        this.field9543 = arg1;
    }
}
