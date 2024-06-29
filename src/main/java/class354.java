import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class354 extends class179 {

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Z")
    public boolean field4808 = true;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lcq;")
    public static class72 field4812 = new class72("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field4817 = 0;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field4815 = new String[100];

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "C")
    private char field4807;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field4809;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Ljava/lang/String;")
    public String field4810;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "[[[I")
    public static int[][][] field4820;

    static {
        new class72("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field4821 = 500;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbg;I)V", line = 4)
    private final void method2243(int arg0, class242 arg1, int arg2) {
        field4813++;
        if (arg0 == 1) {
            this.field4807 = class156.method996(arg1.method1589(false), 115);
        } else if (arg0 == 2) {
            this.field4814 = arg1.method1576((byte) 121);
        } else if (arg0 == 4) {
            this.field4808 = false;
        } else if (arg0 == 5) {
            this.field4810 = arg1.method1565(-82);
        }
        if (arg2 > -103) {
            field4812 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIILki;I)V", line = 33)
    public static final void method2244(int arg0, int arg1, int arg2, int arg3, int arg4, class204 arg5, int arg6) {
        class319.method1995(arg6, arg3, arg5.field1516, arg1, arg0, arg5.field1514, arg2, arg4, (byte) -17);
        field4819++;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 42)
    public static void method2245(byte arg0) {
        field4812 = null;
        if (arg0 > -104) {
            method2245((byte) -85);
        }
        field4815 = null;
        field4820 = null;
        field4809 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z", line = 60)
    public final boolean method2246(int arg0) {
        field4806++;
        int var2 = 96 % (arg0 / 54);
        return this.field4807 == 's';
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbg;)V", line = 73)
    public final void method2247(int arg0, class242 arg1) {
        field4811++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                return;
            }
            this.method2243(var3, arg1, -111);
        }
    }
}
