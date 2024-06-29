import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class424 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2448(byte arg0) {
        if (arg0 != -122) {
            method2449(37);
        }
        class289.field3961 = -1;
        class525.field7124 = -1;
        field5956++;
        class533.field7214 = 0;
        class234.field3232 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 23)
    public static final void method2449(int arg0) {
        field5955++;
        if (arg0 <= 12) {
            method2448((byte) -3);
        }
        if (class704.field9958 == null) {
            return;
        }
        if (class704.field9958.field948 == 1) {
            class704.field9958 = null;
            return;
        }
        if (class704.field9958.field948 == 2) {
            class316.method1911(class77.field1014, class136.field1923, 32445, 2);
            class704.field9958 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)Lls;", line = 53)
    public static final class124 method2450(int arg0, byte arg1, int arg2, int arg3) {
        field5957++;
        class390 var4 = class295.field4051[arg0][arg2][arg3];
        if (arg1 >= -45) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class124 var5 = null;
            int var6 = -1;
            for (class467 var7 = var4.field5536; var7 != null; var7 = var7.field6421) {
                class210 var8 = var7.field6419;
                if (var8 instanceof class124) {
                    class124 var9 = (class124) var8;
                    int var10 = var9.method881(-127) * 256 - 4;
                    int var11 = var9.field4042 - var10 >> 9;
                    int var12 = var9.field4047 - var10 >> 9;
                    int var13 = var9.field4042 + var10 >> 9;
                    int var14 = var9.field4047 + var10 >> 9;
                    if (var11 <= arg2 && var12 <= arg3 && arg2 <= var13 && var14 >= arg3) {
                        int var15 = (var13 + 1 - arg2) * (var14 + 1 - arg3);
                        if (var15 > var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }
}
