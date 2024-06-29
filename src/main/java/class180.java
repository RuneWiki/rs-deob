import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class180 {

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2382 = new Rectangle[100];

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2383 = 0;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Llm;")
    public static class347 field2381;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLii;)V", line = 3)
    public static final void method1099(byte arg0, class405 arg1) {
        field2386++;
        if (class212.field2844 < 2 && class63.field844 == 0 && !class263.field3821) {
            return;
        }
        String var2;
        if (class63.field844 == 1 && class212.field2844 < 2) {
            var2 = class384.field5553 + class159.field2149 + class156.field2125 + " ->";
        } else if (class263.field3821 && class212.field2844 < 2) {
            var2 = class394.field5739 + class159.field2149 + class375.field5454 + " ->";
        } else if (class404.field6009 && class30.field437[81] && class212.field2844 > 2) {
            var2 = class397.method2556((byte) 114, (class212) class321.field4726.field663.field641.field641);
        } else {
            class212 var3 = (class212) class321.field4726.field663.field641;
            var2 = class397.method2556((byte) 112, var3);
            int[] var4 = null;
            if (class355.method2331(-92, var3.field2836)) {
                var4 = class9.method74((int) var3.field2830, (byte) 119).field1140;
            } else if (class56.method386(var3.field2836, (byte) 92)) {
                class43 var5 = class306.field4496[(int) var3.field2830];
                if (var5 != null) {
                    var4 = var5.field606.field3388;
                }
            } else if (class379.method2462(var3.field2836, (byte) 44)) {
                if (var3.field2836 == 1008) {
                    var4 = class329.method2190((byte) 63, (int) var3.field2830).field1484;
                } else {
                    var4 = class329.method2190((byte) 63, (int) (var3.field2830 >>> 32 & 0x7FFFFFFFL)).field1484;
                }
            }
            if (var4 != null) {
                var2 = var2 + class110.method727(false, var4);
            }
        }
        if (arg0 != -116) {
            field2383 = -28;
        }
        if (class212.field2844 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class212.field2844 - 2) + class120.field1679;
        }
        if (class449.field6580 != null) {
            class273 var6 = class449.field6580.method2530(true, arg1);
            if (var6 == null) {
                var6 = class422.field6227;
            }
            var6.method1894(class363.field5240, class380.field5533, class223.field2948, class130.field1799, class449.field6580.field5699, var2, 16044, class449.field6580.field5690, class449.field6580.field5773, class253.field3495, class449.field6580.field5737, class106.field1528, class449.field6580.field5672, class449.field6580.field5800, class368.field5324);
            class179.method1094(class368.field5324[0], class368.field5324[3], class368.field5324[1], arg0 ^ 0xFFFFFF8C, class368.field5324[2]);
        } else if (class118.field1653 != null && class71.field1017 == 0) {
            int var7 = class422.field6227.method1893(class380.field5533, 16777215, class69.field904 + 4, class253.field3495, class363.field5240, var2, false, class223.field2948, class124.field1733 + 16, 0);
            class179.method1094(class69.field904 + 4, 16, class124.field1733, arg0 ^ 0xFFFFFF8C, var7 + class191.field2562.method2127(arg0 ^ 0xFFFFFF73, var2));
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 97)
    public static void method1100(int arg0) {
        field2382 = null;
        if (arg0 < 31) {
            method1099((byte) 31, (class405) null);
        }
        field2381 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIII)V", line = 108)
    public static final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class75.field1065 = arg0;
        class166.field2237 = arg4;
        field2385++;
        class91.field1281 = arg5;
        if (arg3 != 1024) {
            return;
        }
        class68.field880 = arg1;
        class97.field1361 = arg2;
        if (class91.field1281 >= 100) {
            int var6 = class97.field1361 * 128 + 64;
            int var7 = class166.field2237 * 128 + 64;
            int var8 = class52.method359((byte) -116, var7, var6, class227.field2981) - class75.field1065;
            int var9 = var6 - class400.field5971;
            int var10 = var8 - class201.field2667;
            int var11 = var7 - class179.field2371;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class415.field6101 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class5.field66 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class415.field6101 < 1024) {
                class415.field6101 = 1024;
            }
            if (class415.field6101 > 3072) {
                class415.field6101 = 3072;
            }
        }
        class346.field4979 = 2;
    }
}
