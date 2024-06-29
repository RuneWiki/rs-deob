import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class364 extends class499 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Z")
    public boolean field5117 = false;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field5121;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public int field5122;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
    public final boolean method2159(int arg0, int arg1) {
        if (!this.field5117) {
            return false;
        }
        int var3 = this.field5120 - this.field5122;
        int var4 = this.field5118 - this.field5121;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5122 * var3 + this.field5121 * var4);
        if (var6 <= 0) {
            int var7 = this.field5122 - arg0;
            int var8 = this.field5121 - arg1;
            return var7 * var7 + var8 * var8 < this.field5119 * this.field5119;
        } else if (var6 > var5) {
            int var9 = this.field5120 - arg0;
            int var10 = this.field5118 - arg1;
            return var9 * var9 + var10 * var10 < this.field5119 * this.field5119;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5122 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5121 - arg1;
            return var12 * var12 + var13 * var13 < this.field5119 * this.field5119;
        }
    }
}
