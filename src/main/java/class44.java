import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class44 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lkb;")
    public static class93 field717 = class76.method390("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 0);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lkb;")
    public static class93 field724 = class76.method390("Untersuchen", 0);

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lkb;")
    public static class93 field725 = class76.method390("::errortest", 0);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lkb;")
    public static class93 field719 = class76.method390("mapscene", 0);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "J")
    public long field718;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lee;")
    public class44 field716;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lee;")
    public class44 field721;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLkb;)Z")
    public static final boolean method234(boolean arg0, class93 arg1) {
        field726++;
        if (arg1 == null) {
            return false;
        } else if (arg0) {
            for (int var2 = 0; var2 < class62.field991; var2++) {
                if (arg1.method523(114, class179.field3549[var2])) {
                    return true;
                }
            }
            return arg1.method523(114, class106.field1940.field550);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public final void method235(boolean arg0) {
        field723++;
        if (this.field721 == null) {
            return;
        }
        if (arg0) {
            method234(true, null);
        }
        this.field721.field716 = this.field716;
        this.field716.field721 = this.field721;
        this.field721 = null;
        this.field716 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)Z")
    public static final boolean method236(boolean arg0, int arg1) {
        field727++;
        if (arg0) {
            return false;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method237(int arg0) {
        field717 = null;
        field725 = null;
        field719 = null;
        if (arg0 == 65) {
            field724 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        field720++;
        if (this.field721 == null) {
            return false;
        } else {
            int var2 = 89 % ((-arg0 - 3) / 46);
            return true;
        }
    }
}
