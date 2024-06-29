import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class324 extends class578 {

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "Ljava/lang/String;")
    public String field4415;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4419 = new String[] { method2567(method2566("rKb\t;")), method2567(method2566("rKbwz{Q8u;")), method2567(method2566("{M '")), method2567(method2566("n\u0016ben")), method2567(method2566("rKb\u000f;")), method2567(method2566("rKb\b;")), method2567(method2566("rKb\n;")) };

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Luu;")
    public static class240 field4416 = new class240(9, 2);

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
    public static final boolean method2562(int arg0, int arg1, int arg2) {
        try {
            field4414++;
            if (arg1 == 1048832) {
                return (arg0 & 0x100100) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4419[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)V")
    public static void method2563(byte arg0) {
        try {
            int var1 = 88 / ((-arg0 - 68) / 36);
            field4416 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4419[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(III)Z")
    public static final boolean method2564(int arg0, int arg1, int arg2) {
        try {
            field4411++;
            int var3 = 74 % ((arg2 + 78) / 39);
            return (arg1 & 0x10) != 0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4419[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class324() {
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)[Lsb;")
    public static final class261[] method2565(byte arg0) {
        try {
            field4413++;
            int var1 = 7 / ((20 - arg0) / 41);
            return new class261[] { class722.field10281, class74.field1063, class309.field4257, class740.field10521, class255.field3645, class694.field9702, class228.field3306, class449.field6576, class61.field937, class14.field188, class330.field4510, class699.field9793, class294.field4141, class50.field715, class405.field5880, class312.field4287, class466.field6783, class182.field2359, class384.field5612, class294.field4138, class474.field6951, class117.field1481, class767.field10959, class271.field3833, class182.field2360, class390.field5678, class80.field1122, class493.field7254, class441.field6512, class231.field3341, class635.field9003, class462.field6738, class429.field6215, class51.field725, class169.field2158, class229.field3316, class622.field8860, class659.field9334, class232.field3356, class98.field1328, class553.field8062, class714.field10141, class747.field10628, class385.field5621, class279.field3935, class551.field8043, class63.field968, class532.field7704, class5.field65, class390.field5688, class471.field6892, class530.field7695, class71.field1038, class247.field3536, class489.field7163, class562.field8207, class732.field10449, class10.field131, class47.field689, class224.field3260, class487.field7152, class692.field9676, class100.field1350, class112.field1452, class640.field9086, class99.field1334, class344.field4999, class225.field3272, class791.field11508, class354.field5128, class553.field8066, class410.field5917, class397.field5757, class21.field258, class621.field8844, class424.field6120, class442.field6532, class311.field4277, class269.field3815, class446.field6564, class678.field9525, class430.field6240, class502.field7328, class74.field1067, class412.field5928, class1.field3, class26.field316, class430.field6241, class539.field7923, class403.field5870, class272.field3849, class290.field4092, class487.field7137, class238.field3442, class620.field8827, class114.field1468, class210.field3049, class248.field3558, class683.field9579, class228.field3310, class590.field8493, class580.field8390, class375.field5478, class691.field9671, class659.field9337, class684.field9591, class452.field6621, class299.field4172, class10.field130, class621.field8838, class677.field9493, class459.field6688, class761.field10861, class293.field4118, class127.field1597, class736.field10484, class239.field3450, class156.field1973, class301.field4191, class201.field2964, class378.field5521, class76.field1084, class602.field8632, class607.field8697, class663.field9376, class13.field173, class410.field5919, class278.field3928, class741.field10532, class486.field7129, class605.field8678, class415.field5986, class669.field9425, class309.field4266, class108.field1417, class474.field6947, class155.field1971, class121.field1531, class277.field3909, class572.field8282, class480.field7072, class522.field7613, class715.field10175 };
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4419[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class324(String arg0, int arg1) {
        try {
            this.field4415 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4419[1] + (arg0 == null ? field4419[2] : field4419[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2566(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2567(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
