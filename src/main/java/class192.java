import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class192 extends class45 {

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field2574 = 104;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
    public static int[] field2571 = new int[] { 0, 0, -1, 0, 6, 0, 2, 0, 0, 0, 0, 6, 0, 0, -2, 0, 0, 0, -1, 2, 1, 0, 0, 6, 8, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 2, 28, 0, 0, 0, -1, 0, 7, -2, 0, -1, 0, 4, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, -1, 0, 0, 6, 10, 0, 15, 0, -1, 0, 0, 0, 5, 0, 3, -1, 0, 6, 7, 0, 0, 0, 0, 0, 14, 0, -1, 7, 0, -2, 8, 4, 0, 12, 0, 2, -2, 0, 6, 0, 0, 0, 1, 1, 0, 0, 0, 0, 6, 0, -2, 2, 0, 0, -1, 0, 0, 0, 0, 0, 8, 0, 0, 0, 12, -2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 6, 8, 3, -1, 0, -1, -1, 0, 0, 0, 0, -2, 2, 0, 0, -1, 0, 17, -1, 0, 0, -2, 6, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 8, 0, 2, 11, 3, 0, 0, 0, 0, 4, 8, 0, 6, 6, 0, 0, 7, 1, 0, 0, 3, 20, 4, 0, 5, 0, 3, 0, 0, 0, 8, -2, 15, 10, 0, 0, -2, 0, 0, 0, 0, 14, 0, -1, 0, 0, 0, 0, -1, 0, 5, 0, 0, -2, 8, -2, 0, 5, 12, 6, 0, 3, 0, 9, 0, 0, 0, 10, 0, 0, -1, 0, 0, 0, 0, 0, 8, 2, 0, 12, 3 };

    @OriginalMember(owner = "client!co", name = "v", descriptor = "[I")
    public static int[] field2575 = new int[128];

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lps;")
    public class394 field2565;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lps;")
    public class394 field2566;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lps;")
    public static class394 field2570;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "Ljava/lang/String;")
    public String field2582;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Z")
    public boolean field2567;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field2578;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1154(boolean arg0, int arg1) {
        field2577++;
        if (!arg0) {
            field2575 = null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        field2580++;
        class189 var1 = class439.field6453;
        synchronized (class439.field6453) {
            if (arg0 != 0) {
                method1157(121);
            }
            class439.field6453.method1141(256);
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field2571 = null;
        field2570 = null;
        field2575 = null;
        if (arg0 < 27) {
            method1154(false, 87);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)Z")
    public static final boolean method1157(int arg0) {
        field2579++;
        if (class329.field4789) {
            try {
                if ((Boolean) class421.method2690(class76.field1085.field519, "showingVideoAd", -27444)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -17 % ((-arg0 - 73) / 40);
        return true;
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        field2573++;
        for (int var1 = 0; var1 < 5; var1++) {
            class119.field1671[var1] = false;
        }
        class276.field3992 = class179.field2371;
        class286.field4143 = class201.field2667;
        class346.field4979 = 5;
        class253.field3491 = -1;
        class23.field319 = class5.field66;
        class302.field4451 = class400.field5971;
        class367.field5302 = -1;
        class157.field2130 = class28.field418;
        class91.field1281 = 0;
        class68.field880 = 0;
        if (arg0 != 6122) {
            method1158(92);
        }
        class215.field2866 = class415.field6101;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
    public static final int method1159(int arg0, int arg1) {
        field2572++;
        if (arg0 < 20) {
            method1158(-28);
        }
        return arg1 & 0xFF;
    }
}
