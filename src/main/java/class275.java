import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class275 {

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    private int field3983 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lan;")
    private class20 field3981;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3977 = 0;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3982 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lqg;")
    private class320 field3976;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lf;")
    public static class529 field3980;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lqg;")
    public final class320 method1761(int arg0) {
        if (arg0 > -66) {
            field3980 = null;
        }
        field3979++;
        if (this.field3983 > 0 && this.field3981.field340[this.field3983 - 1] != this.field3976) {
            class320 var2 = this.field3976;
            this.field3976 = var2.field4901;
            return var2;
        }
        while (this.field3983 < this.field3981.field337) {
            class320 var3 = this.field3981.field340[this.field3983++].field4901;
            if (this.field3981.field340[this.field3983 - 1] != var3) {
                this.field3976 = var3.field4901;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lqg;")
    public final class320 method1762(int arg0) {
        field3978++;
        this.field3983 = arg0;
        return this.method1761(arg0 - 72);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field3980 = null;
        if (arg0 <= 50) {
            method1763((byte) -98);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lan;)V")
    public class275(class20 arg0) {
        this.field3981 = arg0;
    }
}
