import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class401 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field6038 = new String[200];

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field6041 = -60;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lqu;")
    public static class219 field6042 = new class219(15, 7);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I")
    public static final int method2578(int arg0, int arg1, int arg2) {
        field6040++;
        if (arg0 == 1 || arg0 == 3) {
            return class349.field5410[arg1 & 0x3];
        } else {
            if (arg2 >= -20) {
                field6041 = -101;
            }
            return class7.field77[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)I")
    public static final int method2579(int arg0, boolean arg1) {
        field6039++;
        if (arg1) {
            field6041 = 41;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
    public static final void method2580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6043++;
        if (arg0 != -60) {
            return;
        }
        for (int var5 = 0; var5 < class126.field1703; var5++) {
            Rectangle var6 = class18.field194[var5];
            if ((var6.x + var6.width) > arg4 && var6.x < arg1 + arg4 && (var6.y + var6.height) > arg2 && arg2 + arg3 > var6.y) {
                class98.field1414[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method2581(int arg0) {
        if (arg0 < 59) {
            method2578(-71, 88, -22);
        }
        field6038 = null;
        field6042 = null;
    }

    static {
        new class213("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
