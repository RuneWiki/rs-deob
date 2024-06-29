import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class139 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lma;")
    private static class5 field2052 = class12.method119("Loaded config", (byte) 70);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lma;")
    public static class5 field2057 = class12.method119("Mitglieder)2Welt", (byte) 96);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lma;")
    public static class5 field2053 = class12.method119("mapdots", (byte) 71);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "S")
    public static short field2063 = 320;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2059 = 0;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lma;")
    public static class5 field2055 = field2052;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "J")
    public long field2062;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lni;")
    public static class202 field2065;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lkb;")
    public class280 field2051;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lkb;")
    public class280 field2060;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lkb;")
    public class280 field2067;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 29)
    public static void method900(boolean arg0) {
        if (arg0) {
            method901((short[]) null, false);
        }
        field2057 = null;
        field2052 = null;
        field2065 = null;
        field2055 = null;
        field2053 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([SZ)[S", line = 59)
    public static final short[] method901(short[] arg0, boolean arg1) {
        if (arg1) {
            field2063 = 79;
        }
        field2054++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class42.method297(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }
}
