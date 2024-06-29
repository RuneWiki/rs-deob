import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class442 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lfj;")
    public class683 field5985 = new class683();

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field5989 = 0;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Z")
    public static boolean field5991 = false;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lkh;BLkh;)V")
    public static final void method2570(class17 arg0, byte arg1, class17 arg2) {
        class137.field2346++;
        field5987++;
        class537 var3 = class476.method2729(class414.field5664, (byte) -46, class551.field7498);
        var3.field7295.method759(arg2.field372, 121);
        var3.field7295.method790(arg2.field355, 65280);
        var3.field7295.method790(arg2.field282, 65280);
        int var4 = 24 % ((arg1 + 15) / 59);
        var3.field7295.method759(arg0.field372, -68);
        var3.field7295.method745(arg0.field355, -2);
        var3.field7295.method745(arg0.field282, -2);
        class173.method1314(false, var3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIB)I")
    public static final int method2571(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5988++;
        int var5 = 65536 - class191.field2936[arg0 * 8192 / arg1] >> 1;
        if (arg4 > -7) {
            field5989 = 126;
        }
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }
}
