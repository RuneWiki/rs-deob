import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class639 extends class189 {

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public int field8778 = -1;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public int field8786 = 0;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Lqfa;")
    public static class98 field8777 = new class98(48, 5);

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Lgda;")
    public static class53 field8783 = new class53(1, -1);

    @OriginalMember(owner = "client!av", name = "z", descriptor = "Lbd;")
    public static class60 field8788 = new class60(0, 4);

    @OriginalMember(owner = "client!av", name = "A", descriptor = "Lgda;")
    public static class53 field8789 = new class53(5, 4);

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public int field8773;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public int field8775;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public int field8776;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public int field8779;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public int field8781;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public int field8782;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    public int field8784;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public int field8787;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 5)
    public static void method3544(int arg0) {
        field8789 = null;
        field8783 = null;
        if (arg0 <= 38) {
            field8788 = null;
        }
        field8777 = null;
        field8788 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method3545(boolean arg0) {
        if (arg0) {
            field8789 = null;
        }
        field8785++;
        class440.field6284 = class55.method346(8, 0.4F, 4, 2048, -27, true, 35, 8);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IILjava/lang/String;)Lue;", line = 50)
    public static final class230 method3546(int arg0, int arg1, String arg2) {
        field8772++;
        class230 var3;
        try {
            var3 = (class230) Class.forName("hr").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class256();
        }
        var3.field3105 = arg2;
        var3.field3103 = arg1;
        if (arg0 != 48) {
            field8789 = null;
        }
        return var3;
    }
}
