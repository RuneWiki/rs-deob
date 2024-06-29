import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class213 extends class12 {

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Lwf;")
    public static class70 field2905 = new class70(16);

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Z")
    public static boolean field2915 = false;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "[Z")
    public static boolean[] field2918 = new boolean[8];

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2916 = "Close";

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lbo;")
    public class433 field2911;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Lra;")
    public static class57 field2919;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1397(byte arg0) {
        field2919 = null;
        field2916 = null;
        field2905 = null;
        field2918 = null;
        if (arg0 != -35) {
            field2918 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1398(int arg0, Component arg1) {
        field2907++;
        arg1.removeMouseListener(class343.field5050);
        arg1.removeMouseMotionListener(class343.field5050);
        arg1.removeFocusListener(class343.field5050);
        class66.field748 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1399(String arg0, int arg1) {
        if (arg1 >= -77) {
            field2919 = null;
        }
        field2913++;
        for (int var2 = 0; var2 < class252.field3408.length; var2++) {
            if (class252.field3408[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public static final void method1400(int arg0) {
        field2914++;
        class50 var1 = class406.field5896;
        synchronized (class406.field5896) {
            class115.field1348 = class181.field2482;
            if (arg0 != -1450) {
                method1399((String) null, 124);
            }
            class96.field1077++;
            if (class444.field6490 >= 0) {
                while (class444.field6490 != class437.field6411) {
                    int var2 = class277.field3902[class437.field6411];
                    class437.field6411 = class437.field6411 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class256.field3447[var2] = true;
                    } else {
                        class256.field3447[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class256.field3447[var3] = false;
                }
                class444.field6490 = class437.field6411;
            }
            class181.field2482 = class382.field5612;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lqr;")
    public static final class41 method1401(int arg0, int arg1) {
        field2906++;
        class41 var2 = (class41) class257.field3494.method2049(-125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class383.field5620.method361(0, 57, arg1);
        int var4 = -70 % ((arg0 - 5) / 60);
        class41 var5 = new class41();
        if (var3 != null) {
            var5.method255(false, new class211(var3));
        }
        var5.method256(false);
        class257.field3494.method2046((long) arg1, 0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lbk;I)V")
    public static final void method1402(class211 arg0, int arg1) {
        field2909++;
        int var2 = arg0.method1376(128);
        class228.field3118 = new class139[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class228.field3118[var3] = new class139();
            class228.field3118[var3].field1974 = arg0.method1376(arg1 + 128);
            class228.field3118[var3].field1973 = arg0.method1365((byte) -122);
        }
        class238.field3244 = arg0.method1376(arg1 + 128);
        class384.field5627 = arg0.method1376(arg1 + 128);
        class393.field5753 = arg0.method1376(128);
        class155.field2211 = new class175[class384.field5627 + 1 - class238.field3244];
        for (int var4 = arg1; var4 < class393.field5753; var4++) {
            int var5 = arg0.method1376(arg1 ^ 0x80);
            class175 var6 = class155.field2211[var5] = new class175();
            var6.field771 = arg0.method1342((byte) -127);
            var6.field769 = arg0.method1336((byte) -75);
            var6.field2431 = var5 + class238.field3244;
            var6.field2433 = arg0.method1365((byte) -124);
            var6.field2436 = arg0.method1365((byte) -126);
        }
        class403.field5874 = arg0.method1336((byte) -126);
        class151.field2126 = true;
    }
}
