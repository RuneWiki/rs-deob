import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class178 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lsb;")
    private static class98 field3080 = class47.method368(" is already on your ignore list)3", 0);

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lsb;")
    public static class98 field3091 = field3080;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[J")
    public static long[] field3085 = new long[256];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lsb;")
    public static class98 field3093;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[B")
    public byte[] field3081;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[B")
    public byte[] field3084;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field3093 = null;
        field3080 = null;
        field3091 = null;
        field3085 = null;
        if (arg0 >= -98) {
            field3085 = null;
        }
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
            field3085[var0] = var1;
        }
        field3093 = class47.method368(")1 ", 0);
    }
}
