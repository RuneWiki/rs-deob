import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class249 extends class340 {

    @OriginalMember(owner = "client!up", name = "L", descriptor = "F")
    public static float field3516 = 1024.0F;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "Lpj;")
    public static class132 field3514;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "[B")
    private byte[] field3513;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)I", line = 3)
    public static int method1537(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V", line = 10)
    public class249() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V", line = 19)
    public static final void method1538(int arg0, byte arg1) {
        if (class446.field6246 == null) {
            class446.field6246 = new byte[4][class86.field1185][class526.field7212];
        }
        field3520++;
        int var2 = 117 / ((arg0 - 52) / 39);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class86.field1185; var4++) {
                for (int var5 = 0; var5 < class526.field7212; var5++) {
                    class446.field6246[var3][var4][var5] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 54)
    public static void method1539(int arg0) {
        field3514 = null;
        if (arg0 >= -95) {
            field3514 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBI)[B", line = 66)
    public final byte[] method1540(int arg0, int arg1, byte arg2, int arg3) {
        field3515++;
        if (arg2 >= -16) {
            method1542(false, 119, 29, -125, 95);
        }
        this.field3513 = new byte[arg0 * 2 * arg1 * arg3];
        this.method1824(arg1, 255, arg3, arg0);
        return this.field3513;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)V", line = 79)
    public final void method1541(byte arg0, int arg1, int arg2) {
        field3519++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field3513[var10001] = (byte) (var5 * 3 >> 5);
        this.field3513[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 != 0) {
            method1542(true, -27, 112, -89, 82);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIIII)I", line = 95)
    public static final int method1542(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3517++;
        if (arg0) {
            return 81;
        } else {
            int var5 = arg4 & 0xF;
            int var6 = var5 >= 8 ? arg3 : arg2;
            int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg2 : arg1);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(B)I", line = 115)
    public static final int method1543(byte arg0) {
        field3518++;
        if (arg0 != -117) {
            method1538(119, (byte) 5);
        }
        return 16;
    }
}
