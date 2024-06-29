import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class381 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "F")
    public static float field5894;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBIIII)V", line = 7)
    public static final void method2406(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -9) {
            field5894 = 0.6561133F;
        }
        class475[] var7 = class413.field6289;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class475 var9 = var7[var8];
            if (var9 != null && var9.field7032 == 2) {
                class235.method1616(arg5 >> 1, var9.field7040, arg6, arg1, var9.field7034, arg4 >> 1, (byte) -5, var9.field7026 * 2, var9.field7035);
                if (class244.field4188[0] > -1 && (class504.field7348 % 20) < 10) {
                    class439.field6564[var9.field7029].method1039(arg3 + class244.field4188[0] - 12, class244.field4188[1] + arg0 + -28);
                }
            }
        }
        field5892++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V", line = 40)
    public static final void method2407(int arg0, int arg1, int arg2, boolean arg3) {
        field5893++;
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class320.method2029(var4, true, (byte) 124, arg3);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I", line = 53)
    public static final int method2408(byte arg0, int arg1) {
        field5895++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = -68 % ((arg0 + 35) / 62);
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V", line = 72)
    public static final void method2409(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class379.field5881 != -1) {
                class59.method396(class379.field5881, 100);
            }
            for (class52 var2 = (class52) class259.field4346.method2518(69); var2 != null; var2 = (class52) class259.field4346.method2524(0)) {
                if (!var2.method1818(!arg1)) {
                    var2 = (class52) class259.field4346.method2518(-115);
                    if (var2 == null) {
                        break;
                    }
                }
                class507.method2985(var2, 32407, false, true);
            }
            class379.field5881 = -1;
            class259.field4346 = new class407(8);
            class156.method1091(109);
            class379.field5881 = class350.field5475;
            class380.method2404(false, true);
            class408.method2530(17234);
            class521.method3071(class379.field5881);
        }
        field5896++;
        class533.field7837 = "";
        class68.field1058 = "";
        class302.field4849 = false;
        class318.method2017(!arg1);
        class102.field1688 = -1;
        class48.method341(arg1, class106.field1900);
        class302.field4850 = new class166();
        class302.field4850.field4714 = class277.field4548 * 128 / 2;
        class302.field4850.field4716 = class217.field3775 * 128 / 2;
        class302.field4850.field3159[0] = class217.field3775 / 2;
        class302.field4850.field3158[0] = class277.field4548 / 2;
        class48.field764 = 0;
        class473.field7021 = 0;
        if (class190.field2963 == 2) {
            class48.field764 = class475.field7031 << 7;
            class473.field7021 = class49.field790 << 7;
        } else {
            class532.method3146((byte) -73);
        }
        class171.method1160(-19854);
    }
}
