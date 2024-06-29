import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class451 {

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "Lki;")
    public static class364 field5885 = new class364();

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V", line = 13)
    public static void method2547(int arg0) {
        int var1 = -72 % ((-arg0 - 1) / 53);
        field5885 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljq;IIIIZI)V", line = 22)
    public static final void method2548(class348 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field5884++;
        if (class202.field2639 >= 50 || arg0 == null || arg0.field4461 == null || arg0.field4461.length <= arg6 || arg0.field4461[arg6] == null) {
            return;
        }
        int var7 = arg0.field4461[arg6][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg0.field4461[arg6].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field4461[arg6].length);
            if (var10 > 0) {
                var8 = arg0.field4461[arg6][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg5) {
                if (!arg0.field4455) {
                    class520.method2795(false, 255, var8, var9, 0);
                    return;
                }
                class285.method1700(var9, var8, (byte) -110, 0, false, 255);
            }
        } else if (class260.field3509.field1285 != 0) {
            int var12 = arg3 - 256 >> 9;
            int var13 = arg2 - 256 >> 9;
            class47.field666[class202.field2639++] = new class64((byte) (arg0.field4455 ? 2 : 1), var8, var9, 0, arg4, (var13 << 8) + (arg1 << 24) + (var12 << 16) + var11);
        }
    }
}
