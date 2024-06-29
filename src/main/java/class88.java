import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class88 extends class163 {

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lkh;")
    public static class117 field1639 = class224.method1450((byte) 115, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lme;")
    public static class136 field1638;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lih;")
    public static class95 field1636;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[I")
    public static int[] field1635;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static void method604(int arg0) {
        if (arg0 <= -71) {
            field1639 = null;
            field1636 = null;
            field1635 = null;
            field1638 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)Lkh;")
    public static final class117 method605(int arg0, byte arg1, int arg2) {
        field1641++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class90.field1669;
        }
        if (arg1 != 35) {
            field1638 = null;
        }
        if (var3 < -6) {
            return class120.field2272;
        } else if (var3 < -3) {
            return class237.field4289;
        } else if (var3 < 0) {
            return class208.field3732;
        } else if (var3 > 9) {
            return class217.field3947;
        } else if (var3 > 6) {
            return class203.field3662;
        } else if (var3 > 3) {
            return class103.field1867;
        } else if (var3 > 0) {
            return class137.field2470;
        } else {
            return class216.field3930;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static final void method606(boolean arg0) {
        field1637++;
        if (class94.field1719 != null) {
            class82 var1 = class94.field1719;
            synchronized (class94.field1719) {
                class94.field1719 = null;
            }
        }
        if (arg0) {
            method605(-69, (byte) 84, 93);
        }
    }
}
