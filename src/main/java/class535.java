import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class535 extends class651 {

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
    public boolean field7769 = false;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public int field7764;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public int field7765;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public int field7767;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)Z")
    public final boolean method4059(int arg0, int arg1) {
        if (!this.field7769) {
            return false;
        }
        int var3 = this.field7767 - this.field7766;
        int var4 = this.field7768 - this.field7764;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7766 * var3 + this.field7764 * var4);
        if (var6 <= 0) {
            int var7 = this.field7766 - arg0;
            int var8 = this.field7764 - arg1;
            return var7 * var7 + var8 * var8 < this.field7765 * this.field7765;
        } else if (var6 > var5) {
            int var9 = this.field7767 - arg0;
            int var10 = this.field7768 - arg1;
            return var9 * var9 + var10 * var10 < this.field7765 * this.field7765;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7766 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7764 - arg1;
            return var12 * var12 + var13 * var13 < this.field7765 * this.field7765;
        }
    }
}
