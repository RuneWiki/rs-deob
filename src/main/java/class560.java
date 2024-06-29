import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class560 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Luca;")
    private class287 field8212;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field8213;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BI)V", line = 5)
    public final void method3247(byte[] arg0, int arg1) {
        if (this.field8213 == null || this.field8213.getSize() < arg1) {
            this.field8213 = this.field8212.field4018.method2073(arg1, false);
        }
        this.field8213.method163(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Luca;[BI)V", line = 12)
    public class560(class287 arg0, byte[] arg1, int arg2) {
        this.field8212 = arg0;
        this.field8213 = this.field8212.field4018.method2073(arg2, false);
        if (arg1 != null) {
            this.field8213.method163(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Luca;Ljaclib/memory/Buffer;)V", line = 21)
    public class560(class287 arg0, Buffer arg1) {
        this.field8212 = arg0;
        this.field8213 = arg1;
    }
}
