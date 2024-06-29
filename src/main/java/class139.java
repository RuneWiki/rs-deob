import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class139 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lwa;")
    private class366 field2120 = new class366();

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2125 = -1;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lwa;")
    private class366 field2130;

    static {
        new class349("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lwa;", line = 15)
    public final class366 method1053(int arg0) {
        if (arg0 < 40) {
            return null;
        }
        field2126++;
        class366 var2 = this.field2120.field5229;
        if (this.field2120 == var2) {
            this.field2130 = null;
            return null;
        } else {
            this.field2130 = var2.field5229;
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lwa;", line = 41)
    public final class366 method1054(byte arg0) {
        if (arg0 != -68) {
            this.method1059(7);
        }
        field2124++;
        class366 var2 = this.field2120.field5229;
        if (this.field2120 == var2) {
            return null;
        } else {
            var2.method2365(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 162)
    public class139() {
        this.field2120.field5237 = this.field2120;
        this.field2120.field5229 = this.field2120;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lwa;I)V", line = 65)
    public final void method1055(class366 arg0, int arg1) {
        field2127++;
        int var3 = 96 / ((arg1 - 11) / 63);
        if (arg0.field5237 != null) {
            arg0.method2365(true);
        }
        arg0.field5237 = this.field2120.field5237;
        arg0.field5229 = this.field2120;
        arg0.field5237.field5229 = arg0;
        arg0.field5229.field5237 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 81)
    public final void method1056(int arg0) {
        if (arg0 != 11281) {
            this.method1054((byte) -99);
        }
        while (true) {
            class366 var2 = this.field2120.field5229;
            if (this.field2120 == var2) {
                field2122++;
                this.field2130 = null;
                return;
            }
            var2.method2365(true);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 105)
    public static final void method1057(int arg0) {
        class285.field4152.method98(0);
        field2128++;
        if (arg0 <= 105) {
            method1057(-77);
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Lwa;", line = 117)
    public final class366 method1058(int arg0) {
        field2123++;
        class366 var2 = this.field2130;
        if (this.field2120 == var2) {
            this.field2130 = null;
            return null;
        } else {
            int var3 = 16 / ((60 - arg0) / 57);
            this.field2130 = var2.field5229;
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I", line = 139)
    public final int method1059(int arg0) {
        field2121++;
        int var2 = arg0;
        for (class366 var3 = this.field2120.field5229; var3 != this.field2120; var3 = var3.field5229) {
            var2++;
        }
        return var2;
    }
}
