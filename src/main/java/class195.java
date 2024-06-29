import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class195 extends class338 {

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Ljava/lang/String;")
    public String field2632;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field2631 = 50;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "[I")
    public static int[] field2630 = new int[128];

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "[I")
    public static int[] field2633 = new int[50];

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2636 = "Connecting to update server";

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lup;")
    public static final class441 method1054(Canvas arg0, byte arg1) {
        if (arg1 >= -5) {
            return null;
        }
        field2629++;
        try {
            Class var2 = Class.forName("vb");
            class441 var3 = (class441) var2.getDeclaredConstructor().newInstance();
            var3.method478(arg0, 2);
            return var3;
        } catch (Throwable var5) {
            class87 var4 = new class87();
            var4.method478(arg0, 2);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field2633 = null;
        field2630 = null;
        if (arg0 > -3) {
            method1054((Canvas) null, (byte) 94);
        }
        field2636 = null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
    public static final void method1056(byte arg0) {
        field2635++;
        if (arg0 < 47) {
            field2631 = 89;
        }
        class389.field5560.method613(true);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class195() {
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class195(String arg0) {
        this.field2632 = arg0;
    }
}
