import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class89 extends class392 {

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lw;)V")
    public class89(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(ILw;)V")
    public class89(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        ++field1306;
        int var3 = -108 / ((arg0 - -80) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        if (arg1 >= -124) {
            return 74;
        } else {
            ++field1304;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method292(true);
        }
        ++field1307;
        return 1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (!arg0) {
            if (super.field5454.method3775(-73) == class429.field5944) {
                super.field5452 = 2;
            }
            ++field1305;
            if (super.field5452 < 0 || super.field5452 > 2) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)I")
    public final int method776(int arg0) {
        if (arg0 != 17539) {
            return 54;
        } else {
            ++field1303;
            return super.field5452;
        }
    }
}
