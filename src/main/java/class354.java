import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class354 extends class236 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field5118 = 1400;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5115 = 0;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Le;")
    public class354 field5112;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Le;")
    public class354 field5114;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)I")
    public static final int method2145(int arg0, int arg1, int arg2) {
        field5117++;
        return ~arg1 == arg0 || arg1 == 5 ? class83.field1134[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
    public final void method2146(boolean arg0) {
        field5113++;
        if (this.field5114 == null) {
            return;
        }
        this.field5114.field5112 = this.field5112;
        if (!arg0) {
            this.field5112.field5114 = this.field5114;
            this.field5114 = null;
            this.field5112 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method2147(int arg0) {
        if (arg0 != -5) {
            field5118 = 51;
        }
        class5 var1 = class381.field5675;
        synchronized (class381.field5675) {
            class381.field5675.method35((byte) -1);
        }
        field5116++;
    }
}
