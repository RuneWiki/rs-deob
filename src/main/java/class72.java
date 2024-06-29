import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lkv;")
    private class280 field971;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljaclib/memory/Buffer;")
    public Buffer field970;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
    public final void method567(byte[] arg0, int arg1) {
        if (this.field970 == null || this.field970.getSize() < arg1) {
            this.field970 = this.field971.field4163.method3946(arg1, false);
        }
        this.field970.method2972(arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lkv;[BI)V")
    public class72(class280 arg0, byte[] arg1, int arg2) {
        this.field971 = arg0;
        this.field970 = this.field971.field4163.method3946(arg2, false);
        if (arg1 != null) {
            this.field970.method2972(arg1, 0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lkv;Ljaclib/memory/Buffer;)V")
    public class72(class280 arg0, Buffer arg1) {
        this.field971 = arg0;
        this.field970 = arg1;
    }
}
