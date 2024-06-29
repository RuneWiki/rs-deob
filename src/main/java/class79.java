import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class79 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)V")
    public static final void method692(int arg0, long arg1) {
        field1706++;
        if (arg1 == 0L || arg0 >= -15) {
            return;
        }
        for (int var3 = 0; var3 < class141.field2730; var3++) {
            if (class254.field4485[var3] == arg1) {
                class141.field2730--;
                class50.field1121++;
                for (int var4 = var3; var4 < class141.field2730; var4++) {
                    class254.field4485[var4] = class254.field4485[var4 + 1];
                    class230.field4093[var4] = class230.field4093[var4 + 1];
                }
                class210.field3781 = class14.field308;
                class196.field3553.method1267(168, -9);
                class196.field3553.method72(-1033389592, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Laa;B)Lg;")
    public static final class131 method693(class8 arg0, byte arg1) {
        if (arg1 == 10) {
            field1707++;
            return new class131(arg0.method74(107), arg0.method74(122), arg0.method74(arg1 ^ 0x79), arg0.method74(115), arg0.method74(112), arg0.method74(103), arg0.method74(arg1 ^ 0x57), arg0.method74(112), arg0.method60(23888), arg0.method63((byte) 62));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZIZI)V")
    public static final void method694(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class109.method865((byte) -110, arg1, arg2, 0, arg0, arg3, class260.field4600.length - 1);
        if (arg4 <= 103) {
            field1709 = 64;
        }
        field1702++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method695(byte arg0) {
        field1704++;
        class168.field3108.method632((byte) -114);
        class215.field3939 = null;
        if (arg0 != -54) {
            field1708 = -85;
        }
        class269.field4739 = 1;
    }
}
