import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class129 extends class215 {

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Z")
    public static boolean field1721 = false;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[I")
    public static int[] field1722 = new int[5];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 9)
    public static void method837(int arg0) {
        if (arg0 != -1) {
            method837(109);
        }
        field1722 = null;
    }
}
