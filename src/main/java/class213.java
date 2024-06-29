import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class213 {

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
    public static boolean field3383 = false;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
    public static int[] field3382;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public abstract void method908(int arg0, byte arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILrg;)V")
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, class248 arg4) {
        field3379++;
        if (arg3 < 86) {
            field3381 = -113;
        }
        if (class31.field531 < 3) {
            ((class67) class178.field2959).method462(arg2, arg1, arg4.field4016, arg4.field4057, class178.field2959.field4784 / 2, class178.field2959.field4780 / 2, (int) class114.field1742, 256, arg4.field3993, arg4.field3934);
        } else {
            class94.method667(arg2, arg1, 0, arg4.field3993, arg4.field3934);
        }
        class197.field3170[arg0] = true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public abstract int method900(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lgm;")
    public abstract class226 method907(byte arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public static final void method1466(int arg0, int arg1, int arg2) {
        short var3 = 256;
        if (class200.field3201 > 0) {
            class198.method1371(class200.field3201, -1234642777);
            class200.field3201 = 0;
        }
        field3380++;
        int var4 = 0;
        int var5 = class94.field1496 * arg1;
        int var6 = 0;
        if (arg2 != 0) {
            return;
        }
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class302.field4944[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class94.field1495[var5++ + arg0];
                int var12 = class225.field3543[var4++];
                if (var12 == 0) {
                    class275.field4506.field1082[var6++] = var11;
                } else {
                    int var13 = var12 + 18;
                    int var14 = 238 - var12;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class277.field4528[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class275.field4506.field1082[var6++] = class233.method1609(var13 * class233.method1609(var15, 65280) + class233.method1609(65280, var11) * var14, 16711680) + class233.method1609(var13 * class233.method1609(16711935, var15) + var14 * class233.method1609(var11, 16711935), -16711936) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class275.field4506.field1082[var6++] = class94.field1495[var5++ + arg0];
            }
            var5 += class94.field1496 - 128;
        }
        class275.field4506.method463(arg0, arg1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method1467(boolean arg0) {
        if (arg0) {
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method898(int arg0, byte arg1);
}
