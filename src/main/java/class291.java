import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class291 extends class42 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "[B")
    public byte[] field4719;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Z")
    public boolean field4717;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lei;)Lgi;", line = 5)
    public final class291 method2020(class164 arg0) {
        this.field4719 = arg0.method1150(this.field4719, -58);
        this.field4720 = arg0.method1148(this.field4720, (byte) 40);
        if (this.field4721 == this.field4718) {
            this.field4718 = this.field4721 = arg0.method1146(this.field4718, true);
        } else {
            this.field4718 = arg0.method1146(this.field4718, true);
            this.field4721 = arg0.method1146(this.field4721, true);
            if (this.field4721 == this.field4718) {
                this.field4718--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class291(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field4720 = arg0;
        this.field4719 = arg1;
        this.field4718 = arg2;
        this.field4721 = arg3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class291(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field4720 = arg0;
        this.field4719 = arg1;
        this.field4718 = arg2;
        this.field4721 = arg3;
        this.field4717 = arg4;
    }
}
