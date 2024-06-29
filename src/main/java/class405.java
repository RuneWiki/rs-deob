import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class405 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lrc;")
    public static class108 field5539 = new class108(103, 3);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class444.field6338 = arg0;
        field5536++;
        if (arg3 < 17) {
            method2428(12, (byte) 112, false);
        }
        class151.field2091 = arg4;
        class295.field4153 = arg2;
        class103.field1457 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBZ)Ljava/lang/String;", line = 26)
    public static final String method2428(int arg0, byte arg1, boolean arg2) {
        field5535++;
        if (arg2 && arg0 >= 0) {
            int var3 = -55 / ((-arg1 - 86) / 38);
            return class83.method707(arg2, 10, -121, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 39)
    public static void method2429(int arg0) {
        field5539 = null;
        if (arg0 != 32739) {
            field5539 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 53)
    public static final int method2430(int arg0, int arg1) {
        field5537++;
        if (arg0 > -105) {
            method2428(-40, (byte) -78, false);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V", line = 64)
    public static final void method2431(boolean arg0, int arg1) {
        class466.field6571 = -1;
        field5538++;
        class25.field267 = arg1;
        if (!arg0) {
            method2431(false, -7);
        }
        class466.field6571 = -1;
        class57.method521((byte) 72);
    }
}
