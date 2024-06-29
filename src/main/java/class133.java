import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class133 extends class111 {

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[B")
    private byte[] field1734;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method948(int arg0, int arg1, int arg2, byte arg3) {
        this.field1734 = new byte[arg1 * 2 * arg0 * arg2];
        field1737++;
        int var5 = 34 % ((arg3 + 16) / 43);
        this.method1626(arg0, arg2, -109, arg1);
        return this.field1734;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class133() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    public static final void method949(int arg0) {
        class481.method2824(11423, class145.field1852.field8999.method1703((byte) -73));
        field1738++;
        int var1 = (class277.field3866 >> 12) + (class103.field1295 >> 3);
        class410.field5771 = class251.field3549.field7710 = 0;
        int var2 = (class359.field5216 >> 12) + (class175.field2496 >> 3);
        class251.field3549.method3246(8, 92160000, 8);
        byte var3 = 18;
        class405.field5709 = new byte[var3][];
        class205.field3018 = new byte[var3][];
        class9.field171 = new byte[var3][];
        class145.field1853 = new int[var3];
        class146.field1866 = new int[var3];
        if (arg0 != -492594876) {
            method949(2);
        }
        class467.field6632 = new byte[var3][];
        class550.field7793 = new byte[var3][];
        class379.field5438 = new int[var3];
        class141.field1823 = new int[var3];
        class96.field1236 = new int[var3];
        class347.field5088 = new int[var3];
        class713.field10063 = new int[var3][4];
        int var4 = 0;
        for (int var5 = (var1 - (class109.field1314 >> 4)) / 8; var5 <= ((class109.field1314 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class760.field10479 >> 4)) / 8; var8 <= ((class760.field10479 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class96.field1236[var4] = var9;
                class146.field1866[var4] = class277.field3850.method3134(0, "m" + var5 + "_" + var8);
                class141.field1823[var4] = class277.field3850.method3134(class470.method2786(arg0, -492594876), "l" + var5 + "_" + var8);
                class145.field1853[var4] = class277.field3850.method3134(0, "n" + var5 + "_" + var8);
                class379.field5438[var4] = class277.field3850.method3134(0, "um" + var5 + "_" + var8);
                class347.field5088[var4] = class277.field3850.method3134(class470.method2786(arg0, -492594876), "ul" + var5 + "_" + var8);
                if (class145.field1853[var4] == -1) {
                    class146.field1866[var4] = -1;
                    class141.field1823[var4] = -1;
                    class379.field5438[var4] = -1;
                    class347.field5088[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class145.field1853.length; var6++) {
            class145.field1853[var6] = -1;
            class146.field1866[var6] = -1;
            class141.field1823[var6] = -1;
            class379.field5438[var6] = -1;
            class347.field5088[var6] = -1;
        }
        byte var7;
        if (class757.field10456 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class230.method1600(false, var2, var7, var1, -22710);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)V")
    public final void method776(int arg0, byte arg1, int arg2) {
        field1736++;
        if (arg0 != -1737357460) {
            return;
        }
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = var4 + 1;
        this.field1734[var4] = (byte) (var5 * 3 >> 5);
        this.field1734[var6] = (byte) (var5 * 3 >> 5);
    }
}
