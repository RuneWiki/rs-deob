import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class725 extends class766 {

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public int field10098;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "Lsv;")
    public static class570 field10097 = new class570(55, 7);

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "Laq;")
    public static class494 field10099 = new class494(260);

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "Lgga;")
    public static class513 field10100;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public static void method4022(boolean arg0) {
        field10097 = null;
        field10099 = null;
        if (arg0) {
            field10100 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
    public class725() {
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(I)V")
    public class725(int arg0) {
        this.field10098 = arg0;
    }
}
