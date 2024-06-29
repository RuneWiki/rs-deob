import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class507 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[J")
    public static long[] field7528 = new long[256];

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "F")
    public static float field7530;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lvh;")
    public static class125 field7529;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lvh;")
    public static class125 field7531;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field7527;

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
            field7528[var0] = var1;
        }
        field7530 = 1.0F;
        field7529 = new class125(19, 4);
        field7532 = -1;
        field7531 = new class125(83, 4);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 4)
    public static void method3021(byte arg0) {
        field7528 = null;
        field7529 = null;
        if (arg0 != 105) {
            method3022(104, 78, 106, false);
        }
        field7531 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIZ)Lph;", line = 20)
    public static final class699 method3022(int arg0, int arg1, int arg2, boolean arg3) {
        field7527++;
        class699 var4 = null;
        if (arg2 == 0) {
            class128.field2089++;
            var4 = class452.method2630(class699.field9897, class69.field1087, (byte) 124);
        }
        if (arg2 == 1) {
            class396.field5731++;
            var4 = class452.method2630(class699.field9897, class309.field4292, (byte) 123);
        }
        var4.field9908.method2752((byte) -1, class236.field3494.method668(-113, 82) ? 1 : 0);
        var4.field9908.method2702((byte) 28, class143.field2474 + arg1);
        var4.field9908.method2700(arg0 + class63.field917, 0);
        class153.field2547 = arg3;
        class202.field3126 = arg0;
        class400.field5777 = arg1;
        class74.method600(18);
        return var4;
    }
}
