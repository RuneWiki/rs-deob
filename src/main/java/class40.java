import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class40 {

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Lgi;")
    private class583 field799;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "J")
    public long field796;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Lmc;")
    public static class114 field804;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "Ldj;")
    public static class288 field800;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "Lpu;")
    public static class483 field798;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IBI)V")
    public static final void method412(int arg0, byte arg1, int arg2) {
        field801++;
        class314 var3 = class483.method2819(7, arg0, 21303);
        var3.method1959(19793);
        if (arg1 <= -84) {
            var3.field4227 = arg2;
        }
    }

    @OriginalMember(owner = "client!sca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field802++;
        this.field799.method3363(-8, this.field796);
        super.finalize();
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lgi;JI)V")
    public class40(class583 arg0, long arg1, int arg2) {
        this.field799 = arg0;
        this.field796 = arg1;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field803++;
        int var1 = 0;
        if (arg0 == -101) {
            while (var1 < 100) {
                class48.field940[var1] = true;
                var1++;
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V")
    public static void method414(byte arg0) {
        field800 = null;
        field804 = null;
        int var1 = 10 % ((88 - arg0) / 35);
        field798 = null;
    }
}
