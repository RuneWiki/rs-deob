import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class405 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lur;")
    private class377 field5832;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field5831;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([BI)V", line = 5)
    public final void method2487(byte[] arg0, int arg1) {
        if (this.field5831 == null || this.field5831.field6432 < arg1) {
            this.field5831 = this.field5832.field5312.method2738(arg1);
        }
        this.field5831.method2730(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lur;[BI)V", line = 12)
    public class405(class377 arg0, byte[] arg1, int arg2) {
        this.field5832 = arg0;
        this.field5831 = this.field5832.field5312.method2738(arg2);
        if (arg1 != null) {
            this.field5831.method2730(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lur;Ljaggl/memory/NativeBuffer;)V", line = 21)
    public class405(class377 arg0, NativeBuffer arg1) {
        this.field5832 = arg0;
        this.field5831 = arg1;
    }
}
