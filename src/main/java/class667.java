import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class667 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9385 = new Rectangle[100];

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field9388 = 0;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[I")
    public static int[] field9390;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
    public static int[] field9391;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field9387;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Laga;")
    public class693 field9386;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public int[] field9384;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method3794(byte arg0) {
        field9385 = null;
        field9391 = null;
        field9390 = null;
        if (arg0 >= -53) {
            field9389 = 88;
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9385[var0] = new Rectangle();
        }
        field9389 = 0;
        field9390 = new int[50];
        field9391 = null;
    }
}
