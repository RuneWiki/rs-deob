import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class532 extends class233 {

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public int field7177 = -1;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
    public static int field7179 = 0;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public int field7180;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "Ljava/lang/String;")
    public String field7178;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "Ljava/lang/String;")
    public String field7183;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "[Lkp;")
    public static class507[] field7181;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)Z", line = 15)
    public static final boolean method2887(int arg0, int arg1, byte arg2) {
        if (arg2 != 36) {
            return false;
        } else {
            ++field7182;
            return ~(arg0 & 256) != -1;
        }
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V", line = 33)
    public static void method2888(int arg0) {
        field7181 = null;
        if (arg0 != 6750) {
            field7181 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(B)Lsw;", line = 44)
    public final class11 method2889(byte arg0) {
        ++field7184;
        if (arg0 <= 120) {
            this.method2889((byte) 43);
        }
        return class138.field1794[super.field2902];
    }
}
