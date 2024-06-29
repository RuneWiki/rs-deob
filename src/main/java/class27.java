import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class27 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "S")
    public short field441;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "B")
    public byte field440;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lms;")
    public class511 field442;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "B")
    public byte field439;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    public static boolean field438 = false;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "S")
    public static short field445 = 320;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lwt;")
    public static class194 field443 = new class194("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Lwt;")
    public static class194 field446 = new class194("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
    public static final void method230(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field444++;
        if (arg0 != 0) {
            method230(-93, -111, 92, -69, 31);
        }
        if ((arg3 - arg2) >= class473.field6839 && class63.field933 >= arg2 + arg3 && arg4 - arg2 >= class7.field131 && arg2 + arg4 <= class92.field1252) {
            class263.method1621(arg3, arg1, -111, arg2, arg4);
        } else {
            class510.method3064(-638886783, arg1, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public static void method231(boolean arg0) {
        if (arg0) {
            method230(10, 39, -33, 114, 31);
        }
        field446 = null;
        field443 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lrl;Lms;III)V")
    public class27(class487 arg0, class511 arg1, int arg2, int arg3, int arg4) {
        this.field441 = (short) arg2;
        this.field440 = (byte) arg4;
        this.field442 = arg1;
        this.field439 = (byte) arg3;
    }
}
