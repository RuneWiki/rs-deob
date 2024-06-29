import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class455 extends class399 {

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Z")
    public boolean field6202 = false;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public int field6203;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field6204;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public int field6205;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public int field6206;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z")
    public final boolean method2579(int arg0, int arg1) {
        if (!this.field6202) {
            return false;
        }
        int var3 = this.field6206 - this.field6204;
        int var4 = this.field6201 - this.field6203;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6204 * var3 + this.field6203 * var4);
        if (var6 <= 0) {
            int var7 = this.field6204 - arg0;
            int var8 = this.field6203 - arg1;
            return var7 * var7 + var8 * var8 < this.field6205 * this.field6205;
        } else if (var6 > var5) {
            int var9 = this.field6206 - arg0;
            int var10 = this.field6201 - arg1;
            return var9 * var9 + var10 * var10 < this.field6205 * this.field6205;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6204 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6203 - arg1;
            return var12 * var12 + var13 * var13 < this.field6205 * this.field6205;
        }
    }
}
