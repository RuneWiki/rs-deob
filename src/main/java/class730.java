import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class730 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "J")
    public static long field10241 = 0L;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lri;")
    public static class342 field10242 = new class342();

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Z")
    public static boolean field10246 = false;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field10243;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "[[B")
    public static byte[][] field10245;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method4051(int arg0) {
        if (arg0 == 23734) {
            field10245 = null;
            field10242 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I")
    public static final int method4052(int arg0, int arg1) {
        field10243++;
        int var2 = 0;
        int var3 = 28 / ((44 - arg1) / 45);
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }
}
