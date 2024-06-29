import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class304 extends class9 {

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "Z")
    public static boolean field3626 = false;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "Llja;")
    public static class744 field3624 = new class744(60, -1);

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "[I")
    public static int[] field3625;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 7)
    public static void method1761(int arg0) {
        field3624 = null;
        field3625 = null;
        if (arg0 < 3) {
            method1761(-123);
        }
    }
}
