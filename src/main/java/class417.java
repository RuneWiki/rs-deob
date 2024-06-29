import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class417 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field6127 = -1;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Ljp;")
    public static class55 field6130 = new class55(39, 4);

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lpu;")
    public static class179 field6131 = new class179(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field6120;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Lum;")
    public static class83 field6135;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[I")
    public static int[] field6133;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method2607(int arg0) {
        field6131 = null;
        if (arg0 != 0) {
            method2607(-40);
        }
        field6133 = null;
        field6135 = null;
        field6130 = null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static final void method2608(int arg0) {
        field6125++;
        for (int var1 = arg0; var1 < class229.field3460.length; var1++) {
            for (int var2 = 0; var2 < class229.field3460[0].length; var2++) {
                for (int var3 = 0; var3 < class229.field3460[0][0].length; var3++) {
                    class229.field3460[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
    public static final void method2609(int arg0, byte arg1) {
        int var2 = -63 % ((arg1 + 66) / 41);
        field6124++;
        class188 var3 = class10.method48((byte) 81, 1, arg0);
        var3.method1306(-23128);
    }

    static {
        new class179("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
