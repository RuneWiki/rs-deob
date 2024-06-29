import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class525 extends class448 {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    public boolean field7712 = false;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field7715;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
    public final boolean method3079(int arg0, int arg1) {
        if (!this.field7712) {
            return false;
        }
        int var3 = this.field7711 - this.field7713;
        int var4 = this.field7714 - this.field7716;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7716 * var4 + this.field7713 * var3);
        if (var6 <= 0) {
            int var7 = this.field7713 - arg0;
            int var8 = this.field7716 - arg1;
            return var7 * var7 + var8 * var8 < this.field7715 * this.field7715;
        } else if (var6 > var5) {
            int var9 = this.field7711 - arg0;
            int var10 = this.field7714 - arg1;
            return var9 * var9 + var10 * var10 < this.field7715 * this.field7715;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7713 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7716 - arg1;
            return var12 * var12 + var13 * var13 < this.field7715 * this.field7715;
        }
    }
}
