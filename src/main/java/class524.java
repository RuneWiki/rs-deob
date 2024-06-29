import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class524 extends class409 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    private int field7682;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    private int field7681;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    private int field7691;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    private int field7683;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field7689;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field7692;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    private int field7686;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    private int field7684;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Ljp;")
    public static class55 field7687 = new class55(86, 2);

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Ldn;")
    public static class205 field7690;

    static {
        new class179("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 7)
    public final void method1850(int arg0, int arg1, int arg2) {
        ++field7680;
        if (arg2 < 120) {
            field7687 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 19)
    public static final void method3120(int arg0) {
        ++field7693;
        class91.field1475 = 0;
        boolean var1 = ~class424.field6231.method1383(arg0 ^ 12504) == -2;
        int var2 = class424.field6231.method1376(255);
        int var3 = class424.field6231.method1389(arg0 ^ 255);
        int var4 = class424.field6231.method1389(255);
        class523.method3118((byte) 54);
        class296.method1969((byte) 22, var2);
        int var5 = (-class424.field6231.field2982 + class429.field6369) / 16;
        class258.field4150 = new int[var5][4];
        for (int var6 = 0; var5 > var6; ++var6) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class258.field4150[var6][var10] = class424.field6231.method1401(class232.method1566(arg0, -51));
            }
        }
        class348.field5193 = null;
        class254.field4107 = new int[var5];
        class277.field4348 = new int[var5];
        class489.field7139 = new byte[var5][];
        class406.field6003 = new int[var5];
        class83.field1371 = null;
        class285.field4436 = new byte[var5][];
        class247.field3692 = new int[var5];
        class83.field1372 = new byte[var5][];
        class455.field6766 = new int[var5];
        class347.field5175 = new byte[var5][];
        int var7 = arg0;
        for (int var8 = (-(class338.field5076 >> 4) + var4) / 8; var8 <= (var4 - -(class338.field5076 >> 4)) / 8; ++var8) {
            for (int var9 = (-(class250.field4077 >> 4) + var3) / 8; var9 <= ((class250.field4077 >> 4) + var3) / 8; ++var9) {
                class277.field4348[var7] = (var8 << 8) + var9;
                class254.field4107[var7] = class130.field1931.method737("m" + var8 + "_" + var9, -1);
                class406.field6003[var7] = class130.field1931.method737("l" + var8 + "_" + var9, -1);
                class247.field3692[var7] = class130.field1931.method737("um" + var8 + "_" + var9, -1);
                class455.field6766[var7] = class130.field1931.method737("ul" + var8 + "_" + var9, class232.method1566(arg0, -1));
                ++var7;
            }
        }
        class182.method1273(var1, 10, var3, var4, -1);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IBI)V", line = 93)
    public final void method1852(int arg0, byte arg1, int arg2) {
        ++field7685;
        if (arg1 != 88) {
            this.field7686 = 66;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 104)
    public static void method3121(byte arg0) {
        field7690 = null;
        field7687 = null;
        if (arg0 <= 73) {
            method3120(54);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 130)
    public class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field7682 = arg6;
        this.field7681 = arg0;
        this.field7691 = arg2;
        this.field7683 = arg7;
        this.field7689 = arg1;
        this.field7692 = arg5;
        this.field7686 = arg3;
        this.field7684 = arg4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V", line = 146)
    public final void method1855(int arg0, byte arg1, int arg2) {
        ++field7688;
        int var4 = this.field7681 * arg2 >> 12;
        if (arg1 >= -8) {
            this.method1852(-120, (byte) -108, 62);
        }
        int var5 = this.field7689 * arg0 >> 12;
        int var6 = this.field7691 * arg2 >> 12;
        int var7 = this.field7686 * arg0 >> 12;
        int var8 = this.field7684 * arg2 >> 12;
        int var9 = this.field7692 * arg0 >> 12;
        int var10 = this.field7682 * arg2 >> 12;
        int var11 = this.field7683 * arg0 >> 12;
        class386.method2457(var5, super.field6043, var4, var8, var9, var11, var7, false, var6, var10);
    }
}
