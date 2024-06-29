import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class123 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Leh;")
    private static class47 field2485 = class195.method1282((byte) -4, "Cancel");

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Leh;")
    public static class47 field2487 = field2485;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Leh;")
    private static class47 field2481 = class195.method1282((byte) -4, "flash2:");

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Leh;")
    public static class47 field2480 = field2481;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Leh;")
    public static class47 field2491 = field2481;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Ldb;")
    public static class32 field2489;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[[[B")
    public static byte[][][] field2488;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2487 = null;
        field2491 = null;
        field2485 = null;
        field2480 = null;
        if (arg0 != 1) {
            method944(29, 109);
        }
        field2488 = null;
        field2481 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIII)I")
    public static final int method942(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == -43) {
            int var4 = 256 - arg2;
            field2490++;
            return ((arg1 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg2 & 0xFF0000) + ((arg1 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)Lke;")
    public static final class95 method943(boolean arg0, int arg1) {
        field2482++;
        class95 var2 = (class95) class167.field3259.method986((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field512.method67(14, -1, arg1);
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method754((byte) -32, new class68(var3));
        }
        if (!arg0) {
            method942((byte) 8, 30, 84, -74);
        }
        class167.field3259.method987((long) arg1, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
    public static final boolean method944(int arg0, int arg1) {
        field2483++;
        int var2 = 18 % ((arg0 + 80) / 42);
        return (arg1 >> 30 & 0x1) != 0;
    }
}
