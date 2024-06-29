import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class69 extends class107 {

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public int field1444 = 0;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[Lv;")
    public class134[] field1459 = new class134[5];

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "[I")
    public int[] field1463 = new int[5];

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field1443 = 0;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Lvc;")
    public static class137 field1434 = class45.method325("m-Ochte mit Ihnen handeln)3", -46);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lvc;")
    public static class137 field1436 = class45.method325("null", -46);

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lvc;")
    public static class137 field1451 = class45.method325("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -46);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lvc;")
    public static class137 field1456 = class45.method325("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", -46);

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Z")
    public static boolean field1462 = false;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lda;")
    public class23 field1441;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Led;")
    public class33 field1467;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "Lef;")
    public class35 field1442;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lh;")
    public class49 field1439;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lhc;")
    public class52 field1466;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Lie;")
    public static class61 field1446;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lka;")
    public class69 field1458;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Lkc;")
    public class71 field1447;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Z")
    public boolean field1440;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "Z")
    public boolean field1449;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Z")
    public boolean field1455;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
    public static final void method486(int arg0, int arg1, int arg2) {
        field1450++;
        long var3 = (long) ((arg0 << arg1) + arg2);
        class38 var5 = (class38) class45.field988.method867(var3, false);
        if (var5 != null) {
            class32.field680.method57(var5, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(III)V")
    public class69(int arg0, int arg1, int arg2) {
        this.field1464 = this.field1469 = arg0;
        this.field1465 = arg2;
        this.field1457 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1451 = null;
        field1456 = null;
        if (arg0 != -1) {
            field1446 = null;
        }
        field1446 = null;
        field1436 = null;
        field1434 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)I")
    public static final int method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - class97.field2257[arg3 * 1024 / arg0] >> 1;
        field1470++;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BIB)I")
    public static final int method489(int arg0, byte[] arg1, int arg2, byte arg3) {
        field1468++;
        if (arg3 < 22) {
            field1438 = -112;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class10.field216[(var4 ^ arg1[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)I")
    public static final int method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        field1454++;
        if (arg1 != 7) {
            return 126;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg6;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }
}
