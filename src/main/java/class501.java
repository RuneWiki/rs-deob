import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class501 {

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "[Z")
    public static boolean[] field7378 = new boolean[100];

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "Ljm;")
    public static class485 field7379 = new class485(39, 7);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "B")
    public byte field7358;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "B")
    public byte field7362;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "B")
    public byte field7366;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "B")
    public byte field7375;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "B")
    public byte field7376;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "B")
    public byte field7382;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "B")
    public byte field7383;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Loa;")
    public static class490 field7361;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "S")
    public short field7367;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Z")
    public boolean field7359;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Z")
    public boolean field7363;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Z")
    public boolean field7364;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "Z")
    public boolean field7371;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Z")
    public boolean field7372;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "Z")
    public boolean field7373;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "Z")
    public boolean field7374;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "Z")
    public boolean field7380;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "Z")
    public boolean field7381;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method2952(byte arg0, String arg1, int arg2) {
        field7370++;
        int var3 = class378.field5322;
        int[] var4 = class95.field1321;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class192 var7 = class309.field4234[var4[var6]];
            if (var7 != null && class75.field1089 != var7 && var7.field2693 != null && var7.field2693.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class356.method1978((byte) 104, class510.field7493);
                    class258.field3563++;
                    class244.field3395.method2086(0, (byte) 126);
                    class244.field3395.method2072(-733958872, var4[var6]);
                } else if (arg2 == 4) {
                    class356.method1978((byte) 62, class127.field1736);
                    class499.field7337++;
                    class244.field3395.method2061(var4[var6], (byte) 102);
                    class244.field3395.method2094((byte) -51, 0);
                } else if (arg2 == 5) {
                    class356.method1978((byte) 57, class190.field2638);
                    class40.field543++;
                    class244.field3395.method2086(0, (byte) 100);
                    class244.field3395.method2061(var4[var6], (byte) 111);
                } else if (arg2 == 6) {
                    class421.field6146++;
                    class356.method1978((byte) 59, class453.field6628);
                    class244.field3395.method2061(var4[var6], (byte) 102);
                    class244.field3395.method2084(0, false);
                } else if (arg2 == 7) {
                    class225.field3170++;
                    class356.method1978((byte) 101, class260.field3584);
                    class244.field3395.method2070(81954016, var4[var6]);
                    class244.field3395.method2067(0, 32479);
                }
                var5 = true;
                break;
            }
        }
        if (arg0 != 71) {
            field7379 = null;
        }
        if (!var5) {
            class99.method662((byte) 41, class350.field4791.method590(class105.field1434, -22602) + arg1);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)I")
    public static final int method2953(int arg0, int arg1) {
        if (arg1 == 7) {
            field7368++;
            return arg0 >>> 8;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method2954(int arg0) {
        field7361 = null;
        field7378 = null;
        field7379 = null;
        if (arg0 != 0) {
            field7361 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
    public static final void method2955(int arg0, int arg1) {
        if (arg1 == 7) {
            field7365++;
            class163 var2 = class271.method1546(arg0, 11, true);
            var2.method1010(1504);
        }
    }
}
