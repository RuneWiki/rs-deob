import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class272 {

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "Lmw;")
    public static class687 field3571 = new class687();

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "Leaa;")
    public static class401 field3575;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z", line = 9)
    public static final boolean method1692(byte arg0) {
        field3573++;
        if (arg0 < 115) {
            return false;
        }
        try {
            return class389.method2241(-1);
        } catch (IOException var4) {
            class638.method3447((byte) 67);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class563.field7155 == null ? -1 : class563.field7155.method1402(87)) + "," + (class780.field10647 == null ? -1 : class780.field10647.method1402(-95)) + "," + (class721.field9476 == null ? -1 : class721.field9476.method1402(-89)) + " - " + class199.field2766 + "," + (class714.field9407 + class422.field5564.field4767[0]) + "," + (class422.field5564.field4758[0] + class240.field3293) + " - ";
            for (int var3 = 0; class199.field2766 > var3 && var3 < 50; var3++) {
                var2 = var2 + class356.field4337.field3193[var3] + ",";
            }
            class416.method2401(1, var5, var2);
            class480.method2697((byte) 113, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "(B)V", line = 49)
    public static void method1693(byte arg0) {
        field3575 = null;
        field3571 = null;
        if (arg0 >= -113) {
            method1693((byte) 76);
        }
    }
}
