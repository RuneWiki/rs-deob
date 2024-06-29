import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class167 {

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
    public boolean field2370 = true;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "C")
    private char field2362;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Ljava/lang/String;")
    public String field2373;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "[[S")
    public static short[][] field2372;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1189(int arg0, int arg1, int arg2) {
        if (arg2 != -20298) {
            field2372 = null;
        }
        field2363++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILsl;I)V", line = 16)
    private final void method1190(int arg0, class479 arg1, int arg2) {
        field2371++;
        if (arg0 == arg2) {
            this.field2362 = class520.method3162(-19480, arg1.method2915(-127));
        } else if (arg0 == 2) {
            this.field2364 = arg1.method2868(-44);
        } else if (arg0 == 4) {
            this.field2370 = false;
        } else if (arg0 == 5) {
            this.field2373 = arg1.method2894(-13192);
            return;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 41)
    public static void method1191(int arg0) {
        field2372 = null;
        if (arg0 != -4) {
            field2372 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLsl;)V", line = 51)
    public final void method1192(byte arg0, class479 arg1) {
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                field2369++;
                if (arg0 != 24) {
                    this.method1195(-128);
                    return;
                }
                return;
            }
            this.method1190(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)Z", line = 80)
    public static final boolean method1193(int arg0, byte arg1) {
        field2367++;
        if (arg1 >= -55) {
            field2365 = 82;
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V", line = 94)
    public static final void method1194(int arg0, int arg1, int arg2) {
        field2374++;
        class503 var3 = class512.method3112(15, 0, 0);
        var3.method3075((byte) -79);
        var3.field7310 = arg1;
        if (arg0 >= 28) {
            var3.field7312 = arg2;
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z", line = 111)
    public final boolean method1195(int arg0) {
        field2366++;
        if (arg0 == -116) {
            return this.field2362 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Ljava/lang/String;", line = 126)
    public static final String method1196(int arg0, int arg1) {
        field2368++;
        String var2 = Integer.toString(arg0);
        if (arg1 != 0) {
            field2365 = -71;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class608.field8653.method3543(-24350, class45.field748) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class608.field8655.method3543(-24350, class45.field748) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
