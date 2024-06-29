import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class453 {

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field6781 = 0;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Ljc;")
    public static class305 field6779 = new class305("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lsd;")
    public static class63 field6784 = new class63(2, 4, 4, 0);

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6785 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lao;")
    public static class191 field6786 = new class191(105, 3);

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lrq;")
    public static class235 field6782;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILl;Lfq;Ljava/awt/Canvas;I)Lza;", line = 9)
    public static final class287 method2806(int arg0, class16 arg1, class137 arg2, Canvas arg3, int arg4) {
        field6780++;
        if (arg0 < 122) {
            method2807(50, -77, 20);
        }
        return new class197(arg4, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)I", line = 21)
    public static final int method2807(int arg0, int arg1, int arg2) {
        field6783++;
        if (arg2 != 65408) {
            return -81;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 42)
    public static void method2808(byte arg0) {
        field6779 = null;
        field6785 = null;
        field6782 = null;
        field6784 = null;
        if (arg0 != -49) {
            field6782 = null;
        }
        field6786 = null;
    }
}
