import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class42 extends class179 {

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    private int field940 = -32768;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field938 = -1;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Lvf;")
    public static class265 field945 = class87.method582(-46, "0");

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Lvf;")
    public static class265 field943 = class87.method582(-46, "overlay2");

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lfl;")
    public static class192 field941;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lte;")
    public static class251 field935;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIIIJILbe;)V")
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class255 arg10) {
        class235 var13 = class54.method418(this.field939, 0).method1750(0, (class216) null, this.field936, -73);
        field942++;
        if (var13 != null) {
            var13.method164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field940 = var13.method141();
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIII)I")
    public static final int method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - class247.field4298[arg1 * 1024 / arg0] >> 1;
        field946++;
        return ((65536 - var5) * arg3 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        field941 = null;
        if (arg0 == -10382) {
            field943 = null;
            field945 = null;
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()I")
    public final int method141() {
        field937++;
        return this.field940;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field944++;
    }
}
