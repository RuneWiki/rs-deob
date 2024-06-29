import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class457 extends class523 {

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field6788 = 0;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)J")
    public static final long method2796(byte arg0) {
        field6789++;
        if (arg0 != -63) {
            method2798(-14);
        }
        return class308.field4705.method1430(120);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIZI)Lum;")
    public static final class83 method2797(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6790++;
        if (arg4 >= -24) {
            method2799(-81);
        }
        class14 var5 = null;
        if (class227.field3442 != null) {
            var5 = new class14(arg2, class227.field3442, class452.field6725[arg2], 1000000);
        }
        class47.field750[arg2] = class3.field47.method1138(var5, arg2, (byte) -113, class448.field6649);
        if (arg3) {
            class47.field750[arg2].method2229((byte) -39);
        }
        return new class83(class47.field750[arg2], arg0, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static final void method2798(int arg0) {
        class62.method421(22050, class40.field667.field4203, (byte) -98, 2);
        field6791++;
        class319.field4844 = new class370();
        class319.field4844.method2364(72, 9, 128);
        class350.field5227 = class506.method3016(class122.field1844, 22050, 0, 4189, class342.field5114);
        class350.field5227.method2817(class319.field4844, (byte) -114);
        class30.method185(class319.field4844, class365.field5379, class470.field6896, class144.field2122, (byte) -72);
        int var1 = -85 / ((arg0 + 26) / 44);
        class176.field2707 = class506.method3016(class122.field1844, 2048, 1, 4189, class342.field5114);
        class503.field7313 = new class255();
        class176.field2707.method2817(class503.field7313, (byte) -114);
        class411.field6072 = new class54(22050, class193.field2961);
        class148.field2194 = class417.field6135.method737("scape main", -1);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method2799(int arg0) {
        field6792++;
        class95 var1 = null;
        try {
            class329 var2 = class122.field1844.method472("2", true, (byte) 12);
            while (var2.field4974 == 0) {
                class468.method2848(1L, (byte) -35);
            }
            if (var2.field4974 == 1) {
                var1 = (class95) var2.field4975;
                class194 var3 = new class194((class42.field676 * 6) + 3);
                var3.method1381(1, (byte) 80);
                var3.method1364(class42.field676, true);
                for (int var4 = 0; var4 < class395.field5835.length; var4++) {
                    if (class541.field7914[var4]) {
                        var3.method1364(var4, true);
                        var3.method1348((byte) -65, class395.field5835[var4]);
                    }
                }
                var1.method805(var3.field2973, true, 0, var3.field2982);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method800(false);
            }
        } catch (Exception var5) {
        }
        if (arg0 == -30772) {
            class537.field7887 = class375.method2397((byte) -75);
            class107.field1628 = false;
        }
    }
}
