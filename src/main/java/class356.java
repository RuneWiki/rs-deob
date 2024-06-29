import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class356 extends class148 {

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "Lki;")
    public static class498 field5469 = new class498(22, 6);

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "Lki;")
    public static class498 field5470 = new class498(51, 5);

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "Lmv;")
    public static class252 field5471 = new class252(5000);

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "Llt;")
    public static class475 field5473 = new class475("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "F")
    public static float field5474;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "[I")
    public static int[] field5472;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V")
    public static void method2223(byte arg0) {
        int var1 = -123 / ((arg0 + 27) / 39);
        field5469 = null;
        field5471 = null;
        field5470 = null;
        field5472 = null;
        field5473 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 >= -65) {
            field5472 = null;
        }
        field5468++;
        return class517.field7539;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class356() {
        super(0, true);
    }
}
