import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class577 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lqo;")
    private class22 field7932;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field7931;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V", line = 5)
    public final void method3324(byte[] arg0, int arg1) {
        if (this.field7931 == null || this.field7931.getSize() < arg1) {
            this.field7931 = this.field7932.field552.method3777(arg1, false);
        }
        this.field7931.method2856(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lqo;[BI)V", line = 12)
    public class577(class22 arg0, byte[] arg1, int arg2) {
        this.field7932 = arg0;
        this.field7931 = this.field7932.field552.method3777(arg2, false);
        if (arg1 != null) {
            this.field7931.method2856(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lqo;Ljaclib/memory/Buffer;)V", line = 21)
    public class577(class22 arg0, Buffer arg1) {
        this.field7932 = arg0;
        this.field7931 = arg1;
    }
}
