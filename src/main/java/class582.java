import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class582 extends class626 {

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field8223 = -2;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lkca;")
    public static class82 field8222 = new class82(1);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field8225;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Leia;")
    public static class240 field8227;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
    public int[] field8228;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method3369(int arg0) {
        if (arg0 < 48) {
            field8223 = 17;
        }
        field8222 = null;
        field8227 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILuw;I)V")
    public static final void method3370(int arg0, int arg1, int arg2, class414 arg3, int arg4) {
        int var5 = -39 % ((arg0 + 18) / 53);
        field8224++;
        for (class235 var6 = (class235) class152.field2292.method1522(true); var6 != null; var6 = (class235) class152.field2292.method1527((byte) 51)) {
            if (var6.field3324 == arg1 && (arg2 << 9) == var6.field3323 && (arg4 << 9) == var6.field3326 && var6.field3339.field5711 == arg3.field5711) {
                if (var6.field3338 != null) {
                    class484.field6848.method4051(var6.field3338);
                    var6.field3338 = null;
                }
                if (var6.field3319 != null) {
                    class484.field6848.method4051(var6.field3319);
                    var6.field3319 = null;
                }
                var6.method3617(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V")
    public abstract void method38(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, Graphics arg6, int arg7);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
    public abstract void method39(int arg0, Canvas arg1, int arg2, byte arg3);
}
