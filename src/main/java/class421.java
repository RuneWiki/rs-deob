import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class421 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field6147;

    static {
        new class83("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2518(int arg0) {
        field6145++;
        class93 var1 = (class93) class223.field3129.method3072((byte) 76);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            class465 var2 = var1.field1247;
            if (class400.field5571 != var2.field464 || var2.field6773 < class393.field5484) {
                var1.method2946(-125);
                var2.method2736((byte) 101);
            } else if (class393.field5484 >= var2.field6781) {
                if (var2.field6763 > 0) {
                    class405 var3 = class179.field2534[var2.field6763 - 1];
                    if (var3 != null && var3.field466 >= 0 && class442.field6435 * 128 > var3.field466 && var3.field461 >= 0 && var3.field461 < (class232.field3217 * 128)) {
                        var2.method2733(var3.field461, class186.method1118(var3.field466, var3.field461, arg0 + 12841, var2.field464) - var2.field6752, (byte) -72, var3.field466, class393.field5484);
                    }
                }
                if (var2.field6763 < 0) {
                    int var4 = -var2.field6763 - 1;
                    class192 var5;
                    if (class202.field2880 == var4) {
                        var5 = class75.field1089;
                    } else {
                        var5 = class309.field4234[var4];
                    }
                    if (var5 != null && var5.field466 >= 0 && (class442.field6435 * 128) > var5.field466 && var5.field461 >= 0 && var5.field461 < (class232.field3217 * 128)) {
                        var2.method2733(var5.field461, class186.method1118(var5.field466, var5.field461, 12840, var2.field464) - var2.field6752, (byte) -98, var5.field466, class393.field5484);
                    }
                }
                var2.method2732(16383, class424.field6196);
                class7.method41(var2, true);
            }
            var1 = (class93) class223.field3129.method3066(2);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIII)V", line = 73)
    public static final void method2519(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6147++;
        if (arg2 > arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class225.field3174[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class225.field3174[var6][arg4] = arg3;
            }
        }
        if (arg1 >= 119) {
            ;
        }
    }
}
