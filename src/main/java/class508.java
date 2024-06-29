import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class508 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Loi;")
    public static class169 field7457 = new class169("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "S")
    public static short field7459 = 1;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lhb;")
    public static class250 field7460 = new class250(63, 8);

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field7463 = new String[100];

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lpi;")
    public static class340 field7462 = new class340(63, 0);

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lsu;")
    public static class111 field7464 = new class111(2);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "J")
    public long field7456;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lli;")
    public static class382 field7461;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Llf;")
    public class508 field7454;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Llf;")
    public class508 field7455;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
    public final boolean method3019(int arg0) {
        field7451++;
        if (this.field7455 == null) {
            return false;
        } else {
            return arg0 <= -126;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method3020(byte arg0) {
        field7464 = null;
        field7463 = null;
        if (arg0 != -94) {
            method3020((byte) -53);
        }
        field7457 = null;
        field7460 = null;
        field7462 = null;
        field7461 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public final void method3021(int arg0) {
        field7458++;
        if (this.field7455 == null) {
            return;
        }
        this.field7455.field7454 = this.field7454;
        this.field7454.field7455 = this.field7455;
        this.field7455 = null;
        int var2 = -118 % ((-arg0 - 42) / 52);
        this.field7454 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static final void method3022(byte arg0) {
        class482.method2889((byte) 127);
        field7453++;
        class100.method679(16384);
        if (arg0 > -47) {
            method3020((byte) 21);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
    public static final void method3023(boolean arg0, int arg1) {
        class450.field6264 = 0;
        class24.field428 = 0;
        field7452++;
        class78.method451((byte) -101);
        if (arg1 != 7039) {
            method3023(false, 0);
        }
        class228.method1446(-92, arg0);
        class278.method1707(-1);
        for (int var2 = 0; var2 < class450.field6264; var2++) {
            int var4 = class208.field2706[var2];
            if (class264.field3353 != class527.field7791[var4].field5232) {
                if (class527.field7791[var4].field3831.method72(0)) {
                    class11.method81(class527.field7791[var4], (byte) -58);
                }
                class527.field7791[var4].method1776(null, (byte) 104);
                class527.field7791[var4] = null;
            }
        }
        if (class37.field574 != class109.field1514.field1176) {
            throw new RuntimeException("gnp1 pos:" + class109.field1514.field1176 + " psize:" + class37.field574);
        }
        for (int var3 = 0; var3 < class16.field264; var3++) {
            if (class527.field7791[class414.field5507[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class16.field264);
            }
        }
    }
}
