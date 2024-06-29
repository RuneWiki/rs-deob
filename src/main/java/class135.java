import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class135 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field1715 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field1722 = 0;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field1717 = 2048;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field1720 = 2048;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lts;")
    public static class356 field1723 = null;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lgn;")
    public static class475 field1724 = new class475(59, 4);

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[Lrq;")
    public static class223[] field1726 = new class223[2048];

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lgn;")
    public static class475 field1727 = new class475(56, 7);

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1731 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "F")
    public static float field1728;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "[[Lts;")
    public static class356[][] field1730;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZC)I", line = 3)
    public static final int method841(int arg0, boolean arg1, char arg2) {
        field1725++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        if (!arg1) {
            method846(63);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 30)
    public static void method842(int arg0) {
        field1731 = null;
        field1730 = null;
        field1726 = null;
        field1727 = null;
        field1724 = null;
        if (arg0 <= 0) {
            method846(91);
        }
        field1723 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILae;)V", line = 48)
    public final void method843(int arg0, class156 arg1) {
        field1721++;
        if (arg0 < 72) {
            method845(52, -105, true);
        }
        while (true) {
            int var3 = arg1.method941((byte) 125);
            if (var3 == 0) {
                return;
            }
            this.method844(116, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILae;I)V", line = 72)
    private final void method844(int arg0, class156 arg1, int arg2) {
        field1718++;
        int var4 = 20 / ((arg0 - 29) / 49);
        if (arg2 == 1) {
            this.field1715 = arg1.method941((byte) 126);
        } else if (arg2 == 2) {
            this.field1720 = arg1.method993((byte) -96);
            return;
        } else if (arg2 == 3) {
            this.field1717 = arg1.method993((byte) -40);
            return;
        } else if (arg2 == 4) {
            this.field1722 = arg1.method936((byte) -96);
            return;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)V", line = 100)
    public static final void method845(int arg0, int arg1, boolean arg2) {
        field1719++;
        if (arg2) {
            method845(94, 57, true);
        }
        class338 var3 = class380.method2294((byte) 112, arg1, 1);
        var3.method2052((byte) -67);
        var3.field4930 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 146)
    public static final void method846(int arg0) {
        field1716++;
        class5 var1 = class151.field1951;
        synchronized (class151.field1951) {
            class151.field1951.method35((byte) -1);
        }
        class5 var2 = class124.field1607;
        synchronized (class124.field1607) {
            int var3 = -112 % ((arg0 - 38) / 37);
            class124.field1607.method35((byte) -1);
        }
    }
}
