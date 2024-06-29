import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class119 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lth;")
    public static class57 field1668 = new class57(200);

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field1681 = -1;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field1684 = new String[200];

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Lg;")
    public static class67 field1683 = new class67(128);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Ltl;")
    public static class64 field1675;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[B")
    public byte[] field1667;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[B")
    public byte[] field1669;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[[Lqf;")
    public static class359[][] field1677;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[[S")
    public static short[][] field1674;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 4)
    public static void method891(int arg0) {
        field1668 = null;
        field1683 = null;
        field1684 = null;
        field1677 = (class359[][]) null;
        field1675 = null;
        field1674 = (short[][]) null;
        if (arg0 != -26949) {
            method893(-92, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method892(boolean arg0) {
        if (arg0) {
            class302.field4502 = class129.field1875;
            class132.field1930 = class240.field3567;
            class129.field1874 = class253.field3781;
        } else {
            class302.field4502 = class251.field3726;
            class132.field1930 = class287.field4340;
            class129.field1874 = class247.field3663;
        }
        class252.field3748 = class302.field4502.length;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Ltc;", line = 42)
    public static final class248 method893(int arg0, byte arg1) {
        if (arg1 != -41) {
            method892(false);
        }
        field1671++;
        class248 var2 = (class248) class172.field2478.method461((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field858.method2520(class318.method2222(arg0, (byte) 85), class11.method63(arg0, 123), (byte) -25);
        class248 var4 = new class248();
        var4.field3674 = arg0;
        if (var3 != null) {
            var4.method1823(false, new class190(var3));
        }
        var4.method1822(-14432);
        class172.field2478.method460(var4, -26089, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIZII)V", line = 83)
    public static final void method894(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class359 var7 = class165.method1172(arg0, -1, arg1);
        if (var7 != null && var7.field5662 != null) {
            class300 var8 = new class300();
            var8.field4494 = var7.field5662;
            var8.field4491 = var7;
            class48.method412(var8, 200000);
        }
        class67.field976 = arg0;
        class133.field1949 = arg2;
        class273.field4150 = arg4;
        class158.field2284 = arg6;
        field1672++;
        class33.field475 = arg3;
        class49.field728 = arg5;
        class88.field1234 = arg1;
        class83.method676(var7, (byte) 59);
    }
}
