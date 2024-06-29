import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class324 extends class426 {

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "Lur;")
    public class260 field4866;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
    public int field4868;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "Lik;")
    public static class463 field4869 = new class463("", 17);

    @OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
    public static int field4872 = 0;

    @OriginalMember(owner = "client!jq", name = "R", descriptor = "Lnn;")
    public static class151 field4873 = new class151("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!jq", name = "T", descriptor = "I")
    public static int field4875 = 0;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!jq", name = "U", descriptor = "Liq;")
    public static class134 field4876;

    @OriginalMember(owner = "client!jq", name = "S", descriptor = "Le;")
    public static class255 field4874;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lps;I)Ljava/lang/String;")
    public static final String method1991(class306 arg0, int arg1) {
        field4871++;
        if (arg1 != -1) {
            method1992(-108, -68);
        }
        return arg0.field4621 == null || arg0.field4621.length() <= 0 ? arg0.field4623 : arg0.field4623 + class19.field260.method937((byte) -104, class27.field356) + arg0.field4621;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
    public static final void method1992(int arg0, int arg1) {
        field4867++;
        class241 var2 = class17.field231;
        synchronized (class17.field231) {
            class17.field231.method1481(3, arg0);
        }
        class241 var3 = class358.field5281;
        synchronized (class358.field5281) {
            class358.field5281.method1481(3, arg0);
        }
        class241 var4 = class316.field4776;
        synchronized (class316.field4776) {
            class316.field4776.method1481(3, arg0);
        }
        class241 var5 = class37.field449;
        synchronized (class37.field449) {
            class37.field449.method1481(3, arg0);
        }
        int var6 = -39 / ((arg1 - 83) / 32);
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)Z")
    public abstract boolean method1993(int arg0);

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1994(byte arg0);

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
    public static void method1995(byte arg0) {
        field4869 = null;
        int var1 = -71 % ((-arg0 - 32) / 56);
        field4873 = null;
        field4876 = null;
        field4874 = null;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lur;I)V")
    public class324(class260 arg0, int arg1) {
        this.field4866 = arg0;
        this.field4868 = arg1;
    }
}
