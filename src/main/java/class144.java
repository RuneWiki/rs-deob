import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class144 extends class111 {

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Z")
    public boolean field2158 = false;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z", line = 9)
    public final boolean method1069(int arg0, int arg1) {
        if (!this.field2158) {
            return false;
        }
        int var3 = this.field2163 - this.field2162;
        int var4 = this.field2161 - this.field2159;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2162 * var3 + this.field2159 * var4);
        if (var6 <= 0) {
            int var7 = this.field2162 - arg0;
            int var8 = this.field2159 - arg1;
            return var7 * var7 + var8 * var8 < this.field2160 * this.field2160;
        } else if (var6 > var5) {
            int var9 = this.field2163 - arg0;
            int var10 = this.field2161 - arg1;
            return var9 * var9 + var10 * var10 < this.field2160 * this.field2160;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2162 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2159 - arg1;
            return var12 * var12 + var13 * var13 < this.field2160 * this.field2160;
        }
    }
}
