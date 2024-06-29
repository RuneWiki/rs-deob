import java.awt.FontMetrics;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class107 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[[B")
    public static byte[][] field2616 = new byte[50][];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Loc;")
    public static class99 field2614 = class48.method402((byte) -104, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Loc;")
    private static class99 field2620 = class48.method402((byte) -104, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Loc;")
    public static class99 field2615 = field2620;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2623 = new CRC32();

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Loc;")
    public static class99 field2624 = class48.method402((byte) -104, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2626;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZI)V")
    public static final void method915(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 0;
        if (!arg2) {
            method916(-92, (byte) 40, null);
        }
        while (var4 < 8) {
            for (int var7 = 0; var7 < 8; var7++) {
                class121.field2964[arg1][arg3 + var4][arg0 + var7] = 0;
            }
            var4++;
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class121.field2964[arg1][arg3][arg0 + var5] = class121.field2964[arg1][arg3 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class121.field2964[arg1][arg3 + var6][arg0] = class121.field2964[arg1][arg3 + var6][arg0 - 1];
            }
        }
        if (arg3 > 0 && class121.field2964[arg1][arg3 - 1][arg0] != 0) {
            class121.field2964[arg1][arg3][arg0] = class121.field2964[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && class121.field2964[arg1][arg3][arg0 - 1] != 0) {
            class121.field2964[arg1][arg3][arg0] = class121.field2964[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class121.field2964[arg1][arg3 - 1][arg0 - 1] != 0) {
            class121.field2964[arg1][arg3][arg0] = class121.field2964[arg1][arg3 - 1][arg0 - 1];
        }
        field2622++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLta;)V")
    public static final void method916(int arg0, byte arg1, class127 arg2) {
        if (arg2.field3074 > class101.field2444) {
            class118.method992((byte) -125, arg2);
        } else if (arg2.field3101 >= class101.field2444) {
            class83.method727(2, arg2);
        } else {
            class126.method1029((byte) -25, arg2);
        }
        field2617++;
        if (arg2.field3115 < 128 || arg2.field3077 < 128 || arg2.field3115 >= 13184 || arg2.field3077 >= 13184) {
            arg2.field3074 = 0;
            arg2.field3088 = -1;
            arg2.field3101 = 0;
            arg2.field3115 = arg2.field3100[0] * 128 + arg2.field3119 * 64;
            arg2.field3132 = -1;
            arg2.field3077 = arg2.field3096[0] * 128 + arg2.field3119 * 64;
            arg2.method1039((byte) 111);
        }
        if (class69.field1770 == arg2 && (arg2.field3115 < 1536 || arg2.field3077 < 1536 || arg2.field3115 >= 11776 || arg2.field3077 >= 11776)) {
            arg2.field3132 = -1;
            arg2.field3074 = 0;
            arg2.field3088 = -1;
            arg2.field3077 = arg2.field3096[0] * 128 + arg2.field3119 * 64;
            arg2.field3115 = arg2.field3100[0] * 128 + arg2.field3119 * 64;
            arg2.field3101 = 0;
            arg2.method1039((byte) 111);
        }
        class86.method738(arg2, (byte) -66);
        class145.method1193(arg2, (byte) 107);
        if (arg1 != 14) {
            field2627 = 80;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        class141.field3493 = 0;
        class91.field2224 = 0;
        class84.method730(0);
        class110.method942((byte) 64);
        class114.method963(false);
        if (arg0 <= 82) {
            method918(51);
        }
        field2621++;
        class69.method608(127);
        for (int var1 = 0; var1 < class91.field2224; var1++) {
            int var3 = class140.field3471[var1];
            if (class101.field2444 != class59.field1571[var3].field3068) {
                class59.field1571[var3] = null;
            }
        }
        if (class77.field1903 != class39.field965.field1477) {
            throw new RuntimeException("gpp1 pos:" + class39.field965.field1477 + " psize:" + class77.field1903);
        }
        for (int var2 = 0; var2 < class101.field2446; var2++) {
            if (class59.field1571[class67.field1729[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class101.field2446);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method918(int arg0) {
        field2623 = null;
        field2616 = null;
        field2614 = null;
        if (arg0 <= 95) {
            field2620 = null;
        }
        field2620 = null;
        field2615 = null;
        field2626 = null;
        field2624 = null;
    }
}
