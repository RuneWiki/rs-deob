import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class253 extends class609 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public boolean field3896 = false;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method1692(int arg0, int arg1) {
        if (!this.field3896) {
            return false;
        }
        int var3 = this.field3897 - this.field3894;
        int var4 = this.field3895 - this.field3893;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field3894 * var3 + this.field3893 * var4);
        if (var6 <= 0) {
            int var7 = this.field3894 - arg0;
            int var8 = this.field3893 - arg1;
            return var7 * var7 + var8 * var8 < this.field3892 * this.field3892;
        } else if (var6 > var5) {
            int var9 = this.field3897 - arg0;
            int var10 = this.field3895 - arg1;
            return var9 * var9 + var10 * var10 < this.field3892 * this.field3892;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3894 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3893 - arg1;
            return var12 * var12 + var13 * var13 < this.field3892 * this.field3892;
        }
    }
}
