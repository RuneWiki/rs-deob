import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class569 extends class389 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
    public boolean field8082 = false;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public int field8084;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public int field8085;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public int field8086;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Z")
    public final boolean method3308(int arg0, int arg1) {
        if (!this.field8082) {
            return false;
        }
        int var3 = this.field8081 - this.field8083;
        int var4 = this.field8086 - this.field8085;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field8085 * var4 + this.field8083 * var3);
        if (var6 <= 0) {
            int var7 = this.field8083 - arg0;
            int var8 = this.field8085 - arg1;
            return var7 * var7 + var8 * var8 < this.field8084 * this.field8084;
        } else if (var6 > var5) {
            int var9 = this.field8081 - arg0;
            int var10 = this.field8086 - arg1;
            return var9 * var9 + var10 * var10 < this.field8084 * this.field8084;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field8083 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field8085 - arg1;
            return var12 * var12 + var13 * var13 < this.field8084 * this.field8084;
        }
    }
}
