import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class237 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lda;")
    private static class275 field4118 = class255.method1672(127, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    public static int[] field4121 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lda;")
    public static class275 field4123 = field4118;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lda;")
    public static class275 field4117 = class255.method1672(125, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lda;")
    public static class275 field4124 = class255.method1672(124, "Ablegen");

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[Lwb;")
    public static class179[] field4126;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILij;)Lbf;")
    public static final class26 method1537(int arg0, class85 arg1) {
        if (arg0 == 0) {
            field4122++;
            return new class26(arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method598(117), arg1.method598(82), arg1.method564((byte) 77));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method1538(byte arg0) {
        field4124 = null;
        field4126 = null;
        field4123 = null;
        field4121 = null;
        field4117 = null;
        field4118 = null;
        if (arg0 < 58) {
            field4118 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)I")
    public static final int method1539(byte arg0) {
        if (arg0 >= -42) {
            method1538((byte) 52);
        }
        field4119++;
        return class102.field1705;
    }
}
