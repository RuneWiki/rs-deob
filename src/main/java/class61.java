import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class61 extends class83 {

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "[B")
    public byte[] field875;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Z")
    public boolean field878;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lhc;)Lok;")
    public final class61 method406(class367 arg0) {
        this.field875 = arg0.method2422(82, this.field875);
        this.field877 = arg0.method2424(this.field877, -73);
        if (this.field879 == this.field876) {
            this.field879 = this.field876 = arg0.method2426(this.field879, -128);
        } else {
            this.field879 = arg0.method2426(this.field879, -128);
            this.field876 = arg0.method2426(this.field876, -128);
            if (this.field879 == this.field876) {
                this.field879--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[BII)V")
    public class61(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field877 = arg0;
        this.field875 = arg1;
        this.field879 = arg2;
        this.field876 = arg3;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[BIIZ)V")
    public class61(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field877 = arg0;
        this.field875 = arg1;
        this.field879 = arg2;
        this.field876 = arg3;
        this.field878 = arg4;
    }
}
