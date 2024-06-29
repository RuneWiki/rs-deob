import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class226 extends class42 {

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[B")
    public byte[] field3407;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
    public static boolean field3412;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3410;

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V")
    public class226(byte[] arg0) {
        this.field3407 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Ltg;")
    public static final class158 method1519(boolean arg0) {
        if (arg0) {
            method1520(3, null, -96);
        }
        field3414++;
        return class382.field5449;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILci;I)Lpb;")
    public static final class474 method1520(int arg0, class320 arg1, int arg2) {
        if (arg0 != -1) {
            method1519(false);
        }
        field3409++;
        byte[] var3 = arg1.method2029(arg2, false);
        return var3 == null ? null : new class474(var3);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1521(int arg0) {
        if (arg0 != 1079) {
            field3412 = false;
        }
        field3410 = null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)I")
    public static final int method1522(int arg0) {
        if (arg0 != -2195) {
            method1520(77, null, -108);
        }
        field3408++;
        class511 var1 = class190.field2779;
        synchronized (class190.field2779) {
            return class190.field2779.method2984((byte) -30);
        }
    }

    static {
        new class44("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class44(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field3413 = -1;
        field3412 = false;
    }
}
