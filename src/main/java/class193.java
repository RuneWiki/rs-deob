import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class193 extends class89 {

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
    public static int[] field3520 = new int[50];

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field3521 = -1;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Loj;")
    public static class17 field3522 = new class17(64);

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Z")
    public static boolean field3523 = false;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method1409(int arg0) {
        field3522 = null;
        field3520 = null;
        if (arg0 != 64) {
            field3523 = false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)I")
    public static final int method1410(byte arg0, int arg1, int arg2) {
        field3519++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (class77.field1446 != null && class77.field1446.field2641 == var3) {
            int var5 = -72 % ((arg0 - 87) / 37);
            return class85.field1606.field1541 * 99 / (class85.field1606.field1562.length - class77.field1446.field767) + 1;
        } else {
            return 0;
        }
    }
}
