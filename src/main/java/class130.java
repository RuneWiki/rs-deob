import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class130 {

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Z")
    public static boolean field1846 = true;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1844 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static volatile int field1849 = 0;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method1007(byte arg0) {
        field1855++;
        if (arg0 != -87) {
            field1846 = false;
        }
        return (this.field1845 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 20)
    public static void method1008(int arg0) {
        field1844 = null;
        if (arg0 != 2) {
            method1008(-50);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z", line = 39)
    public final boolean method1009(int arg0) {
        field1853++;
        if (arg0 != 1) {
            this.field1850 = 41;
        }
        return (this.field1845 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIILbi;)V", line = 53)
    public static final void method1010(byte arg0, int arg1, int arg2, class139 arg3) {
        class36.field557 = arg2;
        int var4 = -14 / (arg0 / 41);
        field1852++;
        class443.field6390 = arg1;
        class228.field3164 = arg3;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Lls;", line = 66)
    public static final class297 method1011(int arg0) {
        field1848++;
        try {
            if (arg0 != -1) {
                method1011(66);
            }
            return (class297) Class.forName("en").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V", line = 84)
    public static final void method1012(byte arg0) {
        class410 var1 = class373.field5245;
        synchronized (class373.field5245) {
            class373.field5245.method2533(arg0 - 93);
        }
        field1842++;
        if (arg0 != 93) {
            method1012((byte) 61);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I", line = 105)
    public static final int method1013(int arg0, int arg1) {
        field1854++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 != 8) {
            return -62;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)Z", line = 151)
    public final boolean method1014(int arg0) {
        if (arg0 > -25) {
            return true;
        } else {
            field1847++;
            return (this.field1845 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)Z", line = 166)
    public final boolean method1015(int arg0) {
        if (arg0 == 64) {
            field1843++;
            return (this.field1845 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V", line = 179)
    public static final void method1016(int arg0) {
        for (class48 var1 = (class48) class428.field6084.method891(arg0 + 20837); var1 != null; var1 = (class48) class428.field6084.method898(64)) {
            var1.method491();
        }
        if (arg0 != 1) {
            field1844 = null;
        }
        field1851++;
    }
}
