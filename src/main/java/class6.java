import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public static int[] field129 = new int[256];

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljv;")
    public static class55 field130;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method41(int arg0) {
        field129 = null;
        field130 = null;
        if (arg0 > -4) {
            method41(20);
        }
    }

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
            field129[var0] = var1;
        }
        field131 = 0;
        field130 = new class55(4);
        field132 = -1;
    }
}
