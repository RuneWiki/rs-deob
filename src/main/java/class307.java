import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class307 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Leq;")
    private class357 field3938;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field3939;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([BI)V", line = 5)
    public final void method1804(byte[] arg0, int arg1) {
        if (this.field3939 == null || this.field3939.getSize() < arg1) {
            this.field3939 = this.field3938.field4955.method2221(arg1, false);
        }
        this.field3939.method281(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Leq;[BI)V", line = 12)
    public class307(class357 arg0, byte[] arg1, int arg2) {
        this.field3938 = arg0;
        this.field3939 = this.field3938.field4955.method2221(arg2, false);
        if (arg1 != null) {
            this.field3939.method281(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Leq;Ljaclib/memory/Buffer;)V", line = 21)
    public class307(class357 arg0, Buffer arg1) {
        this.field3938 = arg0;
        this.field3939 = arg1;
    }
}
