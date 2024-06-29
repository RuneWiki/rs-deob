import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class710 {

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "Lqk;")
    public static class148 field9909 = new class148(50, -1);

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "Ljf;")
    public static class640 field9911 = new class640(10, 4);

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "Ljf;")
    public static class640 field9912 = new class640(8, 3);

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "Low;")
    public static class747 field9913 = new class747("", 10);

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "Leaa;")
    public static class380 field9914 = new class380("WTI", 5);

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 7)
    public static void method3989(int arg0) {
        field9914 = null;
        field9911 = null;
        field9913 = null;
        if (arg0 < 35) {
            field9913 = null;
        }
        field9909 = null;
        field9912 = null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lha;ZLbd;)I", line = 22)
    public static final int method3990(class545 arg0, boolean arg1, class552 arg2) {
        if (arg1) {
            field9911 = null;
        }
        field9910++;
        if (arg2.field7800 != -1) {
            return arg2.field7800;
        }
        if (arg2.field7814 != -1) {
            class468 var3 = arg0.field7694.method91(arg2.field7814, -22805);
            if (!var3.field6389) {
                return var3.field6394;
            }
        }
        return arg2.field7803;
    }
}
