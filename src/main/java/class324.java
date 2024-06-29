import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class324 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4456 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[B")
    public static byte[] field4454 = new byte[2048];

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[Lab;")
    public static class473[] field4457 = new class473[8];

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLqa;)V", line = 8)
    public static final void method1819(boolean arg0, class162 arg1) {
        field4455++;
        int var2 = class267.field3662;
        int var3 = class217.field3071;
        int var4 = class312.field4293;
        int var5 = class224.field3155;
        if (!arg0) {
            method1819(false, null);
        }
        int var6 = -10660793;
        arg1.method1006(var2, var6, var3, var5, 1, var4);
        arg1.method1006(var2 + 1, -16777216, var3 + 1, 16, 1, var4 - 2);
        arg1.method1003(-16777216, var5 - 19, 1, var2 + 1, var3 + 18, var4 - 2);
        class34.field487.method2881(class56.field767.method590(class105.field1434, -22602), (byte) -127, var6, var2 + 3, -1, var3 - -14);
        int var7 = class332.field4528.method54(113);
        int var8 = class332.field4528.method55((byte) -67);
        int var9 = 0;
        for (class149 var10 = (class149) class260.field3585.method3072((byte) 75); var10 != null; var10 = (class149) class260.field3585.method3066(2)) {
            int var11 = (class370.field5198 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && (var2 + var4) > var7 && (var11 - 13) < var8 && var11 + 3 > var8 && var10.field2100) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class230.method1346(var10.field2102, -106)) {
                var13 = class75.field1097.method823(!arg0, (int) var10.field2105).field4381;
            } else if (var10.field2101 != -1) {
                var13 = class75.field1097.method823(!arg0, var10.field2101).field4381;
            } else if (class411.method2447((byte) 76, var10.field2102)) {
                class405 var14 = class179.field2534[(int) var10.field2105];
                if (var14 != null) {
                    class336 var15 = var14.field5623;
                    if (var15.field4612 != null) {
                        var15 = var15.method1860(class453.field6623, (byte) -93);
                    }
                    if (var15 != null) {
                        var13 = var15.field4603;
                    }
                }
            } else if (class67.method418(var10.field2102, -125)) {
                Object var16 = null;
                class132 var17;
                if (var10.field2102 == 1003) {
                    var17 = class82.field1154.method2121((int) var10.field2105, true);
                } else {
                    var17 = class82.field1154.method2121((int) (var10.field2105 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var17.field1814 != null) {
                    var17 = var17.method870(0, class453.field6623);
                }
                if (var17 != null) {
                    var13 = var17.field1888;
                }
            }
            String var18 = class224.method1327(var10, 6645);
            if (var13 != null) {
                var18 = var18 + class334.method1851(var13, 0);
            }
            class34.field487.method2882(0, class119.field1615, var11, var18, -120, class272.field3713, var2 + 3, var12);
            if (var10.field2099) {
                class106.field1442.method3111(var2 + (class105.field1430.method362(var18, (byte) 74) + 5), var11 + -12);
            }
            var9++;
        }
        class170.method1056(class312.field4293, class224.field3155, class217.field3071, class267.field3662, (byte) 49);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 122)
    public static void method1820(int arg0) {
        field4457 = null;
        if (arg0 != 24837) {
            method1819(true, null);
        }
        field4454 = null;
    }
}
