import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class273 extends class100 {

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Z")
    public boolean field4520 = false;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Z", line = 11)
    public final boolean method1811(int arg0, int arg1) {
        if (!this.field4520) {
            return false;
        }
        int var3 = this.field4521 - this.field4517;
        int var4 = this.field4518 - this.field4516;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4517 * var3 + this.field4516 * var4);
        if (var6 <= 0) {
            int var7 = this.field4517 - arg0;
            int var8 = this.field4516 - arg1;
            return var7 * var7 + var8 * var8 < this.field4519 * this.field4519;
        } else if (var6 > var5) {
            int var9 = this.field4521 - arg0;
            int var10 = this.field4518 - arg1;
            return var9 * var9 + var10 * var10 < this.field4519 * this.field4519;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4517 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4516 - arg1;
            return var12 * var12 + var13 * var13 < this.field4519 * this.field4519;
        }
    }
}
