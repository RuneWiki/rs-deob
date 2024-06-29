import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class236 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lhj;")
    public static class69 field4288 = class181.method1318("<col=ffffff>", (byte) -114);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lhj;")
    private static class69 field4295 = class181.method1318("flash1:", (byte) -107);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field4289 = new int[5];

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lhj;")
    public static class69 field4292 = field4295;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4296 = -1;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static volatile int field4293 = -1;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lhj;")
    public static class69 field4297 = field4295;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1668(int arg0) {
        field4292 = null;
        field4297 = null;
        field4295 = null;
        field4289 = null;
        if (arg0 == 15917) {
            field4288 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
    public static final void method1669(int arg0, byte arg1) {
        for (class3 var2 = (class3) class162.field2998.method768((byte) 74); var2 != null; var2 = (class3) class162.field2998.method760(-15725)) {
            if ((var2.field1685 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method632(-8296);
            }
        }
        field4290++;
        if (arg1 != -27) {
            field4297 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static final void method1670(int arg0) {
        if (arg0 != -3373) {
            return;
        }
        for (int var1 = 0; var1 < class46.field659; var1++) {
            int var2 = class245.field4490[var1];
            class38 var3 = class131.field2428[var2];
            if (var3 != null) {
                class26.method150((byte) -121, var3.field517.field3359, var3);
            }
        }
        field4291++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIII)V")
    public static final void method1671(byte arg0, int arg1, int arg2, int arg3) {
        field4294++;
        class69 var4 = class9.method42(47, new class69[] { class132.field2443, class98.method727(-229, arg1), class215.field3894, class98.method727(-229, arg3 >> 6), class215.field3894, class98.method727(-229, arg2 >> 6), class215.field3894, class98.method727(-229, arg3 & 0x3F), class215.field3894, class98.method727(-229, arg2 & 0x3F) });
        var4.method455(-128);
        class71.method505(27, var4);
        int var5 = 14 / ((-arg0 - 59) / 32);
    }
}
