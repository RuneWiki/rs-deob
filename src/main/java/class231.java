import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class231 {

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "J")
    private long field2700;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[C")
    public static char[] field2698 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2705 = 1;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lkm;")
    public static class353 field2699;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1336(int arg0) {
        field2698 = null;
        if (arg0 != 8220) {
            field2699 = null;
        }
        field2699 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lvaa;")
    public final class467 method1337(byte arg0, int arg1) {
        int var3 = -68 % ((18 - arg0) / 39);
        field2701++;
        return class467.method2829((byte) -41, this.method1340(9873, arg1));
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
    public final int method1338(boolean arg0) {
        if (arg0) {
            field2697++;
            return this.field2707;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BZ)V")
    public static final void method1339(byte arg0, boolean arg1) {
        field2695++;
        class381.method2343(false);
        if (!class28.method135(-752, class392.field5397)) {
            return;
        }
        class688.field9717++;
        if (arg0 >= -29) {
            method1336(-101);
        }
        if (class688.field9717 < 50 && !arg1) {
            return;
        }
        class688.field9717 = 0;
        if (!class236.field2809 && class751.field10504 != null) {
            class463.field6607++;
            class249 var2 = class289.method1715(class251.field3028, 120, class41.field470);
            class510.method3017(var2, 76);
            try {
                class704.method3953(73);
            } catch (IOException var3) {
                class236.field2809 = true;
            }
        }
        class381.method2343(false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
    private final int method1340(int arg0, int arg1) {
        if (arg0 != 9873) {
            field2696 = 38;
        }
        field2702++;
        return (int) (this.field2700 >> class467.field6688 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLvaa;)V")
    private final void method1341(byte arg0, class467 arg1) {
        this.field2700 |= (arg1.field6677 << this.field2707++ * class467.field6688);
        if (arg0 == -115) {
            field2706++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static final void method1342(int arg0) {
        field2704++;
        if (class465.field6642) {
            return;
        }
        if (arg0 != 8221) {
            method1342(-74);
        }
        class144.field1602 += (-24.0F - class144.field1602) / 2.0F;
        class465.field6642 = true;
        class217.field2521 = true;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Z")
    public static final boolean method1343(int arg0, int arg1) {
        field2703++;
        if (arg1 != 8249) {
            method1339((byte) 92, false);
        }
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lvaa;)V")
    public class231(class467 arg0) {
        this.field2707 = 1;
        this.field2700 = arg0.field6677;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([Lvaa;)V")
    public class231(class467[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1341((byte) -115, arg0[var2]);
        }
    }
}
