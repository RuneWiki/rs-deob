import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class387 extends class254 {

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
    public boolean field5644 = false;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Z")
    public final boolean method2282(int arg0, int arg1) {
        if (!this.field5644) {
            return false;
        }
        int var3 = this.field5640 - this.field5643;
        int var4 = this.field5642 - this.field5645;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5645 * var4 + this.field5643 * var3);
        if (var6 <= 0) {
            int var7 = this.field5643 - arg0;
            int var8 = this.field5645 - arg1;
            return var7 * var7 + var8 * var8 < this.field5641 * this.field5641;
        } else if (var6 > var5) {
            int var9 = this.field5640 - arg0;
            int var10 = this.field5642 - arg1;
            return var9 * var9 + var10 * var10 < this.field5641 * this.field5641;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5643 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5645 - arg1;
            return var12 * var12 + var13 * var13 < this.field5641 * this.field5641;
        }
    }
}
