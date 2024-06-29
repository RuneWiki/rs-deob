import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class11 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lpca;")
    public static class529 field273 = new class529();

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field278 = "";

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "B")
    public byte field279;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lf;")
    public static class256 field269;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljava/lang/String;")
    public String field270;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/lang/String;")
    public String field274;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ljava/lang/String;")
    public String field275;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Ljava/lang/String;")
    public String field280;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 3)
    public static void method75(byte arg0) {
        field273 = null;
        if (arg0 > 113) {
            field269 = null;
            field278 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 20)
    public static final int method76(int arg0, int arg1) {
        return class267.field3482 == null ? 0 : class267.field3482[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 27)
    public static final void method77(int arg0) {
        field272++;
        if (arg0 < -16 && class641.field9191 == 6) {
            class641.field9191 = 7;
        }
    }
}
