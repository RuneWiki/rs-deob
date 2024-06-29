import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class56 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "F")
    public static float field688 = 0.25F;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field686 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Lqp;")
    public static class586 field689 = new class586(56, 1);

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field692 = 1;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method363(int arg0) {
        if (arg0 != 9179409) {
            method363(74);
        }
        field689 = null;
        field686 = null;
    }
}
