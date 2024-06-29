import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class206 extends class275 {

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Z")
    public boolean field2970 = false;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
    public final boolean method1302(int arg0, int arg1) {
        if (!this.field2970) {
            return false;
        }
        int var3 = this.field2974 - this.field2975;
        int var4 = this.field2973 - this.field2971;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2975 * var3 + this.field2971 * var4);
        if (var6 <= 0) {
            int var7 = this.field2975 - arg0;
            int var8 = this.field2971 - arg1;
            return var7 * var7 + var8 * var8 < this.field2972 * this.field2972;
        } else if (var6 > var5) {
            int var9 = this.field2974 - arg0;
            int var10 = this.field2973 - arg1;
            return var9 * var9 + var10 * var10 < this.field2972 * this.field2972;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2975 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2971 - arg1;
            return var12 * var12 + var13 * var13 < this.field2972 * this.field2972;
        }
    }
}
