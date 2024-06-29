import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class314 extends class681 {

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
    public boolean field4099 = false;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
    public final boolean method1868(int arg0, int arg1) {
        if (!this.field4099) {
            return false;
        }
        int var3 = this.field4101 - this.field4102;
        int var4 = this.field4100 - this.field4098;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4102 * var3 + this.field4098 * var4);
        if (var6 <= 0) {
            int var7 = this.field4102 - arg0;
            int var8 = this.field4098 - arg1;
            return var7 * var7 + var8 * var8 < this.field4103 * this.field4103;
        } else if (var6 > var5) {
            int var9 = this.field4101 - arg0;
            int var10 = this.field4100 - arg1;
            return var9 * var9 + var10 * var10 < this.field4103 * this.field4103;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4102 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4098 - arg1;
            return var12 * var12 + var13 * var13 < this.field4103 * this.field4103;
        }
    }
}
