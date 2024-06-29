import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class317 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lap;")
    private class435 field4117;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field4116;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V", line = 5)
    public final void method1791(byte[] arg0, int arg1) {
        if (this.field4116 == null || this.field4116.getSize() < arg1) {
            this.field4116 = this.field4117.field5925.method3431(arg1, false);
        }
        this.field4116.method2446(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lap;[BI)V", line = 12)
    public class317(class435 arg0, byte[] arg1, int arg2) {
        this.field4117 = arg0;
        this.field4116 = this.field4117.field5925.method3431(arg2, false);
        if (arg1 != null) {
            this.field4116.method2446(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lap;Ljaclib/memory/Buffer;)V", line = 21)
    public class317(class435 arg0, Buffer arg1) {
        this.field4117 = arg0;
        this.field4116 = arg1;
    }
}
