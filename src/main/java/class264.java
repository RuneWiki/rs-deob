import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class264 {

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3736 = new String[] { method2184(method2183("0\u0003}A\\q")), method2184(method2183("\"D2Ac")), method2184(method2183("0\u0003}A]q")), method2184(method2183("7\u001fp\u0003")), method2184(method2183("0\u0003}AZq")), method2184(method2183("0\u0003}A\"0\u0004u\u001b q")), method2184(method2183("0\u0003}A_q")) };

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "Ltka;")
    public static class599 field3735 = new class599();

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "Lqa;")
    public class104 field3726;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "Liia;")
    public class264 field3728;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljc;I)V", line = 3)
    public static final void method2179(class711 arg0, int arg1) {
        try {
            field3732++;
            int var2 = 0;
            if (arg1 < -61) {
                while (var2 < class353.field5119) {
                    int var3 = arg0.method5090(-114);
                    int var4 = arg0.method5116((byte) -125);
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    if (class336.field4870[var3] != null) {
                        class336.field4870[var3].field4969 = var4;
                    }
                    var2++;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3736[2] + (arg0 == null ? field3736[3] : field3736[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Lel;", line = 39)
    public final class585 method2180(int arg0) {
        try {
            if (arg0 != -65536) {
                this.field3730 = 112;
            }
            field3731++;
            return class594.method4379(82, this.field3729);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3736[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IB)Liia;", line = 50)
    public final class264 method2181(int arg0, byte arg1) {
        try {
            field3725++;
            int var3 = -4 / ((28 - arg1) / 42);
            return new class264(this.field3729, arg0);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3736[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 62)
    public static void method2182(int arg0) {
        try {
            field3735 = null;
            if (arg0 > -106) {
                field3735 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3736[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(II)V", line = 72)
    public class264(int arg0, int arg1) {
        try {
            this.field3729 = arg0;
            this.field3730 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3736[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2183(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2184(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
