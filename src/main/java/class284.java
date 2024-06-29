import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class284 {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "[S")
    public static short[] field4159;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lvn;")
    public static class187[] field4157;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Ltr;")
    public static class176 field4161;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Ltm;")
    public class242 field4154;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Lf;")
    public class491 field4158;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    public static final void method1785(int arg0, int arg1) {
        if (class327.field4741 == 0) {
            class330.field4781.method776(arg0, false);
        } else {
            class222.field3376 = arg0;
        }
        field4162++;
        if (arg1 != 16260) {
            field4161 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1786(int arg0) {
        if (arg0 != 96) {
            method1787(-30, (byte) -13);
        }
        field4161 = null;
        field4159 = null;
        field4157 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)I")
    public static final int method1787(int arg0, byte arg1) {
        field4160++;
        int var2 = -13 / ((-arg1 - 7) / 57);
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1788(String arg0, int arg1) {
        field4155++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 == 2591) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) + arg0.charAt(var4) - var3;
            }
            return var3;
        } else {
            return -97;
        }
    }

    static {
        new class326("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field4159 = new short[256];
        field4157 = new class187[4];
    }
}
