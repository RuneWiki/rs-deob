import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class58 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
    public static int[] field682;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lfo;")
    public static class361 field683;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLjava/lang/String;ZILfq;)V")
    public static final void method346(boolean arg0, String arg1, boolean arg2, int arg3, class137 arg4) {
        field686++;
        if (arg2) {
            if (class137.field1833.startsWith("win") && class137.field1839 != 3) {
                String var5 = null;
                if (arg4.field1828 != null) {
                    var5 = arg4.field1828.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class236 var6 = class253.method1567(arg4, true, arg1, 0);
                    class421.field6113 = var6;
                    class518.field7631 = arg1;
                    class87.field1034 = arg4;
                    return;
                }
            }
            if (class137.field1833.startsWith("mac")) {
                String var7 = null;
                if (arg4.field1828 != null) {
                    var7 = arg4.field1828.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg0) {
                    class253.method1567(arg4, true, arg1, 1);
                    return;
                }
            }
            class253.method1567(arg4, true, arg1, 2);
        } else {
            class253.method1567(arg4, true, arg1, 3);
        }
        if (arg3 != 3) {
            field682 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I")
    public abstract int method347(int arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Z")
    public abstract boolean method348(byte arg0);

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)I")
    public abstract int method349(byte arg0);

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Lst;")
    public abstract class299 method350(int arg0);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)Z")
    public abstract boolean method352(boolean arg0);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)Z")
    public abstract boolean method353(int arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method354(int arg0, String arg1) {
        field685++;
        if (!class323.field4302) {
            return;
        }
        boolean var2 = false;
        int var3 = class461.field6877;
        int[] var4 = class342.field4589;
        for (int var5 = 0; var5 < var3; var5++) {
            class531 var6 = class29.field272[var4[var5]];
            if (var6 != null && class96.field1170 != var6 && var6.field7783 != null && var6.field7783.equalsIgnoreCase(arg1)) {
                class492.method2979(class92.field1094, 28);
                class330.field4382++;
                class106.field1443.method2427((byte) 93, 0);
                class106.field1443.method2444((byte) 65, class235.field3143);
                class106.field1443.method2446(var4[var5], (byte) 126);
                class106.field1443.method2425(-706417304, class519.field7656);
                class106.field1443.method2410(false, class273.field3644);
                var2 = true;
                class139.method861(true, -2, var6.method546(24273), var6.field1251[0], 0, var6.method546(arg0 ^ 0x5ED3), -124, 0, var6.field1249[0]);
                break;
            }
        }
        if (arg0 != 2) {
            method357(-63);
        }
        if (!var2) {
            class180.method1053(arg0 ^ 0x2, class496.field7234.method1823(class374.field5072, (byte) -88) + arg1);
        }
        if (class323.field4302) {
            class227.method1451(4226);
        }
    }

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "(I)Z")
    public final boolean method355(int arg0) {
        if (arg0 != 31027) {
            field683 = null;
        }
        field684++;
        return this.method352(true) || this.method348((byte) 93) || this.method353(arg0 - 26725);
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
    public abstract void method356(byte arg0);

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)V")
    public static void method357(int arg0) {
        field682 = null;
        field683 = null;
        if (arg0 != 6308) {
            field683 = null;
        }
    }

    static {
        new class305("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field682 = new int[] { 1, 2, 4, 8 };
    }
}
