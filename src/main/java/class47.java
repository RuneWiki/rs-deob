import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class47 {

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[[Z")
    public static boolean[][] field638 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lr;")
    public static class110 field639;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
    public static final void method338(int arg0, int arg1, byte arg2) {
        field637++;
        int var3 = 42 / ((-arg2 - 5) / 60);
        class106 var4 = class250.method1400(15, -121, 0);
        var4.method658(0);
        var4.field1590 = arg1;
        var4.field1589 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lml;Ljava/lang/Object;I)V")
    public static final void method339(class241 arg0, Object arg1, int arg2) {
        field640++;
        if (arg0.field3215 == null) {
            return;
        }
        for (int var3 = arg2; var3 < 50 && arg0.field3215.peekEvent() != null; var3++) {
            class374.method2298(-28114, 1L);
        }
        if (arg1 != null) {
            arg0.field3215.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method340(boolean arg0) {
        field638 = null;
        if (arg0) {
            field639 = null;
        }
        field639 = null;
    }
}
