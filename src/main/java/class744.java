import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class744 extends class333 {

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public int field10057;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public int field10054;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field10055 = -1;

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "Z")
    public static boolean field10061 = false;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "J")
    public static long field10059 = 0L;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BII)Z", line = 6)
    public static final boolean method4085(byte arg0, int arg1, int arg2) {
        field10060++;
        if (arg0 != 73) {
            field10061 = true;
        }
        return class479.method2828(arg1, 94, arg2) | (arg1 & 0x60000) != 0 || class84.method680(arg2, arg1, (byte) 96) || class292.method1872(arg1, arg2, 1000);
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Log;Lgi;IIIIIIIII)V", line = 23)
    public class744(class673 arg0, class705 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10057 = arg10;
        this.field10054 = arg9;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method4086(int arg0, int arg1, int arg2) {
        field10058++;
        if (arg2 >= -61) {
            return true;
        } else {
            return (arg0 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Leo;", line = 45)
    public final class313 method576(byte arg0) {
        field10056++;
        if (arg0 != 41) {
            method4086(-4, -49, -85);
        }
        return class33.field313;
    }
}
