import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JLTMYUOM")
public class class24 {

    @OriginalMember(owner = "JLTMYUOM", name = "b", descriptor = "I")
    private int field865 = -17619;

    @OriginalMember(owner = "JLTMYUOM", name = "e", descriptor = "LLMGYBGQR;")
    private class30 field868 = new class30();

    @OriginalMember(owner = "JLTMYUOM", name = "i", descriptor = "LRKSMLTCN;")
    private class52 field872 = new class52(42993);

    @OriginalMember(owner = "JLTMYUOM", name = "f", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "JLTMYUOM", name = "g", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "JLTMYUOM", name = "h", descriptor = "LDKRLEWQI;")
    private class11 field871;

    @OriginalMember(owner = "JLTMYUOM", name = "a", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "JLTMYUOM", name = "c", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "JLTMYUOM", name = "d", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "JLTMYUOM", name = "<init>", descriptor = "(ZI)V")
    public class24(boolean arg0, int arg1) {
        this.field869 = arg1;
        this.field870 = arg1;
        if (!arg0) {
            this.field865 = -222;
        }
        this.field871 = new class11(false, 1024);
    }

    @OriginalMember(owner = "JLTMYUOM", name = "a", descriptor = "(J)LLMGYBGQR;")
    public class30 method297(long arg0) {
        class30 var3 = (class30) this.field871.method168(arg0);
        if (var3 == null) {
            this.field866++;
        } else {
            this.field872.method405(var3);
            this.field867++;
        }
        return var3;
    }

    @OriginalMember(owner = "JLTMYUOM", name = "a", descriptor = "(IJLLMGYBGQR;)V")
    public void method298(int arg0, long arg1, class30 arg2) {
        if (this.field870 == 0) {
            class30 var5 = this.field872.method406();
            var5.method396();
            var5.method357();
            if (this.field868 == var5) {
                class30 var6 = this.field872.method406();
                var6.method396();
                var6.method357();
            }
        } else {
            this.field870--;
        }
        this.field871.method169(0, arg1, arg2);
        while (arg0 >= 0) {
            this.field864 = -379;
        }
        this.field872.method405(arg2);
        if (class47.field1218) {
        }
    }

    @OriginalMember(owner = "JLTMYUOM", name = "a", descriptor = "()V")
    public void method299() {
        while (true) {
            class30 var1 = this.field872.method406();
            if (var1 == null) {
                this.field870 = this.field869;
                return;
            }
            var1.method396();
            var1.method357();
        }
    }
}
