import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 extends class439 {

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "S")
    public short field2075;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2070 = -1;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "J")
    public static long field2073 = 0L;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2072 = new Rectangle[100];

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public static boolean field2071;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2072 = null;
        if (arg0 != -25034) {
            method991(67);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)I")
    public static final int method992(byte arg0) {
        if (arg0 != 111) {
            field2070 = 61;
        }
        field2074++;
        if ((double) class2.field22 == 3.0D) {
            return 37;
        } else if ((double) class2.field22 == 4.0D) {
            return 50;
        } else if ((double) class2.field22 == 6.0D) {
            return 75;
        } else if ((double) class2.field22 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class135() {
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(S)V")
    public class135(short arg0) {
        this.field2075 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2072[var0] = new Rectangle();
        }
    }
}
