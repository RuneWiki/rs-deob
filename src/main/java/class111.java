import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class111 {

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lfq;")
    public class111 field1433;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lfq;")
    public class111 field1436;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Z")
    public static boolean field1437;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method674(int arg0) {
        if (arg0 != -1) {
            this.field1436 = null;
        }
        field1434++;
        if (this.field1436 != null) {
            this.field1436.field1433 = this.field1433;
            this.field1433.field1436 = this.field1436;
            this.field1433 = null;
            this.field1436 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method675(String arg0, int arg1) {
        field1435++;
        class324.field4720 = arg0;
        if (class401.field5628.field3154 == null) {
            return;
        }
        try {
            String var2 = class401.field5628.field3154.getParameter("cookieprefix");
            String var3 = class401.field5628.field3154.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class178.method1270(79, class18.method107(-16145) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class348.method2281(-108, class401.field5628.field3154, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
        if (arg1 == 25920) {
            ;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIII)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            return;
        }
        field1432++;
        if (arg3 < arg1) {
            class5.method17(class440.field6288[arg4], arg1, arg0, (byte) 111, arg3);
        } else {
            class5.method17(class440.field6288[arg4], arg3, arg0, (byte) 119, arg1);
        }
    }
}
