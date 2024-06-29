import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class429 {

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "[I")
    public static int[] field6368 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field6369 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Lpu;")
    public static class179 field6366 = new class179("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 8)
    public static void method2678(int arg0) {
        field6366 = null;
        if (arg0 > -40) {
            method2678(49);
        }
        field6368 = null;
    }
}
