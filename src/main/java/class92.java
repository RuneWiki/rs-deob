import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class92 extends class273 {

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1652 = 0;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Llc;")
    public static class143 field1649 = class66.method374("leuchten3:", -1);

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Llc;")
    public static class143 field1651 = class66.method374("Textures charg-Bes", -1);

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1653 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Llc;")
    public static class143 field1648 = class66.method374("::gc", -1);

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[S")
    public static short[] field1647 = new short[] { 35, 44, 36, 3, 49, 19, 60, 8 };

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lsa;")
    public class92 field1650;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lsa;")
    public class92 field1659;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1651 = null;
        field1647 = null;
        if (arg0 != -15) {
            method521((byte) -110);
        }
        field1648 = null;
        field1649 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public final void method522(byte arg0) {
        field1657++;
        if (this.field1659 == null) {
            return;
        }
        this.field1659.field1650 = this.field1650;
        this.field1650.field1659 = this.field1659;
        this.field1659 = null;
        this.field1650 = null;
        if (arg0 != -74) {
            method523(-119);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Lbc;")
    public static final class100 method523(int arg0) {
        field1655++;
        class100 var1 = new class100(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], class282.field4961[0], class111.field1961);
        class258.method1708(arg0 ^ arg0);
        return var1;
    }
}
