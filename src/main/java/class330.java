import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class330 extends class499 {

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Luf;")
    public static class310 field4497 = new class310(7, 2);

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Lfg;")
    public static class83 field4498 = new class83("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
    public static int[] field4499 = new int[14];

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lof;")
    public static class438 field4500 = new class438("WTRC", 1);

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 5)
    public static void method1835(int arg0) {
        field4498 = null;
        if (arg0 != 1) {
            method1836(-126, 66, 40, -26);
        }
        field4499 = null;
        field4500 = null;
        field4497 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 17)
    public class330() {
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z", line = 23)
    public static final boolean method1836(int arg0, int arg1, int arg2, int arg3) {
        if (class140.method906(arg0, arg1, arg2)) {
            int var4 = arg1 << class34.field484;
            int var5 = arg2 << class34.field484;
            return class102.method679(var4 + 1, class383.field5391[arg0].method221(arg1, arg2) + arg3, var5 + 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1 + 1, arg2) + arg3, var5 + 1) && class102.method679(class234.field3248 + var4 - 1, class383.field5391[arg0].method221(arg1 + 1, arg2 + 1) + arg3, class234.field3248 + var5 - 1) && class102.method679(var4 + 1, class383.field5391[arg0].method221(arg1, arg2 + 1) + arg3, class234.field3248 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V", line = 35)
    public class330(int arg0) {
        this.field4495 = arg0;
    }
}
