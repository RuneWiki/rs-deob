import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class208 extends class125 {

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Loa;")
    public static class99 field3599 = class221.method1463(2844, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Ltg;")
    public static class182 field3604;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lnh;")
    public static class54 field3607;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method1388(int arg0) {
        if (class87.field1506.toLowerCase().indexOf("microsoft") == -1) {
            class73.field1217[44] = 71;
            if (class87.field1514 == null) {
                class73.field1217[192] = 58;
                class73.field1217[222] = 59;
            } else {
                class73.field1217[192] = 28;
                class73.field1217[520] = 59;
                class73.field1217[222] = 58;
            }
            class73.field1217[59] = 57;
            class73.field1217[61] = 27;
            class73.field1217[45] = 26;
            class73.field1217[92] = 74;
            class73.field1217[47] = 73;
            class73.field1217[46] = 72;
            class73.field1217[91] = 42;
            class73.field1217[93] = 43;
        } else {
            class73.field1217[220] = 74;
            class73.field1217[222] = 59;
            class73.field1217[221] = 43;
            class73.field1217[191] = 73;
            class73.field1217[186] = 57;
            class73.field1217[223] = 28;
            class73.field1217[188] = 71;
            class73.field1217[187] = 27;
            class73.field1217[192] = 58;
            class73.field1217[190] = 72;
            class73.field1217[189] = 26;
            class73.field1217[219] = 42;
        }
        field3601++;
        int var1 = -63 / ((arg0 + 30) / 46);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public static final void method1389(int arg0) {
        field3603++;
        class80.field1416 = null;
        class280.field4903 = null;
        class200.field3480 = null;
        class24.field357 = null;
        class30.field557 = null;
        class111.field2001 = null;
        class133.field2320 = null;
        class69.field1148 = null;
        class224.field3897 = null;
        class13.field114 = null;
        class180.field3136 = null;
        if (arg0 != 74) {
            field3607 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static void method1390(int arg0) {
        if (arg0 == 4223) {
            field3604 = null;
            field3599 = null;
            field3607 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI[BI)I")
    public static final int method1391(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field3600++;
        int var4 = -1;
        if (arg0) {
            return 90;
        } else {
            for (int var5 = arg3; var5 < arg1; var5++) {
                var4 = var4 >>> 8 ^ class183.field3222[(var4 ^ arg2[var5]) & 0xFF];
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILoa;I)V")
    public static final void method1392(int arg0, class99 arg1, int arg2) {
        if (arg0 < 123) {
            field3606 = 121;
        }
        field3610++;
        class65 var3 = class152.method1010(arg2, 3, (byte) -63);
        var3.method433(32);
        var3.field1091 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLtg;)V")
    public static final void method1393(boolean arg0, class182 arg1) {
        class164.field2882 = arg1.method1245(class251.field4339, false);
        if (!arg0) {
            method1390(-101);
        }
        field3608++;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class208() {
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ltg;IB)[Lde;")
    public static final class109[] method1394(class182 arg0, int arg1, byte arg2) {
        field3609++;
        if (class65.method434(-121, arg1, arg0)) {
            if (arg2 < 72) {
                field3607 = null;
            }
            return class122.method806(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class208(int arg0) {
        this.field3605 = arg0;
    }
}
