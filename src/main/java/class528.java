import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class528 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Lhn;")
    private class509 field7744 = new class509(64);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lfo;")
    private class361 field7747;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lhn;")
    public static class509 field7748 = new class509(260);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method3131(byte arg0) {
        field7750++;
        class435 var1 = class69.field806.field2165.field6345;
        if (arg0 <= 56) {
            method3132(73, 10);
        }
        if (var1 == null || class69.field806.field2165 == var1) {
            return false;
        }
        class36 var2 = (class36) var1;
        if (var2.field361 >= 2000) {
            var2.field361 -= 2000;
        }
        return var2.field361 == 1012;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V", line = 34)
    public static final void method3132(int arg0, int arg1) {
        class220.field2973.method3036(arg0, (byte) -92);
        field7749++;
        if (arg1 != 0) {
            method3132(101, 112);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Let;", line = 49)
    public final class423 method3133(byte arg0, int arg1) {
        field7751++;
        class509 var3 = this.field7744;
        class423 var4;
        synchronized (this.field7744) {
            var4 = (class423) this.field7744.method3032(3589, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field7747;
        byte[] var6;
        synchronized (this.field7747) {
            var6 = this.field7747.method2130(19, arg1, -79);
        }
        class423 var7 = new class423();
        if (var6 != null) {
            var7.method2610(new class396(var6), 98);
        }
        if (arg0 <= 6) {
            this.field7744 = null;
        }
        class509 var8 = this.field7744;
        synchronized (this.field7744) {
            this.field7744.method3046((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 80)
    public static final void method3134(byte arg0) {
        field7745++;
        class477.method2910(3, false);
        if (class244.field3221 >= 0 && class244.field3221 != 0) {
            class142.method874(class244.field3221, (byte) -25);
            class244.field3221 = -1;
        }
        if (arg0 != 124) {
            field7748 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V", line = 99)
    public static void method3135(byte arg0) {
        field7748 = null;
        if (arg0 < 97) {
            method3134((byte) -41);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 116)
    public class528(class104 arg0, int arg1, class361 arg2) {
        this.field7747 = arg2;
        this.field7746 = this.field7747.method2136(-87, 19);
    }
}
