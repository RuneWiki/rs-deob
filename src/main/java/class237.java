import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class237 extends class337 {

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "Llt;")
    public static class475 field3490 = new class475("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!du", name = "q", descriptor = "Lki;")
    public static class498 field3492 = new class498(53, 4);

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method1602(int arg0, int arg1, int arg2, int arg3) {
        field3493++;
        if (arg1 != 7) {
            field3490 = null;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 30)
    public static void method1603(boolean arg0) {
        field3492 = null;
        if (arg0) {
            field3490 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(II)V", line = 48)
    public class237(int arg0, int arg1) {
        this.field3494 = arg1;
        this.field3491 = arg0;
    }
}
