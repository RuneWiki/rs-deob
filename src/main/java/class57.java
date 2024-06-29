import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class57 {

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lda;")
    public static class275 field959 = class255.method1672(92, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lda;")
    private static class275 field960 = class255.method1672(125, "Loaded interfaces");

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lda;")
    private static class275 field954 = class255.method1672(126, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lda;")
    public static class275 field957 = field954;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[[S")
    public static short[][] field963 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lda;")
    public static class275 field952 = field960;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[[[B")
    public static byte[][][] field964;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method356(byte arg0) {
        while (true) {
            if (class196.field3351.method518((byte) 49, class59.field1000) >= 11) {
                int var1 = class196.field3351.method525((byte) -74, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class16.field238[var1] == null) {
                        var2 = true;
                        class16.field238[var1] = new class109();
                        if (class13.field208[var1] != null) {
                            class16.field238[var1].method811(class13.field208[var1], -126);
                        }
                    }
                    class149.field2595[class32.field486++] = var1;
                    class109 var3 = class16.field238[var1];
                    var3.field1739 = class35.field576;
                    int var4 = class116.field2065[class196.field3351.method525((byte) -34, 3)];
                    if (var2) {
                        var3.field1773 = var3.field1787 = var4;
                    }
                    int var5 = class196.field3351.method525((byte) -79, 5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class196.field3351.method525((byte) -38, 1);
                    int var7 = class196.field3351.method525((byte) -88, 1);
                    if (var7 == 1) {
                        class181.field3117[class184.field3154++] = var1;
                    }
                    int var8 = class196.field3351.method525((byte) -33, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method810(class66.field1094.field1722[0] + var8, (byte) -109, class66.field1094.field1752[0] + var5, var6 == 1);
                    continue;
                }
            }
            if (arg0 != -64) {
                method356((byte) 105);
            }
            class196.field3351.method515((byte) -126);
            field961++;
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)Lpj;")
    public static final class35 method357(int arg0, boolean arg1) {
        class35 var2 = (class35) class160.field2804.method990((long) arg0, (byte) 19);
        field953++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2648.method775(1, arg0, -24799);
        if (!arg1) {
            method356((byte) -70);
        }
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method210(new class85(var3), arg0, true);
        }
        class160.field2804.method986(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Z")
    public static final boolean method358(int arg0, int arg1) {
        field965++;
        if (arg1 != 5596) {
            method359(48);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        field954 = null;
        field952 = null;
        field957 = null;
        if (arg0 < 74) {
            method360(46);
        }
        field959 = null;
        field960 = null;
        field963 = null;
        field964 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static final void method360(int arg0) {
        field955++;
        if (arg0 == 3658) {
            class53.field887.method993(107);
            class220.field3744.method993(124);
            class36.field587.method993(127);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILma;I)[Lrk;")
    public static final class20[] method361(int arg0, class105 arg1, int arg2) {
        if (arg2 < 113) {
            field963 = null;
        }
        field962++;
        return class181.method1213((byte) 109, arg1, arg0) ? class180.method1209(true) : null;
    }
}
