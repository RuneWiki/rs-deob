import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class296 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Z")
    public static boolean field4310 = false;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lvq;")
    public static class24 field4318 = new class24(81, 2);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lkg;")
    public static class223 field4306;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    public static int[] field4313;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "[Lqe;")
    public static class153[] field4317;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1966(boolean arg0) {
        field4318 = null;
        if (!arg0) {
            field4313 = null;
            field4306 = null;
            field4317 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLat;)V", line = 26)
    private final void method1967(int arg0, boolean arg1, class256 arg2) {
        if (arg1) {
            this.method1968((class256) null, (byte) 127);
        }
        if (arg0 == 1) {
            this.field4311 = arg2.method1767(1930493576);
            this.field4314 = arg2.method1738((byte) 75);
            this.field4312 = arg2.method1738((byte) 117);
        }
        field4308++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lat;B)V", line = 46)
    public final void method1968(class256 arg0, byte arg1) {
        if (arg1 <= 33) {
            this.field4311 = -21;
        }
        while (true) {
            int var3 = arg0.method1738((byte) -48);
            if (var3 == 0) {
                field4309++;
                return;
            }
            this.method1967(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZI)B", line = 66)
    public static final byte method1969(int arg0, boolean arg1, int arg2) {
        field4315++;
        if (!arg1) {
            return 89;
        } else if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZIBI)V", line = 86)
    public static final void method1970(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (class118.field1594 == 0) {
            class188.method1285((byte) 112, false);
        } else {
            class393.field5713 = class118.field1594;
            class358.method2280(0, true);
        }
        field4321++;
        class450.field6564 = arg4;
        if (arg3 != 92) {
            field4322 = 1;
        }
        class299.field4350 = arg1;
        class238.field3537 = arg0;
        class66.method479(arg2);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 114)
    public static final void method1971(int arg0) {
        if (class341.field5007 != 3) {
            class403.field5825 = -1;
        }
        if (arg0 != 1) {
            field4310 = false;
        }
        field4320++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)[Lil;", line = 142)
    public static final class274[] method1972(int arg0) {
        field4316++;
        if (arg0 != 0) {
            method1969(-19, true, 90);
        }
        return new class274[] { class275.field4063, class37.field527, class188.field2628, class90.field1106, class299.field4351, class417.field6028, class310.field4560, class304.field4456, class143.field1940, class400.field5777, class345.field5069, class383.field5619, class142.field1932, class452.field6674, class34.field491 };
    }
}
