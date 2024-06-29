import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 extends class63 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[B")
    public byte[] field2503;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lv;)Lqa;", line = 3)
    public final class96 method810(class125 arg0) {
        this.field2503 = arg0.method988((byte) -10, this.field2503);
        this.field2502 = arg0.method990(0, this.field2502);
        if (this.field2501 == this.field2500) {
            this.field2501 = this.field2500 = arg0.method989(this.field2501, (byte) -53);
        } else {
            this.field2501 = arg0.method989(this.field2501, (byte) -53);
            this.field2500 = arg0.method989(this.field2500, (byte) -53);
            if (this.field2501 == this.field2500) {
                this.field2501--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2502 = arg0;
        this.field2503 = arg1;
        this.field2501 = arg2;
        this.field2500 = arg3;
    }
}
