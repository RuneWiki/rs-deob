import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class583 extends class656 {

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field7634;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field7640;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lwd;")
    public class276 field7637;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lkaa;")
    public class47 field7636;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field7638;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method3185(int arg0) {
        field7633++;
        if (arg0 != 17024) {
            this.method3185(44);
        }
        if (class565.field7440 < class604.field7934.length) {
            class604.field7934[class565.field7440++] = this;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static final void method3186(int arg0) {
        if (arg0 == 4270) {
            class37.field526 = new class2();
            field7635++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILfa;)I")
    public static final int method3187(int arg0, class236 arg1) {
        field7639++;
        if (arg0 != -28046) {
            field7638 = null;
        }
        String var2 = class417.method2421(arg1, true);
        return class105.field1446.method3004(215, var2, class657.field8682);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public static void method3188(int arg0) {
        if (arg0 == -15098) {
            field7638 = null;
        }
    }
}
