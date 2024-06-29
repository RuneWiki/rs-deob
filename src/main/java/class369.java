import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class369 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lh;")
    public static class434 field5061 = new class434(29, 3);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5062 = 0;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5063 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 38)
    public static void method2277(int arg0) {
        field5061 = null;
        if (arg0 != -3109) {
            method2279(false, 'Y', (String) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lmr;II)V", line = 50)
    public static final void method2278(class86 arg0, int arg1, int arg2) {
        field5060++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field1167 > class70.field968) {
            class215.method1220((byte) -112, arg0);
        } else if (arg0.field1120 < class70.field968) {
            class48.method343(arg0, (byte) -1, false);
            var4 = class95.field1401;
            var3 = class199.field2695;
        } else {
            class270.method1535(arg0, (byte) 105);
        }
        if (arg1 != -921600) {
            method2277(31);
        }
        if (arg0.field6501 < 128 || arg0.field6507 < 128 || class295.field3947 * 128 - 128 <= arg0.field6501 || arg0.field6507 >= ((class39.field567 - 1) * 128)) {
            arg0.field1137 = -1;
            arg0.field1167 = 0;
            var3 = -1;
            arg0.field1120 = 0;
            var4 = 0;
            arg0.field1134 = -1;
            arg0.field6501 = arg0.field1193[0] * 128 + arg0.method545(false) * 64;
            arg0.field6507 = arg0.field1197[0] * 128 + (arg0.method545(false) * 64);
            arg0.method548(arg1 ^ 0xE0F85);
        }
        if (class233.field3103 == arg0 && (arg0.field6501 < 1536 || arg0.field6507 < 1536 || class295.field3947 * 128 - 1536 <= arg0.field6501 || arg0.field6507 >= ((class39.field567 - 12) * 128))) {
            arg0.field1134 = -1;
            arg0.field1137 = -1;
            var4 = 0;
            var3 = -1;
            arg0.field1120 = 0;
            arg0.field1167 = 0;
            arg0.field6501 = arg0.field1193[0] * 128 + (arg0.method545(false) * 64);
            arg0.field6507 = arg0.field1197[0] * 128 + arg0.method545(false) * 64;
            arg0.method548(arg1 + 921479);
        }
        int var5 = class407.method2451(true, arg0);
        class82.method528(var5, var4, var3, arg0, arg1 + 901109);
        class365.method2226((byte) -42, arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 132)
    public static final int method2279(boolean arg0, char arg1, String arg2) {
        field5059++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0) {
            method2281((byte) 12);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lcj;", line = 162)
    public static final class451 method2280(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6849;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 170)
    public static final void method2281(byte arg0) {
        class491.method2861(class330.field4381, 1);
        class37.field551++;
        field5058++;
        class203.field2751.method228(class6.method41((byte) -121), 32);
        if (arg0 < 117) {
            method2281((byte) -53);
        }
        class203.field2751.method229(class424.field5738, 1309449544);
        class203.field2751.method229(class72.field986, 1309449544);
        class203.field2751.method228(class488.field6789.field6678, 32);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 201)
    public static final void method2282() {
        class324.method1806(1, class142.field2056);
    }
}
