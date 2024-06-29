import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class107 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1527 = "red:";

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1529 = "Hidden";

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lue;")
    public static class222 field1530 = new class222(16);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBIII)V")
    public static final void method678(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1528++;
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg3;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = var7 << 1;
        int var13 = var9 - ((var11 - 1) * var12);
        int var14 = (1 - var11) * var7 + var10;
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (arg3 - 1) * var15;
        if (arg2 != -95) {
            method679(-35);
        }
        int var19 = (var6 + 1) * var16;
        if (arg4 >= class271.field4322 && class311.field5001 >= arg4) {
            int var20 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 + arg5);
            int var21 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 - arg5);
            class129.method822(class247.field3876[arg4], var21, -2426, arg1, var20);
        }
        int var22 = ((arg3 << 1) - 3) * var12;
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var13 += var19;
                    var19 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            if (var13 < 0) {
                var14 += var17;
                var13 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var8--;
            var18 -= var15;
            int var23 = arg4 - var8;
            var13 += -var22;
            int var24 = arg4 + var8;
            var22 -= var15;
            if (class271.field4322 <= var24 && var23 <= class311.field5001) {
                int var25 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 + var6);
                int var26 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg0 - var6);
                if (class271.field4322 <= var23) {
                    class129.method822(class247.field3876[var23], var26, -2426, arg1, var25);
                }
                if (class311.field5001 >= var24) {
                    class129.method822(class247.field3876[var24], var26, arg2 ^ 0x927, arg1, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method679(int arg0) {
        int var1 = -60 % ((arg0 + 29) / 41);
        field1529 = null;
        field1527 = null;
        field1530 = null;
    }
}
