import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class692 extends Exception {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field9620 = 1;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lst;")
    public static class335 field9624 = new class335(8, 7);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[[[B")
    public static byte[][][] field9623;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method3912(int arg0) {
        if (arg0 != -15406) {
            method3913(104);
        }
        field9624 = null;
        field9623 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static final void method3913(int arg0) {
        field9622++;
        class352.field5071.method2563((byte) 33);
        int var1 = class352.field5071.method2560(-64, 8);
        if (class262.field3837 > var1) {
            for (int var2 = var1; var2 < class262.field3837; var2++) {
                class120.field1581[class292.field4186++] = class446.field6192[var2];
            }
        }
        if (var1 > class262.field3837) {
            throw new RuntimeException("gnpov1");
        }
        class262.field3837 = 0;
        if (arg0 != 25509) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class446.field6192[var3];
            class679 var5 = ((class234) class372.field5245.method812(115, (long) var4)).field3471;
            int var6 = class352.field5071.method2560(-38, 1);
            if (var6 == 0) {
                class446.field6192[class262.field3837++] = var4;
                var5.field7139 = class288.field4124;
            } else {
                int var7 = class352.field5071.method2560(arg0 ^ 0xFFFF9C3B, 2);
                if (var7 == 0) {
                    class446.field6192[class262.field3837++] = var4;
                    var5.field7139 = class288.field4124;
                    class606.field8182[class456.field6315++] = var4;
                } else if (var7 == 1) {
                    class446.field6192[class262.field3837++] = var4;
                    var5.field7139 = class288.field4124;
                    int var8 = class352.field5071.method2560(-65, 3);
                    var5.method3823(1, 524288, var8);
                    int var9 = class352.field5071.method2560(-123, 1);
                    if (var9 == 1) {
                        class606.field8182[class456.field6315++] = var4;
                    }
                } else if (var7 == 2) {
                    class446.field6192[class262.field3837++] = var4;
                    var5.field7139 = class288.field4124;
                    if (class352.field5071.method2560(-38, 1) == 1) {
                        int var11 = class352.field5071.method2560(-81, 3);
                        var5.method3823(2, 524288, var11);
                        int var12 = class352.field5071.method2560(arg0 - 25564, 3);
                        var5.method3823(2, 524288, var12);
                    } else {
                        int var10 = class352.field5071.method2560(-58, 3);
                        var5.method3823(0, arg0 + 498779, var10);
                    }
                    int var13 = class352.field5071.method2560(-43, 1);
                    if (var13 == 1) {
                        class606.field8182[class456.field6315++] = var4;
                    }
                } else if (var7 == 3) {
                    class120.field1581[class292.field4186++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3914(byte arg0, String arg1) throws ClassNotFoundException {
        field9621++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else if (arg0 <= 24) {
            return null;
        } else {
            return Class.forName(arg1);
        }
    }
}
