import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class313 extends class630 {

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "[B")
    public byte[] field4295;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "Z")
    public boolean field4293;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lwp;)Lvfa;", line = 5)
    public final class313 method2495(class389 arg0) {
        this.field4295 = arg0.method3049(87, this.field4295);
        this.field4297 = arg0.method3048(this.field4297, -23722);
        if (this.field4296 == this.field4294) {
            this.field4294 = this.field4296 = arg0.method3046((byte) 109, this.field4294);
        } else {
            this.field4294 = arg0.method3046((byte) 121, this.field4294);
            this.field4296 = arg0.method3046((byte) 120, this.field4296);
            if (this.field4296 == this.field4294) {
                this.field4294--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class313(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4297 = arg0;
        this.field4295 = arg1;
        this.field4294 = arg2;
        this.field4296 = arg3;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I[BIIZ)V", line = 30)
    public class313(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4297 = arg0;
        this.field4295 = arg1;
        this.field4294 = arg2;
        this.field4296 = arg3;
        this.field4293 = arg4;
    }
}
