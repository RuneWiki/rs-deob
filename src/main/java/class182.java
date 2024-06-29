import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class182 extends class221 {

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
    public boolean field2643 = false;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Z")
    public final boolean method1148(int arg0, int arg1) {
        if (!this.field2643) {
            return false;
        }
        int var3 = this.field2642 - this.field2644;
        int var4 = this.field2645 - this.field2640;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2644 * var3 + this.field2640 * var4);
        if (var6 <= 0) {
            int var7 = this.field2644 - arg0;
            int var8 = this.field2640 - arg1;
            return var7 * var7 + var8 * var8 < this.field2641 * this.field2641;
        } else if (var6 > var5) {
            int var9 = this.field2642 - arg0;
            int var10 = this.field2645 - arg1;
            return var9 * var9 + var10 * var10 < this.field2641 * this.field2641;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2644 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2640 - arg1;
            return var12 * var12 + var13 * var13 < this.field2641 * this.field2641;
        }
    }
}
