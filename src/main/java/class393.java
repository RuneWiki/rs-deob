import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class393 {

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public int field5782 = 0;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public int field5779 = 0;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public int field5787 = 2048;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public int field5785 = 2048;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "[I")
    public static int[] field5784;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "Lbg;")
    public static class324 field5780;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static final void method2406(int arg0) {
        field5788++;
        class300 var1 = null;
        if (arg0 != -22125) {
            return;
        }
        try {
            class449 var2 = class498.field7404.method2561((byte) -93, "2");
            while (var2.field6617 == 0) {
                class213.method1462(1L, -5184);
            }
            if (var2.field6617 == 1) {
                var1 = (class300) var2.field6613;
                class65 var3 = new class65(class330.field4604 * 6 + 3);
                var3.method638(arg0 + 22380, 1);
                var3.method611((byte) 67, class330.field4604);
                for (int var4 = 0; var4 < class290.field4169.length; var4++) {
                    if (class450.field6635[var4]) {
                        var3.method611((byte) 67, var4);
                        var3.method618(class290.field4169[var4], (byte) 112);
                    }
                }
                var1.method1885(0, var3.field827, var3.field783, 1);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1884(arg0 + 22124);
            }
        } catch (Exception var5) {
        }
        class345.field4780 = class437.method2644(-125);
        class34.field396 = false;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
    public static final void method2407(boolean arg0) {
        class493[] var1 = class130.field1868;
        synchronized (class130.field1868) {
            if (arg0) {
                field5780 = null;
            }
            int var2 = 0;
            while (true) {
                if (var2 >= class130.field1868.length) {
                    break;
                }
                class130.field1868[var2] = new class493();
                class289.field4151[var2] = 0;
                var2++;
            }
        }
        field5777++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLiv;)V")
    public final void method2408(boolean arg0, class65 arg1) {
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                field5778++;
                if (arg0) {
                    field5784 = null;
                    return;
                }
                return;
            }
            this.method2410(var3, (byte) 120, arg1);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static void method2409(byte arg0) {
        if (arg0 < 93) {
            field5786 = -35;
        }
        field5780 = null;
        field5784 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLiv;)V")
    private final void method2410(int arg0, byte arg1, class65 arg2) {
        if (arg1 != 120) {
            method2411(62, 36, -56);
        }
        if (arg0 == 1) {
            this.field5782 = arg2.method577(255);
        } else if (arg0 == 2) {
            this.field5787 = arg2.method623((byte) 83);
        } else if (arg0 == 3) {
            this.field5785 = arg2.method623((byte) 94);
        } else if (arg0 == 4) {
            this.field5779 = arg2.method599((byte) 1);
        }
        field5781++;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
    public static final void method2411(int arg0, int arg1, int arg2) {
        field5783++;
        class215 var3 = class171.method1208(arg1, (byte) 122, arg0);
        var3.method1465(-25852);
        var3.field3082 = arg2;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)Lsp;")
    public static final class448 method2412(int arg0, boolean arg1) {
        field5776++;
        class448[] var2 = class20.method184(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class448 var4 = var2[var3];
            if (var4.field6604 == arg0) {
                return var4;
            }
        }
        if (!arg1) {
            field5784 = null;
        }
        return null;
    }

    static {
        new class331("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field5784 = new int[2];
        field5786 = 0;
    }
}
