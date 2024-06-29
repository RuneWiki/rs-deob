import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class704 {

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "B")
    public byte field9912;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Lid;")
    public class583 field9914;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "B")
    public byte field9919;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "S")
    public short field9921;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "[I")
    public static int[] field9918 = new int[32];

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "[I")
    public static int[] field9913 = new int[16];

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "Lrb;")
    public static class352 field9923;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field9922;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field9918[var1] = var0 - 1;
            var0 += var0;
        }
        field9923 = new class352();
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIILka;BLha;IIIILfba;III)Lka;", line = 6)
    public static final class470 method3950(int arg0, int arg1, int arg2, class470 arg3, byte arg4, class58 arg5, int arg6, int arg7, int arg8, int arg9, class25 arg10, int arg11, int arg12, int arg13) {
        field9922++;
        if (arg3 == null) {
            return null;
        }
        int var14 = 2055;
        int var15 = 115 / ((arg4 - 15) / 61);
        if (arg10 != null) {
            int var16 = var14 | arg10.method125(false, arg6, 65535, -1);
            var14 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg1 << 48) + ((long) arg13 << 32) + (long) (arg2 - -(arg12 << 16) - -(arg7 << 24));
        class620 var19 = class326.field4231;
        class470 var20;
        synchronized (class326.field4231) {
            var20 = (class470) class326.field4231.method3538(var17, 0);
        }
        if (var20 == null || arg5.method418(var20.method213(), var14) != 0) {
            if (var20 != null) {
                var14 = arg5.method404(var14, var20.method213());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class260 var24 = new class260(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method1559(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class260.field3230[var31] * var28 >> 14;
                    int var33 = class260.field3229[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method1559(var32, 0, 0, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg7 * var35 + arg12 * var36 >> 8);
                short var38 = (short) (((arg1 & 0xFC00) * var35 + (arg13 & 0xFC00) * var36 & 0xFC0000) + ((arg1 & 0x7F) * var35 + (arg13 & 0x7F) * var36 & 0x7F00) + ((arg1 & 0x380) * var35 + (arg13 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1557(-12817, var26[0][var39], var25, (byte) -1, (short) -1, var26[0][(var39 + 1) % var21], var38, (byte) 1, var37);
                    } else {
                        var24.method1557(-12817, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], (byte) -1, (short) -1, var26[var34 - 1][(var39 + 1) % var21], var38, (byte) 1, var37);
                        var24.method1557(-12817, var26[var34][var39], var26[var34 - 1][var39], (byte) -1, (short) -1, var26[var34][(var39 + 1) % var21], var38, (byte) 1, var37);
                    }
                }
            }
            var20 = arg5.method383(var24, var14, class351.field4524, 64, 768);
            class620 var40 = class326.field4231;
            synchronized (class326.field4231) {
                class326.field4231.method3537(115, var17, var20);
            }
        }
        int var41 = arg3.method221();
        int var42 = arg3.method222();
        int var43 = arg3.method238();
        int var44 = arg3.method234();
        class66 var45 = null;
        if (arg10 != null) {
            int var46 = arg10.field256[arg6];
            var45 = class637.field9158.method1903((byte) -123, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        class470 var47;
        if (var45 == null) {
            var47 = var20.method237((byte) 3, var14, true);
            var47.method232(var42 - var41 >> 1, 128, var44 - var43 >> 1);
            var47.method195(var41 + var42 >> 1, 0, var43 + var44 >> 1);
        } else {
            var47 = var20.method237((byte) 3, var14, true);
            var47.method232(var42 - var41 >> 1, 128, var44 - var43 >> 1);
            var47.method195(var41 + var42 >> 1, 0, var43 + var44 >> 1);
            var47.method2844(28110, arg6, var45);
        }
        if (arg0 != 0) {
            var47.method204(arg0);
        }
        if (arg8 != 0) {
            var47.method214(arg8);
        }
        if (arg11 != 0) {
            var47.method195(0, arg11, 0);
        }
        return var47;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I", line = 171)
    public static final int method3951(int arg0, int arg1) {
        field9916++;
        if (arg0 != -13634) {
            method3954(true);
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BI)V", line = 194)
    public static final void method3952(byte arg0, int arg1) {
        field9915++;
        class47 var2 = class258.method1546(5, arg1, (byte) 121);
        var2.method274(false);
        if (arg0 != 60) {
            method3952((byte) -9, 55);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V", line = 216)
    public static final void method3953(int arg0) throws IOException {
        field9917++;
        if (class751.field10504 != null && class189.field2242 > 0) {
            int var1 = 0;
            while (true) {
                class249 var2 = (class249) class210.field2474.method1719(65280);
                if (var2 == null) {
                    class148.field1649 += var1;
                    class688.field9717 = 0;
                    break;
                }
                class751.field10504.method1695(var2.field3016.field2912, 0, -1, var2.field3015);
                var1 += var2.field3015;
                class189.field2242 -= var2.field3015;
                var2.method864(12983);
                var2.field3016.method1475((byte) -96);
                var2.method1497((byte) 98);
            }
        }
        int var3 = 47 % ((21 - arg0) / 43);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 249)
    public static void method3954(boolean arg0) {
        field9918 = null;
        field9923 = null;
        if (arg0) {
            method3950(85, -22, -22, null, (byte) 2, null, 72, 94, -65, -88, null, -70, 23, 76);
        }
        field9913 = null;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lid;III)V", line = 281)
    public class704(class583 arg0, int arg1, int arg2, int arg3) {
        this.field9912 = (byte) arg2;
        this.field9914 = arg0;
        this.field9919 = (byte) arg3;
        this.field9921 = (short) arg1;
    }
}
