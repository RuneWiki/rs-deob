import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class284 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4453 = " from your friend list first.";

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4450 = new String[1000];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public static boolean field4457 = true;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4459 = "flash2:";

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[[I")
    public static int[][] field4461 = new int[5][5000];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lbi;")
    public static class91 field4454;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Ljava/lang/String;", line = 9)
    public static final String method2028(int arg0, int arg1, int arg2) {
        field4452++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (~var3 < arg0) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLlc;)V", line = 51)
    public static final void method2029(byte arg0, class175 arg1) {
        field4458++;
        class29.field370 = arg1;
        int var2 = -72 / ((4 - arg0) / 37);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2030(int arg0, int arg1) {
        if (arg1 != 255) {
            field4455 = -40;
        }
        field4451++;
        class179.field2597.method1236(-495037017, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V", line = 95)
    public static final void method2031(int arg0, int arg1) {
        field4456++;
        class96 var2 = class141.method935(arg0, arg1, 99);
        var2.method582(-1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 104)
    public static void method2032(int arg0) {
        field4459 = null;
        if (arg0 < 89) {
            method2028(-54, 84, 32);
        }
        field4450 = null;
        field4453 = null;
        field4461 = (int[][]) null;
        field4454 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I", line = 147)
    public static final int method2033(byte arg0) {
        if (arg0 != -61) {
            method2029((byte) -89, (class175) null);
        }
        field4460++;
        return 15;
    }
}
