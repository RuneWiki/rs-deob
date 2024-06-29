import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class356 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5641 = "Loaded input handler";

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5643 = "";

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    public static int[] field5644;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 16)
    public static void method2480(int arg0) {
        field5644 = null;
        field5641 = null;
        field5643 = null;
        if (arg0 != 1) {
            field5641 = (String) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Lea;", line = 29)
    public static final class257 method2481(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = var3.field732;
            var3.field732 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIZ)V", line = 39)
    public static final void method2482(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class263.field4155 = arg1;
        class163.field2590 = arg2;
        class230.field3647 = arg3;
        class353.field5620 = new class50[arg0][class263.field4155][class163.field2590];
        class223.field3444 = new int[arg0][class263.field4155 + 1][class163.field2590 + 1];
        if (class245.field3886) {
            class308.field5020 = new class226[4][];
        }
        if (arg4) {
            class275.field4546 = new class50[1][class263.field4155][class163.field2590];
            class91.field1317 = new int[class263.field4155][class163.field2590];
            class203.field3110 = new int[1][class263.field4155 + 1][class163.field2590 + 1];
            if (class245.field3886) {
                class121.field1808 = new class226[1][];
            }
        } else {
            class275.field4546 = (class50[][][]) null;
            class91.field1317 = (int[][]) null;
            class203.field3110 = (int[][][]) null;
            class121.field1808 = (class226[][]) null;
        }
        class146.method1042(false);
        class325.field5327 = new class186[500];
        class197.field3038 = 0;
        class28.field433 = new class186[500];
        class143.field2299 = 0;
        class140.field2257 = new int[arg0][class263.field4155 + 1][class163.field2590 + 1];
        class48.field695 = new class258[5000];
        class61.field931 = 0;
        class72.field1108 = new class258[100];
        class20.field243 = new boolean[class230.field3647 + class230.field3647 + 1][class230.field3647 + class230.field3647 + 1];
        class121.field1815 = new boolean[class230.field3647 + class230.field3647 + 2][class230.field3647 + class230.field3647 + 2];
        class37.field559 = new byte[arg0][class263.field4155][class163.field2590];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lnm;I)V", line = 81)
    public static final void method2483(class221 arg0, int arg1) {
        class358.field5675 = arg0.method1510("p11_full", arg1 - 1);
        class181.field2821 = arg0.method1510("p12_full", 0);
        field5642++;
        class147.field2373 = arg0.method1510("b12_full", 0);
        class110.field1632 = arg0.method1510("hitmarks", 0);
        class51.field760 = arg0.method1510("hitbar_default", arg1 ^ arg1);
        class291.field4834 = arg0.method1510("headicons_pk", 0);
        class9.field109 = arg0.method1510("headicons_prayer", 0);
        class289.field4801 = arg0.method1510("hint_headicons", arg1 - 1);
        class81.field1186 = arg0.method1510("hint_mapmarkers", 0);
        class99.field1443 = arg0.method1510("mapflag", 0);
        class283.field4652 = arg0.method1510("cross", 0);
        class233.field3710 = arg0.method1510("mapdots", arg1 ^ 0x1);
        class146.field2360 = arg0.method1510("scrollbar", 0);
        class117.field1709 = arg0.method1510("name_icons", 0);
        class355.field5626 = arg0.method1510("floorshadows", 0);
        class198.field3047 = arg0.method1510("compass", 0);
        class177.field2774 = arg0.method1510("hint_mapedge", 0);
    }
}
