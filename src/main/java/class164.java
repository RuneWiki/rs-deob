import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class164 extends class263 {

    @OriginalMember(owner = "client!mr", name = "O", descriptor = "Z")
    public static boolean field2444 = false;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "[I")
    public static int[] field2440 = new int[1000];

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "Luv;")
    public static class2 field2438 = new class2(2, 6);

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mr", name = "N", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "Lqm;")
    public static class281 field2437;

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "Lla;")
    public static class307 field2445;

    @OriginalMember(owner = "client!mr", name = "Q", descriptor = "[[Lmh;")
    public static class112[][] field2446;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lgo;I)V")
    public static final void method1149(class310 arg0, int arg1) {
        field2436++;
        if (!class302.field4504) {
            return;
        }
        if (arg0.field4785 != null) {
            class310 var2 = class406.method2442((byte) -96, class327.field5118, class179.field2655);
            if (var2 != null) {
                class120 var3 = new class120();
                var3.field1832 = arg0.field4785;
                var3.field1830 = var2;
                var3.field1833 = arg0;
                class64.method449(var3);
            }
        }
        class192.field2819++;
        class97.method758(class251.field3434, false);
        class43.field559.method2717(arg0.field4643, 496598568);
        class43.field559.method2739(arg0.field4665, (byte) -41);
        class43.field559.method2739(class532.field7837, (byte) -41);
        class43.field559.method2773((byte) 105, arg0.field4675);
        if (arg1 != 2) {
            method1149(null, -30);
        }
        class43.field559.method2742((byte) -106, class179.field2655);
        class43.field559.method2717(class327.field5118, 496598568);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1150(String arg0, int arg1) {
        field2442++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 >= -9) {
            return 111;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = arg0.charAt(var4) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2435++;
        if (class297.field4427 <= arg5 && arg2 <= class102.field1544 && arg1 >= class305.field4555 && arg0 <= class286.field4290) {
            class431.method2548(arg6, arg2, 1538822376, arg7, arg3, arg0, arg1, arg5);
        } else {
            class349.method2114(arg6, arg1, arg7, (byte) -30, arg5, arg2, arg0, arg3);
        }
        if (arg4 >= -104) {
            method1150(null, 90);
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        if (arg1 <= 40) {
            field2445 = null;
        }
        field2443++;
        return class379.field5711;
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2438 = null;
        field2440 = null;
        if (arg0 != -43) {
            field2444 = true;
        }
        field2445 = null;
        field2437 = null;
        field2446 = null;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1153(String arg0, int arg1) {
        field2441++;
        if (arg1 != 10) {
            field2439 = -69;
        }
        return class152.method1101(arg0, 10, false, true);
    }
}
