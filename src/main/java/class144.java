import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class144 extends class90 {

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "Z")
    public boolean field2428 = false;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)Z")
    public final boolean method1162(int arg0, int arg1) {
        if (!this.field2428) {
            return false;
        }
        int var3 = this.field2429 - this.field2433;
        int var4 = this.field2431 - this.field2430;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field2433 * var3 + this.field2430 * var4);
        if (var6 <= 0) {
            int var7 = this.field2433 - arg0;
            int var8 = this.field2430 - arg1;
            return var7 * var7 + var8 * var8 < this.field2432 * this.field2432;
        } else if (var6 > var5) {
            int var9 = this.field2429 - arg0;
            int var10 = this.field2431 - arg1;
            return var9 * var9 + var10 * var10 < this.field2432 * this.field2432;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field2433 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field2430 - arg1;
            return var12 * var12 + var13 * var13 < this.field2432 * this.field2432;
        }
    }
}
