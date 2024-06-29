import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class111 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    public static int[] field1745 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "S")
    public static short field1753 = 256;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Z")
    public static boolean field1754 = false;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lnb;")
    private class137 field1755;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Loe;")
    private class57 field1752;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method779(int arg0) {
        field1748++;
        class78.field1297.method1255(-103);
        class130.field2039.method1255(-113);
        class53.field896.method1255(-114);
        class90.field1471.method1255(-128);
        int var1 = -53 % ((arg0 + 10) / 55);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method780(int arg0) {
        if (arg0 != 11573) {
            method781((int[][]) null, (byte) -116);
        }
        field1745 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[IB)V")
    public static final void method781(int[][] arg0, byte arg1) {
        if (arg1 != 74) {
            field1754 = false;
        }
        field1746++;
        class204.field3253 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLoe;)V")
    public final void method782(byte arg0, class57 arg1) {
        field1756++;
        this.field1752 = arg1;
        int var3 = -51 % ((-arg0 - 21) / 53);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Lnb;")
    public final class137 method783(boolean arg0) {
        if (!arg0) {
            field1754 = true;
        }
        class137 var2 = this.field1755;
        field1744++;
        if (this.field1752.field955 == var2) {
            this.field1755 = null;
            return null;
        } else {
            this.field1755 = var2.field2173;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIBII)V")
    public static final void method784(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1750++;
        class126.field1985[0].method1517(arg5, arg4);
        int var6 = (arg2 - 32) * arg2 / arg1;
        int var7 = 14 / ((-arg3 - 18) / 32);
        if (var6 < 8) {
            var6 = 8;
        }
        int var8 = (arg2 - var6 - 32) * arg0 / (arg1 - arg2);
        class126.field1985[1].method1517(arg5, arg4 + arg2 - 16);
        class127.method886(arg5, arg4 + 16, 16, arg2 - 32, class159.field2528);
        class127.method886(arg5, arg4 + var8 + 16, 16, var6, class105.field1673);
        class127.method900(arg5, var8 + arg4 + 16, var6, class238.field3814);
        class127.method900(arg5 + 1, var8 + 16 + arg4, var6, class238.field3814);
        class127.method905(arg5, arg4 + var8 + 16, 16, class238.field3814);
        class127.method905(arg5, arg4 + var8 + 17, 16, class238.field3814);
        class127.method900(arg5 + 15, arg4 + 16 + var8, var6, class280.field4485);
        class127.method900(arg5 + 14, 17 - -var8 + arg4, var6 - 1, class280.field4485);
        class127.method905(arg5, arg4 + var8 + var6 + 15, 16, class280.field4485);
        class127.method905(arg5 + 1, arg4 + var6 - (-14 - var8), 15, class280.field4485);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lnb;")
    public final class137 method785(byte arg0) {
        field1747++;
        class137 var2 = this.field1752.field955.field2173;
        if (this.field1752.field955 == var2) {
            this.field1755 = null;
            return null;
        }
        if (arg0 != 52) {
            this.method782((byte) -86, (class57) null);
        }
        this.field1755 = var2.field2173;
        return var2;
    }
}
