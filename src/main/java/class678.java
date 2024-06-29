import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class678 extends class696 {

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
    public boolean field9208 = false;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field9203;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    public int field9204;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public int field9205;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public int field9206;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    public int field9207;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
    public final boolean method3642(int arg0, int arg1) {
        if (!this.field9208) {
            return false;
        }
        int var3 = this.field9205 - this.field9207;
        int var4 = this.field9204 - this.field9203;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field9207 * var3 + this.field9203 * var4);
        if (var6 <= 0) {
            int var7 = this.field9207 - arg0;
            int var8 = this.field9203 - arg1;
            return var7 * var7 + var8 * var8 < this.field9206 * this.field9206;
        } else if (var6 > var5) {
            int var9 = this.field9205 - arg0;
            int var10 = this.field9204 - arg1;
            return var9 * var9 + var10 * var10 < this.field9206 * this.field9206;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field9207 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field9203 - arg1;
            return var12 * var12 + var13 * var13 < this.field9206 * this.field9206;
        }
    }
}
