import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class230 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
    public static boolean field3183 = false;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lve;")
    public static class331 field3185 = new class331(5000);

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lrg;")
    public static class395 field3182;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I", line = 7)
    public static final int method1271(int arg0, int arg1) {
        if (arg1 != 16384) {
            method1273(105, (class256) null);
        }
        field3187++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BZI)Lrb;", line = 20)
    public static final class458 method1272(byte arg0, boolean arg1, int arg2) {
        field3184++;
        if (arg0 > -126) {
            method1273(115, (class256) null);
        }
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        return (class458) class269.field3856.method233(83, var3);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILab;)Lab;", line = 39)
    public static final class256 method1273(int arg0, class256 arg1) {
        field3186++;
        class256 var2 = client.method1673(arg1);
        if (var2 == null) {
            var2 = arg1.field3657;
        }
        return arg0 <= 60 ? null : var2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 61)
    public static void method1274(int arg0) {
        if (arg0 == 14490) {
            field3185 = null;
            field3182 = null;
        }
    }
}
