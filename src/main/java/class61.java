import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class61 extends class381 {

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field918 = 1338;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Lcu;")
    public static class206 field920 = new class206(83, 4);

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Ldb;")
    public static class298 field921 = new class298(100, 12);

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 11)
    public static void method494(int arg0) {
        field920 = null;
        if (arg0 < 126) {
            method494(54);
        }
        field921 = null;
    }
}
