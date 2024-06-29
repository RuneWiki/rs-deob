import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class711 extends class571 {

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
    public boolean field9875 = false;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field9872;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public int field9873;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field9874;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field9876;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public int field9877;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method4004(int arg0, int arg1) {
        if (!this.field9875) {
            return false;
        }
        int var3 = this.field9877 - this.field9872;
        int var4 = this.field9874 - this.field9876;
        int var5 = var3 * var3 + var4 * var4;
        int var6 = arg0 * var3 + arg1 * var4 - (this.field9876 * var4 + this.field9872 * var3);
        if (var6 <= 0) {
            int var7 = this.field9872 - arg0;
            int var8 = this.field9876 - arg1;
            return var7 * var7 + var8 * var8 < this.field9873 * this.field9873;
        } else if (var6 > var5) {
            int var9 = this.field9877 - arg0;
            int var10 = this.field9874 - arg1;
            return var9 * var9 + var10 * var10 < this.field9873 * this.field9873;
        } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field9872 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field9876 - arg1;
            return var12 * var12 + var13 * var13 < this.field9873 * this.field9873;
        }
    }
}
