import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class219 extends class601 {

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "Z")
    public boolean field3000 = false;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Z")
    public final boolean method1434(int arg0, int arg1) {
        if (!this.field3000) {
            return false;
        }
        int var3 = this.field2998 - this.field3001;
        int var4 = this.field3003 - this.field3002;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field3002 * var4 + this.field3001 * var3);
        if (var6 <= 0) {
            int var7 = this.field3001 - arg0;
            int var8 = this.field3002 - arg1;
            return var7 * var7 + var8 * var8 < this.field2999 * this.field2999;
        } else if (var6 > var5) {
            int var9 = this.field2998 - arg0;
            int var10 = this.field3003 - arg1;
            return var9 * var9 + var10 * var10 < this.field2999 * this.field2999;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3001 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3002 - arg1;
            return var12 * var12 + var13 * var13 < this.field2999 * this.field2999;
        }
    }
}
