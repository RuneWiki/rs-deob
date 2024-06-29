import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class95 extends class158 {

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[B")
    public byte[] field1407;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
    public boolean field1405;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqu;)Ltk;")
    public final class95 method723(class282 arg0) {
        this.field1407 = arg0.method1750(-15, this.field1407);
        this.field1406 = arg0.method1754(this.field1406, -122);
        if (this.field1409 == this.field1408) {
            this.field1409 = this.field1408 = arg0.method1749(this.field1409, 123);
        } else {
            this.field1409 = arg0.method1749(this.field1409, 122);
            this.field1408 = arg0.method1749(this.field1408, -31);
            if (this.field1409 == this.field1408) {
                this.field1409--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I[BII)V")
    public class95(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1406 = arg0;
        this.field1407 = arg1;
        this.field1409 = arg2;
        this.field1408 = arg3;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(I[BIIZ)V")
    public class95(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1406 = arg0;
        this.field1407 = arg1;
        this.field1409 = arg2;
        this.field1408 = arg3;
        this.field1405 = arg4;
    }
}
