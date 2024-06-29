import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class92 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[[B")
    public byte[][] field1468 = new byte[6][258];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[B")
    public byte[] field1466 = new byte[18002];

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[Z")
    public boolean[] field1473 = new boolean[16];

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[[I")
    public int[][] field1477 = new int[6][258];

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field1467 = 0;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[[I")
    public int[][] field1486 = new int[6][258];

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[Z")
    public boolean[] field1485 = new boolean[256];

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[I")
    public int[] field1472 = new int[6];

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[B")
    public byte[] field1482 = new byte[256];

    @OriginalMember(owner = "client!od", name = "y", descriptor = "[I")
    public int[] field1488 = new int[256];

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public int field1494 = 0;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "[B")
    public byte[] field1493 = new byte[4096];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
    public int[] field1469 = new int[257];

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[I")
    public int[] field1499 = new int[16];

    @OriginalMember(owner = "client!od", name = "K", descriptor = "[B")
    public byte[] field1500 = new byte[18002];

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[[I")
    public int[][] field1484 = new int[6][258];

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field1480 = -1;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lta;")
    public static class262 field1465 = new class262(64);

    @OriginalMember(owner = "client!od", name = "g", descriptor = "B")
    public byte field1470;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[B")
    public byte[] field1471;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "[B")
    public byte[] field1498;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "[Ldi;")
    public static class179[] field1503;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method725(String arg0, int arg1) {
        field1490++;
        if (arg1 >= -16) {
            return true;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class262.field4100; var2++) {
                if (arg0.equalsIgnoreCase(class3.field53[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class261.field4058.field446);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method726(int arg0) {
        field1465 = null;
        int var1 = 96 / ((14 - arg0) / 37);
        field1503 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZLag;I)V")
    public static final void method727(int arg0, int arg1, boolean arg2, class188 arg3, int arg4) {
        int var5 = arg3.field2922;
        if (arg3.field2966 == 0) {
            arg3.field2922 = arg3.field2924;
        } else if (arg3.field2966 == 1) {
            arg3.field2922 = arg0 - arg3.field2924;
        } else if (arg3.field2966 == 2) {
            arg3.field2922 = arg3.field2924 * arg0 >> 14;
        } else if (arg3.field2966 == 3) {
            if (arg3.field2937 == 2) {
                arg3.field2922 = (arg3.field2924 - 1) * arg3.field2955 + arg3.field2924 * 32;
            } else if (arg3.field2937 == 7) {
                arg3.field2922 = (arg3.field2924 - 1) * arg3.field2955 + arg3.field2924 * 115;
            }
        }
        int var6 = arg3.field2928;
        field1489++;
        if (arg3.field2861 == 0) {
            arg3.field2928 = arg3.field2893;
        } else if (arg3.field2861 == 1) {
            arg3.field2928 = arg4 - arg3.field2893;
        } else if (arg3.field2861 == 2) {
            arg3.field2928 = arg3.field2893 * arg4 >> 14;
        } else if (arg3.field2861 == 3) {
            if (arg3.field2937 == 2) {
                arg3.field2928 = (arg3.field2893 - 1) * arg3.field2909 + arg3.field2893 * 32;
            } else if (arg3.field2937 == 7) {
                arg3.field2928 = (arg3.field2893 - 1) * arg3.field2909 + arg3.field2893 * 12;
            }
        }
        if (arg3.field2966 == 4) {
            arg3.field2922 = arg3.field2928 * arg3.field2892 / arg3.field2965;
        }
        if (arg3.field2861 == 4) {
            arg3.field2928 = arg3.field2965 * arg3.field2922 / arg3.field2892;
        }
        if (class102.field1626 && (client.method1063(arg3).field3429 != 0 || arg3.field2937 == 0)) {
            if (arg3.field2928 < 5 && arg3.field2922 < 5) {
                arg3.field2922 = 5;
                arg3.field2928 = 5;
            } else {
                if (arg3.field2922 <= 0) {
                    arg3.field2922 = 5;
                }
                if (arg3.field2928 <= 0) {
                    arg3.field2928 = 5;
                }
            }
        }
        if (arg3.field2950 == 1337) {
            class79.field1320 = arg3;
        }
        if (arg2 && arg3.field2829 != null && (arg3.field2922 != var5 || arg3.field2928 != var6)) {
            class39 var7 = new class39();
            var7.field657 = arg3;
            var7.field647 = arg3.field2829;
            class131.field2030.method1013(312991604, var7);
        }
        if (arg1 != 0) {
            field1480 = -121;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method728(long arg0, byte arg1) {
        field1497++;
        class257.field3939.setTime(new Date(arg0));
        if (arg1 != -120) {
            field1480 = 92;
        }
        int var3 = class257.field3939.get(7);
        int var4 = class257.field3939.get(5);
        int var5 = class257.field3939.get(2);
        int var6 = class257.field3939.get(1);
        int var7 = class257.field3939.get(11);
        int var8 = class257.field3939.get(12);
        int var9 = class257.field3939.get(13);
        return class267.field4258[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class129.field2013[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
