import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class97 extends class107 {

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public int field1624 = 0;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[I")
    public int[] field1609 = new int[5];

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "[Lva;")
    public class33[] field1632 = new class33[5];

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Ldf;")
    public static class51 field1599 = class46.method233("Benutzen", 100);

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Ldf;")
    public static class51 field1597 = class46.method233("scape main", 100);

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "[B")
    public static byte[] field1615 = new byte[520];

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Lqh;")
    public static class189 field1600 = new class189(64);

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Laf;")
    public static class64 field1622 = new class64(5000);

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Ldf;")
    private static class51 field1623 = class46.method233("Cancel", 100);

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Ldf;")
    public static class51 field1628 = field1623;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "Lmj;")
    public class105 field1611;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "Lei;")
    public class162 field1614;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "Llf;")
    public class195 field1616;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Lhb;")
    public class199 field1619;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lsa;")
    public class241 field1627;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lqg;")
    public class97 field1626;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "Ljj;")
    public class98 field1618;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Z")
    public boolean field1612;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Z")
    public boolean field1613;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Z")
    public boolean field1625;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BJ)V")
    public static final void method717(byte arg0, long arg1) {
        field1603++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 <= 20) {
            method718(-92, false, (class213) null);
        }
        class95.field1575.method424((byte) 113, 83);
        class95.field1575.method885(arg1, (byte) -94);
        class252.field4432++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLwc;)V")
    public static final void method718(int arg0, boolean arg1, class213 arg2) {
        field1598++;
        int var3 = arg2.field3591 == 0 ? arg2.field3603 : arg2.field3591;
        int var4 = -11 / ((arg0 - 49) / 46);
        int var5 = arg2.field3546 == 0 ? arg2.field3608 : arg2.field3546;
        class60.method398(var3, arg2.field3703, var5, arg1, class10.field106[arg2.field3703 >> 16], 128);
        if (arg2.field3556 != null) {
            class60.method398(var3, arg2.field3703, var5, arg1, arg2.field3556, 128);
        }
        class42 var6 = (class42) class79.field1265.method1453((long) arg2.field3703, 1);
        if (var6 != null) {
            class21.method106(var5, var6.field668, arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method719(int arg0) {
        field1622 = null;
        field1600 = null;
        if (arg0 != 14789) {
            field1622 = null;
        }
        field1599 = null;
        field1597 = null;
        field1628 = null;
        field1615 = null;
        field1623 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIB)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1604++;
        for (int var5 = 0; var5 < class167.field2713; var5++) {
            if (arg2 < class62.field1014[var5] + class41.field663[var5] && (arg1 + arg2) > class41.field663[var5] && arg3 < class87.field1460[var5] + class237.field4124[var5] && (arg3 + arg0) > class237.field4124[var5]) {
                class42.field681[var5] = true;
            }
        }
        if (arg4 != -46) {
            field1600 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZZII)Lja;")
    public static final class55 method721(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1605++;
        class188 var5 = null;
        if (class87.field1461 != null) {
            var5 = new class188(arg3, class87.field1461, class202.field3392[arg3], 1000000);
        }
        if (arg4 != 1000000) {
            field1623 = null;
        }
        return new class55(var5, client.field2447, arg3, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1606++;
        if (arg5 != -58) {
            return;
        }
        if (arg1 >= class28.field408 && arg4 <= class115.field1954 && arg6 >= class36.field542 && class175.field2867 >= arg7) {
            class170.method1188(arg5 ^ 0x5A5D, arg1, arg0, arg7, arg3, arg2, arg4, arg6);
        } else {
            class8.method37(arg4, arg6, arg7, 0, arg1, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method723(boolean arg0) {
        field1602++;
        if (!arg0) {
            field1628 = null;
        }
        if (!class93.field1532) {
            return;
        }
        class213 var1 = class198.method1395(-1, class242.field4201, class142.field2380);
        if (var1 != null && var1.field3666 != null) {
            class205 var2 = new class205();
            var2.field3433 = var1;
            var2.field3423 = var1.field3666;
            class176.method1233(var2, (byte) 83);
        }
        class93.field1532 = false;
        class25.method135(var1, -28014);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)Z")
    public static final boolean method724(int arg0, int arg1) {
        field1601++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 != 0) {
            method718(-37, true, (class213) null);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(III)V")
    public class97(int arg0, int arg1, int arg2) {
        this.field1631 = arg2;
        this.field1629 = arg1;
        this.field1630 = this.field1617 = arg0;
    }
}
