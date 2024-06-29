import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class554 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Lrr;")
    public static class381 field7923;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lwia;II)Lvm;", line = 4)
    public static final class714 method3292(class791 arg0, int arg1, int arg2) {
        if (arg1 != -29168) {
            field7923 = null;
        }
        field7924++;
        byte[] var3 = arg0.method4335(arg2, 0);
        return var3 == null ? null : new class714(var3);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V", line = 21)
    public static void method3293(byte arg0) {
        if (arg0 > -94) {
            method3297(-88, 39, 47, 23);
        }
        field7923 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method3294(byte arg0, int arg1) {
        field7922++;
        if (class266.field3873 != 7 || class632.field8877 != 0 || class339.field4745 != 0) {
            return;
        }
        class55.field709 = arg1;
        class225.method1539(false, 9);
        if (arg0 > -123) {
            field7923 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V", line = 55)
    public static final void method3295(int arg0) {
        field7927++;
        if (class371.field5137 == -1) {
            return;
        }
        int var1 = class152.field2154.method2646(arg0 ^ 0xFFFF86ED);
        int var2 = class152.field2154.method2650((byte) -74);
        class430 var3 = (class430) class772.field10602.method1731((byte) -110);
        if (var3 != null) {
            var1 = var3.method992((byte) 42);
            var2 = var3.method991(7);
        }
        if (arg0 != -31004) {
            field7923 = null;
        }
        int var4 = 0;
        int var5 = 0;
        if (class195.field2997) {
            var4 = class493.method2933((byte) -35);
            var5 = class242.method1613(8220);
        }
        class381.method2370(var1, (byte) -81, var5 + class714.field9895, var2 + var5, var5, class371.field5137, var4, var2, var1 + var4, var4, class428.field5825 + var4, var5);
        if (class120.field1850 != null) {
            class425.method2568(var2 + var5, var1 + var4, arg0 ^ 0x5E4B);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILmea;IILjd;Laa;II)V", line = 97)
    public static final void method3296(int arg0, class451 arg1, int arg2, int arg3, class241 arg4, class511 arg5, int arg6, int arg7) {
        field7926++;
        if (arg4 == null) {
            return;
        }
        if (arg3 != -28909) {
            method3294((byte) -118, 4);
        }
        int var8;
        if (class416.field5704 == 4) {
            var8 = (int) class758.field10460 & 0x3FFF;
        } else {
            var8 = (int) class758.field10460 + class29.field416 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field6290 / 2, arg1.field6288 / 2) + 10;
        int var10 = arg2 * arg2 + (arg6 * arg6);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class376.field5186[var8];
        int var12 = class376.field5188[var8];
        if (class416.field5704 != 4) {
            var12 = var12 * 256 / (class347.field4853 + 256);
            var11 = var11 * 256 / (class347.field4853 + 256);
        }
        int var13 = arg2 * var12 + arg6 * var11 >> 14;
        int var14 = arg6 * var12 - (arg2 * var11) >> 14;
        arg4.method359(arg1.field6290 / 2 + var13 + (arg0 - arg4.method1507() / 2), arg1.field6288 / 2 + arg7 - var14 + -(arg4.method1505() / 2), arg5, arg0, arg7);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIII)V", line = 139)
    public static final void method3297(int arg0, int arg1, int arg2, int arg3) {
        field7925++;
        int var4 = class124.field1922 + arg0;
        int var5 = class88.field999 + arg2;
        if (class767.field10562 == null || arg0 < 0 || arg2 < 0 || class768.field10571 <= arg0 || class350.field4898 <= arg2 || class21.field353.field10086.method1642(-98) == 0 && class210.field3250.field5755 != arg1) {
            return;
        }
        long var6 = (long) (arg1 << 28 | var5 << 14 | var4);
        class102 var8 = (class102) class250.field3692.method2242(var6, -1);
        if (var8 == null) {
            class712.method4007(arg1, arg0, arg2);
            return;
        }
        class669 var9 = (class669) var8.field1182.method1731((byte) -115);
        if (var9 == null) {
            class712.method4007(arg1, arg0, arg2);
            return;
        }
        class785 var10 = (class785) class712.method4007(arg1, arg0, arg2);
        if (var10 == null) {
            var10 = new class785(arg0 << 9, class208.field3219[arg1].method1904(arg2, (byte) -128, arg0), arg2 << 9, arg1, arg1);
        } else {
            var10.field10781 = var10.field10788 = -1;
        }
        var10.field10779 = var9.field9305;
        var10.field10790 = var9.field9304;
        label61: while (true) {
            class669 var11 = (class669) var8.field1182.method1724(arg3 - 1319321449);
            if (var11 == null) {
                break;
            }
            if (var10.field10779 != var11.field9305) {
                var10.field10781 = var11.field9305;
                var10.field10776 = var11.field9304;
                while (true) {
                    class669 var12 = (class669) var8.field1182.method1724(0);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field10779 != var12.field9305 && var10.field10781 != var12.field9305) {
                        var10.field10788 = var12.field9305;
                        var10.field10778 = var12.field9304;
                    }
                }
            }
        }
        int var13 = class702.method3970((arg0 << 9) + 256, arg1, -20103, (arg2 << 9) + 256);
        var10.field5742 = arg0 << 9;
        var10.field5755 = (byte) arg1;
        var10.field10795 = 0;
        var10.field5749 = (byte) arg1;
        var10.field5746 = arg2 << 9;
        var10.field5741 = var13;
        if (class124.method941(4, arg2, arg0)) {
            var10.field5749++;
        }
        if (arg3 != 1319321449) {
            method3296(107, null, -17, 5, null, null, 28, 75);
        }
        class547.method3273(arg1, arg0, arg2, var13, var10);
    }
}
