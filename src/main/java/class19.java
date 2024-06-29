import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 extends class14 {

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "I")
    public static int field268 = 20;

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "mapview!ja", name = "m", descriptor = "Ln;")
    public static class26 field267 = class9.method82(255, "Saw Mill");

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "I")
    public static int field269 = -1;

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "Ln;")
    public static class26 field270 = class9.method82(255, "Spice Shop");

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "Ln;")
    public static class26 field271 = class9.method82(255, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "Ln;")
    public static class26 field272 = class9.method82(255, "Candle Shop");

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field264;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)I", line = 6)
    public static final int method140(byte arg0) {
        if (arg0 != 17) {
            field272 = null;
        }
        return class1.field75 == null ? 0 : class1.field75[class18.field262];
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 46)
    public static void method141(int arg0) {
        field272 = null;
        field270 = null;
        field264 = null;
        field267 = null;
        if (arg0 != -1) {
            field267 = null;
        }
        field271 = null;
    }
}
