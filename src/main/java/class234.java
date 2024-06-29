import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class234 extends class426 implements class377 {

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    private int field3339;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[BI)V", line = 3)
    public final void method1531(int arg0, byte[] arg1, int arg2) {
        this.method2626(arg1, arg2);
        this.field3340 = arg0;
        this.field3339 = this.field5918.method2190(this.field3340);
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lmm;I[BI)V", line = 8)
    public class234(class357 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3340 = arg1;
        this.field3339 = this.field5918.method2190(this.field3340);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()I", line = 14)
    public final int method578() {
        return 0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V", line = 17)
    public final void method1532(int arg0, int arg1, int arg2) {
        this.field5918.field4794.glDrawElements(arg0, arg2, this.field3340, this.field5919.position(this.field3339 * arg1));
    }
}
