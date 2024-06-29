import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class309 {

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field4686;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Ls;")
    public static class186 field4685 = new class186(16, -1);

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Ls;")
    public static class186 field4691 = new class186(109, 6);

    @OriginalMember(owner = "client!os", name = "l", descriptor = "Z")
    public static boolean field4692 = true;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lgf;")
    public static class183 field4682;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Z")
    public static boolean field4690;

    static {
        new class309("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 15)
    public static final void method1974(String arg0, int arg1, boolean arg2) {
        field4683++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class17.field280.field439 : class17.field280.field438) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class389 var11 = class17.field280.method195(var8, -32769);
            if (var11.field5836 && var11.method2396(-1).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class207.field3324 = -1;
                    class274.field4165 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg1 >= -1) {
            return;
        }
        class274.field4165 = var4;
        class207.field3324 = var5;
        class283.field4266 = 0;
        String[] var9 = new String[class207.field3324];
        for (int var10 = 0; var10 < class207.field3324; var10++) {
            var9[var10] = class17.field280.method195(var4[var10], -32769).method2396(-1);
        }
        class535.method3167(var9, -89, class274.field4165);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lnn;I)Ldw;", line = 91)
    public static final class507 method1975(class289 arg0, int arg1) {
        field4687++;
        if (arg1 > -77) {
            field4692 = false;
        }
        class507 var2 = new class507();
        var2.field7388 = arg0.method1841((byte) -121);
        var2.field7390 = class17.field280.method195(var2.field7388, -32769);
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 106)
    public static void method1976(boolean arg0) {
        field4682 = null;
        if (!arg0) {
            field4691 = null;
            field4685 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Ljava/lang/String;", line = 138)
    public final String method1977(int arg0, int arg1) {
        field4681++;
        int var3 = 86 % ((11 - arg1) / 42);
        return this.field4686[arg0];
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lza;I)V", line = 176)
    public static final void method1978(class288 arg0, int arg1) {
        field4684++;
        if (class372.field5446 == class15.field266.field6084 || class518.field7511 == null) {
            return;
        }
        if (arg1 <= 70) {
            field4685 = null;
        }
        if (class1.method3((byte) -58, class15.field266.field6084, arg0)) {
            class372.field5446 = class15.field266.field6084;
        }
    }

    @OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;", line = 204)
    public final String toString() {
        field4688++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 242)
    public class309(String arg0, String arg1, String arg2, String arg3) {
        this.field4686 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
