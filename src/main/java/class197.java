import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class197 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[B")
    public static byte[] field3125 = new byte[520];

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3128 = "Please wait...";

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lkk;")
    public static class254 field3130 = null;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Z")
    public static boolean field3131 = false;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[Lh;")
    public static class294[] field3126;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[B)Lte;")
    public static final class80 method1363(byte arg0, byte[] arg1) {
        class80 var2 = new class80();
        if (arg0 >= -26) {
            return null;
        }
        field3132++;
        class202 var3 = new class202(arg1);
        var3.field3272 = var3.field3234.length - 2;
        int var4 = var3.method1419(76);
        int var5 = var3.field3234.length - var4 - 2 - 12;
        var3.field3272 = var5;
        int var6 = var3.method1440(20404);
        var2.field1262 = var3.method1419(103);
        var2.field1264 = var3.method1419(66);
        var2.field1271 = var3.method1419(108);
        var2.field1276 = var3.method1419(107);
        int var7 = var3.method1420((byte) 0);
        if (var7 > 0) {
            var2.field1269 = new class130[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1419(75);
                class130 var10 = new class130(class257.method1792(var9, (byte) 0));
                var2.field1269[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1440(20404);
                    int var12 = var3.method1440(20404);
                    var10.method857(false, new class221(var12), (long) var11);
                }
            }
        }
        var3.field3272 = 0;
        int var13 = 0;
        var2.field1272 = var3.method1437(-4);
        var2.field1266 = new int[var6];
        var2.field1268 = new String[var6];
        var2.field1270 = new int[var6];
        while (var3.field3272 < var5) {
            int var14 = var3.method1419(100);
            if (var14 == 3) {
                var2.field1268[var13] = var3.method1403(-128).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1266[var13] = var3.method1420((byte) 0);
            } else {
                var2.field1266[var13] = var3.method1440(20404);
            }
            var2.field1270[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII)I")
    public static final int method1364(boolean arg0, int arg1, int arg2) {
        field3124++;
        if (arg0) {
            return 125;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1365(byte arg0) {
        field3128 = null;
        field3125 = null;
        field3130 = null;
        field3126 = null;
        if (arg0 != -71) {
            field3130 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BB)V")
    public abstract void method855(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)[B")
    public abstract byte[] method856(int arg0);
}
