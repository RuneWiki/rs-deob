import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class287 {

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1837 = "flash1:";

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Lug;")
    public static class253 field1848;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "Z")
    public static boolean field1852;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)I", line = 4)
    public final int method921(int arg0) {
        if (arg0 <= 50) {
            field1852 = false;
        }
        field1847++;
        return (this.field1843 & 0x1D3BC8) >> 18;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method922(int arg0) {
        field1834++;
        if (arg0 != 1473496319) {
            this.method929(63);
        }
        return (this.field1843 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 26)
    public static final void method923(int arg0, int arg1) {
        if (arg0 == 0) {
            field1846++;
            class277.field4283.method1353(arg0 - 1, arg1);
            class164.field2656.method1353(-1, arg1);
            class344.field5345.method1353(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z", line = 43)
    public final boolean method924(byte arg0) {
        field1835++;
        if (arg0 != -73) {
            this.method921(-76);
        }
        return (this.field1843 & 0x17B3EE44) >> 28 != 0;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 55)
    public static void method925(byte arg0) {
        field1837 = null;
        if (arg0 == 117) {
            field1848 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Z", line = 68)
    public final boolean method926(byte arg0, int arg1) {
        if (arg0 <= 19) {
            return false;
        } else {
            field1836++;
            return (this.field1843 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)I", line = 82)
    public final int method927(int arg0) {
        field1844++;
        return arg0 == -1 ? class198.method1464(this.field1843, arg0 - 650776404) : 68;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)Z", line = 93)
    public final boolean method928(int arg0) {
        field1839++;
        if (arg0 <= 51) {
            field1841 = -89;
        }
        return (this.field1843 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z", line = 114)
    public final boolean method929(int arg0) {
        field1845++;
        if (arg0 < 95) {
            return false;
        } else {
            return ((this.field1843 & 0x4DA2213A) >> 30) != 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Z", line = 130)
    public final boolean method930(int arg0) {
        if (arg0 <= 85) {
            this.method922(-53);
        }
        field1833++;
        return ((this.field1843 & 0x3908155F) >> 29) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Z", line = 145)
    public final boolean method931(boolean arg0) {
        field1849++;
        if (!arg0) {
            field1848 = (class253) null;
        }
        return ((this.field1843 & 0x2496BC) >> 21) != 0;
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)Z", line = 156)
    public final boolean method932(int arg0) {
        field1842++;
        if (arg0 != 0) {
            this.method924((byte) -95);
        }
        return (this.field1843 & 0x5B2786) >> 22 != 0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z", line = 169)
    public static final boolean method933(boolean arg0) {
        field1832++;
        class52 var1 = class81.field1099;
        synchronized (class81.field1099) {
            if (!arg0) {
                field1852 = false;
            }
            if (class4.field33 == class113.field1590) {
                return false;
            } else {
                class243.field3799 = class125.field1800[class113.field1590];
                class125.field1814 = class64.field930[class113.field1590];
                class113.field1590 = class113.field1590 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V", line = 187)
    public class127(int arg0, int arg1) {
        this.field1843 = arg0;
        this.field1850 = arg1;
    }
}
