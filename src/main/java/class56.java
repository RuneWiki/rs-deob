import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class56 {

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Lih;")
    private class214 field892;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Ljaggl/memory/NativeBuffer;")
    public NativeBuffer field893;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "([BI)V")
    public final void method389(byte[] arg0, int arg1) {
        if (this.field893 == null || this.field893.field210 < arg1) {
            this.field893 = this.field892.field3603.method105(arg1);
        }
        this.field893.method92(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lih;[BI)V")
    public class56(class214 arg0, byte[] arg1, int arg2) {
        this.field892 = arg0;
        this.field893 = this.field892.field3603.method105(arg2);
        if (arg1 != null) {
            this.field893.method92(arg1, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lih;Ljaggl/memory/NativeBuffer;)V")
    public class56(class214 arg0, NativeBuffer arg1) {
        this.field892 = arg0;
        this.field893 = arg1;
    }
}
