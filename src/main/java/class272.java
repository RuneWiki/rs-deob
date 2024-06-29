import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class272 extends class276 {

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field4510 = 0;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Llo;")
    public static class306 field4511 = new class306("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Llo;")
    public static class306 field4513 = new class306("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field4514 = 0;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lfd;")
    public static class316 field4515;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 8)
    public static void method1809(byte arg0) {
        int var1 = -34 / ((arg0 + 72) / 52);
        field4511 = null;
        field4515 = null;
        field4513 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLec;)Lec;", line = 27)
    public static final class68 method1810(boolean arg0, class68 arg1) {
        field4508++;
        if (arg1.field1047 != -1) {
            return class22.method115(7521, arg1.field1047);
        }
        int var2 = arg1.field1059 >>> 16;
        if (!arg0) {
            method1809((byte) 96);
        }
        class318 var3 = new class318(class259.field4346);
        for (class52 var4 = (class52) var3.method2019(21388); var4 != null; var4 = (class52) var3.method2016(0)) {
            if (var4.field841 == var2) {
                return class22.method115(7521, (int) var4.field4542);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)I")
    public abstract int method386(byte arg0);

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)I")
    public abstract int method384(byte arg0);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)I")
    public abstract int method385(byte arg0);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)J")
    public abstract long method388(int arg0);
}
