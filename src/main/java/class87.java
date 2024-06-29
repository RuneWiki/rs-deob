import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class87 extends class60 {

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[B")
    public byte[] field1244;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
    public boolean field1243;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lra;)Lcc;", line = 3)
    public final class87 method680(class222 arg0) {
        this.field1244 = arg0.method1565(this.field1244, 44);
        this.field1245 = arg0.method1569(-5690, this.field1245);
        if (this.field1242 == this.field1241) {
            this.field1241 = this.field1242 = arg0.method1566(this.field1241, (byte) 124);
        } else {
            this.field1241 = arg0.method1566(this.field1241, (byte) -104);
            this.field1242 = arg0.method1566(this.field1242, (byte) 105);
            if (this.field1242 == this.field1241) {
                this.field1241--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class87(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1245 = arg0;
        this.field1244 = arg1;
        this.field1241 = arg2;
        this.field1242 = arg3;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class87(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1245 = arg0;
        this.field1244 = arg1;
        this.field1241 = arg2;
        this.field1242 = arg3;
        this.field1243 = arg4;
    }
}
