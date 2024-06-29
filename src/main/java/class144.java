import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class144 extends class161 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2515 = -1;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Lp;")
    public static class280 field2521 = class18.method140((byte) -128, "Cabbage");

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[[[B")
    public static byte[][][] field2514;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field2521 = null;
        if (arg0 == -23) {
            field2514 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static final void method993(byte arg0) {
        field2522++;
        if (!class31.field582) {
            if (class60.field969 != 0) {
                class30.field573 = class225.field3887;
                class23.field416 = class58.field936;
            } else if (class175.field3034 == 0) {
                class23.field416 = class154.field2673;
                class30.field573 = class229.field3957;
            } else {
                class30.field573 = class98.field1572;
                class23.field416 = class187.field3268;
            }
            class275.field4765[0] = 1002;
            class197.field3441[0] = class248.field4345;
            class157.field2745 = 1;
            class123.field2161[0] = class277.field4808;
            class258.field4566[0] = class229.field3959;
        }
        if (class246.field4315 != -1) {
            class89.method638(class246.field4315, arg0 ^ 0x7F07);
        }
        for (int var1 = 0; var1 < class31.field585; var1++) {
            if (class207.field3583[var1]) {
                class120.field2130[var1] = true;
            }
            class255.field4515[var1] = class207.field3583[var1];
            class207.field3583[var1] = false;
        }
        class33.field612 = null;
        class2.field83 = null;
        class157.field2754 = -1;
        class54.field891 = -1;
        class17.field321 = class117.field2104;
        if (class246.field4315 != -1) {
            class31.field585 = 0;
            class175.method1201(0, class246.field4315, 0, 0, 0, arg0 - 8723, class103.field1724, class190.field3328, -1);
        }
        class151.method1053();
        class28.method250((byte) 127);
        if (class31.field582) {
            if (class148.field2567) {
                class153.method1082(0);
            } else {
                class34.method287(-2702);
            }
        } else if (class2.field83 != null) {
            class261.method1767((byte) 104, class98.field1595, class2.field83, class131.field2336);
        } else if (class157.field2754 != -1) {
            class261.method1767((byte) 119, class54.field891, (class113) null, class157.field2754);
        }
        int var2 = class31.field582 ? -1 : class175.method1200(arg0 + 29);
        if (var2 == -1) {
            var2 = class122.field2153;
        }
        if (arg0 != 75) {
            return;
        }
        class153.method1085(-1, var2);
        if (class55.field896 == 1) {
            class55.field896 = 2;
        }
        if (class176.field3071 == 1) {
            class176.field3071 = 2;
        }
        if (class201.field3522 == 3) {
            for (int var3 = 0; var3 < class31.field585; var3++) {
                if (class255.field4515[var3]) {
                    class151.method1049(class169.field2958[var3], class232.field4052[var3], class91.field1478[var3], class14.field278[var3], 16711935, 128);
                } else if (class120.field2130[var3]) {
                    class151.method1049(class169.field2958[var3], class232.field4052[var3], class91.field1478[var3], class14.field278[var3], 16711680, 128);
                }
            }
        }
        class126.method870(class165.field2889, (byte) -19, class262.field4631.field4793, class262.field4631.field4791, class231.field4013);
        class165.field2889 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public static final void method994(byte arg0) {
        if (arg0 != 83) {
            field2515 = -92;
        }
        field2523++;
        if (class45.field750 != null) {
            class205 var1 = class45.field750;
            synchronized (class45.field750) {
                class45.field750 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZZ)I")
    public static final int method995(boolean arg0, boolean arg1) {
        field2524++;
        if (!arg1) {
            field2520 = -58;
        }
        long var2 = class77.method569((byte) 7);
        for (class116 var4 = arg0 ? (class116) class176.field3063.method142(true) : (class116) class176.field3063.method143((byte) -124); var4 != null; var4 = (class116) class176.field3063.method143((byte) -125)) {
            if ((var4.field2095 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2095 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2827;
                    class17.field314[var5] = class183.field3225[var5];
                    var4.method1146(26159);
                    return var5;
                }
                var4.method1146(26159);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILtg;)V")
    public static final void method996(int arg0, class180 arg1) {
        field2516++;
        class20.field372 = arg1;
        if (arg0 != 0) {
            field2520 = -8;
        }
    }
}
