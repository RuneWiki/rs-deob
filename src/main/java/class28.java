import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[I")
    public static int[] field594 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lmh;")
    public static class128 field596 = class22.method156(124, "M");

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "[I")
    public static int[] field597 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Ljava/lang/Thread;")
    public static Thread field592;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[Lmh;)Lmh;", line = 4)
    public static final class128 method177(byte arg0, class128[] arg1) {
        field595++;
        if (arg0 > -53) {
            method179(true);
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class219.method1519(arg1, 0, true, arg1.length);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIBI)V", line = 60)
    public static final void method178(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field599++;
        if (class247.field4247) {
            class269.method1875(arg0, arg2, arg0 + arg1, arg2 - -arg4);
            class269.method1878(arg0, arg2, arg1, arg4, 0);
        } else {
            class213.method1470(arg0, arg2, arg0 + arg1, arg2 + arg4);
            class213.method1464(arg0, arg2, arg1, arg4, 0);
        }
        if (class50.field978 < 100) {
            return;
        }
        if (class5.field101 == null || class5.field101.field1058 != arg1 || class5.field101.field1060 != arg4) {
            class231 var5 = new class231(arg1, arg4);
            class213.method1460(var5.field4003, arg1, arg4);
            class190.method1276(0, arg1, (byte) -124, 0, class5.field110, arg4, class155.field2671, 0, 0);
            if (class247.field4247) {
                class5.field101 = new class40(var5);
            } else {
                class5.field101 = var5;
            }
            if (class247.field4247) {
                class213.field3769 = null;
            } else {
                class4.field76.method1083(128);
            }
        }
        class5.field101.method278(arg0, arg2);
        int var6 = arg2 + (class295.field5044 * arg4 / class155.field2671);
        int var7 = arg0 + (class53.field1035 * arg1 / class5.field110);
        int var8 = class55.field1061 * arg4 / class155.field2671;
        int var9 = class315.field5343 * arg1 / class5.field110;
        if (class247.field4247) {
            class269.method1876(var7, var6, var9, var8, 16711680, 128);
            class269.method1871(var7, var6, var9, var8, 16711680);
        } else {
            class213.method1479(var7, var6, var9, var8, 16711680, 128);
            class213.method1463(var7, var6, var9, var8, 16711680);
        }
        if (arg3 != 3 || class240.field4107 <= 0 || class240.field4107 % 10 >= 5) {
            return;
        }
        for (class228 var10 = (class228) class223.field3916.method2024(0); var10 != null; var10 = (class228) class223.field3916.method2027(1211754408)) {
            if (class281.field4851 == var10.field3975) {
                int var11 = var10.field3974 * arg1 / class5.field110 + arg0;
                int var12 = var10.field3976 * arg4 / class155.field2671 + arg2;
                if (class247.field4247) {
                    class269.method1878(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class213.method1464(var11 - 2, var12 - 2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 165)
    public static void method179(boolean arg0) {
        field594 = null;
        field597 = null;
        field596 = null;
        if (!arg0) {
            method177((byte) 119, (class128[]) null);
        }
        field592 = null;
    }
}
