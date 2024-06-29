import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class340 extends class8 {

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Laj;")
    public class112 field5288;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field5289 = 0;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "[I")
    public static int[] field5294 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5290 = null;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field5295 = 0;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[Lt;")
    public static class339[] field5293 = new class339[0];

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[Lie;")
    public static class315[] field5291;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "[[Lrc;")
    public static class206[][] field5292;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 6)
    public static void method2364(int arg0) {
        if (arg0 <= 78) {
            field5295 = 47;
        }
        field5290 = null;
        field5293 = null;
        field5294 = null;
        field5291 = null;
        field5292 = (class206[][]) null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Laj;)V", line = 21)
    public class340(class112 arg0) {
        this.field5288 = arg0;
    }
}
