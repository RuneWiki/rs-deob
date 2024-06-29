import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class24 extends class117 {

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field384 = 1;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "Loj;")
    public static class17 field388 = new class17(64);

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Lhh;")
    public static class163 field390 = class137.method1065(" <col=00ff80>", 17);

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "[[S")
    public static short[][] field391;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            this.method61(88, 123);
        }
        field385++;
        return class26.field402;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static void method158(int arg0) {
        field390 = null;
        if (arg0 != 64) {
            method158(-42);
        }
        field388 = null;
        field391 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLqh;)Z")
    public static final boolean method159(boolean arg0, class69 arg1) {
        if (!arg0) {
            field389 = -110;
        }
        field387++;
        if (arg1.field1164 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field1164.length; var2++) {
            int var3 = class239.method1656(-23835, arg1, var2);
            int var4 = arg1.field1313[var2];
            if (arg1.field1164[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field1164[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field1164[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }
}
