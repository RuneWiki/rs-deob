import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class197 extends class27 {

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
    public boolean field2808 = false;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method1398(int arg0, int arg1) {
        if (!this.field2808) {
            return false;
        }
        int var3 = this.field2813 - this.field2811;
        int var4 = this.field2812 - this.field2810;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2811 * var3 + this.field2810 * var4);
        if (var6 <= 0) {
            int var7 = this.field2811 - arg0;
            int var8 = this.field2810 - arg1;
            return var7 * var7 + var8 * var8 < this.field2809 * this.field2809;
        } else if (var6 > var5) {
            int var9 = this.field2813 - arg0;
            int var10 = this.field2812 - arg1;
            return var9 * var9 + var10 * var10 < this.field2809 * this.field2809;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2811 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2810 - arg1;
            return var12 * var12 + var13 * var13 < this.field2809 * this.field2809;
        }
    }
}
