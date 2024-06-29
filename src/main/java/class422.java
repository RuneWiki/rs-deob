import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class422 extends class328 {

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field5938;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Llj;")
    private class565 field5934;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    private int field5933;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    private int field5941;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    private int field5932;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    private int field5937;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    private int field5944;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "[J")
    public static long[] field5939 = new long[256];

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5942 = -2;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "Lor;")
    public static class594 field5945;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Lem;")
    public static class206 field5946;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "B")
    public static byte field5935;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "Lhda;")
    private class696 field5936;

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
            field5939[var0] = var1;
        }
        field5945 = new class594();
        field5946 = new class206(28, 5);
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)Lhda;", line = 4)
    public final class696 method988(int arg0) {
        field5940++;
        if (this.field5936 == null) {
            class212 var2 = this.field5934.field2418;
            class176.field2534[5] = this.field5938;
            class176.field2534[3] = this.field5937;
            class176.field2534[1] = this.field5933;
            class176.field2534[0] = this.field5944;
            class176.field2534[2] = this.field5941;
            class176.field2534[4] = this.field5932;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1367(class176.field2534[var5], false)) {
                    return null;
                }
                class686 var7 = var2.method1365(-17951, class176.field2534[var5]);
                int var8 = var7.field9795 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field9780 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class155.field2273[var6] = var2.method1366(false, class176.field2534[var6], var4, 1.0F, var4, (byte) -99);
            }
            this.field5936 = new class696(this.field5934, 6407, var4, var3 != 0, class155.field2273);
        }
        if (arg0 != 11) {
            this.field5944 = -30;
        }
        return this.field5936;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 70)
    public static void method2442(byte arg0) {
        int var1 = 97 % ((arg0 + 9) / 62);
        field5939 = null;
        field5946 = null;
        field5945 = null;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Llj;IIIIII)V", line = 89)
    public class422(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5938 = arg6;
        this.field5934 = arg0;
        this.field5933 = arg2;
        this.field5941 = arg3;
        this.field5932 = arg5;
        this.field5937 = arg4;
        this.field5944 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V", line = 103)
    public static final void method2443(int arg0, int arg1) {
        field5943++;
        class51 var2 = class703.method3938(-1989279584, arg1, 8);
        var2.method404(65);
        if (arg0 != -7) {
            method2442((byte) -21);
        }
    }
}
