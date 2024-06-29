import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class249 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field4365 = -1;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[Lp;")
    public static class280[] field4356 = null;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field4362 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "Lp;")
    public static class280 field4367 = class18.method140((byte) -119, "<col=c0ff00>");

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "[Lp;")
    public static class280[] field4372 = new class280[5];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field4360 = 100;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "Lp;")
    private static class280 field4371 = class18.method140((byte) -128, " from your friend list first)3");

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lp;")
    public static class280 field4357 = field4371;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[[[B")
    public static byte[][][] field4353;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1679(int arg0) {
        field4372 = null;
        field4353 = null;
        field4371 = null;
        field4367 = null;
        field4356 = null;
        if (arg0 != 156) {
            field4356 = null;
        }
        field4357 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)I")
    public static final int method1680(int arg0, byte arg1) {
        field4358++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else {
            if (arg1 < 99) {
                field4372 = null;
            }
            return arg0 == 156 ? 140 : arg0;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILp;Lp;Lp;)V")
    public static final void method1681(int arg0, int arg1, class280 arg2, class280 arg3, class280 arg4) {
        if (arg1 == 33) {
            field4373++;
            class92.method655(-1, arg3, arg2, (byte) 92, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBII)V")
    public static final void method1682(int arg0, byte arg1, int arg2, int arg3) {
        class113 var4 = class224.method1509(arg2, arg0, (byte) -90);
        if (var4 != null && var4.field1932 != null) {
            class178 var5 = new class178();
            var5.field3107 = var4.field1932;
            var5.field3106 = var4;
            class199.method1371(200000, var5);
        }
        if (arg1 >= -34) {
            return;
        }
        field4355++;
        class167.field2931 = arg3;
        class235.field4098 = arg2;
        class263.field4647 = true;
        class28.field529 = arg0;
        class242.method1642((byte) 96, var4);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z")
    public static final boolean method1683(int arg0) {
        if (arg0 < 55) {
            method1680(100, (byte) -88);
        }
        field4352++;
        class57 var1 = class182.field3192;
        synchronized (class182.field3192) {
            if (class48.field789 == class258.field4576) {
                return false;
            } else {
                class123.field2165 = class189.field3321[class48.field789];
                class244.field4295 = class242.field4244[class48.field789];
                class48.field789 = class48.field789 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)Z")
    public static final boolean method1684(byte arg0, int arg1) {
        if (arg0 < 97) {
            method1682(-82, (byte) -68, 91, 120);
        }
        field4370++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)Lp;")
    public static final class280 method1685(byte arg0, int arg1) {
        int var2 = 40 % ((-arg0 - 19) / 52);
        field4364++;
        return class129.method885(10, false, -1, arg1);
    }
}
