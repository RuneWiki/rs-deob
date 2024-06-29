import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class159 extends class18 {

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
    public boolean field2315 = false;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public int field2318;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)Z", line = 7)
    public final boolean method1033(int arg0, int arg1) {
        if (!this.field2315) {
            return false;
        }
        int var3 = this.field2318 - this.field2314;
        int var4 = this.field2319 - this.field2317;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2317 * var4 + this.field2314 * var3);
        if (var6 <= 0) {
            int var7 = this.field2314 - arg0;
            int var8 = this.field2317 - arg1;
            return var7 * var7 + var8 * var8 < this.field2316 * this.field2316;
        } else if (var6 > var5) {
            int var9 = this.field2318 - arg0;
            int var10 = this.field2319 - arg1;
            return var9 * var9 + var10 * var10 < this.field2316 * this.field2316;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2314 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2317 - arg1;
            return var12 * var12 + var13 * var13 < this.field2316 * this.field2316;
        }
    }
}
