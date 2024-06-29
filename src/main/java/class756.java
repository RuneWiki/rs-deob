import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class756 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lvf;")
    private class159 field11115;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field11114;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([BI)V", line = 5)
    public final void method5470(byte[] arg0, int arg1) {
        if (this.field11114 == null || this.field11114.getSize() < arg1) {
            this.field11114 = this.field11115.field2392.method5095(arg1, false);
        }
        this.field11114.method3847(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lvf;[BI)V", line = 12)
    public class756(class159 arg0, byte[] arg1, int arg2) {
        this.field11115 = arg0;
        this.field11114 = this.field11115.field2392.method5095(arg2, false);
        if (arg1 != null) {
            this.field11114.method3847(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lvf;Ljaclib/memory/Buffer;)V", line = 21)
    public class756(class159 arg0, Buffer arg1) {
        this.field11115 = arg0;
        this.field11114 = arg1;
    }
}
