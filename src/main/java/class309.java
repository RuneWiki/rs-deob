import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class309 extends class461 {

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "S")
    public static short field4456 = 1;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Lqt;")
    public class309 field4455;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "Lqt;")
    public class309 field4457;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Z")
    public static final boolean method2000(int arg0) {
        if (arg0 != 1) {
            method2001(-75, 114);
        }
        field4460++;
        if (class359.field5181) {
            try {
                if ((Boolean) class552.method3253(class511.field7007, -109, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lo;")
    public static final class208 method2001(int arg0, int arg1) {
        field4459++;
        class208[] var2 = class407.method2488(2);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            if (var2[var3].field2905 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
    public final void method2002(boolean arg0) {
        field4458++;
        if (this.field4455 == null) {
            return;
        }
        this.field4455.field4457 = this.field4457;
        this.field4457.field4455 = this.field4455;
        this.field4457 = null;
        if (arg0) {
            this.field4455 = null;
        }
    }
}
