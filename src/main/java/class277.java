import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class277 extends class131 {

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field3770 = -1;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
    public static boolean field3771 = false;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "F")
    public static float field3774;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lij;")
    public static class316 field3782;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljava/lang/String;")
    public String field3773;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
    public String field3781;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        class82.field1136 = null;
        ++field3772;
        class448.field6350 = false;
        if (arg1 <= -114) {
            class451.field6495 = -1;
            class10.field78 = 1;
            field3784 = arg0;
            class380.field5248 = 0;
            class346.field4682 = -1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public static void method1746(int arg0) {
        field3782 = null;
        if (arg0 < 61) {
            method1745(25, 24);
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static final void method1747(byte arg0) {
        class298.method1821((byte) -126, class31.field431);
        ++field3777;
        ++class255.field3549;
        if (class367.field5091 && class84.field1177) {
            int var1 = class116.field1759.method34(true);
            if (arg0 > -29) {
                field3771 = false;
            }
            int var2 = class116.field1759.method30((byte) 115);
            int var3 = var2 - class182.field2560;
            int var4 = var1 - class228.field3172;
            if (class255.field3549 > class31.field431.field1610) {
                int var5 = var4 - class430.field6020;
                int var6 = -class10.field79 + var3;
                if (var5 > class31.field431.field1545 || -class31.field431.field1545 > var5 || ~class31.field431.field1545 > ~var6 || ~(-class31.field431.field1545) < ~var6) {
                    class406.field5625 = true;
                }
            }
            if (var4 < class55.field726) {
                var4 = class55.field726;
            }
            if (~class446.field6259 < ~var3) {
                var3 = class446.field6259;
            }
            if (~(var4 - -class31.field431.field1568) < ~(class55.field726 - -class22.field286.field1568)) {
                var4 = class55.field726 - class31.field431.field1568 + class22.field286.field1568;
            }
            if (class446.field6259 + class22.field286.field1577 < var3 - -class31.field431.field1577) {
                var3 = class446.field6259 + class22.field286.field1577 + -class31.field431.field1577;
            }
            int var7 = -class55.field726 + var4 + class22.field286.field1665;
            int var8 = -class446.field6259 + var3 + class22.field286.field1633;
            if (class31.field431.field1590 != null && class406.field5625) {
                class101 var9 = new class101();
                var9.field1393 = class31.field431.field1590;
                var9.field1408 = var7;
                var9.field1394 = var8;
                var9.field1403 = class31.field431;
                class172.method1230(var9);
            }
            if (!class116.field1759.method32((byte) 114)) {
                if (class406.field5625) {
                    if (class31.field431.field1649 != null) {
                        class101 var10 = new class101();
                        var10.field1395 = class117.field1782;
                        var10.field1403 = class31.field431;
                        var10.field1408 = var7;
                        var10.field1393 = class31.field431.field1649;
                        var10.field1394 = var8;
                        class172.method1230(var10);
                    }
                    if (class117.field1782 != null && client.method1648(class31.field431) != null) {
                        class309.method1861(class117.field1782, -113, class31.field431);
                    }
                } else if ((class127.field1899 == 1 || class115.method860((byte) -77)) && class149.field2171 > 2) {
                    class373.method2338(class430.field6020 + class228.field3172, class182.field2560 + class10.field79, 11111, 2);
                } else if (class296.method1815(-7084)) {
                    class373.method2338(class430.field6020 + class228.field3172, class182.field2560 + class10.field79, 11111, 0);
                }
                class31.field431 = null;
            }
        } else {
            if (class255.field3549 > 1) {
                class31.field431 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Llq;")
    public final class75 method1748(int arg0) {
        if (arg0 < 97) {
            field3771 = true;
        }
        ++field3768;
        return class80.field1105[super.field1967];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvg;I)Lvg;")
    public static final class108 method1749(class108 arg0, int arg1) {
        ++field3776;
        if (arg1 != -1) {
            return null;
        } else {
            class108 var2 = client.method1648(arg0);
            if (var2 == null) {
                var2 = arg0.field1623;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lh;B)I")
    public static final int method1750(class429 arg0, byte arg1) {
        ++field3775;
        String var2 = class361.method2225(arg0, 126);
        int[] var3 = null;
        if (arg1 >= -67) {
            field3774 = -0.22271463F;
        }
        if (class101.method772(arg0.field5977, 9)) {
            var3 = class367.method2308(false, (int) arg0.field5969).field186;
        } else if (!class323.method1966((byte) 63, arg0.field5977)) {
            if (class13.method69(arg0.field5977, 111)) {
                if (~arg0.field5977 != -1012) {
                    var3 = class133.method996((byte) -19, (int) (arg0.field5969 >>> 32 & 2147483647L)).field6303;
                } else {
                    var3 = class133.method996((byte) -19, (int) arg0.field5969).field6303;
                }
            }
        } else {
            class419 var4 = class428.field5951[(int) arg0.field5969];
            if (var4 != null) {
                var3 = var4.field5807.field3291;
            }
        }
        if (var3 != null) {
            var2 = var2 + class303.method1837(var3, -3560);
        }
        return class280.field3810.method2420(class406.field5627, -1, var2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    public static final void method1751(int arg0, boolean arg1) {
        ++field3778;
        class26 var2 = class217.method1445(arg1, arg0, 9);
        var2.method164(12);
    }

    static {
        new class368("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field3783 = 0;
    }
}
