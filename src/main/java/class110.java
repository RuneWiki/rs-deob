import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class110 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field2121 = -1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Lr;")
    public static class66 field2128 = class93.method641(43, "compass");

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[[[Laa;")
    public static class16[][][] field2124;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method743(byte arg0) {
        class84.field1627.method570(122);
        field2127++;
        int var1 = class84.field1627.method572((byte) 0, 8);
        if (var1 < class160.field2869) {
            for (int var2 = var1; var2 < class160.field2869; var2++) {
                class70.field1404[class4.field45++] = class49.field877[var2];
            }
        }
        if (var1 > class160.field2869) {
            throw new RuntimeException("gnpov1");
        }
        class160.field2869 = 0;
        int var3 = 0;
        int var4 = 112 / ((46 - arg0) / 63);
        while (var3 < var1) {
            int var5 = class49.field877[var3];
            class37 var6 = class178.field3112[var5];
            int var7 = class84.field1627.method572((byte) 0, 1);
            if (var7 == 0) {
                class49.field877[class160.field2869++] = var5;
                var6.field2091 = class75.field1501;
            } else {
                int var8 = class84.field1627.method572((byte) 0, 2);
                if (var8 == 0) {
                    class49.field877[class160.field2869++] = var5;
                    var6.field2091 = class75.field1501;
                    class83.field1599[class240.field4170++] = var5;
                } else if (var8 == 1) {
                    class49.field877[class160.field2869++] = var5;
                    var6.field2091 = class75.field1501;
                    int var9 = class84.field1627.method572((byte) 0, 3);
                    var6.method734(false, var9, (byte) 21);
                    int var10 = class84.field1627.method572((byte) 0, 1);
                    if (var10 == 1) {
                        class83.field1599[class240.field4170++] = var5;
                    }
                } else if (var8 == 2) {
                    class49.field877[class160.field2869++] = var5;
                    var6.field2091 = class75.field1501;
                    int var11 = class84.field1627.method572((byte) 0, 3);
                    var6.method734(true, var11, (byte) 21);
                    int var12 = class84.field1627.method572((byte) 0, 3);
                    var6.method734(true, var12, (byte) 21);
                    int var13 = class84.field1627.method572((byte) 0, 1);
                    if (var13 == 1) {
                        class83.field1599[class240.field4170++] = var5;
                    }
                } else if (var8 == 3) {
                    class70.field1404[class4.field45++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLcj;)V")
    public static final void method744(byte arg0, class28 arg1) {
        if (arg0 != 58) {
            method744((byte) 95, (class28) null);
        }
        field2126++;
        class218.field3750 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method745(int arg0) {
        field2124 = null;
        field2128 = null;
        if (arg0 < 30) {
            field2124 = null;
        }
    }
}
