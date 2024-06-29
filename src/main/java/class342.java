import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class342 extends class237 implements class502 {

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Z")
    public static boolean field4716;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J")
    public final long method1909(int arg0) {
        if (arg0 > -90) {
            return 29L;
        } else {
            ++field4714;
            return super.field3268.method2619();
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
    public final int method1910(int arg0) {
        ++field4717;
        if (arg0 >= -76) {
            this.method1912(41);
        }
        return 0;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lht;I[BI)V")
    public class342(class410 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4719 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BIII)V")
    public final void method1911(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field4718;
        this.method1379(arg0, arg3);
        if (arg2 <= 105) {
            field4720 = 48;
        }
        this.field4719 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
    public final int method1912(int arg0) {
        ++field4715;
        return arg0 != -21436 ? 103 : this.field4719;
    }
}
