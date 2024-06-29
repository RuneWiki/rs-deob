import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class28 extends class12 {

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lvf;")
    public static class265 field728 = class87.method582(-46, "(U(Y");

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "S")
    public static short field732 = 1;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lvf;")
    public static class265 field737 = class87.method582(-46, "<col=00ff80>");

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field739 = 50;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
    public static int[] field734 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
    public static int[] field736 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[I")
    public static int[] field723 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "[I")
    public static int[] field731 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field722 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "[Lvf;")
    public static class265[] field724 = new class265[field739];

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "[I")
    public static int[] field738 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
    public static int[] field730 = new int[field739];

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "J")
    public long field727;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lhb;")
    public class28 field729;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lhb;")
    public class28 field733;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method238(byte arg0) {
        field726++;
        if (this.field729 == null) {
            return;
        }
        this.field729.field733 = this.field733;
        if (arg0 > 20) {
            this.field733.field729 = this.field729;
            this.field733 = null;
            this.field729 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILfl;II)Z")
    public static final boolean method239(int arg0, class192 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method1332(true, arg3, arg2);
        field735++;
        if (arg0 != 50) {
            method240(84, 109, 65);
        }
        if (var4 == null) {
            return false;
        } else {
            class262.method1755((byte) -67, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lne;")
    public static final class200 method240(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2510;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public static void method241(byte arg0) {
        field731 = null;
        field736 = null;
        field730 = null;
        field737 = null;
        field738 = null;
        field723 = null;
        if (arg0 != -102) {
            method240(36, -7, 20);
        }
        field722 = null;
        field724 = null;
        field728 = null;
        field734 = null;
    }
}
