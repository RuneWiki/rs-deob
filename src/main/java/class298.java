import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class298 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field5095 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lvd;")
    private class126 field5092;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lwa;")
    public static class75 field5091 = class66.method560("Hierhin gehen", false);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5093 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lwa;")
    public static class75 field5089 = class66.method560("blaugr-Un:", false);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lh;")
    private class206 field5097;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lwa;")
    public static class75 field5096;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 6)
    public static void method2059(byte arg0) {
        field5091 = null;
        if (arg0 != -113) {
            field5091 = (class75) null;
        }
        field5096 = null;
        field5089 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lh;", line = 18)
    public final class206 method2060(byte arg0) {
        field5090++;
        if (this.field5095 > 0 && this.field5092.field2173[this.field5095 - 1] != this.field5097) {
            class206 var2 = this.field5097;
            this.field5097 = var2.field3483;
            return var2;
        }
        class206 var3;
        do {
            if (this.field5092.field2191 <= this.field5095) {
                if (arg0 <= 74) {
                    field5089 = (class75) null;
                }
                return null;
            }
            var3 = this.field5092.field2173[this.field5095++].field3483;
        } while (this.field5092.field2173[this.field5095 - 1] == var3);
        this.field5097 = var3.field3483;
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lh;", line = 52)
    public final class206 method2061(int arg0) {
        field5094++;
        this.field5095 = arg0;
        return this.method2060((byte) 101);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lvd;)V", line = 82)
    public class298(class126 arg0) {
        this.field5092 = arg0;
    }
}
