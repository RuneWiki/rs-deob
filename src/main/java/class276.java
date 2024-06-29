import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class276 extends class270 {

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public int field3483 = -1;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
    public boolean field3486 = false;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lbv;")
    public static final class276 method1565(int arg0) {
        field3480++;
        if (class637.field9021 == null || class666.field9469 == null) {
            return null;
        }
        class666.field9469.method3077(class637.field9021, 120);
        class276 var1 = (class276) class666.field9469.method3080(arg0 + 31591);
        if (var1 == null) {
            return null;
        }
        class89 var2 = class637.field9013.method1972(var1.field3483, (byte) -18);
        if (arg0 == -1) {
            return var2 != null && var2.field978 && var2.method552(true, class637.field9011) ? var1 : class475.method2772(8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        this.field3483 = arg0;
    }
}
