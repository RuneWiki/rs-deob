import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class576 {

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)[B")
    public static final byte[] method3367(int arg0, int arg1) {
        field8424++;
        if (arg1 >= -125) {
            method3368(77, 51, true);
        }
        class88 var2 = (class88) class314.field4125.method3241(-26958, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class517.method3062(var4, 26100, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class88(var3);
            class314.field4125.method3240(var2, 42, (long) arg0);
        }
        return var2.field1241;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZ)I")
    public static final int method3368(int arg0, int arg1, boolean arg2) {
        field8423++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg2) {
            return -77;
        } else {
            double var5 = Math.log((double) arg0) / Math.log(2.0D);
            double var7 = var5 + Math.random() * (var3 - var5);
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        }
    }
}
