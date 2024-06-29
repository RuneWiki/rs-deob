import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class106 extends class64 {

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "[B")
    public byte[] field2443;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lrd;")
    public static class114 field2435 = class84.method656("Verbindung konnte nicht hergestellt werden)3", (byte) 115);

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lrd;")
    public static class114 field2450 = class84.method656("Null", (byte) 122);

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "Z")
    public static boolean field2445 = false;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "Lrd;")
    public static class114 field2446 = class84.method656("Neuer Benutzer", (byte) 115);

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "Lrd;")
    public static class114 field2449 = class84.method656(":: (X", (byte) 115);

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lrd;")
    public static class114 field2442 = class84.method656("gr-Un:", (byte) 116);

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "Z")
    public static boolean field2447;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "[Lhe;")
    public static class54[] field2440;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIII)I")
    public static final int method808(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -123) {
            method809(40, -71);
        }
        field2436++;
        if ((class22.field430[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class22.field430[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lwa;")
    public static final class141 method809(int arg0, int arg1) {
        field2441++;
        if (arg1 != -1) {
            method808((byte) -108, -63, 75, -38);
        }
        class141 var2 = (class141) class64.field1362.method194((byte) -90, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class73.field1642.method762(3, arg0, (byte) 66);
        class141 var4 = new class141();
        if (var3 != null) {
            var4.method1133(-7, new class60(var3));
        }
        class64.field1362.method193(-128, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I")
    public static final int method810(int arg0, byte arg1) {
        field2448++;
        if (arg1 > -113) {
            method813(-73);
        }
        return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lrd;Lrd;Lpb;I)[Loa;")
    public static final class93[] method811(class114 arg0, class114 arg1, class100 arg2, int arg3) {
        field2444++;
        int var4 = arg2.method766(arg1, (byte) -106);
        int var5 = arg2.method752(arg0, -31757, var4);
        return arg3 > -102 ? null : class145.method1148((byte) -93, var4, arg2, var5);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBLf;)V")
    public static final void method812(int arg0, byte arg1, class36 arg2) {
        field2439++;
        if (arg2.field712 < 128 || arg2.field756 < 128 || arg2.field712 >= 13184 || arg2.field756 >= 13184) {
            arg2.field745 = 0;
            arg2.field712 = arg2.field748[0] * 128 + arg2.field735 * 64;
            arg2.field721 = -1;
            arg2.field756 = arg2.field758[0] * 128 + arg2.field735 * 64;
            arg2.field707 = 0;
            arg2.field750 = -1;
            arg2.method258((byte) -105);
        }
        if (class7.field103 == arg2 && (arg2.field712 < 1536 || arg2.field756 < 1536 || arg2.field712 >= 11776 || arg2.field756 >= 11776)) {
            arg2.field712 = arg2.field748[0] * 128 + arg2.field735 * 64;
            arg2.field750 = -1;
            arg2.field707 = 0;
            arg2.field721 = -1;
            arg2.field745 = 0;
            arg2.field756 = arg2.field758[0] * 128 + arg2.field735 * 64;
            arg2.method258((byte) -105);
        }
        if (class20.field370 < arg2.field745) {
            class24.method166(true, arg2);
        } else if (class20.field370 > arg2.field707) {
            class128.method990((byte) -20, arg2);
        } else {
            class101.method778(3031, arg2);
        }
        class74.method602(-19558, arg2);
        if (arg1 == -74) {
            class22.method156(arg2, false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method813(int arg0) {
        if (arg0 != 13402) {
            method812(61, (byte) -92, null);
        }
        field2440 = null;
        field2446 = null;
        field2450 = null;
        field2442 = null;
        field2449 = null;
        field2435 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static final void method814(byte arg0) {
        class85.field1902 = 0;
        class48.field1004 = 0;
        field2451++;
        class5.method53((byte) 19);
        class114.method879(109);
        class80.method633((byte) -2);
        class140.method1115((byte) -91);
        int var1 = 0;
        if (arg0 != -72) {
            return;
        }
        while (var1 < class85.field1902) {
            int var3 = class102.field2375[var1];
            if (class20.field370 != class36.field762[var3].field714) {
                class36.field762[var3] = null;
            }
            var1++;
        }
        if (class74.field1697 != class77.field1752.field1227) {
            throw new RuntimeException("gpp1 pos:" + class77.field1752.field1227 + " psize:" + class74.field1697);
        }
        for (int var2 = 0; var2 < class8.field116; var2++) {
            if (class36.field762[class110.field2573[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class8.field116);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
    public class106(byte[] arg0) {
        this.field2443 = arg0;
    }
}
