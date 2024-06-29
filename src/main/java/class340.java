import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class340 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lcba;")
    public static class471 field4578;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    public static int[] field4580;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
    public static boolean field4581;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[I")
    public static int[] field4584;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lua;")
    public static class572 field4583;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
    public static final boolean method2063(int arg0, int arg1) {
        field4579++;
        if (arg1 != 30645) {
            field4578 = null;
        }
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method2064(int arg0) {
        if (arg0 <= 59) {
            field4581 = false;
        }
        field4580 = null;
        field4584 = null;
        field4578 = null;
        field4583 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2065(int arg0, int arg1, byte[] arg2) {
        field4577++;
        byte[] var3 = new byte[arg1];
        class416.method2498(arg2, 0, var3, 0, arg1);
        if (arg0 != -2973) {
            method2064(86);
        }
        return var3;
    }

    static {
        new class104("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4578 = new class471(24, -2);
        field4580 = new int[14];
        field4581 = false;
        field4584 = new int[2];
    }
}
