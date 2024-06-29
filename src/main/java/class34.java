import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class34 extends class42 {

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "Lsd;")
    public static class166 field640 = class135.method935("Verbindung abgebrochen)3", 0);

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "Lsd;")
    public static class166 field638 = class135.method935("Lade)3)3)3", 0);

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "Lsd;")
    public static class166 field645 = class135.method935("m", 0);

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "Lsd;")
    public static class166 field635 = class135.method935("null", 0);

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "Lsd;")
    private static class166 field630 = class135.method935("purple:", 0);

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
    public static int field646 = 1;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "Lsd;")
    public static class166 field648 = class135.method935("(U0a )2 via: ", 0);

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "Lsd;")
    private static class166 field647 = class135.method935(" is already on your friend list)3", 0);

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "Lsd;")
    public static class166 field643 = field630;

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "I")
    public static int field650 = 0;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Lsd;")
    public static class166 field632 = field647;

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "Lsd;")
    public static class166 field653 = field630;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "Lf;")
    public static class47 field641;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public static final void method244(int arg0, int arg1) {
        field633++;
        if (~arg0 == arg1 || !class199.field3943[arg0]) {
            return;
        }
        class72.field1431.method369(arg1 - 3, arg0);
        if (class63.field1309[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class63.field1309[arg0].length; var3++) {
            if (class63.field1309[arg0][var3] != null) {
                if (class63.field1309[arg0][var3].field3797 == 2) {
                    var2 = false;
                } else {
                    class63.field1309[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class63.field1309[arg0] = null;
        }
        class199.field3943[arg0] = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lf;I)V")
    public static final void method245(class47 arg0, int arg1) {
        if (arg1 == 15414) {
            class131.field2564 = arg0;
            field634++;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static final void method246(byte arg0) {
        if (class129.field2532 != null) {
            class147 var1 = class129.field2532;
            synchronized (class129.field2532) {
                class129.field2532 = null;
            }
        }
        if (arg0 != 101) {
            field647 = null;
        }
        field637++;
    }

    @OriginalMember(owner = "client!de", name = "k", descriptor = "(I)V")
    public static void method247(int arg0) {
        field648 = null;
        field638 = null;
        field641 = null;
        field653 = null;
        field630 = null;
        field640 = null;
        field643 = null;
        field647 = null;
        field632 = null;
        field635 = null;
        field645 = null;
        if (arg0 != 0) {
            field647 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static final void method248(boolean arg0) {
        field651++;
        if (class4.field80 != null) {
            class125 var1 = class4.field80;
            synchronized (class4.field80) {
                class4.field80 = null;
            }
        }
        if (arg0) {
            method245(null, 1);
        }
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(I)Lo;")
    public final class126 method111(int arg0) {
        field639++;
        if (arg0 < 8) {
            method244(-59, 91);
        }
        return class3.method19(this.field642, true).method494(null, this.field652, false, 0);
    }
}
