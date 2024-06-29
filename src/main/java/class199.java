import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class199 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lqda;")
    public static class87 field2681 = new class87();

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field2682 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lqda;")
    public static class87 field2683;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2680;

    static {
        new class474("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field2683 = new class87();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lkea;Lkea;Loa;B)V", line = 5)
    public static final void method1265(class203 arg0, class203 arg1, class605 arg2, byte arg3) {
        field2680++;
        class327.field4720 = class644.method3663(arg1, 105, 0, class546.field7820);
        class280.field3903 = arg2.method329(class327.field4720, class372.method2393(arg0, class546.field7820, 0), true);
        if (arg3 <= -80) {
            class261.field3710 = class644.method3663(arg1, 41, 0, class201.field2692);
            class445.field6665 = arg2.method329(class261.field3710, class372.method2393(arg0, class201.field2692, 0), true);
            class281.field3921 = class644.method3663(arg1, 36, 0, class52.field548);
            class472.field6992 = arg2.method329(class281.field3921, class372.method2393(arg0, class52.field548, 0), true);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method1266(boolean arg0) {
        if (arg0) {
            class431.field6408 = class327.field4722;
            class435.field6449 = class492.field7164;
        } else {
            class431.field6408 = class326.field4699;
            class435.field6449 = class544.field7780;
        }
        class637.field9161 = class431.field6408.length;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 41)
    public static void method1267(boolean arg0) {
        if (!arg0) {
            method1266(true);
        }
        field2683 = null;
        field2681 = null;
        field2682 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/Object;II)[B", line = 53)
    public static final byte[] method1268(int arg0, Object arg1, int arg2, int arg3) {
        field2679++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class37.method202(var4, arg2, true, arg3);
        } else if (arg1 instanceof class67) {
            class67 var5 = (class67) arg1;
            return var5.method462(-65, arg3, arg2);
        } else if (arg0 == 2) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }
}
