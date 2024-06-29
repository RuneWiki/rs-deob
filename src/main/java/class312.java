import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class312 extends class225 {

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lvk;")
    public static class56 field4570 = new class56(128);

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[B")
    public static byte[] field4574 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static volatile int field4572 = -1;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Llm;")
    public static class347 field4573;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public static void method2111(int arg0) {
        field4574 = null;
        field4570 = null;
        if (arg0 <= 115) {
            method2112(-22, (byte) -51, 40);
        }
        field4573 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)V")
    public static final void method2112(int arg0, byte arg1, int arg2) {
        int var3 = class400.field5969 * arg0 >> 8;
        field4569++;
        if (arg2 == -1 && !class7.field123) {
            class32.method214(true);
        } else if (arg2 != -1 && (class196.field2626 != arg2 || !class298.method2039(false)) && var3 != 0 && !class7.field123) {
            class435.method2747(class385.field5583, arg1 ^ 0xFFFFFFEA, 2, var3, arg2, false, 0);
        }
        class196.field2626 = arg2;
        if (arg1 != -21) {
            field4572 = 94;
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)I")
    public static final int method2113(int arg0) {
        field4567++;
        if (arg0 != 21410) {
            field4572 = 30;
        }
        if (class320.field4689) {
            return 0;
        } else if (class11.method79((byte) -128)) {
            return class93.field1342 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4571++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        if (arg3 != 90724161) {
            field4572 = 100;
        }
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class207.method1221((byte) -125, arg5 - arg1, arg5 - -arg1, class384.field5560[arg2], arg4);
        int var20 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class207.method1221((byte) -128, var24, var23, class384.field5560[var21], arg4);
            class207.method1221((byte) -128, var24, var23, class384.field5560[var22], arg4);
        }
    }
}
