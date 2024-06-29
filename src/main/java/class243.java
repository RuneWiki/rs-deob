import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class243 extends class105 {

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Z")
    public boolean field3397 = false;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Z")
    public final boolean method1626(int arg0, int arg1) {
        if (!this.field3397) {
            return false;
        }
        int var3 = this.field3401 - this.field3400;
        int var4 = this.field3399 - this.field3398;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field3400 * var3 + this.field3398 * var4);
        if (var6 <= 0) {
            int var7 = this.field3400 - arg0;
            int var8 = this.field3398 - arg1;
            return var7 * var7 + var8 * var8 < this.field3402 * this.field3402;
        } else if (var6 > var5) {
            int var9 = this.field3401 - arg0;
            int var10 = this.field3399 - arg1;
            return var9 * var9 + var10 * var10 < this.field3402 * this.field3402;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3400 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3398 - arg1;
            return var12 * var12 + var13 * var13 < this.field3402 * this.field3402;
        }
    }
}
