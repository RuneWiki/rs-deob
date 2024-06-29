import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class525 extends class121 {

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Z")
    public boolean field7771 = false;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public int field7767;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field7768;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public int field7769;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public int field7770;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
    public final boolean method3096(int arg0, int arg1) {
        if (!this.field7771) {
            return false;
        }
        int var3 = this.field7768 - this.field7767;
        int var4 = this.field7770 - this.field7769;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field7769 * var4 + this.field7767 * var3);
        if (var6 <= 0) {
            int var7 = this.field7767 - arg0;
            int var8 = this.field7769 - arg1;
            return var7 * var7 + var8 * var8 < this.field7766 * this.field7766;
        } else if (var6 > var5) {
            int var9 = this.field7768 - arg0;
            int var10 = this.field7770 - arg1;
            return var9 * var9 + var10 * var10 < this.field7766 * this.field7766;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field7767 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field7769 - arg1;
            return var12 * var12 + var13 * var13 < this.field7766 * this.field7766;
        }
    }
}
