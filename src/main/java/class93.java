import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class93 extends class333 {

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field1581;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
    public static int[] field1582;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1579;

    static {
        new class342("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field1580 = 2;
        field1581 = new int[1];
        field1582 = new int[5];
        new class342("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 4)
    public static void method714(int arg0) {
        if (arg0 < 125) {
            field1581 = null;
        }
        field1581 = null;
        field1582 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 16)
    public static final void method715(byte arg0) {
        if (arg0 != -59) {
            method714(87);
        }
        field1578++;
        int[] var1 = new int[class367.field5550.field2797];
        int var2 = 0;
        for (int var3 = 0; var3 < class367.field5550.field2797; var3++) {
            class134 var5 = class367.field5550.method1312((byte) 91, var3);
            if (var5.field2144 >= 0 || var5.field2137 >= 0) {
                var1[var2++] = var3;
            }
        }
        class295.field4201 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class295.field4201[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILcu;)V", line = 59)
    public static final void method716(int arg0, class145 arg1) {
        if (arg0 > -34) {
            field1582 = null;
        }
        field1579++;
        int var2 = arg1.method1119(42);
        class476.field7116 = new class168[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class476.field7116[var3] = new class168();
            class476.field7116[var3].field2603 = arg1.method1119(62);
            class476.field7116[var3].field2607 = arg1.method1072(-102);
        }
        class3.field97 = arg1.method1119(-116);
        class391.field5915 = arg1.method1119(55);
        class406.field6099 = arg1.method1119(-97);
        class440.field6577 = new class89[class391.field5915 + 1 - class3.field97];
        for (int var4 = 0; var4 < class406.field6099; var4++) {
            int var5 = arg1.method1119(-88);
            class89 var6 = class440.field6577[var5] = new class89();
            var6.field4256 = arg1.method1063((byte) -39);
            var6.field4259 = arg1.method1070(-32387);
            var6.field1553 = var5 + class3.field97;
            var6.field1555 = arg1.method1072(-116);
            var6.field1550 = arg1.method1072(-118);
        }
        class129.field2055 = arg1.method1070(-32387);
        class206.field2985 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Lrd;")
    public abstract class221 method713(boolean arg0);
}
