import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class105 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1383 = 0;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[S")
    public static short[] field1390 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    public static int[] field1387 = new int[8];

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    public static int[] field1389 = new int[5];

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lna;")
    public static class22 field1382;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
    public static int[] field1385;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lcd;B)Lcd;", line = 6)
    public static final class136 method723(class136 arg0, byte arg1) {
        class136 var2 = client.method951(arg0);
        if (arg1 != 40) {
            field1390 = (short[]) null;
        }
        field1391++;
        if (var2 == null) {
            var2 = arg0.field2126;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V", line = 29)
    public static final void method724(int arg0, int arg1, int arg2) {
        if (class18.field282 > 0) {
            class29.method260(class18.field282, (byte) -109);
            class18.field282 = 0;
        }
        field1384++;
        short var3 = 256;
        int var4 = 0;
        int var5 = class280.field4303 * arg1;
        int var6 = arg2;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class183.field2967[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class57.field789[var4++];
                int var11 = class280.field4310[arg0 + var5++];
                if (var10 == 0) {
                    class260.field4094.field3038[var6++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 256 - var10 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class139.field2214[var10];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class260.field4094.field3038[var6++] = class333.method2319(class333.method2319(16711935, var14) * var12 + class333.method2319(16711935, var11) * var13, -16711936) + class333.method2319(16711680, class333.method2319(var11, 65280) * var13 + class333.method2319(var14, 65280) * var12) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class260.field4094.field3038[var6++] = class280.field4310[var5++ + arg0];
            }
            var5 += class280.field4303 - 128;
        }
        if (class109.field1458) {
            class122.method886(class260.field4094.field3038, arg0, arg1, class260.field4094.field2788, class260.field4094.field2791);
        } else {
            class260.field4094.method1269(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 110)
    public static void method725(int arg0) {
        field1385 = null;
        field1390 = null;
        field1382 = null;
        if (arg0 >= -25) {
            field1389 = (int[]) null;
        }
        field1389 = null;
        field1387 = null;
    }
}
