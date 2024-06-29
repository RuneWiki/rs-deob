import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class234 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Les;B)V", line = 11)
    public static final void method1472(class75 arg0, byte arg1) {
        field3309++;
        boolean var2 = false;
        if (class356.field4972 == arg0.field1131 || arg0.field1128 == -1 || arg0.field1110 != 0) {
            var2 = true;
        } else {
            class372 var3 = class31.field505.method950(true, arg0.field1128);
            if (var3.field5261 || var3.field5283[arg0.field1064] < (arg0.field1126 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1131 - arg0.field1129;
            int var5 = class356.field4972 - arg0.field1129;
            int var6 = arg0.field1095 * 128 + arg0.method206(0) * 64;
            int var7 = arg0.field1098 * 128 + arg0.method206(0) * 64;
            int var8 = arg0.field1085 * 128 + (arg0.method206(0) * 64);
            int var9 = arg0.field1115 * 128 + arg0.method206(0) * 64;
            arg0.field6746 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field6765 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg0.field1137 = 0;
        if (arg0.field1097 == 0) {
            arg0.method511(-14423, 8192);
        }
        if (arg0.field1097 == 1) {
            arg0.method511(-14423, 12288);
        }
        if (arg0.field1097 == 2) {
            arg0.method511(-14423, 0);
        }
        if (arg0.field1097 == 3) {
            arg0.method511(-14423, 4096);
        }
        int var10 = -54 % ((arg1 - 78) / 33);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 68)
    public static final void method1473(byte arg0) {
        if (arg0 != 115) {
            field3312 = 84;
        }
        field3311++;
        class163.field2345 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class293.field4020[var1] = null;
            class238.field3357[var1] = 1;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I", line = 91)
    public static final int method1474(int arg0, int arg1) {
        field3313++;
        if (arg0 != 245721258) {
            field3312 = -95;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILpf;)V", line = 103)
    public static final void method1475(int arg0, class133 arg1) {
        if (arg0 != 64) {
            return;
        }
        arg1.method796(-127);
        field3310++;
        int var2 = class327.field4523;
        class23 var3 = class2.field21 = class310.field4235[var2] = new class23();
        var3.field1119 = var2;
        int var4 = arg1.method801((byte) -87, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFD8AE) >> 14;
        var3.field1144[0] = var6 - class153.field2204;
        int var7 = var4 & 0x3FFF;
        var3.field6765 = (var3.field1144[0] << 7) + (var3.method206(0) << 6);
        var3.field1140[0] = var7 - class325.field4472;
        var3.field6746 = (var3.field1140[0] << 7) + (var3.method206(0) << 6);
        class76.field1161 = var3.field6766 = var5;
        if (class293.field4020[var2] != null) {
            var3.method188(false, class293.field4020[var2]);
        }
        class163.field2345 = 0;
        class482.field6800[class163.field2345++] = var2;
        class363.field5184[var2] = 0;
        class128.field1813 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method801((byte) -87, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFE2) >> 8;
                int var12 = var9 & 0xFF;
                class10.field194[var8] = (var10 << 28) + var12 + (var11 << 14);
                class84.field1266[var8] = 0;
                class189.field2713[var8] = -1;
                class90.field1343[class128.field1813++] = var8;
                class363.field5184[var8] = 0;
            }
        }
        arg1.method806((byte) -108);
    }
}
