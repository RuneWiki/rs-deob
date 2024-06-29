import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class38 extends class390 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
    public boolean field569 = false;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z", line = 9)
    public final boolean method265(int arg0, int arg1) {
        if (!this.field569) {
            return false;
        }
        int var3 = this.field568 - this.field566;
        int var4 = this.field567 - this.field564;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field566 * var3 + this.field564 * var4);
        if (var6 <= 0) {
            int var7 = this.field566 - arg0;
            int var8 = this.field564 - arg1;
            return var7 * var7 + var8 * var8 < this.field565 * this.field565;
        } else if (var6 > var5) {
            int var9 = this.field568 - arg0;
            int var10 = this.field567 - arg1;
            return var9 * var9 + var10 * var10 < this.field565 * this.field565;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field566 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field564 - arg1;
            return var12 * var12 + var13 * var13 < this.field565 * this.field565;
        }
    }
}
