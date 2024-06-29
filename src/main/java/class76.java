import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class76 extends class333 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[B")
    public byte[] field1237;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Z")
    public boolean field1238;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbn;)Lri;", line = 8)
    public final class76 method701(class74 arg0) {
        this.field1237 = arg0.method693(this.field1237, -56);
        this.field1239 = arg0.method695(this.field1239, 65536);
        if (this.field1236 == this.field1235) {
            this.field1235 = this.field1236 = arg0.method697(this.field1235, 6);
        } else {
            this.field1235 = arg0.method697(this.field1235, 6);
            this.field1236 = arg0.method697(this.field1236, 6);
            if (this.field1236 == this.field1235) {
                this.field1235--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class76(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1239 = arg0;
        this.field1237 = arg1;
        this.field1235 = arg2;
        this.field1236 = arg3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class76(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1239 = arg0;
        this.field1237 = arg1;
        this.field1235 = arg2;
        this.field1236 = arg3;
        this.field1238 = arg4;
    }
}
