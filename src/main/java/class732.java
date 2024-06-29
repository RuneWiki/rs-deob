import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class732 {

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public int field10254 = 0;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "[I")
    public static int[] field10255 = new int[] { 7500, 500 };

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "Lgr;")
    public static class530 field10253 = new class530(83, -1);

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "[I")
    public static int[] field10260 = new int[8];

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field10259 = 0;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "Lgr;")
    public static class530 field10258 = new class530(28, 3);

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field10252;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field10256;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field10257;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field10251;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static void method4074(int arg0) {
        field10260 = null;
        field10253 = null;
        field10258 = null;
        field10251 = null;
        if (arg0 != 3) {
            field10255 = null;
        }
        field10255 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILsl;)V")
    private final void method4075(int arg0, int arg1, class479 arg2) {
        if (arg0 != 1) {
            field10255 = null;
        }
        if (arg1 == 5) {
            this.field10254 = arg2.method2882(-1);
        }
        field10250++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILsl;)V")
    public final void method4076(int arg0, class479 arg1) {
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                if (arg0 != 896) {
                    return;
                }
                field10256++;
                return;
            }
            this.method4075(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILla;BZI)V")
    public static final void method4077(int arg0, int arg1, int arg2, class423 arg3, byte arg4, boolean arg5, int arg6) {
        class174.field2446 = arg6;
        class590.field8395 = arg1;
        int var7 = 89 / ((arg4 - 33) / 55);
        field10257++;
        class683.field9697 = arg2;
        class445.field6358 = arg3;
        class11.field98 = null;
        class249.field3628 = 1;
        class179.field2476 = arg5;
        class342.field4704 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)I")
    public static final int method4078(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1748) {
            field10255 = null;
        }
        field10252++;
        if (arg0 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg1;
        int var5 = (arg3 & 0x7F) * var4 + ((arg0 & 0x7F) * arg1) >> 7;
        int var6 = (arg0 & 0x380) * arg1 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg3 & 0xFC00) * var4 + ((arg0 & 0xFC00) * arg1) >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }
}
