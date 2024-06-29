import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class333 extends class238 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[B")
    public byte[] field4841;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4842 = 0;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Lus;")
    public static class1 field4845;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "[Ltr;")
    public static class176[] field4844;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ltm;III[Z)Z")
    public static final boolean method2103(class242 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class53.field725 != class28.field388) {
            int var6 = class178.field2556[arg1].method1209(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class426 var8 = class178.field2556[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1209(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1210(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1215(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method2104(byte arg0, String arg1, boolean arg2) {
        field4843++;
        if (arg1 == null) {
            return;
        }
        if (class350.field5065 >= 100) {
            class139.method884(class323.field4660.method2065(-121, class326.field4711), 0);
            return;
        }
        if (arg0 != -108) {
            field4844 = null;
        }
        String var3 = class191.method1180((byte) -98, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class350.field5065; var4++) {
            String var8 = class191.method1180((byte) -94, class7.field70[var4]);
            if (var8 != null && var8.equals(var3)) {
                class139.method884(arg1 + class193.field2850.method2065(-113, class326.field4711), arg0 ^ 0xFFFFFF94);
                return;
            }
            if (class204.field3025[var4] != null) {
                String var9 = class191.method1180((byte) -94, class204.field3025[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class139.method884(arg1 + class193.field2850.method2065(50, class326.field4711), 0);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class237.field3564; var5++) {
            String var6 = class191.method1180((byte) -114, class24.field310[var5]);
            if (var6 != null && var6.equals(var3)) {
                class139.method884(class332.field4832.method2065(107, class326.field4711) + arg1 + class255.field3732.method2065(121, class326.field4711), arg0 ^ 0xFFFFFF94);
                return;
            }
            if (class116.field1477[var5] != null) {
                String var7 = class191.method1180((byte) -101, class116.field1477[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class139.method884(class332.field4832.method2065(61, class326.field4711) + arg1 + class255.field3732.method2065(84, class326.field4711), 0);
                    return;
                }
            }
        }
        if (class191.method1180((byte) -118, class492.field6935.field6277).equals(var3)) {
            class139.method884(class491.field6926.method2065(arg0 + 13, class326.field4711), 0);
            return;
        }
        class15.method110(class140.field1854, arg0 - 19);
        class208.field3179++;
        class225.field3415.method1753(true, class89.method501(arg1, true) + 1);
        class225.field3415.method1730(-11508, arg1);
        class225.field3415.method1753(true, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)V")
    public static void method2105(boolean arg0) {
        field4844 = null;
        field4845 = null;
        if (!arg0) {
            field4844 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
    public class333(byte[] arg0) {
        this.field4841 = arg0;
    }

    static {
        new class326("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field4845 = new class1(13, 6);
    }
}
