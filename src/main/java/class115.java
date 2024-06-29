import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class115 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ljm;")
    public static class485 field1558;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lsb;")
    public static final class190 method736(byte arg0, int arg1) {
        field1559++;
        class190 var2 = (class190) class233.field3234.method56((long) arg1, 119);
        if (arg0 >= -72) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class3.field34.method1411(true, arg1, 0);
            class190 var4 = new class190();
            if (var3 != null) {
                var4.method1138((byte) -100, new class365(var3), arg1);
            }
            class233.field3234.method73((long) arg1, var4, 26425);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method737(byte arg0) {
        if (arg0 <= 62) {
            field1558 = null;
        }
        field1558 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static final void method738(byte arg0) {
        field1560++;
        if (arg0 >= -9) {
            field1558 = null;
        }
        for (int var1 = 0; var1 < class166.field2352; var1++) {
            int var2 = class54.field750[var1];
            class405 var3 = class179.field2534[var2];
            if (var3 != null) {
                class28.method195(var3, 18878, var3.field5623.field4637);
            }
        }
    }

    static {
        new class83("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1558 = new class485(12, 8);
    }
}
