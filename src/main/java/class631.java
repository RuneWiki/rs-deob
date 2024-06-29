import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class631 extends class142 {

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
    public boolean field9232 = false;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field9233;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public int field9234;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public int field9235;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public int field9236;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public int field9237;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
    public final boolean method3673(int arg0, int arg1) {
        if (!this.field9232) {
            return false;
        }
        int var3 = this.field9237 - this.field9236;
        int var4 = this.field9234 - this.field9235;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field9236 * var3 + this.field9235 * var4);
        if (var6 <= 0) {
            int var7 = this.field9236 - arg0;
            int var8 = this.field9235 - arg1;
            return var7 * var7 + var8 * var8 < this.field9233 * this.field9233;
        } else if (var6 > var5) {
            int var9 = this.field9237 - arg0;
            int var10 = this.field9234 - arg1;
            return var9 * var9 + var10 * var10 < this.field9233 * this.field9233;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field9236 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field9235 - arg1;
            return var12 * var12 + var13 * var13 < this.field9233 * this.field9233;
        }
    }
}
