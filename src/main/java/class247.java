import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class247 extends class5 {

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lps;")
    public class63 field3448 = new class63();

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
    public static int[] field3449;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Lkn;")
    public static class530 field3452;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Luu;")
    public static class191 field3447;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method1607(boolean arg0) {
        field3449 = null;
        field3447 = null;
        if (!arg0) {
            field3450 = 15;
        }
    }

    static {
        new class446("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3449 = new int[3];
        field3452 = null;
    }
}
