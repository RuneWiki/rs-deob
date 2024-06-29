import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class710 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Low;")
    private class665 field9927;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lrl;")
    public static class713 field9929 = new class713();

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lin;")
    public static class380 field9931;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lit;")
    private class766 field9926;

    static {
        new class307("", 73);
        field9931 = new class380(117, 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lit;", line = 12)
    public final class766 method3957(int arg0) {
        field9928++;
        class766 var2 = this.field9926;
        if (this.field9927.field9375 == var2) {
            this.field9926 = null;
            return null;
        } else {
            this.field9926 = var2.field10591;
            return arg0 > -105 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lit;", line = 33)
    public final class766 method3958(int arg0) {
        field9930++;
        class766 var2 = this.field9927.field9375.field10591;
        if (arg0 <= 20) {
            return null;
        } else if (this.field9927.field9375 == var2) {
            this.field9926 = null;
            return null;
        } else {
            this.field9926 = var2.field10591;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILow;)V", line = 64)
    public final void method3959(int arg0, class665 arg1) {
        if (arg0 != 117) {
            field9931 = null;
        }
        this.field9927 = arg1;
        field9925++;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 81)
    public static void method3960(int arg0) {
        field9931 = null;
        field9929 = null;
        if (arg0 != 117) {
            method3960(-38);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 91)
    public class710() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Low;)V", line = 93)
    public class710(class665 arg0) {
        this.field9927 = arg0;
    }
}
