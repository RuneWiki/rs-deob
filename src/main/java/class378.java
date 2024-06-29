import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class378 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field5252 = 0;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field5255 = 1337;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([BI)Lch;")
    public static final class464 method2220(byte[] arg0, int arg1) {
        field5254++;
        class464 var2 = new class464();
        class611 var3 = new class611(arg0);
        var3.field8520 = var3.field8529.length - 2;
        int var4 = var3.method3402((byte) 127);
        int var5 = var3.field8529.length - var4 - 2 - 12;
        var3.field8520 = var5;
        int var6 = var3.method3418(-2);
        var2.field6423 = var3.method3402((byte) 127);
        var2.field6429 = var3.method3402((byte) 127);
        var2.field6431 = var3.method3402((byte) 127);
        var2.field6430 = var3.method3402((byte) 127);
        int var7 = var3.method3428((byte) 39);
        if (var7 > 0) {
            var2.field6421 = new class459[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3402((byte) 127);
                class459 var10 = new class459(class128.method814(423660257, var9));
                var2.field6421[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method3418(-2);
                    int var12 = var3.method3418(-2);
                    var10.method2558(new class629(var12), (long) var11, -1);
                }
            }
        }
        var3.field8520 = 0;
        var2.field6433 = var3.method3421(-1);
        var2.field6424 = new String[var6];
        var2.field6428 = new int[var6];
        var2.field6432 = new int[var6];
        int var13 = arg1;
        while (var5 > var3.field8520) {
            int var14 = var3.method3402((byte) 127);
            if (var14 == 3) {
                var2.field6424[var13] = var3.method3403((byte) 84).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6432[var13] = var3.method3428((byte) 111);
            } else {
                var2.field6432[var13] = var3.method3418(arg1 - 2);
            }
            var2.field6428[var13++] = var14;
        }
        return var2;
    }
}
