import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class546 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Lwca;")
    public class634 field6862 = new class634();

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Luc;")
    public static class27 field6859 = new class27(7, 5);

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lcga;")
    public static class449 field6868 = new class449(57, 4);

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lcga;")
    public static class449 field6869 = new class449(82, 18);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lwca;")
    private class634 field6870;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 5)
    public static void method2922(byte arg0) {
        int var1 = 102 % ((-arg0 - 13) / 54);
        field6869 = null;
        field6868 = null;
        field6859 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lwca;", line = 19)
    public final class634 method2923(int arg0) {
        field6860++;
        class634 var2 = this.field6862.field8593;
        if (this.field6862 == var2) {
            this.field6870 = null;
            return null;
        }
        if (arg0 != 5) {
            field6869 = null;
        }
        this.field6870 = var2.field8593;
        return var2;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Luo;", line = 40)
    public static final class539 method2924(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7082;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILwca;)V", line = 49)
    public final void method2925(int arg0, class634 arg1) {
        if (arg1.field8591 != null) {
            arg1.method3554(15);
        }
        int var3 = -71 / ((arg0 - 32) / 49);
        field6863++;
        arg1.field8591 = this.field6862.field8591;
        arg1.field8593 = this.field6862;
        arg1.field8591.field8593 = arg1;
        arg1.field8593.field8591 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)Lfc;", line = 65)
    public static final class243 method2926(int arg0, int arg1, boolean arg2) {
        field6864++;
        class243 var3 = (class243) class80.field1036.method3828((long) arg0 | (long) arg1 << 32, (byte) -91);
        if (!arg2) {
            method2924(-63, 10, 117);
        }
        if (var3 == null) {
            var3 = new class243(arg1, arg0);
            class80.field1036.method3832(var3, var3.field3321, 44);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lwca;", line = 84)
    public final class634 method2927(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field6866++;
        class634 var2 = this.field6870;
        if (this.field6862 == var2) {
            this.field6870 = null;
            return null;
        } else {
            this.field6870 = var2.field8593;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 115)
    public final void method2928(int arg0) {
        int var2 = 26 / ((arg0 - 73) / 43);
        field6865++;
        while (true) {
            class634 var3 = this.field6862.field8593;
            if (this.field6862 == var3) {
                this.field6870 = null;
                return;
            }
            var3.method3554(15);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)I", line = 140)
    public final int method2929(byte arg0) {
        field6861++;
        int var2 = 0;
        if (arg0 == 95) {
            for (class634 var3 = this.field6862.field8593; var3 != this.field6862; var3 = var3.field8593) {
                var2++;
            }
            return var2;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 174)
    public class546() {
        this.field6862.field8593 = this.field6862;
        this.field6862.field8591 = this.field6862;
    }
}
