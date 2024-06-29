import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class197 extends class255 {

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static volatile int field3520 = -1;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
    public static int[] field3533 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "S")
    public static short field3536 = 205;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3521 = 1;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lkk;")
    public static class223 field3528;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "Lkk;")
    public static class223 field3538;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Leb;")
    public class230 field3531;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ[BI)Leb;")
    public static final class230 method1398(int arg0, boolean arg1, byte[] arg2, int arg3) {
        ++field3525;
        class230 var4 = new class230();
        var4.field3990 = 0;
        var4.field3988 = new byte[arg3];
        for (int var5 = arg0; ~var5 > ~(arg0 - -arg3); ++var5) {
            if (arg2[var5] != 0) {
                var4.field3988[var4.field3990++] = arg2[var5];
            }
        }
        if (!arg1) {
            method1404(63, -104, (byte) -57);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
    public final int method1399(int arg0) {
        ++field3526;
        if (arg0 != 867815776) {
            this.field3531 = null;
        }
        return (int) (255L & super.field1166 >>> 32);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILkk;I)Lmf;")
    public static final class10 method1400(boolean arg0, int arg1, class223 arg2, int arg3) {
        ++field3523;
        if (!class205.method1440(arg1, arg3, 2, arg2)) {
            return null;
        } else {
            if (!arg0) {
                field3528 = null;
            }
            return class142.method1091((byte) -74);
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)I")
    public final int method1401(int arg0) {
        if (arg0 != 942081824) {
            return -87;
        } else {
            ++field3519;
            return (int) super.field1166;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    public final void method1402(byte arg0) {
        if (arg0 == -102) {
            ++field3529;
            super.field4534 |= Long.MIN_VALUE;
            if (~this.method1403((byte) 121) == -1L) {
                class13.field261.method1494(42, this);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)J")
    public final long method1403(byte arg0) {
        ++field3537;
        int var2 = 81 % ((63 - arg0) / 45);
        return super.field4534 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
    public static final void method1404(int arg0, int arg1, byte arg2) {
        class100 var3 = class172.method1264(false, arg1);
        ++field3534;
        int var4 = var3.field1853;
        int var5 = var3.field1850;
        int var6 = var3.field1856;
        int var7 = 89 / ((arg2 - -51) / 62);
        int var8 = class99.field1831[-var5 + var6];
        if (~arg0 > -1 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var5;
        class111.method895(var4, ~var9 & class225.field3887[var4] | arg0 << var5 & var9, false);
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static final void method1405(int arg0) {
        class232.method1644(false);
        ++field3530;
        class263.method1824(1);
        class62.method525((byte) 122);
        class9.method88(-118);
        class229.method1577(arg0 ^ -205);
        class146.method1111((byte) -105);
        class127.method996(22134);
        class40.method353(-228649018);
        class59.method506(200);
        class155.method1181(arg0 + -124);
        class238.method1671((byte) -125);
        class34.method313(-128);
        class37.method338((byte) 112);
        class55.method439(1627);
        ((class89) class3.field15).method725(21630);
        class71.field1304.method275(false);
        class58.field1092.method1536(-98);
        class117.field2101.method1536(-46);
        class109.field1955.method1536(-91);
        class40.field733.method1536(-74);
        class183.field3224.method1536(arg0 + -36);
        field3528.method1536(116);
        class163.field2914.method1536(arg0 + -46);
        if (arg0 != 128) {
            method1404(-66, 89, (byte) -91);
        }
        class97.field1781.method1536(-92);
        class76.field1374.method1536(arg0 + -172);
        class51.field878.method1536(63);
        class271.field4782.method1536(-124);
        class260.field4613.method1124(0);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        super.field1166 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field3538 = null;
        field3528 = null;
        field3533 = null;
        if (arg0 != 205) {
            method1406(9);
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public final void method1407(int arg0) {
        if (arg0 >= -92) {
            method1405(124);
        }
        ++field3535;
        super.field4534 = 500L + class201.method1419(5) | super.field4534 & Long.MIN_VALUE;
        class54.field939.method1494(113, this);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI[Leb;I)Leb;")
    public static final class230 method1408(boolean arg0, int arg1, class230[] arg2, int arg3) {
        ++field3522;
        int var4 = 0;
        for (int var5 = 0; ~var5 > ~arg1; ++var5) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 - -var5] = class7.field98;
            }
            var4 += arg2[arg3 + var5].field3990;
        }
        if (!arg0) {
            method1406(-25);
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; arg1 > var8; ++var8) {
            class230 var10 = arg2[arg3 - -var8];
            class43.method376(var10.field3988, 0, var6, var7, var10.field3990);
            var7 += var10.field3990;
        }
        class230 var9 = new class230();
        var9.field3990 = var4;
        var9.field3988 = var6;
        return var9;
    }
}
