import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class48 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Llh;")
    private class364 field725 = new class364(64);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lhh;")
    private class84 field726;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field723 = -1;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lao;")
    public static class188 field729;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field728;

    static {
        new class180("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field729 = new class188(26, -1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lnq;", line = 3)
    public final class319 method355(int arg0, byte arg1) {
        field724++;
        class364 var3 = this.field725;
        class319 var4;
        synchronized (this.field725) {
            var4 = (class319) this.field725.method2339(-79, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field726.method683(5, arg0, 5);
        class319 var6 = new class319();
        if (var5 != null) {
            var6.method1999(0, new class303(var5));
        }
        if (arg1 >= 0) {
            method358(121);
        }
        class364 var7 = this.field725;
        synchronized (this.field725) {
            this.field725.method2342((long) arg0, var6, 108);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 33)
    public static final void method356(int arg0, String arg1) {
        field728++;
        if (arg1 == null) {
            return;
        }
        if (!(class424.field6218 < 100 || class333.field5121) || class424.field6218 >= 200) {
            class460.method2756(class5.field79.method1273(true, class370.field5530), false);
            return;
        }
        String var2 = class343.method2237(arg1, (byte) -57);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class424.field6218; var3++) {
            String var7 = class343.method2237(class469.field6908[var3], (byte) -57);
            if (var7 != null && var7.equals(var2)) {
                class460.method2756(arg1 + class341.field5202.method1273(true, class370.field5530), false);
                return;
            }
            if (class332.field5102[var3] != null) {
                String var8 = class343.method2237(class332.field5102[var3], (byte) -57);
                if (var8 != null && var8.equals(var2)) {
                    class460.method2756(arg1 + class341.field5202.method1273(true, class370.field5530), false);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class520.field7636; var4++) {
            String var5 = class343.method2237(class83.field1361[var4], (byte) -57);
            if (var5 != null && var5.equals(var2)) {
                class460.method2756(class217.field3149.method1273(true, class370.field5530) + arg1 + class285.field4132.method1273(true, class370.field5530), false);
                return;
            }
            if (class451.field6586[var4] != null) {
                String var6 = class343.method2237(class451.field6586[var4], (byte) -57);
                if (var6 != null && var6.equals(var2)) {
                    class460.method2756(class217.field3149.method1273(true, class370.field5530) + arg1 + class285.field4132.method1273(true, class370.field5530), false);
                    return;
                }
            }
        }
        if (class343.method2237(class95.field1558.field1094, (byte) -57).equals(var2)) {
            class460.method2756(class78.field1307.method1273(true, class370.field5530), false);
            return;
        }
        class39.field592++;
        class114.method841(false, class62.field1113);
        if (arg0 == 31651) {
            class86.field1436.method1923((byte) 62, class8.method57(-104, arg1));
            class86.field1436.method1882((byte) 39, arg1);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 137)
    public static final void method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class526.field7734 = arg1;
        class41.field631 = arg4;
        if (arg3 != 25362) {
            field729 = null;
        }
        field727++;
        class529.field7798 = arg2;
        class113.field1800 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 153)
    public static void method358(int arg0) {
        field729 = null;
        if (arg0 != 64) {
            method358(-91);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lmt;ILhh;)V", line = 176)
    public class48(class271 arg0, int arg1, class84 arg2) {
        this.field726 = arg2;
        this.field726.method656((byte) 122, 5);
    }
}
