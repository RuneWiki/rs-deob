import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class660 extends class76 {

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Z")
    public boolean field9279 = false;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public int field9276;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public int field9277;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public int field9278;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public int field9280;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public int field9281;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z")
    public final boolean method3768(int arg0, int arg1) {
        if (!this.field9279) {
            return false;
        }
        int var3 = this.field9278 - this.field9280;
        int var4 = this.field9277 - this.field9281;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field9281 * var4 + this.field9280 * var3);
        if (var6 <= 0) {
            int var7 = this.field9280 - arg0;
            int var8 = this.field9281 - arg1;
            return var7 * var7 + var8 * var8 < this.field9276 * this.field9276;
        } else if (var6 > var5) {
            int var9 = this.field9278 - arg0;
            int var10 = this.field9277 - arg1;
            return var9 * var9 + var10 * var10 < this.field9276 * this.field9276;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field9280 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field9281 - arg1;
            return var12 * var12 + var13 * var13 < this.field9276 * this.field9276;
        }
    }
}
