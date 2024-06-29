import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class137 extends class98 {

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[B")
    public byte[] field2448;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Lmb;")
    public static class96 field2449 = class243.method1708("<)4col>", (byte) 101);

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Z")
    public static boolean field2451 = false;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Luc;")
    public static class11 field2450 = new class11(64);

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
    public class137(byte[] arg0) {
        this.field2448 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Z")
    public static final boolean method1021(byte arg0, int arg1) {
        field2453++;
        if (arg0 != -120) {
            return true;
        } else if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZBII)Lmb;")
    public static final class96 method1022(boolean arg0, byte arg1, int arg2, int arg3) {
        field2452++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var4 = arg3 / arg2;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg2;
            var5++;
        }
        int var6 = var5;
        int var7 = -101 % ((arg1 + 26) / 32);
        if (arg3 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var8 = new byte[var6];
        if (arg3 < 0) {
            var8[0] = 45;
        } else if (arg0) {
            var8[0] = 43;
        }
        for (int var9 = 0; var9 < var5; var9++) {
            int var11 = arg3 % arg2;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            arg3 /= arg2;
            var8[var6 - var9 - 1] = (byte) (var11 + 48);
        }
        class96 var10 = new class96();
        var10.field1580 = var8;
        var10.field1600 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public static final void method1023(int arg0, byte arg1) {
        field2455++;
        if (arg0 == -1 || !class225.method1534(-1, arg0)) {
            return;
        }
        if (arg1 != 37) {
            method1022(false, (byte) 84, -9, 107);
        }
        class107[] var2 = class100.field1704[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class107 var4 = var2[var3];
            if (var4.field1834 != null) {
                class116 var5 = new class116();
                var5.field2158 = var4;
                var5.field2155 = var4.field1834;
                class187.method1322((byte) 101, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2450 = null;
        if (arg0 != -978741881) {
            method1023(120, (byte) -75);
        }
        field2449 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIB)I")
    public static final int method1025(int arg0, int arg1, int arg2, byte arg3) {
        field2454++;
        if (class173.field3022 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        if (arg3 != -94) {
            field2450 = null;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class132.field2376[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var7) * class173.field3022[var6][var4][var5] + class173.field3022[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class173.field3022[var6][var4][var5 + 1] + class173.field3022[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + (var8 * var10) >> 7;
    }
}
