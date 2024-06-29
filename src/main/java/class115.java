import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class115 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "F")
    public static float field1734;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "J")
    public long field1739;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lea;")
    public class115 field1736;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lea;")
    public class115 field1741;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method874(byte arg0) {
        if (arg0 != -83) {
            return;
        }
        class263.method1645(class407.field6147, (long) class86.field1350, 0);
        field1737++;
        if (class256.field3477 != -1) {
            class11.method133(true, class256.field3477);
        }
        for (int var1 = 0; var1 < class81.field1139; var1++) {
            if (class147.field2223[var1]) {
                class462.field6727[var1] = true;
            }
            class272.field4059[var1] = class147.field2223[var1];
            class147.field2223[var1] = false;
        }
        class206.field2993 = class86.field1350;
        if (class407.field6147.method112()) {
            class336.field5191 = true;
        }
        if (class256.field3477 != -1) {
            class81.field1139 = 0;
            class172.method1186(true);
        }
        class407.field6147.method94();
        class204.method1339(0, class407.field6147);
        int var2 = class45.method350(arg0 + 84);
        if (var2 == -1) {
            var2 = class98.field1510;
        }
        if (var2 == -1) {
            var2 = class52.field675;
        }
        class152.method1096(19716, var2);
        class469.field6876 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
    public final boolean method875(int arg0) {
        field1735++;
        if (this.field1736 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                method874((byte) 43);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public final void method876(byte arg0) {
        field1740++;
        if (arg0 == -96 && this.field1736 != null) {
            this.field1736.field1741 = this.field1741;
            this.field1741.field1736 = this.field1736;
            this.field1736 = null;
            this.field1741 = null;
        }
    }
}
