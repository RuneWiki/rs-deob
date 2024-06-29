import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class224 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
    public static boolean field3521 = false;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
    public static boolean field3527 = false;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
    public static int[] field3522;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method1498(int arg0, boolean arg1) {
        field3524++;
        if (!arg1) {
            return null;
        } else if (arg0 == 100 && class277.field4366 > 0) {
            byte[] var2 = class184.field2763[--class277.field4366];
            class184.field2763[class277.field4366] = null;
            return var2;
        } else if (arg0 == 5000 && class252.field3872 > 0) {
            byte[] var3 = class6.field113[--class252.field3872];
            class6.field113[class252.field3872] = null;
            return var3;
        } else if (arg0 == 30000 && class31.field493 > 0) {
            byte[] var4 = class163.field2479[--class31.field493];
            class163.field2479[class31.field493] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)I")
    public static final int method1499(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 12545) {
            method1502((byte) 109, -65, 0, 21);
        }
        field3519++;
        if ((class191.field3041[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (class191.field3041[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIB)V")
    public static final void method1500(int arg0, int arg1, byte arg2) {
        if (arg2 != -51) {
            return;
        }
        int var3 = class259.field3985 * arg0 >> 8;
        if (arg1 == -1 && !class28.field421) {
            class153.method1028(1);
        } else if (arg1 != -1 && (class295.field4633 != arg1 || !class219.method1457(arg2 - 14)) && var3 != 0 && !class28.field421) {
            class117.method847(2, false, class158.field2427, false, arg1, 0, var3);
        }
        class295.field4633 = arg1;
        field3525++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)Lrj;")
    public static final class8 method1501(byte arg0, int arg1) {
        field3520++;
        class8 var2 = (class8) class245.field3797.method1780((long) arg1, (byte) -116);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -120) {
            return null;
        } else {
            byte[] var3 = class276.field4354.method1163(32, arg1, 48);
            class8 var4 = new class8();
            if (var3 != null) {
                var4.method97(new class37(var3), (byte) -92);
            }
            var4.method98(0);
            class245.field3797.method1784(var4, false, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)I")
    public static final int method1502(byte arg0, int arg1, int arg2, int arg3) {
        field3518++;
        if (class68.field1079 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class191.field3041[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg3 & 0x7F;
        if (arg0 > -124) {
            method1498(112, false);
        }
        int var9 = (128 - var8) * class68.field1079[var6][var4][var5 + 1] + (class68.field1079[var6][var4 + 1][var5 + 1] * var8) >> 7;
        int var10 = (128 - var8) * class68.field1079[var6][var4][var5] + class68.field1079[var6][var4 + 1][var5] * var8 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field3522 = null;
        int var1 = 59 / ((arg0 + 9) / 56);
    }
}
