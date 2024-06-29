import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class177 extends class22 {

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[B")
    public byte[] field2456;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "Z")
    public boolean field2452;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lsm;)Lfp;", line = 4)
    public final class177 method1165(class156 arg0) {
        this.field2456 = arg0.method1029(590009680, this.field2456);
        this.field2455 = arg0.method1028(-32768, this.field2455);
        if (this.field2454 == this.field2453) {
            this.field2454 = this.field2453 = arg0.method1027(122, this.field2454);
        } else {
            this.field2454 = arg0.method1027(-49, this.field2454);
            this.field2453 = arg0.method1027(110, this.field2453);
            if (this.field2454 == this.field2453) {
                this.field2454--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class177(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2455 = arg0;
        this.field2456 = arg1;
        this.field2454 = arg2;
        this.field2453 = arg3;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class177(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2455 = arg0;
        this.field2456 = arg1;
        this.field2454 = arg2;
        this.field2453 = arg3;
        this.field2452 = arg4;
    }
}
