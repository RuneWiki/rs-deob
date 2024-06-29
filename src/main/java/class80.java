import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class80 extends class487 {

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "Liv;")
    public static class64 field1408 = new class64(97, 11);

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "Lgr;")
    public static class296 field1415 = new class296(8, 4);

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "Lpi;")
    public static class342 field1418 = new class342("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "Lbu;")
    public static class17 field1417;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "[I")
    public static int[] field1419;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)V", line = 8)
    public final void method519(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method640((byte) -122, (String) null, 26, 91, (String) null, (String) null, (String) null, 98);
        }
        ++field1406;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V", line = 22)
    public static void method638(byte arg0) {
        field1419 = null;
        field1415 = null;
        field1418 = null;
        if (arg0 > -26) {
            method642(76);
        }
        field1417 = null;
        field1408 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBI)V", line = 36)
    public final void method515(int arg0, byte arg1, int arg2) {
        if (arg1 != 12) {
            method642(-79);
        }
        ++field1412;
        int var4 = this.field1403 * arg0 >> 12;
        int var5 = this.field1402 * arg0 >> 12;
        int var6 = this.field1410 * arg2 >> 12;
        int var7 = this.field1409 * arg2 >> 12;
        class91.method704(-128, var5, var6, var7, var4, super.field7216);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V", line = 57)
    public final void method516(int arg0, int arg1, int arg2) {
        ++field1405;
        if (arg2 <= 41) {
            method640((byte) -102, (String) null, -115, -125, (String) null, (String) null, (String) null, -117);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IBI)I", line = 68)
    public static final int method639(int arg0, byte arg1, int arg2) {
        if (arg1 != -95) {
            field1415 = null;
        }
        ++field1407;
        return arg2 != 4 && arg2 != 5 ? 256 : class166.field2578[3 & arg0];
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 83)
    public static final void method640(byte arg0, String arg1, int arg2, int arg3, String arg4, String arg5, String arg6, int arg7) {
        for (int var8 = 99; var8 > 0; --var8) {
            class153.field2422[var8] = class153.field2422[var8 + -1];
            class451.field6740[var8] = class451.field6740[var8 + -1];
            class480.field7146[var8] = class480.field7146[var8 - 1];
            class12.field204[var8] = class12.field204[var8 - 1];
            class142.field2250[var8] = class142.field2250[var8 + -1];
            class348.field5207[var8] = class348.field5207[var8 + -1];
            class277.field3998[var8] = class277.field3998[var8 - 1];
        }
        if (arg0 > 85) {
            ++field1411;
            class153.field2422[0] = arg2;
            class451.field6740[0] = arg7;
            class480.field7146[0] = arg6;
            class12.field204[0] = arg5;
            class142.field2250[0] = arg1;
            class277.field3998[0] = arg3;
            ++class476.field7117;
            class368.field5570 = class431.field6404;
            class348.field5207[0] = arg4;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZI)I", line = 122)
    public static final int method641(int arg0, int arg1, boolean arg2, int arg3) {
        ++field1416;
        class328 var4 = class475.method2847(arg1, arg2, (byte) -117);
        if (var4 == null) {
            return 0;
        } else {
            if (arg0 != 3) {
                field1419 = null;
            }
            if (arg3 == -1) {
                return 0;
            } else {
                int var5 = 0;
                for (int var6 = 0; var4.field4960.length > var6; ++var6) {
                    if (~var4.field4957[var6] == ~arg3) {
                        var5 += var4.field4960[var6];
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 155)
    public static final void method642(int arg0) {
        ++field1413;
        int var1 = class443.field6623.method2836(class169.field2624, -2);
        if (arg0 == -26522) {
            if (var1 == 0) {
                class413.field6171 = null;
                class120.method888(83, 0);
            } else if (var1 == 1) {
                class502.method3006((byte) 0, arg0 ^ -26551);
                class120.method888(-89, 512);
                if (class260.field3784 != null) {
                    class305.method2001((byte) -109);
                }
            } else {
                class502.method3006((byte) (class173.field2664 - 4 & 255), -76);
                class120.method888(-92, 2);
            }
            class428.field6358 = class163.field2525;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(IIIIII)V", line = 191)
    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1403 = arg0;
        this.field1402 = arg2;
        this.field1410 = arg1;
        this.field1409 = arg3;
    }
}
