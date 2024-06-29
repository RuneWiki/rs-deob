import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class62 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lgd;")
    public static class206 field819 = new class206("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field821 = 328;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lon;")
    public static class203 field820;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lur;")
    public static class345 field822;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[Ljd;")
    public static class139[] field823;

    static {
        new class206(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 4)
    public static void method425(byte arg0) {
        field820 = null;
        field819 = null;
        field823 = null;
        if (arg0 <= 42) {
            field820 = null;
        }
        field822 = null;
    }
}
