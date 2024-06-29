import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class431 extends class503 {

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "Z")
    public boolean field6126 = false;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method2622(int arg0, int arg1) {
        if (!this.field6126) {
            return false;
        }
        int var3 = this.field6125 - this.field6123;
        int var4 = this.field6122 - this.field6124;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6124 * var4 + this.field6123 * var3);
        if (var6 <= 0) {
            int var7 = this.field6123 - arg0;
            int var8 = this.field6124 - arg1;
            return var7 * var7 + var8 * var8 < this.field6121 * this.field6121;
        } else if (var6 > var5) {
            int var9 = this.field6125 - arg0;
            int var10 = this.field6122 - arg1;
            return var9 * var9 + var10 * var10 < this.field6121 * this.field6121;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6123 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6124 - arg1;
            return var12 * var12 + var13 * var13 < this.field6121 * this.field6121;
        }
    }
}
