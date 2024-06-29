import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class147 extends class523 {

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "[B")
    public byte[] field2322;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "Z")
    public boolean field2323;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ltf;)Lct;")
    public final class147 method1108(class298 arg0) {
        this.field2322 = arg0.method1836(this.field2322, -54);
        this.field2324 = arg0.method1834((byte) 91, this.field2324);
        if (this.field2326 == this.field2325) {
            this.field2326 = this.field2325 = arg0.method1835(this.field2326, 6909);
        } else {
            this.field2326 = arg0.method1835(this.field2326, 6909);
            this.field2325 = arg0.method1835(this.field2325, 6909);
            if (this.field2326 == this.field2325) {
                this.field2326--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BII)V")
    public class147(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2324 = arg0;
        this.field2322 = arg1;
        this.field2326 = arg2;
        this.field2325 = arg3;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BIIZ)V")
    public class147(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2324 = arg0;
        this.field2322 = arg1;
        this.field2326 = arg2;
        this.field2325 = arg3;
        this.field2323 = arg4;
    }
}
