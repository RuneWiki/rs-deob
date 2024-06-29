import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class73 extends class114 {

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public int field1424 = 0;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Lia;")
    public static class257 field1419 = class28.method234(-118, "lila:");

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lia;")
    public static class257 field1418 = class28.method234(-52, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Lme;")
    public static class44 field1421 = null;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "[Lte;")
    public static class184[] field1425;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static final void method542(int arg0) {
        class93.field1765 = new class33();
        field1422++;
        if (arg0 != 0) {
            field1421 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILk;I)V")
    private final void method543(int arg0, class152 arg1, int arg2) {
        field1416++;
        if (arg0 == arg2) {
            this.field1424 = arg1.method1063(-17162);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lk;I)V")
    public final void method544(class152 arg0, int arg1) {
        field1423++;
        if (arg1 != 0) {
            field1421 = null;
        }
        while (true) {
            int var3 = arg0.method1051((byte) 89);
            if (var3 == 0) {
                return;
            }
            this.method543(var3, arg0, arg1 ^ 0x2);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
    public static final void method545(int arg0, int arg1) {
        class20.field419.method831(arg1, -123);
        field1426++;
        if (arg0 != 2) {
            field1419 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1419 = null;
        if (arg0 != 0) {
            field1418 = null;
        }
        field1425 = null;
        field1421 = null;
        field1418 = null;
    }
}
