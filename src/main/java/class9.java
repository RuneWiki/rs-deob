import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class9 extends class35 {

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
    public static int[] field121 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 4)
    public static final String method59(int arg0, boolean arg1) {
        field118++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class422.field6142 + "</col>";
        } else if (arg1) {
            return "<col=00ff80>" + arg0 / 1000000 + class437.field6361 + "</col>";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldp;I)V", line = 31)
    public static final void method60(class174 arg0, int arg1) {
        if (arg1 != 1) {
            method60((class174) null, -46);
        }
        field120++;
        class234.field3394 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 43)
    public static final void method61(int arg0) {
        field119++;
        class391[] var1 = class282.field4226;
        synchronized (class282.field4226) {
            for (int var2 = arg0; var2 < class282.field4226.length; var2++) {
                class282.field4226[var2] = new class391();
                class148.field2284[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 61)
    public class9() {
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 66)
    public static void method62(int arg0) {
        if (arg0 == 2) {
            field121 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V", line = 75)
    public class9(int arg0) {
        this.field117 = arg0;
    }
}
