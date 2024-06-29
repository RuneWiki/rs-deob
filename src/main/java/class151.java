import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class151 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Lce;")
    public static class126 field2760 = class206.method1445(-7923, "um");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[J")
    public static long[] field2758 = new long[256];

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "[I")
    public static int[] field2765;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lce;")
    public static class126 field2766;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lsi;")
    public static class237 field2764;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lce;")
    public static class126 field2767;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Z", line = 7)
    public static final boolean method1122(int arg0) {
        field2757++;
        if (arg0 != 1) {
            return false;
        }
        try {
            return class36.method199(false);
        } catch (IOException var5) {
            class33.method187(-24696);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class122.field2051 + "," + class17.field231 + "," + class189.field3249 + " - " + class315.field5404 + "," + (class286.field4744.field2460[0] + class58.field914) + "," + (class286.field4744.field2471[0] + class138.field2473) + " - ";
            for (int var4 = 0; class315.field5404 > var4 && var4 < 50; var4++) {
                var3 = var3 + class227.field3834.field2282[var4] + ",";
            }
            class54.method345(var3, -124, var6);
            class189.method1356((byte) -103);
            return true;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2758[var0] = var1;
        }
        field2765 = new int[1000];
        field2766 = class206.method1445(-7923, "clignotant2:");
        field2764 = new class237(16);
        field2767 = class206.method1445(-7923, "M-Bmoire attribu-Be");
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIZIIIIII)Z", line = 48)
    public static final boolean method1123(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2759++;
        if (arg2 != -9) {
            field2764 = (class237) null;
        }
        if (class286.field4744.method1013(false) == 2) {
            return class5.method33(arg8, arg1, arg0, arg4, arg3, arg6, arg5, arg11, arg7, arg9, -116, arg10);
        } else if (class286.field4744.method1013(false) <= 2) {
            return class33.method178(arg4, arg7, arg0, arg9, arg10, -1001, arg8, arg1, arg11, arg3, arg5, arg6);
        } else {
            return class1.method3(arg1, false, arg6, arg11, arg0, arg4, arg3, arg7, arg5, arg8, class286.field4744.method1013(false), arg10, arg9);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)Lkg;", line = 68)
    public static final class111 method1124(int arg0, boolean arg1) {
        field2761++;
        class111 var2 = (class111) class110.field1724.method1173(-19839, (long) arg0);
        if (!arg1) {
            field2760 = (class126) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class259.field4349.method2173(3, arg0, (byte) -98);
        class111 var4 = new class111();
        if (var3 != null) {
            var4.method731(new class134(var3), 0);
        }
        class110.field1724.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 93)
    public static void method1125(byte arg0) {
        field2764 = null;
        field2767 = null;
        field2758 = null;
        field2760 = null;
        if (arg0 > 123) {
            field2765 = null;
            field2766 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Ldg;", line = 139)
    public static final class173 method1126(int arg0, int arg1) {
        field2762++;
        int var2 = 47 / ((23 - arg1) / 43);
        class173 var3 = (class173) class205.field3503.method303((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = class281.field4673.method2173(0, arg0, (byte) -125);
        } else {
            var4 = class195.field3348.method2173(0, arg0 & 0x7FFF, (byte) -53);
        }
        class173 var5 = new class173();
        if (var4 != null) {
            var5.method1262(-1, new class134(var4));
        }
        if (arg0 >= 32768) {
            var5.method1255(32768);
        }
        class205.field3503.method308(var5, (long) arg0, (byte) 125);
        return var5;
    }
}
