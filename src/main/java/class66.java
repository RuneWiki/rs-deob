import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class66 extends class137 {

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private final int field1301;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    private final int field1300;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private final int field1304;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    private final int field1312;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
    public static int[] field1298 = new int[128];

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field1299 = -1;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Ljd;")
    public static class86 field1305 = class122.method868("::errortest", true);

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Ljd;")
    public static class86 field1310 = class122.method868("Versteckt", true);

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljd;")
    public static class86 field1309 = class122.method868("Spielwelt erstellt)3", true);

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[I")
    public static int[] field1315 = new int[2];

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Lre;")
    public static class212 field1302;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lof;")
    public static class254 field1303;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lod;")
    public static class90 field1297;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "[Lmk;")
    public static class101[] field1314;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method466(int arg0) {
        field1302 = null;
        field1303 = null;
        field1305 = null;
        field1298 = null;
        field1315 = null;
        if (arg0 != -1) {
            method470(84, 17, 80, 42);
        }
        field1297 = null;
        field1309 = null;
        field1310 = null;
        field1314 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)V")
    public final void method467(int arg0, int arg1, byte arg2) {
        ++field1306;
        int var4 = 76 % ((77 - arg2) / 46);
        int var5 = this.field1300 * arg0 >> 12;
        int var6 = this.field1304 * arg0 >> 12;
        int var7 = this.field1301 * arg1 >> 12;
        int var8 = this.field1312 * arg1 >> 12;
        class54.method403(super.field2619, (byte) 102, var6, var5, var8, var7);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        if (arg1 != 500) {
            field1299 = -2;
        }
        ++field1316;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
    public static final void method469(boolean arg0, int arg1) {
        ++field1307;
        if (arg1 != 536870912) {
            method466(-102);
        }
        for (int var2 = 0; ~var2 > ~class61.field1207; ++var2) {
            class170 var3 = class233.field4217[class189.field3350[var2]];
            long var4 = 536870912L | (long) class189.field3350[var2] << 32;
            if (var3 != null && var3.method238(-24869) && arg0 != !var3.field3130.field374 && var3.field3130.method91(126)) {
                int var6 = var3.field676 >> 7;
                int var7 = var3.field685 >> 7;
                if (~var6 <= -1 && var6 < 104 && ~var7 <= -1 && ~var7 > -105) {
                    if (~var3.method240((byte) 79) == -2 && ~(var3.field676 & 127) == -65 && (var3.field685 & 127) == 64) {
                        if (~class205.field3701[var6][var7] == ~class119.field2338) {
                            continue;
                        }
                        class205.field3701[var6][var7] = class119.field2338;
                    }
                    if (!var3.field3130.field363) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field744 = class30.method198(arg1 ^ 536902394, var3.field676, var3.field685, class180.field3244);
                    class130.method913(class180.field3244, var3.field676, var3.field685, var3.field744, 60 + 64 * (var3.method240((byte) -119) + -1), var3, var3.field700, var4, var3.field694);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
    public static final int method470(int arg0, int arg1, int arg2, int arg3) {
        ++field1311;
        if (arg1 >= -14) {
            field1310 = null;
        }
        if (~(8 & class86.field1693[arg2][arg3][arg0]) != -1) {
            return 0;
        } else {
            return arg2 > 0 && ~(2 & class86.field1693[1][arg3][arg0]) != -1 ? arg2 + -1 : arg2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public final void method471(int arg0, int arg1, int arg2) {
        ++field1296;
        if (arg1 != 9) {
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZIII)V")
    public static final void method472(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field1313;
        if (~class198.field3523 == -2) {
            class121.field2343[class141.field2673 / 100].method668(class162.field3051 + -8, class187.field3316 + -8);
        }
        if (~class198.field3523 == -3) {
            class121.field2343[4 - -(class141.field2673 / 100)].method668(class162.field3051 + -8, class187.field3316 - 8);
        }
        class156.method1138(0);
        if (arg1) {
            method473(20);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1301 = arg3;
        this.field1300 = arg2;
        this.field1304 = arg0;
        this.field1312 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method473(int arg0) {
        ++field1308;
        class140.field2665.method702((byte) -88);
        class233.field4212.method702((byte) -88);
        if (arg0 != 25615) {
            method470(43, 77, -105, -109);
        }
    }
}
