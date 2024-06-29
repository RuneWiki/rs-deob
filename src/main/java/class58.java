import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class95 {

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[B")
    public byte[] field1344;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
    public boolean field1340;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Led;)Lib;")
    public final class58 method454(class33 arg0) {
        this.field1344 = arg0.method281(this.field1344, (byte) -105);
        this.field1343 = arg0.method283(this.field1343, -111);
        if (this.field1342 == this.field1341) {
            this.field1341 = this.field1342 = arg0.method285((byte) -71, this.field1341);
        } else {
            this.field1341 = arg0.method285((byte) 90, this.field1341);
            this.field1342 = arg0.method285((byte) -121, this.field1342);
            if (this.field1342 == this.field1341) {
                this.field1341--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BII)V")
    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1343 = arg0;
        this.field1344 = arg1;
        this.field1341 = arg2;
        this.field1342 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BIIZ)V")
    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1343 = arg0;
        this.field1344 = arg1;
        this.field1341 = arg2;
        this.field1342 = arg3;
        this.field1340 = arg4;
    }
}
