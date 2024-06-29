import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class124 extends class59 {

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[B")
    public byte[] field2999;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Loe;)Lvb;", line = 8)
    public final class124 method941(class89 arg0) {
        this.field2999 = arg0.method722(true, this.field2999);
        this.field3000 = arg0.method723(-104, this.field3000);
        if (this.field3002 == this.field3001) {
            this.field3002 = this.field3001 = arg0.method720(7, this.field3002);
        } else {
            this.field3002 = arg0.method720(7, this.field3002);
            this.field3001 = arg0.method720(7, this.field3001);
            if (this.field3002 == this.field3001) {
                this.field3002--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[BII)V", line = 24)
    public class124(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3000 = arg0;
        this.field2999 = arg1;
        this.field3002 = arg2;
        this.field3001 = arg3;
    }
}
