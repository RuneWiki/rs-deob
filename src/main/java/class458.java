import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class458 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lul;")
    private class406 field6668;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field6663 = -1;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
    public static int[] field6662 = new int[4096];

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "[I")
    public static int[] field6667 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lul;")
    public static class406 field6666;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field6661;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field6665;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 15)
    public static void method2777(byte arg0) {
        field6662 = null;
        field6667 = null;
        field6661 = null;
        field6665 = null;
        field6666 = null;
        if (arg0 <= 124) {
            field6665 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lee;ILul;)V", line = 46)
    public class458(class480 arg0, int arg1, class406 arg2) {
        new class13(64);
        this.field6668 = arg2;
        this.field6664 = this.field6668.method2551(15, -26070);
    }
}
