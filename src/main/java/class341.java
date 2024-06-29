import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class341 extends class379 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    public boolean field4729 = false;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field4726;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Z")
    public final boolean method2076(int arg0, int arg1) {
        if (!this.field4729) {
            return false;
        }
        int var3 = this.field4730 - this.field4728;
        int var4 = this.field4727 - this.field4726;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field4728 * var3 + this.field4726 * var4);
        if (var6 <= 0) {
            int var7 = this.field4728 - arg0;
            int var8 = this.field4726 - arg1;
            return var7 * var7 + var8 * var8 < this.field4731 * this.field4731;
        } else if (var6 > var5) {
            int var9 = this.field4730 - arg0;
            int var10 = this.field4727 - arg1;
            return var9 * var9 + var10 * var10 < this.field4731 * this.field4731;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field4728 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field4726 - arg1;
            return var12 * var12 + var13 * var13 < this.field4731 * this.field4731;
        }
    }
}
