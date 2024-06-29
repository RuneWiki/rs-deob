import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class199 extends class104 {

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
    public int[] field3536 = new int[5];

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "[Lo;")
    public class12[] field3549 = new class12[5];

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public int field3542 = 0;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Le;")
    public static class191 field3531 = class54.method368("Ausw-=hlen", 2047);

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Le;")
    private static class191 field3538 = class54.method368("Cancel", 2047);

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field3554 = 0;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "[I")
    public static int[] field3557 = new int[25];

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Le;")
    public static class191 field3533 = field3538;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "J")
    public static long field3564;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Le;")
    public static class191 field3532;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "Lnd;")
    public class199 field3565;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Llk;")
    public class215 field3560;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lag;")
    public class254 field3535;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "Lcj;")
    public class257 field3556;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Lob;")
    public class269 field3553;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Lwh;")
    public class48 field3552;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lvf;")
    public static class51 field3539;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lub;")
    public class9 field3541;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Z")
    public boolean field3540;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "Z")
    public boolean field3547;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "Z")
    public boolean field3563;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZJBI)Le;")
    public static final class191 method1392(boolean arg0, long arg1, byte arg2, int arg3) {
        field3545++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg2 != 102) {
            method1392(false, 0L, (byte) -28, 8);
        }
        int var5 = 1;
        long var6 = arg1 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg1 % (long) arg3);
            arg1 /= (long) arg3;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class191 var11 = new class191();
        var11.field3379 = var8;
        var11.field3392 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method1393(byte arg0) {
        class137.field2307.method992(-31);
        class248.field4397.method992(-31);
        field3562++;
        if (arg0 < 67) {
            field3533 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    public class199(int arg0, int arg1, int arg2) {
        this.field3534 = arg1;
        this.field3551 = this.field3543 = arg0;
        this.field3558 = arg2;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method1394(byte arg0) {
        field3532 = null;
        field3557 = null;
        field3538 = null;
        field3531 = null;
        if (arg0 >= 57) {
            field3533 = null;
            field3539 = null;
        }
    }
}
