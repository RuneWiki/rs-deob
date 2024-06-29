import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class61 {

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[B")
    public byte[] field1855;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
    public boolean field1859;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmc;)Lke;")
    public final class74 method613(class85 arg0) {
        this.field1855 = arg0.method657(this.field1855, -15);
        this.field1858 = arg0.method656(this.field1858, 0);
        if (this.field1857 == this.field1856) {
            this.field1857 = this.field1856 = arg0.method663(this.field1857, -68);
        } else {
            this.field1857 = arg0.method663(this.field1857, -115);
            this.field1856 = arg0.method663(this.field1856, -78);
            if (this.field1857 == this.field1856) {
                this.field1857--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
    public class74(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1858 = arg0;
        this.field1855 = arg1;
        this.field1857 = arg2;
        this.field1856 = arg3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
    public class74(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1858 = arg0;
        this.field1855 = arg1;
        this.field1857 = arg2;
        this.field1856 = arg3;
        this.field1859 = arg4;
    }
}
