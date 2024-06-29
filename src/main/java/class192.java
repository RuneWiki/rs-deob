import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class192 extends class110 {

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[B")
    public byte[] field3044;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Z")
    public boolean field3048;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lmf;)Lul;")
    public final class192 method1295(class10 arg0) {
        this.field3044 = arg0.method113(this.field3044, 21132);
        this.field3047 = arg0.method110(112, this.field3047);
        if (this.field3046 == this.field3045) {
            this.field3045 = this.field3046 = arg0.method111(this.field3045, 6);
        } else {
            this.field3045 = arg0.method111(this.field3045, 6);
            this.field3046 = arg0.method111(this.field3046, 6);
            if (this.field3046 == this.field3045) {
                this.field3045--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I[BII)V")
    public class192(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field3047 = arg0;
        this.field3044 = arg1;
        this.field3045 = arg2;
        this.field3046 = arg3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I[BIIZ)V")
    public class192(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field3047 = arg0;
        this.field3044 = arg1;
        this.field3045 = arg2;
        this.field3046 = arg3;
        this.field3048 = arg4;
    }
}
