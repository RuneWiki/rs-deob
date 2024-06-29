import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class457 extends class452 {

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lak;")
    public static class234 field6646 = new class234("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "[Lup;")
    public static class183[] field6655 = new class183[128];

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public int field6645;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public int field6657;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public int field6658;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lqd;")
    public class315 field6649;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Lcq;")
    public static class329 field6653;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Ljava/lang/String;")
    public String field6652;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
    public int[] field6647;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "[I")
    public int[] field6651;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[Lgu;")
    public class412[] field6650;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field6648;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method2773(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class193.field3258.field7249 * arg0 >> 8;
        field6656++;
        if (arg3 != var4 && arg2 != -1) {
            class519.method3084(class103.field1485, -20096, false, 0, var4, arg2);
            class459.field6673 = true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILkk;IIIB)V", line = 30)
    public static final void method2774(int arg0, int arg1, class129 arg2, int arg3, int arg4, int arg5, byte arg6) {
        class351.method2180(arg3, arg2.field5833, true, arg1, arg2.field5826, arg0, arg2.field5837, arg4, arg5, 0);
        if (arg6 >= -27) {
            method2775(16);
        }
        field6660++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 47)
    public static void method2775(int arg0) {
        if (arg0 <= -35) {
            field6655 = null;
            field6653 = null;
            field6646 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Ljava/lang/String;", line = 66)
    public static final String method2776(int arg0, int arg1) {
        field6659++;
        String var2 = Integer.toString(arg1);
        if (arg0 >= -123) {
            field6646 = null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class65.field842.method1635(class224.field3673, (byte) 118) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class12.field178.method1635(class224.field3673, (byte) 120) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
