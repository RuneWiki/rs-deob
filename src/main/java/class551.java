import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class551 extends class546 {

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Z")
    public boolean field7444 = false;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field7442;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public int field7443;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public int field7446;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method3096(int arg0, int arg1) {
        if (!this.field7444) {
            return false;
        }
        int var3 = this.field7447 - this.field7445;
        int var4 = this.field7446 - this.field7442;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7445 * var3 + this.field7442 * var4);
        if (var6 <= 0) {
            int var7 = this.field7445 - arg0;
            int var8 = this.field7442 - arg1;
            return var7 * var7 + var8 * var8 < this.field7443 * this.field7443;
        } else if (var6 > var5) {
            int var9 = this.field7447 - arg0;
            int var10 = this.field7446 - arg1;
            return var9 * var9 + var10 * var10 < this.field7443 * this.field7443;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7445 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7442 - arg1;
            return var12 * var12 + var13 * var13 < this.field7443 * this.field7443;
        }
    }
}
