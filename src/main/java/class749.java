import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class749 extends class91 {

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Z")
    public boolean field10404 = false;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public int field10400;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public int field10401;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public int field10402;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public int field10403;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public int field10405;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method4123(int arg0, int arg1) {
        if (!this.field10404) {
            return false;
        }
        int var3 = this.field10402 - this.field10403;
        int var4 = this.field10401 - this.field10405;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field10405 * var4 + this.field10403 * var3);
        if (var6 <= 0) {
            int var7 = this.field10403 - arg0;
            int var8 = this.field10405 - arg1;
            return var7 * var7 + var8 * var8 < this.field10400 * this.field10400;
        } else if (var6 > var5) {
            int var9 = this.field10402 - arg0;
            int var10 = this.field10401 - arg1;
            return var9 * var9 + var10 * var10 < this.field10400 * this.field10400;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field10403 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field10405 - arg1;
            return var12 * var12 + var13 * var13 < this.field10400 * this.field10400;
        }
    }
}
