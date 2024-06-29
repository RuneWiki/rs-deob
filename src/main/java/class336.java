import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class336 extends class293 {

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[Z")
    public static boolean[] field4875 = new boolean[100];

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Lpm;")
    public static class349 field4879 = new class349("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "[[[B")
    public static byte[][][] field4877;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLlf;)Ljava/lang/String;")
    public static final String method2209(int arg0, byte arg1, class130 arg2) {
        field4876++;
        try {
            int var3 = 120 % ((-arg1 - 30) / 43);
            int var4 = arg2.method854(3944);
            if (var4 > arg0) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg2.field1880 += class266.field3911.method154(var5, 0, arg2.field1851, arg2.field1880, var4, 0);
            return class312.method2098(0, 0, var4, var5);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public static void method2210(int arg0) {
        field4877 = null;
        field4879 = null;
        if (arg0 == 0) {
            field4875 = null;
        }
    }
}
