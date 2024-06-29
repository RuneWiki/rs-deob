import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class252 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3693 = "flash2:";

    @OriginalMember(owner = "client!io", name = "b", descriptor = "J")
    public static long field3692 = 0L;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3694 = "Loaded interfaces";

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IBIII)I")
    public static final int method1641(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3695++;
        int var5 = arg3 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg0 : arg4);
        if (arg1 <= 111) {
            method1641(-115, (byte) 45, 40, 110, 61);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public static void method1642(boolean arg0) {
        field3694 = null;
        if (arg0) {
            method1642(true);
        }
        field3693 = null;
    }
}
