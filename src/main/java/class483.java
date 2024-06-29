import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class483 extends class9 {

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
    public static int[] field6754 = new int[13];

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Ljs;")
    public static class275 field6755 = new class275(12, 0, 1, 0);

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILqa;)V", line = 5)
    public static final void method2802(int arg0, class206 arg1) {
        field6756++;
        int var2 = class308.field3933;
        int var3 = class521.field7314;
        int var4 = class609.field8848;
        int var5 = class594.field8623;
        int var6 = -10660793;
        arg1.method1118(var6, (byte) 53, var4, var2, var3, var5);
        arg1.method1118(-16777216, (byte) 61, var4 - 2, var2 - -1, var3 + 1, arg0);
        arg1.method1151(var3 + 18, var4 + -2, -16777216, var5 - 19, (byte) 109, var2 + 1);
        class459.field6320.method540(var6, var3 + 14, class31.field237.method987(class31.field247, 22), var2 + 3, -1, false);
        int var7 = class368.field4859.method167(arg0 + 48);
        int var8 = class368.field4859.method169(26);
        int var9 = 0;
        for (class99 var10 = (class99) class89.field1096.method1050((byte) 73); var10 != null; var10 = (class99) class89.field1096.method1047(-7962)) {
            int var11 = (class199.field2397 - var9 - 1) * 16 + (var3 + 31);
            short var12 = -1;
            if (var2 < var7 && var7 < var2 + var4 && var11 - 13 < var8 && var8 < var11 + 3 && var10.field1224) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class240.method1361(0, var10.field1227)) {
                var13 = class449.field6217.method2026((byte) -104, (int) var10.field1235).field8766;
            } else if (var10.field1232 != -1) {
                var13 = class449.field6217.method2026((byte) -71, var10.field1232).field8766;
            } else if (class564.method3292(var10.field1227, -26)) {
                class415 var14 = (class415) class309.field3938.method2645((long) ((int) var10.field1235), (byte) -126);
                if (var14 != null) {
                    class459 var15 = var14.field5390;
                    class74 var16 = var15.field6334;
                    if (var16.field800 != null) {
                        var16 = var16.method420(class281.field3700, arg0 + 98);
                    }
                    if (var16 != null) {
                        var13 = var16.field812;
                    }
                }
            } else if (class364.method2039((byte) -105, var10.field1227)) {
                Object var17 = null;
                class437 var18;
                if (var10.field1227 == 1010) {
                    var18 = class16.field126.method1759(false, (int) var10.field1235);
                } else {
                    var18 = class16.field126.method1759(false, (int) (var10.field1235 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field6004 != null) {
                    var18 = var18.method2545(-1, class281.field3700);
                }
                if (var18 != null) {
                    var13 = var18.field5967;
                }
            }
            String var19 = class348.method1941(var10, arg0 ^ 0xFFFFFF80);
            if (var13 != null) {
                var19 = var19 + class404.method2305(0, var13);
            }
            class459.field6320.method536(28664, var19, class7.field59, 0, var11, var2 + 3, var12, class580.field8461);
            if (var10.field1225) {
                class257.field3312.method299((var2 + class410.field5340.method1241(var19, (byte) 0)) + 5, var11 + -12);
            }
            var9++;
        }
        class476.method2780((byte) 118, class594.field8623, class609.field8848, class308.field3933, class521.field7314);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 119)
    public static void method2803(byte arg0) {
        field6754 = null;
        field6755 = null;
        if (arg0 != 43) {
            method2802(-5, null);
        }
    }
}
