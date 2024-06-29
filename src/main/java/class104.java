import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class104 extends class145 {

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "[B")
    public byte[] field2176;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Z")
    public boolean field2178;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lw;)Lle;")
    public final class104 method847(class198 arg0) {
        this.field2176 = arg0.method1305(this.field2176, -122);
        this.field2177 = arg0.method1301(this.field2177, 1371335056);
        if (this.field2175 == this.field2174) {
            this.field2174 = this.field2175 = arg0.method1298(6, this.field2174);
        } else {
            this.field2174 = arg0.method1298(6, this.field2174);
            this.field2175 = arg0.method1298(6, this.field2175);
            if (this.field2175 == this.field2174) {
                this.field2174--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[BII)V")
    public class104(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2177 = arg0;
        this.field2176 = arg1;
        this.field2174 = arg2;
        this.field2175 = arg3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[BIIZ)V")
    public class104(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2177 = arg0;
        this.field2176 = arg1;
        this.field2174 = arg2;
        this.field2175 = arg3;
        this.field2178 = arg4;
    }
}
