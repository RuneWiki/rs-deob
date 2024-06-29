import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class111 {

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Ljava/lang/String;")
    private String field1613 = "null";

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "C")
    public char field1603;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "C")
    public char field1611;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "D")
    public static double field1607;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Ltba;")
    private class165 field1605;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ltba;")
    public class165 field1614;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 4)
    public final String method878(byte arg0, int arg1) {
        field1601++;
        if (this.field1614 == null) {
            return this.field1613;
        }
        class645 var3 = (class645) this.field1614.method1160((long) arg1, 124);
        if (var3 == null) {
            return this.field1613;
        } else {
            int var4 = -43 % ((-arg0 - 63) / 45);
            return var3.field8929;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 25)
    public final boolean method879(boolean arg0, String arg1) {
        field1612++;
        if (this.field1614 == null) {
            return false;
        }
        if (this.field1605 == null) {
            this.method881(0);
        }
        if (!arg0) {
            this.method878((byte) -17, 8);
        }
        for (class429 var3 = (class429) this.field1605.method1160(class177.method1213(false, arg1), 122); var3 != null; var3 = (class429) this.field1605.method1162(117)) {
            if (var3.field5741.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLsl;I)V", line = 53)
    private final void method880(byte arg0, class461 arg1, int arg2) {
        field1606++;
        if (arg0 > -84) {
            return;
        }
        if (arg2 == 1) {
            this.field1603 = class534.method3078(255, arg1.method2601(0));
        } else if (arg2 == 2) {
            this.field1611 = class534.method3078(255, arg1.method2601(0));
        } else if (arg2 == 3) {
            this.field1613 = arg1.method2574(-1);
        } else if (arg2 == 4) {
            this.field1610 = arg1.method2622(-539564808);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2566(-2);
            this.field1614 = new class165(class565.method3253(119, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2622(-539564808);
                class168 var7;
                if (arg2 == 5) {
                    var7 = new class645(arg1.method2574(-1));
                } else {
                    var7 = new class393(arg1.method2622(-539564808));
                }
                this.field1614.method1153(var7, (long) var6, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 106)
    private final void method881(int arg0) {
        field1600++;
        this.field1605 = new class165(this.field1614.method1154((byte) -11));
        for (class645 var2 = (class645) this.field1614.method1156(arg0 + arg0); var2 != null; var2 = (class645) this.field1614.method1158(22706)) {
            class429 var3 = new class429(var2.field8929, (int) var2.field2333);
            this.field1605.method1153(var3, class177.method1213(false, var2.field8929), -1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 125)
    private final void method882(byte arg0) {
        field1599++;
        this.field1605 = new class165(this.field1614.method1154((byte) -11));
        if (arg0 != 90) {
            this.method880((byte) -28, null, 85);
        }
        for (class393 var2 = (class393) this.field1614.method1156(0); var2 != null; var2 = (class393) this.field1614.method1158(22706)) {
            class393 var3 = new class393((int) var2.field2333);
            this.field1605.method1153(var3, (long) var2.field4992, -1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILsl;)V", line = 147)
    public final void method883(int arg0, class461 arg1) {
        if (arg0 != 16992) {
            field1608 = 120;
        }
        field1609++;
        while (true) {
            int var3 = arg1.method2600((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method880((byte) -119, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 171)
    public final int method884(int arg0, int arg1) {
        if (arg0 != -5507) {
            method885((byte) -45);
        }
        field1604++;
        if (this.field1614 == null) {
            return this.field1610;
        } else {
            class393 var3 = (class393) this.field1614.method1160((long) arg1, 127);
            return var3 == null ? this.field1610 : var3.field4992;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 191)
    public static final void method885(byte arg0) {
        field1602++;
        class534 var1 = class26.field470;
        synchronized (class26.field470) {
            class26.field470.method3064(false);
        }
        if (arg0 != -29) {
            field1608 = -78;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Z", line = 208)
    public final boolean method886(int arg0, int arg1) {
        field1615++;
        if (this.field1614 == null) {
            return false;
        }
        if (this.field1605 == null) {
            this.method882((byte) 90);
        }
        class393 var3 = (class393) this.field1605.method1160((long) arg1, 121);
        if (arg0 == -25653) {
            return var3 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 252)
    public static final void method887() {
        for (int var0 = 0; var0 < class551.field7698; var0++) {
            class556 var1 = class541.field7494[var0];
            class322.method1890(var1, true);
            class541.field7494[var0] = null;
        }
        class551.field7698 = 0;
    }
}
