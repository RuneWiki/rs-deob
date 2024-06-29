import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class287 implements class496 {

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "Ljava/lang/String;")
    private String field4212;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "J")
    public static long field4213 = 0L;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "Z")
    private boolean field4217;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)Z")
    public final boolean method1900(int arg0) {
        field4215++;
        return arg0 <= 74 ? true : this.field4217;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
    public final int method690(byte arg0) {
        if (arg0 > -7) {
            field4213 = -58L;
        }
        field4216++;
        int var2 = class311.method2005(this.field4212, -1);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field4217 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)Ljea;")
    public final class248 method693(int arg0) {
        if (arg0 <= 103) {
            this.method690((byte) -101);
        }
        field4214++;
        return class248.field3694;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class287(String arg0) {
        this.field4212 = arg0;
    }
}
