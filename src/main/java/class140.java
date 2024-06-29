import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class140 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lui;")
    private class451 field1999;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lo;")
    public static class332 field2001 = new class332("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    public static int[] field2003 = new int[100];

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field2005 = 2;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field2006 = 0;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lsh;")
    public static class472 field2007 = new class472(58, 7);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field2004;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method968(byte arg0, int arg1) {
        if (arg0 != 109) {
            field2001 = null;
        }
        field2000++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lje;I)Ljava/lang/String;", line = 17)
    public static final String method969(class178 arg0, int arg1) {
        field2002++;
        if (client.method2777(arg0).method1207((byte) -110) == 0) {
            return null;
        }
        if (arg1 != 11481) {
            field2003 = null;
        }
        if (arg0.field2590 == null || arg0.field2590.trim().length() == 0) {
            return class365.field5528 ? "Hidden-use" : null;
        } else {
            return arg0.field2590;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 149)
    public class140(class430 arg0, int arg1, class451 arg2) {
        new class400(64);
        this.field1999 = arg2;
        this.field1997 = this.field1999.method2662(15, (byte) -7);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;Lng;BI)Liu;", line = 58)
    public static final class397 method970(String arg0, class153 arg1, byte arg2, int arg3) {
        field1998++;
        if (arg3 == 0) {
            return arg1.method1046(arg0, 0);
        } else if (arg3 == 1) {
            try {
                class399.method2385("openjs", new Object[] { (new URL(arg1.field2125.getCodeBase(), arg0)).toString() }, -2081, arg1.field2125);
                class397 var4 = new class397();
                var4.field5822 = 1;
                return var4;
            } catch (Throwable var10) {
                class397 var5 = new class397();
                var5.field5822 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg1.field2125.getAppletContext().showDocument(new URL(arg1.field2125.getCodeBase(), arg0), "_blank");
                class397 var6 = new class397();
                var6.field5822 = 1;
                return var6;
            } catch (Exception var11) {
                class397 var7 = new class397();
                var7.field5822 = 2;
                return var7;
            }
        } else {
            if (arg2 != 102) {
                method968((byte) -112, -63);
            }
            if (arg3 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class399.method2383(arg1.field2125, -10423, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg1.field2125.getAppletContext().showDocument(new URL(arg1.field2125.getCodeBase(), arg0), "_top");
                class397 var8 = new class397();
                var8.field5822 = 1;
                return var8;
            } catch (Exception var12) {
                class397 var9 = new class397();
                var9.field5822 = 2;
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 137)
    public static void method971(boolean arg0) {
        field2003 = null;
        field2004 = null;
        if (arg0) {
            field2001 = null;
            field2007 = null;
        }
    }
}
