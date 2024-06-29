import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class98 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Z")
    public boolean field1653 = true;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[J")
    public static long[] field1658 = new long[200];

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lvm;")
    public static class202 field1659 = new class202(50);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B", line = 12)
    public static final byte[] method722(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        field1660++;
        byte[] var3 = new byte[var2];
        class42.method317(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V", line = 24)
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class149 var7 = new class149();
        var7.field2401 = arg1 / 128;
        var7.field2402 = arg2 / 128;
        var7.field2420 = arg3 / 128;
        var7.field2411 = arg4 / 128;
        var7.field2422 = arg0;
        var7.field2410 = arg1;
        var7.field2405 = arg2;
        var7.field2403 = arg3;
        var7.field2413 = arg4;
        var7.field2409 = arg5;
        var7.field2419 = arg6;
        class75.field1268[class103.field1755++] = var7;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 50)
    public static void method724(byte arg0) {
        field1658 = null;
        field1659 = null;
        int var1 = -17 / ((arg0 - 1) / 42);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLsi;)V", line = 69)
    public static final void method725(boolean arg0, class66 arg1) {
        field1649++;
        if (class180.field2952) {
            return;
        }
        if (class99.field1675) {
            class212.method1505();
        } else {
            class210.method1467();
        }
        class268.field4494 = class103.method792(-1217871116, arg1, class225.field3704);
        int var2 = class266.field4484;
        int var3 = var2 * 956 / 503;
        class268.field4494.method644((class273.field4567 - var3) / 2, 0, var3, var2);
        class312.field5256 = class167.method1220(class156.field2527, (byte) -117, arg1);
        class312.field5256.method271(class273.field4567 / 2 - (class312.field5256.field3621 / 2), 18);
        class180.field2952 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIIZ)V", line = 218)
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1657 = arg5;
        this.field1650 = arg2;
        this.field1652 = arg3;
        this.field1654 = arg0;
        this.field1651 = arg1;
        this.field1653 = arg6;
        this.field1655 = arg4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBIIII)V", line = 100)
    public static final void method726(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class214.field3533 >= arg3 && arg4 >= class206.field3398) {
            boolean var6;
            if (class192.field3172 > arg2) {
                var6 = false;
                arg2 = class192.field3172;
            } else if (class77.field1289 < arg2) {
                arg2 = class77.field1289;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class192.field3172 > arg5) {
                arg5 = class192.field3172;
                var7 = false;
            } else if (class77.field1289 < arg5) {
                var7 = false;
                arg5 = class77.field1289;
            } else {
                var7 = true;
            }
            if (class206.field3398 > arg3) {
                arg3 = class206.field3398;
            } else {
                class193.method1354((byte) -37, arg5, arg2, arg0, class202.field3337[arg3++]);
            }
            if (class214.field3533 < arg4) {
                arg4 = class214.field3533;
            } else {
                class193.method1354((byte) -37, arg5, arg2, arg0, class202.field3337[arg4--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    int[] var9 = class202.field3337[var8];
                    var9[arg2] = var9[arg5] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg4; var11++) {
                    class202.field3337[var11][arg2] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg4; var10++) {
                    class202.field3337[var10][arg5] = arg0;
                }
            }
        }
        if (arg1 != 69) {
            field1659 = (class202) null;
        }
        field1656++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)I", line = 203)
    public static final int method727(byte arg0) {
        field1648++;
        if (arg0 != 32) {
            field1658 = (long[]) null;
        }
        return class166.field2704.method1420(arg0 ^ 0x20);
    }
}
