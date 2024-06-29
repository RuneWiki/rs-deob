import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class301 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lqc;")
    private class325 field4406 = new class325(64);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ldda;")
    private class597 field4405;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "F")
    public static float field4408;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Ldda;")
    public static class597 field4409;

    static {
        new class487("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        new class487("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1862(int arg0, int arg1) {
        class328.field4849.method2028(arg1, true);
        field4411++;
        class100.field1273.method2028(arg1, true);
        class369.field5335.method2028(arg1, true);
        if (arg0 != 5) {
            method1865(101);
        }
        class125.field1646.method2028(arg1, true);
        class316.field4733.method2028(arg1, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZII)Z", line = 21)
    public static final boolean method1863(boolean arg0, int arg1, int arg2) {
        field4410++;
        if (arg0) {
            field4408 = -0.17049253F;
        }
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lqm;", line = 32)
    public final class349 method1864(byte arg0, int arg1) {
        field4407++;
        class325 var3 = this.field4406;
        class349 var4;
        synchronized (this.field4406) {
            var4 = (class349) this.field4406.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 114 % ((arg0 - 73) / 39);
        class597 var6 = this.field4405;
        byte[] var7;
        synchronized (this.field4405) {
            var7 = this.field4405.method3486((byte) -88, arg1, 5);
        }
        class349 var8 = new class349();
        if (var7 != null) {
            var8.method2139(25100, new class428(var7));
        }
        class325 var9 = this.field4406;
        synchronized (this.field4406) {
            this.field4406.method2029(false, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 63)
    public static void method1865(int arg0) {
        if (arg0 != 5) {
            method1862(-93, -113);
        }
        field4409 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 86)
    public class301(class559 arg0, int arg1, class597 arg2) {
        this.field4405 = arg2;
        this.field4405.method3462(5, 85);
    }
}
