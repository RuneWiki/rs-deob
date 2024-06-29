import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class331 extends class185 {

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field5285;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5287 = "Drop";

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field5294 = 0;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lsf;")
    public static class124 field5290 = new class124(64);

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lek;")
    public static class206 field5286;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Ljava/lang/String;")
    public static String field5293;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field5288;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 5)
    public static void method2348(int arg0) {
        field5288 = null;
        if (arg0 != 0) {
            field5294 = 18;
        }
        field5287 = null;
        field5286 = null;
        field5290 = null;
        field5293 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 18)
    public class331(Object arg0) {
        this.field5285 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 29)
    public final Object method857(int arg0) {
        field5289++;
        return arg0 == 0 ? this.field5285 : (Object) null;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z", line = 46)
    public final boolean method858(int arg0) {
        field5292++;
        if (arg0 >= -101) {
            field5293 = (String) null;
        }
        return false;
    }
}
