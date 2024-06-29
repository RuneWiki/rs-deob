import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class389 extends RuntimeException {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Ljava/lang/String;")
    public String field5636;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5638;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field5637;

    static {
        new class305(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field5639 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZII)Z", line = 4)
    public static final boolean method2357(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field5639 = -21;
        }
        field5637++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lpe;ILpe;)V", line = 26)
    public static final void method2358(class435 arg0, int arg1, class435 arg2) {
        if (arg2.field6345 != null) {
            arg2.method2674(true);
        }
        if (arg1 != -1) {
            field5639 = -76;
        }
        field5635++;
        arg2.field6344 = arg0;
        arg2.field6345 = arg0.field6345;
        arg2.field6345.field6344 = arg2;
        arg2.field6344.field6345 = arg2;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 43)
    public class389(Throwable arg0, String arg1) {
        this.field5636 = arg1;
        this.field5638 = arg0;
    }
}
