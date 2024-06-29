import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class478 extends class272 {

    @OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
    public boolean field6617 = false;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public int field6613;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public int field6614;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public int field6615;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public int field6616;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public int field6618;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method2797(int arg0, int arg1) {
        if (!this.field6617) {
            return false;
        }
        int var3 = this.field6615 - this.field6613;
        int var4 = this.field6616 - this.field6614;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field6614 * var4 + this.field6613 * var3);
        if (var6 <= 0) {
            int var7 = this.field6613 - arg0;
            int var8 = this.field6614 - arg1;
            return var7 * var7 + var8 * var8 < this.field6618 * this.field6618;
        } else if (var6 > var5) {
            int var9 = this.field6615 - arg0;
            int var10 = this.field6616 - arg1;
            return var9 * var9 + var10 * var10 < this.field6618 * this.field6618;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field6613 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field6614 - arg1;
            return var12 * var12 + var13 * var13 < this.field6618 * this.field6618;
        }
    }
}
