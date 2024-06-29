import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class316 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[[I")
    public static int[][] field4326;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Ll;")
    public static class16 field4327;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lsk;")
    public static class438 field4324;

    static {
        new class466("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field4329 = -1;
        field4326 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method1846(String arg0, int arg1) {
        field4325++;
        if (arg1 != 7) {
            return -45;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method1847(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class257.field3581 != null) {
            class257.field3581[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class12.field192 != null) {
            class12.field192[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class391.field5739 != null) {
            class391.field5739[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBII)I", line = 51)
    public static final int method1848(int arg0, byte arg1, int arg2, int arg3) {
        field4323++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg1 <= 112) {
                field4327 = null;
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 74)
    public static void method1849(byte arg0) {
        field4327 = null;
        if (arg0 != 99) {
            method1847(33, -125, 104, 30, 62);
        }
        field4324 = null;
        field4326 = null;
    }
}
