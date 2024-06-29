import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class115 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1564 = -1;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lqa;")
    public static class243 field1563;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[[[B")
    public static byte[][][] field1566;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 3)
    public static void method799(byte arg0) {
        if (arg0 >= -63) {
            method801(-10, (byte) -30);
        }
        field1566 = null;
        field1563 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)V", line = 30)
    public static final void method800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1565++;
        int var8 = class143.method950(-15543, class50.field695, class180.field2375, arg5);
        int var9 = class143.method950(arg2 - 15542, class50.field695, class180.field2375, arg1);
        int var10 = class143.method950(-15543, class297.field4268, class203.field2942, arg4);
        int var11 = class143.method950(arg2 ^ 0x3CB6, class297.field4268, class203.field2942, arg6);
        int var12 = class143.method950(arg2 ^ 0x3CB6, class50.field695, class180.field2375, arg5 + arg0);
        if (arg2 != -1) {
            return;
        }
        int var13 = class143.method950(-15543, class50.field695, class180.field2375, arg1 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class370.method2440(var11, class227.field3201[var14], arg7, var10, arg2 ^ 0xFFFFFF87);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class370.method2440(var11, class227.field3201[var15], arg7, var10, 123);
        }
        int var16 = class143.method950(-15543, class297.field4268, class203.field2942, arg0 + arg4);
        int var17 = class143.method950(-15543, class297.field4268, class203.field2942, arg6 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class227.field3201[var18];
            class370.method2440(var16, var19, arg7, var10, 69);
            class370.method2440(var17, var19, arg3, var16, 112);
            class370.method2440(var11, var19, arg7, var17, arg2 + 99);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V", line = 83)
    public static final void method801(int arg0, byte arg1) {
        class395.field5935 = 100;
        class423.field6297 = arg0;
        class263.field3834 = -1;
        if (arg1 != -127) {
            field1560 = -111;
        }
        field1562++;
        class292.field4230 = 3;
    }
}
