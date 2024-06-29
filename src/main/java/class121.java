import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class121 extends class477 {

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lmq;")
    public class542 field1563;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Lcb;")
    public static class318 field1559 = new class318(38, 0);

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1564 = new Rectangle[100];

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "[I")
    public static int[] field1565;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method739(int arg0, String arg1) {
        if (arg0 != -28482) {
            method741(-7);
        }
        field1562++;
        if (class624.field8496 != null) {
            class389.method2326((byte) 118, class425.field5907);
            class213.field2774++;
            class253.field3491.method951((byte) -82, class500.method2820(arg0 + 28483, arg1));
            class253.field3491.method905(arg1, -4);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static void method740(boolean arg0) {
        field1565 = null;
        field1559 = null;
        field1564 = null;
        if (arg0) {
            method740(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lji;")
    public static final class31 method741(int arg0) {
        field1561++;
        try {
            if (arg0 < 46) {
                method741(25);
            }
            return (class31) Class.forName("jba").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lmq;)V")
    public class121(class542 arg0) {
        this.field1563 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method742(int arg0, int arg1) {
        class613.field8375 = arg1;
        int var2 = 71 % ((-arg0 - 49) / 55);
        class514.field7002 = 100;
        class235.field3067 = 3;
        class341.field5013 = -1;
        field1560++;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1564[var0] = new Rectangle();
        }
        field1565 = new int[4096];
        for (int var1 = 0; var1 < 4096; var1++) {
            field1565[var1] = class587.method3283(1375731712, var1);
        }
    }
}
