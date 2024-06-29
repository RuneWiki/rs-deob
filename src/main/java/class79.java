import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 extends class120 {

    @OriginalMember(owner = "client!na", name = "P", descriptor = "Lva;")
    private static class121 field1838 = class107.method797("Remove", -10983);

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field1835 = 0;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static volatile int field1837 = -1;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lva;")
    public static class121 field1841 = field1838;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Ltc;")
    public static class113 field1847;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Lhe;")
    public static class47 field1840;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Lm;")
    public static class72 field1842;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V", line = 9)
    public static final void method542(byte arg0) {
        field1851++;
        if (arg0 < 32) {
            return;
        }
        class97 var1 = class69.field1628;
        synchronized (class69.field1628) {
            class116.field2646 = class26.field667;
            if (class61.field1452 >= 0) {
                while (class61.field1452 != class45.field1041) {
                    int var2 = class41.field946[class45.field1041];
                    class45.field1041 = class45.field1041 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class21.field570[var2] = true;
                    } else {
                        class21.field570[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class21.field570[var3] = false;
                }
                class61.field1452 = class45.field1041;
            }
            class26.field667 = class42.field977;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltc;IB)V", line = 55)
    private final void method543(class113 arg0, int arg1, byte arg2) {
        if (arg2 != 56) {
            this.field1850 = 122;
        }
        field1849++;
        if (arg1 == 1) {
            this.field1843 = arg0.method870(-1);
            this.field1852 = arg0.method821(true);
            this.field1850 = arg0.method821(true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltc;Z)V", line = 87)
    public final void method544(class113 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method821(!arg1);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field1846++;
                return;
            }
            this.method543(arg0, var3, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V", line = 114)
    public static void method545(byte arg0) {
        field1842 = null;
        field1841 = null;
        field1838 = null;
        field1840 = null;
        field1847 = null;
        if (arg0 > -26) {
            method542((byte) 103);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLec;)V", line = 148)
    public static final void method546(byte arg0, class28 arg1) {
        field1848++;
        if (arg0 != -41) {
            field1839 = 72;
        }
        class43.field999 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(B)V", line = 162)
    public static final void method547(byte arg0) {
        field1836++;
        if (arg0 <= 125) {
            return;
        }
        for (int var1 = -1; var1 < class13.field231; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class71.field1680[var1];
            }
            class77 var6 = class127.field2895[var5];
            if (var6 != null && var6.field760 > 0) {
                var6.field760--;
                if (var6.field760 == 0) {
                    var6.field737 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class42.field965; var2++) {
            int var3 = class1.field7[var2];
            class50 var4 = class8.field110[var3];
            if (var4 != null && var4.field760 > 0) {
                var4.field760--;
                if (var4.field760 == 0) {
                    var4.field737 = null;
                }
            }
        }
    }
}
