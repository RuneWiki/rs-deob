import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 {

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Z")
    public static boolean field1573 = false;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lsv;")
    public static class467 field1569 = new class467(12, 0, 1, 0);

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "F")
    public static float field1575;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "[B")
    public byte[] field1577;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "[S")
    public short[] field1570;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "[S")
    public short[] field1571;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "[S")
    public short[] field1572;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)I")
    public static final int method767(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field1576++;
        return arg0 >= -124 ? 2 : ((arg2 >> 2 & 0x3F) << 10) + ((arg3 >> 5 << 7) + (arg1 >> 1));
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I")
    public static final int method768(int arg0, int arg1) {
        return class273.field3951 == null ? 0 : (class273.field3951[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB)Z")
    public static final boolean method769(int arg0, int arg1, byte arg2) {
        int var3 = 62 % ((arg2 + 24) / 54);
        field1578++;
        return false;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
    public static void method770(boolean arg0) {
        field1569 = null;
        if (!arg0) {
            method767(5, -39, 82, 47);
        }
    }
}
