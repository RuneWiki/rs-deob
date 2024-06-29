import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class70 {

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
    public static boolean field1047 = true;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lun;")
    public static class290 field1049 = new class290();

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1048++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ZIIILjava/lang/String;IJIZ)V")
    public static final void method459(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6, int arg7, long arg8, int arg9, boolean arg10) {
        if (arg5 != 23856) {
            return;
        }
        field1051++;
        if (!class379.field5189 && class412.field5693 < 500) {
            int var12 = arg7 == -1 ? class16.field285 : arg7;
            class39 var13 = new class39(arg6, arg1, var12, arg4, arg0, arg8, arg9, arg3, arg2, arg10);
            class415.field5733.method1666((byte) -58, var13);
            class412.field5693++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method460(int arg0) {
        if (arg0 != -501) {
            field1049 = null;
        }
        field1049 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lci;")
    public static final class312 method461(Canvas arg0, boolean arg1) {
        field1046++;
        try {
            Class var2 = Class.forName("vt");
            class312 var3 = (class312) var2.getDeclaredConstructor().newInstance();
            if (arg1) {
                method459(19, null, false, 76, -65, -121, null, -113, -64L, -35, false);
            }
            var3.method411(34, arg0);
            return var3;
        } catch (Throwable var5) {
            class58 var4 = new class58();
            var4.method411(32, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIII)V")
    public class70(int arg0, int arg1, int arg2, int arg3) {
        this.field1052 = arg0;
        this.field1050 = arg1;
        this.field1045 = arg2;
        this.field1044 = arg3;
    }

    static {
        new class304("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
