import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class154 extends class170 {

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[B")
    public byte[] field2648;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Z")
    public boolean field2650;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ldj;)Lvk;", line = 7)
    public final class154 method1108(class143 arg0) {
        this.field2648 = arg0.method970(this.field2648, 4);
        this.field2647 = arg0.method971(-14277, this.field2647);
        if (this.field2651 == this.field2649) {
            this.field2651 = this.field2649 = arg0.method968(this.field2651, -115);
        } else {
            this.field2651 = arg0.method968(this.field2651, -103);
            this.field2649 = arg0.method968(this.field2649, -122);
            if (this.field2651 == this.field2649) {
                this.field2651--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class154(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2647 = arg0;
        this.field2648 = arg1;
        this.field2651 = arg2;
        this.field2649 = arg3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class154(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2647 = arg0;
        this.field2648 = arg1;
        this.field2651 = arg2;
        this.field2649 = arg3;
        this.field2650 = arg4;
    }
}
