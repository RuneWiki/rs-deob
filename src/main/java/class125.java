import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class125 extends class104 {

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "[B")
    public byte[] field1678;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Z")
    public boolean field1675;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Llk;)Lut;", line = 6)
    public final class125 method888(class589 arg0) {
        this.field1678 = arg0.method3407(this.field1678, true);
        this.field1679 = arg0.method3405(true, this.field1679);
        if (this.field1677 == this.field1676) {
            this.field1677 = this.field1676 = arg0.method3403(this.field1677, 16);
        } else {
            this.field1677 = arg0.method3403(this.field1677, 16);
            this.field1676 = arg0.method3403(this.field1676, 16);
            if (this.field1677 == this.field1676) {
                this.field1677--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class125(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1679 = arg0;
        this.field1678 = arg1;
        this.field1677 = arg2;
        this.field1676 = arg3;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class125(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1679 = arg0;
        this.field1678 = arg1;
        this.field1677 = arg2;
        this.field1676 = arg3;
        this.field1675 = arg4;
    }
}
