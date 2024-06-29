import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class93 extends class109 {

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Ldd;")
    public static class35 field2055 = class180.method1196((byte) 127, "sch-Utteln:");

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Ldd;")
    public static class35 field2064 = class180.method1196((byte) 126, "cookiehost");

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field2062 = -1;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Ldd;")
    private static class35 field2067 = class180.method1196((byte) -13, "Loading fonts )2 ");

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Ldd;")
    public static class35 field2058 = class180.method1196((byte) 127, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Ldd;")
    public static class35 field2059 = field2067;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ldd;")
    public static class35 field2054 = class180.method1196((byte) -117, " x ");

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "B")
    public byte field2069;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Ldd;")
    public class35 field2052;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "Ldd;")
    public class35 field2061;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lag;")
    public static class8 field2068;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "[Lfd;")
    public static class55[] field2056;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ldd;I)I")
    public static final int method677(class35 arg0, int arg1) {
        if (arg1 != -326) {
            field2064 = null;
        }
        field2063++;
        return arg0.method347((byte) -107) + 1;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static void method678(int arg0) {
        if (arg0 != 150) {
            return;
        }
        field2068 = null;
        field2058 = null;
        field2064 = null;
        field2056 = null;
        field2059 = null;
        field2055 = null;
        field2054 = null;
        field2067 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public static int method679(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfd;I)V")
    public static final void method680(class55 arg0, int arg1) {
        field2053++;
        int var2 = arg0.field1299;
        if (var2 == 324) {
            if (class175.field3584 == -1) {
                class175.field3584 = arg0.field1272;
                class174.field3559 = arg0.field1238;
            }
            if (class40.field883.field410) {
                arg0.field1272 = class175.field3584;
            } else {
                arg0.field1272 = class174.field3559;
            }
        } else if (var2 == 325) {
            if (class175.field3584 == -1) {
                class174.field3559 = arg0.field1238;
                class175.field3584 = arg0.field1272;
            }
            if (class40.field883.field410) {
                arg0.field1272 = class174.field3559;
            } else {
                arg0.field1272 = class175.field3584;
            }
        } else {
            int var3 = 62 / ((-arg1 - 45) / 57);
            if (var2 == 327) {
                arg0.field1304 = 150;
                arg0.field1323 = (int) (Math.sin((double) class89.field1988 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1315 = 5;
                arg0.field1244 = -1;
            } else if (var2 == 328) {
                if (class71.field1704.field2254 == null) {
                    arg0.field1244 = 0;
                } else {
                    arg0.field1304 = 150;
                    arg0.field1323 = (int) (Math.sin((double) class89.field1988 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field1315 = 5;
                    arg0.field1244 = ((int) class71.field1704.field2254.method321(21830) << 11) + 2047;
                    arg0.field1240 = class71.field1704.field1606;
                    arg0.field1303 = class71.field1704.field1658;
                }
            }
        }
    }
}
