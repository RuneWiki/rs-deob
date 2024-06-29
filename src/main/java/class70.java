import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class70 {

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lkca;")
    public static class73 field750 = new class73(6, 3);

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
    public static int[] field751 = new int[256];

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field752;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field751[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 4)
    public static final void method467(int arg0) {
        if (arg0 >= -50) {
            field751 = null;
        }
        class82.field925 = -1;
        class50.field531 = -1;
        class17.field172 = 0;
        field749++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 21)
    public static void method468(byte arg0) {
        if (arg0 != 48) {
            method467(103);
        }
        field750 = null;
        field751 = null;
    }
}
