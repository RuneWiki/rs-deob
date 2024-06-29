import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends RuntimeException {

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Ljava/lang/String;")
    public String field205;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field203;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static volatile int field204 = 0;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public static int field202 = 0;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Ll;")
    public static class22 field208 = class33.method229("overlay)3dat", -71);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Ll;")
    public static class22 field210 = class33.method229("Windmill", -94);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Ll;")
    public static class22 field211 = class33.method229("labels)3dat", -95);

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Ll;")
    public static class22 field206;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "[I")
    public static int[] field209;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 33)
    public static final void method126(Component arg0, int arg1) {
        arg0.removeMouseListener(class5.field36);
        arg0.removeMouseMotionListener(class5.field36);
        arg0.removeFocusListener(class5.field36);
        if (arg1 != 63) {
            method128(58);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IZI)V", line = 52)
    public static final void method127(int arg0, boolean arg1, int arg2) {
        class29.field373 = arg2 >> 6;
        if (!arg1) {
            return;
        }
        class25.field243 = arg0 & 0x3F;
        class13.field144 = arg0 >> 6;
        class5.field50 = arg2 & 0x3F;
        class35.field471 = (class25.field243 << 6) + class5.field50;
        class12.method63((byte) -61);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 73)
    public static void method128(int arg0) {
        field208 = null;
        field211 = null;
        field209 = null;
        if (arg0 != 35) {
            field204 = 94;
        }
        field210 = null;
        field206 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 100)
    public class21(Throwable arg0, String arg1) {
        this.field205 = arg1;
        this.field203 = arg0;
    }
}
