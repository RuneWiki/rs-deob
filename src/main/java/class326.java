import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class326 extends class418 {

    @OriginalMember(owner = "client!bga", name = "P", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field4433;
        int[][] var3 = super.field377.method3683(arg0, (byte) 122);
        if (arg1 != 7) {
            return null;
        } else {
            if (super.field377.field9085 && this.method2428(32167)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field5906 * super.field5906;
                for (int var8 = 0; class31.field399 > var8; ++var8) {
                    int var9 = super.field5900[var7 - -(var8 % super.field5905)];
                    var6[var8] = class136.method950(255, var9) << 4;
                    var5[var8] = class136.method950(4080, var9 >> 4);
                    var4[var8] = class136.method950(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }
}
