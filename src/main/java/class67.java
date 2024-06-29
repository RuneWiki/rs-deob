import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class67 extends class50 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
    public boolean field1057 = false;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)Z", line = 4)
    public final boolean method398(int arg0, int arg1) {
        if (!this.field1057) {
            return false;
        }
        int var3 = this.field1056 - this.field1059;
        int var4 = this.field1058 - this.field1055;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1059 * var3 + this.field1055 * var4);
        if (var6 <= 0) {
            int var7 = this.field1059 - arg0;
            int var8 = this.field1055 - arg1;
            return var7 * var7 + var8 * var8 < this.field1060 * this.field1060;
        } else if (var6 > var5) {
            int var9 = this.field1056 - arg0;
            int var10 = this.field1058 - arg1;
            return var9 * var9 + var10 * var10 < this.field1060 * this.field1060;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1059 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1055 - arg1;
            return var12 * var12 + var13 * var13 < this.field1060 * this.field1060;
        }
    }
}
