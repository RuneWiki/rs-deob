import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class93 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
    public boolean field1532 = true;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lao;")
    public static class188 field1528 = new class188(12, -2);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lvp;")
    public static class123 field1534 = new class123(62, 15);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "C")
    private char field1526;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lhh;")
    public static class84 field1533;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ljava/lang/String;")
    public String field1525;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    public final boolean method748(byte arg0) {
        field1536++;
        int var2 = -32 / ((-arg0 - 29) / 50);
        return this.field1526 == 's';
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1528 = null;
        field1533 = null;
        if (arg0 != -26783) {
            field1534 = null;
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZ)Z")
    public static final boolean method750(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1535++;
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg0; var7 <= arg3; var7++) {
                if (class504.field7404[var6][var7] == arg4 && class522.field7666[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg5) {
            field1528 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Lkg;")
    public static final class177 method751(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2493;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILti;)V")
    public final void method752(int arg0, class303 arg1) {
        field1527++;
        while (true) {
            int var3 = arg1.method1918((byte) -58);
            if (var3 == 0) {
                if (arg0 == 2) {
                    return;
                } else {
                    this.method753((byte) -97, 113, null);
                    return;
                }
            }
            this.method753((byte) -9, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILti;)V")
    private final void method753(byte arg0, int arg1, class303 arg2) {
        if (arg0 != -9) {
            return;
        }
        if (arg1 == 1) {
            this.field1526 = class470.method2804(63, arg2.method1899((byte) -113));
        } else if (arg1 == 2) {
            this.field1529 = arg2.method1870(-1945262512);
        } else if (arg1 == 4) {
            this.field1532 = false;
        } else if (arg1 == 5) {
            this.field1525 = arg2.method1879(30669);
        }
        field1531++;
    }
}
