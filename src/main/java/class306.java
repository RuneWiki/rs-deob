import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class306 extends class416 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    public boolean field4827 = false;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public int field4825;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field4826;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
    public final boolean method2120(int arg0, int arg1) {
        if (!this.field4827) {
            return false;
        }
        int var3 = this.field4828 - this.field4826;
        int var4 = this.field4825 - this.field4823;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4826 * var3 + this.field4823 * var4);
        if (var6 <= 0) {
            int var7 = this.field4826 - arg0;
            int var8 = this.field4823 - arg1;
            return var7 * var7 + var8 * var8 < this.field4824 * this.field4824;
        } else if (var6 > var5) {
            int var9 = this.field4828 - arg0;
            int var10 = this.field4825 - arg1;
            return var9 * var9 + var10 * var10 < this.field4824 * this.field4824;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4826 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4823 - arg1;
            return var12 * var12 + var13 * var13 < this.field4824 * this.field4824;
        }
    }
}
