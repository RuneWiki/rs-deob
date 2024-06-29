import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class795 {

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11568 = new String[] { method5739(method5738("]\fp(,")), method5739(method5738("HW2j")), method5739(method5738("HKpGy")), method5739(method5738("HKpDy")), method5739(method5738("HKpBy")), method5739(method5738("HKpEy")) };

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lmv;")
    public static class125 field11561 = new class125(76, 3);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Ltka;")
    public static class599 field11565 = new class599();

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field11560;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field11562;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field11563;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lqa;")
    public static class104 field11567;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lr;")
    public class412 field11564;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Lka;")
    public class761 field11559;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Ljava/applet/Applet;")
    public static Applet field11566;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILkn;I)V", line = 3)
    public static final void method5734(int arg0, class437 arg1, int arg2) {
        try {
            field11563++;
            if (class347.field5048 < 50 && arg1 != null && arg1.field6435 != null && arg1.field6435.length > arg0 && arg1.field6435[arg0] != null) {
                int var3 = arg1.field6435[arg0][0];
                int var4 = var3 >> 8;
                if (arg1.field6435[arg0].length > 1) {
                    int var5 = (int) ((double) arg1.field6435[arg0].length * Math.random());
                    if (var5 > 0) {
                        var4 = arg1.field6435[arg0][var5];
                    }
                }
                int var6 = var3 >> 5 & arg2;
                int var7 = 256;
                if (arg1.field6429 != null && arg1.field6428 != null) {
                    var7 = class443.method3448(arg1.field6429[arg0], 29943, arg1.field6428[arg0]);
                }
                if (arg1.field6427) {
                    class241.method1991(0, (byte) -58, false, var4, var6, var7, 255);
                } else {
                    class336.method2699(var7, var4, 255, 0, var6, true);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11568[2] + arg0 + ',' + (arg1 == null ? field11568[1] : field11568[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 44)
    public static final void method5735(int arg0) {
        try {
            field11560++;
            class376.field5495 = new class182[arg0];
            class740.field10526 = 0;
            class601.field8604 = new class182[2000];
            class151.field1936 = 0;
            class281.field3962 = class768.field10975;
            class503.field7357 = new class182[1000];
            class117.field1492 = new int[class293.field4121][class508.field7455 + 1][class700.field9795 + 1];
            class694.field9701 = 0;
            class397.field5768 = false;
            class316.field4330 = class768.field10975;
            class654.field9283 = new class182[500];
            class119.field1510 = 0;
            if (class531.field7699 instanceof class473) {
                class721.field10272 = false;
            } else {
                class721.field10272 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11568[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BCLjava/lang/String;)I", line = 77)
    public static final int method5736(byte arg0, char arg1, String arg2) {
        try {
            field11562++;
            int var3 = 0;
            if (arg0 >= -52) {
                return -103;
            }
            int var4 = arg2.length();
            for (int var5 = 0; var5 < var4; var5++) {
                if (arg2.charAt(var5) == arg1) {
                    var3++;
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11568[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11568[1] : field11568[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 103)
    public static void method5737(byte arg0) {
        try {
            if (arg0 == -116) {
                field11566 = null;
                field11565 = null;
                field11561 = null;
                field11567 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11568[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5738(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5739(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
