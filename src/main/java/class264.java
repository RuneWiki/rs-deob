import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class264 extends InputStream {

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Z")
    public static volatile boolean field3703 = true;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "F")
    public static float field3699;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "[I")
    public static int[] field3700;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1700(int arg0, boolean arg1) {
        field3696++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (!arg1) {
            field3703 = true;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class168.field2266.method2705((byte) 69, class257.field3556) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class444.field6676.method2705((byte) 69, class257.field3556) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!es", name = "read", descriptor = "()I")
    public final int read() {
        class388.method2433(30000L, 116);
        field3702++;
        return -1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)[Lco;")
    public static final class77[] method1701(int arg0) {
        int var1 = -15 % ((3 - arg0) / 54);
        field3698++;
        return new class77[] { class476.field7072, class199.field2637, class511.field7498, class156.field2035, class351.field5406, class350.field5398 };
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field3700 = null;
        int var1 = -57 / ((5 - arg0) / 52);
    }
}
