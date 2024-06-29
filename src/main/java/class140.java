import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class140 {

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2139 = -1;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2140 = "Select";

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2141 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "J")
    public long field2146;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lji;")
    public class43 field2137;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        if (arg0 != 0) {
            field2140 = null;
        }
        field2140 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V")
    public static final void method945(byte arg0, boolean arg1) {
        if (arg0 >= -42) {
            method945((byte) 51, true);
        }
        if (arg1 && class230.field3654 != null) {
            class189.field2922 = class230.field3654.field4138;
        } else {
            class189.field2922 = -1;
        }
        class267.field4267 = null;
        class30.field454 = null;
        class106.field1755 = null;
        class56.field923 = null;
        class271.field4358 = null;
        class144.field2241 = null;
        class90.field1569 = null;
        class272.field4364 = null;
        field2134++;
        class48.field690 = null;
        class275.field4386 = 0;
        class230.field3654 = null;
        class187.field2899 = null;
        class263.field4181.method1226(1);
        class206.field3215 = null;
        class267.field4258 = null;
        class201.field3149 = null;
        class30.field456 = null;
        class19.field286 = null;
        class47.field686 = null;
        class256.field4096 = null;
        class93.field1596 = null;
        class4.field27 = -1;
        class25.field334 = null;
        class250.field4038 = -1;
        class209.field3259 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZLa;I)Led;")
    public static final class186 method946(int arg0, int arg1, int arg2, int arg3, boolean arg4, class49 arg5, int arg6) {
        field2133++;
        if (arg0 != -25311) {
            method947((String) null, (byte) -44);
        }
        int var8 = (arg4 ? 65536 : 0) + arg6 - (-(arg3 << 17) - (arg1 << 19));
        long var9 = (long) arg2 * 3147483667L + ((long) var8 * 3849834839L);
        class186 var11 = (class186) class266.field4246.method1887(0, var9);
        if (var11 != null) {
            return var11;
        }
        class195.field3080 = false;
        class186 var12 = class47.method339(arg2, false, arg1, arg4, arg3, arg0 ^ 0xFFFF9D05, arg5, arg6, false);
        if (var12 != null && !class195.field3080) {
            class266.field4246.method1886(-70, var9, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method947(String arg0, byte arg1) {
        field2135++;
        if (class93.field1596 == null || arg0.length() == 0) {
            return -1;
        } else if (arg1 == -79) {
            for (int var2 = 0; var2 < class93.field1596.field3233; var2++) {
                if (class217.method1456(class50.method376(" ", arg1 + 79, class93.field1596.field3242[var2], "<br>"), arg0, (byte) 107)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 24;
        }
    }
}
