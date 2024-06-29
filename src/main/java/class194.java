import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class194 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
    public static int[] field2345 = new int[1024];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
    public static int[] field2351 = new int[2];

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lcea;")
    public static class180 field2350 = new class180("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2354 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Z")
    public static boolean field2353 = false;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "F")
    public static float field2347;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Loda;")
    public static class98 field2355;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[Lmu;")
    public static class249[] field2349;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 5)
    public static void method1056(int arg0) {
        field2355 = null;
        field2350 = null;
        field2345 = null;
        field2349 = null;
        field2351 = null;
        if (arg0 != -16250) {
            method1058(-101, 17, 71, -8, -58);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)Z", line = 21)
    public static final boolean method1057(boolean arg0, int arg1, int arg2) {
        field2346++;
        if (arg0) {
            field2354 = 105;
        }
        return (arg1 & 0x40000) != 0 | class566.method3304(arg2, arg1, -125) || class548.method3214(arg2, arg1, 45056);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2352++;
        float var5 = (float) class353.field4615 / (float) class353.field4623;
        int var6 = arg2;
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg4 - (arg1 - var7) / 2;
        int var9 = arg3 - (arg2 - var6) / 2;
        class34.field273 = class353.field4615 - class353.field4615 * var8 / var7;
        class43.field353 = arg0;
        class62.field619 = -1;
        class619.field8945 = class353.field4623 * var9 / var6;
        class182.method999((byte) 39);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZZ)V", line = 66)
    public static final void method1059(boolean arg0, boolean arg1) {
        if (!arg1) {
            field2350 = null;
        }
        field2348++;
        class198.method1069(class426.field5495, class185.field2239, arg0, class599.field8668, (byte) 103);
    }
}
