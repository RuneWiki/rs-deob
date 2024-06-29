import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class21 extends class461 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Z")
    public boolean field180 = false;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
    public final boolean method90(int arg0, int arg1) {
        if (!this.field180) {
            return false;
        }
        int var3 = this.field181 - this.field179;
        int var4 = this.field182 - this.field184;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field184 * var4 + this.field179 * var3);
        if (var6 <= 0) {
            int var7 = this.field179 - arg0;
            int var8 = this.field184 - arg1;
            return var7 * var7 + var8 * var8 < this.field183 * this.field183;
        } else if (var6 > var5) {
            int var9 = this.field181 - arg0;
            int var10 = this.field182 - arg1;
            return var9 * var9 + var10 * var10 < this.field183 * this.field183;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field179 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field184 - arg1;
            return var12 * var12 + var13 * var13 < this.field183 * this.field183;
        }
    }
}
