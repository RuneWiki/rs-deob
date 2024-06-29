import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class65 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
    public static int[] field1428 = new int[256];

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lrc;")
    private static class105 field1432 = class43.method374("Accept trade", 0);

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lrc;")
    public static class105 field1430 = field1432;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lrc;")
    private static class105 field1434 = class43.method374("Add ignore", 0);

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[J")
    public static long[] field1429 = new long[32];

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Lrc;")
    public static class105 field1435 = field1434;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1431 = -1;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "J")
    public static volatile long field1439;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Lrc;")
    public static class105 field1440;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Lrc;")
    private static class105 field1438;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Lrc;")
    public static class105 field1441;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "Lrc;")
    public static class105 field1444;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Lrc;")
    public static class105 field1442;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Ljc;")
    public class57 field1426;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Lmd;")
    public class76 field1436;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[B")
    public byte[] field1427;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1428[var0] = var1;
        }
        field1439 = 0L;
        field1440 = class43.method374("Bitte benutzen Sie eine andere Welt)3", 0);
        field1445 = 0;
        field1438 = class43.method374("Hide", 0);
        field1443 = 0;
        field1441 = class43.method374(" hat sich ausgeloggt)3", 0);
        field1444 = class43.method374("W-=hlen Sie eine Option", 0);
        field1442 = field1438;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 11)
    public static void method545(int arg0) {
        if (arg0 != -306674912) {
            field1440 = null;
        }
        field1435 = null;
        field1438 = null;
        field1432 = null;
        field1442 = null;
        field1429 = null;
        field1444 = null;
        field1428 = null;
        field1441 = null;
        field1430 = null;
        field1440 = null;
        field1434 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLua;III)V", line = 69)
    public static final void method546(int arg0, byte arg1, class121 arg2, int arg3, int arg4, int arg5) {
        int var6 = -64 % ((-arg1 - 35) / 43);
        field1437++;
        class81 var7 = new class81();
        var7.field1840 = arg2.field2936 * 128;
        int var8 = arg2.field2906;
        var7.field1834 = arg2.field2971;
        var7.field1821 = arg2.field2918;
        var7.field1826 = arg5;
        var7.field1808 = arg2.field2911;
        var7.field1824 = arg2.field2950;
        var7.field1829 = arg0 * 128;
        int var9 = arg2.field2912;
        if (arg3 == 1 || arg3 == 3) {
            var9 = arg2.field2906;
            var8 = arg2.field2912;
        }
        var7.field1812 = arg4 * 128;
        var7.field1837 = (arg4 + var8) * 128;
        var7.field1823 = (arg0 + var9) * 128;
        if (arg2.field2909 != null) {
            var7.field1831 = arg2;
            var7.method691((byte) -116);
        }
        class108.field2480.method23(1024, var7);
        if (var7.field1834 != null) {
            var7.field1811 = (int) ((double) (var7.field1821 - var7.field1824) * Math.random()) + var7.field1824;
        }
    }
}
