import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class191 extends class307 {

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "Loaa;")
    public static class305 field2934 = new class305();

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "Lfja;")
    public static class783 field2935 = new class783(113, 4);

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "[I")
    public static int[] field2937 = new int[16384];

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "[I")
    public static int[] field2936 = new int[16384];

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Lju;")
    public static class137 field2938;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "Lgj;")
    public static class662 field2931;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIF)V")
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field2934 = null;
        if (arg0 != 16384) {
            field2938 = null;
        }
        field2937 = null;
        field2938 = null;
        field2935 = null;
        field2931 = null;
        field2936 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BF)V")
    public final void method1398(byte arg0, float arg1) {
        if (arg0 > 103) {
            super.field4209 = arg1;
            ++field2933;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
    public final void method1399(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -27297) {
            field2934 = null;
        }
        super.field4197 = arg0;
        super.field4213 = arg3;
        ++field2932;
        super.field4200 = arg1;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field2937[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field2936[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field2938 = new class137(3, 7);
    }
}
