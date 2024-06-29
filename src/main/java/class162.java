import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class162 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
    public static int[] field2433 = new int[5];

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2436 = "Drop";

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lfe;")
    public static class248 field2438 = new class248(16);

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lom;")
    public static class156 field2444 = new class156();

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[I")
    public static int[] field2445 = new int[2];

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2446 = 1;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[Lli;")
    public static class182[] field2447 = new class182[28];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1145(int arg0) {
        field2434++;
        if (class155.field2325 == null) {
            return -1;
        }
        while (class155.field2325.field1996 > class246.field3664) {
            if (class155.field2325.method958(class246.field3664, -128)) {
                return class246.field3664++;
            }
            class246.field3664++;
        }
        if (arg0 != -1) {
            method1149((class210) null, (class210) null, false, 25);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Llm;I)V", line = 33)
    public static final void method1146(class210 arg0, int arg1) {
        field2437++;
        if (arg1 == 24005) {
            class305.field4648 = arg0.method1448((byte) 10, "titlebg");
            class197.field2964 = arg0.method1448((byte) 10, "logo");
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class325.field4898; var5++) {
            if (arg0 < class6.field29[var5] + class228.field3473[var5] && class228.field3473[var5] < (arg0 + arg1) && class307.field4678[var5] + class15.field168[var5] > arg2 && arg2 + arg4 > class15.field168[var5]) {
                class131.field2021[var5] = true;
            }
        }
        if (arg3 != 5) {
            field2446 = -2;
        }
        field2435++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 72)
    public static void method1148(int arg0) {
        field2438 = null;
        field2445 = null;
        field2433 = null;
        if (arg0 < -83) {
            field2447 = null;
            field2444 = null;
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Llm;Llm;ZI)V", line = 87)
    public static final void method1149(class210 arg0, class210 arg1, boolean arg2, int arg3) {
        if (arg3 >= -33) {
            method1150((byte) -9);
        }
        class13.field150 = arg0;
        class96.field1445 = arg2;
        class141.field2134 = arg1;
        field2442++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 114)
    public static final void method1150(byte arg0) {
        if (class233.field3504 < 0) {
            class204.field3070 = -1;
            class233.field3504 = 0;
            class154.field2321 = -1;
        }
        field2440++;
        if (class41.field497 < class233.field3504) {
            class233.field3504 = class41.field497;
            class204.field3070 = -1;
            class154.field2321 = -1;
        }
        if (class203.field3037 < 0) {
            class204.field3070 = -1;
            class154.field2321 = -1;
            class203.field3037 = 0;
        }
        if (class203.field3037 > class111.field1719) {
            class203.field3037 = class111.field1719;
            class204.field3070 = -1;
            class154.field2321 = -1;
        }
        if (arg0 != 24) {
            field2447 = (class182[]) null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLlm;Llm;)V", line = 155)
    public static final void method1151(boolean arg0, class210 arg1, class210 arg2) {
        field2431++;
        class116.field1766 = arg2;
        class200.field2992 = arg1;
        if (arg0) {
            method1146((class210) null, 22);
        }
    }
}
