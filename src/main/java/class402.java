import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class402 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public int field6046 = -1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public int field6045;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public int field6049;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public int field6050;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public int field6052;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
    public int field6053;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public int field6055;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "[[B")
    public static byte[][] field6047;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public static void method2582(byte arg0) {
        field6047 = null;
        if (arg0 != -26) {
            method2583(47, -97);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Laa;")
    public static final class57 method2583(int arg0, int arg1) {
        field6048++;
        if (arg0 != -30765) {
            return null;
        }
        class57 var2 = (class57) class364.field5628.method2130(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class467.field7157.method1004(arg1, false, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class57 var4 = class131.method814(var3, (byte) 74);
            class364.field5628.method2132(var4, (long) arg1, 21826);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z")
    public static final boolean method2584(int arg0) {
        field6057++;
        int var1 = 28 / ((arg0 - 34) / 53);
        try {
            return class444.method2812((byte) 48);
        } catch (IOException var5) {
            class519.method3112(-15537);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class471.field7212 == null ? -1 : class471.field7212.method705(101)) + "," + (class541.field7900 == null ? -1 : class541.field7900.method705(93)) + "," + (class283.field4460 == null ? -1 : class283.field4460.method705(118)) + " - " + class156.field2156 + "," + (class358.field5565.field894[0] + class453.field7018) + "," + (class358.field5565.field899[0] + class126.field1718) + " - ";
            for (int var4 = 0; var4 < class156.field2156 && var4 < 50; var4++) {
                var3 = var3 + class279.field4428.field3193[var4] + ",";
            }
            class80.method575(var6, var3, (byte) -92);
            class496.method3034(true, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BIIII)Z")
    public static final boolean method2585(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6051++;
        if ((class416.field6309[0][arg4][arg3] & 0x2) != 0) {
            return true;
        } else if ((class416.field6309[arg1][arg4][arg3] & 0x10) != 0) {
            return false;
        } else if (arg2 == class150.method917(arg4, arg3, 89, arg1)) {
            return true;
        } else {
            if (arg0 <= 92) {
                field6047 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)V")
    public static final void method2586(int arg0, boolean arg1) {
        field6054++;
        while (class279.field4428.method1856(class156.field2156, 126) >= 15) {
            int var2 = class279.field4428.method1852(arg0 + 107, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class38 var4 = (class38) class365.field5659.method1122((byte) 59, (long) var2);
            if (var4 == null) {
                class378 var5 = new class378();
                var5.field847 = var2;
                var4 = new class38(var5);
                class365.field5659.method1127(var4, (byte) 82, (long) var2);
                var3 = true;
                class14.field150[class78.field1176++] = var4;
            }
            class378 var6 = var4.field378;
            class81.field1198[class378.field5815++] = var2;
            var6.field801 = class88.field1278;
            if (var6.field5809 != null && var6.field5809.method1199(114)) {
                class76.method546(var6, 472);
            }
            int var7;
            if (arg1) {
                var7 = class279.field4428.method1852(111, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class279.field4428.method1852(arg0 + 117, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            var6.method2443(class6.field72.method2977(class279.field4428.method1852(arg0 ^ 0x7D, 14), arg0 + 50), (byte) 116);
            int var8 = class279.field4428.method1852(107, 2);
            int var9 = class279.field4428.method1852(108, 1);
            int var10;
            if (arg1) {
                var10 = class279.field4428.method1852(arg0 + 111, 8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class279.field4428.method1852(122, 5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11 = (class279.field4428.method1852(99, 3) + 4 & 0x83800007) << 11;
            int var12 = class279.field4428.method1852(94, 1);
            if (var12 == 1) {
                class272.field4342[class368.field5681++] = var2;
            }
            var6.method430((byte) -59, var6.field5809.field2809);
            var6.field850 = var6.field5809.field2830 << 3;
            if (var3) {
                var6.method426(true, var11, (byte) -111);
            }
            var6.method2441(var6.method415(-4), class358.field5565.field894[0] + var7, var8, class358.field5565.field899[0] + var10, (byte) -20, var9 == 1);
            if (var6.field5809.method1199(114)) {
                class31.method198(var6.field6419, null, 0, var6.field899[0], var6.field894[0], var6, 1, null);
            }
        }
        class279.field4428.method1854((byte) 32);
        if (arg0 != 0) {
            method2586(-39, false);
        }
    }
}
