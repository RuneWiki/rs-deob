import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class280 extends class281 {

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field4948;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "[I")
    public static int[] field4952 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "Lli;")
    public static class185 field4957 = class245.method1649(" de votre liste d(Wamis)3", -88);

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field4961 = 0;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "Lli;")
    public static class185 field4962 = class245.method1649("Chargement de l(W-Bcran)2titre )2 ", -115);

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "Lae;")
    public static class238 field4959 = new class238(128);

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
    public static int field4965 = 127;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "Lli;")
    public static class185 field4964 = class245.method1649("Lade Schrifts-=tze )2 ", -40);

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lhi;")
    public static class250 field4963;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public static void method1912(int arg0) {
        if (arg0 != 2) {
            method1915(28);
        }
        field4952 = null;
        field4962 = null;
        field4959 = null;
        field4963 = null;
        field4957 = null;
        field4964 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)I")
    public static final int method1913(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4958++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg0 <= 85) {
                method1915(74);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class280(Object arg0) {
        this.field4948 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1471(boolean arg0) {
        field4954++;
        return arg0 ? null : this.field4948;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lhi;Lhi;I)V")
    public static final void method1914(class250 arg0, class250 arg1, int arg2) {
        if (arg2 != 0) {
            field4952 = null;
        }
        field4949++;
        class15.field254 = arg0;
        class44.field684 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)Z")
    public static final boolean method1915(int arg0) {
        field4951++;
        if (arg0 != 7) {
            method1913(-20, -88, -110, -64);
        }
        class127 var1 = class241.field4308;
        synchronized (class241.field4308) {
            if (class166.field3097 == class14.field243) {
                return false;
            } else {
                class171.field3144 = class149.field2817[class14.field243];
                class260.field4630 = class82.field1478[class14.field243];
                class14.field243 = class14.field243 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(Z)Z")
    public final boolean method1472(boolean arg0) {
        if (arg0) {
            field4963 = null;
        }
        field4960++;
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIII)I")
    public static final int method1916(int arg0, int arg1, int arg2, int arg3) {
        field4955++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg3 == -21942) {
            return var4 == 2 ? 7 - arg1 : -arg2 + 7;
        } else {
            return 103;
        }
    }
}
