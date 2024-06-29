import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lo;")
    public static class84 field1674 = class15.method124("Username: ", 255);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lo;")
    public static class84 field1677 = class15.method124("You have not yet set*6nany contact details)3", 255);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lo;")
    public static class84 field1687 = class15.method124("Please check your message)2centre for details)3", 255);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lo;")
    public static class84 field1681 = class15.method124("To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y", 255);

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field1690 = 0;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lo;")
    public static class84 field1684 = class15.method124("backvmid2", 255);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lo;")
    public static class84 field1679 = class15.method124("Continue", 255);

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lo;")
    private static class84 field1693 = class15.method124("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 255);

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field1692 = new int[2000];

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lo;")
    public static class84 field1682 = field1693;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lp;")
    public static class89 field1676;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 5)
    public static void method577(int arg0) {
        field1682 = null;
        field1687 = null;
        if (arg0 <= 49) {
            method579(false, -21);
        }
        field1674 = null;
        field1692 = null;
        field1684 = null;
        field1679 = null;
        field1676 = null;
        field1681 = null;
        field1677 = null;
        field1693 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 38)
    public static final void method578(Component arg0, int arg1) {
        if (arg1 < 52) {
            method577(-42);
        }
        arg0.addMouseListener(class99.field2104);
        arg0.addMouseMotionListener(class99.field2104);
        field1685++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V", line = 54)
    public static final void method579(boolean arg0, int arg1) {
        class110.field2388++;
        field1678++;
        if (arg1 > class110.field2388 && !arg0) {
            return;
        }
        class110.field2388 = 0;
        if (class89.field2009 || class82.field1764 == null) {
            return;
        }
        class78.field1654++;
        class97.field2070.method979(1, 217);
        try {
            class82.field1764.method396(class97.field2070.field502, class97.field2070.field482, 0, true);
            class97.field2070.field482 = 0;
        } catch (IOException var2) {
            class89.field2009 = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 79)
    public static final void method580(int arg0) {
        field1688++;
        if (class110.field2378 == 2) {
            class125.method968(class97.field2073 * 2, (client.field335 - class106.field2242 << 7) + class24.field406, (-class36.field714 + class101.field2136 << 7) + class67.field1466, -1);
            if (arg0 == -11 && (class19.field370 > -1 && class128.field2837 % 20 < 10)) {
                class120.field2661[0].method947(class19.field370 - 12, class25.field437 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)I", line = 137)
    public static final int method581(int arg0, byte arg1, int arg2) {
        if (arg1 < 83) {
            return 109;
        }
        field1689++;
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 166)
    public static final void method582(int arg0) {
        field1683++;
        class61 var1 = class85.field1929;
        synchronized (class85.field1929) {
            class54.field1118 = class24.field401;
            if (arg0 <= class44.field915) {
                while (class44.field915 != class115.field2511) {
                    int var2 = class89.field2013[class115.field2511];
                    class115.field2511 = class115.field2511 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class119.field2631[var2] = true;
                    } else {
                        class119.field2631[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class119.field2631[var3] = false;
                }
                class44.field915 = class115.field2511;
            }
            class24.field401 = class114.field2465;
        }
    }
}
