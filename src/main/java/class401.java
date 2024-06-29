import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class401 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lbd;")
    public static class464 field5595 = new class464(1, 6);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method2374(int arg0) {
        field5595 = null;
        int var1 = 51 / ((22 - arg0) / 54);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2375(String arg0, int arg1) {
        if (arg1 >= -27) {
            method2374(104);
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field5594++;
        System.exit(1);
    }
}
