import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("la")
public class class104 {

    @OriginalMember(owner = "la", name = "i", descriptor = "J")
    public long field2054 = 0L;

    @OriginalMember(owner = "la", name = "h", descriptor = "Lhd;")
    public static class73 field2053 = new class73(0, 0);

    @OriginalMember(owner = "la", name = "n", descriptor = "Llf;")
    public static class109 field2059 = class35.method275("k", 2);

    @OriginalMember(owner = "la", name = "a", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "la", name = "b", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "la", name = "e", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "la", name = "f", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "la", name = "g", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "la", name = "j", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "la", name = "k", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "la", name = "l", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "la", name = "m", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "la", name = "o", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "la", name = "p", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "la", name = "q", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "la", name = "c", descriptor = "Lka;")
    public class95 field2048;

    @OriginalMember(owner = "la", name = "d", descriptor = "Lka;")
    public class95 field2049;

    @OriginalMember(owner = "la", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method744(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2052++;
        if (class185.method1253(false, arg7)) {
            class71.method453(arg2, arg5, -99, arg3, arg6, class169.field3146[arg7], arg4, -1, arg0);
            if (arg1 <= 114) {
                field2050 = -109;
            }
        }
    }

    @OriginalMember(owner = "la", name = "a", descriptor = "(IIII)I")
    public static final int method745(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -49 / ((29 - arg3) / 60);
        int var5 = arg2 & 0x3;
        field2060++;
        if (var5 == 0) {
            return arg0;
        } else if (var5 == 1) {
            return 7 - arg1;
        } else if (var5 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "la", name = "a", descriptor = "(B)V")
    public static final void method746(byte arg0) {
        class22.field505.method1088(-51);
        int var1 = -46 / ((68 - arg0) / 55);
        field2051++;
    }

    @OriginalMember(owner = "la", name = "a", descriptor = "(I)Z")
    public static final boolean method747(int arg0) {
        field2061++;
        if (arg0 != 0) {
            return true;
        }
        class79 var1 = class205.field4019;
        synchronized (class205.field4019) {
            if (class54.field1086 == class177.field3347) {
                return false;
            } else {
                class204.field4005 = class80.field1583[class177.field3347];
                class78.field1513 = class30.field659[class177.field3347];
                class177.field3347 = class177.field3347 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "la", name = "b", descriptor = "(B)V")
    public static void method748(byte arg0) {
        field2053 = null;
        field2059 = null;
        if (arg0 >= -66) {
            field2059 = null;
        }
    }
}
