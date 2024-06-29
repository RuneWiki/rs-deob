import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class598 extends class170 {

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "B")
    public byte field8660;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Z")
    public boolean field8648;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "B")
    public byte field8656;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "S")
    public short field8663;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "S")
    public short field8650;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "S")
    public short field8653;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "S")
    public short field8654;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public int field8649;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public int field8652;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public int field8661;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "Lug;")
    public static class480 field8662 = new class480();

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lcea;")
    public static class180 field8664 = new class180("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Lrg;")
    public static class548 field8666;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public int field8658;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)I")
    public abstract int method322(int arg0);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
    public static final void method3456(int arg0) {
        if (arg0 != 13939) {
            method3456(51);
        }
        field8657++;
        class275.field3625 = 0;
        class469.field6549 = -1;
        class136.field1666 = -1;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V")
    public void method321(byte arg0) {
        if (arg0 <= 37) {
            this.field8650 = 10;
        }
        field8659++;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
    public static final void method3457(int arg0) {
        class458.field6305 = new class99(class595.field8628.method987(class31.field247, arg0 + 24254), "", class71.field684, 1008, -1, 0L, 0, 0, true, false);
        if (arg0 == -24232) {
            field8651++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "(I)V")
    public static void method3458(int arg0) {
        field8662 = null;
        field8666 = null;
        field8664 = null;
        if (arg0 != 6235) {
            method3458(-86);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field8660 = (byte) arg0;
        this.field8648 = arg8;
        this.field8656 = arg9;
        this.field8663 = (short) arg5;
        this.field8650 = (short) arg6;
        this.field8653 = (short) arg4;
        this.field8654 = (short) arg7;
        this.field8649 = arg2;
        this.field8652 = arg3;
        this.field8661 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method3459(String arg0, byte arg1) {
        if (arg1 <= 44) {
            return;
        }
        field8655++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class78.method453((byte) 97, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class389.field5147; var3++) {
            String var4 = class436.field5911[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class78.method453((byte) 97, var4);
            if (var5 != null && var5.equals(var2)) {
                class389.field5147--;
                for (int var6 = var3; var6 < class389.field5147; var6++) {
                    class436.field5911[var6] = class436.field5911[var6 + 1];
                    class283.field3716[var6] = class283.field3716[var6 + 1];
                    class141.field1706[var6] = class141.field1706[var6 + 1];
                    class195.field2370[var6] = class195.field2370[var6 + 1];
                    class128.field1581[var6] = class128.field1581[var6 + 1];
                    class297.field3824[var6] = class297.field3824[var6 + 1];
                }
                class349.field4501 = class519.field7305;
                class171.field2084++;
                class418.method2378(17984, class78.field903);
                class136.field1663.method2093(class88.method528((byte) -90, arg0), -125);
                class136.field1663.method2106(-71, arg0);
                return;
            }
        }
    }

    static {
        new class180("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field8666 = new class548(47, 3);
    }
}
