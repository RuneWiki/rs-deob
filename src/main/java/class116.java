import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class116 {

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Z")
    public static boolean field1839 = false;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lgs;")
    public static class439 field1835 = new class439();

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[Lat;")
    public static class444[] field1840;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Lqh;", line = 5)
    public static final class230 method863(boolean arg0) {
        field1837++;
        if (arg0) {
            return null;
        }
        try {
            return (class230) Class.forName("fd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)I", line = 22)
    public static final int method864(int arg0, int arg1, int arg2, int arg3) {
        field1836++;
        if (class1.field16 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        if (arg3 != 7528) {
            field1840 = null;
        }
        int var6 = arg0 - class472.field6838;
        int var7 = arg2 - class472.field6835;
        for (class237 var8 = (class237) class472.field6811.method3137(arg3 - 7528); var8 != null; var8 = (class237) class472.field6811.method3132(0)) {
            if (var8.field3280 == arg1) {
                int var9 = var8.field3277;
                int var10 = var8.field3274;
                int var11 = var9 + class472.field6838 << 14 | class472.field6835 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B[B)Lho;", line = 71)
    public static final class343 method865(byte arg0, byte[] arg1) {
        field1838++;
        class343 var2 = new class343();
        class319 var3 = new class319(arg1);
        if (arg0 != -126) {
            return null;
        }
        var3.field4360 = var3.field4336.length - 2;
        int var4 = var3.method1844(-125);
        int var5 = var3.field4336.length - var4 - 2 - 12;
        var3.field4360 = var5;
        int var6 = var3.method1863(-1);
        var2.field4960 = var3.method1844(-124);
        var2.field4958 = var3.method1844(-111);
        var2.field4954 = var3.method1844(arg0 ^ 0x16);
        var2.field4951 = var3.method1844(-120);
        int var7 = var3.method1869(arg0 ^ 0x7);
        if (var7 > 0) {
            var2.field4956 = new class270[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1844(-118);
                class270 var10 = new class270(class274.method1604(var9, (byte) 126));
                var2.field4956[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1863(arg0 ^ 0x7D);
                    int var12 = var3.method1863(arg0 + 125);
                    var10.method1586(new class437(var12), (long) var11, arg0 + 127);
                }
            }
        }
        var3.field4360 = 0;
        var2.field4959 = var3.method1892((byte) 46);
        var2.field4962 = new String[var6];
        var2.field4952 = new int[var6];
        var2.field4953 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field4360) {
            int var14 = var3.method1844(-106);
            if (var14 == 3) {
                var2.field4962[var13] = var3.method1871(89).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field4952[var13] = var3.method1869(-98);
            } else {
                var2.field4952[var13] = var3.method1863(class373.method2233(arg0, 125));
            }
            var2.field4953[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 157)
    public static void method866(int arg0) {
        field1835 = null;
        int var1 = -109 % ((arg0 - 24) / 55);
        field1840 = null;
    }
}
