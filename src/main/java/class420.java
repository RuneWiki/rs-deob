import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class420 {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field6186 = 0;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Lvg;")
    public static class622 field6184 = new class622(65, 6);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient;")
    public static client field6187;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLjava/io/File;)[B", line = 3)
    public static final byte[] method2542(byte arg0, File arg1) {
        field6185++;
        int var2 = -78 % ((32 - arg0) / 54);
        return class387.method2388(-29772, arg1, (int) arg1.length());
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;)I", line = 15)
    public static final int method2543(int arg0, String arg1) {
        if (arg0 != 1) {
            field6184 = null;
        }
        field6183++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 31)
    public static void method2544(byte arg0) {
        field6187 = null;
        field6184 = null;
        if (arg0 <= 44) {
            method2542((byte) -48, null);
        }
    }
}
