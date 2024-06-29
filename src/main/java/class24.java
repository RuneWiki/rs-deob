import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class673 {

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "[I")
    public static int[] field895 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        if (arg0 == 6686) {
            field896++;
            return class624.field9022;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
    public static final void method475(int arg0) {
        class243.field3672.method2600((byte) -114);
        field898++;
        if (arg0 != 0) {
            method477(97);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method476(String arg0, byte arg1) {
        class422.field6110 = arg0;
        field897++;
        if (class416.field6017 == null) {
            return;
        }
        try {
            String var2 = class416.field6017.getParameter("cookieprefix");
            String var3 = class416.field6017.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class386.method2385(class525.method3074((byte) -101) + 94608000000L, arg1 ^ 0xFFFFFFD5) + "; Max-Age=" + 94608000L;
            }
            if (arg1 != -40) {
                field895 = null;
            }
            class31.method508("document.cookie=\"" + var5 + "\"", class416.field6017, 13859);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
    public static void method477(int arg0) {
        if (arg0 != 29161) {
            field895 = null;
        }
        field895 = null;
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(ILsc;Lia;III)V")
    public class24(int arg0, class320 arg1, class547 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field899 = arg5;
    }
}
