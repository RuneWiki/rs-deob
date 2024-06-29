import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class241 {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4230 = 0;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "D")
    public static double field4231 = -1.0D;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4233 = 1;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Loh;")
    public static class263 field4238 = class253.method1681(-127, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "J")
    public long field4226;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lfj;")
    public class241 field4229;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lfj;")
    public class241 field4235;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method1613(boolean arg0) {
        if (arg0) {
            field4238 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method1614(int arg0) {
        field4228++;
        if (this.field4229 == null) {
            return;
        }
        this.field4229.field4235 = this.field4235;
        if (arg0 == -1204826926) {
            this.field4235.field4229 = this.field4229;
            this.field4229 = null;
            this.field4235 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)I")
    public static final int method1615(boolean arg0, int arg1) {
        field4234++;
        return arg0 ? (arg1 & 0x1DDBDF) >> 18 : -22;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
    public final boolean method1616(int arg0) {
        field4227++;
        if (this.field4229 == null) {
            return false;
        } else {
            if (arg0 >= -3) {
                this.method1616(28);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILsi;)V")
    public static final void method1617(int arg0, class194 arg1) {
        for (int var2 = 0; var2 < class165.field3011; var2++) {
            int var3 = arg1.method1311(14);
            int var4 = arg1.method1294((byte) 3);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class126.field2336[var3] != null) {
                class126.field2336[var3].field1765 = var4;
            }
        }
        field4232++;
        if (arg0 > -94) {
            method1615(true, -1);
        }
    }
}
