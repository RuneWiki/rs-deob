import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class187 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Luw;")
    public static class208 field2612 = new class208(44, 4);

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lrn;")
    public static class633 field2614 = new class633(43, 6);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
    public static final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2611++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        if (arg5 != -5367) {
            method1316(47, -101, -1, 41, -108, -58);
        }
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        class54.method333(arg1 + arg2, class207.field2840[arg0], arg5 ^ 0xFFFFEB0E, arg1 - arg2, arg4);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class54.method333(var23, class207.field2840[var21], arg5 ^ 0xFFFFEB0E, var24, arg4);
            class54.method333(var23, class207.field2840[var22], arg5 + 5374, var24, arg4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1317(int arg0) {
        if (arg0 <= 124) {
            method1318(57);
        }
        field2614 = null;
        field2612 = null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static final void method1318(int arg0) {
        for (class403 var1 = (class403) class253.field3440.method3855(0); var1 != null; var1 = (class403) class253.field3440.method3861(true)) {
            if (var1.field5360 > 1) {
                var1.field5360 = 0;
                class655.field8449.method2918(((class765) var1.field5365.field9453.field2279).field10409, var1, 96);
                var1.field5365.method3860((byte) -126);
            }
        }
        field2615++;
        class486.field6268 = 0;
        class628.field7982 = 0;
        class595.field7563.method3594(99);
        class517.field6586.method2617(28812);
        class253.field3440.method3860((byte) 77);
        class525.field6678 = false;
        if (arg0 != 6) {
            method1318(55);
        }
    }
}
