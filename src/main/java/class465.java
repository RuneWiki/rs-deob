import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class465 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ler;")
    private class92 field6932;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6933;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
    public final void method2900(byte[] arg0, int arg1) {
        if (this.field6933 == null || this.field6933.getSize() < arg1) {
            this.field6933 = this.field6932.field1325.method3617(arg1, false);
        }
        this.field6933.method2834(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ler;[BI)V")
    public class465(class92 arg0, byte[] arg1, int arg2) {
        this.field6932 = arg0;
        this.field6933 = this.field6932.field1325.method3617(arg2, false);
        if (arg1 != null) {
            this.field6933.method2834(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ler;Ljaclib/memory/Buffer;)V")
    public class465(class92 arg0, Buffer arg1) {
        this.field6932 = arg0;
        this.field6933 = arg1;
    }
}
