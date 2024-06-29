import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class56 extends class140 {

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Lff;")
    public static class9 field874 = new class9(81, 2);

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Z")
    public static boolean field876 = false;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Lgo;")
    public static class441 field881 = new class441(8);

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Z")
    public static boolean field882 = false;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Lvj;")
    public static class304 field883 = new class304("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field884 = -2;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)V")
    public static final void method404(int arg0) {
        field877++;
        class253 var1 = class332.method1911(arg0, (byte) 57, 15);
        var1.method1523((byte) -123);
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
    public static void method405(byte arg0) {
        if (arg0 > -10) {
            field876 = false;
        }
        field874 = null;
        field881 = null;
        field883 = null;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIII)V")
    public class56(int arg0, int arg1, int arg2, int arg3) {
        this.field879 = arg0;
        this.field880 = arg3;
        this.field873 = arg1;
        this.field875 = arg2;
    }
}
