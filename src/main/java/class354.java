import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class354 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILje;)V")
    public static final void method2142(int arg0, int arg1, class98 arg2) {
        field5020++;
        if (class57.field884 >= 50 || arg2 == null || arg2.field1424 == null || arg1 >= arg2.field1424.length || arg2.field1424[arg1] == null) {
            return;
        }
        int var3 = arg2.field1424[arg1][0];
        int var4 = var3 >> 8;
        if (arg0 != 255) {
            return;
        }
        if (arg2.field1424[arg1].length > 1) {
            int var5 = (int) ((double) arg2.field1424[arg1].length * Math.random());
            if (var5 > 0) {
                var4 = arg2.field1424[arg1][var5];
            }
        }
        int var6 = var3 >> 5 & 0x7;
        int var7 = 256;
        if (arg2.field1389 != null && arg2.field1422 != null) {
            var7 = class702.method3932(arg0 - 255, arg2.field1422[arg1], arg2.field1389[arg1]);
        }
        if (arg2.field1399) {
            class75.method691(var6, 255, var4, 0, var7, false, 0);
        } else {
            class588.method3448(var4, var6, 255, var7, -1, 0);
        }
    }
}
