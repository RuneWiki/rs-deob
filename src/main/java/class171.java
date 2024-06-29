import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class171 extends class151 {

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lmb;")
    public static class132 field3188 = class166.method1092("Schlie-8en", 117);

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lmb;")
    public static class132 field3193 = class166.method1092("event_opbase", 114);

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lmb;")
    public static class132 field3190 = class166.method1092("Willkommen auf RuneScape", 126);

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lmb;")
    public static class132 field3195 = class166.method1092("runes", 118);

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Lmb;")
    private static class132 field3194 = class166.method1092(" has logged out)3", 126);

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lmb;")
    public static class132 field3186 = field3194;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Loc;")
    public static class155 field3196;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field3191;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field3188 = null;
        field3195 = null;
        field3186 = null;
        field3190 = null;
        field3196 = null;
        field3193 = null;
        field3194 = null;
        if (arg0 != -24362) {
            method1117(-68);
        }
        field3191 = null;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        field3187++;
        if (class208.field3784 > 0) {
            class229.method1461(-24962);
            return;
        }
        class2.method6(40, (byte) -121);
        class57.field970 = class166.field3027;
        if (arg0 != -9291) {
            method1116(-71);
        }
        class166.field3027 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class171() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class171(int arg0) {
        this.field3189 = arg0;
    }
}
