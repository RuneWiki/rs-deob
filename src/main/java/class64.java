import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class64 {

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
    public static boolean field959 = false;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILma;)V")
    public static final void method413(int arg0, class202 arg1) {
        field955++;
        int var2 = arg1.method1450(-121);
        class126.field1957 = new class160[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class126.field1957[var3] = new class160();
            class126.field1957[var3].field2524 = arg1.method1450(-108);
            class126.field1957[var3].field2526 = arg1.method1416(-108);
        }
        class1.field2 = arg1.method1450(arg0 ^ 0xFFFFFF9A);
        if (arg0 != 1) {
            method414((byte) -37);
        }
        class40.field495 = arg1.method1450(-117);
        class216.field3438 = arg1.method1450(arg0 - 119);
        class35.field443 = new class203[class40.field495 + 1 - class1.field2];
        for (int var4 = 0; var4 < class216.field3438; var4++) {
            int var5 = arg1.method1450(arg0 ^ 0xFFFFFF82);
            class203 var6 = class35.field443[var5] = new class203();
            var6.field4003 = arg1.method1420((byte) 0);
            var6.field4000 = arg1.method1440(20404);
            var6.field3278 = var5 + class1.field2;
            var6.field3283 = arg1.method1416(-96);
            var6.field3276 = arg1.method1416(-98);
        }
        class166.field2615 = arg1.method1440(20404);
        class261.field4306 = true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Lma;")
    public static final class202 method414(byte arg0) {
        field953++;
        class202 var1 = new class202(34);
        var1.method1446((byte) 117, 11);
        var1.method1446((byte) 74, class73.field1067);
        var1.method1446((byte) 54, class225.field3571 ? 1 : 0);
        var1.method1446((byte) 127, class208.field3342 ? 1 : 0);
        var1.method1446((byte) 30, class123.field1878 ? 1 : 0);
        var1.method1446((byte) 50, class51.field687 ? 1 : 0);
        var1.method1446((byte) 100, class12.field160 ? 1 : 0);
        var1.method1446((byte) 125, class135.field2113 ? 1 : 0);
        var1.method1446((byte) 43, class182.field2830 ? 1 : 0);
        var1.method1446((byte) 60, class180.field2800 ? 1 : 0);
        var1.method1446((byte) 39, class163.field2567);
        var1.method1446((byte) 50, class272.field4462 ? 1 : 0);
        var1.method1446((byte) 94, class176.field2746 ? 1 : 0);
        var1.method1446((byte) 72, class143.field2228 ? 1 : 0);
        var1.method1446((byte) 83, class218.field3463);
        var1.method1446((byte) 71, class175.field2740 ? 1 : 0);
        var1.method1446((byte) 48, class11.field145);
        var1.method1446((byte) 68, class223.field3550);
        var1.method1446((byte) 48, class19.field257);
        var1.method1412(class152.field2373, false);
        int var2 = 77 / ((arg0 + 48) / 32);
        var1.method1412(class296.field4867, false);
        var1.method1446((byte) 95, class77.method506());
        var1.method1425(class51.field689, (byte) -111);
        var1.method1446((byte) 91, class258.field4245);
        var1.method1446((byte) 84, class192.field3039 ? 1 : 0);
        var1.method1446((byte) 60, class74.field1123 ? 1 : 0);
        var1.method1446((byte) 36, class132.field2028);
        var1.method1446((byte) 101, class241.field3822 ? 1 : 0);
        var1.method1446((byte) 45, class144.field2261 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
    public static final boolean method415(int arg0, boolean arg1, String arg2, int arg3) {
        field958++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        int var5 = arg3;
        boolean var6 = false;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var5 + var11;
            if (var10 / arg0 != var5) {
                return false;
            }
            var5 = var10;
            var6 = true;
        }
        return var6;
    }
}
