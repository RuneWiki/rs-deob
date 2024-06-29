import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class60 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Luv;")
    public static class2 field824 = new class2(63, -2);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Ldp;")
    public static class347 field826;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field827;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method428(int arg0, int arg1) {
        if (arg1 != -14731) {
            field826 = null;
        }
        class164.field2434 = arg0;
        field821++;
        class403.field6087.method2293(false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public abstract void method429(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method430(int arg0) {
        field826 = null;
        if (arg0 == 22100) {
            field827 = null;
            field824 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V")
    public abstract void method431(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
    public class60(int arg0, int arg1, int arg2) {
        this.field820 = arg1;
        this.field822 = arg0;
        this.field819 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)V")
    public abstract void method432(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lok;ZLok;Lok;Lok;)V")
    public static final void method433(class74 arg0, boolean arg1, class74 arg2, class74 arg3, class74 arg4) {
        class49.field625 = arg4;
        if (arg1) {
            return;
        }
        field823++;
        class433.field6407 = arg0;
        class336.field5181 = arg2;
        class305.field4552 = arg3;
        class174.field2549 = new class310[class433.field6407.method535((byte) 117)][];
        class36.field502 = new boolean[class433.field6407.method535((byte) 117)];
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public static final void method434(int arg0, byte arg1) {
        class30.field425 = -1;
        field825++;
        int var2 = -80 / ((arg1 - 34) / 62);
        if (arg0 == 37) {
            class137.field2023 = 3.0F;
        } else if (arg0 == 50) {
            class137.field2023 = 4.0F;
        } else if (arg0 == 75) {
            class137.field2023 = 6.0F;
        } else if (arg0 == 100) {
            class137.field2023 = 8.0F;
        } else if (arg0 == 200) {
            class137.field2023 = 16.0F;
        }
        class30.field425 = -1;
    }

    static {
        new class347("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field826 = new class347("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");
        field827 = new String[100];
    }
}
