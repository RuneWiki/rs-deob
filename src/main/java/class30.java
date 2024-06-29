import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lob;")
    private class99 field771 = new class99();

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Laf;")
    private static class7 field768 = class48.method406(40, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Laf;")
    public static class7 field769 = field768;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Laf;")
    public static class7 field763 = class48.method406(40, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lgd;")
    public static class46 field766 = new class46(50);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lob;")
    public final class99 method254(byte arg0) {
        if (arg0 > -15) {
            return null;
        }
        field772++;
        class99 var2 = this.field771.field2356;
        if (this.field771 == var2) {
            return null;
        } else {
            var2.method818((byte) -127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILof;)Laf;")
    public static final class7 method255(int arg0, int arg1, class103 arg2) {
        field770++;
        if (!class32.method285(-87, class7.method98(26454, arg2), arg1) && arg2.field2531 == null) {
            return null;
        }
        if (arg0 > -96) {
            method255(-34, -115, null);
        }
        if (arg2.field2440 == null || arg1 >= arg2.field2440.length || arg2.field2440[arg1] == null || arg2.field2440[arg1].method71(119).method92(-96) == 0) {
            return class106.field2609 ? class116.method905(new class7[] { class127.field3054, class51.method421((byte) 116, arg1) }, 1) : null;
        } else {
            return arg2.field2440[arg1];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lob;B)V")
    public final void method256(class99 arg0, byte arg1) {
        if (arg0.field2347 != null) {
            arg0.method818((byte) -114);
        }
        arg0.field2347 = this.field771.field2347;
        arg0.field2356 = this.field771;
        field767++;
        arg0.field2347.field2356 = arg0;
        if (arg1 == -58) {
            arg0.field2356.field2347 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method257(int arg0) {
        field766 = null;
        field768 = null;
        if (arg0 == -1) {
            field769 = null;
            field763 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Lob;")
    public final class99 method258(boolean arg0) {
        field764++;
        class99 var2 = this.field771.field2356;
        if (!arg0) {
            field766 = null;
        }
        return this.field771 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lob;B)V")
    public final void method259(class99 arg0, byte arg1) {
        field773++;
        if (arg0.field2347 != null) {
            arg0.method818((byte) -123);
        }
        arg0.field2347 = this.field771;
        arg0.field2356 = this.field771.field2356;
        arg0.field2347.field2356 = arg0;
        if (arg1 != -4) {
            this.method258(true);
        }
        arg0.field2356.field2347 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class30() {
        this.field771.field2356 = this.field771;
        this.field771.field2347 = this.field771;
    }
}
