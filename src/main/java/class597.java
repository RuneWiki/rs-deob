import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class597 {

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public int field8431;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "[J")
    public static long[] field8433 = new long[256];

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "Lwba;")
    public static class46 field8434;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Luq;")
    public static class146 field8436;

    @OriginalMember(owner = "client!lca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8432++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public static void method3373(int arg0) {
        field8433 = null;
        field8434 = null;
        if (arg0 != -2087747519) {
            field8433 = null;
        }
        field8436 = null;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(I)V")
    public class597(int arg0) {
        this.field8431 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8433[var0] = var1;
        }
        field8434 = new class46();
    }
}
