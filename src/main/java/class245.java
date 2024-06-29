import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class245 {

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3754 = new String[] { method2087(method2086("{\u0003::\u00177")), method2087(method2086("{\u0003::\u00117")), method2087(method2086("{\u0003::\u00147")), method2087(method2086("{\u0003::\u00167")) };

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "Lwq;")
    public static class178 field3750 = new class178(32);

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "[I")
    public static int[] field3751 = new int[25];

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V", line = 6)
    public static void method2082(byte arg0) {
        try {
            field3751 = null;
            field3750 = null;
            if (arg0 != -98) {
                field3751 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3754[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V", line = 17)
    public static final void method2083(int arg0) {
        try {
            class123.method1069(false, false);
            field3749++;
            if (arg0 <= class149.field1840 && class149.field1840 != 0) {
                class640.method4693(class149.field1840, arg0 ^ 0xFFFFCB0A, false);
                class149.field1840 = -1;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3754[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V", line = 36)
    public static final void method2084(byte arg0) {
        try {
            if (arg0 > 117) {
                field3752++;
                if (class752.field10946 != null) {
                    class339.method2821(2, class591.field8684);
                } else if (class472.field6852 == -1) {
                    class4.method28((byte) 78, class489.field7027, class122.field1439, class591.field8684);
                } else {
                    class377.method3041(class591.field8684, 2);
                }
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3754[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 59)
    public static final void method2085(int arg0) {
        try {
            class546.field8157.method1668(5, (byte) 84);
            field3748++;
            class224.field3429.method5416((byte) 111, 5);
            class513.field7378.method4812(5, (byte) 39);
            class417.field6144.method3027(13366, 5);
            class262.field4035.method4254(64, 5);
            class540.field7920.method4995(5, 50);
            class272.field4122.method2247(5, false);
            class771.field11208.method2505(5, (byte) -32);
            class369.field5638.method4267(5, false);
            class289.field4303.method2899(62, 5);
            class747.field10862.method4705(false, 5);
            int var1 = -99 % ((-arg0 - 14) / 54);
            class496.field7116.method4846(5, 256);
            class643.field9316.method617(36, 5);
            class617.field9073.method4602(-919, 5);
            class566.field8395.method3414(16, 5);
            class329.field5185.method2534(5, true);
            class596.field8739.method944(5, -28902);
            class13.field162.method74((byte) -38, 5);
            class640.field9301.method354((byte) -106, 5);
            class208.field3189.method3058(5, 2);
            class496.field7133.method3418(5, -13574);
            class81.field924.method4982(5, true);
            class43.method294((byte) -100, 5);
            class115.method1011(50, -13897);
            class14.method101(90, 50);
            class444.method3410(5, -17453);
            class720.method5248(5, 17289);
            class608.field8892.method1557(5, (byte) -117);
            class757.field10996.method1557(5, (byte) -111);
            class83.field928.method1557(5, (byte) -120);
            class269.field4096.method1557(5, (byte) -107);
            class782.field11383.method1557(5, (byte) -114);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3754[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2086(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2087(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
