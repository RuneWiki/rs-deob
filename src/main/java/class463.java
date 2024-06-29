import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class463 extends class182 {

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Z")
    public boolean field7120 = false;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public int field7121;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z", line = 14)
    public final boolean method3582(int arg0, int arg1) {
        if (!this.field7120) {
            return false;
        }
        int var3 = this.field7118 - this.field7121;
        int var4 = this.field7116 - this.field7117;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7121 * var3 + this.field7117 * var4);
        if (var6 <= 0) {
            int var7 = this.field7121 - arg0;
            int var8 = this.field7117 - arg1;
            return var7 * var7 + var8 * var8 < this.field7119 * this.field7119;
        } else if (var6 > var5) {
            int var9 = this.field7118 - arg0;
            int var10 = this.field7116 - arg1;
            return var9 * var9 + var10 * var10 < this.field7119 * this.field7119;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7121 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7117 - arg1;
            return var12 * var12 + var13 * var13 < this.field7119 * this.field7119;
        }
    }
}
