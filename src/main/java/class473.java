import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class473 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field7001 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lea;")
    public static class474 field6997 = new class474("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field7003;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lco;")
    public class102 field7005;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    public int[] field6999;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[BILfda;)V", line = 7)
    public static final void method2897(byte[][] arg0, int arg1, class270 arg2) {
        field7000++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg1 < 81) {
            return;
        }
        for (int var4 = 0; var4 < arg2.field1019; var4++) {
            class453.method2798((byte) 102);
            for (int var5 = 0; var5 < class90.field1032 >> 3; var5++) {
                for (int var6 = 0; var6 < (class30.field349 >> 3); var6++) {
                    int var7 = class305.field4479[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x36B763A) >> 24;
                        if (!arg2.field1001 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class170.field2090.length; var13++) {
                                if (class170.field2090[var13] == var12 && arg0[var13] != null) {
                                    class194 var14 = new class194(arg0[var13]);
                                    arg2.method566((byte) 49, var4, var10, var14, var6 * 8, var9, var8, class14.field120, var11, var5 * 8);
                                    arg2.method1761(var5 * 8, false, var3[0] == -1 ? var3 : null, class413.field6264, var8, var4, var14, var11, var9, var6 * 8, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class291.field4035 = class61.field702.method2028(var3[0], 0, class173.field2125, var3[1], var3[3], var3[2]);
            class107.field1280 = var3[4];
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 90)
    public static final void method2898(boolean arg0, int arg1) {
        field7004++;
        if (arg1 != 0) {
            field6997 = null;
        }
        while (class46.field498.method3681(-84, class32.field372) >= 15) {
            int var2 = class46.field498.method3671(15, (byte) 17);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class411 var4 = (class411) class42.field456.method524((byte) 104, (long) var2);
            if (var4 == null) {
                class78 var5 = new class78();
                var5.field2495 = var2;
                var4 = new class411(var5);
                class42.field456.method520((byte) -83, var4, (long) var2);
                var3 = true;
                class599.field8757[class458.field6840++] = var4;
            }
            class78 var6 = var4.field6254;
            class362.field5141[class387.field5958++] = var2;
            var6.field2455 = class287.field3982;
            if (var6.field864 != null && var6.field864.method3283(~arg1)) {
                class130.method801(var6, (byte) -76);
            }
            int var7;
            if (arg0) {
                var7 = class46.field498.method3671(8, (byte) 17);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class46.field498.method3671(5, (byte) 17);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8;
            if (arg0) {
                var8 = class46.field498.method3671(8, (byte) 17);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class46.field498.method3671(5, (byte) 17);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = class46.field498.method3671(1, (byte) 17);
            if (var9 == 1) {
                class200.field2684[class207.field2771++] = var2;
            }
            int var10 = (class46.field498.method3671(3, (byte) 17) + 4 & 0xD0200007) << 11;
            var6.method509(class224.field3151.method1817(-40, class46.field498.method3671(14, (byte) 17)), -4);
            int var11 = class46.field498.method3671(2, (byte) 17);
            int var12 = class46.field498.method3671(1, (byte) 17);
            var6.method1157((byte) -120, var6.field864.field8096);
            var6.field2505 = var6.field864.field8129 << 3;
            if (var3) {
                var6.method1149(var10, 112, true);
            }
            var6.method503(class439.field6548.field2515[0] + var7, var12 == 1, var6.method1153(true), class439.field6548.field2524[0] + var8, -1, var11);
            if (var6.field864.method3283(-1)) {
                class474.method2903(var6.field1757, null, -98, var6.field2515[0], var6.field2524[0], 0, var6, null);
            }
        }
        class46.field498.method3670(8);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)I", line = 194)
    public static final int method2899(int arg0, boolean arg1, int arg2) {
        field7002++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (!arg1) {
                return -22;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILrt;)Lna;", line = 246)
    public static final class41 method2900(int arg0, class194 arg1) {
        if (arg0 == 0) {
            field6998++;
            return new class41(arg1.method1233(65280), arg1.method1233(arg0 + 65280), arg1.method1233(arg0 ^ 0xFF00), arg1.method1233(65280), arg1.method1180(-832631516), arg1.method1180(arg0 ^ 0xCE5F0D24), arg1.method1177(arg0 + 255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 257)
    public static void method2901(byte arg0) {
        field6997 = null;
        if (arg0 < 35) {
            method2899(-87, true, -55);
        }
    }
}
