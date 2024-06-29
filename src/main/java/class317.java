import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class317 extends class726 {

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "Z")
    public boolean field4379 = false;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z", line = 10)
    public final boolean method2047(int arg0, int arg1) {
        if (!this.field4379) {
            return false;
        }
        int var3 = this.field4384 - this.field4383;
        int var4 = this.field4382 - this.field4380;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4383 * var3 + this.field4380 * var4);
        if (var6 <= 0) {
            int var7 = this.field4383 - arg0;
            int var8 = this.field4380 - arg1;
            return var7 * var7 + var8 * var8 < this.field4381 * this.field4381;
        } else if (var6 > var5) {
            int var9 = this.field4384 - arg0;
            int var10 = this.field4382 - arg1;
            return var9 * var9 + var10 * var10 < this.field4381 * this.field4381;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4383 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4380 - arg1;
            return var12 * var12 + var13 * var13 < this.field4381 * this.field4381;
        }
    }
}
