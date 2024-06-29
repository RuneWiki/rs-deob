import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class695 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field9760;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z", line = 8)
    public static final boolean method3846(byte arg0, int arg1, int arg2) {
        field9758++;
        if (arg0 >= -10) {
            field9759 = 7;
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)I", line = 22)
    public static final int method3847(boolean arg0, int arg1) {
        field9756++;
        if (arg0) {
            field9757 = -60;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 40)
    public static void method3848(int arg0) {
        field9760 = null;
        if (arg0 != 57) {
            method3846((byte) -85, 122, -26);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IC)Z", line = 52)
    public static final boolean method3849(int arg0, char arg1) {
        field9755++;
        if (arg0 != -26) {
            field9757 = -6;
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
