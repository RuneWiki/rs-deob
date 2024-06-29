import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class179 extends class461 {

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[B")
    public byte[] field2542;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Z")
    public boolean field2540;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lgj;)Lua;")
    public final class179 method1246(class385 arg0) {
        this.field2542 = arg0.method2433((byte) -108, this.field2542);
        this.field2543 = arg0.method2430(32767, this.field2543);
        if (this.field2544 == this.field2541) {
            this.field2544 = this.field2541 = arg0.method2431(this.field2544, (byte) -61);
        } else {
            this.field2544 = arg0.method2431(this.field2544, (byte) -61);
            this.field2541 = arg0.method2431(this.field2541, (byte) -61);
            if (this.field2544 == this.field2541) {
                this.field2544--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I[BII)V")
    public class179(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2543 = arg0;
        this.field2542 = arg1;
        this.field2544 = arg2;
        this.field2541 = arg3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I[BIIZ)V")
    public class179(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2543 = arg0;
        this.field2542 = arg1;
        this.field2544 = arg2;
        this.field2541 = arg3;
        this.field2540 = arg4;
    }
}
