import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class41 extends class312 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    public boolean field673 = false;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z", line = 14)
    public final boolean method279(int arg0, int arg1) {
        if (!this.field673) {
            return false;
        }
        int var3 = this.field669 - this.field668;
        int var4 = this.field672 - this.field671;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field671 * var4 + this.field668 * var3);
        if (var6 <= 0) {
            int var7 = this.field668 - arg0;
            int var8 = this.field671 - arg1;
            return var7 * var7 + var8 * var8 < this.field670 * this.field670;
        } else if (var6 > var5) {
            int var9 = this.field669 - arg0;
            int var10 = this.field672 - arg1;
            return var9 * var9 + var10 * var10 < this.field670 * this.field670;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field668 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field671 - arg1;
            return var12 * var12 + var13 * var13 < this.field670 * this.field670;
        }
    }
}
