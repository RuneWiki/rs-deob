import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class StringNode extends Linkable {

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Laa;")
    public static JavaKeyboard field81 = new JavaKeyboard();

    @OriginalMember(owner = "mapview!fa", name = "q", descriptor = "Lv;")
    public static JagString field85 = class1.method2(255, "Clothes Shop");

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "Lv;")
    public static JagString field84 = class1.method2(255, "overlay2)3dat");

    @OriginalMember(owner = "mapview!fa", name = "v", descriptor = "Lv;")
    public static JagString field90 = class1.method2(255, "Rare Trees");

    @OriginalMember(owner = "mapview!fa", name = "w", descriptor = "Lv;")
    public static JagString field91 = class1.method2(255, "sprites");

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "mapview!fa", name = "t", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "J")
    public static long field83;

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "Lv;")
    public JagString value;

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "Lj;")
    public static Js5 field86;

    @OriginalMember(owner = "mapview!fa", name = "s", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field87;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "[I")
    public static int[] field82;

    @OriginalMember(owner = "mapview!fa", name = "u", descriptor = "[Lf;")
    public static Pix8[] field89;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(B)V", line = 64)
    public static void method40(byte arg0) {
        field85 = null;
        if (arg0 != 97) {
            create((byte) -93);
        }
        field81 = null;
        field89 = null;
        field87 = null;
        field90 = null;
        field82 = null;
        field91 = null;
        field86 = null;
        field84 = null;
    }
}
