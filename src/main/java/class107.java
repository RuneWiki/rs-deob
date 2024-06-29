import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class107 extends class110 {

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[B")
    public byte[] field1796;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Z")
    public boolean field1795;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Li;)Luc;", line = 6)
    public final class107 method801(class305 arg0) {
        this.field1796 = arg0.method2117(this.field1796, false);
        this.field1794 = arg0.method2113(-2079633968, this.field1794);
        if (this.field1798 == this.field1797) {
            this.field1797 = this.field1798 = arg0.method2115(this.field1797, false);
        } else {
            this.field1797 = arg0.method2115(this.field1797, false);
            this.field1798 = arg0.method2115(this.field1798, false);
            if (this.field1798 == this.field1797) {
                this.field1797--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class107(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1794 = arg0;
        this.field1796 = arg1;
        this.field1797 = arg2;
        this.field1798 = arg3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class107(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1794 = arg0;
        this.field1796 = arg1;
        this.field1797 = arg2;
        this.field1798 = arg3;
        this.field1795 = arg4;
    }
}
