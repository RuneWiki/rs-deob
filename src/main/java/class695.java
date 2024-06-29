import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class695 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lwh;")
    private class148 field9588;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field9589;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BI)V", line = 6)
    public final void method3940(byte[] arg0, int arg1) {
        if (this.field9589 == null || this.field9589.getSize() < arg1) {
            this.field9589 = this.field9588.field2166.method3857(arg1, false);
        }
        this.field9589.method2918(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lwh;[BI)V", line = 12)
    public class695(class148 arg0, byte[] arg1, int arg2) {
        this.field9588 = arg0;
        this.field9589 = this.field9588.field2166.method3857(arg2, false);
        if (arg1 != null) {
            this.field9589.method2918(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lwh;Ljaclib/memory/Buffer;)V", line = 21)
    public class695(class148 arg0, Buffer arg1) {
        this.field9588 = arg0;
        this.field9589 = arg1;
    }
}
