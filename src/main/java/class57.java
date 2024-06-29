import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class57 extends class450 implements class28 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public final void method232(int arg0, int arg1, int arg2) {
        this.field6190.field6330.glDrawElements(arg0, arg2, this.field911, this.field6191.position(this.field912 * arg1));
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lqi;I[BI)V")
    public class57(class458 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field911 = arg1;
        this.field912 = this.field6190.method2656(this.field911);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BI)V")
    public final void method233(int arg0, byte[] arg1, int arg2) {
        this.method2608(arg1, arg2);
        this.field911 = arg0;
        this.field912 = this.field6190.method2656(this.field911);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
    public final int method234() {
        return 0;
    }
}
