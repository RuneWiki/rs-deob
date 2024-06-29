import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class78 extends class105 {

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Leh;")
    public static class47 field1685 = class195.method1282((byte) -4, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Leh;")
    public static class47 field1683 = null;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field1689 = 1;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Leh;")
    public static class47 field1687 = class195.method1282((byte) -4, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Z")
    public static boolean field1688 = false;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "Leh;")
    private static class47 field1690 = class195.method1282((byte) -4, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Leh;")
    public static class47 field1691 = class195.method1282((byte) -4, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Leh;")
    public static class47 field1684 = field1690;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 < 78) {
            this.method92(127, (byte) 123);
        }
        ++field1686;
        int[] var3 = super.field2192.method336(-100, arg0);
        if (super.field2192.field770) {
            class128.method959(var3, 0, class149.field2928, class26.field500[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static void method674(byte arg0) {
        field1685 = null;
        field1691 = null;
        field1690 = null;
        field1687 = null;
        field1684 = null;
        field1683 = null;
        if (arg0 > -42) {
            field1689 = -64;
        }
    }
}
