import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class85 extends class508 {

    @OriginalMember(owner = "client!np", name = "r", descriptor = "[I")
    public static int[] field1145 = new int[50];

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "J")
    public long field1143;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Lnp;")
    public class85 field1146;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Lnp;")
    public class85 field1151;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    public static void method538(int arg0) {
        if (arg0 != 1) {
            field1145 = null;
        }
        field1145 = null;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
    public final boolean method539(int arg0) {
        field1144++;
        if (arg0 != 50) {
            this.method540((byte) -4);
        }
        return this.field1146 != null;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
    public final void method540(byte arg0) {
        int var2 = 33 / ((51 - arg0) / 60);
        field1147++;
        if (this.field1146 != null) {
            this.field1146.field1151 = this.field1151;
            this.field1151.field1146 = this.field1146;
            this.field1146 = null;
            this.field1151 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
    public static final boolean method541(int arg0, int arg1) {
        class504.field7414 = arg1 & arg0 + 1;
        class27.field471 = true;
        field1149++;
        return true;
    }
}
