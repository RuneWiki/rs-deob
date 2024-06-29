import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class414 extends class86 {

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lum;")
    public class347 field6139 = new class347();

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[S")
    public static short[] field6138 = new short[] { 9, 8, 2, 44, 21, 10, 48, 47 };

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field6140 = 2;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public static void method2465(byte arg0) {
        field6138 = null;
        if (arg0 <= 40) {
            field6140 = 38;
        }
    }
}
