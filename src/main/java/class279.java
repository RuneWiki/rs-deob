import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class279 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljn;")
    public static class409 field4113 = new class409("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field4116;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4114;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lkg;I)Lkg;", line = 4)
    public static final class223 method1893(class223 arg0, int arg1) {
        field4115++;
        class223 var2 = client.method1813(arg0);
        int var3 = -20 / ((70 - arg1) / 38);
        if (var2 == null) {
            var2 = arg0.field3217;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 33)
    public static void method1894(byte arg0) {
        field4116 = null;
        field4113 = null;
        field4114 = null;
        if (arg0 != 38) {
            field4114 = null;
        }
    }
}
