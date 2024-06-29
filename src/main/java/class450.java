import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class450 extends class396 {

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Ljava/lang/String;")
    private String field6569 = "null";

    @OriginalMember(owner = "client!f", name = "C", descriptor = "[[I")
    public static int[][] field6567 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field6573 = 0;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field6576 = -1;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "C")
    public char field6557;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "C")
    public char field6559;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field6566;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Lcs;")
    private class189 field6563;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Lcs;")
    public class189 field6575;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
    public static int[] field6562;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lgn;")
    public static final class417 method2793(int arg0, int arg1) {
        field6568++;
        return arg1 == 8 ? (class417) class201.field2774.method1204((byte) -109, (long) arg0) : null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lls;Lra;BLra;)V")
    public static final void method2794(class74 arg0, class57 arg1, byte arg2, class57 arg3) {
        class233.field3154 = arg1;
        class132.field1812 = arg3;
        if (arg2 <= 101) {
            return;
        }
        field6565++;
        class341.field5017 = arg0;
        if (class233.field3154 != null) {
            class204.field2795 = class233.field3154.method352(1, (byte) -75);
        }
        if (class132.field1812 != null) {
            class308.field4400 = class132.field1812.method352(1, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public final boolean method2795(byte arg0, int arg1) {
        field6571++;
        if (this.field6575 == null) {
            return false;
        }
        if (this.field6563 == null) {
            this.method2802(-24516);
        }
        if (arg0 >= -44) {
            this.field6557 = 'C';
        }
        class193 var3 = (class193) this.field6563.method1204((byte) -82, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method2796(int arg0) {
        field6562 = null;
        field6567 = null;
        if (arg0 != 15820) {
            field6567 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(BI)I")
    public final int method2797(byte arg0, int arg1) {
        field6574++;
        if (arg0 <= 14) {
            method2793(-56, -125);
        }
        if (this.field6575 == null) {
            return this.field6566;
        } else {
            class193 var3 = (class193) this.field6575.method1204((byte) -85, (long) arg1);
            return var3 == null ? this.field6566 : var3.field2631;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lbk;IZ)V")
    private final void method2798(class211 arg0, int arg1, boolean arg2) {
        field6564++;
        if (arg1 == 1) {
            this.field6559 = class392.method2501(21802, arg0.method1373((byte) 30));
        } else if (arg1 == 2) {
            this.field6557 = class392.method2501(21802, arg0.method1373((byte) 30));
        } else if (arg1 == 3) {
            this.field6569 = arg0.method1350(45);
        } else if (arg1 == 4) {
            this.field6566 = arg0.method1336((byte) -39);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1355(32136);
            this.field6575 = new class189(class279.method1761(!arg2, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1336((byte) -74);
                class359 var7;
                if (arg1 == 5) {
                    var7 = new class206(arg0.method1350(47));
                } else {
                    var7 = new class193(arg0.method1336((byte) -38));
                }
                this.field6575.method1202(-1, (long) var6, var7);
            }
        }
        if (!arg2) {
            field6573 = -3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILbk;)V")
    public final void method2799(int arg0, class211 arg1) {
        if (arg0 != 30391) {
            return;
        }
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                field6572++;
                return;
            }
            this.method2798(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(BI)Ljava/lang/String;")
    public final String method2800(byte arg0, int arg1) {
        field6560++;
        if (this.field6575 == null) {
            return this.field6569;
        }
        class206 var3 = (class206) this.field6575.method1204((byte) -82, (long) arg1);
        if (var3 == null) {
            return this.field6569;
        } else if (arg0 == 43) {
            return var3.field2813;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
    public static final void method2801(boolean arg0) {
        field6578++;
        if (class217.field2971 > 0) {
            class6.method60((byte) -75);
            return;
        }
        class289.field4089 = class330.field4719;
        class330.field4719 = null;
        if (!arg0) {
            method2805((String) null, -64, true);
        }
        class266.method1695(40, (byte) 90);
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    private final void method2802(int arg0) {
        field6558++;
        this.field6563 = new class189(this.field6575.method1203((byte) -58));
        if (arg0 == -24516) {
            for (class193 var2 = (class193) this.field6575.method1212(arg0 ^ 0x5FFC); var2 != null; var2 = (class193) this.field6575.method1207(false)) {
                class193 var3 = new class193((int) var2.field5248);
                this.field6563.method1202(-1, (long) var2.field2631, var3);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    private final void method2803(int arg0) {
        field6561++;
        this.field6563 = new class189(this.field6575.method1203((byte) -58));
        if (arg0 > -62) {
            this.method2802(32);
        }
        for (class206 var2 = (class206) this.field6575.method1212(-68); var2 != null; var2 = (class206) this.field6575.method1207(false)) {
            class180 var3 = new class180(var2.field2813, (int) var2.field5248);
            this.field6563.method1202(-1, class219.method1434(14224, var2.field2813), var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2804(String arg0, byte arg1) {
        field6556++;
        if (this.field6575 == null) {
            return false;
        }
        if (this.field6563 == null) {
            this.method2803(-124);
        }
        class180 var3 = (class180) this.field6563.method1204((byte) -80, class219.method1434(14224, arg0));
        if (arg1 != -83) {
            this.field6557 = (char) 65467;
        }
        while (var3 != null) {
            if (var3.field2477.equals(arg0)) {
                return true;
            }
            var3 = (class180) this.field6563.method1209(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method2805(String arg0, int arg1, boolean arg2) {
        field6577++;
        if (arg0 == null) {
            return;
        }
        if (class166.field2326 >= 100) {
            class413.method2589(class189.field2569, 0);
            return;
        }
        String var3 = class407.method2567(arg0, -13);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class166.field2326; var4++) {
            String var8 = class407.method2567(class100.field1129[var4], -13);
            if (var8 != null && var8.equals(var3)) {
                class413.method2589(arg0 + class436.field6387, arg1 ^ 0x2E31);
                return;
            }
            if (class301.field4298[var4] != null) {
                String var9 = class407.method2567(class301.field4298[var4], arg1 - 11838);
                if (var9 != null && var9.equals(var3)) {
                    class413.method2589(arg0 + class436.field6387, 0);
                    return;
                }
            }
        }
        if (arg1 != 11825) {
            method2794((class74) null, (class57) null, (byte) -35, (class57) null);
        }
        for (int var5 = 0; var5 < class100.field1124; var5++) {
            String var6 = class407.method2567(class302.field4300[var5], arg1 ^ 0xFFFFD1C2);
            if (var6 != null && var6.equals(var3)) {
                class413.method2589(class448.field6541 + arg0 + class335.field4956, 0);
                return;
            }
            if (class96.field1076[var5] != null) {
                String var7 = class407.method2567(class96.field1076[var5], -13);
                if (var7 != null && var7.equals(var3)) {
                    class413.method2589(class448.field6541 + arg0 + class335.field4956, 0);
                    return;
                }
            }
        }
        if (class407.method2567(class390.field5715.field1847, -13).equals(var3)) {
            class413.method2589(class144.field2033, 0);
            return;
        }
        class169.field2360.method809(251, arg1 - 39847);
        class327.field4674++;
        class169.field2360.method1396(arg1 ^ 0x7D4E, class233.method1488(-19285, arg0) + 1);
        class169.field2360.method1359((byte) 0, arg0);
        class169.field2360.method1396(arg1 + 9550, arg2 ? 1 : 0);
    }
}
