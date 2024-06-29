import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class441 {

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "Lpq;")
    private class194 field6078;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field6077;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "([BI)V")
    public final void method2635(byte[] arg0, int arg1) {
        if (this.field6077 == null || this.field6077.getSize() < arg1) {
            this.field6077 = this.field6078.field2612.method2333(arg1, false);
        }
        this.field6077.method120(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lpq;[BI)V")
    public class441(class194 arg0, byte[] arg1, int arg2) {
        this.field6078 = arg0;
        this.field6077 = this.field6078.field2612.method2333(arg2, false);
        if (arg1 != null) {
            this.field6077.method120(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lpq;Ljaclib/memory/Buffer;)V")
    public class441(class194 arg0, Buffer arg1) {
        this.field6078 = arg0;
        this.field6077 = arg1;
    }
}
