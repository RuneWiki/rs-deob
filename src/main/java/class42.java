import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class42 {

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lgi;")
    private class583 field812;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field811;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BI)V")
    public final void method416(byte[] arg0, int arg1) {
        if (this.field811 == null || this.field811.getSize() < arg1) {
            this.field811 = this.field812.field8203.method3286(arg1, false);
        }
        this.field811.method2446(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lgi;[BI)V")
    public class42(class583 arg0, byte[] arg1, int arg2) {
        this.field812 = arg0;
        this.field811 = this.field812.field8203.method3286(arg2, false);
        if (arg1 != null) {
            this.field811.method2446(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lgi;Ljaclib/memory/Buffer;)V")
    public class42(class583 arg0, Buffer arg1) {
        this.field812 = arg0;
        this.field811 = arg1;
    }
}
