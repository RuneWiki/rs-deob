import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class34 extends class62 {

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Z")
    public boolean field375 = false;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method220(int arg0, int arg1) {
        if (!this.field375) {
            return false;
        }
        int var3 = this.field373 - this.field371;
        int var4 = this.field372 - this.field376;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field376 * var4 + this.field371 * var3);
        if (var6 <= 0) {
            int var7 = this.field371 - arg0;
            int var8 = this.field376 - arg1;
            return var7 * var7 + var8 * var8 < this.field374 * this.field374;
        } else if (var6 > var5) {
            int var9 = this.field373 - arg0;
            int var10 = this.field372 - arg1;
            return var9 * var9 + var10 * var10 < this.field374 * this.field374;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field371 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field376 - arg1;
            return var12 * var12 + var13 * var13 < this.field374 * this.field374;
        }
    }
}
