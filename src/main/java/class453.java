import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class class453 extends class108 {

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lpp;")
    public static class464 field6567;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "[I")
    public int[] field6564;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public abstract void method1289(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method1291(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method2668(int arg0) {
        field6567 = null;
        if (arg0 != -3) {
            method2668(-52);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1290(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(JI)V")
    public static final void method2669(long arg0, int arg1) {
        class127.field2088.field3913 = 0;
        field6568++;
        class127.field2088.method1710(class97.field1685.field7507, 119);
        class127.field2088.method1721(arg0, true);
        if (arg1 <= 77) {
            field6567 = null;
        }
        class127.field2088.method1710(class538.field7500, 21);
        class617.field8731 = 0;
        class23.field324 = 1;
        class98.field1708 = 0;
        class551.field7801 = -3;
    }

    static {
        new class567("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field6567 = new class464(9, -1);
    }
}
