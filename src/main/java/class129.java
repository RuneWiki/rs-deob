import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class129 extends class83 {

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2259 = new CRC32();

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[I")
    public static int[] field2265 = new int[256];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[Lgk;")
    public static class259[] field2266 = new class259[14];

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "J")
    public static long field2269 = 0L;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[I")
    public static int[] field2263 = new int[25];

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "J")
    public long field2267;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lwj;")
    public class129 field2258;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Lwj;")
    public class129 field2261;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[I")
    public static int[] field2264;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method886(int arg0) {
        if (arg0 <= 7) {
            field2263 = null;
        }
        field2264 = null;
        field2266 = null;
        field2263 = null;
        field2259 = null;
        field2265 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public final void method887(byte arg0) {
        field2270++;
        if (this.field2258 == null) {
            return;
        }
        if (arg0 != -51) {
            this.method887((byte) 83);
        }
        this.field2258.field2261 = this.field2261;
        this.field2261.field2258 = this.field2258;
        this.field2261 = null;
        this.field2258 = null;
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
            field2265[var0] = var1;
        }
    }
}
