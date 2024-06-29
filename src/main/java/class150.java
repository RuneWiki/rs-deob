import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class150 extends class157 {

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    public byte[] field2616;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
    public boolean field2615;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwc;)Lw;")
    public final class150 method950(class212 arg0) {
        this.field2616 = arg0.method1349(this.field2616, false);
        this.field2617 = arg0.method1347(126, this.field2617);
        if (this.field2619 == this.field2618) {
            this.field2618 = this.field2619 = arg0.method1350(this.field2618, (byte) -79);
        } else {
            this.field2618 = arg0.method1350(this.field2618, (byte) -94);
            this.field2619 = arg0.method1350(this.field2619, (byte) -117);
            if (this.field2619 == this.field2618) {
                this.field2618--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I[BII)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2617 = arg0;
        this.field2616 = arg1;
        this.field2618 = arg2;
        this.field2619 = arg3;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I[BIIZ)V")
    public class150(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2617 = arg0;
        this.field2616 = arg1;
        this.field2618 = arg2;
        this.field2619 = arg3;
        this.field2615 = arg4;
    }
}
