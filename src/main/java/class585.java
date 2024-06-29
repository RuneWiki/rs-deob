import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class585 extends class505 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method3293(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -25901) {
            return -59;
        }
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field7968++;
        return (arg3 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lcm;B)I", line = 44)
    public static final int method3294(class758 arg0, byte arg1) {
        field7969++;
        if (arg1 >= 0) {
            method3293(70, -4, -19, 66);
        }
        int var2 = arg0.field10391;
        class588 var3 = arg0.method2573(-1);
        if (arg0.field6111 == -1 || arg0.field6128) {
            var2 = arg0.field10392;
        } else if (arg0.field6111 == var3.field8030 || arg0.field6111 == var3.field7992 || arg0.field6111 == var3.field8008 || arg0.field6111 == var3.field8000) {
            var2 = arg0.field10379;
        } else if (arg0.field6111 == var3.field7989 || arg0.field6111 == var3.field7985 || arg0.field6111 == var3.field8018 || arg0.field6111 == var3.field8009) {
            var2 = arg0.field10360;
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 84)
    public static final byte[] method3295(Object arg0, int arg1, boolean arg2) {
        field7970++;
        if (arg1 != 1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class382.method2372(var3, -88) : var3;
        } else if (arg0 instanceof class102) {
            class102 var4 = (class102) arg0;
            return var4.method790(arg1 - 94);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
