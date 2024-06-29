import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class396 extends class423 {

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "Z")
    public boolean field5759 = false;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field5755;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public int field5756;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public int field5758;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method2489(int arg0, int arg1) {
        if (!this.field5759) {
            return false;
        }
        int var3 = this.field5760 - this.field5756;
        int var4 = this.field5757 - this.field5758;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5758 * var4 + this.field5756 * var3);
        if (var6 <= 0) {
            int var7 = this.field5756 - arg0;
            int var8 = this.field5758 - arg1;
            return var7 * var7 + var8 * var8 < this.field5755 * this.field5755;
        } else if (var6 > var5) {
            int var9 = this.field5760 - arg0;
            int var10 = this.field5757 - arg1;
            return var9 * var9 + var10 * var10 < this.field5755 * this.field5755;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5756 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5758 - arg1;
            return var12 * var12 + var13 * var13 < this.field5755 * this.field5755;
        }
    }
}
