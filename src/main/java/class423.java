import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class423 {

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Lch;")
    public static class151 field5853 = new class151("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field5856 = 0;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Ltq;")
    public static class248 field5852;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[[B")
    public static byte[][] field5855;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method2519(byte arg0) {
        field5855 = null;
        if (arg0 != 40) {
            field5856 = -14;
        }
        field5852 = null;
        field5853 = null;
    }
}
