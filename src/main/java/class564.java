import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class564 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7974 = new CRC32();

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lqe;")
    public static class465 field7976 = new class465(14, 2);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field7978 = 0;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lqca;")
    public static class115 field7977 = new class115(13, 0, 1, 0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method3292(int arg0) {
        field7977 = null;
        if (arg0 <= -81) {
            field7974 = null;
            field7976 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3293(int arg0, boolean arg1) {
        if (!arg1) {
            field7978 = 121;
        }
        field7975++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)I")
    public static final int method3294(int arg0, byte arg1, int arg2) {
        field7973++;
        if (arg1 > -102) {
            return -100;
        }
        int var3 = class96.method866(arg0 + 45365, false, 4, arg2 + 91923) - (128 - (class96.method866(arg0 + 10294, false, 2, arg2 + 37821) - 128 >> 1) - (class96.method866(arg0, false, 1, arg2) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
