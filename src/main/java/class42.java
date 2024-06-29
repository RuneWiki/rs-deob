import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class42 extends class125 {

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Lufa;")
    public static class740 field703 = new class740(11, 7);

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
    public static int[] field708;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method432(String arg0, int arg1) {
        class565.field8191 = arg0;
        ++field698;
        if (class486.field6999 != null) {
            try {
                String var2 = class486.field6999.getParameter("cookieprefix");
                String var3 = class486.field6999.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1 == arg0.length()) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class744.method4145(94608000000L + class465.method2818(255), (byte) -46) + "; Max-Age=" + 94608000L;
                }
                class665.method3804(-75, class486.field6999, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lgp;)V")
    public class42(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field702;
        if (!arg0) {
            field704 = 122;
        }
        return super.field1733.method3308(-97) ? 3 : 1;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        ++field699;
        if (arg0) {
            if (super.field1733.method3308(-86)) {
                super.field1732 = 0;
            }
            if (~super.field1732 > -1 || ~super.field1732 < -3) {
                super.field1732 = this.method158((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z")
    public final boolean method433(int arg0) {
        ++field705;
        if (arg0 != -7558) {
            this.method155(false, 61);
        }
        return !super.field1733.method3308(-99);
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
    public static void method434(int arg0) {
        field703 = null;
        field708 = null;
        if (arg0 > -9) {
            method434(-2);
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(ILgp;)V")
    public class42(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field701;
        int var2 = 7 / ((arg0 - -63) / 49);
        return 2;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)I")
    public final int method435(boolean arg0) {
        ++field700;
        if (arg0) {
            field704 = -24;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        if (arg0 > -32) {
            this.method157((byte) -25, -102);
        }
        super.field1732 = arg1;
        ++field707;
    }
}
