import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class364 extends class97 implements class28 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    private int field5206;

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqi;I[BIZ)V", line = 3)
    public class364(class458 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5205 = arg1;
        this.field5206 = this.field1388.method2656(this.field5205);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I[BI)V", line = 8)
    public final void method233(int arg0, byte[] arg1, int arg2) {
        this.method627(arg1, arg2);
        this.field5205 = arg0;
        this.field5206 = this.field1388.method2656(this.field5205);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()I", line = 14)
    public final int method234() {
        return super.method234();
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V", line = 18)
    public final void method232(int arg0, int arg1, int arg2) {
        this.field1388.field6330.glDrawElements(arg0, arg2, this.field5205, (long) (this.field5206 * arg1));
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V", line = 21)
    public final void method626() {
        this.field1388.method2659(this);
    }
}
