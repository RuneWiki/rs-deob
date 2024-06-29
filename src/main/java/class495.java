import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class495 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lcm;")
    public static class449 field7236 = new class449(48, -1);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lsi;")
    public static class512 field7239 = new class512(2, 14);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field7235;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lmq;")
    public class54 field7237;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "[I")
    public int[] field7238;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILns;)V", line = 4)
    public static final void method2943(int arg0, class438 arg1) {
        if (arg0 < 94) {
            method2943(-38, null);
        }
        field7234++;
        class331.field5126 = 0;
        class169.field2458 = 0;
        class13.field215 = new class380();
        class433.field6419 = new class60[1024];
        class86.method556(arg1, 3);
        class70.method479(arg1, -59);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 30)
    public static void method2944(int arg0) {
        field7239 = null;
        field7236 = null;
        int var1 = 42 / ((3 - arg0) / 56);
    }
}
