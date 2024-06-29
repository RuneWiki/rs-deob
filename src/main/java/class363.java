import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class363 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5745 = 0;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5749 = null;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lfk;")
    public static class317 field5747 = new class317();

    @OriginalMember(owner = "client!q", name = "h", descriptor = "S")
    public static short field5750 = 1;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[S")
    public static short[] field5752 = new short[256];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Z")
    public static boolean field5751 = false;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lrn;")
    public static class18 field5748;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZI)V", line = 19)
    public static final void method2549(int arg0, boolean arg1, int arg2) {
        class329.field5058[arg2] = arg0;
        if (!arg1) {
            return;
        }
        field5746++;
        class315 var3 = (class315) class68.field1045.method370((byte) -120, (long) arg2);
        if (var3 == null) {
            class315 var4 = new class315(4611686018427387905L);
            class68.field1045.method375(var4, (long) arg2, -105);
        } else if (var3.field4868 != 4611686018427387905L) {
            var3.field4868 = class156.method1273((byte) -79) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 49)
    public static void method2550(int arg0) {
        field5752 = null;
        field5747 = null;
        field5748 = null;
        if (arg0 == 256) {
            field5749 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILrn;Lrn;Z)Lbi;", line = 66)
    public static final class145 method2551(int arg0, int arg1, class18 arg2, class18 arg3, boolean arg4) {
        field5743++;
        if (class282.method2056(arg1, 0, arg3, arg0)) {
            if (!arg4) {
                method2549(-93, true, -99);
            }
            return class164.method1308(arg2.method187(arg0, arg1, -1), !arg4);
        } else {
            return null;
        }
    }
}
