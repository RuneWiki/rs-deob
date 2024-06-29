import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class330 extends class102 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public boolean field4802 = false;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
    public final boolean method2192(int arg0, int arg1) {
        if (!this.field4802) {
            return false;
        }
        int var3 = this.field4803 - this.field4800;
        int var4 = this.field4805 - this.field4801;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4801 * var4 + this.field4800 * var3);
        if (var6 <= 0) {
            int var7 = this.field4800 - arg0;
            int var8 = this.field4801 - arg1;
            return var7 * var7 + var8 * var8 < this.field4804 * this.field4804;
        } else if (var6 > var5) {
            int var9 = this.field4803 - arg0;
            int var10 = this.field4805 - arg1;
            return var9 * var9 + var10 * var10 < this.field4804 * this.field4804;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4800 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4801 - arg1;
            return var12 * var12 + var13 * var13 < this.field4804 * this.field4804;
        }
    }
}
