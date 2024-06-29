import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class125 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lgd;")
    public static class206 field1819 = new class206("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[S")
    public static short[] field1821;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lcm;")
    public static class472 field1822;

    static {
        new class206("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field1821 = new short[] { -10304, 9104, -1, -1, -1 };
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 6)
    public static void method764(int arg0) {
        if (arg0 >= -126) {
            field1821 = null;
        }
        field1821 = null;
        field1819 = null;
        field1822 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 36)
    public static final void method765(String arg0, byte arg1, boolean arg2) {
        if (arg1 != 27) {
            method765((String) null, (byte) -111, false);
        }
        class209.field2834.field1651 = 1;
        field1820++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class175.field2385.field3658; var6++) {
            class443 var9 = class175.field2385.method1557(var6, arg1 + 21965);
            if ((!arg2 || var9.field5971) && var9.field6029 == -1 && var9.field6003 == -1 && var9.field5975 == 0 && var9.field5996.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class251.field3345 = -1;
                    class390.field5418 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class413.field5645 = 0;
        class390.field5418 = var4;
        class251.field3345 = var5;
        String[] var7 = new String[class251.field3345];
        for (int var8 = 0; var8 < class251.field3345; var8++) {
            var7[var8] = class175.field2385.method1557(var4[var8], 21992).field5996;
        }
        class92.method586(var7, 119, class390.field5418);
        class209.field2834.method681(false);
        class209.field2834.field1651 = 2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILeu;)Leu;")
    public abstract class308 method64(int arg0, class308 arg1);
}
