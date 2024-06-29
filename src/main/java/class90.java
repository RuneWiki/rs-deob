import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class90 extends class34 {

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[B")
    public byte[] field1413;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Z")
    public boolean field1415;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfc;)Ljd;")
    public final class90 method689(class125 arg0) {
        this.field1413 = arg0.method936(this.field1413, 0);
        this.field1414 = arg0.method938(false, this.field1414);
        if (this.field1416 == this.field1412) {
            this.field1412 = this.field1416 = arg0.method940(this.field1412, (byte) 100);
        } else {
            this.field1412 = arg0.method940(this.field1412, (byte) 98);
            this.field1416 = arg0.method940(this.field1416, (byte) 76);
            if (this.field1416 == this.field1412) {
                this.field1412--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[BII)V")
    public class90(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1414 = arg0;
        this.field1413 = arg1;
        this.field1412 = arg2;
        this.field1416 = arg3;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[BIIZ)V")
    public class90(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1414 = arg0;
        this.field1413 = arg1;
        this.field1412 = arg2;
        this.field1416 = arg3;
        this.field1415 = arg4;
    }
}
