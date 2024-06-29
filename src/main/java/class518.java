import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class518 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field7534;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field7535;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field7537;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lea;")
    public static class474 field7539 = new class474("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field7541 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Leea;")
    public static class114 field7540 = new class114();

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field7542 = -1;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "F")
    public static float field7543;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field7538;

    static {
        new class474("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method3067(int arg0, boolean arg1, int arg2) {
        field7536++;
        class467 var3 = class541.method3144(arg2, (byte) -104, 7);
        var3.method2851(arg1);
        var3.field6926 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I", line = 20)
    public static final int method3068(byte arg0, int arg1) {
        field7538++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 > -38) {
                method3067(-125, false, 119);
            }
            return class639.method3645(arg1, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 35)
    public static void method3069(int arg0) {
        field7539 = null;
        if (arg0 != -5949) {
            method3070(70, 87);
        }
        field7540 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V", line = 53)
    public static final void method3070(int arg0, int arg1) {
        class99 var2 = class431.field6408[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class99 var4 = class431.field6408[var3][arg0][arg1] = class431.field6408[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1166--;
                for (class104 var5 = var4.field1167; var5 != null; var5 = var5.field1251) {
                    class144 var6 = var5.field1253;
                    if (var6.field1773 == arg0 && var6.field1758 == arg1) {
                        var6.field1757--;
                    }
                }
            }
        }
        if (class431.field6408[0][arg0][arg1] == null) {
            class431.field6408[0][arg0][arg1] = new class99(0, arg0, arg1);
            class431.field6408[0][arg0][arg1].field1178 = 1;
        }
        class431.field6408[0][arg0][arg1].field1162 = var2;
        class431.field6408[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(III)V", line = 92)
    public class518(int arg0, int arg1, int arg2) {
        this.field7534 = arg2;
        this.field7535 = arg1;
        this.field7537 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public abstract void method220(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V")
    public abstract void method223(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZ)V")
    public abstract void method224(int arg0, int arg1, boolean arg2);
}
