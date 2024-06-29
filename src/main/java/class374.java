import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class374 extends class321 {

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Z")
    public boolean field5087 = false;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Z", line = 11)
    public final boolean method2173(int arg0, int arg1) {
        if (!this.field5087) {
            return false;
        }
        int var3 = this.field5088 - this.field5089;
        int var4 = this.field5090 - this.field5092;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field5092 * var4 + this.field5089 * var3);
        if (var6 <= 0) {
            int var7 = this.field5089 - arg0;
            int var8 = this.field5092 - arg1;
            return var7 * var7 + var8 * var8 < this.field5091 * this.field5091;
        } else if (var6 > var5) {
            int var9 = this.field5088 - arg0;
            int var10 = this.field5090 - arg1;
            return var9 * var9 + var10 * var10 < this.field5091 * this.field5091;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field5089 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field5092 - arg1;
            return var12 * var12 + var13 * var13 < this.field5091 * this.field5091;
        }
    }
}
