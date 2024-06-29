import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Ltd;")
    public static class136 field2086 = class145.method1172("(Z", 45);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ltd;")
    private static class136 field2089 = class145.method1172("You have only just left another world)3", 45);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ltd;")
    public static class136 field2079 = field2089;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Ltd;")
    public static class136 field2094 = class145.method1172("Lade Titelbild )2 ", 45);

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Ltd;")
    public static class136 field2092 = class145.method1172("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 45);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lc;")
    public static class15 field2088 = new class15(32);

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ltd;")
    private static class136 field2095 = class145.method1172("Please use a different world)3", 45);

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Ltd;")
    public static class136 field2096 = field2095;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ltd;")
    public static class136 field2098 = field2095;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ltd;")
    private static class136 field2099 = class145.method1172("This computers address has been blocked", 45);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Ltd;")
    public static class136 field2097 = field2099;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "J")
    public long field2090;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lp;")
    public static class104 field2080;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lme;")
    public class88 field2085;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lme;")
    public class88 field2087;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[Lbb;")
    public static class10[] field2084;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[[B")
    public static byte[][] field2091;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method672(int arg0) {
        field2082++;
        class142.field3301.method1165((byte) -73);
        if (arg0 != 32) {
            method672(92);
        }
        class155.field3569.method1165((byte) -73);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static void method673(boolean arg0) {
        field2088 = null;
        field2096 = null;
        field2098 = null;
        field2092 = null;
        field2079 = null;
        field2084 = null;
        if (!arg0) {
            return;
        }
        field2095 = null;
        field2091 = null;
        field2097 = null;
        field2089 = null;
        field2094 = null;
        field2099 = null;
        field2080 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method674(int arg0) {
        field2081++;
        if (this.field2087 == null) {
            return;
        }
        this.field2087.field2085 = this.field2085;
        this.field2085.field2087 = this.field2087;
        this.field2087 = null;
        this.field2085 = null;
        if (arg0 != 32) {
            method672(115);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Z")
    public final boolean method675(byte arg0) {
        field2083++;
        if (this.field2087 == null) {
            return false;
        } else {
            int var2 = 48 % ((arg0 - 65) / 47);
            return true;
        }
    }
}
