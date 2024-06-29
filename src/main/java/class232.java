import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class232 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field3404 = new int[32];

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3412 = "";

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method1605(int arg0, int arg1) {
        class195.field2878.method1416(arg1, 0);
        field3410++;
        class159.field2467.method1416(arg1, 0);
        class211.field3110.method1416(arg1, 0);
        class299.field4823.method1416(arg1, 0);
        if (arg0 != 255) {
            method1608((byte) 99);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILmh;)V")
    public static final void method1606(int arg0, int arg1, int arg2, class263 arg3) {
        field3405++;
        if (class306.field4945 != null || class191.field2823 || arg3 == null || class241.method1649(arg3, (byte) 127) == null) {
            return;
        }
        class306.field4945 = arg3;
        class132.field2178 = class241.method1649(arg3, (byte) 92);
        class211.field3111 = arg1;
        class208.field3075 = false;
        class162.field2515 = arg2;
        class115.field1907 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;Llc;ZB)Luc;")
    public static final class13 method1607(String arg0, class270 arg1, boolean arg2, byte arg3) {
        field3409++;
        int var4 = arg1.method1884(arg0, (byte) -35);
        if (var4 == -1) {
            return new class13(0);
        }
        int var5 = 18 / ((arg3 - 31) / 63);
        int[] var6 = arg1.method1866((byte) -69, var4);
        int var7 = 0;
        class13 var8 = new class13(var6.length);
        int var9 = 0;
        while (true) {
            while (var8.field149 > var7) {
                class53 var10 = new class53(arg1.method1868(var6[var9++], var4, 1));
                int var11 = var10.method340(-116);
                int var12 = var10.method331(-106);
                int var13 = var10.method366(-16505);
                if (!arg2 && var13 == 1) {
                    var8.field149--;
                } else {
                    var8.field156[var7] = var11;
                    var8.field157[var7] = new class159();
                    var8.field157[var7].field2466 = var12;
                    var7++;
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1608(byte arg0) {
        if (arg0 <= 41) {
            field3412 = null;
        }
        field3412 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Loe;")
    public static final class76 method1609(byte arg0, int arg1) {
        field3411++;
        class76 var2 = (class76) class253.field3821.method1418((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field2309.method1868(class279.method1931(arg1, true), class263.method1815(arg0 + 140, arg1), arg0 ^ 0xFFFFFFE1);
        class76 var4 = new class76();
        var4.field1208 = arg1;
        if (var3 != null) {
            var4.method572(new class53(var3), -1);
        }
        var4.method564(-1);
        if (arg0 == -32) {
            class253.field3821.method1421((long) arg1, var4, (byte) 101);
            return var4;
        } else {
            return null;
        }
    }
}
