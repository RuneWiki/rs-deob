import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class628 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lor;")
    private class594 field8863;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Z")
    public static boolean field8864 = false;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lvg;")
    public static class49 field8861 = new class49(128, 4);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lu;")
    private class66 field8865;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Lu;", line = 3)
    public final class66 method3660(boolean arg0) {
        field8860++;
        class66 var2 = this.field8865;
        if (this.field8863.field8428 == var2) {
            this.field8865 = null;
            return null;
        }
        if (!arg0) {
            method3662(-71);
        }
        this.field8865 = var2.field848;
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 26)
    public static void method3661(int arg0) {
        if (arg0 != 8) {
            method3661(120);
        }
        field8861 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 42)
    public static final void method3662(int arg0) {
        field8859++;
        class597.field8466 = new class443(8);
        class57.field745 = arg0;
        for (class536 var1 = (class536) class364.field5737.method2754((byte) 125); var1 != null; var1 = (class536) class364.field5737.method2759(arg0 + 1486415172)) {
            var1.method3246();
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Lu;", line = 61)
    public final class66 method3663(int arg0) {
        field8862++;
        class66 var2 = this.field8863.field8428.field848;
        if (this.field8863.field8428 == var2) {
            this.field8865 = null;
            return null;
        }
        this.field8865 = var2.field848;
        if (arg0 != 4) {
            this.field8863 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLor;)V", line = 84)
    public final void method3664(byte arg0, class594 arg1) {
        field8866++;
        if (arg0 < 102) {
            method3661(-28);
        }
        this.field8863 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 101)
    public class628() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lor;)V", line = 103)
    public class628(class594 arg0) {
        this.field8863 = arg0;
    }
}
