import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class117 extends class294 {

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Z")
    public boolean field1628 = false;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
    public final boolean method840(int arg0, int arg1) {
        if (!this.field1628) {
            return false;
        }
        int var3 = this.field1633 - this.field1631;
        int var4 = this.field1632 - this.field1630;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field1631 * var3 + this.field1630 * var4);
        if (var6 <= 0) {
            int var7 = this.field1631 - arg0;
            int var8 = this.field1630 - arg1;
            return var7 * var7 + var8 * var8 < this.field1629 * this.field1629;
        } else if (var6 > var5) {
            int var9 = this.field1633 - arg0;
            int var10 = this.field1632 - arg1;
            return var9 * var9 + var10 * var10 < this.field1629 * this.field1629;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field1631 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field1630 - arg1;
            return var12 * var12 + var13 * var13 < this.field1629 * this.field1629;
        }
    }
}
