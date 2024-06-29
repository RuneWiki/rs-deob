import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class70 {

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "[I")
    public static int[] field771 = new int[2];

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field769 = -1;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method530(byte arg0, int arg1) {
        field772++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 16) {
            method532((byte) -72);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class712.field9886.method3999(class553.field7667, (byte) -58) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class712.field9888.method3999(class553.field7667, (byte) -54) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLsha;II)V")
    public static final void method531(byte arg0, class115 arg1, int arg2, int arg3) {
        int var4 = -70 / ((arg0 + 56) / 53);
        field773++;
        if (arg1.field1534 == 0) {
            arg1.field1408 = arg1.field1432;
        } else if (arg1.field1534 == 1) {
            arg1.field1408 = (arg3 - arg1.field1560) / 2 + arg1.field1432;
        } else if (arg1.field1534 == 2) {
            arg1.field1408 = arg3 - arg1.field1560 - arg1.field1432;
        } else if (arg1.field1534 == 3) {
            arg1.field1408 = arg1.field1432 * arg3 >> 14;
        } else if (arg1.field1534 == 4) {
            arg1.field1408 = (arg1.field1432 * arg3 >> 14) + (arg3 - arg1.field1560) / 2;
        } else {
            arg1.field1408 = arg3 - (arg1.field1432 * arg3 >> 14) - arg1.field1560;
        }
        if (arg1.field1540 == 0) {
            arg1.field1503 = arg1.field1493;
        } else if (arg1.field1540 == 1) {
            arg1.field1503 = (arg2 - arg1.field1517) / 2 + arg1.field1493;
        } else if (arg1.field1540 == 2) {
            arg1.field1503 = arg2 - arg1.field1493 - arg1.field1517;
        } else if (arg1.field1540 == 3) {
            arg1.field1503 = arg1.field1493 * arg2 >> 14;
        } else if (arg1.field1540 == 4) {
            arg1.field1503 = (arg1.field1493 * arg2 >> 14) + (arg2 - arg1.field1517) / 2;
        } else {
            arg1.field1503 = arg2 - arg1.field1517 - (arg1.field1493 * arg2 >> 14);
        }
        if (!class635.field8860 || client.method779(arg1).field2201 == 0 && arg1.field1564 != 0) {
            return;
        }
        if (arg1.field1408 < 0) {
            arg1.field1408 = 0;
        } else if (arg3 < arg1.field1560 + arg1.field1408) {
            arg1.field1408 = arg3 - arg1.field1560;
        }
        if (arg1.field1503 < 0) {
            arg1.field1503 = 0;
        } else if (arg2 < arg1.field1517 + arg1.field1503) {
            arg1.field1503 = arg2 - arg1.field1517;
            return;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V")
    public static void method532(byte arg0) {
        field771 = null;
        if (arg0 != -35) {
            method531((byte) -61, null, 24, 14);
        }
    }
}
