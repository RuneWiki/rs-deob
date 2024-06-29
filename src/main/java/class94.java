import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
    public static boolean field2308 = true;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lid;")
    public static class60 field2314 = class11.method72("", (byte) -66);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lid;")
    public static class60 field2311 = field2314;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lpa;")
    public static class105 field2313;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field2312;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3) {
        if (class66.field1632 != 0 && arg1 != 0 && class34.field789 < 50) {
            class133.field3042[class34.field789] = arg2;
            class19.field473[class34.field789] = arg1;
            class33.field773[class34.field789] = arg3;
            class9.field138[class34.field789] = null;
            class116.field2739[class34.field789] = 0;
            class34.field789++;
        }
        if (arg0 == 50) {
            field2315++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method746(boolean arg0) {
        if (!arg0) {
            field2313 = null;
            field2311 = null;
            field2314 = null;
            field2312 = null;
        }
    }
}
