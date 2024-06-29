import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class213 extends class467 {

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2981;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "J")
    public static long field2980;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "[I")
    public int[] field2982;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method78(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILns;)V")
    public static final void method1458(int arg0, class438 arg1) {
        if (arg0 != 30067) {
            field2983 = -34;
        }
        class23.field350 = arg1.method2652("titlebg", 98);
        field2979++;
        class322.field4952 = arg1.method2652("logo", arg0 ^ 0x753C);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public static void method1459(int arg0) {
        if (arg0 == -1) {
            field2981 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public abstract void method77(byte arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method79(boolean arg0, Canvas arg1);

    static {
        new class375("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2981 = new String[100];
        field2980 = -1L;
    }
}
