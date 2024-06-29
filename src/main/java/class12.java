import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ljd;")
    private static class86 field395 = class122.method868("flash3:", true);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljd;")
    public static class86 field391 = field395;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Ljd;")
    public static class86 field399 = class122.method868("Texturen geladen)3", true);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "Ljd;")
    public static class86 field400 = field395;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lbj;")
    public static class151 field394;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lle;")
    public static class42 field392;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[[[B")
    public static byte[][][] field393;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field397++;
        if (class49.field1044 <= arg6 && class129.field2473 >= arg6 && arg4 >= class49.field1044 && arg4 <= class129.field2473 && arg7 >= class49.field1044 && arg7 <= class129.field2473 && class49.field1044 <= arg0 && arg0 <= class129.field2473 && class50.field1050 <= arg2 && arg2 <= class56.field1143 && arg3 >= class50.field1050 && arg3 <= class56.field1143 && arg5 >= class50.field1050 && class56.field1143 >= arg5 && arg1 >= class50.field1050 && arg1 <= class56.field1143) {
            class13.method99(arg0, arg2, arg7, arg5, arg6, arg4, arg9, arg1, arg3, false);
        } else {
            class33.method244(arg1, arg5, arg7, arg0, arg3, arg4, arg2, arg9, -1055391892, arg6);
        }
        if (arg8 < 83) {
            method98(77);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        field393 = null;
        field400 = null;
        int var1 = 78 / ((arg0 + 61) / 33);
        field391 = null;
        field399 = null;
        field392 = null;
        field394 = null;
        field395 = null;
    }
}
