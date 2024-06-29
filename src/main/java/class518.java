import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class518 extends class345 {

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Z")
    public boolean field7600 = false;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field7596;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public int field7597;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field7598;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field7599;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method3068(int arg0, int arg1) {
        if (!this.field7600) {
            return false;
        }
        int var3 = this.field7596 - this.field7597;
        int var4 = this.field7599 - this.field7601;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7601 * var4 + this.field7597 * var3);
        if (var6 <= 0) {
            int var7 = this.field7597 - arg0;
            int var8 = this.field7601 - arg1;
            return var7 * var7 + var8 * var8 < this.field7598 * this.field7598;
        } else if (var6 > var5) {
            int var9 = this.field7596 - arg0;
            int var10 = this.field7599 - arg1;
            return var9 * var9 + var10 * var10 < this.field7598 * this.field7598;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7597 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7601 - arg1;
            return var12 * var12 + var13 * var13 < this.field7598 * this.field7598;
        }
    }
}
