import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class419 {

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "Z")
    public boolean field6045;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6041 = -1;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Laj;")
    public static class287 field6038 = new class287(3000000, 200);

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "Lor;")
    public class595 field6039;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "Lor;")
    public class595 field6043;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Z")
    public boolean field6036;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "[Lf;")
    public static class702[] field6046;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
    public static final void method2542(int arg0) {
        field6042++;
        class114.field2046.method210((byte) 58);
        if (arg0 >= -56) {
            method2542(-91);
        }
        class47.field1136 = null;
        class577.field8380 = 1;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
    public static void method2543(boolean arg0) {
        field6038 = null;
        field6046 = null;
        if (arg0) {
            method2543(false);
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
    public final boolean method2544(boolean arg0) {
        if (arg0) {
            this.method2544(true);
        }
        field6044++;
        return this.field6036 && !this.field6045;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public final void method2545(int arg0) {
        if (this.field6043 != null) {
            this.field6043.method382((byte) 64);
        }
        if (arg0 >= -122) {
            this.method2544(true);
        }
        field6040++;
        this.field6036 = false;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Z)V")
    public class419(boolean arg0) {
        this.field6045 = arg0;
    }
}
