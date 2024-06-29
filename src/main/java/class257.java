import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class257 extends class286 {

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[B")
    public byte[] field4383;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    public boolean field4380;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lua;)Lmi;", line = 6)
    public final class257 method1799(class82 arg0) {
        this.field4383 = arg0.method570(this.field4383, true);
        this.field4382 = arg0.method568(this.field4382, 108);
        if (this.field4381 == this.field4379) {
            this.field4379 = this.field4381 = arg0.method569(false, this.field4379);
        } else {
            this.field4379 = arg0.method569(false, this.field4379);
            this.field4381 = arg0.method569(false, this.field4381);
            if (this.field4381 == this.field4379) {
                this.field4379--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class257(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4382 = arg0;
        this.field4383 = arg1;
        this.field4379 = arg2;
        this.field4381 = arg3;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class257(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4382 = arg0;
        this.field4383 = arg1;
        this.field4379 = arg2;
        this.field4381 = arg3;
        this.field4380 = arg4;
    }
}
