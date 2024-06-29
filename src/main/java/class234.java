import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class234 extends class71 {

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "Lwq;")
    public class679 field3471;

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "Ljn;")
    public static class324 field3472 = new class324(6, 0, 4, 2);

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "Lst;")
    public static class335 field3475 = new class335(67, 8);

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "[Luq;")
    public static class318[] field3474;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)Lsw;")
    public static final class606 method1561(int arg0) {
        int var1 = 76 / ((arg0 - 72) / 54);
        field3473++;
        try {
            return (class606) Class.forName("cga").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lwq;)V")
    public class234(class679 arg0) {
        this.field3471 = arg0;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
    public static void method1562(int arg0) {
        field3472 = null;
        if (arg0 != 6) {
            method1561(17);
        }
        field3474 = null;
        field3475 = null;
    }
}
