import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class678 {

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    public int field8754 = 0;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public int field8755 = -1;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
    private int field8757 = -1;

    @OriginalMember(owner = "client!eja", name = "i", descriptor = "I")
    public int field8761 = -1;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
    public int field8756 = -1;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
    public int field8753 = 70;

    @OriginalMember(owner = "client!eja", name = "j", descriptor = "I")
    private int field8762 = -1;

    @OriginalMember(owner = "client!eja", name = "p", descriptor = "I")
    private int field8768 = -1;

    @OriginalMember(owner = "client!eja", name = "q", descriptor = "I")
    public int field8769 = 0;

    @OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
    public int field8765 = 16777215;

    @OriginalMember(owner = "client!eja", name = "x", descriptor = "I")
    public int field8776 = 0;

    @OriginalMember(owner = "client!eja", name = "B", descriptor = "Ljava/lang/String;")
    private String field8780 = "";

    @OriginalMember(owner = "client!eja", name = "z", descriptor = "I")
    private int field8778 = -1;

    @OriginalMember(owner = "client!eja", name = "y", descriptor = "[J")
    public static long[] field8777 = new long[32];

    @OriginalMember(owner = "client!eja", name = "l", descriptor = "I")
    public static int field8764 = 0;

    @OriginalMember(owner = "client!eja", name = "f", descriptor = "D")
    public static double field8758;

    @OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!eja", name = "n", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!eja", name = "s", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!eja", name = "t", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!eja", name = "u", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!eja", name = "v", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!eja", name = "w", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!eja", name = "A", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!eja", name = "r", descriptor = "Lcp;")
    public class342 field8770;

    @OriginalMember(owner = "client!eja", name = "k", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field8763;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lha;B)V")
    private final void method3641(class570 arg0, byte arg1) {
        field8779++;
        class30 var3 = this.field8770.field4187;
        if (this.field8768 >= 0 && this.field8770.field4194.method2931((long) this.field8768, (byte) -85) == null && var3.method130(-2, this.field8768)) {
            class388 var4 = class388.method2239(var3, this.field8768);
            this.field8770.field4194.method2918((long) this.field8768, arg0.method977(var4, true), 112);
        }
        if (this.field8778 >= 0 && this.field8770.field4194.method2931((long) this.field8778, (byte) -74) == null && var3.method130(-2, this.field8778)) {
            class388 var5 = class388.method2239(var3, this.field8778);
            this.field8770.field4194.method2918((long) this.field8778, arg0.method977(var5, true), 106);
        }
        if (this.field8762 >= 0 && this.field8770.field4194.method2931((long) this.field8762, (byte) -115) == null && var3.method130(-2, this.field8762)) {
            class388 var6 = class388.method2239(var3, this.field8762);
            this.field8770.field4194.method2918((long) this.field8762, arg0.method977(var6, true), 98);
        }
        if (arg1 != -98) {
            this.field8756 = -45;
        }
        if (this.field8757 >= 0 && this.field8770.field4194.method2931((long) this.field8757, (byte) -86) == null && var3.method130(arg1 + 96, this.field8757)) {
            class388 var7 = class388.method2239(var3, this.field8757);
            this.field8770.field4194.method2918((long) this.field8757, arg0.method977(var7, true), 122);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3642(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field8763 = null;
        }
        field8773++;
        return false;
    }

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "(Lha;B)Lpu;")
    public final class772 method3643(class570 arg0, byte arg1) {
        field8767++;
        if (this.field8762 < 0) {
            return null;
        }
        class772 var3 = (class772) this.field8770.field4194.method2931((long) this.field8762, (byte) -82);
        if (arg1 != 96) {
            return null;
        }
        if (var3 == null) {
            this.method3641(arg0, (byte) -98);
            var3 = (class772) this.field8770.field4194.method2931((long) this.field8762, (byte) -79);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILmc;I)V")
    private final void method3644(int arg0, class234 arg1, int arg2) {
        field8775++;
        if (arg0 < 27) {
            field8763 = null;
        }
        if (arg2 == 1) {
            this.field8755 = arg1.method1553((byte) -126);
        } else if (arg2 == 2) {
            this.field8765 = arg1.method1500((byte) -103);
        } else if (arg2 == 3) {
            this.field8768 = arg1.method1553((byte) 121);
        } else if (arg2 == 4) {
            this.field8762 = arg1.method1553((byte) 82);
        } else if (arg2 == 5) {
            this.field8778 = arg1.method1553((byte) 51);
        } else if (arg2 == 6) {
            this.field8757 = arg1.method1553((byte) -107);
        } else if (arg2 == 7) {
            this.field8769 = arg1.method1542(27067);
        } else if (arg2 == 8) {
            this.field8780 = arg1.method1506(1188375600);
        } else if (arg2 == 9) {
            this.field8753 = arg1.method1553((byte) 70);
        } else if (arg2 == 10) {
            this.field8776 = arg1.method1542(27067);
        } else if (arg2 == 11) {
            this.field8761 = 0;
        } else if (arg2 == 12) {
            this.field8756 = arg1.method1509(true);
        } else if (arg2 == 13) {
            this.field8754 = arg1.method1542(27067);
            return;
        } else if (arg2 == 14) {
            this.field8761 = arg1.method1553((byte) 99);
            return;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILmc;)V")
    public final void method3645(int arg0, class234 arg1) {
        field8771++;
        if (arg0 != 24518) {
            this.field8761 = -9;
        }
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method3644(34, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
    public static final void method3646(int arg0) {
        class102.field1382.method3003((byte) 99);
        field8772++;
        class727.method3889(arg0 - 20263);
        class356.field4337.field3133 = 0;
        class520.field6618 = 0;
        class196.field2716 = 0;
        class721.field9476 = null;
        class780.field10647 = null;
        class345.field4221 = null;
        class499.method2768(108);
        class221.field3005 = null;
        class317.field3951 = 0;
        class638.field8105 = null;
        class412.field5466 = null;
        if (arg0 != 9155) {
            method3642(false, 63, 104);
        }
        class703.field9297 = 0;
        class299.field3795 = null;
        class566.field7170 = 0;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method3647(byte arg0, int arg1) {
        field8774++;
        if (arg0 >= -93) {
            this.method3650(null, (byte) 55);
        }
        String var3 = this.field8780;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class62.method364(arg1, false, (byte) 110) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lha;I)Lpu;")
    public final class772 method3648(class570 arg0, int arg1) {
        field8760++;
        if (this.field8778 < arg1) {
            return null;
        }
        class772 var3 = (class772) this.field8770.field4194.method2931((long) this.field8778, (byte) -119);
        if (var3 == null) {
            this.method3641(arg0, (byte) -98);
            var3 = (class772) this.field8770.field4194.method2931((long) this.field8778, (byte) -69);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "(Lha;I)Lpu;")
    public final class772 method3649(class570 arg0, int arg1) {
        field8759++;
        if (~this.field8757 > arg1) {
            return null;
        }
        class772 var3 = (class772) this.field8770.field4194.method2931((long) this.field8757, (byte) -93);
        if (var3 == null) {
            this.method3641(arg0, (byte) -98);
            var3 = (class772) this.field8770.field4194.method2931((long) this.field8757, (byte) -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "(Lha;B)Lpu;")
    public final class772 method3650(class570 arg0, byte arg1) {
        field8766++;
        if (arg1 < 106) {
            return null;
        } else if (this.field8768 < 0) {
            return null;
        } else {
            class772 var3 = (class772) this.field8770.field4194.method2931((long) this.field8768, (byte) -121);
            if (var3 == null) {
                this.method3641(arg0, (byte) -98);
                var3 = (class772) this.field8770.field4194.method2931((long) this.field8768, (byte) -69);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)V")
    public static void method3651(byte arg0) {
        field8763 = null;
        field8777 = null;
        if (arg0 != -119) {
            field8777 = null;
        }
    }
}
